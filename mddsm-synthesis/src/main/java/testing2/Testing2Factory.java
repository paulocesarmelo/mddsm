/**
 */
package testing2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see testing2.Testing2Package
 * @generated
 */
public interface Testing2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Testing2Factory eINSTANCE = testing2.impl.Testing2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Testing Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing Schema</em>'.
	 * @generated
	 */
	TestingSchema createTestingSchema();

	/**
	 * Returns a new object of class '<em>Testing CS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing CS</em>'.
	 * @generated
	 */
	TestingCS createTestingCS();

	/**
	 * Returns a new object of class '<em>Testing DS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing DS</em>'.
	 * @generated
	 */
	TestingDS createTestingDS();

	/**
	 * Returns a new object of class '<em>Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Type</em>'.
	 * @generated
	 */
	ClassType createClassType();

	/**
	 * Returns a new object of class '<em>Class Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Item</em>'.
	 * @generated
	 */
	ClassItem createClassItem();

	/**
	 * Returns a new object of class '<em>Class Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Actor</em>'.
	 * @generated
	 */
	ClassActor createClassActor();

	/**
	 * Returns a new object of class '<em>Class Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Command</em>'.
	 * @generated
	 */
	ClassCommand createClassCommand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Testing2Package getTesting2Package();

} //Testing2Factory
