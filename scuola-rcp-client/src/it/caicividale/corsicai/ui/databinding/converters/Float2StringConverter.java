package it.caicividale.corsicai.ui.databinding.converters;

public class Float2StringConverter extends GenericsConverter<Float, String> {

    public Float2StringConverter() {
	super(Float.class, String.class);
    }

    @Override
    public String apply(Float number) {
	String text = "";
	if (number != null) {
	    text = number.toString();
	}

	return text;
    }

}
