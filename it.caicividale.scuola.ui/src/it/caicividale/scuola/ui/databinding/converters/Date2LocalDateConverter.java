package it.caicividale.scuola.ui.databinding.converters;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Date2LocalDateConverter extends GenericsConverter<Date, LocalDate> {

    public Date2LocalDateConverter() {
	super(Date.class, LocalDate.class);
    }

    @Override
    public LocalDate apply(Date date) {
	LocalDate localDate = null;
	if (date != null) {
	    localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	return localDate;
    }

}
