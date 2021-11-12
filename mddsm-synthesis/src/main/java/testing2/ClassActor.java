/**
 */
package testing2;

import m4md.EActor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testing2.ClassActor#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see testing2.Testing2Package#getClassActor()
 * @model
 * @generated
 */
public interface ClassActor extends EActor {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testing2.Testing2Package#getClassActor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testing2.ClassActor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ClassActor
