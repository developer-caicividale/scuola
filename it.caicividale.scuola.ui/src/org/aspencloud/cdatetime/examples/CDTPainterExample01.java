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

package org.aspencloud.cdatetime.examples;

import java.util.Calendar;
import java.util.Date;

import org.aspencloud.cdatetime.CDT;
import org.aspencloud.cdatetime.CDateTime;
import org.aspencloud.cdatetime.CDateTimePainter;
import org.aspencloud.v.VControl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;



public class CDTPainterExample01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setText("CDateTime");
		GridLayout layout = new GridLayout();
		layout.marginHeight = 20;
		layout.marginWidth = 20;
		shell.setLayout(layout);

		CDateTimePainter painter = new CDateTimePainter() {
			@Override
			protected void paintDayButtonBackground(VControl control, Event e) {
				Date date = (Date) control.getData(CDT.Key.Date);
				Calendar c = Calendar.getInstance();
				c.setTime(date);

				Rectangle bounds = control.getBounds();
				
				if(!isActive(control)) {
					e.gc.setAlpha(25);
					e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_BLUE));
					e.gc.fillRectangle(bounds.x, bounds.y, bounds.width, bounds.height);
				} else {
					if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
						e.gc.setAlpha(50);
						e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_GRAY));
						e.gc.setForeground(e.display.getSystemColor(SWT.COLOR_BLUE));
					} else {
						e.gc.setAlpha(100);
						e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_BLUE));
						e.gc.setForeground(e.display.getSystemColor(SWT.COLOR_GRAY));
					}
					e.gc.fillGradientRectangle(bounds.x, bounds.y, bounds.width, bounds.height, true);
				}
				
				e.gc.setAlpha(255);
			}
		};
		
		CDateTime cdt = new CDateTime(shell, CDT.BORDER | CDT.SIMPLE);
		cdt.setPainter(painter);
		cdt.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		cdt = new CDateTime(shell, CDT.BORDER | CDT.SIMPLE);
		cdt.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		shell.pack();
		Point size = shell.getSize();
		Rectangle screen = display.getMonitors()[0].getBounds();
		shell.setBounds(
				(screen.width-size.x)/2,
				(screen.height-size.y)/2,
				size.x,
				size.y
		);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}
