/**
 */
package mgridml.impl;

import java.util.Collection;

import mgridml.MgridmlPackage;
import mgridml.StorageController;
import mgridml.StorageDeviceType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.StorageControllerImpl#getStorageDeviceType <em>Storage Device Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageControllerImpl extends AtomicControllerImpl implements StorageController {
	/**
	 * The cached value of the '{@link #getStorageDeviceType() <em>Storage Device Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageDeviceType()
	 * @generated
	 * @ordered
	 */
	protected EList<StorageDeviceType> storageDeviceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.STORAGE_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StorageDeviceType> getStorageDeviceType() {
		if (storageDeviceType == null) {
			storageDeviceType = new EObjectContainmentEList<StorageDeviceType>(StorageDeviceType.class, this, MgridmlPackage.STORAGE_CONTROLLER__STORAGE_DEVICE_TYPE);
		}
		return storageDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MgridmlPackage.STORAGE_CONTROLLER__STORAGE_DEVICE_TYPE:
				return ((InternalEList<?>)getStorageDeviceType()).basicRemove(otherEnd, msgs);
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
			case MgridmlPackage.STORAGE_CONTROLLER__STORAGE_DEVICE_TYPE:
				return getStorageDeviceType();
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
			case MgridmlPackage.STORAGE_CONTROLLER__STORAGE_DEVICE_TYPE:
				getStorageDeviceType().clear();
				getStorageDeviceType().addAll((Collection<? extends StorageDeviceType>)newValue);
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
			case MgridmlPackage.STORAGE_CONTROLLER__STORAGE_DEVICE_TYPE:
				getStorageDeviceType().clear();
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
			case MgridmlPackage.STORAGE_CONTROLLER__STORAGE_DEVICE_TYPE:
				return storageDeviceType != null && !storageDeviceType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StorageControllerImpl
