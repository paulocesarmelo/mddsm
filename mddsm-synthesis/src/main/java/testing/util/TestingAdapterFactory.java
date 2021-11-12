/**
 */
package testing.util;

import metalang4md.EActor;
import metalang4md.EDomainSpecificElement;
import metalang4md.EDomainSpecificType;
import metalang4md.EItem;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import testing.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see testing.TestingPackage
 * @generated
 */
public class TestingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TestingPackage.eINSTANCE;
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
	protected TestingSwitch<Adapter> modelSwitch =
		new TestingSwitch<Adapter>() {
			@Override
			public Adapter caseClassItem(ClassItem object) {
				return createClassItemAdapter();
			}
			@Override
			public Adapter caseClassActor(ClassActor object) {
				return createClassActorAdapter();
			}
			@Override
			public Adapter caseClassType(ClassType object) {
				return createClassTypeAdapter();
			}
			@Override
			public Adapter caseBaseClass(BaseClass object) {
				return createBaseClassAdapter();
			}
			@Override
			public Adapter caseSandbox(Sandbox object) {
				return createSandboxAdapter();
			}
			@Override
			public Adapter caseClassCommand(ClassCommand object) {
				return createClassCommandAdapter();
			}
			@Override
			public Adapter caseEDomainSpecificElement(EDomainSpecificElement object) {
				return createEDomainSpecificElementAdapter();
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
			public Adapter caseEDomainSpecificType(EDomainSpecificType object) {
				return createEDomainSpecificTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link testing.ClassItem <em>Class Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing.ClassItem
	 * @generated
	 */
	public Adapter createClassItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testing.ClassActor <em>Class Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing.ClassActor
	 * @generated
	 */
	public Adapter createClassActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testing.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing.ClassType
	 * @generated
	 */
	public Adapter createClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testing.BaseClass <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing.BaseClass
	 * @generated
	 */
	public Adapter createBaseClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testing.Sandbox <em>Sandbox</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing.Sandbox
	 * @generated
	 */
	public Adapter createSandboxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link testing.ClassCommand <em>Class Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see testing.ClassCommand
	 * @generated
	 */
	public Adapter createClassCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metalang4md.EDomainSpecificElement <em>EDomain Specific Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metalang4md.EDomainSpecificElement
	 * @generated
	 */
	public Adapter createEDomainSpecificElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metalang4md.EItem <em>EItem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metalang4md.EItem
	 * @generated
	 */
	public Adapter createEItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metalang4md.EActor <em>EActor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metalang4md.EActor
	 * @generated
	 */
	public Adapter createEActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metalang4md.EDomainSpecificType <em>EDomain Specific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metalang4md.EDomainSpecificType
	 * @generated
	 */
	public Adapter createEDomainSpecificTypeAdapter() {
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

} //TestingAdapterFactory
