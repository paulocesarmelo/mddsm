/**
 */
package mgridml.impl;

import m4md.impl.EDomainSpecificTypeImpl;

import mgridml.CriticalEnum;
import mgridml.LoadDeviceType;
import mgridml.MgridmlPackage;
import mgridml.UsageEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.LoadDeviceTypeImpl#getSoTypeID <em>So Type ID</em>}</li>
 *   <li>{@link mgridml.impl.LoadDeviceTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link mgridml.impl.LoadDeviceTypeImpl#getCritical <em>Critical</em>}</li>
 *   <li>{@link mgridml.impl.LoadDeviceTypeImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadDeviceTypeImpl extends EDomainSpecificTypeImpl implements LoadDeviceType {
	/**
	 * The default value of the '{@link #getSoTypeID() <em>So Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final String SO_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoTypeID() <em>So Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoTypeID()
	 * @generated
	 * @ordered
	 */
	protected String soTypeID = SO_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final UsageEnum USAGE_EDEFAULT = UsageEnum.HVAC;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected UsageEnum usage = USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.LOAD_DEVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoTypeID() {
		return soTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoTypeID(String newSoTypeID) {
		String oldSoTypeID = soTypeID;
		soTypeID = newSoTypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.LOAD_DEVICE_TYPE__SO_TYPE_ID, oldSoTypeID, soTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.LOAD_DEVICE_TYPE__TYPE_NAME, oldTypeName, typeName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.LOAD_DEVICE_TYPE__CRITICAL, oldCritical, critical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageEnum getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(UsageEnum newUsage) {
		UsageEnum oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.LOAD_DEVICE_TYPE__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MgridmlPackage.LOAD_DEVICE_TYPE__SO_TYPE_ID:
				return getSoTypeID();
			case MgridmlPackage.LOAD_DEVICE_TYPE__TYPE_NAME:
				return getTypeName();
			case MgridmlPackage.LOAD_DEVICE_TYPE__CRITICAL:
				return getCritical();
			case MgridmlPackage.LOAD_DEVICE_TYPE__USAGE:
				return getUsage();
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
			case MgridmlPackage.LOAD_DEVICE_TYPE__SO_TYPE_ID:
				setSoTypeID((String)newValue);
				return;
			case MgridmlPackage.LOAD_DEVICE_TYPE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case MgridmlPackage.LOAD_DEVICE_TYPE__CRITICAL:
				setCritical((CriticalEnum)newValue);
				return;
			case MgridmlPackage.LOAD_DEVICE_TYPE__USAGE:
				setUsage((UsageEnum)newValue);
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
			case MgridmlPackage.LOAD_DEVICE_TYPE__SO_TYPE_ID:
				setSoTypeID(SO_TYPE_ID_EDEFAULT);
				return;
			case MgridmlPackage.LOAD_DEVICE_TYPE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case MgridmlPackage.LOAD_DEVICE_TYPE__CRITICAL:
				setCritical(CRITICAL_EDEFAULT);
				return;
			case MgridmlPackage.LOAD_DEVICE_TYPE__USAGE:
				setUsage(USAGE_EDEFAULT);
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
			case MgridmlPackage.LOAD_DEVICE_TYPE__SO_TYPE_ID:
				return SO_TYPE_ID_EDEFAULT == null ? soTypeID != null : !SO_TYPE_ID_EDEFAULT.equals(soTypeID);
			case MgridmlPackage.LOAD_DEVICE_TYPE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case MgridmlPackage.LOAD_DEVICE_TYPE__CRITICAL:
				return critical != CRITICAL_EDEFAULT;
			case MgridmlPackage.LOAD_DEVICE_TYPE__USAGE:
				return usage != USAGE_EDEFAULT;
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
		result.append(" (soTypeID: ");
		result.append(soTypeID);
		result.append(", typeName: ");
		result.append(typeName);
		result.append(", critical: ");
		result.append(critical);
		result.append(", usage: ");
		result.append(usage);
		result.append(')');
		return result.toString();
	}

} //LoadDeviceTypeImpl
