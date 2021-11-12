/**
 */
package adapter.impl;

import adapter.AdapterFactory;
import adapter.AdapterPackage;
import adapter.EAdapter;
import adapter.ECommAPI;
import adapter.ECommunication;
import adapter.EComponent;
import adapter.EDSCmd;
import adapter.EData;
import adapter.EDataFormat;
import adapter.EEntity;
import adapter.EResource;

import dsk.DskPackage;
import iscadapter.IscadapterPackage;

import iscadapter.components.ComponentsPackage;

import iscadapter.components.impl.ComponentsPackageImpl;

import iscadapter.impl.IscadapterPackageImpl;

import iscadapter.resources.ResourcesPackage;

import iscadapter.resources.impl.ResourcesPackageImpl;

import m4md.M4mdPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdapterPackageImpl extends EPackageImpl implements AdapterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAdapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edsCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eCommAPIEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eDataFormatEEnum = null;

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
	 * @see adapter.AdapterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdapterPackageImpl() {
		super(eNS_URI, AdapterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdapterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdapterPackage init() {
		if (isInited) return (AdapterPackage)EPackage.Registry.INSTANCE.getEPackage(AdapterPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdapterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdapterPackageImpl theAdapterPackage = registeredAdapterPackage instanceof AdapterPackageImpl ? (AdapterPackageImpl)registeredAdapterPackage : new AdapterPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DskPackage.eINSTANCE.eClass();
		M4mdPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(IscadapterPackage.eNS_URI);
		IscadapterPackageImpl theIscadapterPackage = (IscadapterPackageImpl)(registeredPackage instanceof IscadapterPackageImpl ? registeredPackage : IscadapterPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(registeredPackage instanceof ComponentsPackageImpl ? registeredPackage : ComponentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(registeredPackage instanceof ResourcesPackageImpl ? registeredPackage : ResourcesPackage.eINSTANCE);

		// Create package meta-data objects
		theAdapterPackage.createPackageContents();
		theIscadapterPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theResourcesPackage.createPackageContents();

		// Initialize created meta-data
		theAdapterPackage.initializePackageContents();
		theIscadapterPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theResourcesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdapterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdapterPackage.eNS_URI, theAdapterPackage);
		return theAdapterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAdapter() {
		return eAdapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAdapter_Name() {
		return (EAttribute)eAdapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAdapter_Comm() {
		return (EReference)eAdapterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAdapter_Resources() {
		return (EReference)eAdapterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAdapter_Components() {
		return (EReference)eAdapterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAdapter_Dscs() {
		return (EReference)eAdapterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAdapter_Entity() {
		return (EReference)eAdapterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECommunication() {
		return eCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECommunication_Api() {
		return (EAttribute)eCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECommunication_Target() {
		return (EReference)eCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECommunication_DataSupported() {
		return (EAttribute)eCommunicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEResource() {
		return eResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEResource_Name() {
		return (EAttribute)eResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEComponent() {
		return eComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEComponent_Name() {
		return (EAttribute)eComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEData() {
		return eDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEntity() {
		return eEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDSCmd() {
		return edsCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getECommAPI() {
		return eCommAPIEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEDataFormat() {
		return eDataFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterFactory getAdapterFactory() {
		return (AdapterFactory)getEFactoryInstance();
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
		eAdapterEClass = createEClass(EADAPTER);
		createEAttribute(eAdapterEClass, EADAPTER__NAME);
		createEReference(eAdapterEClass, EADAPTER__COMM);
		createEReference(eAdapterEClass, EADAPTER__RESOURCES);
		createEReference(eAdapterEClass, EADAPTER__COMPONENTS);
		createEReference(eAdapterEClass, EADAPTER__DSCS);
		createEReference(eAdapterEClass, EADAPTER__ENTITY);

		eCommunicationEClass = createEClass(ECOMMUNICATION);
		createEAttribute(eCommunicationEClass, ECOMMUNICATION__API);
		createEReference(eCommunicationEClass, ECOMMUNICATION__TARGET);
		createEAttribute(eCommunicationEClass, ECOMMUNICATION__DATA_SUPPORTED);

		eResourceEClass = createEClass(ERESOURCE);
		createEAttribute(eResourceEClass, ERESOURCE__NAME);

		eComponentEClass = createEClass(ECOMPONENT);
		createEAttribute(eComponentEClass, ECOMPONENT__NAME);

		eDataEClass = createEClass(EDATA);

		eEntityEClass = createEClass(EENTITY);

		edsCmdEClass = createEClass(EDS_CMD);

		// Create enums
		eCommAPIEEnum = createEEnum(ECOMM_API);
		eDataFormatEEnum = createEEnum(EDATA_FORMAT);
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
		DskPackage theDskPackage = (DskPackage)EPackage.Registry.INSTANCE.getEPackage(DskPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eEntityEClass.getESuperTypes().add(theDskPackage.getEDSEntity());
		edsCmdEClass.getESuperTypes().add(theDskPackage.getEDSC());

		// Initialize classes, features, and operations; add parameters
		initEClass(eAdapterEClass, EAdapter.class, "EAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAdapter_Name(), ecorePackage.getEString(), "name", null, 0, 1, EAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAdapter_Comm(), this.getECommunication(), null, "comm", null, 1, -1, EAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAdapter_Resources(), this.getEResource(), null, "resources", null, 1, -1, EAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAdapter_Components(), this.getEComponent(), null, "components", null, 0, -1, EAdapter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAdapter_Dscs(), this.getEDSCmd(), null, "dscs", null, 0, -1, EAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAdapter_Entity(), this.getEEntity(), null, "entity", null, 0, -1, EAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eCommunicationEClass, ECommunication.class, "ECommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getECommunication_Api(), this.getECommAPI(), "api", null, 0, 1, ECommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getECommunication_Target(), this.getEComponent(), null, "target", null, 0, -1, ECommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getECommunication_DataSupported(), this.getEDataFormat(), "dataSupported", null, 0, 1, ECommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eResourceEClass, EResource.class, "EResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, EResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eComponentEClass, EComponent.class, "EComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, EComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDataEClass, EData.class, "EData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eEntityEClass, EEntity.class, "EEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edsCmdEClass, EDSCmd.class, "EDSCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(eCommAPIEEnum, ECommAPI.class, "ECommAPI");
		addEEnumLiteral(eCommAPIEEnum, ECommAPI.REST);
		addEEnumLiteral(eCommAPIEEnum, ECommAPI.GRAPHQL);
		addEEnumLiteral(eCommAPIEEnum, ECommAPI.GRPC);
		addEEnumLiteral(eCommAPIEEnum, ECommAPI.WEBHOOKS);

		initEEnum(eDataFormatEEnum, EDataFormat.class, "EDataFormat");
		addEEnumLiteral(eDataFormatEEnum, EDataFormat.JSON);
		addEEnumLiteral(eDataFormatEEnum, EDataFormat.XML);
		addEEnumLiteral(eDataFormatEEnum, EDataFormat.TXT);
		addEEnumLiteral(eDataFormatEEnum, EDataFormat.XDR);

		// Create resource
		createResource(eNS_URI);
	}

} //AdapterPackageImpl
