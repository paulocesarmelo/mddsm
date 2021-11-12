/**
 */
package mgridml.util;

import m4md.EActor;
import m4md.EControlSchema;
import m4md.EDataSchema;
import m4md.EDomainSchema;
import m4md.EDomainSpecificEntity;
import m4md.EDomainSpecificType;
import m4md.EItem;

import mgridml.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mgridml.MgridmlPackage
 * @generated
 */
public class MgridmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MgridmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MgridmlSwitch() {
		if (modelPackage == null) {
			modelPackage = MgridmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MgridmlPackage.MGRID_SCHEMA: {
				MGridSchema mGridSchema = (MGridSchema)theEObject;
				T result = caseMGridSchema(mGridSchema);
				if (result == null) result = caseEDomainSchema(mGridSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.MGRID_CONTROL_SCHEMA: {
				MGridControlSchema mGridControlSchema = (MGridControlSchema)theEObject;
				T result = caseMGridControlSchema(mGridControlSchema);
				if (result == null) result = caseEControlSchema(mGridControlSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.MGRID_DATA_SCHEMA: {
				MGridDataSchema mGridDataSchema = (MGridDataSchema)theEObject;
				T result = caseMGridDataSchema(mGridDataSchema);
				if (result == null) result = caseEDataSchema(mGridDataSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.MC_GRID: {
				MCGrid mcGrid = (MCGrid)theEObject;
				T result = caseMCGrid(mcGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.MD_GRID: {
				MDGrid mdGrid = (MDGrid)theEObject;
				T result = caseMDGrid(mdGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.PLANT_ELEM: {
				PlantElem plantElem = (PlantElem)theEObject;
				T result = casePlantElem(plantElem);
				if (result == null) result = caseEItem(plantElem);
				if (result == null) result = caseEDomainSpecificEntity(plantElem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = casePlantElem(device);
				if (result == null) result = caseEItem(device);
				if (result == null) result = caseEDomainSpecificEntity(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.LOAD_DEVICE: {
				LoadDevice loadDevice = (LoadDevice)theEObject;
				T result = caseLoadDevice(loadDevice);
				if (result == null) result = caseDevice(loadDevice);
				if (result == null) result = casePlantElem(loadDevice);
				if (result == null) result = caseEItem(loadDevice);
				if (result == null) result = caseEDomainSpecificEntity(loadDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.STORAGE_DEVICE: {
				StorageDevice storageDevice = (StorageDevice)theEObject;
				T result = caseStorageDevice(storageDevice);
				if (result == null) result = caseDevice(storageDevice);
				if (result == null) result = casePlantElem(storageDevice);
				if (result == null) result = caseEItem(storageDevice);
				if (result == null) result = caseEDomainSpecificEntity(storageDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.DEVICE_PROPERTY: {
				DeviceProperty deviceProperty = (DeviceProperty)theEObject;
				T result = caseDeviceProperty(deviceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.SOURCE: {
				Source source = (Source)theEObject;
				T result = caseSource(source);
				if (result == null) result = casePlantElem(source);
				if (result == null) result = caseEItem(source);
				if (result == null) result = caseEDomainSpecificEntity(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.SMART_METER: {
				SmartMeter smartMeter = (SmartMeter)theEObject;
				T result = caseSmartMeter(smartMeter);
				if (result == null) result = caseMeter(smartMeter);
				if (result == null) result = casePlantElem(smartMeter);
				if (result == null) result = caseEItem(smartMeter);
				if (result == null) result = caseEDomainSpecificEntity(smartMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.METER: {
				Meter meter = (Meter)theEObject;
				T result = caseMeter(meter);
				if (result == null) result = casePlantElem(meter);
				if (result == null) result = caseEItem(meter);
				if (result == null) result = caseEDomainSpecificEntity(meter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.LEGACY_METER: {
				LegacyMeter legacyMeter = (LegacyMeter)theEObject;
				T result = caseLegacyMeter(legacyMeter);
				if (result == null) result = caseMeter(legacyMeter);
				if (result == null) result = casePlantElem(legacyMeter);
				if (result == null) result = caseEItem(legacyMeter);
				if (result == null) result = caseEDomainSpecificEntity(legacyMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.MG_CONTROLLER: {
				MGController mgController = (MGController)theEObject;
				T result = caseMGController(mgController);
				if (result == null) result = caseEActor(mgController);
				if (result == null) result = caseEDomainSpecificEntity(mgController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.ATOMIC_CONTROLLER: {
				AtomicController atomicController = (AtomicController)theEObject;
				T result = caseAtomicController(atomicController);
				if (result == null) result = caseMGController(atomicController);
				if (result == null) result = caseEActor(atomicController);
				if (result == null) result = caseEDomainSpecificEntity(atomicController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.MGRID_CONTROLLER: {
				MGridController mGridController = (MGridController)theEObject;
				T result = caseMGridController(mGridController);
				if (result == null) result = caseMGController(mGridController);
				if (result == null) result = caseEActor(mGridController);
				if (result == null) result = caseEDomainSpecificEntity(mGridController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.LOAD_CONTROLLER: {
				LoadController loadController = (LoadController)theEObject;
				T result = caseLoadController(loadController);
				if (result == null) result = caseAtomicController(loadController);
				if (result == null) result = caseMGController(loadController);
				if (result == null) result = caseEActor(loadController);
				if (result == null) result = caseEDomainSpecificEntity(loadController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.STORAGE_CONTROLLER: {
				StorageController storageController = (StorageController)theEObject;
				T result = caseStorageController(storageController);
				if (result == null) result = caseAtomicController(storageController);
				if (result == null) result = caseMGController(storageController);
				if (result == null) result = caseEActor(storageController);
				if (result == null) result = caseEDomainSpecificEntity(storageController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.SOURCE_CONTROLLER: {
				SourceController sourceController = (SourceController)theEObject;
				T result = caseSourceController(sourceController);
				if (result == null) result = caseAtomicController(sourceController);
				if (result == null) result = caseMGController(sourceController);
				if (result == null) result = caseEActor(sourceController);
				if (result == null) result = caseEDomainSpecificEntity(sourceController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.PCC: {
				PCC pcc = (PCC)theEObject;
				T result = casePCC(pcc);
				if (result == null) result = caseAtomicController(pcc);
				if (result == null) result = caseMGController(pcc);
				if (result == null) result = caseEActor(pcc);
				if (result == null) result = caseEDomainSpecificEntity(pcc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.METER_TYPE: {
				MeterType meterType = (MeterType)theEObject;
				T result = caseMeterType(meterType);
				if (result == null) result = caseEDomainSpecificType(meterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.SOURCE_TYPE: {
				SourceType sourceType = (SourceType)theEObject;
				T result = caseSourceType(sourceType);
				if (result == null) result = caseEDomainSpecificType(sourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.STORAGE_DEVICE_TYPE: {
				StorageDeviceType storageDeviceType = (StorageDeviceType)theEObject;
				T result = caseStorageDeviceType(storageDeviceType);
				if (result == null) result = caseEDomainSpecificType(storageDeviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.LOAD_DEVICE_TYPE: {
				LoadDeviceType loadDeviceType = (LoadDeviceType)theEObject;
				T result = caseLoadDeviceType(loadDeviceType);
				if (result == null) result = caseEDomainSpecificType(loadDeviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.LC_PROPERTY: {
				LC_Property lC_Property = (LC_Property)theEObject;
				T result = caseLC_Property(lC_Property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.SMART_MTYPE: {
				SmartMType smartMType = (SmartMType)theEObject;
				T result = caseSmartMType(smartMType);
				if (result == null) result = caseMeterType(smartMType);
				if (result == null) result = caseEDomainSpecificType(smartMType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MgridmlPackage.LEGACY_MTYPE: {
				LegacyMType legacyMType = (LegacyMType)theEObject;
				T result = caseLegacyMType(legacyMType);
				if (result == null) result = caseMeterType(legacyMType);
				if (result == null) result = caseEDomainSpecificType(legacyMType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MGrid Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MGrid Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMGridSchema(MGridSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MGrid Control Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MGrid Control Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMGridControlSchema(MGridControlSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MGrid Data Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MGrid Data Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMGridDataSchema(MGridDataSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MC Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MC Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCGrid(MCGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDGrid(MDGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plant Elem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plant Elem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlantElem(PlantElem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadDevice(LoadDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageDevice(StorageDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceProperty(DeviceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smart Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smart Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartMeter(SmartMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeter(Meter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyMeter(LegacyMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MG Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MG Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMGController(MGController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicController(AtomicController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MGrid Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MGrid Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMGridController(MGridController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadController(LoadController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageController(StorageController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceController(SourceController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCC(PCC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeterType(MeterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceType(SourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageDeviceType(StorageDeviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Device Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Device Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadDeviceType(LoadDeviceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LC Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LC Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLC_Property(LC_Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smart MType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smart MType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartMType(SmartMType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy MType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy MType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegacyMType(LegacyMType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDomain Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDomain Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDomainSchema(EDomainSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EControl Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EControl Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEControlSchema(EControlSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EData Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EData Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDataSchema(EDataSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDomain Specific Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDomain Specific Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDomainSpecificEntity(EDomainSpecificEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EItem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EItem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEItem(EItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EActor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EActor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEActor(EActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDomain Specific Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDomain Specific Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDomainSpecificType(EDomainSpecificType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MgridmlSwitch
