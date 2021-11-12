/**
 */
package iscadapter.components.impl;

import adapter.AdapterPackage;

import adapter.impl.AdapterPackageImpl;

import dsk.DskPackage;
import iscadapter.IscadapterPackage;

import iscadapter.components.ActuatorController;
import iscadapter.components.ComponentsFactory;
import iscadapter.components.ComponentsPackage;
import iscadapter.components.DataCollector;
import iscadapter.components.ResourceDiscovery;

import iscadapter.impl.IscadapterPackageImpl;

import iscadapter.resources.ResourcesPackage;

import iscadapter.resources.impl.ResourcesPackageImpl;

import m4md.M4mdPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentsPackageImpl extends EPackageImpl implements ComponentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceDiscoveryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataCollectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorControllerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see iscadapter.components.ComponentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentsPackageImpl() {
		super(eNS_URI, ComponentsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ComponentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentsPackage init() {
		if (isInited) return (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComponentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComponentsPackageImpl theComponentsPackage = registeredComponentsPackage instanceof ComponentsPackageImpl ? (ComponentsPackageImpl)registeredComponentsPackage : new ComponentsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DskPackage.eINSTANCE.eClass();
		M4mdPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IscadapterPackage.eNS_URI);
		IscadapterPackageImpl theIscadapterPackage = (IscadapterPackageImpl)(registeredPackage instanceof IscadapterPackageImpl ? registeredPackage : IscadapterPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(registeredPackage instanceof ResourcesPackageImpl ? registeredPackage : ResourcesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdapterPackage.eNS_URI);
		AdapterPackageImpl theAdapterPackage = (AdapterPackageImpl)(registeredPackage instanceof AdapterPackageImpl ? registeredPackage : AdapterPackage.eINSTANCE);

		// Create package meta-data objects
		theComponentsPackage.createPackageContents();
		theIscadapterPackage.createPackageContents();
		theResourcesPackage.createPackageContents();
		theAdapterPackage.createPackageContents();

		// Initialize created meta-data
		theComponentsPackage.initializePackageContents();
		theIscadapterPackage.initializePackageContents();
		theResourcesPackage.initializePackageContents();
		theAdapterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentsPackage.eNS_URI, theComponentsPackage);
		return theComponentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceDiscovery() {
		return resourceDiscoveryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceDiscovery_Route() {
		return (EAttribute)resourceDiscoveryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataCollector() {
		return dataCollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataCollector_Route() {
		return (EAttribute)dataCollectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuatorController() {
		return actuatorControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuatorController_Route() {
		return (EAttribute)actuatorControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsFactory getComponentsFactory() {
		return (ComponentsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceDiscoveryEClass = createEClass(RESOURCE_DISCOVERY);
		createEAttribute(resourceDiscoveryEClass, RESOURCE_DISCOVERY__ROUTE);

		dataCollectorEClass = createEClass(DATA_COLLECTOR);
		createEAttribute(dataCollectorEClass, DATA_COLLECTOR__ROUTE);

		actuatorControllerEClass = createEClass(ACTUATOR_CONTROLLER);
		createEAttribute(actuatorControllerEClass, ACTUATOR_CONTROLLER__ROUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AdapterPackage theAdapterPackage = (AdapterPackage)EPackage.Registry.INSTANCE.getEPackage(AdapterPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		resourceDiscoveryEClass.getESuperTypes().add(theAdapterPackage.getEComponent());
		dataCollectorEClass.getESuperTypes().add(theAdapterPackage.getEComponent());
		actuatorControllerEClass.getESuperTypes().add(theAdapterPackage.getEComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceDiscoveryEClass, ResourceDiscovery.class, "ResourceDiscovery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceDiscovery_Route(), ecorePackage.getEString(), "route", "discovery", 0, 1, ResourceDiscovery.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataCollectorEClass, DataCollector.class, "DataCollector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataCollector_Route(), ecorePackage.getEString(), "route", "datacollector", 0, 1, DataCollector.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorControllerEClass, ActuatorController.class, "ActuatorController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuatorController_Route(), ecorePackage.getEString(), "route", "actuatorcontroller", 0, 1, ActuatorController.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ComponentsPackageImpl
