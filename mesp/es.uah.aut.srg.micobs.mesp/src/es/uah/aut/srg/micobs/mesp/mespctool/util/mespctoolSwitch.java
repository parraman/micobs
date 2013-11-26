/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 ******************************************************************************/
package es.uah.aut.srg.micobs.mesp.mespctool.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool;
import es.uah.aut.srg.micobs.mesp.mespctool.MMESPCTOOLPackageElement;
import es.uah.aut.srg.micobs.mesp.mespctool.MMESPCTOOLPackageFile;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @see es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage
 * @generated
 */
public class mespctoolSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mespctoolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mespctoolSwitch() {
		if (modelPackage == null) {
			modelPackage = mespctoolPackage.eINSTANCE;
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
			case mespctoolPackage.MCONSTRUCTION_TOOL: {
				MConstructionTool mConstructionTool = (MConstructionTool)theEObject;
				T result = caseMConstructionTool(mConstructionTool);
				if (result == null) result = caseMMESPCTOOLPackageElement(mConstructionTool);
				if (result == null) result = caseMCommonPackageElement(mConstructionTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespctoolPackage.MMESPCTOOL_PACKAGE_FILE: {
				MMESPCTOOLPackageFile mmespctoolPackageFile = (MMESPCTOOLPackageFile)theEObject;
				T result = caseMMESPCTOOLPackageFile(mmespctoolPackageFile);
				if (result == null) result = caseMCommonPackageFile(mmespctoolPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespctoolPackage.MMESPCTOOL_PACKAGE_ELEMENT: {
				MMESPCTOOLPackageElement mmespctoolPackageElement = (MMESPCTOOLPackageElement)theEObject;
				T result = caseMMESPCTOOLPackageElement(mmespctoolPackageElement);
				if (result == null) result = caseMCommonPackageElement(mmespctoolPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MConstructionTool</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MConstructionTool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMConstructionTool(MConstructionTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPCTOOLPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPCTOOLPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPCTOOLPackageFile(MMESPCTOOLPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPCTOOLPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPCTOOLPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPCTOOLPackageElement(MMESPCTOOLPackageElement object) {
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
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //mespctoolSwitch
