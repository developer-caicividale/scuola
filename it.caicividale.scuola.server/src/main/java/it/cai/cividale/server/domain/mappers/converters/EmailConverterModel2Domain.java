package it.cai.cividale.server.domain.mappers.converters;

import org.modelmapper.AbstractConverter;

import it.caicividale.scuola.emf.model.valueobject.EMail;

public class EmailConverterModel2Domain extends AbstractConverter<EMail, String> {

    @Override
    protected String convert(EMail source) {
	if (source != null) {
	    return source.getValue();
	}
	return null;
    }

}
