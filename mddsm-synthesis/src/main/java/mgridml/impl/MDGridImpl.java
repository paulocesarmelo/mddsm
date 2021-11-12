/**
 */
package mgridml.impl;

import java.util.Collection;

import mgridml.MDGrid;
import mgridml.MgridmlPackage;
import mgridml.PlantElem;

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
 * An implementation of the model object '<em><b>MD Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.MDGridImpl#getPlantElem <em>Plant Elem</em>}</li>
 *   <li>{@link mgridml.impl.MDGridImpl#getMdgridID <em>Mdgrid ID</em>}</li>
 *   <li>{@link mgridml.impl.MDGridImpl#getMcgridID <em>Mcgrid ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDGridImpl extends MinimalEObjectImpl.Container implements MDGrid {
	/**
	 * The cached value of the '{@link #getPlantElem() <em>Plant Elem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantElem()
	 * @generated
	 * @ordered
	 */
	protected EList<PlantElem> plantElem;

	/**
	 * The default value of the '{@link #getMdgridID() <em>Mdgrid ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdgridID()
	 * @generated
	 * @ordered
	 */
	protected static final String MDGRID_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMdgridID() <em>Mdgrid ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdgridID()
	 * @generated
	 * @ordered
	 */
	protected String mdgridID = MDGRID_ID_EDEFAULT;

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
	protected MDGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.MD_GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlantElem> getPlantElem() {
		if (plantElem == null) {
			plantElem = new EObjectContainmentEList<PlantElem>(PlantElem.class, this, MgridmlPackage.MD_GRID__PLANT_ELEM);
		}
		return plantElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMdgridID() {
		return mdgridID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMdgridID(String newMdgridID) {
		String oldMdgridID = mdgridID;
		mdgridID = newMdgridID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.MD_GRID__MDGRID_ID, oldMdgridID, mdgridID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.MD_GRID__MCGRID_ID, oldMcgridID, mcgridID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MgridmlPackage.MD_GRID__PLANT_ELEM:
				return ((InternalEList<?>)getPlantElem()).basicRemove(otherEnd, msgs);
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
			case MgridmlPackage.MD_GRID__PLANT_ELEM:
				return getPlantElem();
			case MgridmlPackage.MD_GRID__MDGRID_ID:
				return getMdgridID();
			case MgridmlPackage.MD_GRID__MCGRID_ID:
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
			case MgridmlPackage.MD_GRID__PLANT_ELEM:
				getPlantElem().clear();
				getPlantElem().addAll((Collection<? extends PlantElem>)newValue);
				return;
			case MgridmlPackage.MD_GRID__MDGRID_ID:
				setMdgridID((String)newValue);
				return;
			case MgridmlPackage.MD_GRID__MCGRID_ID:
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
			case MgridmlPackage.MD_GRID__PLANT_ELEM:
				getPlantElem().clear();
				return;
			case MgridmlPackage.MD_GRID__MDGRID_ID:
				setMdgridID(MDGRID_ID_EDEFAULT);
				return;
			case MgridmlPackage.MD_GRID__MCGRID_ID:
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
			case MgridmlPackage.MD_GRID__PLANT_ELEM:
				return plantElem != null && !plantElem.isEmpty();
			case MgridmlPackage.MD_GRID__MDGRID_ID:
				return MDGRID_ID_EDEFAULT == null ? mdgridID != null : !MDGRID_ID_EDEFAULT.equals(mdgridID);
			case MgridmlPackage.MD_GRID__MCGRID_ID:
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
		result.append(" (mdgridID: ");
		result.append(mdgridID);
		result.append(", mcgridID: ");
		result.append(mcgridID);
		result.append(')');
		return result.toString();
	}

} //MDGridImpl
