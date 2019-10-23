package it.cai.cividale.server.domain.converters;

import javax.persistence.AttributeConverter;

import it.cai.cividale.server.domain.enums.TitoloIstruttore;

public class TitoloIstruttoreConverter implements AttributeConverter<TitoloIstruttore, String> {

    @Override
    public String convertToDatabaseColumn(TitoloIstruttore attribute) {
	String dbString = null;
	if (attribute != null) {
	    dbString = attribute.getSigla();
	}
	return dbString;
    }

    @Override
    public TitoloIstruttore convertToEntityAttribute(String dbData) {
	if (dbData == null) {
	    return null;
	}

	if (dbData.trim().isEmpty()) {
	    return null;
	}

	switch (dbData) {
	case "ASP":
	    return TitoloIstruttore.ASPIRANTE_ISTRUTTORE;
	case "IA":
	    return TitoloIstruttore.ISTRUTTORE_ALPINISMO;
	case "INA":
	    return TitoloIstruttore.ISTRUTTORE_NAZIONALE_ALPINISMO;
	case "IAL":
	    return TitoloIstruttore.ISTRUTORE_ARRAMPICATA_LIBERA;
	case "INAL":
	    return TitoloIstruttore.ISTRUTORE_NAZIONALE_ARRAMPICATA_LIBERA;
	case "IS":
	    return TitoloIstruttore.ISTRUTTORE_SEZIONALE;
	case "INSA":
	    return TitoloIstruttore.ISTRUTTORE_NAZIONALE_SCIALPINISMO;
	case "ISFE":
	    return TitoloIstruttore.ISTRUTTORE_SCI_FONDO_ESCURSIONISMO;
	case "ISA":
	    return TitoloIstruttore.ISTRUTTORE_SCIALPINISMO;

	default:
	    return null;
	}
    }
}
