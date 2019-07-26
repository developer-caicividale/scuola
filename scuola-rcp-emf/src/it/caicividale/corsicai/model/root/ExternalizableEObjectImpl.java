package it.caicividale.corsicai.model.root;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLParserPool;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;

public class ExternalizableEObjectImpl extends EObjectImpl implements ExternalizableEObject {
    private static final String SCHEME = "corsicai";
    private static final String OPAQUE_PART = "xmi";
    private static final String FRAGMENT = "serialization";

    private static final PerformantXMIResourceFactoryImpl RESOURCE_FACTORY = new PerformantXMIResourceFactoryImpl();

    private final URI uri = URI.createGenericURI(SCHEME, OPAQUE_PART, FRAGMENT);

    @Override
    public void writeExternal(final ObjectOutput out) throws IOException {
	// EPackage.Registry.INSTANCE.clear();
	EPackage.Registry.INSTANCE.put(eClass().getEPackage().getNsURI(), eClass().getEPackage());

	Resource resource = RESOURCE_FACTORY.createResource(uri);
	resource.getContents().add(EcoreUtil.copy(this));

	resource.save((OutputStream) out, null);
    }

    @Override
    public void readExternal(final ObjectInput in) throws IOException, ClassNotFoundException {
	EPackage.Registry.INSTANCE.put(eClass().getEPackage().getNsURI(), eClass().getEPackage());

	Resource resource = RESOURCE_FACTORY.createResource(uri);

	CloseShieldInputStream closeShieldInputStream = new CloseShieldInputStream((InputStream) in);
	resource.load(closeShieldInputStream, null);
	EObject eObject = resource.getContents().get(0);

	List<EStructuralFeature> eStructuralFeatures = eObject.eClass().getEAllStructuralFeatures();
	for (EStructuralFeature eStructuralFeature : eStructuralFeatures) {
	    if (eStructuralFeature.isChangeable() && !eStructuralFeature.isUnsettable()) {
		this.eSet(eStructuralFeature, eObject.eGet(eStructuralFeature, true));
	    }
	}
    }

    private static class CloseShieldInputStream extends InputStream {
	private final InputStream in;

	public CloseShieldInputStream(final InputStream in) throws IOException {
	    this.in = in;
	}

	@Override
	public void close() throws IOException {
	}

	@Override
	public int read() throws IOException {
	    return in.read();
	}
    }

    /**
     * <p>
     * Classe per la gestione della serializzazione in xmi con alcune ottimizzazioni
     * </p>
     * 
     * 
     */
    private static class PerformantXMIResourceFactoryImpl extends ResourceFactoryImpl {
	@SuppressWarnings("unchecked")
	private final List lookupTable = new ArrayList();

	private final XMLParserPool parserPool = new XMLParserPoolImpl();

	@SuppressWarnings("unchecked")
	private final Map nameToFeatureMap = new HashMap();

	@Override
	public Resource createResource(final URI uri) {
	    XMIResource resource = new XMIResourceImpl(uri);

	    Map<Object, Object> saveOptions = resource.getDefaultSaveOptions();
	    saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
	    saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, lookupTable);

	    Map<Object, Object> loadOptions = resource.getDefaultLoadOptions();
	    loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
	    loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
	    loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
	    loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, parserPool);
	    loadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, nameToFeatureMap);

	    return resource;
	}
    }
}
