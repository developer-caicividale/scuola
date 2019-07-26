/****************************************************************************
 * Copyright (c) 2008 Jeremy Dowdall
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jeremy Dowdall <jeremyd@aspencloud.com> - initial API and implementation
 *****************************************************************************/

package org.aspencloud.ccalendar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.aspencloud.ccalendar.util.TimeSpan;
import org.aspencloud.cdatetime.Body;
import org.aspencloud.cdatetime.CDateTime;
import org.aspencloud.cdatetime.CDateTimeBuilder;
import org.aspencloud.v.VButton;
import org.aspencloud.v.VControl;
import org.aspencloud.v.VGridLayout;
import org.aspencloud.v.VLabel;
import org.aspencloud.v.VPanel;
import org.aspencloud.v.VPanelPainter;
import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.printing.Printer;
import org.eclipse.swt.printing.PrinterData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public class CCalendar extends Composite implements ISelectionProvider {

    private static final int DAYS_IN_WEEK = 7;
    private static final int NUM_ROWS = 6;

    Composite header;
    Composite body;
    VPanel dayOfWeekPanel;
    VPanel dayPanel;

    CCalendarItemBuilder builder;
    private Map<Object, TimeSpan> elements;

    private List<CCalendarDayItem> items;
    private List<CCalendarDayItem> selection;

    private Date date;
    private Locale locale;
    private TimeZone timezone;
    private SimpleDateFormat sdf;
    private String lastPattern;

    private VButton monthPrev;
    private VButton calendarNow;
    private VButton monthNext;

    private CDateTime monthCdt;
    private CDateTime yearCdt;

    private VLabel dayLabels[];
    private CCalendarDay days[];

    private List<Object> selectionListeners;

    public CCalendar(Composite parent, int style) {
	super(parent, style);

	locale = Locale.getDefault();
	try {
	    timezone = TimeZone.getDefault();
	} catch (Exception e) {
	    timezone = TimeZone.getTimeZone("GMT");
	}

	elements = new HashMap<Object, TimeSpan>();
	items = new ArrayList<CCalendarDayItem>();
	selection = new ArrayList<CCalendarDayItem>();
	selectionListeners = new ArrayList<Object>();

	createContents();

	setDate(new Date());
	updateDayLabels();
    }

    void addItem(CCalendarDayItem item) {
	items.add(item);
    }

    void removeItem(CCalendarDayItem item) {
	items.remove(item);
	selection.remove(item);
    }

    public void setItemBuilder(CCalendarItemBuilder builder) {
	this.builder = builder;
	this.builder.setParent(this);
    }

    public void setItems(Object[] items) {
	Assert.isNotNull(builder, "Must set a CCalendarItemBuilder before adding or setting items (see setItemBuilder)");
	if (items == null) {
	    items = new Object[0];
	}
	elements.clear();
	elements = new HashMap<Object, TimeSpan>();
	for (Object item : items) {
	    elements.put(item, builder.getTimeSpan(item));
	}
	for (CCalendarDay day : days) {
	    day.setItems(elements);
	}
    }

    void select(CCalendarDayItem item, int button, int stateMask) {
	if ((stateMask & SWT.CTRL) == 0) {
	    for (Object sel : selection.toArray()) {
		if (sel != item) {
		    deselect((CCalendarDayItem) sel);
		}
	    }
	}
	if (!selection.contains(item)) {
	    selection.add(item);
	    item.setSelection(true);
	} else if (button != 3 && (stateMask & SWT.CTRL) != 0) {
	    deselect(item);
	}

	SelectionChangedEvent event = new SelectionChangedEvent(this, new StructuredSelection(selection));
	for (Object listener : selectionListeners) {
	    ((ISelectionChangedListener) listener).selectionChanged(event);
	}
    }

    private void deselect(CCalendarDayItem item) {
	selection.remove(item);
	item.setSelection(false);
    }

    // public void deselectAll() {
    // for(CCalendarDayItem item : selection) {
    // item.setSelection(false);
    // }
    // selection.clear();
    // }

    public ISelection getSelection() {
	if (selection.isEmpty()) {
	    return new StructuredSelection();
	} else {
	    Object[] elements = new Object[selection.size()];
	    for (int i = 0; i < elements.length; i++) {
		elements[i] = selection.get(i).getData("element");
	    }
	    return new StructuredSelection(elements);
	}
    }

    private void createBody() {
	body = new Composite(this, SWT.NONE);
	GridLayout layout = new GridLayout();
	layout.marginHeight = 0;
	layout.marginWidth = 0;
	layout.verticalSpacing = 0;
	body.setLayout(layout);
	body.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

	dayOfWeekPanel = new VPanel(body, SWT.NONE);
	VGridLayout vlayout = new VGridLayout(7, true);
	vlayout.marginHeight = 0;
	vlayout.marginWidth = 0;
	vlayout.horizontalSpacing = 0;
	vlayout.verticalSpacing = 0;
	dayOfWeekPanel.setLayout(vlayout);
	dayOfWeekPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

	dayLabels = new VLabel[DAYS_IN_WEEK];
	for (int day = 0; day < dayLabels.length; day++) {
	    dayLabels[day] = new VLabel(dayOfWeekPanel, SWT.CENTER);
	    dayLabels[day].setMargins(0, 0);
	    dayLabels[day].setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	}

	dayPanel = new VPanel(body, SWT.NONE);
	dayPanel.getComposite().setBackground(getDisplay().getSystemColor(SWT.COLOR_WHITE));
	dayPanel.setForeground(getDisplay().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
	vlayout = new VGridLayout(7, true);
	vlayout.marginHeight = 1;
	vlayout.marginWidth = 1;
	vlayout.horizontalSpacing = 1;
	vlayout.verticalSpacing = 1;
	dayPanel.setLayout(vlayout);
	dayPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

	dayPanel.setPainter(new VPanelPainter() {
	    public void paintBackground(VControl control, Event e) {
		for (int i = 0; i < days.length; i++) {
		    e.gc.setForeground(control.getForeground());
		    CCalendarDay day = days[i];
		    Rectangle r = day.getBounds();
		    if (i < DAYS_IN_WEEK) {
			e.gc.drawLine(r.x, r.y - 1, r.x + r.width - 1, r.y - 1);
		    }
		    if (i < DAYS_IN_WEEK * (NUM_ROWS - 1)) {
			e.gc.drawLine(r.x, r.y + r.height, r.x + r.width - 1, r.y + r.height);
		    }
		    if (i % DAYS_IN_WEEK != 6) {
			if (i % DAYS_IN_WEEK == 0 || i % DAYS_IN_WEEK == 5) {
			    e.gc.setForeground(e.display.getSystemColor(SWT.COLOR_BLACK));
			    e.gc.drawLine(r.x + r.width, r.y - 1, r.x + r.width, r.y + r.height);
			} else {
			    e.gc.drawLine(r.x + r.width, r.y, r.x + r.width, r.y + r.height - 1);
			}
		    }
		}
	    }

	    @Override
	    public void paintBorders(VControl control, Event e) {
		control.setAlpha(e.gc, 100);
		e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_GRAY));
		for (int i = 0; i < days.length; i++) {
		    CCalendarDay day = days[i];
		    if (!day.activeMonth) {
			Rectangle r = day.getBounds();
			e.gc.fillRectangle(r);
		    }
		}
	    }
	});

	days = new CCalendarDay[DAYS_IN_WEEK * NUM_ROWS];
	for (int day = 0; day < days.length; day++) {
	    days[day] = new CCalendarDay(this, SWT.NONE);
	    days[day].setParent(dayPanel);
	    days[day].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	}
    }

    private void createContents() {
	GridLayout layout = new GridLayout();
	layout.marginWidth = 0;
	layout.marginHeight = 0;
	layout.verticalSpacing = 0;
	setLayout(layout);

	createHeader();

	// VLabel sep = new VLabel(this, SWT.HORIZONTAL | SWT.SEPARATOR);
	// sep.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

	createBody();
	// createFooter();
    }

    private void createHeader() {
	Composite headerContainer = new Composite(this, SWT.NONE);
	headerContainer.setLayout(new GridLayout(3, false));
	headerContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

	header = new Composite(headerContainer, SWT.NONE);
	header.setLayout(new GridLayout(2, false));
	header.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));

	VPanel toolsPanel = new VPanel(header, SWT.NONE);
	toolsPanel.setLayout(new VGridLayout(7, false));
	toolsPanel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

	monthPrev = new VButton(toolsPanel, SWT.ARROW | SWT.LEFT | SWT.NO_FOCUS);
	monthPrev.setFill(getDisplay().getSystemColor(SWT.COLOR_GRAY));
	monthPrev.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
	monthPrev.addListener(SWT.Selection, new Listener() {
	    public void handleEvent(Event event) {
		Calendar tmpcal = getCalendarInstance();
		tmpcal.add(Calendar.MONTH, -1);
		setDate(tmpcal.getTime());
	    }
	});

	calendarNow = new VButton(toolsPanel, SWT.NONE);
	calendarNow.setMargins(4, 0);
	calendarNow.setPolygon(new int[] { 7, 7 }, getDisplay().getSystemColor(SWT.COLOR_GRAY));
	calendarNow.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
	calendarNow.addListener(SWT.Selection, new Listener() {
	    public void handleEvent(Event event) {
		setDate(new Date());
	    }
	});

	monthNext = new VButton(toolsPanel, SWT.ARROW | SWT.RIGHT);
	monthNext.setFill(getDisplay().getSystemColor(SWT.COLOR_GRAY));
	monthNext.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
	monthNext.addListener(SWT.Selection, new Listener() {
	    public void handleEvent(Event event) {
		Calendar tmpcal = getCalendarInstance();
		tmpcal.add(Calendar.MONTH, 1);
		setDate(tmpcal.getTime());
	    }
	});

	Composite topHeader = new Composite(headerContainer, SWT.NONE);
	topHeader.setLayout(new GridLayout(1, false));
	topHeader.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

	monthCdt = new CDateTime(topHeader, SWT.BORDER);
	monthCdt.setButtonText("mmmm");
	CDateTimeBuilder builder = new CDateTimeBuilder();
	builder.setBody(Body.Months());
	monthCdt.setBuilder(builder);
	monthCdt.setPattern("MMMM");
	monthCdt.setButtonImage(null);
	monthCdt.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
	monthCdt.addSelectionListener(new SelectionAdapter() {
	    public void widgetSelected(SelectionEvent e) {
		Calendar tmpcal = getCalendarInstance();
		tmpcal.set(Calendar.MONTH, monthCdt.getCalendarInstance().get(Calendar.MONTH));
		setDate(tmpcal.getTime());
		updateHeader();
	    }
	});

	yearCdt = new CDateTime(headerContainer, SWT.BORDER);
	yearCdt.setButtonText("aaaaaa");
	yearCdt.setSelection(new Date());
	builder = new CDateTimeBuilder();
	builder.setBody(Body.Years());
	yearCdt.setBuilder(builder);
	yearCdt.setPattern("yyyy");
	yearCdt.setButtonImage(null);
	yearCdt.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
	yearCdt.addSelectionListener(new SelectionAdapter() {
	    public void widgetSelected(SelectionEvent e) {
		Calendar tmpcal = getCalendarInstance();
		tmpcal.set(Calendar.YEAR, yearCdt.getCalendarInstance().get(Calendar.YEAR));
		setDate(tmpcal.getTime());
		updateHeader();
	    }
	});

	// VSpacer spacer = new VSpacer(toolsPanel, SWT.NONE);
	// spacer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
	//
	// VButton print = new VButton(toolsPanel, SWT.PUSH);
	// print.setImage(Resources.ICON_PRINT);
	// print.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
	// print.addSelectionListener(new SelectionAdapter() {
	// @Override
	// public void widgetSelected(SelectionEvent e) {
	// print();
	// }
	// });
    }

    private void print() {
	PrinterData data = Printer.getDefaultPrinterData();
	if (data == null) {
	    System.out.println("Warning: No default printer.");
	    return;
	}
	Printer printer = new Printer(data);
	if (printer.startJob("SWT Printing Snippet")) {
	    Rectangle page = printer.getClientArea();
	    Rectangle trim = printer.computeTrim(0, 0, 0, 0);
	    Point dpi = printer.getDPI();
	    int marginWidth = dpi.x + trim.x;
	    int marginHeight = dpi.y + trim.y;
	    GC gc = new GC(printer);
	    if (printer.startPage()) {
		dayPanel.getComposite().setRedraw(false);
		Rectangle bounds = dayPanel.getBounds();
		if (false) { // landscape)
		    dayPanel.setBounds(page.y + marginHeight, page.x + marginWidth, page.height - (2 * marginHeight), page.width - (2 * marginWidth));
		    Transform t = new Transform(printer);
		    t.translate((float) page.width, 0);
		    t.rotate(90);
		    gc.setTransform(t);
		    t.dispose();
		} else {
		    dayPanel.setBounds(page.x + marginWidth, page.y + marginHeight, page.width - (2 * marginWidth), page.height - (2 * marginHeight));
		}
		dayPanel.layout();

		Event e = new Event();
		e.type = SWT.Paint;
		e.data = dayPanel;
		e.widget = body;
		e.gc = gc;
		e.display = getDisplay();
		e.x = dayPanel.getBounds().x;
		e.y = dayPanel.getBounds().y;
		e.width = dayPanel.getBounds().width;
		e.height = dayPanel.getBounds().height;

		dayPanel.paintControl(e);

		printer.endPage();

		dayPanel.setBounds(bounds);
		dayPanel.layout();
		dayPanel.getComposite().setRedraw(true);
	    }
	    gc.dispose();
	    printer.endJob();
	}
	printer.dispose();
    }

    protected Calendar getCalendarInstance() {
	return getCalendarInstance((date == null) ? new Date() : date);
    }

    protected Calendar getCalendarInstance(Date date) {
	Calendar cal = Calendar.getInstance(locale);
	cal.setTimeZone(timezone);
	cal.setTime(date);
	return cal;
    }

    protected String getFormattedDate(String pattern) {
	return getFormattedDate(pattern, date);
    }

    protected String getFormattedDate(String pattern, Date date) {
	if (pattern != null) {
	    if (sdf == null) {
		sdf = new SimpleDateFormat(pattern, locale); // $NON-NLS-1$
		sdf.setTimeZone(timezone);
	    } else if (!pattern.equals(lastPattern)) {
		sdf.applyPattern(pattern);
	    }
	    lastPattern = pattern;
	    return sdf.format(date);
	}
	return "";
    }

    private void updateDayLabels() {
	Calendar tmpcal = getCalendarInstance();
	tmpcal.set(Calendar.DAY_OF_WEEK, tmpcal.getFirstDayOfWeek());
	for (int x = 0; x < dayLabels.length; x++) {
	    String str = getFormattedDate("E", tmpcal.getTime());
	    dayLabels[x].setText(str);
	    tmpcal.add(Calendar.DAY_OF_WEEK, 1);
	}
    }

    private void updateHeader() {
	Calendar selected = getCalendarInstance();

	if (monthCdt != null) {
	    monthCdt.setSelection(selected.getTime());
	    monthCdt.setButtonText(monthCdt.getText());
	}

	if (yearCdt != null) {
	    yearCdt.setSelection(selected.getTime());
	    yearCdt.setButtonText(yearCdt.getText());
	}

	header.layout(true, true);
    }

    public void setDate(Date date) {
	this.date = date;
	setDays(date, true);
	updateHeader();
    }

    private void setDays(Date firstDate, boolean alignMonth) {
	Calendar tmpcal = getCalendarInstance();
	tmpcal.setTime(firstDate);

	if (alignMonth) {
	    tmpcal.set(Calendar.DATE, 1);
	    int firstDay = tmpcal.get(Calendar.DAY_OF_WEEK) - tmpcal.getFirstDayOfWeek();
	    if (firstDay < 0) {
		firstDay += 7;
	    }
	    tmpcal.add(Calendar.DATE, -firstDay);
	}

	for (int day = 0; day < days.length; day++) {
	    days[day].setDate(tmpcal.getTime());
	    days[day].setItems(elements);
	    tmpcal.add(Calendar.DATE, 1);
	}
    }

    public void addSelectionChangedListener(ISelectionChangedListener listener) {
	if (!selectionListeners.contains(listener)) {
	    selectionListeners.add(listener);
	}
    }

    public void removeSelectionChangedListener(ISelectionChangedListener listener) {
	selectionListeners.remove(listener);
    }

    public void setSelection(ISelection selection) {
	// this.selection.clear();
	// for(Iterator<?> iter = selection.iterator(); iter.hasNext(); ) {
	//
	// this.selection.add(o)
	// }
	// SelectionChangedEvent event = new SelectionChangedEvent(this, new StructuredSelection(selection));
	// for(Object listener : selectionListeners) {
	// ((ISelectionChangedListener) listener).selectionChanged(event);
	// }
    }

}
