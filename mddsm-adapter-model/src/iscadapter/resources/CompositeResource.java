/**
 */
package iscadapter.resources;

import iscadapter.ISCResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iscadapter.resources.CompositeResource#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see iscadapter.resources.ResourcesPackage#getCompositeResource()
 * @model
 * @generated
 */
public interface CompositeResource extends ISCResource {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link iscadapter.ISCResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see iscadapter.resources.ResourcesPackage#getCompositeResource_Resource()
	 * @model containment="true" required="true" transient="true"
	 * @generated
	 */
	EList<ISCResource> getResource();

} // CompositeResource
