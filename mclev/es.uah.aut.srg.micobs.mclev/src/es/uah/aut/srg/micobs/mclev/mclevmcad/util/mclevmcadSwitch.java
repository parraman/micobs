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
package es.uah.aut.srg.micobs.mclev.mclevmcad.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageElement;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage
 * @generated
 */
public class mclevmcadSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mclevmcadPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mclevmcadSwitch() {
		if (modelPackage == null) {
			modelPackage = mclevmcadPackage.eINSTANCE;
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
			case mclevmcadPackage.MMCA_DEPLOYMENT: {
				MMCADeployment mmcaDeployment = (MMCADeployment)theEObject;
				T result = caseMMCADeployment(mmcaDeployment);
				if (result == null) result = caseMMCLEVMCADPackageElement(mmcaDeployment);
				if (result == null) result = caseMCommonPackageElement(mmcaDeployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MSERVICE_LIBRARY_INSTANCE: {
				MServiceLibraryInstance mServiceLibraryInstance = (MServiceLibraryInstance)theEObject;
				T result = caseMServiceLibraryInstance(mServiceLibraryInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MDRIVER_SLIB_INSTANCE: {
				MDriverSLibInstance mDriverSLibInstance = (MDriverSLibInstance)theEObject;
				T result = caseMDriverSLibInstance(mDriverSLibInstance);
				if (result == null) result = caseMServiceLibraryInstance(mDriverSLibInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MDEVICE_DRIVER_MAPPING: {
				MDeviceDriverMapping mDeviceDriverMapping = (MDeviceDriverMapping)theEObject;
				T result = caseMDeviceDriverMapping(mDeviceDriverMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MCOMPONENT_INSTANCE: {
				MComponentInstance mComponentInstance = (MComponentInstance)theEObject;
				T result = caseMComponentInstance(mComponentInstance);
				if (result == null) result = caseMCommonReferenceableObj(mComponentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MDEPLOYMENT_ALTERNATIVE: {
				MDeploymentAlternative mDeploymentAlternative = (MDeploymentAlternative)theEObject;
				T result = caseMDeploymentAlternative(mDeploymentAlternative);
				if (result == null) result = caseMCommonReferenceableObj(mDeploymentAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MCONNECTION: {
				MConnection mConnection = (MConnection)theEObject;
				T result = caseMConnection(mConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MCOMMON_CONNECTION: {
				MCommonConnection mCommonConnection = (MCommonConnection)theEObject;
				T result = caseMCommonConnection(mCommonConnection);
				if (result == null) result = caseMConnection(mCommonConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MCONNECTION_SWITCH: {
				MConnectionSwitch mConnectionSwitch = (MConnectionSwitch)theEObject;
				T result = caseMConnectionSwitch(mConnectionSwitch);
				if (result == null) result = caseMConnection(mConnectionSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MCONNECTION_SWITCH_CASE: {
				MConnectionSwitchCase mConnectionSwitchCase = (MConnectionSwitchCase)theEObject;
				T result = caseMConnectionSwitchCase(mConnectionSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MDEPLOYMENT_PLATFORM: {
				MDeploymentPlatform mDeploymentPlatform = (MDeploymentPlatform)theEObject;
				T result = caseMDeploymentPlatform(mDeploymentPlatform);
				if (result == null) result = caseMCommonReferenceableObj(mDeploymentPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MDEPLOYED_DEVICE: {
				MDeployedDevice mDeployedDevice = (MDeployedDevice)theEObject;
				T result = caseMDeployedDevice(mDeployedDevice);
				if (result == null) result = caseMCommonReferenceableObj(mDeployedDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MMCLEVMCAD_PACKAGE_FILE: {
				MMCLEVMCADPackageFile mmclevmcadPackageFile = (MMCLEVMCADPackageFile)theEObject;
				T result = caseMMCLEVMCADPackageFile(mmclevmcadPackageFile);
				if (result == null) result = caseMCommonPackageFile(mmclevmcadPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mclevmcadPackage.MMCLEVMCAD_PACKAGE_ELEMENT: {
				MMCLEVMCADPackageElement mmclevmcadPackageElement = (MMCLEVMCADPackageElement)theEObject;
				T result = caseMMCLEVMCADPackageElement(mmclevmcadPackageElement);
				if (result == null) result = caseMCommonPackageElement(mmclevmcadPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCADeployment</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCADeployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCADeployment(MMCADeployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MServiceLibraryInstance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MServiceLibraryInstance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMServiceLibraryInstance(MServiceLibraryInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDriverSLibInstance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDriverSLibInstance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDriverSLibInstance(MDriverSLibInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDeviceDriverMapping</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDeviceDriverMapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDeviceDriverMapping(MDeviceDriverMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MComponentInstance</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MComponentInstance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMComponentInstance(MComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDeploymentAlternative</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDeploymentAlternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDeploymentAlternative(MDeploymentAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MConnection</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MConnection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMConnection(MConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MCommonConnection</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MCommonConnection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMCommonConnection(MCommonConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MConnectionSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MConnectionSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMConnectionSwitch(MConnectionSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MConnectionSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MConnectionSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMConnectionSwitchCase(MConnectionSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDeploymentPlatform</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDeploymentPlatform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDeploymentPlatform(MDeploymentPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDeployedDevice</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDeployedDevice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDeployedDevice(MDeployedDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVMCADPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVMCADPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVMCADPackageFile(MMCLEVMCADPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMCLEVMCADPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMCLEVMCADPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMCLEVMCADPackageElement(MMCLEVMCADPackageElement object) {
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