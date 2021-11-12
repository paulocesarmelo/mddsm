/**
 */
package testing2.impl;

import java.util.Collection;

import m4md.impl.EDomainSpecificCommandImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import testing2.ClassCommand;
import testing2.CmdType;
import testing2.Testing2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testing2.impl.ClassCommandImpl#getCmd <em>Cmd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassCommandImpl extends EDomainSpecificCommandImpl implements ClassCommand {
	/**
	 * The cached value of the '{@link #getCmd() <em>Cmd</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd()
	 * @generated
	 * @ordered
	 */
	protected EList<CmdType> cmd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Testing2Package.Literals.CLASS_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmdType> getCmd() {
		if (cmd == null) {
			cmd = new EDataTypeUniqueEList<CmdType>(CmdType.class, this, Testing2Package.CLASS_COMMAND__CMD);
		}
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Testing2Package.CLASS_COMMAND__CMD:
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
			case Testing2Package.CLASS_COMMAND__CMD:
				getCmd().clear();
				getCmd().addAll((Collection<? extends CmdType>)newValue);
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
			case Testing2Package.CLASS_COMMAND__CMD:
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
			case Testing2Package.CLASS_COMMAND__CMD:
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
		result.append(" (cmd: ");
		result.append(cmd);
		result.append(')');
		return result.toString();
	}

} //ClassCommandImpl
