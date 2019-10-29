/**
 */
package deftEvalDiagr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see deftEvalDiagr.DeftEvalDiagrPackage
 * @generated
 */
public interface DeftEvalDiagrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeftEvalDiagrFactory eINSTANCE = deftEvalDiagr.impl.DeftEvalDiagrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Corpus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corpus</em>'.
	 * @generated
	 */
	Corpus createCorpus();

	/**
	 * Returns a new object of class '<em>Sentence Tokenise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sentence Tokenise</em>'.
	 * @generated
	 */
	SentenceTokenise createSentenceTokenise();

	/**
	 * Returns a new object of class '<em>Definition Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Marker</em>'.
	 * @generated
	 */
	DefinitionMarker createDefinitionMarker();

	/**
	 * Returns a new object of class '<em>Tagged Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tagged Definition</em>'.
	 * @generated
	 */
	TaggedDefinition createTaggedDefinition();

	/**
	 * Returns a new object of class '<em>Asociator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asociator</em>'.
	 * @generated
	 */
	Asociator createAsociator();

	/**
	 * Returns a new object of class '<em>Type Of Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Of Association</em>'.
	 * @generated
	 */
	TypeOfAssociation createTypeOfAssociation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeftEvalDiagrPackage getDeftEvalDiagrPackage();

} //DeftEvalDiagrFactory
