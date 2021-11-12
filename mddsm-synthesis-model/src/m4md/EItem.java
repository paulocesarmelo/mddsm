/**
 */
package m4md;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EItem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m4md.EItem#getArisingBehavior <em>Arising Behavior</em>}</li>
 *   <li>{@link m4md.EItem#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see m4md.M4mdPackage#getEItem()
 * @model abstract="true"
 * @generated
 */
public interface EItem extends EDomainSpecificEntity {
	/**
	 * Returns the value of the '<em><b>Arising Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link m4md.EArising}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arising Behavior</em>' attribute.
	 * @see m4md.EArising
	 * @see #setArisingBehavior(EArising)
	 * @see m4md.M4mdPackage#getEItem_ArisingBehavior()
	 * @model
	 * @generated
	 */
	EArising getArisingBehavior();

	/**
	 * Sets the value of the '{@link m4md.EItem#getArisingBehavior <em>Arising Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arising Behavior</em>' attribute.
	 * @see m4md.EArising
	 * @see #getArisingBehavior()
	 * @generated
	 */
	void setArisingBehavior(EArising value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EDomainSpecificType)
	 * @see m4md.M4mdPackage#getEItem_Type()
	 * @model required="true"
	 * @generated
	 */
	EDomainSpecificType getType();

	/**
	 * Sets the value of the '{@link m4md.EItem#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EDomainSpecificType value);

} // EItem
