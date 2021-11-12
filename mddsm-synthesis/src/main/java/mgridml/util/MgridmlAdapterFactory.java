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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mgridml.MgridmlPackage
 * @generated
 */
public class MgridmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MgridmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MgridmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MgridmlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MgridmlSwitch<Adapter> modelSwitch =
		new MgridmlSwitch<Adapter>() {
			@Override
			public Adapter caseMGridSchema(MGridSchema object) {
				return createMGridSchemaAdapter();
			}
			@Override
			public Adapter caseMGridControlSchema(MGridControlSchema object) {
				return createMGridControlSchemaAdapter();
			}
			@Override
			public Adapter caseMGridDataSchema(MGridDataSchema object) {
				return createMGridDataSchemaAdapter();
			}
			@Override
			public Adapter caseMCGrid(MCGrid object) {
				return createMCGridAdapter();
			}
			@Override
			public Adapter caseMDGrid(MDGrid object) {
				return createMDGridAdapter();
			}
			@Override
			public Adapter casePlantElem(PlantElem object) {
				return createPlantElemAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseLoadDevice(LoadDevice object) {
				return createLoadDeviceAdapter();
			}
			@Override
			public Adapter caseStorageDevice(StorageDevice object) {
				return createStorageDeviceAdapter();
			}
			@Override
			public Adapter caseDeviceProperty(DeviceProperty object) {
				return createDevicePropertyAdapter();
			}
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseSmartMeter(SmartMeter object) {
				return createSmartMeterAdapter();
			}
			@Override
			public Adapter caseMeter(Meter object) {
				return createMeterAdapter();
			}
			@Override
			public Adapter caseLegacyMeter(LegacyMeter object) {
				return createLegacyMeterAdapter();
			}
			@Override
			public Adapter caseMGController(MGController object) {
				return createMGControllerAdapter();
			}
			@Override
			public Adapter caseAtomicController(AtomicController object) {
				return createAtomicControllerAdapter();
			}
			@Override
			public Adapter caseMGridController(MGridController object) {
				return createMGridControllerAdapter();
			}
			@Override
			public Adapter caseLoadController(LoadController object) {
				return createLoadControllerAdapter();
			}
			@Override
			public Adapter caseStorageController(StorageController object) {
				return createStorageControllerAdapter();
			}
			@Override
			public Adapter caseSourceController(SourceController object) {
				return createSourceControllerAdapter();
			}
			@Override
			public Adapter casePCC(PCC object) {
				return createPCCAdapter();
			}
			@Override
			public Adapter caseMeterType(MeterType object) {
				return createMeterTypeAdapter();
			}
			@Override
			public Adapter caseSourceType(SourceType object) {
				return createSourceTypeAdapter();
			}
			@Override
			public Adapter caseStorageDeviceType(StorageDeviceType object) {
				return createStorageDeviceTypeAdapter();
			}
			@Override
			public Adapter caseLoadDeviceType(LoadDeviceType object) {
				return createLoadDeviceTypeAdapter();
			}
			@Override
			public Adapter caseLC_Property(LC_Property object) {
				return createLC_PropertyAdapter();
			}
			@Override
			public Adapter caseSmartMType(SmartMType object) {
				return createSmartMTypeAdapter();
			}
			@Override
			public Adapter caseLegacyMType(LegacyMType object) {
				return createLegacyMTypeAdapter();
			}
			@Override
			public Adapter caseEDomainSchema(EDomainSchema object) {
				return createEDomainSchemaAdapter();
			}
			@Override
			public Adapter caseEControlSchema(EControlSchema object) {
				return createEControlSchemaAdapter();
			}
			@Override
			public Adapter caseEDataSchema(EDataSchema object) {
				return createEDataSchemaAdapter();
			}
			@Override
			public Adapter caseEDomainSpecificEntity(EDomainSpecificEntity object) {
				return createEDomainSpecificEntityAdapter();
			}
			@Override
			public Adapter caseEItem(EItem object) {
				return createEItemAdapter();
			}
			@Override
			public Adapter caseEActor(EActor object) {
				return createEActorAdapter();
			}
			@Override
			public Adapter caseEDomainSpecificType(EDomainSpecificType object) {
				return createEDomainSpecificTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mgridml.MGridSchema <em>MGrid Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.MGridSchema
	 * @generated
	 */
	public Adapter createMGridSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.MGridControlSchema <em>MGrid Control Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.MGridControlSchema
	 * @generated
	 */
	public Adapter createMGridControlSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.MGridDataSchema <em>MGrid Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.MGridDataSchema
	 * @generated
	 */
	public Adapter createMGridDataSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.MCGrid <em>MC Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.MCGrid
	 * @generated
	 */
	public Adapter createMCGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.MDGrid <em>MD Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.MDGrid
	 * @generated
	 */
	public Adapter createMDGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.PlantElem <em>Plant Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.PlantElem
	 * @generated
	 */
	public Adapter createPlantElemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.LoadDevice <em>Load Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.LoadDevice
	 * @generated
	 */
	public Adapter createLoadDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.StorageDevice <em>Storage Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.StorageDevice
	 * @generated
	 */
	public Adapter createStorageDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.DeviceProperty <em>Device Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.DeviceProperty
	 * @generated
	 */
	public Adapter createDevicePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.SmartMeter <em>Smart Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.SmartMeter
	 * @generated
	 */
	public Adapter createSmartMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.Meter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.Meter
	 * @generated
	 */
	public Adapter createMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.LegacyMeter <em>Legacy Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.LegacyMeter
	 * @generated
	 */
	public Adapter createLegacyMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.MGController <em>MG Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.MGController
	 * @generated
	 */
	public Adapter createMGControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.AtomicController <em>Atomic Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.AtomicController
	 * @generated
	 */
	public Adapter createAtomicControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.MGridController <em>MGrid Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.MGridController
	 * @generated
	 */
	public Adapter createMGridControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.LoadController <em>Load Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.LoadController
	 * @generated
	 */
	public Adapter createLoadControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.StorageController <em>Storage Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.StorageController
	 * @generated
	 */
	public Adapter createStorageControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.SourceController <em>Source Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.SourceController
	 * @generated
	 */
	public Adapter createSourceControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.PCC <em>PCC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.PCC
	 * @generated
	 */
	public Adapter createPCCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.MeterType <em>Meter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.MeterType
	 * @generated
	 */
	public Adapter createMeterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.SourceType
	 * @generated
	 */
	public Adapter createSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.StorageDeviceType <em>Storage Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.StorageDeviceType
	 * @generated
	 */
	public Adapter createStorageDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.LoadDeviceType <em>Load Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.LoadDeviceType
	 * @generated
	 */
	public Adapter createLoadDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.LC_Property <em>LC Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.LC_Property
	 * @generated
	 */
	public Adapter createLC_PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.SmartMType <em>Smart MType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.SmartMType
	 * @generated
	 */
	public Adapter createSmartMTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mgridml.LegacyMType <em>Legacy MType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mgridml.LegacyMType
	 * @generated
	 */
	public Adapter createLegacyMTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EDomainSchema <em>EDomain Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EDomainSchema
	 * @generated
	 */
	public Adapter createEDomainSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EControlSchema <em>EControl Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EControlSchema
	 * @generated
	 */
	public Adapter createEControlSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EDataSchema <em>EData Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EDataSchema
	 * @generated
	 */
	public Adapter createEDataSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EDomainSpecificEntity <em>EDomain Specific Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EDomainSpecificEntity
	 * @generated
	 */
	public Adapter createEDomainSpecificEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EItem <em>EItem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EItem
	 * @generated
	 */
	public Adapter createEItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EActor <em>EActor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EActor
	 * @generated
	 */
	public Adapter createEActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link m4md.EDomainSpecificType <em>EDomain Specific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see m4md.EDomainSpecificType
	 * @generated
	 */
	public Adapter createEDomainSpecificTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MgridmlAdapterFactory
