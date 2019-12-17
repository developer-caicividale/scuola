package it.caicividale.scuola.ui.lov;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;

public class LovListener<T> implements MouseListener, FocusListener, ModifyListener {

//    private static final String LOV_ICON = "metharg_obj.gif";
//    private static final Cursor LOV_CURSOR = Activator.getDefault().getImageRegistry().get(LOV_ICON) != null
//	    ? new Cursor(Display.getCurrent(), Activator.getDefault().getImageRegistry().get(LOV_ICON).getImageData(),
//		    0, 0)
//	    : null;

    private final Map<Widget, Boolean> focusedMap = new HashMap<Widget, Boolean>();
    private final Map<Widget, Boolean> changedMap = new HashMap<Widget, Boolean>();
    private boolean lovOpened = false;

    private Hashtable<Text, String> riporti;
    private final List<IObservableValue> lovObservables = new ArrayList<IObservableValue>();
    protected Lov<T> lov;

    public LovListener(final Lov<T> lov) {
	this(lov, null);
    }

    public LovListener(final Lov<T> lov, final Hashtable<Text, String> riporti) {
	this.lov = lov;
	this.riporti = riporti;
    }

    @Override
    public void mouseUp(final MouseEvent e) {
    }

    @Override
    public void mouseDown(final MouseEvent e) {
    }

    @Override
    public void mouseDoubleClick(final MouseEvent event) {
	doLov(event);
    }

    @Override
    public void focusLost(final FocusEvent event) {
	if (isChanged(event.widget)) {
	    doLov(event);
	    setChanged(event.widget, false);
	}
	setFocused(event.widget, false);
    }

    @Override
    public void focusGained(final FocusEvent event) {
	setChanged(event.widget, false);
	setFocused(event.widget, true);
    }

    @Override
    public void modifyText(final ModifyEvent event) {
	if (isFocused(event.widget) && !lovOpened) {
	    setChanged(event.widget, true);
	}
    }

//    public void addTriggeringField(final IWidget widget) {
//	if (widget.getUIControl() instanceof Text) {
//	    addTriggeringField((Text) widget.getUIControl());
//	}
//    }

    public void addTriggeringField(final Text triggeringField) {
	triggeringField.addMouseListener(this);
	triggeringField.addFocusListener(this);
	triggeringField.addModifyListener(this);
//	if (LOV_CURSOR != null) {
//	    triggeringField.setCursor(LOV_CURSOR);
//	}
	triggeringField.addDisposeListener(new DisposeListener() {
	    @Override
	    public void widgetDisposed(final DisposeEvent e) {
		triggeringField.removeMouseListener(LovListener.this);
		triggeringField.removeFocusListener(LovListener.this);
		triggeringField.removeModifyListener(LovListener.this);
		lovObservables.clear();
	    }
	});
    }

    private void setChanged(final Widget widget, final boolean changed) {
	changedMap.put(widget, changed);
    }

    private boolean isChanged(final Widget widget) {
	Boolean changed = changedMap.get(widget);
	if (changed == null) {
	    changed = false;
	}
	return changed;
    }

    private void setFocused(final Widget widget, final boolean focused) {
	focusedMap.put(widget, focused);
    }

    private boolean isFocused(final Widget widget) {
	Boolean focused = focusedMap.get(widget);
	if (focused == null) {
	    focused = false;
	}
	return focused;
    }

    public void addLovObservable(final IObservableValue lovObservable) {
	lovObservables.add(lovObservable);
    }

    protected void doLov(final EventObject event) {
	String filter = null;
	if (event.getSource() instanceof Text) {
	    filter = ((Text) event.getSource()).getText();
	}

	lovOpened = true;
	T selectedObject = lov.doLov(filter);
	doLov(selectedObject);

    }

    public void doLov(T selectedObject) {
	// Riporti
	if (riporti != null) {
	    for (Enumeration<Text> fields = riporti.keys(); fields.hasMoreElements();) {
		Text currentField = fields.nextElement();

		if (!currentField.isDisposed()) {
		    if (selectedObject != null) {
			Method fieldGetter;
			try {
			    fieldGetter = selectedObject.getClass().getMethod(riporti.get(currentField));
			    String value = fieldGetter.invoke(selectedObject).toString();
			    currentField.setText(value);
			} catch (SecurityException se) {
//			    LOGGER.error("Errore nel riporto dei dati dalla lov: " + se.getMessage(), se);
			} catch (NoSuchMethodException nsme) {
//			    LOGGER.error("Errore nel riporto dei dati dalla lov: " + nsme.getMessage(), nsme);
			} catch (IllegalArgumentException iare) {
//			    LOGGER.error("Errore nel riporto dei dati dalla lov: " + iare.getMessage(), iare);
			} catch (IllegalAccessException iace) {
//			    LOGGER.error("Errore nel riporto dei dati dalla lov: " + iace.getMessage(), iace);
			} catch (InvocationTargetException ite) {
//			    LOGGER.error("Errore nel riporto dei dati dalla lov: " + ite.getMessage(), ite);
			}
		    } else {
			currentField.setText("");
		    }
		}
	    }
	}

	// Osservabili
	for (IObservableValue lovObservable : lovObservables) {
	    Object oldValue = lovObservable.getValue();

	    if (oldValue != null && oldValue.equals(selectedObject)) {
		lovObservable.setValue(null);
	    }

	    lovObservable.setValue(selectedObject);
	}

	lovOpened = false;
    }
}
