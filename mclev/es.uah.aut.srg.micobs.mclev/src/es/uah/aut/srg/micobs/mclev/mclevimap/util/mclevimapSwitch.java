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
package es.uah.aut.srg.micobs.mclev.mclevimap.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevimap.MInterfaceMapping;
import es.uah.aut.srg.micobs.mclev.mclevimap.MMCLEVIMAPPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevimap.MMCLEVIMAPPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @see es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage
 * @generated
 */
public class mclevimapSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mclevimapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mclevimapSwitch() {
		if (modelPackage == null) {
			modelPackage = mclevimapPackage.eINSTANCE;
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
			case mclevimapPackage.MINTERFACE_MAPPING: {
				MInterfaceMapping mInterfaceMapping = (MInterfaceMapping)theEObject;
				T result = caseMInterfaceMapping(mInterfaceMapping);
				if (result == null) result = caseMMCLEVIMAPPackageElement(mInterfaceMapping);
				if (result == null) result = caseMCommonPackageElement(mInterfaceMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevimapPackage.MMCLEVIMAP_PACKAGE_FILE: {
				MMCLEVIMAPPackageFile mmclevimapPackageFile = (MMCLEVIMAPPackageFile)theEObject;
				T result = caseMMCLEVIMAPPackageFile(mmclevimapPackageFile);
				if (result == null) result = caseMCommonPackageFile(mmclevimapPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevimapPackage.MMCLEVIMAP_PACKAGE_ELEMENT: {
				MMCLEVIMAPPackageElement mmclevimapPackageElement = (MMCLEVIMAPPackageElement)theEObject;
				T result = caseMMCLEVIMAPPackageElement(mmclevimapPackageElement);
				if (result == null) result = caseMCommonPackageElement(mmclevimapPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInterfaceMapping</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInterfaceMapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInterfaceMapping(MInterfaceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVIMAPPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVIMAPPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVIMAPPackageFile(MMCLEVIMAPPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVIMAPPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVIMAPPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVIMAPPackageElement(MMCLEVIMAPPackageElement object) {
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