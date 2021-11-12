/**
 */
package m4md.impl;

import m4md.EActor;
import m4md.EArising;
import m4md.ECardinality;
import m4md.EControlSchema;
import m4md.ECoordinationBehavior;
import m4md.EDataSchema;
import m4md.EDomainSchema;
import m4md.EDomainSpecificCommand;
import m4md.EDomainSpecificEntity;
import m4md.EDomainSpecificType;
import m4md.EInteractionBehavior;
import m4md.EItem;
import m4md.M4mdFactory;
import m4md.M4mdPackage;

import mgridml.MgridmlPackage;

import mgridml.impl.MgridmlPackageImpl;

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
public class M4mdPackageImpl extends EPackageImpl implements M4mdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDomainSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eControlSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDataSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDomainSpecificEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDomainSpecificCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDomainSpecificTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eArisingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eCardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eInteractionBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eCoordinationBehaviorEEnum = null;

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
	 * @see m4md.M4mdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private M4mdPackageImpl() {
		super(eNS_URI, M4mdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link M4mdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static M4mdPackage init() {
		if (isInited) return (M4mdPackage)EPackage.Registry.INSTANCE.getEPackage(M4mdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredM4mdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		M4mdPackageImpl theM4mdPackage = registeredM4mdPackage instanceof M4mdPackageImpl ? (M4mdPackageImpl)registeredM4mdPackage : new M4mdPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MgridmlPackage.eNS_URI);
		MgridmlPackageImpl theMgridmlPackage = (MgridmlPackageImpl)(registeredPackage instanceof MgridmlPackageImpl ? registeredPackage : MgridmlPackage.eINSTANCE);

		// Create package meta-data objects
		theM4mdPackage.createPackageContents();
		theMgridmlPackage.createPackageContents();

		// Initialize created meta-data
		theM4mdPackage.initializePackageContents();
		theMgridmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theM4mdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(M4mdPackage.eNS_URI, theM4mdPackage);
		return theM4mdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDomainSchema() {
		return eDomainSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDomainSchema_Cs() {
		return (EReference)eDomainSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDomainSchema_Ds() {
		return (EReference)eDomainSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEControlSchema() {
		return eControlSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEControlSchema_Actor() {
		return (EReference)eControlSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDataSchema() {
		return eDataSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDataSchema_Cs() {
		return (EReference)eDataSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDataSchema_Item() {
		return (EReference)eDataSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDomainSpecificEntity() {
		return eDomainSpecificEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDomainSpecificEntity_CommandPriority() {
		return (EAttribute)eDomainSpecificEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEDomainSpecificEntity_Cmd() {
		return (EReference)eDomainSpecificEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDomainSpecificCommand() {
		return eDomainSpecificCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDomainSpecificCommand_CmdId() {
		return (EAttribute)eDomainSpecificCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEActor() {
		return eActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEActor_KindInteraction() {
		return (EAttribute)eActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEActor_TypesControlled() {
		return (EReference)eActorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEItem() {
		return eItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEItem_ArisingBehavior() {
		return (EAttribute)eItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEItem_Type() {
		return (EReference)eItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDomainSpecificType() {
		return eDomainSpecificTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDomainSpecificType_InteractionBehavior() {
		return (EAttribute)eDomainSpecificTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDomainSpecificType_Cardinality() {
		return (EAttribute)eDomainSpecificTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEArising() {
		return eArisingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getECardinality() {
		return eCardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEInteractionBehavior() {
		return eInteractionBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getECoordinationBehavior() {
		return eCoordinationBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M4mdFactory getM4mdFactory() {
		return (M4mdFactory)getEFactoryInstance();
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
		eDomainSchemaEClass = createEClass(EDOMAIN_SCHEMA);
		createEReference(eDomainSchemaEClass, EDOMAIN_SCHEMA__CS);
		createEReference(eDomainSchemaEClass, EDOMAIN_SCHEMA__DS);

		eControlSchemaEClass = createEClass(ECONTROL_SCHEMA);
		createEReference(eControlSchemaEClass, ECONTROL_SCHEMA__ACTOR);

		eDataSchemaEClass = createEClass(EDATA_SCHEMA);
		createEReference(eDataSchemaEClass, EDATA_SCHEMA__CS);
		createEReference(eDataSchemaEClass, EDATA_SCHEMA__ITEM);

		eDomainSpecificEntityEClass = createEClass(EDOMAIN_SPECIFIC_ENTITY);
		createEAttribute(eDomainSpecificEntityEClass, EDOMAIN_SPECIFIC_ENTITY__COMMAND_PRIORITY);
		createEReference(eDomainSpecificEntityEClass, EDOMAIN_SPECIFIC_ENTITY__CMD);

		eDomainSpecificCommandEClass = createEClass(EDOMAIN_SPECIFIC_COMMAND);
		createEAttribute(eDomainSpecificCommandEClass, EDOMAIN_SPECIFIC_COMMAND__CMD_ID);

		eActorEClass = createEClass(EACTOR);
		createEAttribute(eActorEClass, EACTOR__KIND_INTERACTION);
		createEReference(eActorEClass, EACTOR__TYPES_CONTROLLED);

		eItemEClass = createEClass(EITEM);
		createEAttribute(eItemEClass, EITEM__ARISING_BEHAVIOR);
		createEReference(eItemEClass, EITEM__TYPE);

		eDomainSpecificTypeEClass = createEClass(EDOMAIN_SPECIFIC_TYPE);
		createEAttribute(eDomainSpecificTypeEClass, EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR);
		createEAttribute(eDomainSpecificTypeEClass, EDOMAIN_SPECIFIC_TYPE__CARDINALITY);

		// Create enums
		eArisingEEnum = createEEnum(EARISING);
		eCardinalityEEnum = createEEnum(ECARDINALITY);
		eInteractionBehaviorEEnum = createEEnum(EINTERACTION_BEHAVIOR);
		eCoordinationBehaviorEEnum = createEEnum(ECOORDINATION_BEHAVIOR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eActorEClass.getESuperTypes().add(this.getEDomainSpecificEntity());
		eItemEClass.getESuperTypes().add(this.getEDomainSpecificEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(eDomainSchemaEClass, EDomainSchema.class, "EDomainSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDomainSchema_Cs(), this.getEControlSchema(), null, "cs", null, 0, 1, EDomainSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDomainSchema_Ds(), this.getEDataSchema(), null, "ds", null, 0, 1, EDomainSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eControlSchemaEClass, EControlSchema.class, "EControlSchema", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEControlSchema_Actor(), this.getEActor(), null, "actor", null, 1, -1, EControlSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDataSchemaEClass, EDataSchema.class, "EDataSchema", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDataSchema_Cs(), this.getEControlSchema(), null, "cs", null, 1, 1, EDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDataSchema_Item(), this.getEItem(), null, "item", null, 1, -1, EDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDomainSpecificEntityEClass, EDomainSpecificEntity.class, "EDomainSpecificEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDomainSpecificEntity_CommandPriority(), ecorePackage.getEInt(), "commandPriority", null, 0, 1, EDomainSpecificEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDomainSpecificEntity_Cmd(), this.getEDomainSpecificCommand(), null, "cmd", null, 0, -1, EDomainSpecificEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDomainSpecificCommandEClass, EDomainSpecificCommand.class, "EDomainSpecificCommand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDomainSpecificCommand_CmdId(), ecorePackage.getEInt(), "cmdId", null, 0, 1, EDomainSpecificCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eActorEClass, EActor.class, "EActor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEActor_KindInteraction(), this.getECoordinationBehavior(), "kindInteraction", null, 0, 1, EActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEActor_TypesControlled(), this.getEDomainSpecificType(), null, "typesControlled", null, 0, -1, EActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eItemEClass, EItem.class, "EItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEItem_ArisingBehavior(), this.getEArising(), "arisingBehavior", null, 0, 1, EItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEItem_Type(), this.getEDomainSpecificType(), null, "type", null, 1, 1, EItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDomainSpecificTypeEClass, EDomainSpecificType.class, "EDomainSpecificType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDomainSpecificType_InteractionBehavior(), this.getEInteractionBehavior(), "interactionBehavior", null, 0, 1, EDomainSpecificType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDomainSpecificType_Cardinality(), this.getECardinality(), "cardinality", null, 0, 1, EDomainSpecificType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eArisingEEnum, EArising.class, "EArising");
		addEEnumLiteral(eArisingEEnum, EArising.STATIC);
		addEEnumLiteral(eArisingEEnum, EArising.DYNAMIC);

		initEEnum(eCardinalityEEnum, ECardinality.class, "ECardinality");
		addEEnumLiteral(eCardinalityEEnum, ECardinality.ONE);
		addEEnumLiteral(eCardinalityEEnum, ECardinality.MANY);

		initEEnum(eInteractionBehaviorEEnum, EInteractionBehavior.class, "EInteractionBehavior");
		addEEnumLiteral(eInteractionBehaviorEEnum, EInteractionBehavior.SYNC);
		addEEnumLiteral(eInteractionBehaviorEEnum, EInteractionBehavior.ASYNC);

		initEEnum(eCoordinationBehaviorEEnum, ECoordinationBehavior.class, "ECoordinationBehavior");
		addEEnumLiteral(eCoordinationBehaviorEEnum, ECoordinationBehavior.LOCAL);
		addEEnumLiteral(eCoordinationBehaviorEEnum, ECoordinationBehavior.DISTRIBUTED);

		// Create resource
		createResource(eNS_URI);
	}

} //M4mdPackageImpl
