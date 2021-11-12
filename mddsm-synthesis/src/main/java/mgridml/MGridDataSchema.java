/**
 */
package mgridml;

import m4md.EDataSchema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MGrid Data Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.MGridDataSchema#getMdGrid <em>Md Grid</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getMGridDataSchema()
 * @model
 * @generated
 */
public interface MGridDataSchema extends EDataSchema {
	/**
	 * Returns the value of the '<em><b>Md Grid</b></em>' containment reference list.
	 * The list contents are of type {@link mgridml.MDGrid}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Md Grid</em>' containment reference list.
	 * @see mgridml.MgridmlPackage#getMGridDataSchema_MdGrid()
	 * @model containment="true"
	 * @generated
	 */
	EList<MDGrid> getMdGrid();

} // MGridDataSchema
