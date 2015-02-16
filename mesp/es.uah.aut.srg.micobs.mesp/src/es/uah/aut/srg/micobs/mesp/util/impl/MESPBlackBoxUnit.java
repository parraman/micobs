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
		return MESPUtilProvider.getPDLUtil().getParameterValue(assignment, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Boolean matchesPlatform(MOSSupportedPlatform supportedPlatform, MPlatform platform)
	{
		return MESPUtilProvider.getPDLUtil().matchesPlatform(supportedPlatform, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameterValueAssignment> getAllParameterValueAssignments(MOperatingSystem os, MOperatingSystemAPI osapi)
	{
		return MESPUtilProvider.getPDLUtil().getAllParameterValueAssignments(os, osapi);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameterValueAssignment> getAllParameterValueAssignments(MOperatingSystem os)
	{
		return MESPUtilProvider.getPDLUtil().getAllParameterValueAssignments(os);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MCompiler> getExtendedCompilers(MCompiler compiler)
	{
		return MESPUtilProvider.getPDLUtil().getExtendedCompilers(compiler);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MArchitecture> getExtendedArchitectures(MArchitecture arch)
	{
		return MESPUtilProvider.getPDLUtil().getExtendedArchitectures(arch);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MOperatingSystemAPI> getAllSupportedOSAPIs(MOperatingSystem os)
	{
		return MESPUtilProvider.getPDLUtil().getAllSupportedOSAPIs(os);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MOperatingSystem> getInheritedOperatingSystems(MOperatingSystem os)
	{
		return MESPUtilProvider.getPDLUtil().getInheritedOperatingSystems(os);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MOperatingSystemAPI> getInheritedOSAPIs(MOperatingSystemAPI osapi)
	{
		return MESPUtilProvider.getPDLUtil().getInheritedOSAPIs(osapi);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameter> getParameters(MPlatform platform)
	{
		return MESPUtilProvider.getPDLUtil().getParameters(platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameter> getParameters(MBoard board)
	{
		return MESPUtilProvider.getPDLUtil().getParameters(board);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameter> getParameters(MMicroprocessor mp)
	{
		return MESPUtilProvider.getPDLUtil().getParameters(mp);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameter> getAllParameters(MOperatingSystem os, MPlatform platform)
	{
		return MESPUtilProvider.getPDLUtil().getAllParameters(os, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameter> getAllParameters(MArchitecture arch)
	{
		return MESPUtilProvider.getPDLUtil().getAllParameters(arch);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MParameter> getAllParameters(MCompiler compiler, MArchitecture arch)
	{
		return MESPUtilProvider.getPDLUtil().getAllParameters(compiler, arch);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MCompiler compiler, MArchitecture arch)
	{
		return MESPUtilProvider.getPDLUtil().getAllEnumParameterDefinitions(compiler, arch);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MArchitecture arch)
	{
		return MESPUtilProvider.getPDLUtil().getAllEnumParameterDefinitions(arch);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MOperatingSystem os)
	{
		return MESPUtilProvider.getPDLUtil().getAllEnumParameterDefinitions(os);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Boolean parseBooleanExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments, MPlatform platform)
	{
		return MESPUtilProvider.getPDLUtil().parseBooleanExpression(self, assignments, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static String parseStringExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments, MPlatform platform)
	{
		return MESPUtilProvider.getPDLUtil().parseStringExpression(self, assignments, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Long parseIntegerExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments, MPlatform platform)
	{
		return MESPUtilProvider.getPDLUtil().parseIntegerExpression(self, assignments, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static Float parseRealExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments, MPlatform platform)
	{
		return MESPUtilProvider.getPDLUtil().parseRealExpression(self, assignments, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public static MEnumParameterLiteral parseEnumExpression(final MParameterValueExpression self, Collection<MParameterValueAssignment> assignments, MPlatform platform)
	{
		return MESPUtilProvider.getPDLUtil().parseEnumExpression(self, assignments, platform);
	}

	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MParameterValueAssignment copy(MParameterValueAssignment src)
	{
		return EcoreUtil.copy(src);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)	
	public static MLanguage getLanguage(String uri, String version)
	{
		return MESPUtilProvider.getMICOBSUtil().getLanguage(uri, version);
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
		return MESPUtilProvider.getMESPUtil().getSumDemands(deployment, dplt, resource).toString();
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public String getSumDemands(MMESPDeploymentAlternative alternative, MMESPDeploymentPlatform dplt, MQuantifiableResource resource)
	{
		return MESPUtilProvider.getMESPUtil().getSumDemands(alternative, dplt, resource).toString();
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public MPlatformSwPackage getPlatformSwPackage(MPlatform platform)
	{
		return MESPUtilProvider.getMESPUtil().getPlatformSwPackage(platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MMESPSwPackageDeployment> getAllDeployedSwPackagesFromAlternative(MMESPDeploymentAlternative alternative)
	{
		return MESPUtilProvider.getMESPUtil().getAllDeployedSwPackagesFromAlternative(alternative);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MMESPDeploymentAlternative> getLeafDeploymentAlternatives(
			MMESPDeploymentAlternative alternative)

	{
		return MESPUtilProvider.getMESPUtil().getLeafDeploymentAlternatives(alternative);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MMESPDeploymentAlternative> getLeafDeploymentAlternatives(
			MMESPDeployment deployment)

	{
		return MESPUtilProvider.getMESPUtil().getLeafDeploymentAlternatives(deployment);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public boolean matchesPlatform(MSwPackageSupportedPlatform supportedPlatform,
			MPlatform platform)
	{
		return MESPUtilProvider.getMESPUtil().matchesPlatform(supportedPlatform, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public MSwPackageSupportedPlatform getMatchingPlatform(MSwPackage swp,
			MPlatform platform) {
		return MESPUtilProvider.getMESPUtil().getMatchingPlatform(swp, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MQuantifiableResourceDemand> getQuantifiableResourceDemands(MSwPackage swp, MPlatform platform) {
		return MESPUtilProvider.getMESPUtil().getQuantifiableResourceDemands(swp, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MSwInterface> getAllProvidedSwInterfaces(
			MMESPDeploymentAlternative alternative) 
	{
		return MESPUtilProvider.getMESPUtil().getAllProvidedSwInterfaces(alternative);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MSwInterface> getProvidedSwInterfaces(
			MMESPDeployment deployment) 
	{
		return MESPUtilProvider.getMESPUtil().getProvidedSwInterfaces(deployment);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MSwInterface> getAllProvidedSwInterfaces(
			MAbstractSwPackage aswp) 
	{
		return MESPUtilProvider.getMESPUtil().getAllProvidedSwInterfaces(aswp);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MSwInterface> getAllEffectivelyProvidedSwInterfaces(
			MSwPackage swp)
	{
		return MESPUtilProvider.getMESPUtil().getAllEffectivelyProvidedSwInterfaces(swp);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MInstantiableResourceDemand> getInstantiableResourceDemands(
			MSwPackage swp, MPlatform platform)
	{
		return MESPUtilProvider.getMESPUtil().getInstantiableResourceDemands(swp, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MQuantifiableResource> getAllQuantifiableResources(MOSSwInterface osswi)
	{
		return MESPUtilProvider.getMESPUtil().getAllQuantifiableResources(osswi);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MQuantifiableResource> getAllQuantifiableResources(MSwInterface swi)
	{
		return MESPUtilProvider.getMESPUtil().getAllQuantifiableResources(swi);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MParameter> getAllParameters(MSwPackage swp, MPlatform platform)
	{
		return MESPUtilProvider.getMESPUtil().getAllParameters(swp, platform);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MAbstractSwPackage aswp)
	{
		return MESPUtilProvider.getMESPUtil().getAllEnumParameterDefinitions(aswp);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(MMESPSwPackageDeployment swpd)
	{
		return MESPUtilProvider.getMESPUtil().getAllParameterValueAssignments(swpd);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MMESPDeviceDriverMapping> getAllDriverMappings(MMESPDriverSwPackageDeployment swpd)
	{
		return MESPUtilProvider.getMESPUtil().getAllDriverMappings(swpd);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(MAbstractSwPackage swp, MSwInterface swi)
	{
		return MESPUtilProvider.getMESPUtil().getAllParameterValueAssignments(swp, swi);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(MAbstractSwPackage swp)
	{
		return MESPUtilProvider.getMESPUtil().getAllParameterValueAssignments(swp);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public Set<MParameterValueAssignment> getAllSwPackageParameterValueAssignments(MMESPDeployment deployment,
			MMESPDeploymentAlternative alternative)
	{
		return MESPUtilProvider.getMESPUtil().getAllSwPackageParameterValueAssignments(deployment, alternative);
	}

	@Operation(contextual = true, kind = Kind.HELPER)
	public MOSSwInterface getOSSwInterface(MOperatingSystemAPI osapi)
	{
		return MESPUtilProvider.getMESPUtil().getOSSwInterface(osapi);
	}
	
	@Operation(contextual = true, kind = Kind.HELPER)
	public MParameterValueExpression getDefaultValue(MParameter parameter, MPlatform platform)
	{
		return MESPUtilProvider.getPDLUtil().getDefaultValue(parameter, platform);
	}
}
