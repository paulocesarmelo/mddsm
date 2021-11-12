/**
 */
package mgridml.impl;

import mgridml.MgridmlPackage;
import mgridml.SmartMeter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.SmartMeterImpl#getTariff <em>Tariff</em>}</li>
 *   <li>{@link mgridml.impl.SmartMeterImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link mgridml.impl.SmartMeterImpl#isOperational <em>Operational</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartMeterImpl extends MeterImpl implements SmartMeter {
	/**
	 * The default value of the '{@link #getTariff() <em>Tariff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariff()
	 * @generated
	 * @ordered
	 */
	protected static final float TARIFF_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTariff() <em>Tariff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTariff()
	 * @generated
	 * @ordered
	 */
	protected float tariff = TARIFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final float USAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected float usage = USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOperational() <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperational()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPERATIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOperational() <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperational()
	 * @generated
	 * @ordered
	 */
	protected boolean operational = OPERATIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.SMART_METER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTariff() {
		return tariff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTariff(float newTariff) {
		float oldTariff = tariff;
		tariff = newTariff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.SMART_METER__TARIFF, oldTariff, tariff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(float newUsage) {
		float oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.SMART_METER__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOperational() {
		return operational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperational(boolean newOperational) {
		boolean oldOperational = operational;
		operational = newOperational;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.SMART_METER__OPERATIONAL, oldOperational, operational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MgridmlPackage.SMART_METER__TARIFF:
				return getTariff();
			case MgridmlPackage.SMART_METER__USAGE:
				return getUsage();
			case MgridmlPackage.SMART_METER__OPERATIONAL:
				return isOperational();
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
			case MgridmlPackage.SMART_METER__TARIFF:
				setTariff((Float)newValue);
				return;
			case MgridmlPackage.SMART_METER__USAGE:
				setUsage((Float)newValue);
				return;
			case MgridmlPackage.SMART_METER__OPERATIONAL:
				setOperational((Boolean)newValue);
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
			case MgridmlPackage.SMART_METER__TARIFF:
				setTariff(TARIFF_EDEFAULT);
				return;
			case MgridmlPackage.SMART_METER__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case MgridmlPackage.SMART_METER__OPERATIONAL:
				setOperational(OPERATIONAL_EDEFAULT);
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
			case MgridmlPackage.SMART_METER__TARIFF:
				return tariff != TARIFF_EDEFAULT;
			case MgridmlPackage.SMART_METER__USAGE:
				return usage != USAGE_EDEFAULT;
			case MgridmlPackage.SMART_METER__OPERATIONAL:
				return operational != OPERATIONAL_EDEFAULT;
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
		result.append(" (tariff: ");
		result.append(tariff);
		result.append(", usage: ");
		result.append(usage);
		result.append(", operational: ");
		result.append(operational);
		result.append(')');
		return result.toString();
	}

} //SmartMeterImpl
