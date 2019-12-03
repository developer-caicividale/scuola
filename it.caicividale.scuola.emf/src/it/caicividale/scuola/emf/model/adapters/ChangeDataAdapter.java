package it.caicividale.scuola.emf.model.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

public class ChangeDataAdapter extends EContentAdapter {
    @Override
    public final void notifyChanged(final Notification notification) {
	super.notifyChanged(notification);

    }
}
