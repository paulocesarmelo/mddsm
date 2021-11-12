/**
 */
package iscadapter.resources;

import iscadapter.IscadapterPackage;

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
 * @see iscadapter.resources.ResourcesFactory
 * @model kind="package"
 * @generated
 */
public interface ResourcesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resources";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/adapter/isc-adapter/resources";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcesPackage eINSTANCE = iscadapter.resources.impl.ResourcesPackageImpl.init();

	/**
	 * The meta object id for the '{@link iscadapter.resources.impl.CompositeResourceImpl <em>Composite Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.resources.impl.CompositeResourceImpl
	 * @see iscadapter.resources.impl.ResourcesPackageImpl#getCompositeResource()
	 * @generated
	 */
	int COMPOSITE_RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE__NAME = IscadapterPackage.ISC_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE__URI = IscadapterPackage.ISC_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE__DESCRIPTION = IscadapterPackage.ISC_RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Arrange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE__ARRANGE = IscadapterPackage.ISC_RESOURCE__ARRANGE;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE__COMPOSITION = IscadapterPackage.ISC_RESOURCE__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE__PROPERTIES = IscadapterPackage.ISC_RESOURCE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE__CAPABILITIES = IscadapterPackage.ISC_RESOURCE__CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE__STATUS = IscadapterPackage.ISC_RESOURCE__STATUS;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE__LAT = IscadapterPackage.ISC_RESOURCE__LAT;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE__LONG = IscadapterPackage.ISC_RESOURCE__LONG;

	/**
	 * The feature id for the '<em><b>DS Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE__DS_ENTITY = IscadapterPackage.ISC_RESOURCE__DS_ENTITY;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE__RESOURCE = IscadapterPackage.ISC_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE_FEATURE_COUNT = IscadapterPackage.ISC_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RESOURCE_OPERATION_COUNT = IscadapterPackage.ISC_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iscadapter.resources.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.resources.impl.SensorImpl
	 * @see iscadapter.resources.impl.ResourcesPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iscadapter.resources.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.resources.impl.ActuatorImpl
	 * @see iscadapter.resources.impl.ResourcesPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 2;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iscadapter.resources.impl.ResourcePropertyImpl <em>Resource Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.resources.impl.ResourcePropertyImpl
	 * @see iscadapter.resources.impl.ResourcesPackageImpl#getResourceProperty()
	 * @generated
	 */
	int RESOURCE_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__ATTR = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Resource Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iscadapter.resources.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.resources.impl.CapabilityImpl
	 * @see iscadapter.resources.impl.ResourcesPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Dsc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DSC = 4;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iscadapter.resources.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.resources.impl.LocationImpl
	 * @see iscadapter.resources.impl.ResourcesPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LAT = 0;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONG = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iscadapter.resources.CompositionType <em>Composition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.resources.CompositionType
	 * @see iscadapter.resources.impl.ResourcesPackageImpl#getCompositionType()
	 * @generated
	 */
	int COMPOSITION_TYPE = 6;

	/**
	 * The meta object id for the '{@link iscadapter.resources.ArrangementType <em>Arrangement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.resources.ArrangementType
	 * @see iscadapter.resources.impl.ResourcesPackageImpl#getArrangementType()
	 * @generated
	 */
	int ARRANGEMENT_TYPE = 7;

	/**
	 * The meta object id for the '{@link iscadapter.resources.ResourceType <em>Resource Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iscadapter.resources.ResourceType
	 * @see iscadapter.resources.impl.ResourcesPackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link iscadapter.resources.CompositeResource <em>Composite Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Resource</em>'.
	 * @see iscadapter.resources.CompositeResource
	 * @generated
	 */
	EClass getCompositeResource();

	/**
	 * Returns the meta object for the containment reference list '{@link iscadapter.resources.CompositeResource#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see iscadapter.resources.CompositeResource#getResource()
	 * @see #getCompositeResource()
	 * @generated
	 */
	EReference getCompositeResource_Resource();

	/**
	 * Returns the meta object for class '{@link iscadapter.resources.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see iscadapter.resources.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link iscadapter.resources.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see iscadapter.resources.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link iscadapter.resources.ResourceProperty <em>Resource Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Property</em>'.
	 * @see iscadapter.resources.ResourceProperty
	 * @generated
	 */
	EClass getResourceProperty();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.resources.ResourceProperty#getAttr <em>Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr</em>'.
	 * @see iscadapter.resources.ResourceProperty#getAttr()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_Attr();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.resources.ResourceProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iscadapter.resources.ResourceProperty#getValue()
	 * @see #getResourceProperty()
	 * @generated
	 */
	EAttribute getResourceProperty_Value();

	/**
	 * Returns the meta object for class '{@link iscadapter.resources.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see iscadapter.resources.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.resources.Capability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iscadapter.resources.Capability#getName()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Name();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.resources.Capability#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see iscadapter.resources.Capability#getDescription()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Description();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.resources.Capability#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see iscadapter.resources.Capability#getFunction()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Function();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.resources.Capability#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see iscadapter.resources.Capability#getValue()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link iscadapter.resources.Capability#getDsc <em>Dsc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dsc</em>'.
	 * @see iscadapter.resources.Capability#getDsc()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Dsc();

	/**
	 * Returns the meta object for class '{@link iscadapter.resources.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see iscadapter.resources.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.resources.Location#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see iscadapter.resources.Location#getLat()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Lat();

	/**
	 * Returns the meta object for the attribute '{@link iscadapter.resources.Location#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see iscadapter.resources.Location#getLong()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Long();

	/**
	 * Returns the meta object for enum '{@link iscadapter.resources.CompositionType <em>Composition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Composition Type</em>'.
	 * @see iscadapter.resources.CompositionType
	 * @generated
	 */
	EEnum getCompositionType();

	/**
	 * Returns the meta object for enum '{@link iscadapter.resources.ArrangementType <em>Arrangement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arrangement Type</em>'.
	 * @see iscadapter.resources.ArrangementType
	 * @generated
	 */
	EEnum getArrangementType();

	/**
	 * Returns the meta object for enum '{@link iscadapter.resources.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Type</em>'.
	 * @see iscadapter.resources.ResourceType
	 * @generated
	 */
	EEnum getResourceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourcesFactory getResourcesFactory();

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
		 * The meta object literal for the '{@link iscadapter.resources.impl.CompositeResourceImpl <em>Composite Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.resources.impl.CompositeResourceImpl
		 * @see iscadapter.resources.impl.ResourcesPackageImpl#getCompositeResource()
		 * @generated
		 */
		EClass COMPOSITE_RESOURCE = eINSTANCE.getCompositeResource();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_RESOURCE__RESOURCE = eINSTANCE.getCompositeResource_Resource();

		/**
		 * The meta object literal for the '{@link iscadapter.resources.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.resources.impl.SensorImpl
		 * @see iscadapter.resources.impl.ResourcesPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link iscadapter.resources.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.resources.impl.ActuatorImpl
		 * @see iscadapter.resources.impl.ResourcesPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link iscadapter.resources.impl.ResourcePropertyImpl <em>Resource Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.resources.impl.ResourcePropertyImpl
		 * @see iscadapter.resources.impl.ResourcesPackageImpl#getResourceProperty()
		 * @generated
		 */
		EClass RESOURCE_PROPERTY = eINSTANCE.getResourceProperty();

		/**
		 * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__ATTR = eINSTANCE.getResourceProperty_Attr();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPERTY__VALUE = eINSTANCE.getResourceProperty_Value();

		/**
		 * The meta object literal for the '{@link iscadapter.resources.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.resources.impl.CapabilityImpl
		 * @see iscadapter.resources.impl.ResourcesPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__NAME = eINSTANCE.getCapability_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__DESCRIPTION = eINSTANCE.getCapability_Description();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__FUNCTION = eINSTANCE.getCapability_Function();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__VALUE = eINSTANCE.getCapability_Value();

		/**
		 * The meta object literal for the '<em><b>Dsc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__DSC = eINSTANCE.getCapability_Dsc();

		/**
		 * The meta object literal for the '{@link iscadapter.resources.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.resources.impl.LocationImpl
		 * @see iscadapter.resources.impl.ResourcesPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LAT = eINSTANCE.getLocation_Lat();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONG = eINSTANCE.getLocation_Long();

		/**
		 * The meta object literal for the '{@link iscadapter.resources.CompositionType <em>Composition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.resources.CompositionType
		 * @see iscadapter.resources.impl.ResourcesPackageImpl#getCompositionType()
		 * @generated
		 */
		EEnum COMPOSITION_TYPE = eINSTANCE.getCompositionType();

		/**
		 * The meta object literal for the '{@link iscadapter.resources.ArrangementType <em>Arrangement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.resources.ArrangementType
		 * @see iscadapter.resources.impl.ResourcesPackageImpl#getArrangementType()
		 * @generated
		 */
		EEnum ARRANGEMENT_TYPE = eINSTANCE.getArrangementType();

		/**
		 * The meta object literal for the '{@link iscadapter.resources.ResourceType <em>Resource Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iscadapter.resources.ResourceType
		 * @see iscadapter.resources.impl.ResourcesPackageImpl#getResourceType()
		 * @generated
		 */
		EEnum RESOURCE_TYPE = eINSTANCE.getResourceType();

	}

} //ResourcesPackage
