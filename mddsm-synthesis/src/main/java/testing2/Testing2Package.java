/**
 */
package testing2;

import m4md.M4mdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see testing2.Testing2Factory
 * @model kind="package"
 * @generated
 */
public interface Testing2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testing2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/m4md/testing2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testing2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Testing2Package eINSTANCE = testing2.impl.Testing2PackageImpl.init();

	/**
	 * The meta object id for the '{@link testing2.impl.TestingSchemaImpl <em>Testing Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing2.impl.TestingSchemaImpl
	 * @see testing2.impl.Testing2PackageImpl#getTestingSchema()
	 * @generated
	 */
	int TESTING_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Cs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SCHEMA__CS = M4mdPackage.EDOMAIN_SCHEMA__CS;

	/**
	 * The feature id for the '<em><b>Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SCHEMA__DS = M4mdPackage.EDOMAIN_SCHEMA__DS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SCHEMA__ID = M4mdPackage.EDOMAIN_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Testing Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SCHEMA_FEATURE_COUNT = M4mdPackage.EDOMAIN_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Testing Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SCHEMA_OPERATION_COUNT = M4mdPackage.EDOMAIN_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testing2.impl.TestingCSImpl <em>Testing CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing2.impl.TestingCSImpl
	 * @see testing2.impl.Testing2PackageImpl#getTestingCS()
	 * @generated
	 */
	int TESTING_CS = 1;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CS__ACTOR = M4mdPackage.ECONTROL_SCHEMA__ACTOR;

	/**
	 * The feature id for the '<em><b>Cs Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CS__CS_ID = M4mdPackage.ECONTROL_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Testing CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CS_FEATURE_COUNT = M4mdPackage.ECONTROL_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Testing CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_CS_OPERATION_COUNT = M4mdPackage.ECONTROL_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testing2.impl.TestingDSImpl <em>Testing DS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing2.impl.TestingDSImpl
	 * @see testing2.impl.Testing2PackageImpl#getTestingDS()
	 * @generated
	 */
	int TESTING_DS = 2;

	/**
	 * The feature id for the '<em><b>Cs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_DS__CS = M4mdPackage.EDATA_SCHEMA__CS;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_DS__ITEM = M4mdPackage.EDATA_SCHEMA__ITEM;

	/**
	 * The feature id for the '<em><b>Ds Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_DS__DS_ID = M4mdPackage.EDATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Testing DS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_DS_FEATURE_COUNT = M4mdPackage.EDATA_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Testing DS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_DS_OPERATION_COUNT = M4mdPackage.EDATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testing2.impl.ClassTypeImpl <em>Class Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing2.impl.ClassTypeImpl
	 * @see testing2.impl.Testing2PackageImpl#getClassType()
	 * @generated
	 */
	int CLASS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__INTERACTION_BEHAVIOR = M4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__CARDINALITY = M4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE__TYPE_NAME = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_FEATURE_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_TYPE_OPERATION_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testing2.impl.ClassItemImpl <em>Class Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing2.impl.ClassItemImpl
	 * @see testing2.impl.Testing2PackageImpl#getClassItem()
	 * @generated
	 */
	int CLASS_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM__COMMAND_PRIORITY = M4mdPackage.EITEM__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM__CMD = M4mdPackage.EITEM__CMD;

	/**
	 * The feature id for the '<em><b>Arising Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM__ARISING_BEHAVIOR = M4mdPackage.EITEM__ARISING_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM__TYPE = M4mdPackage.EITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM__NAME = M4mdPackage.EITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM_FEATURE_COUNT = M4mdPackage.EITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ITEM_OPERATION_COUNT = M4mdPackage.EITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testing2.impl.ClassActorImpl <em>Class Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing2.impl.ClassActorImpl
	 * @see testing2.impl.Testing2PackageImpl#getClassActor()
	 * @generated
	 */
	int CLASS_ACTOR = 5;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR__COMMAND_PRIORITY = M4mdPackage.EACTOR__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR__CMD = M4mdPackage.EACTOR__CMD;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR__KIND_INTERACTION = M4mdPackage.EACTOR__KIND_INTERACTION;

	/**
	 * The feature id for the '<em><b>Types Controlled</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR__TYPES_CONTROLLED = M4mdPackage.EACTOR__TYPES_CONTROLLED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR__NAME = M4mdPackage.EACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR_FEATURE_COUNT = M4mdPackage.EACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ACTOR_OPERATION_COUNT = M4mdPackage.EACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testing2.impl.ClassCommandImpl <em>Class Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing2.impl.ClassCommandImpl
	 * @see testing2.impl.Testing2PackageImpl#getClassCommand()
	 * @generated
	 */
	int CLASS_COMMAND = 6;

	/**
	 * The feature id for the '<em><b>Cmd Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COMMAND__CMD_ID = M4mdPackage.EDOMAIN_SPECIFIC_COMMAND__CMD_ID;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COMMAND__CMD = M4mdPackage.EDOMAIN_SPECIFIC_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COMMAND_FEATURE_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Class Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_COMMAND_OPERATION_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link testing2.CmdType <em>Cmd Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testing2.CmdType
	 * @see testing2.impl.Testing2PackageImpl#getCmdType()
	 * @generated
	 */
	int CMD_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link testing2.TestingSchema <em>Testing Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Schema</em>'.
	 * @see testing2.TestingSchema
	 * @generated
	 */
	EClass getTestingSchema();

	/**
	 * Returns the meta object for the attribute '{@link testing2.TestingSchema#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see testing2.TestingSchema#getId()
	 * @see #getTestingSchema()
	 * @generated
	 */
	EAttribute getTestingSchema_Id();

	/**
	 * Returns the meta object for class '{@link testing2.TestingCS <em>Testing CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing CS</em>'.
	 * @see testing2.TestingCS
	 * @generated
	 */
	EClass getTestingCS();

	/**
	 * Returns the meta object for the attribute '{@link testing2.TestingCS#getCsId <em>Cs Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cs Id</em>'.
	 * @see testing2.TestingCS#getCsId()
	 * @see #getTestingCS()
	 * @generated
	 */
	EAttribute getTestingCS_CsId();

	/**
	 * Returns the meta object for class '{@link testing2.TestingDS <em>Testing DS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing DS</em>'.
	 * @see testing2.TestingDS
	 * @generated
	 */
	EClass getTestingDS();

	/**
	 * Returns the meta object for the attribute '{@link testing2.TestingDS#getDsId <em>Ds Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ds Id</em>'.
	 * @see testing2.TestingDS#getDsId()
	 * @see #getTestingDS()
	 * @generated
	 */
	EAttribute getTestingDS_DsId();

	/**
	 * Returns the meta object for class '{@link testing2.ClassType <em>Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Type</em>'.
	 * @see testing2.ClassType
	 * @generated
	 */
	EClass getClassType();

	/**
	 * Returns the meta object for the attribute '{@link testing2.ClassType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see testing2.ClassType#getTypeName()
	 * @see #getClassType()
	 * @generated
	 */
	EAttribute getClassType_TypeName();

	/**
	 * Returns the meta object for class '{@link testing2.ClassItem <em>Class Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Item</em>'.
	 * @see testing2.ClassItem
	 * @generated
	 */
	EClass getClassItem();

	/**
	 * Returns the meta object for the attribute '{@link testing2.ClassItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testing2.ClassItem#getName()
	 * @see #getClassItem()
	 * @generated
	 */
	EAttribute getClassItem_Name();

	/**
	 * Returns the meta object for class '{@link testing2.ClassActor <em>Class Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Actor</em>'.
	 * @see testing2.ClassActor
	 * @generated
	 */
	EClass getClassActor();

	/**
	 * Returns the meta object for the attribute '{@link testing2.ClassActor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testing2.ClassActor#getName()
	 * @see #getClassActor()
	 * @generated
	 */
	EAttribute getClassActor_Name();

	/**
	 * Returns the meta object for class '{@link testing2.ClassCommand <em>Class Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Command</em>'.
	 * @see testing2.ClassCommand
	 * @generated
	 */
	EClass getClassCommand();

	/**
	 * Returns the meta object for the attribute list '{@link testing2.ClassCommand#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cmd</em>'.
	 * @see testing2.ClassCommand#getCmd()
	 * @see #getClassCommand()
	 * @generated
	 */
	EAttribute getClassCommand_Cmd();

	/**
	 * Returns the meta object for enum '{@link testing2.CmdType <em>Cmd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cmd Type</em>'.
	 * @see testing2.CmdType
	 * @generated
	 */
	EEnum getCmdType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Testing2Factory getTesting2Factory();

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
		 * The meta object literal for the '{@link testing2.impl.TestingSchemaImpl <em>Testing Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing2.impl.TestingSchemaImpl
		 * @see testing2.impl.Testing2PackageImpl#getTestingSchema()
		 * @generated
		 */
		EClass TESTING_SCHEMA = eINSTANCE.getTestingSchema();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_SCHEMA__ID = eINSTANCE.getTestingSchema_Id();

		/**
		 * The meta object literal for the '{@link testing2.impl.TestingCSImpl <em>Testing CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing2.impl.TestingCSImpl
		 * @see testing2.impl.Testing2PackageImpl#getTestingCS()
		 * @generated
		 */
		EClass TESTING_CS = eINSTANCE.getTestingCS();

		/**
		 * The meta object literal for the '<em><b>Cs Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_CS__CS_ID = eINSTANCE.getTestingCS_CsId();

		/**
		 * The meta object literal for the '{@link testing2.impl.TestingDSImpl <em>Testing DS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing2.impl.TestingDSImpl
		 * @see testing2.impl.Testing2PackageImpl#getTestingDS()
		 * @generated
		 */
		EClass TESTING_DS = eINSTANCE.getTestingDS();

		/**
		 * The meta object literal for the '<em><b>Ds Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_DS__DS_ID = eINSTANCE.getTestingDS_DsId();

		/**
		 * The meta object literal for the '{@link testing2.impl.ClassTypeImpl <em>Class Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing2.impl.ClassTypeImpl
		 * @see testing2.impl.Testing2PackageImpl#getClassType()
		 * @generated
		 */
		EClass CLASS_TYPE = eINSTANCE.getClassType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_TYPE__TYPE_NAME = eINSTANCE.getClassType_TypeName();

		/**
		 * The meta object literal for the '{@link testing2.impl.ClassItemImpl <em>Class Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing2.impl.ClassItemImpl
		 * @see testing2.impl.Testing2PackageImpl#getClassItem()
		 * @generated
		 */
		EClass CLASS_ITEM = eINSTANCE.getClassItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ITEM__NAME = eINSTANCE.getClassItem_Name();

		/**
		 * The meta object literal for the '{@link testing2.impl.ClassActorImpl <em>Class Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing2.impl.ClassActorImpl
		 * @see testing2.impl.Testing2PackageImpl#getClassActor()
		 * @generated
		 */
		EClass CLASS_ACTOR = eINSTANCE.getClassActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ACTOR__NAME = eINSTANCE.getClassActor_Name();

		/**
		 * The meta object literal for the '{@link testing2.impl.ClassCommandImpl <em>Class Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing2.impl.ClassCommandImpl
		 * @see testing2.impl.Testing2PackageImpl#getClassCommand()
		 * @generated
		 */
		EClass CLASS_COMMAND = eINSTANCE.getClassCommand();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_COMMAND__CMD = eINSTANCE.getClassCommand_Cmd();

		/**
		 * The meta object literal for the '{@link testing2.CmdType <em>Cmd Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testing2.CmdType
		 * @see testing2.impl.Testing2PackageImpl#getCmdType()
		 * @generated
		 */
		EEnum CMD_TYPE = eINSTANCE.getCmdType();

	}

} //Testing2Package
