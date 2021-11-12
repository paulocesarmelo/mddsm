/**
 */
package dsk;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dsk.DskPackage
 * @generated
 */
public interface DskFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DskFactory eINSTANCE = dsk.impl.DskFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dsk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsk</em>'.
	 * @generated
	 */
	Dsk createDsk();

	/**
	 * Returns a new object of class '<em>EProcedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EProcedure</em>'.
	 * @generated
	 */
	EProcedure createEProcedure();

	/**
	 * Returns a new object of class '<em>EDSC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDSC</em>'.
	 * @generated
	 */
	EDSC createEDSC();

	/**
	 * Returns a new object of class '<em>EExecution Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EExecution Unit</em>'.
	 * @generated
	 */
	EExecutionUnit createEExecutionUnit();

	/**
	 * Returns a new object of class '<em>EDS Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDS Event</em>'.
	 * @generated
	 */
	EDSEvent createEDSEvent();

	/**
	 * Returns a new object of class '<em>EDS Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDS Entity</em>'.
	 * @generated
	 */
	EDSEntity createEDSEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DskPackage getDskPackage();

} //DskFactory
