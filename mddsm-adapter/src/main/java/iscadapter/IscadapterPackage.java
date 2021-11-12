/**
 */
package iscadapter;

import adapter.AdapterPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see iscadapter.IscadapterFactory
 * @model kind="package"
 * @generated
 */
public interface IscadapterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iscadapter";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/adapter/iscadapter";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iscadapter";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IscadapterPackage eINSTANCE = iscadapter.impl.IscadapterPackageImpl.init();

	/**
	 * The meta object id for the '{@link iscadapter.impl.InterScityAdapterImpl <em>Inter Scity Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.impl.InterScityAdapterImpl
	 * @see iscadapter.impl.IscadapterPackageImpl#getInterScityAdapter()
	 * @generated
	 */
	int INTER_SCITY_ADAPTER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_SCITY_ADAPTER__NAME = AdapterPackage.EADAPTER__NAME;

	/**
	 * The feature id for the '<em><b>Comm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_SCITY_ADAPTER__COMM = AdapterPackage.EADAPTER__COMM;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_SCITY_ADAPTER__RESOURCES = AdapterPackage.EADAPTER__RESOURCES;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_SCITY_ADAPTER__COMPONENTS = AdapterPackage.EADAPTER__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Dscs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_SCITY_ADAPTER__DSCS = AdapterPackage.EADAPTER__DSCS;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_SCITY_ADAPTER__ENTITY = AdapterPackage.EADAPTER__ENTITY;

	/**
	 * The number of structural features of the '<em>Inter Scity Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_SCITY_ADAPTER_FEATURE_COUNT = AdapterPackage.EADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inter Scity Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_SCITY_ADAPTER_OPERATION_COUNT = AdapterPackage.EADAPTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iscadapter.impl.ISCCommImpl <em>ISC Comm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.impl.ISCCommImpl
	 * @see iscadapter.impl.IscadapterPackageImpl#getISCComm()
	 * @generated
	 */
	int ISC_COMM = 1;

	/**
	 * The feature id for the '<em><b>Api</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_COMM__API = AdapterPackage.ECOMMUNICATION__API;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_COMM__TARGET = AdapterPackage.ECOMMUNICATION__TARGET;

	/**
	 * The feature id for the '<em><b>Data Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_COMM__DATA_SUPPORTED = AdapterPackage.ECOMMUNICATION__DATA_SUPPORTED;

	/**
	 * The number of structural features of the '<em>ISC Comm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_COMM_FEATURE_COUNT = AdapterPackage.ECOMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISC Comm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_COMM_OPERATION_COUNT = AdapterPackage.ECOMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iscadapter.impl.ISCResourceImpl <em>ISC Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.impl.ISCResourceImpl
	 * @see iscadapter.impl.IscadapterPackageImpl#getISCResource()
	 * @generated
	 */
	int ISC_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE__NAME = AdapterPackage.ERESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE__URI = AdapterPackage.ERESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE__DESCRIPTION = AdapterPackage.ERESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arrange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE__ARRANGE = AdapterPackage.ERESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE__COMPOSITION = AdapterPackage.ERESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE__PROPERTIES = AdapterPackage.ERESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE__CAPABILITIES = AdapterPackage.ERESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE__STATUS = AdapterPackage.ERESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE__LAT = AdapterPackage.ERESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE__LONG = AdapterPackage.ERESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>DS Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE__DS_ENTITY = AdapterPackage.ERESOURCE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>ISC Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE_FEATURE_COUNT = AdapterPackage.ERESOURCE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>ISC Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISC_RESOURCE_OPERATION_COUNT = AdapterPackage.ERESOURCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link iscadapter.InterScityAdapter <em>Inter Scity Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Scity Adapter</em>'.
	 * @see iscadapter.InterScityAdapter
	 * @generated
	 */
	EClass getInterScityAdapter();

	/**
	 * Returns the meta object for class '{@link iscadapter.ISCComm <em>ISC Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISC Comm</em>'.
	 * @see iscadapter.ISCComm
	 * @generated
	 */
	EClass getISCComm();

	/**
	 * Returns the meta object for class '{@link iscadapter.ISCResource <em>ISC Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISC Resource</em>'.
	 * @see iscadapter.ISCResource
	 * @generated
	 */
	EClass getISCResource();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.ISCResource#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see iscadapter.ISCResource#getUri()
	 * @see #getISCResource()
	 * @generated
	 */
	EAttribute getISCResource_Uri();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.ISCResource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iscadapter.ISCResource#getDescription()
	 * @see #getISCResource()
	 * @generated
	 */
	EAttribute getISCResource_Description();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.ISCResource#getArrange <em>Arrange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrange</em>'.
	 * @see iscadapter.ISCResource#getArrange()
	 * @see #getISCResource()
	 * @generated
	 */
	EAttribute getISCResource_Arrange();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.ISCResource#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composition</em>'.
	 * @see iscadapter.ISCResource#getComposition()
	 * @see #getISCResource()
	 * @generated
	 */
	EAttribute getISCResource_Composition();

	/**
	 * Returns the meta object for the containment reference list '{@link iscadapter.ISCResource#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see iscadapter.ISCResource#getProperties()
	 * @see #getISCResource()
	 * @generated
	 */
	EReference getISCResource_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link iscadapter.ISCResource#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see iscadapter.ISCResource#getCapabilities()
	 * @see #getISCResource()
	 * @generated
	 */
	EReference getISCResource_Capabilities();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.ISCResource#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see iscadapter.ISCResource#getStatus()
	 * @see #getISCResource()
	 * @generated
	 */
	EAttribute getISCResource_Status();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.ISCResource#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see iscadapter.ISCResource#getLat()
	 * @see #getISCResource()
	 * @generated
	 */
	EAttribute getISCResource_Lat();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.ISCResource#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see iscadapter.ISCResource#getLong()
	 * @see #getISCResource()
	 * @generated
	 */
	EAttribute getISCResource_Long();

	/**
	 * Returns the meta object for the reference '{@link iscadapter.ISCResource#getDSEntity <em>DS Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DS Entity</em>'.
	 * @see iscadapter.ISCResource#getDSEntity()
	 * @see #getISCResource()
	 * @generated
	 */
	EReference getISCResource_DSEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IscadapterFactory getIscadapterFactory();

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
		 * The meta object literal for the '{@link iscadapter.impl.InterScityAdapterImpl <em>Inter Scity Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.impl.InterScityAdapterImpl
		 * @see iscadapter.impl.IscadapterPackageImpl#getInterScityAdapter()
		 * @generated
		 */
		EClass INTER_SCITY_ADAPTER = eINSTANCE.getInterScityAdapter();

		/**
		 * The meta object literal for the '{@link iscadapter.impl.ISCCommImpl <em>ISC Comm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.impl.ISCCommImpl
		 * @see iscadapter.impl.IscadapterPackageImpl#getISCComm()
		 * @generated
		 */
		EClass ISC_COMM = eINSTANCE.getISCComm();

		/**
		 * The meta object literal for the '{@link iscadapter.impl.ISCResourceImpl <em>ISC Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.impl.ISCResourceImpl
		 * @see iscadapter.impl.IscadapterPackageImpl#getISCResource()
		 * @generated
		 */
		EClass ISC_RESOURCE = eINSTANCE.getISCResource();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISC_RESOURCE__URI = eINSTANCE.getISCResource_Uri();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISC_RESOURCE__DESCRIPTION = eINSTANCE.getISCResource_Description();

		/**
		 * The meta object literal for the '<em><b>Arrange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISC_RESOURCE__ARRANGE = eINSTANCE.getISCResource_Arrange();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISC_RESOURCE__COMPOSITION = eINSTANCE.getISCResource_Composition();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISC_RESOURCE__PROPERTIES = eINSTANCE.getISCResource_Properties();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISC_RESOURCE__CAPABILITIES = eINSTANCE.getISCResource_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISC_RESOURCE__STATUS = eINSTANCE.getISCResource_Status();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISC_RESOURCE__LAT = eINSTANCE.getISCResource_Lat();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISC_RESOURCE__LONG = eINSTANCE.getISCResource_Long();

		/**
		 * The meta object literal for the '<em><b>DS Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISC_RESOURCE__DS_ENTITY = eINSTANCE.getISCResource_DSEntity();

	}

} //IscadapterPackage
