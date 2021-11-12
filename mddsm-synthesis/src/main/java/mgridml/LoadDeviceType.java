/**
 */
package mgridml;

import m4md.EDomainSpecificType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.LoadDeviceType#getSoTypeID <em>So Type ID</em>}</li>
 *   <li>{@link mgridml.LoadDeviceType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link mgridml.LoadDeviceType#getCritical <em>Critical</em>}</li>
 *   <li>{@link mgridml.LoadDeviceType#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getLoadDeviceType()
 * @model
 * @generated
 */
public interface LoadDeviceType extends EDomainSpecificType {
	/**
	 * Returns the value of the '<em><b>So Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>So Type ID</em>' attribute.
	 * @see #setSoTypeID(String)
	 * @see mgridml.MgridmlPackage#getLoadDeviceType_SoTypeID()
	 * @model
	 * @generated
	 */
	String getSoTypeID();

	/**
	 * Sets the value of the '{@link mgridml.LoadDeviceType#getSoTypeID <em>So Type ID</em>}' attribute.
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
	 * @see mgridml.MgridmlPackage#getLoadDeviceType_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link mgridml.LoadDeviceType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Critical</b></em>' attribute.
	 * The literals are from the enumeration {@link mgridml.CriticalEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical</em>' attribute.
	 * @see mgridml.CriticalEnum
	 * @see #setCritical(CriticalEnum)
	 * @see mgridml.MgridmlPackage#getLoadDeviceType_Critical()
	 * @model
	 * @generated
	 */
	CriticalEnum getCritical();

	/**
	 * Sets the value of the '{@link mgridml.LoadDeviceType#getCritical <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical</em>' attribute.
	 * @see mgridml.CriticalEnum
	 * @see #getCritical()
	 * @generated
	 */
	void setCritical(CriticalEnum value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link mgridml.UsageEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see mgridml.UsageEnum
	 * @see #setUsage(UsageEnum)
	 * @see mgridml.MgridmlPackage#getLoadDeviceType_Usage()
	 * @model
	 * @generated
	 */
	UsageEnum getUsage();

	/**
	 * Sets the value of the '{@link mgridml.LoadDeviceType#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see mgridml.UsageEnum
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(UsageEnum value);

} // LoadDeviceType
