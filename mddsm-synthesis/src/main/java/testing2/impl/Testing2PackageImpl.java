/**
 */
package testing2.impl;

import m4md.M4mdPackage;

import m4md.impl.M4mdPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import testing2.ClassActor;
import testing2.ClassCommand;
import testing2.ClassItem;
import testing2.ClassType;
import testing2.CmdType;
import testing2.Testing2Factory;
import testing2.Testing2Package;
import testing2.TestingCS;
import testing2.TestingDS;
import testing2.TestingSchema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Testing2PackageImpl extends EPackageImpl implements Testing2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testingSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testingCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testingDSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmdTypeEEnum = null;

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
	 * @see testing2.Testing2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Testing2PackageImpl() {
		super(eNS_URI, Testing2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Testing2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Testing2Package init() {
		if (isInited) return (Testing2Package)EPackage.Registry.INSTANCE.getEPackage(Testing2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredTesting2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Testing2PackageImpl theTesting2Package = registeredTesting2Package instanceof Testing2PackageImpl ? (Testing2PackageImpl)registeredTesting2Package : new Testing2PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(M4mdPackage.eNS_URI);
		M4mdPackageImpl theM4mdPackage = (M4mdPackageImpl)(registeredPackage instanceof M4mdPackageImpl ? registeredPackage : M4mdPackage.eINSTANCE);

		// Create package meta-data objects
		theTesting2Package.createPackageContents();
		theM4mdPackage.createPackageContents();

		// Initialize created meta-data
		theTesting2Package.initializePackageContents();
		theM4mdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTesting2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Testing2Package.eNS_URI, theTesting2Package);
		return theTesting2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestingSchema() {
		return testingSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestingSchema_Id() {
		return (EAttribute)testingSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestingCS() {
		return testingCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestingCS_CsId() {
		return (EAttribute)testingCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestingDS() {
		return testingDSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestingDS_DsId() {
		return (EAttribute)testingDSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassType() {
		return classTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassType_TypeName() {
		return (EAttribute)classTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassItem() {
		return classItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassItem_Name() {
		return (EAttribute)classItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassActor() {
		return classActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassActor_Name() {
		return (EAttribute)classActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassCommand() {
		return classCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassCommand_Cmd() {
		return (EAttribute)classCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCmdType() {
		return cmdTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Testing2Factory getTesting2Factory() {
		return (Testing2Factory)getEFactoryInstance();
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
		testingSchemaEClass = createEClass(TESTING_SCHEMA);
		createEAttribute(testingSchemaEClass, TESTING_SCHEMA__ID);

		testingCSEClass = createEClass(TESTING_CS);
		createEAttribute(testingCSEClass, TESTING_CS__CS_ID);

		testingDSEClass = createEClass(TESTING_DS);
		createEAttribute(testingDSEClass, TESTING_DS__DS_ID);

		classTypeEClass = createEClass(CLASS_TYPE);
		createEAttribute(classTypeEClass, CLASS_TYPE__TYPE_NAME);

		classItemEClass = createEClass(CLASS_ITEM);
		createEAttribute(classItemEClass, CLASS_ITEM__NAME);

		classActorEClass = createEClass(CLASS_ACTOR);
		createEAttribute(classActorEClass, CLASS_ACTOR__NAME);

		classCommandEClass = createEClass(CLASS_COMMAND);
		createEAttribute(classCommandEClass, CLASS_COMMAND__CMD);

		// Create enums
		cmdTypeEEnum = createEEnum(CMD_TYPE);
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
		M4mdPackage theM4mdPackage = (M4mdPackage)EPackage.Registry.INSTANCE.getEPackage(M4mdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		testingSchemaEClass.getESuperTypes().add(theM4mdPackage.getEDomainSchema());
		testingCSEClass.getESuperTypes().add(theM4mdPackage.getEControlSchema());
		testingDSEClass.getESuperTypes().add(theM4mdPackage.getEDataSchema());
		classTypeEClass.getESuperTypes().add(theM4mdPackage.getEDomainSpecificType());
		classItemEClass.getESuperTypes().add(theM4mdPackage.getEItem());
		classActorEClass.getESuperTypes().add(theM4mdPackage.getEActor());
		classCommandEClass.getESuperTypes().add(theM4mdPackage.getEDomainSpecificCommand());

		// Initialize classes, features, and operations; add parameters
		initEClass(testingSchemaEClass, TestingSchema.class, "TestingSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestingSchema_Id(), ecorePackage.getEInt(), "id", null, 0, 1, TestingSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testingCSEClass, TestingCS.class, "TestingCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestingCS_CsId(), ecorePackage.getEInt(), "csId", null, 0, 1, TestingCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testingDSEClass, TestingDS.class, "TestingDS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestingDS_DsId(), ecorePackage.getEInt(), "dsId", null, 0, 1, TestingDS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classTypeEClass, ClassType.class, "ClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, ClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classItemEClass, ClassItem.class, "ClassItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classActorEClass, ClassActor.class, "ClassActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassActor_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classCommandEClass, ClassCommand.class, "ClassCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassCommand_Cmd(), this.getCmdType(), "cmd", null, 0, -1, ClassCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cmdTypeEEnum, CmdType.class, "CmdType");
		addEEnumLiteral(cmdTypeEEnum, CmdType.START_DEVICE);
		addEEnumLiteral(cmdTypeEEnum, CmdType.STOP_DEVICE);
		addEEnumLiteral(cmdTypeEEnum, CmdType.VERIFY_STATUS);
		addEEnumLiteral(cmdTypeEEnum, CmdType.TEST_DEVICE);
		addEEnumLiteral(cmdTypeEEnum, CmdType.SET_WAIT_MODE);

		// Create resource
		createResource(eNS_URI);
	}

} //Testing2PackageImpl
