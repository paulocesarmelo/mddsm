/**
 */
package m4md;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EActor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m4md.EActor#getKindInteraction <em>Kind Interaction</em>}</li>
 *   <li>{@link m4md.EActor#getTypesControlled <em>Types Controlled</em>}</li>
 * </ul>
 *
 * @see m4md.M4mdPackage#getEActor()
 * @model abstract="true"
 * @generated
 */
public interface EActor extends EDomainSpecificEntity {
	/**
	 * Returns the value of the '<em><b>Kind Interaction</b></em>' attribute.
	 * The literals are from the enumeration {@link m4md.ECoordinationBehavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Interaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Interaction</em>' attribute.
	 * @see m4md.ECoordinationBehavior
	 * @see #setKindInteraction(ECoordinationBehavior)
	 * @see m4md.M4mdPackage#getEActor_KindInteraction()
	 * @model
	 * @generated
	 */
	ECoordinationBehavior getKindInteraction();

	/**
	 * Sets the value of the '{@link m4md.EActor#getKindInteraction <em>Kind Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Interaction</em>' attribute.
	 * @see m4md.ECoordinationBehavior
	 * @see #getKindInteraction()
	 * @generated
	 */
	void setKindInteraction(ECoordinationBehavior value);

	/**
	 * Returns the value of the '<em><b>Types Controlled</b></em>' containment reference list.
	 * The list contents are of type {@link m4md.EDomainSpecificType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types Controlled</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Controlled</em>' containment reference list.
	 * @see m4md.M4mdPackage#getEActor_TypesControlled()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDomainSpecificType> getTypesControlled();

} // EActor
