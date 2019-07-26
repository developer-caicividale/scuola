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

import org.aspencloud.cdatetime.CDT;
import org.aspencloud.cdatetime.CDateTime;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;



public class CDTSnippet02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setText("CDateTime");
		shell.setLayout(new GridLayout());

		final Label slbl = new Label(shell, SWT.BORDER);
		slbl.setText("Selection: ");
		slbl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		Label lbl = new Label(shell, SWT.NONE);
		lbl.setText("horizontal:");
		lbl.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false));
		
		final CDateTime hcdt = new CDateTime(shell, CDT.BORDER | CDT.DROP_DOWN | CDT.TIME_SHORT | CDT.CLOCK_DISCRETE);
		hcdt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		hcdt.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				slbl.setText("Selection: " + hcdt.getText());
			}
		});
        
		lbl = new Label(shell, SWT.NONE);
		lbl.setText("vertical:");
		lbl.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false));
		
		final CDateTime vcdt = new CDateTime(shell, CDT.BORDER | CDT.DROP_DOWN | CDT.TIME_SHORT | CDT.CLOCK_DISCRETE | CDT.VERTICAL);
		vcdt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		vcdt.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				slbl.setText("Selection: " + vcdt.getText());
			}
		});
        
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
