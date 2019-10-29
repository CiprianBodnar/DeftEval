/**
 */
package deftEvalDiagr.impl;

import deftEvalDiagr.DeftEvalDiagrPackage;
import deftEvalDiagr.ResultSender;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Sender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.impl.ResultSenderImpl#getResultDefinitions <em>Result Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResultSenderImpl extends MinimalEObjectImpl.Container implements ResultSender {
	/**
	 * The cached value of the '{@link #getResultDefinitions() <em>Result Definitions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> resultDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultSenderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeftEvalDiagrPackage.Literals.RESULT_SENDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getResultDefinitions() {
		if (resultDefinitions == null) {
			resultDefinitions = new EDataTypeUniqueEList<String>(String.class, this,
					DeftEvalDiagrPackage.RESULT_SENDER__RESULT_DEFINITIONS);
		}
		return resultDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> sendResult() {
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
		case DeftEvalDiagrPackage.RESULT_SENDER__RESULT_DEFINITIONS:
			return getResultDefinitions();
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
		case DeftEvalDiagrPackage.RESULT_SENDER__RESULT_DEFINITIONS:
			getResultDefinitions().clear();
			getResultDefinitions().addAll((Collection<? extends String>) newValue);
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
		case DeftEvalDiagrPackage.RESULT_SENDER__RESULT_DEFINITIONS:
			getResultDefinitions().clear();
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
		case DeftEvalDiagrPackage.RESULT_SENDER__RESULT_DEFINITIONS:
			return resultDefinitions != null && !resultDefinitions.isEmpty();
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
		case DeftEvalDiagrPackage.RESULT_SENDER___SEND_RESULT:
			return sendResult();
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
		result.append(" (resultDefinitions: ");
		result.append(resultDefinitions);
		result.append(')');
		return result.toString();
	}

} //ResultSenderImpl
