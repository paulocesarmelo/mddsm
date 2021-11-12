/**
 */
package mgridml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legacy Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.LegacyMeter#getOperational <em>Operational</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getLegacyMeter()
 * @model
 * @generated
 */
public interface LegacyMeter extends Meter {
	/**
	 * Returns the value of the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational</em>' attribute.
	 * @see #setOperational(String)
	 * @see mgridml.MgridmlPackage#getLegacyMeter_Operational()
	 * @model
	 * @generated
	 */
	String getOperational();

	/**
	 * Sets the value of the '{@link mgridml.LegacyMeter#getOperational <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational</em>' attribute.
	 * @see #getOperational()
	 * @generated
	 */
	void setOperational(String value);

} // LegacyMeter
