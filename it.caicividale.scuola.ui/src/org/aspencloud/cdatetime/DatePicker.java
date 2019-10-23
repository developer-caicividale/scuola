/****************************************************************************
* Copyright (c) 2004-2008 Jeremy Dowdall
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*    Jeremy Dowdall <jeremyd@aspencloud.com> - initial API and implementation
*****************************************************************************/

package org.aspencloud.cdatetime;

import java.awt.ComponentOrientation;
import java.text.BreakIterator;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

import org.aspencloud.cdatetime.CDT.Key;
import org.aspencloud.cdatetime.CDT.PickerPart;
import org.aspencloud.cdatetime.CDT.PickerType;
import org.aspencloud.v.VButton;
import org.aspencloud.v.VControl;
import org.aspencloud.v.VGridLayout;
import org.aspencloud.v.VLabel;
import org.aspencloud.v.VNative;
import org.aspencloud.v.VPanel;
import org.aspencloud.v.VStackLayout;
import org.aspencloud.v.VTracker;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;


class DatePicker extends AbstractPicker {
	
	private static final int DAYS_IN_WEEK = 7;
	private static final int NUM_ROWS = 6;

	private Listener dayListener;

	private VPanel header;
	private VPanel body;
	private VPanel[] bodyPanels;
	private VPanel footer;
	
	private VPanel dayPanel;
	
	VButton monthButton;
	VButton monthPrev;
	VButton dateNow;
	VButton monthNext;
	VButton yearButton;
	VButton yearPrev;
	VButton yearNext;
	VButton timeButton;
	VLabel dayLabels[];
	VButton dayButtons[];
	VButton today;
	VButton clear;
	MenuItem daysMenuItem;
	MenuItem[] monthItems;
	MenuItem[] yearItems;

//	private int focusDayButton;
	boolean editYear = false;
	private boolean scrollable = true;
	
	private Comparator<Date> dayComparator = new Comparator<Date>() {
		public int compare(Date d1, Date d2) {
			return d1.compareTo(d2);
		}
	};
	

	VPanel monthPanel;
	
	VButton[] monthButtons;

	VPanel yearPanel;

	VButton[] yearButtons;

	AnalogTimePicker timePanel;
	
	VNative<CDateTime> digitalTime;
	
	public DatePicker(AbstractPicker parent, int style) {
		super(parent, style);
		init(style);
	}
	
	/**
	 * Constructs a new instance of this class given its parent, a style value 
	 * describing its behavior and appearance, a date to which the initial selection
	 * will be set, and the locale to use.
	 * @param parent a widget which will be the parent of the new instance (cannot be null)
	 * @param style the style of widget to construct
	 * @param date a Date object representing the initial selection
	 * @param locale the locale which this CDateTime is to use
	 */
	public DatePicker(CDateTime parent) {
		super(parent);
		init(parent.getStyle());
	}
	
	/**
	 * Modifies the given Calendar field by the given amount for every dayButton.<br/>
	 * calendar.add(CalendarField, amount)
	 * @param field Calendar Field
	 * @param amount adjustment to be added
	 */
	private void adjustDays(int field, int amount) {
		Calendar tmpcal = getCalendarInstance();
		for(int day = 0; day < dayButtons.length; day++) {
			tmpcal.setTime(dayButtons[day].getData(CDT.Key.Date, Date.class));
			tmpcal.add(field, amount);
			dayButtons[day].setData(CDT.Key.Date, tmpcal.getTime());
		}
	}
	
	private void addBodyPanel() {
		if(bodyPanels == null) {
			bodyPanels = new VPanel[1];
		} else {
			VPanel[] pa = new VPanel[bodyPanels.length+1];
			System.arraycopy(bodyPanels, 0, pa, 0, bodyPanels.length);
			bodyPanels = pa;
			body.getLayout(VGridLayout.class).numColumns++;
		}
		
		VPanel picker = new VPanel(body, SWT.NONE);
		picker.setData(CDT.PickerPart, PickerPart.BodyPanel);
		picker.setPainter(getPainter());
		getPainter().update(picker);
		picker.setLayout(new VStackLayout());
		picker.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		bodyPanels[bodyPanels.length-1] = picker;
	}
	
	/**
	 * create the Calendar's body, which contains the dayLabels and dayButtons
	 */
	private void createBody() {
		body = new VPanel(this, SWT.NONE);
		body.setData(CDT.PickerPart, PickerPart.BodyPanel);
		body.setPainter(getPainter());
		getPainter().update(body);
		VGridLayout layout = new VGridLayout(1, false);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		layout.horizontalSpacing = 0;
		body.setLayout(layout);
		body.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		addBodyPanel();
		
		for(Iterator<Body> iter = builder.getBodies().iterator(); iter.hasNext(); ) {
			Body b = iter.next();
			if(b.newColumn) {
				VLabel sep = new VLabel(body, SWT.SEPARATOR | SWT.VERTICAL);
				sep.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
				body.getLayout(VGridLayout.class).numColumns++;
				addBodyPanel();
			}
			switch(b.type) {
			case Body.DAYS:
				createDays(b);
				break;
			case Body.MONTHS:
				createMonths(b);
				break;
			case Body.TIME:
				createTime(b);
				break;
			case Body.YEARS:
				createYears(b);
				break;
			}
		}
		
		for(VPanel bodyPanel : bodyPanels) {
			bodyPanel.getLayout(VStackLayout.class).setTopControl(null);
		}
	}
	
	protected void createContents() {
		VGridLayout layout = new VGridLayout();
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		setLayout(layout);

		if(builder.hasHeader()) {
			createHeader();
		}

		if(builder.hasHeader() && (builder.hasBody() || builder.hasFooter())) {
			VLabel separator = new VLabel(this, SWT.HORIZONTAL | SWT.SEPARATOR);
			separator.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		}
		
		if(builder.hasBody()) {
			createBody();
		}

		if((builder.hasHeader() || builder.hasBody()) && builder.hasFooter()) {
			VLabel sep = new VLabel(this, SWT.HORIZONTAL | SWT.SEPARATOR);
			sep.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		}
		
		if(builder.hasFooter()) {
			createFooter();
		}
	}

	private void createDays(Body b) {
		VPanel bodyPanel = bodyPanels[bodyPanels.length-1];
		
		dayPanel = new VPanel(bodyPanel, SWT.NONE);
		dayPanel.setData(CDT.PickerPart, PickerPart.DayPanel);
		dayPanel.setPainter(getPainter());
		getPainter().update(dayPanel);
		VGridLayout layout = new VGridLayout(7, true);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.horizontalSpacing = b.spacing;
		layout.verticalSpacing = b.spacing;
		dayPanel.setLayout(layout);

		bodyPanel.getLayout(VStackLayout.class).setDefault(dayPanel, false);
		
		addListener(SWT.MouseWheel, new Listener() {
			public void handleEvent(Event event) {
				scrollCalendar((event.count > 0) ? SWT.ARROW_UP : SWT.ARROW_DOWN);
			}
		});

		Menu bodyMenu = dayPanel.createMenu();
		daysMenuItem = new MenuItem(bodyMenu, SWT.NONE);
		daysMenuItem.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				setSelection(new Date());
			}
		});

		dayListener = new Listener() {
			public void handleEvent(Event event) {
				switch(event.type) {
				case SWT.KeyDown:
					// block the arrow keys because they are handled by the traverse listener
					if((event.keyCode != SWT.ARROW_DOWN) && (event.keyCode != SWT.ARROW_UP)) {
						scrollCalendar(event.keyCode);
					}
					break;
				case SWT.MouseDown:
					if(event.button == 3) {
						dayPanel.getMenu().setVisible(true);
					}
					break;
				case SWT.MouseWheel:
					scrollCalendar((event.count > 0) ? SWT.ARROW_UP : SWT.ARROW_DOWN);
					break;
				case SWT.Selection:
					if(event.widget == null) {
						VButton button = (VButton) event.data;
						int stateMask = event.stateMask;
						Date date = (Date) button.getData(CDT.Key.Date.name());
						if(isSingleSelection()) {
							if((stateMask & SWT.CTRL) != 0 && isSelected(date)) {
								setSelection(null);
							} else {
								setSelection(date);
							}
						} else {
							if((stateMask & SWT.CTRL) != 0) {
								if(isSelected(date)) {
									deselect(date);
								} else {
									select(date);
								}
							} else if((stateMask & SWT.SHIFT) != 0 && hasSelection()) {
								select(getSelection(), date, Calendar.DATE, 1);
							} else {
								setSelection(date);
							}
						}
						fireSelectionChanged();
					}
					break;
				case SWT.Traverse:
					if(event.detail == SWT.TRAVERSE_RETURN) {
						fireSelectionChanged();
					} else {
						traverseSelection(event.keyCode);
					}
					break;
				}
			}
		};
		
		dayLabels = new VLabel[DAYS_IN_WEEK];
		for(int day = 0; day < dayLabels.length; day++) {
			dayLabels[day] = new VLabel(dayPanel, SWT.CENTER);
			dayLabels[day].setData(CDT.PickerPart, PickerPart.DayOfWeekLabel);
			dayLabels[day].setData(CDT.Key.Compact, b.compact);
			dayLabels[day].setData(CDT.Key.Index, day);
			dayLabels[day].setPainter(getPainter());
			getPainter().update(dayLabels[day]);
			dayLabels[day].setMargins(1, 1);
			dayLabels[day].setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		}

		VLabel sep = new VLabel(dayPanel, SWT.HORIZONTAL | SWT.SEPARATOR);
		sep.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 7, 1));

		dayButtons = new VButton[DAYS_IN_WEEK * NUM_ROWS];
		for(int day = 0; day < dayButtons.length; day++) {
			dayButtons[day] = new VButton(dayPanel, SWT.TOGGLE);
			dayButtons[day].setData(CDT.PickerPart, PickerPart.DayButton);
			dayButtons[day].setData(CDT.Key.Index, day);
			dayButtons[day].setPainter(getPainter());
			getPainter().update(dayButtons[day]);
			dayButtons[day].setSquare(true);
			dayButtons[day].setMargins(4, 4);
			dayButtons[day].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			dayButtons[day].addListener(SWT.KeyDown, dayListener);
			dayButtons[day].addListener(SWT.MouseDown, dayListener);
			dayButtons[day].addListener(SWT.MouseWheel, dayListener);
			dayButtons[day].addListener(SWT.Selection, dayListener);
			dayButtons[day].addListener(SWT.Traverse, dayListener);
		}
	}
	
	/**
	 * create the footer (footerButton) for the Calendar part of this CDateTime<br/>
	 * there is currently no footer for the Clock part - should there be?  or
	 * should this footer span both parts?
	 */
	private void createFooter() {
		footer = new VPanel(this, SWT.NONE);
		footer.setData(CDT.PickerPart, PickerPart.FooterPanel);
		footer.setPainter(getPainter());
		getPainter().update(footer);
		VGridLayout layout = new VGridLayout();
		layout.makeColumnsEqualWidth = builder.getFooterEqualColumns();
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		layout.marginHeight = 1;
		layout.marginWidth = 1;
		footer.setLayout(layout);
		footer.setLayoutData(new GridData(builder.getFooterAlignment(), SWT.FILL, true, false));
		
		for(Iterator<Footer> iter = builder.getFooters().iterator(); iter.hasNext(); ) {
			((VGridLayout) footer.getLayout()).numColumns++;
			Footer f = iter.next();
			switch(f.type) {
			case Footer.CLEAR:
				clear = new VButton(footer, SWT.PUSH | SWT.NO_FOCUS);
				clear.setData(CDT.PickerPart, PickerPart.ClearButton);
				clear.setPainter(getPainter());
				getPainter().update(clear);
				clear.setLayoutData(new GridData(f.alignment, SWT.FILL, f.grab, false));
				clear.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						deselectAll();
						if(event.widget == null) {
							fireSelectionChanged();
						}
					}
				});
				break;
			case Footer.TODAY:
			case Footer.VERBOSE_TODAY:
				today = new VButton(footer, SWT.PUSH | SWT.NO_FOCUS);
				today.setData(CDT.PickerPart, PickerPart.TodayButton);
				today.setPainter(getPainter());
				getPainter().update(today);
				today.setLayoutData(new GridData(f.alignment, SWT.FILL, f.grab, false));
				today.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						setSelection(new Date());
						if(event.widget == null) {
							fireSelectionChanged();
						}
					}
				});
				break;
			}
		}
	}
	
	/**
	 * create the header for the Calendar part of this CDateTime<br/>
	 * there is no equivalent for the Clock part
	 */
	private void createHeader() {
		header = new VPanel(this, SWT.NONE);
		header.setData(CDT.PickerPart, PickerPart.HeaderPanel);
		header.setPainter(getPainter());
		getPainter().update(header);
		VGridLayout layout = new VGridLayout();
		layout.makeColumnsEqualWidth = builder.getHeaderEqualColumns();
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		layout.marginHeight = 2;
		layout.marginWidth = 2;
		header.setLayout(layout);
		header.setLayoutData(new GridData(builder.getHeaderAlignment(), SWT.FILL, true, false));

		GridData data;
		
		for(Iterator<Header> iter = builder.getHeaders().iterator(); iter.hasNext(); ) {
			((VGridLayout) header.getLayout()).numColumns++;
			Header h = iter.next();
			data = new GridData(h.alignment, SWT.FILL, h.grab, false);
			switch(h.type) {
			case Header.DATE_NOW:
				dateNow = new VButton(header, SWT.PUSH | SWT.NO_FOCUS);
				dateNow.setData(CDT.PickerPart, PickerPart.DateNow);
				dateNow.setPainter(getPainter());
				getPainter().update(dateNow);
				dateNow.setMargins(4, 0);
				dateNow.setPolygon(new int[] { 7,7 });
				dateNow.setLayoutData(data);
				dateNow.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						setSelection(new Date());
						if(event.widget == null) {
							fireSelectionChanged();
						}
					}
				});
				break;
			case Header.MONTH:
				monthButton = new VButton(header, SWT.TOGGLE | SWT.NO_FOCUS);
				monthButton.setData(CDT.PickerPart, PickerPart.MonthLabel);
				monthButton.setPainter(getPainter());
				getPainter().update(monthButton);
				monthButton.setAlignment(h.textAlignment, SWT.CENTER);
				monthButton.setLayoutData(data);
				if(h.readOnly) {
					monthButton.setPaintNative(false);
				} else {
					if(CDT.gtk) {
						monthButton.addListener(SWT.MouseWheel, new Listener() {
							public void handleEvent(Event event) {
								if(SWT.MouseWheel == event.type) {
									Calendar tmpcal = getCalendarInstance();
									tmpcal.add(Calendar.MONTH, (event.count > 0) ? 1 : -1);
									setTime(tmpcal.getTime());
								}
							}
						});
					}
					monthButton.addListener(SWT.Selection, new Listener() {
						public void handleEvent(Event event) {
							handleHeaderSelection((VButton) event.data);
						}
					});
			
					Menu monthMenu = monthButton.createMenu();
					monthItems = new MenuItem[12];
					for(int i = 0; i < 12; i++) {
						Calendar tmpcal = getCalendarInstance();
						tmpcal.set(Calendar.MONTH, i);
						monthItems[i] = new MenuItem(monthMenu, SWT.NONE);
						monthItems[i].setData("Month", new Integer(tmpcal.get(Calendar.MONTH))); //$NON-NLS-1$
						monthItems[i].addSelectionListener(new SelectionAdapter() {
							public void widgetSelected(SelectionEvent e) {
								MenuItem item = (MenuItem) e.widget;
								Calendar tmpcal = getCalendarInstance();
								tmpcal.set(Calendar.MONTH, ((Integer) item.getData("Month")).intValue()); //$NON-NLS-1$
								setTime(tmpcal.getTime());
							}
						});
					}
				}
				break;
			case Header.MONTH_NEXT:
				monthNext = new VButton(header, SWT.ARROW | SWT.RIGHT | SWT.NO_FOCUS);
				monthNext.setData(CDT.PickerPart, PickerPart.MonthNext);
				monthNext.setPainter(getPainter());
				getPainter().update(monthNext);
				monthNext.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
				monthNext.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						Calendar tmpcal = getCalendarInstance();
						if(yearNext == null && yearButton != null && yearButton.getSelection()) {
							tmpcal.add(Calendar.YEAR, 1);
						} else {
							tmpcal.add(Calendar.MONTH, 1);
						}
						setTime(tmpcal.getTime());
					}
				});
				break;
			case Header.MONTH_PREV:
				monthPrev = new VButton(header, SWT.ARROW | SWT.LEFT | SWT.NO_FOCUS);
				monthPrev.setData(CDT.PickerPart, PickerPart.MonthPrev);
				monthPrev.setPainter(getPainter());
				getPainter().update(monthPrev);
				monthPrev.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
				monthPrev.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						Calendar tmpcal = getCalendarInstance();
						if(yearPrev == null && yearButton != null && yearButton.getSelection()) {
							tmpcal.add(Calendar.YEAR, -1);
						} else {
							tmpcal.add(Calendar.MONTH, -1);
						}
						setTime(tmpcal.getTime());
					}
				});
				break;
			case Header.TIME:
				timeButton = new VButton(header, SWT.TOGGLE | SWT.NO_FOCUS);
				timeButton.setMargins(3, 5);
				timeButton.setImage(Resources.getIconClock());
				timeButton.setData(CDT.PickerPart, PickerPart.MonthPrev);
				timeButton.setPainter(getPainter());
				getPainter().update(timeButton);
				timeButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
				timeButton.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						handleHeaderSelection((VButton) event.data);
					}
				});
				break;
			case Header.YEAR:
				yearButton = new VButton(header, SWT.TOGGLE | SWT.NO_FOCUS);
				yearButton.setData(CDT.PickerPart, PickerPart.YearLabel);
				yearButton.setPainter(getPainter());
				getPainter().update(yearButton);
				yearButton.setAlignment(h.textAlignment, SWT.CENTER);
				yearButton.setLayoutData(data);
				if(h.readOnly) {
					yearButton.setPaintNative(false);
				} else {
					if(CDT.gtk) {
						yearButton.addListener(SWT.MouseWheel, new Listener() {
							public void handleEvent(Event event) {
								if(SWT.MouseWheel == event.type) {
									Calendar tmpcal = getCalendarInstance();
									tmpcal.add(Calendar.YEAR, (event.count > 0) ? 1 : -1);
									setTime(tmpcal.getTime());
								}
							}
						});
					}
					yearButton.addListener(SWT.Selection, new Listener() {
						public void handleEvent(Event event) {
							handleHeaderSelection((VButton) event.data);
						}
					});
	
					Menu yearMenu = yearButton.createMenu();
					yearItems = new MenuItem[11];
					for(int i = 0; i < 11; i++) {
						yearItems[i] = new MenuItem(yearMenu, SWT.NONE);
						yearItems[i].setData("Year", new Integer(i)); //$NON-NLS-1$
						yearItems[i].addSelectionListener(new SelectionAdapter() {
							public void widgetSelected(SelectionEvent e) {
								MenuItem item = (MenuItem) e.widget;
								Calendar tmpcal = getCalendarInstance();
								tmpcal.add(Calendar.YEAR, ((Integer) item.getData("Year")).intValue() - 5); //$NON-NLS-1$
								setTime(tmpcal.getTime());
							}
						});
					}
				}
				break;
			case Header.YEAR_NEXT:
				yearNext = new VButton(header, SWT.ARROW | SWT.RIGHT | SWT.NO_FOCUS);
				yearNext.setData(CDT.PickerPart, PickerPart.YearNext);
				yearNext.setPainter(getPainter());
				getPainter().update(yearNext);
				yearNext.setLayoutData(data);
				yearNext.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						Calendar tmpcal = getCalendarInstance();
						tmpcal.add(Calendar.YEAR, 1);
						setTime(tmpcal.getTime());
					}
				});
				break;
			case Header.YEAR_PREV:
				yearPrev = new VButton(header, SWT.ARROW | SWT.LEFT | SWT.NO_FOCUS);
				yearPrev.setData(CDT.PickerPart, PickerPart.YearPrev);
				yearPrev.setPainter(getPainter());
				getPainter().update(yearPrev);
				yearPrev.setLayoutData(data);
				yearPrev.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						Calendar tmpcal = getCalendarInstance();
						tmpcal.add(Calendar.YEAR, -1);
						setTime(tmpcal.getTime());
					}
				});
				break;
			}
		}

	}

	private void createMonths(Body b) {
		VPanel bodyPanel = bodyPanels[bodyPanels.length-1];

		monthPanel = new VPanel(bodyPanel, SWT.NONE);
		monthPanel.setData(CDT.PickerPart, PickerPart.DayOfWeekPanel);
		monthPanel.setPainter(getPainter());
		getPainter().update(monthPanel);
		VGridLayout layout = new VGridLayout(3, true);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.horizontalSpacing = b.spacing;
		layout.verticalSpacing = b.spacing;
		monthPanel.setLayout(layout);

		bodyPanel.getLayout(VStackLayout.class).setDefault(monthPanel, false);
		
		monthButtons = new VButton[12];
		for(int month = 0; month < monthButtons.length; month++) {
			monthButtons[month] = new VButton(monthPanel, SWT.PUSH | SWT.NO_FOCUS);
			monthButtons[month].setSquare(true);
			monthButtons[month].setData("month", month);
			monthButtons[month].setData(CDT.PickerPart, PickerPart.DayOfWeekLabel);
			monthButtons[month].setData(CDT.Key.Index, month);
			monthButtons[month].setPainter(getPainter());
			getPainter().update(monthButtons[month]);
			monthButtons[month].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			monthButtons[month].addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					VButton button = (VButton) event.data;
					Calendar tmpcal = getCalendarInstance();
					tmpcal.set(Calendar.MONTH, (Integer) button.getData("Month")); //$NON-NLS-1$
					setTime(tmpcal.getTime());
					handleHeaderSelection(null);
				}
			});
		}

		updateMonths();
		
		if(monthButton != null) {
			monthButton.setData(Key.Panel, monthPanel);
		}
	}
	
	private void createTime(Body b) {
		VPanel bodyPanel = bodyPanels[bodyPanels.length-1];

		timePanel = new AnalogTimePicker(this, SWT.NONE);
		timePanel.setParent(bodyPanel);
		
		bodyPanel.getLayout(VStackLayout.class).setDefault(timePanel, false);

		if(timeButton != null) {
			timeButton.setData(Key.Panel, timePanel);

			GridData data = new GridData();
			data.exclude = true;

			digitalTime = VNative.create(CDateTime.class, header, CDT.TEXT_RIGHT);
			digitalTime.setBackground(header.getBackground());
			digitalTime.setVisible(false);
			digitalTime.setLayoutData(data);
			digitalTime.getControl().addSelectionListener(new SelectionListener() {
				public void widgetDefaultSelected(SelectionEvent event) {
					setSelection(digitalTime.getControl().getSelection());
					if(event.widget == null) {
						fireSelectionChanged();
					}
				}
				public void widgetSelected(SelectionEvent e) {
					setSelection(digitalTime.getControl().getSelection());
				}
			});

			timeButton.addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					if(timeButton.getSelection()) {
						digitalTime.getControl().setPattern(timePanel.pattern);
						digitalTime.getControl().setSelection(getSelection());
						Rectangle hBounds = header.getBounds();
						Rectangle tBounds = timeButton.getBounds();
						digitalTime.setBounds(hBounds.x+1, hBounds.y+2, tBounds.x-hBounds.x, hBounds.height-2);
						digitalTime.setVisible(true);
					} else {
						digitalTime.setVisible(false);
					}
				}
			});

			final Listener dl = new Listener() {
				public void handleEvent(Event event) {
					digitalTime.getControl().setSelection(getSelection());
				}
			};
			
			digitalTime.addListener(SWT.Dispose, new Listener() {
				public void handleEvent(Event event) {
					getCDateTime().removeListener(SWT.Selection, dl);
				}
			});

			getCDateTime().addListener(SWT.Selection, dl);
		}
	}

	private void createYears(Body b) {
		VPanel bodyPanel = bodyPanels[bodyPanels.length-1];
		
		yearPanel = new VPanel(bodyPanel, SWT.NONE);
		yearPanel.setData(CDT.PickerPart, PickerPart.DayOfWeekPanel);
		yearPanel.setPainter(getPainter());
		getPainter().update(yearPanel);
		VGridLayout layout = new VGridLayout(3, true);
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.horizontalSpacing = b.spacing;
		layout.verticalSpacing = b.spacing;
		yearPanel.setLayout(layout);

		bodyPanel.getLayout(VStackLayout.class).setDefault(yearPanel, false);

		yearButtons = new VButton[15];
		for(int year = 0; year < yearButtons.length; year++) {
			yearButtons[year] = new VButton(yearPanel, SWT.PUSH | SWT.NO_FOCUS);
			yearButtons[year].setSquare(true);
			yearButtons[year].setData(CDT.PickerPart, PickerPart.DayOfWeekLabel);
			yearButtons[year].setData(CDT.Key.Index, year);
			yearButtons[year].setPainter(getPainter());
			getPainter().update(yearButtons[year]);
			yearButtons[year].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			yearButtons[year].addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					VButton button = (VButton) event.data;
					Calendar tmpcal = getCalendarInstance();
					tmpcal.set(Calendar.YEAR, Integer.parseInt(button.getText()));
					setTime(tmpcal.getTime());
					handleHeaderSelection(null);
				}
			});
		}
		
		if(yearButton != null) {
			yearButton.setData(Key.Panel, yearPanel);
		}
	}

	public int[] getFields() {
		return new int[] { 
				Calendar.YEAR, 
				Calendar.MONTH,
				Calendar.DAY_OF_MONTH 
			};
	}

	@Override
	public PickerType getPickerType() {
		return PickerType.Date;
	}
	
	private void init(int style) {
		if(builder == null) {
			if((style & CDT.COMPACT) != 0) {
				builder = CDateTimeBuilder.getCompact();
			} else {
				builder = CDateTimeBuilder.getStandard();
			}
		}
	}

	/**
	 * Scroll the Calendar's visible days just as a user would with the keyboard.
	 * <dt><b>Valid Keys:</b></dt>
	 * <dd>SWT.ARROW_UP, SWT.ARROW_DOWN, SWT.END, SWT.HOME, SWT.PAGE_DOWN, SWT.PAGE_UP</dd>
	 * @param keycode a SWT keycode
	 * @see #traverseSelection(int)
	 */
	void scrollCalendar(int keycode) {
		scrollCalendar(keycode, false);
	}
	
	/**
	 * perform the scroll by making a call to  {@link #adjustDays(int, int)} with the
	 * <code>field</code> set to Calendar.DATE and the <code>amount</code> 
	 * corresponding to the keycode.
	 */
	private void scrollCalendar(int keycode, boolean notify) {
		if(scrollable) {
			boolean update = false;
			switch (keycode) {
			case SWT.ARROW_DOWN:
				adjustDays(Calendar.DATE, 7);
				update = true;
				break;
			case SWT.ARROW_UP:
				adjustDays(Calendar.DATE, -7);
				update = true;
				break;
			case SWT.END:
				adjustDays(Calendar.DATE, 52*7);
				update = true;
				break;
			case SWT.HOME:
				adjustDays(Calendar.DATE, -52*7);
				update = true;
				break;
			case SWT.PAGE_DOWN:
				adjustDays(Calendar.DATE, 4*7);
				update = true;
				break;
			case SWT.PAGE_UP:
				adjustDays(Calendar.DATE, -4*7);
				update = true;
				break;
			}
			
			if(update) {
				updateHeader();
				updateDays();
			}
		}
	}

	/**
	 * Set the date for each dayButton by starting with the given <code>firstDate</code>
	 * and iterating over all the dayButtons, adding 1 day to the date with each iteration.<br>
	 * The date is stored in the dayButton with: setData(CDT.Key.Date, date).<br>
	 * If <code>alignMonth</code> is true, then the actual first date used will be modified
	 * to be the first date of the visible calendar which includes the given 
	 * <code>firstDate</code>
	 * @param firstDate the first date of the dayButtons
	 * @param alignMonth whether or not to align the month
	 */
	private void setDays(Date firstDate, boolean alignMonth) {
		Calendar tmpcal = getCalendarInstance();
		tmpcal.setTime(firstDate);

		if(alignMonth) {
			tmpcal.set(Calendar.DATE, 1);
			int firstDay = tmpcal.get(Calendar.DAY_OF_WEEK) - tmpcal.getFirstDayOfWeek();
			if(firstDay < 0) {
				firstDay += 7;
			}
			tmpcal.add(Calendar.DATE, -firstDay);
		}
		
		for(int day = 0; day < dayButtons.length; day++) {
			dayButtons[day].setData(CDT.Key.Date, tmpcal.getTime());
			tmpcal.add(Calendar.DATE, 1);
		}
	}
	
	public void setFields(int[] calendarFields) {
		super.setFields(calendarFields);

		createContents();
		updateLabels();

		if(monthButton != null) {
			monthButton.addListener(SWT.Resize, new Listener() {
				public void handleEvent(Event event) {
					if(SWT.Resize == event.type) {
						setMonthLabelText();
					}
				}
			});
		}
		
		if(timePanel != null) {
			timePanel.setFields(calendarFields);
		}
	}

	@Override
	public boolean setFocus() {
		if(dayPanel != null && hasSelection()) {
			Calendar first = getCalendarInstance((Date) dayButtons[0].getData(CDT.Key.Date));
			first.set(Calendar.MILLISECOND, 0);
			first.set(Calendar.SECOND, 0);
			first.set(Calendar.MINUTE, 0);
			first.set(Calendar.HOUR_OF_DAY, 0);
			
			Calendar last = getCalendarInstance((Date) dayButtons[dayButtons.length-1].getData(CDT.Key.Date));
			last.set(Calendar.MILLISECOND, 0);
			last.set(Calendar.SECOND, 0);
			last.set(Calendar.MINUTE, 0);
			last.set(Calendar.HOUR_OF_DAY, 0);
			last.add(Calendar.DATE, 1);
			last.add(Calendar.MILLISECOND, -1);
	
			Date[] selection = getSelectedDates();
			Arrays.sort(selection, dayComparator);
			for(int i = 0; i < selection.length; i++) {
				if(selection[i].after(first.getTime()) && selection[i].before(last.getTime())) {
					Calendar scal = getCalendarInstance(selection[i]);
					for(int j = 0; j < dayButtons.length; j++) {
						Calendar tmpcal = getCalendarInstance((Date) dayButtons[j].getData(CDT.Key.Date));
						if((scal.get(Calendar.DATE) == tmpcal.get(Calendar.DATE)) &&
								(scal.get(Calendar.MONTH) == tmpcal.get(Calendar.MONTH)) &&
								(scal.get(Calendar.YEAR) == tmpcal.get(Calendar.YEAR)) ) {
							return dayButtons[j].setFocus();
						}
					}
				}
			}
		}
		return super.setFocus();
	}

	private void handleHeaderSelection(VButton button) {
		if(monthButton != null && monthButton != button) {
			monthButton.setSelection(false);
		}
		if(yearButton != null && yearButton != button) {
			yearButton.setSelection(false);
		}
		if(timeButton != null && timeButton != button) {
			timeButton.setSelection(false);
		}
		
		if(button != null && button.getSelection()) {
			VPanel panel = button.getData(Key.Panel, VPanel.class);
			panel.getParent().getLayout(VStackLayout.class).setTopControl(panel, 500);
		} else {
			for(VPanel panel : bodyPanels) {
				panel.getLayout(VStackLayout.class).setTopControl(null, 500);
			}
		}
	}

	void setMonthLabelText() {
		String str = getFormattedSelection("MMMM");
		GC gc = new GC(getDisplay());
		int width = monthButton.getClientArea().width;
		if(width > 0 && gc.stringExtent(str).x >= width) {
			str = getFormattedSelection("MMM");
		}
		gc.dispose();
		monthButton.setText(str);
	}

	public void setScrollable(boolean scrollable) {
		this.scrollable = scrollable;
	}
	
	private void setSelectionByFocusButton(int focusButton) {
		if(focusButton >= 0 && focusButton < dayButtons.length) {
			VButton button = dayButtons[focusButton];
			setSelection((Date) button.getData(CDT.Key.Date));
			button.setFocus();
		}
	}
    
	private int getFocusDayButton() {
		VControl focusControl = VTracker.getFocusControl();
		if(focusControl != null) {
			for(int i = 0; i < dayButtons.length; i++) {
				if(focusControl == dayButtons[i]) {
					return i;
				}
			}
		}
		return -1;
	}
	
	/**
	 * Traverse the selection programmatically just as a user would with the keyboard.
	 * <dt><b>Valid Keys:</b></dt>
	 * <dd>SWT.ARROW_UP, SWT.ARROW_DOWN, SWT.ARROW_LEFT, SWT.ARROW_RIGHT</dd>
	 * @param keyCode a SWT traversal keycode
	 * @see #scrollCalendar(int)
	 */
	void traverseSelection(int keyCode) {
		int focusDayButton = getFocusDayButton();
		switch (keyCode) {
		case SWT.ARROW_UP:
			if(focusDayButton > DAYS_IN_WEEK) {
				setSelectionByFocusButton(focusDayButton - DAYS_IN_WEEK);
			} else {
				scrollCalendar(SWT.ARROW_UP);
				setSelectionByFocusButton(focusDayButton);
			}
			break;
		case SWT.ARROW_DOWN:
			if(focusDayButton < DAYS_IN_WEEK * (NUM_ROWS-1)) {
				setSelectionByFocusButton(focusDayButton + DAYS_IN_WEEK);
			} else {
				scrollCalendar(SWT.ARROW_DOWN);
			}
			break;
		case SWT.ARROW_LEFT:
			if(focusDayButton > 0) {
				setSelectionByFocusButton(focusDayButton - 1);
			} else {
				scrollCalendar(SWT.ARROW_UP);
				setSelectionByFocusButton(focusDayButton + (DAYS_IN_WEEK-1));
			}
			break;
		case SWT.ARROW_RIGHT:
			if(focusDayButton < (DAYS_IN_WEEK * NUM_ROWS - 1)) {
				setSelectionByFocusButton(focusDayButton + 1);
			} else {
				scrollCalendar(SWT.ARROW_DOWN);
				setSelectionByFocusButton(focusDayButton - (DAYS_IN_WEEK-1));
			}
		}
	}
	
	/**
	 * set / update the text and font color of the <code>dayButton</code>s.
	 */
	private void updateDays() {
		if(dayPanel != null) {
			Calendar date = getCalendarInstance();
			Calendar active = getCalendarInstance();
			Calendar today = getCalendarInstance(new Date());
			for(int day = 0; day < dayButtons.length; day++) {
				if((dayButtons[day] != null)) {
					date.setTime((Date) dayButtons[day].getData(CDT.Key.Date));
	
					boolean isToday = (date.get(Calendar.YEAR) == today.get(Calendar.YEAR)) && (date.get(Calendar.DAY_OF_YEAR) == today.get(Calendar.DAY_OF_YEAR));
					boolean isActive = (date.get(Calendar.YEAR) == active.get(Calendar.YEAR)) && (date.get(Calendar.MONTH) == active.get(Calendar.MONTH));
					
					dayButtons[day].setText(getFormattedDate("d", date.getTime()));
					dayButtons[day].setData(CDT.Key.Today, isToday);
					dayButtons[day].setData(CDT.Key.Active, isActive);
					
					getPainter().update(dayButtons[day]);
				}
			}

//			int focusButton = -1;

			for(int i = 0; i < dayButtons.length; i++) {
				dayButtons[i].setSelection(false);
			}

			if(hasSelection()) {
				Calendar first = getCalendarInstance((Date) dayButtons[0].getData(CDT.Key.Date));
				first.set(Calendar.MILLISECOND, 0);
				first.set(Calendar.SECOND, 0);
				first.set(Calendar.MINUTE, 0);
				first.set(Calendar.HOUR_OF_DAY, 0);
				
				Calendar last = getCalendarInstance((Date) dayButtons[dayButtons.length-1].getData(CDT.Key.Date));
				last.set(Calendar.MILLISECOND, 0);
				last.set(Calendar.SECOND, 0);
				last.set(Calendar.MINUTE, 0);
				last.set(Calendar.HOUR_OF_DAY, 0);
				last.add(Calendar.DATE, 1);
				last.add(Calendar.MILLISECOND, -1);
		
				Date[] selection = getSelectedDates();
				for(int i = 0; i < selection.length; i++) {
					if(selection[i].after(first.getTime()) && selection[i].before(last.getTime())) {
						Calendar scal = getCalendarInstance(selection[i]);
						for(int j = 0; j < dayButtons.length; j++) {
							Calendar tmpcal = getCalendarInstance((Date) dayButtons[j].getData(CDT.Key.Date));
							if((scal.get(Calendar.DATE) == tmpcal.get(Calendar.DATE)) &&
									(scal.get(Calendar.MONTH) == tmpcal.get(Calendar.MONTH)) &&
									(scal.get(Calendar.YEAR) == tmpcal.get(Calendar.YEAR)) ) {
								dayButtons[j].setSelection(true);
								if(selection.length == 1) {
//									focusButton = j;
									break;
								}
							}
						}
					}
				}
//				if(focusButton >= 0) {
//					focusDayButton = focusButton;
//					dayButtons[focusDayButton].setFocus();
//				} else {
//					setFocus();
//				}
			}
			
			dayPanel.redraw();
		}
	}

	/**
	 * set / update the text of the displayLabels.  these are the Week 
	 * column headers above the days on the Calendar part of the <code>CDateTime</code>.
	 */
	private void updateDaysOfWeek() {
		if(dayPanel != null) {
			Calendar tmpcal = getCalendarInstance();
			tmpcal.set(Calendar.DAY_OF_WEEK, tmpcal.getFirstDayOfWeek());
			Locale locale = getLocale();
			boolean ltr = (ComponentOrientation.getOrientation(locale).isLeftToRight() &&
					!locale.getLanguage().equals("zh")); //$NON-NLS-1$
			BreakIterator iterator = BreakIterator.getCharacterInstance(locale);
			for(int x = 0; x < dayLabels.length; x++) {
				String str = getFormattedDate("E", tmpcal.getTime());
				if(dayLabels[x].getData(CDT.Key.Compact, Boolean.class)) {
					iterator.setText(str);
					int start, end;
					if(ltr) {
						start = iterator.first();
						end = iterator.next();
					} else {
						end = iterator.last();
						start = iterator.previous();
					}
					dayLabels[x].setText(str.substring(start, end));
				} else {
					dayLabels[x].setText(str);
				}
				tmpcal.add(Calendar.DAY_OF_WEEK, 1);
			}
		}
	}

	/**
	 * set / update the text of the <code>footerButton</code>.
	 */
	private void updateFooter() {
		if(footer != null) {
			Locale locale = getLocale();
			if(today != null) {
				if(builder.hasFooter(Footer.VERBOSE_TODAY)) {
					Calendar cal = getCalendarInstance(new Date());
					Object[] margs = {
							cal.getTime(),
							Resources.getString("date_ordinal_" + cal.get(Calendar.DATE), locale) //$NON-NLS-1$
						};
					MessageFormat formatter = new MessageFormat(Resources.getString("today_verbose.text", locale), locale); //$NON-NLS-1$
					today.setText(formatter.format(margs));
				} else {
					today.setText(Resources.getString("today.text", locale)); //$NON-NLS-1$
				}
			}
			if(clear != null) {
				clear.setText(Resources.getString("clear.text", locale)); //$NON-NLS-1$
			}
			footer.layout();
		}
	}

	/**
	 * set / update the text of the header - <code>monthLabel</code>, <code>yearLabel</code>,
	 * and the <code>monthLabel</code> context menu.
	 */
	private void updateHeader() {
		if(header != null) {
			Calendar selected = getCalendarInstance();

			if(monthButton != null) {
				setMonthLabelText();
			}
			
			if(monthItems != null) {
				Calendar tmpcal = getCalendarInstance();
				for(int i = 0; i < 12; i++) {
					tmpcal.set(Calendar.MONTH, i);
					monthItems[i].setText(getFormattedDate("MMMM", tmpcal.getTime()));
					monthItems[i].setData("Month", new Integer(tmpcal.get(Calendar.MONTH)));//$NON-NLS-1$
					if(selected.get(Calendar.MONDAY) == tmpcal.get(Calendar.MONTH)) {
						monthItems[i].setImage(Resources.getIconBullet());
					} else {
						monthItems[i].setImage(null);
					}
				}
			}

			if(yearButton != null) {
				yearButton.setText(getFormattedSelection("yyyy"));
			}

			if(yearItems != null) {
				Calendar tmpcal = getCalendarInstance();
				tmpcal.add(Calendar.YEAR, -5);
				for(int i = 0; i < 11; i++) {
					yearItems[i].setText(getFormattedDate("yyyy", tmpcal.getTime()));
					if(selected.get(Calendar.YEAR) == tmpcal.get(Calendar.YEAR)) {
						yearItems[i].setImage(Resources.getIconBullet());
					} else {
						yearItems[i].setImage(null);
					}
					tmpcal.add(Calendar.YEAR, 1);
				}
			}
			
			header.layout();
		}
	}

	protected void updateLabels() {
		updateLocale();
		if(dayButtons != null) {
			setDays(new Date(getTimeInMillis()), true);
			updateDays();
		}
		updateHeader();
		updateMonths();
		updateYears();
		if(dayLabels != null) {
			updateDaysOfWeek();
		}
		updateFooter();
	}

	/**
	 * set / update, or calls methods to set / update, all components affected by the <code>locale</code>
	 * @see #updateHeader
	 * @see #updateDayLabels
	 * @see #updateDays
	 * @see #updateFooter
	 */
	private void updateLocale() {
		Locale locale = getLocale();
		if(monthPrev != null) 		monthPrev.setToolTipText(Resources.getString("nav_prev_month", locale));	//$NON-NLS-1$
		if(monthNext != null) 		monthNext.setToolTipText(Resources.getString("nav_next_month", locale));	//$NON-NLS-1$
		if(dateNow != null) 		dateNow.setToolTipText(Resources.getString("nav_current_day", locale));		//$NON-NLS-1$
		if(yearPrev != null) 		yearPrev.setToolTipText(Resources.getString("nav_prev_year", locale));		//$NON-NLS-1$
		if(yearNext != null) 		yearNext.setToolTipText(Resources.getString("nav_next_year", locale));		//$NON-NLS-1$
		if(today != null) 			today.setToolTipText(Resources.getString("nav_current_day", locale));		//$NON-NLS-1$
		if(daysMenuItem != null) 		daysMenuItem.setText(Resources.getString("nav_current_day", locale));	//$NON-NLS-1$
	}
	
	private void updateMonths() {
		if(monthPanel != null) {
			Calendar tmpcal = getCalendarInstance();
			for(int i = 0; i < 12; i++) {
				tmpcal.set(Calendar.MONTH, i);
				monthButtons[i].setText(getFormattedDate("MMM", tmpcal.getTime()));
				monthButtons[i].setData("Month", new Integer(tmpcal.get(Calendar.MONTH)));//$NON-NLS-1$
			}
		}
	}

	protected void updateView() {
		updateHeader();
		if(dayPanel != null) {
			setDays(getTime(), true);
			updateDays();
		}
		updateMonths();
		updateYears();
		if(timePanel != null) {
			timePanel.updateView();
		}
		updateFooter();
	}

	private void updateYears() {
		if(yearPanel != null) {
			Calendar tmpcal = getCalendarInstance();
			tmpcal.add(Calendar.YEAR, -7);
			for(int i = 0; i < yearButtons.length; i++) {
				yearButtons[i].setText(getFormattedDate("yyyy", tmpcal.getTime()));
				tmpcal.add(Calendar.YEAR, 1);
			}
		}
	}
	
}