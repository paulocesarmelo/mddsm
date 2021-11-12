/**
 */
package m4md;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see m4md.M4mdFactory
 * @model kind="package"
 * @generated
 */
public interface M4mdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "m4md";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/m4md";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "m4md";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	M4mdPackage eINSTANCE = m4md.impl.M4mdPackageImpl.init();

	/**
	 * The meta object id for the '{@link m4md.impl.EDomainSchemaImpl <em>EDomain Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4md.impl.EDomainSchemaImpl
	 * @see m4md.impl.M4mdPackageImpl#getEDomainSchema()
	 * @generated
	 */
	int EDOMAIN_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Cs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SCHEMA__CS = 0;

	/**
	 * The feature id for the '<em><b>Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SCHEMA__DS = 1;

	/**
	 * The number of structural features of the '<em>EDomain Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EDomain Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m4md.impl.EControlSchemaImpl <em>EControl Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4md.impl.EControlSchemaImpl
	 * @see m4md.impl.M4mdPackageImpl#getEControlSchema()
	 * @generated
	 */
	int ECONTROL_SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL_SCHEMA__ACTOR = 0;

	/**
	 * The number of structural features of the '<em>EControl Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL_SCHEMA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EControl Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONTROL_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m4md.impl.EDataSchemaImpl <em>EData Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4md.impl.EDataSchemaImpl
	 * @see m4md.impl.M4mdPackageImpl#getEDataSchema()
	 * @generated
	 */
	int EDATA_SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Cs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_SCHEMA__CS = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_SCHEMA__ITEM = 1;

	/**
	 * The number of structural features of the '<em>EData Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EData Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m4md.impl.EDomainSpecificEntityImpl <em>EDomain Specific Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4md.impl.EDomainSpecificEntityImpl
	 * @see m4md.impl.M4mdPackageImpl#getEDomainSpecificEntity()
	 * @generated
	 */
	int EDOMAIN_SPECIFIC_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ENTITY__COMMAND_PRIORITY = 0;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ENTITY__CMD = 1;

	/**
	 * The number of structural features of the '<em>EDomain Specific Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EDomain Specific Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m4md.impl.EDomainSpecificCommandImpl <em>EDomain Specific Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4md.impl.EDomainSpecificCommandImpl
	 * @see m4md.impl.M4mdPackageImpl#getEDomainSpecificCommand()
	 * @generated
	 */
	int EDOMAIN_SPECIFIC_COMMAND = 4;

	/**
	 * The feature id for the '<em><b>Cmd Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_COMMAND__CMD_ID = 0;

	/**
	 * The number of structural features of the '<em>EDomain Specific Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_COMMAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EDomain Specific Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m4md.impl.EActorImpl <em>EActor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4md.impl.EActorImpl
	 * @see m4md.impl.M4mdPackageImpl#getEActor()
	 * @generated
	 */
	int EACTOR = 5;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__COMMAND_PRIORITY = EDOMAIN_SPECIFIC_ENTITY__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__CMD = EDOMAIN_SPECIFIC_ENTITY__CMD;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__KIND_INTERACTION = EDOMAIN_SPECIFIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types Controlled</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR__TYPES_CONTROLLED = EDOMAIN_SPECIFIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EActor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR_FEATURE_COUNT = EDOMAIN_SPECIFIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EActor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EACTOR_OPERATION_COUNT = EDOMAIN_SPECIFIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link m4md.impl.EItemImpl <em>EItem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4md.impl.EItemImpl
	 * @see m4md.impl.M4mdPackageImpl#getEItem()
	 * @generated
	 */
	int EITEM = 6;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__COMMAND_PRIORITY = EDOMAIN_SPECIFIC_ENTITY__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__CMD = EDOMAIN_SPECIFIC_ENTITY__CMD;

	/**
	 * The feature id for the '<em><b>Arising Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__ARISING_BEHAVIOR = EDOMAIN_SPECIFIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM__TYPE = EDOMAIN_SPECIFIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EItem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM_FEATURE_COUNT = EDOMAIN_SPECIFIC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EItem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EITEM_OPERATION_COUNT = EDOMAIN_SPECIFIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link m4md.impl.EDomainSpecificTypeImpl <em>EDomain Specific Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4md.impl.EDomainSpecificTypeImpl
	 * @see m4md.impl.M4mdPackageImpl#getEDomainSpecificType()
	 * @generated
	 */
	int EDOMAIN_SPECIFIC_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE__CARDINALITY = 1;

	/**
	 * The number of structural features of the '<em>EDomain Specific Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EDomain Specific Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDOMAIN_SPECIFIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m4md.EArising <em>EArising</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4md.EArising
	 * @see m4md.impl.M4mdPackageImpl#getEArising()
	 * @generated
	 */
	int EARISING = 8;

	/**
	 * The meta object id for the '{@link m4md.ECardinality <em>ECardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4md.ECardinality
	 * @see m4md.impl.M4mdPackageImpl#getECardinality()
	 * @generated
	 */
	int ECARDINALITY = 9;

	/**
	 * The meta object id for the '{@link m4md.EInteractionBehavior <em>EInteraction Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4md.EInteractionBehavior
	 * @see m4md.impl.M4mdPackageImpl#getEInteractionBehavior()
	 * @generated
	 */
	int EINTERACTION_BEHAVIOR = 10;

	/**
	 * The meta object id for the '{@link m4md.ECoordinationBehavior <em>ECoordination Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4md.ECoordinationBehavior
	 * @see m4md.impl.M4mdPackageImpl#getECoordinationBehavior()
	 * @generated
	 */
	int ECOORDINATION_BEHAVIOR = 11;


	/**
	 * Returns the meta object for class '{@link m4md.EDomainSchema <em>EDomain Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDomain Schema</em>'.
	 * @see m4md.EDomainSchema
	 * @generated
	 */
	EClass getEDomainSchema();

	/**
	 * Returns the meta object for the containment reference '{@link m4md.EDomainSchema#getCs <em>Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cs</em>'.
	 * @see m4md.EDomainSchema#getCs()
	 * @see #getEDomainSchema()
	 * @generated
	 */
	EReference getEDomainSchema_Cs();

	/**
	 * Returns the meta object for the containment reference '{@link m4md.EDomainSchema#getDs <em>Ds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ds</em>'.
	 * @see m4md.EDomainSchema#getDs()
	 * @see #getEDomainSchema()
	 * @generated
	 */
	EReference getEDomainSchema_Ds();

	/**
	 * Returns the meta object for class '{@link m4md.EControlSchema <em>EControl Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EControl Schema</em>'.
	 * @see m4md.EControlSchema
	 * @generated
	 */
	EClass getEControlSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link m4md.EControlSchema#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see m4md.EControlSchema#getActor()
	 * @see #getEControlSchema()
	 * @generated
	 */
	EReference getEControlSchema_Actor();

	/**
	 * Returns the meta object for class '{@link m4md.EDataSchema <em>EData Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EData Schema</em>'.
	 * @see m4md.EDataSchema
	 * @generated
	 */
	EClass getEDataSchema();

	/**
	 * Returns the meta object for the reference '{@link m4md.EDataSchema#getCs <em>Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cs</em>'.
	 * @see m4md.EDataSchema#getCs()
	 * @see #getEDataSchema()
	 * @generated
	 */
	EReference getEDataSchema_Cs();

	/**
	 * Returns the meta object for the containment reference list '{@link m4md.EDataSchema#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see m4md.EDataSchema#getItem()
	 * @see #getEDataSchema()
	 * @generated
	 */
	EReference getEDataSchema_Item();

	/**
	 * Returns the meta object for class '{@link m4md.EDomainSpecificEntity <em>EDomain Specific Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDomain Specific Entity</em>'.
	 * @see m4md.EDomainSpecificEntity
	 * @generated
	 */
	EClass getEDomainSpecificEntity();

	/**
	 * Returns the meta object for the attribute '{@link m4md.EDomainSpecificEntity#getCommandPriority <em>Command Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Priority</em>'.
	 * @see m4md.EDomainSpecificEntity#getCommandPriority()
	 * @see #getEDomainSpecificEntity()
	 * @generated
	 */
	EAttribute getEDomainSpecificEntity_CommandPriority();

	/**
	 * Returns the meta object for the containment reference list '{@link m4md.EDomainSpecificEntity#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmd</em>'.
	 * @see m4md.EDomainSpecificEntity#getCmd()
	 * @see #getEDomainSpecificEntity()
	 * @generated
	 */
	EReference getEDomainSpecificEntity_Cmd();

	/**
	 * Returns the meta object for class '{@link m4md.EDomainSpecificCommand <em>EDomain Specific Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDomain Specific Command</em>'.
	 * @see m4md.EDomainSpecificCommand
	 * @generated
	 */
	EClass getEDomainSpecificCommand();

	/**
	 * Returns the meta object for the attribute '{@link m4md.EDomainSpecificCommand#getCmdId <em>Cmd Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd Id</em>'.
	 * @see m4md.EDomainSpecificCommand#getCmdId()
	 * @see #getEDomainSpecificCommand()
	 * @generated
	 */
	EAttribute getEDomainSpecificCommand_CmdId();

	/**
	 * Returns the meta object for class '{@link m4md.EActor <em>EActor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EActor</em>'.
	 * @see m4md.EActor
	 * @generated
	 */
	EClass getEActor();

	/**
	 * Returns the meta object for the attribute '{@link m4md.EActor#getKindInteraction <em>Kind Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Interaction</em>'.
	 * @see m4md.EActor#getKindInteraction()
	 * @see #getEActor()
	 * @generated
	 */
	EAttribute getEActor_KindInteraction();

	/**
	 * Returns the meta object for the containment reference list '{@link m4md.EActor#getTypesControlled <em>Types Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types Controlled</em>'.
	 * @see m4md.EActor#getTypesControlled()
	 * @see #getEActor()
	 * @generated
	 */
	EReference getEActor_TypesControlled();

	/**
	 * Returns the meta object for class '{@link m4md.EItem <em>EItem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EItem</em>'.
	 * @see m4md.EItem
	 * @generated
	 */
	EClass getEItem();

	/**
	 * Returns the meta object for the attribute '{@link m4md.EItem#getArisingBehavior <em>Arising Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arising Behavior</em>'.
	 * @see m4md.EItem#getArisingBehavior()
	 * @see #getEItem()
	 * @generated
	 */
	EAttribute getEItem_ArisingBehavior();

	/**
	 * Returns the meta object for the reference '{@link m4md.EItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see m4md.EItem#getType()
	 * @see #getEItem()
	 * @generated
	 */
	EReference getEItem_Type();

	/**
	 * Returns the meta object for class '{@link m4md.EDomainSpecificType <em>EDomain Specific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDomain Specific Type</em>'.
	 * @see m4md.EDomainSpecificType
	 * @generated
	 */
	EClass getEDomainSpecificType();

	/**
	 * Returns the meta object for the attribute '{@link m4md.EDomainSpecificType#getInteractionBehavior <em>Interaction Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interaction Behavior</em>'.
	 * @see m4md.EDomainSpecificType#getInteractionBehavior()
	 * @see #getEDomainSpecificType()
	 * @generated
	 */
	EAttribute getEDomainSpecificType_InteractionBehavior();

	/**
	 * Returns the meta object for the attribute '{@link m4md.EDomainSpecificType#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see m4md.EDomainSpecificType#getCardinality()
	 * @see #getEDomainSpecificType()
	 * @generated
	 */
	EAttribute getEDomainSpecificType_Cardinality();

	/**
	 * Returns the meta object for enum '{@link m4md.EArising <em>EArising</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EArising</em>'.
	 * @see m4md.EArising
	 * @generated
	 */
	EEnum getEArising();

	/**
	 * Returns the meta object for enum '{@link m4md.ECardinality <em>ECardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ECardinality</em>'.
	 * @see m4md.ECardinality
	 * @generated
	 */
	EEnum getECardinality();

	/**
	 * Returns the meta object for enum '{@link m4md.EInteractionBehavior <em>EInteraction Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EInteraction Behavior</em>'.
	 * @see m4md.EInteractionBehavior
	 * @generated
	 */
	EEnum getEInteractionBehavior();

	/**
	 * Returns the meta object for enum '{@link m4md.ECoordinationBehavior <em>ECoordination Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ECoordination Behavior</em>'.
	 * @see m4md.ECoordinationBehavior
	 * @generated
	 */
	EEnum getECoordinationBehavior();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	M4mdFactory getM4mdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link m4md.impl.EDomainSchemaImpl <em>EDomain Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4md.impl.EDomainSchemaImpl
		 * @see m4md.impl.M4mdPackageImpl#getEDomainSchema()
		 * @generated
		 */
		EClass EDOMAIN_SCHEMA = eINSTANCE.getEDomainSchema();

		/**
		 * The meta object literal for the '<em><b>Cs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDOMAIN_SCHEMA__CS = eINSTANCE.getEDomainSchema_Cs();

		/**
		 * The meta object literal for the '<em><b>Ds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDOMAIN_SCHEMA__DS = eINSTANCE.getEDomainSchema_Ds();

		/**
		 * The meta object literal for the '{@link m4md.impl.EControlSchemaImpl <em>EControl Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4md.impl.EControlSchemaImpl
		 * @see m4md.impl.M4mdPackageImpl#getEControlSchema()
		 * @generated
		 */
		EClass ECONTROL_SCHEMA = eINSTANCE.getEControlSchema();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECONTROL_SCHEMA__ACTOR = eINSTANCE.getEControlSchema_Actor();

		/**
		 * The meta object literal for the '{@link m4md.impl.EDataSchemaImpl <em>EData Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4md.impl.EDataSchemaImpl
		 * @see m4md.impl.M4mdPackageImpl#getEDataSchema()
		 * @generated
		 */
		EClass EDATA_SCHEMA = eINSTANCE.getEDataSchema();

		/**
		 * The meta object literal for the '<em><b>Cs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDATA_SCHEMA__CS = eINSTANCE.getEDataSchema_Cs();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDATA_SCHEMA__ITEM = eINSTANCE.getEDataSchema_Item();

		/**
		 * The meta object literal for the '{@link m4md.impl.EDomainSpecificEntityImpl <em>EDomain Specific Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4md.impl.EDomainSpecificEntityImpl
		 * @see m4md.impl.M4mdPackageImpl#getEDomainSpecificEntity()
		 * @generated
		 */
		EClass EDOMAIN_SPECIFIC_ENTITY = eINSTANCE.getEDomainSpecificEntity();

		/**
		 * The meta object literal for the '<em><b>Command Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDOMAIN_SPECIFIC_ENTITY__COMMAND_PRIORITY = eINSTANCE.getEDomainSpecificEntity_CommandPriority();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDOMAIN_SPECIFIC_ENTITY__CMD = eINSTANCE.getEDomainSpecificEntity_Cmd();

		/**
		 * The meta object literal for the '{@link m4md.impl.EDomainSpecificCommandImpl <em>EDomain Specific Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4md.impl.EDomainSpecificCommandImpl
		 * @see m4md.impl.M4mdPackageImpl#getEDomainSpecificCommand()
		 * @generated
		 */
		EClass EDOMAIN_SPECIFIC_COMMAND = eINSTANCE.getEDomainSpecificCommand();

		/**
		 * The meta object literal for the '<em><b>Cmd Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDOMAIN_SPECIFIC_COMMAND__CMD_ID = eINSTANCE.getEDomainSpecificCommand_CmdId();

		/**
		 * The meta object literal for the '{@link m4md.impl.EActorImpl <em>EActor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4md.impl.EActorImpl
		 * @see m4md.impl.M4mdPackageImpl#getEActor()
		 * @generated
		 */
		EClass EACTOR = eINSTANCE.getEActor();

		/**
		 * The meta object literal for the '<em><b>Kind Interaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EACTOR__KIND_INTERACTION = eINSTANCE.getEActor_KindInteraction();

		/**
		 * The meta object literal for the '<em><b>Types Controlled</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EACTOR__TYPES_CONTROLLED = eINSTANCE.getEActor_TypesControlled();

		/**
		 * The meta object literal for the '{@link m4md.impl.EItemImpl <em>EItem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4md.impl.EItemImpl
		 * @see m4md.impl.M4mdPackageImpl#getEItem()
		 * @generated
		 */
		EClass EITEM = eINSTANCE.getEItem();

		/**
		 * The meta object literal for the '<em><b>Arising Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EITEM__ARISING_BEHAVIOR = eINSTANCE.getEItem_ArisingBehavior();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EITEM__TYPE = eINSTANCE.getEItem_Type();

		/**
		 * The meta object literal for the '{@link m4md.impl.EDomainSpecificTypeImpl <em>EDomain Specific Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4md.impl.EDomainSpecificTypeImpl
		 * @see m4md.impl.M4mdPackageImpl#getEDomainSpecificType()
		 * @generated
		 */
		EClass EDOMAIN_SPECIFIC_TYPE = eINSTANCE.getEDomainSpecificType();

		/**
		 * The meta object literal for the '<em><b>Interaction Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR = eINSTANCE.getEDomainSpecificType_InteractionBehavior();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDOMAIN_SPECIFIC_TYPE__CARDINALITY = eINSTANCE.getEDomainSpecificType_Cardinality();

		/**
		 * The meta object literal for the '{@link m4md.EArising <em>EArising</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4md.EArising
		 * @see m4md.impl.M4mdPackageImpl#getEArising()
		 * @generated
		 */
		EEnum EARISING = eINSTANCE.getEArising();

		/**
		 * The meta object literal for the '{@link m4md.ECardinality <em>ECardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4md.ECardinality
		 * @see m4md.impl.M4mdPackageImpl#getECardinality()
		 * @generated
		 */
		EEnum ECARDINALITY = eINSTANCE.getECardinality();

		/**
		 * The meta object literal for the '{@link m4md.EInteractionBehavior <em>EInteraction Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4md.EInteractionBehavior
		 * @see m4md.impl.M4mdPackageImpl#getEInteractionBehavior()
		 * @generated
		 */
		EEnum EINTERACTION_BEHAVIOR = eINSTANCE.getEInteractionBehavior();

		/**
		 * The meta object literal for the '{@link m4md.ECoordinationBehavior <em>ECoordination Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4md.ECoordinationBehavior
		 * @see m4md.impl.M4mdPackageImpl#getECoordinationBehavior()
		 * @generated
		 */
		EEnum ECOORDINATION_BEHAVIOR = eINSTANCE.getECoordinationBehavior();

	}

} //M4mdPackage
