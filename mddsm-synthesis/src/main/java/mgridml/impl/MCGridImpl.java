/**
 */
package mgridml.impl;

import java.util.Collection;

import mgridml.MCGrid;
import mgridml.MGController;
import mgridml.MgridmlPackage;

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
 * An implementation of the model object '<em><b>MC Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.MCGridImpl#getMgcontroller <em>Mgcontroller</em>}</li>
 *   <li>{@link mgridml.impl.MCGridImpl#getMcgridID <em>Mcgrid ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MCGridImpl extends MinimalEObjectImpl.Container implements MCGrid {
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
	 * The default value of the '{@link #getMcgridID() <em>Mcgrid ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcgridID()
	 * @generated
	 * @ordered
	 */
	protected static final String MCGRID_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMcgridID() <em>Mcgrid ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMcgridID()
	 * @generated
	 * @ordered
	 */
	protected String mcgridID = MCGRID_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MCGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.MC_GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MGController> getMgcontroller() {
		if (mgcontroller == null) {
			mgcontroller = new EObjectContainmentEList<MGController>(MGController.class, this, MgridmlPackage.MC_GRID__MGCONTROLLER);
		}
		return mgcontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMcgridID() {
		return mcgridID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMcgridID(String newMcgridID) {
		String oldMcgridID = mcgridID;
		mcgridID = newMcgridID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.MC_GRID__MCGRID_ID, oldMcgridID, mcgridID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MgridmlPackage.MC_GRID__MGCONTROLLER:
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
			case MgridmlPackage.MC_GRID__MGCONTROLLER:
				return getMgcontroller();
			case MgridmlPackage.MC_GRID__MCGRID_ID:
				return getMcgridID();
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
			case MgridmlPackage.MC_GRID__MGCONTROLLER:
				getMgcontroller().clear();
				getMgcontroller().addAll((Collection<? extends MGController>)newValue);
				return;
			case MgridmlPackage.MC_GRID__MCGRID_ID:
				setMcgridID((String)newValue);
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
			case MgridmlPackage.MC_GRID__MGCONTROLLER:
				getMgcontroller().clear();
				return;
			case MgridmlPackage.MC_GRID__MCGRID_ID:
				setMcgridID(MCGRID_ID_EDEFAULT);
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
			case MgridmlPackage.MC_GRID__MGCONTROLLER:
				return mgcontroller != null && !mgcontroller.isEmpty();
			case MgridmlPackage.MC_GRID__MCGRID_ID:
				return MCGRID_ID_EDEFAULT == null ? mcgridID != null : !MCGRID_ID_EDEFAULT.equals(mcgridID);
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
		result.append(" (mcgridID: ");
		result.append(mcgridID);
		result.append(')');
		return result.toString();
	}

} //MCGridImpl
