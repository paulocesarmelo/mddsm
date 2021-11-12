/**
 */
package m4md;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see m4md.M4mdPackage
 * @generated
 */
public interface M4mdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	M4mdFactory eINSTANCE = m4md.impl.M4mdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EDomain Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDomain Schema</em>'.
	 * @generated
	 */
	EDomainSchema createEDomainSchema();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	M4mdPackage getM4mdPackage();

} //M4mdFactory
