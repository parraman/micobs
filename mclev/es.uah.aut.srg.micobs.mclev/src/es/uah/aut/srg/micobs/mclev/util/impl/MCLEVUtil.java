package es.uah.aut.srg.micobs.mclev.util.impl;

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

import es.uah.aut.srg.micobs.common.MCommonPackage;
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
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackage;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MIntegerParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalConnection;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MParameterCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MRealParamCSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalClientPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalServerPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIntegerParamIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalClientPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalServerPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MParameterIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice;
import es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MIntegerParamSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MRealParamSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVAExpression;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.mclev.plugin.MCLEVPlugin;
import es.uah.aut.srg.micobs.mclev.util.IMCLEVUtil;
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
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage;
import es.uah.aut.srg.micobs.util.IMICOBSUtil;
import es.uah.aut.srg.micobs.util.IParameterAssignmentResolver;


public class MCLEVUtil implements IMCLEVUtil, IPDLUtil, IMICOBSUtil {
	
	private IPDLUtil PDLUtil;
	private IMICOBSUtil MICOBSUtil;
	
	public MCLEVUtil(IPDLUtil PDLUtil, IMICOBSUtil MICOBSUtil)
	{
		this.MICOBSUtil = MICOBSUtil;
		this.PDLUtil = PDLUtil;
	}
	
	private MCLEVUtil()
	{
		DefaultMCLEVMICOBSUtil MICOBSUtil = new DefaultMCLEVMICOBSUtil(this);
		DefaultMCLEVPDLUtil PDLUtil = new DefaultMCLEVPDLUtil(MICOBSUtil, this);
		this.PDLUtil = PDLUtil;
		this.MICOBSUtil = MICOBSUtil;

	}
	
	private static MCLEVUtil DEFAULT;
	
	public static MCLEVUtil getDefault() {
		if (DEFAULT == null)
		{
			DEFAULT = new MCLEVUtil();
		}
		return DEFAULT;
	}
	
	public static class DefaultMCLEVPDLUtil extends PDLUtil {

		public DefaultMCLEVPDLUtil(IMICOBSUtil MICOBSUtil, MCLEVUtil MCLEVUtil) {
			super(MICOBSUtil);
			this.MCLEVUtil = MCLEVUtil;		
		}
		
		protected MCLEVUtil MCLEVUtil;
		
		@Override
		public MParameterValueExpression getParameterValue(MParameterValueAssignment assignment,
					MPlatform platform)
		{
			if (assignment instanceof MSLibProvidedSAIAVASwitch)
			{
				for (MSLibProvidedSAIAVASwitchCase c : ((MSLibProvidedSAIAVASwitch)assignment).getCases())
				{
					if (MCLEVUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return c.getAttributeValue();
					}
				}
				return getDefaultValue(assignment.getParameter(), platform);
			}
			return super.getParameterValue(assignment,platform);
		}
		
		@Override
		public MParameterRange getRange(
				MParameter parameter, MPlatform platform)
				throws IllegalArgumentException {
			
			if (parameter instanceof MIntegerParamCSPSwitch)
			{
				for (MParameterCSPSwitchCase c : ((MIntegerParamCSPSwitch)parameter).getCases())
				{
					if (MCLEVUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return ((MIntegerParamCSPSwitchCase)c).getRange();
					}
				}
				throw new IllegalArgumentException(MCLEVPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
			}
			else if (parameter instanceof MRealParamCSPSwitch)
			{			
				for (MParameterCSPSwitchCase c : ((MRealParamCSPSwitch)parameter).getCases())
				{
					if (MCLEVUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return ((MRealParamCSPSwitchCase)c).getRange();
					}
				}
				throw new IllegalArgumentException(MCLEVPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));

			}
			else if (parameter instanceof MIntegerParamIODSPSwitch)
			{
				for (MParameterIODSPSwitchCase c : ((MIntegerParamIODSPSwitch)parameter).getCases())
				{
					if (MCLEVUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return ((MIntegerParamIODSPSwitchCase)c).getRange();
					}
				}
				throw new IllegalArgumentException(MCLEVPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
			}
			else if (parameter instanceof MRealParamIODSPSwitch)
			{			
				for (MParameterIODSPSwitchCase c : ((MRealParamIODSPSwitch)parameter).getCases())
				{
					if (MCLEVUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return ((MRealParamIODSPSwitchCase)c).getRange();
					}
				}
				throw new IllegalArgumentException(MCLEVPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));

			}
			else if (parameter instanceof MIntegerParamSLSPSwitch)
			{
				for (MParameterSLSPSwitchCase c : ((MIntegerParamSLSPSwitch)parameter).getCases())
				{
					if (MCLEVUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return ((MIntegerParamSLSPSwitchCase)c).getRange();
					}
				}
				throw new IllegalArgumentException(MCLEVPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
			}
			else if (parameter instanceof MRealParamSLSPSwitch)
			{			
				for (MParameterSLSPSwitchCase c : ((MRealParamSLSPSwitch)parameter).getCases())
				{
					if (MCLEVUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return ((MRealParamSLSPSwitchCase)c).getRange();
					}
				}
				throw new IllegalArgumentException(MCLEVPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));

			}
			return super.getRange(parameter, platform);
		}
		
		@Override
		public MParameterValueExpression getDefaultValue(
				MParameter parameter, MPlatform platform) {
			
			if (parameter instanceof MParameterCSPSwitch)
			{
				for (MParameterCSPSwitchCase c : ((MParameterCSPSwitch)parameter).getCases())
				{
					if (MCLEVUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return c.getDefaultValue();
					}
				}
				throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
			}
			else if (parameter instanceof MParameterIODSPSwitch)
			{
				for (MParameterIODSPSwitchCase c : ((MParameterIODSPSwitch)parameter).getCases())
				{
					if (MCLEVUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return c.getDefaultValue();
					}
				}
				throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
			}
			else if (parameter instanceof MParameterSLSPSwitch)
			{
				for (MParameterSLSPSwitchCase c : ((MParameterSLSPSwitch)parameter).getCases())
				{
					if (MCLEVUtil.matchesPlatform(c.getPlatform(), platform))
					{
						return c.getDefaultValue();
					}
				}
				throw new IllegalArgumentException(PDLPlugin.INSTANCE.getString("_ERROR_UnableToDecideThePlatform"));
			}
			return super.getDefaultValue(parameter, platform);		
		}
	}
	
	public static class DefaultMCLEVMICOBSUtil extends DefaultPDLMICOBSUtil {
		
		
		public DefaultMCLEVMICOBSUtil(IPDLUtil PDLUtil) {
			super(PDLUtil);
		}
		
		@Override
		public MParameterValueExpression getParameterValue(MParameterValueAssignment assignment)
		{
			if (assignment instanceof MSLibProvidedSAIAVAExpression)
			{
				return ((MSLibProvidedSAIAVAExpression)assignment).getAttributeValue();
			}
			return super.getParameterValue(assignment);
		}
	};
	
	@Override
	public MPlatform toPlatform(MServiceLibrarySupportedPlatform slibsp)
	{
		MPlatform platform = pdlFactory.eINSTANCE.createMPlatform();
		platform.setOsapi(slibsp.getOsapi());
		platform.setOs(slibsp.getOs());
		platform.setArchitecture(slibsp.getArchitecture());
		platform.setCompiler(slibsp.getCompiler());
		platform.setMicroprocessor(slibsp.getMicroprocessor());
		platform.setBoard(slibsp.getBoard());
		
		return platform;
	}
	
	@Override
	public Set<MPort> getAllPortsWithoutRelay(MComponent component)
	{
		Set<MPort> ports = getAllPorts(component);
		Set<MInternalComponentConnection> connections = getShortCircuitConnections(component);
		for (MInternalComponentConnection conn : connections)
		{
			ports.remove(conn.getClientPort());
			ports.remove(conn.getServerPort());
		}
		return ports;
	}
	
	@Override
	public Set<MPort> getAllPorts(MAbstractComponent component)
	{
		Set<MPort> ports = new HashSet<MPort>();
		
		if (component == null)
		{
			return ports;
		}
		
		for (MAbstractComponent parent : getInheritedComponents(component))
		{	
			ports.addAll(parent.getExternalPorts());
		}
		
		ports.addAll(component.getExternalPorts());

		if (component instanceof MComponent)
		{
			MComponent cmp = (MComponent) component;
			ports.addAll(cmp.getInternalPorts());
		}

		return ports;
		
		
	}
	
	@Override
	public Set<MInternalComponentConnection> getShortCircuitConnections(MComponent component)
	{
		Set<MInternalComponentConnection> connections = new HashSet<MInternalComponentConnection>();
		
		for (MInternalConnection conn : component.getConnections())
		{
			if (conn instanceof MInternalComponentConnection)
			{
				MInternalComponentConnection iconn = (MInternalComponentConnection) conn;
				if (iconn.getClientInstance() == null && iconn.getServerInstance() == null)
				{
					connections.add(iconn);
				}
			}
		}
		return connections;
	}

	@Override
	public Set<MComponent> getAllInternalComponents(MComponent component) {
		
		Set<MComponent> components = new HashSet<MComponent>();

		for (MInternalComponentInstance iinst : getInternalInstances(component, null))
		{
			components.addAll(getAllInternalComponents(iinst.getComponent()));
			components.add(iinst.getComponent());
		}
		return components;
	}
	
	@Override
	public Set<MComponent> getAllInternalComponents(MComponent component, MPlatform platform) {
		
		Set<MComponent> components = new HashSet<MComponent>();

		for (MInternalComponentInstance iinst : getInternalInstances(component, platform))
		{
			components.addAll(getAllInternalComponents(iinst.getComponent(), platform));
			components.add(iinst.getComponent());
		}
		return components;
	}
	
	@Override
	public Set<MComponent> getAllInternalComponents(MComponent component, Collection<MPlatform> platforms) {
		
		Set<MComponent> components = new HashSet<MComponent>();
		
		if (platforms == null)
		{
			for (MInternalComponentInstance iinst : getInternalInstances(component, null))
			{
				components.addAll(getAllInternalComponents(iinst.getComponent()));
				components.add(iinst.getComponent());
			}
		}
		
		for (MPlatform platform : platforms)
		{
			for (MInternalComponentInstance iinst : getInternalInstances(component, platform))
			{
				components.addAll(getAllInternalComponents(iinst.getComponent(), platform));
				components.add(iinst.getComponent());
			}
		}

		return components;
	}
	
	@Override
	public Set<MInternalComponentInstance> getInternalInstances(MComponent component, MPlatform platform) {

		Set<MInternalComponentInstance> iinsts = new HashSet<MInternalComponentInstance>();
		
		iinsts.addAll(component.getInternalComponents());
		
		if (platform != null)
		{
			MComponentSupportedPlatform csp = getMatchingPlatform(component, platform);
			
			if (csp != null)
			{
				iinsts.addAll(csp.getInternalComponents());
			}
		}
			
		return iinsts;
		
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumAttributeDefinitions(MServiceLibrarySupportedPlatform slibsp) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter attr : slibsp.getAttributes())
		{
			if (attr instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) attr);
			}
		}

		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getAllEnumAttributeDefinitions(MSAI sai) {
		
		Set<MEnumParameterDefinition> defs = getEnumAttributeDefinitions(sai);
		
		for (MSAI psai : sai.getExtends())
		{
			defs.addAll(getAllEnumAttributeDefinitions(psai));
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumAttributeDefinitions(MSAI sai) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter attr : sai.getAttributes())
		{
			if (attr instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) attr);
			}
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getAllEnumAttributeDefinitions(MAbstractServiceLibrary aslib) {
		
		Set<MEnumParameterDefinition> defs = getEnumAttributeDefinitions(aslib);
		
		for (MAbstractServiceLibrary paslib : aslib.getInherits())
		{
			defs.addAll(getAllEnumAttributeDefinitions(paslib));
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumAttributeDefinitions(MAbstractServiceLibrary aslib) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
			
		for (MParameter param : aslib.getAttributes())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
	
	@Override
	public Set<MParameter> getAttributes(MAbstractComponent acmp)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter param : acmp.getAttributes())
		{
			if (!(param instanceof MEnumParameterDefinition))
			{
				params.add(param);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAttributes(MIODomain iod)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter param : iod.getAttributes())
		{
			if (!(param instanceof MEnumParameterDefinition))
			{
				params.add(param);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAttributes(MAODomain aod)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter param : aod.getAttributes())
		{
			if (!(param instanceof MEnumParameterDefinition))
			{
				params.add(param);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAttributes(MAbstractServiceLibrary aslib)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter param : aslib.getAttributes())
		{
			if (!(param instanceof MEnumParameterDefinition))
			{
				params.add(param);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAttributes(MSAI sai)
	{
		Set<MParameter> params = new HashSet<MParameter>();

		for (MParameter param : sai.getAttributes())
		{
			if (!(param instanceof MEnumParameterDefinition))
			{
				params.add(param);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAttributes(MIODomainSupportedPlatform iodsp)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter param : iodsp.getAttributes())
		{
			if (!(param instanceof MEnumParameterDefinition))
			{
				params.add(param);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAttributes(MComponentSupportedPlatform csp)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter param : csp.getAttributes())
		{
			if (!(param instanceof MEnumParameterDefinition))
			{
				params.add(param);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAttributes(MServiceLibrarySupportedPlatform slsp)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MParameter param : slsp.getAttributes())
		{
			if (!(param instanceof MEnumParameterDefinition))
			{
				params.add(param);
			}
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAllAttributes(MIODomain iod)
	{
		Set<MParameter> params = getAttributes(iod);
		
		for (MIODomain pacmp : iod.getInherits())
		{
			params.addAll(getAllAttributes(pacmp));
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAllAttributes(MSAI sai)
	{
		Set<MParameter> params = getAttributes(sai);
		
		for (MSAI pacmp : sai.getExtends())
		{
			params.addAll(getAllAttributes(pacmp));
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAllAttributes(MAODomain iod)
	{
		Set<MParameter> params = getAttributes(iod);
		
		for (MAODomain pacmp : iod.getInherits())
		{
			params.addAll(getAllAttributes(pacmp));
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAllAttributes(MAbstractComponent acmp)
	{
		Set<MParameter> params = getAttributes(acmp);
		
		for (MAbstractComponent pacmp : acmp.getInherits())
		{
			params.addAll(getAllAttributes(pacmp));
		}
		return params;
	}
	
	@Override
	public Set<MParameter> getAllAttributes(MAbstractServiceLibrary aslib)
	{
		Set<MParameter> params = getAttributes(aslib);
		
		for (MAbstractServiceLibrary pacmp : aslib.getInherits())
		{
			params.addAll(getAllAttributes(pacmp));
		}
		return params;
	}
	
	@Override
	public Set<MSAI> getAllEffectivelyProvidedSAIs(MServiceLibrary slib)
	{
		Set<MSAI> sais = new HashSet<MSAI>();
		
		for (MServiceLibraryProvidedSAI psai : slib.getProvides())
		{
			sais.add(psai.getSai());
			sais.addAll(getAllExtendedSAIs(psai.getSai()));
		}
		
		for (MAbstractServiceLibrary parent : slib.getInherits())
		{
			sais.addAll(getAllProvidedSAIs(parent));
		}
		
		for (MServiceLibrary extended : slib.getExtends())
		{
			sais.removeAll(getAllProvidedSAIs(extended));
		}

		return sais;
	}

	@Override
	public Map<MParameter, MParameterValueAssignment> getMapAllAttributeValueAssignments(
				MServiceLibraryInstance slinst,
				MDeploymentAlternative alternative)
	{
		Map<MParameter, MParameterValueAssignment> map = new HashMap<MParameter, MParameterValueAssignment>();
		
		// If alternative == null, then it is either on a leaf deployment
		// alternative or on the model root.
		if (alternative == null)
		{
			if (slinst.eContainer() instanceof MDeploymentAlternative)
			{
				MDeploymentAlternative palternative = (MDeploymentAlternative) slinst.eContainer();
				map.putAll(getMapAllAttributeValueAssignments(slinst, palternative));
			}
			
			for (MParameterValueAssignment pva : slinst.getAttributeValueAssignments())
			{
				map.put(pva.getParameter(), pva);
			}
		}
		else
		{
			if (alternative.eContainer() instanceof MDeploymentAlternative)
			{
				MDeploymentAlternative palternative = (MDeploymentAlternative) alternative.eContainer();
				
				map.putAll(getMapAllAttributeValueAssignments(slinst, palternative));

				for (MServiceLibraryInstance pslinst : palternative.getLibraries())
				{
					if (pslinst.getLibrary() == slinst.getLibrary())
					{
						for (MParameterValueAssignment pva : pslinst.getAttributeValueAssignments())
						{
							map.put(pva.getParameter(), pva);
						}
						break;
					}
				}

			}
			else
			{
				MMCADeployment dep = (MMCADeployment) alternative.eContainer();

				for (MServiceLibraryInstance pswpd : dep.getLibraries())
				{
					if (pswpd.getLibrary() == slinst.getLibrary())
					{
						for (MParameterValueAssignment pva : pswpd.getAttributeValueAssignments())
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
	public Set<MParameterValueAssignment> getAllAttributeValueAssignments(MServiceLibraryInstance slinst)
	{
		return new HashSet<MParameterValueAssignment>(getMapAllAttributeValueAssignments(slinst, null).values());
	}
	
	@Override
	public Map<MDriverSLibSupportedDevice, MDeviceDriverMapping> getMapAllDriverMappings(MDriverSLibInstance drvInst,
				MDeploymentAlternative alternative)
	{
		Map<MDriverSLibSupportedDevice, MDeviceDriverMapping> map = 
				new HashMap<MDriverSLibSupportedDevice, MDeviceDriverMapping>();
		
		// If alternative == null, then it is either on a leaf deployment
		// alternative or on the model root.
		if (alternative == null)
		{
			if (drvInst.eContainer() instanceof MDeploymentAlternative)
			{
				MDeploymentAlternative palternative = (MDeploymentAlternative) drvInst.eContainer();
				map.putAll(getMapAllDriverMappings(drvInst, palternative));
			}
			
			for (MDeviceDriverMapping drvmap : drvInst.getDeviceDriverMappings())
			{
				map.put(drvmap.getSupportedDevice(), drvmap);
			}
		}
		else
		{
			if (alternative.eContainer() instanceof MDeploymentAlternative)
			{
				MDeploymentAlternative palternative = (MDeploymentAlternative) alternative.eContainer();
				
				map.putAll(getMapAllDriverMappings(drvInst, palternative));

				for (MServiceLibraryInstance pslinst : palternative.getLibraries())
				{
					if (pslinst instanceof MDriverSLibInstance &&
						pslinst.getLibrary() == drvInst.getLibrary())
					{
						for (MDeviceDriverMapping drvmap : ((MDriverSLibInstance)pslinst).getDeviceDriverMappings())
						{
							map.put(drvmap.getSupportedDevice(), drvmap);
						}
						break;
					}
				}

			}
			else
			{
				MMCADeployment dep = (MMCADeployment) alternative.eContainer();

				for (MServiceLibraryInstance pslinst : dep.getLibraries())
				{
					if (pslinst instanceof MDriverSLibInstance &&
						pslinst.getLibrary() == drvInst.getLibrary())
					{
						for (MDeviceDriverMapping drvmap : ((MDriverSLibInstance)pslinst).getDeviceDriverMappings())
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
	public Set<MDeviceDriverMapping> getAllDriverMappings(MDriverSLibInstance drvInst)
	{
		return new HashSet<MDeviceDriverMapping>(getMapAllDriverMappings(drvInst, null).values());
	}
	
	@Override
	public Set<MInterfaceType> getAllInterfaceTypes(MPortType ptype)
	{
		Set<MInterfaceType> itypes = new HashSet<MInterfaceType>();
		
		itypes.addAll(ptype.getInterfaceTypes());
		
		for (MPortType ipt : getInheritedPortTypes(ptype))
		{
			itypes.addAll(ipt.getInterfaceTypes());
		}
		return itypes;
		
	}
	
	@Override
	public Set<MInterfaceType> getAllInterfaceTypes(MExchangeModel em)
	{
		Set<MInterfaceType> itypes = new HashSet<MInterfaceType>();
		
		itypes.addAll(em.getInterfaceTypes());
		
		for (MExchangeModel iem : getInheritedExchangeModels(em))
		{
			itypes.addAll(iem.getInterfaceTypes());
		}
		return itypes;
		
	}
	
	@Override
	public Set<MPortType> getAllClientPortTypes(MConnector conn)
	{
		Set<MPortType> ptypes = new HashSet<MPortType>();
		
		ptypes.addAll(conn.getClientPortTypes());
		
		for (MConnector iconn : getInheritedConnectors(conn))
		{
			ptypes.addAll(iconn.getClientPortTypes());
		}
		return ptypes;
	}
	
	@Override
	public Set<MPortType> getAllServerPortTypes(MConnector conn)
	{
		Set<MPortType> ptypes = new HashSet<MPortType>();
		
		ptypes.addAll(conn.getServerPortTypes());
		
		for (MConnector iconn : getInheritedConnectors(conn))
		{
			ptypes.addAll(iconn.getServerPortTypes());
		}
		return ptypes;
	}
	
	@Override
	public Map<MComponentType, MComponentTypeInstance> getAllComponentTypeInstances(MComponentType ctype)
	{
		Map<MComponentType, MComponentTypeInstance> map = new HashMap<MComponentType, MComponentTypeInstance>();
		
		if (ctype instanceof MIODAbstractComponentType)
		{
			MIODAbstractComponentType iodctype = (MIODAbstractComponentType)ctype;
			
			for (MComponentType ictype : iodctype.getInherits())
			{
				map.putAll(getAllComponentTypeInstances(ictype));
			}
			for (MIODComponentTypeInstance cti : iodctype.getComponentTypeInstances())
			{
				map.put(cti.getComponentType(), cti);
			}

		}
		else if (ctype instanceof MAODComponentType)
		{
			MAODComponentType aodctype = (MAODComponentType)ctype;
			
			for (MComponentType ictype : aodctype.getInherits())
			{
				map.putAll(getAllComponentTypeInstances(ictype));
			}
			for (MAODComponentTypeInstance cti : aodctype.getComponentTypeInstances())
			{
				map.put(cti.getComponentType(), cti);
			}

		}
		return map;
		
	}
	
	@Override
	public Map<MComponentType, MComponentTypeInstance> getAllComponentTypeInstances(MDomain domain)
	{
		Map<MComponentType, MComponentTypeInstance> map = new HashMap<MComponentType, MComponentTypeInstance>();
		
		if (domain instanceof MIODomain)
		{
			MIODomain iod = (MIODomain)domain;
			
			for (MIODomain piod : iod.getInherits())
			{
				map.putAll(getAllComponentTypeInstances(piod));
			}
			for (MIODComponentTypeInstance cti : iod.getComponentTypeInstances())
			{
				map.put(cti.getComponentType(), cti);
			}

		}
		else if (domain instanceof MAODomain)
		{
			MAODomain aod = (MAODomain)domain;
			
			for (MAODomain paod : aod.getInherits())
			{
				map.putAll(getAllComponentTypeInstances(paod));
			}
			for (MAODComponentTypeInstance cti : aod.getComponentTypeInstances())
			{
				map.put(cti.getComponentType(), cti);
			}

		}
		return map;
		
	}
	
	@Override
	public Set<MServiceLibrary> getAllExtendedLibraries(MServiceLibrary slib) {
		
		Set<MServiceLibrary> slibs = new HashSet<MServiceLibrary>();
		
		for (Iterator<MServiceLibrary> s = slib.getExtends().iterator(); s.hasNext(); )
		{
			MServiceLibrary item = s.next();
			slibs.add(item);
			slibs.addAll(getAllExtendedLibraries(item));
		}
		
		return slibs;
	}
	
	@Override
	public Set<MSAI> getAllProvidedSAIs(MServiceLibrary slib)
	{
		Set<MSAI> sais = new HashSet<MSAI>();
		
		for (MServiceLibraryProvidedSAI psai : slib.getProvides())
		{
			sais.add(psai.getSai());
			sais.addAll(getAllExtendedSAIs(psai.getSai()));
		}
		
		for (MAbstractServiceLibrary parent : slib.getInherits())
		{
			sais.addAll(getAllProvidedSAIs(parent));
		}

		return sais;
	}
	
	@Override
	public Set<MSAI> getAllRequiredSAIs(MServiceLibrary slib, MPlatform platform)
	{
		Set<MSAI> sais = new HashSet<MSAI>();
		
		sais.addAll(slib.getRequires());
		
		if (platform != null)
		{
			MServiceLibrarySupportedPlatform slsp = getMatchingPlatform(slib, platform);
		
			if (slsp != null)
			{
				sais.addAll(slsp.getRequires());
			}
		}
		
		for (MSAI iface : getAllProvidedSAIs(slib))
		{
			sais.addAll(iface.getRequires());
		}
		
		return sais;
	}
	
	@Override
	public Set<MSAI> getAllRequiredSAIs(MIODomain domain, MPlatform platform)
	{
		Set<MSAI> sais = new HashSet<MSAI>();
		
		sais.addAll(domain.getRequires());
		
		if (platform != null)
		{
			MIODomainSupportedPlatform slsp = getMatchingPlatform(domain, platform);
		
			if (slsp != null)
			{
				sais.addAll(slsp.getRequires());
			}
		}
		
		return sais;
	}
	
	@Override
	public Set<MSAI> getAllRequiredSAIs(MComponent cmp, MPlatform platform)
	{
		Set<MSAI> sais = new HashSet<MSAI>();
		
		sais.addAll(cmp.getRequires());
		
		if (platform != null)
		{
			MComponentSupportedPlatform slsp = getMatchingPlatform(cmp, platform);
		
			if (slsp != null)
			{
				sais.addAll(slsp.getRequires());
			}
		}
		
		return sais;
	}
	
	/**
	 * This function returns a map with the external client port type instances
	 * of a given component type.
	 * 
	 * @param ctype The component type.
	 * @return The map with the external client port type instances.
	 */
	@Override
	public Map<MPortType, MExternalClientPortTypeInstance> getAllExternalClientPortTypeInstances(MComponentType ctype)
	{
		Map<MPortType, MExternalClientPortTypeInstance> map = new HashMap<MPortType, MExternalClientPortTypeInstance>();
		
		if (ctype instanceof MIODAbstractComponentType)
		{
			MIODAbstractComponentType iodctype = (MIODAbstractComponentType)ctype;
			
			for (MComponentType ictype : iodctype.getInherits())
			{
				map.putAll(getAllExternalClientPortTypeInstances(ictype));
			}
			for (MPortTypeInstance pti : iodctype.getPortTypeInstances())
			{
				if (pti instanceof MExternalClientPortTypeInstance)
				{
					map.put(pti.getPortType(), (MExternalClientPortTypeInstance) pti);
				}
			}

		}
		else if (ctype instanceof MAODComponentType)
		{
			MAODComponentType aodctype = (MAODComponentType)ctype;
			
			for (MComponentType ictype : aodctype.getInherits())
			{
				map.putAll(getAllExternalClientPortTypeInstances(ictype));
			}
			for (MPortTypeInstance pti : aodctype.getPortTypeInstances())
			{
				if (pti instanceof MExternalClientPortTypeInstance)
				{
					map.put(pti.getPortType(), (MExternalClientPortTypeInstance) pti);
				}
			}

		}
		return map;

	}
	
	/**
	 * This function returns a map with the external server port type instances
	 * of a given component type.
	 * 
	 * @param ctype The component type.
	 * @return The map with the external server port type instances.
	 */
	@Override
	public Map<MPortType, MExternalServerPortTypeInstance> getAllExternalServerPortTypeInstances(MComponentType ctype)
	{
		Map<MPortType, MExternalServerPortTypeInstance> map = new HashMap<MPortType, MExternalServerPortTypeInstance>();
		
		if (ctype instanceof MIODAbstractComponentType)
		{
			MIODAbstractComponentType iodctype = (MIODAbstractComponentType)ctype;
			
			for (MComponentType ictype : iodctype.getInherits())
			{
				map.putAll(getAllExternalServerPortTypeInstances(ictype));
			}
			for (MPortTypeInstance pti : iodctype.getPortTypeInstances())
			{
				if (pti instanceof MExternalServerPortTypeInstance)
				{
					map.put(pti.getPortType(), (MExternalServerPortTypeInstance) pti);
				}
			}

		}
		else if (ctype instanceof MAODComponentType)
		{
			MAODComponentType aodctype = (MAODComponentType)ctype;
			
			for (MComponentType ictype : aodctype.getInherits())
			{
				map.putAll(getAllExternalServerPortTypeInstances(ictype));
			}
			for (MPortTypeInstance pti : aodctype.getPortTypeInstances())
			{
				if (pti instanceof MExternalServerPortTypeInstance)
				{
					map.put(pti.getPortType(), (MExternalServerPortTypeInstance) pti);
				}
			}

		}
		return map;

	}
	
	/**
	 * This function returns a map with the internal client port type instances
	 * of a given component type.
	 * 
	 * @param ctype The component type.
	 * @return The map with the internal client port type instances.
	 */
	@Override
	public Map<MPortType, MInternalClientPortTypeInstance> getAllInternalClientPortTypeInstances(MComponentType ctype)
	{
		Map<MPortType, MInternalClientPortTypeInstance> map = new HashMap<MPortType, MInternalClientPortTypeInstance>();
		
		if (ctype instanceof MIODAbstractComponentType)
		{
			MIODAbstractComponentType iodctype = (MIODAbstractComponentType)ctype;
			
			for (MComponentType ictype : iodctype.getInherits())
			{
				map.putAll(getAllInternalClientPortTypeInstances(ictype));
			}
			for (MPortTypeInstance pti : iodctype.getPortTypeInstances())
			{
				if (pti instanceof MInternalClientPortTypeInstance)
				{
					map.put(pti.getPortType(), (MInternalClientPortTypeInstance) pti);
				}
			}

		}
		else if (ctype instanceof MAODComponentType)
		{
			MAODComponentType aodctype = (MAODComponentType)ctype;
			
			for (MComponentType ictype : aodctype.getInherits())
			{
				map.putAll(getAllInternalClientPortTypeInstances(ictype));
			}
			for (MPortTypeInstance pti : aodctype.getPortTypeInstances())
			{
				if (pti instanceof MInternalClientPortTypeInstance)
				{
					map.put(pti.getPortType(), (MInternalClientPortTypeInstance) pti);
				}
			}

		}
		return map;

	}
	
	/**
	 * This function returns a map with the internal server port type instances
	 * of a given component type.
	 * 
	 * @param ctype The component type.
	 * @return The map with the internal server port type instances.
	 */
	@Override
	public Map<MPortType, MInternalServerPortTypeInstance> getAllInternalServerPortTypeInstances(MComponentType ctype)
	{
		Map<MPortType, MInternalServerPortTypeInstance> map = new HashMap<MPortType, MInternalServerPortTypeInstance>();
		
		if (ctype instanceof MIODAbstractComponentType)
		{
			MIODAbstractComponentType iodctype = (MIODAbstractComponentType)ctype;
			
			for (MComponentType ictype : iodctype.getInherits())
			{
				map.putAll(getAllInternalServerPortTypeInstances(ictype));
			}
			for (MPortTypeInstance pti : iodctype.getPortTypeInstances())
			{
				if (pti instanceof MInternalServerPortTypeInstance)
				{
					map.put(pti.getPortType(), (MInternalServerPortTypeInstance) pti);
				}
			}

		}
		else if (ctype instanceof MAODComponentType)
		{
			MAODComponentType aodctype = (MAODComponentType)ctype;
			
			for (MComponentType ictype : aodctype.getInherits())
			{
				map.putAll(getAllInternalServerPortTypeInstances(ictype));
			}
			for (MPortTypeInstance pti : aodctype.getPortTypeInstances())
			{
				if (pti instanceof MInternalServerPortTypeInstance)
				{
					map.put(pti.getPortType(), (MInternalServerPortTypeInstance) pti);
				}
			}

		}
		return map;

	}

	
	/**
	 * This function returns all the connectors from the alternative passed as
	 * parameter to the uppermost level, i.e. the root of the deployment model.
	 * 
	 * @param alternative: the alternative from which the connectors will be
	 * obtained.
	 * @return the set of connections.
	 */
	@Override
	public Set<MConnection> getAllConnections(
			MDeploymentAlternative alternative) {
		
		Set<MConnection> connections = new HashSet<MConnection>();
		
		// First, we include the set of the connections from the alternative
		connections.addAll(alternative.getConnections());
		
		// Then we check if the container of the alternative is the model root
		// or another alternative:
		if (alternative.eContainer() instanceof MDeploymentAlternative)
		{
			// If it is another alternative, we have to call again the function
			// recursively: 
			connections.addAll(getAllConnections(
					(MDeploymentAlternative)alternative.eContainer()));
		}
		else
		{
			// It is the root of the model, we have just to add the connections
			// and that's it:
			MMCADeployment deployment = (MMCADeployment)alternative.eContainer();
			connections.addAll(deployment.getConnections());
		}
		return connections;
	}

	/**
	 * Returns the set of components inherited by a given component.
	 * @param component The component.
	 * @return The set of inherited components. If the component parameter is
	 * 		   null, it returns an empty list.
	 */
	@Override
	public Set<MAbstractComponent> getInheritedComponents(MAbstractComponent component) {
		
		Set<MAbstractComponent> components = new HashSet<MAbstractComponent>();
		
		if (component == null)
		{
			return components;
		}
		
		for (Iterator<MAbstractComponent> c = component.getInherits().iterator(); c.hasNext(); )
		{
			MAbstractComponent item = c.next();
			components.add(item);
			components.addAll(getInheritedComponents(item));
		}
		
		return components;
	}
	
	/**
	 * Returns the set of libraries inherited by a given library.
	 * @param library The library.
	 * @return The set of inherited components. If the component parameter is
	 * 		   null, it returns an empty list.
	 */
	@Override
	public Set<MAbstractServiceLibrary> getInheritedServiceLibraries(MAbstractServiceLibrary library) {
		
		Set<MAbstractServiceLibrary> libraries = new HashSet<MAbstractServiceLibrary>();
		
		if (library == null)
		{
			return libraries;
		}
		
		for (Iterator<MAbstractServiceLibrary> s = library.getInherits().iterator(); s.hasNext(); )
		{
			MAbstractServiceLibrary item = s.next();
			libraries.add(item);
			libraries.addAll(getInheritedServiceLibraries(item));
		}
		
		return libraries;
	}

	
	@Override
	public Set<MClientPort> getInternalClientPorts(MComponent component)
	{
		Set<MClientPort> ports = new HashSet<MClientPort>();
		
		for (MPort port : component.getInternalPorts())
		{
			if (port instanceof MClientPort)
			{
				ports.add((MClientPort) port);
			}
		}
		return ports;
	}
	
	@Override
	public Set<MServerPort> getInternalServerPorts(MComponent component)
	{
		Set<MServerPort> ports = new HashSet<MServerPort>();
			
		for (MPort port : component.getInternalPorts())
		{
			if (port instanceof MServerPort)
			{
				ports.add((MServerPort) port);
			}
		}
		return ports;
	}
	
	@Override
	public Set<MServerPort> getAllServerPorts(MAbstractComponent component)
	{
		Set<MServerPort> ports = new HashSet<MServerPort>();
		
		for (MAbstractComponent parent : getInheritedComponents(component))
		{
			for (MPort port : parent.getExternalPorts())
			{
				if (port instanceof MServerPort)
				{
					ports.add((MServerPort) port);
				}
			}
		}

		for (MPort port : component.getExternalPorts())
		{
			if (port instanceof MServerPort)
			{
				ports.add((MServerPort) port);
			}
		}


		if (component instanceof MComponent)
		{
			ports.addAll(getInternalServerPorts((MComponent) component));
		}

		return ports;
	}
	
	@Override
	public Set<MClientPort> getAllClientPorts(MAbstractComponent component)
	{
		Set<MClientPort> ports = new HashSet<MClientPort>();
		
		for (MAbstractComponent parent : getInheritedComponents(component))
		{
			for (MPort port : parent.getExternalPorts())
			{
				if (port instanceof MClientPort)
				{
					ports.add((MClientPort) port);
				}
			}
		}

		for (MPort port : component.getExternalPorts())
		{
			if (port instanceof MClientPort)
			{
				ports.add((MClientPort) port);
			}
		}


		if (component instanceof MComponent) 
		{	
			ports.addAll(getInternalClientPorts((MComponent) component));
		}
		
		return ports;
	}
	
	@Override
	public Set<MServerPort> getAllExternalServerPorts(MAbstractComponent component)
	{
		Set<MServerPort> ports = new HashSet<MServerPort>();

		Set<MAbstractComponent> parentComponents = getInheritedComponents(component);
			
		for (MAbstractComponent parent : parentComponents)
		{
			for (MPort port : parent.getExternalPorts())
			{
				if (port instanceof MServerPort)
				{
					ports.add((MServerPort) port);
				}
			}
		}
		
		for (MPort port : component.getExternalPorts())
		{
			if (port instanceof MServerPort)
			{
				ports.add((MServerPort) port);
			}
		}


		return ports;
	}
	
	
	@Override
	public Set<MPort> getAllExternalPorts(MAbstractComponent component)
	{
		Set<MPort> ports = new HashSet<MPort>();
				
		for (MAbstractComponent parent : getInheritedComponents(component))
		{
			ports.addAll(parent.getExternalPorts());
		}
		ports.addAll(component.getExternalPorts());
		
		return ports;
	}
	
	@Override
	public Set<MClientPort> getAllExternalClientPorts(MAbstractComponent component)
	{
		Set<MClientPort> ports = new HashSet<MClientPort>();
		
		for (MAbstractComponent parent : getInheritedComponents(component))
		{			
			for (MPort port : parent.getExternalPorts())
			{
				if (port instanceof MClientPort)
				{
					ports.add((MClientPort) port);
				}
			}

		}

		for (MPort port : component.getExternalPorts())
		{
			if (port instanceof MClientPort)
			{
				ports.add((MClientPort) port);
			}
		}

		return ports;
	}
		
	@Override
	public MMCADeployment getDeploymentRoot(MDeploymentAlternative alternative)
	{
		if (alternative.eContainer() instanceof MMCADeployment)
		{
			return (MMCADeployment)alternative.eContainer();
		}
		return getDeploymentRoot((MDeploymentAlternative)alternative.eContainer());
	}
	
	@Override
	public MMCADeployment getDeploymentRoot(MComponentInstance instance)
	{
		if (instance.eContainer() instanceof MMCADeployment)
		{
			return (MMCADeployment)instance.eContainer();
		}
		return getDeploymentRoot((MDeploymentAlternative)instance.eContainer());
	}
	
	@Override
	public Set<MComponentType> getAllComponentTypes(MIODomain domain)
	{
		Set<MComponentType> ctypes = new HashSet<MComponentType>();
		ctypes.addAll(domain.getComponentTypes());
		
		for (MIODomain piod : domain.getInherits())
		{
			ctypes.addAll(getAllComponentTypes(piod));
		}
		
		return ctypes;
	}
	
	@Override
	public Set<MExchangeModel> getAllExchangeModels(MIODomain domain)
	{
		Set<MExchangeModel> ems = new HashSet<MExchangeModel>();
		ems.addAll(domain.getExchangeModels());
		
		for (MIODomain piod : domain.getInherits())
		{
			ems.addAll(getAllExchangeModels(piod));
		}
		
		return ems;
	}
	
	@Override
	public Set<MConnector> getAllConnectors(MIODomain domain)
	{
		Set<MConnector> conns = new HashSet<MConnector>();
		conns.addAll(domain.getConnectors());
		
		for (MIODomain piod : domain.getInherits())
		{
			conns.addAll(getAllConnectors(piod));
		}
		
		return conns;
	}
	
	@Override
	public Set<MConnector> getAllConnectors(MAODomain domain)
	{
		Set<MConnector> conns = new HashSet<MConnector>();
		conns.addAll(domain.getConnectors());
		
		for (MAODomain piod : domain.getInherits())
		{
			conns.addAll(getAllConnectors(piod));
		}
		
		return conns;
	}
	
	@Override
	public Set<MPortType> getAllPortTypes(MIODomain domain)
	{
		Set<MPortType> ptypes = new HashSet<MPortType>();
		ptypes.addAll(domain.getPortTypes());
		
		for (MIODomain piod : domain.getInherits())
		{
			ptypes.addAll(getAllPortTypes(piod));
		}
		
		return ptypes;
	}
	
	@Override
	public Set<MInterfaceType> getAllInterfaceTypes(MIODomain domain)
	{
		Set<MInterfaceType> itypes = new HashSet<MInterfaceType>();
		itypes.addAll(domain.getInterfaceTypes());
		
		for (MIODomain piod : domain.getInherits())
		{
			itypes.addAll(getAllInterfaceTypes(piod));
		}
		
		return itypes;
	}
	
	@Override
	public Set<MInterfaceType> getAllInterfaceTypes(MAODomain domain)
	{
		Set<MInterfaceType> itypes = new HashSet<MInterfaceType>();
		itypes.addAll(domain.getInterfaceTypes());
		
		for (MAODomain paod : domain.getInherits())
		{
			itypes.addAll(getAllInterfaceTypes(paod));
		}
		
		return itypes;
	}
	
	@Override
	public Set<MPortType> getAllPortTypes(MAODomain domain)
	{
		Set<MPortType> ptypes = new HashSet<MPortType>();
		ptypes.addAll(domain.getPortTypes());
		
		for (MAODomain paod : domain.getInherits())
		{
			ptypes.addAll(getAllPortTypes(paod));
		}
		
		return ptypes;
	}
	
	@Override
	public Set<MComponentType> getAllComponentTypes(MAODomain domain)
	{
		Set<MComponentType> ctypes = new HashSet<MComponentType>();
		ctypes.addAll(domain.getComponentTypes());
		
		for (MAODomain paod : domain.getInherits())
		{
			ctypes.addAll(getAllComponentTypes(paod));
		}
		
		return ctypes;
	}

	@Override
	public MMCADeployment getDeploymentRoot(MConnection connection)
	{
		if (connection.eContainer() instanceof MMCADeployment)
		{
			return (MMCADeployment)connection.eContainer();
		}
		return getDeploymentRoot((MDeploymentAlternative)connection.eContainer());
	}

	@Override
	public Set<MParameter> getAllAttributes(MComponentType componentType) {
		
		Set<MParameter> attributes = new HashSet<MParameter>();

		Set<MComponentType> componentTypes = getInheritedComponentTypes(componentType);
		componentTypes.add(componentType);
		
		for (MComponentType type : componentTypes)
		{	
				attributes.addAll(type.getAttributes());
		}
		return attributes;	
	}
	
	@Override
	public Set<MParameter> getAllServerPortAttributes(MPortType portType) {
		
		Set<MParameter> attributes = getServerPortAttributes(portType);
		
		for (MPortType ipt : portType.getInherits())
		{
			attributes.addAll(getAllServerPortAttributes(ipt));
		}
		return attributes;	

	}

	@Override
	public Set<MParameter> getAllAttributes(MServerPort port) {
		
		return getAllServerPortAttributes(port.getType());
	}
	
	@Override
	public Set<MParameter> getClientPortAttributes(MPortType portType) {
		
		Set<MParameter> attributes = new HashSet<MParameter>();

		for (MParameter attribute : portType.getAttributes())
		{
			if (!(attribute instanceof MEnumParameterDefinition))
			{
				attributes.add(attribute);
			}
		}
		for (MParameter attribute : portType.getClientAttributes())
		{
			if (!(attribute instanceof MEnumParameterDefinition))
			{
				attributes.add(attribute);
			}
		}
		
		return attributes;
		
	}
	
	@Override
	public Set<MParameter> getAllClientPortAttributes(MPortType portType) {
		
		Set<MParameter> attributes = getClientPortAttributes(portType);
		
		for (MPortType ipt : portType.getInherits())
		{
			attributes.addAll(getAllClientPortAttributes(ipt));
		}
		return attributes;	
	}
	
	@Override
	public Set<MParameter> getAllAttributes(MClientPort port) {
		
		return getAllClientPortAttributes(port.getType());
		
	}
	
	@Override
	public Set<MParameter> getServerPortAttributes(MPortType portType) {
		
		Set<MParameter> attributes = new HashSet<MParameter>();

		for (MParameter attribute : portType.getAttributes())
		{
			if (!(attribute instanceof MEnumParameterDefinition))
			{
				attributes.add(attribute);
			}
		}
		for (MParameter attribute : portType.getServerAttributes())
		{
			if (!(attribute instanceof MEnumParameterDefinition))
			{
				attributes.add(attribute);
			}
		}
		
		return attributes;
		
	}
	
	@Override
	public Set<MParameter> getAttributes(MConnector connector)
	{
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		for (MParameter attribute : connector.getAttributes())
		{
			if (!(attribute instanceof MEnumParameterDefinition))
			{
				attributes.add(attribute);
			}
		}
		return attributes;
	}

	@Override
	public Set<MParameter> getAllAttributes(
			MConnector connector) {

		Set<MParameter> attributes = getAttributes(connector);
		
		for (MConnector iconn : connector.getInherits())
		{
			attributes.addAll(getAllAttributes(iconn));
		}

		return attributes;
	}

	@Override
	public Set<MDeploymentAlternative> getLeafDeploymentAlternatives(MDeploymentAlternative alternative)
	{
		Set<MDeploymentAlternative> set = new HashSet<MDeploymentAlternative>();
		if (alternative.getDeploymentAlternatives().isEmpty())
		{
			set.add(alternative);
		}
		else
		{
			for (Iterator<MDeploymentAlternative> d = alternative.getDeploymentAlternatives().iterator(); d.hasNext(); )
			{
				MDeploymentAlternative alt = d.next();
				set.addAll(getLeafDeploymentAlternatives(alt));
			}
		}
		return set;		
	}
	
	@Override
	public Set<MDeploymentAlternative> getLeafDeploymentAlternatives(MMCADeployment deployment)
	{
		Set<MDeploymentAlternative> set = new HashSet<MDeploymentAlternative>();
		
		for (Iterator<MDeploymentAlternative> d = deployment.getDeploymentAlternatives().iterator(); d.hasNext(); )
		{
			MDeploymentAlternative alternative = d.next();
			set.addAll(getLeafDeploymentAlternatives(alternative));
		}
		return set;
		
	}

	@Override
	public Set<MComponentInstance> getAllComponentInstances(
			MDeploymentAlternative alternative) {
		
		Set<MComponentInstance> instances = new HashSet<MComponentInstance>();

		instances.addAll(alternative.getComponents());
		
		if (alternative.eContainer() instanceof MDeploymentAlternative)
		{
			instances.addAll(getAllComponentInstances(
					(MDeploymentAlternative)alternative.eContainer()));
		}
		else
		{
			MMCADeployment deployment = (MMCADeployment)alternative.eContainer();
			instances.addAll(deployment.getComponents());
		}
		return instances;
	}

	@Override
	public Map<MServiceLibrary, MServiceLibraryInstance> getMapAllServiceLibraryInstances(MDeploymentAlternative alternative)
	{
		Map<MServiceLibrary, MServiceLibraryInstance> resources = new HashMap<MServiceLibrary, MServiceLibraryInstance>();
		
		if (alternative.eContainer() instanceof MDeploymentAlternative)
		{
			resources.putAll(
					getMapAllServiceLibraryInstances((MDeploymentAlternative)alternative.eContainer()));
		}
		else
		{
			MMCADeployment deployment = (MMCADeployment)alternative.eContainer();
			for (MServiceLibraryInstance slinst : deployment.getLibraries())
			{
				resources.put(slinst.getLibrary(), slinst);			
			}
		}
		
		for (MServiceLibraryInstance slinst : alternative.getLibraries())
		{
			resources.put(slinst.getLibrary(), slinst);			
		}

		return resources;
	}
	
	@Override
	public Set<MServiceLibraryInstance> getAllServiceLibraryInstances(MDeploymentAlternative alternative)
	{
		return new HashSet<MServiceLibraryInstance>(getMapAllServiceLibraryInstances(alternative).values());
	}


	@Override
	public Set<MInterface> getExtendedInterfaces(MInterface iface) {
		
		Set<MInterface> ifaces = new HashSet<MInterface>();
		
		for (Iterator<MInterface> s = iface.getExtends().iterator(); s.hasNext(); )
		{
			MInterface item = s.next();
			ifaces.add(item);
			ifaces.addAll(getExtendedInterfaces(item));
		}
		
		return ifaces;
	}

	@Override
	public Set<MSAI> getAllExtendedSAIs(MSAI sai) {
		
		Set<MSAI> sais = new HashSet<MSAI>();
		
		for (Iterator<MSAI> s = sai.getExtends().iterator(); s.hasNext(); )
		{
			MSAI item = s.next();
			sais.add(item);
			sais.addAll(getAllExtendedSAIs(item));
		}
		
		return sais;
	}
	
	@Override
	public Set<MInterfaceType> getInheritedInterfaceTypes(MInterfaceType itype) {
		
		Set<MInterfaceType> sais = new HashSet<MInterfaceType>();
		
		for (Iterator<MInterfaceType> i = itype.getInherits().iterator(); i.hasNext(); )
		{
			MInterfaceType item = i.next();
			sais.add(item);
			sais.addAll(getInheritedInterfaceTypes(item));
		}
		
		return sais;
	}

	@Override
	public Set<MIODomain> getInheritedDomains(MIODomain domain) {
		
		Set<MIODomain> iods = new HashSet<MIODomain>();
		
		for (MIODomain item : domain.getInherits())
		{
			iods.add(item);
			iods.addAll(getInheritedDomains(item));
		}

		return iods;
	}

	@Override
	public Set<MAODomain> getInheritedDomains(MAODomain domain) {
		
		Set<MAODomain> aods = new HashSet<MAODomain>();
		
		for (MAODomain item : domain.getInherits())
		{
			aods.add(item);
			aods.addAll(getInheritedDomains(item));
		}

		return aods;
	}
	
	@Override
	public Set<MPortType> getInheritedPortTypes(MPortType portType) {
		
		Set<MPortType> portTypes = new HashSet<MPortType>();
		
		for (Iterator<MPortType> pt = portType.getInherits().iterator(); pt.hasNext(); )
		{
			MPortType item = pt.next();
			portTypes.add(item);
			portTypes.addAll(getInheritedPortTypes(item));
		}
		
		return portTypes;
	}
	
	@Override
	public Set<MConnector> getInheritedConnectors(MConnector connector) {
		
		Set<MConnector> connectors = new HashSet<MConnector>();
		
		for (Iterator<MConnector> pt = connector.getInherits().iterator(); pt.hasNext(); )
		{
			MConnector item = pt.next();
			connectors.add(item);
			connectors.addAll(getInheritedConnectors(item));
		}
		
		return connectors;
	}
	
	@Override
	public Set<MComponentType> getInheritedComponentTypes(MComponentType componentType) {

		Set<MComponentType> componentTypes = new HashSet<MComponentType>();
		
		if (componentType instanceof MIODAbstractComponentType)
		{
			for (Iterator<MIODAbstractComponentType> ct = ((MIODAbstractComponentType)componentType).getInherits().iterator(); ct.hasNext(); )
			{
				MIODAbstractComponentType item = ct.next();
				componentTypes.add(item);
				componentTypes.addAll(getInheritedComponentTypes(item));
			}
		}
		else if (componentType instanceof MAODComponentType)
		{
			for (Iterator<MAODComponentType> ct = ((MAODComponentType)componentType).getInherits().iterator(); ct.hasNext(); )
			{
				MAODComponentType item = ct.next();
				componentTypes.add(item);
				componentTypes.addAll(getInheritedComponentTypes(item));
			}
		}
		
		return componentTypes;
	}
	
	@Override
	public Set<MExchangeModel> getInheritedExchangeModels(MExchangeModel em) {
		
		Set<MExchangeModel> ems = new HashSet<MExchangeModel>();
		
		for (Iterator<MExchangeModel> iem = em.getInherits().iterator(); iem.hasNext(); )
		{
			MExchangeModel item = iem.next();
			ems.add(item);
			ems.addAll(getInheritedExchangeModels(item));
		}
		
		return ems;
	}

	
	@Override
	public boolean platformIntersection(MIODomainSupportedPlatform iodsp1,
			MIODomainSupportedPlatform iodsp2)
	{
		if (iodsp1.getOsapi() != null && iodsp2.getOsapi() != null &&
			iodsp1.getOsapi() != iodsp2.getOsapi())
		{
			return false;
		}
		if (iodsp1.getOs() != null && iodsp2.getOs() != null &&
			iodsp1.getOs() != iodsp2.getOs())
		{
			return false;
		}
		if (iodsp1.getArchitecture() != null && iodsp2.getArchitecture() != null &&
			iodsp1.getArchitecture() != iodsp2.getArchitecture())
		{
			return false;
		}
		if (iodsp1.getCompiler() != null && iodsp2.getCompiler() != null &&
			iodsp1.getCompiler() != iodsp2.getCompiler())
		{
			return false;
		}
		if (iodsp1.getMicroprocessor() != null && iodsp2.getMicroprocessor() != null &&
			iodsp1.getMicroprocessor() != iodsp2.getMicroprocessor())
		{
			return false;
		}
		if (iodsp1.getBoard() != null && iodsp2.getBoard() != null &&
			iodsp1.getBoard() != iodsp2.getBoard())
		{
			return false;
		}
		return true;
	}
		
	@Override
	public boolean matchesPlatform(MIODomainSupportedPlatform supportedPlatform,
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
	public boolean supportsPlatform(MIODomain iod,
			MPlatform platform) {
		
		for (MIODomainSupportedPlatform supportedPlatform : iod.getSupportedPlatforms())
		{
			if (matchesPlatform(supportedPlatform, platform) == true)
			{
				return true;
			}
		}
		return false;
	}
	
	@Override
	public MIODomainSupportedPlatform getMatchingPlatform(MIODomain iod,
			MPlatform platform) {
		
		for (MIODomainSupportedPlatform supportedPlatform : iod.getSupportedPlatforms())
		{
			if (matchesPlatform(supportedPlatform, platform))
			{
				return supportedPlatform;
			}
		}
		return null;
	}
	
	@Override
	public boolean platformIntersection(MServiceLibrarySupportedPlatform slsp1,
			MServiceLibrarySupportedPlatform slsp2)
	{
		if (slsp1.getOsapi() != null && slsp2.getOsapi() != null &&
			slsp1.getOsapi() != slsp2.getOsapi())
		{
			return false;
		}
		if (slsp1.getOs() != null && slsp2.getOs() != null &&
			slsp1.getOs() != slsp2.getOs())
		{
			return false;
		}
		if (slsp1.getArchitecture() != null && slsp2.getArchitecture() != null &&
			slsp1.getArchitecture() != slsp2.getArchitecture())
		{
			return false;
		}
		if (slsp1.getCompiler() != null && slsp2.getCompiler() != null &&
			slsp1.getCompiler() != slsp2.getCompiler())
		{
			return false;
		}
		if (slsp1.getMicroprocessor() != null && slsp2.getMicroprocessor() != null &&
			slsp1.getMicroprocessor() != slsp2.getMicroprocessor())
		{
			return false;
		}
		if (slsp1.getBoard() != null && slsp2.getBoard() != null &&
			slsp1.getBoard() != slsp2.getBoard())
		{
			return false;
		}
		return true;
	}
		
	@Override
	public boolean matchesPlatform(MServiceLibrarySupportedPlatform supportedPlatform,
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
	public boolean supportsPlatform(MServiceLibrary slib,
			MPlatform platform) {
		
		for (MServiceLibrarySupportedPlatform supportedPlatform : slib.getSupportedPlatforms())
		{
			if (matchesPlatform(supportedPlatform, platform) == true)
			{
				return true;
			}
		}
		return false;
	}
	
	@Override
	public MServiceLibrarySupportedPlatform getMatchingPlatform(MServiceLibrary slib,
			MPlatform platform) {
		
		for (MServiceLibrarySupportedPlatform supportedPlatform : slib.getSupportedPlatforms())
		{
			if (matchesPlatform(supportedPlatform, platform))
			{
				return supportedPlatform;
			}
		}
		return null;
	}
	
	@Override
	public boolean platformIntersection(MComponentSupportedPlatform cmpsp1,
			MComponentSupportedPlatform cmpsp2)
	{
		if (cmpsp1.getOsapi() != null && cmpsp2.getOsapi() != null &&
			cmpsp1.getOsapi() != cmpsp2.getOsapi())
		{
			return false;
		}
		if (cmpsp1.getOs() != null && cmpsp2.getOs() != null &&
			cmpsp1.getOs() != cmpsp2.getOs())
		{
			return false;
		}
		if (cmpsp1.getArchitecture() != null && cmpsp2.getArchitecture() != null &&
			cmpsp1.getArchitecture() != cmpsp2.getArchitecture())
		{
			return false;
		}
		if (cmpsp1.getCompiler() != null && cmpsp2.getCompiler() != null &&
			cmpsp1.getCompiler() != cmpsp2.getCompiler())
		{
			return false;
		}
		if (cmpsp1.getMicroprocessor() != null && cmpsp2.getMicroprocessor() != null &&
			cmpsp1.getMicroprocessor() != cmpsp2.getMicroprocessor())
		{
			return false;
		}
		if (cmpsp1.getBoard() != null && cmpsp2.getBoard() != null &&
			cmpsp1.getBoard() != cmpsp2.getBoard())
		{
			return false;
		}
		return true;
	}
		
	@Override
	public boolean matchesPlatform(MComponentSupportedPlatform supportedPlatform,
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
	public boolean matchesPlatform(MComponentSupportedPlatform csp,
			MComponentSupportedPlatform csplt)
	{
		// We have to check that, either the field of the supported
		// platform is null or, if it is not, it is defined in both
		// platforms and it is the same

		if (csp.getOsapi() != null && 
			csp.getOsapi() != csplt.getOsapi() &&
			getInheritedOSAPIs(csplt.getOsapi()).contains(csp.getOsapi()) == false)
		{
			return false;
		}
		if (csp.getOs() != null &&
			csp.getOs() != csplt.getOs() &&
			getInheritedOperatingSystems(csplt.getOs()).contains(csp.getOs()) == false)
		{
			return false;
		}
		if (csp.getArchitecture() != null &&
			csp.getArchitecture() != csplt.getArchitecture())
		{
			return false;
		}
		if (csp.getCompiler() != null &&
			csp.getCompiler() != csplt.getCompiler() &&
			getExtendedCompilers(csplt.getCompiler()).contains(csp.getCompiler()) == false)
		{
			return false;
		}
		if (csp.getMicroprocessor() != null &&
			csp.getMicroprocessor() != csplt.getMicroprocessor())
		{
			return false;
		}
		if (csp.getBoard() != null &&
			csp.getBoard() != csplt.getBoard())
		{
			return false;
		}
		return true;
	}
	
	@Override
	public boolean supportsPlatform(MComponent cmp,
			MComponentSupportedPlatform csp) {
		
		for (MComponentSupportedPlatform supportedPlatform : cmp.getSupportedPlatforms())
		{
			if (matchesPlatform(supportedPlatform, csp) == true)
			{
				return true;
			}
		}
		return false;
	}


	@Override
	public boolean supportsPlatform(MComponent cmp,
			MPlatform platform) {
		
		for (MComponentSupportedPlatform supportedPlatform : cmp.getSupportedPlatforms())
		{
			if (matchesPlatform(supportedPlatform, platform) == true)
			{
				return true;
			}
		}
		return false;
	}
	
	@Override
	public MComponentSupportedPlatform getMatchingPlatform(MComponent cmp,
			MPlatform platform) {
		
		for (MComponentSupportedPlatform supportedPlatform : cmp.getSupportedPlatforms())
		{
			if (matchesPlatform(supportedPlatform, platform))
			{
				return supportedPlatform;
			}
		}
		return null;
	}
	
	@Override
	public MComponentSupportedPlatform getMatchingPlatform(MComponent cmp,
			MComponentSupportedPlatform csplt) {
		

		for (MComponentSupportedPlatform supportedPlatform : cmp.getSupportedPlatforms())
		{
			if (matchesPlatform(supportedPlatform, csplt))
			{
				return supportedPlatform;
			}
		}
		return null;
	}
	
	@Override
	public Set<MSAI> getAllProvidedSAIs(MAbstractServiceLibrary aslib)
	{
		Set<MSAI> sais = new HashSet<MSAI>();

		for (MServiceLibraryProvidedSAI psai : aslib.getProvides())
		{
			sais.add(psai.getSai());
			sais.addAll(getAllExtendedSAIs(psai.getSai()));
		}

		
		for (MAbstractServiceLibrary parent : aslib.getInherits())
		{
			sais.addAll(getAllProvidedSAIs(parent));
		}
		
		if (aslib instanceof MServiceLibrary)
		{
			for (MServiceLibrary extended : ((MServiceLibrary)aslib).getExtends())
			{
				sais.addAll(getAllProvidedSAIs(extended));
			}
		}
		
		return sais;
	}
	
	@Override
	public Set<MSAI> getAllRequiredSAIs(MSAI sai)
	{
		Set<MSAI> sais = new HashSet<MSAI>();
		
		for (MSAI required : sai.getRequires())
		{
			for (MSAI extended : getAllExtendedSAIs(required))
			{
				sais.addAll(extended.getRequires());
			}
			sais.add(required);
		}
		sais.addAll(sai.getRequires());
		
		return sais;
	}

	@Override
	public boolean isRelayPort(MComponent component, MClientPort port) {
		
		for (MInternalConnection connection : component.getConnections())
		{
			if (connection instanceof MInternalComponentConnection)
			{
				MInternalComponentConnection icnx = (MInternalComponentConnection) connection;
				if (icnx.getClientInstance() == null &&
					icnx.getServerInstance() == null &&
					icnx.getConnector() == null &&
					icnx.getClientPort() == port)
				{
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public MEnumParameterLiteral parseEnumExpression(
			MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments)
			throws IllegalArgumentException {
		return MICOBSUtil.parseEnumExpression(self, assignments);
	}

	@Override
	public MEnumParameterLiteral parseEnumExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseEnumExpression(expression, resolver);
	}

	@Override
	public MEnumParameterLiteral parseEnumExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseEnumExpression(pva, resolver);
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
	public Boolean parseBooleanExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseBooleanExpression(pva, resolver);
	}

	@Override
	public MEnumParameterLiteral parseEnumExpression(
			MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseEnumExpression(term, resolver);
	}

	@Override
	public Long parseIntegerExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseIntegerExpression(pva, resolver);
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
	public String parseStringExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException {
		return MICOBSUtil.parseStringExpression(pva, resolver);
	}

	@Override
	public Float parseRealExpression(MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseRealExpression(term, resolver);
	}

	@Override
	public Float parseRealExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException {
		return MICOBSUtil.parseRealExpression(pva, resolver);
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
		return PDLUtil.getAllEnumParameterDefinitions(os);
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
			MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException {
		return PDLUtil.parseEnumExpression(self, assignments, platform);
	}

	@Override
	public Boolean parseBooleanExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException {
		return PDLUtil.parseBooleanExpression(expression, assignments, platform);
	}

	@Override
	public String parseStringExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException {
		return PDLUtil.parseStringExpression(expression, assignments, platform);
	}

	@Override
	public Long parseIntegerExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException {
		return PDLUtil.parseIntegerExpression(expression, assignments, platform);
	}

	@Override
	public Float parseRealExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException {
		return PDLUtil.parseRealExpression(expression, assignments, platform);
	}
	
	@Override
	public MPlatform toPlatform(MOperatingSystemAPI osapi, MOperatingSystem os,
			MOSSupportedPlatform ossp) {
		return PDLUtil.toPlatform(osapi, os, ossp);
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
	public MParameterValueExpression getParameterValue(
			MParameterValueAssignment assignment, MPlatform platform) {
		return PDLUtil.getParameterValue(assignment, platform);
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
	public MParameterRange getRange(MParameter parameter)
			throws IllegalArgumentException {
		return MICOBSUtil.getRange(parameter);
	}

	@Override
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(
			MOperatingSystem os, MOperatingSystemAPI osapi) {
		return PDLUtil.getMapAllParameterValueAssignments(os, osapi);
	}

	@Override
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(
			MOperatingSystem os, MOperatingSystemAPI osapi) {
		return PDLUtil.getAllParameterValueAssignments(os, osapi);
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

	@Override
	public Set<MEnumParameterDefinition> getEnumAttributeDefinitions(MComponentSupportedPlatform csp) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : csp.getAttributes())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}

		
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getAllEnumAttributeDefinitions(MAbstractComponent acmp) {
		
		Set<MEnumParameterDefinition> defs = getEnumAttributeDefinitions(acmp);
		
		for (MAbstractComponent pacmp : acmp.getInherits())
		{
			defs.addAll(getAllEnumAttributeDefinitions(pacmp));
		}
		return defs;
	}
	
	@Override
	public Set<MEnumParameterDefinition> getEnumAttributeDefinitions(MAbstractComponent acmp) {
		
		Set<MEnumParameterDefinition> defs = new HashSet<MEnumParameterDefinition>();
		
		for (MParameter param : acmp.getAttributes())
		{
			if (param instanceof MEnumParameterDefinition)
			{
				defs.add((MEnumParameterDefinition) param);
			}
		}
		return defs;
	}
	
	@Override
	public MPlatform toPlatform(MComponentSupportedPlatform csp)
	{
		MPlatform platform = pdlFactory.eINSTANCE.createMPlatform();
		platform.setOsapi(csp.getOsapi());
		platform.setOs(csp.getOs());
		platform.setArchitecture(csp.getArchitecture());
		platform.setCompiler(csp.getCompiler());
		platform.setMicroprocessor(csp.getMicroprocessor());
		platform.setBoard(csp.getBoard());
		
		return platform;
	}

	@Override
	public MInterface getInterface(String uri, String version) {
		try
		{
			MCommonPackageElement element =
				MCLEVLibraryManager.getLibraryManager().getElement(
						mclevifacePackage.eINSTANCE.getMInterface(),
						uri, version);
			if (element instanceof MInterface)
			{
				return (MInterface) element;
			}
		} catch (LibraryManagerException e) {
			MICOBSPlugin.INSTANCE.log(e);
		}
		return null;
	}
	
	@Override
	public MSAI getSAI(String uri, String version) {
		try
		{
			MCommonPackageElement element =
				MCLEVLibraryManager.getLibraryManager().getElement(
						mclevsaiPackage.eINSTANCE.getMSAI(),
						uri, version);
			if (element instanceof MSAI)
			{
				return (MSAI) element;
			}
		} catch (LibraryManagerException e) {
			MICOBSPlugin.INSTANCE.log(e);
		}
		return null;
	}
	
	@Override
	public MComponent getComponent(String uri, String version) {
		try
		{
			MCommonPackageElement element =
				MCLEVLibraryManager.getLibraryManager().getElement(
						mclevcmpPackage.eINSTANCE.getMComponent(),
						uri, version);
			if (element instanceof MComponent)
			{
				return (MComponent) element;
			}
		} catch (LibraryManagerException e) {
			MICOBSPlugin.INSTANCE.log(e);
		}
		return null;
	}
	
	@Override
	public MMCLEVPackage getMCLEVPackage(String uri) {
		try
		{
			MCommonPackage _package =
				MCLEVLibraryManager.getLibraryManager().getPackage(uri);
			if (_package instanceof MMCLEVPackage)
			{
				return (MMCLEVPackage) _package;
			}
		} catch (LibraryManagerException e) {
			MICOBSPlugin.INSTANCE.log(e);
		}
		return null;
	}

	@Override
	public MSystemPackage getSystemPackage(String uri) {
		return MICOBSUtil.getSystemPackage(uri);
	}
	
}
