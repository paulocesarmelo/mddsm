/**
 */
package testing;

import metalang4md.EActor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testing.ClassActor#getCmd <em>Cmd</em>}</li>
 *   <li>{@link testing.ClassActor#getCmd2 <em>Cmd2</em>}</li>
 * </ul>
 *
 * @see testing.TestingPackage#getClassActor()
 * @model
 * @generated
 */
public interface ClassActor extends EActor, BaseClass {
	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' attribute list.
	 * The list contents are of type {@link testing.CmdType}.
	 * The literals are from the enumeration {@link testing.CmdType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' attribute list.
	 * @see testing.CmdType
	 * @see testing.TestingPackage#getClassActor_Cmd()
	 * @model
	 * @generated
	 */
	EList<CmdType> getCmd();

	/**
	 * Returns the value of the '<em><b>Cmd2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd2</em>' containment reference.
	 * @see #setCmd2(ClassCommand)
	 * @see testing.TestingPackage#getClassActor_Cmd2()
	 * @model containment="true"
	 * @generated
	 */
	ClassCommand getCmd2();

	/**
	 * Sets the value of the '{@link testing.ClassActor#getCmd2 <em>Cmd2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd2</em>' containment reference.
	 * @see #getCmd2()
	 * @generated
	 */
	void setCmd2(ClassCommand value);

} // ClassActor
