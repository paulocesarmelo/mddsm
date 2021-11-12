/**
 */
package testing2;

import m4md.EControlSchema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testing2.TestingCS#getCsId <em>Cs Id</em>}</li>
 * </ul>
 *
 * @see testing2.Testing2Package#getTestingCS()
 * @model
 * @generated
 */
public interface TestingCS extends EControlSchema {
	/**
	 * Returns the value of the '<em><b>Cs Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Id</em>' attribute.
	 * @see #setCsId(int)
	 * @see testing2.Testing2Package#getTestingCS_CsId()
	 * @model
	 * @generated
	 */
	int getCsId();

	/**
	 * Sets the value of the '{@link testing2.TestingCS#getCsId <em>Cs Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Id</em>' attribute.
	 * @see #getCsId()
	 * @generated
	 */
	void setCsId(int value);

} // TestingCS
