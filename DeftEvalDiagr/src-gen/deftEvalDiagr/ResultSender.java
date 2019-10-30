/**
 */
package deftEvalDiagr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Sender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.ResultSender#getResultDefinitions <em>Result Definitions</em>}</li>
 * </ul>
 *
 * @see deftEvalDiagr.DeftEvalDiagrPackage#getResultSender()
 * @model abstract="true"
 * @generated
 */
public interface ResultSender extends EObject {
	/**
	 * Returns the value of the '<em><b>Result Definitions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Definitions</em>' attribute list.
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#getResultSender_ResultDefinitions()
	 * @model
	 * @generated
	 */
	EList<String> getResultDefinitions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<String> sendResult();

} // ResultSender
