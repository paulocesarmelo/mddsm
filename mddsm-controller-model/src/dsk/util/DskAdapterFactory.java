/**
 */
package dsk.util;

import dsk.*;

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
 * @see dsk.DskPackage
 * @generated
 */
public class DskAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DskPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DskAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DskPackage.eINSTANCE;
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
	protected DskSwitch<Adapter> modelSwitch =
		new DskSwitch<Adapter>() {
			@Override
			public Adapter caseDsk(Dsk object) {
				return createDskAdapter();
			}
			@Override
			public Adapter caseEProcedure(EProcedure object) {
				return createEProcedureAdapter();
			}
			@Override
			public Adapter caseEDSC(EDSC object) {
				return createEDSCAdapter();
			}
			@Override
			public Adapter caseEExecutionUnit(EExecutionUnit object) {
				return createEExecutionUnitAdapter();
			}
			@Override
			public Adapter caseEDSEvent(EDSEvent object) {
				return createEDSEventAdapter();
			}
			@Override
			public Adapter caseEDSEntity(EDSEntity object) {
				return createEDSEntityAdapter();
			}
			@Override
			public Adapter caseEDomainSpecificEntity(EDomainSpecificEntity object) {
				return createEDomainSpecificEntityAdapter();
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
	 * Creates a new adapter for an object of class '{@link dsk.Dsk <em>Dsk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsk.Dsk
	 * @generated
	 */
	public Adapter createDskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsk.EProcedure <em>EProcedure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsk.EProcedure
	 * @generated
	 */
	public Adapter createEProcedureAdapter() {
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
	 * Creates a new adapter for an object of class '{@link dsk.EExecutionUnit <em>EExecution Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsk.EExecutionUnit
	 * @generated
	 */
	public Adapter createEExecutionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dsk.EDSEvent <em>EDS Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dsk.EDSEvent
	 * @generated
	 */
	public Adapter createEDSEventAdapter() {
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

} //DskAdapterFactory
