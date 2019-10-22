package it.caicividale.scuola.ui.databinding.converters;

public class String2ShortConverter extends GenericsConverter<String, Short> {

    public String2ShortConverter() {
	super(String.class, Short.class);
    }

    @Override
    public Short apply(String string) {
	Short number = null;
	if (string != null && !string.isEmpty()) {
	    try {
		number = Short.parseShort(string);
	    } catch (Exception e) {
		throw new RuntimeException("Numero inserito non corretto. Inserire un numero intero.");
	    }

	}

	return number;
    }

}
