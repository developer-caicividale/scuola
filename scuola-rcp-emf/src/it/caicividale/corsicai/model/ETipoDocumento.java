/**
 */
package it.caicividale.corsicai.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ETipo Documento</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.caicividale.corsicai.model.ModelPackage#getETipoDocumento()
 * @model
 * @generated
 */
public enum ETipoDocumento implements Enumerator {
	/**
	 * The '<em><b>CONSENSO INFORMATO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENSO_INFORMATO_VALUE
	 * @generated
	 * @ordered
	 */
	CONSENSO_INFORMATO(0, "CONSENSO_INFORMATO", "CI"),

	/**
	 * The '<em><b>MODULO ISCRIZIONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULO_ISCRIZIONE_VALUE
	 * @generated
	 * @ordered
	 */
	MODULO_ISCRIZIONE(1, "MODULO_ISCRIZIONE", "MI"),

	/**
	 * The '<em><b>CERTIFICATO MEDICO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATO_MEDICO_VALUE
	 * @generated
	 * @ordered
	 */
	CERTIFICATO_MEDICO(2, "CERTIFICATO_MEDICO", "CM");

	/**
	 * The '<em><b>CONSENSO INFORMATO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENSO_INFORMATO
	 * @model literal="CI"
	 * @generated
	 * @ordered
	 */
	public static final int CONSENSO_INFORMATO_VALUE = 0;

	/**
	 * The '<em><b>MODULO ISCRIZIONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULO_ISCRIZIONE
	 * @model literal="MI"
	 * @generated
	 * @ordered
	 */
	public static final int MODULO_ISCRIZIONE_VALUE = 1;

	/**
	 * The '<em><b>CERTIFICATO MEDICO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CERTIFICATO_MEDICO
	 * @model literal="CM"
	 * @generated
	 * @ordered
	 */
	public static final int CERTIFICATO_MEDICO_VALUE = 2;

	/**
	 * An array of all the '<em><b>ETipo Documento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ETipoDocumento[] VALUES_ARRAY = new ETipoDocumento[] { CONSENSO_INFORMATO, MODULO_ISCRIZIONE,
			CERTIFICATO_MEDICO, };

	/**
	 * A public read-only list of all the '<em><b>ETipo Documento</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ETipoDocumento> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ETipo Documento</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ETipoDocumento get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETipoDocumento result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETipo Documento</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ETipoDocumento getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETipoDocumento result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETipo Documento</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ETipoDocumento get(int value) {
		switch (value) {
		case CONSENSO_INFORMATO_VALUE:
			return CONSENSO_INFORMATO;
		case MODULO_ISCRIZIONE_VALUE:
			return MODULO_ISCRIZIONE;
		case CERTIFICATO_MEDICO_VALUE:
			return CERTIFICATO_MEDICO;
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
	private ETipoDocumento(int value, String name, String literal) {
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

} //ETipoDocumento
