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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage
 * @generated
 */
public class mclevflatmcadSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mclevflatmcadPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mclevflatmcadSwitch() {
		if (modelPackage == null) {
			modelPackage = mclevflatmcadPackage.eINSTANCE;
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
			case mclevflatmcadPackage.MFLAT_MCAD: {
				MFlatMCAD mFlatMCAD = (MFlatMCAD)theEObject;
				T result = caseMFlatMCAD(mFlatMCAD);
				if (result == null) result = caseMMCLEVFLATMCADPackageElement(mFlatMCAD);
				if (result == null) result = caseMCommonPackageReferencingElement(mFlatMCAD);
				if (result == null) result = caseMCommonPackageElement(mFlatMCAD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET: {
				MFlatMCADTarget mFlatMCADTarget = (MFlatMCADTarget)theEObject;
				T result = caseMFlatMCADTarget(mFlatMCADTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevflatmcadPackage.MFLAT_SERVICE_LIBRARY_INSTANCE: {
				MFlatServiceLibraryInstance mFlatServiceLibraryInstance = (MFlatServiceLibraryInstance)theEObject;
				T result = caseMFlatServiceLibraryInstance(mFlatServiceLibraryInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevflatmcadPackage.MFLAT_DRIVER_SLIB_INSTANCE: {
				MFlatDriverSLibInstance mFlatDriverSLibInstance = (MFlatDriverSLibInstance)theEObject;
				T result = caseMFlatDriverSLibInstance(mFlatDriverSLibInstance);
				if (result == null) result = caseMFlatServiceLibraryInstance(mFlatDriverSLibInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevflatmcadPackage.MFLAT_COMPONENT_INSTANCE: {
				MFlatComponentInstance mFlatComponentInstance = (MFlatComponentInstance)theEObject;
				T result = caseMFlatComponentInstance(mFlatComponentInstance);
				if (result == null) result = caseMCommonReferenceableObj(mFlatComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevflatmcadPackage.MFLAT_CONNECTION: {
				MFlatConnection mFlatConnection = (MFlatConnection)theEObject;
				T result = caseMFlatConnection(mFlatConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevflatmcadPackage.MMCLEVFLATMCAD_PACKAGE_FILE: {
				MMCLEVFLATMCADPackageFile mmclevflatmcadPackageFile = (MMCLEVFLATMCADPackageFile)theEObject;
				T result = caseMMCLEVFLATMCADPackageFile(mmclevflatmcadPackageFile);
				if (result == null) result = caseMCommonPackageFile(mmclevflatmcadPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevflatmcadPackage.MMCLEVFLATMCAD_PACKAGE_ELEMENT: {
				MMCLEVFLATMCADPackageElement mmclevflatmcadPackageElement = (MMCLEVFLATMCADPackageElement)theEObject;
				T result = caseMMCLEVFLATMCADPackageElement(mmclevflatmcadPackageElement);
				if (result == null) result = caseMCommonPackageElement(mmclevflatmcadPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevflatmcadPackage.MFLAT_DEVICE_DRIVER_MAPPING: {
				MFlatDeviceDriverMapping mFlatDeviceDriverMapping = (MFlatDeviceDriverMapping)theEObject;
				T result = caseMFlatDeviceDriverMapping(mFlatDeviceDriverMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFlatMCAD</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFlatMCAD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFlatMCAD(MFlatMCAD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFlatMCADTarget</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFlatMCADTarget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFlatMCADTarget(MFlatMCADTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFlatServiceLibraryInstance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFlatServiceLibraryInstance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFlatServiceLibraryInstance(MFlatServiceLibraryInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFlatDriverSLibInstance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFlatDriverSLibInstance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFlatDriverSLibInstance(MFlatDriverSLibInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFlatComponentInstance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFlatComponentInstance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFlatComponentInstance(MFlatComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFlatConnection</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFlatConnection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFlatConnection(MFlatConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVFLATMCADPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVFLATMCADPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVFLATMCADPackageFile(MMCLEVFLATMCADPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVFLATMCADPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVFLATMCADPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVFLATMCADPackageElement(MMCLEVFLATMCADPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MFlatDeviceDriverMapping</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MFlatDeviceDriverMapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMFlatDeviceDriverMapping(MFlatDeviceDriverMapping object) {
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