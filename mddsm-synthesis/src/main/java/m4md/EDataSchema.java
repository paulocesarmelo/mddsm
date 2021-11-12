/**
 */
package m4md;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EData Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m4md.EDataSchema#getCs <em>Cs</em>}</li>
 *   <li>{@link m4md.EDataSchema#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see m4md.M4mdPackage#getEDataSchema()
 * @model abstract="true"
 * @generated
 */
public interface EDataSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Cs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs</em>' reference.
	 * @see #setCs(EControlSchema)
	 * @see m4md.M4mdPackage#getEDataSchema_Cs()
	 * @model required="true"
	 * @generated
	 */
	EControlSchema getCs();

	/**
	 * Sets the value of the '{@link m4md.EDataSchema#getCs <em>Cs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs</em>' reference.
	 * @see #getCs()
	 * @generated
	 */
	void setCs(EControlSchema value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link m4md.EItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see m4md.M4mdPackage#getEDataSchema_Item()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EItem> getItem();

} // EDataSchema
