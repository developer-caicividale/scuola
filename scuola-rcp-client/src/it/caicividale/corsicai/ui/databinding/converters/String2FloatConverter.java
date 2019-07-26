package it.caicividale.corsicai.ui.databinding.converters;

public class String2FloatConverter extends GenericsConverter<String, Float> {

    public String2FloatConverter() {
	super(String.class, Float.class);
    }

    @Override
    public Float apply(String string) {
	Float number = null;
	if (string != null && !string.isEmpty()) {
	    try {
		number = Float.parseFloat(string);
	    } catch (Exception e) {
		throw new RuntimeException("Numero inserito non corretto.");
	    }

	}

	return number;
    }

}
