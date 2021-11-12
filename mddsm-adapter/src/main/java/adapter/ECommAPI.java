/**
 */
package adapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EComm API</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see adapter.AdapterPackage#getECommAPI()
 * @model
 * @generated
 */
public enum ECommAPI implements Enumerator {
	/**
	 * The '<em><b>REST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REST_VALUE
	 * @generated
	 * @ordered
	 */
	REST(0, "REST", "REST"),

	/**
	 * The '<em><b>GRAPHQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHQL_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPHQL(1, "GRAPHQL", "GRAPHQL"),

	/**
	 * The '<em><b>GRPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRPC_VALUE
	 * @generated
	 * @ordered
	 */
	GRPC(2, "GRPC", "GRPC"),

	/**
	 * The '<em><b>WEBHOOKS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEBHOOKS_VALUE
	 * @generated
	 * @ordered
	 */
	WEBHOOKS(3, "WEBHOOKS", "WEBHOOKS");

	/**
	 * The '<em><b>REST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REST_VALUE = 0;

	/**
	 * The '<em><b>GRAPHQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPHQL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRAPHQL_VALUE = 1;

	/**
	 * The '<em><b>GRPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRPC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRPC_VALUE = 2;

	/**
	 * The '<em><b>WEBHOOKS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEBHOOKS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEBHOOKS_VALUE = 3;

	/**
	 * An array of all the '<em><b>EComm API</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ECommAPI[] VALUES_ARRAY =
		new ECommAPI[] {
			REST,
			GRAPHQL,
			GRPC,
			WEBHOOKS,
		};

	/**
	 * A public read-only list of all the '<em><b>EComm API</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ECommAPI> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EComm API</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ECommAPI get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ECommAPI result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EComm API</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ECommAPI getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ECommAPI result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EComm API</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ECommAPI get(int value) {
		switch (value) {
			case REST_VALUE: return REST;
			case GRAPHQL_VALUE: return GRAPHQL;
			case GRPC_VALUE: return GRPC;
			case WEBHOOKS_VALUE: return WEBHOOKS;
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
	private ECommAPI(int value, String name, String literal) {
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
	
} //ECommAPI
