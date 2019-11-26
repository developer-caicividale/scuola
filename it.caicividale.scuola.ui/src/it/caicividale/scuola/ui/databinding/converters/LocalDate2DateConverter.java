package it.caicividale.scuola.ui.databinding.converters;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class LocalDate2DateConverter extends GenericsConverter<LocalDate, Date> {

    public LocalDate2DateConverter() {
	super(LocalDate.class, Date.class);
    }

    @Override
    public Date apply(LocalDate localDate) {
	Date date = null;
	if (localDate != null) {
	    date = Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	}

	return date;
    }

}
