/**
 */
package mgridml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.SmartMeter#getTariff <em>Tariff</em>}</li>
 *   <li>{@link mgridml.SmartMeter#getUsage <em>Usage</em>}</li>
 *   <li>{@link mgridml.SmartMeter#isOperational <em>Operational</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getSmartMeter()
 * @model
 * @generated
 */
public interface SmartMeter extends Meter {
	/**
	 * Returns the value of the '<em><b>Tariff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tariff</em>' attribute.
	 * @see #setTariff(float)
	 * @see mgridml.MgridmlPackage#getSmartMeter_Tariff()
	 * @model
	 * @generated
	 */
	float getTariff();

	/**
	 * Sets the value of the '{@link mgridml.SmartMeter#getTariff <em>Tariff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tariff</em>' attribute.
	 * @see #getTariff()
	 * @generated
	 */
	void setTariff(float value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(float)
	 * @see mgridml.MgridmlPackage#getSmartMeter_Usage()
	 * @model
	 * @generated
	 */
	float getUsage();

	/**
	 * Sets the value of the '{@link mgridml.SmartMeter#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(float value);

	/**
	 * Returns the value of the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational</em>' attribute.
	 * @see #setOperational(boolean)
	 * @see mgridml.MgridmlPackage#getSmartMeter_Operational()
	 * @model
	 * @generated
	 */
	boolean isOperational();

	/**
	 * Sets the value of the '{@link mgridml.SmartMeter#isOperational <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational</em>' attribute.
	 * @see #isOperational()
	 * @generated
	 */
	void setOperational(boolean value);

} // SmartMeter
