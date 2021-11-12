/**
 */
package mgridml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.AtomicController#getControllerID <em>Controller ID</em>}</li>
 *   <li>{@link mgridml.AtomicController#getName <em>Name</em>}</li>
 *   <li>{@link mgridml.AtomicController#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link mgridml.AtomicController#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getAtomicController()
 * @model
 * @generated
 */
public interface AtomicController extends MGController {
	/**
	 * Returns the value of the '<em><b>Controller ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller ID</em>' attribute.
	 * @see #setControllerID(String)
	 * @see mgridml.MgridmlPackage#getAtomicController_ControllerID()
	 * @model
	 * @generated
	 */
	String getControllerID();

	/**
	 * Sets the value of the '{@link mgridml.AtomicController#getControllerID <em>Controller ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller ID</em>' attribute.
	 * @see #getControllerID()
	 * @generated
	 */
	void setControllerID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mgridml.MgridmlPackage#getAtomicController_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mgridml.AtomicController#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(int)
	 * @see mgridml.MgridmlPackage#getAtomicController_Cardinality()
	 * @model
	 * @generated
	 */
	int getCardinality();

	/**
	 * Sets the value of the '{@link mgridml.AtomicController#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mgridml.MgridmlPackage#getAtomicController_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mgridml.AtomicController#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // AtomicController
