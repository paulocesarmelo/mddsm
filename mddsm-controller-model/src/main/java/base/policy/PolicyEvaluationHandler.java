/**
 */
package base.policy;

import base.common.Parameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.policy.PolicyEvaluationHandler#getParameters <em>Parameters</em>}</li>
 *   <li>{@link base.policy.PolicyEvaluationHandler#getHandlerImpl <em>Handler Impl</em>}</li>
 *   <li>{@link base.policy.PolicyEvaluationHandler#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 *
 * @see base.policy.PolicyPackage#getPolicyEvaluationHandler()
 * @model
 * @generated
 */
public interface PolicyEvaluationHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link base.common.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see base.policy.PolicyPackage#getPolicyEvaluationHandler_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Handler Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Impl</em>' attribute.
	 * @see #setHandlerImpl(String)
	 * @see base.policy.PolicyPackage#getPolicyEvaluationHandler_HandlerImpl()
	 * @model required="true"
	 * @generated
	 */
	String getHandlerImpl();

	/**
	 * Sets the value of the '{@link base.policy.PolicyEvaluationHandler#getHandlerImpl <em>Handler Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Impl</em>' attribute.
	 * @see #getHandlerImpl()
	 * @generated
	 */
	void setHandlerImpl(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' containment reference.
	 * @see #setEvaluation(PolicyEvaluation)
	 * @see base.policy.PolicyPackage#getPolicyEvaluationHandler_Evaluation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PolicyEvaluation getEvaluation();

	/**
	 * Sets the value of the '{@link base.policy.PolicyEvaluationHandler#getEvaluation <em>Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' containment reference.
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(PolicyEvaluation value);

} // PolicyEvaluationHandler
