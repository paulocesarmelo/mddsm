/**
 */
package iscadapter.components;

import adapter.AdapterPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see iscadapter.components.ComponentsFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "components";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/adapter/isc-adapter/components";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "components";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsPackage eINSTANCE = iscadapter.components.impl.ComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link iscadapter.components.impl.ResourceDiscoveryImpl <em>Resource Discovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.components.impl.ResourceDiscoveryImpl
	 * @see iscadapter.components.impl.ComponentsPackageImpl#getResourceDiscovery()
	 * @generated
	 */
	int RESOURCE_DISCOVERY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DISCOVERY__NAME = AdapterPackage.ECOMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DISCOVERY__ROUTE = AdapterPackage.ECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Discovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DISCOVERY_FEATURE_COUNT = AdapterPackage.ECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Resource Discovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_DISCOVERY_OPERATION_COUNT = AdapterPackage.ECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iscadapter.components.impl.DataCollectorImpl <em>Data Collector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.components.impl.DataCollectorImpl
	 * @see iscadapter.components.impl.ComponentsPackageImpl#getDataCollector()
	 * @generated
	 */
	int DATA_COLLECTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTOR__NAME = AdapterPackage.ECOMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTOR__ROUTE = AdapterPackage.ECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTOR_FEATURE_COUNT = AdapterPackage.ECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Collector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_COLLECTOR_OPERATION_COUNT = AdapterPackage.ECOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iscadapter.components.impl.ActuatorControllerImpl <em>Actuator Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.components.impl.ActuatorControllerImpl
	 * @see iscadapter.components.impl.ComponentsPackageImpl#getActuatorController()
	 * @generated
	 */
	int ACTUATOR_CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_CONTROLLER__NAME = AdapterPackage.ECOMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_CONTROLLER__ROUTE = AdapterPackage.ECOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_CONTROLLER_FEATURE_COUNT = AdapterPackage.ECOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actuator Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_CONTROLLER_OPERATION_COUNT = AdapterPackage.ECOMPONENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link iscadapter.components.ResourceDiscovery <em>Resource Discovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Discovery</em>'.
	 * @see iscadapter.components.ResourceDiscovery
	 * @generated
	 */
	EClass getResourceDiscovery();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.components.ResourceDiscovery#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see iscadapter.components.ResourceDiscovery#getRoute()
	 * @see #getResourceDiscovery()
	 * @generated
	 */
	EAttribute getResourceDiscovery_Route();

	/**
	 * Returns the meta object for class '{@link iscadapter.components.DataCollector <em>Data Collector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Collector</em>'.
	 * @see iscadapter.components.DataCollector
	 * @generated
	 */
	EClass getDataCollector();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.components.DataCollector#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see iscadapter.components.DataCollector#getRoute()
	 * @see #getDataCollector()
	 * @generated
	 */
	EAttribute getDataCollector_Route();

	/**
	 * Returns the meta object for class '{@link iscadapter.components.ActuatorController <em>Actuator Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Controller</em>'.
	 * @see iscadapter.components.ActuatorController
	 * @generated
	 */
	EClass getActuatorController();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.components.ActuatorController#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see iscadapter.components.ActuatorController#getRoute()
	 * @see #getActuatorController()
	 * @generated
	 */
	EAttribute getActuatorController_Route();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentsFactory getComponentsFactory();

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
		 * The meta object literal for the '{@link iscadapter.components.impl.ResourceDiscoveryImpl <em>Resource Discovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.components.impl.ResourceDiscoveryImpl
		 * @see iscadapter.components.impl.ComponentsPackageImpl#getResourceDiscovery()
		 * @generated
		 */
		EClass RESOURCE_DISCOVERY = eINSTANCE.getResourceDiscovery();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_DISCOVERY__ROUTE = eINSTANCE.getResourceDiscovery_Route();

		/**
		 * The meta object literal for the '{@link iscadapter.components.impl.DataCollectorImpl <em>Data Collector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.components.impl.DataCollectorImpl
		 * @see iscadapter.components.impl.ComponentsPackageImpl#getDataCollector()
		 * @generated
		 */
		EClass DATA_COLLECTOR = eINSTANCE.getDataCollector();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_COLLECTOR__ROUTE = eINSTANCE.getDataCollector_Route();

		/**
		 * The meta object literal for the '{@link iscadapter.components.impl.ActuatorControllerImpl <em>Actuator Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.components.impl.ActuatorControllerImpl
		 * @see iscadapter.components.impl.ComponentsPackageImpl#getActuatorController()
		 * @generated
		 */
		EClass ACTUATOR_CONTROLLER = eINSTANCE.getActuatorController();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR_CONTROLLER__ROUTE = eINSTANCE.getActuatorController_Route();

	}

} //ComponentsPackage
