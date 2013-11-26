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
package es.uah.aut.srg.micobs.mesp.mespcommon.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * 
 * @see es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage
 * @generated
 */
public class mespcommonSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mespcommonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mespcommonSwitch() {
		if (modelPackage == null) {
			modelPackage = mespcommonPackage.eINSTANCE;
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
			case mespcommonPackage.MPROVIDED_RESOURCE: {
				MProvidedResource mProvidedResource = (MProvidedResource)theEObject;
				T result = caseMProvidedResource(mProvidedResource);
				if (result == null) result = caseMCommonReferenceableObj(mProvidedResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespcommonPackage.MQUANTIFIABLE_RESOURCE: {
				MQuantifiableResource mQuantifiableResource = (MQuantifiableResource)theEObject;
				T result = caseMQuantifiableResource(mQuantifiableResource);
				if (result == null) result = caseMProvidedResource(mQuantifiableResource);
				if (result == null) result = caseMCommonReferenceableObj(mQuantifiableResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespcommonPackage.MINSTANTIABLE_RESOURCE: {
				MInstantiableResource mInstantiableResource = (MInstantiableResource)theEObject;
				T result = caseMInstantiableResource(mInstantiableResource);
				if (result == null) result = caseMProvidedResource(mInstantiableResource);
				if (result == null) result = caseMCommonReferenceableObj(mInstantiableResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MProvided Resource</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MProvided Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMProvidedResource(MProvidedResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MQuantifiable Resource</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MQuantifiable Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMQuantifiableResource(MQuantifiableResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInstantiable Resource</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInstantiable Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInstantiableResource(MInstantiableResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommon Referenceable Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonReferenceableObj(MCommonReferenceableObj object) {
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
