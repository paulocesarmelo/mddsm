/**
 */
package mgridml.impl;

import java.util.Collection;

import mgridml.Device;
import mgridml.DeviceProperty;
import mgridml.MgridmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.DeviceImpl#getDeviceProperty <em>Device Property</em>}</li>
 *   <li>{@link mgridml.impl.DeviceImpl#getDeviceTypeID <em>Device Type ID</em>}</li>
 *   <li>{@link mgridml.impl.DeviceImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link mgridml.impl.DeviceImpl#getWattage <em>Wattage</em>}</li>
 *   <li>{@link mgridml.impl.DeviceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mgridml.impl.DeviceImpl#isOperational <em>Operational</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends PlantElemImpl implements Device {
	/**
	 * The cached value of the '{@link #getDeviceProperty() <em>Device Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceProperty> deviceProperty;

	/**
	 * The default value of the '{@link #getDeviceTypeID() <em>Device Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceTypeID() <em>Device Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceTypeID()
	 * @generated
	 * @ordered
	 */
	protected String deviceTypeID = DEVICE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected String deviceName = DEVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWattage() <em>Wattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWattage()
	 * @generated
	 * @ordered
	 */
	protected static final float WATTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWattage() <em>Wattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWattage()
	 * @generated
	 * @ordered
	 */
	protected float wattage = WATTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceProperty> getDeviceProperty() {
		if (deviceProperty == null) {
			deviceProperty = new EObjectContainmentEList<DeviceProperty>(DeviceProperty.class, this, MgridmlPackage.DEVICE__DEVICE_PROPERTY);
		}
		return deviceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceTypeID() {
		return deviceTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceTypeID(String newDeviceTypeID) {
		String oldDeviceTypeID = deviceTypeID;
		deviceTypeID = newDeviceTypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.DEVICE__DEVICE_TYPE_ID, oldDeviceTypeID, deviceTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceName(String newDeviceName) {
		String oldDeviceName = deviceName;
		deviceName = newDeviceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.DEVICE__DEVICE_NAME, oldDeviceName, deviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWattage() {
		return wattage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWattage(float newWattage) {
		float oldWattage = wattage;
		wattage = newWattage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.DEVICE__WATTAGE, oldWattage, wattage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.DEVICE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.DEVICE__OPERATIONAL, oldOperational, operational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MgridmlPackage.DEVICE__DEVICE_PROPERTY:
				return ((InternalEList<?>)getDeviceProperty()).basicRemove(otherEnd, msgs);
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
			case MgridmlPackage.DEVICE__DEVICE_PROPERTY:
				return getDeviceProperty();
			case MgridmlPackage.DEVICE__DEVICE_TYPE_ID:
				return getDeviceTypeID();
			case MgridmlPackage.DEVICE__DEVICE_NAME:
				return getDeviceName();
			case MgridmlPackage.DEVICE__WATTAGE:
				return getWattage();
			case MgridmlPackage.DEVICE__DESCRIPTION:
				return getDescription();
			case MgridmlPackage.DEVICE__OPERATIONAL:
				return isOperational();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MgridmlPackage.DEVICE__DEVICE_PROPERTY:
				getDeviceProperty().clear();
				getDeviceProperty().addAll((Collection<? extends DeviceProperty>)newValue);
				return;
			case MgridmlPackage.DEVICE__DEVICE_TYPE_ID:
				setDeviceTypeID((String)newValue);
				return;
			case MgridmlPackage.DEVICE__DEVICE_NAME:
				setDeviceName((String)newValue);
				return;
			case MgridmlPackage.DEVICE__WATTAGE:
				setWattage((Float)newValue);
				return;
			case MgridmlPackage.DEVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MgridmlPackage.DEVICE__OPERATIONAL:
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
			case MgridmlPackage.DEVICE__DEVICE_PROPERTY:
				getDeviceProperty().clear();
				return;
			case MgridmlPackage.DEVICE__DEVICE_TYPE_ID:
				setDeviceTypeID(DEVICE_TYPE_ID_EDEFAULT);
				return;
			case MgridmlPackage.DEVICE__DEVICE_NAME:
				setDeviceName(DEVICE_NAME_EDEFAULT);
				return;
			case MgridmlPackage.DEVICE__WATTAGE:
				setWattage(WATTAGE_EDEFAULT);
				return;
			case MgridmlPackage.DEVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MgridmlPackage.DEVICE__OPERATIONAL:
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
			case MgridmlPackage.DEVICE__DEVICE_PROPERTY:
				return deviceProperty != null && !deviceProperty.isEmpty();
			case MgridmlPackage.DEVICE__DEVICE_TYPE_ID:
				return DEVICE_TYPE_ID_EDEFAULT == null ? deviceTypeID != null : !DEVICE_TYPE_ID_EDEFAULT.equals(deviceTypeID);
			case MgridmlPackage.DEVICE__DEVICE_NAME:
				return DEVICE_NAME_EDEFAULT == null ? deviceName != null : !DEVICE_NAME_EDEFAULT.equals(deviceName);
			case MgridmlPackage.DEVICE__WATTAGE:
				return wattage != WATTAGE_EDEFAULT;
			case MgridmlPackage.DEVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MgridmlPackage.DEVICE__OPERATIONAL:
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
		result.append(" (deviceTypeID: ");
		result.append(deviceTypeID);
		result.append(", deviceName: ");
		result.append(deviceName);
		result.append(", wattage: ");
		result.append(wattage);
		result.append(", description: ");
		result.append(description);
		result.append(", operational: ");
		result.append(operational);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
