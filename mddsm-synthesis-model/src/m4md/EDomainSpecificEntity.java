/**
 */
package m4md;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDomain Specific Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m4md.EDomainSpecificEntity#getCommandPriority <em>Command Priority</em>}</li>
 *   <li>{@link m4md.EDomainSpecificEntity#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @see m4md.M4mdPackage#getEDomainSpecificEntity()
 * @model abstract="true"
 * @generated
 */
public interface EDomainSpecificEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Priority</em>' attribute.
	 * @see #setCommandPriority(int)
	 * @see m4md.M4mdPackage#getEDomainSpecificEntity_CommandPriority()
	 * @model
	 * @generated
	 */
	int getCommandPriority();

	/**
	 * Sets the value of the '{@link m4md.EDomainSpecificEntity#getCommandPriority <em>Command Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Priority</em>' attribute.
	 * @see #getCommandPriority()
	 * @generated
	 */
	void setCommandPriority(int value);

	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' containment reference list.
	 * The list contents are of type {@link m4md.EDomainSpecificCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' containment reference list.
	 * @see m4md.M4mdPackage#getEDomainSpecificEntity_Cmd()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDomainSpecificCommand> getCmd();

} // EDomainSpecificEntity
