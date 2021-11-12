/**
 */
package mgridml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mgridml.MgridmlPackage
 * @generated
 */
public interface MgridmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MgridmlFactory eINSTANCE = mgridml.impl.MgridmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MGrid Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MGrid Schema</em>'.
	 * @generated
	 */
	MGridSchema createMGridSchema();

	/**
	 * Returns a new object of class '<em>MGrid Control Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MGrid Control Schema</em>'.
	 * @generated
	 */
	MGridControlSchema createMGridControlSchema();

	/**
	 * Returns a new object of class '<em>MGrid Data Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MGrid Data Schema</em>'.
	 * @generated
	 */
	MGridDataSchema createMGridDataSchema();

	/**
	 * Returns a new object of class '<em>MC Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MC Grid</em>'.
	 * @generated
	 */
	MCGrid createMCGrid();

	/**
	 * Returns a new object of class '<em>MD Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MD Grid</em>'.
	 * @generated
	 */
	MDGrid createMDGrid();

	/**
	 * Returns a new object of class '<em>Plant Elem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plant Elem</em>'.
	 * @generated
	 */
	PlantElem createPlantElem();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Load Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Device</em>'.
	 * @generated
	 */
	LoadDevice createLoadDevice();

	/**
	 * Returns a new object of class '<em>Storage Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Device</em>'.
	 * @generated
	 */
	StorageDevice createStorageDevice();

	/**
	 * Returns a new object of class '<em>Device Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Property</em>'.
	 * @generated
	 */
	DeviceProperty createDeviceProperty();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	Source createSource();

	/**
	 * Returns a new object of class '<em>Smart Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Meter</em>'.
	 * @generated
	 */
	SmartMeter createSmartMeter();

	/**
	 * Returns a new object of class '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter</em>'.
	 * @generated
	 */
	Meter createMeter();

	/**
	 * Returns a new object of class '<em>Legacy Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy Meter</em>'.
	 * @generated
	 */
	LegacyMeter createLegacyMeter();

	/**
	 * Returns a new object of class '<em>MG Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MG Controller</em>'.
	 * @generated
	 */
	MGController createMGController();

	/**
	 * Returns a new object of class '<em>Atomic Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Controller</em>'.
	 * @generated
	 */
	AtomicController createAtomicController();

	/**
	 * Returns a new object of class '<em>MGrid Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MGrid Controller</em>'.
	 * @generated
	 */
	MGridController createMGridController();

	/**
	 * Returns a new object of class '<em>Load Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Controller</em>'.
	 * @generated
	 */
	LoadController createLoadController();

	/**
	 * Returns a new object of class '<em>Storage Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Controller</em>'.
	 * @generated
	 */
	StorageController createStorageController();

	/**
	 * Returns a new object of class '<em>Source Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Controller</em>'.
	 * @generated
	 */
	SourceController createSourceController();

	/**
	 * Returns a new object of class '<em>PCC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCC</em>'.
	 * @generated
	 */
	PCC createPCC();

	/**
	 * Returns a new object of class '<em>Meter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meter Type</em>'.
	 * @generated
	 */
	MeterType createMeterType();

	/**
	 * Returns a new object of class '<em>Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Type</em>'.
	 * @generated
	 */
	SourceType createSourceType();

	/**
	 * Returns a new object of class '<em>Storage Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Device Type</em>'.
	 * @generated
	 */
	StorageDeviceType createStorageDeviceType();

	/**
	 * Returns a new object of class '<em>Load Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Device Type</em>'.
	 * @generated
	 */
	LoadDeviceType createLoadDeviceType();

	/**
	 * Returns a new object of class '<em>LC Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LC Property</em>'.
	 * @generated
	 */
	LC_Property createLC_Property();

	/**
	 * Returns a new object of class '<em>Smart MType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart MType</em>'.
	 * @generated
	 */
	SmartMType createSmartMType();

	/**
	 * Returns a new object of class '<em>Legacy MType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legacy MType</em>'.
	 * @generated
	 */
	LegacyMType createLegacyMType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MgridmlPackage getMgridmlPackage();

} //MgridmlFactory
