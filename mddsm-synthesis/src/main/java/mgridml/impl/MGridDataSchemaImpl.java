/**
 */
package mgridml.impl;

import java.util.Collection;

import m4md.impl.EDataSchemaImpl;

import mgridml.MDGrid;
import mgridml.MGridDataSchema;
import mgridml.MgridmlPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MGrid Data Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mgridml.impl.MGridDataSchemaImpl#getMdGrid <em>Md Grid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MGridDataSchemaImpl extends EDataSchemaImpl implements MGridDataSchema {
	/**
	 * The cached value of the '{@link #getMdGrid() <em>Md Grid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMdGrid()
	 * @generated
	 * @ordered
	 */
	protected EList<MDGrid> mdGrid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MGridDataSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MgridmlPackage.Literals.MGRID_DATA_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MDGrid> getMdGrid() {
		if (mdGrid == null) {
			mdGrid = new EObjectContainmentEList<MDGrid>(MDGrid.class, this, MgridmlPackage.MGRID_DATA_SCHEMA__MD_GRID);
		}
		return mdGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MgridmlPackage.MGRID_DATA_SCHEMA__MD_GRID:
				return ((InternalEList<?>)getMdGrid()).basicRemove(otherEnd, msgs);
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
			case MgridmlPackage.MGRID_DATA_SCHEMA__MD_GRID:
				return getMdGrid();
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
			case MgridmlPackage.MGRID_DATA_SCHEMA__MD_GRID:
				getMdGrid().clear();
				getMdGrid().addAll((Collection<? extends MDGrid>)newValue);
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
			case MgridmlPackage.MGRID_DATA_SCHEMA__MD_GRID:
				getMdGrid().clear();
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
			case MgridmlPackage.MGRID_DATA_SCHEMA__MD_GRID:
				return mdGrid != null && !mdGrid.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MGridDataSchemaImpl
