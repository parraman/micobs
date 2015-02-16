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
package es.uah.aut.srg.micobs.mesp.xtext;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.mesp.util.IMESPUtil;
import es.uah.aut.srg.micobs.mesp.util.IQResParameterAssignmentResolver;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.xtext.PDLAbstractJavaValidator;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;

/**
 * Generic MESP java validator for Xtext models. Includes checking functions
 * for the common MESP model elements.
 *
 */
public abstract class MESPAbstractJavaValidator extends PDLAbstractJavaValidator {
		
	@Inject
	protected IMESPUtil mesputil;
	
	/**
	 * Checks that the default amount of resource required by a software
	 * package for a given platform is within the limits of the resource.
	 * 
	 * @param demand the quantifiable resource demand.
	 * @param platform the platform.
	 */
	void checkQuantifiableResourceDemand(final MQuantifiableResourceDemand demand, 
			final MPlatform platform)
	{
		IQResParameterAssignmentResolver resolver = new IQResParameterAssignmentResolver() {

				@Override
				public MParameter getParameter() {
					return null;
				}

				@Override
				public MParameterValueExpression getAssignmentExpression(
						MParameter parameter) {
					return null;
				}

				@Override
				public MPlatform getPlatform() {
					return platform;
				}

				@Override
				public MQuantifiableResource getResource() {
					return demand.getResource();
				}

				@Override
				public Long getSumDemands(MQuantifiableResource resource) {
					return new Long(0);
				}

			};
		
		Long value;
		
		try {
			value = util.parseIntegerExpression(demand.getResourceValue(), resolver);
		} catch (NumberFormatException e)
		{
			error("Error in the demand expression of quantifiable resource " +
					MICOBSStringHelper.getInstance().getFullObjectNameToElement(demand.getResource()) + 
					": " + e.getMessage(), demand,
					mespswpPackage.eINSTANCE.getMQuantifiableResourceDemand_ResourceValue(), -1);
			return;
		}  catch (IllegalArgumentException e)
		{
			error("Error in the demand expression of quantifiable resource " +
					MICOBSStringHelper.getInstance().getFullObjectNameToElement(demand.getResource()) + 
					": " + e.getMessage(), demand,
					mespswpPackage.eINSTANCE.getMQuantifiableResourceDemand_ResourceValue(), -1);
			return;
		}
		
		Long lowerBound, upperBound;
		
		try {
			lowerBound = util.parseIntegerExpression(demand.getResource().getLowerBound(), resolver);
			upperBound = util.parseIntegerExpression(demand.getResource().getUpperBound(), resolver);
		} catch (NumberFormatException e)
		{
			error("Error in the bound expressions of quantifiable resource " +
					MICOBSStringHelper.getInstance().getFullObjectNameToElement(demand.getResource()) + 
					": " + e.getMessage(), demand,
					mespswpPackage.eINSTANCE.getMQuantifiableResourceDemand_ResourceValue(), -1);
			return;
		}  catch (IllegalArgumentException e)
		{
			error("Error in the bound expressions of quantifiable resource " +
					MICOBSStringHelper.getInstance().getFullObjectNameToElement(demand.getResource()) + 
					": " + e.getMessage(), demand,
					mespswpPackage.eINSTANCE.getMQuantifiableResourceDemand_ResourceValue(), -1);
			return;
		}
		
		if (value != 0 && value < lowerBound)
		{					
			error("The demand of quantifiable resource " + 
				  MICOBSStringHelper.getInstance().getFullObjectNameToElement(demand.getResource()) +
				  " is below the lower limit (" + value +
					" < " + lowerBound + ")", demand,
					mespswpPackage.eINSTANCE.getMQuantifiableResourceDemand_ResourceValue(), -1);
			return;
		}
		else if (upperBound != -1 && value > upperBound)
		{
			error("The demand of quantifiable resource " + 
					  MICOBSStringHelper.getInstance().getFullObjectNameToElement(demand.getResource()) +
					  " is above the upper limit (" + value +
						" > " + upperBound + ")", demand,
						mespswpPackage.eINSTANCE.getMQuantifiableResourceDemand_ResourceValue(), -1);
			return;
		}

	}
		
	/**
	 * Checks that there are no duplicated demands on the same quantifiable
	 * resource inside the demanded resources list of a software package.
	 * 
	 * @param swp the software package required interface to check.
	 */
	@Check
	public void checkMSwPackageRequiredInterface_DuplicatedResourceDemand(MSwPackageRequiredInterface riface)
	{
		Set<MProvidedResource> resources = new HashSet<MProvidedResource>();
		Set<String> names = new HashSet<String>();
		
		for (Iterator<MResourceDemand> d = riface.getResourceDemands().iterator(); d.hasNext(); )
		{
			MResourceDemand dres = d.next();
			
			if (dres instanceof MQuantifiableResourceDemand)
			{
				MQuantifiableResourceDemand qres = (MQuantifiableResourceDemand)dres;
				if (resources.add(qres.getResource()) == false)
				{
					error("Duplicated resource demand " + qres.getResource().getName(), 
						mespswpPackage.eINSTANCE.getMSwPackageRequiredInterface_ResourceDemands());	
				}
				if (riface.eContainer() instanceof MSwPackage)
				{
					checkQuantifiableResourceDemand(qres, null);
				}
				else if (riface.eContainer() instanceof MSwPackageSupportedPlatform)
				{
					MPlatform plt = mesputil.toPlatform((MSwPackageSupportedPlatform) riface.eContainer());
					checkQuantifiableResourceDemand(qres, plt);
				}
				else if (riface.eContainer() instanceof MMESPDeployment)
				{
					MMESPDeployment dep = (MMESPDeployment) riface.eContainer();
					for (MMESPDeploymentPlatform dplt : dep.getDeploymentPlatforms())
					{
						checkQuantifiableResourceDemand(qres, dplt.getPlatform());
					}
				}
				else if (riface.eContainer() instanceof MMESPDeploymentAlternative)
				{
					MMESPDeploymentAlternative dalt = (MMESPDeploymentAlternative) riface.eContainer();
					for (MMESPDeploymentPlatform dplt : dalt.getDeploymentPlatforms())
					{
						checkQuantifiableResourceDemand(qres, dplt.getPlatform());
					}
				}
			}
			else
			{
				MInstantiableResourceDemand ird = (MInstantiableResourceDemand)dres;
				if (names.add(ird.getName()) == false)
				{
					error("Duplicated resource demand name: " + ird.getName(),
						  ird, commonPackage.eINSTANCE.getMCommonReferenceableObj_Name(), -1);
				}
			}
		}
	}
	
	/**
	 * Checks that there are no duplicated parameters name on an
	 * instantiable resource definition.
	 * @param ires The instantiable resource to check.
	 */
	@Check
	void checkMInstantiableResource_DuplicatedNames(MInstantiableResource ires)
	{
		Set<String> names = new HashSet<String>();
		int i = 0;
		for (MParameter literal : ires.getParameters())
		{
			if (names.add(literal.getName()) == false)
			{
				error("Duplicated parameter name: " + 
				      literal.getName(),
				      mespcommonPackage.eINSTANCE.getMInstantiableResource_Parameters(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that the upper and lower bounds of a quantifiable resource are
	 * correctly defined.
	 * 
	 * @param qres the quantifiable resource to check.
	 */
	@Check
	void checkMQuantifiableResource_bounds(MQuantifiableResource qres)
	{
		Long lowerBound, upperBound;
		
		try {
			lowerBound = util.parseIntegerExpression(qres.getLowerBound(), Collections.<MParameterValueAssignment> emptySet());
		} catch (NumberFormatException e)
		{
			error(e.getMessage(),
					mespcommonPackage.eINSTANCE.getMQuantifiableResource_LowerBound());
			return;
		}  catch (IllegalArgumentException e)
		{
			error(e.getMessage(),
					mespcommonPackage.eINSTANCE.getMQuantifiableResource_LowerBound());
			return;
		}
		
		try {
			upperBound = util.parseIntegerExpression(qres.getUpperBound(), Collections.<MParameterValueAssignment> emptySet());
		} catch (NumberFormatException e)
		{
			error(e.getMessage(),
					mespcommonPackage.eINSTANCE.getMQuantifiableResource_UpperBound());
			return;
		}  catch (IllegalArgumentException e)
		{
			error(e.getMessage(),
					mespcommonPackage.eINSTANCE.getMQuantifiableResource_UpperBound());
			return;
		}
		
		if (lowerBound <= 0)
		{
			error("The lower bound must always be greater than zero",
					mespcommonPackage.eINSTANCE.getMQuantifiableResource_LowerBound());
		}
		
		if (upperBound != -1 &&
			upperBound < lowerBound)
		{
			error("The upper bound must be greater than or equal to the lower bound",
					mespcommonPackage.eINSTANCE.getMQuantifiableResource_UpperBound());
		}
	}
		
}
