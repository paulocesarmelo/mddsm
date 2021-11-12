/**
 */
package adapter;

import dsk.DskPackage;
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
 * @see adapter.AdapterFactory
 * @model kind="package"
 * @generated
 */
public interface AdapterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adapter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/adapter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "adapter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdapterPackage eINSTANCE = adapter.impl.AdapterPackageImpl.init();

	/**
	 * The meta object id for the '{@link adapter.impl.EAdapterImpl <em>EAdapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.impl.EAdapterImpl
	 * @see adapter.impl.AdapterPackageImpl#getEAdapter()
	 * @generated
	 */
	int EADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADAPTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Comm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADAPTER__COMM = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADAPTER__RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADAPTER__COMPONENTS = 3;

	/**
	 * The feature id for the '<em><b>Dscs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADAPTER__DSCS = 4;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADAPTER__ENTITY = 5;

	/**
	 * The number of structural features of the '<em>EAdapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADAPTER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>EAdapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EADAPTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adapter.impl.ECommunicationImpl <em>ECommunication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.impl.ECommunicationImpl
	 * @see adapter.impl.AdapterPackageImpl#getECommunication()
	 * @generated
	 */
	int ECOMMUNICATION = 1;

	/**
	 * The feature id for the '<em><b>Api</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMUNICATION__API = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMUNICATION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Data Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMUNICATION__DATA_SUPPORTED = 2;

	/**
	 * The number of structural features of the '<em>ECommunication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMUNICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ECommunication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMUNICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adapter.impl.EResourceImpl <em>EResource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.impl.EResourceImpl
	 * @see adapter.impl.AdapterPackageImpl#getEResource()
	 * @generated
	 */
	int ERESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERESOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>EResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adapter.impl.EComponentImpl <em>EComponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.impl.EComponentImpl
	 * @see adapter.impl.AdapterPackageImpl#getEComponent()
	 * @generated
	 */
	int ECOMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>EComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adapter.impl.EDataImpl <em>EData</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.impl.EDataImpl
	 * @see adapter.impl.AdapterPackageImpl#getEData()
	 * @generated
	 */
	int EDATA = 4;

	/**
	 * The number of structural features of the '<em>EData</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EData</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link adapter.impl.EEntityImpl <em>EEntity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.impl.EEntityImpl
	 * @see adapter.impl.AdapterPackageImpl#getEEntity()
	 * @generated
	 */
	int EENTITY = 5;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENTITY__COMMAND_PRIORITY = DskPackage.EDS_ENTITY__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENTITY__CMD = DskPackage.EDS_ENTITY__CMD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENTITY__NAME = DskPackage.EDS_ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>EEntity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENTITY_FEATURE_COUNT = DskPackage.EDS_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EEntity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENTITY_OPERATION_COUNT = DskPackage.EDS_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adapter.impl.EDSCmdImpl <em>EDS Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.impl.EDSCmdImpl
	 * @see adapter.impl.AdapterPackageImpl#getEDSCmd()
	 * @generated
	 */
	int EDS_CMD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_CMD__NAME = DskPackage.EDSC__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_CMD__KIND = DskPackage.EDSC__KIND;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_CMD__PARAMETERS = DskPackage.EDSC__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_CMD__ENTITY = DskPackage.EDSC__ENTITY;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_CMD__CONDITION = DskPackage.EDSC__CONDITION;

	/**
	 * The number of structural features of the '<em>EDS Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_CMD_FEATURE_COUNT = DskPackage.EDSC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EDS Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_CMD_OPERATION_COUNT = DskPackage.EDSC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link adapter.ECommAPI <em>EComm API</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.ECommAPI
	 * @see adapter.impl.AdapterPackageImpl#getECommAPI()
	 * @generated
	 */
	int ECOMM_API = 7;

	/**
	 * The meta object id for the '{@link adapter.EDataFormat <em>EData Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adapter.EDataFormat
	 * @see adapter.impl.AdapterPackageImpl#getEDataFormat()
	 * @generated
	 */
	int EDATA_FORMAT = 8;


	/**
	 * Returns the meta object for class '{@link adapter.EAdapter <em>EAdapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAdapter</em>'.
	 * @see adapter.EAdapter
	 * @generated
	 */
	EClass getEAdapter();

	/**
	 * Returns the meta object for the attribute '{@link adapter.EAdapter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adapter.EAdapter#getName()
	 * @see #getEAdapter()
	 * @generated
	 */
	EAttribute getEAdapter_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.EAdapter#getComm <em>Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comm</em>'.
	 * @see adapter.EAdapter#getComm()
	 * @see #getEAdapter()
	 * @generated
	 */
	EReference getEAdapter_Comm();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.EAdapter#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see adapter.EAdapter#getResources()
	 * @see #getEAdapter()
	 * @generated
	 */
	EReference getEAdapter_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.EAdapter#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see adapter.EAdapter#getComponents()
	 * @see #getEAdapter()
	 * @generated
	 */
	EReference getEAdapter_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.EAdapter#getDscs <em>Dscs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dscs</em>'.
	 * @see adapter.EAdapter#getDscs()
	 * @see #getEAdapter()
	 * @generated
	 */
	EReference getEAdapter_Dscs();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.EAdapter#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see adapter.EAdapter#getEntity()
	 * @see #getEAdapter()
	 * @generated
	 */
	EReference getEAdapter_Entity();

	/**
	 * Returns the meta object for class '{@link adapter.ECommunication <em>ECommunication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECommunication</em>'.
	 * @see adapter.ECommunication
	 * @generated
	 */
	EClass getECommunication();

	/**
	 * Returns the meta object for the attribute '{@link adapter.ECommunication#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Api</em>'.
	 * @see adapter.ECommunication#getApi()
	 * @see #getECommunication()
	 * @generated
	 */
	EAttribute getECommunication_Api();

	/**
	 * Returns the meta object for the containment reference list '{@link adapter.ECommunication#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see adapter.ECommunication#getTarget()
	 * @see #getECommunication()
	 * @generated
	 */
	EReference getECommunication_Target();

	/**
	 * Returns the meta object for the attribute '{@link adapter.ECommunication#getDataSupported <em>Data Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Supported</em>'.
	 * @see adapter.ECommunication#getDataSupported()
	 * @see #getECommunication()
	 * @generated
	 */
	EAttribute getECommunication_DataSupported();

	/**
	 * Returns the meta object for class '{@link adapter.EResource <em>EResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EResource</em>'.
	 * @see adapter.EResource
	 * @generated
	 */
	EClass getEResource();

	/**
	 * Returns the meta object for the attribute '{@link adapter.EResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adapter.EResource#getName()
	 * @see #getEResource()
	 * @generated
	 */
	EAttribute getEResource_Name();

	/**
	 * Returns the meta object for class '{@link adapter.EComponent <em>EComponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EComponent</em>'.
	 * @see adapter.EComponent
	 * @generated
	 */
	EClass getEComponent();

	/**
	 * Returns the meta object for the attribute '{@link adapter.EComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adapter.EComponent#getName()
	 * @see #getEComponent()
	 * @generated
	 */
	EAttribute getEComponent_Name();

	/**
	 * Returns the meta object for class '{@link adapter.EData <em>EData</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EData</em>'.
	 * @see adapter.EData
	 * @generated
	 */
	EClass getEData();

	/**
	 * Returns the meta object for class '{@link adapter.EEntity <em>EEntity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEntity</em>'.
	 * @see adapter.EEntity
	 * @generated
	 */
	EClass getEEntity();

	/**
	 * Returns the meta object for class '{@link adapter.EDSCmd <em>EDS Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDS Cmd</em>'.
	 * @see adapter.EDSCmd
	 * @generated
	 */
	EClass getEDSCmd();

	/**
	 * Returns the meta object for enum '{@link adapter.ECommAPI <em>EComm API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EComm API</em>'.
	 * @see adapter.ECommAPI
	 * @generated
	 */
	EEnum getECommAPI();

	/**
	 * Returns the meta object for enum '{@link adapter.EDataFormat <em>EData Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EData Format</em>'.
	 * @see adapter.EDataFormat
	 * @generated
	 */
	EEnum getEDataFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdapterFactory getAdapterFactory();

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
		 * The meta object literal for the '{@link adapter.impl.EAdapterImpl <em>EAdapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.impl.EAdapterImpl
		 * @see adapter.impl.AdapterPackageImpl#getEAdapter()
		 * @generated
		 */
		EClass EADAPTER = eINSTANCE.getEAdapter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EADAPTER__NAME = eINSTANCE.getEAdapter_Name();

		/**
		 * The meta object literal for the '<em><b>Comm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EADAPTER__COMM = eINSTANCE.getEAdapter_Comm();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EADAPTER__RESOURCES = eINSTANCE.getEAdapter_Resources();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EADAPTER__COMPONENTS = eINSTANCE.getEAdapter_Components();

		/**
		 * The meta object literal for the '<em><b>Dscs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EADAPTER__DSCS = eINSTANCE.getEAdapter_Dscs();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EADAPTER__ENTITY = eINSTANCE.getEAdapter_Entity();

		/**
		 * The meta object literal for the '{@link adapter.impl.ECommunicationImpl <em>ECommunication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.impl.ECommunicationImpl
		 * @see adapter.impl.AdapterPackageImpl#getECommunication()
		 * @generated
		 */
		EClass ECOMMUNICATION = eINSTANCE.getECommunication();

		/**
		 * The meta object literal for the '<em><b>Api</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMMUNICATION__API = eINSTANCE.getECommunication_Api();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMMUNICATION__TARGET = eINSTANCE.getECommunication_Target();

		/**
		 * The meta object literal for the '<em><b>Data Supported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMMUNICATION__DATA_SUPPORTED = eINSTANCE.getECommunication_DataSupported();

		/**
		 * The meta object literal for the '{@link adapter.impl.EResourceImpl <em>EResource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.impl.EResourceImpl
		 * @see adapter.impl.AdapterPackageImpl#getEResource()
		 * @generated
		 */
		EClass ERESOURCE = eINSTANCE.getEResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERESOURCE__NAME = eINSTANCE.getEResource_Name();

		/**
		 * The meta object literal for the '{@link adapter.impl.EComponentImpl <em>EComponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.impl.EComponentImpl
		 * @see adapter.impl.AdapterPackageImpl#getEComponent()
		 * @generated
		 */
		EClass ECOMPONENT = eINSTANCE.getEComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMPONENT__NAME = eINSTANCE.getEComponent_Name();

		/**
		 * The meta object literal for the '{@link adapter.impl.EDataImpl <em>EData</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.impl.EDataImpl
		 * @see adapter.impl.AdapterPackageImpl#getEData()
		 * @generated
		 */
		EClass EDATA = eINSTANCE.getEData();

		/**
		 * The meta object literal for the '{@link adapter.impl.EEntityImpl <em>EEntity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.impl.EEntityImpl
		 * @see adapter.impl.AdapterPackageImpl#getEEntity()
		 * @generated
		 */
		EClass EENTITY = eINSTANCE.getEEntity();

		/**
		 * The meta object literal for the '{@link adapter.impl.EDSCmdImpl <em>EDS Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.impl.EDSCmdImpl
		 * @see adapter.impl.AdapterPackageImpl#getEDSCmd()
		 * @generated
		 */
		EClass EDS_CMD = eINSTANCE.getEDSCmd();

		/**
		 * The meta object literal for the '{@link adapter.ECommAPI <em>EComm API</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.ECommAPI
		 * @see adapter.impl.AdapterPackageImpl#getECommAPI()
		 * @generated
		 */
		EEnum ECOMM_API = eINSTANCE.getECommAPI();

		/**
		 * The meta object literal for the '{@link adapter.EDataFormat <em>EData Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adapter.EDataFormat
		 * @see adapter.impl.AdapterPackageImpl#getEDataFormat()
		 * @generated
		 */
		EEnum EDATA_FORMAT = eINSTANCE.getEDataFormat();

	}

} //AdapterPackage
