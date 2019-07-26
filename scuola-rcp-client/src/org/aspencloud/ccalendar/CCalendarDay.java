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

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import org.aspencloud.ccalendar.util.TimeSpan;
import org.aspencloud.v.VControl;
import org.aspencloud.v.VGridLayout;
import org.aspencloud.v.VLabel;
import org.aspencloud.v.VPanel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;

public class CCalendarDay extends VPanel {

	private CCalendar parent;

	VLabel dateLbl;

	boolean today;
	boolean workDay;
	boolean activeMonth;

	private TimeSpan timeSpan;

	public CCalendarDay(CCalendar parent, int style) {
		super(parent.dayPanel, style);
		this.parent = parent;
		createContents();
	}

	private void createContents() {
		VGridLayout layout = new VGridLayout();
		layout.marginHeight = 2;
		layout.marginWidth = 0;
		layout.verticalSpacing = 3;
		setLayout(layout);

		dateLbl = new VLabel(this, SWT.NONE);
		dateLbl.setMargins(2, 0);
		dateLbl.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, true, false));
	}

	public void setDate(Date date) {
		Calendar c1 = parent.getCalendarInstance();
		Calendar c2 = parent.getCalendarInstance(date);
		Calendar c3 = parent.getCalendarInstance(new Date());

		today = (c2.get(Calendar.DAY_OF_YEAR) == c3.get(Calendar.DAY_OF_YEAR) && c2.get(Calendar.YEAR) == c3.get(Calendar.YEAR));
		workDay = c2.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && c2.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY;
		activeMonth = (c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH) && c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR));
		timeSpan = TimeSpan.createDay(date);
		clear();

		dateLbl.setText(parent.getFormattedDate("d", date));
		if(today) {
			dateLbl.setForeground(getDisplay().getSystemColor(SWT.COLOR_RED));
		} else {
			dateLbl.setForeground(getDisplay().getSystemColor(SWT.COLOR_BLACK));
		}
		
		layout(true);
	}

	private void clear() {
		for(VControl child : getChildren()) {
			if(child instanceof CCalendarDayItem) {
				parent.removeItem((CCalendarDayItem) child);
				child.dispose();
			}
		}
	}

	TimeSpan getTimeSpan() {
		return timeSpan;
	}

	private Comparator<VControl> comparator = new Comparator<VControl>() {
		public int compare(VControl o1, VControl o2) {
			TimeSpan ts1 = (TimeSpan) o1.getData("timespan");
			TimeSpan ts2 = (TimeSpan) o2.getData("timespan");
			if(ts1 != null) {
				return ts1.compareTo(ts2);
			}
			return -1;
		}
	};

//	void addItem(Object element, TimeSpan ts) {
//		if(timeSpan.overlaps(ts)) {
//			CCalendarDayItem item = parent.builder.createDayItem(this, element, ts);
//			item.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
//			sort(comparator);
//			parent.addItem(item);
//		}
//	}

	CCalendar getCCalendar() {
		return parent;
	}

	void setItems(Map<Object, TimeSpan> items) {
		clear();
		for(Entry<Object, TimeSpan> item : items.entrySet()) {
			if(timeSpan.overlaps(item.getValue())) {
				CCalendarDayItem dayItem = parent.builder.createDayItem(this, item.getKey(), item.getValue());
				dayItem.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
				parent.addItem(dayItem);
				dayItem.addListener(SWT.MouseDown, new Listener() {
					public void handleEvent(Event event) {
						parent.select((CCalendarDayItem) event.data, event.button, event.stateMask);
						if(event.button == 3) {
							Menu menu = parent.getMenu();
							if(menu != null) {
								menu.setVisible(true);
							}
						}
					}
				});
			}
		}
		sort(comparator);
		layout(true);
	}

}
