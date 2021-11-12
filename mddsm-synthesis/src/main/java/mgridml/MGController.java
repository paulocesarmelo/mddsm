/**
 */
package mgridml;

import m4md.EActor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MG Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.MGController#getCtypeID <em>Ctype ID</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getMGController()
 * @model
 * @generated
 */
public interface MGController extends EActor {
	/**
	 * Returns the value of the '<em><b>Ctype ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctype ID</em>' attribute.
	 * @see #setCtypeID(String)
	 * @see mgridml.MgridmlPackage#getMGController_CtypeID()
	 * @model
	 * @generated
	 */
	String getCtypeID();

	/**
	 * Sets the value of the '{@link mgridml.MGController#getCtypeID <em>Ctype ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctype ID</em>' attribute.
	 * @see #getCtypeID()
	 * @generated
	 */
	void setCtypeID(String value);

} // MGController
