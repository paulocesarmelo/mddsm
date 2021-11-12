/**
 */
package m4md.impl;

import m4md.ECardinality;
import m4md.EDomainSpecificType;
import m4md.EInteractionBehavior;
import m4md.M4mdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDomain Specific Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m4md.impl.EDomainSpecificTypeImpl#getInteractionBehavior <em>Interaction Behavior</em>}</li>
 *   <li>{@link m4md.impl.EDomainSpecificTypeImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EDomainSpecificTypeImpl extends MinimalEObjectImpl.Container implements EDomainSpecificType {
	/**
	 * The default value of the '{@link #getInteractionBehavior() <em>Interaction Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final EInteractionBehavior INTERACTION_BEHAVIOR_EDEFAULT = EInteractionBehavior.SYNC;

	/**
	 * The cached value of the '{@link #getInteractionBehavior() <em>Interaction Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionBehavior()
	 * @generated
	 * @ordered
	 */
	protected EInteractionBehavior interactionBehavior = INTERACTION_BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final ECardinality CARDINALITY_EDEFAULT = ECardinality.ONE;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected ECardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDomainSpecificTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M4mdPackage.Literals.EDOMAIN_SPECIFIC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInteractionBehavior getInteractionBehavior() {
		return interactionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionBehavior(EInteractionBehavior newInteractionBehavior) {
		EInteractionBehavior oldInteractionBehavior = interactionBehavior;
		interactionBehavior = newInteractionBehavior == null ? INTERACTION_BEHAVIOR_EDEFAULT : newInteractionBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR, oldInteractionBehavior, interactionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(ECardinality newCardinality) {
		ECardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR:
				return getInteractionBehavior();
			case M4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY:
				return getCardinality();
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
			case M4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR:
				setInteractionBehavior((EInteractionBehavior)newValue);
				return;
			case M4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY:
				setCardinality((ECardinality)newValue);
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
			case M4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR:
				setInteractionBehavior(INTERACTION_BEHAVIOR_EDEFAULT);
				return;
			case M4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
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
			case M4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR:
				return interactionBehavior != INTERACTION_BEHAVIOR_EDEFAULT;
			case M4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
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
		result.append(" (interactionBehavior: ");
		result.append(interactionBehavior);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //EDomainSpecificTypeImpl
