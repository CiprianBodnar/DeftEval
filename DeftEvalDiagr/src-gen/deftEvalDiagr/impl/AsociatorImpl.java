/**
 */
package deftEvalDiagr.impl;

import deftEvalDiagr.Asociator;
import deftEvalDiagr.DefinitionMarker;
import deftEvalDiagr.DeftEvalDiagrPackage;
import deftEvalDiagr.TaggedDefinition;
import deftEvalDiagr.TypeOfAssociation;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asociator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.impl.AsociatorImpl#getListOfDefinition <em>List Of Definition</em>}</li>
 *   <li>{@link deftEvalDiagr.impl.AsociatorImpl#getDefinitionmarker <em>Definitionmarker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsociatorImpl extends MinimalEObjectImpl.Container implements Asociator {
	/**
	 * The cached value of the '{@link #getListOfDefinition() <em>List Of Definition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<String> listOfDefinition;

	/**
	 * The cached value of the '{@link #getDefinitionmarker() <em>Definitionmarker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionmarker()
	 * @generated
	 * @ordered
	 */
	protected DefinitionMarker definitionmarker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsociatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeftEvalDiagrPackage.Literals.ASOCIATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getListOfDefinition() {
		if (listOfDefinition == null) {
			listOfDefinition = new EDataTypeUniqueEList<String>(String.class, this,
					DeftEvalDiagrPackage.ASOCIATOR__LIST_OF_DEFINITION);
		}
		return listOfDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionMarker getDefinitionmarker() {
		if (definitionmarker != null && definitionmarker.eIsProxy()) {
			InternalEObject oldDefinitionmarker = (InternalEObject) definitionmarker;
			definitionmarker = (DefinitionMarker) eResolveProxy(oldDefinitionmarker);
			if (definitionmarker != oldDefinitionmarker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DeftEvalDiagrPackage.ASOCIATOR__DEFINITIONMARKER, oldDefinitionmarker, definitionmarker));
			}
		}
		return definitionmarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionMarker basicGetDefinitionmarker() {
		return definitionmarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitionmarker(DefinitionMarker newDefinitionmarker) {
		DefinitionMarker oldDefinitionmarker = definitionmarker;
		definitionmarker = newDefinitionmarker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeftEvalDiagrPackage.ASOCIATOR__DEFINITIONMARKER,
					oldDefinitionmarker, definitionmarker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaggedDefinition> associteDefinition() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeOfAssociation typeAssociation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeftEvalDiagrPackage.ASOCIATOR__LIST_OF_DEFINITION:
			return getListOfDefinition();
		case DeftEvalDiagrPackage.ASOCIATOR__DEFINITIONMARKER:
			if (resolve)
				return getDefinitionmarker();
			return basicGetDefinitionmarker();
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
		case DeftEvalDiagrPackage.ASOCIATOR__LIST_OF_DEFINITION:
			getListOfDefinition().clear();
			getListOfDefinition().addAll((Collection<? extends String>) newValue);
			return;
		case DeftEvalDiagrPackage.ASOCIATOR__DEFINITIONMARKER:
			setDefinitionmarker((DefinitionMarker) newValue);
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
		case DeftEvalDiagrPackage.ASOCIATOR__LIST_OF_DEFINITION:
			getListOfDefinition().clear();
			return;
		case DeftEvalDiagrPackage.ASOCIATOR__DEFINITIONMARKER:
			setDefinitionmarker((DefinitionMarker) null);
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
		case DeftEvalDiagrPackage.ASOCIATOR__LIST_OF_DEFINITION:
			return listOfDefinition != null && !listOfDefinition.isEmpty();
		case DeftEvalDiagrPackage.ASOCIATOR__DEFINITIONMARKER:
			return definitionmarker != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DeftEvalDiagrPackage.ASOCIATOR___ASSOCITE_DEFINITION:
			return associteDefinition();
		case DeftEvalDiagrPackage.ASOCIATOR___TYPE_ASSOCIATION:
			return typeAssociation();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (listOfDefinition: ");
		result.append(listOfDefinition);
		result.append(')');
		return result.toString();
	}

} //AsociatorImpl
