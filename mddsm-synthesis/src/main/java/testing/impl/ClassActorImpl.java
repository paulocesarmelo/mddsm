/**
 */
package testing.impl;

import java.util.Collection;

import metalang4md.impl.EActorImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import testing.BaseClass;
import testing.ClassActor;
import testing.ClassCommand;
import testing.CmdType;
import testing.TestingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testing.impl.ClassActorImpl#getAttrInt <em>Attr Int</em>}</li>
 *   <li>{@link testing.impl.ClassActorImpl#getAttrString <em>Attr String</em>}</li>
 *   <li>{@link testing.impl.ClassActorImpl#getByReferences <em>By References</em>}</li>
 *   <li>{@link testing.impl.ClassActorImpl#getByComposition <em>By Composition</em>}</li>
 *   <li>{@link testing.impl.ClassActorImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link testing.impl.ClassActorImpl#getCmd2 <em>Cmd2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassActorImpl extends EActorImpl implements ClassActor {
	/**
	 * The default value of the '{@link #getAttrInt() <em>Attr Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrInt()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTR_INT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttrInt() <em>Attr Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrInt()
	 * @generated
	 * @ordered
	 */
	protected int attrInt = ATTR_INT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttrString() <em>Attr String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrString()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrString() <em>Attr String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrString()
	 * @generated
	 * @ordered
	 */
	protected String attrString = ATTR_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getByReferences() <em>By References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> byReferences;

	/**
	 * The cached value of the '{@link #getByComposition() <em>By Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> byComposition;

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
	 * The cached value of the '{@link #getCmd2() <em>Cmd2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmd2()
	 * @generated
	 * @ordered
	 */
	protected ClassCommand cmd2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingPackage.Literals.CLASS_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttrInt() {
		return attrInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrInt(int newAttrInt) {
		int oldAttrInt = attrInt;
		attrInt = newAttrInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackage.CLASS_ACTOR__ATTR_INT, oldAttrInt, attrInt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttrString() {
		return attrString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrString(String newAttrString) {
		String oldAttrString = attrString;
		attrString = newAttrString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackage.CLASS_ACTOR__ATTR_STRING, oldAttrString, attrString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getByReferences() {
		if (byReferences == null) {
			byReferences = new EObjectResolvingEList<EObject>(EObject.class, this, TestingPackage.CLASS_ACTOR__BY_REFERENCES);
		}
		return byReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getByComposition() {
		if (byComposition == null) {
			byComposition = new EObjectContainmentEList<EObject>(EObject.class, this, TestingPackage.CLASS_ACTOR__BY_COMPOSITION);
		}
		return byComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmdType> getCmd() {
		if (cmd == null) {
			cmd = new EDataTypeUniqueEList<CmdType>(CmdType.class, this, TestingPackage.CLASS_ACTOR__CMD);
		}
		return cmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassCommand getCmd2() {
		return cmd2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCmd2(ClassCommand newCmd2, NotificationChain msgs) {
		ClassCommand oldCmd2 = cmd2;
		cmd2 = newCmd2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestingPackage.CLASS_ACTOR__CMD2, oldCmd2, newCmd2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmd2(ClassCommand newCmd2) {
		if (newCmd2 != cmd2) {
			NotificationChain msgs = null;
			if (cmd2 != null)
				msgs = ((InternalEObject)cmd2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestingPackage.CLASS_ACTOR__CMD2, null, msgs);
			if (newCmd2 != null)
				msgs = ((InternalEObject)newCmd2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestingPackage.CLASS_ACTOR__CMD2, null, msgs);
			msgs = basicSetCmd2(newCmd2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingPackage.CLASS_ACTOR__CMD2, newCmd2, newCmd2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestingPackage.CLASS_ACTOR__BY_COMPOSITION:
				return ((InternalEList<?>)getByComposition()).basicRemove(otherEnd, msgs);
			case TestingPackage.CLASS_ACTOR__CMD2:
				return basicSetCmd2(null, msgs);
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
			case TestingPackage.CLASS_ACTOR__ATTR_INT:
				return getAttrInt();
			case TestingPackage.CLASS_ACTOR__ATTR_STRING:
				return getAttrString();
			case TestingPackage.CLASS_ACTOR__BY_REFERENCES:
				return getByReferences();
			case TestingPackage.CLASS_ACTOR__BY_COMPOSITION:
				return getByComposition();
			case TestingPackage.CLASS_ACTOR__CMD:
				return getCmd();
			case TestingPackage.CLASS_ACTOR__CMD2:
				return getCmd2();
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
			case TestingPackage.CLASS_ACTOR__ATTR_INT:
				setAttrInt((Integer)newValue);
				return;
			case TestingPackage.CLASS_ACTOR__ATTR_STRING:
				setAttrString((String)newValue);
				return;
			case TestingPackage.CLASS_ACTOR__BY_REFERENCES:
				getByReferences().clear();
				getByReferences().addAll((Collection<? extends EObject>)newValue);
				return;
			case TestingPackage.CLASS_ACTOR__BY_COMPOSITION:
				getByComposition().clear();
				getByComposition().addAll((Collection<? extends EObject>)newValue);
				return;
			case TestingPackage.CLASS_ACTOR__CMD:
				getCmd().clear();
				getCmd().addAll((Collection<? extends CmdType>)newValue);
				return;
			case TestingPackage.CLASS_ACTOR__CMD2:
				setCmd2((ClassCommand)newValue);
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
			case TestingPackage.CLASS_ACTOR__ATTR_INT:
				setAttrInt(ATTR_INT_EDEFAULT);
				return;
			case TestingPackage.CLASS_ACTOR__ATTR_STRING:
				setAttrString(ATTR_STRING_EDEFAULT);
				return;
			case TestingPackage.CLASS_ACTOR__BY_REFERENCES:
				getByReferences().clear();
				return;
			case TestingPackage.CLASS_ACTOR__BY_COMPOSITION:
				getByComposition().clear();
				return;
			case TestingPackage.CLASS_ACTOR__CMD:
				getCmd().clear();
				return;
			case TestingPackage.CLASS_ACTOR__CMD2:
				setCmd2((ClassCommand)null);
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
			case TestingPackage.CLASS_ACTOR__ATTR_INT:
				return attrInt != ATTR_INT_EDEFAULT;
			case TestingPackage.CLASS_ACTOR__ATTR_STRING:
				return ATTR_STRING_EDEFAULT == null ? attrString != null : !ATTR_STRING_EDEFAULT.equals(attrString);
			case TestingPackage.CLASS_ACTOR__BY_REFERENCES:
				return byReferences != null && !byReferences.isEmpty();
			case TestingPackage.CLASS_ACTOR__BY_COMPOSITION:
				return byComposition != null && !byComposition.isEmpty();
			case TestingPackage.CLASS_ACTOR__CMD:
				return cmd != null && !cmd.isEmpty();
			case TestingPackage.CLASS_ACTOR__CMD2:
				return cmd2 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BaseClass.class) {
			switch (derivedFeatureID) {
				case TestingPackage.CLASS_ACTOR__ATTR_INT: return TestingPackage.BASE_CLASS__ATTR_INT;
				case TestingPackage.CLASS_ACTOR__ATTR_STRING: return TestingPackage.BASE_CLASS__ATTR_STRING;
				case TestingPackage.CLASS_ACTOR__BY_REFERENCES: return TestingPackage.BASE_CLASS__BY_REFERENCES;
				case TestingPackage.CLASS_ACTOR__BY_COMPOSITION: return TestingPackage.BASE_CLASS__BY_COMPOSITION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BaseClass.class) {
			switch (baseFeatureID) {
				case TestingPackage.BASE_CLASS__ATTR_INT: return TestingPackage.CLASS_ACTOR__ATTR_INT;
				case TestingPackage.BASE_CLASS__ATTR_STRING: return TestingPackage.CLASS_ACTOR__ATTR_STRING;
				case TestingPackage.BASE_CLASS__BY_REFERENCES: return TestingPackage.CLASS_ACTOR__BY_REFERENCES;
				case TestingPackage.BASE_CLASS__BY_COMPOSITION: return TestingPackage.CLASS_ACTOR__BY_COMPOSITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (attrInt: ");
		result.append(attrInt);
		result.append(", attrString: ");
		result.append(attrString);
		result.append(", cmd: ");
		result.append(cmd);
		result.append(')');
		return result.toString();
	}

} //ClassActorImpl
