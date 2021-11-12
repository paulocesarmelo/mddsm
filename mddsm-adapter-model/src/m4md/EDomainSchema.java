/**
 */
package m4md;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDomain Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m4md.EDomainSchema#getCs <em>Cs</em>}</li>
 *   <li>{@link m4md.EDomainSchema#getDs <em>Ds</em>}</li>
 * </ul>
 *
 * @see m4md.M4mdPackage#getEDomainSchema()
 * @model
 * @generated
 */
public interface EDomainSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Cs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs</em>' containment reference.
	 * @see #setCs(EControlSchema)
	 * @see m4md.M4mdPackage#getEDomainSchema_Cs()
	 * @model containment="true"
	 * @generated
	 */
	EControlSchema getCs();

	/**
	 * Sets the value of the '{@link m4md.EDomainSchema#getCs <em>Cs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs</em>' containment reference.
	 * @see #getCs()
	 * @generated
	 */
	void setCs(EControlSchema value);

	/**
	 * Returns the value of the '<em><b>Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ds</em>' containment reference.
	 * @see #setDs(EDataSchema)
	 * @see m4md.M4mdPackage#getEDomainSchema_Ds()
	 * @model containment="true"
	 * @generated
	 */
	EDataSchema getDs();

	/**
	 * Sets the value of the '{@link m4md.EDomainSchema#getDs <em>Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ds</em>' containment reference.
	 * @see #getDs()
	 * @generated
	 */
	void setDs(EDataSchema value);

} // EDomainSchema
