/**
 */
package mgridml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.LoadDevice#getControl <em>Control</em>}</li>
 *   <li>{@link mgridml.LoadDevice#getCritical <em>Critical</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getLoadDevice()
 * @model
 * @generated
 */
public interface LoadDevice extends Device {
	/**
	 * Returns the value of the '<em><b>Control</b></em>' attribute.
	 * The literals are from the enumeration {@link mgridml.ControlEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' attribute.
	 * @see mgridml.ControlEnum
	 * @see #setControl(ControlEnum)
	 * @see mgridml.MgridmlPackage#getLoadDevice_Control()
	 * @model
	 * @generated
	 */
	ControlEnum getControl();

	/**
	 * Sets the value of the '{@link mgridml.LoadDevice#getControl <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' attribute.
	 * @see mgridml.ControlEnum
	 * @see #getControl()
	 * @generated
	 */
	void setControl(ControlEnum value);

	/**
	 * Returns the value of the '<em><b>Critical</b></em>' attribute.
	 * The literals are from the enumeration {@link mgridml.CriticalEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical</em>' attribute.
	 * @see mgridml.CriticalEnum
	 * @see #setCritical(CriticalEnum)
	 * @see mgridml.MgridmlPackage#getLoadDevice_Critical()
	 * @model
	 * @generated
	 */
	CriticalEnum getCritical();

	/**
	 * Sets the value of the '{@link mgridml.LoadDevice#getCritical <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical</em>' attribute.
	 * @see mgridml.CriticalEnum
	 * @see #getCritical()
	 * @generated
	 */
	void setCritical(CriticalEnum value);

} // LoadDevice
