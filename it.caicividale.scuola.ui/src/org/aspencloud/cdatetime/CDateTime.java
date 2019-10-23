/****************************************************************************
 * Copyright (c) 2006-2008 Jeremy Dowdall
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jeremy Dowdall <jeremyd@aspencloud.com> - initial API and implementation
 *****************************************************************************/

package org.aspencloud.cdatetime;

import java.text.AttributedCharacterIterator;
import java.text.CharacterIterator;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.aspencloud.cdatetime.CDT.PickerPart;
import org.aspencloud.v.VButton;
import org.aspencloud.v.VGridLayout;
import org.aspencloud.v.VLabel;
import org.aspencloud.v.VLayout;
import org.aspencloud.v.VNative;
import org.aspencloud.v.VPanel;
import org.aspencloud.v.VTracker;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.TypedListener;


/**
 * NOTE: ALL JAVADOCS ARE OUT OF DATE!!! TODO update javadocs
 * 
 * The CDateTime provides both textual and graphical means for setting
 * the attributes of a java.util.Date class.  As with other components having
 * "combo" in their name, the base of this component is a text box which, if the
 * DROP_DOWN style is set, is complimented by a down-arrow that will open / pop
 * up / drop down a graphical component; for the CDateTime, the drop down
 * component is a CDateTime (automatically set a style appropriate for date
 * format of the text box).  If the style DROP_DOWN is not set, then this combo
 * will NOT show a drop down arrow button, but will instead show a spinner which
 * can be used to increment / decrement the selected date field in the text box.
 * <dt><b>Styles:</b></dt>
 * <dd>BORDER, DROP_DOWN, FOOTER</dd>
 * <dt><b>Events:</b></dt>
 * <dd>Selection</dd>
 */
public class CDateTime extends AbstractCombo {

	/**
	 * A simple class used for editing a field numerically.
	 */
	private class EditField {

		private String buffer;
		private int digits;
		private int count = 0;
		
		EditField(int digits, int initialValue) {
			this.digits = digits;
			buffer = Integer.toString(initialValue);
		}
		
		boolean addChar(char c) {
			if(Character.isDigit(c)) {
				buffer = (count > 0) ? buffer : ""; //$NON-NLS-1$
				buffer += String.valueOf(c);
				if(buffer.length() > digits) {
					buffer = buffer.substring(buffer.length()-digits, buffer.length());
				}
			}
			return(++count > (digits - 1));
		}

		int getValue() {
			return Integer.parseInt(buffer);
		}
		
		void removeLastCharacter() {
			if(buffer.length() > 0) {
				buffer = buffer.substring(0, buffer.length() - 1);
				count--;
			}
		}
		
		void reset() {
			count = 0;
		}
		
		public String toString() {
			if(buffer.length() < digits) {
				char[] ca = new char[digits - buffer.length()];
				Arrays.fill(ca, '0');
				buffer = String.valueOf(ca).concat(buffer);
			}
			return buffer;
		}
	}

	/**
	 * The layout used for a "basic" CDateTime - when it is neither
	 * of style SIMPLE or DROP_DOWN.
	 * Note that there is a spinner, but no button for this style.
	 */
	class SpinnerLayout extends VLayout {
		
		protected Point computeSize(VPanel panel, int wHint, int hHint, boolean flushCache) {
			Point size = text.computeSize(SWT.DEFAULT, SWT.DEFAULT);
			size.x += spinner.computeSize(SWT.DEFAULT, SWT.DEFAULT).x - spinner.getClientArea().width;

			size.y += textMarginHeight;

			if(wHint != SWT.DEFAULT) {
				size.x = Math.min(size.x, wHint);
			}
			if(hHint != SWT.DEFAULT) {
				size.y = Math.min(size.y, hHint);
			}
			return size;
		}
		
		protected void layout(VPanel panel, boolean flushCache) {
			Rectangle cRect = panel.getClientArea();
			if(cRect.isEmpty()) return;
			
			Point tSize = text.computeSize(SWT.DEFAULT, SWT.DEFAULT);
			tSize.y += textMarginHeight;
			
			Point sSize;
			sSize = spinner.computeSize(SWT.DEFAULT, SWT.DEFAULT, flushCache);
			sSize.y = Math.min(sSize.y, Math.min(tSize.y, cRect.height));
			sSize.x = Math.min(sSize.x, cRect.width);
			
			spinner.setBounds(
					cRect.x+cRect.width-sSize.x,
					cRect.y+((tSize.y-sSize.y) / 2),
					sSize.x,
					sSize.y
					);

			text.setBounds(
					cRect.x,
					cRect.y + (win32 ? getBorderWidth() : 0),
					cRect.width-sSize.x + (win32 ? 22 : spinner.getClientArea().width),
					tSize.y
					);
		}
	}
	
	private static final int FIELD_NONE = -1;
	
	private static final int DISCARD		= 0;
	private static final int WRAP 		= 1;
	private static final int BLOCK		= 2;
	
	AbstractPicker picker;
	VNative<Spinner> spinner;
	
	boolean rightClick = false;
	private Date cancelDate;

	private Calendar calendar;
	private DateFormat df;
	Locale locale;
	TimeZone timezone;
	
	private Field[] field;
	private int activeField;
	private boolean tabStops = false;

	// Store these values so that the style can be reset automatically
	//  to update everything if/when the locale is changed
	int style;
	String pattern = null;
	int format = -1;

	private CDateTimePainter painter;

	/**
	 * Delegates events to their appropriate handler
	 */
	Listener textListener = new Listener() {
		public void handleEvent(Event event) {
			switch (event.type) {
			case SWT.FocusIn:
				rightClick = false;
				if(VTracker.getLastTraverse() == SWT.TRAVERSE_TAB_PREVIOUS) {
					fieldLast();
				} else {
					fieldFirst();
				}
				updateText();
				break;
			case SWT.FocusOut:
				if(!rightClick) {
					setActiveField(FIELD_NONE);
					updateText();
				}
				break;
			case SWT.KeyDown:
				// block the arrow keys because they are handled by the traverse listener
				if((event.keyCode != SWT.ARROW_DOWN) && (event.keyCode != SWT.ARROW_UP)) {
					handleKey(event);
				}
				break;
			case SWT.MouseDown:
				if(event.button == 1) {
					fieldFromTextSelection();
				} else if(event.button == 2) {
					fieldNext();
				} else if(event.button == 3) {
					rightClick = true;
				}
				break;
			case SWT.MouseWheel:
				if(event.count > 0) {
					fieldAdjust(1);
				} else {
					fieldAdjust(-1);
				}
				event.doit = false;
				break;
			case SWT.MouseUp:
				if(event.button == 1) {
					fieldFromTextSelection();
				}
				break;
			case SWT.Traverse:
				handleTraverse(event);
				break;
			case SWT.Verify:
				verify(event);
				break;
			}
		}
	};

	private Point textSelectionOffset = new Point(0,0); // x = selOffset start, y = selOffset amount
	private EditField editField;
	private String[] separator;
	
	private int[] calendarFields;
	private boolean isTime;
	private boolean isDate;
//	private boolean isNull = true;
	private String nullText = null;
	private boolean defaultNullText = true;

	
	private boolean singleSelection;
//	private boolean dragSelection;
	private Date[] selection = new Date[0];
	
	private boolean scrollable = true;

	CDateTimeBuilder builder;
	
	VPanel pickerPanel;

	/**
	 * Constructs a new instance of this class given its parent and a style value 
	 * describing its behavior and appearance.  The current date and the system's
	 * default locale are used.
	 * @param parent a widget which will be the parent of the new instance (cannot be null)
	 * @param style the style of widget to construct
	 */
	public CDateTime(Composite parent, int style) {
		super(parent, style | CDT.BUTTON_CUSTOM);
		init(style);
	}

	/**
	 * Adds the listener to the collection of listeners who will be notified when the 
	 * receiver's selection changes, by sending it one of the messages defined in the 
	 * <code>SelectionListener</code> interface.
	 * <p>
	 * <code>widgetSelected</code> is called when the selection (date/time) changes.
	 * <code>widgetDefaultSelected</code> is when ENTER is pressed the text box.
	 * </p>
	 * The event's data field will contain the newly selected Date object.<br>
	 * The event's detail field will contain which Calendar Field was changed
	 * @param listener the listener which should be notified
	 * @exception IllegalArgumentException <ul>
	 *    <li>ERROR_NULL_ARGUMENT - if the listener is null</li>
	 * </ul>
	 * @exception SWTException <ul>
	 *    <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	 *    <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that created the receiver</li>
	 * </ul>
	 * @see SelectionListener
	 * @see #removeSelectionListener
	 * @see SelectionEvent
	 */
	public void addSelectionListener(SelectionListener listener) {
		if(listener != null) {
			TypedListener typedListener = new TypedListener (listener);
			addListener (SWT.Selection, typedListener);
			addListener (SWT.DefaultSelection, typedListener);
		}
	}

	/**
	 * Adds the textListener for the appropriate SWT events to handle incrementing fields.
	 */
	protected void addTextListener() {
		removeTextListener();
		
		text.addListener(SWT.FocusIn, textListener);
		text.addListener(SWT.FocusOut, textListener);
		text.addListener(SWT.KeyDown, textListener);
		text.addListener(SWT.MouseDown, textListener);
		text.addListener(SWT.MouseWheel, textListener);
		text.addListener(SWT.MouseUp, textListener);
		text.addListener(SWT.Traverse, textListener);
		text.addListener(SWT.Verify, textListener);
	}

	/**
	 * If a field is being edited (via keyboard), set the edit value to the 
	 * active field of the calendar.  Reset the count of the EditField so that a
	 * subsequent key press will overwrite its contents;
	 * @return true if the commit was successfull (the value was valid for the field) or there
	 * was no commit to be made (editField is null), false otherwise
	 */
	private boolean commitEditField() {
		if(editField != null) {
			int cf = getCalendarField();
			int val = editField.getValue();
			editField.reset();
			if(cf == Calendar.MONTH) {
				val--;
			}
			return fieldSet(cf, val, DISCARD);
		}
		return true;
	}

	@Override
	public Point computeSize(int hint, int hint2, boolean changed) {
		if(isSimple() && picker == null) {
			createPicker();
		}
		return super.computeSize(hint, hint2, changed);
	}

	
	/**
	 * If style is neither SIMPLE or DROP_DOWN, then this method simply returns,
	 * otherwise it sets the format of the picker.
	 * @see CDateTime#setPattern(int)
	 */
	private void createPicker() {
		if(isSimple()) {
			pickerPanel = panel;
			setContent(panel.getComposite());
		} else if(isDropDown()) {
			disposePicker();

			Shell shell = getContentShell();
			Canvas comp = new Canvas(shell, (isSimple() ? SWT.NONE : SWT.BORDER) | SWT.DOUBLE_BUFFERED);
			pickerPanel = new VPanel(comp, CDT.NONE);
			pickerPanel.setWidget(comp);
			VGridLayout layout = new VGridLayout();
			layout.marginHeight = 0;
			layout.marginWidth = 0;
			layout.verticalSpacing = 1;
			pickerPanel.setLayout(layout);
			setContent(pickerPanel.getComposite());

			if(field.length > 1) {
				createPickerToolbar(pickerPanel);
			}
		}

		if(isDate) {
			picker = new DatePicker(this);
			((DatePicker) picker).setScrollable(scrollable);
		} else if(isTime) {
			if((style & CDT.CLOCK_DISCRETE) != 0) {
				picker = new DiscreteTimePicker(this);
			} else {
				picker = new AnalogTimePicker(this);
			}
		}
		
		if(picker != null) {
			picker.setFields(calendarFields);
			picker.updateView();
		}

		if(isDropDown()) {
			picker.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
//			picker.getParent().pack(true);
		}
	}
	
	private void createPickerToolbar(VPanel parent) {
		VPanel tb = new VPanel(parent, SWT.NONE);
		VGridLayout layout = new VGridLayout(3, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.horizontalSpacing = 2;
		tb.setLayout(layout);
		tb.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false));
		tb.setData(CDT.PickerPart, PickerPart.Toolbar);

		VButton b = new VButton(tb, SWT.OK | SWT.NO_FOCUS);
		b.setData(CDT.PickerPart, PickerPart.OkButton);
		b.setToolTipText(Resources.getString("accept.text", locale)); //$NON-NLS-1$
		b.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		b.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				setOpen(false);
			}
		});

		b = new VButton(tb, SWT.CANCEL | SWT.NO_FOCUS);
		b.setData(CDT.PickerPart, PickerPart.CancelButton);
		b.setToolTipText(Resources.getString("cancel.text", locale)); //$NON-NLS-1$
		b.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		b.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				setOpen(false, true);
			}
		});

		b = new VButton(tb, SWT.NO_FOCUS);
		b.setData(CDT.PickerPart, PickerPart.ClearButton);
		b.setText(Resources.getString("clear.text", locale)); //$NON-NLS-1$
		b.setToolTipText(Resources.getString("clear.text", locale)); //$NON-NLS-1$
		b.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		b.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				setOpen(false);
				deselectAll();
				fireSelectionChanged();
			}
		});

		VLabel sep = new VLabel(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		sep.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
	}

	void deselect(Date date) {
		if(date != null && isSelected(date)) {
			Date[] tmp = new Date[selection.length - 1];
			for(int i = 0, j = 0; i < selection.length; i++) {
				if(!selection[i].equals(date)) {
					tmp[j++] = selection[i];
				}
			}
			setSelectedDates(tmp);
		}
	}
	
	public void deselectAll() {
		setSelectedDates((Date[]) null);
	}
	
	private void disposePicker() {
		if(content != null) {
			picker.dispose();
			picker = null;
			if(isDropDown()) {
				Control c = content;
				setContent(null);
				c.dispose();
				if(contentShell != null) {
					Display.getDefault().asyncExec(new Runnable() {
						public void run() {
							if(contentShell != null && !contentShell.isDisposed()) {
								contentShell.dispose();
								contentShell = null;
							}
						}
					});
				}
			}
		}
	}

	/**
	 * Adds the given amount to the active field, if there is one
	 */
	void fieldAdjust(int amount) {
		if(!hasSelection()) {
			setSelection(calendar.getTime());
			fireSelectionChanged();
		} else {
			int cf = getCalendarField();
			if(cf >= 0) {
				fieldSet(cf, calendar.get(cf) + amount, WRAP);
			}
		}
	}

	/**
	 * Sets the active field from the select of the text box
	 */
	void fieldFromTextSelection() {
		if(!hasSelection()) {
//			setActiveField(FIELD_ALL);
			fieldNext();
		} else {
			Point sel = text.getControl().getSelection();
			AttributedCharacterIterator aci = df.formatToCharacterIterator(calendar.getTime());
			if(sel.x > textSelectionOffset.x) sel.x += textSelectionOffset.y;
			aci.setIndex(sel.x);
			Object[] oa = aci.getAttributes().keySet().toArray();
			if(oa.length == 0 && sel.x > 0) {
				sel.x -= 1;
				aci.setIndex(sel.x);
				oa = aci.getAttributes().keySet().toArray();
			}
			if(oa.length > 0) {
				for(int i = 0; i < field.length; i++) {
					if(oa[0].equals(field[i])) {
						if(Calendar.ZONE_OFFSET != getCalendarField(field[i])) {
							setActiveField(i);
						}
						break;
					}
				}
				updateText();
			}
		}
	}
	
	void fieldFirst() {
		if(Calendar.ZONE_OFFSET == getCalendarField(field[0])) {
			setActiveField(1);
		} else {
			setActiveField(0);
		}
	}
	
	void fieldLast() {
		if(Calendar.ZONE_OFFSET == getCalendarField(field[field.length-1])) {
			setActiveField(field.length-2);
		} else {
			setActiveField(field.length-1);
		}
	}
	
	/**
	 * Sets the active field to the next field; wraps if necessary and sets to last
	 * field if there is no current active field
	 */
	void fieldNext() {
		if(activeField >= 0 && activeField < field.length - 1) {
			if(Calendar.ZONE_OFFSET == getCalendarField(field[activeField + 1])) {
				if(activeField < field.length - 2) {
					setActiveField(activeField + 2);
				} else {
					setActiveField(0);
				}
			} else {
				setActiveField(activeField + 1);
			}
		} else {
			if(Calendar.ZONE_OFFSET == getCalendarField(field[0])) {
				setActiveField(1);
			} else {
				setActiveField(0);
			}
		}
		updateText();
	}

	/**
	 * Sets the active field to the previous field; wraps if necessary and sets to first
	 * field if there is no current active field
	 */
	private void fieldPrev() {
		if(activeField > 0 && activeField < field.length) {
			if(Calendar.ZONE_OFFSET == getCalendarField(field[activeField - 1])) {
				if(activeField > 1) {
					setActiveField(activeField - 2);
				} else {
					setActiveField(field.length - 1);
				}
			} else {
				setActiveField(activeField - 1);
			}
		} else {
			if(Calendar.ZONE_OFFSET == getCalendarField(field[field.length - 1])) {
				setActiveField(field.length - 2);
			} else {
				setActiveField(field.length - 1);
			}
		}
		updateText();
	}
	
	/**
	 * Sets the given calendar field to the given value.<br>
	 * <b>NOTE:</b> This is NOT the active field but a field in the
	 * "calendar" variable.
	 * @param calendarField the field of calendar to set
	 * @param value the value to set it to
	 * @param style the of set to perform; if the value is valid for the given calendarField then
	 * this has no affect, otherwise it will take an action according to this style int:
	 * <ul>
	 * 	<li>DISCARD: the value will be discarded and the method returns without performing and action</li>
	 * 	<li>WRAP: if value is higher than its maximum it will be set to its minimum, and visa versa</li>
	 * 	<li>BLOCK: if value is higher than its maximum it will be set to its maximum, and visa versa</li>
	 * </ul>
	 * @return true if the field was set, false otherwise (as is possible with a DISCARD style)
	 */
	private boolean fieldSet(int calendarField, int value, int style) {
		if(calendarField >= 0) {
			if(value > calendar.getActualMaximum(calendarField)) {
				if(style == DISCARD) {
					return false;
				} else if(style == WRAP) {
					value = calendar.getActualMinimum(calendarField);
				} else if(style == BLOCK) {
					value = calendar.getActualMaximum(calendarField);
				}
			} else if(value < calendar.getActualMinimum(calendarField)) {
				if(style == DISCARD) {
					return false;
				} else if(style == WRAP) {
					value = calendar.getActualMaximum(calendarField);
				} else if(style == BLOCK) {
					value = calendar.getActualMinimum(calendarField);
				}
			}
			calendar.set(calendarField, value);
			selection[0] = calendar.getTime();
			updateText();
			updatePicker();
			fireSelectionChanged(calendarField);
		}
		return true;
	}
	
	/**
	 * <p>Notifies listeners that the selection for this CDateTime has changed</p>
	 * <p>This will fire both a regular selection event, and a default selection event.</p>
	 * <p>The data field is populated by {@link #getSelectedDates()}.</p>
	 */
	void fireSelectionChanged() {
		if(isOpen()) {
			setOpen(false);
		}
		Event event = new Event();
		event.data = getSelectedDates();
		notifyListeners(SWT.Selection, event);
		notifyListeners(SWT.DefaultSelection, event);
	}
	
	/**
	 * <p>Notifies listeners that a field of the selected date for this CDateTime has changed</p>
	 * <p>Note that this is only valid when {@link #singleSelection} is true, and will only
	 * fire a regular selection event (not a default selection event)</p>
	 * <p>The data field is populated by {@link #getSelection()} and the detail field holds
	 * the field which was changed.</p>
	 * @param field the Calendar Field which caused the change, or -1 if <code>setTime</code>
	 * was called (thus setting all Calendar Fields)
	 */
	void fireSelectionChanged(int field) {
		Event event = new Event();
		event.data = getSelection();
		event.detail = field;
		if(this.field.length == 1) {
			if(isOpen()) {
				setOpen(false);
			}
			notifyListeners(SWT.Selection, event);
			notifyListeners(SWT.DefaultSelection, event);
		} else {
			notifyListeners(SWT.Selection, event);
		}
	}

	/**
	 * Gets the calendar field corresponding to the active field, if there is one.
	 * @return an int representing the calendar field, -1 if there isn't one.
	 */
	private int getCalendarField() {
		return hasField(activeField) ? getCalendarField(field[activeField]) : -1;
	}
	
	private int getCalendarField(Field field) {
		int cf = field.getCalendarField();
		if(cf < 0) {
			if(field.toString().indexOf("hour 1") > -1) { //$NON-NLS-1$
				cf = Calendar.HOUR;
			} else if(field.toString().contains("zone")) { //$NON-NLS-1$
				cf = Calendar.ZONE_OFFSET;
			}
		}
		return cf;
	}

	public Calendar getCalendarInstance() {
		return getCalendarInstance(calendar.getTime());
    }

	public Calendar getCalendarInstance(Date date) {
        Calendar cal = Calendar.getInstance(timezone, locale);
        cal.setTime(date);
    	return cal;
    }

	public boolean getEditable() {
		return !panel.hasStyle(CDT.READ_ONLY);
	}
	
	/**
	 * The locale currently in use by this CDateTime.
	 * @return the locale
	 * @see #setLocale(Locale)
	 */
	public Locale getLocale() {
		return locale;
	}
	
	/**
	 * Get the text which will be shown when the selection is set to null.
	 * Note that this will be equal to the default null text for the given
	 * locale unless the null text has been explicitly set using
	 * {@link #setNullText(String)}
	 * @return the text shown when the selection is null
	 * @see #setNullText(String)
	 */
	public String getNullText() {
		if(nullText == null) {
			if(isDate) {
				return Resources.getString("null_text.date", locale);
			} else {
				return Resources.getString("null_text.time", locale);
			}
		}
		return nullText;
	}

	CDateTimePainter getPainter() {
		if(painter == null) {
			setPainter(new CDateTimePainter());
		}
		return painter;
	}

	/**
	 * Get the pattern of this CDateTime as used to set its format.  If the format was NOT
	 * set using <code>setFormat(String)</code> this will return <code>null</code>.
	 * @return the pattern, null if there isn't one
	 * @see SimpleDateFormat
	 * @see #setFormat(int)
	 * @see #setPattern(String)
	 */
	public String getPattern() {
		return pattern;
	}

	public Date[] getSelectedDates() {
		return selection.clone();
	}

	public Date getSelection() {
		return hasSelection() ? selection[0] : null;
	}
	
	public String getText() {
		return checkText() ? text.getText() : null;
	}

	/**
	 * Get the <code>java.util.Date</code> that is currently active in this
	 * CDateTime widget.<br>
	 * Note that if a field is being edited, and has not yet been committed,
	 * then this value may not represent what is displayed in the text box.
	 * @return the date
	 * @see #setSelection(Date)
	 */
	public Date getTime() {
		return calendar.getTime();
	}

	public long getTimeInMillis() {
		return calendar.getTimeInMillis();
	}

	/**
	 * The timezone currently in use by this CDateTime.
	 * @return the timezone
	 * @see #setTimeZone(String)
	 * @see #setTimeZone(TimeZone)
	 */
	public TimeZone getTimeZone() {
		return timezone;
	}
	
	/**
	 * The Key event handler
	 * @param event the event
	 */
	void handleKey(Event event) {
		if(SWT.DEL == event.keyCode) {
			event.doit = false;
			setSelection((Date) null);
			fireSelectionChanged();
		} else if(!hasField(activeField) && !hasSelection()) {
			event.doit = false;
		} else {
			switch (event.keyCode) {
			case '-':
			case SWT.ARROW_DOWN:
			case SWT.KEYPAD_SUBTRACT:
				fieldAdjust(-1);
				break;
			case '=':
			case '+':
			case SWT.ARROW_UP:
			case SWT.KEYPAD_ADD:
				fieldAdjust(1);
				break;
			case SWT.BS:
				if(editField != null) editField.removeLastCharacter();
				break;
			default:
				if(hasField(activeField) && activeField + 1 < separator.length &&
						String.valueOf(event.character).equals(separator[activeField+1])) {
					fieldNext();
				}
			}
		}
	}
	
	/**
	 * The Travers event handler.  Note that ARROW_UP and ARROW_DOWN are
	 * handled in the <code>handleKey</code> method.
	 * @param event the event
	 */
	void handleTraverse(Event event) {
		switch (event.detail) {
		case SWT.TRAVERSE_ARROW_NEXT:
			if(event.keyCode == SWT.ARROW_RIGHT) {
				fieldNext();
			} else if(event.keyCode == SWT.ARROW_DOWN) {
				fieldAdjust(-1);
			}
			break;
		case SWT.TRAVERSE_ARROW_PREVIOUS:
			if(event.keyCode == SWT.ARROW_LEFT) {
				fieldPrev();
			} else if(event.keyCode == SWT.ARROW_UP) {
				fieldAdjust(1);
			}
			break;
		case SWT.CR:
			fieldNext();
			fireSelectionChanged();
			break;
		case SWT.TRAVERSE_TAB_NEXT:
			if(tabStops && hasSelection()) {
				if(activeField == field.length - 1
						|| (activeField == field.length - 2 && Calendar.ZONE_OFFSET == getCalendarField(field[field.length - 1]))) {
					event.doit = true;
				} else {
					event.doit = false;
					if(activeField < 0) {
						fieldPrev();
					} else {
						fieldNext();
					}
				}
			}
			break;
		case SWT.TRAVERSE_TAB_PREVIOUS:
			if(tabStops && hasSelection()) {
				if(activeField == 0 || (activeField == 1 && Calendar.ZONE_OFFSET == getCalendarField(field[0]))) {
					event.doit = true;
				} else {
					event.doit = false;
					if(activeField < 0) {
						fieldNext();
					} else {
						fieldPrev();
					}
				}
			}
			break;
		default:
		}
	}
	
	/**
	 * Determines if the given field number is backed by a real field.
	 * @param field the field number to check
	 * @return true if the given field number corresponds to a field in the field array
	 */
	private boolean hasField(int field) {
		return field >= 0 && field <= this.field.length;
	}
	
	public boolean hasSelection() {
		return selection.length > 0;
	}
	
	private void init(int style) {
		this.style = style;
		locale = Locale.getDefault();
		try {
			timezone = TimeZone.getDefault();
		} catch (Exception e) {
			timezone = TimeZone.getTimeZone("GMT");
		}
		calendar = Calendar.getInstance(this.timezone, this.locale);
		calendar.setTime(new Date());
		tabStops = (style & CDT.TAB_FIELDS) != 0;
		singleSelection = ((style & CDT.SIMPLE) == 0) || ((style & CDT.MULTI) == 0);
		
		setFormat(style);

		if(!isSimple()) {
			if(isDropDown()) {
				setButtonVisibility(CDT.BUTTON_ALWAYS);
			} else {
				setButtonVisibility(CDT.BUTTON_NEVER);
				if((style & CDT.SPINNER) != 0) {
					spinner = VNative.create(Spinner.class, panel, SWT.VERTICAL);
					spinner.getControl().setMinimum(0);
					spinner.getControl().setMaximum(50);
					spinner.getControl().setDigits(1);
					spinner.getControl().setIncrement(1);
					spinner.getControl().setPageIncrement(1);
					spinner.getControl().setSelection(25);
					spinner.getControl().addFocusListener(new FocusAdapter() {
						public void focusGained(FocusEvent e) {
							setFocus();
						}
					});
					spinner.getControl().addSelectionListener(new SelectionAdapter() {
						public void widgetSelected(SelectionEvent e) {
							if(VTracker.getMouseDownButton() == 2) {
								fieldNext();
							} else {
								if(spinner.getControl().getSelection() > 25) {
									fieldAdjust(1);
								} else {
									fieldAdjust(-1);
								}
								spinner.getControl().setSelection(25);
							}
						}
					});
					panel.setLayout(new SpinnerLayout());
				}
			}
			
			updateText(true);
			activeField = -5;
			setActiveField(FIELD_NONE);
			
			if(checkText()) {
				addTextListener();
			}
		}
	}
	
	boolean isSelected(Date date) {
		for(Date d : selection) {
			if(d.equals(date)) {
				return true;
			}
		}
		return false;
	}

	boolean isSingleSelection() {
		return singleSelection;
	}

	@Override
	public void layout(boolean changed) {
		if(isSimple() && picker == null) {
			createPicker();
		}
		super.layout(changed);
	}
	
	@Override
	protected void postClose(Shell popup) {
		disposePicker();
	}
	/**
	 * Removes the listener from the collection of listeners who will
	 * be notified when the receiver's selection changes.
	 * @param listener the listener which should no longer be notified
	 * @exception IllegalArgumentException <ul>
	 *    <li>ERROR_NULL_ARGUMENT - if the listener is null</li>
	 * </ul>
	 * @exception SWTException <ul>
	 *    <li>ERROR_WIDGET_DISPOSED - if the receiver has been disposed</li>
	 *    <li>ERROR_THREAD_INVALID_ACCESS - if not called from the thread that 
	 *    created the receiver</li>
	 * </ul>
	 * @see SelectionListener
	 * @see #addSelectionListener
	 */
	public void removeSelectionListener(SelectionListener listener) {
		if(listener != null) {
			TypedListener l = new TypedListener(listener);
			// TODO
			removeListener(SWT.Selection, l);
			removeListener(SWT.DefaultSelection, l);
		}
	}
	
	/**
	 * Removes the textListener for the appropriate SWT events to handle incrementing fields.
	 */
	protected void removeTextListener() {
		text.removeListener(SWT.KeyDown, textListener);
		text.removeListener(SWT.MouseDown, textListener);
		text.removeListener(SWT.MouseWheel, textListener);
		text.removeListener(SWT.MouseUp, textListener);
		text.removeListener(SWT.Traverse, textListener);
		text.removeListener(SWT.Verify, textListener);
	}

	void select(Date date) {
		if(date != null) {
			Date[] tmp = new Date[selection.length + 1];
			System.arraycopy(selection, 0, tmp, 1, selection.length);
			tmp[0] = date;
			setSelectedDates(tmp);
		}
	}
	
	void select(Date date1, Date date2, int field, int increment) {
		if(date1 != null && date2 != null) {
			Date start = date1.before(date2) ? date1 : date2;
			Date end   = date1.before(date2) ? date2 : date1;
			List<Date> tmp = new ArrayList<Date>();
			Calendar cal = getCalendarInstance(start);
			while(cal.getTime().before(end)) {
				tmp.add(cal.getTime());
				cal.add(field, increment);
			}
			tmp.add(cal.getTime());
			if(start == date2) {
				Collections.reverse(tmp);
			}
			setSelectedDates(tmp.toArray(new Date[tmp.size()]));
		}
	}
	
	/**
	 * Sets the active field, which may or may not be a real field (it may also
	 * be <code>FIELD_NONE</code>)
	 * @param field the field to be set active
	 * @see CDateTime#hasField(int)
	 */
	private void setActiveField(int field) {
		if(activeField != field) {
			commitEditField();
			editField = null;
			activeField = field;
			if(spinner != null) {
				if(hasField(field)) {
					spinner.setEnabled(true);
				} else {
					spinner.setEnabled(false);
				}
			}
		}
	}
	
	public void setBuilder(CDateTimeBuilder builder) {
		this.builder = builder;
	}
	
	@Override
	protected boolean setContentFocus() {
		if(picker != null) {
			return picker.setFocus();
		}
		return false;
	}
	
	@Override
	public void setEditable(boolean editable) {
		super.setEditable(editable);
		if(picker != null) {
			picker.setStyle(CDT.READ_ONLY, !editable);
		}
	}

	/**
	 * Set the date and time format of this CDateTime uses style constants which correspond
	 * to the various forms of DateFormat.getXxxInstance(int).
	 * <dt><b>Valid Styles:</b></dt>
	 * <dd>DATE_SHORT, DATE_MEDIUM, DATE_LONG, TIME_SHORT, TIME_MEDIUM</dd>
	 * <p>Styles are bitwise OR'ed together, but only one "DATE" and one "TIME" may be set at a time.</p>
	 * Examples:<br>
	 * </code>setFormat(CDT.DATE_LONG);</code><br />
	 * </code>setFormat(CDT.DATE_SHORT | CDT.TIME_MEDIUM);</code><br />
	 * @param format the bitwise OR'ed Date and Time format to be set
	 * @throws IllegalArgumentException 
	 * @see #getPattern()
	 * @see #setPattern(String)
	 */
	public void setFormat(int format) throws IllegalArgumentException {
		int dateStyle = (format & CDT.DATE_SHORT) != 0 ? DateFormat.SHORT :
			(format & CDT.DATE_MEDIUM) != 0 ? DateFormat.MEDIUM :
				(format & CDT.DATE_LONG) != 0 ? DateFormat.LONG : -1;
		int timeStyle = (format & CDT.TIME_SHORT) != 0 ? DateFormat.SHORT :
			(format & CDT.TIME_MEDIUM) != 0 ? DateFormat.MEDIUM : -1;
		String str = null;
		if(dateStyle != -1 && timeStyle != -1) {
			str = ((SimpleDateFormat) DateFormat.getDateTimeInstance(dateStyle, timeStyle, locale)).toPattern();
		} else if(dateStyle != -1) {
			str = ((SimpleDateFormat) DateFormat.getDateInstance(dateStyle, locale)).toPattern();
		} else if(timeStyle != -1) {
			str = ((SimpleDateFormat) DateFormat.getTimeInstance(timeStyle, locale)).toPattern();
		} else if(pattern == null) {  // first call, so set to default
			format = CDT.DATE_SHORT;
			str = ((SimpleDateFormat) DateFormat.getDateInstance(DateFormat.SHORT, locale)).toPattern();
		}
		if(str != null) {
			this.format = format;
			setPattern(str);
		}
	}
	
	/**
	 * Sets the Locale to be used by this CDateTime and causes all affected 
	 * attributes to be updated<br>
	 * If the provided locale is the same as the current locale then this method simply
	 * returns.  If the provided Locale is null then this CDateTime will use
	 * the system's default locale.<br>
	 * If this <code>CDateTime</code> is of style <code>DROP_DOWN</code>
	 * then the associated <code>CDateTime</code> will be set to the same locale.
	 * @param locale the Locale, or null to use the system's default
	 * @see #getLocale()
	 */
	public void setLocale(Locale locale) {
		if(locale == null) locale = Locale.getDefault();
		if(!this.locale.equals(locale)) {
			this.locale = locale;
			if(format > 0) {
				setFormat(format);
			} else {
				setPattern(pattern);
			}
			updateNullText();
		}
	}

	protected void setModifyEventProperties(Event e) {	
		e.data = calendar.getTime();
	}
	
	/**
	 * Set the text to be shown when the selection is null.
	 * Passing null into this method will cause the CDateTime widget
	 * to use a default null text for the given locale.
	 * @param text
	 */
	public void setNullText(String text) {
		defaultNullText = false;
		nullText = text;
		updateText(true);
	}

	public void setOpen(boolean open) {
		setOpen(open, false);
	}

	public void setOpen(boolean open, boolean cancelled) {
		synchronized(busy) {
			if(busy) return;
			busy = true;
			if(open) {
				cancelDate = getSelection();
				createPicker();
			} else {
				if(cancelled) {
					setSelection(cancelDate);
				}
				cancelDate = null;
			}
			super.setOpen(open);
		}
	}
	
	public void setPainter(CDateTimePainter painter) {
		if(painter != null) {
			painter.setCDateTime(this);
		}
		this.painter = painter;
	}

	/**
	 * Set the style of this CDateTime to work with dates and / or times 
	 * as determined by the given pattern. This will set the fields shown in the
	 * text box and, if <code>DROP_DOWN</code> style is set, the fields of the
	 * drop down component.<br>
	 * This method is backed by an implementation of SimpleDateFormat, and as such,
	 * any string pattern which is valid for SimpleDateFormat may be used.
	 * Examples (US Locale):<br>
	 * </code>setPattern("MM/dd/yyyy h:mm a");</code><br />
	 * </code>setPattern("'Meeting @' h:mm a 'on' EEEE, MMM dd, yyyy");</code><br />
	 * @param pattern the pattern to use, if it is invalid, the original is restored
	 * @throws IllegalArgumentException
	 * @see SimpleDateFormat
	 * @see #getPattern()
	 * @see #setFormat(int)
	 */
	public void setPattern(String pattern) throws IllegalArgumentException {
		if(isOpen()) {
			setOpen(false);
		}
		df = new SimpleDateFormat(pattern, locale);
		df.setTimeZone(timezone);
		if(updateFields()) {
			this.pattern = pattern;
			this.format = -1;
			boolean wasDate = isDate;
			boolean wasTime = isTime;
			isDate = isTime = false;
			calendarFields = new int[field.length];
			for(int i = 0; i < calendarFields.length; i++) {
				calendarFields[i] = getCalendarField(field[i]);
				switch(calendarFields[i]) {
				case Calendar.AM_PM:
				case Calendar.HOUR:
				case Calendar.HOUR_OF_DAY:
				case Calendar.MILLISECOND:
				case Calendar.MINUTE:
				case Calendar.SECOND:
					isTime = true;
					break;
				case Calendar.DAY_OF_MONTH:
				case Calendar.DAY_OF_WEEK:
				case Calendar.DAY_OF_WEEK_IN_MONTH:
				case Calendar.DAY_OF_YEAR:
				case Calendar.ERA:
				case Calendar.MONTH:
				case Calendar.WEEK_OF_MONTH:
				case Calendar.WEEK_OF_YEAR:
				case Calendar.YEAR:
					isDate = true;
					break;
				default:
					break;
				}
			}
			if(checkButton() && ((isDate != wasDate) || (isTime != wasTime))) {
				if(defaultButtonImage) {
					if(isDate) {
						doSetButtonImage(Resources.getIconCalendar());
					} else {
						doSetButtonImage(Resources.getIconClock());
					}
				}
				updateNullText();
			}
			if(checkText()) {
				updateText(true);
			}
			if(isSimple() && picker != null) {
				disposePicker();
				createPicker();
			}
		} else {
			throw new IllegalArgumentException("Problem setting pattern: \"" + pattern + "\""); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}
	
	public void setRange(Date from, Date to) {
		// TODO: implement setRange
	}
	
	public void setScrollable(boolean scrollable) {
		this.scrollable = scrollable;
		if(isSimple() && !scrollable) {
			if(picker != null && picker instanceof DatePicker) {
				updatePicker();
			}
		}
	}
	
	public void setSelectedDates(Date[] selectedDates) {
		if(selectedDates == null) {
			this.selection = new Date[0];
		} else {
			this.selection = selectedDates.clone();
		}
		if(singleSelection && this.selection.length > 0) {
			setTime(selectedDates[0]);
		} else {
			updateText(true);
			updatePicker();
		}
	}

	/**
	 * Set the selection for this CDateTime to that of the provided
	 * <code>Date</code> object.<br>
	 * This method will update the text box and, if the <code>DROP_DOWN</code>
	 * style is set, the selection of the associated drop down CDateTime.
	 * @param selection the <code>Date</code> object to use for the new selection
	 * @see #getSelectedDates()
	 */
	public void setSelection(Date selection) {
		if(selection == null) {
			setSelectedDates((Date[]) null);
		} else {
			setSelectedDates(new Date[] { selection });
		}
	}
	
	public void setSelectionMode(int selectionMode) {
		// TODO implement setSelectionMode
	}

	public void setTime(Date date) {
		if(date == null) {
			calendar.setTime(new Date());
		} else {
			calendar.setTime(date);
		}
		updateText(true);
		updatePicker();
	}
	
	public void setTimeZone(String zoneID) {
        setTimeZone(TimeZone.getTimeZone(zoneID));
    }
	
	public void setTimeZone(TimeZone zone) {
		if(zone == null) timezone = TimeZone.getDefault();
		if(!this.timezone.equals(zone)) {
			this.timezone = zone;
			calendar.setTimeZone(this.timezone);
			df.setTimeZone(this.timezone);
			updateText(true);
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " {" + getTime() + "}";
	}
	
	/**
	 * inspects all of the calendar fields in the <code>field</code> array to determine what
	 * style is appropriate and then sets that style to the picker using the setPickerStyle method.<br>
	 */
	private boolean updateFields() {
		Field[] bak = new Field[(field == null) ? 0 : field.length];
		if(bak.length > 0) System.arraycopy(field, 0, bak, 0, field.length);
		
		AttributedCharacterIterator aci = df.formatToCharacterIterator(calendar.getTime());
		field = new Field[aci.getAllAttributeKeys().size()];
		separator = new String[field.length+1]; // there can be a separator before and after
		int i = 0;
		Object last = null;
		for(char c = aci.first(); c != CharacterIterator.DONE; c = aci.next()) {
			Object[] oa = aci.getAttributes().keySet().toArray();
			if(oa.length > 0) {
				if(oa[0] != last && i < field.length) {
					if(getCalendarField((Field) oa[0]) < 0) {
						if(bak.length > 0) {
							field = new Field[bak.length];
							System.arraycopy(bak, 0, field, 0, bak.length);
						}
						return false;
					} else {
						field[i] = (Field) oa[0];
						last = oa[0];
					}
					i++;
				}
			} else {
				if(separator[i] == null) separator[i] = String.valueOf(c);
			}
		}

		df.setLenient(false);
		setActiveField(FIELD_NONE);
		return true;
	}
	
	private void updateNullText() {
		if(defaultNullText) {
			if(isDate) {
				nullText = Resources.getString("null_text.date", locale);
			} else {
				nullText = Resources.getString("null_text.time", locale);
			}
			if(!hasSelection()) {
				updateText(true);
			}
		}
	}
	
	/**
	 * tell the picker to update its view of the selection and reference time<br>
	 * checks for null and disposed first
	 */
	private void updatePicker() {
		if(picker != null) {
			picker.updateView();
		}
	}
	
	/**
	 * Performs an asynchronous text update by calling
	 * <code>updateText(false)</code>
	 */
	private void updateText() {
		updateText(false);
	}
	
	/**
	 * This is the only way that text is set to the text box.<br>
	 * The selection is also set here (corresponding to the active field) as
	 * well as if a field is being edited, it's "edit text" is inserted for
	 * display.
	 */
	private void updateText(boolean sync) {
		String buffer = hasSelection() ? df.format(getSelection()) : getNullText();

		int s0 = 0;
		int s1 = 0;

		if(!hasSelection()) {
			s0 = 0;
			s1 = buffer.length();
		} else if(activeField >= 0 && activeField < field.length) {
			AttributedCharacterIterator aci = df.formatToCharacterIterator(calendar.getTime());
			for(char c = aci.first(); c != CharacterIterator.DONE; c = aci.next()) {
				if(aci.getAttribute(field[activeField]) != null) {
					s0 = aci.getRunStart();
					s1 = aci.getRunLimit();
					if(editField != null) {
						String str = editField.toString();
						buffer = buffer.substring(0, s0) + str + buffer.substring(s1);
						int oldS1 = s1;
						s1 = s0 +str.length();
						textSelectionOffset.x = Math.min(oldS1, s1);
						textSelectionOffset.y = (oldS1 - s0) - str.length();
					} else {
						textSelectionOffset.x = buffer.length()+1;
						textSelectionOffset.y = 0;
					}
					break;
				}
			}
		} else {
			setActiveField(FIELD_NONE);
		}

		final String string = buffer;
		final int selStart = s0;
		final int selEnd = s1;

		Runnable r = new Runnable() {
			public void run() {
				if((text != null) && (!text.isDisposed())) {
					if(!string.equals(text.getText())) {
						text.removeListener(SWT.Verify, textListener);
						text.setText(string);
						text.addListener(SWT.Verify, textListener);
					}
					text.getControl().setSelection(selStart, selEnd);
				}
			}
		};
		
		if(sync) {
			getDisplay().syncExec(r);
		} else {
			getDisplay().asyncExec(r);
		}
	}

	/**
	 * The Verify Event handler.<br>
	 * <b>EVERYTHING</b> is blocked via this handler (Event.doit is set to false).
	 * Depending upon the input, a course of action is determined and the displayed 
	 * text is updated via the <code>updateText()</code> method.
	 * @param e the event
	 * @see CDateTime#updateText()
	 */
	void verify(Event e) {
		e.doit = false;
		if(field.length == 0 || activeField == FIELD_NONE) return;
		
		char c = e.character;
		if(((e.text.length() == 1) && String.valueOf(c).equals(e.text) && Character.isDigit(c)) || 
				(e.text.length() > 1) ) {
			if(e.text.length() == 1) {
				if(editField == null) {
					int cf = getCalendarField();
					if(cf >= 0) {
						int digits;
						switch(cf) {
						case Calendar.YEAR: 
							digits = 4;
							break;
						case Calendar.DAY_OF_YEAR:
							digits = 3;
							break;
						case Calendar.AM_PM:
						case Calendar.DAY_OF_WEEK:
						case Calendar.ERA:
							digits = 1;
							break;
						default:
							digits = 2;
						}
						editField = new EditField(digits, calendar.get(cf));
					} else {
						return;
					}
				}
				if(editField.addChar(c)) {
					if(commitEditField()) {
						fieldNext();
					} else {
						editField = null;
						selection[0] = calendar.getTime();
						updateText();
					}
				}
				selection[0] = calendar.getTime();
				updatePicker();
			} else {
				try {
					setSelection(df.parse(e.text));
					fireSelectionChanged();
				} catch (ParseException pe) {
					// do nothing
				}
			}
		}
		updateText();
	}
}
