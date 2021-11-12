/**
 */
package mgridml.impl;

import java.util.Collection;

import mgridml.MGController;
import mgridml.MGridController;
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
 * An implementation of the model object '<em><b>MGrid Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.MGridControllerImpl#getMgcontroller <em>Mgcontroller</em>}</li>
 *   <li>{@link mgridml.impl.MGridControllerImpl#getMgridControllerID <em>Mgrid Controller ID</em>}</li>
 *   <li>{@link mgridml.impl.MGridControllerImpl#getTotalLoads <em>Total Loads</em>}</li>
 *   <li>{@link mgridml.impl.MGridControllerImpl#getTotalSources <em>Total Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MGridControllerImpl extends MGControllerImpl implements MGridController {
	/**
	 * The cached value of the '{@link #getMgcontroller() <em>Mgcontroller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMgcontroller()
	 * @generated
	 * @ordered
	 */
	protected EList<MGController> mgcontroller;

	/**
	 * The default value of the '{@link #getMgridControllerID() <em>Mgrid Controller ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMgridControllerID()
	 * @generated
	 * @ordered
	 */
	protected static final String MGRID_CONTROLLER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMgridControllerID() <em>Mgrid Controller ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMgridControllerID()
	 * @generated
	 * @ordered
	 */
	protected String mgridControllerID = MGRID_CONTROLLER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalLoads() <em>Total Loads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLoads()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_LOADS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalLoads() <em>Total Loads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLoads()
	 * @generated
	 * @ordered
	 */
	protected float totalLoads = TOTAL_LOADS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalSources() <em>Total Sources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSources()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_SOURCES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTotalSources() <em>Total Sources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSources()
	 * @generated
	 * @ordered
	 */
	protected float totalSources = TOTAL_SOURCES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MGridControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.MGRID_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MGController> getMgcontroller() {
		if (mgcontroller == null) {
			mgcontroller = new EObjectContainmentEList<MGController>(MGController.class, this, MgridmlPackage.MGRID_CONTROLLER__MGCONTROLLER);
		}
		return mgcontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMgridControllerID() {
		return mgridControllerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMgridControllerID(String newMgridControllerID) {
		String oldMgridControllerID = mgridControllerID;
		mgridControllerID = newMgridControllerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.MGRID_CONTROLLER__MGRID_CONTROLLER_ID, oldMgridControllerID, mgridControllerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalLoads() {
		return totalLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalLoads(float newTotalLoads) {
		float oldTotalLoads = totalLoads;
		totalLoads = newTotalLoads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.MGRID_CONTROLLER__TOTAL_LOADS, oldTotalLoads, totalLoads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTotalSources() {
		return totalSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalSources(float newTotalSources) {
		float oldTotalSources = totalSources;
		totalSources = newTotalSources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.MGRID_CONTROLLER__TOTAL_SOURCES, oldTotalSources, totalSources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MgridmlPackage.MGRID_CONTROLLER__MGCONTROLLER:
				return ((InternalEList<?>)getMgcontroller()).basicRemove(otherEnd, msgs);
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
			case MgridmlPackage.MGRID_CONTROLLER__MGCONTROLLER:
				return getMgcontroller();
			case MgridmlPackage.MGRID_CONTROLLER__MGRID_CONTROLLER_ID:
				return getMgridControllerID();
			case MgridmlPackage.MGRID_CONTROLLER__TOTAL_LOADS:
				return getTotalLoads();
			case MgridmlPackage.MGRID_CONTROLLER__TOTAL_SOURCES:
				return getTotalSources();
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
			case MgridmlPackage.MGRID_CONTROLLER__MGCONTROLLER:
				getMgcontroller().clear();
				getMgcontroller().addAll((Collection<? extends MGController>)newValue);
				return;
			case MgridmlPackage.MGRID_CONTROLLER__MGRID_CONTROLLER_ID:
				setMgridControllerID((String)newValue);
				return;
			case MgridmlPackage.MGRID_CONTROLLER__TOTAL_LOADS:
				setTotalLoads((Float)newValue);
				return;
			case MgridmlPackage.MGRID_CONTROLLER__TOTAL_SOURCES:
				setTotalSources((Float)newValue);
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
			case MgridmlPackage.MGRID_CONTROLLER__MGCONTROLLER:
				getMgcontroller().clear();
				return;
			case MgridmlPackage.MGRID_CONTROLLER__MGRID_CONTROLLER_ID:
				setMgridControllerID(MGRID_CONTROLLER_ID_EDEFAULT);
				return;
			case MgridmlPackage.MGRID_CONTROLLER__TOTAL_LOADS:
				setTotalLoads(TOTAL_LOADS_EDEFAULT);
				return;
			case MgridmlPackage.MGRID_CONTROLLER__TOTAL_SOURCES:
				setTotalSources(TOTAL_SOURCES_EDEFAULT);
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
			case MgridmlPackage.MGRID_CONTROLLER__MGCONTROLLER:
				return mgcontroller != null && !mgcontroller.isEmpty();
			case MgridmlPackage.MGRID_CONTROLLER__MGRID_CONTROLLER_ID:
				return MGRID_CONTROLLER_ID_EDEFAULT == null ? mgridControllerID != null : !MGRID_CONTROLLER_ID_EDEFAULT.equals(mgridControllerID);
			case MgridmlPackage.MGRID_CONTROLLER__TOTAL_LOADS:
				return totalLoads != TOTAL_LOADS_EDEFAULT;
			case MgridmlPackage.MGRID_CONTROLLER__TOTAL_SOURCES:
				return totalSources != TOTAL_SOURCES_EDEFAULT;
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
		result.append(" (mgridControllerID: ");
		result.append(mgridControllerID);
		result.append(", totalLoads: ");
		result.append(totalLoads);
		result.append(", totalSources: ");
		result.append(totalSources);
		result.append(')');
		return result.toString();
	}

} //MGridControllerImpl
