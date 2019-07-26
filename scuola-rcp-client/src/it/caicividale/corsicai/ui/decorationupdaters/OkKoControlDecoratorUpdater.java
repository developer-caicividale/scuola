package it.caicividale.corsicai.ui.decorationupdaters;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationUpdater;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wb.swt.ResourceManager;

public class OkKoControlDecoratorUpdater extends ControlDecorationUpdater {
    Image imageOk;
    Image imageFail;

    public OkKoControlDecoratorUpdater(int sizeIcon) {
	super();
	if (sizeIcon == 16) {
	    imageOk = ResourceManager.getPluginImage("it.caicividale.corsicai.ui", "icons/good16x16.png");
	    imageFail = ResourceManager.getPluginImage("it.caicividale.corsicai.ui", "icons/fail16x16.png");
	} else if (sizeIcon == 32) {
	    imageOk = ResourceManager.getPluginImage("it.caicividale.corsicai.ui", "icons/good32x32.png");
	    imageFail = ResourceManager.getPluginImage("it.caicividale.corsicai.ui", "icons/fail32x32.png");
	} else if (sizeIcon == 64) {
	    imageOk = ResourceManager.getPluginImage("it.caicividale.corsicai.ui", "icons/good64x64.png");
	    imageFail = ResourceManager.getPluginImage("it.caicividale.corsicai.ui", "icons/fail64x64.png");
	}

    }

    @Override
    protected Image getImage(IStatus status) {

	return status.isOK() ? imageOk : imageFail;
    }

}
