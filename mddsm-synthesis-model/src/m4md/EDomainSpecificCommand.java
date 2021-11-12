/**
 */
package m4md;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDomain Specific Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m4md.EDomainSpecificCommand#getCmdId <em>Cmd Id</em>}</li>
 * </ul>
 *
 * @see m4md.M4mdPackage#getEDomainSpecificCommand()
 * @model abstract="true"
 * @generated
 */
public interface EDomainSpecificCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Cmd Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd Id</em>' attribute.
	 * @see #setCmdId(int)
	 * @see m4md.M4mdPackage#getEDomainSpecificCommand_CmdId()
	 * @model
	 * @generated
	 */
	int getCmdId();

	/**
	 * Sets the value of the '{@link m4md.EDomainSpecificCommand#getCmdId <em>Cmd Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd Id</em>' attribute.
	 * @see #getCmdId()
	 * @generated
	 */
	void setCmdId(int value);

} // EDomainSpecificCommand
