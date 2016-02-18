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
package es.uah.aut.srg.micobs.mclev.lang.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.diagnostic.CheckingDiagnostic;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitch;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentPlatformSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalConnection;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalClientPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalServerPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalClientPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalServerPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mclevdom.adapter.DomainAdapter;
import es.uah.aut.srg.micobs.mclev.mclevdom.adapter.DomainAdapterFactory;
import es.uah.aut.srg.micobs.mclev.mclevdom.checkers.IComponentChecker;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.pdlFactory;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.util.IParameterAssignmentResolver;
import es.uah.aut.srg.micobs.xtext.MICOBSAbstractJavaValidator;
import es.uah.aut.srg.modeling.util.string.StringHelper;
 

public class CMPJavaValidator extends MICOBSAbstractJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/common"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/mclevcmp"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/mclevcommon"));
		return result;
	}
	
	@Override
	public ILibraryManager getFileLibraryManager()
			throws LibraryManagerException {
		return MCLEVLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(MCLEVLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
	public static final String IMPROPER_CMPSUPPORTEDPLATFORM_NAME = "0";
	
	/**
	 * Checks that the name of a supported platform of a component conforms to
	 * the naming standard. It produces a warning otherwise.
	 * @param csp the component supported platform to check.
	 */
	@Check
	public void checkMComponentSupportedPlatform_Naming(MComponentSupportedPlatform csp) {
		
		if (csp.getName() != null &&
			MCLEVStringHelper.getDefault().getProperName(csp) != null &&
			csp.getName().matches(MCLEVStringHelper.getDefault().getProperName(csp)) == false)
		{
			warning("Supported Platform name does not match the recommended one",
				    commonPackage.eINSTANCE.getMCommonReferenceableObj_Name(),
				    IMPROPER_CMPSUPPORTEDPLATFORM_NAME,
				    csp.getName(),
				    MCLEVStringHelper.getDefault().getProperName(csp));
		}
		
	}
	
	/**
	 * This function executes the extended restrictions to a component that
	 * are defined by the corresponding domain. Their source object is obtained
	 * through the installed adapter that implements the extended interface.
	 * @param acmp the component to check.
	 */
	@Check
	public void checkMComponent_extendedRestrictions(MAbstractComponent acmp)
	{
		if (acmp.getDomain() == null ||
			acmp.getDomain().eIsProxy() == true ||
			acmp.getType() == null ||
			acmp.getType().eIsProxy() == true)
		{
			return;
		}
		DomainAdapter adapter = DomainAdapterFactory.getAdapterFactory().getAdapter(acmp.getDomain());
		
		if (adapter != null && 
			adapter.isAdapterForType(IComponentChecker.class))
		{
			IComponentChecker checker = (IComponentChecker) adapter.adapt(IComponentChecker.class);
			if (checker == null)
			{
				return;
			}
			CheckingDiagnostic diagnostic;
			
			diagnostic = checker.portChecking(acmp);
			if (diagnostic.isWarning())
			{
				warning(diagnostic.getMessage(), diagnostic.getFeature());
			}
			else if (diagnostic.isError())
			{
				error(diagnostic.getMessage(), diagnostic.getFeature());
			}
			
			if (acmp instanceof MComponent)
			{
				diagnostic = checker.instanceChecking((MComponent) acmp);
				if (diagnostic.isWarning())
				{
					warning(diagnostic.getMessage(), diagnostic.getFeature());
				}
				else if (diagnostic.isError())
				{
					error(diagnostic.getMessage(), diagnostic.getFeature());
				}
				
				diagnostic = checker.connectionChecking((MComponent) acmp);
				if (diagnostic.isWarning())
				{
					warning(diagnostic.getMessage(), diagnostic.getFeature());
				}
				else if (diagnostic.isError())
				{
					error(diagnostic.getMessage(), diagnostic.getFeature());
				}
			}
			
			diagnostic = checker.validateComponent(acmp);
			if (diagnostic.isWarning())
			{
				warning(diagnostic.getMessage(), diagnostic.getFeature());
			}
			else if (diagnostic.isError())
			{
				error(diagnostic.getMessage(), diagnostic.getFeature());
			}
		}
	}
	
	/**
	 * Parameterized Restriction 132-133. Checks that the type of an interface
	 * deployed by a port matches with the types supported by the type of
	 * port.
	 * @param port the port to check. 
	 */
	@Check
	public void checkMPort_ValidInterfaceType(MPort port)
	{
		if (port.getType() == null ||
			port.getType().eIsProxy() == true ||
			port.getInterface() == null ||
			port.getInterface().eIsProxy() == true)
		{
			return;
		}
		boolean found = false;
		for (MInterfaceType itype : MCLEVUtil.getDefault().getAllInterfaceTypes(port.getType()))
		{
			if (itype == port.getInterface().getType() ||
				MCLEVUtil.getDefault().getInheritedInterfaceTypes(itype).contains(port.getInterface().getType()))
			{
				found = true;
				break;
			}
		}
		if (found == false)
		{
			error("Port type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(port.getType()) +
				  " does not supported an interface of type " +
				  MCLEVStringHelper.getDefault().getFullObjectNameToElement(port.getInterface().getType()),
				  mclevcmpPackage.eINSTANCE.getMPort_Interface());
		}
	}
	
	/**
	 * Parameterized Restriction 134. Checks that the types of the client and
	 * source ports of an internal component connection are supported by the
	 * selected connector.
	 * @param icnx the internal component connection.
	 */
	@Check
	public void checkMInternalComponentConnection_ConnectorSupport(MInternalComponentConnection icnx)
	{
		if (icnx.getClientPort() == null ||
			icnx.getClientPort().eIsProxy() == true ||
			icnx.getClientPort().getType() == null ||
			icnx.getClientPort().getType().eIsProxy() == true ||
			icnx.getServerPort() == null ||
			icnx.getServerPort().eIsProxy() == true ||
			icnx.getServerPort().getType() == null ||
			icnx.getServerPort().getType().eIsProxy() == true ||
			icnx.getConnector() == null ||
			icnx.getConnector().eIsProxy() == true)
		{
			return;
		}
		boolean found = false;
		for (MPortType ptype : MCLEVUtil.getDefault().getAllClientPortTypes(icnx.getConnector()))
		{
			if (ptype == icnx.getClientPort().getType() ||
				MCLEVUtil.getDefault().getInheritedPortTypes(ptype).contains(icnx.getClientPort().getType()))
			{
				found = true;
				break;
			}
		}
		if (found == false)
		{
			error("The port type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(icnx.getClientPort().getType()) +
				  " in a client role is not supported by the connector " +
				  MCLEVStringHelper.getDefault().getFullObjectNameToElement(icnx.getConnector()),
				  mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_Connector());
		}
		
		found = false;
		for (MPortType ptype : MCLEVUtil.getDefault().getAllServerPortTypes(icnx.getConnector()))
		{
			if (ptype == icnx.getServerPort().getType() ||
				MCLEVUtil.getDefault().getInheritedPortTypes(ptype).contains(icnx.getServerPort().getType()))
			{
				found = true;
				break;
			}
		}
		if (found == false)
		{
			error("The port type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(icnx.getServerPort().getType()) +
				  " in a server role is not supported by the connector " +
				  MCLEVStringHelper.getDefault().getFullObjectNameToElement(icnx.getConnector()),
				  mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_Connector());
		}
		
	}
	
	
	/**
	 * Parameterized Restriction 135. Checks that the types of the client and
	 * source ports of an internal component platform switch connection are
	 * supported by the selected connector.
	 * @param icnx the internal component connection.
	 */
	@Check
	public void checkMInternalComponentPlatformSwitch_ConnectorSupport(MInternalComponentPlatformSwitch icnx)
	{
		if (icnx.getClientPort() != null &&
			icnx.getClientPort().eIsProxy() == false ||
			icnx.getClientPort().getType() != null &&
			icnx.getClientPort().getType().eIsProxy() == false)
		{
			for (MInternalComponentPlatformSwitchCase pcase : icnx.getCases())
			{
				if (pcase.getServerPort() == null ||
					pcase.getServerPort().eIsProxy() == true ||
					pcase.getServerPort().getType() == null ||
					pcase.getServerPort().getType().eIsProxy() == true ||
					pcase.getConnector() == null ||
					pcase.getConnector().eIsProxy() == true)
				{
					continue;
				}
				
				boolean found = false;
				for (MPortType ptype : MCLEVUtil.getDefault().getAllClientPortTypes(pcase.getConnector()))
				{
					if (ptype == icnx.getClientPort().getType() ||
						MCLEVUtil.getDefault().getInheritedPortTypes(ptype).contains(icnx.getClientPort().getType()))
					{
						found = true;
						break;
					}
				}
				if (found == false)
				{
					error("The port type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(icnx.getClientPort().getType()) +
						  " in a client role is not supported by the connector " +
						  MCLEVStringHelper.getDefault().getFullObjectNameToElement(pcase.getConnector()),
						  pcase,
						  mclevcmpPackage.eINSTANCE.getMInternalComponentPlatformSwitchCase_Connector(), -1);
				}
				
				found = false;
				for (MPortType ptype : MCLEVUtil.getDefault().getAllServerPortTypes(pcase.getConnector()))
				{
					if (ptype == pcase.getServerPort().getType() ||
						MCLEVUtil.getDefault().getInheritedPortTypes(ptype).contains(pcase.getServerPort().getType()))
					{
						found = true;
						break;
					}
				}
				if (found == false)
				{
					error("The port type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(pcase.getServerPort().getType()) +
						  " in a server role is not supported by the connector " +
						  MCLEVStringHelper.getDefault().getFullObjectNameToElement(pcase.getConnector()),
						  pcase,
						  mclevcmpPackage.eINSTANCE.getMInternalComponentPlatformSwitchCase_Connector(), -1);
				}
			}
		}
	}
	
	/**
	 * Parameterized Restriction 136-139. Checks that the ports deployed by a
	 * component are consistent with the restrictions eventually defined by the
	 * domain to which the component belongs.
	 * @param acmp the component to check.
	 */
	@Check
	public void checkMAbstractComponent_PortInstances(MAbstractComponent acmp)
	{
		if (acmp.getDomain() == null ||
			acmp.getDomain().eIsProxy() == true ||
			acmp.getType() == null ||
			acmp.getType().eIsProxy() == true)
		{
			return;
		}
		
		final Map<MParameter, MParameterValueAssignment> assignments = new HashMap<MParameter, MParameterValueAssignment>();
		
		for (MParameterValueAssignment va : acmp.getAttributeValueAssignments())
		{
			assignments.put(va.getParameter(), va);
		}
		
		IParameterAssignmentResolver resolver = new IParameterAssignmentResolver() {
			
			@Override
			public MParameter getParameter() {
				return null;
			}
			
			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (assignments.get(parameter) == null) ? null :
						util.getParameterValue(assignments.get(parameter));
			}
		};
		
		Map<MPortType, Integer> clientOccurrences = new HashMap<MPortType, Integer>();
		Map<MPortType, Integer> serverOccurrences = new HashMap<MPortType, Integer>();
		
		for (MPort port : MCLEVUtil.getDefault().getAllExternalPorts(acmp))
		{
			if (port.getType() == null ||
				port.getType().eIsProxy() == true)
			{
				continue;
			}
			if (port instanceof MClientPort)
			{
				Integer times = clientOccurrences.get(port.getType());
				if (times == null)
				{
					times = new Integer(1);
				}
				else
				{
					times++;
				}
				clientOccurrences.put(port.getType(), times);
			}
			else
			{
				Integer times = serverOccurrences.get(port.getType());
				if (times == null)
				{
					times = new Integer(1);
				}
				else
				{
					times++;
				}
				serverOccurrences.put(port.getType(), times);
			}
		}
		for (MPortType ptype : MCLEVUtil.getDefault().getAllExternalClientPortTypeInstances(acmp.getType()).keySet())
		{
			Integer times;
			Long lowerBound, upperBound;

			MExternalClientPortTypeInstance ecpti = MCLEVUtil.getDefault().getAllExternalClientPortTypeInstances(acmp.getType()).get(ptype);
			
			try {
				lowerBound = MCLEVUtil.getDefault().parseIntegerExpression(ecpti.getLowerBound(), resolver);
				upperBound = MCLEVUtil.getDefault().parseIntegerExpression(ecpti.getUpperBound(), resolver);
			} catch (NumberFormatException e)
			{
				error(e.getMessage(),
						mclevcmpPackage.eINSTANCE.getMAbstractComponent_ExternalPorts());
				return;
			}  catch (IllegalArgumentException e)
			{
				error(e.getMessage(),
						mclevcmpPackage.eINSTANCE.getMAbstractComponent_ExternalPorts());
				return;
			}

			if ((times = clientOccurrences.get(ptype)) != null)
			{
				if (times < lowerBound)
				{
					error("Number of external client ports of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ptype) +
						  " must be at least " + ecpti.getLowerBound() + " for this type of component",
						  mclevcmpPackage.eINSTANCE.getMAbstractComponent_ExternalPorts());
				}
				else if (upperBound != -1 && times > upperBound)
				{
					error("Number of external client ports of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ptype) +
						  " exceeded for this type of component", mclevcmpPackage.eINSTANCE.getMAbstractComponent_ExternalPorts());
				}
			}
			else
			{
				if (lowerBound > 0)
				{
					error("Number of external client ports of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ptype) +
						  " must be at least " + ecpti.getLowerBound() + " for this type of component",
						  mclevcmpPackage.eINSTANCE.getMAbstractComponent_ExternalPorts());
				}
			}	
		}
		for (MPortType ptype : MCLEVUtil.getDefault().getAllExternalServerPortTypeInstances(acmp.getType()).keySet())
		{
			Integer times;
			
			Long lowerBound, upperBound;

			MExternalServerPortTypeInstance espti = MCLEVUtil.getDefault().getAllExternalServerPortTypeInstances(acmp.getType()).get(ptype);
			
			try {
				lowerBound = MCLEVUtil.getDefault().parseIntegerExpression(espti.getLowerBound(), resolver);
				upperBound = MCLEVUtil.getDefault().parseIntegerExpression(espti.getUpperBound(), resolver);
			} catch (NumberFormatException e)
			{
				error(e.getMessage(),
						mclevcmpPackage.eINSTANCE.getMAbstractComponent_ExternalPorts());
				return;
			}  catch (IllegalArgumentException e)
			{
				error(e.getMessage(),
						mclevcmpPackage.eINSTANCE.getMAbstractComponent_ExternalPorts());
				return;
			}
			
			if ((times = serverOccurrences.get(ptype)) != null)
			{
				if (times < lowerBound)
				{
					error("Number of external server ports of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ptype) +
						  " must be at least " + espti.getLowerBound() + " for this type of component",
						  mclevcmpPackage.eINSTANCE.getMAbstractComponent_ExternalPorts());
				}
				else if (upperBound != -1 && times > upperBound)
				{
					error("Number of external server ports of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ptype) +
						  " exceeded for this type of component", mclevcmpPackage.eINSTANCE.getMAbstractComponent_ExternalPorts());
				}
			}
			else
			{
				MExternalServerPortTypeInstance ecpti = MCLEVUtil.getDefault().getAllExternalServerPortTypeInstances(acmp.getType()).get(ptype);
				if (lowerBound > 0)
				{
					error("Number of external server ports of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ptype) +
						  " must be at least " + ecpti.getLowerBound() + " for this type of component",
						  mclevcmpPackage.eINSTANCE.getMAbstractComponent_ExternalPorts());
				}
			}	
		}
		
		if (acmp instanceof MComponent)
		{
			MComponent cmp = (MComponent)acmp;
			
			for (MPort port : cmp.getInternalPorts())
			{
				if (port.getType() == null ||
					port.getType().eIsProxy() == true)
				{
					continue;
				}
				if (port instanceof MClientPort)
				{
					Integer times = clientOccurrences.get(port.getType());
					if (times == null)
					{
						times = new Integer(1);
					}
					else
					{
						times++;
					}
					clientOccurrences.put(port.getType(), times);
				}
				else
				{
					Integer times = serverOccurrences.get(port.getType());
					if (times == null)
					{
						times = new Integer(1);
					}
					else
					{
						times++;
					}
					serverOccurrences.put(port.getType(), times);
				}
			}
			for (MPortType ptype : MCLEVUtil.getDefault().getAllInternalClientPortTypeInstances(cmp.getType()).keySet())
			{
				Integer times;
				
				Long lowerBound, upperBound;

				MInternalClientPortTypeInstance icpti = MCLEVUtil.getDefault().getAllInternalClientPortTypeInstances(cmp.getType()).get(ptype);

				try {
					lowerBound = MCLEVUtil.getDefault().parseIntegerExpression(icpti.getLowerBound(), resolver);
					upperBound = MCLEVUtil.getDefault().parseIntegerExpression(icpti.getUpperBound(), resolver);
				} catch (NumberFormatException e)
				{
					error(e.getMessage(),
							mclevcmpPackage.eINSTANCE.getMComponent_InternalPorts());
					return;
				}  catch (IllegalArgumentException e)
				{
					error(e.getMessage(),
							mclevcmpPackage.eINSTANCE.getMComponent_InternalPorts());
					return;
				}
				
				if ((times = clientOccurrences.get(ptype)) != null)
				{
					if (times < lowerBound)
					{
						error("Number of internal client ports of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ptype) +
							  " must be at least " + icpti.getLowerBound() + " for this type of component",
							  mclevcmpPackage.eINSTANCE.getMComponent_InternalPorts());
					}
					else if (upperBound != -1 && times > upperBound)
					{
						error("Number of internal client ports of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ptype) +
							  " exceeded for this type of component", mclevcmpPackage.eINSTANCE.getMComponent_InternalPorts());
					}
				}
				else
				{
					if (lowerBound > 0)
					{
						error("Number of external client ports of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ptype) +
							  " must be at least " + icpti.getLowerBound() + " for this type of component",
							  mclevcmpPackage.eINSTANCE.getMComponent_InternalPorts());
					}
				}	
			}
			for (MPortType ptype : MCLEVUtil.getDefault().getAllInternalServerPortTypeInstances(cmp.getType()).keySet())
			{
				Integer times;

				Long lowerBound, upperBound;
				
				MInternalServerPortTypeInstance ispti = MCLEVUtil.getDefault().getAllInternalServerPortTypeInstances(cmp.getType()).get(ptype);

				try {
					lowerBound = MCLEVUtil.getDefault().parseIntegerExpression(ispti.getLowerBound(), resolver);
					upperBound = MCLEVUtil.getDefault().parseIntegerExpression(ispti.getUpperBound(), resolver);
				} catch (NumberFormatException e)
				{
					error(e.getMessage(),
							mclevcmpPackage.eINSTANCE.getMComponent_InternalPorts());
					return;
				}  catch (IllegalArgumentException e)
				{
					error(e.getMessage(),
							mclevcmpPackage.eINSTANCE.getMComponent_InternalPorts());
					return;
				}
				
				if ((times = serverOccurrences.get(ptype)) != null)
				{
					if (times < lowerBound)
					{
						error("Number of internal server ports of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ptype) +
							  " must be at least " + ispti.getLowerBound() + " for this type of component",
							  mclevcmpPackage.eINSTANCE.getMComponent_InternalPorts());
					}
					else if (upperBound != -1 && times > upperBound)
					{
						error("Number of internal server ports of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ptype) +
							  " exceeded for this type of component", mclevcmpPackage.eINSTANCE.getMComponent_InternalPorts());
					}
				}
				else
				{
					if (lowerBound > 0)
					{
						error("Number of internal server ports of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ptype) +
							  " must be at least " + ispti.getLowerBound() + " for this type of component",
							  mclevcmpPackage.eINSTANCE.getMComponent_InternalPorts());
					}
				}	
			}
			
		}

	}
	
	/**
	 * Parameterized Restriction 140. Checks that the internal component
	 * instances deployed by a component are consistent with the restrictions
	 * eventually defined by the domain to which the component belongs.
	 * @param cmp the component to check.
	 */
	@Check
	public void checkMComponent_InternalComponentType(MComponent cmp)
	{
		if (cmp.getDomain() == null ||
			cmp.getDomain().eIsProxy() == true ||
			cmp.getType() == null ||
			cmp.getType().eIsProxy() == true)
		{
			return;
		}
			
		Map<MComponentType, Integer> occurrences = new HashMap<MComponentType, Integer>();
		
		final Map<MParameter, MParameterValueAssignment> assignments = new HashMap<MParameter, MParameterValueAssignment>();
		
		for (MParameterValueAssignment va : cmp.getAttributeValueAssignments())
		{
			assignments.put(va.getParameter(), va);
		}
		
		IParameterAssignmentResolver resolver = new IParameterAssignmentResolver() {
			
			@Override
			public MParameter getParameter() {
				return null;
			}
			
			@Override
			public MParameterValueExpression getAssignmentExpression(
					MParameter parameter) {
				return (assignments.get(parameter) == null) ? null :
						util.getParameterValue(assignments.get(parameter));
			}
		};
		
		for (MInternalComponentInstance iinst : cmp.getInternalComponents())
		{
			if (iinst.getComponent() == null ||
				iinst.getComponent().eIsProxy() == true)
			{
				continue;
			}
			Integer times = occurrences.get(iinst.getComponent().getType());
			if (times == null)
			{
				times = new Integer(1);
			}
			else
			{
				times++;
			}
			occurrences.put(iinst.getComponent().getType(), times);
		}
		
		boolean emptySPInstances = true;

		for (MComponentSupportedPlatform csp : cmp.getSupportedPlatforms())
		{
			if (csp.getInternalComponents().isEmpty() == false)
			{
				emptySPInstances = false;

				Map<MComponentType, Integer> spOccurrences = new HashMap<MComponentType, Integer>();
				
				for (MInternalComponentInstance iinst : csp.getInternalComponents())
				{
					if (iinst.getComponent() == null ||
						iinst.getComponent().eIsProxy() == true)
					{
						continue;
					}
					Integer times = spOccurrences.get(iinst.getComponent().getType());
					if (times == null)
					{
						times = new Integer(1);
					}
					else
					{
						times++;
					}
					spOccurrences.put(iinst.getComponent().getType(), times);
				}
				
				for (MComponentType ctype : MCLEVUtil.getDefault().getAllComponentTypeInstances(cmp.getType()).keySet())
				{
					Integer times = occurrences.get(ctype);
					if (times == null)
					{
						times = spOccurrences.get(ctype);
					}
					else if (spOccurrences.get(ctype) != null)
					{
						times += spOccurrences.get(ctype);
					}

					MComponentTypeInstance cti = MCLEVUtil.getDefault().getAllComponentTypeInstances(cmp.getType()).get(ctype);
					
					Long lowerBound, upperBound;

					try {
						lowerBound = MCLEVUtil.getDefault().parseIntegerExpression(cti.getLowerBound(), resolver);
						upperBound = MCLEVUtil.getDefault().parseIntegerExpression(cti.getUpperBound(), resolver);
					} catch (NumberFormatException e)
					{
						error(e.getMessage(), csp,
								  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_InternalComponents(), -1);
						return;
					}  catch (IllegalArgumentException e)
					{
						error(e.getMessage(), csp,
								  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_InternalComponents(), -1);
						return;
					}
					
					if (times != null)
					{
						if (times < lowerBound)
						{
							error("Number of internal instances of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
								  " must be at least " + cti.getLowerBound() + " for this type of component", csp,
								  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_InternalComponents(), -1);
						}
						else if (upperBound != -1 && times > upperBound)
						{
							error("Number of internal instances of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
								  " exceeded for this type of component", csp,
								  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_InternalComponents(), -1);
						}
					}
					else
					{
						if (lowerBound > 0)
						{
							error("Number of internal instances of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
								  " must be at least " + cti.getLowerBound() + " for this type of component", csp,
								  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_InternalComponents(), -1);
						}
					}	
				}
			}
		}

		if (emptySPInstances == true)
		{
			for (MComponentType ctype : MCLEVUtil.getDefault().getAllComponentTypeInstances(cmp.getType()).keySet())
			{
				Integer times;

				MComponentTypeInstance cti = MCLEVUtil.getDefault().getAllComponentTypeInstances(cmp.getType()).get(ctype);

				Long lowerBound, upperBound;

				try {
					lowerBound = MCLEVUtil.getDefault().parseIntegerExpression(cti.getLowerBound(), resolver);
					upperBound = MCLEVUtil.getDefault().parseIntegerExpression(cti.getUpperBound(), resolver);
				} catch (NumberFormatException e)
				{
					error(e.getMessage(),
							mclevcmpPackage.eINSTANCE.getMComponent_InternalComponents());
					return;
				}  catch (IllegalArgumentException e)
				{
					error(e.getMessage(),
							mclevcmpPackage.eINSTANCE.getMComponent_InternalComponents());
					return;
				}
				
				if ((times = occurrences.get(ctype)) != null)
				{
					if (times < lowerBound)
					{
						error("Number of internal instances of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
							  " must be at least " + cti.getLowerBound() + " for this type of component",
							  mclevcmpPackage.eINSTANCE.getMComponent_InternalComponents());
					}
					else if (upperBound != -1 && times > upperBound)
					{
						error("Number of internal instances of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
							  " exceeded for this type of component", mclevcmpPackage.eINSTANCE.getMComponent_InternalComponents());
					}
				}
				else
				{
					if (lowerBound > 0)
					{
						error("Number of internal instances of type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
							  " must be at least " + cti.getLowerBound() + " for this type of component",
							  mclevcmpPackage.eINSTANCE.getMComponent_InternalComponents());
					}
				}	
			}
		}
	}
	
	
	/**
	 * Checks that the type of a regular component cannot be abstract.
	 * Implements Restriction TBD.
	 * @param cmp the component to check.
	 */
	@Check
	public void checkMComponent_AbstractComponentType(MComponent cmp)
	{
		if (cmp.getType() != null &&
			cmp.getType().eIsProxy() == false &&
			!(cmp.getType() instanceof MIODComponentType ||
			  cmp.getType() instanceof MAODComponentType))
		{
			error("The type of a regular component cannot be abstract",
					mclevcmpPackage.eINSTANCE.getMAbstractComponent_Type());
		}
	}
	
	/**
	 * Checks that the languages of the SAIs required by a component are 
	 * of the languages supported by the components or by one of the languages
	 * they extend. Implements Restriction TBD.
	 * @param cmp the component to check.
	 */
	@Check
	public void checkMServiceLibrary_SAIsSupportLanguages(MComponent cmp)
	{
		int i = 0;
		for (MSAI sai : cmp.getRequires())
		{
			if (sai.eIsProxy() == true)
			{
				i++;
				continue;
			}
			boolean found = false;
			for (MLanguage language : cmp.getLanguages())
			{
				if (language.eIsProxy() == false && 
					(language == sai.getLanguage() ||
					MCLEVUtil.getDefault().getAllParentLanguages(language).contains(sai.getLanguage()) == true))
				{
					found = true;
					break;
				}
			}
			if (found == false)
			{
				error("Language " +
					  MCLEVStringHelper.getDefault().getElementName(sai.getLanguage()) + 
					  " is not supported by the component",
					  cmp, mclevcmpPackage.eINSTANCE.getMComponent_Requires(), i);
			}
			i++;
		}

		for (MComponentSupportedPlatform csp : cmp.getSupportedPlatforms())
		{
			i = 0;
			boolean found = false;
			for (MSAI sai : csp.getRequires())
			{
				if (sai.eIsProxy() == true)
				{
					i++;
					continue;
				}
				found = false;
				for (MLanguage language : cmp.getLanguages())
				{
					if (language.eIsProxy() == false && 
						(language == sai.getLanguage() ||
						MCLEVUtil.getDefault().getAllParentLanguages(language).contains(sai.getLanguage()) == true))
					{
						found = true;
						break;
					}
				}
				
				if (found == false)
				{
					for (MLanguage language : csp.getLanguages())
					{
						if (language.eIsProxy() == false && 
							(language == sai.getLanguage() ||
							MCLEVUtil.getDefault().getAllParentLanguages(language).contains(sai.getLanguage()) == true))
						{
							found = true;
							break;
						}
					}
					if (found == false)
					{
						error("Language " +
							  MCLEVStringHelper.getDefault().getElementName(sai.getLanguage()) + 
							  " is not supported by the component",
							  csp, mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Requires(), i);
					}
				}
				i++;
			}
			
			if (csp.getOsapi() != null &&
				csp.getOsapi().eIsProxy() == false)
			{
				found = false;
				for (MLanguage language : cmp.getLanguages())
				{
					if (language.eIsProxy() == false && 
						(language == csp.getOsapi().getLanguage() ||
						MCLEVUtil.getDefault().getAllParentLanguages(language).contains(csp.getOsapi().getLanguage()) == true))
					{
						found = true;
						break;
					}
				}
				
				if (found == false)
				{
					for (MLanguage language : csp.getLanguages())
					{
						if (language.eIsProxy() == false && 
							(language == csp.getOsapi().getLanguage() ||
							MCLEVUtil.getDefault().getAllParentLanguages(language).contains(csp.getOsapi().getLanguage()) == true))
						{
							found = true;
							break;
						}
					}
					if (found == false)
					{
						error("Language " +
								MCLEVStringHelper.getDefault().getElementName(csp.getOsapi().getLanguage()) + 
								" is not supported by the service library",
								mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Osapi());
					}
				}
			}
		}
	}
	
	/**
	 * Checks that at least one of the languages of a component is that of the
	 * selected component type.
	 * Implements Restriction TBD.
	 * @param cmp the component to check.
	 */
	@Check
	public void checkMComponent_LanguagesSupportComponentType(MComponent cmp)
	{
		if (cmp.getType() == null ||
			cmp.getType().eIsProxy() == true ||
			!(cmp.getType() instanceof MIODComponentType))
		{
			return;
		}
		
		MIODComponentType ctype = (MIODComponentType)cmp.getType();
		
		boolean found = false;
		for (MLanguage language : cmp.getLanguages())
		{
			if (language.eIsProxy() == false && 
				(language == ctype.getLanguage() ||
				MCLEVUtil.getDefault().getAllParentLanguages(language).contains(ctype.getLanguage()) == true))
			{
				found = true;
				break;
			}
		}
		if (found == false)
		{
			error("Language " + MCLEVStringHelper.getDefault().getElementName(ctype.getLanguage()) +
				  ", attached to the component type " + MCLEVStringHelper.getDefault().getFullObjectNameToElement(ctype) +
				  ", has to be included in the languages list", mclevcmpPackage.eINSTANCE.getMComponent_Languages());
		}
	}
	
	/**
	 * Checks for duplicated port names. Implements restriction 69.
	 * @param component the component that is being checked.
	 */
	@Check
	public void checkMPortsList_portName(MAbstractComponent component) {
		
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		
		if (component.getExternalPorts() != null)
		{
			for (MPort port : component.getExternalPorts())
			{
				if (names.add(StringHelper.toLowerDefString(port.getName())) == false)
				{
					error("Duplicated port name: " + port.getName(), component,
							mclevcmpPackage.eINSTANCE.getMAbstractComponent_ExternalPorts(), i);
				}
				i++;
			}
		}

		
		if (component instanceof MComponent)
		{
			i = 0;
			
			for (MPort port : ((MComponent)component).getInternalPorts())
			{
				if (names.add(StringHelper.toLowerDefString(port.getName())) == false)
				{
					error("Duplicated port name: " + port.getName(),
							mclevcmpPackage.eINSTANCE.getMComponent_InternalPorts(), i);
				}
				i++;
			}
		}
		
		for (MAbstractComponent cmp : component.getInherits())
		{
			if (cmp.eIsProxy() == false)
			{
				for (MPort port : MCLEVUtil.getDefault().getAllExternalPorts(cmp))
				{
					if (names.add(StringHelper.toLowerDefString(port.getName())) == false)
					{
						error("Duplicated inherited port name: " + port.getName(),
								mclevcmpPackage.eINSTANCE.getMAbstractComponent_ExternalPorts(), -1);
					}
				}
			}
		}
	}

	/**
	 * Checks the well-formedness of a Component Supported Platform.
	 * Implements restrictions 70, 71 72 and 73.
	 * @param csp the supported platform to check.
	 */
	@Check
	public void checkMComponentSupportedPlatform_wellformedness(MComponentSupportedPlatform csp)
	{
		if (csp.getOsapi() == null &&
			((csp.getOs() != null && csp.getOs().eIsProxy() == false) ||
			 (csp.getArchitecture() != null && csp.getArchitecture().eIsProxy() == false) ||
			 (csp.getMicroprocessor() != null && csp.getMicroprocessor().eIsProxy() == false) ||
			 (csp.getBoard() != null && csp.getBoard().eIsProxy() == false)))
		{
			error("If the OSAPI is undefined, the rest of the fields must also be undefined",
					mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Osapi());
		}
		if (csp.getOs() == null &&
			((csp.getArchitecture() != null && csp.getArchitecture().eIsProxy() == false) ||
			 (csp.getMicroprocessor() != null && csp.getMicroprocessor().eIsProxy() == false) ||
			 (csp.getBoard() != null && csp.getBoard().eIsProxy() == false)))
		{
			error("If the OS is undefined, the rest of the fields must also be undefined",
					mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Os());
		}
		if (csp.getArchitecture() == null &&
			((csp.getCompiler() != null && csp.getCompiler().eIsProxy() == false) ||
			 (csp.getMicroprocessor() != null && csp.getMicroprocessor().eIsProxy() == false) ||
			 (csp.getBoard() != null && csp.getBoard().eIsProxy() == false)))
		{
			error("If the architecture is undefined, the compiler, the microprocessor and the board must also be undefined",
					mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Architecture());
		}
		if (csp.getMicroprocessor() == null &&
			(csp.getBoard() != null && csp.getBoard().eIsProxy() == false))
		{
			error("If the microprocessor is undefined, the board must also be undefined",
					mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Microprocessor());
		}
	}
	
	/**
	 * Checks if the selected OSAPI is provided by the selected OS.
	 * Implements restriction 74.
	 * @param csp the supported platform to check.
	 */
	@Check
	public void checkMComponentSupportedPlatform_OSSupportsOSAPI(MComponentSupportedPlatform csp)
	{
		if (csp.getOsapi() != null &&
			csp.getOsapi().eIsProxy() == false &&
			csp.getOs() != null &&
			csp.getOs().eIsProxy() == false &&
			!MCLEVUtil.getDefault().getAllSupportedOSAPIs(csp.getOs()).contains(csp.getOsapi()))
		{
			error("The operating system " +
				  MCLEVStringHelper.getDefault().getElementName(csp.getOs())+
				  " does not support the OSAPI " +
				  MCLEVStringHelper.getDefault().getElementName(csp.getOsapi()),
				  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Os());
		}
	}
	
	/**
	 * Checks that the compiler of a component supported platform supports the
	 * selected languages.
	 * Implements Restriction TBD.
	 * @param cmp the component to check.
	 */
	@Check
	public void checkMComponent_CompilerSupport(MComponent cmp)
	{
		if (cmp.getLanguages().isEmpty())
		{
			return;
		}
		for (MComponentSupportedPlatform csp : cmp.getSupportedPlatforms())
		{
			if (csp.getArchitecture() != null &&
				csp.getArchitecture().eIsProxy() == false && 
				csp.getCompiler() != null &&
				csp.getCompiler().eIsProxy() == false)
			{
				for (MLanguage language : cmp.getLanguages())
				{
					if (language == null ||
						language.eIsProxy())
					{
						continue;
					}
					if (MCLEVUtil.getDefault().supportsLanguageForArchitecture(csp.getCompiler(), language, 
							csp.getArchitecture()) == false)
					{
						error("The compiler " +
							  MCLEVStringHelper.getDefault().getElementName(csp.getCompiler())+
							  " does not support the language " +
							  MCLEVStringHelper.getDefault().getElementName(language) +
							  " for the architecture " +
							  MCLEVStringHelper.getDefault().getElementName(csp.getArchitecture()), csp,
							  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Compiler(), -1);
					}
				}
				for (MLanguage language : csp.getLanguages())
				{
					if (language == null ||
						language.eIsProxy())
					{
						continue;
					}
					if (MCLEVUtil.getDefault().supportsLanguageForArchitecture(csp.getCompiler(), language, 
							csp.getArchitecture()) == false)
					{
						error("The compiler " +
							  MCLEVStringHelper.getDefault().getElementName(csp.getCompiler())+
							  " does not support the language " +
							  MCLEVStringHelper.getDefault().getElementName(language) +
							  " for the architecture " +
							  MCLEVStringHelper.getDefault().getElementName(csp.getArchitecture()), csp,
							  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Compiler(), -1);
					}
				}
			}
		}

	}
	
	/**
	 * Checks if the OS supports the selected platform.
	 * Implements restriction 75.
	 * @param csp the supported platform to check.
	 */
	@Check
	public void checkMComponentSupportedPlatform_osSupport(MComponentSupportedPlatform csp)
	{
		if (csp.getOsapi() == null ||
			csp.getOsapi().eIsProxy() == true ||
			csp.getOs() == null ||
			csp.getOs().eIsProxy() == true ||
			csp.getArchitecture() == null ||
			csp.getArchitecture().eIsProxy() == true)
		{
			return;
		}
			
		MOperatingSystem os = csp.getOs();
		MPlatform platform = pdlFactory.eINSTANCE.createMPlatform();
		platform.setOsapi(csp.getOsapi());
		platform.setOs(csp.getOs());
		platform.setArchitecture(csp.getArchitecture());
		platform.setCompiler(csp.getCompiler());
		platform.setMicroprocessor(csp.getMicroprocessor());
		platform.setBoard(csp.getBoard());
		
		if (!MCLEVUtil.getDefault().supportsPlatform(os, platform))
		{
			error("The implementations of the operating system " +
				  MCLEVStringHelper.getDefault().getElementName(platform.getOs()) +
				  " are not supported by this platform",
				  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Os());
		}
	}
	
	/**
	 * Checks that the microprocessor and the board of a component supported
	 * platform are defined correctly.
	 * Implements restrictions 76 and 77.
	 * @param csp the supported platform to check.
	 */
	@Check
	public void checkMComponentSupportedPlatform_MpAndBoard(MComponentSupportedPlatform csp)
	{
		if (csp.getArchitecture() != null &&
			csp.getArchitecture().eIsProxy() == false &&
			csp.getMicroprocessor() != null &&
			csp.getMicroprocessor().eIsProxy() == false &&
			csp.getMicroprocessor().getArchitecture() != csp.getArchitecture())
		{
			error("Microprocessor " +
				  MCLEVStringHelper.getDefault().getElementName(csp.getMicroprocessor()) +
				  " does not support the architecture " +
				  MCLEVStringHelper.getDefault().getElementName(csp.getArchitecture()),
				  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Microprocessor());
		}
		if (csp.getMicroprocessor() != null &&
			csp.getMicroprocessor().eIsProxy() == false &&
			csp.getBoard() != null &&
			csp.getBoard().eIsProxy() != false &&
			csp.getBoard().getMicroprocessor() != csp.getMicroprocessor())
		{
			error("Board " +
				  MCLEVStringHelper.getDefault().getElementName(csp.getBoard()) +
				  " does not support the microprocessor " +
				  MCLEVStringHelper.getDefault().getElementName(csp.getMicroprocessor()),
				  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Board());
		}
	}
	
	/**
	 * Checks that the intersection between the supported platforms of a
	 * component is ZERO.
	 * Implements restriction 78.
	 * @param component the component to be checked.
	 */
	@Check
	public void checkMComponent_PlatformZeroIntersection(MComponent component)
	{
		if (component.getSupportedPlatforms().size() >= 2)
		{
			int i = 0;
			for (MComponentSupportedPlatform csp : component.getSupportedPlatforms())
			{
				if ((csp.getOsapi() != null && csp.getOsapi().eIsProxy() == true) ||
					(csp.getOs() != null && csp.getOs().eIsProxy() == true) ||
					(csp.getArchitecture() != null && csp.getArchitecture().eIsProxy() == true) ||
					(csp.getCompiler() != null && csp.getCompiler().eIsProxy() == true) ||
					(csp.getMicroprocessor() != null && csp.getMicroprocessor().eIsProxy() == true) ||
					(csp.getBoard() != null && csp.getBoard().eIsProxy() == true))
				{
					continue;
				}
				for (Iterator<MComponentSupportedPlatform> q = component.getSupportedPlatforms().iterator(); q.hasNext(); )
				{
					MComponentSupportedPlatform otherCSP = q.next();
					if (csp == otherCSP)
					{
						continue;
					}
					if ((otherCSP.getOsapi() != null && otherCSP.getOsapi().eIsProxy() == true) ||
						(otherCSP.getOs() != null && otherCSP.getOs().eIsProxy() == true) ||
						(otherCSP.getArchitecture() != null && otherCSP.getArchitecture().eIsProxy() == true) ||
						(otherCSP.getCompiler() != null && otherCSP.getCompiler().eIsProxy() == true) ||
						(otherCSP.getMicroprocessor() != null && otherCSP.getMicroprocessor().eIsProxy() == true) ||
						(otherCSP.getBoard() != null && otherCSP.getBoard().eIsProxy() == true))
					{
						continue;
					}
					if (MCLEVUtil.getDefault().platformIntersection(csp, otherCSP))
					{
						error("Supported Platforms intersection is not zero", component,
							  mclevcmpPackage.eINSTANCE.getMComponent_SupportedPlatforms(), i);
					}
					i++;
				}
			}
		}
	}
	
	/**
	 * Checks if there is a duplicated value assignment of the same attribute
	 * within the deployment of a client port.
	 * Implements restriction 94.
	 * @param port the port to check.
	 */
	@Check
	public void checkMPort_duplicatedValueAssignments(MPort port)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		int i = 0;
		
		for (MParameterValueAssignment va : port.getAttributeValueAssignments())
		{
			if (params.add(va.getParameter()) == false)
			{
				error("Duplicated assignment of attribute: " + va.getParameter().getName(),
					  mclevcmpPackage.eINSTANCE.getMPort_AttributeValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks if there is a duplicated value assignment of the same attribute
	 * within a component.
	 * @param component the abstract component to check.
	 */
	@Check
	public void checkMAbstractComponent_duplicatedValueAssignments(MAbstractComponent component)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		int i = 0;
		
		for (MParameterValueAssignment va : component.getAttributeValueAssignments())
		{
			if (params.add(va.getParameter()) == false)
			{
				error("Duplicated assignment of attribute: " + va.getParameter().getName(),
					  mclevcmpPackage.eINSTANCE.getMAbstractComponent_AttributeValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks if there is a duplicated value assignment of the same attribute
	 * within a component.
	 * @param csp the component supported platform to check.
	 */
	@Check
	public void checkMComponentSupportedPlatform_duplicatedValueAssignments(MComponentSupportedPlatform csp)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		int i = 0;
		
		for (MParameterValueAssignment va : csp.getAttributeValueAssignments())
		{
			if (params.add(va.getParameter()) == false)
			{
				error("Duplicated assignment of attribute: " + va.getParameter().getName(),
					  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_AttributeValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks if there is a duplicated attribute name.
	 * @param acmp the abstract component to check.
	 */
	@Check
	public void checkMComponent_duplicatedAttributeName(MAbstractComponent acmp)
	{
		Set<String> names = new HashSet<String>();
		int i = 0;
		
		for (MParameter param : acmp.getAttributes())
		{
			if (names.add(StringHelper.toLowerDefString(param.getName())) == false)
			{
				error("Duplicated attribute name: " + param.getName(),
					  mclevcmpPackage.eINSTANCE.getMAbstractComponent_Attributes(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks if there is a duplicated attribute name.
	 * @param csp the component supported platform to check.
	 */
	@Check
	public void checkMComponentSupportedPlatform_duplicatedAttributeName(MComponentSupportedPlatform csp)
	{
		Set<String> names = new HashSet<String>();
		int i = 0;
		
		for (MParameter param : csp.getAttributes())
		{
			if (names.add(StringHelper.toLowerDefString(param.getName())) == false)
			{
				error("Duplicated attribute name: " + param.getName(),
					  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Attributes(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks if there is a duplicated component supported platform name.
	 * @param component the component to check.
	 */
	@Check
	public void checkMComponent_duplicatedComponentSupportedPlatformName(MComponent component)
	{
		Set<String> names = new HashSet<String>();
		int i = 0;
		
		for (MComponentSupportedPlatform csp : component.getSupportedPlatforms())
		{
			if (names.add(StringHelper.toLowerDefString(csp.getName())) == false)
			{
				error("Duplicated supported platform name: " + csp.getName(),
					  mclevcmpPackage.eINSTANCE.getMComponent_SupportedPlatforms(), i);
			}
			i++;
		}
	}
		
	/**
	 * Checks if there is a duplicated name in the common internal instances
	 * of a component.
	 * Implements restriction 96.
	 * @param component the component to check.
	 */
	@Check
	public void checkMComponent_duplicatedInternalInstanceName(MComponent component)
	{
		Set<String> names = new HashSet<String>();
		int i = 0;
		
		for (MInternalComponentInstance iinst : component.getInternalComponents())
		{
			if (names.add(StringHelper.toLowerDefString(iinst.getName())) == false)
			{
				error("Duplicated instance name: " + iinst.getName(),
					  mclevcmpPackage.eINSTANCE.getMComponent_InternalComponents(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks if there is a duplicated name in the internal instances
	 * of a component supported platform.
	 * Implements restriction 96.
	 * @param csp the component supported platform to check.
	 */
	@Check
	public void checkMComponentSupportedPlatform_duplicatedInternalInstanceName(MComponentSupportedPlatform csp)
	{
		Set<String> names = new HashSet<String>();
		int i = 0;
		
		for (MInternalComponentInstance iinst : csp.getInternalComponents())
		{
			if (names.add(StringHelper.toLowerDefString(iinst.getName())) == false)
			{
				error("Duplicated instance name: " + iinst.getName(),
					  mclevcmpPackage.eINSTANCE.getMComponent_InternalComponents(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks if the internal component instances attached to a supported
	 * platform support that platform.
	 * Implements restriction 98.
	 * @param csp the supported platform to check.
	 */
	@Check
	public void checkMComponentSupportedPlatform_internalInstancesCSP(MComponentSupportedPlatform csp)
	{
		int i = 0;

		for (Iterator<MInternalComponentInstance> c = csp.getInternalComponents().iterator(); c.hasNext(); )
		{
			MInternalComponentInstance iinst = c.next();
			if (iinst.getComponent() == null)
			{
				i++;
				continue;
			}
			if (MCLEVUtil.getDefault().supportsPlatform(iinst.getComponent(), csp) == false)
			{
				error("Component instance " + iinst.getName() + " does not support the platform",
						  mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_InternalComponents(), i);			
			}
			i++;
		}
	}
	
	/**
	 * Checks if the internal component common instances of a component
	 * support all the platforms.
	 * Implements restriction 99.
	 * @param component the component to check.
	 */
	@Check
	public void checkMComponent_internalInstancesCSP(MComponent component)
	{
		int i = 0;

		for (MInternalComponentInstance iinst : component.getInternalComponents())
		{
			if (iinst.getComponent() == null ||
				iinst.getComponent().eIsProxy() == true)
			{
				i++;
				continue;
			}
			for (Iterator<MComponentSupportedPlatform> s = component.getSupportedPlatforms().iterator(); s.hasNext(); )
			{
				MComponentSupportedPlatform csp = s.next();
				if (MCLEVUtil.getDefault().supportsPlatform(iinst.getComponent(), csp) == false)
				{
					error("Component instance " + iinst.getName() + " does not support one of the platforms", component,
							  mclevcmpPackage.eINSTANCE.getMComponent_InternalComponents(), i);			
				}
			}
			i++;
		}
	}
	
	/**
	 * Checks if there is a duplicated value assignment of the same attribute
	 * of an internal component instance.
	 * Implements restriction 101.
	 * @param instance the instance to check.
	 */
	@Check
	public void checkMInternalComponentInstance_duplicatedValueAssignments(MInternalComponentInstance instance)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		int i = 0;
		
		for (MParameterValueAssignment va : instance.getAttributeValueAssignments())
		{
			if (params.add(va.getParameter()) == false)
			{
				error("Duplicated assignment of attribute: " + va.getParameter().getName(),
					  mclevcmpPackage.eINSTANCE.getMInternalComponentInstance_AttributeValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks if there is a duplicated value assignment of the same attribute
	 * of an internal component connection.
	 * Implements restriction 104.
	 * @param connection the instance to check.
	 */
	@Check
	public void checkMInternalComponentConnection_duplicatedValueAssignments(MInternalComponentConnection connection)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		int i = 0;
		
		for (MParameterValueAssignment va : connection.getAttributeValueAssignments())
		{
			if (params.add(va.getParameter()) == false)
			{
				error("Duplicated assignment of attribute: " + va.getParameter().getName(),
					  mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_AttributeValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that the connection is always done between different instances.
	 * Implements restriction 107.
	 * @param connection the connection to check.
	 */
	@Check
	public void checkMInternalComponentConnection_differentInstances(MInternalComponentConnection connection)
	{
		if (connection.getClientInstance() != null &&
			connection.getServerInstance() != null &&
			connection.getClientInstance() ==
			connection.getServerInstance())
		{
			error("Connections between ports of the same instance are not allowed",
					mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_ClientInstance());
		}
	}
	
	/**
	 * Checks that if the connection client port is of the internal membrane
	 * of the containing component, the server instance is of the common part.
	 * Implements restriction 111 CORRECTED.
	 * @param connection the connection to check.
	 */
	@Check
	public void checkMInternalComponentConnection_serverInstance(MInternalComponentConnection connection)
	{
		// This is equivalent to the restriction 111. Since the source of the
		// instances of the connections depends on the part where they are
		// defined, a connection from a client port of the internal
		// membrane cannot be defined in the section of a supported
		// platform.
		if (connection.getClientInstance() == null &&
			connection.eContainer() instanceof MComponentSupportedPlatform)
		{
			error("The connections from the client ports of the container component must done in the common part",
				  mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_ClientInstance());
		}
	}
	
	/**
	 * Checks for the consistency of the platform switch connections.
	 * Implements restrictions 125, 126 and 127.
	 * @param platformSwitch the internal component platform switch.
	 */
	@Check
	public void checkMInternalComponentPlatformSwitch_wellformed(MInternalComponentPlatformSwitch platformSwitch)
	{
		boolean defined = false;
		int i = 0;
		
		MComponent containerComponent = (MComponent)platformSwitch.eContainer();
		
		Set<MComponentSupportedPlatform> csps = new HashSet<MComponentSupportedPlatform>();
		
		// First we have to check all the cases and check that they all have a connector defined:
		for (Iterator<MInternalComponentPlatformSwitchCase> c = platformSwitch.getCases().iterator(); c.hasNext(); i++)
		{
			MInternalComponentPlatformSwitchCase switchCase = c.next();
			if (switchCase.getConnector() != null && i == 0)
			{
				defined = true;
			}
			else if (switchCase.getConnector() != null && i != 0 &&
					 defined == false)
			{
				error("If a connector is not defined for an alternative, then it shall remain undefined by the rest",
					  mclevcmpPackage.eINSTANCE.getMInternalComponentPlatformSwitch_Cases(), i);
			}
			else if (switchCase.getConnector() == null && defined == true)
			{
				error("All the cases must define a connector if one of them does",
					  mclevcmpPackage.eINSTANCE.getMInternalComponentPlatformSwitch_Cases(), i);
			}
			
			if (csps.add(switchCase.getPlatform()) == false)
			{
				error("Duplicated supported platform switch case",
					  mclevcmpPackage.eINSTANCE.getMInternalComponentPlatformSwitch_Cases(), i);
			}
		}
		if (defined == false)
		{
			boolean found = false;
			
			for (MInternalConnection conn : containerComponent.getConnections())
			{
				if (conn instanceof MInternalComponentConnection)
				{
					MInternalComponentConnection internal = (MInternalComponentConnection)conn;
					if (internal.getClientInstance() == null &&
						internal.getServerInstance() == null &&
						internal.getClientPort() == platformSwitch.getClientPort() &&
						internal.getConnector() == null)
					{
						found = true;
						break;
					}
				}
			}

			if (!found)
			{
				error("There should be a connection shortcircuiting the membrane",
					  mclevcmpPackage.eINSTANCE.getMInternalComponentPlatformSwitch_ClientPort());
			}
		}
		if (csps.size() != containerComponent.getSupportedPlatforms().size())
		{
			error("Missing supported platforms in the switch cases",
				  mclevcmpPackage.eINSTANCE.getMInternalComponentPlatformSwitch_Cases());
		}
	}
	
	/**
	 * Checks that if the connection is a short-circuit, the connector has to be
	 * null.
	 * Implements restrictions 113 and 114 and 115 and 116.
	 * @param connection the connection to check.
	 */
	@Check
	public void checkMInternalComponentConnection_shortcircuitConnector(MInternalComponentConnection connection)
	{
		if (connection.getClientPort() == null ||
			connection.getClientPort().eIsProxy() == true ||
			connection.getServerPort() == null ||
			connection.getServerPort().eIsProxy() == true)
		{
			return;
		}
		// This is equivalent to the restriction 111. Since the source of the
		// instances of the connections depends on the part where they are
		// defined, a connection from a client port of the internal
		// membrane cannot be defined in the section of a supported
		// platform.
		if (connection.getClientInstance() == null &&
			connection.getServerInstance() == null)
		{
			if (connection.eContainer() instanceof MComponentSupportedPlatform)
			{
				error("Shortcircuit connections cannot be defined in a supported platform section",
						  mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_Connector());					
			}
			else
			{
				if (connection.getConnector() != null)
				{
					error("Shortcircuit connections must not define a connector",
							  mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_Connector());
				}
				else
				{
					if (connection.eContainer() instanceof MComponent)
					{
						MComponent component = (MComponent) connection.eContainer();
						for (MInternalConnection conn : component.getConnections())
						{
							if (conn instanceof MInternalComponentConnection)
							{
								MInternalComponentConnection internal = (MInternalComponentConnection)conn;
								if (internal.getClientPort() == connection.getClientPort() &&
									internal.getConnector() != null)
								{
									error("Delegating connections must not define a connector",
										  internal,
										  mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_Connector(), -1);
								}
								else if (internal.getServerPort() == connection.getServerPort() &&
									internal.getConnector() != null)
								{
									error("Delegating connections must not define a connector",
										  internal,
										  mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_Connector(), -1);
								}
							}
							else if (conn instanceof MInternalComponentPlatformSwitch)
							{
								MInternalComponentPlatformSwitch internal = (MInternalComponentPlatformSwitch) conn;
								if (internal.getClientPort() == connection.getClientPort())
								{
									for (MInternalComponentPlatformSwitchCase pswc : internal.getCases())
									{
										if (pswc.getConnector() != null)
										{
											error("Delegating connections must not define a connector",
											      pswc,
											      mclevcmpPackage.eINSTANCE.getMInternalComponentPlatformSwitchCase_Connector(), -1);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		else if (connection.getClientInstance() == null &&
				 connection.getServerInstance() != null &&
				 connection.getConnector() == null)
		{
			boolean found = false;
			
			if (connection.eContainer() instanceof MComponent)
			{
				MComponent component = (MComponent) connection.eContainer();
				
				for (MInternalConnection conn : component.getConnections())
				{
					if (conn instanceof MInternalComponentConnection)
					{
						MInternalComponentConnection internal = (MInternalComponentConnection)conn;
						if (internal.getClientInstance() == null &&
							internal.getServerInstance() == null &&
							internal.getConnector() == null &&
							(internal.getServerPort() == connection.getServerPort() ||
							 internal.getClientPort() == connection.getClientPort()))
						{
							found = true;
							break;
						}
					}
				}
				if (!found)
				{
					error("There should be a connection shortcircuiting the membrane",
						  mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_Connector());
				}
			}
		}
		else if (connection.getClientInstance() != null &&
				connection.getServerInstance() == null &&
				connection.getConnector() == null)
		{
			boolean found = false;
			
			if (connection.eContainer() instanceof MComponent)
			{
				MComponent component = (MComponent) connection.eContainer();

				for (Iterator<MInternalConnection> c = component.getConnections().iterator(); c.hasNext(); )
				{
					MInternalConnection conn = c.next();
					if (conn instanceof MInternalComponentConnection)
					{
						MInternalComponentConnection internal = (MInternalComponentConnection)conn;
						if (internal.getClientInstance() == null &&
							internal.getServerInstance() == null &&
							internal.getConnector() == null &&
							(internal.getServerPort() == connection.getServerPort() ||
							 internal.getClientPort() == connection.getClientPort()))
						{
							found = true;
							break;
						}
					}
				}
			}
			else
			{
				MComponentSupportedPlatform csp = (MComponentSupportedPlatform) connection.eContainer();
				MComponent component = (MComponent) csp.eContainer();

				for (Iterator<MInternalConnection> c = component.getConnections().iterator(); c.hasNext(); )
				{
					MInternalConnection conn = c.next();
					if (conn instanceof MInternalComponentConnection)
					{
						MInternalComponentConnection internal = (MInternalComponentConnection)conn;
						if (internal.getClientInstance() == null &&
							internal.getServerInstance() == null &&
							internal.getConnector() == null &&
							(internal.getServerPort() == connection.getServerPort() ||
							 internal.getClientPort() == connection.getClientPort()))
						{
							found = true;
							break;
						}
					}
				}

			}
			if (!found)
			{
				error("There should be a connection shortcircuiting the membrane",
					  mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_Connector());
			}
		}

	}
	
	/**
	 * Checks that the client ports of the internal membrane, as well as the
	 * client ports of all the internal instances, are connected once and only
	 * once.
	 * Implements restrictions 128, 129 and 130.
	 * @param component the component to check.
	 */
	@Check
	public void checkMComponent_checkDuplicatedClients(MComponent component)
	{
		Map<MInternalComponentInstance, Set<MClientPort>> connectedPortsMap = new HashMap<MInternalComponentInstance, Set<MClientPort>>();
		Set<MClientPort> membranePorts = new HashSet<MClientPort>();
		
		int i = 0;

		for (MInternalConnection conn : component.getConnections())
		{
			if (conn instanceof MInternalComponentConnection)
			{
				MInternalComponentConnection iconn = (MInternalComponentConnection)conn;
				if (iconn.getClientPort() == null ||
					iconn.getClientPort().eIsProxy() == true)
				{
					i++;
					continue;
				}
				if (iconn.getClientInstance() == null &&
					iconn.getServerInstance() == null &&
					iconn.getConnector() == null)
				{
					if (membranePorts.add(iconn.getClientPort()) == false)
					{
						// This means that the client port was already connected
						error("Duplicated connection on the same client port",
								  mclevcmpPackage.eINSTANCE.getMComponent_Connections(), i);
					}
					i++;
					continue;
				}
				if (connectedPortsMap.get(iconn.getClientInstance()) == null)
				{
					connectedPortsMap.put(iconn.getClientInstance(), new HashSet<MClientPort>());
				}
				if (connectedPortsMap.get(iconn.getClientInstance()).contains(iconn.getClientPort()) == true)
				{
					// This means that the client port was already connected
					error("Duplicated connection on the same client port",
						  mclevcmpPackage.eINSTANCE.getMComponent_Connections(), i);
				}
				else
				{
					connectedPortsMap.get(iconn.getClientInstance()).add(iconn.getClientPort());
				}
			}
			else
			{
				MInternalComponentPlatformSwitch platformSwitch = (MInternalComponentPlatformSwitch)conn;

				if (platformSwitch.getClientPort() == null ||
						platformSwitch.getClientPort().eIsProxy() == true)
				{
					i++;
					continue;
				}
				if (connectedPortsMap.get(platformSwitch.getClientInstance()) == null)
				{
					connectedPortsMap.put(platformSwitch.getClientInstance(), new HashSet<MClientPort>());
				}
				if (connectedPortsMap.get(platformSwitch.getClientInstance()).contains(platformSwitch.getClientPort()) == true)
				{
					// This means that the client port was already connected
					error("Duplicated connection on the same client port",
						  mclevcmpPackage.eINSTANCE.getMComponent_Connections(), i);
				}
				else
				{
					connectedPortsMap.get(platformSwitch.getClientInstance()).add(platformSwitch.getClientPort());
				}
			}
			i++;
		}
		

		for (MComponentSupportedPlatform csp : component.getSupportedPlatforms())
		{
			i = 0;
			for (MInternalComponentConnection conn : csp.getConnections())
			{
				if (conn.getClientPort() == null ||
					conn.getClientPort().eIsProxy() == true)
				{
					i++;
					continue;
				}					
				if (connectedPortsMap.get(conn.getClientInstance()) == null)
				{
					connectedPortsMap.put(conn.getClientInstance(), new HashSet<MClientPort>());
				}
				if (connectedPortsMap.get(conn.getClientInstance()).contains(conn.getClientPort()) == true)
				{
					// This means that the client port was already connected
					error("Duplicated connection on the same client port", csp, 
							mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_Connections(), i);
				}
				else
				{
					connectedPortsMap.get(conn.getClientInstance()).add(conn.getClientPort());
				}
				i++;
			}
		}

		// Now we have to check the client ports and see if all are connected
		// First we start with the ones of the membrane:
		i = 0;
		for (MPort port : component.getInternalPorts())
		{
			if (port instanceof MClientPort &&
				(connectedPortsMap.get(null) == null ||
				 connectedPortsMap.get(null).contains(port) == false))
			{
				error("Unconnected client port: " + port.getName(),
						mclevcmpPackage.eINSTANCE.getMComponent_InternalPorts(), i);
			}
			i++;
		}

		i = 0;

		for (MInternalComponentInstance iinst : component.getInternalComponents())
		{
			if (iinst.getComponent() == null ||
				iinst.getComponent().eIsProxy() == true)
			{
				i++;
				continue;
			}
			for (Iterator<MClientPort> p = MCLEVUtil.getDefault().getAllExternalClientPorts(iinst.getComponent()).iterator(); p.hasNext(); )
			{
				MClientPort port = p.next();
				if (connectedPortsMap.get(iinst) == null ||
					connectedPortsMap.get(iinst).contains(port) == false)
				{
					error("Unconnected client port: " + port.getName(),
							mclevcmpPackage.eINSTANCE.getMComponent_InternalComponents(), i);
				}
			}
			i++;
		}

		for (MComponentSupportedPlatform csp : component.getSupportedPlatforms())
		{
			i = 0;

			for (Iterator<MInternalComponentInstance> c = csp.getInternalComponents().iterator(); c.hasNext(); )
			{
				MInternalComponentInstance iinst = c.next();
				if (iinst.getComponent() == null ||
					iinst.getComponent().eIsProxy() == true)
				{
					i++;
					continue;
				}
				for (Iterator<MClientPort> p = MCLEVUtil.getDefault().getAllExternalClientPorts(iinst.getComponent()).iterator(); p.hasNext(); )
				{
					MClientPort port = p.next();
					if (connectedPortsMap.get(iinst) == null ||
						connectedPortsMap.get(iinst).contains(port) == false)
					{
						error("Unconnected client port: " + port.getName(),
								csp, mclevcmpPackage.eINSTANCE.getMComponentSupportedPlatform_InternalComponents(), i);
					}
				}
				i++;
			}
		}

	}
	
	/**
	 * Checks if a singleton component instance is properly defined.
	 * Implements restriction 131.
	 * @param iinst the internal component instance to check
	 */
	@Check
	public void checkMInternalComponentInstance_singleton(MInternalComponentInstance iinst)
	{
		if (iinst.isIsSingleton() == false ||
			iinst.getComponent() == null)
		{
			return;
		}
		MComponent parentComponent = null;
		if (iinst.eContainer() instanceof MComponent)
		{
			parentComponent = (MComponent)iinst.eContainer();
		}
		else
		{
			parentComponent = (MComponent)(iinst.eContainer().eContainer());
		}
		if (parentComponent.getDomain() != null)
		{
			if (parentComponent.getDomain().isAllowsSingleton() == false)
			{
				error("Singleton instances are not allowed by the selected domain",
					  mclevcmpPackage.eINSTANCE.getMInternalComponentInstance_IsSingleton());
			}
			else if (MCLEVUtil.getDefault().getAllExternalClientPorts(iinst.getComponent()).size() != 0)
			{
				error("Singleton instances cannot deploy client ports",
						  mclevcmpPackage.eINSTANCE.getMInternalComponentInstance_IsSingleton());
			}
		}
	}
	
	/**
	 * Checks that if a component belongs to an IOD, it must define at least
	 * one language and one supported platform. It also checks that, if the
	 * component belongs to an AOD, it cannot define any language, supported
	 * platform nor require any SAI.
	 * @param cmp the component to check.
	 */
	@Check
	public void checkMComponent_IODandAODRestrictions(MComponent cmp)
	{
		if (cmp.getType() == null ||
			cmp.getType().eIsProxy() == true)
		{
			return;
		}
		if (cmp.getType() instanceof MIODComponentType)
		{
			if (cmp.getLanguages().isEmpty())
			{
				error("A component belonging to an IOD must define at least one language",
					  mclevcmpPackage.eINSTANCE.getMComponent_Languages());
			}
			if (cmp.getSupportedPlatforms().isEmpty())
			{
				error("A component belonging to an IOD must define at least one supported platform",
						  mclevcmpPackage.eINSTANCE.getMComponent_SupportedPlatforms());
			}
		}
		else if (cmp.getType() instanceof MAODComponentType)
		{
			if (cmp.getLanguages().isEmpty() == false)
			{
				error("A component belonging to an AOD shall not define any language",
					  mclevcmpPackage.eINSTANCE.getMComponent_Languages());
			}
			if (cmp.getSupportedPlatforms().isEmpty() == false)
			{
				error("A component belonging to an AOD shall not define any supported platform",
						  mclevcmpPackage.eINSTANCE.getMComponent_SupportedPlatforms());
			}
			if (cmp.getRequires().isEmpty() == false)
			{
				error("A component belonging to an AOD shall not require any SAI",
						  mclevcmpPackage.eINSTANCE.getMComponent_Requires());
			}
		}
	}

	/**
	 * Checks that, if the connector reference of a connection is null, then
	 * the mapping reference shall also be null. It also checks that, if the
	 * mapping reference is null, then the interfaces of both connectors
	 * must be the same. If the mapping reference is not null, then the
	 * connected interfaces must be the ones defined by the interface mapping.
	 * Implements Restrictions TBC.
	 * @param icnx the internal component connection to check.
	 */
	@Check
	public void checkMInternalComponentConnection_InterfaceMapping(MInternalComponentConnection icnx)
	{
		if (icnx.getClientPort() == null ||
			icnx.getClientPort().eIsProxy() == true ||
			icnx.getClientPort().getInterface() == null ||
			icnx.getClientPort().getInterface().eIsProxy() == true ||
			icnx.getServerPort() == null ||
			icnx.getServerPort().eIsProxy() == true ||
			icnx.getServerPort().getInterface() == null ||
			icnx.getServerPort().getInterface().eIsProxy() == true ||
			(icnx.getConnector() != null && icnx.getConnector().eIsProxy() == true) ||
			(icnx.getIfaceMapping() != null && icnx.getIfaceMapping().eIsProxy() == true))
		{
			return;
		}
		
		
		if (icnx.getConnector() == null &&
			icnx.getIfaceMapping() != null)
		{
			error("An interface mapping cannot be defined if a connector is undefined", 
				  mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_IfaceMapping());
		}
		if (icnx.getIfaceMapping() == null &&
		    icnx.getClientPort().getInterface() != icnx.getServerPort().getInterface() &&
			MCLEVUtil.getDefault().getExtendedInterfaces(icnx.getServerPort().getInterface()).contains(icnx.getClientPort().getInterface()) == false)
		{
			error("Interface mismatch." +
				  " If an interface mapping is not defined, the pair of interfaces at both sides of the connection must match",
			      mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_IfaceMapping());
		}
		if (icnx.getIfaceMapping() != null && 
			(icnx.getIfaceMapping().getInterfaces().contains(icnx.getClientPort().getInterface()) == false ||
			 icnx.getIfaceMapping().getInterfaces().contains(icnx.getServerPort().getInterface()) == false))
		{
			error("The connected interfaces do not match with the ones defined by the selected interface mapping",
				  mclevcmpPackage.eINSTANCE.getMInternalComponentConnection_IfaceMapping());
		}
		
	}
	
	/**
	 * Checks that, if the connector reference of an internal component
	 * platform switch is null, then the mapping reference shall also be null.
	 * It also checks that, if the mapping reference is null, then the 
	 * interfaces of both connectors must be the same. If the mapping reference
	 * is not null, then the connected interfaces must be the ones defined by
	 * the interface mapping.
	 * Implements Restrictions TBC.
	 * @param icnx the platform switch to check.
	 */
	@Check
	public void checkMInternalComponentPlatformSwitch_InterfaceMapping(MInternalComponentPlatformSwitch platformSwitch)
	{
		if (platformSwitch.getClientPort() == null ||
			platformSwitch.getClientPort().eIsProxy() == true ||
			platformSwitch.getClientPort().getInterface() == null ||
			platformSwitch.getClientPort().getInterface().eIsProxy() == true)
		{
			return;
		}
		
		for (MInternalComponentPlatformSwitchCase pCase : platformSwitch.getCases())
		{
			if (pCase.getServerPort() == null ||
				pCase.getServerPort().eIsProxy() == true ||
				pCase.getServerPort().getInterface() == null ||
				pCase.getServerPort().getInterface().eIsProxy() == true ||
				(pCase.getConnector() != null && pCase.getConnector().eIsProxy() == true) ||
				(pCase.getIfaceMapping() != null && pCase.getIfaceMapping().eIsProxy() == true))
			{
				continue;
			}
			
			if (pCase.getConnector() == null &&
				pCase.getIfaceMapping() != null)
			{
				error("An interface mapping cannot be defined if a connector is undefined", pCase,
					  mclevcmpPackage.eINSTANCE.getMInternalComponentPlatformSwitchCase_IfaceMapping(), -1);
			}
			if (pCase.getIfaceMapping() == null &&
				platformSwitch.getClientPort().getInterface() != pCase.getServerPort().getInterface())
			{
				error("Interface mismatch." +
					  " If an interface mapping is not defined, the pair of interfaces at both sides of the connection must match",
					  pCase, mclevcmpPackage.eINSTANCE.getMInternalComponentPlatformSwitchCase_IfaceMapping(), -1);
			}
			if (pCase.getIfaceMapping() != null && 
				(pCase.getIfaceMapping().getInterfaces().contains(platformSwitch.getClientPort().getInterface()) == false ||
				 pCase.getIfaceMapping().getInterfaces().contains(pCase.getServerPort().getInterface()) == false))
			{
				error("The connected interfaces do not match with the ones defined by the selected interface mapping",
					  pCase, mclevcmpPackage.eINSTANCE.getMInternalComponentPlatformSwitchCase_IfaceMapping(), -1);
			}
		}
	}

}
