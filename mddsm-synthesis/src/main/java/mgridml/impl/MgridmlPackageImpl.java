/**
 */
package mgridml.impl;

import m4md.M4mdPackage;

import m4md.impl.M4mdPackageImpl;

import mgridml.AtomicController;
import mgridml.ChargeEnum;
import mgridml.ControlEnum;
import mgridml.CriticalEnum;
import mgridml.Device;
import mgridml.DeviceProperty;
import mgridml.LC_Property;
import mgridml.LegacyMType;
import mgridml.LegacyMeter;
import mgridml.LoadController;
import mgridml.LoadDevice;
import mgridml.LoadDeviceType;
import mgridml.MCGrid;
import mgridml.MDGrid;
import mgridml.MGController;
import mgridml.MGridControlSchema;
import mgridml.MGridController;
import mgridml.MGridDataSchema;
import mgridml.MGridSchema;
import mgridml.Meter;
import mgridml.MeterType;
import mgridml.MgridmlFactory;
import mgridml.MgridmlPackage;
import mgridml.PlantElem;
import mgridml.SmartMType;
import mgridml.SmartMeter;
import mgridml.Source;
import mgridml.SourceController;
import mgridml.SourceEnum;
import mgridml.SourceType;
import mgridml.StorageController;
import mgridml.StorageDevice;
import mgridml.StorageDeviceType;
import mgridml.UsageEnum;

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
public class MgridmlPackageImpl extends EPackageImpl implements MgridmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mGridSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mGridControlSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mGridDataSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mcGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantElemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devicePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mgControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mGridControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pccEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageDeviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadDeviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lC_PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartMTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legacyMTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum criticalEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum chargeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usageEnumEEnum = null;

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
	 * @see mgridml.MgridmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MgridmlPackageImpl() {
		super(eNS_URI, MgridmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MgridmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MgridmlPackage init() {
		if (isInited) return (MgridmlPackage)EPackage.Registry.INSTANCE.getEPackage(MgridmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMgridmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MgridmlPackageImpl theMgridmlPackage = registeredMgridmlPackage instanceof MgridmlPackageImpl ? (MgridmlPackageImpl)registeredMgridmlPackage : new MgridmlPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(M4mdPackage.eNS_URI);
		M4mdPackageImpl theM4mdPackage = (M4mdPackageImpl)(registeredPackage instanceof M4mdPackageImpl ? registeredPackage : M4mdPackage.eINSTANCE);

		// Create package meta-data objects
		theMgridmlPackage.createPackageContents();
		theM4mdPackage.createPackageContents();

		// Initialize created meta-data
		theMgridmlPackage.initializePackageContents();
		theM4mdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMgridmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MgridmlPackage.eNS_URI, theMgridmlPackage);
		return theMgridmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMGridSchema() {
		return mGridSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMGridSchema_MgridModelID() {
		return (EAttribute)mGridSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMGridControlSchema() {
		return mGridControlSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGridControlSchema_Mcgrid() {
		return (EReference)mGridControlSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMGridDataSchema() {
		return mGridDataSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGridDataSchema_MdGrid() {
		return (EReference)mGridDataSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMCGrid() {
		return mcGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMCGrid_Mgcontroller() {
		return (EReference)mcGridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMCGrid_McgridID() {
		return (EAttribute)mcGridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMDGrid() {
		return mdGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMDGrid_PlantElem() {
		return (EReference)mdGridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMDGrid_MdgridID() {
		return (EAttribute)mdGridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMDGrid_McgridID() {
		return (EAttribute)mdGridEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlantElem() {
		return plantElemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantElem_PlantE_ID() {
		return (EAttribute)plantElemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_DeviceProperty() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_DeviceTypeID() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_DeviceName() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Wattage() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Description() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Operational() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadDevice() {
		return loadDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadDevice_Control() {
		return (EAttribute)loadDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadDevice_Critical() {
		return (EAttribute)loadDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageDevice() {
		return storageDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorageDevice_Capacity() {
		return (EAttribute)storageDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorageDevice_Charging() {
		return (EAttribute)storageDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorageDevice_ChargeT() {
		return (EAttribute)storageDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceProperty() {
		return devicePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceProperty_Attribute() {
		return (EAttribute)devicePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceProperty_Value() {
		return (EAttribute)devicePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_SoTypeID() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_SourceName() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Wattage() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_OnDemand() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Operational() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartMeter() {
		return smartMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartMeter_Tariff() {
		return (EAttribute)smartMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartMeter_Usage() {
		return (EAttribute)smartMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartMeter_Operational() {
		return (EAttribute)smartMeterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeter() {
		return meterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeter_MTypeID() {
		return (EAttribute)meterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyMeter() {
		return legacyMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegacyMeter_Operational() {
		return (EAttribute)legacyMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMGController() {
		return mgControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMGController_CtypeID() {
		return (EAttribute)mgControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicController() {
		return atomicControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicController_ControllerID() {
		return (EAttribute)atomicControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicController_Name() {
		return (EAttribute)atomicControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicController_Cardinality() {
		return (EAttribute)atomicControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicController_Description() {
		return (EAttribute)atomicControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMGridController() {
		return mGridControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMGridController_Mgcontroller() {
		return (EReference)mGridControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMGridController_MgridControllerID() {
		return (EAttribute)mGridControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMGridController_TotalLoads() {
		return (EAttribute)mGridControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMGridController_TotalSources() {
		return (EAttribute)mGridControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadController() {
		return loadControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadController_LoadDeviceType() {
		return (EReference)loadControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadController_LcProperty() {
		return (EReference)loadControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadController_Critical() {
		return (EAttribute)loadControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadController_LowerWattage() {
		return (EAttribute)loadControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadController_UpperWattage() {
		return (EAttribute)loadControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadController_GroupAction() {
		return (EAttribute)loadControllerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageController() {
		return storageControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStorageController_StorageDeviceType() {
		return (EReference)storageControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceController() {
		return sourceControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceController_SourceType() {
		return (EReference)sourceControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCC() {
		return pccEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCC_MeterType() {
		return (EReference)pccEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCC_Connected() {
		return (EAttribute)pccEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeterType() {
		return meterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterType_MTypeID() {
		return (EAttribute)meterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeterType_TypeName() {
		return (EAttribute)meterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceType() {
		return sourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_SoTypeID() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_TypeName() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_SourceC() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceType_Priority() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageDeviceType() {
		return storageDeviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorageDeviceType_SoTypeID() {
		return (EAttribute)storageDeviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorageDeviceType_TypeName() {
		return (EAttribute)storageDeviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorageDeviceType_LowerThres() {
		return (EAttribute)storageDeviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorageDeviceType_UpperThres() {
		return (EAttribute)storageDeviceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadDeviceType() {
		return loadDeviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadDeviceType_SoTypeID() {
		return (EAttribute)loadDeviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadDeviceType_TypeName() {
		return (EAttribute)loadDeviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadDeviceType_Critical() {
		return (EAttribute)loadDeviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoadDeviceType_Usage() {
		return (EAttribute)loadDeviceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLC_Property() {
		return lC_PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLC_Property_Attribute() {
		return (EAttribute)lC_PropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLC_Property_Value() {
		return (EAttribute)lC_PropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartMType() {
		return smartMTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegacyMType() {
		return legacyMTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCriticalEnum() {
		return criticalEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceEnum() {
		return sourceEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlEnum() {
		return controlEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChargeEnum() {
		return chargeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUsageEnum() {
		return usageEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MgridmlFactory getMgridmlFactory() {
		return (MgridmlFactory)getEFactoryInstance();
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
		mGridSchemaEClass = createEClass(MGRID_SCHEMA);
		createEAttribute(mGridSchemaEClass, MGRID_SCHEMA__MGRID_MODEL_ID);

		mGridControlSchemaEClass = createEClass(MGRID_CONTROL_SCHEMA);
		createEReference(mGridControlSchemaEClass, MGRID_CONTROL_SCHEMA__MCGRID);

		mGridDataSchemaEClass = createEClass(MGRID_DATA_SCHEMA);
		createEReference(mGridDataSchemaEClass, MGRID_DATA_SCHEMA__MD_GRID);

		mcGridEClass = createEClass(MC_GRID);
		createEReference(mcGridEClass, MC_GRID__MGCONTROLLER);
		createEAttribute(mcGridEClass, MC_GRID__MCGRID_ID);

		mdGridEClass = createEClass(MD_GRID);
		createEReference(mdGridEClass, MD_GRID__PLANT_ELEM);
		createEAttribute(mdGridEClass, MD_GRID__MDGRID_ID);
		createEAttribute(mdGridEClass, MD_GRID__MCGRID_ID);

		plantElemEClass = createEClass(PLANT_ELEM);
		createEAttribute(plantElemEClass, PLANT_ELEM__PLANT_EID);

		deviceEClass = createEClass(DEVICE);
		createEReference(deviceEClass, DEVICE__DEVICE_PROPERTY);
		createEAttribute(deviceEClass, DEVICE__DEVICE_TYPE_ID);
		createEAttribute(deviceEClass, DEVICE__DEVICE_NAME);
		createEAttribute(deviceEClass, DEVICE__WATTAGE);
		createEAttribute(deviceEClass, DEVICE__DESCRIPTION);
		createEAttribute(deviceEClass, DEVICE__OPERATIONAL);

		loadDeviceEClass = createEClass(LOAD_DEVICE);
		createEAttribute(loadDeviceEClass, LOAD_DEVICE__CONTROL);
		createEAttribute(loadDeviceEClass, LOAD_DEVICE__CRITICAL);

		storageDeviceEClass = createEClass(STORAGE_DEVICE);
		createEAttribute(storageDeviceEClass, STORAGE_DEVICE__CAPACITY);
		createEAttribute(storageDeviceEClass, STORAGE_DEVICE__CHARGING);
		createEAttribute(storageDeviceEClass, STORAGE_DEVICE__CHARGE_T);

		devicePropertyEClass = createEClass(DEVICE_PROPERTY);
		createEAttribute(devicePropertyEClass, DEVICE_PROPERTY__ATTRIBUTE);
		createEAttribute(devicePropertyEClass, DEVICE_PROPERTY__VALUE);

		sourceEClass = createEClass(SOURCE);
		createEAttribute(sourceEClass, SOURCE__SO_TYPE_ID);
		createEAttribute(sourceEClass, SOURCE__SOURCE_NAME);
		createEAttribute(sourceEClass, SOURCE__WATTAGE);
		createEAttribute(sourceEClass, SOURCE__ON_DEMAND);
		createEAttribute(sourceEClass, SOURCE__OPERATIONAL);

		smartMeterEClass = createEClass(SMART_METER);
		createEAttribute(smartMeterEClass, SMART_METER__TARIFF);
		createEAttribute(smartMeterEClass, SMART_METER__USAGE);
		createEAttribute(smartMeterEClass, SMART_METER__OPERATIONAL);

		meterEClass = createEClass(METER);
		createEAttribute(meterEClass, METER__MTYPE_ID);

		legacyMeterEClass = createEClass(LEGACY_METER);
		createEAttribute(legacyMeterEClass, LEGACY_METER__OPERATIONAL);

		mgControllerEClass = createEClass(MG_CONTROLLER);
		createEAttribute(mgControllerEClass, MG_CONTROLLER__CTYPE_ID);

		atomicControllerEClass = createEClass(ATOMIC_CONTROLLER);
		createEAttribute(atomicControllerEClass, ATOMIC_CONTROLLER__CONTROLLER_ID);
		createEAttribute(atomicControllerEClass, ATOMIC_CONTROLLER__NAME);
		createEAttribute(atomicControllerEClass, ATOMIC_CONTROLLER__CARDINALITY);
		createEAttribute(atomicControllerEClass, ATOMIC_CONTROLLER__DESCRIPTION);

		mGridControllerEClass = createEClass(MGRID_CONTROLLER);
		createEReference(mGridControllerEClass, MGRID_CONTROLLER__MGCONTROLLER);
		createEAttribute(mGridControllerEClass, MGRID_CONTROLLER__MGRID_CONTROLLER_ID);
		createEAttribute(mGridControllerEClass, MGRID_CONTROLLER__TOTAL_LOADS);
		createEAttribute(mGridControllerEClass, MGRID_CONTROLLER__TOTAL_SOURCES);

		loadControllerEClass = createEClass(LOAD_CONTROLLER);
		createEReference(loadControllerEClass, LOAD_CONTROLLER__LOAD_DEVICE_TYPE);
		createEReference(loadControllerEClass, LOAD_CONTROLLER__LC_PROPERTY);
		createEAttribute(loadControllerEClass, LOAD_CONTROLLER__CRITICAL);
		createEAttribute(loadControllerEClass, LOAD_CONTROLLER__LOWER_WATTAGE);
		createEAttribute(loadControllerEClass, LOAD_CONTROLLER__UPPER_WATTAGE);
		createEAttribute(loadControllerEClass, LOAD_CONTROLLER__GROUP_ACTION);

		storageControllerEClass = createEClass(STORAGE_CONTROLLER);
		createEReference(storageControllerEClass, STORAGE_CONTROLLER__STORAGE_DEVICE_TYPE);

		sourceControllerEClass = createEClass(SOURCE_CONTROLLER);
		createEReference(sourceControllerEClass, SOURCE_CONTROLLER__SOURCE_TYPE);

		pccEClass = createEClass(PCC);
		createEReference(pccEClass, PCC__METER_TYPE);
		createEAttribute(pccEClass, PCC__CONNECTED);

		meterTypeEClass = createEClass(METER_TYPE);
		createEAttribute(meterTypeEClass, METER_TYPE__MTYPE_ID);
		createEAttribute(meterTypeEClass, METER_TYPE__TYPE_NAME);

		sourceTypeEClass = createEClass(SOURCE_TYPE);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__SO_TYPE_ID);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__TYPE_NAME);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__SOURCE_C);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__PRIORITY);

		storageDeviceTypeEClass = createEClass(STORAGE_DEVICE_TYPE);
		createEAttribute(storageDeviceTypeEClass, STORAGE_DEVICE_TYPE__SO_TYPE_ID);
		createEAttribute(storageDeviceTypeEClass, STORAGE_DEVICE_TYPE__TYPE_NAME);
		createEAttribute(storageDeviceTypeEClass, STORAGE_DEVICE_TYPE__LOWER_THRES);
		createEAttribute(storageDeviceTypeEClass, STORAGE_DEVICE_TYPE__UPPER_THRES);

		loadDeviceTypeEClass = createEClass(LOAD_DEVICE_TYPE);
		createEAttribute(loadDeviceTypeEClass, LOAD_DEVICE_TYPE__SO_TYPE_ID);
		createEAttribute(loadDeviceTypeEClass, LOAD_DEVICE_TYPE__TYPE_NAME);
		createEAttribute(loadDeviceTypeEClass, LOAD_DEVICE_TYPE__CRITICAL);
		createEAttribute(loadDeviceTypeEClass, LOAD_DEVICE_TYPE__USAGE);

		lC_PropertyEClass = createEClass(LC_PROPERTY);
		createEAttribute(lC_PropertyEClass, LC_PROPERTY__ATTRIBUTE);
		createEAttribute(lC_PropertyEClass, LC_PROPERTY__VALUE);

		smartMTypeEClass = createEClass(SMART_MTYPE);

		legacyMTypeEClass = createEClass(LEGACY_MTYPE);

		// Create enums
		criticalEnumEEnum = createEEnum(CRITICAL_ENUM);
		sourceEnumEEnum = createEEnum(SOURCE_ENUM);
		controlEnumEEnum = createEEnum(CONTROL_ENUM);
		chargeEnumEEnum = createEEnum(CHARGE_ENUM);
		usageEnumEEnum = createEEnum(USAGE_ENUM);
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

		// Obtain other dependent packages
		M4mdPackage theM4mdPackage = (M4mdPackage)EPackage.Registry.INSTANCE.getEPackage(M4mdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mGridSchemaEClass.getESuperTypes().add(theM4mdPackage.getEDomainSchema());
		mGridControlSchemaEClass.getESuperTypes().add(theM4mdPackage.getEControlSchema());
		mGridDataSchemaEClass.getESuperTypes().add(theM4mdPackage.getEDataSchema());
		plantElemEClass.getESuperTypes().add(theM4mdPackage.getEItem());
		deviceEClass.getESuperTypes().add(this.getPlantElem());
		loadDeviceEClass.getESuperTypes().add(this.getDevice());
		storageDeviceEClass.getESuperTypes().add(this.getDevice());
		sourceEClass.getESuperTypes().add(this.getPlantElem());
		smartMeterEClass.getESuperTypes().add(this.getMeter());
		meterEClass.getESuperTypes().add(this.getPlantElem());
		legacyMeterEClass.getESuperTypes().add(this.getMeter());
		mgControllerEClass.getESuperTypes().add(theM4mdPackage.getEActor());
		atomicControllerEClass.getESuperTypes().add(this.getMGController());
		mGridControllerEClass.getESuperTypes().add(this.getMGController());
		loadControllerEClass.getESuperTypes().add(this.getAtomicController());
		storageControllerEClass.getESuperTypes().add(this.getAtomicController());
		sourceControllerEClass.getESuperTypes().add(this.getAtomicController());
		pccEClass.getESuperTypes().add(this.getAtomicController());
		meterTypeEClass.getESuperTypes().add(theM4mdPackage.getEDomainSpecificType());
		sourceTypeEClass.getESuperTypes().add(theM4mdPackage.getEDomainSpecificType());
		storageDeviceTypeEClass.getESuperTypes().add(theM4mdPackage.getEDomainSpecificType());
		loadDeviceTypeEClass.getESuperTypes().add(theM4mdPackage.getEDomainSpecificType());
		smartMTypeEClass.getESuperTypes().add(this.getMeterType());
		legacyMTypeEClass.getESuperTypes().add(this.getMeterType());

		// Initialize classes, features, and operations; add parameters
		initEClass(mGridSchemaEClass, MGridSchema.class, "MGridSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMGridSchema_MgridModelID(), ecorePackage.getEString(), "mgridModelID", null, 0, 1, MGridSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mGridControlSchemaEClass, MGridControlSchema.class, "MGridControlSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMGridControlSchema_Mcgrid(), this.getMCGrid(), null, "mcgrid", null, 1, 1, MGridControlSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mGridDataSchemaEClass, MGridDataSchema.class, "MGridDataSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMGridDataSchema_MdGrid(), this.getMDGrid(), null, "mdGrid", null, 0, -1, MGridDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mcGridEClass, MCGrid.class, "MCGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMCGrid_Mgcontroller(), this.getMGController(), null, "mgcontroller", null, 1, -1, MCGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMCGrid_McgridID(), ecorePackage.getEString(), "mcgridID", null, 0, 1, MCGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mdGridEClass, MDGrid.class, "MDGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMDGrid_PlantElem(), this.getPlantElem(), null, "plantElem", null, 0, -1, MDGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDGrid_MdgridID(), ecorePackage.getEString(), "mdgridID", null, 0, 1, MDGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMDGrid_McgridID(), ecorePackage.getEString(), "mcgridID", null, 0, 1, MDGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plantElemEClass, PlantElem.class, "PlantElem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlantElem_PlantE_ID(), ecorePackage.getEString(), "plantE_ID", null, 0, 1, PlantElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevice_DeviceProperty(), this.getDeviceProperty(), null, "deviceProperty", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_DeviceTypeID(), ecorePackage.getEString(), "deviceTypeID", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_DeviceName(), ecorePackage.getEString(), "deviceName", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Wattage(), ecorePackage.getEFloat(), "wattage", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Description(), ecorePackage.getEString(), "description", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Operational(), ecorePackage.getEBoolean(), "operational", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadDeviceEClass, LoadDevice.class, "LoadDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadDevice_Control(), this.getControlEnum(), "control", null, 0, 1, LoadDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadDevice_Critical(), this.getCriticalEnum(), "critical", null, 0, 1, LoadDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageDeviceEClass, StorageDevice.class, "StorageDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorageDevice_Capacity(), ecorePackage.getEFloat(), "capacity", null, 0, 1, StorageDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageDevice_Charging(), ecorePackage.getEBoolean(), "charging", null, 0, 1, StorageDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageDevice_ChargeT(), this.getChargeEnum(), "chargeT", null, 0, 1, StorageDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(devicePropertyEClass, DeviceProperty.class, "DeviceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceProperty_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, DeviceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, DeviceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSource_SoTypeID(), ecorePackage.getEString(), "soTypeID", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_SourceName(), ecorePackage.getEString(), "sourceName", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Wattage(), ecorePackage.getEFloat(), "wattage", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_OnDemand(), this.getControlEnum(), "onDemand", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Operational(), ecorePackage.getEBoolean(), "operational", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smartMeterEClass, SmartMeter.class, "SmartMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmartMeter_Tariff(), ecorePackage.getEFloat(), "tariff", null, 0, 1, SmartMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartMeter_Usage(), ecorePackage.getEFloat(), "usage", null, 0, 1, SmartMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartMeter_Operational(), ecorePackage.getEBoolean(), "operational", null, 0, 1, SmartMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meterEClass, Meter.class, "Meter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeter_MTypeID(), ecorePackage.getEString(), "mTypeID", null, 0, 1, Meter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legacyMeterEClass, LegacyMeter.class, "LegacyMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegacyMeter_Operational(), ecorePackage.getEString(), "operational", null, 0, 1, LegacyMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mgControllerEClass, MGController.class, "MGController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMGController_CtypeID(), ecorePackage.getEString(), "ctypeID", null, 0, 1, MGController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicControllerEClass, AtomicController.class, "AtomicController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicController_ControllerID(), ecorePackage.getEString(), "controllerID", null, 0, 1, AtomicController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicController_Name(), ecorePackage.getEString(), "name", null, 0, 1, AtomicController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicController_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 0, 1, AtomicController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicController_Description(), ecorePackage.getEString(), "description", null, 0, 1, AtomicController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mGridControllerEClass, MGridController.class, "MGridController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMGridController_Mgcontroller(), this.getMGController(), null, "mgcontroller", null, 0, -1, MGridController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMGridController_MgridControllerID(), ecorePackage.getEString(), "mgridControllerID", null, 0, 1, MGridController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMGridController_TotalLoads(), ecorePackage.getEFloat(), "totalLoads", null, 0, 1, MGridController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMGridController_TotalSources(), ecorePackage.getEFloat(), "totalSources", null, 0, 1, MGridController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadControllerEClass, LoadController.class, "LoadController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadController_LoadDeviceType(), this.getLoadDeviceType(), null, "loadDeviceType", null, 1, -1, LoadController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadController_LcProperty(), this.getLC_Property(), null, "lcProperty", null, 0, -1, LoadController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadController_Critical(), this.getCriticalEnum(), "critical", null, 0, 1, LoadController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadController_LowerWattage(), ecorePackage.getEFloat(), "lowerWattage", null, 0, 1, LoadController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadController_UpperWattage(), ecorePackage.getEFloat(), "upperWattage", null, 0, 1, LoadController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadController_GroupAction(), ecorePackage.getEBoolean(), "groupAction", null, 0, 1, LoadController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageControllerEClass, StorageController.class, "StorageController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStorageController_StorageDeviceType(), this.getStorageDeviceType(), null, "storageDeviceType", null, 1, -1, StorageController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceControllerEClass, SourceController.class, "SourceController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceController_SourceType(), this.getSourceType(), null, "sourceType", null, 1, -1, SourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pccEClass, mgridml.PCC.class, "PCC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCC_MeterType(), this.getMeterType(), null, "meterType", null, 1, 1, mgridml.PCC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCC_Connected(), ecorePackage.getEBoolean(), "connected", null, 0, 1, mgridml.PCC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meterTypeEClass, MeterType.class, "MeterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeterType_MTypeID(), ecorePackage.getEString(), "mTypeID", null, 0, 1, MeterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeterType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, MeterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceTypeEClass, SourceType.class, "SourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceType_SoTypeID(), ecorePackage.getEString(), "soTypeID", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_SourceC(), ecorePackage.getEString(), "sourceC", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceType_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, SourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageDeviceTypeEClass, StorageDeviceType.class, "StorageDeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorageDeviceType_SoTypeID(), ecorePackage.getEString(), "soTypeID", null, 0, 1, StorageDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageDeviceType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, StorageDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageDeviceType_LowerThres(), ecorePackage.getEFloat(), "lowerThres", null, 0, 1, StorageDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStorageDeviceType_UpperThres(), ecorePackage.getEFloat(), "upperThres", null, 0, 1, StorageDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadDeviceTypeEClass, LoadDeviceType.class, "LoadDeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadDeviceType_SoTypeID(), ecorePackage.getEString(), "soTypeID", null, 0, 1, LoadDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadDeviceType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, LoadDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadDeviceType_Critical(), this.getCriticalEnum(), "critical", null, 0, 1, LoadDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoadDeviceType_Usage(), this.getUsageEnum(), "usage", null, 0, 1, LoadDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lC_PropertyEClass, LC_Property.class, "LC_Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLC_Property_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, LC_Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLC_Property_Value(), ecorePackage.getEString(), "value", null, 0, 1, LC_Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smartMTypeEClass, SmartMType.class, "SmartMType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(legacyMTypeEClass, LegacyMType.class, "LegacyMType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(criticalEnumEEnum, CriticalEnum.class, "CriticalEnum");
		addEEnumLiteral(criticalEnumEEnum, CriticalEnum.SENSITIVE);
		addEEnumLiteral(criticalEnumEEnum, CriticalEnum.ADJUSTABLE);
		addEEnumLiteral(criticalEnumEEnum, CriticalEnum.SHEDABLE);
		addEEnumLiteral(criticalEnumEEnum, CriticalEnum.ANY);

		initEEnum(sourceEnumEEnum, SourceEnum.class, "SourceEnum");
		addEEnumLiteral(sourceEnumEEnum, SourceEnum.AC);
		addEEnumLiteral(sourceEnumEEnum, SourceEnum.DC);

		initEEnum(controlEnumEEnum, ControlEnum.class, "ControlEnum");
		addEEnumLiteral(controlEnumEEnum, ControlEnum.CONTROLLABLE);
		addEEnumLiteral(controlEnumEEnum, ControlEnum.NON_CONTROLLABLE);

		initEEnum(chargeEnumEEnum, ChargeEnum.class, "ChargeEnum");
		addEEnumLiteral(chargeEnumEEnum, ChargeEnum.CHARGE);
		addEEnumLiteral(chargeEnumEEnum, ChargeEnum.NEUTRAL);
		addEEnumLiteral(chargeEnumEEnum, ChargeEnum.DISCHARGE);

		initEEnum(usageEnumEEnum, UsageEnum.class, "UsageEnum");
		addEEnumLiteral(usageEnumEEnum, UsageEnum.HVAC);
		addEEnumLiteral(usageEnumEEnum, UsageEnum.LIGHTING);
		addEEnumLiteral(usageEnumEEnum, UsageEnum.SMALL_APPLS);
		addEEnumLiteral(usageEnumEEnum, UsageEnum.LARGER_APPLS);

		// Create resource
		createResource(eNS_URI);
	}

} //MgridmlPackageImpl
