/**
 */
package mgridml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.Device#getDeviceProperty <em>Device Property</em>}</li>
 *   <li>{@link mgridml.Device#getDeviceTypeID <em>Device Type ID</em>}</li>
 *   <li>{@link mgridml.Device#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link mgridml.Device#getWattage <em>Wattage</em>}</li>
 *   <li>{@link mgridml.Device#getDescription <em>Description</em>}</li>
 *   <li>{@link mgridml.Device#isOperational <em>Operational</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends PlantElem {
	/**
	 * Returns the value of the '<em><b>Device Property</b></em>' containment reference list.
	 * The list contents are of type {@link mgridml.DeviceProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Property</em>' containment reference list.
	 * @see mgridml.MgridmlPackage#getDevice_DeviceProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceProperty> getDeviceProperty();

	/**
	 * Returns the value of the '<em><b>Device Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Type ID</em>' attribute.
	 * @see #setDeviceTypeID(String)
	 * @see mgridml.MgridmlPackage#getDevice_DeviceTypeID()
	 * @model
	 * @generated
	 */
	String getDeviceTypeID();

	/**
	 * Sets the value of the '{@link mgridml.Device#getDeviceTypeID <em>Device Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Type ID</em>' attribute.
	 * @see #getDeviceTypeID()
	 * @generated
	 */
	void setDeviceTypeID(String value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute.
	 * @see #setDeviceName(String)
	 * @see mgridml.MgridmlPackage#getDevice_DeviceName()
	 * @model
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link mgridml.Device#getDeviceName <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' attribute.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Wattage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wattage</em>' attribute.
	 * @see #setWattage(float)
	 * @see mgridml.MgridmlPackage#getDevice_Wattage()
	 * @model
	 * @generated
	 */
	float getWattage();

	/**
	 * Sets the value of the '{@link mgridml.Device#getWattage <em>Wattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wattage</em>' attribute.
	 * @see #getWattage()
	 * @generated
	 */
	void setWattage(float value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mgridml.MgridmlPackage#getDevice_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mgridml.Device#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational</em>' attribute.
	 * @see #setOperational(boolean)
	 * @see mgridml.MgridmlPackage#getDevice_Operational()
	 * @model
	 * @generated
	 */
	boolean isOperational();

	/**
	 * Sets the value of the '{@link mgridml.Device#isOperational <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational</em>' attribute.
	 * @see #isOperational()
	 * @generated
	 */
	void setOperational(boolean value);

} // Device
