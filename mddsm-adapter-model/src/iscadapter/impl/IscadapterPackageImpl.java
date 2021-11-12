/**
 */
package iscadapter.impl;

import adapter.AdapterPackage;

import adapter.impl.AdapterPackageImpl;

import dsk.DskPackage;
import iscadapter.ISCComm;
import iscadapter.ISCResource;
import iscadapter.InterScityAdapter;
import iscadapter.IscadapterFactory;
import iscadapter.IscadapterPackage;

import iscadapter.components.ComponentsPackage;

import iscadapter.components.impl.ComponentsPackageImpl;

import iscadapter.resources.ResourcesPackage;

import iscadapter.resources.impl.ResourcesPackageImpl;

import m4md.M4mdPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IscadapterPackageImpl extends EPackageImpl implements IscadapterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interScityAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iscCommEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iscResourceEClass = null;

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
	 * @see iscadapter.IscadapterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IscadapterPackageImpl() {
		super(eNS_URI, IscadapterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IscadapterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IscadapterPackage init() {
		if (isInited) return (IscadapterPackage)EPackage.Registry.INSTANCE.getEPackage(IscadapterPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredIscadapterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		IscadapterPackageImpl theIscadapterPackage = registeredIscadapterPackage instanceof IscadapterPackageImpl ? (IscadapterPackageImpl)registeredIscadapterPackage : new IscadapterPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DskPackage.eINSTANCE.eClass();
		M4mdPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(registeredPackage instanceof ComponentsPackageImpl ? registeredPackage : ComponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(registeredPackage instanceof ResourcesPackageImpl ? registeredPackage : ResourcesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdapterPackage.eNS_URI);
		AdapterPackageImpl theAdapterPackage = (AdapterPackageImpl)(registeredPackage instanceof AdapterPackageImpl ? registeredPackage : AdapterPackage.eINSTANCE);

		// Create package meta-data objects
		theIscadapterPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theResourcesPackage.createPackageContents();
		theAdapterPackage.createPackageContents();

		// Initialize created meta-data
		theIscadapterPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theResourcesPackage.initializePackageContents();
		theAdapterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIscadapterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IscadapterPackage.eNS_URI, theIscadapterPackage);
		return theIscadapterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterScityAdapter() {
		return interScityAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISCComm() {
		return iscCommEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISCResource() {
		return iscResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISCResource_Uri() {
		return (EAttribute)iscResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISCResource_Description() {
		return (EAttribute)iscResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISCResource_Arrange() {
		return (EAttribute)iscResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISCResource_Composition() {
		return (EAttribute)iscResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISCResource_Properties() {
		return (EReference)iscResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISCResource_Capabilities() {
		return (EReference)iscResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISCResource_Status() {
		return (EAttribute)iscResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISCResource_Lat() {
		return (EAttribute)iscResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getISCResource_Long() {
		return (EAttribute)iscResourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISCResource_DSEntity() {
		return (EReference)iscResourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IscadapterFactory getIscadapterFactory() {
		return (IscadapterFactory)getEFactoryInstance();
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
		interScityAdapterEClass = createEClass(INTER_SCITY_ADAPTER);

		iscCommEClass = createEClass(ISC_COMM);

		iscResourceEClass = createEClass(ISC_RESOURCE);
		createEAttribute(iscResourceEClass, ISC_RESOURCE__URI);
		createEAttribute(iscResourceEClass, ISC_RESOURCE__DESCRIPTION);
		createEAttribute(iscResourceEClass, ISC_RESOURCE__ARRANGE);
		createEAttribute(iscResourceEClass, ISC_RESOURCE__COMPOSITION);
		createEReference(iscResourceEClass, ISC_RESOURCE__PROPERTIES);
		createEReference(iscResourceEClass, ISC_RESOURCE__CAPABILITIES);
		createEAttribute(iscResourceEClass, ISC_RESOURCE__STATUS);
		createEAttribute(iscResourceEClass, ISC_RESOURCE__LAT);
		createEAttribute(iscResourceEClass, ISC_RESOURCE__LONG);
		createEReference(iscResourceEClass, ISC_RESOURCE__DS_ENTITY);
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
		ComponentsPackage theComponentsPackage = (ComponentsPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		ResourcesPackage theResourcesPackage = (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);
		AdapterPackage theAdapterPackage = (AdapterPackage)EPackage.Registry.INSTANCE.getEPackage(AdapterPackage.eNS_URI);
		DskPackage theDskPackage = (DskPackage)EPackage.Registry.INSTANCE.getEPackage(DskPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theComponentsPackage);
		getESubpackages().add(theResourcesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interScityAdapterEClass.getESuperTypes().add(theAdapterPackage.getEAdapter());
		iscCommEClass.getESuperTypes().add(theAdapterPackage.getECommunication());
		iscResourceEClass.getESuperTypes().add(theAdapterPackage.getEResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(interScityAdapterEClass, InterScityAdapter.class, "InterScityAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iscCommEClass, ISCComm.class, "ISCComm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iscResourceEClass, ISCResource.class, "ISCResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISCResource_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, ISCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISCResource_Description(), ecorePackage.getEString(), "description", null, 0, 1, ISCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISCResource_Arrange(), theResourcesPackage.getArrangementType(), "arrange", null, 0, 1, ISCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISCResource_Composition(), theResourcesPackage.getCompositionType(), "composition", null, 0, 1, ISCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISCResource_Properties(), theResourcesPackage.getResourceProperty(), null, "properties", null, 0, -1, ISCResource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISCResource_Capabilities(), theResourcesPackage.getCapability(), null, "capabilities", null, 0, -1, ISCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISCResource_Status(), ecorePackage.getEString(), "status", null, 0, 1, ISCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISCResource_Lat(), ecorePackage.getEDouble(), "lat", null, 0, 1, ISCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISCResource_Long(), ecorePackage.getEDouble(), "long", null, 0, 1, ISCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISCResource_DSEntity(), theDskPackage.getEDSEntity(), null, "DSEntity", null, 0, 1, ISCResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //IscadapterPackageImpl
