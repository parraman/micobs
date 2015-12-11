/*******************************************************************************
 * Copyright (c) 2013-2015 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageElement;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageFile;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMReplyMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMSendMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage
 * @generated
 */
public class edroomprotSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static edroomprotPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public edroomprotSwitch() {
		if (modelPackage == null) {
			modelPackage = edroomprotPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case edroomprotPackage.EDROOM_PROTOCOL: {
				EDROOMProtocol edroomProtocol = (EDROOMProtocol)theEObject;
				T result = caseEDROOMProtocol(edroomProtocol);
				if (result == null) result = caseEDROOMPROTPackageElement(edroomProtocol);
				if (result == null) result = caseMCommonPackageReferencingElement(edroomProtocol);
				if (result == null) result = caseMCommonPackageElement(edroomProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomprotPackage.EDROOM_MESSAGE: {
				EDROOMMessage edroomMessage = (EDROOMMessage)theEObject;
				T result = caseEDROOMMessage(edroomMessage);
				if (result == null) result = caseMCommonReferenceableObj(edroomMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomprotPackage.EDROOM_SEND_MESSAGE: {
				EDROOMSendMessage edroomSendMessage = (EDROOMSendMessage)theEObject;
				T result = caseEDROOMSendMessage(edroomSendMessage);
				if (result == null) result = caseEDROOMMessage(edroomSendMessage);
				if (result == null) result = caseMCommonReferenceableObj(edroomSendMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomprotPackage.EDROOM_INVOKE_MESSAGE: {
				EDROOMInvokeMessage edroomInvokeMessage = (EDROOMInvokeMessage)theEObject;
				T result = caseEDROOMInvokeMessage(edroomInvokeMessage);
				if (result == null) result = caseEDROOMMessage(edroomInvokeMessage);
				if (result == null) result = caseMCommonReferenceableObj(edroomInvokeMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomprotPackage.EDROOM_REPLY_MESSAGE: {
				EDROOMReplyMessage edroomReplyMessage = (EDROOMReplyMessage)theEObject;
				T result = caseEDROOMReplyMessage(edroomReplyMessage);
				if (result == null) result = caseEDROOMMessage(edroomReplyMessage);
				if (result == null) result = caseMCommonReferenceableObj(edroomReplyMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomprotPackage.EDROOMPROT_PACKAGE_FILE: {
				EDROOMPROTPackageFile edroomprotPackageFile = (EDROOMPROTPackageFile)theEObject;
				T result = caseEDROOMPROTPackageFile(edroomprotPackageFile);
				if (result == null) result = caseMCommonPackageFile(edroomprotPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case edroomprotPackage.EDROOMPROT_PACKAGE_ELEMENT: {
				EDROOMPROTPackageElement edroomprotPackageElement = (EDROOMPROTPackageElement)theEObject;
				T result = caseEDROOMPROTPackageElement(edroomprotPackageElement);
				if (result == null) result = caseMCommonPackageReferencingElement(edroomprotPackageElement);
				if (result == null) result = caseMCommonPackageElement(edroomprotPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMProtocol</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMProtocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMProtocol(EDROOMProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMMessage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMMessage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMMessage(EDROOMMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMSendMessage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMSendMessage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMSendMessage(EDROOMSendMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMInvokeMessage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMInvokeMessage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMInvokeMessage(EDROOMInvokeMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMReplyMessage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMReplyMessage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMReplyMessage(EDROOMReplyMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMPROTPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMPROTPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMPROTPackageFile(EDROOMPROTPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDROOMPROTPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDROOMPROTPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDROOMPROTPackageElement(EDROOMPROTPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageElement(MCommonPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageReferencingElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageReferencingElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageReferencingElement(MCommonPackageReferencingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonReferenceableObj</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonReferenceableObj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonReferenceableObj(MCommonReferenceableObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageFile(MCommonPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

}
