package it.caicividale.corsicai.ui.databinding.converters;

public class Short2StringConverter extends GenericsConverter<Short, String> {

    public Short2StringConverter() {
	super(Short.class, String.class);
    }

    @Override
    public String apply(Short number) {
	String text = "";
	if (number != null) {
	    text = number.toString();
	}

	return text;
    }

}
