/**
 */
package deftEvalDiagr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.DefinitionMarker#getSentence <em>Sentence</em>}</li>
 *   <li>{@link deftEvalDiagr.DefinitionMarker#getTaggeddefinition <em>Taggeddefinition</em>}</li>
 *   <li>{@link deftEvalDiagr.DefinitionMarker#getAsociator <em>Asociator</em>}</li>
 * </ul>
 *
 * @see deftEvalDiagr.DeftEvalDiagrPackage#getDefinitionMarker()
 * @model
 * @generated
 */
public interface DefinitionMarker extends EObject {
	/**
	 * Returns the value of the '<em><b>Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentence</em>' attribute.
	 * @see #setSentence(String)
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getDefinitionMarker_Sentence()
	 * @model
	 * @generated
	 */
	String getSentence();

	/**
	 * Sets the value of the '{@link deftEvalDiagr.DefinitionMarker#getSentence <em>Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sentence</em>' attribute.
	 * @see #getSentence()
	 * @generated
	 */
	void setSentence(String value);

	/**
	 * Returns the value of the '<em><b>Taggeddefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taggeddefinition</em>' reference.
	 * @see #setTaggeddefinition(TaggedDefinition)
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getDefinitionMarker_Taggeddefinition()
	 * @model
	 * @generated
	 */
	TaggedDefinition getTaggeddefinition();

	/**
	 * Sets the value of the '{@link deftEvalDiagr.DefinitionMarker#getTaggeddefinition <em>Taggeddefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taggeddefinition</em>' reference.
	 * @see #getTaggeddefinition()
	 * @generated
	 */
	void setTaggeddefinition(TaggedDefinition value);

	/**
	 * Returns the value of the '<em><b>Asociator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asociator</em>' reference.
	 * @see #setAsociator(Asociator)
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getDefinitionMarker_Asociator()
	 * @model
	 * @generated
	 */
	Asociator getAsociator();

	/**
	 * Sets the value of the '{@link deftEvalDiagr.DefinitionMarker#getAsociator <em>Asociator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asociator</em>' reference.
	 * @see #getAsociator()
	 * @generated
	 */
	void setAsociator(Asociator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TaggedDefinition tagSentence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	TaggedDefinition getTaggedDefinition();

} // DefinitionMarker
