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

import org.aspencloud.v.VControl;
import org.aspencloud.v.VLabel;
import org.aspencloud.v.VLabelPainter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Pattern;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;

public class CCalendarDayItem extends VLabel {

	private static final Color c1 = new Color(Display.getDefault(), 225, 225, 225);
	private static final Color c2 = new Color(Display.getDefault(), 210, 210, 255);
	
//	private String startText;
//	private String endText;
	
	boolean startedYesterday;
	boolean endsTomorrow;
	
	boolean today;
	boolean workDay;
	boolean activeMonth;
	boolean selected;
	
	public CCalendarDayItem(CCalendarDay parent, int style) {
		super(parent, style);
		
		setMargins(3, 2);
		setPolygon(new int[] { 5, 5 }, c2);
		setAlignment(SWT.LEFT, SWT.CENTER);
		
		setPainter(new VLabelPainter() {
			@Override
			public void paintBackground(VControl control, Event e) {
				if(hasState(STATE_SELECTED)) {
					Rectangle r = control.getBounds();
					Pattern p = new Pattern(
							e.display,
							0, r.y,
							0, r.y+r.height,
							c2,
							e.display.getSystemColor(SWT.COLOR_WHITE)
						);
					e.gc.setBackgroundPattern(p);
					e.gc.fillRoundRectangle(r.x, r.y, r.width, r.height-1, 4, 4);
					p.dispose();
				} else if(hasState(STATE_ACTIVE)) {
					Rectangle r = control.getBounds();
					Pattern p = new Pattern(
							e.display,
							0, r.y,
							0, r.y+r.height,
							e.display.getSystemColor(SWT.COLOR_WHITE),
							c1
						);
					e.gc.setBackgroundPattern(p);
					e.gc.fillRoundRectangle(r.x, r.y, r.width, r.height-1, 4, 4);
					p.dispose();
				}
			}
			@Override
			public void paintBorders(VControl control, Event e) {
				if(hasState(STATE_ACTIVE | STATE_SELECTED)) {
					Rectangle r = control.getBounds();
					e.gc.setForeground(e.display.getSystemColor(SWT.COLOR_GRAY));
					e.gc.drawLine(r.x-1, r.y, r.x+r.width, r.y);
					e.gc.drawLine(r.x-1, r.y+r.height-1, r.x+r.width, r.y+r.height-1);
				}
			}
		});

		createTooltip();
	}

	private void createTooltip() {
//		setToolTip(new VToolTip(this) {
//		@Override
//		protected void createAdditionalContent(Composite parent, boolean isEmpty) {
//			Label lbl;
//			
//			if(!isEmpty) {
//				lbl = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
//				lbl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
//			}
//			
//			lbl = new Label(parent, SWT.NONE);
//			lbl.setText("Start:");
//			lbl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
//			
//			lbl = new Label(parent, SWT.NONE);
//			lbl.setText(startText);
//			
//			lbl = new Label(parent, SWT.NONE);
//			lbl.setText("End:");
//			lbl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
//			
//			lbl = new Label(parent, SWT.NONE);
//			lbl.setText(endText);
//		}
//	});
	}
	
	CCalendar getCCalendar() {
		return getCCalendarDay().getCCalendar();
	}
	
	CCalendarDay getCCalendarDay() {
		return (CCalendarDay) getParent();
	}
	
	public void setToolTipStartText(String text) {
//		this.startText = text;
	}
	
	public void setToolTipEndText(String text) {
//		this.endText = text;
	}

	@Override
	public Type getType() {
		return Type.Custom;
	}
	
	void setSelection(boolean select) {
		if(setState(STATE_SELECTED, select)) {
			redraw();
		}
	}
	
}
