package it.caicividale.corsicai.ui.databinding.converters;

import java.util.Date;

import it.caicividale.corsicai.model.util.UtilsService;

public class Date2StringConverter extends GenericsConverter<Date, String> {

	public Date2StringConverter() {
		super(Date.class, String.class);
	}

	@Override
	public String apply(Date date) {
		String text = "";
		if (date != null) {
			text = UtilsService.getDateString(date);
		}

		return text;
	}

}
