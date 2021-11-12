/**
 */
package mgridml;

import m4md.EDomainSpecificType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.StorageDeviceType#getSoTypeID <em>So Type ID</em>}</li>
 *   <li>{@link mgridml.StorageDeviceType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link mgridml.StorageDeviceType#getLowerThres <em>Lower Thres</em>}</li>
 *   <li>{@link mgridml.StorageDeviceType#getUpperThres <em>Upper Thres</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getStorageDeviceType()
 * @model
 * @generated
 */
public interface StorageDeviceType extends EDomainSpecificType {
	/**
	 * Returns the value of the '<em><b>So Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>So Type ID</em>' attribute.
	 * @see #setSoTypeID(String)
	 * @see mgridml.MgridmlPackage#getStorageDeviceType_SoTypeID()
	 * @model
	 * @generated
	 */
	String getSoTypeID();

	/**
	 * Sets the value of the '{@link mgridml.StorageDeviceType#getSoTypeID <em>So Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>So Type ID</em>' attribute.
	 * @see #getSoTypeID()
	 * @generated
	 */
	void setSoTypeID(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see mgridml.MgridmlPackage#getStorageDeviceType_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link mgridml.StorageDeviceType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Lower Thres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Thres</em>' attribute.
	 * @see #setLowerThres(float)
	 * @see mgridml.MgridmlPackage#getStorageDeviceType_LowerThres()
	 * @model
	 * @generated
	 */
	float getLowerThres();

	/**
	 * Sets the value of the '{@link mgridml.StorageDeviceType#getLowerThres <em>Lower Thres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Thres</em>' attribute.
	 * @see #getLowerThres()
	 * @generated
	 */
	void setLowerThres(float value);

	/**
	 * Returns the value of the '<em><b>Upper Thres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Thres</em>' attribute.
	 * @see #setUpperThres(float)
	 * @see mgridml.MgridmlPackage#getStorageDeviceType_UpperThres()
	 * @model
	 * @generated
	 */
	float getUpperThres();

	/**
	 * Sets the value of the '{@link mgridml.StorageDeviceType#getUpperThres <em>Upper Thres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Thres</em>' attribute.
	 * @see #getUpperThres()
	 * @generated
	 */
	void setUpperThres(float value);

} // StorageDeviceType
