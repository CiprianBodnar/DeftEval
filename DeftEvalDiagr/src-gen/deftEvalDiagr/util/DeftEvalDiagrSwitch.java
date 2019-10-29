/**
 */
package deftEvalDiagr.util;

import deftEvalDiagr.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see deftEvalDiagr.DeftEvalDiagrPackage
 * @generated
 */
public class DeftEvalDiagrSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeftEvalDiagrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeftEvalDiagrSwitch() {
		if (modelPackage == null) {
			modelPackage = DeftEvalDiagrPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DeftEvalDiagrPackage.CORPUS: {
			Corpus corpus = (Corpus) theEObject;
			T result = caseCorpus(corpus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE: {
			SentenceTokenise sentenceTokenise = (SentenceTokenise) theEObject;
			T result = caseSentenceTokenise(sentenceTokenise);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeftEvalDiagrPackage.DEFINITION_MARKER: {
			DefinitionMarker definitionMarker = (DefinitionMarker) theEObject;
			T result = caseDefinitionMarker(definitionMarker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeftEvalDiagrPackage.TAGGED_DEFINITION: {
			TaggedDefinition taggedDefinition = (TaggedDefinition) theEObject;
			T result = caseTaggedDefinition(taggedDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeftEvalDiagrPackage.ASOCIATOR: {
			Asociator asociator = (Asociator) theEObject;
			T result = caseAsociator(asociator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DeftEvalDiagrPackage.TYPE_OF_ASSOCIATION: {
			TypeOfAssociation typeOfAssociation = (TypeOfAssociation) theEObject;
			T result = caseTypeOfAssociation(typeOfAssociation);
			if (result == null)
				result = caseAsociator(typeOfAssociation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corpus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corpus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorpus(Corpus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sentence Tokenise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sentence Tokenise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSentenceTokenise(SentenceTokenise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionMarker(DefinitionMarker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tagged Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagged Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaggedDefinition(TaggedDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asociator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asociator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsociator(Asociator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Of Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Of Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOfAssociation(TypeOfAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DeftEvalDiagrSwitch
