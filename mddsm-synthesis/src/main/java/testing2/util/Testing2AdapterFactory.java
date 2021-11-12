/**
 */
package testing2.util;

import m4md.EActor;
import m4md.EControlSchema;
import m4md.EDataSchema;
import m4md.EDomainSchema;
import m4md.EDomainSpecificCommand;
import m4md.EDomainSpecificEntity;
import m4md.EDomainSpecificType;
import m4md.EItem;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import testing2.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see testing2.Testing2Package
 * @generated
 */
public class Testing2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Testing2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testing2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Testing2Package.eINSTANCE;
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
	protected Testing2Switch<Adapter> modelSwitch =
		new Testing2Switch<Adapter>() {
			@Override
			public Adapter caseTestingSchema(TestingSchema object) {
				return createTestingSchemaAdapter();
			}
			@Override
			public Adapter caseTestingCS(TestingCS object) {
				return createTestingCSAdapter();
			}
			@Override
			public Adapter caseTestingDS(TestingDS object) {
				return createTestingDSAdapter();
			}
			@Override
			public Adapter caseClassType(ClassType object) {
				return createClassTypeAdapter();
			}
			@Override
			public Adapter caseClassItem(ClassItem object) {
				return createClassItemAdapter();
			}
			@Override
			public Adapter caseClassActor(ClassActor object) {
				return createClassActorAdapter();
			}
			@Override
			public Adapter caseClassCommand(ClassCommand object) {
				return createClassCommandAdapter();
			}
			@Override
			public Adapter caseEDomainSchema(EDomainSchema object) {
				return createEDomainSchemaAdapter();
			}
			@Override
			public Adapter caseEControlSchema(EControlSchema object) {
				return createEControlSchemaAdapter();
			}
			@Override
			public Adapter caseEDataSchema(EDataSchema object) {
				return createEDataSchemaAdapter();
			}
			@Override
			public Adapter caseEDomainSpecificType(EDomainSpecificType object) {
				return createEDomainSpecificTypeAdapter();
			}
			@Override
			public Adapter caseEDomainSpecificEntity(EDomainSpecificEntity object) {
				return createEDomainSpecificEntityAdapter();
			}
			@Override
			public Adapter caseEItem(EItem object) {
				return createEItemAdapter();
			}
			@Override
			public Adapter caseEActor(EActor object) {
				return createEActorAdapter();
			}
			@Override
			public Adapter caseEDomainSpecificCommand(EDomainSpecificCommand object) {
				return createEDomainSpecificCommandAdapter();
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
	 * Creates a new adapter for an object of class '{@link testing2.TestingSchema <em>Testing Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing2.TestingSchema
	 * @generated
	 */
	public Adapter createTestingSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testing2.TestingCS <em>Testing CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing2.TestingCS
	 * @generated
	 */
	public Adapter createTestingCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testing2.TestingDS <em>Testing DS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing2.TestingDS
	 * @generated
	 */
	public Adapter createTestingDSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testing2.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing2.ClassType
	 * @generated
	 */
	public Adapter createClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testing2.ClassItem <em>Class Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing2.ClassItem
	 * @generated
	 */
	public Adapter createClassItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testing2.ClassActor <em>Class Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing2.ClassActor
	 * @generated
	 */
	public Adapter createClassActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testing2.ClassCommand <em>Class Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing2.ClassCommand
	 * @generated
	 */
	public Adapter createClassCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EDomainSchema <em>EDomain Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EDomainSchema
	 * @generated
	 */
	public Adapter createEDomainSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EControlSchema <em>EControl Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EControlSchema
	 * @generated
	 */
	public Adapter createEControlSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EDataSchema <em>EData Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EDataSchema
	 * @generated
	 */
	public Adapter createEDataSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EDomainSpecificType <em>EDomain Specific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EDomainSpecificType
	 * @generated
	 */
	public Adapter createEDomainSpecificTypeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link m4md.EItem <em>EItem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EItem
	 * @generated
	 */
	public Adapter createEItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EActor <em>EActor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EActor
	 * @generated
	 */
	public Adapter createEActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EDomainSpecificCommand <em>EDomain Specific Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EDomainSpecificCommand
	 * @generated
	 */
	public Adapter createEDomainSpecificCommandAdapter() {
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

} //Testing2AdapterFactory
