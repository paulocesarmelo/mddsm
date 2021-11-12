/**
 */
package dsk;

import dsk.common.Parameter;

import m4md.EDomainSpecificEntity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDSC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsk.EDSC#getName <em>Name</em>}</li>
 *   <li>{@link dsk.EDSC#getKind <em>Kind</em>}</li>
 *   <li>{@link dsk.EDSC#getParameters <em>Parameters</em>}</li>
 *   <li>{@link dsk.EDSC#getEntity <em>Entity</em>}</li>
 *   <li>{@link dsk.EDSC#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see dsk.DskPackage#getEDSC()
 * @model
 * @generated
 */
public interface EDSC extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsk.DskPackage#getEDSC_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsk.EDSC#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link dsk.EDSCType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see dsk.EDSCType
	 * @see #setKind(EDSCType)
	 * @see dsk.DskPackage#getEDSC_Kind()
	 * @model
	 * @generated
	 */
	EDSCType getKind();

	/**
	 * Sets the value of the '{@link dsk.EDSC#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see dsk.EDSCType
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EDSCType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link dsk.common.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see dsk.DskPackage#getEDSC_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(EDomainSpecificEntity)
	 * @see dsk.DskPackage#getEDSC_Entity()
	 * @model required="true"
	 * @generated
	 */
	EDomainSpecificEntity getEntity();

	/**
	 * Sets the value of the '{@link dsk.EDSC#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EDomainSpecificEntity value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference list.
	 * The list contents are of type {@link dsk.EDSEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference list.
	 * @see dsk.DskPackage#getEDSC_Condition()
	 * @model
	 * @generated
	 */
	EList<EDSEvent> getCondition();

} // EDSC
