/**
 */
package deftEvalDiagr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corpus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.Corpus#getInputText <em>Input Text</em>}</li>
 *   <li>{@link deftEvalDiagr.Corpus#getSentencetokenise <em>Sentencetokenise</em>}</li>
 * </ul>
 *
 * @see deftEvalDiagr.DeftEvalDiagrPackage#getCorpus()
 * @model
 * @generated
 */
public interface Corpus extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Text</em>' attribute.
	 * @see #setInputText(String)
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getCorpus_InputText()
	 * @model unique="false"
	 * @generated
	 */
	String getInputText();

	/**
	 * Sets the value of the '{@link deftEvalDiagr.Corpus#getInputText <em>Input Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Text</em>' attribute.
	 * @see #getInputText()
	 * @generated
	 */
	void setInputText(String value);

	/**
	 * Returns the value of the '<em><b>Sentencetokenise</b></em>' containment reference list.
	 * The list contents are of type {@link deftEvalDiagr.SentenceTokenise}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentencetokenise</em>' containment reference list.
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getCorpus_Sentencetokenise()
	 * @model containment="true"
	 * @generated
	 */
	EList<SentenceTokenise> getSentencetokenise();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String geInputText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String setInputText();

} // Corpus
