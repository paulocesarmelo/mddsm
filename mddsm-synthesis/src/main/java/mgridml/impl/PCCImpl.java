/**
 */
package mgridml.impl;

import mgridml.MeterType;
import mgridml.MgridmlPackage;
import mgridml.PCC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.PCCImpl#getMeterType <em>Meter Type</em>}</li>
 *   <li>{@link mgridml.impl.PCCImpl#isConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCCImpl extends AtomicControllerImpl implements PCC {
	/**
	 * The cached value of the '{@link #getMeterType() <em>Meter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeterType()
	 * @generated
	 * @ordered
	 */
	protected MeterType meterType;

	/**
	 * The default value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConnected() <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnected()
	 * @generated
	 * @ordered
	 */
	protected boolean connected = CONNECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.PCC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterType getMeterType() {
		return meterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeterType(MeterType newMeterType, NotificationChain msgs) {
		MeterType oldMeterType = meterType;
		meterType = newMeterType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgridmlPackage.PCC__METER_TYPE, oldMeterType, newMeterType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeterType(MeterType newMeterType) {
		if (newMeterType != meterType) {
			NotificationChain msgs = null;
			if (meterType != null)
				msgs = ((InternalEObject)meterType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgridmlPackage.PCC__METER_TYPE, null, msgs);
			if (newMeterType != null)
				msgs = ((InternalEObject)newMeterType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgridmlPackage.PCC__METER_TYPE, null, msgs);
			msgs = basicSetMeterType(newMeterType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.PCC__METER_TYPE, newMeterType, newMeterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnected(boolean newConnected) {
		boolean oldConnected = connected;
		connected = newConnected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.PCC__CONNECTED, oldConnected, connected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MgridmlPackage.PCC__METER_TYPE:
				return basicSetMeterType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MgridmlPackage.PCC__METER_TYPE:
				return getMeterType();
			case MgridmlPackage.PCC__CONNECTED:
				return isConnected();
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
			case MgridmlPackage.PCC__METER_TYPE:
				setMeterType((MeterType)newValue);
				return;
			case MgridmlPackage.PCC__CONNECTED:
				setConnected((Boolean)newValue);
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
			case MgridmlPackage.PCC__METER_TYPE:
				setMeterType((MeterType)null);
				return;
			case MgridmlPackage.PCC__CONNECTED:
				setConnected(CONNECTED_EDEFAULT);
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
			case MgridmlPackage.PCC__METER_TYPE:
				return meterType != null;
			case MgridmlPackage.PCC__CONNECTED:
				return connected != CONNECTED_EDEFAULT;
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
		result.append(" (connected: ");
		result.append(connected);
		result.append(')');
		return result.toString();
	}

} //PCCImpl
