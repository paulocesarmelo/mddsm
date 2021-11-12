/**
 */
package m4md;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EControl Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m4md.EControlSchema#getActor <em>Actor</em>}</li>
 * </ul>
 *
 * @see m4md.M4mdPackage#getEControlSchema()
 * @model abstract="true"
 * @generated
 */
public interface EControlSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link m4md.EActor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see m4md.M4mdPackage#getEControlSchema_Actor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EActor> getActor();

} // EControlSchema
