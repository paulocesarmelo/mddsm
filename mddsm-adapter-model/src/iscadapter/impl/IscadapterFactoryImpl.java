/**
 */
package iscadapter.impl;

import iscadapter.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IscadapterFactoryImpl extends EFactoryImpl implements IscadapterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IscadapterFactory init() {
		try {
			IscadapterFactory theIscadapterFactory = (IscadapterFactory)EPackage.Registry.INSTANCE.getEFactory(IscadapterPackage.eNS_URI);
			if (theIscadapterFactory != null) {
				return theIscadapterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IscadapterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IscadapterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IscadapterPackage.INTER_SCITY_ADAPTER: return createInterScityAdapter();
			case IscadapterPackage.ISC_COMM: return createISCComm();
			case IscadapterPackage.ISC_RESOURCE: return createISCResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterScityAdapter createInterScityAdapter() {
		InterScityAdapterImpl interScityAdapter = new InterScityAdapterImpl();
		return interScityAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISCComm createISCComm() {
		ISCCommImpl iscComm = new ISCCommImpl();
		return iscComm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISCResource createISCResource() {
		ISCResourceImpl iscResource = new ISCResourceImpl();
		return iscResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IscadapterPackage getIscadapterPackage() {
		return (IscadapterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IscadapterPackage getPackage() {
		return IscadapterPackage.eINSTANCE;
	}

} //IscadapterFactoryImpl
