package it.caicividale.corsicai.ui.databinding.converters;

import it.caicividale.corsicai.model.valueobject.ValueObject;

public class ValueObject2StringConverter extends GenericsConverter<ValueObject, String> {

    public ValueObject2StringConverter() {
	super(ValueObject.class, String.class);
    }

    @Override
    public String apply(ValueObject valueObject) {
	String string = null;
	if (valueObject != null) {
	    try {
		string = valueObject.getValue();
	    } catch (Exception e) {
		throw new RuntimeException("Errore nella conversione in stringa dell'value object");
	    }

	}

	return string;
    }

}
