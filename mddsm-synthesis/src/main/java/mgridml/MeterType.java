/**
 */
package mgridml;

import m4md.EDomainSpecificType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.MeterType#getMTypeID <em>MType ID</em>}</li>
 *   <li>{@link mgridml.MeterType#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getMeterType()
 * @model
 * @generated
 */
public interface MeterType extends EDomainSpecificType {
	/**
	 * Returns the value of the '<em><b>MType ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MType ID</em>' attribute.
	 * @see #setMTypeID(String)
	 * @see mgridml.MgridmlPackage#getMeterType_MTypeID()
	 * @model
	 * @generated
	 */
	String getMTypeID();

	/**
	 * Sets the value of the '{@link mgridml.MeterType#getMTypeID <em>MType ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MType ID</em>' attribute.
	 * @see #getMTypeID()
	 * @generated
	 */
	void setMTypeID(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see mgridml.MgridmlPackage#getMeterType_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link mgridml.MeterType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

} // MeterType
