/**
 */
package mgridml.impl;

import m4md.impl.EControlSchemaImpl;

import mgridml.MCGrid;
import mgridml.MGridControlSchema;
import mgridml.MgridmlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MGrid Control Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.MGridControlSchemaImpl#getMcgrid <em>Mcgrid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MGridControlSchemaImpl extends EControlSchemaImpl implements MGridControlSchema {
	/**
	 * The cached value of the '{@link #getMcgrid() <em>Mcgrid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcgrid()
	 * @generated
	 * @ordered
	 */
	protected MCGrid mcgrid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MGridControlSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.MGRID_CONTROL_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCGrid getMcgrid() {
		return mcgrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMcgrid(MCGrid newMcgrid, NotificationChain msgs) {
		MCGrid oldMcgrid = mcgrid;
		mcgrid = newMcgrid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MgridmlPackage.MGRID_CONTROL_SCHEMA__MCGRID, oldMcgrid, newMcgrid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMcgrid(MCGrid newMcgrid) {
		if (newMcgrid != mcgrid) {
			NotificationChain msgs = null;
			if (mcgrid != null)
				msgs = ((InternalEObject)mcgrid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MgridmlPackage.MGRID_CONTROL_SCHEMA__MCGRID, null, msgs);
			if (newMcgrid != null)
				msgs = ((InternalEObject)newMcgrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MgridmlPackage.MGRID_CONTROL_SCHEMA__MCGRID, null, msgs);
			msgs = basicSetMcgrid(newMcgrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.MGRID_CONTROL_SCHEMA__MCGRID, newMcgrid, newMcgrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MgridmlPackage.MGRID_CONTROL_SCHEMA__MCGRID:
				return basicSetMcgrid(null, msgs);
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
			case MgridmlPackage.MGRID_CONTROL_SCHEMA__MCGRID:
				return getMcgrid();
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
			case MgridmlPackage.MGRID_CONTROL_SCHEMA__MCGRID:
				setMcgrid((MCGrid)newValue);
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
			case MgridmlPackage.MGRID_CONTROL_SCHEMA__MCGRID:
				setMcgrid((MCGrid)null);
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
			case MgridmlPackage.MGRID_CONTROL_SCHEMA__MCGRID:
				return mcgrid != null;
		}
		return super.eIsSet(featureID);
	}

} //MGridControlSchemaImpl
