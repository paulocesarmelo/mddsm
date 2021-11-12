/**
 */
package mgridml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MC Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.MCGrid#getMgcontroller <em>Mgcontroller</em>}</li>
 *   <li>{@link mgridml.MCGrid#getMcgridID <em>Mcgrid ID</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getMCGrid()
 * @model
 * @generated
 */
public interface MCGrid extends EObject {
	/**
	 * Returns the value of the '<em><b>Mgcontroller</b></em>' containment reference list.
	 * The list contents are of type {@link mgridml.MGController}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mgcontroller</em>' containment reference list.
	 * @see mgridml.MgridmlPackage#getMCGrid_Mgcontroller()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MGController> getMgcontroller();

	/**
	 * Returns the value of the '<em><b>Mcgrid ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mcgrid ID</em>' attribute.
	 * @see #setMcgridID(String)
	 * @see mgridml.MgridmlPackage#getMCGrid_McgridID()
	 * @model
	 * @generated
	 */
	String getMcgridID();

	/**
	 * Sets the value of the '{@link mgridml.MCGrid#getMcgridID <em>Mcgrid ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mcgrid ID</em>' attribute.
	 * @see #getMcgridID()
	 * @generated
	 */
	void setMcgridID(String value);

} // MCGrid
