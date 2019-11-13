package it.cai.cividale.server.domain.mappers.converters;

import org.modelmapper.AbstractConverter;

import it.caicividale.scuola.emf.model.valueobject.EMail;

public class EmailConverterDomain2Model extends AbstractConverter<String, EMail> {

    @Override
    protected EMail convert(String source) {
	if (source != null) {
	    return new EMail(source);
	}
	return null;
    }

}
