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

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Event;

public class VButtonPainter extends VControlPainter {

	@Override
	public void paintBackground(VControl control, Event e) {
		VButton button = (VButton) control;
		if(button.paintNative) {
			if(button.paintInactive || button.hasState(VButton.STATE_ACTIVE | VButton.STATE_SELECTED) || (button == VTracker.getFocusControl())) {
				ImageData data = VButtonImage.instance().getImageData(button);
				if(data == null) {
					data = button.oldImageData;
				} else {
					button.oldImageData = data;
				}
				if(data != null) {
					Image image = new Image(e.display, data);
					e.gc.drawImage(image, control.bounds.x, control.bounds.y);
					image.dispose();
				}
			} else {
				super.paintBackground(control, e);
			}
		} else {
			super.paintBackground(control, e);
		}
	}
	
}
