/**
 */
package it.caicividale.scuola.emf.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ETipo Voce Di Spesa</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.caicividale.scuola.emf.model.ModelPackage#getETipoVoceDiSpesa()
 * @model
 * @generated
 */
public enum ETipoVoceDiSpesa implements Enumerator {
    /**
     * The '<em><b>ENTRATA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENTRATA_VALUE
     * @generated
     * @ordered
     */
    ENTRATA(0, "ENTRATA", "ENTRATA"),

    /**
     * The '<em><b>USCITA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #USCITA_VALUE
     * @generated
     * @ordered
     */
    USCITA(1, "USCITA", "USCITA");

    /**
     * The '<em><b>ENTRATA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENTRATA
     * @model
     * @generated
     * @ordered
     */
    public static final int ENTRATA_VALUE = 0;

    /**
     * The '<em><b>USCITA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #USCITA
     * @model
     * @generated
     * @ordered
     */
    public static final int USCITA_VALUE = 1;

    /**
     * An array of all the '<em><b>ETipo Voce Di Spesa</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ETipoVoceDiSpesa[] VALUES_ARRAY = new ETipoVoceDiSpesa[] { ENTRATA, USCITA, };

    /**
     * A public read-only list of all the '<em><b>ETipo Voce Di Spesa</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ETipoVoceDiSpesa> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>ETipo Voce Di Spesa</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ETipoVoceDiSpesa get(String literal) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    ETipoVoceDiSpesa result = VALUES_ARRAY[i];
	    if (result.toString().equals(literal)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>ETipo Voce Di Spesa</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ETipoVoceDiSpesa getByName(String name) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
	    ETipoVoceDiSpesa result = VALUES_ARRAY[i];
	    if (result.getName().equals(name)) {
		return result;
	    }
	}
	return null;
    }

    /**
     * Returns the '<em><b>ETipo Voce Di Spesa</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ETipoVoceDiSpesa get(int value) {
	switch (value) {
	case ENTRATA_VALUE:
	    return ENTRATA;
	case USCITA_VALUE:
	    return USCITA;
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
    private ETipoVoceDiSpesa(int value, String name, String literal) {
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

} //ETipoVoceDiSpesa
