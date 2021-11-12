/**
 */
package adapter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see adapter.AdapterPackage
 * @generated
 */
public interface AdapterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdapterFactory eINSTANCE = adapter.impl.AdapterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EAdapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAdapter</em>'.
	 * @generated
	 */
	EAdapter createEAdapter();

	/**
	 * Returns a new object of class '<em>ECommunication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECommunication</em>'.
	 * @generated
	 */
	ECommunication createECommunication();

	/**
	 * Returns a new object of class '<em>EResource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EResource</em>'.
	 * @generated
	 */
	EResource createEResource();

	/**
	 * Returns a new object of class '<em>EComponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EComponent</em>'.
	 * @generated
	 */
	EComponent createEComponent();

	/**
	 * Returns a new object of class '<em>EData</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EData</em>'.
	 * @generated
	 */
	EData createEData();

	/**
	 * Returns a new object of class '<em>EEntity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEntity</em>'.
	 * @generated
	 */
	EEntity createEEntity();

	/**
	 * Returns a new object of class '<em>EDS Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDS Cmd</em>'.
	 * @generated
	 */
	EDSCmd createEDSCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdapterPackage getAdapterPackage();

} //AdapterFactory
