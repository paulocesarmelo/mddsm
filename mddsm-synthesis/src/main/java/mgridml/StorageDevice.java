/**
 */
package mgridml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.StorageDevice#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link mgridml.StorageDevice#isCharging <em>Charging</em>}</li>
 *   <li>{@link mgridml.StorageDevice#getChargeT <em>Charge T</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getStorageDevice()
 * @model
 * @generated
 */
public interface StorageDevice extends Device {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(float)
	 * @see mgridml.MgridmlPackage#getStorageDevice_Capacity()
	 * @model
	 * @generated
	 */
	float getCapacity();

	/**
	 * Sets the value of the '{@link mgridml.StorageDevice#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(float value);

	/**
	 * Returns the value of the '<em><b>Charging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charging</em>' attribute.
	 * @see #setCharging(boolean)
	 * @see mgridml.MgridmlPackage#getStorageDevice_Charging()
	 * @model
	 * @generated
	 */
	boolean isCharging();

	/**
	 * Sets the value of the '{@link mgridml.StorageDevice#isCharging <em>Charging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charging</em>' attribute.
	 * @see #isCharging()
	 * @generated
	 */
	void setCharging(boolean value);

	/**
	 * Returns the value of the '<em><b>Charge T</b></em>' attribute.
	 * The literals are from the enumeration {@link mgridml.ChargeEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge T</em>' attribute.
	 * @see mgridml.ChargeEnum
	 * @see #setChargeT(ChargeEnum)
	 * @see mgridml.MgridmlPackage#getStorageDevice_ChargeT()
	 * @model
	 * @generated
	 */
	ChargeEnum getChargeT();

	/**
	 * Sets the value of the '{@link mgridml.StorageDevice#getChargeT <em>Charge T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge T</em>' attribute.
	 * @see mgridml.ChargeEnum
	 * @see #getChargeT()
	 * @generated
	 */
	void setChargeT(ChargeEnum value);

} // StorageDevice
