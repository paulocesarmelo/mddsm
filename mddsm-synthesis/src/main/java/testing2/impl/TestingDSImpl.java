/**
 */
package testing2.impl;

import m4md.impl.EDataSchemaImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import testing2.Testing2Package;
import testing2.TestingDS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing DS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testing2.impl.TestingDSImpl#getDsId <em>Ds Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingDSImpl extends EDataSchemaImpl implements TestingDS {
	/**
	 * The default value of the '{@link #getDsId() <em>Ds Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsId()
	 * @generated
	 * @ordered
	 */
	protected static final int DS_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDsId() <em>Ds Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsId()
	 * @generated
	 * @ordered
	 */
	protected int dsId = DS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingDSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Testing2Package.Literals.TESTING_DS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDsId() {
		return dsId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDsId(int newDsId) {
		int oldDsId = dsId;
		dsId = newDsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Testing2Package.TESTING_DS__DS_ID, oldDsId, dsId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Testing2Package.TESTING_DS__DS_ID:
				return getDsId();
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
			case Testing2Package.TESTING_DS__DS_ID:
				setDsId((Integer)newValue);
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
			case Testing2Package.TESTING_DS__DS_ID:
				setDsId(DS_ID_EDEFAULT);
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
			case Testing2Package.TESTING_DS__DS_ID:
				return dsId != DS_ID_EDEFAULT;
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
		result.append(" (dsId: ");
		result.append(dsId);
		result.append(')');
		return result.toString();
	}

} //TestingDSImpl
