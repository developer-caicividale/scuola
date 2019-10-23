package it.caicividale.scuola.ui.widgetvalueproperty;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.jface.databinding.swt.WidgetValueProperty;
import org.eclipse.nebula.widgets.cdatetime.CDateTime;
import org.eclipse.swt.SWT;

public class LocalDateSelectionProperty extends WidgetValueProperty {
	private static final int MONTH_MAPPING_VALUE = 1;

	public LocalDateSelectionProperty() {
		super(SWT.Selection);
	}

	@Override
	public Object getValueType() {
		return TemporalAccessor.class;
	}

	@Override
	protected Object doGetValue(Object source) {
		CDateTime dateTime = (CDateTime) source;
		Date date = dateTime.getSelection();
		if (date != null) {
			// return
			// Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
			return date;
		} else
			return null;
	}

	@Override
	protected void doSetValue(Object source, Object value) {
		CDateTime dateTime = (CDateTime) source;
		if (value != null) {
			if (value instanceof Date) {
				dateTime.setSelection((Date) value);
			} else if (value instanceof LocalDate) {
				LocalDate localDate = (LocalDate) value;
				Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
				dateTime.setSelection(date);
			} else if (value instanceof Calendar) {
				TemporalAccessor temporalAccessor = LocalDateTime.from(((Calendar) value).toInstant());
				Date date = Date.from(Instant.from(temporalAccessor));
				dateTime.setSelection(date);
			}

		}
	}

}
