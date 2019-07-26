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

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.aspencloud.cdatetime.CDT.PickerType;
import org.aspencloud.v.VPanel;

abstract class AbstractPicker extends VPanel {

	protected static final int NOTIFY_INTERNAL	= -1;
	protected static final int NOTIFY_NONE 		= 0;
	protected static final int NOTIFY_REGULAR 	= 1;
	protected static final int NOTIFY_DEFAULT 	= 2;

	private CDateTime cdt;
	private int fields = 0;
	private SimpleDateFormat sdf;
	private String lastPattern;
	protected CDateTimeBuilder builder;


	public AbstractPicker(AbstractPicker parent, int style) {
		super(parent, style);
		cdt = parent.getCDateTime();
		builder = cdt.builder;
	}
	
	public AbstractPicker(CDateTime parent) {
		super(parent.pickerPanel, parent.style);
		cdt = parent;
		builder = cdt.builder;
	}

//	protected boolean active(Enum<?>... attr) {
//    	for(Enum<?> a : attr) {
//    		if(builder.active(a)) {
//    			return true;
//    		}
//    	}
//    	return false;
//    }
	
	protected abstract void createContents();
	
	protected void deselect(Date date) {
    	cdt.deselect(date);
    }
	
	protected void deselectAll() {
    	cdt.deselectAll();
    }
	
	protected void fireSelectionChanged() {
		cdt.fireSelectionChanged();
    }

	protected void fireSelectionChanged(int field) {
		cdt.fireSelectionChanged(field);
    }
	
	protected Calendar getCalendarInstance() {
        Calendar cal = Calendar.getInstance(cdt.timezone, cdt.locale);
        cal.setTime(cdt.getTime());
        return cal;
    }

	protected Calendar getCalendarInstance(Date date) {
    	Calendar cal = getCalendarInstance();
    	cal.setTime(date);
    	return cal;
    }

	public CDateTime getCDateTime() {
		return cdt;
	}

	/**
	 * @return an int[] representing the Calendar Fields used by this picker
	 */
	public abstract int[] getFields();
	
	public int[] getFieldValues() {
		Calendar cal = getCalendarInstance();
		int[] fa = getFields();
		int[] va = new int[fa.length];
		for(int i = 0; i < fa.length; i++) {
			va[i] = cal.get(fa[i]);
		}
		return va;
	}
	
	protected String getFormattedDate(String pattern, Date date) {
		if(pattern != null) {
			if(sdf == null) {
				sdf = new SimpleDateFormat(pattern, cdt.locale); //$NON-NLS-1$
		        sdf.setTimeZone(cdt.timezone);
			} else if(!pattern.equals(lastPattern)) {
				sdf.applyPattern(pattern);
			}
			lastPattern = pattern;
			return sdf.format(date);
		}
		return "";
	}
	
	protected String getFormattedSelection(String pattern) {
		return getFormattedDate(pattern, getTime());
	}
	
	protected Locale getLocale() {
		return cdt.locale;
	}
	
	public CDateTimePainter getPainter() {
    	return cdt.getPainter();
    }

	public abstract PickerType getPickerType();
	
	protected Date[] getSelectedDates() {
		return cdt.getSelectedDates();
	}
	
	protected Date getSelection() {
		return cdt.getSelection();
	}

	protected Date getTime() {
		return cdt.getTime();
	}
	
	protected long getTimeInMillis() {
		return cdt.getTimeInMillis();
	}
	
	protected boolean hasSelection() {
    	return cdt.hasSelection();
    }
	
    protected boolean isSelected(Date date) {
		return cdt.isSelected(date);
	}
    
    public boolean isSet(int calendarField) {
		int[] fa = getFields();
		for(int i = 0; i < fa.length; i++) {
			if(fa[i] == calendarField) {
				return (fields & (1 << i)) != 0;
			}
		}
		return false;
	}
    
    protected boolean isSingleSelection() {
		return cdt.isSingleSelection();
	}
    
    protected void select(Date date) {
    	cdt.select(date);
    }
    
    protected void select(Date start, Date end, int field, int increment) {
    	cdt.select(start, end, field, increment);
    }

    public void  setFields(int[] calendarFields) {
		builder.setFields(calendarFields);
		fields = 0;
		int[] fa = getFields();
		for(int i = 0; i < calendarFields.length; i++) {
			for(int j = 0; j < fa.length; j++) {
				if(calendarFields[i] == fa[j]) 
					fields |= (1 << j);
			}
		}
	}
    
    protected void setSelection(Date date) {
    	cdt.setSelection(date);
    }
    
    protected void setTime(Date date) {
    	cdt.setTime(date);
    }
    
	/**
	 * Update the given Calendar with the field values from this picker
	 * @param cal the Calendar object to be updated and modified
	 */
	public void update(Calendar cal) {
		int[] fa = getFields();
		int[] va = getFieldValues();
		for(int j = 0; j < fa.length; j++) {
			cal.set(fa[j], va[j]);
		}
	}
	
	protected abstract void updateLabels();

	protected abstract void updateView();
	
}
