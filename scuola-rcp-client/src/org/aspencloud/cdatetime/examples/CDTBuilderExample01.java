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

import org.aspencloud.cdatetime.Body;
import org.aspencloud.cdatetime.CDT;
import org.aspencloud.cdatetime.CDateTime;
import org.aspencloud.cdatetime.CDateTimeBuilder;
import org.aspencloud.cdatetime.Footer;
import org.aspencloud.cdatetime.Header;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;



public class CDTBuilderExample01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setText("AspenCloud CDateTime");
		shell.setLayout(new GridLayout(2, false));

		final Label lbl = new Label(shell, SWT.BORDER);
		lbl.setText("Selection: ");
		lbl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));

		CDateTimeBuilder builder = new CDateTimeBuilder();
		builder.setHeader(SWT.FILL, true, Header.MonthPrev(), Header.Month().grab(), Header.Year().grab(), Header.MonthNext());
		builder.setBody(Body.Days(), Body.Months(), Body.Years(), Body.Time().newColumn());
		builder.setFooter(Footer.Today(), Footer.Clear());
		
		CDateTime cdt = new CDateTime(shell, CDT.BORDER | CDT.SIMPLE | CDT.DATE_LONG | CDT.TIME_MEDIUM);
		cdt.setBuilder(builder);
		cdt.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		cdt = new CDateTime(shell, CDT.BORDER | CDT.SIMPLE);
		cdt.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		cdt = new CDateTime(shell, CDT.BORDER | CDT.COMPACT | CDT.SIMPLE);
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
