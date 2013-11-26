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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Issue;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MEnumParameterLiteral;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.common.MParameterValue;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.MParameterValueTERM;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MProvidedResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;
import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MIntegerParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MRealParamSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVA;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.mesp.util.IMESPUtil;
import es.uah.aut.srg.micobs.mesp.util.IQResParameterAssignmentResolver;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MCompilerFrontend;
import es.uah.aut.srg.micobs.pdl.MDevice;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.pdlFactory;
import es.uah.aut.srg.micobs.pdl.plugin.PDLPlugin;
import es.uah.aut.srg.micobs.pdl.util.IPDLUtil;
import es.uah.aut.srg.micobs.pdl.util.impl.PDLUtil;
import es.uah.aut.srg.micobs.pdl.util.impl.PDLUtil.DefaultPDLMICOBSUtil;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.util.IMICOBSUtil;
import es.uah.aut.srg.micobs.util.IParameterAssignmentResolver;

/**
 * MESP models helper functions.
 *
 */
public class MESPUtil implements IMICOBSUtil, IPDLUtil, IMESPUtil {
	
	private IMICOBSUtil MICOBSUtil;
	private IPDLUtil PDLUtil;
	
	public MESPUtil(IPDLUtil PDLUtil, IMICOBSUtil MICOBSUtil)
	{
		this.PDLUtil = PDLUtil;
		this.MICOBSUtil = MICOBSUtil;
	}
	
	private MESPUtil()
	{
		DefaultMESPMICOBSUtil MICOBSUtil = new DefaultMESPMICOBSUtil(this);
		DefaultMESPPDLUtil PDLUtil = new DefaultMESPPDLUtil(MICOBSUtil, this);
		this.PDLUtil = PDLUtil;
		this.MICOBSUtil = MICOBSUtil;
	}
	
	private static MESPUtil DEFAULT;
	
	public static MESPUtil getDefault() {
		if (DEFAULT == null)
		{
			DEFAULT = new MESPUtil();
		}
		return DEFAULT;
	}
	
	public static class DefaultMESPPDLUtil extends PDLUtil {

		public DefaultMESPPDLUtil(IMICOBSUtil MICOBSUtil, MESPUtil MESPUtil) {
			super(MICOBSUtil);
			this.MESPUtil = MESPUtil;		
		}
		
		protected MESPUtil MESPUtil;
		
		@Override
		public MParameterValueExpression getParameterValue(MParameterValueAssignment assignment,
					MPlatform platform)
		{
			if (assignment instanceof MSwPackageProvidedInterfacePVASwitch)
			{
				for (MSwPackageProvidedInterfacePVASwitchCase c : ((MSwPackageProvidedInterfacePVASwitch)assignment).getCases())
				{
					if (MESPUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return c.getParameterValue();
					}
				}
				return MESPUtil.getDefaultValue(assignment.getParameter(), platform);
			}
			return super.getParameterValue(assignment,platform);
		}
		
		@Override
		public MParameterRange getRange(
				MParameter parameter, MPlatform platform)
				throws IllegalArgumentException {
			
			if (parameter instanceof MIntegerParamSWPSPSwitch)
			{
				for (MParameterSWPSPSwitchCase c : ((MIntegerParamSWPSPSwitch)parameter).getCases())
				{
					if (MESPUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return ((MIntegerParamSWPSPSwitchCase)c).getRange();
					}
				}
				throw new IllegalArgumentException(MESPPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
			}
			else if (parameter instanceof MRealParamSWPSPSwitch)
			{			
				for (MParameterSWPSPSwitchCase c : ((MRealParamSWPSPSwitch)parameter).getCases())
				{
					if (MESPUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return ((MRealParamSWPSPSwitchCase)c).getRange();
					}
				}
				throw new IllegalArgumentException(MESPPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));

			}
			return super.getRange(parameter, platform);
		}
		
		@Override
		public MParameterValueExpression getDefaultValue(
				MParameter parameter, MPlatform platform) {
			
			if (parameter instanceof MParameterSWPSPSwitch)
			{
				for (MParameterSWPSPSwitchCase c : ((MParameterSWPSPSwitch)parameter).getCases())
				{
					if (MESPUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return c.getDefaultValue();
					}
				}
				throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
			}
			return super.getDefaultValue(parameter, platform);
		}
		
	}
	
	public static class DefaultMESPMICOBSUtil extends DefaultPDLMICOBSUtil {
		
		
		public DefaultMESPMICOBSUtil(IPDLUtil PDLUtil) {
			super(PDLUtil);
		}
		
		@Override
		public MParameterValueExpression getParameterValue(MParameterValueAssignment assignment)
		{
			if (assignment instanceof MSwPackageProvidedInterfacePVAExpression)
			{
				return ((MSwPackageProvidedInterfacePVAExpression)assignment).getParameterValue();
			}
			return super.getParameterValue(assignment);
		}
	}

	
	@Override
	public Long getSumDemands(final MMESPDeployment deployment, final MMESPDeploymentPlatform dplt, MQuantifiableResource resource)
	{
		Long sum = new Long(0);
		
		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();
		
		for (MMESPSwPackageDeployment swpd : deployment.getDeployedSwPackages())
		{
			for (MParameterValueAssignment va : swpd.getParameterValueAssignments())
			{
				vamap.put(va.getParameter(), va);
			}
		}
		for (MParameterValueAssignment va : dplt.getParameterValueAssignments())
		{
			vamap.put(va.getParameter(), va);
		}

		for (MMESPSwPackageDeployment swpd : deployment.getDeployedSwPackages())
		{
			for (final MQuantifiableResourceDemand demand : getQuantifiableResourceDemands(swpd.getSwPackage(), dplt.getPlatform()))
			{
				if (demand.getResource() == resource)
				{
					sum += parseIntegerExpression(demand.getResourceValue(), new IQResParameterAssignmentResolver() {
						
						@Override
						public MParameter getParameter() {
							return null;
						}
						
						@Override
						public MParameterValueExpression getAssignmentExpression(
								MParameter parameter) {
							return (vamap.get(parameter) == null) ? null :
								getParameterValue(vamap.get(parameter));
						}

						@Override
						public MQuantifiableResource getResource() {
							return demand.getResource();
						}

						@Override
						public Long getSumDemands(MQuantifiableResource resource) {
							return MESPUtil.this.getSumDemands(deployment, dplt, resource);
						}
					});

				}
			}
		}

		
		for (MSwPackageRequiredInterface rswi : deployment.getRequires())
		{
			if (rswi.getInterface() instanceof MSwInterface)
			{
				for (final MResourceDemand demand : rswi.getResourceDemands())
				{
					if (demand instanceof MQuantifiableResourceDemand &&
						((MQuantifiableResourceDemand)demand).getResource() == resource)
					{
						sum += parseIntegerExpression(((MQuantifiableResourceDemand)demand).getResourceValue(), new IQResParameterAssignmentResolver() {
							
							@Override
							public MParameter getParameter() {
								return null;
							}
							
							@Override
							public MParameterValueExpression getAssignmentExpression(
									MParameter parameter) {
								return (vamap.get(parameter) == null) ? null :
									getParameterValue(vamap.get(parameter));
							}

							@Override
							public MQuantifiableResource getResource() {
								return ((MQuantifiableResourceDemand)demand).getResource();
							}

							@Override
							public Long getSumDemands(MQuantifiableResource resource) {
								return MESPUtil.this.getSumDemands(deployment, dplt, resource);
							}
						});
					}
				}
			}
			else
			{
				MOSSwInterface osswi = (MOSSwInterface) rswi.getInterface();
				if (osswi.getReferencedElement() == dplt.getPlatform().getOsapi())
				{
					for (final MResourceDemand demand : rswi.getResourceDemands())
					{
						if (demand instanceof MQuantifiableResourceDemand &&
							((MQuantifiableResourceDemand)demand).getResource() == resource)
						{
							sum += parseIntegerExpression(((MQuantifiableResourceDemand)demand).getResourceValue(), new IQResParameterAssignmentResolver() {
								
								@Override
								public MParameter getParameter() {
									return null;
								}
								
								@Override
								public MParameterValueExpression getAssignmentExpression(
										MParameter parameter) {
									return (vamap.get(parameter) == null) ? null :
										getParameterValue(vamap.get(parameter));
								}

								@Override
								public MQuantifiableResource getResource() {
									return ((MQuantifiableResourceDemand)demand).getResource();
								}

								@Override
								public Long getSumDemands(MQuantifiableResource resource) {
									return MESPUtil.this.getSumDemands(deployment, dplt, resource);
								}
							});
						}
					}
				}
			}
		}
		
		return sum;
	}
	
	@Override
	public Map<MSwInterface, MSwPackageRequiredInterface> getMapAllRequiredSwInterfacesFromAlternative(MMESPDeploymentAlternative alternative)
	{
		Map<MSwInterface, MSwPackageRequiredInterface> rswisMap = new HashMap<MSwInterface, MSwPackageRequiredInterface>();

		if (alternative.eContainer() instanceof MMESPDeployment)
		{
			MMESPDeployment deployment = (MMESPDeployment) alternative.eContainer();
			
			for (MSwPackageRequiredInterface riface : deployment.getRequires())
			{
				if (riface.getInterface() instanceof MSwInterface)
				{
					rswisMap.put((MSwInterface) riface.getInterface(), riface);
				}
			}
		}
		else
		{
			rswisMap.putAll(getMapAllRequiredSwInterfacesFromAlternative((MMESPDeploymentAlternative) alternative.eContainer()));
		}
		
		for (MSwPackageRequiredInterface riface : alternative.getRequires())
		{
			if (riface.getInterface() instanceof MSwInterface)
			{
				rswisMap.put((MSwInterface) riface.getInterface(), riface);
			}
		}
		return rswisMap;
	}
	
	@Override
	public Map<MOSSwInterface, MSwPackageRequiredInterface> getMapAllRequiredOSSwInterfacesFromAlternative(MMESPDeploymentAlternative alternative, MMESPDeploymentPlatform dplt)
	{
		Map<MOSSwInterface, MSwPackageRequiredInterface> rswisMap = new HashMap<MOSSwInterface, MSwPackageRequiredInterface>();
		
		if (alternative.eContainer() instanceof MMESPDeployment)
		{
			MMESPDeployment deployment = (MMESPDeployment) alternative.eContainer();
			
			for (MSwPackageRequiredInterface riface : deployment.getRequires())
			{
				if (riface.getInterface() instanceof MOSSwInterface)
				{
					MOSSwInterface osswi = (MOSSwInterface) riface.getInterface();
					if (osswi.getReferencedElement() == dplt.getPlatform().getOsapi())
					{
						rswisMap.put(osswi, riface);
					}
				}
			}
		}
		else
		{
			rswisMap.putAll(getMapAllRequiredOSSwInterfacesFromAlternative((MMESPDeploymentAlternative) alternative.eContainer(), dplt));
		}
		
		for (MSwPackageRequiredInterface riface : alternative.getRequires())
		{
			if (riface.getInterface() instanceof MOSSwInterface)
			{
				MOSSwInterface osswi = (MOSSwInterface) riface.getInterface();
				if (osswi.getReferencedElement() == dplt.getPlatform().getOsapi())
				{
					rswisMap.put(osswi, riface);
				}
			}
		}
		return rswisMap;
	}
	
	@Override
	public Set<MSwPackageRequiredInterface> getAllRequiredInterfacesFromAlternative(MMESPDeploymentAlternative alternative, MMESPDeploymentPlatform dplt)
	{
		Set<MSwPackageRequiredInterface> rifaces = new HashSet<MSwPackageRequiredInterface>();
		rifaces.addAll(getMapAllRequiredSwInterfacesFromAlternative(alternative).values());
		rifaces.addAll(getMapAllRequiredOSSwInterfacesFromAlternative(alternative, dplt).values());
		return rifaces;
	}
	
	@Override
	public Long getSumDemands(final MMESPDeploymentAlternative alternative,
			final MMESPDeploymentPlatform dplt, MQuantifiableResource resource)
	{
		Long sum = new Long(0);

		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();
		
		for (MMESPSwPackageDeployment swpd : getAllDeployedSwPackagesFromAlternative(alternative))
		{
			for (MParameterValueAssignment va : getAllParameterValueAssignments(swpd))
			{
				vamap.put(va.getParameter(), va);
			}
		}
		for (MParameterValueAssignment va : dplt.getParameterValueAssignments())
		{
			vamap.put(va.getParameter(), va);
		}
		
		for (MMESPSwPackageDeployment swpd : getAllDeployedSwPackagesFromAlternative(alternative))
		{
			for (final MQuantifiableResourceDemand demand : getQuantifiableResourceDemands(swpd.getSwPackage(), dplt.getPlatform()))
			{
				if (demand.getResource() == resource)
				{
					sum += parseIntegerExpression(((MQuantifiableResourceDemand)demand).getResourceValue(), new IQResParameterAssignmentResolver() {
						
						@Override
						public MParameter getParameter() {
							return null;
						}
						
						@Override
						public MParameterValueExpression getAssignmentExpression(
								MParameter parameter) {
							return (vamap.get(parameter) == null) ? null :
								getParameterValue(vamap.get(parameter));
						}

						@Override
						public MQuantifiableResource getResource() {
							return (demand.getResource());
						}

						@Override
						public Long getSumDemands(MQuantifiableResource resource) {
							return MESPUtil.this.getSumDemands(alternative, dplt, resource);
						}
					});
				}
			}
		}
		
		for (MSwPackageRequiredInterface rswi : getAllRequiredInterfacesFromAlternative(alternative, dplt))
		{
			for (final MResourceDemand demand : rswi.getResourceDemands())
			{
				if (demand instanceof MQuantifiableResourceDemand &&
					((MQuantifiableResourceDemand)demand).getResource() == resource)
				{
					sum += parseIntegerExpression(((MQuantifiableResourceDemand)demand).getResourceValue(), new IQResParameterAssignmentResolver() {
						
						@Override
						public MParameter getParameter() {
							return null;
						}
						
						@Override
						public MParameterValueExpression getAssignmentExpression(
								MParameter parameter) {
							return (vamap.get(parameter) == null) ? null :
								getParameterValue(vamap.get(parameter));
						}

						@Override
						public MQuantifiableResource getResource() {
							return ((MQuantifiableResourceDemand)demand).getResource();
						}

						@Override
						public Long getSumDemands(MQuantifiableResource resource) {
							return MESPUtil.this.getSumDemands(alternative, dplt, resource);
						}
					});

				}
			}
		}
		
		return sum;
	}
	
	@Override
	public MPlatformSwPackage getPlatformSwPackage(MPlatform platform)
	{
		MCommonPackageElement element;
		try {
			element = MESPLibraryManager.getLibraryManager().getReferencingElement(platform, mesppswpPackage.eINSTANCE.getMPlatformSwPackage());
		} catch (LibraryManagerException e) {
			MESPPlugin.INSTANCE.log(e);
			return null;
		}
		if (element != null && element instanceof MPlatformSwPackage)
		{
			return (MPlatformSwPackage) element;
		}
		return null;
	}
	
	
	@Override
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(MAbstractSwPackage swp, 
			MSwInterface swi)
	{
		Map<MParameter, MParameterValueAssignment> map = new HashMap<MParameter, MParameterValueAssignment>();
		
		for (MAbstractSwPackage pswp : swp.getInherits())
		{
			map.putAll(getMapAllParameterValueAssignments(pswp, swi));
		}
		for (MSwPackageProvidedInterface pswi : swp.getProvides())
		{
			if (pswi.getSwinterface() == swi ||
				getAllExtendedSwInterfaces(pswi.getSwinterface()).contains(swi))
			{
				for (MSwPackageProvidedInterfacePVA pva : pswi.getParameterValueAssignments())
				{
					map.put(pva.getParameter(), pva);
				}
			}
		}
		return map;
		
	}
	
	@Override
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(MAbstractSwPackage swp)
	{
		Map<MParameter, MParameterValueAssignment> map = new HashMap<MParameter, MParameterValueAssignment>();
		
		for (MAbstractSwPackage pswp : swp.getInherits())
		{
			map.putAll(getMapAllParameterValueAssignments(pswp));
		}
		for (MSwPackageProvidedInterface pswi : swp.getProvides())
		{
			for (MSwPackageProvidedInterfacePVA pva : pswi.getParameterValueAssignments())
			{
				map.put(pva.getParameter(), pva);
			}
		}
		return map;
		
	}
	
	@Override
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(
			MAbstractSwPackage swp, MSwInterface swi)
	{
		return new HashSet<MParameterValueAssignment>(getMapAllParameterValueAssignments(swp, swi).values());
	}
	
	@Override
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(
			MAbstractSwPackage swp)
	{
		return new HashSet<MParameterValueAssignment>(getMapAllParameterValueAssignments(swp).values());
	}
	
	@Override
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(MMESPSwPackageDeployment swpd,
				MMESPDeploymentAlternative alternative)
	{
		Map<MParameter, MParameterValueAssignment> map = new HashMap<MParameter, MParameterValueAssignment>();
		
		// If alternative == null, then it is either on a leaf deployment
		// alternative or on the model root.
		if (alternative == null)
		{
			if (swpd.eContainer() instanceof MMESPDeploymentAlternative)
			{
				MMESPDeploymentAlternative palternative = (MMESPDeploymentAlternative) swpd.eContainer();
				map.putAll(getMapAllParameterValueAssignments(swpd, palternative));
			}
			
			for (MParameterValueAssignment pva : swpd.getParameterValueAssignments())
			{
				map.put(pva.getParameter(), pva);
			}
		}
		else
		{
			if (alternative.eContainer() instanceof MMESPDeploymentAlternative)
			{
				MMESPDeploymentAlternative palternative = (MMESPDeploymentAlternative) alternative.eContainer();
				
				map.putAll(getMapAllParameterValueAssignments(swpd, palternative));

				for (MMESPSwPackageDeployment pswpd : palternative.getDeployedSwPackages())
				{
					if (pswpd.getSwPackage() == swpd.getSwPackage())
					{
						for (MParameterValueAssignment pva : pswpd.getParameterValueAssignments())
						{
							map.put(pva.getParameter(), pva);
						}
						break;
					}
				}

			}
			else
			{
				MMESPDeployment dep = (MMESPDeployment) alternative.eContainer();

				for (MMESPSwPackageDeployment pswpd : dep.getDeployedSwPackages())
				{
					if (pswpd.getSwPackage() == swpd.getSwPackage())
					{
						for (MParameterValueAssignment pva : pswpd.getParameterValueAssignments())
						{
							map.put(pva.getParameter(), pva);
						}
						break;
					}
				}
			}
		}

		return map;
		
	}
	
	@Override
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(MMESPSwPackageDeployment swpd)
	{
		return new HashSet<MParameterValueAssignment>(getMapAllParameterValueAssignments(swpd, null).values());
	}
	
	@Override
	public Map<MDriverSwPackageSupportedDevice, MMESPDeviceDriverMapping> getMapAllDriverMappings(MMESPDriverSwPackageDeployment swpd,
				MMESPDeploymentAlternative alternative)
	{
		Map<MDriverSwPackageSupportedDevice, MMESPDeviceDriverMapping> map = 
				new HashMap<MDriverSwPackageSupportedDevice, MMESPDeviceDriverMapping>();
		
		// If alternative == null, then it is either on a leaf deployment
		// alternative or on the model root.
		if (alternative == null)
		{
			if (swpd.eContainer() instanceof MMESPDeploymentAlternative)
			{
				MMESPDeploymentAlternative palternative = (MMESPDeploymentAlternative) swpd.eContainer();
				map.putAll(getMapAllDriverMappings(swpd, palternative));
			}
			
			for (MMESPDeviceDriverMapping drvmap : swpd.getDeviceDriverMappings())
			{
				map.put(drvmap.getSupportedDevice(), drvmap);
			}
		}
		else
		{
			if (alternative.eContainer() instanceof MMESPDeploymentAlternative)
			{
				MMESPDeploymentAlternative palternative = (MMESPDeploymentAlternative) alternative.eContainer();
				
				map.putAll(getMapAllDriverMappings(swpd, palternative));

				for (MMESPSwPackageDeployment pswpd : palternative.getDeployedSwPackages())
				{
					if (pswpd instanceof MMESPDriverSwPackageDeployment &&
						pswpd.getSwPackage() == swpd.getSwPackage())
					{
						for (MMESPDeviceDriverMapping drvmap : ((MMESPDriverSwPackageDeployment)pswpd).getDeviceDriverMappings())
						{
							map.put(drvmap.getSupportedDevice(), drvmap);
						}
						break;
					}
				}

			}
			else
			{
				MMESPDeployment dep = (MMESPDeployment) alternative.eContainer();

				for (MMESPSwPackageDeployment pswpd : dep.getDeployedSwPackages())
				{
					if (pswpd instanceof MMESPDriverSwPackageDeployment &&
						pswpd.getSwPackage() == swpd.getSwPackage())
					{
						for (MMESPDeviceDriverMapping drvmap : ((MMESPDriverSwPackageDeployment)pswpd).getDeviceDriverMappings())
						{
							map.put(drvmap.getSupportedDevice(), drvmap);
						}
						break;
					}
				}
			}
		}

		return map;
		
	}
	
	@Override
	public Set<MMESPDeviceDriverMapping> getAllDriverMappings(MMESPDriverSwPackageDeployment swpd)
	{
		return new HashSet<MMESPDeviceDriverMapping>(getMapAllDriverMappings(swpd, null).values());
	}

	
	
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MSwPackageSupportedPlatform swpsp) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : swpsp.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}

		
		return defs;
	}
		
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MInstantiableResource ires) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : ires.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
		
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MSwInterface swi) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : swi.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MAbstractSwPackage aswp) {
		
		Set<MEnumParameterDefinition> defs = getEnumParameterDefinitions(aswp);
		
		for (MAbstractSwPackage paswp : aswp.getInherits())
		{
			defs.addAll(getAllEnumParameterDefinitions(paswp));
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MSwPackage swp, MPlatform platform) {
		
		Set<MEnumParameterDefinition> defs = getAllEnumParameterDefinitions(swp);
		
		MSwPackageSupportedPlatform swpsp = getMatchingPlatform(swp, platform);
		
		if (swpsp != null)
		{
			defs.addAll(getEnumParameterDefinitions(swpsp));
		}
		
		return defs;
	}
	
	@Override
	public MPlatform toPlatform(MSwPackageSupportedPlatform swpsp)
	{
		MPlatform platform = pdlFactory.eINSTANCE.createMPlatform();
		platform.setOsapi(swpsp.getOsapi());
		platform.setOs(swpsp.getOs());
		platform.setArchitecture(swpsp.getArchitecture());
		platform.setCompiler(swpsp.getCompiler());
		platform.setMicroprocessor(swpsp.getMicroprocessor());
		platform.setBoard(swpsp.getBoard());
		
		return platform;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(MAbstractSwPackage aswp) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : aswp.getParameters())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}

	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(MSwInterface swi) {
		
		Set<MEnumParameterDefinition> defs = getEnumParameterDefinitions(swi);
		
		for (MSwInterface posswi : swi.getExtends())
		{
			defs.addAll(getAllEnumParameterDefinitions(posswi));
		}
		return defs;
	}
	
	@Override
	public Set<MOSSwInterface> getAllProvidedOSSWIs(MOSSwPackage osswp) {
		
		Set<MOSSwInterface> osswis = new HashSet<MOSSwInterface>();
		
		for (MOSSwInterface osswi : osswp.getProvidedOSSWIs())
		{
			osswis.add(osswi);
			osswis.addAll(getAllExtendedOSSWIs(osswi));
			
		}
		for (MOSSwPackage extended : osswp.getExtends())
		{
			osswis.addAll(getAllProvidedOSSWIs(extended));
		}
		
		return osswis;
	}
	
	@Override
	public Map<MSwPackage, MMESPSwPackageDeployment> getMapAllDeployedSwPackagesFromAlternative(MMESPDeploymentAlternative alternative)
	{
		Map<MSwPackage, MMESPSwPackageDeployment> resources = new HashMap<MSwPackage, MMESPSwPackageDeployment>();
		
		if (alternative.eContainer() instanceof MMESPDeploymentAlternative)
		{
			resources.putAll(
					getMapAllDeployedSwPackagesFromAlternative((MMESPDeploymentAlternative)alternative.eContainer()));
		}
		else
		{
			MMESPDeployment deployment = (MMESPDeployment)alternative.eContainer();
			for (MMESPSwPackageDeployment swpd : deployment.getDeployedSwPackages())
			{
				resources.put(swpd.getSwPackage(), swpd);			
			}

		}
		
		for (MMESPSwPackageDeployment swpd : alternative.getDeployedSwPackages())
		{
			resources.put(swpd.getSwPackage(), swpd);			
		}

		return resources;
	}
	
	@Override
	public Set<MMESPSwPackageDeployment> getAllDeployedSwPackagesFromAlternative(MMESPDeploymentAlternative alternative)
	{
		return new HashSet<MMESPSwPackageDeployment>(getMapAllDeployedSwPackagesFromAlternative(alternative).values());
	}
	
	@Override
	public Set<MMESPDeploymentAlternative> getLeafDeploymentAlternatives(
							MMESPDeploymentAlternative alternative)
	{
		Set<MMESPDeploymentAlternative> alternatives = new HashSet<MMESPDeploymentAlternative>();
		
		if (alternative.getDeploymentAlternatives().isEmpty())
		{
			alternatives.add(alternative);
		}
		else
		{
			for (MMESPDeploymentAlternative alt : alternative.getDeploymentAlternatives())
			{
				alternatives.addAll(getLeafDeploymentAlternatives(alt));
			}
		}
		return alternatives;
	}
	
	@Override
	public Set<MMESPDeploymentAlternative> getLeafDeploymentAlternatives(MMESPDeployment deployment)
	{
		Set<MMESPDeploymentAlternative> alternatives = new HashSet<MMESPDeploymentAlternative>();
		
		if (deployment.getDeploymentAlternatives().isEmpty())
		{
			return alternatives;
		}
		
		for (MMESPDeploymentAlternative alt : deployment.getDeploymentAlternatives())
		{
			alternatives.addAll(getLeafDeploymentAlternatives(alt));
		}
		return alternatives;
	}
	
	@Override
	public boolean platformIntersection(MSwPackageSupportedPlatform swrsp1,
			MSwPackageSupportedPlatform swrsp2)
	{
		if (swrsp1.getOsapi() != null && swrsp2.getOsapi() != null &&
			swrsp1.getOsapi() != swrsp2.getOsapi())
		{
			return false;
		}
		if (swrsp1.getOs() != null && swrsp2.getOs() != null &&
			swrsp1.getOs() != swrsp2.getOs())
		{
			return false;
		}
		if (swrsp1.getArchitecture() != null && swrsp2.getArchitecture() != null &&
			swrsp1.getArchitecture() != swrsp2.getArchitecture())
		{
			return false;
		}
		if (swrsp1.getCompiler() != null && swrsp2.getCompiler() != null &&
			swrsp1.getCompiler() != swrsp2.getCompiler())
		{
			return false;
		}
		if (swrsp1.getMicroprocessor() != null && swrsp2.getMicroprocessor() != null &&
			swrsp1.getMicroprocessor() != swrsp2.getMicroprocessor())
		{
			return false;
		}
		if (swrsp1.getBoard() != null && swrsp2.getBoard() != null &&
			swrsp1.getBoard() != swrsp2.getBoard())
		{
			return false;
		}
		return true;
	}
		
	@Override
	public boolean matchesPlatform(MSwPackageSupportedPlatform supportedPlatform,
			MPlatform platform)
	{
		// We have to check that, either the field of the supported
		// platform is null or, if it is not, it is defined in both
		// platforms and it is the same

		if (supportedPlatform.getOsapi() != null && 
			supportedPlatform.getOsapi() != platform.getOsapi() &&
			getInheritedOSAPIs(platform.getOsapi()).contains(supportedPlatform.getOsapi()) == false)
		{
			return false;
		}
		if (supportedPlatform.getOs() != null &&
			supportedPlatform.getOs() != platform.getOs() &&
			getInheritedOperatingSystems(platform.getOs()).contains(supportedPlatform.getOs()) == false)
		{
			return false;
		}
		if (supportedPlatform.getArchitecture() != null &&
			supportedPlatform.getArchitecture() != platform.getArchitecture())
		{
			return false;
		}
		if (supportedPlatform.getCompiler() != null &&
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
	public boolean supportsPlatform(MSwPackage swPackage,
			MPlatform platform) {
		
		for (MSwPackageSupportedPlatform supportedPlatform :
				swPackage.getSupportedPlatforms())
		{
			if (matchesPlatform(supportedPlatform, platform) == true)
			{
				return true;
			}
		}
		return false;
	}
	
	@Override
	public MSwPackageSupportedPlatform getMatchingPlatform(MSwPackage swp,
			MPlatform platform) {
		
		for (MSwPackageSupportedPlatform supportedPlatform : swp.getSupportedPlatforms())
		{
			if (matchesPlatform(supportedPlatform, platform))
			{
				return supportedPlatform;
			}
		}
		return null;
	}
	
	@Override
	public Set<MAbstractSwPackage> getAllInheritedSwPackages(MAbstractSwPackage swp) {
		
		Set<MAbstractSwPackage> swps = new HashSet<MAbstractSwPackage>();
		
		for (MAbstractSwPackage item : swp.getInherits())
		{
			swps.add(item);
			swps.addAll(getAllInheritedSwPackages(item));
		}
		
		return swps;
	}

	@Override
	public Set<MSwPackage> getAllExtendedSwPackages(MSwPackage swp) {
		
		Set<MSwPackage> swps = new HashSet<MSwPackage>();
		
		for (Iterator<MSwPackage> s = swp.getExtends().iterator(); s.hasNext(); )
		{
			MSwPackage item = s.next();
			swps.add(item);
			swps.addAll(getAllExtendedSwPackages(item));
		}
		
		return swps;
	}
	
	@Override
	public Set<MOSSwPackage> getAllExtendedOSSwPackages(MOSSwPackage osswp) {
		
		Set<MOSSwPackage> osswps = new HashSet<MOSSwPackage>();
		
		for (Iterator<MOSSwPackage> s = osswp.getExtends().iterator(); s.hasNext(); )
		{
			MOSSwPackage item = s.next();
			osswps.add(item);
			osswps.addAll(getAllExtendedOSSwPackages(item));
		}
		
		return osswps;
	}

	@Override
	public Set<MSwInterface> getAllExtendedSwInterfaces(MSwInterface iface) {
		
		Set<MSwInterface> swis = new HashSet<MSwInterface>();
		
		for (Iterator<MSwInterface> s = iface.getExtends().iterator(); s.hasNext(); )
		{
			MSwInterface item = s.next();
			swis.add(item);
			swis.addAll(getAllExtendedSwInterfaces(item));
		}
		
		return swis;
	}
	
	@Override
	public Set<MOSSwInterface> getAllExtendedOSSWIs(MOSSwInterface iface) {
		
		Set<MOSSwInterface> osswis = new HashSet<MOSSwInterface>();
		
		for (Iterator<MOSSwInterface> s = iface.getExtends().iterator(); s.hasNext(); )
		{
			MOSSwInterface item = s.next();
			osswis.add(item);
			osswis.addAll(getAllExtendedOSSWIs(item));
		}
		
		return osswis;
	}
	
	@Override
	public Set<MSwInterface> getAllProvidedSwInterfaces(MAbstractSwPackage aswp)
	{
		Set<MSwInterface> swis = new HashSet<MSwInterface>();
		
		for (MSwPackageProvidedInterface pswi : aswp.getProvides())
		{
			swis.add(pswi.getSwinterface());
			swis.addAll(getAllExtendedSwInterfaces(pswi.getSwinterface()));
		}			
		
		for (MAbstractSwPackage parent : aswp.getInherits())
		{
			swis.addAll(getAllProvidedSwInterfaces(parent));
		}
		
		if (aswp instanceof MSwPackage)
		{
			for (MSwPackage extended : ((MSwPackage)aswp).getExtends())
			{
				swis.addAll(getAllProvidedSwInterfaces(extended));
			}
		}
		
		return swis;
	}
	
	@Override
	public Set<MSwInterface> getAllEffectivelyProvidedSwInterfaces(MSwPackage swp)
	{
		Set<MSwInterface> swis = new HashSet<MSwInterface>();

		for (MSwPackageProvidedInterface pswi : swp.getProvides())
		{
			swis.add(pswi.getSwinterface());
			swis.addAll(getAllExtendedSwInterfaces(pswi.getSwinterface()));
		}
		
		for (MAbstractSwPackage parent : swp.getInherits())
		{
			swis.addAll(getAllProvidedSwInterfaces(parent));
		}
		
		for (MSwPackage extended : swp.getExtends())
		{
			swis.removeAll(getAllProvidedSwInterfaces(extended));
		}

		return swis;
	}
	
	@Override
	public Set<MSwPackageRequiredInterface> getAllRequiredInterfaces(MSwPackage swp)
	{
		return getAllRequiredInterfaces(swp, null);
	}
	
	@Override
	public Set<MSwInterface> getAllRequiredSwInterfaces(MSwPackage swp)
	{
		return getAllRequiredSwInterfaces(swp, null);
	}
	
	@Override
	public Set<MSwPackageRequiredInterface> getAllRequiredInterfaces(MSwPackage swp, MPlatform platform)
	{
		Set<MSwPackageRequiredInterface> rifaces = new HashSet<MSwPackageRequiredInterface>();
		Map<MOSSwInterface, MSwPackageRequiredInterface> rosswis = new HashMap<MOSSwInterface, MSwPackageRequiredInterface>();
		Map<MSwInterface, MSwPackageRequiredInterface> rswis = new HashMap<MSwInterface, MSwPackageRequiredInterface>();
		
		for (MSwPackageRequiredInterface riface : swp.getRequires())
		{
			if (riface.getInterface() instanceof MSwInterface)
			{
				rswis.put((MSwInterface)riface.getInterface(), riface);
			}
			else if (riface.getInterface() instanceof MOSSwInterface)
			{
				rosswis.put((MOSSwInterface)riface.getInterface(), riface);
			}
		}
		
		if (platform != null)
		{
			MSwPackageSupportedPlatform swpsp = getMatchingPlatform(swp, platform);
		
			if (swpsp != null)
			{
				for (MSwPackageRequiredInterface riface : swpsp.getRequires())
				{
					if (riface.getInterface() instanceof MSwInterface)
					{
						rswis.put((MSwInterface)riface.getInterface(), riface);
					}
					else if (riface.getInterface() instanceof MOSSwInterface)
					{
						rosswis.put((MOSSwInterface)riface.getInterface(), riface);
					}
				}
			}
		}
		
		rifaces.addAll(rswis.values());
		rifaces.addAll(rosswis.values());
		
		return rifaces;
	}
		
	@Override
	public Set<MSwInterface> getAllRequiredSwInterfaces(MSwPackage swp, MPlatform platform)
	{
		Set<MSwInterface> swis = new HashSet<MSwInterface>();
		
		for (MSwPackageRequiredInterface rswi : swp.getRequires())
		{
			if (rswi.getInterface() instanceof MSwInterface)
			{
				swis.add((MSwInterface) rswi.getInterface());
			}
			
		}
		
		if (platform != null)
		{
			MSwPackageSupportedPlatform swpsp = getMatchingPlatform(swp, platform);
		
			if (swpsp != null)
			{
				for (MSwPackageRequiredInterface rswi : swpsp.getRequires())
				{
					if (rswi.getInterface() instanceof MSwInterface)
					{
						swis.add((MSwInterface) rswi.getInterface());
					}
				}
			}
		}
		
		for (MSwInterface iface : getAllProvidedSwInterfaces(swp))
		{
			swis.addAll(iface.getRequires());
		}
		
		return swis;
	}
	
	@Override
	public Set<MSwInterface> getAllRequiredSwInterfaces(MSwInterface swi)
	{
		Set<MSwInterface> swis = new HashSet<MSwInterface>();
		
		for (MSwInterface required : swi.getRequires())
		{
			for (MSwInterface extended : getAllExtendedSwInterfaces(required))
			{
				swis.addAll(extended.getRequires());
			}
			swis.add(required);
		}
		swis.addAll(swi.getRequires());
		
		return swis;
	}
	
	@Override
	public Map<MOSSwInterface, MSwPackageRequiredInterface> getAllRequiredOSSwInterfacesMap(MMESPDeploymentAlternative alternative)
	{
		Map<MOSSwInterface, MSwPackageRequiredInterface> rosswis = new HashMap<MOSSwInterface, MSwPackageRequiredInterface>();
		
		if (alternative.eContainer() instanceof MMESPDeploymentAlternative)
		{
			rosswis.putAll(
					getAllRequiredOSSwInterfacesMap((MMESPDeploymentAlternative)alternative.eContainer()));
		}
		else
		{
			MMESPDeployment deployment = (MMESPDeployment)alternative.eContainer();

			for (MSwPackageRequiredInterface riface : deployment.getRequires())
			{
				if (riface.getInterface() instanceof MOSSwInterface)
				{
					rosswis.put((MOSSwInterface) riface.getInterface(), riface);
				}
			}
		}
		
		for (MSwPackageRequiredInterface riface : alternative.getRequires())
		{
			if (riface.getInterface() instanceof MOSSwInterface)
			{
				rosswis.put((MOSSwInterface) riface.getInterface(), riface);
			}
		}
		
		return rosswis;
	}
	
	@Override
	public Map<MSwInterface, MSwPackageRequiredInterface> getAllRequiredSwInterfacesMap(MMESPDeploymentAlternative alternative)
	{
		Map<MSwInterface, MSwPackageRequiredInterface> rswis = new HashMap<MSwInterface, MSwPackageRequiredInterface>();

		if (alternative.eContainer() instanceof MMESPDeploymentAlternative)
		{
			rswis.putAll(
					getAllRequiredSwInterfacesMap((MMESPDeploymentAlternative)alternative.eContainer()));
		}
		else
		{
			MMESPDeployment deployment = (MMESPDeployment)alternative.eContainer();

			for (MSwPackageRequiredInterface riface : deployment.getRequires())
			{
				if (riface.getInterface() instanceof MSwInterface)
				{
					rswis.put((MSwInterface) riface.getInterface(), riface);
				}
			}
		}
		
		for (MSwPackageRequiredInterface riface : alternative.getRequires())
		{
			if (riface.getInterface() instanceof MSwInterface)
			{
				rswis.put((MSwInterface) riface.getInterface(), riface);
			}
		}
		
		return rswis;
	}
	
	@Override
	public Set<MSwPackageRequiredInterface> getAllRequiredInterfaces(MMESPDeploymentAlternative alternative)
	{
		Set<MSwPackageRequiredInterface> rifaces = new HashSet<MSwPackageRequiredInterface>();
		Map<MOSSwInterface, MSwPackageRequiredInterface> rosswis = getAllRequiredOSSwInterfacesMap(alternative);
		Map<MSwInterface, MSwPackageRequiredInterface> rswis = getAllRequiredSwInterfacesMap(alternative);

		rifaces.addAll(rswis.values());
		rifaces.addAll(rosswis.values());

		return rifaces;
	}
		
	@Override
	public Set<MParameter> getParameters(MAbstractSwPackage aswp)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter param : aswp.getParameters())
		{
			if (!(param instanceof MEnumParameterDefinition))
			{
				params.add(param);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getParameters(MSwPackageSupportedPlatform swpsp)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter param : swpsp.getParameters())
		{
			if (!(param instanceof MEnumParameterDefinition))
			{
				params.add(param);
			}
		}
		return params;
	}

	@Override
	public Set<MParameter> getAllParameters(MAbstractSwPackage aswp)
	{
		Set<MParameter> params = getParameters(aswp);
		
		for (MAbstractSwPackage paswp : aswp.getInherits())
		{
			params.addAll(getAllParameters(paswp));
		}
		return params;
	}

	@Override
	public Set<MParameter> getAllParameters(MSwPackage swp, MPlatform platform)
	{
		Set<MParameter> params = getParameters(swp);
		
		for (MAbstractSwPackage paswp : swp.getInherits())
		{
			params.addAll(getAllParameters(paswp));
		}
		
		if (platform != null)
		{
			MSwPackageSupportedPlatform swpsp = getMatchingPlatform(swp, platform);
			if (swpsp != null)
			{
				params.addAll(swpsp.getParameters());
			}
		}
		
		return params;
	}
	
	@Override
	public Set<MParameter> getAllParameters(MSwInterface swi)
	{
		Set<MParameter> params = getParameters(swi);
		
		for (MSwInterface eswi : swi.getExtends())
		{
			params.addAll(getAllParameters(eswi));
		}
		return params;
	}

	@Override
	public Set<MParameter> getParameters(MSwInterface swi)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter parameter : swi.getParameters())
		{
			if (!(parameter instanceof MEnumParameterDefinition))
			{
				params.add(parameter);
			}
		}
		return params;
	}

	@Override
	public Set<MQuantifiableResource> getQuantifiableResources(
			MSwInterface iface) {
		
		Set<MQuantifiableResource> resources = new HashSet<MQuantifiableResource>();
		
		for (MProvidedResource res : iface.getProvidedResources())
		{
			if (res instanceof MQuantifiableResource)
			{
				resources.add((MQuantifiableResource) res);
			}
		}
		return resources;
	}
	
	@Override
	public Set<MQuantifiableResource> getAllQuantifiableResources(
			MSwInterface iface) {
		
		Set<MQuantifiableResource> resources = getQuantifiableResources(iface);
		
		for (MSwInterface eswi : iface.getExtends())
		{
			resources.addAll(getAllQuantifiableResources(eswi));
		}
		return resources;
	}
	
	@Override
	public Set<MQuantifiableResource> getAllQuantifiableResources(
			MOSSwInterface osswi) {
		
		Set<MQuantifiableResource> resources = getQuantifiableResources(osswi);
		
		for (MOSSwInterface eswi : osswi.getExtends())
		{
			resources.addAll(getAllQuantifiableResources(eswi));
		}
		return resources;
	}
	
	@Override
	public Set<MInstantiableResourceDemand> getInstantiableResourceDemands(MSwPackage swp, MPlatform platform) {
		
		Set<MInstantiableResourceDemand> demands = new HashSet<MInstantiableResourceDemand>();
		
		for (MSwPackageRequiredInterface rswi : swp.getRequires())
		{
			for (MResourceDemand demand : rswi.getResourceDemands())
			{
				if (demand instanceof MInstantiableResourceDemand)
				{
					demands.add((MInstantiableResourceDemand) demand);
				}
			}
		}
		
		MSwPackageSupportedPlatform swpsp = getMatchingPlatform(swp, platform);
		if (swpsp != null)
		{
			for (MSwPackageRequiredInterface rswi : swpsp.getRequires())
			{
				for (MResourceDemand demand : rswi.getResourceDemands())
				{
					if (demand instanceof MInstantiableResourceDemand)
					{
						demands.add((MInstantiableResourceDemand) demand);
					}
				}
			}
		}
		return demands;	
	}
	
	@Override
	public Set<MQuantifiableResourceDemand> getQuantifiableResourceDemands(MSwPackage swp, MPlatform platform) {
		
		Set<MQuantifiableResourceDemand> demands = new HashSet<MQuantifiableResourceDemand>();
		
		for (MSwPackageRequiredInterface rswi : swp.getRequires())
		{
			for (MResourceDemand demand : rswi.getResourceDemands())
			{
				if (demand instanceof MQuantifiableResourceDemand)
				{
					demands.add((MQuantifiableResourceDemand) demand);
				}
			}
		}

		MSwPackageSupportedPlatform swpsp = getMatchingPlatform(swp, platform);
		if (swpsp != null)
		{
			for (MSwPackageRequiredInterface rswi : swpsp.getRequires())
			{
				for (MResourceDemand demand : rswi.getResourceDemands())
				{
					if (demand instanceof MQuantifiableResourceDemand)
					{
						demands.add((MQuantifiableResourceDemand) demand);
					}
				}
			}
		}
		return demands;	
	}

	@Override
	public Set<MQuantifiableResource> getQuantifiableResources(
			MOSSwInterface osswi) {
		
		Set<MQuantifiableResource> resources = new HashSet<MQuantifiableResource>();
		
		for (MProvidedResource res : osswi.getProvidedResources())
		{
			if (res instanceof MQuantifiableResource)
			{
				resources.add((MQuantifiableResource) res);
			}
		}
		return resources;
	}

	@Override
	public Set<MInstantiableResource> getInstantiableResources(
			MSwInterface iface) {
		
		Set<MInstantiableResource> resources = new HashSet<MInstantiableResource>();
		
		for (MProvidedResource res : iface.getProvidedResources())
		{
			if (res instanceof MInstantiableResource)
			{
				resources.add((MInstantiableResource) res);
			}
		}
		return resources;
	}
	
	@Override
	public Set<MInstantiableResource> getAllInstantiableResources(
			MSwInterface iface) {
		
		Set<MInstantiableResource> resources = getInstantiableResources(iface);
		
		for (MSwInterface eswi : iface.getExtends())
		{
			resources.addAll(getAllInstantiableResources(eswi));
		}
		return resources;
	}
	
	@Override
	public Set<MInstantiableResource> getAllInstantiableResources(
			MOSSwInterface iface) {
		
		Set<MInstantiableResource> resources = getInstantiableResources(iface);
		
		for (MOSSwInterface eosswi : iface.getExtends())
		{
			resources.addAll(getAllInstantiableResources(eosswi));
		}
		return resources;
	}
	
	@Override
	public Set<MInstantiableResource> getInstantiableResources(
			MOSSwInterface osswi) {
		
		Set<MInstantiableResource> resources = new HashSet<MInstantiableResource>();
		
		for (MProvidedResource res : osswi.getProvidedResources())
		{
			if (res instanceof MInstantiableResource)
			{
				resources.add((MInstantiableResource) res);
			}
		}
		return resources;
	}
	
	@Override
	public Set<MSwInterface> getProvidedSwInterfaces(
			MMESPDeployment deployment) {
			
		Set<MSwInterface> swis = new HashSet<MSwInterface>();
		
		for (MMESPSwPackageDeployment swpd : deployment.getDeployedSwPackages())
		{
			swis.addAll(getAllProvidedSwInterfaces(swpd.getSwPackage()));
		}

		return swis;
	}
	
	@Override
	public Set<MSwInterface> getAllProvidedSwInterfaces(
			MMESPDeployment deployment) {
			
		if (deployment.getDeploymentAlternatives().isEmpty() == true)
		{
			return getProvidedSwInterfaces(deployment);
		}
		else
		{
			Set<MSwInterface> swis = new HashSet<MSwInterface>();
			
			for (MMESPDeploymentAlternative alternative : getLeafDeploymentAlternatives(deployment))
			{
				swis.addAll(getAllProvidedSwInterfaces(alternative));
			}

			return swis;
		}
		
	}

	@Override
	public Set<MSwInterface> getAllProvidedSwInterfaces(
			MMESPDeploymentAlternative alternative) 
	{
		Set<MSwInterface> swis = new HashSet<MSwInterface>();
		
		for (MMESPSwPackageDeployment swpd : getAllDeployedSwPackagesFromAlternative(alternative))
		{
			swis.addAll(getAllProvidedSwInterfaces(swpd.getSwPackage()));
		}
		return swis;
	}

	@Override
	public Set<MOSSwInterface> getAllProvidedOSSwInterfaces(MMESPDeployment deployment) 
	{		
		Set<MOSSwInterface> osswis = new HashSet<MOSSwInterface>();

		for (MMESPDeploymentPlatform platform : deployment.getDeploymentPlatforms())
		{
			for (MOSSwPackage osswp : platform.getPlatformSwPackage().getOsSwPackages())
			{
				osswis.addAll(getAllProvidedOSSWIs(osswp));
			}
		}	

		return osswis;
	}

	@Override
	public Set<MParameter> getParameters(MInstantiableResource resource) {
		
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter parameter : resource.getParameters())
		{
			if (!(parameter instanceof MEnumParameterDefinition))
			{
				params.add(parameter);
			}
		}
		return params;
	}

	@Override
	public boolean platformIntersection(MOSSupportedPlatform ossp1,
			MOSSupportedPlatform ossp2) {
		return PDLUtil.platformIntersection(ossp1, ossp2);
	}

	@Override
	public boolean matchesPlatform(MOSSupportedPlatform supportedPlatform,
			MPlatform platform) {
		return PDLUtil.matchesPlatform(supportedPlatform, platform);
	}

	@Override
	public boolean supportsPlatform(MOperatingSystem os, MPlatform platform) {
		return PDLUtil.supportsPlatform(os, platform);
	}

	@Override
	public MOSSupportedPlatform getMatchingPlatform(MOperatingSystem os,
			MPlatform platform) {
		return PDLUtil.getMatchingPlatform(os, platform);
	}

	@Override
	public Set<MParameter> getAllParameters(MOperatingSystem os) {
		return PDLUtil.getAllParameters(os);
	}

	@Override
	public Set<MParameter> getAllParameters(MOperatingSystemAPI osapi) {
		return PDLUtil.getAllParameters(osapi);
	}

	@Override
	public Set<MParameter> getAllParameters(MOperatingSystem os,
			MPlatform platform) {
		return PDLUtil.getAllParameters(os, platform);
	}

	@Override
	public Set<MParameter> getParameters(MOperatingSystemAPI osapi) {
		return PDLUtil.getParameters(osapi);
	}

	@Override
	public Set<MParameter> getParameters(MDevice device) {
		return PDLUtil.getParameters(device);
	}

	@Override
	public Set<MParameter> getParameters(MArchitecture arch) {
		return PDLUtil.getParameters(arch);
	}

	@Override
	public Set<MParameter> getAllParameters(MArchitecture arch) {
		return PDLUtil.getAllParameters(arch);
	}

	@Override
	public Set<MParameter> getParameters(MMicroprocessor microprocessor) {
		return PDLUtil.getParameters(microprocessor);
	}

	@Override
	public Set<MParameter> getParameters(MBoard board) {
		return PDLUtil.getParameters(board);
	}

	@Override
	public Set<MParameter> getParameters(MCompilerFrontend frontend) {
		return PDLUtil.getParameters(frontend);
	}

	@Override
	public Set<MParameter> getParameters(MCompiler compiler) {
		return PDLUtil.getParameters(compiler);
	}

	@Override
	public Set<MParameter> getAllParameters(MCompiler compiler,
			MArchitecture arch) {
		return PDLUtil.getAllParameters(compiler, arch);
	}

	@Override
	public Set<MParameter> getAllParameters(MCompiler compiler) {
		return PDLUtil.getAllParameters(compiler);
	}

	@Override
	public Set<MParameter> getParameters(MPlatform platform) {
		return PDLUtil.getParameters(platform);
	}

	@Override
	public Set<MParameter> getAllParameters(MPlatform platform) {
		return PDLUtil.getAllParameters(platform);
	}

	@Override
	public Set<MParameter> getParameters(MOperatingSystem os) {
		return PDLUtil.getParameters(os);
	}

	@Override
	public Set<MParameter> getParameters(MOSSupportedPlatform ossp) {
		return PDLUtil.getParameters(ossp);
	}

	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MPlatform platform) {
		return PDLUtil.getEnumParameterDefinitions(platform);
	}

	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MOperatingSystem os) {
		return PDLUtil.getEnumParameterDefinitions(os);
	}

	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MOperatingSystem os, MPlatform platform) {
		return PDLUtil.getAllEnumParameterDefinitions(os, platform);
	}

	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MOperatingSystem os) {
		return PDLUtil.getAllEnumParameterDefinitions(os);
	}

	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MOperatingSystemAPI osapi) {
		return PDLUtil.getEnumParameterDefinitions(osapi);
	}

	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MDevice device) {
		return PDLUtil.getEnumParameterDefinitions(device);
	}

	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MOperatingSystemAPI osapi) {
		return PDLUtil.getAllEnumParameterDefinitions(osapi);
	}

	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MArchitecture arch) {
		return PDLUtil.getEnumParameterDefinitions(arch);
	}

	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MCompiler compiler) {
		return PDLUtil.getEnumParameterDefinitions(compiler);
	}

	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MCompilerFrontend frontend) {
		return PDLUtil.getEnumParameterDefinitions(frontend);
	}

	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MCompiler compiler) {
		return PDLUtil.getAllEnumParameterDefinitions(compiler);
	}

	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MCompiler compiler, MArchitecture arch) {
		return PDLUtil.getAllEnumParameterDefinitions(compiler, arch);
	}

	@Override
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MArchitecture arch) {
		return PDLUtil.getAllEnumParameterDefinitions(arch);
	}

	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MOSSupportedPlatform ossp) {
		return PDLUtil.getEnumParameterDefinitions(ossp);
	}

	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MMicroprocessor mp) {
		return PDLUtil.getEnumParameterDefinitions(mp);
	}

	@Override
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MBoard board) {
		return PDLUtil.getEnumParameterDefinitions(board);
	}

	@Override
	public Set<MOperatingSystemAPI> getInheritedOSAPIs(MOperatingSystemAPI osapi) {
		return PDLUtil.getInheritedOSAPIs(osapi);
	}

	@Override
	public Set<MOperatingSystem> getInheritedOperatingSystems(
			MOperatingSystem os) {
		return PDLUtil.getInheritedOperatingSystems(os);
	}

	@Override
	public Set<MCompiler> getExtendedCompilers(MCompiler compiler) {
		return PDLUtil.getExtendedCompilers(compiler);
	}

	@Override
	public Set<MArchitecture> getExtendedArchitectures(
			MArchitecture architecture) {
		return PDLUtil.getExtendedArchitectures(architecture);
	}

	@Override
	public boolean supportsLanguageForArchitecture(MCompiler compiler,
			MLanguage lang, MArchitecture architecture) {
		return PDLUtil.supportsLanguageForArchitecture(compiler, lang, architecture);
	}

	@Override
	public Set<MOperatingSystemAPI> getAllSupportedOSAPIs(MOperatingSystem os) {
		return PDLUtil.getAllSupportedOSAPIs(os);
	}

	@Override
	public Set<MDevice> getBoardSupportedDevices(MBoard board) {
		return PDLUtil.getBoardSupportedDevices(board);
	}

	@Override
	public MBoardSupportedDevice getBoardSupportedDevice(MBoard board,
			MDevice device) {
		return PDLUtil.getBoardSupportedDevice(board, device);
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
			MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments)
			throws IllegalArgumentException {
		return MICOBSUtil.parseBooleanExpression(self, assignments);
	}

	@Override
	public Boolean parseBooleanExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseBooleanExpression(expression, resolver);
	}

	@Override
	public Boolean parseBooleanExpression(MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseBooleanExpression(term, resolver);
	}

	@Override
	public String parseStringExpression(
			MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments)
			throws IllegalArgumentException {
		return MICOBSUtil.parseStringExpression(self, assignments);
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
			MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseIntegerExpression(self, assignments);
	}

	@Override
	public Long parseIntegerExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseIntegerExpression(expression, resolver);
	}

	@Override
	public Float parseRealExpression(MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseRealExpression(self, assignments);
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
	public MEnumParameterLiteral parseEnumExpression(
			MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException {
		return PDLUtil.parseEnumExpression(self, assignments, platform);
	}
	
	@Override
	public Boolean parseBooleanExpression(
			MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException {
		return PDLUtil.parseBooleanExpression(self, assignments, platform);
	}
	
	@Override
	public String parseStringExpression(
			MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException {
		return PDLUtil.parseStringExpression(self, assignments, platform);
	}
	
	@Override
	public Long parseIntegerExpression(
			MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException {
		return PDLUtil.parseIntegerExpression(self, assignments, platform);
	}
	
	@Override
	public Float parseRealExpression(
			MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException {
		return PDLUtil.parseRealExpression(self, assignments, platform);
	}


	@Override
	public MPlatform toPlatform(MOperatingSystemAPI osapi, MOperatingSystem os,
			MOSSupportedPlatform ossp) {
		return PDLUtil.toPlatform(osapi, os, ossp);
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
	public MParameterValueExpression getParameterValue(MParameterValueAssignment assignment)
	{
		return MICOBSUtil.getParameterValue(assignment);
	}
	
	@Override
	public MParameterValueExpression getParameterValue(MParameterValueAssignment assignment,
				MPlatform platform)
	{
		return PDLUtil.getParameterValue(assignment,platform);
	}
	
	@Override
	public MParameterValueExpression getDefaultValue(MParameter parameter) {
		return MICOBSUtil.getDefaultValue(parameter);
	}

	@Override
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(
			MOperatingSystem os) {
		return PDLUtil.getMapAllParameterValueAssignments(os);
	}

	@Override
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(
			MOperatingSystem os) {
		return PDLUtil.getAllParameterValueAssignments(os);
	}

	@Override
	public Set<MParameterValueAssignment> getAllSwPackageParameterValueAssignments(
			MMESPDeployment deployment, MMESPDeploymentAlternative alternative) {
		
		Set<MParameterValueAssignment> pvas = new HashSet<MParameterValueAssignment>();
		
		if (alternative == null)
		{
			// Only the root of the deployment model will be considered
			for (MMESPSwPackageDeployment swpd : deployment.getDeployedSwPackages())
			{
				pvas.addAll(swpd.getParameterValueAssignments());
				pvas.addAll(getAllParameterValueAssignments(swpd.getSwPackage()));
			}
		}
		else
		{
			for (MMESPSwPackageDeployment swpd : getAllDeployedSwPackagesFromAlternative(alternative))
			{
				pvas.addAll(getAllParameterValueAssignments(swpd));
				pvas.addAll(getAllParameterValueAssignments(swpd.getSwPackage()));
			}
		}
		return pvas;
	}

	@Override
	public MOSSwInterface getOSSwInterface(MOperatingSystemAPI osapi) {
		MCommonPackageElement element = null;
		
		try {
			element = MESPLibraryManager.getLibraryManager().getReferencingElement(osapi, mesposswiPackage.eINSTANCE.getMOSSwInterface());	
		} catch (LibraryManagerException e) {
			MESPPlugin.INSTANCE.log(e);
			return null;
		}

		if (element != null && 
			element instanceof MOSSwInterface)
		{
			return (MOSSwInterface)element;
		}
		else
		{
			return null;
		}

	}

	@Override
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(
			MOperatingSystem os, MOperatingSystemAPI osapi) {
		return PDLUtil.getMapAllParameterValueAssignments(os);
	}

	@Override
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(
			MOperatingSystem os, MOperatingSystemAPI osapi) {
		return PDLUtil.getAllParameterValueAssignments(os);
	}

	@Override
	public MParameterRange getRange(MParameter parameter)
			throws IllegalArgumentException {
		return MICOBSUtil.getRange(parameter);
	}

	@Override
	public MParameterRange getRange(MParameter parameter, MPlatform platform)
			throws IllegalArgumentException {
		return PDLUtil.getRange(parameter, platform);
	}

	@Override
	public MParameterValueExpression getDefaultValue(MParameter parameter,
			MPlatform platform) {
		return PDLUtil.getDefaultValue(parameter, platform);
	}
}
