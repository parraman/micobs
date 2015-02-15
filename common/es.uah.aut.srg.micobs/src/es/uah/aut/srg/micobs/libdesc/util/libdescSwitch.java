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
package es.uah.aut.srg.micobs.libdesc.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.MDescriptorField;
import es.uah.aut.srg.micobs.libdesc.MDescriptorList;
import es.uah.aut.srg.micobs.libdesc.libdescPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage
 * @generated
 */
public class libdescSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static libdescPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public libdescSwitch() {
		if (modelPackage == null) {
			modelPackage = libdescPackage.eINSTANCE;
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
			case libdescPackage.MDESCRIPTOR: {
				MDescriptor mDescriptor = (MDescriptor)theEObject;
				T result = caseMDescriptor(mDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case libdescPackage.MDESCRIPTOR_LIST: {
				MDescriptorList mDescriptorList = (MDescriptorList)theEObject;
				T result = caseMDescriptorList(mDescriptorList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case libdescPackage.MDESCRIPTOR_FIELD: {
				MDescriptorField mDescriptorField = (MDescriptorField)theEObject;
				T result = caseMDescriptorField(mDescriptorField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDescriptor</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDescriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDescriptor(MDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDescriptorList</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDescriptorList</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDescriptorList(MDescriptorList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDescriptorField</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDescriptorField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDescriptorField(MDescriptorField object) {
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
