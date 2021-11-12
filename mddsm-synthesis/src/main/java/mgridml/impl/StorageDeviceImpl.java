/**
 */
package mgridml.impl;

import mgridml.ChargeEnum;
import mgridml.MgridmlPackage;
import mgridml.StorageDevice;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.StorageDeviceImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link mgridml.impl.StorageDeviceImpl#isCharging <em>Charging</em>}</li>
 *   <li>{@link mgridml.impl.StorageDeviceImpl#getChargeT <em>Charge T</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageDeviceImpl extends DeviceImpl implements StorageDevice {
	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected float capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isCharging() <em>Charging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCharging()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHARGING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCharging() <em>Charging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCharging()
	 * @generated
	 * @ordered
	 */
	protected boolean charging = CHARGING_EDEFAULT;

	/**
	 * The default value of the '{@link #getChargeT() <em>Charge T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeT()
	 * @generated
	 * @ordered
	 */
	protected static final ChargeEnum CHARGE_T_EDEFAULT = ChargeEnum.CHARGE;

	/**
	 * The cached value of the '{@link #getChargeT() <em>Charge T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeT()
	 * @generated
	 * @ordered
	 */
	protected ChargeEnum chargeT = CHARGE_T_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.STORAGE_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(float newCapacity) {
		float oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.STORAGE_DEVICE__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCharging() {
		return charging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharging(boolean newCharging) {
		boolean oldCharging = charging;
		charging = newCharging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.STORAGE_DEVICE__CHARGING, oldCharging, charging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeEnum getChargeT() {
		return chargeT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeT(ChargeEnum newChargeT) {
		ChargeEnum oldChargeT = chargeT;
		chargeT = newChargeT == null ? CHARGE_T_EDEFAULT : newChargeT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.STORAGE_DEVICE__CHARGE_T, oldChargeT, chargeT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MgridmlPackage.STORAGE_DEVICE__CAPACITY:
				return getCapacity();
			case MgridmlPackage.STORAGE_DEVICE__CHARGING:
				return isCharging();
			case MgridmlPackage.STORAGE_DEVICE__CHARGE_T:
				return getChargeT();
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
			case MgridmlPackage.STORAGE_DEVICE__CAPACITY:
				setCapacity((Float)newValue);
				return;
			case MgridmlPackage.STORAGE_DEVICE__CHARGING:
				setCharging((Boolean)newValue);
				return;
			case MgridmlPackage.STORAGE_DEVICE__CHARGE_T:
				setChargeT((ChargeEnum)newValue);
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
			case MgridmlPackage.STORAGE_DEVICE__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case MgridmlPackage.STORAGE_DEVICE__CHARGING:
				setCharging(CHARGING_EDEFAULT);
				return;
			case MgridmlPackage.STORAGE_DEVICE__CHARGE_T:
				setChargeT(CHARGE_T_EDEFAULT);
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
			case MgridmlPackage.STORAGE_DEVICE__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case MgridmlPackage.STORAGE_DEVICE__CHARGING:
				return charging != CHARGING_EDEFAULT;
			case MgridmlPackage.STORAGE_DEVICE__CHARGE_T:
				return chargeT != CHARGE_T_EDEFAULT;
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
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(", charging: ");
		result.append(charging);
		result.append(", chargeT: ");
		result.append(chargeT);
		result.append(')');
		return result.toString();
	}

} //StorageDeviceImpl
