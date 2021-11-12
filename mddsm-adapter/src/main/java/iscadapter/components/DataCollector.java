/**
 */
package iscadapter.components;

import adapter.EComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Collector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iscadapter.components.DataCollector#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @see iscadapter.components.ComponentsPackage#getDataCollector()
 * @model
 * @generated
 */
public interface DataCollector extends EComponent {

	/**
	 * Returns the value of the '<em><b>Route</b></em>' attribute.
	 * The default value is <code>"datacollector"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' attribute.
	 * @see iscadapter.components.ComponentsPackage#getDataCollector_Route()
	 * @model default="datacollector" changeable="false"
	 * @generated
	 */
	String getRoute();
} // DataCollector
