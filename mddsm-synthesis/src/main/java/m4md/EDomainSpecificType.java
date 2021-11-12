/**
 */
package m4md;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDomain Specific Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m4md.EDomainSpecificType#getInteractionBehavior <em>Interaction Behavior</em>}</li>
 *   <li>{@link m4md.EDomainSpecificType#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see m4md.M4mdPackage#getEDomainSpecificType()
 * @model abstract="true"
 * @generated
 */
public interface EDomainSpecificType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interaction Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link m4md.EInteractionBehavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Behavior</em>' attribute.
	 * @see m4md.EInteractionBehavior
	 * @see #setInteractionBehavior(EInteractionBehavior)
	 * @see m4md.M4mdPackage#getEDomainSpecificType_InteractionBehavior()
	 * @model
	 * @generated
	 */
	EInteractionBehavior getInteractionBehavior();

	/**
	 * Sets the value of the '{@link m4md.EDomainSpecificType#getInteractionBehavior <em>Interaction Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Behavior</em>' attribute.
	 * @see m4md.EInteractionBehavior
	 * @see #getInteractionBehavior()
	 * @generated
	 */
	void setInteractionBehavior(EInteractionBehavior value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link m4md.ECardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see m4md.ECardinality
	 * @see #setCardinality(ECardinality)
	 * @see m4md.M4mdPackage#getEDomainSpecificType_Cardinality()
	 * @model
	 * @generated
	 */
	ECardinality getCardinality();

	/**
	 * Sets the value of the '{@link m4md.EDomainSpecificType#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see m4md.ECardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(ECardinality value);

} // EDomainSpecificType
