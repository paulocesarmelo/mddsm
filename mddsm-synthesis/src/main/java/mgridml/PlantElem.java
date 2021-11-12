/**
 */
package mgridml;

import m4md.EItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant Elem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mgridml.PlantElem#getPlantE_ID <em>Plant EID</em>}</li>
 * </ul>
 *
 * @see mgridml.MgridmlPackage#getPlantElem()
 * @model
 * @generated
 */
public interface PlantElem extends EItem {
	/**
	 * Returns the value of the '<em><b>Plant EID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant EID</em>' attribute.
	 * @see #setPlantE_ID(String)
	 * @see mgridml.MgridmlPackage#getPlantElem_PlantE_ID()
	 * @model
	 * @generated
	 */
	String getPlantE_ID();

	/**
	 * Sets the value of the '{@link mgridml.PlantElem#getPlantE_ID <em>Plant EID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant EID</em>' attribute.
	 * @see #getPlantE_ID()
	 * @generated
	 */
	void setPlantE_ID(String value);

} // PlantElem
