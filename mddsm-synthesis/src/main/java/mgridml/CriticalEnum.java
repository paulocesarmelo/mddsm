/**
 */
package mgridml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Critical Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mgridml.MgridmlPackage#getCriticalEnum()
 * @model
 * @generated
 */
public enum CriticalEnum implements Enumerator {
	/**
	 * The '<em><b>SENSITIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SENSITIVE(0, "SENSITIVE", "SENSITIVE"),

	/**
	 * The '<em><b>ADJUSTABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJUSTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	ADJUSTABLE(1, "ADJUSTABLE", "ADJUSTABLE"),

	/**
	 * The '<em><b>SHEDABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHEDABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SHEDABLE(2, "SHEDABLE", "SHEDABLE"),

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(3, "ANY", "ANY");

	/**
	 * The '<em><b>SENSITIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENSITIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SENSITIVE_VALUE = 0;

	/**
	 * The '<em><b>ADJUSTABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJUSTABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADJUSTABLE_VALUE = 1;

	/**
	 * The '<em><b>SHEDABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHEDABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHEDABLE_VALUE = 2;

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Critical Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CriticalEnum[] VALUES_ARRAY =
		new CriticalEnum[] {
			SENSITIVE,
			ADJUSTABLE,
			SHEDABLE,
			ANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Critical Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CriticalEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Critical Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CriticalEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CriticalEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Critical Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CriticalEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CriticalEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Critical Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CriticalEnum get(int value) {
		switch (value) {
			case SENSITIVE_VALUE: return SENSITIVE;
			case ADJUSTABLE_VALUE: return ADJUSTABLE;
			case SHEDABLE_VALUE: return SHEDABLE;
			case ANY_VALUE: return ANY;
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
	private CriticalEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //CriticalEnum
