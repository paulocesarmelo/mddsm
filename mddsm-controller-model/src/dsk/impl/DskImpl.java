/**
 */
package dsk.impl;

import dsk.Dsk;
import dsk.DskPackage;
import dsk.EDSC;
import dsk.EDSEntity;
import dsk.EDSEvent;
import dsk.EProcedure;

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
 * An implementation of the model object '<em><b>Dsk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsk.impl.DskImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link dsk.impl.DskImpl#getDscs <em>Dscs</em>}</li>
 *   <li>{@link dsk.impl.DskImpl#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link dsk.impl.DskImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link dsk.impl.DskImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DskImpl extends MinimalEObjectImpl.Container implements Dsk {
	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDscs() <em>Dscs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDscs()
	 * @generated
	 * @ordered
	 */
	protected EList<EDSC> dscs;

	/**
	 * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedures()
	 * @generated
	 * @ordered
	 */
	protected EList<EProcedure> procedures;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EDSEvent> events;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<EDSEntity> entities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DskPackage.Literals.DSK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DskPackage.DSK__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDSC> getDscs() {
		if (dscs == null) {
			dscs = new EObjectContainmentEList<EDSC>(EDSC.class, this, DskPackage.DSK__DSCS);
		}
		return dscs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EProcedure> getProcedures() {
		if (procedures == null) {
			procedures = new EObjectContainmentEList<EProcedure>(EProcedure.class, this, DskPackage.DSK__PROCEDURES);
		}
		return procedures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDSEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<EDSEvent>(EDSEvent.class, this, DskPackage.DSK__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDSEntity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<EDSEntity>(EDSEntity.class, this, DskPackage.DSK__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DskPackage.DSK__DSCS:
				return ((InternalEList<?>)getDscs()).basicRemove(otherEnd, msgs);
			case DskPackage.DSK__PROCEDURES:
				return ((InternalEList<?>)getProcedures()).basicRemove(otherEnd, msgs);
			case DskPackage.DSK__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case DskPackage.DSK__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
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
			case DskPackage.DSK__DOMAIN:
				return getDomain();
			case DskPackage.DSK__DSCS:
				return getDscs();
			case DskPackage.DSK__PROCEDURES:
				return getProcedures();
			case DskPackage.DSK__EVENTS:
				return getEvents();
			case DskPackage.DSK__ENTITIES:
				return getEntities();
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
			case DskPackage.DSK__DOMAIN:
				setDomain((String)newValue);
				return;
			case DskPackage.DSK__DSCS:
				getDscs().clear();
				getDscs().addAll((Collection<? extends EDSC>)newValue);
				return;
			case DskPackage.DSK__PROCEDURES:
				getProcedures().clear();
				getProcedures().addAll((Collection<? extends EProcedure>)newValue);
				return;
			case DskPackage.DSK__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends EDSEvent>)newValue);
				return;
			case DskPackage.DSK__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends EDSEntity>)newValue);
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
			case DskPackage.DSK__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case DskPackage.DSK__DSCS:
				getDscs().clear();
				return;
			case DskPackage.DSK__PROCEDURES:
				getProcedures().clear();
				return;
			case DskPackage.DSK__EVENTS:
				getEvents().clear();
				return;
			case DskPackage.DSK__ENTITIES:
				getEntities().clear();
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
			case DskPackage.DSK__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case DskPackage.DSK__DSCS:
				return dscs != null && !dscs.isEmpty();
			case DskPackage.DSK__PROCEDURES:
				return procedures != null && !procedures.isEmpty();
			case DskPackage.DSK__EVENTS:
				return events != null && !events.isEmpty();
			case DskPackage.DSK__ENTITIES:
				return entities != null && !entities.isEmpty();
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
		result.append(" (domain: ");
		result.append(domain);
		result.append(')');
		return result.toString();
	}

} //DskImpl
