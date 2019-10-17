package it.cai.cividale.server.domain.converters;

import javax.persistence.AttributeConverter;

import it.cai.cividale.server.domain.enums.TipoSesso;

public class TipoSessoConverter implements AttributeConverter<TipoSesso, String> {

    @Override
    public String convertToDatabaseColumn(TipoSesso attribute) {
	String dbString = null;
	if (attribute != null) {
	    dbString = attribute.getSigla();
	}
	return dbString;
    }

    @Override
    public TipoSesso convertToEntityAttribute(String dbData) {
	if (dbData == null) {
	    return null;
	}

	if (dbData.trim().isEmpty()) {
	    return null;
	}

	switch (dbData) {
	case "M":
	    return TipoSesso.MASCHIO;
	case "F":
	    return TipoSesso.FEMMINA;

	default:
	    return null;
	}
    }
}
