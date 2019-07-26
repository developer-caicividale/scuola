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

package it.caicividale.corsicai.ui.cccalendar;

import org.aspencloud.ccalendar.CCalendarItemBuilder;
import org.aspencloud.ccalendar.util.TimeSpan;
import org.eclipse.swt.graphics.Image;

public class CEventItemBuilder extends CCalendarItemBuilder {

	@Override
	public Image getImage(Object element) {
		return null;
	}

	@Override
	public String getText(Object element) {
		return ((CEvent) element).getName();
	}

	@Override
	public TimeSpan getTimeSpan(Object element) {
		return ((CEvent) element).getTimeSpan();
	}

}
