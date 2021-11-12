/**
 */
package mgridml.impl;

import m4md.impl.EDomainSpecificTypeImpl;

import mgridml.MgridmlPackage;
import mgridml.SourceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.SourceTypeImpl#getSoTypeID <em>So Type ID</em>}</li>
 *   <li>{@link mgridml.impl.SourceTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link mgridml.impl.SourceTypeImpl#getSourceC <em>Source C</em>}</li>
 *   <li>{@link mgridml.impl.SourceTypeImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceTypeImpl extends EDomainSpecificTypeImpl implements SourceType {
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
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceC() <em>Source C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceC()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceC() <em>Source C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceC()
	 * @generated
	 * @ordered
	 */
	protected String sourceC = SOURCE_C_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.SOURCE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.SOURCE_TYPE__SO_TYPE_ID, oldSoTypeID, soTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.SOURCE_TYPE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceC() {
		return sourceC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceC(String newSourceC) {
		String oldSourceC = sourceC;
		sourceC = newSourceC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.SOURCE_TYPE__SOURCE_C, oldSourceC, sourceC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MgridmlPackage.SOURCE_TYPE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MgridmlPackage.SOURCE_TYPE__SO_TYPE_ID:
				return getSoTypeID();
			case MgridmlPackage.SOURCE_TYPE__TYPE_NAME:
				return getTypeName();
			case MgridmlPackage.SOURCE_TYPE__SOURCE_C:
				return getSourceC();
			case MgridmlPackage.SOURCE_TYPE__PRIORITY:
				return getPriority();
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
			case MgridmlPackage.SOURCE_TYPE__SO_TYPE_ID:
				setSoTypeID((String)newValue);
				return;
			case MgridmlPackage.SOURCE_TYPE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case MgridmlPackage.SOURCE_TYPE__SOURCE_C:
				setSourceC((String)newValue);
				return;
			case MgridmlPackage.SOURCE_TYPE__PRIORITY:
				setPriority((Integer)newValue);
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
			case MgridmlPackage.SOURCE_TYPE__SO_TYPE_ID:
				setSoTypeID(SO_TYPE_ID_EDEFAULT);
				return;
			case MgridmlPackage.SOURCE_TYPE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case MgridmlPackage.SOURCE_TYPE__SOURCE_C:
				setSourceC(SOURCE_C_EDEFAULT);
				return;
			case MgridmlPackage.SOURCE_TYPE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case MgridmlPackage.SOURCE_TYPE__SO_TYPE_ID:
				return SO_TYPE_ID_EDEFAULT == null ? soTypeID != null : !SO_TYPE_ID_EDEFAULT.equals(soTypeID);
			case MgridmlPackage.SOURCE_TYPE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case MgridmlPackage.SOURCE_TYPE__SOURCE_C:
				return SOURCE_C_EDEFAULT == null ? sourceC != null : !SOURCE_C_EDEFAULT.equals(sourceC);
			case MgridmlPackage.SOURCE_TYPE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
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
		result.append(", typeName: ");
		result.append(typeName);
		result.append(", sourceC: ");
		result.append(sourceC);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //SourceTypeImpl
