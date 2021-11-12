/**
 */
package mgridml;

import m4md.EDomainSchema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MGrid Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.MGridSchema#getMgridModelID <em>Mgrid Model ID</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getMGridSchema()
 * @model
 * @generated
 */
public interface MGridSchema extends EDomainSchema {
	/**
	 * Returns the value of the '<em><b>Mgrid Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mgrid Model ID</em>' attribute.
	 * @see #setMgridModelID(String)
	 * @see mgridml.MgridmlPackage#getMGridSchema_MgridModelID()
	 * @model
	 * @generated
	 */
	String getMgridModelID();

	/**
	 * Sets the value of the '{@link mgridml.MGridSchema#getMgridModelID <em>Mgrid Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mgrid Model ID</em>' attribute.
	 * @see #getMgridModelID()
	 * @generated
	 */
	void setMgridModelID(String value);

} // MGridSchema
