package it.caicividale.scuola.ui.databinding.converters;

import java.time.LocalDate;

import it.caicividale.scuola.emf.model.util.UtilsService;

public class Date2StringConverter extends GenericsConverter<LocalDate, String> {

    public Date2StringConverter() {
	super(LocalDate.class, String.class);
    }

    @Override
    public String apply(LocalDate date) {
	String text = "";
	if (date != null) {
	    text = UtilsService.getDateString(date);
	}

	return text;
    }

}
