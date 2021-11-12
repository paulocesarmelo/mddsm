/**
 */
package mgridml.impl;

import m4md.impl.EDomainSpecificTypeImpl;

import mgridml.MgridmlPackage;
import mgridml.StorageDeviceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.StorageDeviceTypeImpl#getSoTypeID <em>So Type ID</em>}</li>
 *   <li>{@link mgridml.impl.StorageDeviceTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link mgridml.impl.StorageDeviceTypeImpl#getLowerThres <em>Lower Thres</em>}</li>
 *   <li>{@link mgridml.impl.StorageDeviceTypeImpl#getUpperThres <em>Upper Thres</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageDeviceTypeImpl extends EDomainSpecificTypeImpl implements StorageDeviceType {
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
	 * The default value of the '{@link #getLowerThres() <em>Lower Thres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerThres()
	 * @generated
	 * @ordered
	 */
	protected static final float LOWER_THRES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowerThres() <em>Lower Thres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerThres()
	 * @generated
	 * @ordered
	 */
	protected float lowerThres = LOWER_THRES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperThres() <em>Upper Thres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperThres()
	 * @generated
	 * @ordered
	 */
	protected static final float UPPER_THRES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUpperThres() <em>Upper Thres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperThres()
	 * @generated
	 * @ordered
	 */
	protected float upperThres = UPPER_THRES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.STORAGE_DEVICE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.STORAGE_DEVICE_TYPE__SO_TYPE_ID, oldSoTypeID, soTypeID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.STORAGE_DEVICE_TYPE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowerThres() {
		return lowerThres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerThres(float newLowerThres) {
		float oldLowerThres = lowerThres;
		lowerThres = newLowerThres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.STORAGE_DEVICE_TYPE__LOWER_THRES, oldLowerThres, lowerThres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUpperThres() {
		return upperThres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperThres(float newUpperThres) {
		float oldUpperThres = upperThres;
		upperThres = newUpperThres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.STORAGE_DEVICE_TYPE__UPPER_THRES, oldUpperThres, upperThres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MgridmlPackage.STORAGE_DEVICE_TYPE__SO_TYPE_ID:
				return getSoTypeID();
			case MgridmlPackage.STORAGE_DEVICE_TYPE__TYPE_NAME:
				return getTypeName();
			case MgridmlPackage.STORAGE_DEVICE_TYPE__LOWER_THRES:
				return getLowerThres();
			case MgridmlPackage.STORAGE_DEVICE_TYPE__UPPER_THRES:
				return getUpperThres();
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
			case MgridmlPackage.STORAGE_DEVICE_TYPE__SO_TYPE_ID:
				setSoTypeID((String)newValue);
				return;
			case MgridmlPackage.STORAGE_DEVICE_TYPE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case MgridmlPackage.STORAGE_DEVICE_TYPE__LOWER_THRES:
				setLowerThres((Float)newValue);
				return;
			case MgridmlPackage.STORAGE_DEVICE_TYPE__UPPER_THRES:
				setUpperThres((Float)newValue);
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
			case MgridmlPackage.STORAGE_DEVICE_TYPE__SO_TYPE_ID:
				setSoTypeID(SO_TYPE_ID_EDEFAULT);
				return;
			case MgridmlPackage.STORAGE_DEVICE_TYPE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case MgridmlPackage.STORAGE_DEVICE_TYPE__LOWER_THRES:
				setLowerThres(LOWER_THRES_EDEFAULT);
				return;
			case MgridmlPackage.STORAGE_DEVICE_TYPE__UPPER_THRES:
				setUpperThres(UPPER_THRES_EDEFAULT);
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
			case MgridmlPackage.STORAGE_DEVICE_TYPE__SO_TYPE_ID:
				return SO_TYPE_ID_EDEFAULT == null ? soTypeID != null : !SO_TYPE_ID_EDEFAULT.equals(soTypeID);
			case MgridmlPackage.STORAGE_DEVICE_TYPE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case MgridmlPackage.STORAGE_DEVICE_TYPE__LOWER_THRES:
				return lowerThres != LOWER_THRES_EDEFAULT;
			case MgridmlPackage.STORAGE_DEVICE_TYPE__UPPER_THRES:
				return upperThres != UPPER_THRES_EDEFAULT;
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
		result.append(", lowerThres: ");
		result.append(lowerThres);
		result.append(", upperThres: ");
		result.append(upperThres);
		result.append(')');
		return result.toString();
	}

} //StorageDeviceTypeImpl
