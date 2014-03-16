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
package es.uah.aut.srg.micobs.mesp.lang.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployedDevice;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.mesp.util.IQResParameterAssignmentResolver;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPStringHelper;
import es.uah.aut.srg.micobs.mesp.xtext.MESPAbstractJavaValidator;
import es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice;
import es.uah.aut.srg.micobs.pdl.MDevice;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

public class DEPJavaValidator extends MESPAbstractJavaValidator {
	
	@Override
	public ILibraryManager getFileLibraryManager()
			throws LibraryManagerException {
		return MESPLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(MESPLibraryManager.getLibraryManager());
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		return importLibraries;
	}	
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mesp/mespdep"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mesp/mespcommon"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/pdl"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/common"));
		return result;
	}
	
	/**
	 * Checks that there are no packages deployed twice at the root level.
	 * @param deployment the deployment model to check.
	 */
	@Check
	public void checkMMESPSwPackageDeployment_DuplicatedSwPackageDeployment(MMESPDeployment deployment)
	{
		Set<MSwPackage> packs = new HashSet<MSwPackage>();
		
		int i = 0;
		
		for (MMESPSwPackageDeployment swp : deployment.getDeployedSwPackages())
		{
			if (packs.add(swp.getSwPackage()) == false)
			{
				error("Duplicated software package deployment: " + MESPStringHelper.getDefault().getElementName(swp.getSwPackage()),
					  deployment, mespdepPackage.eINSTANCE.getMMESPDeployment_DeployedSwPackages(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no packages deployed twice on an alternative.
	 * @param alternative the alternative to check.
	 */
	@Check
	public void checkMMESPDeploymentAlternative_DuplicatedSwPackageDeployment(MMESPDeploymentAlternative alternative)
	{
		Set<MSwPackage> packs = new HashSet<MSwPackage>();
		
		int i = 0;
		
		for (MMESPSwPackageDeployment swp : alternative.getDeployedSwPackages())
		{
			if (packs.add(swp.getSwPackage()) == false)
			{
				error("Duplicated software package deployment: " + MESPStringHelper.getDefault().getElementName(swp.getSwPackage()),
					  alternative, mespdepPackage.eINSTANCE.getMMESPDeploymentAlternative_DeployedSwPackages(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that all the extended packages are deployed.
	 * @param deployment the deployment model to check.
	 */
	@Check
	public void checkMMESPDeployment_ExtendedPackages(MMESPDeployment deployment)
	{
		if (deployment.getDeploymentAlternatives().isEmpty() == true)
		{
			checkExtendedPackages(deployment.getDeployedSwPackages());
		}
		else
		{
			for (MMESPDeploymentAlternative alternative : mesputil.getLeafDeploymentAlternatives(deployment))
			{
				checkExtendedPackages(mesputil.getAllDeployedSwPackagesFromAlternative(alternative));
			}
		}
	}
	
	/**
	 * Helper function to check that all the packages extended by the ones
	 * of the given collection are also present in the collection.
	 * @param deployedSwPackages the collection of software packages.
	 */
	protected void checkExtendedPackages(Collection<MMESPSwPackageDeployment> deployedSwPackages)
	{
		Set<MSwPackage> swps = new HashSet<MSwPackage>();
		
		for (MMESPSwPackageDeployment swpd : deployedSwPackages)
		{
			swps.add(swpd.getSwPackage());
		}
		for (MMESPSwPackageDeployment swpd : deployedSwPackages)
		{
			for (MSwPackage extended : mesputil.getAllExtendedSwPackages(swpd.getSwPackage()))
			{
				if (swps.contains(extended) == false)
				{
					error("Software package " + MESPStringHelper.getDefault().getElementName(extended) +
						  ", extended by package " + MESPStringHelper.getDefault().getElementName(swpd.getSwPackage()) + 
						  ", is not being deployed", 
						  swpd, mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_SwPackage(), -1);
				}
			}
		}
	}
	
	/**
	 * Checks that there are not two deployment platforms with the same name.
	 * Implements Restriction 261.
	 * @param deployment The deployment model to check.
	 */
	@Check
	public void checkMMESPDeployment_DuplicatedPlatformName(MMESPDeployment deployment)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		
		for (MMESPDeploymentPlatform platform : deployment.getDeploymentPlatforms())
		{
			if (names.add(StringHelper.toLowerDefString(platform.getName())) == false)
			{
				error("Duplicated deployment platform name: " + platform.getName(),
					  deployment, mespdepPackage.eINSTANCE.getMMESPDeployment_DeploymentPlatforms(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that the selected platform software package of a deployment
	 * platform is attached to the selected platform.
	 * @param platform the deployment platform to check.
	 */
	@Check
	public void checkMMESPDeploymentPlatform_PSWPIsAttachedToPlatform(MMESPDeploymentPlatform platform)
	{
		if (platform.getPlatform() != null && 
			platform.getPlatform().eIsProxy() == false &&
			platform.getPlatformSwPackage() != null &&
			platform.getPlatformSwPackage().eIsProxy() == false &&
			platform.getPlatformSwPackage().getReferencedElement() != platform.getPlatform())
		{
			error("The selected platform software package " +
				  MESPStringHelper.getDefault().getElementName(platform.getPlatformSwPackage()) +
				  "is not attached to the platform " +
				  MESPStringHelper.getDefault().getElementName(platform.getPlatform()),
				  mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_PlatformSwPackage());
		}
	}
	
	/**
	 * Checks that there are not two alternatives with the same name within
	 * a deployment model.
	 * @param deployment the deployment model to check.
	 */
	@Check
	public void checkMMESPDeployment_DuplicatedAlternativesName(MMESPDeployment deployment)
	{
		Set<String> names = new HashSet<String>();
		int i = 0;
		
		for (MMESPDeploymentAlternative alt : deployment.getDeploymentAlternatives())
		{
			if (names.add(StringHelper.toLowerDefString(alt.getName())) == false)
			{
				error("Duplicated alternative name: " + alt.getName(),
					  deployment, mespdepPackage.eINSTANCE.getMMESPDeployment_DeploymentAlternatives(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are not two alternatives with the same name within
	 * a deployment alternative.
	 * @param alternative the deployment alternative to check.
	 */
	@Check
	public void checkMMESPDeploymentAlternative_DuplicatedAlternativesName(MMESPDeploymentAlternative alternative)
	{
		Set<String> names = new HashSet<String>();
		int i = 0;
		
		for (MMESPDeploymentAlternative alt : alternative.getDeploymentAlternatives())
		{
			if (names.add(StringHelper.toLowerDefString(alt.getName())) == false)
			{
				error("Duplicated alternative name: " + alt.getName(),
					  alternative, mespdepPackage.eINSTANCE.getMMESPDeploymentAlternative_DeploymentAlternatives(), i);
			}
			i++;
		}
	}
		
	/**
	 * Checks that there are no duplicated assignments on the same parameter
	 * within a configured deployment platform and that no constant parameter is being
	 * assigned.
	 * @param dplt the configured deployment platform to check.
	 */
	@Check
	public void checkMMESPDeploymentPlatform_ParameterAssignment(MMESPDeploymentPlatform dplt)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		int i = 0;
		
		for (MParameterValueAssignment va : dplt.getParameterValueAssignments())
		{
			if (va.getParameter() == null || 
				va.getParameter().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (params.add(va.getParameter()) == false)
			{
				error("Duplicated assignment on the same parameter: " + va.getParameter().getName(),
					  dplt, mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_ParameterValueAssignments(), i);
			}
			if (va.getParameter().isConstant())
			{
				error("Parameter " + va.getParameter().getName() + " is constant and cannot be assigned a value",
					  dplt, mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_ParameterValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated assignments on the same parameter
	 * within a deployed software package and that no constant parameter is being
	 * assigned.
	 * @param swpd the deployed software package.
	 */
	@Check
	public void checkMMESPSwPackageDeployment_ParameterAssignments(MMESPSwPackageDeployment swpd)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		int i = 0;
		
		for (MParameterValueAssignment va : swpd.getParameterValueAssignments())
		{
			if (va.getParameter() == null || 
				va.getParameter().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (va.getParameter().isConstant())
			{
				error("Parameter " + va.getParameter().getName() + " is constant and cannot be assigned a value",
						  swpd, mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_ParameterValueAssignments(), i);				
				i++;
				continue;
			}
			if (params.add(va.getParameter()) == false)
			{
				error("Duplicated assignment on the same parameter: " + va.getParameter().getName(),
					  swpd, mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_ParameterValueAssignments(), i);
				i++;
				continue;
			}
			i++;
		}
	}
	
	
	/**
	 * Checks that every software package supports the assigned deployment
	 * platforms in each case.
	 * @param deployment the deployment model to check.
	 */
	@Check
	public void checkMMESPDeployment_CheckSupportedPlatforms(MMESPDeployment deployment)
	{
		if (deployment.getDeploymentAlternatives().isEmpty() == true)
		{
			checkSupportedPlatforms(deployment.getDeployedSwPackages());
		}
		else
		{
			for (MMESPDeploymentAlternative alternative : mesputil.getLeafDeploymentAlternatives(deployment))
			{
				checkSupportedPlatforms(mesputil.getAllDeployedSwPackagesFromAlternative(alternative));
			}
		}
	}

	/**
	 * Checks that every element of a set of deployed software packages
	 * supports its assigned deployment platforms. This function is not part
	 * of the checking interface, it is only a helper function.
	 * @param deployedSwPackages the set of deployed software packages to
	 * 	      check.
	 */
	protected void checkSupportedPlatforms(Collection<MMESPSwPackageDeployment> deployedSwPackages)
	{		
		for (MMESPSwPackageDeployment dswp : deployedSwPackages)
		{
			if (dswp.getSwPackage() == null ||
				dswp.getSwPackage().eIsProxy() == true)
			{
				continue;
			}
			Set<MMESPDeploymentPlatform> deploymentPlatforms = new HashSet<MMESPDeploymentPlatform>();
			if (dswp.eContainer() instanceof MMESPDeployment)
			{
				MMESPDeployment dep = (MMESPDeployment) dswp.eContainer();
				deploymentPlatforms.addAll(dep.getDeploymentPlatforms());
			}
			else
			{
				deploymentPlatforms.addAll(((MMESPDeploymentAlternative)dswp.eContainer()).getDeploymentPlatforms());
			}

			for (MMESPDeploymentPlatform dplt : deploymentPlatforms)
			{
				if (mesputil.supportsPlatform(dswp.getSwPackage(), dplt.getPlatform()) == false)
				{
					error("Software package does not support platform: " +
						  MESPStringHelper.getDefault().getElementName(dplt.getPlatform()), dswp,
						  mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_SwPackage(), -1);
				}
			}
		}
	}
	
	/**
	 * Checks that every software interface provided by the deployed
	 * software packages is provided only once and that every required
	 * interface is provided by a software package.
	 * @param deployment the deployment model to check.
	 */
	@Check
	public void checkMMESPDeployment_CheckSwInterfaces(MMESPDeployment deployment)
	{ 
		if (deployment.getDeploymentAlternatives().isEmpty() == true)
		{
			Set<MSwInterface> pswis = checkSwInterfaces(deployment.getDeployedSwPackages(), null);
			
			for (MSwPackageRequiredInterface rswi : deployment.getRequires())
			{
				if (rswi.getInterface() != null &&
					rswi.getInterface().eIsProxy() == false &&
					rswi.getInterface() instanceof MSwInterface &&
					(pswis.contains(rswi.getInterface()) == false))
				{
					error("Required interface " +
						  MESPStringHelper.getDefault().getElementName(rswi.getInterface()) +
						  " is not being provided by any software package", rswi,
						  mespswpPackage.eINSTANCE.getMSwPackageRequiredInterface_Interface(), -1);
				}	
			}
		}
		else
		{
			for (MMESPDeploymentAlternative alternative : mesputil.getLeafDeploymentAlternatives(deployment))
			{
				Set<MSwInterface> pswis = checkSwInterfaces(mesputil.getAllDeployedSwPackagesFromAlternative(alternative), alternative);
				
				Map<MSwInterface, MSwPackageRequiredInterface> rswis = mesputil.getAllRequiredSwInterfacesMap(alternative);
				
				for (MSwInterface rswi : rswis.keySet())
				{
					if (pswis.contains(rswi) == false)
					{
						error("Required interface " +
							  MESPStringHelper.getDefault().getElementName(rswi) +
							  " is not being provided by any software package", rswis.get(rswi),
							  mespswpPackage.eINSTANCE.getMSwPackageRequiredInterface_Interface(), -1);
					}
				}
			}
		}
	}

	
	/**
	 * Checks that every software interface provided by the 
	 * software packages deployed for a given leaf deployment alternative
	 * is provided only once and that every required interface is provided
	 * by a software package.
	 * 
	 * The method returns the set of provided software interfaces.
	 * 
	 * This function is not part of the checking interface, it is only a
	 * helper function.
	 * 
	 * @param deployedSwPackages the set of deployed software packages to
	 * 	      check.
	 * @param leafDeploymentAlternative the leaf deployment alternative.
	 * @return the set of provided interfaces.
	 */
	protected Set<MSwInterface> checkSwInterfaces(Collection<MMESPSwPackageDeployment> deployedSwPackages, MMESPDeploymentAlternative leafDeploymentAlternative)
	{
		Set<MSwInterface> providedInterfaces = new HashSet<MSwInterface>();
		
		for (MMESPSwPackageDeployment swpd : deployedSwPackages)
		{
			for (MSwInterface swi : mesputil.getAllEffectivelyProvidedSwInterfaces(swpd.getSwPackage()))
			{
				if (providedInterfaces.add(swi) == false)
				{
					error("Provided interface " + MESPStringHelper.getDefault().getElementName(swi) +
						  "conflicts with another software package", swpd,
						  mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_SwPackage(), -1);
				}
			}
		}

		for (MMESPSwPackageDeployment swpd : deployedSwPackages)
		{
			if (swpd.eContainer() instanceof MMESPDeploymentAlternative)
			{
				// We have to check that all the interfaces required by the
				// package for every one of the platforms are provided.
				
				for (MMESPDeploymentPlatform dplt : leafDeploymentAlternative.getDeploymentPlatforms())
				{
					for (MSwInterface swi : mesputil.getAllRequiredSwInterfaces(swpd.getSwPackage(), dplt.getPlatform()))
					{
						if (providedInterfaces.contains(swi) == false)
						{
							error("Required interface " + MESPStringHelper.getDefault().getElementName(swi) +
									" is not being provided by any software package", swpd,
									mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_SwPackage(), -1);
						}						
					}
				}
			}
			else
			{
				MMESPDeployment dep = (MMESPDeployment)swpd.eContainer();
				
				Collection<MMESPDeploymentPlatform> platforms = null;
				
				if (leafDeploymentAlternative == null)
				{
					platforms = dep.getDeploymentPlatforms();
				}
				else
				{
					platforms = leafDeploymentAlternative.getDeploymentPlatforms();
				}
					
				for (MMESPDeploymentPlatform dplt : platforms)
				{
					for (MSwInterface swi : mesputil.getAllRequiredSwInterfaces(swpd.getSwPackage(), dplt.getPlatform()))
					{
						if (providedInterfaces.contains(swi) == false)
						{
							error("Required interface " + MESPStringHelper.getDefault().getElementName(swi) +
									" is not being provided by any software package", swpd,
									mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_SwPackage(), -1);
						}						
					}
				}						

			}
		}
		
		return providedInterfaces;
		

	}
	
	/**
	 * Checks that all the quantifiable resource demands defined by a software
	 * package are within the limits of the resource.
	 * 
	 * @param deployment the root of the deployment model.
	 * @param alternative the selected leaf deployment alternative or
	 *        <code>null</code> if no alternative is defined/selected and the
	 *        package is being deployed on the model root.
	 * @param dplt the deployment platform on which the package is deployed.
	 * @param swpdep the deployed software package.
	 * @param assignments map with all the assignments to the different parameters.
	 */
	void checkQuantifiableResourceDemand(final MMESPDeployment deployment,
			final MMESPDeploymentAlternative alternative, 
			final MMESPDeploymentPlatform dplt,
			final MMESPSwPackageDeployment swpdep, 
			final Map<MParameter, MParameterValueAssignment> assignments)
	{
		
		for (final MQuantifiableResourceDemand demand : 
				mesputil.getQuantifiableResourceDemands(swpdep.getSwPackage(), dplt.getPlatform()))
		{
			IQResParameterAssignmentResolver resolver = new IQResParameterAssignmentResolver() {

				@Override
				public MParameter getParameter() {
					return null;
				}

				@Override
				public MParameterValueExpression getAssignmentExpression(
						MParameter parameter) {
					return (assignments.get(parameter) == null) ? null : 
						pdlutil.getParameterValue(assignments.get(parameter), dplt.getPlatform());
				}

				@Override
				public MPlatform getPlatform() {
					return dplt.getPlatform();
				}

				@Override
				public MQuantifiableResource getResource() {
					return demand.getResource();
				}

				@Override
				public Long getSumDemands(MQuantifiableResource resource) {
					return (alternative == null ) ? 
							mesputil.getSumDemands(deployment, dplt, resource) :
							mesputil.getSumDemands(alternative, dplt, resource);
				}
			};
			
			Long value;
			
			try {
				value = util.parseIntegerExpression(demand.getResourceValue(), resolver);
			} catch (NumberFormatException e)
			{
				error("Error in the demand expression of quantifiable resource " +
						MICOBSStringHelper.getInstance().getFullObjectNameToElement(demand.getResource()) + 
						": " + e.getMessage(), swpdep,
						mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_SwPackage(), -1);
				break;
			}  catch (IllegalArgumentException e)
			{
				error("Error in the demand expression of quantifiable resource " +
						MICOBSStringHelper.getInstance().getFullObjectNameToElement(demand.getResource()) + 
						": " + e.getMessage(), swpdep,
						mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_SwPackage(), -1);
				break;
			}
			
			Long lowerBound, upperBound;
			
			try {
				lowerBound = util.parseIntegerExpression(demand.getResource().getLowerBound(), resolver);
				upperBound = util.parseIntegerExpression(demand.getResource().getUpperBound(), resolver);
			} catch (NumberFormatException e)
			{
				error("Error in the bound expressions of quantifiable resource " +
						MICOBSStringHelper.getInstance().getFullObjectNameToElement(demand.getResource()) + 
						": " + e.getMessage(), swpdep,
						mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_SwPackage(), -1);
				break;
			}  catch (IllegalArgumentException e)
			{
				error("Error in the bound expressions of quantifiable resource " +
						MICOBSStringHelper.getInstance().getFullObjectNameToElement(demand.getResource()) + 
						": " + e.getMessage(), swpdep,
						mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_SwPackage(), -1);
				break;
			}
			
			if (value != 0 && value < lowerBound)
			{					
				error("The demand of quantifiable resource " + 
					  MICOBSStringHelper.getInstance().getFullObjectNameToElement(demand.getResource()) +
					  " is below the lower limit (" + value +
						" < " + lowerBound + ")", swpdep,
						mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_SwPackage(), -1);
				break;
			}
			else if (upperBound != -1 && value > upperBound)
			{
				error("The demand of quantifiable resource " + 
						  MICOBSStringHelper.getInstance().getFullObjectNameToElement(demand.getResource()) +
						  " is above the upper limit (" + value +
							" > " + upperBound + ")", swpdep,
							mespdepPackage.eINSTANCE.getMMESPSwPackageDeployment_SwPackage(), -1);
				break;
			}
		}
	}
	
	/**
	 * Checks the values assigned to the parameters of all the software
	 * packages plus the ones belonging to the different deployment
	 * platforms.
	 * 
	 * @param dswp the deployment model to check.
	 */
	@Check
	public void checkMMESPDeployment_ValueAssignments(MMESPDeployment dep)
	{
		if (dep.getDeploymentAlternatives() == null ||
			dep.getDeploymentAlternatives().isEmpty())
		{
			// There are no alternatives, so we must obtain the parameter
			// values assigned to all the packages for all the platforms
			
			for (MMESPDeploymentPlatform dplt : dep.getDeploymentPlatforms())
			{
				Map<MParameter, MParameterValueAssignment> assignments = new HashMap<MParameter, MParameterValueAssignment>();
				
				for (MMESPSwPackageDeployment swpdep : dep.getDeployedSwPackages())
				{
					// We have to obtain the value assignments
					assignments.putAll(mesputil.getMapAllParameterValueAssignments(swpdep, null));
					
					for (MParameterValueAssignment pva : dplt.getParameterValueAssignments())
					{
						assignments.put(pva.getParameter(), pva);
					}
					checkParameterValueAssignments(assignments, dplt.getPlatform());
					checkQuantifiableResourceDemand(dep, null, dplt, swpdep, assignments);
				}

			}
		}
		else
		{
			for (MMESPDeploymentAlternative ldalt : mesputil.getLeafDeploymentAlternatives(dep))
			{	
				for (MMESPDeploymentPlatform dplt : ldalt.getDeploymentPlatforms())
				{
					Map<MParameter, MParameterValueAssignment> assignments = new HashMap<MParameter, MParameterValueAssignment>();

					for (MMESPSwPackageDeployment swpdep : mesputil.getAllDeployedSwPackagesFromAlternative(ldalt))
					{
						// We have to obtain the value assignments
						assignments.putAll(mesputil.getMapAllParameterValueAssignments(swpdep, null));
						
						for (MParameterValueAssignment pva : dplt.getParameterValueAssignments())
						{
							assignments.put(pva.getParameter(), pva);
						}
						checkParameterValueAssignments(assignments, dplt.getPlatform());
						checkQuantifiableResourceDemand(dep, ldalt, dplt, swpdep, assignments);
					}
				}
			}
		}		
	}
	
	/**
	 * Checks that there are not two deployed devices with the same name for a
	 * give deployment platform.
	 *  
	 * @param dplt the deployment platform to check.
	 */
	@Check
	public void checkMMESPDeploymentPlatform_dupplicatedDeployedDeviceNames(MMESPDeploymentPlatform dplt)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		
		for (MMESPDeployedDevice depdev : dplt.getDeployedDevices())
		{
			if (names.add(StringHelper.toLowerDefString(depdev.getName())) == false)
			{
				error("Duplicated deployed device name: " + depdev.getName(),
						dplt, mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_DeployedDevices(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks the values assigned to the parameters of a deployment platform.
	 * This parameters may have dependencies on other parameters.
	 * @param dplt the deployed software package to check.
	 */
	@Check
	public void checkMMESPDeploymentPlatform_deployedDevices(MMESPDeploymentPlatform dplt)
	{
		if (dplt.getPlatform() == null ||
			dplt.getPlatform().eIsProxy() == true)
		{
			return;
		}
		
		if (dplt.getPlatform().getBoard() == null &&
			dplt.getDeployedDevices().isEmpty() == false)
		{
			error("No devices can be deployed on a platform without a defined board",
				  mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_DeployedDevices());
			return;
		}
		
		Map<MDevice, Integer> timesMap = new HashMap<MDevice, Integer>();
		
		for (MMESPDeployedDevice depdev : dplt.getDeployedDevices())
		{
			if (depdev.getDevice() == null ||
				depdev.getDevice().eIsProxy() == true)
			{
				continue;
			}
			MDevice device = depdev.getDevice();
			
			Integer time = timesMap.get(device);
			if (time == null)
			{
				time = new Integer(1);
				timesMap.put(device, time);
			}
			else
			{
				time++;
				timesMap.put(device, time);
			}
		}
		for (MDevice device : timesMap.keySet())
		{
			MBoardSupportedDevice supportedDevice = pdlutil.getBoardSupportedDevice(dplt.getPlatform().getBoard(), device);
			if (supportedDevice == null)
			{
				error("Device " + MESPStringHelper.getDefault().getFullElementName(device) +
					" is not supported by the board " +
					MESPStringHelper.getDefault().getFullElementName(dplt.getPlatform().getBoard()),
					mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_DeployedDevices());
				continue;
			}
			
			Long upperBound;
			
			try {
				upperBound = util.parseIntegerExpression(supportedDevice.getUpperBound(), dplt.getParameterValueAssignments());
			} catch (NumberFormatException e)
			{
				error(e.getMessage(),
						mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_DeployedDevices());
				return;
			}  catch (IllegalArgumentException e)
			{
				error(e.getMessage(),
						mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_DeployedDevices());
				return;
			}
			if (upperBound != -1 &&
				timesMap.get(device) > upperBound)
			{
				error("Maximum limit of devices " + 
						MESPStringHelper.getDefault().getFullElementName(device) +
						" (" + upperBound + ") exceeded for the board " +
						MESPStringHelper.getDefault().getFullElementName(dplt.getPlatform().getBoard()),
						mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_DeployedDevices());
			}
		}
		
		for (MBoardSupportedDevice supportedDevice : dplt.getPlatform().getBoard().getSupportedDevices())
		{
			Long lowerBound;
			
			try {
				lowerBound = util.parseIntegerExpression(supportedDevice.getLowerBound(), dplt.getParameterValueAssignments());
			} catch (NumberFormatException e)
			{
				error(e.getMessage(),
						mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_DeployedDevices());
				return;
			}  catch (IllegalArgumentException e)
			{
				error(e.getMessage(),
						mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_DeployedDevices());
				return;
			}
			if (lowerBound == 0)
			{
				continue;
			}
			if (timesMap.get(supportedDevice.getDevice()) < lowerBound)
			{
				error("At least " + lowerBound + " devices " + 
						MESPStringHelper.getDefault().getFullElementName(supportedDevice.getDevice()) +
						" must be deployed",
						mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_DeployedDevices());
			}
		}
	}
	
	@Check
	public void checkMMESPDriverSwPackageDeployment_deviceMappings(MMESPDriverSwPackageDeployment drvdep)
	{
		if (drvdep.getSwPackage() == null &&
			drvdep.getSwPackage().eIsProxy() == true)
		{
			return;
		}
		
		Map<MDriverSwPackageSupportedDevice, Set<MMESPDeployedDevice>> devmap = new HashMap<MDriverSwPackageSupportedDevice, Set<MMESPDeployedDevice>>();
		
		for (MMESPDeviceDriverMapping map : drvdep.getDeviceDriverMappings())
		{
			if (map.getSupportedDevice() == null ||
				map.getSupportedDevice().eIsProxy() == true ||
				map.getDeployedDevice() == null ||
				map.getDeployedDevice().eIsProxy() == true ||
				map.getDeployedDevice().getDevice() == null ||
				map.getDeployedDevice().getDevice().eIsProxy() == true)
			{
				continue;
			}
			if (map.getSupportedDevice().getDevice() != 
				map.getDeployedDevice().getDevice())
			{
				error("Supported device " +
						MESPStringHelper.getDefault().getElementName(map.getSupportedDevice().getDevice()) +
						" does not match with deployed device " +
						MESPStringHelper.getDefault().getElementName(map.getDeployedDevice().getDevice()),
						map, mespdepPackage.eINSTANCE.getMMESPDeviceDriverMapping_SupportedDevice(), -1);
			}
			MMESPDeploymentPlatform dplt = (MMESPDeploymentPlatform) map.getDeployedDevice().eContainer();
			MDriverSwPackageSupportedPlatform swpsp = (MDriverSwPackageSupportedPlatform) map.getSupportedDevice().eContainer();
			
			if (dplt.getPlatform() != null &&
				dplt.getPlatform().eIsProxy() == false &&
				mesputil.matchesPlatform(swpsp, dplt.getPlatform()) == false)
			{
				error("The supported platform " +
						MESPStringHelper.getDefault().getRelativeObjectName(swpsp) +
						" does not match with deployment platform " +
						MESPStringHelper.getDefault().getElementName(dplt.getPlatform()),
						map, mespdepPackage.eINSTANCE.getMMESPDeviceDriverMapping_SupportedDevice(), -1);
			}
			
			if (devmap.get(map.getSupportedDevice()) == null)
			{
				devmap.put(map.getSupportedDevice(), new HashSet<MMESPDeployedDevice>());
			}
			else 
			{
				for (MMESPDeployedDevice depdev : devmap.get(map.getSupportedDevice()))
				{
					if (depdev == map.getDeployedDevice())
					{
						error("Duplicated mapping on deployed device: " +
								MESPStringHelper.getDefault().getRelativeObjectName(map.getDeployedDevice()),
								map, mespdepPackage.eINSTANCE.getMMESPDeviceDriverMapping_DeployedDevice(), -1);
					}
					else if (depdev.eContainer() == map.getDeployedDevice().eContainer())
					{
						error("Duplicated mapping on supported device for the same deployment platform: " +
								MESPStringHelper.getDefault().getRelativeObjectName(map.getDeployedDevice()),
								map, mespdepPackage.eINSTANCE.getMMESPDeviceDriverMapping_DeployedDevice(), -1);
					}
				}
			}
			devmap.get(map.getSupportedDevice()).add(map.getDeployedDevice());
		}
		
		Set<MMESPDeploymentPlatform> dplts = new HashSet<MMESPDeploymentPlatform>();
		
		if (drvdep.eContainer() instanceof MMESPDeployment)
		{
			MMESPDeployment dep = (MMESPDeployment) drvdep.eContainer();
			dplts.addAll(dep.getDeploymentPlatforms());
		}
		else
		{
			MMESPDeploymentAlternative alt = (MMESPDeploymentAlternative)drvdep.eContainer();
			dplts.addAll(alt.getDeploymentPlatforms());
		}
		
		for (MMESPDeploymentPlatform dplt : dplts)
		{
			if (dplt.getPlatform() == null || dplt.getPlatform().eIsProxy() == true)
			{
				continue;
			}
			
			MDriverSwPackageSupportedPlatform drvsp = (MDriverSwPackageSupportedPlatform) mesputil.getMatchingPlatform(drvdep.getSwPackage(), dplt.getPlatform());
			
			if (drvsp == null)
			{
				continue;
			}

			for (MDriverSwPackageSupportedDevice supportedDevice : drvsp.getSupportedDevices())
			{
				Boolean required;
				
				try {
					required = util.parseBooleanExpression(supportedDevice.getRequired(), drvdep.getParameterValueAssignments());
				} catch (NumberFormatException e)
				{
					error(e.getMessage(),
							mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_DeployedDevices());
					return;
				}  catch (IllegalArgumentException e)
				{
					error(e.getMessage(),
							mespdepPackage.eINSTANCE.getMMESPDeploymentPlatform_DeployedDevices());
					return;
				}
				
				if (required == false)
				{
					continue;
				}
				boolean found = false;
				
				for (MMESPDeployedDevice depdev : devmap.get(supportedDevice))
				{
					if (depdev.eContainer() == dplt)
					{
						found = true;
						break;
					}
				}
				
				if (!found)
				{
					error("No mapping has been defined to the required supported device " +
							MESPStringHelper.getDefault().getRelativeObjectName(supportedDevice),
							mespdepPackage.eINSTANCE.getMMESPDriverSwPackageDeployment_DeviceDriverMappings());
				}
				
 			}
		}

	}

}
