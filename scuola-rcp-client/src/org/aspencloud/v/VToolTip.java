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

package org.aspencloud.v;
///****************************************************************************
//* Copyright (c) 2008 Jeremy Dowdall
//* All rights reserved. This program and the accompanying materials
//* are made available under the terms of the Eclipse Public License v1.0
//* which accompanies this distribution, and is available at
//* http://www.eclipse.org/legal/epl-v10.html
//*
//* Contributors:
//*    Jeremy Dowdall <jeremyd@aspencloud.com> - initial API and implementation
//*****************************************************************************/
//
//package org.aspencloud.vcomp;
//
//import org.eclipse.jface.window.ToolTip;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.layout.GridData;
//import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Event;
//import org.eclipse.swt.widgets.Label;
//
//public class VToolTip extends ToolTip {
//
//	private VControl control;
//	
//	public VToolTip(VControl control) {
//		super(control.getComposite());
//		this.control = control;
//	}
//	
//	protected void createAdditionalContent(Composite parent, boolean isEmpty) {
//		// subclasses to implement if necessary
//	}			
//
//	@Override
//	protected Composite createToolTipContentArea(Event event, Composite parent) {
//		
//		Composite comp = new Composite(parent, SWT.NONE);
//		GridLayout layout = new GridLayout(2, false);
//		layout.marginWidth = 10;
//		layout.marginHeight = 10;
//		comp.setLayout(layout);
//		
//		Label lbl;
//		int hspan = 2;
//		if(control.getImage() != null) {
//			lbl = new Label(comp, SWT.NONE);
//			lbl.setImage(control.getImage());
//			lbl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
//			hspan--;
//		}
//
//		if(control.getToolTipText() != null) {
//			lbl = new Label(comp, SWT.NONE);
//			lbl.setText(control.getToolTipText());
//			lbl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, hspan, 1));
//		}
//
//		createAdditionalContent(comp, control.getToolTipText() != null || control.getImage() != null);
//		
//		return null;
//	}
//	
//}
