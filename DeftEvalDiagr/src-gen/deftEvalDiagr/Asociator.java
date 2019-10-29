/**
 */
package deftEvalDiagr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asociator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.Asociator#getListOfDefinition <em>List Of Definition</em>}</li>
 *   <li>{@link deftEvalDiagr.Asociator#getDefinitionmarker <em>Definitionmarker</em>}</li>
 * </ul>
 *
 * @see deftEvalDiagr.DeftEvalDiagrPackage#getAsociator()
 * @model
 * @generated
 */
public interface Asociator extends EObject {
	/**
	 * Returns the value of the '<em><b>List Of Definition</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Definition</em>' attribute list.
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getAsociator_ListOfDefinition()
	 * @model
	 * @generated
	 */
	EList<String> getListOfDefinition();

	/**
	 * Returns the value of the '<em><b>Definitionmarker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitionmarker</em>' reference.
	 * @see #setDefinitionmarker(DefinitionMarker)
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getAsociator_Definitionmarker()
	 * @model
	 * @generated
	 */
	DefinitionMarker getDefinitionmarker();

	/**
	 * Sets the value of the '{@link deftEvalDiagr.Asociator#getDefinitionmarker <em>Definitionmarker</em>}' reference.
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
	EList<TaggedDefinition> associteDefinition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TypeOfAssociation typeAssociation();

} // Asociator
