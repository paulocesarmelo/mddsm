/**
 */
package m4md.impl;

import m4md.EArising;
import m4md.EDomainSpecificType;
import m4md.EItem;
import m4md.M4mdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EItem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m4md.impl.EItemImpl#getArisingBehavior <em>Arising Behavior</em>}</li>
 *   <li>{@link m4md.impl.EItemImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EItemImpl extends EDomainSpecificEntityImpl implements EItem {
	/**
	 * The default value of the '{@link #getArisingBehavior() <em>Arising Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArisingBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final EArising ARISING_BEHAVIOR_EDEFAULT = EArising.STATIC;

	/**
	 * The cached value of the '{@link #getArisingBehavior() <em>Arising Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArisingBehavior()
	 * @generated
	 * @ordered
	 */
	protected EArising arisingBehavior = ARISING_BEHAVIOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EDomainSpecificType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M4mdPackage.Literals.EITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EArising getArisingBehavior() {
		return arisingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArisingBehavior(EArising newArisingBehavior) {
		EArising oldArisingBehavior = arisingBehavior;
		arisingBehavior = newArisingBehavior == null ? ARISING_BEHAVIOR_EDEFAULT : newArisingBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4mdPackage.EITEM__ARISING_BEHAVIOR, oldArisingBehavior, arisingBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDomainSpecificType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EDomainSpecificType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4mdPackage.EITEM__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDomainSpecificType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EDomainSpecificType newType) {
		EDomainSpecificType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4mdPackage.EITEM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M4mdPackage.EITEM__ARISING_BEHAVIOR:
				return getArisingBehavior();
			case M4mdPackage.EITEM__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case M4mdPackage.EITEM__ARISING_BEHAVIOR:
				setArisingBehavior((EArising)newValue);
				return;
			case M4mdPackage.EITEM__TYPE:
				setType((EDomainSpecificType)newValue);
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
			case M4mdPackage.EITEM__ARISING_BEHAVIOR:
				setArisingBehavior(ARISING_BEHAVIOR_EDEFAULT);
				return;
			case M4mdPackage.EITEM__TYPE:
				setType((EDomainSpecificType)null);
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
			case M4mdPackage.EITEM__ARISING_BEHAVIOR:
				return arisingBehavior != ARISING_BEHAVIOR_EDEFAULT;
			case M4mdPackage.EITEM__TYPE:
				return type != null;
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
		result.append(" (arisingBehavior: ");
		result.append(arisingBehavior);
		result.append(')');
		return result.toString();
	}

} //EItemImpl
