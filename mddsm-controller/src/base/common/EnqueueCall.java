/**
 */
package base.common;

import org.eclipse.emf.common.util.EList;

import br.inf.ufg.mddsm.controller.base.common.Action;
import br.inf.ufg.mddsm.controller.base.common.Call;
import br.inf.ufg.mddsm.controller.base.common.ParameterBinding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enqueue Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.common.EnqueueCall#getCall <em>Call</em>}</li>
 *   <li>{@link base.common.EnqueueCall#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see base.common.CommonPackage#getEnqueueCall()
 * @model
 * @generated
 */
public interface EnqueueCall extends Action {
	/**
	 * Returns the value of the '<em><b>Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call</em>' reference.
	 * @see #setCall(Call)
	 * @see base.common.CommonPackage#getEnqueueCall_Call()
	 * @model required="true"
	 * @generated
	 */
	Call getCall();

	/**
	 * Sets the value of the '{@link base.common.EnqueueCall#getCall <em>Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call</em>' reference.
	 * @see #getCall()
	 * @generated
	 */
	void setCall(Call value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link base.common.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see base.common.CommonPackage#getEnqueueCall_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getBindings();

} // EnqueueCall
