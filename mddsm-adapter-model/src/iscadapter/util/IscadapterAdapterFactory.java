/**
 */
package iscadapter.util;

import adapter.EAdapter;
import adapter.ECommunication;
import adapter.EResource;

import iscadapter.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see iscadapter.IscadapterPackage
 * @generated
 */
public class IscadapterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IscadapterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IscadapterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = IscadapterPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IscadapterSwitch<Adapter> modelSwitch =
		new IscadapterSwitch<Adapter>() {
			@Override
			public Adapter caseInterScityAdapter(InterScityAdapter object) {
				return createInterScityAdapterAdapter();
			}
			@Override
			public Adapter caseISCComm(ISCComm object) {
				return createISCCommAdapter();
			}
			@Override
			public Adapter caseISCResource(ISCResource object) {
				return createISCResourceAdapter();
			}
			@Override
			public Adapter caseEAdapter(EAdapter object) {
				return createEAdapterAdapter();
			}
			@Override
			public Adapter caseECommunication(ECommunication object) {
				return createECommunicationAdapter();
			}
			@Override
			public Adapter caseEResource(EResource object) {
				return createEResourceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link iscadapter.InterScityAdapter <em>Inter Scity Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iscadapter.InterScityAdapter
	 * @generated
	 */
	public Adapter createInterScityAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iscadapter.ISCComm <em>ISC Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iscadapter.ISCComm
	 * @generated
	 */
	public Adapter createISCCommAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link iscadapter.ISCResource <em>ISC Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see iscadapter.ISCResource
	 * @generated
	 */
	public Adapter createISCResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adapter.EAdapter <em>EAdapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adapter.EAdapter
	 * @generated
	 */
	public Adapter createEAdapterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adapter.ECommunication <em>ECommunication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adapter.ECommunication
	 * @generated
	 */
	public Adapter createECommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adapter.EResource <em>EResource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adapter.EResource
	 * @generated
	 */
	public Adapter createEResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //IscadapterAdapterFactory
