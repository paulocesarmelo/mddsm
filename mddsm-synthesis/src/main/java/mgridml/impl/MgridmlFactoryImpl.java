/**
 */
package mgridml.impl;

import mgridml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MgridmlFactoryImpl extends EFactoryImpl implements MgridmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MgridmlFactory init() {
		try {
			MgridmlFactory theMgridmlFactory = (MgridmlFactory)EPackage.Registry.INSTANCE.getEFactory(MgridmlPackage.eNS_URI);
			if (theMgridmlFactory != null) {
				return theMgridmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MgridmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MgridmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MgridmlPackage.MGRID_SCHEMA: return createMGridSchema();
			case MgridmlPackage.MGRID_CONTROL_SCHEMA: return createMGridControlSchema();
			case MgridmlPackage.MGRID_DATA_SCHEMA: return createMGridDataSchema();
			case MgridmlPackage.MC_GRID: return createMCGrid();
			case MgridmlPackage.MD_GRID: return createMDGrid();
			case MgridmlPackage.PLANT_ELEM: return createPlantElem();
			case MgridmlPackage.DEVICE: return createDevice();
			case MgridmlPackage.LOAD_DEVICE: return createLoadDevice();
			case MgridmlPackage.STORAGE_DEVICE: return createStorageDevice();
			case MgridmlPackage.DEVICE_PROPERTY: return createDeviceProperty();
			case MgridmlPackage.SOURCE: return createSource();
			case MgridmlPackage.SMART_METER: return createSmartMeter();
			case MgridmlPackage.METER: return createMeter();
			case MgridmlPackage.LEGACY_METER: return createLegacyMeter();
			case MgridmlPackage.MG_CONTROLLER: return createMGController();
			case MgridmlPackage.ATOMIC_CONTROLLER: return createAtomicController();
			case MgridmlPackage.MGRID_CONTROLLER: return createMGridController();
			case MgridmlPackage.LOAD_CONTROLLER: return createLoadController();
			case MgridmlPackage.STORAGE_CONTROLLER: return createStorageController();
			case MgridmlPackage.SOURCE_CONTROLLER: return createSourceController();
			case MgridmlPackage.PCC: return createPCC();
			case MgridmlPackage.METER_TYPE: return createMeterType();
			case MgridmlPackage.SOURCE_TYPE: return createSourceType();
			case MgridmlPackage.STORAGE_DEVICE_TYPE: return createStorageDeviceType();
			case MgridmlPackage.LOAD_DEVICE_TYPE: return createLoadDeviceType();
			case MgridmlPackage.LC_PROPERTY: return createLC_Property();
			case MgridmlPackage.SMART_MTYPE: return createSmartMType();
			case MgridmlPackage.LEGACY_MTYPE: return createLegacyMType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MgridmlPackage.CRITICAL_ENUM:
				return createCriticalEnumFromString(eDataType, initialValue);
			case MgridmlPackage.SOURCE_ENUM:
				return createSourceEnumFromString(eDataType, initialValue);
			case MgridmlPackage.CONTROL_ENUM:
				return createControlEnumFromString(eDataType, initialValue);
			case MgridmlPackage.CHARGE_ENUM:
				return createChargeEnumFromString(eDataType, initialValue);
			case MgridmlPackage.USAGE_ENUM:
				return createUsageEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MgridmlPackage.CRITICAL_ENUM:
				return convertCriticalEnumToString(eDataType, instanceValue);
			case MgridmlPackage.SOURCE_ENUM:
				return convertSourceEnumToString(eDataType, instanceValue);
			case MgridmlPackage.CONTROL_ENUM:
				return convertControlEnumToString(eDataType, instanceValue);
			case MgridmlPackage.CHARGE_ENUM:
				return convertChargeEnumToString(eDataType, instanceValue);
			case MgridmlPackage.USAGE_ENUM:
				return convertUsageEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGridSchema createMGridSchema() {
		MGridSchemaImpl mGridSchema = new MGridSchemaImpl();
		return mGridSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGridControlSchema createMGridControlSchema() {
		MGridControlSchemaImpl mGridControlSchema = new MGridControlSchemaImpl();
		return mGridControlSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGridDataSchema createMGridDataSchema() {
		MGridDataSchemaImpl mGridDataSchema = new MGridDataSchemaImpl();
		return mGridDataSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCGrid createMCGrid() {
		MCGridImpl mcGrid = new MCGridImpl();
		return mcGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDGrid createMDGrid() {
		MDGridImpl mdGrid = new MDGridImpl();
		return mdGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantElem createPlantElem() {
		PlantElemImpl plantElem = new PlantElemImpl();
		return plantElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadDevice createLoadDevice() {
		LoadDeviceImpl loadDevice = new LoadDeviceImpl();
		return loadDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageDevice createStorageDevice() {
		StorageDeviceImpl storageDevice = new StorageDeviceImpl();
		return storageDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceProperty createDeviceProperty() {
		DevicePropertyImpl deviceProperty = new DevicePropertyImpl();
		return deviceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartMeter createSmartMeter() {
		SmartMeterImpl smartMeter = new SmartMeterImpl();
		return smartMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meter createMeter() {
		MeterImpl meter = new MeterImpl();
		return meter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyMeter createLegacyMeter() {
		LegacyMeterImpl legacyMeter = new LegacyMeterImpl();
		return legacyMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGController createMGController() {
		MGControllerImpl mgController = new MGControllerImpl();
		return mgController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicController createAtomicController() {
		AtomicControllerImpl atomicController = new AtomicControllerImpl();
		return atomicController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGridController createMGridController() {
		MGridControllerImpl mGridController = new MGridControllerImpl();
		return mGridController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadController createLoadController() {
		LoadControllerImpl loadController = new LoadControllerImpl();
		return loadController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageController createStorageController() {
		StorageControllerImpl storageController = new StorageControllerImpl();
		return storageController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceController createSourceController() {
		SourceControllerImpl sourceController = new SourceControllerImpl();
		return sourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCC createPCC() {
		PCCImpl pcc = new PCCImpl();
		return pcc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeterType createMeterType() {
		MeterTypeImpl meterType = new MeterTypeImpl();
		return meterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceType() {
		SourceTypeImpl sourceType = new SourceTypeImpl();
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageDeviceType createStorageDeviceType() {
		StorageDeviceTypeImpl storageDeviceType = new StorageDeviceTypeImpl();
		return storageDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadDeviceType createLoadDeviceType() {
		LoadDeviceTypeImpl loadDeviceType = new LoadDeviceTypeImpl();
		return loadDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LC_Property createLC_Property() {
		LC_PropertyImpl lC_Property = new LC_PropertyImpl();
		return lC_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartMType createSmartMType() {
		SmartMTypeImpl smartMType = new SmartMTypeImpl();
		return smartMType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegacyMType createLegacyMType() {
		LegacyMTypeImpl legacyMType = new LegacyMTypeImpl();
		return legacyMType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalEnum createCriticalEnumFromString(EDataType eDataType, String initialValue) {
		CriticalEnum result = CriticalEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCriticalEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceEnum createSourceEnumFromString(EDataType eDataType, String initialValue) {
		SourceEnum result = SourceEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlEnum createControlEnumFromString(EDataType eDataType, String initialValue) {
		ControlEnum result = ControlEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChargeEnum createChargeEnumFromString(EDataType eDataType, String initialValue) {
		ChargeEnum result = ChargeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChargeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageEnum createUsageEnumFromString(EDataType eDataType, String initialValue) {
		UsageEnum result = UsageEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUsageEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MgridmlPackage getMgridmlPackage() {
		return (MgridmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MgridmlPackage getPackage() {
		return MgridmlPackage.eINSTANCE;
	}

} //MgridmlFactoryImpl
