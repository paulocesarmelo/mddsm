/**
 */
package mgridml.impl;

import mgridml.ControlEnum;
import mgridml.CriticalEnum;
import mgridml.LoadDevice;
import mgridml.MgridmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.LoadDeviceImpl#getControl <em>Control</em>}</li>
 *   <li>{@link mgridml.impl.LoadDeviceImpl#getCritical <em>Critical</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadDeviceImpl extends DeviceImpl implements LoadDevice {
	/**
	 * The default value of the '{@link #getControl() <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected static final ControlEnum CONTROL_EDEFAULT = ControlEnum.CONTROLLABLE;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected ControlEnum control = CONTROL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCritical()
	 * @generated
	 * @ordered
	 */
	protected static final CriticalEnum CRITICAL_EDEFAULT = CriticalEnum.SENSITIVE;

	/**
	 * The cached value of the '{@link #getCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCritical()
	 * @generated
	 * @ordered
	 */
	protected CriticalEnum critical = CRITICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.LOAD_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlEnum getControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(ControlEnum newControl) {
		ControlEnum oldControl = control;
		control = newControl == null ? CONTROL_EDEFAULT : newControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.LOAD_DEVICE__CONTROL, oldControl, control));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalEnum getCritical() {
		return critical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCritical(CriticalEnum newCritical) {
		CriticalEnum oldCritical = critical;
		critical = newCritical == null ? CRITICAL_EDEFAULT : newCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.LOAD_DEVICE__CRITICAL, oldCritical, critical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MgridmlPackage.LOAD_DEVICE__CONTROL:
				return getControl();
			case MgridmlPackage.LOAD_DEVICE__CRITICAL:
				return getCritical();
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
			case MgridmlPackage.LOAD_DEVICE__CONTROL:
				setControl((ControlEnum)newValue);
				return;
			case MgridmlPackage.LOAD_DEVICE__CRITICAL:
				setCritical((CriticalEnum)newValue);
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
			case MgridmlPackage.LOAD_DEVICE__CONTROL:
				setControl(CONTROL_EDEFAULT);
				return;
			case MgridmlPackage.LOAD_DEVICE__CRITICAL:
				setCritical(CRITICAL_EDEFAULT);
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
			case MgridmlPackage.LOAD_DEVICE__CONTROL:
				return control != CONTROL_EDEFAULT;
			case MgridmlPackage.LOAD_DEVICE__CRITICAL:
				return critical != CRITICAL_EDEFAULT;
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
		result.append(" (control: ");
		result.append(control);
		result.append(", critical: ");
		result.append(critical);
		result.append(')');
		return result.toString();
	}

} //LoadDeviceImpl
