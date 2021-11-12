/**
 */
package m4md.impl;

import m4md.EDomainSpecificCommand;
import m4md.M4mdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDomain Specific Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m4md.impl.EDomainSpecificCommandImpl#getCmdId <em>Cmd Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EDomainSpecificCommandImpl extends MinimalEObjectImpl.Container implements EDomainSpecificCommand {
	/**
	 * The default value of the '{@link #getCmdId() <em>Cmd Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdId()
	 * @generated
	 * @ordered
	 */
	protected static final int CMD_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCmdId() <em>Cmd Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdId()
	 * @generated
	 * @ordered
	 */
	protected int cmdId = CMD_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDomainSpecificCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M4mdPackage.Literals.EDOMAIN_SPECIFIC_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCmdId() {
		return cmdId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmdId(int newCmdId) {
		int oldCmdId = cmdId;
		cmdId = newCmdId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4mdPackage.EDOMAIN_SPECIFIC_COMMAND__CMD_ID, oldCmdId, cmdId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M4mdPackage.EDOMAIN_SPECIFIC_COMMAND__CMD_ID:
				return getCmdId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case M4mdPackage.EDOMAIN_SPECIFIC_COMMAND__CMD_ID:
				setCmdId((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case M4mdPackage.EDOMAIN_SPECIFIC_COMMAND__CMD_ID:
				setCmdId(CMD_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case M4mdPackage.EDOMAIN_SPECIFIC_COMMAND__CMD_ID:
				return cmdId != CMD_ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cmdId: ");
		result.append(cmdId);
		result.append(')');
		return result.toString();
	}

} //EDomainSpecificCommandImpl
