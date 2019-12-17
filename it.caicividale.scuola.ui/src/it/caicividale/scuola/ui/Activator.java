package it.caicividale.scuola.ui;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    private static BundleContext context;
    private static Activator plugin;

    static BundleContext getContext() {
	return context;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext bundleContext) throws Exception {
	Activator.context = bundleContext;
	plugin = this;
	System.out.println("---------------------- S T A R T  U I -------------------------");
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext bundleContext) throws Exception {
	Activator.context = null;
	System.out.println("---------------------- S T O P  U I -------------------------");
	plugin = null;
    }

    public static Activator getDefault() {

	return plugin;
    }

}
