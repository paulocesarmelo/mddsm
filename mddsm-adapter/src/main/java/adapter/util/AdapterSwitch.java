/**
 */
package adapter.util;

import adapter.*;

import dsk.EDSC;
import dsk.EDSEntity;
import m4md.EDomainSpecificEntity;
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
 * @see adapter.AdapterPackage
 * @generated
 */
public class AdapterSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdapterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterSwitch() {
		if (modelPackage == null) {
			modelPackage = AdapterPackage.eINSTANCE;
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
			case AdapterPackage.EADAPTER: {
				EAdapter eAdapter = (EAdapter)theEObject;
				T result = caseEAdapter(eAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.ECOMMUNICATION: {
				ECommunication eCommunication = (ECommunication)theEObject;
				T result = caseECommunication(eCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.ERESOURCE: {
				EResource eResource = (EResource)theEObject;
				T result = caseEResource(eResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.ECOMPONENT: {
				EComponent eComponent = (EComponent)theEObject;
				T result = caseEComponent(eComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.EDATA: {
				EData eData = (EData)theEObject;
				T result = caseEData(eData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.EENTITY: {
				EEntity eEntity = (EEntity)theEObject;
				T result = caseEEntity(eEntity);
				if (result == null) result = caseEDSEntity(eEntity);
				if (result == null) result = caseEDomainSpecificEntity(eEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdapterPackage.EDS_CMD: {
				EDSCmd edsCmd = (EDSCmd)theEObject;
				T result = caseEDSCmd(edsCmd);
				if (result == null) result = caseEDSC(edsCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAdapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAdapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAdapter(EAdapter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECommunication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECommunication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECommunication(ECommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EResource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EResource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEResource(EResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EComponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EComponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEComponent(EComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EData</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EData</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEData(EData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEntity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEntity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEntity(EEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDS Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDS Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDSCmd(EDSCmd object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EDS Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDS Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDSEntity(EDSEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDSC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDSC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDSC(EDSC object) {
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

} //AdapterSwitch
