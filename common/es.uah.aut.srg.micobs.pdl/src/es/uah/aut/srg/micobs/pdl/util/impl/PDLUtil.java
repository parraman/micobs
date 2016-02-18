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
package es.uah.aut.srg.micobs.pdl.util.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Issue;

import es.uah.aut.srg.micobs.common.MBooleanParameter;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MEnumParameterLiteral;
import es.uah.aut.srg.micobs.common.MIntegerParameter;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.common.MParameterValue;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.MParameterValueTERM;
import es.uah.aut.srg.micobs.common.MRealParameter;
import es.uah.aut.srg.micobs.common.MStringParameter;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MCompilerFrontend;
import es.uah.aut.srg.micobs.pdl.MDevice;
import es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MIntegerParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVA;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MRealParamOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.pdlFactory;
import es.uah.aut.srg.micobs.pdl.plugin.PDLPlugin;
import es.uah.aut.srg.micobs.pdl.util.IPDLUtil;
import es.uah.aut.srg.micobs.pdl.util.IPlatformParameterAssignmentResolver;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage;
import es.uah.aut.srg.micobs.util.IMICOBSUtil;
import es.uah.aut.srg.micobs.util.IParameterAssignmentResolver;
import es.uah.aut.srg.micobs.util.impl.MICOBSUtil;


/**
 * Platform models helper functions.
 *
 */
public class PDLUtil implements IMICOBSUtil, IPDLUtil {
	
	private IMICOBSUtil MICOBSUtil;
	
	public PDLUtil(IMICOBSUtil MICOBSUtil)
	{
		this.MICOBSUtil = MICOBSUtil;
	}
	
	private PDLUtil()
	{
		DefaultPDLMICOBSUtil MICOBSUtil = new DefaultPDLMICOBSUtil(this);
		this.MICOBSUtil = MICOBSUtil;
	}
	
	private static PDLUtil DEFAULT;
	
	/**
	 * Returns the default singleton instance of the PDL utils.
	 * @return the default singleton instance.
	 */
	public static PDLUtil getDefault() {
		if (DEFAULT == null)
		{
			DEFAULT = new PDLUtil();
		}
		return DEFAULT;
	}
	
	public static class DefaultPDLMICOBSUtil extends MICOBSUtil {
		
		protected IPDLUtil PDLUtil;
		
		public DefaultPDLMICOBSUtil(IPDLUtil PDLUtil) {
			super();
			this.PDLUtil = PDLUtil;
		}
		
		@Override
		public MEnumParameterLiteral parseEnumReferencedObject(
				MCommonReferenceableObj object,
				IParameterAssignmentResolver resolver) {
			
			if (object instanceof MEnumParameter)
			{
				MEnumParameter eparam = 
						(MEnumParameter) object;
				
				if (resolver != null && resolver instanceof IPlatformParameterAssignmentResolver)
				{
					if (eparam == resolver.getParameter())
					{
						throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
					}
					
					if (resolver.getAssignmentExpression(eparam) != null)
					{
						return parseEnumExpression(resolver.getAssignmentExpression(eparam), resolver);
					}
					
					if (PDLUtil.getDefaultValue(eparam, ((IPlatformParameterAssignmentResolver)resolver).getPlatform()) != null)
					{
						return parseEnumExpression(PDLUtil.getDefaultValue(eparam, ((IPlatformParameterAssignmentResolver)resolver).getPlatform()), resolver);
					}
					throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
				}		
			}
			return super.parseEnumReferencedObject(object, resolver);
		}

		@Override
		public Boolean parseBooleanReferencedObject(
				MCommonReferenceableObj object,
				IParameterAssignmentResolver resolver) {
			
			if (object instanceof MBooleanParameter)
			{
				MBooleanParameter bparam = 
						(MBooleanParameter) object;
				
				if (resolver != null && resolver instanceof IPlatformParameterAssignmentResolver)
				{
					if (bparam == resolver.getParameter())
					{
						throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
					}
					if (resolver.getAssignmentExpression(bparam) != null)
					{
						return parseBooleanExpression(resolver.getAssignmentExpression(bparam), resolver);
					}
					if (PDLUtil.getDefaultValue(bparam, ((IPlatformParameterAssignmentResolver)resolver).getPlatform()) != null)
					{
						return parseBooleanExpression(PDLUtil.getDefaultValue(bparam, ((IPlatformParameterAssignmentResolver)resolver).getPlatform()), resolver);
					}
					throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
				}		
			}
			return super.parseBooleanReferencedObject(object, resolver);
		}
		
		@Override
		public String parseStringReferencedObject(
				MCommonReferenceableObj object,
				IParameterAssignmentResolver resolver) {
			
			if (object instanceof MStringParameter)
			{
				MStringParameter sparam = 
						(MStringParameter) object;
				
				if (resolver != null && resolver instanceof IPlatformParameterAssignmentResolver)
				{
					if (sparam == resolver.getParameter())
					{
						throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
					}
					if (resolver.getAssignmentExpression(sparam) != null)
					{
						return parseStringExpression(resolver.getAssignmentExpression(sparam), resolver);
					}
					if (PDLUtil.getDefaultValue(sparam, ((IPlatformParameterAssignmentResolver)resolver).getPlatform()) != null)
					{
						return parseStringExpression(PDLUtil.getDefaultValue(sparam, ((IPlatformParameterAssignmentResolver)resolver).getPlatform()), resolver);
					}
					throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
				}
			}
			return super.parseStringReferencedObject(object, resolver);
		}

		@Override
		public Long parseIntegerReferencedObject(
				MCommonReferenceableObj object,
				IParameterAssignmentResolver resolver) {
			
			if (object instanceof MIntegerParameter)
			{
				MIntegerParameter iparam = 
						(MIntegerParameter) object;
				
				if (resolver != null && resolver instanceof IPlatformParameterAssignmentResolver)
				{
					if (iparam == resolver.getParameter())
					{
						throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
					}
					if (resolver.getAssignmentExpression(iparam) != null)
					{
						return parseIntegerExpression(resolver.getAssignmentExpression(iparam), resolver);
					}
					if (PDLUtil.getDefaultValue(iparam, ((IPlatformParameterAssignmentResolver)resolver).getPlatform()) != null)
					{
						return parseIntegerExpression(PDLUtil.getDefaultValue(iparam, ((IPlatformParameterAssignmentResolver)resolver).getPlatform()), resolver);
					}
					throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
				}
			}
			return super.parseIntegerReferencedObject(object, resolver);
		}
		
		@Override
		public Float parseRealReferencedObject(
				MCommonReferenceableObj object,
				IParameterAssignmentResolver resolver) {
			
			if (object instanceof MRealParameter)
			{
				MRealParameter rparam = 
						(MRealParameter) object;
				
				if (resolver != null && resolver instanceof IPlatformParameterAssignmentResolver)
				{
					if (rparam == resolver.getParameter())
					{
						throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_ParameterDefinitionLoop"));
					}
					if (resolver.getAssignmentExpression(rparam) != null)
					{
						return parseRealExpression(resolver.getAssignmentExpression(rparam), resolver);
					}
					if (PDLUtil.getDefaultValue(rparam, ((IPlatformParameterAssignmentResolver)resolver).getPlatform()) != null)
					{
						return parseRealExpression(PDLUtil.getDefaultValue(rparam, ((IPlatformParameterAssignmentResolver)resolver).getPlatform()), resolver);
					}
					throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
				}
			}
			return super.parseRealReferencedObject(object, resolver);
		}
		
		@Override
		public MParameterValueExpression getParameterValue(
				MParameterValueAssignment assignment) {
			if (assignment instanceof MOSSupportedOSAPIPVAExpression)
			{
				return ((MOSSupportedOSAPIPVAExpression)assignment).getParameterValue();
			}
			return super.getParameterValue(assignment);
		}
	};
	

	@Override
	public MParameterRange getRange(
			MParameter parameter, MPlatform platform) throws IllegalArgumentException
	{
		if (parameter instanceof MIntegerParamOSSPSwitch)
		{	
			for (MParameterOSSPSwitchCase c : ((MIntegerParamOSSPSwitch)parameter).getCases())
			{
				if (matchesPlatform(c.getPlatform(), platform))
				{
					return ((MIntegerParamOSSPSwitchCase)c).getRange();
				}
			}
			throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
		}
		else if (parameter instanceof MRealParamOSSPSwitch)
		{
			for (MParameterOSSPSwitchCase c : ((MRealParamOSSPSwitch)parameter).getCases())
			{
				if (matchesPlatform(c.getPlatform(), platform))
				{
					return ((MRealParamOSSPSwitchCase)c).getRange();
				}
			}
			throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
		}
		return MICOBSUtil.getRange(parameter);
	}
	
	@Override
	public MParameterValueExpression getDefaultValue(
			MParameter parameter, MPlatform platform) throws IllegalArgumentException {
		
		if (parameter instanceof MParameterOSSPSwitch)
		{
			for (MParameterOSSPSwitchCase c : ((MParameterOSSPSwitch)parameter).getCases())
			{
				if (matchesPlatform(c.getPlatform(), platform))
				{
					return c.getDefaultValue();
				}
			}
			throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
		}
		return MICOBSUtil.getDefaultValue(parameter);
	}

	
	@Override
	public MPlatform toPlatform(MOperatingSystemAPI osapi, MOperatingSystem os, MOSSupportedPlatform ossp)
	{
		MPlatform platform = pdlFactory.eINSTANCE.createMPlatform();
		platform.setOsapi(osapi);
		platform.setOs(os);
		platform.setArchitecture(ossp.getArchitecture());
		platform.setCompiler(ossp.getCompiler());
		platform.setMicroprocessor(ossp.getMicroprocessor());
		platform.setBoard(ossp.getBoard());
		return platform;
	}
	


	@Override
	public boolean platformIntersection(MOSSupportedPlatform ossp1,
			MOSSupportedPlatform ossp2)
	{
		if (ossp1.getArchitecture() != null && ossp2.getArchitecture() != null &&
			ossp1.getArchitecture() != ossp2.getArchitecture())
		{
			return false;
		}
		if (ossp1.getCompiler() != null && ossp2.getCompiler() != null &&
			ossp1.getCompiler() != ossp2.getCompiler())
		{
			return false;
		}
		if (ossp1.getMicroprocessor() != null && ossp2.getMicroprocessor() != null &&
			ossp1.getMicroprocessor() != ossp2.getMicroprocessor())
		{
			return false;
		}
		if (ossp1.getBoard() != null && ossp2.getBoard() != null &&
			ossp1.getBoard() != ossp2.getBoard())
		{
			return false;
		}
		return true;
	}
	
	@Override
	public boolean matchesPlatform(MOSSupportedPlatform supportedPlatform,
			MPlatform platform)
	{
		if (supportedPlatform.getArchitecture() != platform.getArchitecture() &&
			getExtendedArchitectures(platform.getArchitecture()).contains(supportedPlatform.getArchitecture()) == false)
		{
			return false;
		}
		if (supportedPlatform.getCompiler() != null &&
			platform.getCompiler() != null && // If the platform has been
			                                  // obtained from a supported
			                                  // platform, it might be null...
			supportedPlatform.getCompiler() != platform.getCompiler() &&
			getExtendedCompilers(platform.getCompiler()).contains(supportedPlatform.getCompiler()) == false)
		{
			return false;
		}
		if (supportedPlatform.getMicroprocessor() != null &&
			supportedPlatform.getMicroprocessor() != platform.getMicroprocessor())
		{
			return false;
		}
		if (supportedPlatform.getBoard() != null && 
			supportedPlatform.getBoard() != platform.getBoard())
		{
			return false;
		}
		return true;
	}
	
	@Override
	public boolean supportsPlatform(MOperatingSystem os,
			MPlatform platform) {
		
		for (MOSSupportedPlatform supportedPlatform : 
				os.getSupportedPlatforms())
		{
			if (matchesPlatform(supportedPlatform, platform))
			{
				return true;
			}
		}
		return false;
	}
	
	@Override
	public MOSSupportedPlatform getMatchingPlatform(MOperatingSystem os,
			MPlatform platform) {
		
		for (MOSSupportedPlatform supportedPlatform :
				os.getSupportedPlatforms())
		{
			if (matchesPlatform(supportedPlatform, platform))
			{
				return supportedPlatform;
			}
		}
		return null;
	}
	
	@Override
	public Set<MParameter> getAllParameters(MOperatingSystem os)
	{
		return getAllParameters(os, null);
	}
	
	@Override
	public Set<MParameter> getAllParameters(MOperatingSystemAPI osapi)
	{
		Set<MParameter> params = getParameters(osapi);
		
		for (MOperatingSystemAPI iosapi : osapi.getInherits())
		{
			params.addAll(getAllParameters(iosapi));
		}
		
		return params;
	}
	
	@Override
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(
			MOperatingSystem os, 
			MOperatingSystemAPI osapi)
	{
		Map<MParameter, MParameterValueAssignment> map = new HashMap<MParameter, MParameterValueAssignment>();
		
		for (MOperatingSystem parentOS : os.getInherits())
		{
			map.putAll(
					getMapAllParameterValueAssignments(parentOS, osapi));
		}
		for (MOSSupportedOSAPI sosapi : os.getSupportedOSAPIs())
		{
			if (sosapi.getOsapi() == osapi ||
				getInheritedOSAPIs(osapi).contains(osapi))
			{
				for (MOSSupportedOSAPIPVA pva : sosapi.getParameterValueAssignments())
				{
					if (pva instanceof MOSSupportedOSAPIPVAExpression)
					{
						map.put(pva.getParameter(), (MOSSupportedOSAPIPVAExpression) pva);
					}
				}
			}
		}
		return map;
		
	}
	
	@Override
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(
			MOperatingSystem os)
	{
		Map<MParameter, MParameterValueAssignment> map = new HashMap<MParameter, MParameterValueAssignment>();
		
		for (MOperatingSystem parentOS : os.getInherits())
		{
			map.putAll(
					getMapAllParameterValueAssignments(parentOS));
		}
		for (MOSSupportedOSAPI sosapi : os.getSupportedOSAPIs())
		{
			for (MOSSupportedOSAPIPVA pva : sosapi.getParameterValueAssignments())
			{
				if (pva instanceof MOSSupportedOSAPIPVAExpression)
				{
					map.put(pva.getParameter(), (MOSSupportedOSAPIPVAExpression) pva);
				}
			}
		}
		return map;
		
	}

	@Override
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(
			MOperatingSystem os, MOperatingSystemAPI osapi)
	{
		return new HashSet<MParameterValueAssignment>(getMapAllParameterValueAssignments(os, osapi).values());
	}
	
	@Override
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(
			MOperatingSystem os)
	{
		return new HashSet<MParameterValueAssignment>(getMapAllParameterValueAssignments(os).values());
	}
	
	@Override
	public Set<MParameter> getAllParameters(MOperatingSystem os, MPlatform platform)
	{
		Set<MParameter> params = getParameters(os);
		
		for (MOperatingSystem ios : os.getInherits())
		{
			params.addAll(getAllParameters(ios));
		}
		
		if (platform != null)
		{
			MOSSupportedPlatform ossp = getMatchingPlatform(os, platform);
			if (ossp != null)
			{
				params.addAll(ossp.getParameters());
			}
		}
		return params;
	}

	@Override
	public Set<MParameter> getParameters(MOperatingSystemAPI osapi)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter parameter : osapi.getParameters())
		{
			if (!(parameter instanceof MEnumParameterDefinition))
			{
				params.add(parameter);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getParameters(MDevice device)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter parameter : device.getParameters())
		{
			if (!(parameter instanceof MEnumParameterDefinition))
			{
				params.add(parameter);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getParameters(MArchitecture arch)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter parameter : arch.getParameters())
		{
			if (!(parameter instanceof MEnumParameterDefinition))
			{
				params.add(parameter);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAllParameters(MArchitecture arch)
	{
		Set<MParameter> params = getParameters(arch);
		
		for (MArchitecture eArch : arch.getExtends())
		{
			params.addAll(getAllParameters(eArch));
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getParameters(MMicroprocessor microprocessor)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter parameter : microprocessor.getParameters())
		{
			if (!(parameter instanceof MEnumParameterDefinition))
			{
				params.add(parameter);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getParameters(MBoard board)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter parameter : board.getParameters())
		{
			if (!(parameter instanceof MEnumParameterDefinition))
			{
				params.add(parameter);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getParameters(MCompilerFrontend frontend)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter parameter : frontend.getParameters())
		{
			if (!(parameter instanceof MEnumParameterDefinition))
			{
				params.add(parameter);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getParameters(MCompiler compiler)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter parameter : compiler.getParameters())
		{
			if (!(parameter instanceof MEnumParameterDefinition))
			{
				params.add(parameter);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAllParameters(MCompiler compiler, 
			MArchitecture arch)
	{
		Set<MParameter> params = getParameters(compiler);
		
		for (MCompiler extended : compiler.getExtends())
		{
			params.addAll(getAllParameters(extended, arch));
		}
		
		if (arch != null)
		{
			for (MCompilerFrontend frontend : compiler.getFrontends())
			{
				if (frontend.getArchitectures().contains(arch))
				{
					params.addAll(getParameters(frontend));
				}
			}
		}

		return params;
	}
	
	@Override
	public Set<MParameter> getAllParameters(MCompiler compiler)
	{
		return getAllParameters(compiler, null);
	}
	
	@Override
	public Set<MParameter> getParameters(MPlatform platform)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter parameter : platform.getParameters())
		{
			if (!(parameter instanceof MEnumParameterDefinition))
			{
				params.add(parameter);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAllParameters(MPlatform platform)
	{
		Set<MParameter> params = getAllParameters(platform.getOs());
		params.addAll(getParameters(getMatchingPlatform(platform.getOs(), platform)));
		params.addAll(getAllParameters(platform.getArchitecture()));
		params.addAll(getAllParameters(platform.getCompiler(), platform.getArchitecture()));
		if (platform.getMicroprocessor() != null)
		{
			params.addAll(getParameters(platform.getMicroprocessor()));
		}
		if (platform.getBoard() != null)
		{
			params.addAll(getParameters(platform.getBoard()));
		}
		params.addAll(getParameters(platform));
		return params;
	}
	
	@Override
	public Set<MParameter> getParameters(MOperatingSystem os)
	{
		Set<MParameter> params = new HashSet<MParameter>();

		for (MParameter parameter : os.getParameters())
		{
			if (!(parameter instanceof MEnumParameterDefinition))
			{
				params.add(parameter);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getParameters(MOSSupportedPlatform ossp)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter parameter : ossp.getParameters())
		{
			if (!(parameter instanceof MEnumParameterDefinition))
			{
				params.add(parameter);
			}
		}
		return params;	
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MPlatform platform) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : platform.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MOperatingSystem os) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : os.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MOperatingSystem os, 
			MPlatform platform) {
		
		Set<MEnumParameterDefinition> defs = getAllEnumParameterDefinitions(os);
		
		MOSSupportedPlatform ossp = getMatchingPlatform(os, platform);
		
		if (ossp != null)
		{
			defs.addAll(getEnumParameterDefinitions(ossp));
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MOperatingSystem os) {
		
		Set<MEnumParameterDefinition> defs = getEnumParameterDefinitions(os);

		for (MOperatingSystem ios : getInheritedOperatingSystems(os))
		{
			defs.addAll(getEnumParameterDefinitions(ios));
		}
		
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MOperatingSystemAPI osapi) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : osapi.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MDevice device) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : device.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MOperatingSystemAPI osapi) {
		
		Set<MEnumParameterDefinition> defs = getEnumParameterDefinitions(osapi);

		for (MOperatingSystemAPI iosapi : osapi.getInherits())
		{
			defs.addAll(getAllEnumParameterDefinitions(iosapi));
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MArchitecture arch) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : arch.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MCompiler compiler) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : compiler.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MCompilerFrontend frontend) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : frontend.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MCompiler compiler) {
		
		return getAllEnumParameterDefinitions(compiler, null);
	}
	
	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MCompiler compiler, 
			MArchitecture arch) {
		
		Set<MEnumParameterDefinition> defs = getEnumParameterDefinitions(compiler);
		
		for (MCompiler ecompiler : getExtendedCompilers(compiler))
		{
			defs.addAll(getAllEnumParameterDefinitions(ecompiler, arch));
		}
		
		if (arch != null)
		{
			for (MCompilerFrontend frontend : compiler.getFrontends())
			{
				if (frontend.getArchitectures().contains(arch) == true)
				{
					defs.addAll(getEnumParameterDefinitions(frontend));
				}
			}
		}

		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MArchitecture arch) {
		
		Set<MEnumParameterDefinition> defs = getEnumParameterDefinitions(arch);

		for (MArchitecture iosapi : arch.getExtends())
		{
			defs.addAll(getAllEnumParameterDefinitions(iosapi));
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MOSSupportedPlatform ossp) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : ossp.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MMicroprocessor mp) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : mp.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MBoard board) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : board.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
	
	@Override
	public Set<MOperatingSystemAPI> getInheritedOSAPIs(MOperatingSystemAPI osapi) {
		
		Set<MOperatingSystemAPI> parentOSAPIs = new HashSet<MOperatingSystemAPI>();
		
		for (MOperatingSystemAPI parent : osapi.getInherits())
		{
			parentOSAPIs.add(parent);
			parentOSAPIs.addAll(getInheritedOSAPIs(parent));
		}
		return parentOSAPIs;
	}
	
	@Override
	public Set<MOperatingSystem> getInheritedOperatingSystems(MOperatingSystem os) {
		
		Set<MOperatingSystem> oss = new HashSet<MOperatingSystem>();
		
		for (MOperatingSystem parent : os.getInherits())
		{
			oss.add(parent);
			oss.addAll(getInheritedOperatingSystems(parent));
		}
		return oss;
		
	}
	
	@Override
	public Set<MCompiler> getExtendedCompilers(MCompiler compiler) {
		
		Set<MCompiler> compilers = new HashSet<MCompiler>();
		
		for (MCompiler parent : compiler.getExtends())
		{
			compilers.add(parent);
			compilers.addAll(getExtendedCompilers(parent));
		}
		return compilers;
		
	}
	
	@Override
	public Set<MArchitecture> getExtendedArchitectures(MArchitecture architecture) {
		
		Set<MArchitecture> architectures = new HashSet<MArchitecture>();
		
		for (MArchitecture parent : architecture.getExtends())
		{
			architectures.add(parent);
			architectures.addAll(getExtendedArchitectures(parent));
		}
		return architectures;
		
	}
	
	@Override
	public boolean supportsLanguageForArchitecture(MCompiler compiler, MLanguage lang,
			MArchitecture architecture) {
		
		for (MCompilerFrontend frontend : compiler.getFrontends())
		{
			if (frontend.getLanguage() == lang &&
				frontend.getArchitectures().contains(architecture))
			{
				return true;
			}
		}
		
		for (MCompiler ecomp : getExtendedCompilers(compiler))
		{
			for (MCompilerFrontend frontend : ecomp.getFrontends())
			{
				if (frontend.getLanguage() == lang &&
					frontend.getArchitectures().contains(architecture))
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public Set<MOperatingSystemAPI> getAllSupportedOSAPIs(MOperatingSystem os) {
		
		Set<MOperatingSystemAPI> osapis = new HashSet<MOperatingSystemAPI>();
		
		for (MOperatingSystem extended : os.getInherits())
		{
			osapis.addAll(getAllSupportedOSAPIs(extended));
		}
		
		for (MOSSupportedOSAPI sosapi : os.getSupportedOSAPIs())
		{
			osapis.add(sosapi.getOsapi());
			osapis.addAll(getInheritedOSAPIs(sosapi.getOsapi()));
			
		}
		
		return osapis;
	}

	@Override
	public Set<MDevice> getBoardSupportedDevices(MBoard board)
	{
		Set<MDevice> devs = new HashSet<MDevice>();
		
		for (MBoardSupportedDevice sdevice : board.getSupportedDevices())
		{
			devs.add(sdevice.getDevice());
		}
		return devs;
	}
	
	@Override
	public MBoardSupportedDevice getBoardSupportedDevice(MBoard board, MDevice device)
	{
		for (MBoardSupportedDevice sdevice : board.getSupportedDevices())
		{
			if (sdevice.getDevice() == device)
			{
				return sdevice;
			}
		}
		return null;
	}

	@Override
	public MEnumParameterLiteral parseEnumExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments)
			throws IllegalArgumentException {
		return MICOBSUtil.parseEnumExpression(expression, assignments);
	}

	@Override
	public MEnumParameterLiteral parseEnumExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseEnumExpression(expression, resolver);
	}

	@Override
	public Boolean parseBooleanExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments)
			throws IllegalArgumentException {
		return MICOBSUtil.parseBooleanExpression(expression, assignments);
	}

	@Override
	public Boolean parseBooleanExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseBooleanExpression(expression, resolver);
	}

	@Override
	public String parseStringExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments)
			throws IllegalArgumentException {
		return MICOBSUtil.parseStringExpression(expression, assignments);
	}

	@Override
	public String parseStringExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseStringExpression(expression, resolver);
	}

	@Override
	public Long parseIntegerExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseIntegerExpression(expression, assignments);
	}

	@Override
	public Long parseIntegerExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseIntegerExpression(expression, resolver);
	}

	@Override
	public Float parseRealExpression(MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseRealExpression(expression, assignments);
	}

	@Override
	public Float parseRealExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseRealExpression(expression, resolver);
	}

	@Override
	public MParameterValueExpression createBooleanExpression(
			Boolean bool) {
		return MICOBSUtil.createBooleanExpression(bool);
	}

	@Override
	public MParameterValueExpression createIntegerExpression(
			Integer integer) {
		return MICOBSUtil.createIntegerExpression(integer);
	}

	@Override
	public MParameterValueExpression createRealExpression(Float real) {
		return MICOBSUtil.createRealExpression(real);
	}

	@Override
	public MParameterValueExpression createStringExpression(
			String string) {
		return MICOBSUtil.createStringExpression(string);
	}

	@Override
	public MParameterValueExpression createEnumExpression(
			MEnumParameterLiteral literal) {
		return MICOBSUtil.createEnumExpression(literal);
	}

	@Override
	public void addXtextNature(IProject project) {
		MICOBSUtil.addXtextNature(project);
		
	}

	@Override
	public Diagnostic convertToDiagnostic(EObject model,
			AdapterFactory adapterFactory, List<Issue> issues) {
		return MICOBSUtil.convertToDiagnostic(model, adapterFactory, issues);
	}

	@Override
	public Diagnostic convertToDiagnostic(String label, EObject model,
			AdapterFactory adapterFactory, List<Issue> issues) {
		return MICOBSUtil.convertToDiagnostic(label, model, adapterFactory, issues);
	}

	@Override
	public Diagnostic validateResource(Resource modelResource,
			AdapterFactory adapterFactory) {
		return MICOBSUtil.validateResource(modelResource, adapterFactory);
	}

	@Override
	public Set<MLanguage> getAllParentLanguages(MLanguage lang) {
		return MICOBSUtil.getAllParentLanguages(lang);
	}

	@Override
	public MLanguage getLanguage(String uri, String version) {
		return MICOBSUtil.getLanguage(uri, version);
	}

	@Override
	public Boolean parseBooleanExpression(MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseBooleanExpression(term, resolver);
	}

	@Override
	public MEnumParameterLiteral parseEnumExpression(
			MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseEnumExpression(term, resolver);
	}

	@Override
	public Long parseIntegerExpression(MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseIntegerExpression(term, resolver);
	}

	@Override
	public String parseStringExpression(MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseStringExpression(term, resolver);
	}

	@Override
	public Float parseRealExpression(MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseRealExpression(term, resolver);
	}

	@Override
	public MEnumParameterLiteral parseEnumExpression(final MParameterValueExpression self, 
							Collection<MParameterValueAssignment> assignments,
							final MPlatform platform)
							throws IllegalArgumentException
	{
		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();
		
		if (assignments != null)
		{
			for (MParameterValueAssignment va : assignments)
			{
				vamap.put(va.getParameter(), va);
			}
		}
		
		return parseEnumExpression(self, new IPlatformParameterAssignmentResolver() {
			
			@Override
			public MParameter getParameter() {
				return null;
			}
			
			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (vamap.get(parameter) == null) ? null :
						getParameterValue(vamap.get(parameter), platform);
			}
			
			@Override
			public MPlatform getPlatform() {
				return platform;
			}
		});
	}

	@Override
	public Boolean parseBooleanExpression(final MParameterValueExpression self, 
							Collection<MParameterValueAssignment> assignments,
							final MPlatform platform)
							throws IllegalArgumentException
	{
		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();
		
		if (assignments != null)
		{
			for (MParameterValueAssignment va : assignments)
			{
				vamap.put(va.getParameter(), va);
			}
		}
		
		return parseBooleanExpression(self, new IPlatformParameterAssignmentResolver() {
			
			@Override
			public MParameter getParameter() {
				return null;
			}
			
			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (vamap.get(parameter) == null) ? null :
						getParameterValue(vamap.get(parameter), platform);
			}
			
			@Override
			public MPlatform getPlatform() {
				return platform;
			}
		});
	}
	
	@Override
	public String parseStringExpression(final MParameterValueExpression self, 
							Collection<MParameterValueAssignment> assignments,
							final MPlatform platform)
							throws IllegalArgumentException
	{
		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();
		
		if (assignments != null)
		{
			for (MParameterValueAssignment va : assignments)
			{
				vamap.put(va.getParameter(), va);
			}
		}
		
		return parseStringExpression(self, new IPlatformParameterAssignmentResolver() {
			
			@Override
			public MParameter getParameter() {
				return null;
			}
			
			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (vamap.get(parameter) == null) ? null :
						getParameterValue(vamap.get(parameter), platform);
			}
			
			@Override
			public MPlatform getPlatform() {
				return platform;
			}
		});
	}
	
	@Override
	public Long parseIntegerExpression(final MParameterValueExpression self, 
							Collection<MParameterValueAssignment> assignments,
							final MPlatform platform)
							throws IllegalArgumentException
	{
		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();
		
		if (assignments != null)
		{
			for (MParameterValueAssignment va : assignments)
			{
				vamap.put(va.getParameter(), va);
			}
		}
		
		return parseIntegerExpression(self, new IPlatformParameterAssignmentResolver() {
			
			@Override
			public MParameter getParameter() {
				return null;
			}
			
			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (vamap.get(parameter) == null) ? null :
						getParameterValue(vamap.get(parameter), platform);
			}
			
			@Override
			public MPlatform getPlatform() {
				return platform;
			}
		});
	}
	
	@Override
	public Float parseRealExpression(final MParameterValueExpression self, 
							Collection<MParameterValueAssignment> assignments,
							final MPlatform platform)
							throws IllegalArgumentException
	{
		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();
		
		if (assignments != null)
		{
			for (MParameterValueAssignment va : assignments)
			{
				vamap.put(va.getParameter(), va);
			}
		}
		
		return parseRealExpression(self, new IPlatformParameterAssignmentResolver() {
			
			@Override
			public MParameter getParameter() {
				return null;
			}
			
			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (vamap.get(parameter) == null) ? null :
						getParameterValue(vamap.get(parameter), platform);
			}
			
			@Override
			public MPlatform getPlatform() {
				return platform;
			}
		});
	}


	@Override
	public MEnumParameterLiteral parseEnumExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseEnumExpression(pva, resolver);
	}

	@Override
	public Boolean parseBooleanExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseBooleanExpression(pva, resolver);
	}

	@Override
	public Long parseIntegerExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseIntegerExpression(pva, resolver);
	}

	@Override
	public String parseStringExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseStringExpression(pva, resolver);
	}

	@Override
	public Float parseRealExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseRealExpression(pva, resolver);
	}

	@Override
	public Boolean parseBooleanReferencedObject(MCommonReferenceableObj object,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseBooleanReferencedObject(object, resolver);
	}

	@Override
	public String parseStringReferencedObject(MCommonReferenceableObj object,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseStringReferencedObject(object, resolver);
	}

	@Override
	public Long parseIntegerReferencedObject(MCommonReferenceableObj object,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseIntegerReferencedObject(object, resolver);
	}

	@Override
	public Float parseRealReferencedObject(MCommonReferenceableObj object,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseRealReferencedObject(object, resolver);
	}

	@Override
	public MEnumParameterLiteral parseEnumReferencedObject(
			MCommonReferenceableObj object,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseEnumReferencedObject(object, resolver);
	}

	@Override
	public MParameterValueExpression getParameterValue(
			MParameterValueAssignment assignment) {
		return MICOBSUtil.getParameterValue(assignment);
	}

	@Override
	public MParameterValueExpression getParameterValue(MParameterValueAssignment assignment,
			MPlatform platform) {
		if (assignment instanceof MOSSupportedOSAPIPVASwitch)
		{
			for (MOSSupportedOSAPIPVASwitchCase c : ((MOSSupportedOSAPIPVASwitch) assignment).getCases())
			{
				if (matchesPlatform(c.getPlatform(), platform))
				{
					return c.getParameterValue();
				}
			}
			return getDefaultValue(assignment.getParameter(), platform);
		}
		return MICOBSUtil.getParameterValue(assignment);
	}

	@Override
	public MParameterValueExpression getDefaultValue(MParameter parameter) {
		return MICOBSUtil.getDefaultValue(parameter);
	}

	@Override
	public MParameterRange getRange(MParameter parameter)
			throws IllegalArgumentException {
		return MICOBSUtil.getRange(parameter);
	}

	@Override
	public MSystemPackage getSystemPackage(String uri) {
		return MICOBSUtil.getSystemPackage(uri);
	}
}
