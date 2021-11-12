/**
 */
package mgridml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.StorageController#getStorageDeviceType <em>Storage Device Type</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getStorageController()
 * @model
 * @generated
 */
public interface StorageController extends AtomicController {
	/**
	 * Returns the value of the '<em><b>Storage Device Type</b></em>' containment reference list.
	 * The list contents are of type {@link mgridml.StorageDeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Device Type</em>' containment reference list.
	 * @see mgridml.MgridmlPackage#getStorageController_StorageDeviceType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StorageDeviceType> getStorageDeviceType();

} // StorageController
