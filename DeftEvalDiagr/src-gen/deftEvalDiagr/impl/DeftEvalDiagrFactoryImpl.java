/**
 */
package deftEvalDiagr.impl;

import deftEvalDiagr.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeftEvalDiagrFactoryImpl extends EFactoryImpl implements DeftEvalDiagrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeftEvalDiagrFactory init() {
		try {
			DeftEvalDiagrFactory theDeftEvalDiagrFactory = (DeftEvalDiagrFactory) EPackage.Registry.INSTANCE
					.getEFactory(DeftEvalDiagrPackage.eNS_URI);
			if (theDeftEvalDiagrFactory != null) {
				return theDeftEvalDiagrFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeftEvalDiagrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeftEvalDiagrFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DeftEvalDiagrPackage.CORPUS:
			return createCorpus();
		case DeftEvalDiagrPackage.SENTENCE_TOKENISE:
			return createSentenceTokenise();
		case DeftEvalDiagrPackage.DEFINITION_MARKER:
			return createDefinitionMarker();
		case DeftEvalDiagrPackage.TAGGED_DEFINITION:
			return createTaggedDefinition();
		case DeftEvalDiagrPackage.ASOCIATOR:
			return createAsociator();
		case DeftEvalDiagrPackage.TYPE_OF_ASSOCIATION:
			return createTypeOfAssociation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Corpus createCorpus() {
		CorpusImpl corpus = new CorpusImpl();
		return corpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SentenceTokenise createSentenceTokenise() {
		SentenceTokeniseImpl sentenceTokenise = new SentenceTokeniseImpl();
		return sentenceTokenise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionMarker createDefinitionMarker() {
		DefinitionMarkerImpl definitionMarker = new DefinitionMarkerImpl();
		return definitionMarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaggedDefinition createTaggedDefinition() {
		TaggedDefinitionImpl taggedDefinition = new TaggedDefinitionImpl();
		return taggedDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asociator createAsociator() {
		AsociatorImpl asociator = new AsociatorImpl();
		return asociator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeOfAssociation createTypeOfAssociation() {
		TypeOfAssociationImpl typeOfAssociation = new TypeOfAssociationImpl();
		return typeOfAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeftEvalDiagrPackage getDeftEvalDiagrPackage() {
		return (DeftEvalDiagrPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeftEvalDiagrPackage getPackage() {
		return DeftEvalDiagrPackage.eINSTANCE;
	}

} //DeftEvalDiagrFactoryImpl
