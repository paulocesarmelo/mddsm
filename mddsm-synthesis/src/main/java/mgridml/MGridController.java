/**
 */
package mgridml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MGrid Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.MGridController#getMgcontroller <em>Mgcontroller</em>}</li>
 *   <li>{@link mgridml.MGridController#getMgridControllerID <em>Mgrid Controller ID</em>}</li>
 *   <li>{@link mgridml.MGridController#getTotalLoads <em>Total Loads</em>}</li>
 *   <li>{@link mgridml.MGridController#getTotalSources <em>Total Sources</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getMGridController()
 * @model
 * @generated
 */
public interface MGridController extends MGController {
	/**
	 * Returns the value of the '<em><b>Mgcontroller</b></em>' containment reference list.
	 * The list contents are of type {@link mgridml.MGController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mgcontroller</em>' containment reference list.
	 * @see mgridml.MgridmlPackage#getMGridController_Mgcontroller()
	 * @model containment="true"
	 * @generated
	 */
	EList<MGController> getMgcontroller();

	/**
	 * Returns the value of the '<em><b>Mgrid Controller ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mgrid Controller ID</em>' attribute.
	 * @see #setMgridControllerID(String)
	 * @see mgridml.MgridmlPackage#getMGridController_MgridControllerID()
	 * @model
	 * @generated
	 */
	String getMgridControllerID();

	/**
	 * Sets the value of the '{@link mgridml.MGridController#getMgridControllerID <em>Mgrid Controller ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mgrid Controller ID</em>' attribute.
	 * @see #getMgridControllerID()
	 * @generated
	 */
	void setMgridControllerID(String value);

	/**
	 * Returns the value of the '<em><b>Total Loads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Loads</em>' attribute.
	 * @see #setTotalLoads(float)
	 * @see mgridml.MgridmlPackage#getMGridController_TotalLoads()
	 * @model
	 * @generated
	 */
	float getTotalLoads();

	/**
	 * Sets the value of the '{@link mgridml.MGridController#getTotalLoads <em>Total Loads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Loads</em>' attribute.
	 * @see #getTotalLoads()
	 * @generated
	 */
	void setTotalLoads(float value);

	/**
	 * Returns the value of the '<em><b>Total Sources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Sources</em>' attribute.
	 * @see #setTotalSources(float)
	 * @see mgridml.MgridmlPackage#getMGridController_TotalSources()
	 * @model
	 * @generated
	 */
	float getTotalSources();

	/**
	 * Sets the value of the '{@link mgridml.MGridController#getTotalSources <em>Total Sources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Sources</em>' attribute.
	 * @see #getTotalSources()
	 * @generated
	 */
	void setTotalSources(float value);

} // MGridController
