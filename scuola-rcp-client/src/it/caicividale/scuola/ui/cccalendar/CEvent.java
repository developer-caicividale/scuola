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

package it.caicividale.scuola.ui.cccalendar;

import org.aspencloud.ccalendar.util.TimeSpan;

public class CEvent {

	private String name;
	private TimeSpan ts;
	
	public CEvent(String name, TimeSpan ts) {
		this.name = name;
		this.ts = ts;
	}
	
	public String getName() {
		return name;
	}
	
	public TimeSpan getTimeSpan() {
		return ts;
	}
	
}
