package it.caicividale.corsicai.ui.updatevaluestrategy;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;

public class ConverterUpdateValueStrategy extends UpdateValueStrategy {
	private final Converter converter;

	public ConverterUpdateValueStrategy(final Converter converter) {
		this.converter = converter;
	}

	@Override
	public final Object convert(Object value) {
		return converter.convert(value);
	}
}
