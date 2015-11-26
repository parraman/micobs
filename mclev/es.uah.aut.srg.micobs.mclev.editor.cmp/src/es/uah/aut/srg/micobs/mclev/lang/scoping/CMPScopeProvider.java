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
package es.uah.aut.srg.micobs.mclev.lang.scoping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MParameter;
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
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.mclev.xtext.MCLEVElementAbstractScopeProvider;
import es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.pdl.util.impl.PDLUtil;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;

public class CMPScopeProvider extends MCLEVElementAbstractScopeProvider {
			
	/**
	 * Provides the list of attributes of a client port. These
	 * attributes are extracted from the ones defined by the port type.
	 * @param port the client port.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MClientPort port, EReference reference)
	{
		if (port.getType() == null ||
			port.getType().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		for (MPortType ipt : port.getType().getInherits())
		{
			attributes.addAll(MCLEVUtil.getDefault().getAllClientPortAttributes(ipt));
		}
		
		IScope outerScope = getFullObjectScope(attributes);
		
		return getSimpleObjectScope(MCLEVUtil.getDefault().getClientPortAttributes(port.getType()), outerScope);
	}
	
	/**
	 * Provides the list of attributes of a client port. These
	 * attributes are extracted from the ones defined by the port type.
	 * @param port the client port.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MServerPort port, EReference reference)
	{
		if (port.getType() == null ||
			port.getType().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		for (MPortType ipt : port.getType().getInherits())
		{
			attributes.addAll(MCLEVUtil.getDefault().getAllServerPortAttributes(ipt));
		}
		
		IScope outerScope = getFullObjectScope(attributes);
		
		return getSimpleObjectScope(MCLEVUtil.getDefault().getServerPortAttributes(port.getType()), outerScope);

	}
	
	/**
	 * Provides the list of attributes of an internal component
	 * platform switch case. These attributes are extracted from the ones
	 * defined by the attached connector.
	 * @param pscase the internal component platform switch case.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MInternalComponentPlatformSwitchCase pscase, EReference reference)
	{
		if (pscase.getConnector() == null ||
			pscase.getConnector().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		for (MConnector iconn : pscase.getConnector().getInherits())
		{
			attributes.addAll(MCLEVUtil.getDefault().getAllAttributes(iconn));
		}
		
		IScope outerScope = getFullObjectScope(attributes);
		
		return getSimpleObjectScope(MCLEVUtil.getDefault().getAttributes(pscase.getConnector()), outerScope);

	}

	/**
	 * Provides the list of attributes of an internal component
	 * connection. These attributes are extracted from the ones defined by the
	 * attached connector. Implements Restriction 103.
	 * @param connection the internal component connection.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MInternalComponentConnection connection, EReference reference)
	{
		if (connection.getConnector() == null ||
			connection.getConnector().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		for (MConnector iconn : connection.getConnector().getInherits())
		{
			attributes.addAll(MCLEVUtil.getDefault().getAllAttributes(iconn));
		}
		
		IScope outerScope = getFullObjectScope(attributes);
		
		return getSimpleObjectScope(MCLEVUtil.getDefault().getAttributes(connection.getConnector()), outerScope);
	}
	
	/**
	 * Provides the list of attributes of a component whose values can
	 * be assigned when the component is instantiated as part of the internal
	 * architecture of the parent component. Implements Restriction 100.
	 * @param instance the instance of the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MInternalComponentInstance instance, EReference reference)
	{
		if (instance.getComponent() == null ||
			instance.getComponent().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		MComponent component = instance.getComponent();
		
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		for (MAbstractComponent acmp : component.getInherits())
		{
			attributes.addAll(MCLEVUtil.getDefault().getAllAttributes(acmp));
		}
		
		IScope outerScope = getFullObjectScope(attributes);
		
		Set<MParameter> innerAttrs = new HashSet<MParameter>();
		
		innerAttrs.addAll(MCLEVUtil.getDefault().getAttributes(component));
		
		if (instance.eContainer() instanceof MComponent)
		{
			// The instance is a common instance
			// We have to iterate on every supported platform
			// of the main component
			MComponent container = (MComponent)instance.eContainer();
			for (MComponentSupportedPlatform containerCSP : container.getSupportedPlatforms())
			{
				MComponentSupportedPlatform csp = MCLEVUtil.getDefault().getMatchingPlatform(component, containerCSP);
				if (csp != null)
				{
					innerAttrs.addAll(MCLEVUtil.getDefault().getAttributes(csp));
				}
			}
		}
		else
		{
			MComponentSupportedPlatform containerCSP = (MComponentSupportedPlatform)instance.eContainer();
			MComponentSupportedPlatform csp = MCLEVUtil.getDefault().getMatchingPlatform(component, containerCSP);
			if (csp != null)
			{
				innerAttrs.addAll(MCLEVUtil.getDefault().getAttributes(csp));
			}
		}
		
		return getRelativeObjectScope(innerAttrs, outerScope);

	}
	
	/**
	 * Provides the list of supported platforms that can be used as case
	 * alternatives in the definition of an internal component platform
	 * switch. Implements Restriction 123.
	 * @param platformSwitch the platform switch.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MComponentSupportedPlatform(final MInternalComponentPlatformSwitch platformSwitch, EReference reference)
	{
		MComponent component = (MComponent)platformSwitch.eContainer();

		return getSimpleObjectScope(component.getSupportedPlatforms());
	}
	
	/**
	 * Provides the list of possible component instances that can be used
	 * as the destination instance of an internal component platform switch
	 * connection. These instances are the ones defined by the supported
	 * platform attached to the corresponding case alternative.
	 * Implements Restriction 124.
	 * @param switchCase the internal platform switch case alternative.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInternalComponentPlatformSwitchCase_serverInstance(
			final MInternalComponentPlatformSwitchCase switchCase, EReference reference)
	{
		if (switchCase.getPlatform() == null ||
			switchCase.getPlatform().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		return getSimpleObjectScope(switchCase.getPlatform().getInternalComponents());
	}
	
	/**
	 * Provides the list of server ports that can be used as destinations of
	 * an internal component platform switch connection. These ports are 
	 * obtained from the definition of the component corresponding to the
	 * destination instance. Implements Restriction 126.
	 * @param switchCase the internal platform switch case alternative.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInternalComponentPlatformSwitchCase_serverPort(
			final MInternalComponentPlatformSwitchCase switchCase, EReference reference)
	{
		if (switchCase.getServerInstance() != null &&
			switchCase.getServerInstance().eIsProxy() == false &&
			switchCase.getServerInstance().getComponent() != null &&
			switchCase.getServerInstance().getComponent().eIsProxy() == false)
		{
			MComponent component = switchCase.getServerInstance().getComponent();
		
			return getSimpleObjectScope(MCLEVUtil.getDefault().getAllExternalServerPorts(component));
		}
		return IScope.NULLSCOPE;
	}
	
	/**
	 * Scope that provides the list of configuration attributes that
	 * can be used to state the default value of a attributes defined by a
	 * component.
	 * 
	 * @param parameter the attributes.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(final MParameter parameter, EReference reference)
	{
		if (parameter.eContainer() instanceof MAbstractComponent)
		{
			MAbstractComponent acmp = (MAbstractComponent)parameter.eContainer();
			
			Set<MParameter> params = MCLEVUtil.getDefault().getAttributes(acmp);
				
			for (MAbstractComponent icmp : acmp.getInherits())
			{
				if (icmp.eIsProxy() == false)
				{
					params.addAll(MCLEVUtil.getDefault().getAllAttributes(icmp));
				}
			}
			
			if (acmp instanceof MComponent)
			{
				MComponent cmp = (MComponent) acmp;
				for (MSAI rsai : cmp.getRequires())
				{
					if (rsai.eIsProxy() == false)
					{
						params.addAll(MCLEVUtil.getDefault().getAllAttributes(rsai));
					}
				}
			}
			
			params.remove(parameter);
			
			IScope innerScope = getFullObjectScope(params);
			
			if (parameter instanceof MEnumParameter)
			{
				// Then we have to return the literals
				MEnumParameter param = (MEnumParameter)parameter;
				if (param.getEnumDefinition() != null &&
					param.getEnumDefinition().eIsProxy() == false)
				{				
					return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), innerScope);
				}
			}

			return innerScope;
		}
		else if (parameter.eContainer() instanceof MComponentSupportedPlatform)
		{
			MComponentSupportedPlatform csp = (MComponentSupportedPlatform)parameter.eContainer();
			MComponent cmp = (MComponent)csp.eContainer();
			
			Set<MParameter> params = MCLEVUtil.getDefault().getAttributes(cmp);
			
			for (MAbstractComponent icmp : cmp.getInherits())
			{
				if (icmp.eIsProxy() == false)
				{
					params.addAll(MCLEVUtil.getDefault().getAllAttributes(icmp));
				}
			}
			params.addAll(MCLEVUtil.getDefault().getAttributes(csp));
			
			for (MSAI rsai : cmp.getRequires())
			{
				if (rsai.eIsProxy() == false)
				{
					params.addAll(MCLEVUtil.getDefault().getAllAttributes(rsai));
				}
			}
			
			for (MSAI rsai : csp.getRequires())
			{
				if (rsai.eIsProxy() == false)
				{
					params.addAll(MCLEVUtil.getDefault().getAllAttributes(rsai));
				}
			}
			
			params.remove(parameter);
			
			params.addAll(getAllPlatformParameters(csp));
			
			if (parameter instanceof MEnumParameter)
			{
				// Then we have to return the literals
				MEnumParameter param = (MEnumParameter)parameter;
				if (param.getEnumDefinition() != null &&
					param.getEnumDefinition().eIsProxy() == false)
				{
					IScope innerScope = getFullObjectScope(params);
					return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), innerScope);
				}
			}
			return getFullObjectScope(params);
		}
		return IScope.NULLSCOPE;
		
		
	}
	
	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within an abstract component.
	 * This types are the ones defined by the very component plus the
	 * ones defined by the component it inherits.
	 * 
	 * @param acmp the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameterDefinition(final MAbstractComponent acmp, EReference reference)
	{		
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		for (MAbstractComponent iacmp : acmp.getInherits())
		{
			if (iacmp.eIsProxy() == false)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(iacmp));
			}
		}

		if (acmp instanceof MComponent)
		{
			MComponent swp = (MComponent)acmp;

			for (MSAI rsai : swp.getRequires())
			{
				if (rsai.eIsProxy() == false)
				{
					outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(rsai));
				}
			}
		}
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(acmp), outerScope);
	}
	
	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within a component supported
	 * platform. This types are the ones defined by the very component
	 * plus the ones defined by the components it inherits.
	 * 
	 * @param csp the component supported platform.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameterDefinition(final MComponentSupportedPlatform csp, EReference reference)
	{		
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		MComponent cmp = (MComponent)csp.eContainer();
		
		for (MAbstractComponent acmp : cmp.getInherits())
		{
			if (acmp.eIsProxy() == false)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(acmp));
			}
		}
	
		for (MSAI rsai : cmp.getRequires())
		{
			if (rsai.eIsProxy() == false)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(rsai));
			}
		}
		for (MSAI rsai : csp.getRequires())
		{
			if (rsai.eIsProxy() == false)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(rsai));
			}
		}
		if (csp.getOsapi() != null &&
			csp.getOsapi().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(csp.getOsapi()));
		}
		if (csp.getOs() != null &&
			csp.getOs().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(csp.getOs()));
			MOSSupportedPlatform ossp = PDLUtil.getDefault().getMatchingPlatform(csp.getOs(), MCLEVUtil.getDefault().toPlatform(csp));
			if (ossp != null)
			{
				outerDefs.addAll(PDLUtil.getDefault().getEnumParameterDefinitions(ossp));
			}
		}
		if (csp.getArchitecture() != null &&
			csp.getArchitecture().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(csp.getArchitecture()));	
		}
		if (csp.getCompiler() != null &&
			csp.getCompiler().eIsProxy() == false)
		{
			if (csp.getArchitecture() != null &&
				csp.getArchitecture().eIsProxy() == false)
			{
				outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(csp.getCompiler(), csp.getArchitecture()));
			}
			else
			{
				outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(csp.getCompiler()));	
			}
		}
		if (csp.getMicroprocessor() != null &&
				csp.getMicroprocessor().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getEnumParameterDefinitions(csp.getMicroprocessor()));
		}
		if (csp.getBoard() != null &&
			csp.getBoard().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getEnumParameterDefinitions(csp.getBoard()));
			for (MBoardSupportedDevice sdevice : csp.getBoard().getSupportedDevices())
			{
				outerDefs.addAll(PDLUtil.getDefault().getEnumParameterDefinitions(sdevice.getDevice()));
			}
		}
		IScope outerScope = getFullObjectScope(outerDefs);
		return getSimpleObjectScope(MCLEVUtil.getDefault().getEnumAttributeDefinitions(csp), outerScope);
	}

	
	/**
	 * Provides the list of server ports that can be used as destinations of
	 * an internal component connection. These ports are obtained from the
	 * definition of the component corresponding to the destination instance or
	 * from the internal membrane of the parent component.
	 * Implements Restriction 106, 112 and 113.
	 * @param connection the internal component connection.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInternalComponentConnection_serverPort(
			final MInternalComponentConnection connection, EReference reference)
	{
		if (connection.getServerInstance() != null &&
			connection.getServerInstance().eIsProxy() == false &&
			connection.getServerInstance().getComponent() != null &&
			connection.getServerInstance().getComponent().eIsProxy() == false)
		{

			MComponent component = connection.getServerInstance().getComponent();

			return getSimpleObjectScope(MCLEVUtil.getDefault().getAllExternalServerPorts(component));
		}
		else if (connection.getServerInstance() == null &&
				connection.getClientInstance() != null &&
				connection.getClientInstance().eIsProxy() == false)
		{
			// The source of the components is the internal membrane
			if (connection.eContainer() instanceof MComponent)
			{
				MComponent containerComponent = (MComponent)connection.eContainer();
				
				return getSimpleObjectScope(MCLEVUtil.getDefault().getInternalServerPorts(containerComponent));
			}
			else
			{
				MComponentSupportedPlatform csp = (MComponentSupportedPlatform) connection.eContainer();
				MComponent containerComponent = (MComponent)(csp.eContainer());
				
				return getSimpleObjectScope(MCLEVUtil.getDefault().getInternalServerPorts(containerComponent));
			}

		}
		else if (connection.getServerInstance() == null &&
			     connection.getClientInstance() == null &&
			     connection.getClientPort() != null &&
			     connection.getClientPort().eIsProxy() == false)
		{
			// We are dealing with a short circuit connection
			MComponent containerComponent = null; 
			if (connection.eContainer() instanceof MComponent)
			{
				containerComponent = (MComponent)connection.eContainer();
			}
			else
			{
				// a short-circuit connection cannot be defined on a supported
				// platform section.
				return IScope.NULLSCOPE;
			}
			Set<MClientPort> externalClientPorts = MCLEVUtil.getDefault().getAllExternalClientPorts(containerComponent);
			
			if (externalClientPorts.contains(connection.getClientPort()))
			{
				return getSimpleObjectScope(MCLEVUtil.getDefault().getInternalServerPorts(containerComponent));
			}
			else if (MCLEVUtil.getDefault().getInternalClientPorts(containerComponent).contains(connection.getClientPort()))
			{		
				return getSimpleObjectScope(MCLEVUtil.getDefault().getAllExternalServerPorts(containerComponent));
			}
		}
		return IScope.NULLSCOPE;
	}
	
	/**
	 * Provides the list of client ports that can be used as sources of
	 * an internal component platform switch. These ports are obtained from the
	 * definition of the component corresponding to the destination instance.
	 * Implements Restriction 105 and 110.
	 * @param platformSwitch the platform switch connection.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInternalComponentPlatformSwitch_clientPort(
			final MInternalComponentPlatformSwitch platformSwitch, EReference reference)
	{
		if (platformSwitch.getClientInstance() != null &&
			platformSwitch.getClientInstance().eIsProxy() == false &&
			platformSwitch.getClientInstance().getComponent() != null &&
			platformSwitch.getClientInstance().getComponent().eIsProxy() == false)
		{
			MComponent component = platformSwitch.getClientInstance().getComponent();
			
			return getSimpleObjectScope(MCLEVUtil.getDefault().getAllExternalClientPorts(component));
		}
		else if (platformSwitch.getClientInstance() == null)
		{
			MComponent containerComponent = null;
			if (platformSwitch.eContainer() instanceof MComponent)
			{
				containerComponent = (MComponent)platformSwitch.eContainer();
			}
			else
			{
				return IScope.NULLSCOPE;
			}
			
			return getSimpleObjectScope(MCLEVUtil.getDefault().getInternalClientPorts(containerComponent));
		}
		else
		{
			return IScope.NULLSCOPE;
		}
	}
	
	/**
	 * Provides the list of client ports that can be used as sources of
	 * an internal component connection. These ports are obtained from the
	 * definition of the component corresponding to the destination instance.
	 * Implements Restriction 105 and 110.
	 * @param connection the internal component connection.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInternalComponentConnection_clientPort(
			final MInternalComponentConnection connection, EReference reference)
	{
		if (connection.getClientInstance() != null &&
			connection.getClientInstance().eIsProxy() == false &&
			connection.getClientInstance().getComponent() != null &&
			connection.getClientInstance().getComponent().eIsProxy() == false)
		{
			MComponent component = connection.getClientInstance().getComponent();
		
			return getSimpleObjectScope(MCLEVUtil.getDefault().getAllExternalClientPorts(component));
		}
		else if (connection.getClientInstance() == null)
		{
			MComponent containerComponent = null; 
			if (connection.eContainer() instanceof MComponent)
			{
				containerComponent = (MComponent)connection.eContainer();
			}
			else
			{
				return IScope.NULLSCOPE;
			}
			
			return getSimpleObjectScope(MCLEVUtil.getDefault().getAllClientPorts(containerComponent));
		}
		else
		{
			return IScope.NULLSCOPE;
		}
	}
	
	/**
	 * Provides the list of component instances that can be used as sources of
	 * an internal component platform switch connections. This list is formed by
	 * the common component instances of the parent component.
	 * @param platformSwitch the internal component platform switch.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInternalComponentPlatformSwitch_clientInstance(
			final MInternalComponentPlatformSwitch platformSwitch, EReference reference)
	{
		MComponent component = (MComponent)platformSwitch.eContainer();
		return getSimpleObjectScope(component.getInternalComponents());
	}
	
	/**
	 * Provides the list of component instances that can be used as sources of
	 * an internal component connection. If the connection belongs to the 
	 * platform-independent part, the source component instances shall be the
	 * ones defined in that part. On the other hand, if the connection is
	 * begin defined for a given component supported platform, the sources can
	 * be the platform-independent instances and the instances defined by the
	 * platform itself.
	 * 
	 * @param connection the internal component connection.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInternalComponentConnection_serverInstance(
			final MInternalComponentConnection connection, EReference reference)
	{
		if (connection.eContainer() instanceof MComponent)
		{
			// It is a platform independent instance:
			// Restriction 108.
			MComponent component = (MComponent)connection.eContainer();
			return getSimpleObjectScope(component.getInternalComponents());
		}
		else
		{
			// The server instances can be of both the platform dependent
			// and the common part.
			MComponentSupportedPlatform cmpsp = (MComponentSupportedPlatform)connection.eContainer();
			MComponent component = (MComponent)cmpsp.eContainer();
			
			if (component.getInternalComponents().isEmpty() == true)
			{
				if (cmpsp.getInternalComponents().isEmpty() == true)
				{
					return IScope.NULLSCOPE;
				}
				else
				{
					return getSimpleObjectScope(cmpsp.getInternalComponents());
				}
			}
			else
			{
				if (cmpsp.getInternalComponents().isEmpty() == true)
				{
					return getFullObjectScope(component.getInternalComponents());
				}
				else
				{
					IScope outerScope = getFullObjectScope(component.getInternalComponents());
					return getSimpleObjectScope(cmpsp.getInternalComponents(), outerScope);
				}
			}
		}
	}
	
	/**
	 * Provides the list of component instances that can be used as sinks of
	 * an internal component connection. If the connection belongs to the 
	 * platform-independent part, the source component instances shall only be
	 * the ones defined in that part. On the other hand, if the connection is
	 * begin defined for a given component supported platform, the sources can
	 * only be the instances defined by the platform itself.
	 * 
	 * @param connection the internal component connection.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInternalComponentConnection_clientInstance(
			final MInternalComponentConnection connection, EReference reference)
	{
		if (connection.eContainer() instanceof MComponent)
		{
			// It is a platform independent instance:
			// Restriction 108.
			MComponent component = (MComponent)connection.eContainer();
			return getSimpleObjectScope(component.getInternalComponents());
		}
		else
		{
			// It depends on the platform:
			// Restriction 109.
			// No client components of the common part can be reached
			MComponentSupportedPlatform cmpsp = (MComponentSupportedPlatform)connection.eContainer();
			return getSimpleObjectScope(cmpsp.getInternalComponents());
		}
	}
	
	/**
	 * Provides the scope with the list of components from which a given
	 * component can inherit.
	 * 
	 * @param cmp the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MAbstractComponent_inherits(
			final MComponent component, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)component.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)component.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mclevcmpPackage.eINSTANCE.getMAbstractComponent());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevcmpPackage.eINSTANCE.getMAbstractComponent()));
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(imports, mclevcmpPackage.eINSTANCE.getMComponent()));
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevcmpPackage.eINSTANCE.getMComponent()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}

	/**
	 * Provides the scope with the list of SAIs that be required by a component.
	 * 
	 * @param cmp the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSAI(final MComponent component, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)component.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)component.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}

	
	/**
	 * Provides the scope with the list of interfaces that be used by a
	 * component.
	 * 
	 * @param cmp the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInterface(final MAbstractComponent cmp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)cmp.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)cmp.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mclevifacePackage.eINSTANCE.getMInterface());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevifacePackage.eINSTANCE.getMInterface()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of connectors that can be
	 * used in the definition of the internal component architecture.
	 * 
	 * @param cmp the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MConnector(final MComponent cmp, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		
		if (cmp.getDomain() == null ||
			cmp.getDomain().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		MDomain domain = cmp.getDomain();
		
		if (domain instanceof MIODomain)
		{
			Set<MConnector> parentConnectors = new HashSet<MConnector>();
			
			for (MIODomain iod : ((MIODomain) domain).getInherits())
			{
				parentConnectors.addAll(MCLEVUtil.getDefault().getAllConnectors(iod));
			}
			outerScope = getFullObjectScope(parentConnectors);
			
		}
		else
		{
			Set<MConnector> parentConnectors = new HashSet<MConnector>();
			
			for (MAODomain iod : ((MAODomain) domain).getInherits())
			{
				parentConnectors.addAll(MCLEVUtil.getDefault().getAllConnectors(iod));
			}
			outerScope = getFullObjectScope(parentConnectors);

		}

		return getRelativeObjectScope(domain.getConnectors(), outerScope);	
		
	}
	

	
	/**
	 * Provides the scope with the list of component types that can be
	 * used in the definition of the ports of a component.
	 * 
	 * @param cmp the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MPortType(final MAbstractComponent cmp, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		
		if (cmp.getDomain() == null ||
			cmp.getDomain().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		MDomain domain = cmp.getDomain();
		
		if (domain instanceof MIODomain)
		{
			MIODomain iod = (MIODomain)domain;
			
			Set<MPortType> parentTypes = new HashSet<MPortType>();
			
			for (MIODomain piod : iod.getInherits())
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllPortTypes(piod));
			}
			outerScope = getFullObjectScope(parentTypes);
			
			return getRelativeObjectScope(domain.getPortTypes(), outerScope);	
		}
		else
		{
			MAODomain aod = (MAODomain)domain;
			
			Set<MPortType> parentTypes = new HashSet<MPortType>();
			
			for (MAODomain paod : aod.getInherits())
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllPortTypes(paod));
			}
			outerScope = getFullObjectScope(parentTypes);
			
			return getRelativeObjectScope(domain.getPortTypes(), outerScope);	
		}

	}
	
	/**
	 * Provides the scope with the list of component types that can be
	 * used in the definition of the internal instances of a component.
	 * 
	 * @param cmp the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MAbstractComponent_type(final MAbstractComponent cmp, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		
		if (cmp.getDomain() == null ||
			cmp.getDomain().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		MDomain domain = cmp.getDomain();
		
		if (domain instanceof MIODomain)
		{
			MIODomain iod = (MIODomain)domain;
			
			Set<MComponentType> parentTypes = new HashSet<MComponentType>();
			
			for (MIODomain piod : iod.getInherits())
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllComponentTypes(piod));
			}
			outerScope = getFullObjectScope(parentTypes);
			
			return getRelativeObjectScope(iod.getComponentTypes(), outerScope);	
		}
		else
		{
			MAODomain aod = (MAODomain)domain;
			
			Set<MComponentType> parentTypes = new HashSet<MComponentType>();
			
			for (MAODomain paod : aod.getInherits())
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllComponentTypes(paod));
			}
			outerScope = getFullObjectScope(parentTypes);
			
			return getRelativeObjectScope(aod.getComponentTypes(), outerScope);	
		}

	}
	
	/**
	 * Provides the scope with the list of interface types that can be
	 * attached to the ports of a component.
	 * 
	 * @param cmp the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInterfaceType(final MAbstractComponent cmp, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		
		if (cmp.getDomain() == null ||
			cmp.getDomain().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		MDomain domain = cmp.getDomain();
		
		if (domain instanceof MIODomain)
		{
			MIODomain iod = (MIODomain)domain;
			
			Set<MInterfaceType> parentTypes = new HashSet<MInterfaceType>();
			
			for (MIODomain piod : iod.getInherits())
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllInterfaceTypes(piod));
			}
			outerScope = getFullObjectScope(parentTypes);
			
			return getRelativeObjectScope(iod.getInterfaceTypes(), outerScope);	
		}
		else
		{
			MAODomain aod = (MAODomain)domain;
			
			Set<MInterfaceType> parentTypes = new HashSet<MInterfaceType>();
			
			for (MAODomain paod : aod.getInherits())
			{
				parentTypes.addAll(MCLEVUtil.getDefault().getAllInterfaceTypes(paod));
			}
			outerScope = getFullObjectScope(parentTypes);
			
			return getRelativeObjectScope(aod.getInterfaceTypes(), outerScope);	
		}

	}
	
	/**
	 * Provides the scope with the list of interface mappings that can be
	 * attached to the connectors that are part of the internal architecture
	 * of a component.
	 * 
	 * @param component the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInterfaceMapping(final MComponent component, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)component.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)component.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mclevimapPackage.eINSTANCE.getMInterfaceMapping());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevimapPackage.eINSTANCE.getMInterfaceMapping()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of components that can be instantiated
	 * as part of the internal architecture of a component or inherited.
	 * 
	 * @param cmp the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MComponent(final MComponent cmp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)cmp.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)cmp.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mclevcmpPackage.eINSTANCE.getMComponent());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevcmpPackage.eINSTANCE.getMComponent()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of abstract components that can be
	 * inherited by an abstract component.
	 * 
	 * @param cmp the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MAbstractComponent(final MAbstractComponent cmp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)cmp.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)cmp.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mclevcmpPackage.eINSTANCE.getMAbstractComponent());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevcmpPackage.eINSTANCE.getMAbstractComponent()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of domains that can be attached to the
	 * definition of a component.
	 * 
	 * @param cmp the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MAbstractComponent_domain(final MAbstractComponent cmp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)cmp.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)cmp.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mclevdomPackage.eINSTANCE.getMIODomain());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevdomPackage.eINSTANCE.getMIODomain()));
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(imports, mclevdomPackage.eINSTANCE.getMAODomain()));
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevdomPackage.eINSTANCE.getMAODomain()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of operating system APIs that can be
	 * included in the definition of a component. This list includes the OSAPIs
	 * present in the PDL packages imported by the component.
	 * 
	 * @param comoonent the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOperatingSystemAPI(final MComponent component, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)component.eContainer()).getImports();
		
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
	 * Provides the scope with the list of operating systems that can be
	 * included in the definition of a component. This list includes 
	 * the OSs present in the PDL packages imported by the component.
	 * 
	 * @param component the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOperatingSystem(final MComponent component, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)component.eContainer()).getImports();
		
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
	 * Provides the scope with the list of architectures that can be
	 * included in the definition of a component. This list includes 
	 * the architectures present in the PDL packages imported by the component.
	 * 
	 * @param component the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MArchitecture(final MComponent component, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)component.eContainer()).getImports();
		
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
	 * Provides the scope with the list of compilers that can be
	 * included in the definition of a component. This list includes 
	 * the compilers present in the PDL packages imported by the component.
	 * 
	 * @param component the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MCompiler(final MComponent component, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)component.eContainer()).getImports();
		
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
	 * Provides the scope with the list of microprocessors that can be
	 * included in the definition of a component. This list includes 
	 * the microprocessors present in the PDL packages imported by the
	 * component.
	 * 
	 * @param component the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MMicroprocessor(final MComponent component, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)component.eContainer()).getImports();
		
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
	 * Provides the scope with the list of boards that can be included in the
	 * definition of a component. This list includes the boards present
	 * in the PDL packages imported by the component.
	 * 
	 * @param component the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MBoard(final MComponent component, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)component.eContainer()).getImports();
		
		try {
			elements = PDLLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

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
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		return importLibraries;
	}

}