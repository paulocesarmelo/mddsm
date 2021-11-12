/**
 */
package adapter.util;

import adapter.*;

import dsk.EDSC;
import dsk.EDSEntity;
import m4md.EDomainSpecificEntity;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see adapter.AdapterPackage
 * @generated
 */
public class AdapterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdapterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AdapterPackage.eINSTANCE;
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
	protected AdapterSwitch<Adapter> modelSwitch =
		new AdapterSwitch<Adapter>() {
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
			public Adapter caseEComponent(EComponent object) {
				return createEComponentAdapter();
			}
			@Override
			public Adapter caseEData(EData object) {
				return createEDataAdapter();
			}
			@Override
			public Adapter caseEEntity(EEntity object) {
				return createEEntityAdapter();
			}
			@Override
			public Adapter caseEDSCmd(EDSCmd object) {
				return createEDSCmdAdapter();
			}
			@Override
			public Adapter caseEDomainSpecificEntity(EDomainSpecificEntity object) {
				return createEDomainSpecificEntityAdapter();
			}
			@Override
			public Adapter caseEDSEntity(EDSEntity object) {
				return createEDSEntityAdapter();
			}
			@Override
			public Adapter caseEDSC(EDSC object) {
				return createEDSCAdapter();
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
	 * Creates a new adapter for an object of class '{@link adapter.EComponent <em>EComponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adapter.EComponent
	 * @generated
	 */
	public Adapter createEComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adapter.EData <em>EData</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adapter.EData
	 * @generated
	 */
	public Adapter createEDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adapter.EEntity <em>EEntity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adapter.EEntity
	 * @generated
	 */
	public Adapter createEEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adapter.EDSCmd <em>EDS Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adapter.EDSCmd
	 * @generated
	 */
	public Adapter createEDSCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EDomainSpecificEntity <em>EDomain Specific Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EDomainSpecificEntity
	 * @generated
	 */
	public Adapter createEDomainSpecificEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsk.EDSEntity <em>EDS Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsk.EDSEntity
	 * @generated
	 */
	public Adapter createEDSEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsk.EDSC <em>EDSC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsk.EDSC
	 * @generated
	 */
	public Adapter createEDSCAdapter() {
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

} //AdapterAdapterFactory
