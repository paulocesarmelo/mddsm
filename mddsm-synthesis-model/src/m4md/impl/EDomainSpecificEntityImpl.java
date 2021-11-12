/**
 */
package m4md.impl;

import java.util.Collection;

import m4md.EDomainSpecificCommand;
import m4md.EDomainSpecificEntity;
import m4md.M4mdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDomain Specific Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m4md.impl.EDomainSpecificEntityImpl#getCommandPriority <em>Command Priority</em>}</li>
 *   <li>{@link m4md.impl.EDomainSpecificEntityImpl#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EDomainSpecificEntityImpl extends MinimalEObjectImpl.Container implements EDomainSpecificEntity {
	/**
	 * The default value of the '{@link #getCommandPriority() <em>Command Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int COMMAND_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCommandPriority() <em>Command Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandPriority()
	 * @generated
	 * @ordered
	 */
	protected int commandPriority = COMMAND_PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCmd() <em>Cmd</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected EList<EDomainSpecificCommand> cmd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDomainSpecificEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M4mdPackage.Literals.EDOMAIN_SPECIFIC_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommandPriority() {
		return commandPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandPriority(int newCommandPriority) {
		int oldCommandPriority = commandPriority;
		commandPriority = newCommandPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__COMMAND_PRIORITY, oldCommandPriority, commandPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDomainSpecificCommand> getCmd() {
		if (cmd == null) {
			cmd = new EObjectContainmentEList<EDomainSpecificCommand>(EDomainSpecificCommand.class, this, M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__CMD);
		}
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__CMD:
				return ((InternalEList<?>)getCmd()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__COMMAND_PRIORITY:
				return getCommandPriority();
			case M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__CMD:
				return getCmd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__COMMAND_PRIORITY:
				setCommandPriority((Integer)newValue);
				return;
			case M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__CMD:
				getCmd().clear();
				getCmd().addAll((Collection<? extends EDomainSpecificCommand>)newValue);
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
			case M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__COMMAND_PRIORITY:
				setCommandPriority(COMMAND_PRIORITY_EDEFAULT);
				return;
			case M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__CMD:
				getCmd().clear();
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
			case M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__COMMAND_PRIORITY:
				return commandPriority != COMMAND_PRIORITY_EDEFAULT;
			case M4mdPackage.EDOMAIN_SPECIFIC_ENTITY__CMD:
				return cmd != null && !cmd.isEmpty();
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
		result.append(" (commandPriority: ");
		result.append(commandPriority);
		result.append(')');
		return result.toString();
	}

} //EDomainSpecificEntityImpl
