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



public class CDTExample01 {

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

		int[] style = new int[] {
				CDT.BORDER | CDT.TIME_MEDIUM | CDT.DATE_LONG | CDT.TAB_FIELDS
//				CDT.BORDER | CDT.DATE_LONG
//				CDT.BORDER | CDT.TIME_MEDIUM
		};
		int[] style_ext = new int[] { CDT.SIMPLE, CDT.COMPACT | CDT.SIMPLE | CDT.SPINNER, CDT.DROP_DOWN, CDT.DROP_DOWN | CDT.COMPACT,  CDT.SPINNER };
		final CDateTime[] cdts = new CDateTime[style.length * style_ext.length];
		for(int i = 0; i < style.length; i++) {
			for(int j = 0; j < style_ext.length; j++) {
				int ix = (i*style_ext.length)+j;
				cdts[ix] = new CDateTime(shell, style[i] | style_ext[j]);
				cdts[ix].setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
				cdts[ix].addSelectionListener(new SelectionAdapter() {
		        	@Override
		        	public void widgetSelected(SelectionEvent e) {
		        		CDateTime cdt = (CDateTime) e.widget;
		        		lbl.setText("Selection: " + cdt.getText());
		        	}
		        });
			}
			new Label(shell, SWT.NONE);
		}
        
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
