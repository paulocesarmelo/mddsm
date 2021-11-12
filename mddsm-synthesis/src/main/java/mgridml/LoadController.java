/**
 */
package mgridml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.LoadController#getLoadDeviceType <em>Load Device Type</em>}</li>
 *   <li>{@link mgridml.LoadController#getLcProperty <em>Lc Property</em>}</li>
 *   <li>{@link mgridml.LoadController#getCritical <em>Critical</em>}</li>
 *   <li>{@link mgridml.LoadController#getLowerWattage <em>Lower Wattage</em>}</li>
 *   <li>{@link mgridml.LoadController#getUpperWattage <em>Upper Wattage</em>}</li>
 *   <li>{@link mgridml.LoadController#isGroupAction <em>Group Action</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getLoadController()
 * @model
 * @generated
 */
public interface LoadController extends AtomicController {
	/**
	 * Returns the value of the '<em><b>Load Device Type</b></em>' containment reference list.
	 * The list contents are of type {@link mgridml.LoadDeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Device Type</em>' containment reference list.
	 * @see mgridml.MgridmlPackage#getLoadController_LoadDeviceType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LoadDeviceType> getLoadDeviceType();

	/**
	 * Returns the value of the '<em><b>Lc Property</b></em>' containment reference list.
	 * The list contents are of type {@link mgridml.LC_Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lc Property</em>' containment reference list.
	 * @see mgridml.MgridmlPackage#getLoadController_LcProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<LC_Property> getLcProperty();

	/**
	 * Returns the value of the '<em><b>Critical</b></em>' attribute.
	 * The literals are from the enumeration {@link mgridml.CriticalEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical</em>' attribute.
	 * @see mgridml.CriticalEnum
	 * @see #setCritical(CriticalEnum)
	 * @see mgridml.MgridmlPackage#getLoadController_Critical()
	 * @model
	 * @generated
	 */
	CriticalEnum getCritical();

	/**
	 * Sets the value of the '{@link mgridml.LoadController#getCritical <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical</em>' attribute.
	 * @see mgridml.CriticalEnum
	 * @see #getCritical()
	 * @generated
	 */
	void setCritical(CriticalEnum value);

	/**
	 * Returns the value of the '<em><b>Lower Wattage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Wattage</em>' attribute.
	 * @see #setLowerWattage(float)
	 * @see mgridml.MgridmlPackage#getLoadController_LowerWattage()
	 * @model
	 * @generated
	 */
	float getLowerWattage();

	/**
	 * Sets the value of the '{@link mgridml.LoadController#getLowerWattage <em>Lower Wattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Wattage</em>' attribute.
	 * @see #getLowerWattage()
	 * @generated
	 */
	void setLowerWattage(float value);

	/**
	 * Returns the value of the '<em><b>Upper Wattage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Wattage</em>' attribute.
	 * @see #setUpperWattage(float)
	 * @see mgridml.MgridmlPackage#getLoadController_UpperWattage()
	 * @model
	 * @generated
	 */
	float getUpperWattage();

	/**
	 * Sets the value of the '{@link mgridml.LoadController#getUpperWattage <em>Upper Wattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Wattage</em>' attribute.
	 * @see #getUpperWattage()
	 * @generated
	 */
	void setUpperWattage(float value);

	/**
	 * Returns the value of the '<em><b>Group Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Action</em>' attribute.
	 * @see #setGroupAction(boolean)
	 * @see mgridml.MgridmlPackage#getLoadController_GroupAction()
	 * @model
	 * @generated
	 */
	boolean isGroupAction();

	/**
	 * Sets the value of the '{@link mgridml.LoadController#isGroupAction <em>Group Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Action</em>' attribute.
	 * @see #isGroupAction()
	 * @generated
	 */
	void setGroupAction(boolean value);

} // LoadController
