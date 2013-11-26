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
package es.uah.aut.srg.micobs.mesp.mespswp.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import es.uah.aut.srg.micobs.common.MBooleanParameter;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MIntegerParameter;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MRealParameter;
import es.uah.aut.srg.micobs.common.MStringParameter;
import es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MBooleanParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageElement;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageFile;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MStringParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVA;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

/**
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * 
 * @see es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage
 * @generated
 */
public class mespswpSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * @generated
	 */
	protected static mespswpPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * @generated
	 */
	public mespswpSwitch() {
		if (modelPackage == null) {
			modelPackage = mespswpPackage.eINSTANCE;
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
			case mespswpPackage.MSW_PACKAGE: {
				MSwPackage mSwPackage = (MSwPackage)theEObject;
				T result = caseMSwPackage(mSwPackage);
				if (result == null) result = caseMAbstractSwPackage(mSwPackage);
				if (result == null) result = caseMMESPSWPPackageElement(mSwPackage);
				if (result == null) result = caseMCommonPackageElement(mSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MDRIVER_SW_PACKAGE: {
				MDriverSwPackage mDriverSwPackage = (MDriverSwPackage)theEObject;
				T result = caseMDriverSwPackage(mDriverSwPackage);
				if (result == null) result = caseMSwPackage(mDriverSwPackage);
				if (result == null) result = caseMCommonPackageElement(mDriverSwPackage);
				if (result == null) result = caseMAbstractSwPackage(mDriverSwPackage);
				if (result == null) result = caseMMESPSWPPackageElement(mDriverSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE: {
				MSwPackageProvidedInterface mSwPackageProvidedInterface = (MSwPackageProvidedInterface)theEObject;
				T result = caseMSwPackageProvidedInterface(mSwPackageProvidedInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA: {
				MSwPackageProvidedInterfacePVA mSwPackageProvidedInterfacePVA = (MSwPackageProvidedInterfacePVA)theEObject;
				T result = caseMSwPackageProvidedInterfacePVA(mSwPackageProvidedInterfacePVA);
				if (result == null) result = caseMParameterValueAssignment(mSwPackageProvidedInterfacePVA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH: {
				MSwPackageProvidedInterfacePVASwitch mSwPackageProvidedInterfacePVASwitch = (MSwPackageProvidedInterfacePVASwitch)theEObject;
				T result = caseMSwPackageProvidedInterfacePVASwitch(mSwPackageProvidedInterfacePVASwitch);
				if (result == null) result = caseMSwPackageProvidedInterfacePVA(mSwPackageProvidedInterfacePVASwitch);
				if (result == null) result = caseMParameterValueAssignment(mSwPackageProvidedInterfacePVASwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_SWITCH_CASE: {
				MSwPackageProvidedInterfacePVASwitchCase mSwPackageProvidedInterfacePVASwitchCase = (MSwPackageProvidedInterfacePVASwitchCase)theEObject;
				T result = caseMSwPackageProvidedInterfacePVASwitchCase(mSwPackageProvidedInterfacePVASwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MSW_PACKAGE_PROVIDED_INTERFACE_PVA_EXPRESSION: {
				MSwPackageProvidedInterfacePVAExpression mSwPackageProvidedInterfacePVAExpression = (MSwPackageProvidedInterfacePVAExpression)theEObject;
				T result = caseMSwPackageProvidedInterfacePVAExpression(mSwPackageProvidedInterfacePVAExpression);
				if (result == null) result = caseMSwPackageProvidedInterfacePVA(mSwPackageProvidedInterfacePVAExpression);
				if (result == null) result = caseMParameterValueAssignment(mSwPackageProvidedInterfacePVAExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MSW_PACKAGE_REQUIRED_INTERFACE: {
				MSwPackageRequiredInterface mSwPackageRequiredInterface = (MSwPackageRequiredInterface)theEObject;
				T result = caseMSwPackageRequiredInterface(mSwPackageRequiredInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MABSTRACT_SW_PACKAGE: {
				MAbstractSwPackage mAbstractSwPackage = (MAbstractSwPackage)theEObject;
				T result = caseMAbstractSwPackage(mAbstractSwPackage);
				if (result == null) result = caseMMESPSWPPackageElement(mAbstractSwPackage);
				if (result == null) result = caseMCommonPackageElement(mAbstractSwPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM: {
				MSwPackageSupportedPlatform mSwPackageSupportedPlatform = (MSwPackageSupportedPlatform)theEObject;
				T result = caseMSwPackageSupportedPlatform(mSwPackageSupportedPlatform);
				if (result == null) result = caseMCommonReferenceableObj(mSwPackageSupportedPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_PLATFORM: {
				MDriverSwPackageSupportedPlatform mDriverSwPackageSupportedPlatform = (MDriverSwPackageSupportedPlatform)theEObject;
				T result = caseMDriverSwPackageSupportedPlatform(mDriverSwPackageSupportedPlatform);
				if (result == null) result = caseMSwPackageSupportedPlatform(mDriverSwPackageSupportedPlatform);
				if (result == null) result = caseMCommonReferenceableObj(mDriverSwPackageSupportedPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MDRIVER_SW_PACKAGE_SUPPORTED_DEVICE: {
				MDriverSwPackageSupportedDevice mDriverSwPackageSupportedDevice = (MDriverSwPackageSupportedDevice)theEObject;
				T result = caseMDriverSwPackageSupportedDevice(mDriverSwPackageSupportedDevice);
				if (result == null) result = caseMCommonReferenceableObj(mDriverSwPackageSupportedDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MRESOURCE_DEMAND: {
				MResourceDemand mResourceDemand = (MResourceDemand)theEObject;
				T result = caseMResourceDemand(mResourceDemand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MINSTANTIABLE_RESOURCE_DEMAND: {
				MInstantiableResourceDemand mInstantiableResourceDemand = (MInstantiableResourceDemand)theEObject;
				T result = caseMInstantiableResourceDemand(mInstantiableResourceDemand);
				if (result == null) result = caseMResourceDemand(mInstantiableResourceDemand);
				if (result == null) result = caseMCommonReferenceableObj(mInstantiableResourceDemand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MQUANTIFIABLE_RESOURCE_DEMAND: {
				MQuantifiableResourceDemand mQuantifiableResourceDemand = (MQuantifiableResourceDemand)theEObject;
				T result = caseMQuantifiableResourceDemand(mQuantifiableResourceDemand);
				if (result == null) result = caseMResourceDemand(mQuantifiableResourceDemand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MMESPSWP_PACKAGE_FILE: {
				MMESPSWPPackageFile mmespswpPackageFile = (MMESPSWPPackageFile)theEObject;
				T result = caseMMESPSWPPackageFile(mmespswpPackageFile);
				if (result == null) result = caseMCommonPackageFile(mmespswpPackageFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MMESPSWP_PACKAGE_ELEMENT: {
				MMESPSWPPackageElement mmespswpPackageElement = (MMESPSWPPackageElement)theEObject;
				T result = caseMMESPSWPPackageElement(mmespswpPackageElement);
				if (result == null) result = caseMCommonPackageElement(mmespswpPackageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MPARAMETER_SWPSP_SWITCH: {
				MParameterSWPSPSwitch mParameterSWPSPSwitch = (MParameterSWPSPSwitch)theEObject;
				T result = caseMParameterSWPSPSwitch(mParameterSWPSPSwitch);
				if (result == null) result = caseMParameter(mParameterSWPSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mParameterSWPSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MPARAMETER_SWPSP_SWITCH_CASE: {
				MParameterSWPSPSwitchCase mParameterSWPSPSwitchCase = (MParameterSWPSPSwitchCase)theEObject;
				T result = caseMParameterSWPSPSwitchCase(mParameterSWPSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MBOOLEAN_PARAM_SWPSP_SWITCH: {
				MBooleanParamSWPSPSwitch mBooleanParamSWPSPSwitch = (MBooleanParamSWPSPSwitch)theEObject;
				T result = caseMBooleanParamSWPSPSwitch(mBooleanParamSWPSPSwitch);
				if (result == null) result = caseMBooleanParameter(mBooleanParamSWPSPSwitch);
				if (result == null) result = caseMParameterSWPSPSwitch(mBooleanParamSWPSPSwitch);
				if (result == null) result = caseMParameter(mBooleanParamSWPSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mBooleanParamSWPSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MBOOLEAN_PARAM_SWPSP_SWITCH_CASE: {
				MBooleanParamSWPSPSwitchCase mBooleanParamSWPSPSwitchCase = (MBooleanParamSWPSPSwitchCase)theEObject;
				T result = caseMBooleanParamSWPSPSwitchCase(mBooleanParamSWPSPSwitchCase);
				if (result == null) result = caseMParameterSWPSPSwitchCase(mBooleanParamSWPSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MSTRING_PARAM_SWPSP_SWITCH: {
				MStringParamSWPSPSwitch mStringParamSWPSPSwitch = (MStringParamSWPSPSwitch)theEObject;
				T result = caseMStringParamSWPSPSwitch(mStringParamSWPSPSwitch);
				if (result == null) result = caseMStringParameter(mStringParamSWPSPSwitch);
				if (result == null) result = caseMParameterSWPSPSwitch(mStringParamSWPSPSwitch);
				if (result == null) result = caseMParameter(mStringParamSWPSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mStringParamSWPSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MSTRING_PARAM_SWPSP_SWITCH_CASE: {
				MStringParamSWPSPSwitchCase mStringParamSWPSPSwitchCase = (MStringParamSWPSPSwitchCase)theEObject;
				T result = caseMStringParamSWPSPSwitchCase(mStringParamSWPSPSwitchCase);
				if (result == null) result = caseMParameterSWPSPSwitchCase(mStringParamSWPSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MINTEGER_PARAM_SWPSP_SWITCH: {
				MIntegerParamSWPSPSwitch mIntegerParamSWPSPSwitch = (MIntegerParamSWPSPSwitch)theEObject;
				T result = caseMIntegerParamSWPSPSwitch(mIntegerParamSWPSPSwitch);
				if (result == null) result = caseMIntegerParameter(mIntegerParamSWPSPSwitch);
				if (result == null) result = caseMParameterSWPSPSwitch(mIntegerParamSWPSPSwitch);
				if (result == null) result = caseMParameter(mIntegerParamSWPSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mIntegerParamSWPSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MINTEGER_PARAM_SWPSP_SWITCH_CASE: {
				MIntegerParamSWPSPSwitchCase mIntegerParamSWPSPSwitchCase = (MIntegerParamSWPSPSwitchCase)theEObject;
				T result = caseMIntegerParamSWPSPSwitchCase(mIntegerParamSWPSPSwitchCase);
				if (result == null) result = caseMParameterSWPSPSwitchCase(mIntegerParamSWPSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MENUM_PARAM_SWPSP_SWITCH: {
				MEnumParamSWPSPSwitch mEnumParamSWPSPSwitch = (MEnumParamSWPSPSwitch)theEObject;
				T result = caseMEnumParamSWPSPSwitch(mEnumParamSWPSPSwitch);
				if (result == null) result = caseMEnumParameter(mEnumParamSWPSPSwitch);
				if (result == null) result = caseMParameterSWPSPSwitch(mEnumParamSWPSPSwitch);
				if (result == null) result = caseMParameter(mEnumParamSWPSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mEnumParamSWPSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MENUM_PARAM_SWPSP_SWITCH_CASE: {
				MEnumParamSWPSPSwitchCase mEnumParamSWPSPSwitchCase = (MEnumParamSWPSPSwitchCase)theEObject;
				T result = caseMEnumParamSWPSPSwitchCase(mEnumParamSWPSPSwitchCase);
				if (result == null) result = caseMParameterSWPSPSwitchCase(mEnumParamSWPSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MREAL_PARAM_SWPSP_SWITCH: {
				MRealParamSWPSPSwitch mRealParamSWPSPSwitch = (MRealParamSWPSPSwitch)theEObject;
				T result = caseMRealParamSWPSPSwitch(mRealParamSWPSPSwitch);
				if (result == null) result = caseMRealParameter(mRealParamSWPSPSwitch);
				if (result == null) result = caseMParameterSWPSPSwitch(mRealParamSWPSPSwitch);
				if (result == null) result = caseMParameter(mRealParamSWPSPSwitch);
				if (result == null) result = caseMCommonReferenceableObj(mRealParamSWPSPSwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case mespswpPackage.MREAL_PARAM_SWPSP_SWITCH_CASE: {
				MRealParamSWPSPSwitchCase mRealParamSWPSPSwitchCase = (MRealParamSWPSPSwitchCase)theEObject;
				T result = caseMRealParamSWPSPSwitchCase(mRealParamSWPSPSwitchCase);
				if (result == null) result = caseMParameterSWPSPSwitchCase(mRealParamSWPSPSwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSwPackage(MSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDriverSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDriverSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDriverSwPackage(MDriverSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSwPackageProvidedInterface</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSwPackageProvidedInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSwPackageProvidedInterface(MSwPackageProvidedInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSwPackageProvidedInterfacePVA</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSwPackageProvidedInterfacePVA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSwPackageProvidedInterfacePVA(MSwPackageProvidedInterfacePVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSwPackageProvidedInterfacePVASwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSwPackageProvidedInterfacePVASwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSwPackageProvidedInterfacePVASwitch(MSwPackageProvidedInterfacePVASwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSwPackageProvidedInterfacePVASwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSwPackageProvidedInterfacePVASwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSwPackageProvidedInterfacePVASwitchCase(MSwPackageProvidedInterfacePVASwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSwPackageProvidedInterfacePVAExpression</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSwPackageProvidedInterfacePVAExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSwPackageProvidedInterfacePVAExpression(MSwPackageProvidedInterfacePVAExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSwPackageRequiredInterface</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSwPackageRequiredInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSwPackageRequiredInterface(MSwPackageRequiredInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAbstractSwPackage</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAbstractSwPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAbstractSwPackage(MAbstractSwPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MSwPackageSupportedPlatform</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MSwPackageSupportedPlatform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMSwPackageSupportedPlatform(MSwPackageSupportedPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDriverSwPackageSupportedPlatform</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDriverSwPackageSupportedPlatform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDriverSwPackageSupportedPlatform(MDriverSwPackageSupportedPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MDriverSwPackageSupportedDevice</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MDriverSwPackageSupportedDevice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDriverSwPackageSupportedDevice(MDriverSwPackageSupportedDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MResourceDemand</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MResourceDemand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMResourceDemand(MResourceDemand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInstantiableResourceDemand</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInstantiableResourceDemand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMInstantiableResourceDemand(MInstantiableResourceDemand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MQuantifiableResourceDemand</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MQuantifiableResourceDemand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMQuantifiableResourceDemand(MQuantifiableResourceDemand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPSWPPackageFile</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPSWPPackageFile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPSWPPackageFile(MMESPSWPPackageFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MMESPSWPPackageElement</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MMESPSWPPackageElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMMESPSWPPackageElement(MMESPSWPPackageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameter SWPSP Switch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter SWPSP Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterSWPSPSwitch(MParameterSWPSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MParameter SWPSP Switch Case</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter SWPSP Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterSWPSPSwitchCase(MParameterSWPSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBooleanParamSWPSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBooleanParamSWPSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParamSWPSPSwitch(MBooleanParamSWPSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBooleanParamSWPSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBooleanParamSWPSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParamSWPSPSwitchCase(MBooleanParamSWPSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStringParamSWPSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStringParamSWPSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParamSWPSPSwitch(MStringParamSWPSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MStringParamSWPSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MStringParamSWPSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParamSWPSPSwitchCase(MStringParamSWPSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIntegerParamSWPSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIntegerParamSWPSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParamSWPSPSwitch(MIntegerParamSWPSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MIntegerParamSWPSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MIntegerParamSWPSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParamSWPSPSwitchCase(MIntegerParamSWPSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParamSWPSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParamSWPSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamSWPSPSwitch(MEnumParamSWPSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnumParamSWPSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnumParamSWPSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParamSWPSPSwitchCase(MEnumParamSWPSPSwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRealParamSWPSPSwitch</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRealParamSWPSPSwitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParamSWPSPSwitch(MRealParamSWPSPSwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MRealParamSWPSPSwitchCase</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MRealParamSWPSPSwitchCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParamSWPSPSwitchCase(MRealParamSWPSPSwitchCase object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>MParameterValueAssignment</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameterValueAssignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameterValueAssignment(MParameterValueAssignment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>MParameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMParameter(MParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MBoolean Parameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MBoolean Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMBooleanParameter(MBooleanParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MString Parameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MString Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMStringParameter(MStringParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MInteger Parameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MInteger Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMIntegerParameter(MIntegerParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MEnum Parameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MEnum Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMEnumParameter(MEnumParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MReal Parameter</em>'.
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MReal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMRealParameter(MRealParameter object) {
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