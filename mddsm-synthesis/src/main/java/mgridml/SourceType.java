/**
 */
package mgridml;

import m4md.EDomainSpecificType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.SourceType#getSoTypeID <em>So Type ID</em>}</li>
 *   <li>{@link mgridml.SourceType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link mgridml.SourceType#getSourceC <em>Source C</em>}</li>
 *   <li>{@link mgridml.SourceType#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getSourceType()
 * @model
 * @generated
 */
public interface SourceType extends EDomainSpecificType {
	/**
	 * Returns the value of the '<em><b>So Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>So Type ID</em>' attribute.
	 * @see #setSoTypeID(String)
	 * @see mgridml.MgridmlPackage#getSourceType_SoTypeID()
	 * @model
	 * @generated
	 */
	String getSoTypeID();

	/**
	 * Sets the value of the '{@link mgridml.SourceType#getSoTypeID <em>So Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>So Type ID</em>' attribute.
	 * @see #getSoTypeID()
	 * @generated
	 */
	void setSoTypeID(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see mgridml.MgridmlPackage#getSourceType_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link mgridml.SourceType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Source C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source C</em>' attribute.
	 * @see #setSourceC(String)
	 * @see mgridml.MgridmlPackage#getSourceType_SourceC()
	 * @model
	 * @generated
	 */
	String getSourceC();

	/**
	 * Sets the value of the '{@link mgridml.SourceType#getSourceC <em>Source C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source C</em>' attribute.
	 * @see #getSourceC()
	 * @generated
	 */
	void setSourceC(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see mgridml.MgridmlPackage#getSourceType_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link mgridml.SourceType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // SourceType
