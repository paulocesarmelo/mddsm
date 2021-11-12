/**
 */
package iscadapter.resources;

import dsk.EDSC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iscadapter.resources.Capability#getName <em>Name</em>}</li>
 *   <li>{@link iscadapter.resources.Capability#getDescription <em>Description</em>}</li>
 *   <li>{@link iscadapter.resources.Capability#getFunction <em>Function</em>}</li>
 *   <li>{@link iscadapter.resources.Capability#getValue <em>Value</em>}</li>
 *   <li>{@link iscadapter.resources.Capability#getDsc <em>Dsc</em>}</li>
 * </ul>
 *
 * @see iscadapter.resources.ResourcesPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iscadapter.resources.ResourcesPackage#getCapability_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iscadapter.resources.Capability#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see iscadapter.resources.ResourcesPackage#getCapability_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link iscadapter.resources.Capability#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link iscadapter.resources.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see iscadapter.resources.ResourceType
	 * @see #setFunction(ResourceType)
	 * @see iscadapter.resources.ResourcesPackage#getCapability_Function()
	 * @model
	 * @generated
	 */
	ResourceType getFunction();

	/**
	 * Sets the value of the '{@link iscadapter.resources.Capability#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see iscadapter.resources.ResourceType
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see iscadapter.resources.ResourcesPackage#getCapability_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link iscadapter.resources.Capability#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Dsc</b></em>' containment reference list.
	 * The list contents are of type {@link dsk.EDSC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsc</em>' containment reference list.
	 * @see iscadapter.resources.ResourcesPackage#getCapability_Dsc()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EDSC> getDsc();

} // Capability
