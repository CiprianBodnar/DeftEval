/**
 */
package deftEvalDiagr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see deftEvalDiagr.DeftEvalDiagrFactory
 * @model kind="package"
 * @generated
 */
public interface DeftEvalDiagrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deftEvalDiagr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/deftEvalDiagr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "deftEvalDiagr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeftEvalDiagrPackage eINSTANCE = deftEvalDiagr.impl.DeftEvalDiagrPackageImpl.init();

	/**
	 * The meta object id for the '{@link deftEvalDiagr.impl.CorpusImpl <em>Corpus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deftEvalDiagr.impl.CorpusImpl
	 * @see deftEvalDiagr.impl.DeftEvalDiagrPackageImpl#getCorpus()
	 * @generated
	 */
	int CORPUS = 0;

	/**
	 * The feature id for the '<em><b>Input Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS__INPUT_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Sentencetokenise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS__SENTENCETOKENISE = 1;

	/**
	 * The number of structural features of the '<em>Corpus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Ge Input Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS___GE_INPUT_TEXT = 0;

	/**
	 * The operation id for the '<em>Set Input Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS___SET_INPUT_TEXT = 1;

	/**
	 * The number of operations of the '<em>Corpus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORPUS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link deftEvalDiagr.impl.SentenceTokeniseImpl <em>Sentence Tokenise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deftEvalDiagr.impl.SentenceTokeniseImpl
	 * @see deftEvalDiagr.impl.DeftEvalDiagrPackageImpl#getSentenceTokenise()
	 * @generated
	 */
	int SENTENCE_TOKENISE = 1;

	/**
	 * The feature id for the '<em><b>List Of Sentence</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_TOKENISE__LIST_OF_SENTENCE = 0;

	/**
	 * The feature id for the '<em><b>Definitionmarker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_TOKENISE__DEFINITIONMARKER = 1;

	/**
	 * The number of structural features of the '<em>Sentence Tokenise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_TOKENISE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Tokenize Corpus</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_TOKENISE___TOKENIZE_CORPUS = 0;

	/**
	 * The operation id for the '<em>Get Sentence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_TOKENISE___GET_SENTENCE = 1;

	/**
	 * The number of operations of the '<em>Sentence Tokenise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_TOKENISE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link deftEvalDiagr.impl.DefinitionMarkerImpl <em>Definition Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deftEvalDiagr.impl.DefinitionMarkerImpl
	 * @see deftEvalDiagr.impl.DeftEvalDiagrPackageImpl#getDefinitionMarker()
	 * @generated
	 */
	int DEFINITION_MARKER = 2;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_MARKER__SENTENCE = 0;

	/**
	 * The number of structural features of the '<em>Definition Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_MARKER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Is Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_MARKER___IS_DEFINITION = 0;

	/**
	 * The operation id for the '<em>Tag Sentence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_MARKER___TAG_SENTENCE = 1;

	/**
	 * The operation id for the '<em>Get Tagged Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_MARKER___GET_TAGGED_DEFINITION = 2;

	/**
	 * The number of operations of the '<em>Definition Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_MARKER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link deftEvalDiagr.impl.TaggedDefinitionImpl <em>Tagged Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deftEvalDiagr.impl.TaggedDefinitionImpl
	 * @see deftEvalDiagr.impl.DeftEvalDiagrPackageImpl#getTaggedDefinition()
	 * @generated
	 */
	int TAGGED_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Sentence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DEFINITION__SENTENCE = 0;

	/**
	 * The feature id for the '<em><b>Start Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DEFINITION__START_TAG = 1;

	/**
	 * The feature id for the '<em><b>Inside Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DEFINITION__INSIDE_TAG = 2;

	/**
	 * The feature id for the '<em><b>Outside Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DEFINITION__OUTSIDE_TAG = 3;

	/**
	 * The feature id for the '<em><b>Definitionmarker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DEFINITION__DEFINITIONMARKER = 4;

	/**
	 * The number of structural features of the '<em>Tagged Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Sentence Tagger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DEFINITION___SENTENCE_TAGGER = 0;

	/**
	 * The number of operations of the '<em>Tagged Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_DEFINITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link deftEvalDiagr.impl.AsociatorImpl <em>Asociator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deftEvalDiagr.impl.AsociatorImpl
	 * @see deftEvalDiagr.impl.DeftEvalDiagrPackageImpl#getAsociator()
	 * @generated
	 */
	int ASOCIATOR = 4;

	/**
	 * The feature id for the '<em><b>List Of Definition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIATOR__LIST_OF_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Definitionmarker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIATOR__DEFINITIONMARKER = 1;

	/**
	 * The number of structural features of the '<em>Asociator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIATOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Associte Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIATOR___ASSOCITE_DEFINITION = 0;

	/**
	 * The operation id for the '<em>Type Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIATOR___TYPE_ASSOCIATION = 1;

	/**
	 * The number of operations of the '<em>Asociator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIATOR_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link deftEvalDiagr.impl.TypeOfAssociationImpl <em>Type Of Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deftEvalDiagr.impl.TypeOfAssociationImpl
	 * @see deftEvalDiagr.impl.DeftEvalDiagrPackageImpl#getTypeOfAssociation()
	 * @generated
	 */
	int TYPE_OF_ASSOCIATION = 5;

	/**
	 * The feature id for the '<em><b>List Of Definition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_ASSOCIATION__LIST_OF_DEFINITION = ASOCIATOR__LIST_OF_DEFINITION;

	/**
	 * The feature id for the '<em><b>Definitionmarker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_ASSOCIATION__DEFINITIONMARKER = ASOCIATOR__DEFINITIONMARKER;

	/**
	 * The feature id for the '<em><b>Type Association</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_ASSOCIATION__TYPE_ASSOCIATION = ASOCIATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Of Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_ASSOCIATION_FEATURE_COUNT = ASOCIATOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Associte Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_ASSOCIATION___ASSOCITE_DEFINITION = ASOCIATOR___ASSOCITE_DEFINITION;

	/**
	 * The operation id for the '<em>Type Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_ASSOCIATION___TYPE_ASSOCIATION = ASOCIATOR___TYPE_ASSOCIATION;

	/**
	 * The number of operations of the '<em>Type Of Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_ASSOCIATION_OPERATION_COUNT = ASOCIATOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link deftEvalDiagr.Corpus <em>Corpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corpus</em>'.
	 * @see deftEvalDiagr.Corpus
	 * @generated
	 */
	EClass getCorpus();

	/**
	 * Returns the meta object for the attribute '{@link deftEvalDiagr.Corpus#getInputText <em>Input Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Text</em>'.
	 * @see deftEvalDiagr.Corpus#getInputText()
	 * @see #getCorpus()
	 * @generated
	 */
	EAttribute getCorpus_InputText();

	/**
	 * Returns the meta object for the containment reference list '{@link deftEvalDiagr.Corpus#getSentencetokenise <em>Sentencetokenise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentencetokenise</em>'.
	 * @see deftEvalDiagr.Corpus#getSentencetokenise()
	 * @see #getCorpus()
	 * @generated
	 */
	EReference getCorpus_Sentencetokenise();

	/**
	 * Returns the meta object for the '{@link deftEvalDiagr.Corpus#geInputText() <em>Ge Input Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ge Input Text</em>' operation.
	 * @see deftEvalDiagr.Corpus#geInputText()
	 * @generated
	 */
	EOperation getCorpus__GeInputText();

	/**
	 * Returns the meta object for the '{@link deftEvalDiagr.Corpus#setInputText() <em>Set Input Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Input Text</em>' operation.
	 * @see deftEvalDiagr.Corpus#setInputText()
	 * @generated
	 */
	EOperation getCorpus__SetInputText();

	/**
	 * Returns the meta object for class '{@link deftEvalDiagr.SentenceTokenise <em>Sentence Tokenise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentence Tokenise</em>'.
	 * @see deftEvalDiagr.SentenceTokenise
	 * @generated
	 */
	EClass getSentenceTokenise();

	/**
	 * Returns the meta object for the attribute list '{@link deftEvalDiagr.SentenceTokenise#getListOfSentence <em>List Of Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Of Sentence</em>'.
	 * @see deftEvalDiagr.SentenceTokenise#getListOfSentence()
	 * @see #getSentenceTokenise()
	 * @generated
	 */
	EAttribute getSentenceTokenise_ListOfSentence();

	/**
	 * Returns the meta object for the containment reference list '{@link deftEvalDiagr.SentenceTokenise#getDefinitionmarker <em>Definitionmarker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitionmarker</em>'.
	 * @see deftEvalDiagr.SentenceTokenise#getDefinitionmarker()
	 * @see #getSentenceTokenise()
	 * @generated
	 */
	EReference getSentenceTokenise_Definitionmarker();

	/**
	 * Returns the meta object for the '{@link deftEvalDiagr.SentenceTokenise#tokenizeCorpus() <em>Tokenize Corpus</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tokenize Corpus</em>' operation.
	 * @see deftEvalDiagr.SentenceTokenise#tokenizeCorpus()
	 * @generated
	 */
	EOperation getSentenceTokenise__TokenizeCorpus();

	/**
	 * Returns the meta object for the '{@link deftEvalDiagr.SentenceTokenise#getSentence() <em>Get Sentence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sentence</em>' operation.
	 * @see deftEvalDiagr.SentenceTokenise#getSentence()
	 * @generated
	 */
	EOperation getSentenceTokenise__GetSentence();

	/**
	 * Returns the meta object for class '{@link deftEvalDiagr.DefinitionMarker <em>Definition Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Marker</em>'.
	 * @see deftEvalDiagr.DefinitionMarker
	 * @generated
	 */
	EClass getDefinitionMarker();

	/**
	 * Returns the meta object for the attribute '{@link deftEvalDiagr.DefinitionMarker#getSentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sentence</em>'.
	 * @see deftEvalDiagr.DefinitionMarker#getSentence()
	 * @see #getDefinitionMarker()
	 * @generated
	 */
	EAttribute getDefinitionMarker_Sentence();

	/**
	 * Returns the meta object for the '{@link deftEvalDiagr.DefinitionMarker#isDefinition() <em>Is Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Definition</em>' operation.
	 * @see deftEvalDiagr.DefinitionMarker#isDefinition()
	 * @generated
	 */
	EOperation getDefinitionMarker__IsDefinition();

	/**
	 * Returns the meta object for the '{@link deftEvalDiagr.DefinitionMarker#tagSentence() <em>Tag Sentence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag Sentence</em>' operation.
	 * @see deftEvalDiagr.DefinitionMarker#tagSentence()
	 * @generated
	 */
	EOperation getDefinitionMarker__TagSentence();

	/**
	 * Returns the meta object for the '{@link deftEvalDiagr.DefinitionMarker#getTaggedDefinition() <em>Get Tagged Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tagged Definition</em>' operation.
	 * @see deftEvalDiagr.DefinitionMarker#getTaggedDefinition()
	 * @generated
	 */
	EOperation getDefinitionMarker__GetTaggedDefinition();

	/**
	 * Returns the meta object for class '{@link deftEvalDiagr.TaggedDefinition <em>Tagged Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Definition</em>'.
	 * @see deftEvalDiagr.TaggedDefinition
	 * @generated
	 */
	EClass getTaggedDefinition();

	/**
	 * Returns the meta object for the attribute '{@link deftEvalDiagr.TaggedDefinition#getSentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sentence</em>'.
	 * @see deftEvalDiagr.TaggedDefinition#getSentence()
	 * @see #getTaggedDefinition()
	 * @generated
	 */
	EAttribute getTaggedDefinition_Sentence();

	/**
	 * Returns the meta object for the attribute '{@link deftEvalDiagr.TaggedDefinition#getStartTag <em>Start Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Tag</em>'.
	 * @see deftEvalDiagr.TaggedDefinition#getStartTag()
	 * @see #getTaggedDefinition()
	 * @generated
	 */
	EAttribute getTaggedDefinition_StartTag();

	/**
	 * Returns the meta object for the attribute '{@link deftEvalDiagr.TaggedDefinition#getInsideTag <em>Inside Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inside Tag</em>'.
	 * @see deftEvalDiagr.TaggedDefinition#getInsideTag()
	 * @see #getTaggedDefinition()
	 * @generated
	 */
	EAttribute getTaggedDefinition_InsideTag();

	/**
	 * Returns the meta object for the attribute '{@link deftEvalDiagr.TaggedDefinition#getOutsideTag <em>Outside Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outside Tag</em>'.
	 * @see deftEvalDiagr.TaggedDefinition#getOutsideTag()
	 * @see #getTaggedDefinition()
	 * @generated
	 */
	EAttribute getTaggedDefinition_OutsideTag();

	/**
	 * Returns the meta object for the reference '{@link deftEvalDiagr.TaggedDefinition#getDefinitionmarker <em>Definitionmarker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definitionmarker</em>'.
	 * @see deftEvalDiagr.TaggedDefinition#getDefinitionmarker()
	 * @see #getTaggedDefinition()
	 * @generated
	 */
	EReference getTaggedDefinition_Definitionmarker();

	/**
	 * Returns the meta object for the '{@link deftEvalDiagr.TaggedDefinition#sentenceTagger() <em>Sentence Tagger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sentence Tagger</em>' operation.
	 * @see deftEvalDiagr.TaggedDefinition#sentenceTagger()
	 * @generated
	 */
	EOperation getTaggedDefinition__SentenceTagger();

	/**
	 * Returns the meta object for class '{@link deftEvalDiagr.Asociator <em>Asociator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asociator</em>'.
	 * @see deftEvalDiagr.Asociator
	 * @generated
	 */
	EClass getAsociator();

	/**
	 * Returns the meta object for the attribute list '{@link deftEvalDiagr.Asociator#getListOfDefinition <em>List Of Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Of Definition</em>'.
	 * @see deftEvalDiagr.Asociator#getListOfDefinition()
	 * @see #getAsociator()
	 * @generated
	 */
	EAttribute getAsociator_ListOfDefinition();

	/**
	 * Returns the meta object for the reference '{@link deftEvalDiagr.Asociator#getDefinitionmarker <em>Definitionmarker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definitionmarker</em>'.
	 * @see deftEvalDiagr.Asociator#getDefinitionmarker()
	 * @see #getAsociator()
	 * @generated
	 */
	EReference getAsociator_Definitionmarker();

	/**
	 * Returns the meta object for the '{@link deftEvalDiagr.Asociator#associteDefinition() <em>Associte Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Associte Definition</em>' operation.
	 * @see deftEvalDiagr.Asociator#associteDefinition()
	 * @generated
	 */
	EOperation getAsociator__AssociteDefinition();

	/**
	 * Returns the meta object for the '{@link deftEvalDiagr.Asociator#typeAssociation() <em>Type Association</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Type Association</em>' operation.
	 * @see deftEvalDiagr.Asociator#typeAssociation()
	 * @generated
	 */
	EOperation getAsociator__TypeAssociation();

	/**
	 * Returns the meta object for class '{@link deftEvalDiagr.TypeOfAssociation <em>Type Of Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Of Association</em>'.
	 * @see deftEvalDiagr.TypeOfAssociation
	 * @generated
	 */
	EClass getTypeOfAssociation();

	/**
	 * Returns the meta object for the attribute list '{@link deftEvalDiagr.TypeOfAssociation#getTypeAssociation <em>Type Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type Association</em>'.
	 * @see deftEvalDiagr.TypeOfAssociation#getTypeAssociation()
	 * @see #getTypeOfAssociation()
	 * @generated
	 */
	EAttribute getTypeOfAssociation_TypeAssociation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeftEvalDiagrFactory getDeftEvalDiagrFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link deftEvalDiagr.impl.CorpusImpl <em>Corpus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deftEvalDiagr.impl.CorpusImpl
		 * @see deftEvalDiagr.impl.DeftEvalDiagrPackageImpl#getCorpus()
		 * @generated
		 */
		EClass CORPUS = eINSTANCE.getCorpus();

		/**
		 * The meta object literal for the '<em><b>Input Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORPUS__INPUT_TEXT = eINSTANCE.getCorpus_InputText();

		/**
		 * The meta object literal for the '<em><b>Sentencetokenise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORPUS__SENTENCETOKENISE = eINSTANCE.getCorpus_Sentencetokenise();

		/**
		 * The meta object literal for the '<em><b>Ge Input Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORPUS___GE_INPUT_TEXT = eINSTANCE.getCorpus__GeInputText();

		/**
		 * The meta object literal for the '<em><b>Set Input Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CORPUS___SET_INPUT_TEXT = eINSTANCE.getCorpus__SetInputText();

		/**
		 * The meta object literal for the '{@link deftEvalDiagr.impl.SentenceTokeniseImpl <em>Sentence Tokenise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deftEvalDiagr.impl.SentenceTokeniseImpl
		 * @see deftEvalDiagr.impl.DeftEvalDiagrPackageImpl#getSentenceTokenise()
		 * @generated
		 */
		EClass SENTENCE_TOKENISE = eINSTANCE.getSentenceTokenise();

		/**
		 * The meta object literal for the '<em><b>List Of Sentence</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE_TOKENISE__LIST_OF_SENTENCE = eINSTANCE.getSentenceTokenise_ListOfSentence();

		/**
		 * The meta object literal for the '<em><b>Definitionmarker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE_TOKENISE__DEFINITIONMARKER = eINSTANCE.getSentenceTokenise_Definitionmarker();

		/**
		 * The meta object literal for the '<em><b>Tokenize Corpus</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENTENCE_TOKENISE___TOKENIZE_CORPUS = eINSTANCE.getSentenceTokenise__TokenizeCorpus();

		/**
		 * The meta object literal for the '<em><b>Get Sentence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENTENCE_TOKENISE___GET_SENTENCE = eINSTANCE.getSentenceTokenise__GetSentence();

		/**
		 * The meta object literal for the '{@link deftEvalDiagr.impl.DefinitionMarkerImpl <em>Definition Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deftEvalDiagr.impl.DefinitionMarkerImpl
		 * @see deftEvalDiagr.impl.DeftEvalDiagrPackageImpl#getDefinitionMarker()
		 * @generated
		 */
		EClass DEFINITION_MARKER = eINSTANCE.getDefinitionMarker();

		/**
		 * The meta object literal for the '<em><b>Sentence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION_MARKER__SENTENCE = eINSTANCE.getDefinitionMarker_Sentence();

		/**
		 * The meta object literal for the '<em><b>Is Definition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFINITION_MARKER___IS_DEFINITION = eINSTANCE.getDefinitionMarker__IsDefinition();

		/**
		 * The meta object literal for the '<em><b>Tag Sentence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFINITION_MARKER___TAG_SENTENCE = eINSTANCE.getDefinitionMarker__TagSentence();

		/**
		 * The meta object literal for the '<em><b>Get Tagged Definition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFINITION_MARKER___GET_TAGGED_DEFINITION = eINSTANCE.getDefinitionMarker__GetTaggedDefinition();

		/**
		 * The meta object literal for the '{@link deftEvalDiagr.impl.TaggedDefinitionImpl <em>Tagged Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deftEvalDiagr.impl.TaggedDefinitionImpl
		 * @see deftEvalDiagr.impl.DeftEvalDiagrPackageImpl#getTaggedDefinition()
		 * @generated
		 */
		EClass TAGGED_DEFINITION = eINSTANCE.getTaggedDefinition();

		/**
		 * The meta object literal for the '<em><b>Sentence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_DEFINITION__SENTENCE = eINSTANCE.getTaggedDefinition_Sentence();

		/**
		 * The meta object literal for the '<em><b>Start Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_DEFINITION__START_TAG = eINSTANCE.getTaggedDefinition_StartTag();

		/**
		 * The meta object literal for the '<em><b>Inside Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_DEFINITION__INSIDE_TAG = eINSTANCE.getTaggedDefinition_InsideTag();

		/**
		 * The meta object literal for the '<em><b>Outside Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_DEFINITION__OUTSIDE_TAG = eINSTANCE.getTaggedDefinition_OutsideTag();

		/**
		 * The meta object literal for the '<em><b>Definitionmarker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGGED_DEFINITION__DEFINITIONMARKER = eINSTANCE.getTaggedDefinition_Definitionmarker();

		/**
		 * The meta object literal for the '<em><b>Sentence Tagger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TAGGED_DEFINITION___SENTENCE_TAGGER = eINSTANCE.getTaggedDefinition__SentenceTagger();

		/**
		 * The meta object literal for the '{@link deftEvalDiagr.impl.AsociatorImpl <em>Asociator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deftEvalDiagr.impl.AsociatorImpl
		 * @see deftEvalDiagr.impl.DeftEvalDiagrPackageImpl#getAsociator()
		 * @generated
		 */
		EClass ASOCIATOR = eINSTANCE.getAsociator();

		/**
		 * The meta object literal for the '<em><b>List Of Definition</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASOCIATOR__LIST_OF_DEFINITION = eINSTANCE.getAsociator_ListOfDefinition();

		/**
		 * The meta object literal for the '<em><b>Definitionmarker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASOCIATOR__DEFINITIONMARKER = eINSTANCE.getAsociator_Definitionmarker();

		/**
		 * The meta object literal for the '<em><b>Associte Definition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASOCIATOR___ASSOCITE_DEFINITION = eINSTANCE.getAsociator__AssociteDefinition();

		/**
		 * The meta object literal for the '<em><b>Type Association</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASOCIATOR___TYPE_ASSOCIATION = eINSTANCE.getAsociator__TypeAssociation();

		/**
		 * The meta object literal for the '{@link deftEvalDiagr.impl.TypeOfAssociationImpl <em>Type Of Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deftEvalDiagr.impl.TypeOfAssociationImpl
		 * @see deftEvalDiagr.impl.DeftEvalDiagrPackageImpl#getTypeOfAssociation()
		 * @generated
		 */
		EClass TYPE_OF_ASSOCIATION = eINSTANCE.getTypeOfAssociation();

		/**
		 * The meta object literal for the '<em><b>Type Association</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_OF_ASSOCIATION__TYPE_ASSOCIATION = eINSTANCE.getTypeOfAssociation_TypeAssociation();

	}

} //DeftEvalDiagrPackage
