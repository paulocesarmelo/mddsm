/**
 */
package mgridml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Usage Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mgridml.MgridmlPackage#getUsageEnum()
 * @model
 * @generated
 */
public enum UsageEnum implements Enumerator {
	/**
	 * The '<em><b>HVAC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HVAC_VALUE
	 * @generated
	 * @ordered
	 */
	HVAC(0, "HVAC", "HVAC"),

	/**
	 * The '<em><b>LIGHTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTING_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTING(1, "LIGHTING", "LIGHTING"),

	/**
	 * The '<em><b>SMALL APPLS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_APPLS_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL_APPLS(2, "SMALL_APPLS", "SMALL_APPLS"),

	/**
	 * The '<em><b>LARGER APPLS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGER_APPLS_VALUE
	 * @generated
	 * @ordered
	 */
	LARGER_APPLS(3, "LARGER_APPLS", "LARGER_APPLS");

	/**
	 * The '<em><b>HVAC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HVAC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HVAC_VALUE = 0;

	/**
	 * The '<em><b>LIGHTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTING_VALUE = 1;

	/**
	 * The '<em><b>SMALL APPLS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_APPLS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_APPLS_VALUE = 2;

	/**
	 * The '<em><b>LARGER APPLS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGER_APPLS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LARGER_APPLS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Usage Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UsageEnum[] VALUES_ARRAY =
		new UsageEnum[] {
			HVAC,
			LIGHTING,
			SMALL_APPLS,
			LARGER_APPLS,
		};

	/**
	 * A public read-only list of all the '<em><b>Usage Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UsageEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Usage Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UsageEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UsageEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usage Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UsageEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UsageEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usage Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UsageEnum get(int value) {
		switch (value) {
			case HVAC_VALUE: return HVAC;
			case LIGHTING_VALUE: return LIGHTING;
			case SMALL_APPLS_VALUE: return SMALL_APPLS;
			case LARGER_APPLS_VALUE: return LARGER_APPLS;
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
	private UsageEnum(int value, String name, String literal) {
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
	
} //UsageEnum
