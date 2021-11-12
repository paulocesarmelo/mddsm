/**
 */
package testing2;

import m4md.EDomainSchema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testing2.TestingSchema#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see testing2.Testing2Package#getTestingSchema()
 * @model
 * @generated
 */
public interface TestingSchema extends EDomainSchema {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see testing2.Testing2Package#getTestingSchema_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link testing2.TestingSchema#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // TestingSchema
