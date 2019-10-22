package it.caicividale.scuola.ui.databinding.converters;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import it.caicividale.scuola.emf.model.Corso;

public class Corso2ImageConverter extends GenericsConverter<Corso, Image> {

    private final Image A1Image;
    private final Image SA1Image;
    private final Image SA2Image;
    private final Image AR1Image;
    private final Image AR2Image;
    private final Image AG1Image;
    private final Image AG2Image;
    private final Image ACG1Image;
    private final Image AL1Image;
    private final Image defaultImage;

    public Corso2ImageConverter() {
	super(Corso.class, Image.class);
	ClassLoader classLoader = this.getClass().getClassLoader();
	A1Image = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/A132x32.png"));
	SA1Image = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/SA132x32.png"));
	SA2Image = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/SA232x32.png"));
	AR1Image = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/AR132x32.png"));
	AR2Image = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/AR232x32.png"));
	AG1Image = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/AG132x32.png"));
	AG2Image = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/AG232x32.png"));
	ACG1Image = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/ACG132x32.png"));
	AL1Image = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/AL132x32.png"));
	defaultImage = new Image(Display.getCurrent(), classLoader.getResourceAsStream("/icons/defaultCorso32x32.png"));
    }

    @Override
    public Image apply(Corso corso) {
	Image image = null;
	if (corso != null) {
	    switch (corso.getSigla()) {
	    case A1:
		return A1Image;
	    case A1N:
		return A1Image;
	    case A1R:
		return A1Image;
	    case A1G:
		return A1Image;

	    case SA1:
		return SA1Image;
	    case SA2:
		return SA2Image;
	    case AR1:
		return AR1Image;
	    case AR2:
		return AR2Image;
	    case AG1:
		return AG1Image;
	    case AG2:
		return AG2Image;
	    case ACG1:
		return ACG1Image;
	    case AL1:
		return AL1Image;

	    default:
		return defaultImage;
	    }
	}

	return image;
    }

}
