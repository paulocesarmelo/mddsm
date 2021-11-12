/**
 */
package dsk;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDS Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsk.EDSEvent#getId <em>Id</em>}</li>
 *   <li>{@link dsk.EDSEvent#getName <em>Name</em>}</li>
 *   <li>{@link dsk.EDSEvent#getType <em>Type</em>}</li>
 *   <li>{@link dsk.EDSEvent#getMetaCmd <em>Meta Cmd</em>}</li>
 * </ul>
 *
 * @see dsk.DskPackage#getEDSEvent()
 * @model
 * @generated
 */
public interface EDSEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dsk.DskPackage#getEDSEvent_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dsk.EDSEvent#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsk.DskPackage#getEDSEvent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsk.EDSEvent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dsk.EEventType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dsk.EEventType
	 * @see #setType(EEventType)
	 * @see dsk.DskPackage#getEDSEvent_Type()
	 * @model
	 * @generated
	 */
	EEventType getType();

	/**
	 * Sets the value of the '{@link dsk.EDSEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dsk.EEventType
	 * @see #getType()
	 * @generated
	 */
	void setType(EEventType value);

	/**
	 * Returns the value of the '<em><b>Meta Cmd</b></em>' attribute.
	 * The default value is <code>"NONE"</code>.
	 * The literals are from the enumeration {@link dsk.EMetaCmdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Cmd</em>' attribute.
	 * @see dsk.EMetaCmdType
	 * @see #setMetaCmd(EMetaCmdType)
	 * @see dsk.DskPackage#getEDSEvent_MetaCmd()
	 * @model default="NONE"
	 * @generated
	 */
	EMetaCmdType getMetaCmd();

	/**
	 * Sets the value of the '{@link dsk.EDSEvent#getMetaCmd <em>Meta Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Cmd</em>' attribute.
	 * @see dsk.EMetaCmdType
	 * @see #getMetaCmd()
	 * @generated
	 */
	void setMetaCmd(EMetaCmdType value);

} // EDSEvent
