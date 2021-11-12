/**
 */
package iscadapter.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Kind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iscadapter.resources.ResourceKind#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see iscadapter.resources.ResourcesPackage#getResourceKind()
 * @model
 * @generated
 */
public interface ResourceKind extends EObject {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see iscadapter.resources.ResourcesPackage#getResourceKind_Capabilities()
	 * @model
	 * @generated
	 */
	EList<String> getCapabilities();

} // ResourceKind
