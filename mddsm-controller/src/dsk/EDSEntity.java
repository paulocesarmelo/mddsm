/**
 */
package dsk;

import m4md.EDomainSpecificEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDS Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsk.EDSEntity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dsk.DskPackage#getEDSEntity()
 * @model
 * @generated
 */
public interface EDSEntity extends EDomainSpecificEntity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsk.DskPackage#getEDSEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsk.EDSEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EDSEntity
