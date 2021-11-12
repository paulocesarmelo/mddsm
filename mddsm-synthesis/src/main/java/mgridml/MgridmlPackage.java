/**
 */
package mgridml;

import m4md.M4mdPackage;

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
 * @see mgridml.MgridmlFactory
 * @model kind="package"
 * @generated
 */
public interface MgridmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mgridml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/m4md/mgridml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mgridml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MgridmlPackage eINSTANCE = mgridml.impl.MgridmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link mgridml.impl.MGridSchemaImpl <em>MGrid Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.MGridSchemaImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getMGridSchema()
	 * @generated
	 */
	int MGRID_SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Cs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_SCHEMA__CS = M4mdPackage.EDOMAIN_SCHEMA__CS;

	/**
	 * The feature id for the '<em><b>Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_SCHEMA__DS = M4mdPackage.EDOMAIN_SCHEMA__DS;

	/**
	 * The feature id for the '<em><b>Mgrid Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_SCHEMA__MGRID_MODEL_ID = M4mdPackage.EDOMAIN_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MGrid Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_SCHEMA_FEATURE_COUNT = M4mdPackage.EDOMAIN_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MGrid Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_SCHEMA_OPERATION_COUNT = M4mdPackage.EDOMAIN_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.MGridControlSchemaImpl <em>MGrid Control Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.MGridControlSchemaImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getMGridControlSchema()
	 * @generated
	 */
	int MGRID_CONTROL_SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROL_SCHEMA__ACTOR = M4mdPackage.ECONTROL_SCHEMA__ACTOR;

	/**
	 * The feature id for the '<em><b>Mcgrid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROL_SCHEMA__MCGRID = M4mdPackage.ECONTROL_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MGrid Control Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROL_SCHEMA_FEATURE_COUNT = M4mdPackage.ECONTROL_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MGrid Control Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROL_SCHEMA_OPERATION_COUNT = M4mdPackage.ECONTROL_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.MGridDataSchemaImpl <em>MGrid Data Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.MGridDataSchemaImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getMGridDataSchema()
	 * @generated
	 */
	int MGRID_DATA_SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Cs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_DATA_SCHEMA__CS = M4mdPackage.EDATA_SCHEMA__CS;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_DATA_SCHEMA__ITEM = M4mdPackage.EDATA_SCHEMA__ITEM;

	/**
	 * The feature id for the '<em><b>Md Grid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_DATA_SCHEMA__MD_GRID = M4mdPackage.EDATA_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MGrid Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_DATA_SCHEMA_FEATURE_COUNT = M4mdPackage.EDATA_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MGrid Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_DATA_SCHEMA_OPERATION_COUNT = M4mdPackage.EDATA_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.MCGridImpl <em>MC Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.MCGridImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getMCGrid()
	 * @generated
	 */
	int MC_GRID = 3;

	/**
	 * The feature id for the '<em><b>Mgcontroller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_GRID__MGCONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Mcgrid ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_GRID__MCGRID_ID = 1;

	/**
	 * The number of structural features of the '<em>MC Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_GRID_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>MC Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MC_GRID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.MDGridImpl <em>MD Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.MDGridImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getMDGrid()
	 * @generated
	 */
	int MD_GRID = 4;

	/**
	 * The feature id for the '<em><b>Plant Elem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MD_GRID__PLANT_ELEM = 0;

	/**
	 * The feature id for the '<em><b>Mdgrid ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MD_GRID__MDGRID_ID = 1;

	/**
	 * The feature id for the '<em><b>Mcgrid ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MD_GRID__MCGRID_ID = 2;

	/**
	 * The number of structural features of the '<em>MD Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MD_GRID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>MD Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MD_GRID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.PlantElemImpl <em>Plant Elem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.PlantElemImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getPlantElem()
	 * @generated
	 */
	int PLANT_ELEM = 5;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_ELEM__COMMAND_PRIORITY = M4mdPackage.EITEM__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_ELEM__CMD = M4mdPackage.EITEM__CMD;

	/**
	 * The feature id for the '<em><b>Arising Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_ELEM__ARISING_BEHAVIOR = M4mdPackage.EITEM__ARISING_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_ELEM__TYPE = M4mdPackage.EITEM__TYPE;

	/**
	 * The feature id for the '<em><b>Plant EID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_ELEM__PLANT_EID = M4mdPackage.EITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plant Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_ELEM_FEATURE_COUNT = M4mdPackage.EITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plant Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_ELEM_OPERATION_COUNT = M4mdPackage.EITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.DeviceImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 6;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__COMMAND_PRIORITY = PLANT_ELEM__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CMD = PLANT_ELEM__CMD;

	/**
	 * The feature id for the '<em><b>Arising Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ARISING_BEHAVIOR = PLANT_ELEM__ARISING_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TYPE = PLANT_ELEM__TYPE;

	/**
	 * The feature id for the '<em><b>Plant EID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PLANT_EID = PLANT_ELEM__PLANT_EID;

	/**
	 * The feature id for the '<em><b>Device Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICE_PROPERTY = PLANT_ELEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICE_TYPE_ID = PLANT_ELEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEVICE_NAME = PLANT_ELEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wattage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__WATTAGE = PLANT_ELEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DESCRIPTION = PLANT_ELEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__OPERATIONAL = PLANT_ELEM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = PLANT_ELEM_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = PLANT_ELEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.LoadDeviceImpl <em>Load Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.LoadDeviceImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getLoadDevice()
	 * @generated
	 */
	int LOAD_DEVICE = 7;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__COMMAND_PRIORITY = DEVICE__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__CMD = DEVICE__CMD;

	/**
	 * The feature id for the '<em><b>Arising Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__ARISING_BEHAVIOR = DEVICE__ARISING_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__TYPE = DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Plant EID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__PLANT_EID = DEVICE__PLANT_EID;

	/**
	 * The feature id for the '<em><b>Device Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__DEVICE_PROPERTY = DEVICE__DEVICE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Device Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__DEVICE_TYPE_ID = DEVICE__DEVICE_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__DEVICE_NAME = DEVICE__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Wattage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__WATTAGE = DEVICE__WATTAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__DESCRIPTION = DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__OPERATIONAL = DEVICE__OPERATIONAL;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__CONTROL = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE__CRITICAL = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Load Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Load Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.StorageDeviceImpl <em>Storage Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.StorageDeviceImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getStorageDevice()
	 * @generated
	 */
	int STORAGE_DEVICE = 8;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__COMMAND_PRIORITY = DEVICE__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__CMD = DEVICE__CMD;

	/**
	 * The feature id for the '<em><b>Arising Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__ARISING_BEHAVIOR = DEVICE__ARISING_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__TYPE = DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Plant EID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__PLANT_EID = DEVICE__PLANT_EID;

	/**
	 * The feature id for the '<em><b>Device Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__DEVICE_PROPERTY = DEVICE__DEVICE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Device Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__DEVICE_TYPE_ID = DEVICE__DEVICE_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__DEVICE_NAME = DEVICE__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Wattage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__WATTAGE = DEVICE__WATTAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__DESCRIPTION = DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__OPERATIONAL = DEVICE__OPERATIONAL;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__CAPACITY = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Charging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__CHARGING = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Charge T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE__CHARGE_T = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Storage Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Storage Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.DevicePropertyImpl <em>Device Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.DevicePropertyImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getDeviceProperty()
	 * @generated
	 */
	int DEVICE_PROPERTY = 9;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PROPERTY__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Device Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Device Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.SourceImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__COMMAND_PRIORITY = PLANT_ELEM__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CMD = PLANT_ELEM__CMD;

	/**
	 * The feature id for the '<em><b>Arising Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ARISING_BEHAVIOR = PLANT_ELEM__ARISING_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TYPE = PLANT_ELEM__TYPE;

	/**
	 * The feature id for the '<em><b>Plant EID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PLANT_EID = PLANT_ELEM__PLANT_EID;

	/**
	 * The feature id for the '<em><b>So Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SO_TYPE_ID = PLANT_ELEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__SOURCE_NAME = PLANT_ELEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wattage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__WATTAGE = PLANT_ELEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>On Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ON_DEMAND = PLANT_ELEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__OPERATIONAL = PLANT_ELEM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = PLANT_ELEM_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = PLANT_ELEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.MeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.MeterImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getMeter()
	 * @generated
	 */
	int METER = 12;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__COMMAND_PRIORITY = PLANT_ELEM__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__CMD = PLANT_ELEM__CMD;

	/**
	 * The feature id for the '<em><b>Arising Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__ARISING_BEHAVIOR = PLANT_ELEM__ARISING_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__TYPE = PLANT_ELEM__TYPE;

	/**
	 * The feature id for the '<em><b>Plant EID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__PLANT_EID = PLANT_ELEM__PLANT_EID;

	/**
	 * The feature id for the '<em><b>MType ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER__MTYPE_ID = PLANT_ELEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_FEATURE_COUNT = PLANT_ELEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_OPERATION_COUNT = PLANT_ELEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.SmartMeterImpl <em>Smart Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.SmartMeterImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getSmartMeter()
	 * @generated
	 */
	int SMART_METER = 11;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__COMMAND_PRIORITY = METER__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__CMD = METER__CMD;

	/**
	 * The feature id for the '<em><b>Arising Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__ARISING_BEHAVIOR = METER__ARISING_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__TYPE = METER__TYPE;

	/**
	 * The feature id for the '<em><b>Plant EID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__PLANT_EID = METER__PLANT_EID;

	/**
	 * The feature id for the '<em><b>MType ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__MTYPE_ID = METER__MTYPE_ID;

	/**
	 * The feature id for the '<em><b>Tariff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__TARIFF = METER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__USAGE = METER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER__OPERATIONAL = METER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Smart Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_FEATURE_COUNT = METER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Smart Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_METER_OPERATION_COUNT = METER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.LegacyMeterImpl <em>Legacy Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.LegacyMeterImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getLegacyMeter()
	 * @generated
	 */
	int LEGACY_METER = 13;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_METER__COMMAND_PRIORITY = METER__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_METER__CMD = METER__CMD;

	/**
	 * The feature id for the '<em><b>Arising Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_METER__ARISING_BEHAVIOR = METER__ARISING_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_METER__TYPE = METER__TYPE;

	/**
	 * The feature id for the '<em><b>Plant EID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_METER__PLANT_EID = METER__PLANT_EID;

	/**
	 * The feature id for the '<em><b>MType ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_METER__MTYPE_ID = METER__MTYPE_ID;

	/**
	 * The feature id for the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_METER__OPERATIONAL = METER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Legacy Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_METER_FEATURE_COUNT = METER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Legacy Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_METER_OPERATION_COUNT = METER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.MGControllerImpl <em>MG Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.MGControllerImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getMGController()
	 * @generated
	 */
	int MG_CONTROLLER = 14;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MG_CONTROLLER__COMMAND_PRIORITY = M4mdPackage.EACTOR__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MG_CONTROLLER__CMD = M4mdPackage.EACTOR__CMD;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MG_CONTROLLER__KIND_INTERACTION = M4mdPackage.EACTOR__KIND_INTERACTION;

	/**
	 * The feature id for the '<em><b>Types Controlled</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MG_CONTROLLER__TYPES_CONTROLLED = M4mdPackage.EACTOR__TYPES_CONTROLLED;

	/**
	 * The feature id for the '<em><b>Ctype ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MG_CONTROLLER__CTYPE_ID = M4mdPackage.EACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MG Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MG_CONTROLLER_FEATURE_COUNT = M4mdPackage.EACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MG Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MG_CONTROLLER_OPERATION_COUNT = M4mdPackage.EACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.AtomicControllerImpl <em>Atomic Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.AtomicControllerImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getAtomicController()
	 * @generated
	 */
	int ATOMIC_CONTROLLER = 15;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_CONTROLLER__COMMAND_PRIORITY = MG_CONTROLLER__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_CONTROLLER__CMD = MG_CONTROLLER__CMD;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_CONTROLLER__KIND_INTERACTION = MG_CONTROLLER__KIND_INTERACTION;

	/**
	 * The feature id for the '<em><b>Types Controlled</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_CONTROLLER__TYPES_CONTROLLED = MG_CONTROLLER__TYPES_CONTROLLED;

	/**
	 * The feature id for the '<em><b>Ctype ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_CONTROLLER__CTYPE_ID = MG_CONTROLLER__CTYPE_ID;

	/**
	 * The feature id for the '<em><b>Controller ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_CONTROLLER__CONTROLLER_ID = MG_CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_CONTROLLER__NAME = MG_CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_CONTROLLER__CARDINALITY = MG_CONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_CONTROLLER__DESCRIPTION = MG_CONTROLLER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Atomic Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_CONTROLLER_FEATURE_COUNT = MG_CONTROLLER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Atomic Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_CONTROLLER_OPERATION_COUNT = MG_CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.MGridControllerImpl <em>MGrid Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.MGridControllerImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getMGridController()
	 * @generated
	 */
	int MGRID_CONTROLLER = 16;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROLLER__COMMAND_PRIORITY = MG_CONTROLLER__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROLLER__CMD = MG_CONTROLLER__CMD;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROLLER__KIND_INTERACTION = MG_CONTROLLER__KIND_INTERACTION;

	/**
	 * The feature id for the '<em><b>Types Controlled</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROLLER__TYPES_CONTROLLED = MG_CONTROLLER__TYPES_CONTROLLED;

	/**
	 * The feature id for the '<em><b>Ctype ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROLLER__CTYPE_ID = MG_CONTROLLER__CTYPE_ID;

	/**
	 * The feature id for the '<em><b>Mgcontroller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROLLER__MGCONTROLLER = MG_CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mgrid Controller ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROLLER__MGRID_CONTROLLER_ID = MG_CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total Loads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROLLER__TOTAL_LOADS = MG_CONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Total Sources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROLLER__TOTAL_SOURCES = MG_CONTROLLER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>MGrid Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROLLER_FEATURE_COUNT = MG_CONTROLLER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>MGrid Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MGRID_CONTROLLER_OPERATION_COUNT = MG_CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.LoadControllerImpl <em>Load Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.LoadControllerImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getLoadController()
	 * @generated
	 */
	int LOAD_CONTROLLER = 17;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__COMMAND_PRIORITY = ATOMIC_CONTROLLER__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__CMD = ATOMIC_CONTROLLER__CMD;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__KIND_INTERACTION = ATOMIC_CONTROLLER__KIND_INTERACTION;

	/**
	 * The feature id for the '<em><b>Types Controlled</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__TYPES_CONTROLLED = ATOMIC_CONTROLLER__TYPES_CONTROLLED;

	/**
	 * The feature id for the '<em><b>Ctype ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__CTYPE_ID = ATOMIC_CONTROLLER__CTYPE_ID;

	/**
	 * The feature id for the '<em><b>Controller ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__CONTROLLER_ID = ATOMIC_CONTROLLER__CONTROLLER_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__NAME = ATOMIC_CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__CARDINALITY = ATOMIC_CONTROLLER__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__DESCRIPTION = ATOMIC_CONTROLLER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Load Device Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__LOAD_DEVICE_TYPE = ATOMIC_CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lc Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__LC_PROPERTY = ATOMIC_CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__CRITICAL = ATOMIC_CONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Wattage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__LOWER_WATTAGE = ATOMIC_CONTROLLER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Wattage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__UPPER_WATTAGE = ATOMIC_CONTROLLER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Group Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER__GROUP_ACTION = ATOMIC_CONTROLLER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Load Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER_FEATURE_COUNT = ATOMIC_CONTROLLER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Load Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_CONTROLLER_OPERATION_COUNT = ATOMIC_CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.StorageControllerImpl <em>Storage Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.StorageControllerImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getStorageController()
	 * @generated
	 */
	int STORAGE_CONTROLLER = 18;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CONTROLLER__COMMAND_PRIORITY = ATOMIC_CONTROLLER__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CONTROLLER__CMD = ATOMIC_CONTROLLER__CMD;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CONTROLLER__KIND_INTERACTION = ATOMIC_CONTROLLER__KIND_INTERACTION;

	/**
	 * The feature id for the '<em><b>Types Controlled</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CONTROLLER__TYPES_CONTROLLED = ATOMIC_CONTROLLER__TYPES_CONTROLLED;

	/**
	 * The feature id for the '<em><b>Ctype ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CONTROLLER__CTYPE_ID = ATOMIC_CONTROLLER__CTYPE_ID;

	/**
	 * The feature id for the '<em><b>Controller ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CONTROLLER__CONTROLLER_ID = ATOMIC_CONTROLLER__CONTROLLER_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CONTROLLER__NAME = ATOMIC_CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CONTROLLER__CARDINALITY = ATOMIC_CONTROLLER__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CONTROLLER__DESCRIPTION = ATOMIC_CONTROLLER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Storage Device Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CONTROLLER__STORAGE_DEVICE_TYPE = ATOMIC_CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CONTROLLER_FEATURE_COUNT = ATOMIC_CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Storage Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CONTROLLER_OPERATION_COUNT = ATOMIC_CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.SourceControllerImpl <em>Source Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.SourceControllerImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getSourceController()
	 * @generated
	 */
	int SOURCE_CONTROLLER = 19;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CONTROLLER__COMMAND_PRIORITY = ATOMIC_CONTROLLER__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CONTROLLER__CMD = ATOMIC_CONTROLLER__CMD;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CONTROLLER__KIND_INTERACTION = ATOMIC_CONTROLLER__KIND_INTERACTION;

	/**
	 * The feature id for the '<em><b>Types Controlled</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CONTROLLER__TYPES_CONTROLLED = ATOMIC_CONTROLLER__TYPES_CONTROLLED;

	/**
	 * The feature id for the '<em><b>Ctype ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CONTROLLER__CTYPE_ID = ATOMIC_CONTROLLER__CTYPE_ID;

	/**
	 * The feature id for the '<em><b>Controller ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CONTROLLER__CONTROLLER_ID = ATOMIC_CONTROLLER__CONTROLLER_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CONTROLLER__NAME = ATOMIC_CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CONTROLLER__CARDINALITY = ATOMIC_CONTROLLER__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CONTROLLER__DESCRIPTION = ATOMIC_CONTROLLER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CONTROLLER__SOURCE_TYPE = ATOMIC_CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CONTROLLER_FEATURE_COUNT = ATOMIC_CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Source Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CONTROLLER_OPERATION_COUNT = ATOMIC_CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.PCCImpl <em>PCC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.PCCImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getPCC()
	 * @generated
	 */
	int PCC = 20;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC__COMMAND_PRIORITY = ATOMIC_CONTROLLER__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC__CMD = ATOMIC_CONTROLLER__CMD;

	/**
	 * The feature id for the '<em><b>Kind Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC__KIND_INTERACTION = ATOMIC_CONTROLLER__KIND_INTERACTION;

	/**
	 * The feature id for the '<em><b>Types Controlled</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC__TYPES_CONTROLLED = ATOMIC_CONTROLLER__TYPES_CONTROLLED;

	/**
	 * The feature id for the '<em><b>Ctype ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC__CTYPE_ID = ATOMIC_CONTROLLER__CTYPE_ID;

	/**
	 * The feature id for the '<em><b>Controller ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC__CONTROLLER_ID = ATOMIC_CONTROLLER__CONTROLLER_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC__NAME = ATOMIC_CONTROLLER__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC__CARDINALITY = ATOMIC_CONTROLLER__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC__DESCRIPTION = ATOMIC_CONTROLLER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Meter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC__METER_TYPE = ATOMIC_CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC__CONNECTED = ATOMIC_CONTROLLER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>PCC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC_FEATURE_COUNT = ATOMIC_CONTROLLER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>PCC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCC_OPERATION_COUNT = ATOMIC_CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.MeterTypeImpl <em>Meter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.MeterTypeImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getMeterType()
	 * @generated
	 */
	int METER_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TYPE__INTERACTION_BEHAVIOR = M4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TYPE__CARDINALITY = M4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>MType ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TYPE__MTYPE_ID = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TYPE__TYPE_NAME = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TYPE_FEATURE_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Meter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METER_TYPE_OPERATION_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.SourceTypeImpl <em>Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.SourceTypeImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__INTERACTION_BEHAVIOR = M4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__CARDINALITY = M4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>So Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__SO_TYPE_ID = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__TYPE_NAME = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__SOURCE_C = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__PRIORITY = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_FEATURE_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_OPERATION_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.StorageDeviceTypeImpl <em>Storage Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.StorageDeviceTypeImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getStorageDeviceType()
	 * @generated
	 */
	int STORAGE_DEVICE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE_TYPE__INTERACTION_BEHAVIOR = M4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE_TYPE__CARDINALITY = M4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>So Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE_TYPE__SO_TYPE_ID = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE_TYPE__TYPE_NAME = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Thres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE_TYPE__LOWER_THRES = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Thres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE_TYPE__UPPER_THRES = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Storage Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE_TYPE_FEATURE_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Storage Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_DEVICE_TYPE_OPERATION_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.LoadDeviceTypeImpl <em>Load Device Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.LoadDeviceTypeImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getLoadDeviceType()
	 * @generated
	 */
	int LOAD_DEVICE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE_TYPE__INTERACTION_BEHAVIOR = M4mdPackage.EDOMAIN_SPECIFIC_TYPE__INTERACTION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE_TYPE__CARDINALITY = M4mdPackage.EDOMAIN_SPECIFIC_TYPE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>So Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE_TYPE__SO_TYPE_ID = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE_TYPE__TYPE_NAME = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Critical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE_TYPE__CRITICAL = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE_TYPE__USAGE = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Load Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE_TYPE_FEATURE_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Load Device Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_DEVICE_TYPE_OPERATION_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.LC_PropertyImpl <em>LC Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.LC_PropertyImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getLC_Property()
	 * @generated
	 */
	int LC_PROPERTY = 25;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LC_PROPERTY__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LC_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>LC Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LC_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>LC Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LC_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.SmartMTypeImpl <em>Smart MType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.SmartMTypeImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getSmartMType()
	 * @generated
	 */
	int SMART_MTYPE = 26;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_MTYPE__INTERACTION_BEHAVIOR = METER_TYPE__INTERACTION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_MTYPE__CARDINALITY = METER_TYPE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>MType ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_MTYPE__MTYPE_ID = METER_TYPE__MTYPE_ID;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_MTYPE__TYPE_NAME = METER_TYPE__TYPE_NAME;

	/**
	 * The number of structural features of the '<em>Smart MType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_MTYPE_FEATURE_COUNT = METER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Smart MType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_MTYPE_OPERATION_COUNT = METER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.impl.LegacyMTypeImpl <em>Legacy MType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.impl.LegacyMTypeImpl
	 * @see mgridml.impl.MgridmlPackageImpl#getLegacyMType()
	 * @generated
	 */
	int LEGACY_MTYPE = 27;

	/**
	 * The feature id for the '<em><b>Interaction Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_MTYPE__INTERACTION_BEHAVIOR = METER_TYPE__INTERACTION_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_MTYPE__CARDINALITY = METER_TYPE__CARDINALITY;

	/**
	 * The feature id for the '<em><b>MType ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_MTYPE__MTYPE_ID = METER_TYPE__MTYPE_ID;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_MTYPE__TYPE_NAME = METER_TYPE__TYPE_NAME;

	/**
	 * The number of structural features of the '<em>Legacy MType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_MTYPE_FEATURE_COUNT = METER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Legacy MType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_MTYPE_OPERATION_COUNT = METER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mgridml.CriticalEnum <em>Critical Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.CriticalEnum
	 * @see mgridml.impl.MgridmlPackageImpl#getCriticalEnum()
	 * @generated
	 */
	int CRITICAL_ENUM = 28;

	/**
	 * The meta object id for the '{@link mgridml.SourceEnum <em>Source Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.SourceEnum
	 * @see mgridml.impl.MgridmlPackageImpl#getSourceEnum()
	 * @generated
	 */
	int SOURCE_ENUM = 29;

	/**
	 * The meta object id for the '{@link mgridml.ControlEnum <em>Control Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.ControlEnum
	 * @see mgridml.impl.MgridmlPackageImpl#getControlEnum()
	 * @generated
	 */
	int CONTROL_ENUM = 30;

	/**
	 * The meta object id for the '{@link mgridml.ChargeEnum <em>Charge Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.ChargeEnum
	 * @see mgridml.impl.MgridmlPackageImpl#getChargeEnum()
	 * @generated
	 */
	int CHARGE_ENUM = 31;

	/**
	 * The meta object id for the '{@link mgridml.UsageEnum <em>Usage Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mgridml.UsageEnum
	 * @see mgridml.impl.MgridmlPackageImpl#getUsageEnum()
	 * @generated
	 */
	int USAGE_ENUM = 32;


	/**
	 * Returns the meta object for class '{@link mgridml.MGridSchema <em>MGrid Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MGrid Schema</em>'.
	 * @see mgridml.MGridSchema
	 * @generated
	 */
	EClass getMGridSchema();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.MGridSchema#getMgridModelID <em>Mgrid Model ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mgrid Model ID</em>'.
	 * @see mgridml.MGridSchema#getMgridModelID()
	 * @see #getMGridSchema()
	 * @generated
	 */
	EAttribute getMGridSchema_MgridModelID();

	/**
	 * Returns the meta object for class '{@link mgridml.MGridControlSchema <em>MGrid Control Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MGrid Control Schema</em>'.
	 * @see mgridml.MGridControlSchema
	 * @generated
	 */
	EClass getMGridControlSchema();

	/**
	 * Returns the meta object for the containment reference '{@link mgridml.MGridControlSchema#getMcgrid <em>Mcgrid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mcgrid</em>'.
	 * @see mgridml.MGridControlSchema#getMcgrid()
	 * @see #getMGridControlSchema()
	 * @generated
	 */
	EReference getMGridControlSchema_Mcgrid();

	/**
	 * Returns the meta object for class '{@link mgridml.MGridDataSchema <em>MGrid Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MGrid Data Schema</em>'.
	 * @see mgridml.MGridDataSchema
	 * @generated
	 */
	EClass getMGridDataSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link mgridml.MGridDataSchema#getMdGrid <em>Md Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Md Grid</em>'.
	 * @see mgridml.MGridDataSchema#getMdGrid()
	 * @see #getMGridDataSchema()
	 * @generated
	 */
	EReference getMGridDataSchema_MdGrid();

	/**
	 * Returns the meta object for class '{@link mgridml.MCGrid <em>MC Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MC Grid</em>'.
	 * @see mgridml.MCGrid
	 * @generated
	 */
	EClass getMCGrid();

	/**
	 * Returns the meta object for the containment reference list '{@link mgridml.MCGrid#getMgcontroller <em>Mgcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mgcontroller</em>'.
	 * @see mgridml.MCGrid#getMgcontroller()
	 * @see #getMCGrid()
	 * @generated
	 */
	EReference getMCGrid_Mgcontroller();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.MCGrid#getMcgridID <em>Mcgrid ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mcgrid ID</em>'.
	 * @see mgridml.MCGrid#getMcgridID()
	 * @see #getMCGrid()
	 * @generated
	 */
	EAttribute getMCGrid_McgridID();

	/**
	 * Returns the meta object for class '{@link mgridml.MDGrid <em>MD Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MD Grid</em>'.
	 * @see mgridml.MDGrid
	 * @generated
	 */
	EClass getMDGrid();

	/**
	 * Returns the meta object for the containment reference list '{@link mgridml.MDGrid#getPlantElem <em>Plant Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plant Elem</em>'.
	 * @see mgridml.MDGrid#getPlantElem()
	 * @see #getMDGrid()
	 * @generated
	 */
	EReference getMDGrid_PlantElem();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.MDGrid#getMdgridID <em>Mdgrid ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mdgrid ID</em>'.
	 * @see mgridml.MDGrid#getMdgridID()
	 * @see #getMDGrid()
	 * @generated
	 */
	EAttribute getMDGrid_MdgridID();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.MDGrid#getMcgridID <em>Mcgrid ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mcgrid ID</em>'.
	 * @see mgridml.MDGrid#getMcgridID()
	 * @see #getMDGrid()
	 * @generated
	 */
	EAttribute getMDGrid_McgridID();

	/**
	 * Returns the meta object for class '{@link mgridml.PlantElem <em>Plant Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant Elem</em>'.
	 * @see mgridml.PlantElem
	 * @generated
	 */
	EClass getPlantElem();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.PlantElem#getPlantE_ID <em>Plant EID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plant EID</em>'.
	 * @see mgridml.PlantElem#getPlantE_ID()
	 * @see #getPlantElem()
	 * @generated
	 */
	EAttribute getPlantElem_PlantE_ID();

	/**
	 * Returns the meta object for class '{@link mgridml.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see mgridml.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link mgridml.Device#getDeviceProperty <em>Device Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device Property</em>'.
	 * @see mgridml.Device#getDeviceProperty()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_DeviceProperty();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.Device#getDeviceTypeID <em>Device Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Type ID</em>'.
	 * @see mgridml.Device#getDeviceTypeID()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DeviceTypeID();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.Device#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see mgridml.Device#getDeviceName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_DeviceName();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.Device#getWattage <em>Wattage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wattage</em>'.
	 * @see mgridml.Device#getWattage()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Wattage();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.Device#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mgridml.Device#getDescription()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Description();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.Device#isOperational <em>Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operational</em>'.
	 * @see mgridml.Device#isOperational()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Operational();

	/**
	 * Returns the meta object for class '{@link mgridml.LoadDevice <em>Load Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Device</em>'.
	 * @see mgridml.LoadDevice
	 * @generated
	 */
	EClass getLoadDevice();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LoadDevice#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control</em>'.
	 * @see mgridml.LoadDevice#getControl()
	 * @see #getLoadDevice()
	 * @generated
	 */
	EAttribute getLoadDevice_Control();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LoadDevice#getCritical <em>Critical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical</em>'.
	 * @see mgridml.LoadDevice#getCritical()
	 * @see #getLoadDevice()
	 * @generated
	 */
	EAttribute getLoadDevice_Critical();

	/**
	 * Returns the meta object for class '{@link mgridml.StorageDevice <em>Storage Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Device</em>'.
	 * @see mgridml.StorageDevice
	 * @generated
	 */
	EClass getStorageDevice();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.StorageDevice#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see mgridml.StorageDevice#getCapacity()
	 * @see #getStorageDevice()
	 * @generated
	 */
	EAttribute getStorageDevice_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.StorageDevice#isCharging <em>Charging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charging</em>'.
	 * @see mgridml.StorageDevice#isCharging()
	 * @see #getStorageDevice()
	 * @generated
	 */
	EAttribute getStorageDevice_Charging();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.StorageDevice#getChargeT <em>Charge T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge T</em>'.
	 * @see mgridml.StorageDevice#getChargeT()
	 * @see #getStorageDevice()
	 * @generated
	 */
	EAttribute getStorageDevice_ChargeT();

	/**
	 * Returns the meta object for class '{@link mgridml.DeviceProperty <em>Device Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Property</em>'.
	 * @see mgridml.DeviceProperty
	 * @generated
	 */
	EClass getDeviceProperty();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.DeviceProperty#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see mgridml.DeviceProperty#getAttribute()
	 * @see #getDeviceProperty()
	 * @generated
	 */
	EAttribute getDeviceProperty_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.DeviceProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mgridml.DeviceProperty#getValue()
	 * @see #getDeviceProperty()
	 * @generated
	 */
	EAttribute getDeviceProperty_Value();

	/**
	 * Returns the meta object for class '{@link mgridml.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see mgridml.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.Source#getSoTypeID <em>So Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>So Type ID</em>'.
	 * @see mgridml.Source#getSoTypeID()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_SoTypeID();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.Source#getSourceName <em>Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Name</em>'.
	 * @see mgridml.Source#getSourceName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_SourceName();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.Source#getWattage <em>Wattage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wattage</em>'.
	 * @see mgridml.Source#getWattage()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Wattage();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.Source#getOnDemand <em>On Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Demand</em>'.
	 * @see mgridml.Source#getOnDemand()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_OnDemand();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.Source#isOperational <em>Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operational</em>'.
	 * @see mgridml.Source#isOperational()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Operational();

	/**
	 * Returns the meta object for class '{@link mgridml.SmartMeter <em>Smart Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Meter</em>'.
	 * @see mgridml.SmartMeter
	 * @generated
	 */
	EClass getSmartMeter();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.SmartMeter#getTariff <em>Tariff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tariff</em>'.
	 * @see mgridml.SmartMeter#getTariff()
	 * @see #getSmartMeter()
	 * @generated
	 */
	EAttribute getSmartMeter_Tariff();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.SmartMeter#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see mgridml.SmartMeter#getUsage()
	 * @see #getSmartMeter()
	 * @generated
	 */
	EAttribute getSmartMeter_Usage();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.SmartMeter#isOperational <em>Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operational</em>'.
	 * @see mgridml.SmartMeter#isOperational()
	 * @see #getSmartMeter()
	 * @generated
	 */
	EAttribute getSmartMeter_Operational();

	/**
	 * Returns the meta object for class '{@link mgridml.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see mgridml.Meter
	 * @generated
	 */
	EClass getMeter();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.Meter#getMTypeID <em>MType ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MType ID</em>'.
	 * @see mgridml.Meter#getMTypeID()
	 * @see #getMeter()
	 * @generated
	 */
	EAttribute getMeter_MTypeID();

	/**
	 * Returns the meta object for class '{@link mgridml.LegacyMeter <em>Legacy Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Meter</em>'.
	 * @see mgridml.LegacyMeter
	 * @generated
	 */
	EClass getLegacyMeter();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LegacyMeter#getOperational <em>Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operational</em>'.
	 * @see mgridml.LegacyMeter#getOperational()
	 * @see #getLegacyMeter()
	 * @generated
	 */
	EAttribute getLegacyMeter_Operational();

	/**
	 * Returns the meta object for class '{@link mgridml.MGController <em>MG Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MG Controller</em>'.
	 * @see mgridml.MGController
	 * @generated
	 */
	EClass getMGController();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.MGController#getCtypeID <em>Ctype ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctype ID</em>'.
	 * @see mgridml.MGController#getCtypeID()
	 * @see #getMGController()
	 * @generated
	 */
	EAttribute getMGController_CtypeID();

	/**
	 * Returns the meta object for class '{@link mgridml.AtomicController <em>Atomic Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Controller</em>'.
	 * @see mgridml.AtomicController
	 * @generated
	 */
	EClass getAtomicController();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.AtomicController#getControllerID <em>Controller ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller ID</em>'.
	 * @see mgridml.AtomicController#getControllerID()
	 * @see #getAtomicController()
	 * @generated
	 */
	EAttribute getAtomicController_ControllerID();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.AtomicController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mgridml.AtomicController#getName()
	 * @see #getAtomicController()
	 * @generated
	 */
	EAttribute getAtomicController_Name();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.AtomicController#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see mgridml.AtomicController#getCardinality()
	 * @see #getAtomicController()
	 * @generated
	 */
	EAttribute getAtomicController_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.AtomicController#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mgridml.AtomicController#getDescription()
	 * @see #getAtomicController()
	 * @generated
	 */
	EAttribute getAtomicController_Description();

	/**
	 * Returns the meta object for class '{@link mgridml.MGridController <em>MGrid Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MGrid Controller</em>'.
	 * @see mgridml.MGridController
	 * @generated
	 */
	EClass getMGridController();

	/**
	 * Returns the meta object for the containment reference list '{@link mgridml.MGridController#getMgcontroller <em>Mgcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mgcontroller</em>'.
	 * @see mgridml.MGridController#getMgcontroller()
	 * @see #getMGridController()
	 * @generated
	 */
	EReference getMGridController_Mgcontroller();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.MGridController#getMgridControllerID <em>Mgrid Controller ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mgrid Controller ID</em>'.
	 * @see mgridml.MGridController#getMgridControllerID()
	 * @see #getMGridController()
	 * @generated
	 */
	EAttribute getMGridController_MgridControllerID();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.MGridController#getTotalLoads <em>Total Loads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Loads</em>'.
	 * @see mgridml.MGridController#getTotalLoads()
	 * @see #getMGridController()
	 * @generated
	 */
	EAttribute getMGridController_TotalLoads();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.MGridController#getTotalSources <em>Total Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Sources</em>'.
	 * @see mgridml.MGridController#getTotalSources()
	 * @see #getMGridController()
	 * @generated
	 */
	EAttribute getMGridController_TotalSources();

	/**
	 * Returns the meta object for class '{@link mgridml.LoadController <em>Load Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Controller</em>'.
	 * @see mgridml.LoadController
	 * @generated
	 */
	EClass getLoadController();

	/**
	 * Returns the meta object for the containment reference list '{@link mgridml.LoadController#getLoadDeviceType <em>Load Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load Device Type</em>'.
	 * @see mgridml.LoadController#getLoadDeviceType()
	 * @see #getLoadController()
	 * @generated
	 */
	EReference getLoadController_LoadDeviceType();

	/**
	 * Returns the meta object for the containment reference list '{@link mgridml.LoadController#getLcProperty <em>Lc Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lc Property</em>'.
	 * @see mgridml.LoadController#getLcProperty()
	 * @see #getLoadController()
	 * @generated
	 */
	EReference getLoadController_LcProperty();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LoadController#getCritical <em>Critical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical</em>'.
	 * @see mgridml.LoadController#getCritical()
	 * @see #getLoadController()
	 * @generated
	 */
	EAttribute getLoadController_Critical();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LoadController#getLowerWattage <em>Lower Wattage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Wattage</em>'.
	 * @see mgridml.LoadController#getLowerWattage()
	 * @see #getLoadController()
	 * @generated
	 */
	EAttribute getLoadController_LowerWattage();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LoadController#getUpperWattage <em>Upper Wattage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Wattage</em>'.
	 * @see mgridml.LoadController#getUpperWattage()
	 * @see #getLoadController()
	 * @generated
	 */
	EAttribute getLoadController_UpperWattage();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LoadController#isGroupAction <em>Group Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Action</em>'.
	 * @see mgridml.LoadController#isGroupAction()
	 * @see #getLoadController()
	 * @generated
	 */
	EAttribute getLoadController_GroupAction();

	/**
	 * Returns the meta object for class '{@link mgridml.StorageController <em>Storage Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Controller</em>'.
	 * @see mgridml.StorageController
	 * @generated
	 */
	EClass getStorageController();

	/**
	 * Returns the meta object for the containment reference list '{@link mgridml.StorageController#getStorageDeviceType <em>Storage Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storage Device Type</em>'.
	 * @see mgridml.StorageController#getStorageDeviceType()
	 * @see #getStorageController()
	 * @generated
	 */
	EReference getStorageController_StorageDeviceType();

	/**
	 * Returns the meta object for class '{@link mgridml.SourceController <em>Source Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Controller</em>'.
	 * @see mgridml.SourceController
	 * @generated
	 */
	EClass getSourceController();

	/**
	 * Returns the meta object for the containment reference list '{@link mgridml.SourceController#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Type</em>'.
	 * @see mgridml.SourceController#getSourceType()
	 * @see #getSourceController()
	 * @generated
	 */
	EReference getSourceController_SourceType();

	/**
	 * Returns the meta object for class '{@link mgridml.PCC <em>PCC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCC</em>'.
	 * @see mgridml.PCC
	 * @generated
	 */
	EClass getPCC();

	/**
	 * Returns the meta object for the containment reference '{@link mgridml.PCC#getMeterType <em>Meter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meter Type</em>'.
	 * @see mgridml.PCC#getMeterType()
	 * @see #getPCC()
	 * @generated
	 */
	EReference getPCC_MeterType();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.PCC#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see mgridml.PCC#isConnected()
	 * @see #getPCC()
	 * @generated
	 */
	EAttribute getPCC_Connected();

	/**
	 * Returns the meta object for class '{@link mgridml.MeterType <em>Meter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Type</em>'.
	 * @see mgridml.MeterType
	 * @generated
	 */
	EClass getMeterType();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.MeterType#getMTypeID <em>MType ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MType ID</em>'.
	 * @see mgridml.MeterType#getMTypeID()
	 * @see #getMeterType()
	 * @generated
	 */
	EAttribute getMeterType_MTypeID();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.MeterType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see mgridml.MeterType#getTypeName()
	 * @see #getMeterType()
	 * @generated
	 */
	EAttribute getMeterType_TypeName();

	/**
	 * Returns the meta object for class '{@link mgridml.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Type</em>'.
	 * @see mgridml.SourceType
	 * @generated
	 */
	EClass getSourceType();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.SourceType#getSoTypeID <em>So Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>So Type ID</em>'.
	 * @see mgridml.SourceType#getSoTypeID()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_SoTypeID();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.SourceType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see mgridml.SourceType#getTypeName()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.SourceType#getSourceC <em>Source C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source C</em>'.
	 * @see mgridml.SourceType#getSourceC()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_SourceC();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.SourceType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see mgridml.SourceType#getPriority()
	 * @see #getSourceType()
	 * @generated
	 */
	EAttribute getSourceType_Priority();

	/**
	 * Returns the meta object for class '{@link mgridml.StorageDeviceType <em>Storage Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Device Type</em>'.
	 * @see mgridml.StorageDeviceType
	 * @generated
	 */
	EClass getStorageDeviceType();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.StorageDeviceType#getSoTypeID <em>So Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>So Type ID</em>'.
	 * @see mgridml.StorageDeviceType#getSoTypeID()
	 * @see #getStorageDeviceType()
	 * @generated
	 */
	EAttribute getStorageDeviceType_SoTypeID();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.StorageDeviceType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see mgridml.StorageDeviceType#getTypeName()
	 * @see #getStorageDeviceType()
	 * @generated
	 */
	EAttribute getStorageDeviceType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.StorageDeviceType#getLowerThres <em>Lower Thres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Thres</em>'.
	 * @see mgridml.StorageDeviceType#getLowerThres()
	 * @see #getStorageDeviceType()
	 * @generated
	 */
	EAttribute getStorageDeviceType_LowerThres();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.StorageDeviceType#getUpperThres <em>Upper Thres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Thres</em>'.
	 * @see mgridml.StorageDeviceType#getUpperThres()
	 * @see #getStorageDeviceType()
	 * @generated
	 */
	EAttribute getStorageDeviceType_UpperThres();

	/**
	 * Returns the meta object for class '{@link mgridml.LoadDeviceType <em>Load Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Device Type</em>'.
	 * @see mgridml.LoadDeviceType
	 * @generated
	 */
	EClass getLoadDeviceType();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LoadDeviceType#getSoTypeID <em>So Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>So Type ID</em>'.
	 * @see mgridml.LoadDeviceType#getSoTypeID()
	 * @see #getLoadDeviceType()
	 * @generated
	 */
	EAttribute getLoadDeviceType_SoTypeID();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LoadDeviceType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see mgridml.LoadDeviceType#getTypeName()
	 * @see #getLoadDeviceType()
	 * @generated
	 */
	EAttribute getLoadDeviceType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LoadDeviceType#getCritical <em>Critical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Critical</em>'.
	 * @see mgridml.LoadDeviceType#getCritical()
	 * @see #getLoadDeviceType()
	 * @generated
	 */
	EAttribute getLoadDeviceType_Critical();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LoadDeviceType#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see mgridml.LoadDeviceType#getUsage()
	 * @see #getLoadDeviceType()
	 * @generated
	 */
	EAttribute getLoadDeviceType_Usage();

	/**
	 * Returns the meta object for class '{@link mgridml.LC_Property <em>LC Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LC Property</em>'.
	 * @see mgridml.LC_Property
	 * @generated
	 */
	EClass getLC_Property();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LC_Property#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see mgridml.LC_Property#getAttribute()
	 * @see #getLC_Property()
	 * @generated
	 */
	EAttribute getLC_Property_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link mgridml.LC_Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mgridml.LC_Property#getValue()
	 * @see #getLC_Property()
	 * @generated
	 */
	EAttribute getLC_Property_Value();

	/**
	 * Returns the meta object for class '{@link mgridml.SmartMType <em>Smart MType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart MType</em>'.
	 * @see mgridml.SmartMType
	 * @generated
	 */
	EClass getSmartMType();

	/**
	 * Returns the meta object for class '{@link mgridml.LegacyMType <em>Legacy MType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy MType</em>'.
	 * @see mgridml.LegacyMType
	 * @generated
	 */
	EClass getLegacyMType();

	/**
	 * Returns the meta object for enum '{@link mgridml.CriticalEnum <em>Critical Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Critical Enum</em>'.
	 * @see mgridml.CriticalEnum
	 * @generated
	 */
	EEnum getCriticalEnum();

	/**
	 * Returns the meta object for enum '{@link mgridml.SourceEnum <em>Source Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Enum</em>'.
	 * @see mgridml.SourceEnum
	 * @generated
	 */
	EEnum getSourceEnum();

	/**
	 * Returns the meta object for enum '{@link mgridml.ControlEnum <em>Control Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Enum</em>'.
	 * @see mgridml.ControlEnum
	 * @generated
	 */
	EEnum getControlEnum();

	/**
	 * Returns the meta object for enum '{@link mgridml.ChargeEnum <em>Charge Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Charge Enum</em>'.
	 * @see mgridml.ChargeEnum
	 * @generated
	 */
	EEnum getChargeEnum();

	/**
	 * Returns the meta object for enum '{@link mgridml.UsageEnum <em>Usage Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usage Enum</em>'.
	 * @see mgridml.UsageEnum
	 * @generated
	 */
	EEnum getUsageEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MgridmlFactory getMgridmlFactory();

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
		 * The meta object literal for the '{@link mgridml.impl.MGridSchemaImpl <em>MGrid Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.MGridSchemaImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getMGridSchema()
		 * @generated
		 */
		EClass MGRID_SCHEMA = eINSTANCE.getMGridSchema();

		/**
		 * The meta object literal for the '<em><b>Mgrid Model ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MGRID_SCHEMA__MGRID_MODEL_ID = eINSTANCE.getMGridSchema_MgridModelID();

		/**
		 * The meta object literal for the '{@link mgridml.impl.MGridControlSchemaImpl <em>MGrid Control Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.MGridControlSchemaImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getMGridControlSchema()
		 * @generated
		 */
		EClass MGRID_CONTROL_SCHEMA = eINSTANCE.getMGridControlSchema();

		/**
		 * The meta object literal for the '<em><b>Mcgrid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRID_CONTROL_SCHEMA__MCGRID = eINSTANCE.getMGridControlSchema_Mcgrid();

		/**
		 * The meta object literal for the '{@link mgridml.impl.MGridDataSchemaImpl <em>MGrid Data Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.MGridDataSchemaImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getMGridDataSchema()
		 * @generated
		 */
		EClass MGRID_DATA_SCHEMA = eINSTANCE.getMGridDataSchema();

		/**
		 * The meta object literal for the '<em><b>Md Grid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRID_DATA_SCHEMA__MD_GRID = eINSTANCE.getMGridDataSchema_MdGrid();

		/**
		 * The meta object literal for the '{@link mgridml.impl.MCGridImpl <em>MC Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.MCGridImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getMCGrid()
		 * @generated
		 */
		EClass MC_GRID = eINSTANCE.getMCGrid();

		/**
		 * The meta object literal for the '<em><b>Mgcontroller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MC_GRID__MGCONTROLLER = eINSTANCE.getMCGrid_Mgcontroller();

		/**
		 * The meta object literal for the '<em><b>Mcgrid ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MC_GRID__MCGRID_ID = eINSTANCE.getMCGrid_McgridID();

		/**
		 * The meta object literal for the '{@link mgridml.impl.MDGridImpl <em>MD Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.MDGridImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getMDGrid()
		 * @generated
		 */
		EClass MD_GRID = eINSTANCE.getMDGrid();

		/**
		 * The meta object literal for the '<em><b>Plant Elem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MD_GRID__PLANT_ELEM = eINSTANCE.getMDGrid_PlantElem();

		/**
		 * The meta object literal for the '<em><b>Mdgrid ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MD_GRID__MDGRID_ID = eINSTANCE.getMDGrid_MdgridID();

		/**
		 * The meta object literal for the '<em><b>Mcgrid ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MD_GRID__MCGRID_ID = eINSTANCE.getMDGrid_McgridID();

		/**
		 * The meta object literal for the '{@link mgridml.impl.PlantElemImpl <em>Plant Elem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.PlantElemImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getPlantElem()
		 * @generated
		 */
		EClass PLANT_ELEM = eINSTANCE.getPlantElem();

		/**
		 * The meta object literal for the '<em><b>Plant EID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_ELEM__PLANT_EID = eINSTANCE.getPlantElem_PlantE_ID();

		/**
		 * The meta object literal for the '{@link mgridml.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.DeviceImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Device Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__DEVICE_PROPERTY = eINSTANCE.getDevice_DeviceProperty();

		/**
		 * The meta object literal for the '<em><b>Device Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DEVICE_TYPE_ID = eINSTANCE.getDevice_DeviceTypeID();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DEVICE_NAME = eINSTANCE.getDevice_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Wattage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__WATTAGE = eINSTANCE.getDevice_Wattage();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DESCRIPTION = eINSTANCE.getDevice_Description();

		/**
		 * The meta object literal for the '<em><b>Operational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__OPERATIONAL = eINSTANCE.getDevice_Operational();

		/**
		 * The meta object literal for the '{@link mgridml.impl.LoadDeviceImpl <em>Load Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.LoadDeviceImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getLoadDevice()
		 * @generated
		 */
		EClass LOAD_DEVICE = eINSTANCE.getLoadDevice();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_DEVICE__CONTROL = eINSTANCE.getLoadDevice_Control();

		/**
		 * The meta object literal for the '<em><b>Critical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_DEVICE__CRITICAL = eINSTANCE.getLoadDevice_Critical();

		/**
		 * The meta object literal for the '{@link mgridml.impl.StorageDeviceImpl <em>Storage Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.StorageDeviceImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getStorageDevice()
		 * @generated
		 */
		EClass STORAGE_DEVICE = eINSTANCE.getStorageDevice();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_DEVICE__CAPACITY = eINSTANCE.getStorageDevice_Capacity();

		/**
		 * The meta object literal for the '<em><b>Charging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_DEVICE__CHARGING = eINSTANCE.getStorageDevice_Charging();

		/**
		 * The meta object literal for the '<em><b>Charge T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_DEVICE__CHARGE_T = eINSTANCE.getStorageDevice_ChargeT();

		/**
		 * The meta object literal for the '{@link mgridml.impl.DevicePropertyImpl <em>Device Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.DevicePropertyImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getDeviceProperty()
		 * @generated
		 */
		EClass DEVICE_PROPERTY = eINSTANCE.getDeviceProperty();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_PROPERTY__ATTRIBUTE = eINSTANCE.getDeviceProperty_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_PROPERTY__VALUE = eINSTANCE.getDeviceProperty_Value();

		/**
		 * The meta object literal for the '{@link mgridml.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.SourceImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>So Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__SO_TYPE_ID = eINSTANCE.getSource_SoTypeID();

		/**
		 * The meta object literal for the '<em><b>Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__SOURCE_NAME = eINSTANCE.getSource_SourceName();

		/**
		 * The meta object literal for the '<em><b>Wattage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__WATTAGE = eINSTANCE.getSource_Wattage();

		/**
		 * The meta object literal for the '<em><b>On Demand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__ON_DEMAND = eINSTANCE.getSource_OnDemand();

		/**
		 * The meta object literal for the '<em><b>Operational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__OPERATIONAL = eINSTANCE.getSource_Operational();

		/**
		 * The meta object literal for the '{@link mgridml.impl.SmartMeterImpl <em>Smart Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.SmartMeterImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getSmartMeter()
		 * @generated
		 */
		EClass SMART_METER = eINSTANCE.getSmartMeter();

		/**
		 * The meta object literal for the '<em><b>Tariff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_METER__TARIFF = eINSTANCE.getSmartMeter_Tariff();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_METER__USAGE = eINSTANCE.getSmartMeter_Usage();

		/**
		 * The meta object literal for the '<em><b>Operational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_METER__OPERATIONAL = eINSTANCE.getSmartMeter_Operational();

		/**
		 * The meta object literal for the '{@link mgridml.impl.MeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.MeterImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getMeter()
		 * @generated
		 */
		EClass METER = eINSTANCE.getMeter();

		/**
		 * The meta object literal for the '<em><b>MType ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER__MTYPE_ID = eINSTANCE.getMeter_MTypeID();

		/**
		 * The meta object literal for the '{@link mgridml.impl.LegacyMeterImpl <em>Legacy Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.LegacyMeterImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getLegacyMeter()
		 * @generated
		 */
		EClass LEGACY_METER = eINSTANCE.getLegacyMeter();

		/**
		 * The meta object literal for the '<em><b>Operational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGACY_METER__OPERATIONAL = eINSTANCE.getLegacyMeter_Operational();

		/**
		 * The meta object literal for the '{@link mgridml.impl.MGControllerImpl <em>MG Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.MGControllerImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getMGController()
		 * @generated
		 */
		EClass MG_CONTROLLER = eINSTANCE.getMGController();

		/**
		 * The meta object literal for the '<em><b>Ctype ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MG_CONTROLLER__CTYPE_ID = eINSTANCE.getMGController_CtypeID();

		/**
		 * The meta object literal for the '{@link mgridml.impl.AtomicControllerImpl <em>Atomic Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.AtomicControllerImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getAtomicController()
		 * @generated
		 */
		EClass ATOMIC_CONTROLLER = eINSTANCE.getAtomicController();

		/**
		 * The meta object literal for the '<em><b>Controller ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_CONTROLLER__CONTROLLER_ID = eINSTANCE.getAtomicController_ControllerID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_CONTROLLER__NAME = eINSTANCE.getAtomicController_Name();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_CONTROLLER__CARDINALITY = eINSTANCE.getAtomicController_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_CONTROLLER__DESCRIPTION = eINSTANCE.getAtomicController_Description();

		/**
		 * The meta object literal for the '{@link mgridml.impl.MGridControllerImpl <em>MGrid Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.MGridControllerImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getMGridController()
		 * @generated
		 */
		EClass MGRID_CONTROLLER = eINSTANCE.getMGridController();

		/**
		 * The meta object literal for the '<em><b>Mgcontroller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MGRID_CONTROLLER__MGCONTROLLER = eINSTANCE.getMGridController_Mgcontroller();

		/**
		 * The meta object literal for the '<em><b>Mgrid Controller ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MGRID_CONTROLLER__MGRID_CONTROLLER_ID = eINSTANCE.getMGridController_MgridControllerID();

		/**
		 * The meta object literal for the '<em><b>Total Loads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MGRID_CONTROLLER__TOTAL_LOADS = eINSTANCE.getMGridController_TotalLoads();

		/**
		 * The meta object literal for the '<em><b>Total Sources</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MGRID_CONTROLLER__TOTAL_SOURCES = eINSTANCE.getMGridController_TotalSources();

		/**
		 * The meta object literal for the '{@link mgridml.impl.LoadControllerImpl <em>Load Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.LoadControllerImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getLoadController()
		 * @generated
		 */
		EClass LOAD_CONTROLLER = eINSTANCE.getLoadController();

		/**
		 * The meta object literal for the '<em><b>Load Device Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_CONTROLLER__LOAD_DEVICE_TYPE = eINSTANCE.getLoadController_LoadDeviceType();

		/**
		 * The meta object literal for the '<em><b>Lc Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_CONTROLLER__LC_PROPERTY = eINSTANCE.getLoadController_LcProperty();

		/**
		 * The meta object literal for the '<em><b>Critical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_CONTROLLER__CRITICAL = eINSTANCE.getLoadController_Critical();

		/**
		 * The meta object literal for the '<em><b>Lower Wattage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_CONTROLLER__LOWER_WATTAGE = eINSTANCE.getLoadController_LowerWattage();

		/**
		 * The meta object literal for the '<em><b>Upper Wattage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_CONTROLLER__UPPER_WATTAGE = eINSTANCE.getLoadController_UpperWattage();

		/**
		 * The meta object literal for the '<em><b>Group Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_CONTROLLER__GROUP_ACTION = eINSTANCE.getLoadController_GroupAction();

		/**
		 * The meta object literal for the '{@link mgridml.impl.StorageControllerImpl <em>Storage Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.StorageControllerImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getStorageController()
		 * @generated
		 */
		EClass STORAGE_CONTROLLER = eINSTANCE.getStorageController();

		/**
		 * The meta object literal for the '<em><b>Storage Device Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_CONTROLLER__STORAGE_DEVICE_TYPE = eINSTANCE.getStorageController_StorageDeviceType();

		/**
		 * The meta object literal for the '{@link mgridml.impl.SourceControllerImpl <em>Source Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.SourceControllerImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getSourceController()
		 * @generated
		 */
		EClass SOURCE_CONTROLLER = eINSTANCE.getSourceController();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_CONTROLLER__SOURCE_TYPE = eINSTANCE.getSourceController_SourceType();

		/**
		 * The meta object literal for the '{@link mgridml.impl.PCCImpl <em>PCC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.PCCImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getPCC()
		 * @generated
		 */
		EClass PCC = eINSTANCE.getPCC();

		/**
		 * The meta object literal for the '<em><b>Meter Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PCC__METER_TYPE = eINSTANCE.getPCC_MeterType();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PCC__CONNECTED = eINSTANCE.getPCC_Connected();

		/**
		 * The meta object literal for the '{@link mgridml.impl.MeterTypeImpl <em>Meter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.MeterTypeImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getMeterType()
		 * @generated
		 */
		EClass METER_TYPE = eINSTANCE.getMeterType();

		/**
		 * The meta object literal for the '<em><b>MType ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_TYPE__MTYPE_ID = eINSTANCE.getMeterType_MTypeID();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METER_TYPE__TYPE_NAME = eINSTANCE.getMeterType_TypeName();

		/**
		 * The meta object literal for the '{@link mgridml.impl.SourceTypeImpl <em>Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.SourceTypeImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getSourceType()
		 * @generated
		 */
		EClass SOURCE_TYPE = eINSTANCE.getSourceType();

		/**
		 * The meta object literal for the '<em><b>So Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__SO_TYPE_ID = eINSTANCE.getSourceType_SoTypeID();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__TYPE_NAME = eINSTANCE.getSourceType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Source C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__SOURCE_C = eINSTANCE.getSourceType_SourceC();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_TYPE__PRIORITY = eINSTANCE.getSourceType_Priority();

		/**
		 * The meta object literal for the '{@link mgridml.impl.StorageDeviceTypeImpl <em>Storage Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.StorageDeviceTypeImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getStorageDeviceType()
		 * @generated
		 */
		EClass STORAGE_DEVICE_TYPE = eINSTANCE.getStorageDeviceType();

		/**
		 * The meta object literal for the '<em><b>So Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_DEVICE_TYPE__SO_TYPE_ID = eINSTANCE.getStorageDeviceType_SoTypeID();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_DEVICE_TYPE__TYPE_NAME = eINSTANCE.getStorageDeviceType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Lower Thres</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_DEVICE_TYPE__LOWER_THRES = eINSTANCE.getStorageDeviceType_LowerThres();

		/**
		 * The meta object literal for the '<em><b>Upper Thres</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_DEVICE_TYPE__UPPER_THRES = eINSTANCE.getStorageDeviceType_UpperThres();

		/**
		 * The meta object literal for the '{@link mgridml.impl.LoadDeviceTypeImpl <em>Load Device Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.LoadDeviceTypeImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getLoadDeviceType()
		 * @generated
		 */
		EClass LOAD_DEVICE_TYPE = eINSTANCE.getLoadDeviceType();

		/**
		 * The meta object literal for the '<em><b>So Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_DEVICE_TYPE__SO_TYPE_ID = eINSTANCE.getLoadDeviceType_SoTypeID();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_DEVICE_TYPE__TYPE_NAME = eINSTANCE.getLoadDeviceType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Critical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_DEVICE_TYPE__CRITICAL = eINSTANCE.getLoadDeviceType_Critical();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_DEVICE_TYPE__USAGE = eINSTANCE.getLoadDeviceType_Usage();

		/**
		 * The meta object literal for the '{@link mgridml.impl.LC_PropertyImpl <em>LC Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.LC_PropertyImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getLC_Property()
		 * @generated
		 */
		EClass LC_PROPERTY = eINSTANCE.getLC_Property();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LC_PROPERTY__ATTRIBUTE = eINSTANCE.getLC_Property_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LC_PROPERTY__VALUE = eINSTANCE.getLC_Property_Value();

		/**
		 * The meta object literal for the '{@link mgridml.impl.SmartMTypeImpl <em>Smart MType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.SmartMTypeImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getSmartMType()
		 * @generated
		 */
		EClass SMART_MTYPE = eINSTANCE.getSmartMType();

		/**
		 * The meta object literal for the '{@link mgridml.impl.LegacyMTypeImpl <em>Legacy MType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.impl.LegacyMTypeImpl
		 * @see mgridml.impl.MgridmlPackageImpl#getLegacyMType()
		 * @generated
		 */
		EClass LEGACY_MTYPE = eINSTANCE.getLegacyMType();

		/**
		 * The meta object literal for the '{@link mgridml.CriticalEnum <em>Critical Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.CriticalEnum
		 * @see mgridml.impl.MgridmlPackageImpl#getCriticalEnum()
		 * @generated
		 */
		EEnum CRITICAL_ENUM = eINSTANCE.getCriticalEnum();

		/**
		 * The meta object literal for the '{@link mgridml.SourceEnum <em>Source Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.SourceEnum
		 * @see mgridml.impl.MgridmlPackageImpl#getSourceEnum()
		 * @generated
		 */
		EEnum SOURCE_ENUM = eINSTANCE.getSourceEnum();

		/**
		 * The meta object literal for the '{@link mgridml.ControlEnum <em>Control Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.ControlEnum
		 * @see mgridml.impl.MgridmlPackageImpl#getControlEnum()
		 * @generated
		 */
		EEnum CONTROL_ENUM = eINSTANCE.getControlEnum();

		/**
		 * The meta object literal for the '{@link mgridml.ChargeEnum <em>Charge Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.ChargeEnum
		 * @see mgridml.impl.MgridmlPackageImpl#getChargeEnum()
		 * @generated
		 */
		EEnum CHARGE_ENUM = eINSTANCE.getChargeEnum();

		/**
		 * The meta object literal for the '{@link mgridml.UsageEnum <em>Usage Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mgridml.UsageEnum
		 * @see mgridml.impl.MgridmlPackageImpl#getUsageEnum()
		 * @generated
		 */
		EEnum USAGE_ENUM = eINSTANCE.getUsageEnum();

	}

} //MgridmlPackage
