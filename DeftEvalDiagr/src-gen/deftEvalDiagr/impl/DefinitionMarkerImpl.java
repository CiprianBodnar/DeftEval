/**
 */
package deftEvalDiagr.impl;

import deftEvalDiagr.Asociator;
import deftEvalDiagr.DefinitionMarker;
import deftEvalDiagr.DeftEvalDiagrPackage;
import deftEvalDiagr.TaggedDefinition;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.impl.DefinitionMarkerImpl#getSentence <em>Sentence</em>}</li>
 *   <li>{@link deftEvalDiagr.impl.DefinitionMarkerImpl#getTaggeddefinition <em>Taggeddefinition</em>}</li>
 *   <li>{@link deftEvalDiagr.impl.DefinitionMarkerImpl#getAsociator <em>Asociator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionMarkerImpl extends MinimalEObjectImpl.Container implements DefinitionMarker {
	/**
	 * The default value of the '{@link #getSentence() <em>Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentence()
	 * @generated
	 * @ordered
	 */
	protected static final String SENTENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSentence() <em>Sentence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentence()
	 * @generated
	 * @ordered
	 */
	protected String sentence = SENTENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaggeddefinition() <em>Taggeddefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggeddefinition()
	 * @generated
	 * @ordered
	 */
	protected TaggedDefinition taggeddefinition;

	/**
	 * The cached value of the '{@link #getAsociator() <em>Asociator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsociator()
	 * @generated
	 * @ordered
	 */
	protected Asociator asociator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionMarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeftEvalDiagrPackage.Literals.DEFINITION_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSentence() {
		return sentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSentence(String newSentence) {
		String oldSentence = sentence;
		sentence = newSentence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeftEvalDiagrPackage.DEFINITION_MARKER__SENTENCE,
					oldSentence, sentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaggedDefinition getTaggeddefinition() {
		if (taggeddefinition != null && taggeddefinition.eIsProxy()) {
			InternalEObject oldTaggeddefinition = (InternalEObject) taggeddefinition;
			taggeddefinition = (TaggedDefinition) eResolveProxy(oldTaggeddefinition);
			if (taggeddefinition != oldTaggeddefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DeftEvalDiagrPackage.DEFINITION_MARKER__TAGGEDDEFINITION, oldTaggeddefinition,
							taggeddefinition));
			}
		}
		return taggeddefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedDefinition basicGetTaggeddefinition() {
		return taggeddefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaggeddefinition(TaggedDefinition newTaggeddefinition) {
		TaggedDefinition oldTaggeddefinition = taggeddefinition;
		taggeddefinition = newTaggeddefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DeftEvalDiagrPackage.DEFINITION_MARKER__TAGGEDDEFINITION, oldTaggeddefinition, taggeddefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asociator getAsociator() {
		if (asociator != null && asociator.eIsProxy()) {
			InternalEObject oldAsociator = (InternalEObject) asociator;
			asociator = (Asociator) eResolveProxy(oldAsociator);
			if (asociator != oldAsociator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DeftEvalDiagrPackage.DEFINITION_MARKER__ASOCIATOR, oldAsociator, asociator));
			}
		}
		return asociator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asociator basicGetAsociator() {
		return asociator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsociator(Asociator newAsociator) {
		Asociator oldAsociator = asociator;
		asociator = newAsociator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeftEvalDiagrPackage.DEFINITION_MARKER__ASOCIATOR,
					oldAsociator, asociator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDefinition() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaggedDefinition tagSentence() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaggedDefinition getTaggedDefinition() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeftEvalDiagrPackage.DEFINITION_MARKER__SENTENCE:
			return getSentence();
		case DeftEvalDiagrPackage.DEFINITION_MARKER__TAGGEDDEFINITION:
			if (resolve)
				return getTaggeddefinition();
			return basicGetTaggeddefinition();
		case DeftEvalDiagrPackage.DEFINITION_MARKER__ASOCIATOR:
			if (resolve)
				return getAsociator();
			return basicGetAsociator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DeftEvalDiagrPackage.DEFINITION_MARKER__SENTENCE:
			setSentence((String) newValue);
			return;
		case DeftEvalDiagrPackage.DEFINITION_MARKER__TAGGEDDEFINITION:
			setTaggeddefinition((TaggedDefinition) newValue);
			return;
		case DeftEvalDiagrPackage.DEFINITION_MARKER__ASOCIATOR:
			setAsociator((Asociator) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DeftEvalDiagrPackage.DEFINITION_MARKER__SENTENCE:
			setSentence(SENTENCE_EDEFAULT);
			return;
		case DeftEvalDiagrPackage.DEFINITION_MARKER__TAGGEDDEFINITION:
			setTaggeddefinition((TaggedDefinition) null);
			return;
		case DeftEvalDiagrPackage.DEFINITION_MARKER__ASOCIATOR:
			setAsociator((Asociator) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DeftEvalDiagrPackage.DEFINITION_MARKER__SENTENCE:
			return SENTENCE_EDEFAULT == null ? sentence != null : !SENTENCE_EDEFAULT.equals(sentence);
		case DeftEvalDiagrPackage.DEFINITION_MARKER__TAGGEDDEFINITION:
			return taggeddefinition != null;
		case DeftEvalDiagrPackage.DEFINITION_MARKER__ASOCIATOR:
			return asociator != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case DeftEvalDiagrPackage.DEFINITION_MARKER___IS_DEFINITION:
			return isDefinition();
		case DeftEvalDiagrPackage.DEFINITION_MARKER___TAG_SENTENCE:
			return tagSentence();
		case DeftEvalDiagrPackage.DEFINITION_MARKER___GET_TAGGED_DEFINITION:
			return getTaggedDefinition();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sentence: ");
		result.append(sentence);
		result.append(')');
		return result.toString();
	}

} //DefinitionMarkerImpl
