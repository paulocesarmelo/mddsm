/**
 */
package mgridml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mgridml.MgridmlPackage#getControlEnum()
 * @model
 * @generated
 */
public enum ControlEnum implements Enumerator {
	/**
	 * The '<em><b>CONTROLLABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLABLE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLLABLE(0, "CONTROLLABLE", "CONTROLLABLE"),

	/**
	 * The '<em><b>NON CONTROLLABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_CONTROLLABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NON_CONTROLLABLE(1, "NON_CONTROLLABLE", "NON_CONTROLLABLE");

	/**
	 * The '<em><b>CONTROLLABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLLABLE_VALUE = 0;

	/**
	 * The '<em><b>NON CONTROLLABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_CONTROLLABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_CONTROLLABLE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Control Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlEnum[] VALUES_ARRAY =
		new ControlEnum[] {
			CONTROLLABLE,
			NON_CONTROLLABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Control Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlEnum get(int value) {
		switch (value) {
			case CONTROLLABLE_VALUE: return CONTROLLABLE;
			case NON_CONTROLLABLE_VALUE: return NON_CONTROLLABLE;
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
	private ControlEnum(int value, String name, String literal) {
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
	
} //ControlEnum
