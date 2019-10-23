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

import org.aspencloud.ccalendar.util.TimeSpan;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;

public abstract class CCalendarItemBuilder {

	private CCalendar parent;
	
	CCalendarDayItem createDayItem(CCalendarDay day, Object element, TimeSpan ts) {
		CCalendarDayItem item = new CCalendarDayItem(day, SWT.LEFT);
		
		item.activeMonth = day.activeMonth;
		item.today = day.today;
		item.workDay = day.workDay;

		item.setData("element", element);
		item.setData("timespan", ts);
		
		String txt = getText(element);

		item.setText(txt);
		item.setToolTipText(txt);
		item.setToolTipStartText(parent.getFormattedDate("MM/dd/yyyy 'at' h:mm a", ts.getStartDate()));
		item.setToolTipEndText(parent.getFormattedDate("MM/dd/yyyy 'at' h:mm a", ts.getEndDate()));

//		if(day.activeMonth) {
//			item.setForeground(day.getDisplay().getSystemColor(SWT.COLOR_BLACK));
//		} else {
//			item.setForeground(day.getDisplay().getSystemColor(SWT.COLOR_DARK_GRAY));
//		}
		
		if(ts.getStartDate().before(day.getTimeSpan().getStartDate())) {
			item.startedYesterday = true;
		}
		
		if(ts.getEndDate().after(day.getTimeSpan().getEndDate())) {
			item.endsTomorrow = true;
		}

//		item.setMargins(item.startedYesterday ? 7 : 2, item.endsTomorrow ? 7 : 2, 0, 0);
		
		return item;
	}
	
	public abstract TimeSpan getTimeSpan(Object element);
	
	public abstract String getText(Object element);
	
	public abstract Image getImage(Object element);

	void setParent(CCalendar parent) {
		this.parent = parent;
	}
	
}
