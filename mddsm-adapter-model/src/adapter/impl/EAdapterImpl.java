/**
 */
package adapter.impl;

import adapter.AdapterPackage;
import adapter.EAdapter;
import adapter.ECommunication;
import adapter.EComponent;
import adapter.EDSCmd;
import adapter.EEntity;
import adapter.EResource;

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
 * An implementation of the model object '<em><b>EAdapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adapter.impl.EAdapterImpl#getName <em>Name</em>}</li>
 *   <li>{@link adapter.impl.EAdapterImpl#getComm <em>Comm</em>}</li>
 *   <li>{@link adapter.impl.EAdapterImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link adapter.impl.EAdapterImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link adapter.impl.EAdapterImpl#getDscs <em>Dscs</em>}</li>
 *   <li>{@link adapter.impl.EAdapterImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAdapterImpl extends MinimalEObjectImpl.Container implements EAdapter {
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
	 * The cached value of the '{@link #getComm() <em>Comm</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComm()
	 * @generated
	 * @ordered
	 */
	protected EList<ECommunication> comm;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<EResource> resources;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<EComponent> components;

	/**
	 * The cached value of the '{@link #getDscs() <em>Dscs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDscs()
	 * @generated
	 * @ordered
	 */
	protected EList<EDSCmd> dscs;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<EEntity> entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.EADAPTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterPackage.EADAPTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECommunication> getComm() {
		if (comm == null) {
			comm = new EObjectContainmentEList<ECommunication>(ECommunication.class, this, AdapterPackage.EADAPTER__COMM);
		}
		return comm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EResource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentEList<EResource>(EResource.class, this, AdapterPackage.EADAPTER__RESOURCES);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<EComponent>(EComponent.class, this, AdapterPackage.EADAPTER__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDSCmd> getDscs() {
		if (dscs == null) {
			dscs = new EObjectContainmentEList<EDSCmd>(EDSCmd.class, this, AdapterPackage.EADAPTER__DSCS);
		}
		return dscs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EEntity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<EEntity>(EEntity.class, this, AdapterPackage.EADAPTER__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterPackage.EADAPTER__COMM:
				return ((InternalEList<?>)getComm()).basicRemove(otherEnd, msgs);
			case AdapterPackage.EADAPTER__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case AdapterPackage.EADAPTER__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case AdapterPackage.EADAPTER__DSCS:
				return ((InternalEList<?>)getDscs()).basicRemove(otherEnd, msgs);
			case AdapterPackage.EADAPTER__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
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
			case AdapterPackage.EADAPTER__NAME:
				return getName();
			case AdapterPackage.EADAPTER__COMM:
				return getComm();
			case AdapterPackage.EADAPTER__RESOURCES:
				return getResources();
			case AdapterPackage.EADAPTER__COMPONENTS:
				return getComponents();
			case AdapterPackage.EADAPTER__DSCS:
				return getDscs();
			case AdapterPackage.EADAPTER__ENTITY:
				return getEntity();
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
			case AdapterPackage.EADAPTER__NAME:
				setName((String)newValue);
				return;
			case AdapterPackage.EADAPTER__COMM:
				getComm().clear();
				getComm().addAll((Collection<? extends ECommunication>)newValue);
				return;
			case AdapterPackage.EADAPTER__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends EResource>)newValue);
				return;
			case AdapterPackage.EADAPTER__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends EComponent>)newValue);
				return;
			case AdapterPackage.EADAPTER__DSCS:
				getDscs().clear();
				getDscs().addAll((Collection<? extends EDSCmd>)newValue);
				return;
			case AdapterPackage.EADAPTER__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends EEntity>)newValue);
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
			case AdapterPackage.EADAPTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AdapterPackage.EADAPTER__COMM:
				getComm().clear();
				return;
			case AdapterPackage.EADAPTER__RESOURCES:
				getResources().clear();
				return;
			case AdapterPackage.EADAPTER__COMPONENTS:
				getComponents().clear();
				return;
			case AdapterPackage.EADAPTER__DSCS:
				getDscs().clear();
				return;
			case AdapterPackage.EADAPTER__ENTITY:
				getEntity().clear();
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
			case AdapterPackage.EADAPTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AdapterPackage.EADAPTER__COMM:
				return comm != null && !comm.isEmpty();
			case AdapterPackage.EADAPTER__RESOURCES:
				return resources != null && !resources.isEmpty();
			case AdapterPackage.EADAPTER__COMPONENTS:
				return components != null && !components.isEmpty();
			case AdapterPackage.EADAPTER__DSCS:
				return dscs != null && !dscs.isEmpty();
			case AdapterPackage.EADAPTER__ENTITY:
				return entity != null && !entity.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EAdapterImpl
