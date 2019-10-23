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

package org.aspencloud.ccalendar.examples;

import java.util.Calendar;

import org.aspencloud.ccalendar.CCalendar;
import org.aspencloud.ccalendar.util.TimeSpan;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuAdapter;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;



public class CCalendarSnippet01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setText("AspenCloud CCalendar");
		shell.setLayout(new GridLayout());

		GridLayout layout = new GridLayout();
		shell.setLayout(layout);

		final CCalendar cc = new CCalendar(shell, SWT.BORDER);
		cc.setItemBuilder(new CEventItemBuilder());
		cc.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		Menu menu = new Menu(cc);
		final MenuItem item = new MenuItem(menu, SWT.PUSH);
		menu.addMenuListener(new MenuAdapter() {
			@Override
			public void menuShown(MenuEvent e) {
				ISelection selection = cc.getSelection();
				if(selection.isEmpty()) {
					item.setText("No Selection");
					item.setEnabled(false);
				} else {
					item.setText(((CEvent) ((StructuredSelection) selection).getFirstElement()).getName());
					item.setEnabled(true);
				}
			}
		});
		item.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!cc.getSelection().isEmpty()) {
					System.out.println(cc.getSelection());
				}
			}
		});
		cc.setMenu(menu);
		
		Composite comp = new Composite(shell, SWT.NONE);
		comp.setLayout(new GridLayout(2, true));
		comp.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false));
		
		Button b = new Button(comp, SWT.PUSH);
		b.setText("Add Items");
		b.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		b.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Calendar cal = Calendar.getInstance();
				CEvent[] events = new CEvent[10000];
				for(int i = 0; i < events.length; i++) {
					events[i] = new CEvent("Event " + i, new TimeSpan(cal.getTime(), 10 * TimeSpan.HOUR));
					cal.add(Calendar.HOUR_OF_DAY, 24);
				}
				cc.setItems(events);
			}
		});
		
		b = new Button(comp, SWT.PUSH);
		b.setText("Clear");
		b.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		b.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				cc.setItems(null);
			}
		});
		
		
		Rectangle screen = display.getMonitors()[0].getBounds();
		shell.setBounds(
				(screen.width-(screen.height / 2))/2,
				(screen.height-(screen.height / 2))/2,
				screen.height / 2,
				screen.height / 2
		);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}
