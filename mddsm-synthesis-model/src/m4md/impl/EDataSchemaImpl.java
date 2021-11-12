/**
 */
package m4md.impl;

import java.util.Collection;

import m4md.EControlSchema;
import m4md.EDataSchema;
import m4md.EItem;
import m4md.M4mdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EData Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m4md.impl.EDataSchemaImpl#getCs <em>Cs</em>}</li>
 *   <li>{@link m4md.impl.EDataSchemaImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EDataSchemaImpl extends MinimalEObjectImpl.Container implements EDataSchema {
	/**
	 * The cached value of the '{@link #getCs() <em>Cs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCs()
	 * @generated
	 * @ordered
	 */
	protected EControlSchema cs;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<EItem> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDataSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M4mdPackage.Literals.EDATA_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EControlSchema getCs() {
		if (cs != null && cs.eIsProxy()) {
			InternalEObject oldCs = (InternalEObject)cs;
			cs = (EControlSchema)eResolveProxy(oldCs);
			if (cs != oldCs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4mdPackage.EDATA_SCHEMA__CS, oldCs, cs));
			}
		}
		return cs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EControlSchema basicGetCs() {
		return cs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCs(EControlSchema newCs) {
		EControlSchema oldCs = cs;
		cs = newCs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4mdPackage.EDATA_SCHEMA__CS, oldCs, cs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<EItem>(EItem.class, this, M4mdPackage.EDATA_SCHEMA__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4mdPackage.EDATA_SCHEMA__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case M4mdPackage.EDATA_SCHEMA__CS:
				if (resolve) return getCs();
				return basicGetCs();
			case M4mdPackage.EDATA_SCHEMA__ITEM:
				return getItem();
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
			case M4mdPackage.EDATA_SCHEMA__CS:
				setCs((EControlSchema)newValue);
				return;
			case M4mdPackage.EDATA_SCHEMA__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends EItem>)newValue);
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
			case M4mdPackage.EDATA_SCHEMA__CS:
				setCs((EControlSchema)null);
				return;
			case M4mdPackage.EDATA_SCHEMA__ITEM:
				getItem().clear();
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
			case M4mdPackage.EDATA_SCHEMA__CS:
				return cs != null;
			case M4mdPackage.EDATA_SCHEMA__ITEM:
				return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EDataSchemaImpl
