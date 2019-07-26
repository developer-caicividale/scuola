package it.caicividale.corsicai.ui.databinding.converters;

public class String2IntegerConverter extends GenericsConverter<String, Integer> {

    public String2IntegerConverter() {
	super(String.class, Integer.class);
    }

    @Override
    public Integer apply(String string) {
	Integer number = null;
	if (string != null && !string.isEmpty()) {
	    try {
		number = Integer.parseInt(string);
	    } catch (Exception e) {
		throw new RuntimeException("Numero inserito non corretto. Inserire un numero intero.");
	    }

	}

	return number;
    }

}
