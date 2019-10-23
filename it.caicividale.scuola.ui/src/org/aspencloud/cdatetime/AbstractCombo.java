/****************************************************************************
 * Copyright (c) 2005-2008 Jeremy Dowdall
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	 IBM Corporation - SWT's CCombo was relied upon _heavily_ for example and reference
 *    Jeremy Dowdall <jeremyd@aspencloud.com> - initial API and implementation
 *****************************************************************************/

package org.aspencloud.cdatetime;

import org.aspencloud.v.VButton;
import org.aspencloud.v.VButtonPainter;
import org.aspencloud.v.VControl;
import org.aspencloud.v.VLayout;
import org.aspencloud.v.VNative;
import org.aspencloud.v.VPanel;
import org.aspencloud.v.VSimpleLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * The AbstractCombo is an abstract class which provides the basic functionality
 * for a button with a DROP_DOWN, or "popup", shell component. When the user
 * selects the button the shell is set visible and the SWT Components which have
 * been placed on the "content" Composite will be shown.
 */
public abstract class AbstractCombo extends Canvas {

	/**
	 * Special layout implementation to position the combo's drop-down Button
	 * within its Text.
	 */
	protected class DropComboLayout extends VLayout {

		protected Point computeSize(VPanel panel, int wHint, int hHint, boolean flushCache) {
			Point size = text.computeSize(SWT.DEFAULT, SWT.DEFAULT);
			if(button.getVisible()) { // use "get" rather than "is" so it
										// works even when not actually showing
				size.x += size.y;
			}

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

			Point tSize = text.computeSize(SWT.DEFAULT, SWT.DEFAULT);
			tSize.y += textMarginHeight;

			Point bSize = button.getVisible() ? new Point(tSize.y, tSize.y) : new Point(0, 0);

			if(leftAlign) {
				text.setBounds(cRect.x + bSize.x, cRect.y + (win32 ? getBorderWidth() : 0), cRect.width - bSize.x, tSize.y);
				button.setBounds(cRect.x, cRect.y, bSize.x, bSize.y);
			} else {
				text.setBounds(
						cRect.x+(win32 ? 1 : 0), 
						cRect.y + (win32 ? 1 : 0), 
						cRect.width-bSize.x-(win32 ? 2 : 0), 
						tSize.y-(win32 ? 2 : 0)
					);
				button.setBounds(
						win32 ? (cRect.x+cRect.width-cRect.height+1) : (cRect.x+cRect.width-bSize.x),
						cRect.y,
						win32 ? (cRect.height-1) : bSize.x,
						win32 ? cRect.height : bSize.y
					);
			}
		}
	}

	/**
	 * The value of {@link SWT#getVersion()} for the earliest known revision
	 * that fixes the SWT bug mentioned in bug 185739.
	 */
	protected static int SWT_MODAL_FIX_VERSION = 3346;

	/**
	 * true if the platform is carbon, false otherwise
	 */
	protected static final boolean carbon = "carbon".equals(SWT.getPlatform()); //$NON-NLS-1$

	/**
	 * true if the platform is gtk, false otherwise
	 */
	protected static final boolean gtk = "gtk".equals(SWT.getPlatform()); //$NON-NLS-1$

	/**
	 * true if the platform is win32, false otherwise
	 */
	protected static final boolean win32 = "win32".equals(SWT.getPlatform()); //$NON-NLS-1$

	/**
	 * true if the platform is winXP, false otherwise
	 */
	protected static final boolean winxp = "win32".equals(SWT.getPlatform()) && "5.0".equals(System.getProperty("os.version")); //$NON-NLS-1$ $NON-NLS-2$

	/**
	 * true if the platform is win32, false otherwise
	 */
	protected static final boolean vista = "win32".equals(SWT.getPlatform()) && "6.0".equals(System.getProperty("os.version")); //$NON-NLS-1$ $NON-NLS-2$
	
	/**
	 * A constant value used to pad the computed height for this widget, so that
	 * the combo's Button will fit without clipping its top and bottom borders.
	 */
	protected static final int textMarginHeight = win32 ? 4 : 0;

	private static int checkStyle(int style) {
		int rstyle = SWT.NONE;
		if((style & CDT.BORDER) != 0) {
			if(win32 || (style & CDT.SIMPLE) != 0) {
				rstyle |= SWT.BORDER;
			}
		}
		if(win32) {
			rstyle |= SWT.DOUBLE_BUFFERED;
		}
		return rstyle;
	}

	protected static boolean containsControl(Control control, Composite composite) {
		if(composite != null && !composite.isDisposed()) {
			Control[] children = composite.getChildren();
			for(Control child : children) {
				if(!child.isDisposed()) {
					if(child == control) {
						return true;
					} else if(child instanceof Composite){
						return containsControl(control, (Composite) child);
					}
				}
			}
		}
		return false;
	}

	protected VPanel panel = null;

	/**
	 * The Button widget of a DROP_DOWN style combo. This value may be null --
	 * protect all references to this field with the checkButton() method.
	 */
	protected VButton button = null;

	/**
	 * The image to be painted on the Button of a DROP_DOWN style combo if the
	 * BUTTON_IMG style is set.
	 */
	protected Image buttonImage = null;

	/**
	 * True if a default image should be used for the button; false otherwise -
	 * as is the case when an image is set using {@link #setButtonImage(Image)}
	 * 
	 * @see #setButtonImage(Image)
	 */
	protected boolean defaultButtonImage = true;

	/**
	 * True if a default text should be used to represent a null selection;
	 * false otherwise - as is the case when the null text is set explicitly
	 * using {@link #set}
	 * 
	 * @see #setButtonImage(Image)
	 */
	protected boolean defaultNullText = true;

	/**
	 * The size of the image to be painted on the Button of a DROP_DOWN style
	 * combo if the BUTTON_IMG style is set.
	 */
	protected Point buttonImageSize = null;

	/**
	 * The Text widget of a DROP_DOWN style combo. This value may be null --
	 * protect all references to this field with the checkText() method.
	 */
	protected VNative<Text> text = null;

	/**
	 * The popup Shell widget of a DROP_DOWN style combo. This value may be null --
	 * protect all references to this field with the checkContentShell() method.
	 */
	protected Shell contentShell = null;

	/**
	 * The widget contents of the popup Shell in a DROP_DOWN combo or the full
	 * contents of a SIMPLE combo. This value may be null -- protect all
	 * references to this field with the checkContent() method.
	 */
	protected Control content;

	/**
	 * The style bits requested. NOTE: this may not match the value returned by
	 * {@link #getStyle()} if invalid bits were requested.
	 */
	protected int style;

	/**
	 * Flag to indicate that this is a SIMPLE style combo.
	 */
	protected boolean simple;
	/**
	 * Flag to indicate that this combo's BUTTON should be displayed on the left
	 * side of its Text.
	 */
	protected boolean leftAlign = false;

	private int buttonVisibility;
	private boolean dropDown;
	private boolean open = false;

	private boolean holdOpen = false;
	/**
	 * 
	 */
	protected boolean hasFocus;

	private VControl positionControl;

	private VControl stretchControl;

	private Listener textListener;
	private Listener shellListener;
	private Listener comboListener = new Listener() {
		public void handleEvent(Event event) {
			switch (event.type){
			case SWT.Move:
				if(isOpen()) {
					setOpen(false);
				}
				break;
			case SWT.Resize:
				if(isOpen()) {
					setOpen(false);
				}
				layout(true);
				break;
			}
		};
	};
	
	private Listener disposeListener = new Listener() {
		public void handleEvent(Event event) {
			if(!isDisposed()) {
				getShell().removeListener(SWT.Deactivate, comboListener);
				if(checkContentShell()) {
					contentShell.dispose();
				}
			}
		}
	};

	Boolean busy = false;

	/**
	 * Main constructor -- must be called by all subclasses in their own
	 * constructors.
	 * 
	 * @param parent
	 *            the visual parent of this widget
	 * @param style
	 *            the requested SWT style bitmask for this widget
	 */
	public AbstractCombo(Composite parent, int style) {
		super(parent, checkStyle(style));
		
		panel = new VPanel(this, SWT.NONE);
		panel.setWidget(this);

		init(style);
	}

	/**
	 * Adds the listener to the collection of listeners who will be notified
	 * when the receiver's text is modified, by sending it one of the messages
	 * defined in the <code>ModifyListener</code> interface.<br/> Note that
	 * this is NOT the correct way to listen for changes in the underlying model
	 * for the combo. This should be provided by some other mechanism, such as a
	 * {@link SelectionListener}.
	 * 
	 * @param listener
	 *            the listener which should be notified
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT - if the listener is null</li>
	 *                </ul>
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 * 
	 * @see ModifyListener
	 * @see #removeModifyListener
	 */
	public void addModifyListener(ModifyListener listener) {
		if(listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		if(checkText())
			text.getControl().addModifyListener(listener);
	}

	public void addTraverseListener(TraverseListener listener) {
		if(listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		if(checkText())
			text.getControl().addTraverseListener(listener);
	}

	/**
	 * @return true if the {@link #button} field is in a fit state to be used
	 */
	protected boolean checkButton() {
		return (button != null && !button.isDisposed());
	}

	/**
	 * @return true if the {@link #content} field is in a fit state to be used
	 */
	protected boolean checkContent() {
		return (content != null && !content.isDisposed());
	}

	/**
	 * @return true if the {@link #contentShell} field is in a fit state to be
	 *         used
	 */
	protected boolean checkContentShell() {
		return (contentShell != null && !contentShell.isDisposed());
	}

	/**
	 * @return true if the {@link #text} field is in a fit state to be used
	 */
	protected boolean checkText() {
		return (text != null && !text.isDisposed());
	}

	private void createButton(int style) {
		int buttonStyle = ((style & CDT.BUTTON_TOGGLE) != 0) ? SWT.TOGGLE : SWT.PUSH;
		if((style & CDT.BUTTON_CUSTOM) == 0)
			buttonStyle |= (SWT.ARROW | SWT.DOWN);
		if((style & SWT.FLAT) != 0)
			buttonStyle |= SWT.FLAT;

		button = new VButton(panel, buttonStyle | SWT.NO_FOCUS);
		if((style & CDT.BUTTON_ONLY) == 0) {
			button.setMargins(0, 0);
		}
		button.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				setOpen(!isOpen());
			}
		});
		
		if(win32) {
			button.setPainter(new VButtonPainter() {
				@Override
				public void paintBackground(VControl control, Event e) {
					VButton button = (VButton) control;
					if(button.hasState(VButton.STATE_ACTIVE)) {
						Rectangle r = button.getBounds();
						e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_GRAY));
						e.gc.fillRoundRectangle(r.x, r.y, r.width-1, r.height-1, 2, 2);
						e.gc.drawRoundRectangle(r.x, r.y, r.width-1, r.height-1, 2, 2);
					}
				}
			});
		}
	}

	private void createContentShell() {
		int pstyle = getShell().getStyle();
		GridLayout layout = new GridLayout();

		// Some versions of SWT before 3.3 had a bug where child Shells of modal shells
		// would not receive events. This fix creates the popup with modal style, so
		// that the popup always receives events, but the parent does not. This is
		// not ideal, so it is only applied if the SWT version is less than one that
		// is known to be good.
		// TODO: find the precise version at which the SWT bug was fixed
		if(SWT.getVersion() < SWT_MODAL_FIX_VERSION && ((pstyle & SWT.APPLICATION_MODAL) != 0)
				|| ((pstyle & SWT.SYSTEM_MODAL) != 0)) {
			contentShell = new Shell(getShell(), SWT.APPLICATION_MODAL);
			layout.marginWidth = 0;
			layout.marginHeight = 0;
		} else {
			contentShell = new Shell(getShell(), SWT.NO_TRIM | SWT.ON_TOP);
			layout.marginWidth = 1;
			layout.marginHeight = 1;
		}

		contentShell.addListener(SWT.Close, shellListener);
		contentShell.addListener(SWT.Deactivate, shellListener);
	}

	private void createText(int style) {
		textListener = new Listener() {
			public void handleEvent(Event event) {
				switch (event.type){
				case SWT.KeyDown:
					if(event.stateMask == SWT.CTRL && event.keyCode == ' ') {
						setOpen(true);
					}
					break;
				case SWT.Modify:
					Event e = new Event();
					e.time = event.time;
					setModifyEventProperties(e);
					notifyListeners(SWT.Modify, e);
					break;
				}
			}
		};

		int textStyle = SWT.SINGLE;
		if(!win32) {
			textStyle |= ((CDT.BORDER & style) != 0) ? SWT.BORDER : 0;
		}
		if((style & CDT.TEXT_RIGHT) != 0) {
			textStyle |= SWT.TRAIL;
		} else if((style & CDT.TEXT_LEFT) != 0) {
			textStyle |= SWT.LEAD;
		}

		text = VNative.create(Text.class, panel, textStyle);
		text.addListener(SWT.KeyDown, textListener);
		text.addListener(SWT.Modify, textListener);
	}

	/**
	 * @param image
	 */
	protected void doSetButtonImage(Image image) {
		if(checkButton()) {
			button.setImage(image);
		}
	}

	/**
	 * @return the Control that was set as this popup shell's content with
	 *         setContent(Control)
	 */
	protected Control getContent() {
		return content;
	}

	/**
	 * @return the content shell
	 */
	protected Shell getContentShell() {
		if(contentShell == null) {
			createContentShell();
		}
		return contentShell;
	}

	/**
	 * Returns the editable state.
	 * 
	 * @return whether or not the receiver is editable
	 * 
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 */
	public boolean getEditable() {
		return checkText() ? text.getControl().getEditable() : getEnabled();
	}

	/**
	 * Fixes bug 181442: [CDateTime] Incorrect getEnabled()
	 */
	public boolean getEnabled() {
		return checkText() ? text.getEnabled() : super.getEnabled();
	}

	/**
	 * @return the state of the holdOpen flag
	 */
	protected boolean getHoldOpen() {
		return holdOpen;
	}

	/**
	 * returns the menu for this combo
	 */
	public Menu getMenu() {
		if(checkText()) {
			return text.getMenu();
		}
		return super.getMenu();
	}

	/**
	 * @return the stretch control
	 */
	protected VControl getStretchControl() {
		return stretchControl;
	}

	public int getStyle() {
		return style;
	}

	/**
	 * Returns the text of this combo
	 * 
	 * @return the combo's text
	 */
	public String getText() {
		return checkText() ? text.getText() : ""; //$NON-NLS-1$
	}

	protected boolean containsControl(Control control) {
		return containsControl(control, this) || containsControl(control, contentShell);
	}
	
	/**
	 * The Focus event handler. Subclasses may override but should always the
	 * super.
	 * 
	 * @param type
	 * @param widget
	 */
	private void init(int style) {
		this.style = style;
		simple = (style & CDT.SIMPLE) != 0;
		dropDown = (style & (CDT.BUTTON_ONLY | CDT.DROP_DOWN)) != 0;

		if(simple) {
			panel.setLayout(new VSimpleLayout());
		} else if(dropDown) {
			leftAlign = ((style & CDT.BUTTON_LEFT) != 0);

			createButton(style);
			if((style & CDT.BUTTON_ONLY) == 0) {
				createText(style);
				if(win32) {
					setPositionControl(panel);
				} else {
					setPositionControl(text);
				}
				panel.setLayout(new DropComboLayout());
			} else {
				setPositionControl(button);
				panel.setLayout(new VSimpleLayout());
			}

			shellListener = new Listener() {
				public void handleEvent(Event event) {
					switch (event.type){
					case SWT.Close:
						event.doit = false;
						setOpen(false);
						break;
					case SWT.Deactivate:
						if(!checkContent() || content.getMenu() == null || !content.getMenu().isVisible()) {
							setOpen(false);
						}
						break;
					}
				}
			};

			addListener(SWT.Move, comboListener);
			addListener(SWT.Resize, comboListener);
		} else {
			panel.setLayout(new VSimpleLayout());
			createText(style);
		}

		addListener(SWT.Dispose, disposeListener);
	}

	/**
	 * @return true if style is CDT.DROP_DOWN
	 */
	protected boolean isDropDown() {
		return dropDown;
	}

	/**
	 * @return the state of the popup shell's visibility
	 */
	public boolean isOpen() {
		return open;
	}

	/**
	 * @return if style is CDT.SIMPLE
	 */
	protected boolean isSimple() {
		return simple;
	}

	/**
	 * called just <i>after</i> the content shell is set not-visible and has
	 * "closed"
	 * <p>
	 * override if you want to do something with the shell just after becoming
	 * not visible
	 * </p>
	 * 
	 * @param popup
	 * @see #preClose(Shell)
	 */
	protected void postClose(Shell popup) {
		// subclasses to implement if necessary
	}

	/**
	 * called <i>after</i> the content shell is set visible and has "opened"
	 * <p>
	 * override if you want to do something with the shell just after becoming
	 * visible
	 * </p>
	 * 
	 * @param popup
	 * @see #preOpen(Shell)
	 */
	protected void postOpen(Shell popup) {
		// subclasses to implement if necessary
	}

	/**
	 * called just <i>before</i> the content shell is set not-visible and
	 * "closes"
	 * <p>
	 * override if you want to do something with the shell prior to it becoming
	 * not visible
	 * </p>
	 * 
	 * @param popup
	 * @see #postClose(Shell)
	 */
	protected void preClose(Shell popup) {
		// subclasses to implement if necessary
	}

	/**
	 * called just <i>before</i> the content shell is set visible and "opens"
	 * <p>
	 * override if you want to do something with the shell prior to it becoming
	 * visible
	 * </p>
	 * 
	 * @param popup
	 * @see #postOpen(Shell)
	 */
	protected void preOpen(Shell popup) {
		// subclasses to implement if necessary
	}

	/**
	 * Removes the listener from the collection of listeners who will be
	 * notified when the receiver's text is modified.
	 * 
	 * @param listener
	 *            the listener which should no longer be notified
	 * 
	 * @exception IllegalArgumentException
	 *                <ul>
	 *                <li>ERROR_NULL_ARGUMENT - if the listener is null</li>
	 *                </ul>
	 * @exception SWTException
	 *                <ul>
	 *                <li>ERROR_WIDGET_DISPOSED - if the receiver has been
	 *                disposed</li>
	 *                <li>ERROR_THREAD_INVALID_ACCESS - if not called from the
	 *                thread that created the receiver</li>
	 *                </ul>
	 * 
	 * @see ModifyListener
	 * @see #addModifyListener
	 */
	public void removeModifyListener(ModifyListener listener) {
		if(listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		if(checkText())
			text.getControl().removeModifyListener(listener);
	}

	public void removeTraverseListener(TraverseListener listener) {
		if(listener == null)
			SWT.error(SWT.ERROR_NULL_ARGUMENT);
		if(checkText())
			text.getControl().removeTraverseListener(listener);
	}

	/**
	 * Set the custom image for the drop down button. Only valid if style is
	 * DROP_DOWN and BUTTON_CUSTOM. Passing null in will set the image to its
	 * default value.
	 * 
	 * @param image
	 */
	public void setButtonImage(Image image) {
		// defaultButtonImage = (image == null);
		doSetButtonImage(image);
	}

	public void setButtonText(String text) {
		if(checkButton()) {
			button.setText(text);
		}
	}

	/**
	 * Set the visibility style of the drop button.
	 * <p>
	 * The style will be forced to NEVER if the contents are null
	 * </p>
	 * <dl>
	 * <dt><b>Styles:</b></dt>
	 * <dd>BUTTON_ALWAYS, BUTTON_AUTO, BUTTON_MANUAL, BUTTON_NEVER</dd>
	 * </dl>
	 * <dl>
	 * <dt><b>Style BUTTON_ALWAYS:</b></dt>
	 * <dd>Button will always be shown - standard SWT.DROP_DOWN behaviour. The
	 * method setButtonVisible(boolean) has no affect with this style set</dd>
	 * <dt><b>Style BUTTON_AUTO:</b></dt>
	 * <dd>Button visibility will be handled automatically through focus
	 * events, popup events, as well as programmatically</dd>
	 * <dt><b>Style BUTTON_MANUAL:</b></dt>
	 * <dd>Button visibility will only be handled programmatically</dd>
	 * <dt><b>Style BUTTON_NEVER:</b></dt>
	 * <dd>Button will never be shown - standard SWT.SIMPLE behaviour. The
	 * method setButtonVisible(boolean) has no affect with this style set</dd>
	 * </dl>
	 * 
	 * @param visibility
	 *            the visibility style constant
	 * @see #setButtonVisible(boolean)
	 */
	public void setButtonVisibility(int visibility) {
		// if(content == null) visibility = CDT.BUTTON_NEVER;
		buttonVisibility = visibility;
		setButtonVisible(false);
	}

	/**
	 * Set the visible state of the button
	 * <p>
	 * Note: This method is only useful when the button's visibility style is
	 * either AUTO or MANUAL.
	 * </p>
	 * 
	 * @param visible
	 * @see #setButtonVisibility(int)
	 */
	public void setButtonVisible(boolean visible) {
		switch (buttonVisibility){
		case CDT.BUTTON_ALWAYS:
			visible = true;
			break;
		case CDT.BUTTON_NEVER:
			visible = false;
			break;
		}

		if(checkButton())
			button.setVisible(visible);

		layout(true);
		update();
	}

	/**
	 * set the content of the popup shell
	 * <p>
	 * Can be a single control, or a Composite consisting of many controls
	 * </p>
	 * 
	 * @param content
	 */
	protected void setContent(Control content) {
		this.content = content;
		if(this.content != null) {
			if(!simple) {
				this.content.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			}
		}
	}

	protected abstract boolean setContentFocus();

	/**
	 * Sets the editable state.
	 * 
	 * @param editable
	 *            the new editable state
	 */
	public void setEditable(boolean editable) {
		panel.setStyle(CDT.READ_ONLY, !editable);
		if(!simple) {
//			if(editable) {
//				setBackground(getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND));
//			} else {
//				setBackground(getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
//			}
		}
	}

	public void setEnabled(boolean enabled) {
		if(checkButton()) {
			button.setEnabled(enabled);
		}
		if(checkText()) {
			text.setEnabled(enabled);
//			if(win32) {
//				if(enabled) {
//					setBackground(getDisplay().getSystemColor(SWT.COLOR_WHITE));
//				} else {
//					setBackground(getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
//				}
//			}
		}
		if(checkContent()) {
			content.setEnabled(enabled);
		}
		super.setEnabled(enabled);
	}

	public boolean setFocus() {
		return panel.setFocus();
	}

	public void setFont(Font font) {
		super.setFont(font);
		if(checkButton()) {
			button.setFont(font);
		}
		if(checkText()) {
			text.setFont(font);
		}
		if(checkContent()) {
			content.setFont(font);
		}
	}

	/**
	 * if holdOpen is true, the popup shell will not close regardless of events
	 * and/or calls to popUp(false) until holdOpen is first set false
	 * <p>
	 * merely sets the holdOpen flag, does not change popup visibility state
	 * </p>
	 * 
	 * @param holdOpen
	 */
	public void setHoldOpen(boolean holdOpen) {
		this.holdOpen = holdOpen;
	}

	/**
	 * Sets the menu for the Text widget of this DropCombo
	 * <p>
	 * Note that setting the menu to null causes the native menu to be used
	 * </p>
	 * <p>
	 * If the intent is to disable the menu, then set it to a blank menu
	 * </p>
	 */
	public void setMenu(Menu menu) {
		if(checkText()) {
			text.getControl().setMenu(menu);
		} else {
			setMenu(menu);
		}
	}

	/**
	 * @param e
	 */
	protected void setModifyEventProperties(Event e) {
		// subclasses to implement
	}

	/**
	 * If pop is true, then opens the popup shell (sets to visible)<br>
	 * If pop is false, closes the popup shell (sets to not visible)<br>
	 * If <code>content == null</code> this method simply returns.<br>
	 * If <code>popup == null</code> then <code>popup</code> will be
	 * created.
	 * 
	 * @param open
	 */
	public void setOpen(boolean open) {
		if(content == null) {
			busy = false;
			return;
		}

		if(contentShell == null) {
			createContentShell();
		}

		if(getShell() != contentShell.getParent()) {
			contentShell.dispose();
			contentShell = null;
			createContentShell();
		}

		if(!open) {
			if(!holdOpen) {
				this.open = false;

				preClose(contentShell);
				int aStyle = Animator.CLOSE | (win32 ? Animator.POP : Animator.SLIDE);
				Point location = positionControl.getComposite().toDisplay(positionControl.getLocation());
				Point contentLocation = contentShell.getLocation();
				if(location.y > contentLocation.y) {
					aStyle |= Animator.UP;
				}

				Animator a = new Animator(content, aStyle);
				a.setAfterFinish(new Runnable() {
					public void run() {
						if(checkText())
							text.setFocus();
						postClose(contentShell);
						busy = false;
					}
				});
				a.start();
			}
		} else {
			int aStyle = Animator.OPEN | (win32 ? Animator.SLIDE : Animator.SLIDE);
			Point size = content.computeSize(-1, -1);
			content.setSize(size);
			Point location = positionControl.getComposite().toDisplay(positionControl.getLocation());
			location.y += (positionControl.getSize().y + 2);
			int dHeight = getDisplay().getClientArea().height;
			if((location.y + size.y) > dHeight) {
				location.y -= (positionControl.getSize().y + size.y + 4);
				aStyle |= Animator.UP;
			}
			if((stretchControl != null) && (size.x < stretchControl.getSize().x)) {
				size.x = stretchControl.getSize().x;
				contentShell.setSize(size);
			}

			if(leftAlign) {
				location.x -= positionControl.getLocation().x;
			} else {
				location.x += (positionControl.getSize().x - size.x);
				if(location.x < 0) {
					location.x = 0;
				}
			}
			if(win32) {
				location.x += 2;
			} else if(carbon) {
				location.y += 8;
			}

			contentShell.setBounds(location.x, location.y, size.x, size.y);

			// chance for subclasses to do something before the shell becomes visible
			preOpen(contentShell);

			this.open = true;

			Animator a = new Animator(content, aStyle);
			a.setAfterFinish(new Runnable() {
				public void run() {
					setContentFocus();
					postOpen(contentShell);
					busy = false;
				}
			});
			a.start();
		}
		if(buttonVisibility == CDT.BUTTON_AUTO) {
			setButtonVisible(hasFocus && !open);
		}
	}

	/**
	 * sets the control to which the popup will align itself
	 * <p>
	 * the control does not necessarily need to be "this" or the button, but
	 * will default to "this" if positionControl == null
	 * </p>
	 * 
	 * @param positionControl
	 */
	protected void setPositionControl(VControl positionControl) {
		if(positionControl == null) {
			this.positionControl = panel;
		} else {
			this.positionControl = positionControl;
		}
	}

	/**
	 * If stretch is false, then the width of the popup will be set to its
	 * preferred width (via computeSize(SWT.DEFAULT, SWT.DEFAULT))
	 * <p>
	 * However, if stretchControl is true, the width of the popup will be
	 * stretched to equal the width of this control (if, however, popup's
	 * preferred width is greater than this control's width popup will not be
	 * shrunk down)
	 * </p>
	 * 
	 * @param stretch
	 */
	public void setStretch(boolean stretch) {
		this.stretchControl = stretch ? panel : null;
	}

	/**
	 * Sets the tooltip on the text and button parts of this Composite widget.
	 * 
	 * @param tooltip
	 *            the new tooltip text
	 */
	public void setToolTipText(String tooltip) {
		text.setToolTipText(tooltip);
		button.setToolTipText(tooltip);
	}
}
