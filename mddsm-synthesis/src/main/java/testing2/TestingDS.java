/**
 */
package testing2;

import m4md.EDataSchema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing DS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testing2.TestingDS#getDsId <em>Ds Id</em>}</li>
 * </ul>
 *
 * @see testing2.Testing2Package#getTestingDS()
 * @model
 * @generated
 */
public interface TestingDS extends EDataSchema {
	/**
	 * Returns the value of the '<em><b>Ds Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ds Id</em>' attribute.
	 * @see #setDsId(int)
	 * @see testing2.Testing2Package#getTestingDS_DsId()
	 * @model
	 * @generated
	 */
	int getDsId();

	/**
	 * Sets the value of the '{@link testing2.TestingDS#getDsId <em>Ds Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ds Id</em>' attribute.
	 * @see #getDsId()
	 * @generated
	 */
	void setDsId(int value);

} // TestingDS
