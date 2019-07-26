/**
 */
package it.caicividale.corsicai.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ETitolo Istruttore</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.caicividale.corsicai.model.ModelPackage#getETitoloIstruttore()
 * @model
 * @generated
 */
public enum ETitoloIstruttore implements Enumerator {
	/**
	 * The '<em><b>ISTRUTTORE SEZIONALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRUTTORE_SEZIONALE_VALUE
	 * @generated
	 * @ordered
	 */
	ISTRUTTORE_SEZIONALE(0, "ISTRUTTORE_SEZIONALE", "IS"),

	/**
	 * The '<em><b>ISTRUTTORE ALPINISMO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRUTTORE_ALPINISMO_VALUE
	 * @generated
	 * @ordered
	 */
	ISTRUTTORE_ALPINISMO(1, "ISTRUTTORE_ALPINISMO", "IA"),

	/**
	 * The '<em><b>ISTRUTTORE SCIALPINISMO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRUTTORE_SCIALPINISMO_VALUE
	 * @generated
	 * @ordered
	 */
	ISTRUTTORE_SCIALPINISMO(2, "ISTRUTTORE_SCIALPINISMO", "ISA"),

	/**
	 * The '<em><b>ISTRUTTORE SCI FONDO ESCURSIONISMO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRUTTORE_SCI_FONDO_ESCURSIONISMO_VALUE
	 * @generated
	 * @ordered
	 */
	ISTRUTTORE_SCI_FONDO_ESCURSIONISMO(3, "ISTRUTTORE_SCI_FONDO_ESCURSIONISMO", "ISFE"),

	/**
	 * The '<em><b>ISTRUTTORE NAZIONALE ALPINISMO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRUTTORE_NAZIONALE_ALPINISMO_VALUE
	 * @generated
	 * @ordered
	 */
	ISTRUTTORE_NAZIONALE_ALPINISMO(4, "ISTRUTTORE_NAZIONALE_ALPINISMO", "INA"),

	/**
	 * The '<em><b>ISTRUTTORE NAZIONALE SCIALPINISMO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRUTTORE_NAZIONALE_SCIALPINISMO_VALUE
	 * @generated
	 * @ordered
	 */
	ISTRUTTORE_NAZIONALE_SCIALPINISMO(5, "ISTRUTTORE_NAZIONALE_SCIALPINISMO", "INSA"),

	/**
	 * The '<em><b>ASPIRANTE ISTRUTTORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASPIRANTE_ISTRUTTORE_VALUE
	 * @generated
	 * @ordered
	 */
	ASPIRANTE_ISTRUTTORE(6, "ASPIRANTE_ISTRUTTORE", "ASP");

	/**
	 * The '<em><b>ISTRUTTORE SEZIONALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRUTTORE_SEZIONALE
	 * @model literal="IS"
	 * @generated
	 * @ordered
	 */
	public static final int ISTRUTTORE_SEZIONALE_VALUE = 0;

	/**
	 * The '<em><b>ISTRUTTORE ALPINISMO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRUTTORE_ALPINISMO
	 * @model literal="IA"
	 * @generated
	 * @ordered
	 */
	public static final int ISTRUTTORE_ALPINISMO_VALUE = 1;

	/**
	 * The '<em><b>ISTRUTTORE SCIALPINISMO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRUTTORE_SCIALPINISMO
	 * @model literal="ISA"
	 * @generated
	 * @ordered
	 */
	public static final int ISTRUTTORE_SCIALPINISMO_VALUE = 2;

	/**
	 * The '<em><b>ISTRUTTORE SCI FONDO ESCURSIONISMO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRUTTORE_SCI_FONDO_ESCURSIONISMO
	 * @model literal="ISFE"
	 * @generated
	 * @ordered
	 */
	public static final int ISTRUTTORE_SCI_FONDO_ESCURSIONISMO_VALUE = 3;

	/**
	 * The '<em><b>ISTRUTTORE NAZIONALE ALPINISMO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRUTTORE_NAZIONALE_ALPINISMO
	 * @model literal="INA"
	 * @generated
	 * @ordered
	 */
	public static final int ISTRUTTORE_NAZIONALE_ALPINISMO_VALUE = 4;

	/**
	 * The '<em><b>ISTRUTTORE NAZIONALE SCIALPINISMO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISTRUTTORE_NAZIONALE_SCIALPINISMO
	 * @model literal="INSA"
	 * @generated
	 * @ordered
	 */
	public static final int ISTRUTTORE_NAZIONALE_SCIALPINISMO_VALUE = 5;

	/**
	 * The '<em><b>ASPIRANTE ISTRUTTORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASPIRANTE_ISTRUTTORE
	 * @model literal="ASP"
	 * @generated
	 * @ordered
	 */
	public static final int ASPIRANTE_ISTRUTTORE_VALUE = 6;

	/**
	 * An array of all the '<em><b>ETitolo Istruttore</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ETitoloIstruttore[] VALUES_ARRAY = new ETitoloIstruttore[] { ISTRUTTORE_SEZIONALE,
			ISTRUTTORE_ALPINISMO, ISTRUTTORE_SCIALPINISMO, ISTRUTTORE_SCI_FONDO_ESCURSIONISMO,
			ISTRUTTORE_NAZIONALE_ALPINISMO, ISTRUTTORE_NAZIONALE_SCIALPINISMO, ASPIRANTE_ISTRUTTORE, };

	/**
	 * A public read-only list of all the '<em><b>ETitolo Istruttore</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ETitoloIstruttore> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ETitolo Istruttore</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ETitoloIstruttore get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETitoloIstruttore result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETitolo Istruttore</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ETitoloIstruttore getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETitoloIstruttore result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETitolo Istruttore</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ETitoloIstruttore get(int value) {
		switch (value) {
		case ISTRUTTORE_SEZIONALE_VALUE:
			return ISTRUTTORE_SEZIONALE;
		case ISTRUTTORE_ALPINISMO_VALUE:
			return ISTRUTTORE_ALPINISMO;
		case ISTRUTTORE_SCIALPINISMO_VALUE:
			return ISTRUTTORE_SCIALPINISMO;
		case ISTRUTTORE_SCI_FONDO_ESCURSIONISMO_VALUE:
			return ISTRUTTORE_SCI_FONDO_ESCURSIONISMO;
		case ISTRUTTORE_NAZIONALE_ALPINISMO_VALUE:
			return ISTRUTTORE_NAZIONALE_ALPINISMO;
		case ISTRUTTORE_NAZIONALE_SCIALPINISMO_VALUE:
			return ISTRUTTORE_NAZIONALE_SCIALPINISMO;
		case ASPIRANTE_ISTRUTTORE_VALUE:
			return ASPIRANTE_ISTRUTTORE;
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
	private ETitoloIstruttore(int value, String name, String literal) {
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

} //ETitoloIstruttore
