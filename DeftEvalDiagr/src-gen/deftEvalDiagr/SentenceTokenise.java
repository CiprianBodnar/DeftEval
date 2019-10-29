/**
 */
package deftEvalDiagr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sentence Tokenise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.SentenceTokenise#getListOfSentence <em>List Of Sentence</em>}</li>
 *   <li>{@link deftEvalDiagr.SentenceTokenise#getDefinitionmarker <em>Definitionmarker</em>}</li>
 *   <li>{@link deftEvalDiagr.SentenceTokenise#getFrequencycomputer <em>Frequencycomputer</em>}</li>
 * </ul>
 *
 * @see deftEvalDiagr.DeftEvalDiagrPackage#getSentenceTokenise()
 * @model
 * @generated
 */
public interface SentenceTokenise extends EObject {
	/**
	 * Returns the value of the '<em><b>List Of Sentence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Sentence</em>' attribute list.
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getSentenceTokenise_ListOfSentence()
	 * @model
	 * @generated
	 */
	EList<String> getListOfSentence();

	/**
	 * Returns the value of the '<em><b>Definitionmarker</b></em>' containment reference list.
	 * The list contents are of type {@link deftEvalDiagr.DefinitionMarker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitionmarker</em>' containment reference list.
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getSentenceTokenise_Definitionmarker()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionMarker> getDefinitionmarker();

	/**
	 * Returns the value of the '<em><b>Frequencycomputer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequencycomputer</em>' reference.
	 * @see #setFrequencycomputer(FrequencyComputer)
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getSentenceTokenise_Frequencycomputer()
	 * @model
	 * @generated
	 */
	FrequencyComputer getFrequencycomputer();

	/**
	 * Sets the value of the '{@link deftEvalDiagr.SentenceTokenise#getFrequencycomputer <em>Frequencycomputer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequencycomputer</em>' reference.
	 * @see #getFrequencycomputer()
	 * @generated
	 */
	void setFrequencycomputer(FrequencyComputer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> tokenizeCorpus();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getSentence();

} // SentenceTokenise
