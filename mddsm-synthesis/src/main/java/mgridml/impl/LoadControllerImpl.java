/**
 */
package mgridml.impl;

import java.util.Collection;

import mgridml.CriticalEnum;
import mgridml.LC_Property;
import mgridml.LoadController;
import mgridml.LoadDeviceType;
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
 * An implementation of the model object '<em><b>Load Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.LoadControllerImpl#getLoadDeviceType <em>Load Device Type</em>}</li>
 *   <li>{@link mgridml.impl.LoadControllerImpl#getLcProperty <em>Lc Property</em>}</li>
 *   <li>{@link mgridml.impl.LoadControllerImpl#getCritical <em>Critical</em>}</li>
 *   <li>{@link mgridml.impl.LoadControllerImpl#getLowerWattage <em>Lower Wattage</em>}</li>
 *   <li>{@link mgridml.impl.LoadControllerImpl#getUpperWattage <em>Upper Wattage</em>}</li>
 *   <li>{@link mgridml.impl.LoadControllerImpl#isGroupAction <em>Group Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadControllerImpl extends AtomicControllerImpl implements LoadController {
	/**
	 * The cached value of the '{@link #getLoadDeviceType() <em>Load Device Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadDeviceType()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadDeviceType> loadDeviceType;

	/**
	 * The cached value of the '{@link #getLcProperty() <em>Lc Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLcProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<LC_Property> lcProperty;

	/**
	 * The default value of the '{@link #getCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCritical()
	 * @generated
	 * @ordered
	 */
	protected static final CriticalEnum CRITICAL_EDEFAULT = CriticalEnum.SENSITIVE;

	/**
	 * The cached value of the '{@link #getCritical() <em>Critical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCritical()
	 * @generated
	 * @ordered
	 */
	protected CriticalEnum critical = CRITICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowerWattage() <em>Lower Wattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerWattage()
	 * @generated
	 * @ordered
	 */
	protected static final float LOWER_WATTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLowerWattage() <em>Lower Wattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerWattage()
	 * @generated
	 * @ordered
	 */
	protected float lowerWattage = LOWER_WATTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperWattage() <em>Upper Wattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperWattage()
	 * @generated
	 * @ordered
	 */
	protected static final float UPPER_WATTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUpperWattage() <em>Upper Wattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperWattage()
	 * @generated
	 * @ordered
	 */
	protected float upperWattage = UPPER_WATTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGroupAction() <em>Group Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroupAction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GROUP_ACTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGroupAction() <em>Group Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGroupAction()
	 * @generated
	 * @ordered
	 */
	protected boolean groupAction = GROUP_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.LOAD_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadDeviceType> getLoadDeviceType() {
		if (loadDeviceType == null) {
			loadDeviceType = new EObjectContainmentEList<LoadDeviceType>(LoadDeviceType.class, this, MgridmlPackage.LOAD_CONTROLLER__LOAD_DEVICE_TYPE);
		}
		return loadDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LC_Property> getLcProperty() {
		if (lcProperty == null) {
			lcProperty = new EObjectContainmentEList<LC_Property>(LC_Property.class, this, MgridmlPackage.LOAD_CONTROLLER__LC_PROPERTY);
		}
		return lcProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalEnum getCritical() {
		return critical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCritical(CriticalEnum newCritical) {
		CriticalEnum oldCritical = critical;
		critical = newCritical == null ? CRITICAL_EDEFAULT : newCritical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.LOAD_CONTROLLER__CRITICAL, oldCritical, critical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLowerWattage() {
		return lowerWattage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerWattage(float newLowerWattage) {
		float oldLowerWattage = lowerWattage;
		lowerWattage = newLowerWattage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.LOAD_CONTROLLER__LOWER_WATTAGE, oldLowerWattage, lowerWattage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUpperWattage() {
		return upperWattage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperWattage(float newUpperWattage) {
		float oldUpperWattage = upperWattage;
		upperWattage = newUpperWattage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.LOAD_CONTROLLER__UPPER_WATTAGE, oldUpperWattage, upperWattage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGroupAction() {
		return groupAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupAction(boolean newGroupAction) {
		boolean oldGroupAction = groupAction;
		groupAction = newGroupAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.LOAD_CONTROLLER__GROUP_ACTION, oldGroupAction, groupAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MgridmlPackage.LOAD_CONTROLLER__LOAD_DEVICE_TYPE:
				return ((InternalEList<?>)getLoadDeviceType()).basicRemove(otherEnd, msgs);
			case MgridmlPackage.LOAD_CONTROLLER__LC_PROPERTY:
				return ((InternalEList<?>)getLcProperty()).basicRemove(otherEnd, msgs);
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
			case MgridmlPackage.LOAD_CONTROLLER__LOAD_DEVICE_TYPE:
				return getLoadDeviceType();
			case MgridmlPackage.LOAD_CONTROLLER__LC_PROPERTY:
				return getLcProperty();
			case MgridmlPackage.LOAD_CONTROLLER__CRITICAL:
				return getCritical();
			case MgridmlPackage.LOAD_CONTROLLER__LOWER_WATTAGE:
				return getLowerWattage();
			case MgridmlPackage.LOAD_CONTROLLER__UPPER_WATTAGE:
				return getUpperWattage();
			case MgridmlPackage.LOAD_CONTROLLER__GROUP_ACTION:
				return isGroupAction();
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
			case MgridmlPackage.LOAD_CONTROLLER__LOAD_DEVICE_TYPE:
				getLoadDeviceType().clear();
				getLoadDeviceType().addAll((Collection<? extends LoadDeviceType>)newValue);
				return;
			case MgridmlPackage.LOAD_CONTROLLER__LC_PROPERTY:
				getLcProperty().clear();
				getLcProperty().addAll((Collection<? extends LC_Property>)newValue);
				return;
			case MgridmlPackage.LOAD_CONTROLLER__CRITICAL:
				setCritical((CriticalEnum)newValue);
				return;
			case MgridmlPackage.LOAD_CONTROLLER__LOWER_WATTAGE:
				setLowerWattage((Float)newValue);
				return;
			case MgridmlPackage.LOAD_CONTROLLER__UPPER_WATTAGE:
				setUpperWattage((Float)newValue);
				return;
			case MgridmlPackage.LOAD_CONTROLLER__GROUP_ACTION:
				setGroupAction((Boolean)newValue);
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
			case MgridmlPackage.LOAD_CONTROLLER__LOAD_DEVICE_TYPE:
				getLoadDeviceType().clear();
				return;
			case MgridmlPackage.LOAD_CONTROLLER__LC_PROPERTY:
				getLcProperty().clear();
				return;
			case MgridmlPackage.LOAD_CONTROLLER__CRITICAL:
				setCritical(CRITICAL_EDEFAULT);
				return;
			case MgridmlPackage.LOAD_CONTROLLER__LOWER_WATTAGE:
				setLowerWattage(LOWER_WATTAGE_EDEFAULT);
				return;
			case MgridmlPackage.LOAD_CONTROLLER__UPPER_WATTAGE:
				setUpperWattage(UPPER_WATTAGE_EDEFAULT);
				return;
			case MgridmlPackage.LOAD_CONTROLLER__GROUP_ACTION:
				setGroupAction(GROUP_ACTION_EDEFAULT);
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
			case MgridmlPackage.LOAD_CONTROLLER__LOAD_DEVICE_TYPE:
				return loadDeviceType != null && !loadDeviceType.isEmpty();
			case MgridmlPackage.LOAD_CONTROLLER__LC_PROPERTY:
				return lcProperty != null && !lcProperty.isEmpty();
			case MgridmlPackage.LOAD_CONTROLLER__CRITICAL:
				return critical != CRITICAL_EDEFAULT;
			case MgridmlPackage.LOAD_CONTROLLER__LOWER_WATTAGE:
				return lowerWattage != LOWER_WATTAGE_EDEFAULT;
			case MgridmlPackage.LOAD_CONTROLLER__UPPER_WATTAGE:
				return upperWattage != UPPER_WATTAGE_EDEFAULT;
			case MgridmlPackage.LOAD_CONTROLLER__GROUP_ACTION:
				return groupAction != GROUP_ACTION_EDEFAULT;
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
		result.append(" (critical: ");
		result.append(critical);
		result.append(", lowerWattage: ");
		result.append(lowerWattage);
		result.append(", upperWattage: ");
		result.append(upperWattage);
		result.append(", groupAction: ");
		result.append(groupAction);
		result.append(')');
		return result.toString();
	}

} //LoadControllerImpl
