/**
 */
package iscadapter;

import adapter.EResource;

import dsk.EDSEntity;
import iscadapter.resources.ArrangementType;
import iscadapter.resources.Capability;
import iscadapter.resources.CompositionType;
import iscadapter.resources.ResourceProperty;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISC Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iscadapter.ISCResource#getUri <em>Uri</em>}</li>
 *   <li>{@link iscadapter.ISCResource#getDescription <em>Description</em>}</li>
 *   <li>{@link iscadapter.ISCResource#getArrange <em>Arrange</em>}</li>
 *   <li>{@link iscadapter.ISCResource#getComposition <em>Composition</em>}</li>
 *   <li>{@link iscadapter.ISCResource#getProperties <em>Properties</em>}</li>
 *   <li>{@link iscadapter.ISCResource#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link iscadapter.ISCResource#getStatus <em>Status</em>}</li>
 *   <li>{@link iscadapter.ISCResource#getLat <em>Lat</em>}</li>
 *   <li>{@link iscadapter.ISCResource#getLong <em>Long</em>}</li>
 *   <li>{@link iscadapter.ISCResource#getDSEntity <em>DS Entity</em>}</li>
 * </ul>
 *
 * @see iscadapter.IscadapterPackage#getISCResource()
 * @model
 * @generated
 */
public interface ISCResource extends EResource {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see iscadapter.IscadapterPackage#getISCResource_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link iscadapter.ISCResource#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see iscadapter.IscadapterPackage#getISCResource_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link iscadapter.ISCResource#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Arrange</b></em>' attribute.
	 * The literals are from the enumeration {@link iscadapter.resources.ArrangementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrange</em>' attribute.
	 * @see iscadapter.resources.ArrangementType
	 * @see #setArrange(ArrangementType)
	 * @see iscadapter.IscadapterPackage#getISCResource_Arrange()
	 * @model
	 * @generated
	 */
	ArrangementType getArrange();

	/**
	 * Sets the value of the '{@link iscadapter.ISCResource#getArrange <em>Arrange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrange</em>' attribute.
	 * @see iscadapter.resources.ArrangementType
	 * @see #getArrange()
	 * @generated
	 */
	void setArrange(ArrangementType value);

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' attribute.
	 * The literals are from the enumeration {@link iscadapter.resources.CompositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' attribute.
	 * @see iscadapter.resources.CompositionType
	 * @see #setComposition(CompositionType)
	 * @see iscadapter.IscadapterPackage#getISCResource_Composition()
	 * @model
	 * @generated
	 */
	CompositionType getComposition();

	/**
	 * Sets the value of the '{@link iscadapter.ISCResource#getComposition <em>Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' attribute.
	 * @see iscadapter.resources.CompositionType
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(CompositionType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link iscadapter.resources.ResourceProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see iscadapter.IscadapterPackage#getISCResource_Properties()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<ResourceProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link iscadapter.resources.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see iscadapter.IscadapterPackage#getISCResource_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see iscadapter.IscadapterPackage#getISCResource_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link iscadapter.ISCResource#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(double)
	 * @see iscadapter.IscadapterPackage#getISCResource_Lat()
	 * @model
	 * @generated
	 */
	double getLat();

	/**
	 * Sets the value of the '{@link iscadapter.ISCResource#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(double value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(double)
	 * @see iscadapter.IscadapterPackage#getISCResource_Long()
	 * @model
	 * @generated
	 */
	double getLong();

	/**
	 * Sets the value of the '{@link iscadapter.ISCResource#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(double value);

	/**
	 * Returns the value of the '<em><b>DS Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Entity</em>' reference.
	 * @see #setDSEntity(EDSEntity)
	 * @see iscadapter.IscadapterPackage#getISCResource_DSEntity()
	 * @model
	 * @generated
	 */
	EDSEntity getDSEntity();

	/**
	 * Sets the value of the '{@link iscadapter.ISCResource#getDSEntity <em>DS Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Entity</em>' reference.
	 * @see #getDSEntity()
	 * @generated
	 */
	void setDSEntity(EDSEntity value);

} // ISCResource
