/**
 */
package iscadapter.resources;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iscadapter.resources.ResourceProperty#getAttr <em>Attr</em>}</li>
 *   <li>{@link iscadapter.resources.ResourceProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see iscadapter.resources.ResourcesPackage#getResourceProperty()
 * @model
 * @generated
 */
public interface ResourceProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr</em>' attribute.
	 * @see #setAttr(String)
	 * @see iscadapter.resources.ResourcesPackage#getResourceProperty_Attr()
	 * @model
	 * @generated
	 */
	String getAttr();

	/**
	 * Sets the value of the '{@link iscadapter.resources.ResourceProperty#getAttr <em>Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr</em>' attribute.
	 * @see #getAttr()
	 * @generated
	 */
	void setAttr(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see iscadapter.resources.ResourcesPackage#getResourceProperty_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link iscadapter.resources.ResourceProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ResourceProperty
