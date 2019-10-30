/**
 */
package deftEvalDiagr.impl;

import deftEvalDiagr.Asociator;
import deftEvalDiagr.Corpus;
import deftEvalDiagr.DefinitionMarker;
import deftEvalDiagr.DeftEvalDiagrFactory;
import deftEvalDiagr.DeftEvalDiagrPackage;
import deftEvalDiagr.FrequencyComputer;
import deftEvalDiagr.ResultSender;
import deftEvalDiagr.SentenceTokenise;
import deftEvalDiagr.TaggedDefinition;
import deftEvalDiagr.TypeOfAssociation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeftEvalDiagrPackageImpl extends EPackageImpl implements DeftEvalDiagrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corpusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentenceTokeniseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionMarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asociatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeOfAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyComputerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultSenderEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see deftEvalDiagr.DeftEvalDiagrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeftEvalDiagrPackageImpl() {
		super(eNS_URI, DeftEvalDiagrFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DeftEvalDiagrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeftEvalDiagrPackage init() {
		if (isInited)
			return (DeftEvalDiagrPackage) EPackage.Registry.INSTANCE.getEPackage(DeftEvalDiagrPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDeftEvalDiagrPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DeftEvalDiagrPackageImpl theDeftEvalDiagrPackage = registeredDeftEvalDiagrPackage instanceof DeftEvalDiagrPackageImpl
				? (DeftEvalDiagrPackageImpl) registeredDeftEvalDiagrPackage
				: new DeftEvalDiagrPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDeftEvalDiagrPackage.createPackageContents();

		// Initialize created meta-data
		theDeftEvalDiagrPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeftEvalDiagrPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeftEvalDiagrPackage.eNS_URI, theDeftEvalDiagrPackage);
		return theDeftEvalDiagrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorpus() {
		return corpusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorpus_InputText() {
		return (EAttribute) corpusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCorpus_Sentencetokenise() {
		return (EReference) corpusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCorpus__GeInputText() {
		return corpusEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCorpus__SetInputText() {
		return corpusEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSentenceTokenise() {
		return sentenceTokeniseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSentenceTokenise_ListOfSentence() {
		return (EAttribute) sentenceTokeniseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSentenceTokenise_Definitionmarker() {
		return (EReference) sentenceTokeniseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSentenceTokenise_Frequencycomputer() {
		return (EReference) sentenceTokeniseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSentenceTokenise__TokenizeCorpus() {
		return sentenceTokeniseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSentenceTokenise__GetSentence() {
		return sentenceTokeniseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionMarker() {
		return definitionMarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinitionMarker_Sentence() {
		return (EAttribute) definitionMarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionMarker_Taggeddefinition() {
		return (EReference) definitionMarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionMarker_Asociator() {
		return (EReference) definitionMarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefinitionMarker__IsDefinition() {
		return definitionMarkerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefinitionMarker__TagSentence() {
		return definitionMarkerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefinitionMarker__GetTaggedDefinition() {
		return definitionMarkerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaggedDefinition() {
		return taggedDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedDefinition_Sentence() {
		return (EAttribute) taggedDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedDefinition_StartTag() {
		return (EAttribute) taggedDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedDefinition_InsideTag() {
		return (EAttribute) taggedDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedDefinition_OutsideTag() {
		return (EAttribute) taggedDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaggedDefinition_Resultsender() {
		return (EReference) taggedDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTaggedDefinition__SentenceTagger() {
		return taggedDefinitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsociator() {
		return asociatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsociator_ListOfDefinition() {
		return (EAttribute) asociatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAsociator__AssociteDefinition() {
		return asociatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAsociator__TypeAssociation() {
		return asociatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeOfAssociation() {
		return typeOfAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeOfAssociation_TypeAssociation() {
		return (EAttribute) typeOfAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrequencyComputer() {
		return frequencyComputerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrequencyComputer_Sentence() {
		return (EAttribute) frequencyComputerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFrequencyComputer__FrequencyList() {
		return frequencyComputerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFrequencyComputer__Dictionary() {
		return frequencyComputerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFrequencyComputer__Frequencies() {
		return frequencyComputerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResultSender() {
		return resultSenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResultSender_ResultDefinitions() {
		return (EAttribute) resultSenderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResultSender__SendResult() {
		return resultSenderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeftEvalDiagrFactory getDeftEvalDiagrFactory() {
		return (DeftEvalDiagrFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		corpusEClass = createEClass(CORPUS);
		createEAttribute(corpusEClass, CORPUS__INPUT_TEXT);
		createEReference(corpusEClass, CORPUS__SENTENCETOKENISE);
		createEOperation(corpusEClass, CORPUS___GE_INPUT_TEXT);
		createEOperation(corpusEClass, CORPUS___SET_INPUT_TEXT);

		sentenceTokeniseEClass = createEClass(SENTENCE_TOKENISE);
		createEAttribute(sentenceTokeniseEClass, SENTENCE_TOKENISE__LIST_OF_SENTENCE);
		createEReference(sentenceTokeniseEClass, SENTENCE_TOKENISE__DEFINITIONMARKER);
		createEReference(sentenceTokeniseEClass, SENTENCE_TOKENISE__FREQUENCYCOMPUTER);
		createEOperation(sentenceTokeniseEClass, SENTENCE_TOKENISE___TOKENIZE_CORPUS);
		createEOperation(sentenceTokeniseEClass, SENTENCE_TOKENISE___GET_SENTENCE);

		definitionMarkerEClass = createEClass(DEFINITION_MARKER);
		createEAttribute(definitionMarkerEClass, DEFINITION_MARKER__SENTENCE);
		createEReference(definitionMarkerEClass, DEFINITION_MARKER__TAGGEDDEFINITION);
		createEReference(definitionMarkerEClass, DEFINITION_MARKER__ASOCIATOR);
		createEOperation(definitionMarkerEClass, DEFINITION_MARKER___IS_DEFINITION);
		createEOperation(definitionMarkerEClass, DEFINITION_MARKER___TAG_SENTENCE);
		createEOperation(definitionMarkerEClass, DEFINITION_MARKER___GET_TAGGED_DEFINITION);

		taggedDefinitionEClass = createEClass(TAGGED_DEFINITION);
		createEAttribute(taggedDefinitionEClass, TAGGED_DEFINITION__SENTENCE);
		createEAttribute(taggedDefinitionEClass, TAGGED_DEFINITION__START_TAG);
		createEAttribute(taggedDefinitionEClass, TAGGED_DEFINITION__INSIDE_TAG);
		createEAttribute(taggedDefinitionEClass, TAGGED_DEFINITION__OUTSIDE_TAG);
		createEReference(taggedDefinitionEClass, TAGGED_DEFINITION__RESULTSENDER);
		createEOperation(taggedDefinitionEClass, TAGGED_DEFINITION___SENTENCE_TAGGER);

		asociatorEClass = createEClass(ASOCIATOR);
		createEAttribute(asociatorEClass, ASOCIATOR__LIST_OF_DEFINITION);
		createEOperation(asociatorEClass, ASOCIATOR___ASSOCITE_DEFINITION);
		createEOperation(asociatorEClass, ASOCIATOR___TYPE_ASSOCIATION);

		typeOfAssociationEClass = createEClass(TYPE_OF_ASSOCIATION);
		createEAttribute(typeOfAssociationEClass, TYPE_OF_ASSOCIATION__TYPE_ASSOCIATION);

		frequencyComputerEClass = createEClass(FREQUENCY_COMPUTER);
		createEAttribute(frequencyComputerEClass, FREQUENCY_COMPUTER__SENTENCE);
		createEOperation(frequencyComputerEClass, FREQUENCY_COMPUTER___FREQUENCY_LIST);
		createEOperation(frequencyComputerEClass, FREQUENCY_COMPUTER___DICTIONARY);
		createEOperation(frequencyComputerEClass, FREQUENCY_COMPUTER___FREQUENCIES);

		resultSenderEClass = createEClass(RESULT_SENDER);
		createEAttribute(resultSenderEClass, RESULT_SENDER__RESULT_DEFINITIONS);
		createEOperation(resultSenderEClass, RESULT_SENDER___SEND_RESULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeOfAssociationEClass.getESuperTypes().add(this.getAsociator());

		// Initialize classes, features, and operations; add parameters
		initEClass(corpusEClass, Corpus.class, "Corpus", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorpus_InputText(), ecorePackage.getEString(), "inputText", null, 0, 1, Corpus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCorpus_Sentencetokenise(), this.getSentenceTokenise(), null, "sentencetokenise", null, 0, -1,
				Corpus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCorpus__GeInputText(), ecorePackage.getEString(), "geInputText", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCorpus__SetInputText(), ecorePackage.getEString(), "setInputText", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(sentenceTokeniseEClass, SentenceTokenise.class, "SentenceTokenise", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSentenceTokenise_ListOfSentence(), ecorePackage.getEString(), "listOfSentence", null, 0, -1,
				SentenceTokenise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSentenceTokenise_Definitionmarker(), this.getDefinitionMarker(), null, "definitionmarker",
				null, 0, -1, SentenceTokenise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSentenceTokenise_Frequencycomputer(), this.getFrequencyComputer(), null, "frequencycomputer",
				null, 0, 1, SentenceTokenise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSentenceTokenise__TokenizeCorpus(), ecorePackage.getEString(), "tokenizeCorpus", 0, -1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getSentenceTokenise__GetSentence(), ecorePackage.getEString(), "getSentence", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(definitionMarkerEClass, DefinitionMarker.class, "DefinitionMarker", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefinitionMarker_Sentence(), ecorePackage.getEString(), "sentence", null, 0, 1,
				DefinitionMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionMarker_Taggeddefinition(), this.getTaggedDefinition(), null, "taggeddefinition",
				null, 0, 1, DefinitionMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionMarker_Asociator(), this.getAsociator(), null, "asociator", null, 0, 1,
				DefinitionMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDefinitionMarker__IsDefinition(), ecorePackage.getEBoolean(), "isDefinition", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getDefinitionMarker__TagSentence(), this.getTaggedDefinition(), "tagSentence", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getDefinitionMarker__GetTaggedDefinition(), this.getTaggedDefinition(), "getTaggedDefinition", 0,
				1, IS_UNIQUE, IS_ORDERED);

		initEClass(taggedDefinitionEClass, TaggedDefinition.class, "TaggedDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaggedDefinition_Sentence(), ecorePackage.getEString(), "sentence", null, 0, 1,
				TaggedDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedDefinition_StartTag(), ecorePackage.getEString(), "startTag", null, 0, 1,
				TaggedDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedDefinition_InsideTag(), ecorePackage.getEString(), "insideTag", null, 0, 1,
				TaggedDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedDefinition_OutsideTag(), ecorePackage.getEString(), "outsideTag", null, 0, 1,
				TaggedDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTaggedDefinition_Resultsender(), this.getResultSender(), null, "resultsender", null, 0, -1,
				TaggedDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTaggedDefinition__SentenceTagger(), ecorePackage.getEString(), "sentenceTagger", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(asociatorEClass, Asociator.class, "Asociator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsociator_ListOfDefinition(), ecorePackage.getEString(), "listOfDefinition", null, 0, -1,
				Asociator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getAsociator__AssociteDefinition(), this.getTaggedDefinition(), "associteDefinition", 0, -1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getAsociator__TypeAssociation(), this.getTypeOfAssociation(), "typeAssociation", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(typeOfAssociationEClass, TypeOfAssociation.class, "TypeOfAssociation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeOfAssociation_TypeAssociation(), ecorePackage.getEString(), "typeAssociation", null, 0,
				-1, TypeOfAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frequencyComputerEClass, FrequencyComputer.class, "FrequencyComputer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrequencyComputer_Sentence(), ecorePackage.getEString(), "sentence", null, 0, 1,
				FrequencyComputer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getFrequencyComputer__FrequencyList(), ecorePackage.getEString(), "frequencyList", 0, -1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getFrequencyComputer__Dictionary(), this.getCorpus(), "dictionary", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFrequencyComputer__Frequencies(), this.getResultSender(), "frequencies", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(resultSenderEClass, ResultSender.class, "ResultSender", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResultSender_ResultDefinitions(), ecorePackage.getEString(), "resultDefinitions", null, 0, -1,
				ResultSender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getResultSender__SendResult(), ecorePackage.getEString(), "sendResult", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DeftEvalDiagrPackageImpl
