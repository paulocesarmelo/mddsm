/**
 */
package testing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testing.ClassCommand#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @see testing.TestingPackage#getClassCommand()
 * @model
 * @generated
 */
public interface ClassCommand extends EObject {
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
	 * @see testing.TestingPackage#getClassCommand_Cmd()
	 * @model
	 * @generated
	 */
	EList<CmdType> getCmd();

} // ClassCommand
