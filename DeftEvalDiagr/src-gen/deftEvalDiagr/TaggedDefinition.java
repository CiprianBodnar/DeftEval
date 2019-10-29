/**
 */
package deftEvalDiagr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tagged Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.TaggedDefinition#getSentence <em>Sentence</em>}</li>
 *   <li>{@link deftEvalDiagr.TaggedDefinition#getStartTag <em>Start Tag</em>}</li>
 *   <li>{@link deftEvalDiagr.TaggedDefinition#getInsideTag <em>Inside Tag</em>}</li>
 *   <li>{@link deftEvalDiagr.TaggedDefinition#getOutsideTag <em>Outside Tag</em>}</li>
 *   <li>{@link deftEvalDiagr.TaggedDefinition#getDefinitionmarker <em>Definitionmarker</em>}</li>
 * </ul>
 *
 * @see deftEvalDiagr.DeftEvalDiagrPackage#getTaggedDefinition()
 * @model
 * @generated
 */
public interface TaggedDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentence</em>' attribute.
	 * @see #setSentence(String)
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getTaggedDefinition_Sentence()
	 * @model
	 * @generated
	 */
	String getSentence();

	/**
	 * Sets the value of the '{@link deftEvalDiagr.TaggedDefinition#getSentence <em>Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sentence</em>' attribute.
	 * @see #getSentence()
	 * @generated
	 */
	void setSentence(String value);

	/**
	 * Returns the value of the '<em><b>Start Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Tag</em>' attribute.
	 * @see #setStartTag(String)
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getTaggedDefinition_StartTag()
	 * @model
	 * @generated
	 */
	String getStartTag();

	/**
	 * Sets the value of the '{@link deftEvalDiagr.TaggedDefinition#getStartTag <em>Start Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Tag</em>' attribute.
	 * @see #getStartTag()
	 * @generated
	 */
	void setStartTag(String value);

	/**
	 * Returns the value of the '<em><b>Inside Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inside Tag</em>' attribute.
	 * @see #setInsideTag(String)
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getTaggedDefinition_InsideTag()
	 * @model
	 * @generated
	 */
	String getInsideTag();

	/**
	 * Sets the value of the '{@link deftEvalDiagr.TaggedDefinition#getInsideTag <em>Inside Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inside Tag</em>' attribute.
	 * @see #getInsideTag()
	 * @generated
	 */
	void setInsideTag(String value);

	/**
	 * Returns the value of the '<em><b>Outside Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outside Tag</em>' attribute.
	 * @see #setOutsideTag(String)
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getTaggedDefinition_OutsideTag()
	 * @model
	 * @generated
	 */
	String getOutsideTag();

	/**
	 * Sets the value of the '{@link deftEvalDiagr.TaggedDefinition#getOutsideTag <em>Outside Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside Tag</em>' attribute.
	 * @see #getOutsideTag()
	 * @generated
	 */
	void setOutsideTag(String value);

	/**
	 * Returns the value of the '<em><b>Definitionmarker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitionmarker</em>' reference.
	 * @see #setDefinitionmarker(DefinitionMarker)
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getTaggedDefinition_Definitionmarker()
	 * @model
	 * @generated
	 */
	DefinitionMarker getDefinitionmarker();

	/**
	 * Sets the value of the '{@link deftEvalDiagr.TaggedDefinition#getDefinitionmarker <em>Definitionmarker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitionmarker</em>' reference.
	 * @see #getDefinitionmarker()
	 * @generated
	 */
	void setDefinitionmarker(DefinitionMarker value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String sentenceTagger();

} // TaggedDefinition
