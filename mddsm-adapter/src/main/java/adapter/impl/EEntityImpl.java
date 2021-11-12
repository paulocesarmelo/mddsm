/**
 */
package adapter.impl;

import adapter.AdapterPackage;
import adapter.EEntity;

import dsk.impl.EDSEntityImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEntity</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EEntityImpl extends EDSEntityImpl implements EEntity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterPackage.Literals.EENTITY;
	}

} //EEntityImpl
