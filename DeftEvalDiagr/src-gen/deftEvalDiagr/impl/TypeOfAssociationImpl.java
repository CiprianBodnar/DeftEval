/**
 */
package deftEvalDiagr.impl;

import deftEvalDiagr.DeftEvalDiagrPackage;
import deftEvalDiagr.TypeOfAssociation;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Of Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.impl.TypeOfAssociationImpl#getTypeAssociation <em>Type Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeOfAssociationImpl extends AsociatorImpl implements TypeOfAssociation {
	/**
	 * The cached value of the '{@link #getTypeAssociation() <em>Type Association</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> typeAssociation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOfAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeftEvalDiagrPackage.Literals.TYPE_OF_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTypeAssociation() {
		if (typeAssociation == null) {
			typeAssociation = new EDataTypeUniqueEList<String>(String.class, this,
					DeftEvalDiagrPackage.TYPE_OF_ASSOCIATION__TYPE_ASSOCIATION);
		}
		return typeAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeftEvalDiagrPackage.TYPE_OF_ASSOCIATION__TYPE_ASSOCIATION:
			return getTypeAssociation();
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
		case DeftEvalDiagrPackage.TYPE_OF_ASSOCIATION__TYPE_ASSOCIATION:
			getTypeAssociation().clear();
			getTypeAssociation().addAll((Collection<? extends String>) newValue);
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
		case DeftEvalDiagrPackage.TYPE_OF_ASSOCIATION__TYPE_ASSOCIATION:
			getTypeAssociation().clear();
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
		case DeftEvalDiagrPackage.TYPE_OF_ASSOCIATION__TYPE_ASSOCIATION:
			return typeAssociation != null && !typeAssociation.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (typeAssociation: ");
		result.append(typeAssociation);
		result.append(')');
		return result.toString();
	}

} //TypeOfAssociationImpl
