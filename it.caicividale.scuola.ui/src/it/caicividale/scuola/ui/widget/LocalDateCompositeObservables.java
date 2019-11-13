package it.caicividale.scuola.ui.widget;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;

public class LocalDateCompositeObservables {
    public static final IObservableValue<String> observeText(final LocalDateComposite localDateComposite, int event) {
	IObservableValue<String> textObservable = WidgetProperties.text(event).observe(localDateComposite);
	return textObservable;
    }
}
