/**
 */
package mgridml;

import m4md.EControlSchema;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MGrid Control Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.MGridControlSchema#getMcgrid <em>Mcgrid</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getMGridControlSchema()
 * @model
 * @generated
 */
public interface MGridControlSchema extends EControlSchema {
	/**
	 * Returns the value of the '<em><b>Mcgrid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mcgrid</em>' containment reference.
	 * @see #setMcgrid(MCGrid)
	 * @see mgridml.MgridmlPackage#getMGridControlSchema_Mcgrid()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MCGrid getMcgrid();

	/**
	 * Sets the value of the '{@link mgridml.MGridControlSchema#getMcgrid <em>Mcgrid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mcgrid</em>' containment reference.
	 * @see #getMcgrid()
	 * @generated
	 */
	void setMcgrid(MCGrid value);

} // MGridControlSchema
