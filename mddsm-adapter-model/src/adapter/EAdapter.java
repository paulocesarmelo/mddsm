/**
 */
package adapter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAdapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link adapter.EAdapter#getName <em>Name</em>}</li>
 *   <li>{@link adapter.EAdapter#getComm <em>Comm</em>}</li>
 *   <li>{@link adapter.EAdapter#getResources <em>Resources</em>}</li>
 *   <li>{@link adapter.EAdapter#getComponents <em>Components</em>}</li>
 *   <li>{@link adapter.EAdapter#getDscs <em>Dscs</em>}</li>
 *   <li>{@link adapter.EAdapter#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see adapter.AdapterPackage#getEAdapter()
 * @model
 * @generated
 */
public interface EAdapter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see adapter.AdapterPackage#getEAdapter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adapter.EAdapter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Comm</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.ECommunication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm</em>' containment reference list.
	 * @see adapter.AdapterPackage#getEAdapter_Comm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ECommunication> getComm();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.EResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see adapter.AdapterPackage#getEAdapter_Resources()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EResource> getResources();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.EComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see adapter.AdapterPackage#getEAdapter_Components()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<EComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Dscs</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.EDSCmd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dscs</em>' containment reference list.
	 * @see adapter.AdapterPackage#getEAdapter_Dscs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDSCmd> getDscs();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link adapter.EEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see adapter.AdapterPackage#getEAdapter_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<EEntity> getEntity();

} // EAdapter
