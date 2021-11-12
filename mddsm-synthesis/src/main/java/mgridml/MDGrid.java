/**
 */
package mgridml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.MDGrid#getPlantElem <em>Plant Elem</em>}</li>
 *   <li>{@link mgridml.MDGrid#getMdgridID <em>Mdgrid ID</em>}</li>
 *   <li>{@link mgridml.MDGrid#getMcgridID <em>Mcgrid ID</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getMDGrid()
 * @model
 * @generated
 */
public interface MDGrid extends EObject {
	/**
	 * Returns the value of the '<em><b>Plant Elem</b></em>' containment reference list.
	 * The list contents are of type {@link mgridml.PlantElem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Elem</em>' containment reference list.
	 * @see mgridml.MgridmlPackage#getMDGrid_PlantElem()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlantElem> getPlantElem();

	/**
	 * Returns the value of the '<em><b>Mdgrid ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdgrid ID</em>' attribute.
	 * @see #setMdgridID(String)
	 * @see mgridml.MgridmlPackage#getMDGrid_MdgridID()
	 * @model
	 * @generated
	 */
	String getMdgridID();

	/**
	 * Sets the value of the '{@link mgridml.MDGrid#getMdgridID <em>Mdgrid ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdgrid ID</em>' attribute.
	 * @see #getMdgridID()
	 * @generated
	 */
	void setMdgridID(String value);

	/**
	 * Returns the value of the '<em><b>Mcgrid ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mcgrid ID</em>' attribute.
	 * @see #setMcgridID(String)
	 * @see mgridml.MgridmlPackage#getMDGrid_McgridID()
	 * @model
	 * @generated
	 */
	String getMcgridID();

	/**
	 * Sets the value of the '{@link mgridml.MDGrid#getMcgridID <em>Mcgrid ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mcgrid ID</em>' attribute.
	 * @see #getMcgridID()
	 * @generated
	 */
	void setMcgridID(String value);

} // MDGrid
