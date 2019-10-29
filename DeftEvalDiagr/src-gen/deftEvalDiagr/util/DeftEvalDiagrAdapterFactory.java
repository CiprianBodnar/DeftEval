/**
 */
package deftEvalDiagr.util;

import deftEvalDiagr.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see deftEvalDiagr.DeftEvalDiagrPackage
 * @generated
 */
public class DeftEvalDiagrAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeftEvalDiagrPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeftEvalDiagrAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DeftEvalDiagrPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeftEvalDiagrSwitch<Adapter> modelSwitch = new DeftEvalDiagrSwitch<Adapter>() {
		@Override
		public Adapter caseCorpus(Corpus object) {
			return createCorpusAdapter();
		}

		@Override
		public Adapter caseSentenceTokenise(SentenceTokenise object) {
			return createSentenceTokeniseAdapter();
		}

		@Override
		public Adapter caseDefinitionMarker(DefinitionMarker object) {
			return createDefinitionMarkerAdapter();
		}

		@Override
		public Adapter caseTaggedDefinition(TaggedDefinition object) {
			return createTaggedDefinitionAdapter();
		}

		@Override
		public Adapter caseAsociator(Asociator object) {
			return createAsociatorAdapter();
		}

		@Override
		public Adapter caseTypeOfAssociation(TypeOfAssociation object) {
			return createTypeOfAssociationAdapter();
		}

		@Override
		public Adapter caseFrequencyComputer(FrequencyComputer object) {
			return createFrequencyComputerAdapter();
		}

		@Override
		public Adapter caseResultSender(ResultSender object) {
			return createResultSenderAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link deftEvalDiagr.Corpus <em>Corpus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deftEvalDiagr.Corpus
	 * @generated
	 */
	public Adapter createCorpusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deftEvalDiagr.SentenceTokenise <em>Sentence Tokenise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deftEvalDiagr.SentenceTokenise
	 * @generated
	 */
	public Adapter createSentenceTokeniseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deftEvalDiagr.DefinitionMarker <em>Definition Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deftEvalDiagr.DefinitionMarker
	 * @generated
	 */
	public Adapter createDefinitionMarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deftEvalDiagr.TaggedDefinition <em>Tagged Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deftEvalDiagr.TaggedDefinition
	 * @generated
	 */
	public Adapter createTaggedDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deftEvalDiagr.Asociator <em>Asociator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deftEvalDiagr.Asociator
	 * @generated
	 */
	public Adapter createAsociatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deftEvalDiagr.TypeOfAssociation <em>Type Of Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deftEvalDiagr.TypeOfAssociation
	 * @generated
	 */
	public Adapter createTypeOfAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deftEvalDiagr.FrequencyComputer <em>Frequency Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deftEvalDiagr.FrequencyComputer
	 * @generated
	 */
	public Adapter createFrequencyComputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deftEvalDiagr.ResultSender <em>Result Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deftEvalDiagr.ResultSender
	 * @generated
	 */
	public Adapter createResultSenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DeftEvalDiagrAdapterFactory
