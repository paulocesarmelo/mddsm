/**
 */
package mgridml.impl;

import mgridml.AtomicController;
import mgridml.MgridmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.AtomicControllerImpl#getControllerID <em>Controller ID</em>}</li>
 *   <li>{@link mgridml.impl.AtomicControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link mgridml.impl.AtomicControllerImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link mgridml.impl.AtomicControllerImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicControllerImpl extends MGControllerImpl implements AtomicController {
	/**
	 * The default value of the '{@link #getControllerID() <em>Controller ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControllerID() <em>Controller ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerID()
	 * @generated
	 * @ordered
	 */
	protected String controllerID = CONTROLLER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final int CARDINALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected int cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.ATOMIC_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControllerID() {
		return controllerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerID(String newControllerID) {
		String oldControllerID = controllerID;
		controllerID = newControllerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.ATOMIC_CONTROLLER__CONTROLLER_ID, oldControllerID, controllerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.ATOMIC_CONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(int newCardinality) {
		int oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.ATOMIC_CONTROLLER__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.ATOMIC_CONTROLLER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MgridmlPackage.ATOMIC_CONTROLLER__CONTROLLER_ID:
				return getControllerID();
			case MgridmlPackage.ATOMIC_CONTROLLER__NAME:
				return getName();
			case MgridmlPackage.ATOMIC_CONTROLLER__CARDINALITY:
				return getCardinality();
			case MgridmlPackage.ATOMIC_CONTROLLER__DESCRIPTION:
				return getDescription();
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
			case MgridmlPackage.ATOMIC_CONTROLLER__CONTROLLER_ID:
				setControllerID((String)newValue);
				return;
			case MgridmlPackage.ATOMIC_CONTROLLER__NAME:
				setName((String)newValue);
				return;
			case MgridmlPackage.ATOMIC_CONTROLLER__CARDINALITY:
				setCardinality((Integer)newValue);
				return;
			case MgridmlPackage.ATOMIC_CONTROLLER__DESCRIPTION:
				setDescription((String)newValue);
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
			case MgridmlPackage.ATOMIC_CONTROLLER__CONTROLLER_ID:
				setControllerID(CONTROLLER_ID_EDEFAULT);
				return;
			case MgridmlPackage.ATOMIC_CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MgridmlPackage.ATOMIC_CONTROLLER__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case MgridmlPackage.ATOMIC_CONTROLLER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case MgridmlPackage.ATOMIC_CONTROLLER__CONTROLLER_ID:
				return CONTROLLER_ID_EDEFAULT == null ? controllerID != null : !CONTROLLER_ID_EDEFAULT.equals(controllerID);
			case MgridmlPackage.ATOMIC_CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MgridmlPackage.ATOMIC_CONTROLLER__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case MgridmlPackage.ATOMIC_CONTROLLER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (controllerID: ");
		result.append(controllerID);
		result.append(", name: ");
		result.append(name);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AtomicControllerImpl
