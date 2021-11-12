/**
 */
package mgridml.impl;

import m4md.impl.EItemImpl;

import mgridml.MgridmlPackage;
import mgridml.PlantElem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant Elem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.PlantElemImpl#getPlantE_ID <em>Plant EID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlantElemImpl extends EItemImpl implements PlantElem {
	/**
	 * The default value of the '{@link #getPlantE_ID() <em>Plant EID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantE_ID()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANT_EID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlantE_ID() <em>Plant EID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantE_ID()
	 * @generated
	 * @ordered
	 */
	protected String plantE_ID = PLANT_EID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantElemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.PLANT_ELEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlantE_ID() {
		return plantE_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlantE_ID(String newPlantE_ID) {
		String oldPlantE_ID = plantE_ID;
		plantE_ID = newPlantE_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.PLANT_ELEM__PLANT_EID, oldPlantE_ID, plantE_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MgridmlPackage.PLANT_ELEM__PLANT_EID:
				return getPlantE_ID();
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
			case MgridmlPackage.PLANT_ELEM__PLANT_EID:
				setPlantE_ID((String)newValue);
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
			case MgridmlPackage.PLANT_ELEM__PLANT_EID:
				setPlantE_ID(PLANT_EID_EDEFAULT);
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
			case MgridmlPackage.PLANT_ELEM__PLANT_EID:
				return PLANT_EID_EDEFAULT == null ? plantE_ID != null : !PLANT_EID_EDEFAULT.equals(plantE_ID);
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
		result.append(" (plantE_ID: ");
		result.append(plantE_ID);
		result.append(')');
		return result.toString();
	}

} //PlantElemImpl
