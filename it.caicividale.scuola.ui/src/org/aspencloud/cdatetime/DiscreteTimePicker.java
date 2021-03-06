/****************************************************************************
 * Copyright (c) 2007-2008 Jeremy Dowdall
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jeremy Dowdall <jeremyd@aspencloud.com> - initial API and implementation
 *****************************************************************************/

package org.aspencloud.cdatetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.aspencloud.cdatetime.CDT.PickerType;
import org.aspencloud.v.VButton;
import org.aspencloud.v.VGridLayout;
import org.aspencloud.v.VLabel;
import org.aspencloud.v.VSpacer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

class DiscreteTimePicker extends AbstractPicker {

	VButton[] hours;
	VButton[] minutes;
	VButton[] am_pm;

	private boolean is24Hour;
	private boolean isHorizontal;
	private int cdtStyle;


	public DiscreteTimePicker(CDateTime parent) {
		super(parent);
		
		builder = new CDateTimeBuilder();
		cdtStyle = parent.getStyle();
		isHorizontal = (parent.getStyle() & CDT.VERTICAL) == 0;
	}

	private void clearButtons() {
		for(int i = 0; i < hours.length; i++) {
			hours[i].setSelection(false);
		}
		for(int i = 0; i < minutes.length; i++) {
			minutes[i].setSelection(false);
		}
		for(int i = 0; i < am_pm.length; i++) {
			am_pm[i].setSelection(false);
		}
	}
	
	protected void createContents() {
		VGridLayout layout = new VGridLayout();
		layout.numColumns = isHorizontal ? (is24Hour ? 12 : 14) : (is24Hour ? 4 : 3);
		layout.makeColumnsEqualWidth = false;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		setLayout(layout);
		
		hours = new VButton[is24Hour ? 24 : 12];
		minutes = new VButton[12];
		am_pm = new VButton[is24Hour ? 0 : 2];
		if(isHorizontal) {
			createHorizontal();
		} else {
			createVertical();
		}
	}
	
	private void createHorizontal() {
		for(int i = 0; i < hours.length; i++) {
			hours[i] = new VButton(this, SWT.TOGGLE | SWT.NO_FOCUS);
			hours[i].setSquare(true);
			hours[i].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			hours[i].addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					for(VButton button : hours) {
						if(button != event.data) {
							button.setSelection(false);
						}
					}
					updateSelection();
				}
			});

			if(!is24Hour && i == 11) {
				VLabel lbl = new VLabel(this, SWT.SEPARATOR);
				GridData data = new GridData(SWT.FILL, SWT.FILL, false, false);
				data.verticalSpan = 3;
				lbl.setLayoutData(data);
				
				am_pm[0] = new VButton(this, SWT.TOGGLE | SWT.NO_FOCUS);
				am_pm[0].setSquare(true);
				am_pm[0].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
				am_pm[0].addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						for(VButton button : am_pm) {
							if(button != event.data) {
								button.setSelection(false);
							}
						}
						updateSelection();
					}
				});
			}
		}
		
		VLabel lbl = new VLabel(this, SWT.HORIZONTAL | SWT.SEPARATOR);
		GridData data = new GridData(SWT.FILL, SWT.CENTER, false, false);
		data.horizontalSpan = 12;
		lbl.setLayoutData(data);

		if(!is24Hour) {
			lbl = new VLabel(this, SWT.NONE);
			data = new GridData(SWT.FILL, SWT.CENTER, false, false);
			data.heightHint = 1;
			lbl.setLayoutData(data);
		}
		
		for(int i = 0; i < minutes.length; i++) {
			minutes[i] = new VButton(this, SWT.TOGGLE | SWT.NO_FOCUS);
			minutes[i].setSquare(true);
			minutes[i].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			minutes[i].setBackground(getDisplay().getSystemColor(SWT.COLOR_WHITE));
			minutes[i].addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					for(VButton button : minutes) {
						if(button != event.data) {
							button.setSelection(false);
						}
					}
					updateSelection();
				}
			});
		}

		if(!is24Hour) {
			am_pm[1] = new VButton(this, SWT.TOGGLE | SWT.NO_FOCUS);
			am_pm[1].setSquare(true);
			am_pm[1].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			am_pm[1].addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					for(VButton button : am_pm) {
						if(button != event.data) {
							button.setSelection(false);
						}
					}
					updateSelection();
				}
			});
		}
	}
	
	private void createVertical() {
		for(int i = 0; i < minutes.length; i++) {
			hours[i] = new VButton(this, SWT.TOGGLE | SWT.NO_FOCUS);
			hours[i].setSquare(true);
			hours[i].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			hours[i].addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					for(VButton button : hours) {
						if(button != event.data) {
							button.setSelection(false);
						}
					}
					updateSelection();
				}
			});

			int j = i+12;
			if(j < hours.length) {
				hours[j] = new VButton(this, SWT.TOGGLE | SWT.NO_FOCUS);
				hours[i].setSquare(true);
				hours[j].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
				hours[j].addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						for(VButton button : hours) {
							if(button != event.data) {
								button.setSelection(false);
							}
						}
						updateSelection();
					}
				});
			}

			if(i == 0) {
				VLabel lbl = new VLabel(this, SWT.SEPARATOR);
				GridData data = new GridData(SWT.FILL, SWT.FILL, false, false);
				data.verticalSpan = 12;
				lbl.setLayoutData(data);
			}
			
			minutes[i] = new VButton(this, SWT.TOGGLE | SWT.NO_FOCUS);
			minutes[i].setSquare(true);
			minutes[i].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			minutes[i].setBackground(getDisplay().getSystemColor(SWT.COLOR_WHITE));
			minutes[i].addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					for(VButton button : minutes) {
						if(button != event.data) {
							button.setSelection(false);
						}
					}
					updateSelection();
				}
			});
		}

		if(!is24Hour) {
			VLabel lbl = new VLabel(this, SWT.HORIZONTAL | SWT.SEPARATOR);
			GridData data = new GridData(SWT.FILL, SWT.FILL, false, false);
			data.horizontalSpan = 3;
			lbl.setLayoutData(data);
		}
		
		for(int i = 0; i < am_pm.length; i++) {
			am_pm[i] = new VButton(this, SWT.TOGGLE | SWT.NO_FOCUS);
			am_pm[i].setSquare(true);
			am_pm[i].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			am_pm[i].addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					for(VButton button : am_pm) {
						if(button != event.data) {
							button.setSelection(false);
						}
					}
					updateSelection();
				}
			});

			if(i == 0) {
				new VSpacer(this, SWT.NONE);
			}
		}
	}

	public int[] getFields() {
		return new int[] { 
				Calendar.HOUR_OF_DAY,
				Calendar.MINUTE };
	}
	
	@Override
	public PickerType getPickerType() {
		return PickerType.DiscreteTime;
	}

	public void setFields(int[] calendarFields) {
		super.setFields(calendarFields);
		if((cdtStyle & CDT.CLOCK_12_HOUR) != 0) {
			is24Hour = false;
		} else if((cdtStyle & CDT.CLOCK_24_HOUR) != 0) {
			is24Hour = true;
		} else {
			is24Hour = isSet(Calendar.HOUR_OF_DAY);
		}
		
		createContents();
		updateLabels();
	}
	
	public boolean setFocus() {
		return true;
	}

	protected void updateLabels() {
        Calendar cal = getCalendarInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        Locale locale = getLocale();
        String pattern = ((SimpleDateFormat) DateFormat.getTimeInstance(DateFormat.SHORT, locale)).toPattern();
		SimpleDateFormat sdf = null;
		if(pattern.indexOf("HH") > -1) { //$NON-NLS-1$
			sdf = new SimpleDateFormat("HH", locale); //$NON-NLS-1$
		} else if(pattern.indexOf("H") > -1) { //$NON-NLS-1$
			sdf = new SimpleDateFormat("H", locale); //$NON-NLS-1$
		} else if(pattern.indexOf("hh") > -1) { //$NON-NLS-1$
			sdf = new SimpleDateFormat("h", locale); //$NON-NLS-1$
		} else { //implies: (pattern.contains("h")) {
			sdf = new SimpleDateFormat("h", locale); //$NON-NLS-1$
		}
        sdf.setTimeZone(cal.getTimeZone());
		for(int i = 0; i < hours.length; i++) {
			hours[i].setText(sdf.format(cal.getTime()));
			cal.add(Calendar.HOUR_OF_DAY, 1);
		}

		sdf.applyPattern(":mm"); //$NON-NLS-1$
		for(int i = 0; i < minutes.length; i++) {
			minutes[i].setText(sdf.format(cal.getTime()));
			cal.add(Calendar.MINUTE, 5);
		}
		
		sdf.applyPattern("a"); //$NON-NLS-1$
		if(!is24Hour) {
			cal.set(Calendar.HOUR_OF_DAY, 1);
			am_pm[0].setText(sdf.format(cal.getTime()));
			cal.set(Calendar.HOUR_OF_DAY, 13);
			am_pm[1].setText(sdf.format(cal.getTime()));
		}
	}
	
	protected void updateSelection() {
		Calendar cal = getCalendarInstance();
		
		boolean hour_set = false;
		for(int i = 0; i < hours.length; i++) {
			if(hours[i].getSelection()) {
				cal.set(Calendar.HOUR_OF_DAY, i);
				hour_set = true;
				break;
			}
		}
		
		boolean min_set = false;
		for(int i = 0; i < minutes.length; i++) {
			if(minutes[i].getSelection()) {
				cal.set(Calendar.MINUTE, i*5);
				min_set = true;
				break;
			}
		}
		
		boolean ampm_set = is24Hour || am_pm[0].getSelection() || am_pm[1].getSelection();
		if(!is24Hour && am_pm[1].getSelection()) {
				cal.add(Calendar.HOUR_OF_DAY, 12);
		}

		if(hour_set && min_set && ampm_set) {
			setSelection(cal.getTime());
			fireSelectionChanged();
		}
	}
	
	protected void updateView() {
		clearButtons();
	}
	
}
