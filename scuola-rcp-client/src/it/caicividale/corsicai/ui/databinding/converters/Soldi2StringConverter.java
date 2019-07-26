package it.caicividale.corsicai.ui.databinding.converters;

public class Soldi2StringConverter extends GenericsConverter<Float, String> {

    public Soldi2StringConverter() {
	super(Float.class, String.class);
    }

    @Override
    public String apply(Float soldi) {
	String text = "";
	if (soldi != null) {
	    text = soldi.toString() + " Euro";
	}

	return text;
    }

}
