/**
 */
package testing2;

import m4md.EDomainSpecificCommand;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testing2.ClassCommand#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @see testing2.Testing2Package#getClassCommand()
 * @model
 * @generated
 */
public interface ClassCommand extends EDomainSpecificCommand {
	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' attribute list.
	 * The list contents are of type {@link testing2.CmdType}.
	 * The literals are from the enumeration {@link testing2.CmdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' attribute list.
	 * @see testing2.CmdType
	 * @see testing2.Testing2Package#getClassCommand_Cmd()
	 * @model
	 * @generated
	 */
	EList<CmdType> getCmd();

} // ClassCommand
