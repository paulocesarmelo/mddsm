/**
 */
package m4md.impl;

import java.util.Collection;

import m4md.EActor;
import m4md.ECoordinationBehavior;
import m4md.EDomainSpecificType;
import m4md.M4mdPackage;

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
 * An implementation of the model object '<em><b>EActor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m4md.impl.EActorImpl#getKindInteraction <em>Kind Interaction</em>}</li>
 *   <li>{@link m4md.impl.EActorImpl#getTypesControlled <em>Types Controlled</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EActorImpl extends EDomainSpecificEntityImpl implements EActor {
	/**
	 * The default value of the '{@link #getKindInteraction() <em>Kind Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindInteraction()
	 * @generated
	 * @ordered
	 */
	protected static final ECoordinationBehavior KIND_INTERACTION_EDEFAULT = ECoordinationBehavior.LOCAL;

	/**
	 * The cached value of the '{@link #getKindInteraction() <em>Kind Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindInteraction()
	 * @generated
	 * @ordered
	 */
	protected ECoordinationBehavior kindInteraction = KIND_INTERACTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypesControlled() <em>Types Controlled</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesControlled()
	 * @generated
	 * @ordered
	 */
	protected EList<EDomainSpecificType> typesControlled;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M4mdPackage.Literals.EACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECoordinationBehavior getKindInteraction() {
		return kindInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindInteraction(ECoordinationBehavior newKindInteraction) {
		ECoordinationBehavior oldKindInteraction = kindInteraction;
		kindInteraction = newKindInteraction == null ? KIND_INTERACTION_EDEFAULT : newKindInteraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4mdPackage.EACTOR__KIND_INTERACTION, oldKindInteraction, kindInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDomainSpecificType> getTypesControlled() {
		if (typesControlled == null) {
			typesControlled = new EObjectContainmentEList<EDomainSpecificType>(EDomainSpecificType.class, this, M4mdPackage.EACTOR__TYPES_CONTROLLED);
		}
		return typesControlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4mdPackage.EACTOR__TYPES_CONTROLLED:
				return ((InternalEList<?>)getTypesControlled()).basicRemove(otherEnd, msgs);
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
			case M4mdPackage.EACTOR__KIND_INTERACTION:
				return getKindInteraction();
			case M4mdPackage.EACTOR__TYPES_CONTROLLED:
				return getTypesControlled();
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
			case M4mdPackage.EACTOR__KIND_INTERACTION:
				setKindInteraction((ECoordinationBehavior)newValue);
				return;
			case M4mdPackage.EACTOR__TYPES_CONTROLLED:
				getTypesControlled().clear();
				getTypesControlled().addAll((Collection<? extends EDomainSpecificType>)newValue);
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
			case M4mdPackage.EACTOR__KIND_INTERACTION:
				setKindInteraction(KIND_INTERACTION_EDEFAULT);
				return;
			case M4mdPackage.EACTOR__TYPES_CONTROLLED:
				getTypesControlled().clear();
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
			case M4mdPackage.EACTOR__KIND_INTERACTION:
				return kindInteraction != KIND_INTERACTION_EDEFAULT;
			case M4mdPackage.EACTOR__TYPES_CONTROLLED:
				return typesControlled != null && !typesControlled.isEmpty();
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
		result.append(" (kindInteraction: ");
		result.append(kindInteraction);
		result.append(')');
		return result.toString();
	}

} //EActorImpl
