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
package es.uah.aut.srg.micobs.mclev.mclevsai.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevsai.MMCLEVSAIPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @see es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage
 * @generated
 */
public class mclevsaiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mclevsaiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mclevsaiSwitch() {
		if (modelPackage == null) {
			modelPackage = mclevsaiPackage.eINSTANCE;
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
			case mclevsaiPackage.MSAI: {
				MSAI msai = (MSAI)theEObject;
				T result = caseMSAI(msai);
				if (result == null) result = caseMMCLEVSAIPackageElement(msai);
				if (result == null) result = caseMCommonPackageElement(msai);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevsaiPackage.MMCLEVSAI_PACKAGE_FILE: {
				MMCLEVSAIPackageFile mmclevsaiPackageFile = (MMCLEVSAIPackageFile)theEObject;
				T result = caseMMCLEVSAIPackageFile(mmclevsaiPackageFile);
				if (result == null) result = caseMCommonPackageFile(mmclevsaiPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevsaiPackage.MMCLEVSAI_PACKAGE_ELEMENT: {
				MMCLEVSAIPackageElement mmclevsaiPackageElement = (MMCLEVSAIPackageElement)theEObject;
				T result = caseMMCLEVSAIPackageElement(mmclevsaiPackageElement);
				if (result == null) result = caseMCommonPackageElement(mmclevsaiPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSAI</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSAI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSAI(MSAI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVSAIPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVSAIPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVSAIPackageFile(MMCLEVSAIPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVSAIPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVSAIPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVSAIPackageElement(MMCLEVSAIPackageElement object) {
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