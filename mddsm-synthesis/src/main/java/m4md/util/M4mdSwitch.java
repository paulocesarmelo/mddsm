/**
 */
package m4md.util;

import m4md.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see m4md.M4mdPackage
 * @generated
 */
public class M4mdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static M4mdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M4mdSwitch() {
		if (modelPackage == null) {
			modelPackage = M4mdPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case M4mdPackage.EDOMAIN_SCHEMA: {
				EDomainSchema eDomainSchema = (EDomainSchema)theEObject;
				T result = caseEDomainSchema(eDomainSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4mdPackage.ECONTROL_SCHEMA: {
				EControlSchema eControlSchema = (EControlSchema)theEObject;
				T result = caseEControlSchema(eControlSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4mdPackage.EDATA_SCHEMA: {
				EDataSchema eDataSchema = (EDataSchema)theEObject;
				T result = caseEDataSchema(eDataSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4mdPackage.EDOMAIN_SPECIFIC_ENTITY: {
				EDomainSpecificEntity eDomainSpecificEntity = (EDomainSpecificEntity)theEObject;
				T result = caseEDomainSpecificEntity(eDomainSpecificEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4mdPackage.EDOMAIN_SPECIFIC_COMMAND: {
				EDomainSpecificCommand eDomainSpecificCommand = (EDomainSpecificCommand)theEObject;
				T result = caseEDomainSpecificCommand(eDomainSpecificCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4mdPackage.EACTOR: {
				EActor eActor = (EActor)theEObject;
				T result = caseEActor(eActor);
				if (result == null) result = caseEDomainSpecificEntity(eActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4mdPackage.EITEM: {
				EItem eItem = (EItem)theEObject;
				T result = caseEItem(eItem);
				if (result == null) result = caseEDomainSpecificEntity(eItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4mdPackage.EDOMAIN_SPECIFIC_TYPE: {
				EDomainSpecificType eDomainSpecificType = (EDomainSpecificType)theEObject;
				T result = caseEDomainSpecificType(eDomainSpecificType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDomain Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDomain Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDomainSchema(EDomainSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EControl Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EControl Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEControlSchema(EControlSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EData Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EData Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDataSchema(EDataSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDomain Specific Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDomain Specific Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDomainSpecificEntity(EDomainSpecificEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDomain Specific Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDomain Specific Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDomainSpecificCommand(EDomainSpecificCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EActor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EActor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEActor(EActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EItem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEItem(EItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDomain Specific Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDomain Specific Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDomainSpecificType(EDomainSpecificType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //M4mdSwitch
