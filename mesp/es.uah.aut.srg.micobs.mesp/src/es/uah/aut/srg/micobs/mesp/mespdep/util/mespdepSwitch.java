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
package es.uah.aut.srg.micobs.mesp.mespdep.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageElement;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDEPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * 
 * @see es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage
 * @generated
 */
public class mespdepSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mespdepPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mespdepSwitch() {
		if (modelPackage == null) {
			modelPackage = mespdepPackage.eINSTANCE;
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
			case mespdepPackage.MMESP_DEPLOYMENT: {
				MMESPDeployment mmespDeployment = (MMESPDeployment)theEObject;
				T result = caseMMESPDeployment(mmespDeployment);
				if (result == null) result = caseMMESPDEPPackageElement(mmespDeployment);
				if (result == null) result = caseMCommonPackageElement(mmespDeployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespdepPackage.MMESP_DEPLOYMENT_PLATFORM: {
				MMESPDeploymentPlatform mmespDeploymentPlatform = (MMESPDeploymentPlatform)theEObject;
				T result = caseMMESPDeploymentPlatform(mmespDeploymentPlatform);
				if (result == null) result = caseMCommonReferenceableObj(mmespDeploymentPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespdepPackage.MMESP_DEPLOYED_DEVICE: {
				MMESPDeployedDevice mmespDeployedDevice = (MMESPDeployedDevice)theEObject;
				T result = caseMMESPDeployedDevice(mmespDeployedDevice);
				if (result == null) result = caseMCommonReferenceableObj(mmespDeployedDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespdepPackage.MMESP_DEPLOYMENT_ALTERNATIVE: {
				MMESPDeploymentAlternative mmespDeploymentAlternative = (MMESPDeploymentAlternative)theEObject;
				T result = caseMMESPDeploymentAlternative(mmespDeploymentAlternative);
				if (result == null) result = caseMCommonReferenceableObj(mmespDeploymentAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespdepPackage.MMESP_SW_PACKAGE_DEPLOYMENT: {
				MMESPSwPackageDeployment mmespSwPackageDeployment = (MMESPSwPackageDeployment)theEObject;
				T result = caseMMESPSwPackageDeployment(mmespSwPackageDeployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespdepPackage.MMESP_DRIVER_SW_PACKAGE_DEPLOYMENT: {
				MMESPDriverSwPackageDeployment mmespDriverSwPackageDeployment = (MMESPDriverSwPackageDeployment)theEObject;
				T result = caseMMESPDriverSwPackageDeployment(mmespDriverSwPackageDeployment);
				if (result == null) result = caseMMESPSwPackageDeployment(mmespDriverSwPackageDeployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespdepPackage.MMESP_DEVICE_DRIVER_MAPPING: {
				MMESPDeviceDriverMapping mmespDeviceDriverMapping = (MMESPDeviceDriverMapping)theEObject;
				T result = caseMMESPDeviceDriverMapping(mmespDeviceDriverMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespdepPackage.MMESPDEP_PACKAGE_FILE: {
				MMESPDEPPackageFile mmespdepPackageFile = (MMESPDEPPackageFile)theEObject;
				T result = caseMMESPDEPPackageFile(mmespdepPackageFile);
				if (result == null) result = caseMCommonPackageFile(mmespdepPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespdepPackage.MMESPDEP_PACKAGE_ELEMENT: {
				MMESPDEPPackageElement mmespdepPackageElement = (MMESPDEPPackageElement)theEObject;
				T result = caseMMESPDEPPackageElement(mmespdepPackageElement);
				if (result == null) result = caseMCommonPackageElement(mmespdepPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPDeployment</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPDeployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPDeployment(MMESPDeployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPDeploymentPlatform</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPDeploymentPlatform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPDeploymentPlatform(MMESPDeploymentPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPDeployedDevice</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPDeployedDevice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPDeployedDevice(MMESPDeployedDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPDeploymentAlternative</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPDeploymentAlternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPDeploymentAlternative(MMESPDeploymentAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPSwPackageDeployment</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPSwPackageDeployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPSwPackageDeployment(MMESPSwPackageDeployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESP Driver Sw Package Deployment</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESP Driver Sw Package Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPDriverSwPackageDeployment(MMESPDriverSwPackageDeployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPDeviceDriverMapping</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPDeviceDriverMapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPDeviceDriverMapping(MMESPDeviceDriverMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPDEPPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPDEPPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPDEPPackageFile(MMESPDEPPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPDEPPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPDEPPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPDEPPackageElement(MMESPDEPPackageElement object) {
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
