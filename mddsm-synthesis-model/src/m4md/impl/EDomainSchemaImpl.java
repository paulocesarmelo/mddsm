/**
 */
package m4md.impl;

import m4md.EControlSchema;
import m4md.EDataSchema;
import m4md.EDomainSchema;
import m4md.M4mdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDomain Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m4md.impl.EDomainSchemaImpl#getCs <em>Cs</em>}</li>
 *   <li>{@link m4md.impl.EDomainSchemaImpl#getDs <em>Ds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDomainSchemaImpl extends MinimalEObjectImpl.Container implements EDomainSchema {
	/**
	 * The cached value of the '{@link #getCs() <em>Cs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCs()
	 * @generated
	 * @ordered
	 */
	protected EControlSchema cs;

	/**
	 * The cached value of the '{@link #getDs() <em>Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDs()
	 * @generated
	 * @ordered
	 */
	protected EDataSchema ds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDomainSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M4mdPackage.Literals.EDOMAIN_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EControlSchema getCs() {
		return cs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCs(EControlSchema newCs, NotificationChain msgs) {
		EControlSchema oldCs = cs;
		cs = newCs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4mdPackage.EDOMAIN_SCHEMA__CS, oldCs, newCs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCs(EControlSchema newCs) {
		if (newCs != cs) {
			NotificationChain msgs = null;
			if (cs != null)
				msgs = ((InternalEObject)cs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4mdPackage.EDOMAIN_SCHEMA__CS, null, msgs);
			if (newCs != null)
				msgs = ((InternalEObject)newCs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4mdPackage.EDOMAIN_SCHEMA__CS, null, msgs);
			msgs = basicSetCs(newCs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4mdPackage.EDOMAIN_SCHEMA__CS, newCs, newCs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataSchema getDs() {
		return ds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDs(EDataSchema newDs, NotificationChain msgs) {
		EDataSchema oldDs = ds;
		ds = newDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4mdPackage.EDOMAIN_SCHEMA__DS, oldDs, newDs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDs(EDataSchema newDs) {
		if (newDs != ds) {
			NotificationChain msgs = null;
			if (ds != null)
				msgs = ((InternalEObject)ds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4mdPackage.EDOMAIN_SCHEMA__DS, null, msgs);
			if (newDs != null)
				msgs = ((InternalEObject)newDs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4mdPackage.EDOMAIN_SCHEMA__DS, null, msgs);
			msgs = basicSetDs(newDs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4mdPackage.EDOMAIN_SCHEMA__DS, newDs, newDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4mdPackage.EDOMAIN_SCHEMA__CS:
				return basicSetCs(null, msgs);
			case M4mdPackage.EDOMAIN_SCHEMA__DS:
				return basicSetDs(null, msgs);
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
			case M4mdPackage.EDOMAIN_SCHEMA__CS:
				return getCs();
			case M4mdPackage.EDOMAIN_SCHEMA__DS:
				return getDs();
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
			case M4mdPackage.EDOMAIN_SCHEMA__CS:
				setCs((EControlSchema)newValue);
				return;
			case M4mdPackage.EDOMAIN_SCHEMA__DS:
				setDs((EDataSchema)newValue);
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
			case M4mdPackage.EDOMAIN_SCHEMA__CS:
				setCs((EControlSchema)null);
				return;
			case M4mdPackage.EDOMAIN_SCHEMA__DS:
				setDs((EDataSchema)null);
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
			case M4mdPackage.EDOMAIN_SCHEMA__CS:
				return cs != null;
			case M4mdPackage.EDOMAIN_SCHEMA__DS:
				return ds != null;
		}
		return super.eIsSet(featureID);
	}

} //EDomainSchemaImpl
