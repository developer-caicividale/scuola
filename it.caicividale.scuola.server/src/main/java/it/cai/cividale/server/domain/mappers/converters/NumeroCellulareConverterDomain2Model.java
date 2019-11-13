package it.cai.cividale.server.domain.mappers.converters;

import org.modelmapper.AbstractConverter;

import it.caicividale.scuola.emf.model.valueobject.NumeroCellulare;

public class NumeroCellulareConverterDomain2Model extends AbstractConverter<String, NumeroCellulare> {

    @Override
    protected NumeroCellulare convert(String source) {
	if (source != null) {
	    return new NumeroCellulare(source);
	}
	return null;
    }

}
