/**
 */
package deftEvalDiagr.impl;

import deftEvalDiagr.DeftEvalDiagrPackage;
import deftEvalDiagr.ResultSender;
import deftEvalDiagr.TaggedDefinition;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tagged Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.impl.TaggedDefinitionImpl#getSentence <em>Sentence</em>}</li>
 *   <li>{@link deftEvalDiagr.impl.TaggedDefinitionImpl#getStartTag <em>Start Tag</em>}</li>
 *   <li>{@link deftEvalDiagr.impl.TaggedDefinitionImpl#getInsideTag <em>Inside Tag</em>}</li>
 *   <li>{@link deftEvalDiagr.impl.TaggedDefinitionImpl#getOutsideTag <em>Outside Tag</em>}</li>
 *   <li>{@link deftEvalDiagr.impl.TaggedDefinitionImpl#getResultsender <em>Resultsender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaggedDefinitionImpl extends MinimalEObjectImpl.Container implements TaggedDefinition {
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
	 * The default value of the '{@link #getStartTag() <em>Start Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTag()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTag() <em>Start Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTag()
	 * @generated
	 * @ordered
	 */
	protected String startTag = START_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsideTag() <em>Inside Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideTag()
	 * @generated
	 * @ordered
	 */
	protected static final String INSIDE_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsideTag() <em>Inside Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideTag()
	 * @generated
	 * @ordered
	 */
	protected String insideTag = INSIDE_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutsideTag() <em>Outside Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideTag()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTSIDE_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutsideTag() <em>Outside Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideTag()
	 * @generated
	 * @ordered
	 */
	protected String outsideTag = OUTSIDE_TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResultsender() <em>Resultsender</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsender()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultSender> resultsender;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaggedDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeftEvalDiagrPackage.Literals.TAGGED_DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeftEvalDiagrPackage.TAGGED_DEFINITION__SENTENCE,
					oldSentence, sentence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartTag() {
		return startTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTag(String newStartTag) {
		String oldStartTag = startTag;
		startTag = newStartTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeftEvalDiagrPackage.TAGGED_DEFINITION__START_TAG,
					oldStartTag, startTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInsideTag() {
		return insideTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsideTag(String newInsideTag) {
		String oldInsideTag = insideTag;
		insideTag = newInsideTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeftEvalDiagrPackage.TAGGED_DEFINITION__INSIDE_TAG,
					oldInsideTag, insideTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutsideTag() {
		return outsideTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutsideTag(String newOutsideTag) {
		String oldOutsideTag = outsideTag;
		outsideTag = newOutsideTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeftEvalDiagrPackage.TAGGED_DEFINITION__OUTSIDE_TAG,
					oldOutsideTag, outsideTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResultSender> getResultsender() {
		if (resultsender == null) {
			resultsender = new EObjectContainmentEList<ResultSender>(ResultSender.class, this,
					DeftEvalDiagrPackage.TAGGED_DEFINITION__RESULTSENDER);
		}
		return resultsender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String sentenceTagger() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__RESULTSENDER:
			return ((InternalEList<?>) getResultsender()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__SENTENCE:
			return getSentence();
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__START_TAG:
			return getStartTag();
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__INSIDE_TAG:
			return getInsideTag();
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__OUTSIDE_TAG:
			return getOutsideTag();
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__RESULTSENDER:
			return getResultsender();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__SENTENCE:
			setSentence((String) newValue);
			return;
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__START_TAG:
			setStartTag((String) newValue);
			return;
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__INSIDE_TAG:
			setInsideTag((String) newValue);
			return;
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__OUTSIDE_TAG:
			setOutsideTag((String) newValue);
			return;
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__RESULTSENDER:
			getResultsender().clear();
			getResultsender().addAll((Collection<? extends ResultSender>) newValue);
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
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__SENTENCE:
			setSentence(SENTENCE_EDEFAULT);
			return;
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__START_TAG:
			setStartTag(START_TAG_EDEFAULT);
			return;
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__INSIDE_TAG:
			setInsideTag(INSIDE_TAG_EDEFAULT);
			return;
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__OUTSIDE_TAG:
			setOutsideTag(OUTSIDE_TAG_EDEFAULT);
			return;
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__RESULTSENDER:
			getResultsender().clear();
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
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__SENTENCE:
			return SENTENCE_EDEFAULT == null ? sentence != null : !SENTENCE_EDEFAULT.equals(sentence);
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__START_TAG:
			return START_TAG_EDEFAULT == null ? startTag != null : !START_TAG_EDEFAULT.equals(startTag);
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__INSIDE_TAG:
			return INSIDE_TAG_EDEFAULT == null ? insideTag != null : !INSIDE_TAG_EDEFAULT.equals(insideTag);
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__OUTSIDE_TAG:
			return OUTSIDE_TAG_EDEFAULT == null ? outsideTag != null : !OUTSIDE_TAG_EDEFAULT.equals(outsideTag);
		case DeftEvalDiagrPackage.TAGGED_DEFINITION__RESULTSENDER:
			return resultsender != null && !resultsender.isEmpty();
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
		case DeftEvalDiagrPackage.TAGGED_DEFINITION___SENTENCE_TAGGER:
			return sentenceTagger();
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
		result.append(", startTag: ");
		result.append(startTag);
		result.append(", insideTag: ");
		result.append(insideTag);
		result.append(", outsideTag: ");
		result.append(outsideTag);
		result.append(')');
		return result.toString();
	}

} //TaggedDefinitionImpl
