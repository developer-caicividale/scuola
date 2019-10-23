package it.caicividale.scuola.ui.databinding.converters;

import java.util.function.Function;

import org.eclipse.core.databinding.conversion.Converter;

abstract class GenericsConverter<T, V> extends Converter implements Function<T, V> {
    private final Class<T> fromType;

    public GenericsConverter(Class<T> fromType, Class<V> toType) {
	super(fromType, toType);
	this.fromType = fromType;
    }

    @Override
    public final Object convert(Object fromObject) {
	if (fromType.isInstance(fromObject)) {
	    @SuppressWarnings("unchecked")
	    V toObject = apply((T) fromObject);
	    return toObject;
	}
	return null;
    }
}
