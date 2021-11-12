/**
 */
package testing2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cmd Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see testing2.Testing2Package#getCmdType()
 * @model
 * @generated
 */
public enum CmdType implements Enumerator {
	/**
	 * The '<em><b>Start Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	START_DEVICE(0, "startDevice", "startDevice"),

	/**
	 * The '<em><b>Stop Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_DEVICE(1, "stopDevice", "stopDevice"),

	/**
	 * The '<em><b>Verify Status</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFY_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFY_STATUS(2, "verifyStatus", "verifyStatus"),

	/**
	 * The '<em><b>Test Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_DEVICE(3, "testDevice", "testDevice"),

	/**
	 * The '<em><b>Set Wait Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_WAIT_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	SET_WAIT_MODE(4, "setWaitMode", "setWaitMode");

	/**
	 * The '<em><b>Start Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_DEVICE
	 * @model name="startDevice"
	 * @generated
	 * @ordered
	 */
	public static final int START_DEVICE_VALUE = 0;

	/**
	 * The '<em><b>Stop Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_DEVICE
	 * @model name="stopDevice"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_DEVICE_VALUE = 1;

	/**
	 * The '<em><b>Verify Status</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFY_STATUS
	 * @model name="verifyStatus"
	 * @generated
	 * @ordered
	 */
	public static final int VERIFY_STATUS_VALUE = 2;

	/**
	 * The '<em><b>Test Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_DEVICE
	 * @model name="testDevice"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DEVICE_VALUE = 3;

	/**
	 * The '<em><b>Set Wait Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_WAIT_MODE
	 * @model name="setWaitMode"
	 * @generated
	 * @ordered
	 */
	public static final int SET_WAIT_MODE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Cmd Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CmdType[] VALUES_ARRAY =
		new CmdType[] {
			START_DEVICE,
			STOP_DEVICE,
			VERIFY_STATUS,
			TEST_DEVICE,
			SET_WAIT_MODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Cmd Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CmdType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cmd Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CmdType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CmdType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cmd Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CmdType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CmdType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cmd Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CmdType get(int value) {
		switch (value) {
			case START_DEVICE_VALUE: return START_DEVICE;
			case STOP_DEVICE_VALUE: return STOP_DEVICE;
			case VERIFY_STATUS_VALUE: return VERIFY_STATUS;
			case TEST_DEVICE_VALUE: return TEST_DEVICE;
			case SET_WAIT_MODE_VALUE: return SET_WAIT_MODE;
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
	private CmdType(int value, String name, String literal) {
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
	
} //CmdType
