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
package es.uah.aut.srg.micobs.mesp.mesppswp.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageElement;
import es.uah.aut.srg.micobs.mesp.mesppswp.MMESPPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * 
 * @see es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage
 * @generated
 */
public class mesppswpSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mesppswpPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mesppswpSwitch() {
		if (modelPackage == null) {
			modelPackage = mesppswpPackage.eINSTANCE;
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
			case mesppswpPackage.MPLATFORM_SW_PACKAGE: {
				MPlatformSwPackage mPlatformSwPackage = (MPlatformSwPackage)theEObject;
				T result = caseMPlatformSwPackage(mPlatformSwPackage);
				if (result == null) result = caseMMESPPSWPPackageElement(mPlatformSwPackage);
				if (result == null) result = caseMCommonPackageReferencingElement(mPlatformSwPackage);
				if (result == null) result = caseMCommonPackageElement(mPlatformSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesppswpPackage.MMESPPSWP_PACKAGE_FILE: {
				MMESPPSWPPackageFile mmesppswpPackageFile = (MMESPPSWPPackageFile)theEObject;
				T result = caseMMESPPSWPPackageFile(mmesppswpPackageFile);
				if (result == null) result = caseMCommonPackageFile(mmesppswpPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mesppswpPackage.MMESPPSWP_PACKAGE_ELEMENT: {
				MMESPPSWPPackageElement mmesppswpPackageElement = (MMESPPSWPPackageElement)theEObject;
				T result = caseMMESPPSWPPackageElement(mmesppswpPackageElement);
				if (result == null) result = caseMCommonPackageElement(mmesppswpPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPlatformSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPlatformSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPlatformSwPackage(MPlatformSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPPSWPPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPPSWPPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPPSWPPackageFile(MMESPPSWPPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPPSWPPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPPSWPPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPPSWPPackageElement(MMESPPSWPPackageElement object) {
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