/**
 */
package mgridml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.SourceController#getSourceType <em>Source Type</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getSourceController()
 * @model
 * @generated
 */
public interface SourceController extends AtomicController {
	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' containment reference list.
	 * The list contents are of type {@link mgridml.SourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' containment reference list.
	 * @see mgridml.MgridmlPackage#getSourceController_SourceType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SourceType> getSourceType();

} // SourceController
