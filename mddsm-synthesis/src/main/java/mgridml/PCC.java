/**
 */
package mgridml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.PCC#getMeterType <em>Meter Type</em>}</li>
 *   <li>{@link mgridml.PCC#isConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getPCC()
 * @model
 * @generated
 */
public interface PCC extends AtomicController {
	/**
	 * Returns the value of the '<em><b>Meter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Type</em>' containment reference.
	 * @see #setMeterType(MeterType)
	 * @see mgridml.MgridmlPackage#getPCC_MeterType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MeterType getMeterType();

	/**
	 * Sets the value of the '{@link mgridml.PCC#getMeterType <em>Meter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Type</em>' containment reference.
	 * @see #getMeterType()
	 * @generated
	 */
	void setMeterType(MeterType value);

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see mgridml.MgridmlPackage#getPCC_Connected()
	 * @model
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link mgridml.PCC#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

} // PCC
