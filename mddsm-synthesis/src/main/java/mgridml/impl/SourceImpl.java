/**
 */
package mgridml.impl;

import mgridml.ControlEnum;
import mgridml.MgridmlPackage;
import mgridml.Source;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.SourceImpl#getSoTypeID <em>So Type ID</em>}</li>
 *   <li>{@link mgridml.impl.SourceImpl#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link mgridml.impl.SourceImpl#getWattage <em>Wattage</em>}</li>
 *   <li>{@link mgridml.impl.SourceImpl#getOnDemand <em>On Demand</em>}</li>
 *   <li>{@link mgridml.impl.SourceImpl#isOperational <em>Operational</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceImpl extends PlantElemImpl implements Source {
	/**
	 * The default value of the '{@link #getSoTypeID() <em>So Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final String SO_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoTypeID() <em>So Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoTypeID()
	 * @generated
	 * @ordered
	 */
	protected String soTypeID = SO_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected String sourceName = SOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWattage() <em>Wattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWattage()
	 * @generated
	 * @ordered
	 */
	protected static final float WATTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWattage() <em>Wattage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWattage()
	 * @generated
	 * @ordered
	 */
	protected float wattage = WATTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnDemand() <em>On Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDemand()
	 * @generated
	 * @ordered
	 */
	protected static final ControlEnum ON_DEMAND_EDEFAULT = ControlEnum.CONTROLLABLE;

	/**
	 * The cached value of the '{@link #getOnDemand() <em>On Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnDemand()
	 * @generated
	 * @ordered
	 */
	protected ControlEnum onDemand = ON_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #isOperational() <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperational()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPERATIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOperational() <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperational()
	 * @generated
	 * @ordered
	 */
	protected boolean operational = OPERATIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSoTypeID() {
		return soTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoTypeID(String newSoTypeID) {
		String oldSoTypeID = soTypeID;
		soTypeID = newSoTypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.SOURCE__SO_TYPE_ID, oldSoTypeID, soTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceName() {
		return sourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceName(String newSourceName) {
		String oldSourceName = sourceName;
		sourceName = newSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.SOURCE__SOURCE_NAME, oldSourceName, sourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWattage() {
		return wattage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWattage(float newWattage) {
		float oldWattage = wattage;
		wattage = newWattage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.SOURCE__WATTAGE, oldWattage, wattage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlEnum getOnDemand() {
		return onDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnDemand(ControlEnum newOnDemand) {
		ControlEnum oldOnDemand = onDemand;
		onDemand = newOnDemand == null ? ON_DEMAND_EDEFAULT : newOnDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.SOURCE__ON_DEMAND, oldOnDemand, onDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOperational() {
		return operational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperational(boolean newOperational) {
		boolean oldOperational = operational;
		operational = newOperational;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.SOURCE__OPERATIONAL, oldOperational, operational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MgridmlPackage.SOURCE__SO_TYPE_ID:
				return getSoTypeID();
			case MgridmlPackage.SOURCE__SOURCE_NAME:
				return getSourceName();
			case MgridmlPackage.SOURCE__WATTAGE:
				return getWattage();
			case MgridmlPackage.SOURCE__ON_DEMAND:
				return getOnDemand();
			case MgridmlPackage.SOURCE__OPERATIONAL:
				return isOperational();
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
			case MgridmlPackage.SOURCE__SO_TYPE_ID:
				setSoTypeID((String)newValue);
				return;
			case MgridmlPackage.SOURCE__SOURCE_NAME:
				setSourceName((String)newValue);
				return;
			case MgridmlPackage.SOURCE__WATTAGE:
				setWattage((Float)newValue);
				return;
			case MgridmlPackage.SOURCE__ON_DEMAND:
				setOnDemand((ControlEnum)newValue);
				return;
			case MgridmlPackage.SOURCE__OPERATIONAL:
				setOperational((Boolean)newValue);
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
			case MgridmlPackage.SOURCE__SO_TYPE_ID:
				setSoTypeID(SO_TYPE_ID_EDEFAULT);
				return;
			case MgridmlPackage.SOURCE__SOURCE_NAME:
				setSourceName(SOURCE_NAME_EDEFAULT);
				return;
			case MgridmlPackage.SOURCE__WATTAGE:
				setWattage(WATTAGE_EDEFAULT);
				return;
			case MgridmlPackage.SOURCE__ON_DEMAND:
				setOnDemand(ON_DEMAND_EDEFAULT);
				return;
			case MgridmlPackage.SOURCE__OPERATIONAL:
				setOperational(OPERATIONAL_EDEFAULT);
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
			case MgridmlPackage.SOURCE__SO_TYPE_ID:
				return SO_TYPE_ID_EDEFAULT == null ? soTypeID != null : !SO_TYPE_ID_EDEFAULT.equals(soTypeID);
			case MgridmlPackage.SOURCE__SOURCE_NAME:
				return SOURCE_NAME_EDEFAULT == null ? sourceName != null : !SOURCE_NAME_EDEFAULT.equals(sourceName);
			case MgridmlPackage.SOURCE__WATTAGE:
				return wattage != WATTAGE_EDEFAULT;
			case MgridmlPackage.SOURCE__ON_DEMAND:
				return onDemand != ON_DEMAND_EDEFAULT;
			case MgridmlPackage.SOURCE__OPERATIONAL:
				return operational != OPERATIONAL_EDEFAULT;
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
		result.append(" (soTypeID: ");
		result.append(soTypeID);
		result.append(", sourceName: ");
		result.append(sourceName);
		result.append(", wattage: ");
		result.append(wattage);
		result.append(", onDemand: ");
		result.append(onDemand);
		result.append(", operational: ");
		result.append(operational);
		result.append(')');
		return result.toString();
	}

} //SourceImpl
