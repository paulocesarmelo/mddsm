/**
 */
package adapter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECommunication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adapter.ECommunication#getApi <em>Api</em>}</li>
 *   <li>{@link adapter.ECommunication#getTarget <em>Target</em>}</li>
 *   <li>{@link adapter.ECommunication#getDataSupported <em>Data Supported</em>}</li>
 * </ul>
 *
 * @see adapter.AdapterPackage#getECommunication()
 * @model
 * @generated
 */
public interface ECommunication extends EObject {
	/**
	 * Returns the value of the '<em><b>Api</b></em>' attribute.
	 * The literals are from the enumeration {@link adapter.ECommAPI}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' attribute.
	 * @see adapter.ECommAPI
	 * @see #setApi(ECommAPI)
	 * @see adapter.AdapterPackage#getECommunication_Api()
	 * @model
	 * @generated
	 */
	ECommAPI getApi();

	/**
	 * Sets the value of the '{@link adapter.ECommunication#getApi <em>Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' attribute.
	 * @see adapter.ECommAPI
	 * @see #getApi()
	 * @generated
	 */
	void setApi(ECommAPI value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.EComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see adapter.AdapterPackage#getECommunication_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<EComponent> getTarget();

	/**
	 * Returns the value of the '<em><b>Data Supported</b></em>' attribute.
	 * The literals are from the enumeration {@link adapter.EDataFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Supported</em>' attribute.
	 * @see adapter.EDataFormat
	 * @see #setDataSupported(EDataFormat)
	 * @see adapter.AdapterPackage#getECommunication_DataSupported()
	 * @model
	 * @generated
	 */
	EDataFormat getDataSupported();

	/**
	 * Sets the value of the '{@link adapter.ECommunication#getDataSupported <em>Data Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Supported</em>' attribute.
	 * @see adapter.EDataFormat
	 * @see #getDataSupported()
	 * @generated
	 */
	void setDataSupported(EDataFormat value);

} // ECommunication
