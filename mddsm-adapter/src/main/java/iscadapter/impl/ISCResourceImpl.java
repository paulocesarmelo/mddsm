/**
 */
package iscadapter.impl;

import adapter.impl.EResourceImpl;

import dsk.EDSEntity;
import iscadapter.ISCResource;
import iscadapter.IscadapterPackage;

import iscadapter.resources.ArrangementType;
import iscadapter.resources.Capability;
import iscadapter.resources.CompositionType;
import iscadapter.resources.ResourceProperty;
import java.util.Collection;

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
 * An implementation of the model object '<em><b>ISC Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iscadapter.impl.ISCResourceImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link iscadapter.impl.ISCResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link iscadapter.impl.ISCResourceImpl#getArrange <em>Arrange</em>}</li>
 *   <li>{@link iscadapter.impl.ISCResourceImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link iscadapter.impl.ISCResourceImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link iscadapter.impl.ISCResourceImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link iscadapter.impl.ISCResourceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link iscadapter.impl.ISCResourceImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link iscadapter.impl.ISCResourceImpl#getLong <em>Long</em>}</li>
 *   <li>{@link iscadapter.impl.ISCResourceImpl#getDSEntity <em>DS Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISCResourceImpl extends EResourceImpl implements ISCResource {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

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
	 * The default value of the '{@link #getArrange() <em>Arrange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrange()
	 * @generated
	 * @ordered
	 */
	protected static final ArrangementType ARRANGE_EDEFAULT = ArrangementType.PHISICAL;

	/**
	 * The cached value of the '{@link #getArrange() <em>Arrange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrange()
	 * @generated
	 * @ordered
	 */
	protected ArrangementType arrange = ARRANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComposition() <em>Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected static final CompositionType COMPOSITION_EDEFAULT = CompositionType.SINGLE;

	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected CompositionType composition = COMPOSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceProperty> properties;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capabilities;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final double LAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected double lat = LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected static final double LONG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected double long_ = LONG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDSEntity() <em>DS Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSEntity()
	 * @generated
	 * @ordered
	 */
	protected EDSEntity dsEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISCResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IscadapterPackage.Literals.ISC_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IscadapterPackage.ISC_RESOURCE__URI, oldUri, uri));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IscadapterPackage.ISC_RESOURCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrangementType getArrange() {
		return arrange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrange(ArrangementType newArrange) {
		ArrangementType oldArrange = arrange;
		arrange = newArrange == null ? ARRANGE_EDEFAULT : newArrange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IscadapterPackage.ISC_RESOURCE__ARRANGE, oldArrange, arrange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionType getComposition() {
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposition(CompositionType newComposition) {
		CompositionType oldComposition = composition;
		composition = newComposition == null ? COMPOSITION_EDEFAULT : newComposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IscadapterPackage.ISC_RESOURCE__COMPOSITION, oldComposition, composition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<ResourceProperty>(ResourceProperty.class, this, IscadapterPackage.ISC_RESOURCE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<Capability>(Capability.class, this, IscadapterPackage.ISC_RESOURCE__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IscadapterPackage.ISC_RESOURCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat(double newLat) {
		double oldLat = lat;
		lat = newLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IscadapterPackage.ISC_RESOURCE__LAT, oldLat, lat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLong() {
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong(double newLong) {
		double oldLong = long_;
		long_ = newLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IscadapterPackage.ISC_RESOURCE__LONG, oldLong, long_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDSEntity getDSEntity() {
		if (dsEntity != null && dsEntity.eIsProxy()) {
			InternalEObject oldDSEntity = (InternalEObject)dsEntity;
			dsEntity = (EDSEntity)eResolveProxy(oldDSEntity);
			if (dsEntity != oldDSEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IscadapterPackage.ISC_RESOURCE__DS_ENTITY, oldDSEntity, dsEntity));
			}
		}
		return dsEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDSEntity basicGetDSEntity() {
		return dsEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSEntity(EDSEntity newDSEntity) {
		EDSEntity oldDSEntity = dsEntity;
		dsEntity = newDSEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IscadapterPackage.ISC_RESOURCE__DS_ENTITY, oldDSEntity, dsEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IscadapterPackage.ISC_RESOURCE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case IscadapterPackage.ISC_RESOURCE__CAPABILITIES:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
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
			case IscadapterPackage.ISC_RESOURCE__URI:
				return getUri();
			case IscadapterPackage.ISC_RESOURCE__DESCRIPTION:
				return getDescription();
			case IscadapterPackage.ISC_RESOURCE__ARRANGE:
				return getArrange();
			case IscadapterPackage.ISC_RESOURCE__COMPOSITION:
				return getComposition();
			case IscadapterPackage.ISC_RESOURCE__PROPERTIES:
				return getProperties();
			case IscadapterPackage.ISC_RESOURCE__CAPABILITIES:
				return getCapabilities();
			case IscadapterPackage.ISC_RESOURCE__STATUS:
				return getStatus();
			case IscadapterPackage.ISC_RESOURCE__LAT:
				return getLat();
			case IscadapterPackage.ISC_RESOURCE__LONG:
				return getLong();
			case IscadapterPackage.ISC_RESOURCE__DS_ENTITY:
				if (resolve) return getDSEntity();
				return basicGetDSEntity();
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
			case IscadapterPackage.ISC_RESOURCE__URI:
				setUri((String)newValue);
				return;
			case IscadapterPackage.ISC_RESOURCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case IscadapterPackage.ISC_RESOURCE__ARRANGE:
				setArrange((ArrangementType)newValue);
				return;
			case IscadapterPackage.ISC_RESOURCE__COMPOSITION:
				setComposition((CompositionType)newValue);
				return;
			case IscadapterPackage.ISC_RESOURCE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends ResourceProperty>)newValue);
				return;
			case IscadapterPackage.ISC_RESOURCE__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case IscadapterPackage.ISC_RESOURCE__STATUS:
				setStatus((String)newValue);
				return;
			case IscadapterPackage.ISC_RESOURCE__LAT:
				setLat((Double)newValue);
				return;
			case IscadapterPackage.ISC_RESOURCE__LONG:
				setLong((Double)newValue);
				return;
			case IscadapterPackage.ISC_RESOURCE__DS_ENTITY:
				setDSEntity((EDSEntity)newValue);
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
			case IscadapterPackage.ISC_RESOURCE__URI:
				setUri(URI_EDEFAULT);
				return;
			case IscadapterPackage.ISC_RESOURCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case IscadapterPackage.ISC_RESOURCE__ARRANGE:
				setArrange(ARRANGE_EDEFAULT);
				return;
			case IscadapterPackage.ISC_RESOURCE__COMPOSITION:
				setComposition(COMPOSITION_EDEFAULT);
				return;
			case IscadapterPackage.ISC_RESOURCE__PROPERTIES:
				getProperties().clear();
				return;
			case IscadapterPackage.ISC_RESOURCE__CAPABILITIES:
				getCapabilities().clear();
				return;
			case IscadapterPackage.ISC_RESOURCE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case IscadapterPackage.ISC_RESOURCE__LAT:
				setLat(LAT_EDEFAULT);
				return;
			case IscadapterPackage.ISC_RESOURCE__LONG:
				setLong(LONG_EDEFAULT);
				return;
			case IscadapterPackage.ISC_RESOURCE__DS_ENTITY:
				setDSEntity((EDSEntity)null);
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
			case IscadapterPackage.ISC_RESOURCE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case IscadapterPackage.ISC_RESOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case IscadapterPackage.ISC_RESOURCE__ARRANGE:
				return arrange != ARRANGE_EDEFAULT;
			case IscadapterPackage.ISC_RESOURCE__COMPOSITION:
				return composition != COMPOSITION_EDEFAULT;
			case IscadapterPackage.ISC_RESOURCE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case IscadapterPackage.ISC_RESOURCE__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case IscadapterPackage.ISC_RESOURCE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case IscadapterPackage.ISC_RESOURCE__LAT:
				return lat != LAT_EDEFAULT;
			case IscadapterPackage.ISC_RESOURCE__LONG:
				return long_ != LONG_EDEFAULT;
			case IscadapterPackage.ISC_RESOURCE__DS_ENTITY:
				return dsEntity != null;
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(", description: ");
		result.append(description);
		result.append(", arrange: ");
		result.append(arrange);
		result.append(", composition: ");
		result.append(composition);
		result.append(", status: ");
		result.append(status);
		result.append(", lat: ");
		result.append(lat);
		result.append(", long: ");
		result.append(long_);
		result.append(')');
		return result.toString();
	}

} //ISCResourceImpl
