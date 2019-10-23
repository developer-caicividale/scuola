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

import org.aspencloud.cdatetime.CDatePanel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;



public class CDPSnippet01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setText("CDatePanel");
		shell.setLayout(new GridLayout());

		final Label slbl = new Label(shell, SWT.BORDER);
		slbl.setText("Selection: ");
		slbl.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		final CDatePanel cdp = new CDatePanel(shell, SWT.BORDER);
		cdp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		cdp.setMonthCount(2);
//		cdp.addSelectionListener(new SelectionAdapter() {
//			public void widgetSelected(SelectionEvent e) {
//				slbl.setText("Selection: " + cdp.getText());
//			}
//		});
        
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
