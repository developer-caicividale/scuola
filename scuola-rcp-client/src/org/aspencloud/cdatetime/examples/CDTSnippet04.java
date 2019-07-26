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

package org.aspencloud.cdatetime.examples;

import org.aspencloud.cdatetime.CDT;
import org.aspencloud.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;



public class CDTSnippet04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setText("CDateTime");
		shell.setLayout(new GridLayout());
		shell.setBackground(display.getSystemColor(SWT.COLOR_GRAY));
		shell.setBackgroundMode(SWT.INHERIT_FORCE);

		Text txt = new Text(shell, SWT.BORDER);
		txt.setText("<choose date>");
		txt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		
		Combo cmb = new Combo(shell, SWT.BORDER | SWT.DROP_DOWN);
		cmb.setItems(new String[] { "Item 1", "Item 2", "Item3" });
		cmb.setText("<choose date>");
		cmb.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		CDateTime cdt = new CDateTime(shell, CDT.BORDER | CDT.DROP_DOWN | CDT.DATE_LONG | CDT.TIME_MEDIUM);
		cdt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));

		cdt = new CDateTime(shell, CDT.BORDER | CDT.COMPACT | CDT.DROP_DOWN | CDT.DATE_SHORT);
		cdt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		
		cdt = new CDateTime(shell, CDT.BORDER | CDT.DROP_DOWN | CDT.TIME_MEDIUM);
		cdt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));

		cdt = new CDateTime(shell, CDT.BORDER | CDT.DROP_DOWN | CDT.TIME_SHORT | CDT.CLOCK_DISCRETE);
		cdt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));

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
