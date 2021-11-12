/**
 */
package mgridml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.Source#getSoTypeID <em>So Type ID</em>}</li>
 *   <li>{@link mgridml.Source#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link mgridml.Source#getWattage <em>Wattage</em>}</li>
 *   <li>{@link mgridml.Source#getOnDemand <em>On Demand</em>}</li>
 *   <li>{@link mgridml.Source#isOperational <em>Operational</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends PlantElem {
	/**
	 * Returns the value of the '<em><b>So Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>So Type ID</em>' attribute.
	 * @see #setSoTypeID(String)
	 * @see mgridml.MgridmlPackage#getSource_SoTypeID()
	 * @model
	 * @generated
	 */
	String getSoTypeID();

	/**
	 * Sets the value of the '{@link mgridml.Source#getSoTypeID <em>So Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>So Type ID</em>' attribute.
	 * @see #getSoTypeID()
	 * @generated
	 */
	void setSoTypeID(String value);

	/**
	 * Returns the value of the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Name</em>' attribute.
	 * @see #setSourceName(String)
	 * @see mgridml.MgridmlPackage#getSource_SourceName()
	 * @model
	 * @generated
	 */
	String getSourceName();

	/**
	 * Sets the value of the '{@link mgridml.Source#getSourceName <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Name</em>' attribute.
	 * @see #getSourceName()
	 * @generated
	 */
	void setSourceName(String value);

	/**
	 * Returns the value of the '<em><b>Wattage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wattage</em>' attribute.
	 * @see #setWattage(float)
	 * @see mgridml.MgridmlPackage#getSource_Wattage()
	 * @model
	 * @generated
	 */
	float getWattage();

	/**
	 * Sets the value of the '{@link mgridml.Source#getWattage <em>Wattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wattage</em>' attribute.
	 * @see #getWattage()
	 * @generated
	 */
	void setWattage(float value);

	/**
	 * Returns the value of the '<em><b>On Demand</b></em>' attribute.
	 * The literals are from the enumeration {@link mgridml.ControlEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Demand</em>' attribute.
	 * @see mgridml.ControlEnum
	 * @see #setOnDemand(ControlEnum)
	 * @see mgridml.MgridmlPackage#getSource_OnDemand()
	 * @model
	 * @generated
	 */
	ControlEnum getOnDemand();

	/**
	 * Sets the value of the '{@link mgridml.Source#getOnDemand <em>On Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Demand</em>' attribute.
	 * @see mgridml.ControlEnum
	 * @see #getOnDemand()
	 * @generated
	 */
	void setOnDemand(ControlEnum value);

	/**
	 * Returns the value of the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational</em>' attribute.
	 * @see #setOperational(boolean)
	 * @see mgridml.MgridmlPackage#getSource_Operational()
	 * @model
	 * @generated
	 */
	boolean isOperational();

	/**
	 * Sets the value of the '{@link mgridml.Source#isOperational <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational</em>' attribute.
	 * @see #isOperational()
	 * @generated
	 */
	void setOperational(boolean value);

} // Source
