/**
 */
package iscadapter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see iscadapter.IscadapterPackage
 * @generated
 */
public interface IscadapterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IscadapterFactory eINSTANCE = iscadapter.impl.IscadapterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Inter Scity Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inter Scity Adapter</em>'.
	 * @generated
	 */
	InterScityAdapter createInterScityAdapter();

	/**
	 * Returns a new object of class '<em>ISC Comm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISC Comm</em>'.
	 * @generated
	 */
	ISCComm createISCComm();

	/**
	 * Returns a new object of class '<em>ISC Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISC Resource</em>'.
	 * @generated
	 */
	ISCResource createISCResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IscadapterPackage getIscadapterPackage();

} //IscadapterFactory
