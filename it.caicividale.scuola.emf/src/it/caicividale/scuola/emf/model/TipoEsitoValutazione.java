/**
 */
package it.caicividale.scuola.emf.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Esito Valutazione</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.caicividale.scuola.emf.model.ModelPackage#getTipoEsitoValutazione()
 * @model
 * @generated
 */
public enum TipoEsitoValutazione implements Enumerator {
    /**
     * The '<em><b>OTTIMO</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTTIMO_VALUE
     * @generated
     * @ordered
     */
    OTTIMO(0, "OTTIMO", "O"),

    /**
     * The '<em><b>BUONO</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUONO_VALUE
     * @generated
     * @ordered
     */
    BUONO(1, "BUONO", "B"),

    /**
     * The '<em><b>SUFFICIENTE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUFFICIENTE_VALUE
     * @generated
     * @ordered
     */
    SUFFICIENTE(2, "SUFFICIENTE", "S"),

    /**
     * The '<em><b>INSUFFICIENTE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSUFFICIENTE_VALUE
     * @generated
     * @ordered
     */
    INSUFFICIENTE(3, "INSUFFICIENTE", "I");

    /**
     * The '<em><b>OTTIMO</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OTTIMO
     * @model literal="O"
     * @generated
     * @ordered
     */
    public static final int OTTIMO_VALUE = 0;

    /**
     * The '<em><b>BUONO</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BUONO
     * @model literal="B"
     * @generated
     * @ordered
     */
    public static final int BUONO_VALUE = 1;

    /**
     * The '<em><b>SUFFICIENTE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUFFICIENTE
     * @model literal="S"
     * @generated
     * @ordered
     */
    public static final int SUFFICIENTE_VALUE = 2;

    /**
     * The '<em><b>INSUFFICIENTE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INSUFFICIENTE
     * @model literal="I"
     * @generated
     * @ordered
     */
    public static final int INSUFFICIENTE_VALUE = 3;

    /**
     * An array of all the '<em><b>Tipo Esito Valutazione</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TipoEsitoValutazione[] VALUES_ARRAY = new TipoEsitoValutazione[] { OTTIMO, BUONO, SUFFICIENTE,
	    INSUFFICIENTE, };

    /**
     * A public read-only list of all the '<em><b>Tipo Esito Valutazione</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<TipoEsitoValutazione> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Tipo Esito Valutazione</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TipoEsitoValutazione get(String literal) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    TipoEsitoValutazione result = VALUES_ARRAY[i];
	    if (result.toString().equals(literal)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>Tipo Esito Valutazione</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TipoEsitoValutazione getByName(String name) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    TipoEsitoValutazione result = VALUES_ARRAY[i];
	    if (result.getName().equals(name)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>Tipo Esito Valutazione</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static TipoEsitoValutazione get(int value) {
	switch (value) {
	case OTTIMO_VALUE:
	    return OTTIMO;
	case BUONO_VALUE:
	    return BUONO;
	case SUFFICIENTE_VALUE:
	    return SUFFICIENTE;
	case INSUFFICIENTE_VALUE:
	    return INSUFFICIENTE;
	}
	return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private TipoEsitoValutazione(int value, String name, String literal) {
	this.value = value;
	this.name = name;
	this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
	return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
	return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
	return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
	return literal;
    }

} //TipoEsitoValutazione
