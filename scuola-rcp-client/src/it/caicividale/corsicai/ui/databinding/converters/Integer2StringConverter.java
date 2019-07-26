package it.caicividale.corsicai.ui.databinding.converters;

public class Integer2StringConverter extends GenericsConverter<Integer, String> {

    public Integer2StringConverter() {
	super(Integer.class, String.class);
    }

    @Override
    public String apply(Integer number) {
	String text = "";
	if (number != null) {
	    text = number.toString();
	}

	return text;
    }

}
