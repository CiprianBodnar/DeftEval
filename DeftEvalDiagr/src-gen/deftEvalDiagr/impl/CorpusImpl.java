/**
 */
package deftEvalDiagr.impl;

import deftEvalDiagr.Corpus;
import deftEvalDiagr.DeftEvalDiagrPackage;
import deftEvalDiagr.SentenceTokenise;

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
 * An implementation of the model object '<em><b>Corpus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deftEvalDiagr.impl.CorpusImpl#getInputText <em>Input Text</em>}</li>
 *   <li>{@link deftEvalDiagr.impl.CorpusImpl#getSentencetokenise <em>Sentencetokenise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorpusImpl extends MinimalEObjectImpl.Container implements Corpus {
	/**
	 * The default value of the '{@link #getInputText() <em>Input Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputText()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputText() <em>Input Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputText()
	 * @generated
	 * @ordered
	 */
	protected String inputText = INPUT_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSentencetokenise() <em>Sentencetokenise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentencetokenise()
	 * @generated
	 * @ordered
	 */
	protected EList<SentenceTokenise> sentencetokenise;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorpusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeftEvalDiagrPackage.Literals.CORPUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputText() {
		return inputText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputText(String newInputText) {
		String oldInputText = inputText;
		inputText = newInputText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeftEvalDiagrPackage.CORPUS__INPUT_TEXT, oldInputText,
					inputText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SentenceTokenise> getSentencetokenise() {
		if (sentencetokenise == null) {
			sentencetokenise = new EObjectContainmentEList<SentenceTokenise>(SentenceTokenise.class, this,
					DeftEvalDiagrPackage.CORPUS__SENTENCETOKENISE);
		}
		return sentencetokenise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String geInputText() {
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
	public String setInputText() {
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
		case DeftEvalDiagrPackage.CORPUS__SENTENCETOKENISE:
			return ((InternalEList<?>) getSentencetokenise()).basicRemove(otherEnd, msgs);
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
		case DeftEvalDiagrPackage.CORPUS__INPUT_TEXT:
			return getInputText();
		case DeftEvalDiagrPackage.CORPUS__SENTENCETOKENISE:
			return getSentencetokenise();
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
		case DeftEvalDiagrPackage.CORPUS__INPUT_TEXT:
			setInputText((String) newValue);
			return;
		case DeftEvalDiagrPackage.CORPUS__SENTENCETOKENISE:
			getSentencetokenise().clear();
			getSentencetokenise().addAll((Collection<? extends SentenceTokenise>) newValue);
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
		case DeftEvalDiagrPackage.CORPUS__INPUT_TEXT:
			setInputText(INPUT_TEXT_EDEFAULT);
			return;
		case DeftEvalDiagrPackage.CORPUS__SENTENCETOKENISE:
			getSentencetokenise().clear();
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
		case DeftEvalDiagrPackage.CORPUS__INPUT_TEXT:
			return INPUT_TEXT_EDEFAULT == null ? inputText != null : !INPUT_TEXT_EDEFAULT.equals(inputText);
		case DeftEvalDiagrPackage.CORPUS__SENTENCETOKENISE:
			return sentencetokenise != null && !sentencetokenise.isEmpty();
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
		case DeftEvalDiagrPackage.CORPUS___GE_INPUT_TEXT:
			return geInputText();
		case DeftEvalDiagrPackage.CORPUS___SET_INPUT_TEXT:
			return setInputText();
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
		result.append(" (inputText: ");
		result.append(inputText);
		result.append(')');
		return result.toString();
	}

} //CorpusImpl
