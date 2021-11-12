/**
 */
package adapter.impl;

import adapter.AdapterPackage;
import adapter.ECommAPI;
import adapter.ECommunication;
import adapter.EComponent;
import adapter.EDataFormat;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>ECommunication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adapter.impl.ECommunicationImpl#getApi <em>Api</em>}</li>
 *   <li>{@link adapter.impl.ECommunicationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link adapter.impl.ECommunicationImpl#getDataSupported <em>Data Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECommunicationImpl extends MinimalEObjectImpl.Container implements ECommunication {
	/**
	 * The default value of the '{@link #getApi() <em>Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected static final ECommAPI API_EDEFAULT = ECommAPI.REST;

	/**
	 * The cached value of the '{@link #getApi() <em>Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected ECommAPI api = API_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<EComponent> target;

	/**
	 * The default value of the '{@link #getDataSupported() <em>Data Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSupported()
	 * @generated
	 * @ordered
	 */
	protected static final EDataFormat DATA_SUPPORTED_EDEFAULT = EDataFormat.JSON;

	/**
	 * The cached value of the '{@link #getDataSupported() <em>Data Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSupported()
	 * @generated
	 * @ordered
	 */
	protected EDataFormat dataSupported = DATA_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.ECOMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECommAPI getApi() {
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi(ECommAPI newApi) {
		ECommAPI oldApi = api;
		api = newApi == null ? API_EDEFAULT : newApi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.ECOMMUNICATION__API, oldApi, api));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EComponent> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<EComponent>(EComponent.class, this, AdapterPackage.ECOMMUNICATION__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataFormat getDataSupported() {
		return dataSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSupported(EDataFormat newDataSupported) {
		EDataFormat oldDataSupported = dataSupported;
		dataSupported = newDataSupported == null ? DATA_SUPPORTED_EDEFAULT : newDataSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.ECOMMUNICATION__DATA_SUPPORTED, oldDataSupported, dataSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterPackage.ECOMMUNICATION__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case AdapterPackage.ECOMMUNICATION__API:
				return getApi();
			case AdapterPackage.ECOMMUNICATION__TARGET:
				return getTarget();
			case AdapterPackage.ECOMMUNICATION__DATA_SUPPORTED:
				return getDataSupported();
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
			case AdapterPackage.ECOMMUNICATION__API:
				setApi((ECommAPI)newValue);
				return;
			case AdapterPackage.ECOMMUNICATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends EComponent>)newValue);
				return;
			case AdapterPackage.ECOMMUNICATION__DATA_SUPPORTED:
				setDataSupported((EDataFormat)newValue);
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
			case AdapterPackage.ECOMMUNICATION__API:
				setApi(API_EDEFAULT);
				return;
			case AdapterPackage.ECOMMUNICATION__TARGET:
				getTarget().clear();
				return;
			case AdapterPackage.ECOMMUNICATION__DATA_SUPPORTED:
				setDataSupported(DATA_SUPPORTED_EDEFAULT);
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
			case AdapterPackage.ECOMMUNICATION__API:
				return api != API_EDEFAULT;
			case AdapterPackage.ECOMMUNICATION__TARGET:
				return target != null && !target.isEmpty();
			case AdapterPackage.ECOMMUNICATION__DATA_SUPPORTED:
				return dataSupported != DATA_SUPPORTED_EDEFAULT;
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
		result.append(" (api: ");
		result.append(api);
		result.append(", dataSupported: ");
		result.append(dataSupported);
		result.append(')');
		return result.toString();
	}

} //ECommunicationImpl
