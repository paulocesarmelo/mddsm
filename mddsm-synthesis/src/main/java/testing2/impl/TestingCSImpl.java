/**
 */
package testing2.impl;

import m4md.impl.EControlSchemaImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import testing2.Testing2Package;
import testing2.TestingCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Testing CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testing2.impl.TestingCSImpl#getCsId <em>Cs Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestingCSImpl extends EControlSchemaImpl implements TestingCS {
	/**
	 * The default value of the '{@link #getCsId() <em>Cs Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsId()
	 * @generated
	 * @ordered
	 */
	protected static final int CS_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCsId() <em>Cs Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsId()
	 * @generated
	 * @ordered
	 */
	protected int csId = CS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestingCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Testing2Package.Literals.TESTING_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCsId() {
		return csId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsId(int newCsId) {
		int oldCsId = csId;
		csId = newCsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Testing2Package.TESTING_CS__CS_ID, oldCsId, csId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Testing2Package.TESTING_CS__CS_ID:
				return getCsId();
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
			case Testing2Package.TESTING_CS__CS_ID:
				setCsId((Integer)newValue);
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
			case Testing2Package.TESTING_CS__CS_ID:
				setCsId(CS_ID_EDEFAULT);
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
			case Testing2Package.TESTING_CS__CS_ID:
				return csId != CS_ID_EDEFAULT;
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
		result.append(" (csId: ");
		result.append(csId);
		result.append(')');
		return result.toString();
	}

} //TestingCSImpl
