/**
 */
package m4md;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EInteraction Behavior</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see m4md.M4mdPackage#getEInteractionBehavior()
 * @model
 * @generated
 */
public enum EInteractionBehavior implements Enumerator {
	/**
	 * The '<em><b>SYNC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNC_VALUE
	 * @generated
	 * @ordered
	 */
	SYNC(0, "SYNC", "SYNC"),

	/**
	 * The '<em><b>ASYNC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNC_VALUE
	 * @generated
	 * @ordered
	 */
	ASYNC(1, "ASYNC", "ASYNC");

	/**
	 * The '<em><b>SYNC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYNC_VALUE = 0;

	/**
	 * The '<em><b>ASYNC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASYNC_VALUE = 1;

	/**
	 * An array of all the '<em><b>EInteraction Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EInteractionBehavior[] VALUES_ARRAY =
		new EInteractionBehavior[] {
			SYNC,
			ASYNC,
		};

	/**
	 * A public read-only list of all the '<em><b>EInteraction Behavior</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EInteractionBehavior> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EInteraction Behavior</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EInteractionBehavior get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EInteractionBehavior result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EInteraction Behavior</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EInteractionBehavior getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EInteractionBehavior result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EInteraction Behavior</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EInteractionBehavior get(int value) {
		switch (value) {
			case SYNC_VALUE: return SYNC;
			case ASYNC_VALUE: return ASYNC;
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
	private EInteractionBehavior(int value, String name, String literal) {
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
	
} //EInteractionBehavior
