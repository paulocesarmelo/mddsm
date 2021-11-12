/**
 */
package dsk;

import m4md.M4mdPackage;

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
 * @see dsk.DskFactory
 * @model kind="package"
 * @generated
 */
public interface DskPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inf.ufg.br/controller/dsk";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DskPackage eINSTANCE = dsk.impl.DskPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsk.impl.DskImpl <em>Dsk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsk.impl.DskImpl
	 * @see dsk.impl.DskPackageImpl#getDsk()
	 * @generated
	 */
	int DSK = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Dscs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK__DSCS = 1;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK__PROCEDURES = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK__EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK__ENTITIES = 4;

	/**
	 * The number of structural features of the '<em>Dsk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Dsk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsk.impl.EProcedureImpl <em>EProcedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsk.impl.EProcedureImpl
	 * @see dsk.impl.DskPackageImpl#getEProcedure()
	 * @generated
	 */
	int EPROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__CLASSIFIER = 2;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__IMPL = 3;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE__DEPENDENCIES = 4;

	/**
	 * The number of structural features of the '<em>EProcedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>EProcedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPROCEDURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsk.impl.EDSCImpl <em>EDSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsk.impl.EDSCImpl
	 * @see dsk.impl.DskPackageImpl#getEDSC()
	 * @generated
	 */
	int EDSC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC__KIND = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC__ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC__CONDITION = 4;

	/**
	 * The number of structural features of the '<em>EDSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>EDSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDSC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsk.impl.EExecutionUnitImpl <em>EExecution Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsk.impl.EExecutionUnitImpl
	 * @see dsk.impl.DskPackageImpl#getEExecutionUnit()
	 * @generated
	 */
	int EEXECUTION_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXECUTION_UNIT__ID = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXECUTION_UNIT__BODY = 1;

	/**
	 * The number of structural features of the '<em>EExecution Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXECUTION_UNIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EExecution Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXECUTION_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsk.impl.EDSEventImpl <em>EDS Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsk.impl.EDSEventImpl
	 * @see dsk.impl.DskPackageImpl#getEDSEvent()
	 * @generated
	 */
	int EDS_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_EVENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_EVENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_EVENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Meta Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_EVENT__META_CMD = 3;

	/**
	 * The number of structural features of the '<em>EDS Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>EDS Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsk.impl.EDSEntityImpl <em>EDS Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsk.impl.EDSEntityImpl
	 * @see dsk.impl.DskPackageImpl#getEDSEntity()
	 * @generated
	 */
	int EDS_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Command Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_ENTITY__COMMAND_PRIORITY = M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__COMMAND_PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_ENTITY__CMD = M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__CMD;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_ENTITY__NAME = M4mdPackage.EDOMAIN_SPECIFIC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EDS Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_ENTITY_FEATURE_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EDS Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDS_ENTITY_OPERATION_COUNT = M4mdPackage.EDOMAIN_SPECIFIC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsk.EDSCType <em>EDSC Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsk.EDSCType
	 * @see dsk.impl.DskPackageImpl#getEDSCType()
	 * @generated
	 */
	int EDSC_TYPE = 6;

	/**
	 * The meta object id for the '{@link dsk.EEventType <em>EEvent Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsk.EEventType
	 * @see dsk.impl.DskPackageImpl#getEEventType()
	 * @generated
	 */
	int EEVENT_TYPE = 7;

	/**
	 * The meta object id for the '{@link dsk.EMetaCmdType <em>EMeta Cmd Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsk.EMetaCmdType
	 * @see dsk.impl.DskPackageImpl#getEMetaCmdType()
	 * @generated
	 */
	int EMETA_CMD_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link dsk.Dsk <em>Dsk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsk</em>'.
	 * @see dsk.Dsk
	 * @generated
	 */
	EClass getDsk();

	/**
	 * Returns the meta object for the attribute '{@link dsk.Dsk#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see dsk.Dsk#getDomain()
	 * @see #getDsk()
	 * @generated
	 */
	EAttribute getDsk_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link dsk.Dsk#getDscs <em>Dscs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dscs</em>'.
	 * @see dsk.Dsk#getDscs()
	 * @see #getDsk()
	 * @generated
	 */
	EReference getDsk_Dscs();

	/**
	 * Returns the meta object for the containment reference list '{@link dsk.Dsk#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedures</em>'.
	 * @see dsk.Dsk#getProcedures()
	 * @see #getDsk()
	 * @generated
	 */
	EReference getDsk_Procedures();

	/**
	 * Returns the meta object for the containment reference list '{@link dsk.Dsk#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see dsk.Dsk#getEvents()
	 * @see #getDsk()
	 * @generated
	 */
	EReference getDsk_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link dsk.Dsk#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see dsk.Dsk#getEntities()
	 * @see #getDsk()
	 * @generated
	 */
	EReference getDsk_Entities();

	/**
	 * Returns the meta object for class '{@link dsk.EProcedure <em>EProcedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EProcedure</em>'.
	 * @see dsk.EProcedure
	 * @generated
	 */
	EClass getEProcedure();

	/**
	 * Returns the meta object for the attribute '{@link dsk.EProcedure#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsk.EProcedure#getId()
	 * @see #getEProcedure()
	 * @generated
	 */
	EAttribute getEProcedure_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsk.EProcedure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsk.EProcedure#getName()
	 * @see #getEProcedure()
	 * @generated
	 */
	EAttribute getEProcedure_Name();

	/**
	 * Returns the meta object for the reference '{@link dsk.EProcedure#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see dsk.EProcedure#getClassifier()
	 * @see #getEProcedure()
	 * @generated
	 */
	EReference getEProcedure_Classifier();

	/**
	 * Returns the meta object for the containment reference list '{@link dsk.EProcedure#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Impl</em>'.
	 * @see dsk.EProcedure#getImpl()
	 * @see #getEProcedure()
	 * @generated
	 */
	EReference getEProcedure_Impl();

	/**
	 * Returns the meta object for the reference list '{@link dsk.EProcedure#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see dsk.EProcedure#getDependencies()
	 * @see #getEProcedure()
	 * @generated
	 */
	EReference getEProcedure_Dependencies();

	/**
	 * Returns the meta object for class '{@link dsk.EDSC <em>EDSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDSC</em>'.
	 * @see dsk.EDSC
	 * @generated
	 */
	EClass getEDSC();

	/**
	 * Returns the meta object for the attribute '{@link dsk.EDSC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsk.EDSC#getName()
	 * @see #getEDSC()
	 * @generated
	 */
	EAttribute getEDSC_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsk.EDSC#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see dsk.EDSC#getKind()
	 * @see #getEDSC()
	 * @generated
	 */
	EAttribute getEDSC_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link dsk.EDSC#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see dsk.EDSC#getParameters()
	 * @see #getEDSC()
	 * @generated
	 */
	EReference getEDSC_Parameters();

	/**
	 * Returns the meta object for the reference '{@link dsk.EDSC#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see dsk.EDSC#getEntity()
	 * @see #getEDSC()
	 * @generated
	 */
	EReference getEDSC_Entity();

	/**
	 * Returns the meta object for the reference list '{@link dsk.EDSC#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition</em>'.
	 * @see dsk.EDSC#getCondition()
	 * @see #getEDSC()
	 * @generated
	 */
	EReference getEDSC_Condition();

	/**
	 * Returns the meta object for class '{@link dsk.EExecutionUnit <em>EExecution Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EExecution Unit</em>'.
	 * @see dsk.EExecutionUnit
	 * @generated
	 */
	EClass getEExecutionUnit();

	/**
	 * Returns the meta object for the attribute '{@link dsk.EExecutionUnit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsk.EExecutionUnit#getId()
	 * @see #getEExecutionUnit()
	 * @generated
	 */
	EAttribute getEExecutionUnit_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsk.EExecutionUnit#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see dsk.EExecutionUnit#getBody()
	 * @see #getEExecutionUnit()
	 * @generated
	 */
	EAttribute getEExecutionUnit_Body();

	/**
	 * Returns the meta object for class '{@link dsk.EDSEvent <em>EDS Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDS Event</em>'.
	 * @see dsk.EDSEvent
	 * @generated
	 */
	EClass getEDSEvent();

	/**
	 * Returns the meta object for the attribute '{@link dsk.EDSEvent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dsk.EDSEvent#getId()
	 * @see #getEDSEvent()
	 * @generated
	 */
	EAttribute getEDSEvent_Id();

	/**
	 * Returns the meta object for the attribute '{@link dsk.EDSEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsk.EDSEvent#getName()
	 * @see #getEDSEvent()
	 * @generated
	 */
	EAttribute getEDSEvent_Name();

	/**
	 * Returns the meta object for the attribute '{@link dsk.EDSEvent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsk.EDSEvent#getType()
	 * @see #getEDSEvent()
	 * @generated
	 */
	EAttribute getEDSEvent_Type();

	/**
	 * Returns the meta object for the attribute '{@link dsk.EDSEvent#getMetaCmd <em>Meta Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Cmd</em>'.
	 * @see dsk.EDSEvent#getMetaCmd()
	 * @see #getEDSEvent()
	 * @generated
	 */
	EAttribute getEDSEvent_MetaCmd();

	/**
	 * Returns the meta object for class '{@link dsk.EDSEntity <em>EDS Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDS Entity</em>'.
	 * @see dsk.EDSEntity
	 * @generated
	 */
	EClass getEDSEntity();

	/**
	 * Returns the meta object for the attribute '{@link dsk.EDSEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsk.EDSEntity#getName()
	 * @see #getEDSEntity()
	 * @generated
	 */
	EAttribute getEDSEntity_Name();

	/**
	 * Returns the meta object for enum '{@link dsk.EDSCType <em>EDSC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EDSC Type</em>'.
	 * @see dsk.EDSCType
	 * @generated
	 */
	EEnum getEDSCType();

	/**
	 * Returns the meta object for enum '{@link dsk.EEventType <em>EEvent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EEvent Type</em>'.
	 * @see dsk.EEventType
	 * @generated
	 */
	EEnum getEEventType();

	/**
	 * Returns the meta object for enum '{@link dsk.EMetaCmdType <em>EMeta Cmd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EMeta Cmd Type</em>'.
	 * @see dsk.EMetaCmdType
	 * @generated
	 */
	EEnum getEMetaCmdType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DskFactory getDskFactory();

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
		 * The meta object literal for the '{@link dsk.impl.DskImpl <em>Dsk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsk.impl.DskImpl
		 * @see dsk.impl.DskPackageImpl#getDsk()
		 * @generated
		 */
		EClass DSK = eINSTANCE.getDsk();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSK__DOMAIN = eINSTANCE.getDsk_Domain();

		/**
		 * The meta object literal for the '<em><b>Dscs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSK__DSCS = eINSTANCE.getDsk_Dscs();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSK__PROCEDURES = eINSTANCE.getDsk_Procedures();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSK__EVENTS = eINSTANCE.getDsk_Events();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSK__ENTITIES = eINSTANCE.getDsk_Entities();

		/**
		 * The meta object literal for the '{@link dsk.impl.EProcedureImpl <em>EProcedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsk.impl.EProcedureImpl
		 * @see dsk.impl.DskPackageImpl#getEProcedure()
		 * @generated
		 */
		EClass EPROCEDURE = eINSTANCE.getEProcedure();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPROCEDURE__ID = eINSTANCE.getEProcedure_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPROCEDURE__NAME = eINSTANCE.getEProcedure_Name();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPROCEDURE__CLASSIFIER = eINSTANCE.getEProcedure_Classifier();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPROCEDURE__IMPL = eINSTANCE.getEProcedure_Impl();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPROCEDURE__DEPENDENCIES = eINSTANCE.getEProcedure_Dependencies();

		/**
		 * The meta object literal for the '{@link dsk.impl.EDSCImpl <em>EDSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsk.impl.EDSCImpl
		 * @see dsk.impl.DskPackageImpl#getEDSC()
		 * @generated
		 */
		EClass EDSC = eINSTANCE.getEDSC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDSC__NAME = eINSTANCE.getEDSC_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDSC__KIND = eINSTANCE.getEDSC_Kind();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSC__PARAMETERS = eINSTANCE.getEDSC_Parameters();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSC__ENTITY = eINSTANCE.getEDSC_Entity();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDSC__CONDITION = eINSTANCE.getEDSC_Condition();

		/**
		 * The meta object literal for the '{@link dsk.impl.EExecutionUnitImpl <em>EExecution Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsk.impl.EExecutionUnitImpl
		 * @see dsk.impl.DskPackageImpl#getEExecutionUnit()
		 * @generated
		 */
		EClass EEXECUTION_UNIT = eINSTANCE.getEExecutionUnit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEXECUTION_UNIT__ID = eINSTANCE.getEExecutionUnit_Id();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEXECUTION_UNIT__BODY = eINSTANCE.getEExecutionUnit_Body();

		/**
		 * The meta object literal for the '{@link dsk.impl.EDSEventImpl <em>EDS Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsk.impl.EDSEventImpl
		 * @see dsk.impl.DskPackageImpl#getEDSEvent()
		 * @generated
		 */
		EClass EDS_EVENT = eINSTANCE.getEDSEvent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDS_EVENT__ID = eINSTANCE.getEDSEvent_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDS_EVENT__NAME = eINSTANCE.getEDSEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDS_EVENT__TYPE = eINSTANCE.getEDSEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Meta Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDS_EVENT__META_CMD = eINSTANCE.getEDSEvent_MetaCmd();

		/**
		 * The meta object literal for the '{@link dsk.impl.EDSEntityImpl <em>EDS Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsk.impl.EDSEntityImpl
		 * @see dsk.impl.DskPackageImpl#getEDSEntity()
		 * @generated
		 */
		EClass EDS_ENTITY = eINSTANCE.getEDSEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDS_ENTITY__NAME = eINSTANCE.getEDSEntity_Name();

		/**
		 * The meta object literal for the '{@link dsk.EDSCType <em>EDSC Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsk.EDSCType
		 * @see dsk.impl.DskPackageImpl#getEDSCType()
		 * @generated
		 */
		EEnum EDSC_TYPE = eINSTANCE.getEDSCType();

		/**
		 * The meta object literal for the '{@link dsk.EEventType <em>EEvent Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsk.EEventType
		 * @see dsk.impl.DskPackageImpl#getEEventType()
		 * @generated
		 */
		EEnum EEVENT_TYPE = eINSTANCE.getEEventType();

		/**
		 * The meta object literal for the '{@link dsk.EMetaCmdType <em>EMeta Cmd Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsk.EMetaCmdType
		 * @see dsk.impl.DskPackageImpl#getEMetaCmdType()
		 * @generated
		 */
		EEnum EMETA_CMD_TYPE = eINSTANCE.getEMetaCmdType();

	}

} //DskPackage
