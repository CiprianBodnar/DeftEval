/**
 */
package deftEvalDiagr.impl;

import deftEvalDiagr.DefinitionMarker;
import deftEvalDiagr.DeftEvalDiagrPackage;
import deftEvalDiagr.SentenceTokenise;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sentence Tokenise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.impl.SentenceTokeniseImpl#getListOfSentence <em>List Of Sentence</em>}</li>
 *   <li>{@link deftEvalDiagr.impl.SentenceTokeniseImpl#getDefinitionmarker <em>Definitionmarker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SentenceTokeniseImpl extends MinimalEObjectImpl.Container implements SentenceTokenise {
	/**
	 * The cached value of the '{@link #getListOfSentence() <em>List Of Sentence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfSentence()
	 * @generated
	 * @ordered
	 */
	protected EList<String> listOfSentence;

	/**
	 * The cached value of the '{@link #getDefinitionmarker() <em>Definitionmarker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionmarker()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinitionMarker> definitionmarker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SentenceTokeniseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeftEvalDiagrPackage.Literals.SENTENCE_TOKENISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getListOfSentence() {
		if (listOfSentence == null) {
			listOfSentence = new EDataTypeUniqueEList<String>(String.class, this,
					DeftEvalDiagrPackage.SENTENCE_TOKENISE__LIST_OF_SENTENCE);
		}
		return listOfSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefinitionMarker> getDefinitionmarker() {
		if (definitionmarker == null) {
			definitionmarker = new EObjectContainmentEList<DefinitionMarker>(DefinitionMarker.class, this,
					DeftEvalDiagrPackage.SENTENCE_TOKENISE__DEFINITIONMARKER);
		}
		return definitionmarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> tokenizeCorpus() {
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
	public EList<String> getSentence() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE__DEFINITIONMARKER:
			return ((InternalEList<?>) getDefinitionmarker()).basicRemove(otherEnd, msgs);
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
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE__LIST_OF_SENTENCE:
			return getListOfSentence();
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE__DEFINITIONMARKER:
			return getDefinitionmarker();
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
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE__LIST_OF_SENTENCE:
			getListOfSentence().clear();
			getListOfSentence().addAll((Collection<? extends String>) newValue);
			return;
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE__DEFINITIONMARKER:
			getDefinitionmarker().clear();
			getDefinitionmarker().addAll((Collection<? extends DefinitionMarker>) newValue);
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
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE__LIST_OF_SENTENCE:
			getListOfSentence().clear();
			return;
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE__DEFINITIONMARKER:
			getDefinitionmarker().clear();
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
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE__LIST_OF_SENTENCE:
			return listOfSentence != null && !listOfSentence.isEmpty();
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE__DEFINITIONMARKER:
			return definitionmarker != null && !definitionmarker.isEmpty();
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
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE___TOKENIZE_CORPUS:
			return tokenizeCorpus();
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE___GET_SENTENCE:
			return getSentence();
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
		result.append(" (listOfSentence: ");
		result.append(listOfSentence);
		result.append(')');
		return result.toString();
	}

} //SentenceTokeniseImpl
