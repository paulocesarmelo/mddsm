/**
 */
package mgridml.impl;

import m4md.impl.EDomainSchemaImpl;

import mgridml.MGridSchema;
import mgridml.MgridmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MGrid Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.MGridSchemaImpl#getMgridModelID <em>Mgrid Model ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MGridSchemaImpl extends EDomainSchemaImpl implements MGridSchema {
	/**
	 * The default value of the '{@link #getMgridModelID() <em>Mgrid Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMgridModelID()
	 * @generated
	 * @ordered
	 */
	protected static final String MGRID_MODEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMgridModelID() <em>Mgrid Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMgridModelID()
	 * @generated
	 * @ordered
	 */
	protected String mgridModelID = MGRID_MODEL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MGridSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.MGRID_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMgridModelID() {
		return mgridModelID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMgridModelID(String newMgridModelID) {
		String oldMgridModelID = mgridModelID;
		mgridModelID = newMgridModelID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.MGRID_SCHEMA__MGRID_MODEL_ID, oldMgridModelID, mgridModelID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MgridmlPackage.MGRID_SCHEMA__MGRID_MODEL_ID:
				return getMgridModelID();
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
			case MgridmlPackage.MGRID_SCHEMA__MGRID_MODEL_ID:
				setMgridModelID((String)newValue);
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
			case MgridmlPackage.MGRID_SCHEMA__MGRID_MODEL_ID:
				setMgridModelID(MGRID_MODEL_ID_EDEFAULT);
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
			case MgridmlPackage.MGRID_SCHEMA__MGRID_MODEL_ID:
				return MGRID_MODEL_ID_EDEFAULT == null ? mgridModelID != null : !MGRID_MODEL_ID_EDEFAULT.equals(mgridModelID);
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
		result.append(" (mgridModelID: ");
		result.append(mgridModelID);
		result.append(')');
		return result.toString();
	}

} //MGridSchemaImpl
