/**
 */
package it.caicividale.scuola.emf.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ESesso</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.caicividale.scuola.emf.model.ModelPackage#getESesso()
 * @model
 * @generated
 */
public enum ESesso implements Enumerator {
    /**
     * The '<em><b>MASCHIO</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MASCHIO_VALUE
     * @generated
     * @ordered
     */
    MASCHIO(0, "MASCHIO", "M"),

    /**
     * The '<em><b>FEMMINA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FEMMINA_VALUE
     * @generated
     * @ordered
     */
    FEMMINA(1, "FEMMINA", "F");

    /**
     * The '<em><b>MASCHIO</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MASCHIO
     * @model literal="M"
     * @generated
     * @ordered
     */
    public static final int MASCHIO_VALUE = 0;

    /**
     * The '<em><b>FEMMINA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FEMMINA
     * @model literal="F"
     * @generated
     * @ordered
     */
    public static final int FEMMINA_VALUE = 1;

    /**
     * An array of all the '<em><b>ESesso</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ESesso[] VALUES_ARRAY = new ESesso[] { MASCHIO, FEMMINA, };

    /**
     * A public read-only list of all the '<em><b>ESesso</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ESesso> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>ESesso</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ESesso get(String literal) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    ESesso result = VALUES_ARRAY[i];
	    if (result.toString().equals(literal)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>ESesso</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ESesso getByName(String name) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    ESesso result = VALUES_ARRAY[i];
	    if (result.getName().equals(name)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>ESesso</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ESesso get(int value) {
	switch (value) {
	case MASCHIO_VALUE:
	    return MASCHIO;
	case FEMMINA_VALUE:
	    return FEMMINA;
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
    private ESesso(int value, String name, String literal) {
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

} //ESesso
