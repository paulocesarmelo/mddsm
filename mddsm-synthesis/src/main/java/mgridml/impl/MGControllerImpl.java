/**
 */
package mgridml.impl;

import m4md.impl.EActorImpl;

import mgridml.MGController;
import mgridml.MgridmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MG Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.MGControllerImpl#getCtypeID <em>Ctype ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MGControllerImpl extends EActorImpl implements MGController {
	/**
	 * The default value of the '{@link #getCtypeID() <em>Ctype ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtypeID()
	 * @generated
	 * @ordered
	 */
	protected static final String CTYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCtypeID() <em>Ctype ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtypeID()
	 * @generated
	 * @ordered
	 */
	protected String ctypeID = CTYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MGControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.MG_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCtypeID() {
		return ctypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtypeID(String newCtypeID) {
		String oldCtypeID = ctypeID;
		ctypeID = newCtypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.MG_CONTROLLER__CTYPE_ID, oldCtypeID, ctypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MgridmlPackage.MG_CONTROLLER__CTYPE_ID:
				return getCtypeID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MgridmlPackage.MG_CONTROLLER__CTYPE_ID:
				setCtypeID((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MgridmlPackage.MG_CONTROLLER__CTYPE_ID:
				setCtypeID(CTYPE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MgridmlPackage.MG_CONTROLLER__CTYPE_ID:
				return CTYPE_ID_EDEFAULT == null ? ctypeID != null : !CTYPE_ID_EDEFAULT.equals(ctypeID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ctypeID: ");
		result.append(ctypeID);
		result.append(')');
		return result.toString();
	}

} //MGControllerImpl
