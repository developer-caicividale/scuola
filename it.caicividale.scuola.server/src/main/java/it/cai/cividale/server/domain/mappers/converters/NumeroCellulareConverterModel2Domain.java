package it.cai.cividale.server.domain.mappers.converters;

import org.modelmapper.AbstractConverter;

import it.caicividale.scuola.emf.model.valueobject.NumeroCellulare;

public class NumeroCellulareConverterModel2Domain extends AbstractConverter<NumeroCellulare, String> {

    @Override
    protected String convert(NumeroCellulare source) {
	if (source != null) {
	    return source.getValue();
	}
	return null;
    }

}
