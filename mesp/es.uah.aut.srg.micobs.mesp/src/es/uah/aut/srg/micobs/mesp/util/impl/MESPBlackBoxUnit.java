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
package es.uah.aut.srg.micobs.mesp.util.impl;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MEnumParameterLiteral;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.system.MLanguage;


/**
 * QVT and Xpand black box unit with MESP functions.
 *
 */

public class MESPBlackBoxUnit {
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static MParameterValueExpression getParameterValue(MParameterValueAssignment assignment, MPlatform platform)
	{
		return MESPUtil.getDefault().getParameterValue(assignment, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Boolean matchesPlatform(MOSSupportedPlatform supportedPlatform, MPlatform platform)
	{
		return MESPUtil.getDefault().matchesPlatform(supportedPlatform, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameterValueAssignment> getAllParameterValueAssignments(MOperatingSystem os, MOperatingSystemAPI osapi)
	{
		return MESPUtil.getDefault().getAllParameterValueAssignments(os, osapi);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameterValueAssignment> getAllParameterValueAssignments(MOperatingSystem os)
	{
		return MESPUtil.getDefault().getAllParameterValueAssignments(os);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MCompiler> getExtendedCompilers(MCompiler compiler)
	{
		return MESPUtil.getDefault().getExtendedCompilers(compiler);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MArchitecture> getExtendedArchitectures(MArchitecture arch)
	{
		return MESPUtil.getDefault().getExtendedArchitectures(arch);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MOperatingSystemAPI> getAllSupportedOSAPIs(MOperatingSystem os)
	{
		return MESPUtil.getDefault().getAllSupportedOSAPIs(os);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MOperatingSystem> getInheritedOperatingSystems(MOperatingSystem os)
	{
		return MESPUtil.getDefault().getInheritedOperatingSystems(os);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MOperatingSystemAPI> getInheritedOSAPIs(MOperatingSystemAPI osapi)
	{
		return MESPUtil.getDefault().getInheritedOSAPIs(osapi);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameter> getParameters(MPlatform platform)
	{
		return MESPUtil.getDefault().getParameters(platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameter> getParameters(MBoard board)
	{
		return MESPUtil.getDefault().getParameters(board);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameter> getParameters(MMicroprocessor mp)
	{
		return MESPUtil.getDefault().getParameters(mp);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameter> getAllParameters(MOperatingSystem os, MPlatform platform)
	{
		return MESPUtil.getDefault().getAllParameters(os, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameter> getAllParameters(MArchitecture arch)
	{
		return MESPUtil.getDefault().getAllParameters(arch);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameter> getAllParameters(MCompiler compiler, MArchitecture arch)
	{
		return MESPUtil.getDefault().getAllParameters(compiler, arch);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MCompiler compiler, MArchitecture arch)
	{
		return MESPUtil.getDefault().getAllEnumParameterDefinitions(compiler, arch);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MArchitecture arch)
	{
		return MESPUtil.getDefault().getAllEnumParameterDefinitions(arch);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MOperatingSystem os)
	{
		return MESPUtil.getDefault().getAllEnumParameterDefinitions(os);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Boolean parseBooleanExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments, MPlatform platform)
	{
		return MESPUtil.getDefault().parseBooleanExpression(self, assignments, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String parseStringExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments, MPlatform platform)
	{
		return MESPUtil.getDefault().parseStringExpression(self, assignments, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Long parseIntegerExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments, MPlatform platform)
	{
		return MESPUtil.getDefault().parseIntegerExpression(self, assignments, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Float parseRealExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments, MPlatform platform)
	{
		return MESPUtil.getDefault().parseRealExpression(self, assignments, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static MEnumParameterLiteral parseEnumExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments, MPlatform platform)
	{
		return MESPUtil.getDefault().parseEnumExpression(self, assignments, platform);
	}

	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MParameterValueAssignment copy(MParameterValueAssignment src)
	{
		return EcoreUtil.copy(src);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MLanguage getLanguage(String uri, String version)
	{
		return MESPUtil.getDefault().getLanguage(uri, version);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getElementName(MCommonPackageElement element)
	{
		return MESPStringHelper.getDefault().getElementName(element);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getFullObjectNameToElement(MCommonReferenceableObj object)
	{
		return MESPStringHelper.getDefault().getFullObjectNameToElement(object);
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getRelativeObjectName(MCommonReferenceableObj object)
	{
		return MESPStringHelper.getDefault().getRelativeObjectName(object);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toDefString(String string)
	{
		return MESPStringHelper.getDefault().toDefString(string);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toLowerDefString(String string)
	{
		return MESPStringHelper.getDefault().toLowerDefString(string);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static String toUpperDefString(String string)
	{
		return MESPStringHelper.getDefault().toUpperDefString(string);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String toPlainString(Float val)
	{
		return MESPStringHelper.getDefault().toPlainString(val);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String getFullObjectNameToElementWithoutVersion(MCommonReferenceableObj object)
	{
		return MESPStringHelper.getDefault().getFullObjectNameToElementWithoutVersion(object);
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public String getSumDemands(MMESPDeployment deployment, MMESPDeploymentPlatform dplt, MQuantifiableResource resource)
	{
		return MESPUtil.getDefault().getSumDemands(deployment, dplt, resource).toString();
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public String getSumDemands(MMESPDeploymentAlternative alternative, MMESPDeploymentPlatform dplt, MQuantifiableResource resource)
	{
		return MESPUtil.getDefault().getSumDemands(alternative, dplt, resource).toString();
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public MPlatformSwPackage getPlatformSwPackage(MPlatform platform)
	{
		return MESPUtil.getDefault().getPlatformSwPackage(platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MMESPSwPackageDeployment> getAllDeployedSwPackagesFromAlternative(MMESPDeploymentAlternative alternative)
	{
		return MESPUtil.getDefault().getAllDeployedSwPackagesFromAlternative(alternative);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MMESPDeploymentAlternative> getLeafDeploymentAlternatives(
			MMESPDeploymentAlternative alternative)

	{
		return MESPUtil.getDefault().getLeafDeploymentAlternatives(alternative);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MMESPDeploymentAlternative> getLeafDeploymentAlternatives(
			MMESPDeployment deployment)

	{
		return MESPUtil.getDefault().getLeafDeploymentAlternatives(deployment);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public boolean matchesPlatform(MSwPackageSupportedPlatform supportedPlatform,
			MPlatform platform)
	{
		return MESPUtil.getDefault().matchesPlatform(supportedPlatform, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public MSwPackageSupportedPlatform getMatchingPlatform(MSwPackage swp,
			MPlatform platform) {
		return MESPUtil.getDefault().getMatchingPlatform(swp, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MQuantifiableResourceDemand> getQuantifiableResourceDemands(MSwPackage swp, MPlatform platform) {
		return MESPUtil.getDefault().getQuantifiableResourceDemands(swp, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MSwInterface> getAllProvidedSwInterfaces(
			MMESPDeploymentAlternative alternative) 
	{
		return MESPUtil.getDefault().getAllProvidedSwInterfaces(alternative);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MSwInterface> getProvidedSwInterfaces(
			MMESPDeployment deployment) 
	{
		return MESPUtil.getDefault().getProvidedSwInterfaces(deployment);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MSwInterface> getAllProvidedSwInterfaces(
			MAbstractSwPackage aswp) 
	{
		return MESPUtil.getDefault().getAllProvidedSwInterfaces(aswp);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MSwInterface> getAllEffectivelyProvidedSwInterfaces(
			MSwPackage swp)
	{
		return MESPUtil.getDefault().getAllEffectivelyProvidedSwInterfaces(swp);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MInstantiableResourceDemand> getInstantiableResourceDemands(
			MSwPackage swp, MPlatform platform)
	{
		return MESPUtil.getDefault().getInstantiableResourceDemands(swp, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MQuantifiableResource> getAllQuantifiableResources(MOSSwInterface osswi)
	{
		return MESPUtil.getDefault().getAllQuantifiableResources(osswi);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MQuantifiableResource> getAllQuantifiableResources(MSwInterface swi)
	{
		return MESPUtil.getDefault().getAllQuantifiableResources(swi);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MParameter> getAllParameters(MSwPackage swp, MPlatform platform)
	{
		return MESPUtil.getDefault().getAllParameters(swp, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MAbstractSwPackage aswp)
	{
		return MESPUtil.getDefault().getAllEnumParameterDefinitions(aswp);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(MMESPSwPackageDeployment swpd)
	{
		return MESPUtil.getDefault().getAllParameterValueAssignments(swpd);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MMESPDeviceDriverMapping> getAllDriverMappings(MMESPDriverSwPackageDeployment swpd)
	{
		return MESPUtil.getDefault().getAllDriverMappings(swpd);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(MAbstractSwPackage swp, MSwInterface swi)
	{
		return MESPUtil.getDefault().getAllParameterValueAssignments(swp, swi);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(MAbstractSwPackage swp)
	{
		return MESPUtil.getDefault().getAllParameterValueAssignments(swp);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MParameterValueAssignment> getAllSwPackageParameterValueAssignments(MMESPDeployment deployment,
			MMESPDeploymentAlternative alternative)
	{
		return MESPUtil.getDefault().getAllSwPackageParameterValueAssignments(deployment, alternative);
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public MOSSwInterface getOSSwInterface(MOperatingSystemAPI osapi)
	{
		return MESPUtil.getDefault().getOSSwInterface(osapi);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public MParameterValueExpression getDefaultValue(MParameter parameter, MPlatform platform)
	{
		return MESPUtil.getDefault().getDefaultValue(parameter, platform);
	}
}
