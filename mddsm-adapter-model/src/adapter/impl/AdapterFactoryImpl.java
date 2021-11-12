/**
 */
package adapter.impl;

import adapter.*;

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
public class AdapterFactoryImpl extends EFactoryImpl implements AdapterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdapterFactory init() {
		try {
			AdapterFactory theAdapterFactory = (AdapterFactory)EPackage.Registry.INSTANCE.getEFactory(AdapterPackage.eNS_URI);
			if (theAdapterFactory != null) {
				return theAdapterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdapterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterFactoryImpl() {
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
			case AdapterPackage.EADAPTER: return createEAdapter();
			case AdapterPackage.ECOMMUNICATION: return createECommunication();
			case AdapterPackage.ERESOURCE: return createEResource();
			case AdapterPackage.ECOMPONENT: return createEComponent();
			case AdapterPackage.EDATA: return createEData();
			case AdapterPackage.EENTITY: return createEEntity();
			case AdapterPackage.EDS_CMD: return createEDSCmd();
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
			case AdapterPackage.ECOMM_API:
				return createECommAPIFromString(eDataType, initialValue);
			case AdapterPackage.EDATA_FORMAT:
				return createEDataFormatFromString(eDataType, initialValue);
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
			case AdapterPackage.ECOMM_API:
				return convertECommAPIToString(eDataType, instanceValue);
			case AdapterPackage.EDATA_FORMAT:
				return convertEDataFormatToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAdapter createEAdapter() {
		EAdapterImpl eAdapter = new EAdapterImpl();
		return eAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECommunication createECommunication() {
		ECommunicationImpl eCommunication = new ECommunicationImpl();
		return eCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EResource createEResource() {
		EResourceImpl eResource = new EResourceImpl();
		return eResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EComponent createEComponent() {
		EComponentImpl eComponent = new EComponentImpl();
		return eComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EData createEData() {
		EDataImpl eData = new EDataImpl();
		return eData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEntity createEEntity() {
		EEntityImpl eEntity = new EEntityImpl();
		return eEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDSCmd createEDSCmd() {
		EDSCmdImpl edsCmd = new EDSCmdImpl();
		return edsCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECommAPI createECommAPIFromString(EDataType eDataType, String initialValue) {
		ECommAPI result = ECommAPI.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECommAPIToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataFormat createEDataFormatFromString(EDataType eDataType, String initialValue) {
		EDataFormat result = EDataFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDataFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterPackage getAdapterPackage() {
		return (AdapterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdapterPackage getPackage() {
		return AdapterPackage.eINSTANCE;
	}

} //AdapterFactoryImpl
