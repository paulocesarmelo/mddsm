/**
 */
package mgridml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.Meter#getMTypeID <em>MType ID</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getMeter()
 * @model
 * @generated
 */
public interface Meter extends PlantElem {
	/**
	 * Returns the value of the '<em><b>MType ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MType ID</em>' attribute.
	 * @see #setMTypeID(String)
	 * @see mgridml.MgridmlPackage#getMeter_MTypeID()
	 * @model
	 * @generated
	 */
	String getMTypeID();

	/**
	 * Sets the value of the '{@link mgridml.Meter#getMTypeID <em>MType ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MType ID</em>' attribute.
	 * @see #getMTypeID()
	 * @generated
	 */
	void setMTypeID(String value);

} // Meter
