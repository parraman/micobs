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
package es.uah.aut.srg.micobs.mesp.lang.scoping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.scoping.IScope;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.mesp.xtext.MESPElementAbstractScopeProvider;
import es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;

/**
 * This class contains custom scoping description.
 * 
 */
public class DEPScopeProvider extends MESPElementAbstractScopeProvider {
	
	/**
	 * Provides the scope for the deployed devices that can be mapped to
	 * a particular driver software package.
	 * 
	 * @param drvDep the deployed driver software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MMESPDeployedDevice(MMESPDriverSwPackageDeployment drvDep, EReference reference)
	{
		Collection<MMESPDeploymentPlatform> dplts = null;
		
		if (drvDep.eContainer() instanceof MMESPDeployment)
		{
			// It is deployed at the model root
			dplts = ((MMESPDeployment)drvDep.eContainer()).getDeploymentPlatforms();
		}
		else
		{
			// It is deployed at an alternative
			dplts = ((MMESPDeploymentAlternative)drvDep.eContainer()).getDeploymentPlatforms();
		}
		
		Set<MMESPDeployedDevice> ddevices = new HashSet<MMESPDeployedDevice>();
		
		for (MMESPDeploymentPlatform dplt : dplts)
		{
			ddevices.addAll(dplt.getDeployedDevices());
		}
		return getRelativeObjectScope(ddevices);
	}
	
	/**
	 * Provides the scope for the supported devices of a given
	 * driver software package.
	 * 
	 * @param drvDep the deployed driver software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MDriverSwPackageSupportedDevice(MMESPDriverSwPackageDeployment drvDep, EReference reference)
	{
		if (drvDep.getSwPackage() == null ||
			drvDep.getSwPackage().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		Set<MDriverSwPackageSupportedDevice> sdevices = new HashSet<MDriverSwPackageSupportedDevice>();
		
		for (MSwPackageSupportedPlatform swpsp : drvDep.getSwPackage().getSupportedPlatforms())
		{
			MDriverSwPackageSupportedPlatform drvsp = (MDriverSwPackageSupportedPlatform)swpsp;
			
			sdevices.addAll(drvsp.getSupportedDevices());
		}
		return getRelativeObjectScope(sdevices);
	}
	
	/**
	 * Provides the scope for the elements than can be referenced when
	 * assigning a new value to a parameter
	 * @param assignment the configuration parameter.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(MParameterValueAssignment assignment, EReference reference)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		if (assignment.eContainer() instanceof MMESPSwPackageDeployment)
		{
			MMESPSwPackageDeployment swpd = (MMESPSwPackageDeployment)assignment.eContainer();
			
			if (swpd.getSwPackage() != null &&
				swpd.getSwPackage().eIsProxy() == false)
			{
				MSwPackage swp = swpd.getSwPackage();
				
				Set<MMESPDeploymentPlatform> dplts = new HashSet<MMESPDeploymentPlatform>();
				
				if (swpd.eContainer() instanceof MMESPDeployment)
				{
					// We are in the root, the list of platforms is the whole:
					MMESPDeployment dep = (MMESPDeployment)swpd.eContainer();
					dplts.addAll(dep.getDeploymentPlatforms());
				}
				else
				{
					MMESPDeploymentAlternative alt = (MMESPDeploymentAlternative)swpd.eContainer();
					dplts.addAll(alt.getDeploymentPlatforms());
				}
							
				params.addAll(mesputil.getAllParameters(swp));

				for (MSwPackageSupportedPlatform swrsp : swp.getSupportedPlatforms())
				{
					for (MMESPDeploymentPlatform dplt : dplts)
					{
						if (dplt.getPlatform() != null &&
							dplt.getPlatform().eIsProxy() == false &&
							mesputil.matchesPlatform(swrsp, dplt.getPlatform()))
						{
							params.addAll(swrsp.getParameters());
						}
					}
				}
			}
			
		}
		else if (assignment.eContainer() instanceof MInstantiableResourceDemand)
		{
			MInstantiableResourceDemand dires = (MInstantiableResourceDemand)assignment.eContainer();
			MSwPackageRequiredInterface riface = (MSwPackageRequiredInterface) dires.eContainer();
			
			params.addAll(mesputil.getParameters(dires.getResource()));
			
			if (riface.getInterface() instanceof MSwInterface)
			{
				params.addAll(mesputil.getAllParameters((MSwInterface)riface.getInterface()));
			}
			else
			{
				MOSSwInterface osswi = (MOSSwInterface)riface.getInterface();
				params.addAll(pdlutil.getAllParameters((MOperatingSystemAPI) osswi.getReferencedElement()));
			}
		}
		else if (assignment.eContainer() instanceof MMESPDeploymentPlatform)
		{
			MMESPDeploymentPlatform dplt = (MMESPDeploymentPlatform)assignment.eContainer();
			
			if (dplt.getPlatform() != null &&
				dplt.getPlatform().eIsProxy() == false)
			{
				params.addAll(pdlutil.getAllParameters(dplt.getPlatform()));
			}
			
		}
		else if (assignment.eContainer() instanceof MMESPDeployedDevice)
		{
			MMESPDeployedDevice depdev = (MMESPDeployedDevice) assignment.eContainer();
			
			if (depdev.getDevice() != null &&
				depdev.getDevice().eIsProxy() == false)
			{
				params.addAll(pdlutil.getParameters(depdev.getDevice()));
			}
			
			MMESPDeploymentPlatform dplt = (MMESPDeploymentPlatform)depdev.eContainer();
			
			if (dplt.getPlatform() != null &&
				dplt.getPlatform().eIsProxy() == false)
			{
				params.addAll(pdlutil.getAllParameters(dplt.getPlatform()));
			}
			
		}
		
		if (assignment.getParameter() != null &&
			assignment.getParameter().eIsProxy() == false)
		{
			params.remove(assignment.getParameter());
				
			IScope outerScope = getFullObjectScope(params);
		
			if (assignment.getParameter() instanceof MEnumParameter)
			{
				// Then we have to return the literals
				MEnumParameter param = (MEnumParameter)assignment.getParameter();
				if (param.getEnumDefinition() != null &&
					param.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), outerScope);
				}
			}
			else if (assignment.getParameter() instanceof MEnumParamOSSPSwitch)
			{
				// Then we have to return the literals
				MEnumParamOSSPSwitch param = (MEnumParamOSSPSwitch)assignment.getParameter();
				if (param.getEnumDefinition() != null &&
					param.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), outerScope);
				}
			}
			else if (assignment.getParameter() instanceof MEnumParamSWPSPSwitch)
			{
				// Then we have to return the literals
				MEnumParamSWPSPSwitch param = (MEnumParamSWPSPSwitch)assignment.getParameter();
				if (param.getEnumDefinition() != null &&
					param.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), outerScope);
				}
			}
		}
			
		return getFullObjectScope(params);

	}
	
	/**
	 * Provides the scope for the deployment platforms that can be attached
	 * to a given deployment alternative.
	 * @param alternative the deployment alternative.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MMESPDeploymentPlatform(final MMESPDeploymentAlternative alternative, EReference reference)
	{
		List<MMESPDeploymentPlatform> dps = null;
		if (alternative.eContainer() instanceof MMESPDeployment)
		{
			// We are in the root, the list of platforms is the whole:
			MMESPDeployment deployment = ((MMESPDeployment)alternative.eContainer());
			dps = deployment.getDeploymentPlatforms();
		}
		else
		{
			dps = ((MMESPDeploymentAlternative)alternative.eContainer()).getDeploymentPlatforms();
		}
		
		return getSimpleObjectScope(dps);
	}
	
	
	/**
	 * Provides the scope for the parameters of a deployment platform.
	 * @param dplt the deployment platform.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MMESPDeploymentPlatform dplt, EReference reference)
	{
		if (dplt.getPlatform() == null ||
			dplt.getPlatform().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		Set<MParameter> outer = pdlutil.getAllParameters(dplt.getPlatform().getOs());
		outer.addAll(pdlutil.getParameters(pdlutil.getMatchingPlatform(dplt.getPlatform().getOs(), dplt.getPlatform())));
		outer.addAll(pdlutil.getAllParameters(dplt.getPlatform().getArchitecture()));
		outer.addAll(pdlutil.getAllParameters(dplt.getPlatform().getCompiler(),
				dplt.getPlatform().getArchitecture()));
		
		if (dplt.getPlatform().getMicroprocessor() != null)
		{
			outer.addAll(pdlutil.getParameters(dplt.getPlatform().getMicroprocessor()));
		}
		if (dplt.getPlatform().getBoard() != null)
		{
			outer.addAll(pdlutil.getParameters(dplt.getPlatform().getBoard()));
		}
		
		IScope parentScope = getFullObjectScope(outer);
		
		return getSimpleObjectScope(pdlutil.getParameters(dplt.getPlatform()), parentScope);
	}
	
	/**
	 * Provides the scope for the parameters of a deployed device.
	 * @param dplt the deployment platform.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MMESPDeployedDevice depdev, EReference reference)
	{
		if (depdev.getDevice() == null ||
			depdev.getDevice().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		return getSimpleObjectScope(pdlutil.getParameters(depdev.getDevice()));
	}
	
	/**
	 * Provides the scope for the parameters of a software package.
	 * @param dswp the object representing the deployment of the software
	 *        package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MMESPSwPackageDeployment dswp, EReference reference)
	{
		if (dswp.getSwPackage() == null ||
			dswp.getSwPackage().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		MSwPackage swp = dswp.getSwPackage();
		
		Set<MMESPDeploymentPlatform> dplts = new HashSet<MMESPDeploymentPlatform>();
		
		if (dswp.eContainer() instanceof MMESPDeployment)
		{
			// We are in the root, the list of platforms is the whole:
			MMESPDeployment dep = (MMESPDeployment)dswp.eContainer();
			dplts.addAll(dep.getDeploymentPlatforms());
		}
		else
		{
			MMESPDeploymentAlternative alt = (MMESPDeploymentAlternative)dswp.eContainer();
			dplts.addAll(alt.getDeploymentPlatforms());
		}
		
		Set<MParameter> outerParams = new HashSet<MParameter>();
		
		for (MAbstractSwPackage aswp : swp.getInherits())
		{
			outerParams.addAll(mesputil.getAllParameters(aswp));
		}
		
		IScope outerScope = getFullObjectScope(outerParams);
		
		Set<MParameter> innerParams = new HashSet<MParameter>();
		innerParams.addAll(mesputil.getParameters(swp));
		
		for (MMESPDeploymentPlatform dplt : dplts)
		{
			if (dplt.getPlatform() != null &&
				dplt.getPlatform().eIsProxy() == false)
			{
				MSwPackageSupportedPlatform swrsp = mesputil.getMatchingPlatform(swp, dplt.getPlatform());
				if (swrsp != null)
				{
					innerParams.addAll(mesputil.getParameters(swrsp));
				}
			}
		}
		
		return getRelativeObjectScope(innerParams, outerScope);
	}
	
	/**
	 * Provides the scope with the list of possible platform software packages
	 * to be deployed. This list is extracted from the packages included in the
	 * MESP package to which the model belongs plus the imported MESP
	 * packages.
	 * @param deployment the deployment model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MPlatformSwPackage(final MMESPDeployment deployment, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)deployment.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)deployment.eContainer()).getPackage();
		
		try {
			elements = MESPLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(MESPLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of possible platforms to be selected.
	 * This list is extracted from the PDL packages imported by the deployment
	 * model.
	 * @param deployment the deployment model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MPlatform(final MMESPDeployment deployment, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)deployment.eContainer()).getImports();
		
		try {
			elements = PDLLibraryManager.getLibraryManager().
						getElementsOfClass(imports, pdlPackage.eINSTANCE.getMPlatform());
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of devices that can be included in the
	 * definition of a software package. This list includes the devices present
	 * in the PDL packages imported by the software package.
	 * @param swp the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MDevice(final MMESPDeployment swp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)swp.eContainer()).getImports();
		
		try {
			elements = PDLLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of quantifiable resources defined
	 * by an interface that can be demanded by the main code.
	 * 
	 * @param riface the software interface requirement declaration.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MQuantifiableResourceDemand_resource(final MSwPackageRequiredInterface riface, EReference reference)
	{
		if (riface.getInterface() == null ||
			riface.getInterface().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		if (riface.getInterface() instanceof MSwInterface)
		{
			return getFullObjectScope(mesputil.getAllQuantifiableResources((MSwInterface)riface.getInterface()));
		}
		else if (riface.getInterface() instanceof MOSSwInterface)
		{
			return getFullObjectScope(mesputil.getAllQuantifiableResources((MOSSwInterface)riface.getInterface()));
		}
		else
		{
			return IScope.NULLSCOPE;
		}
		
	}

	/**
	 * Provides the scope with the list of instantiable resources defined
	 * by an interface that can be demanded by the main code.
	 * 
	 * @param riface the software interface requirement declaration.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInstantiableResourceDemand_resource(final MSwPackageRequiredInterface riface, EReference reference)
	{
		if (riface.getInterface() == null ||
			riface.getInterface().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
			
		if (riface.getInterface() instanceof MSwInterface)
		{
			return getFullObjectScope(mesputil.getAllInstantiableResources((MSwInterface)riface.getInterface()));
		}
		else if (riface.getInterface() instanceof MOSSwInterface)
		{
			return getFullObjectScope(mesputil.getAllInstantiableResources((MOSSwInterface)riface.getInterface()));
		}
		else
		{
			return IScope.NULLSCOPE;
		}
	}
	
	/**
	 * Provides the interfaces that can be required by the main code in
	 * the root of a deployment model.
	 * 
	 * @param deployment the deployment model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSwPackageRequiredInterface_interface(final MMESPDeployment deployment, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		List<MCommonPackage> imports = ((MCommonPackageFile)deployment.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)deployment.eContainer()).getPackage();
		
		try {
			elements = MESPLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mespswiPackage.eINSTANCE.getMSwInterface());
			elements.addAll(MESPLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mespswiPackage.eINSTANCE.getMSwInterface()));
			
			Set<MOperatingSystemAPI> osapis = new HashSet<MOperatingSystemAPI>();
			for (MMESPDeploymentPlatform dplt : deployment.getDeploymentPlatforms())
			{
				if (dplt.getPlatform() != null &&
					dplt.getPlatform().eIsProxy() == false &&
					osapis.add(dplt.getPlatform().getOsapi()) == true &&
					MESPLibraryManager.getLibraryManager().getReferencingElement(
					dplt.getPlatform().getOsapi(), mesposswiPackage.eINSTANCE.getMOSSwInterface()) != null)
				{
					elements.add(MESPLibraryManager.getLibraryManager().getReferencingElement(
							dplt.getPlatform().getOsapi(), mesposswiPackage.eINSTANCE.getMOSSwInterface()));
				}
			}

		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the interfaces that can be required by the main code in
	 * a given deployment alternative.
	 * 
	 * @param deployment the deployment model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSwPackageRequiredInterface_interface(final MMESPDeploymentAlternative alternative, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		List<MCommonPackage> imports = ((MCommonPackageFile)alternative.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)alternative.eContainer()).getPackage();
		
		try {
			elements = MESPLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mespswiPackage.eINSTANCE.getMSwInterface());
			elements.addAll(MESPLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mespswiPackage.eINSTANCE.getMSwInterface()));

			Set<MOperatingSystemAPI> osapis = new HashSet<MOperatingSystemAPI>();
			for (MMESPDeploymentPlatform dplt : alternative.getDeploymentPlatforms())
			{
				if (dplt.getPlatform() != null &&
					dplt.getPlatform().eIsProxy() == false &&
					osapis.add(dplt.getPlatform().getOsapi()) == true &&
					MESPLibraryManager.getLibraryManager().getReferencingElement(
					dplt.getPlatform().getOsapi(), mesposswiPackage.eINSTANCE.getMOSSwInterface()) != null)
				{
					elements.add(MESPLibraryManager.getLibraryManager().getReferencingElement(
							dplt.getPlatform().getOsapi(), mesposswiPackage.eINSTANCE.getMOSSwInterface()));
				}
			}
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of possible software packages
	 * to be deployed. This list is extracted from the packages included in the
	 * MESP package to which the model belongs plus the imported MESP
	 * packages.
	 * @param deployment the deployment model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSwPackage(final MMESPDeployment deployment, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)deployment.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)deployment.eContainer()).getPackage();
		
		try {
			elements = MESPLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(MESPLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of possible driver software packages
	 * to be deployed. This list is extracted from the packages included in the
	 * MESP package to which the model belongs plus the imported MESP
	 * packages.
	 * @param deployment the deployment model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MMESPSwPackageDeployment_swPackage(final MMESPDriverSwPackageDeployment drvswpd, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		MCommonPackageFile packageFile = (MCommonPackageFile) EcoreUtil.getRootContainer(drvswpd);
		final List<MCommonPackage> imports = packageFile.getImports();
		final MCommonPackage elementPackage = packageFile.getPackage();
		
		try {
			elements = MESPLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mespswpPackage.eINSTANCE.getMDriverSwPackage());
			elements.addAll(MESPLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mespswpPackage.eINSTANCE.getMDriverSwPackage()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}


	@Override
	public ILibraryManager getFileLibraryManager()
			throws LibraryManagerException {
		return MESPLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		importLibraries.add(MESPLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		return importLibraries;
	}	
}
