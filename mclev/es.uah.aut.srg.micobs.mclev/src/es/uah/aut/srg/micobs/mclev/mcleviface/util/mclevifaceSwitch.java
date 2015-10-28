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
package es.uah.aut.srg.micobs.mclev.mcleviface.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageElement;
import es.uah.aut.srg.micobs.mclev.mcleviface.MMCLEVIFACEPackageFile;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @see es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage
 * @generated
 */
public class mclevifaceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mclevifacePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mclevifaceSwitch() {
		if (modelPackage == null) {
			modelPackage = mclevifacePackage.eINSTANCE;
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
			case mclevifacePackage.MINTERFACE: {
				MInterface mInterface = (MInterface)theEObject;
				T result = caseMInterface(mInterface);
				if (result == null) result = caseMMCLEVIFACEPackageElement(mInterface);
				if (result == null) result = caseMCommonPackageElement(mInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevifacePackage.MMCLEVIFACE_PACKAGE_FILE: {
				MMCLEVIFACEPackageFile mmclevifacePackageFile = (MMCLEVIFACEPackageFile)theEObject;
				T result = caseMMCLEVIFACEPackageFile(mmclevifacePackageFile);
				if (result == null) result = caseMCommonPackageFile(mmclevifacePackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevifacePackage.MMCLEVIFACE_PACKAGE_ELEMENT: {
				MMCLEVIFACEPackageElement mmclevifacePackageElement = (MMCLEVIFACEPackageElement)theEObject;
				T result = caseMMCLEVIFACEPackageElement(mmclevifacePackageElement);
				if (result == null) result = caseMCommonPackageElement(mmclevifacePackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInterface</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInterface(MInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVIFACE Package File</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVIFACE Package File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVIFACEPackageFile(MMCLEVIFACEPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVIFACE Package Element</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVIFACE Package Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVIFACEPackageElement(MMCLEVIFACEPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommon Package Element</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommon Package Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonPackageElement(MCommonPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommon Package File</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommon Package File</em>'.
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