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
package es.uah.aut.srg.micobs.lang.scoping;

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
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MCompilerFrontend;
import es.uah.aut.srg.micobs.pdl.MDevice;
import es.uah.aut.srg.micobs.pdl.MEnumParamOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPI;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVAExpression;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitch;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVASwitchCase;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.MPDLPackageElement;
import es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitch;
import es.uah.aut.srg.micobs.pdl.MParameterOSSPSwitchCase;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.pdl.util.impl.PDLUtil;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;
import es.uah.aut.srg.micobs.xtext.MICOBSElementAbstractScopeProvider;

/**
 * This class contains custom scoping description.
 */
public class PDLScopeProvider extends MICOBSElementAbstractScopeProvider {
	
	/**
	 * Provides the scope for the parameters whose values can be assigned
	 * when an OSAPI is supported by an operating system.
	 * 
	 * @param sosapi the OSAPI that is being supported.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(MOSSupportedOSAPI sosapi, EReference reference)
	{
		if (sosapi.getOsapi() == null ||
			sosapi.getOsapi().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MOperatingSystemAPI iosapi : sosapi.getOsapi().getInherits())
		{
			if (iosapi.eIsProxy() == false)
			{
				params.addAll(PDLUtil.getDefault().getAllParameters(iosapi));
			}
		}
		
		IScope outerScope = getFullObjectScope(params);
		
		return getRelativeObjectScope(PDLUtil.getDefault().getParameters(sosapi.getOsapi()), outerScope);
	}
	
	/**
	 * Provides the scope for the referenceable objects that can be used
	 * in value assignment expression to a supported OSAPI parameter value.
	 * 
	 * @param pva the value assignment expression.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(MOSSupportedOSAPIPVAExpression pva, EReference reference)
	{
		MOSSupportedOSAPI sosapi = (MOSSupportedOSAPI) pva.eContainer();

		MOperatingSystem os = (MOperatingSystem)sosapi.eContainer();
		
		Set<MParameter> params = PDLUtil.getDefault().getParameters(os);

		for (MOperatingSystem ios : os.getInherits())
		{
			if (ios.eIsProxy() == false)
			{
				params.addAll(PDLUtil.getDefault().getAllParameters(ios));
			}
		}
		
		if (sosapi.getOsapi() != null &&
			sosapi.getOsapi().eIsProxy() == false)
		{
			params.addAll(PDLUtil.getDefault().getAllParameters(sosapi.getOsapi()));
		}
		
		if (pva.getParameter() != null &&
			pva.getParameter().eIsProxy() == false)
		{
			params.remove(pva.getParameter());
			
			if (pva.getParameter() instanceof MEnumParameter)
			{
				// Then we have to return the literals
				MEnumParameter param = (MEnumParameter)pva.getParameter();
				if (param.getEnumDefinition() != null &&
					param.getEnumDefinition().eIsProxy() == false)
				{
					IScope innerScope = getFullObjectScope(params);
					return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), innerScope);
				}
			}
		}
		
		return getFullObjectScope(params);
	}
	
	/**
	 * Provides the scope for the referenceable objects that can be used
	 * in value assignment expression to a supported OSAPI parameter value
	 * when it is assigned depending on the supported platforms.
	 * 
	 * @param pvaSwitchCase the value assignment expression.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(MOSSupportedOSAPIPVASwitchCase pvaSwitchCase, EReference reference)
	{
		MOSSupportedOSAPIPVASwitch pva = (MOSSupportedOSAPIPVASwitch) pvaSwitchCase.eContainer();
		MOSSupportedOSAPI sosapi = (MOSSupportedOSAPI) pva.eContainer();

		MOperatingSystem os = (MOperatingSystem)sosapi.eContainer();
		
		Set<MParameter> params = PDLUtil.getDefault().getParameters(os);

		for (MOperatingSystem ios : os.getInherits())
		{
			if (ios.eIsProxy() == false)
			{
				params.addAll(PDLUtil.getDefault().getAllParameters(ios));
			}
		}
		
		if (sosapi.getOsapi() != null &&
			sosapi.getOsapi().eIsProxy() == false)
		{
			params.addAll(PDLUtil.getDefault().getAllParameters(sosapi.getOsapi()));
		}
		
		if (pvaSwitchCase.getPlatform() != null &&
			pvaSwitchCase.getPlatform().eIsProxy() == false)
		{
			params.addAll(PDLUtil.getDefault().getParameters(pvaSwitchCase.getPlatform()));
		}
		
		if (pva.getParameter() != null &&
			pva.getParameter().eIsProxy() == false)
		{
			params.remove(pva.getParameter());
			
			if (pva.getParameter() instanceof MEnumParameter)
			{
				// Then we have to return the literals
				MEnumParameter param = (MEnumParameter)pva.getParameter();
				if (param.getEnumDefinition() != null &&
					param.getEnumDefinition().eIsProxy() == false)
				{
					IScope innerScope = getSimpleObjectScope(params);
					return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), innerScope);
				}
			}
		}

		return getFullObjectScope(params);
	}
	
	/**
	 * Provides the scope for the referenceable objects that can be used
	 * in the default value assignment expressions of parameter
	 * depending on the supported platforms.
	 * 
	 * @param pvaSwitchCase the platform-dependent value assignment expression.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(MParameterOSSPSwitchCase switchCase, EReference reference)
	{
		MParameterOSSPSwitch parameter = (MParameterOSSPSwitch) switchCase.eContainer();

		MOperatingSystem os = (MOperatingSystem)parameter.eContainer();
		
		Set<MParameter> params = PDLUtil.getDefault().getParameters(os);

		for (MOperatingSystem ios : os.getInherits())
		{
			if (ios.eIsProxy() == false)
			{
				params.addAll(PDLUtil.getDefault().getAllParameters(ios));
			}
		}
		
		for (MOSSupportedOSAPI sosapi : os.getSupportedOSAPIs())
		{
			if (sosapi.getOsapi() != null &&
				sosapi.getOsapi().eIsProxy() == false)
			{
				params.addAll(PDLUtil.getDefault().getAllParameters(sosapi.getOsapi()));
			}
		}
		
		if (switchCase.getPlatform() != null &&
			switchCase.getPlatform().eIsProxy() == false)
		{
			params.addAll(PDLUtil.getDefault().getParameters(switchCase.getPlatform()));
			params.addAll(getAllPlatformParameters(switchCase.getPlatform()));
		}
		
		params.remove(parameter);
		
		IScope innerScope = getFullObjectScope(params);
			
		if (parameter instanceof MEnumParamOSSPSwitch)
		{
			// Then we have to return the literals
			MEnumParamOSSPSwitch param = (MEnumParamOSSPSwitch)parameter;
			if (param.getEnumDefinition() != null &&
				param.getEnumDefinition().eIsProxy() == false)
			{
				
				return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), innerScope);
			}
		}

		return innerScope;
	}
	
	/**
	 * Provides the scope for the supported platforms of a given operating
	 * system.
	 * 
	 * @param os the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOSSupportedPlatform(MOperatingSystem os, EReference reference)
	{
		return getSimpleObjectScope(os.getSupportedPlatforms());
	}
	
	/**
	 * Provides the scope for the elements than can be referenced in the
	 * definition of the default value of a parameter or when assigning
	 * a new value to a parameter
	 * @param parameter the configuration parameter.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(final MParameter parameter, EReference reference)
	{
		// We have to check the container of the parameter
		if (parameter.eContainer() instanceof MOperatingSystemAPI)
		{
			MOperatingSystemAPI osapi = (MOperatingSystemAPI)parameter.eContainer();
			
			Set<MParameter> params = new HashSet<MParameter>();
				
			for (MOperatingSystemAPI iosapi : osapi.getInherits())
			{
				if (iosapi.eIsProxy() == false)
				{
					params.addAll(PDLUtil.getDefault().getAllParameters(iosapi));
				}
			}
			for (MParameter param : osapi.getParameters())
			{
				if (param == parameter)
				{
					continue;
				}
				if (!(param instanceof MEnumParameterDefinition))
				{
					params.add(param);
				}
			}
			
			IScope outerScope = getFullObjectScope(params);
			
			if (parameter instanceof MEnumParameter)
			{
				MEnumParameter enumParam = (MEnumParameter) parameter;
				if (enumParam.getEnumDefinition() != null &&
					enumParam.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(enumParam.getEnumDefinition().getLiterals(), outerScope);
				}
			}
			
			return outerScope;
		}
		else if (parameter.eContainer() instanceof MOperatingSystem)
		{
			MOperatingSystem os = (MOperatingSystem)parameter.eContainer();
			
			Set<MParameter> params = new HashSet<MParameter>();
				
			for (MOperatingSystem ios : os.getInherits())
			{
				if (ios.eIsProxy() == false)
				{
					params.addAll(PDLUtil.getDefault().getAllParameters(ios));
				}
			}
			
			for (MParameter param : os.getParameters())
			{
				if (param == parameter)
				{
					continue;
				}
				if (!(param instanceof MEnumParameterDefinition))
				{
					params.add(param);
				}
			}
			
			IScope outerScope = getFullObjectScope(params);
			 
			if (parameter instanceof MEnumParameter)
			{
				MEnumParameter enumParam = (MEnumParameter) parameter;
				if (enumParam.getEnumDefinition() != null &&
					enumParam.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(enumParam.getEnumDefinition().getLiterals(), outerScope);
				}	
			}
			return outerScope;
		}
		else if (parameter.eContainer() instanceof MOSSupportedPlatform)
		{
			MOSSupportedPlatform ossp = (MOSSupportedPlatform)parameter.eContainer();
			MOperatingSystem os = (MOperatingSystem)ossp.eContainer();
			
			Set<MParameter> params = PDLUtil.getDefault().getParameters(os);
				
			for (MOperatingSystem ios : os.getInherits())
			{
				if (ios.eIsProxy() == false)
				{
					params.addAll(PDLUtil.getDefault().getAllParameters(ios));
				}
			}
			
			for (MParameter param : ossp.getParameters())
			{
				if (param == parameter)
				{
					continue;
				}
				if (!(param instanceof MEnumParameterDefinition))
				{
					params.add(param);
				}
			}
			
			params.addAll(getAllPlatformParameters(ossp));
			
			IScope outerScope = getFullObjectScope(params);
			 
			if (parameter instanceof MEnumParameter)
			{
				MEnumParameter enumParam = (MEnumParameter) parameter;
				if (enumParam.getEnumDefinition() != null &&
					enumParam.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(enumParam.getEnumDefinition().getLiterals(), outerScope);
				}	
			}
			return outerScope;
		}
		else if (parameter.eContainer() instanceof MArchitecture)
		{
			MArchitecture architecture = (MArchitecture)parameter.eContainer();
			
			Set<MParameter> params = new HashSet<MParameter>();
				
			for (MArchitecture eArch : architecture.getExtends())
			{
				if (eArch.eIsProxy() == false)
				{
					params.addAll(PDLUtil.getDefault().getAllParameters(eArch));
				}
			}
			
			for (MParameter param : architecture.getParameters())
			{
				if (param == parameter)
				{
					continue;
				}
				if (!(param instanceof MEnumParameterDefinition))
				{
					params.add(param);
				}
			}
			
			IScope outerScope = getFullObjectScope(params);
			 
			if (parameter instanceof MEnumParameter)
			{
				MEnumParameter enumParam = (MEnumParameter) parameter;
				if (enumParam.getEnumDefinition() != null &&
					enumParam.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(enumParam.getEnumDefinition().getLiterals(), outerScope);
				}	
			}
			return outerScope;
		}
		else if (parameter.eContainer() instanceof MCompiler)
		{
			MCompiler compiler = (MCompiler)parameter.eContainer();
			
			Set<MParameter> params = new HashSet<MParameter>();
				
			for (MCompiler eComp : compiler.getExtends())
			{
				if (eComp.eIsProxy() == false)
				{
					params.addAll(PDLUtil.getDefault().getAllParameters(eComp));
				}
			}
			
			for (MParameter param : compiler.getParameters())
			{
				if (param == parameter)
				{
					continue;
				}
				if (!(param instanceof MEnumParameterDefinition))
				{
					params.add(param);
				}
			}
			
			IScope outerScope = getFullObjectScope(params);
			 
			if (parameter instanceof MEnumParameter)
			{
				MEnumParameter enumParam = (MEnumParameter) parameter;
				if (enumParam.getEnumDefinition() != null &&
					enumParam.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(enumParam.getEnumDefinition().getLiterals(), outerScope);
				}	
			}
			return outerScope;
		}
		else if (parameter.eContainer() instanceof MCompilerFrontend)
		{
			MCompilerFrontend frontend = (MCompilerFrontend)parameter.eContainer();
			MCompiler compiler = (MCompiler)frontend.eContainer();
			
			Set<MParameter> params = new HashSet<MParameter>();
			
			for (MArchitecture architecture : frontend.getArchitectures())
			{
				if (architecture.eIsProxy() == false)
				{
					params.addAll(PDLUtil.getDefault().getAllParameters(architecture));
					for (MCompiler eComp : compiler.getExtends())
					{
						if (eComp.eIsProxy() == false)
						{
							params.addAll(PDLUtil.getDefault().getAllParameters(eComp, architecture));
						}
					}
				}
			}
			
			for (MParameter param : compiler.getParameters())
			{
				if (param == parameter)
				{
					continue;
				}
				if (!(param instanceof MEnumParameterDefinition))
				{
					params.add(param);
				}
			}
			
			for (MParameter param : frontend.getParameters())
			{
				if (param == parameter)
				{
					continue;
				}
				if (!(param instanceof MEnumParameterDefinition))
				{
					params.add(param);
				}
			}
			
			IScope outerScope = getFullObjectScope(params);
			 
			if (parameter instanceof MEnumParameter)
			{
				MEnumParameter enumParam = (MEnumParameter) parameter;
				if (enumParam.getEnumDefinition() != null &&
					enumParam.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(enumParam.getEnumDefinition().getLiterals(), outerScope);
				}	
			}
			return outerScope;
		}
		else if (parameter.eContainer() instanceof MMicroprocessor)
		{
			MMicroprocessor microprocessor = (MMicroprocessor)parameter.eContainer();
			
			Set<MParameter> params = new HashSet<MParameter>();
				
			for (MParameter param : microprocessor.getParameters())
			{
				if (param == parameter)
				{
					continue;
				}
				if (!(param instanceof MEnumParameterDefinition))
				{
					params.add(param);
				}
			}
			
			if (microprocessor.getArchitecture() != null &&
				microprocessor.getArchitecture().eIsProxy() == false)
			{
				params.addAll(PDLUtil.getDefault().getAllParameters(microprocessor.getArchitecture()));
			}
			
			IScope outerScope = getFullObjectScope(params);
			 
			if (parameter instanceof MEnumParameter)
			{
				MEnumParameter enumParam = (MEnumParameter) parameter;
				if (enumParam.getEnumDefinition() != null &&
					enumParam.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(enumParam.getEnumDefinition().getLiterals(), outerScope);
				}	
			}
			return outerScope;
		}
		else if (parameter.eContainer() instanceof MBoard)
		{
			MBoard board = (MBoard)parameter.eContainer();
			
			Set<MParameter> params = new HashSet<MParameter>();
				
			for (MParameter param : board.getParameters())
			{
				if (param == parameter)
				{
					continue;
				}
				if (!(param instanceof MEnumParameterDefinition))
				{
					params.add(param);
				}
			}
			
			if (board.getMicroprocessor() != null &&
				board.getMicroprocessor().eIsProxy() == false)
			{
				params.addAll(PDLUtil.getDefault().getParameters(board.getMicroprocessor()));
			}
			
			IScope outerScope = getFullObjectScope(params);
			 
			if (parameter instanceof MEnumParameter)
			{
				MEnumParameter enumParam = (MEnumParameter) parameter;
				if (enumParam.getEnumDefinition() != null &&
					enumParam.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(enumParam.getEnumDefinition().getLiterals(), outerScope);
				}	
			}
			return outerScope;
		}
		else if (parameter.eContainer() instanceof MPlatform)
		{
			MPlatform platform = (MPlatform)parameter.eContainer();
			
			Set<MParameter> params = getAllPlatformParameters(platform);
			
			for (MParameter param : platform.getParameters())
			{
				if (param == parameter)
				{
					continue;
				}
				if (!(param instanceof MEnumParameterDefinition))
				{
					params.add(param);
				}
			}
			IScope outerScope = getFullObjectScope(params);
			
			if (parameter instanceof MEnumParameter)
			{
				MEnumParameter enumParam = (MEnumParameter) parameter;
				if (enumParam.getEnumDefinition() != null &&
					enumParam.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(enumParam.getEnumDefinition().getLiterals(), outerScope);
				}	
			}
			
			return outerScope;
		}
		else
		{
			return IScope.NULLSCOPE;
		}
	}


	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within a platform.
	 * @param platform the platform.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameter_enumDefinition(final MPlatform platform, EReference reference)
	{	
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		if (platform.getOsapi() != null &&
			platform.getOsapi().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(platform.getOsapi()));
		}
		if (platform.getOs() != null &&
			platform.getOs().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(platform.getOs(), platform));
		}
		if (platform.getArchitecture() != null &&
			platform.getArchitecture().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(platform.getArchitecture()));	
		}
		if (platform.getCompiler() != null &&
			platform.getCompiler().eIsProxy() == false)
		{
			if (platform.getArchitecture() != null &&
				platform.getArchitecture().eIsProxy() == false)
			{
				outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(platform.getCompiler(), platform.getArchitecture()));
			}
			else
			{
				outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(platform.getCompiler()));	
			}
		}
		if (platform.getMicroprocessor() != null &&
			platform.getMicroprocessor().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getEnumParameterDefinitions(platform.getMicroprocessor()));
		}
		if (platform.getBoard() != null &&
			platform.getBoard().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getEnumParameterDefinitions(platform.getBoard()));
			for (MBoardSupportedDevice sdevice : platform.getBoard().getSupportedDevices())
			{
				outerDefs.addAll(PDLUtil.getDefault().getEnumParameterDefinitions(sdevice.getDevice()));
			}
		}
		IScope outerScope = getFullObjectScope(outerDefs);
		return getSimpleObjectScope(PDLUtil.getDefault().getEnumParameterDefinitions(platform), outerScope);
	}

	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within an operating system.
	 * @param os The operating system.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MEnumParameter_enumDefinition(final MOperatingSystem os, EReference reference)
	{	
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		for (MOperatingSystem ios : os.getInherits())
		{
			if (ios.eIsProxy() == false)
			{
				outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(ios));
			}
		}

		for (MOSSupportedOSAPI sosapi : os.getSupportedOSAPIs())
		{
			if (sosapi.getOsapi() != null &&
				sosapi.getOsapi().eIsProxy() == false)
			{
				outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(sosapi.getOsapi()));
			}
		}
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(PDLUtil.getDefault().getEnumParameterDefinitions(os), outerScope);
	}
	
	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within an operating system
	 * supported platform.
	 * @param ossp The operating system supported platform.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MEnumParameter_enumDefinition(final MOSSupportedPlatform ossp, EReference reference)
	{	
		MOperatingSystem os = (MOperatingSystem)ossp.eContainer().eContainer();

		Set<MEnumParameterDefinition> outerDefs = PDLUtil.getDefault().getEnumParameterDefinitions(os);
		
		for (MOperatingSystem ios : os.getInherits())
		{
			if (ios.eIsProxy() == false)
			{
				outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(ios));
			}
		}
		for (MOSSupportedOSAPI sosapi : os.getSupportedOSAPIs())
		{
			if (sosapi.getOsapi() != null &&
				sosapi.getOsapi().eIsProxy() == false)
			{
				outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(sosapi.getOsapi()));
			}
		}
		
		if (ossp.getArchitecture() != null &&
			ossp.getArchitecture().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(ossp.getArchitecture()));
		}
		if (ossp.getCompiler() != null &&
			ossp.getCompiler().eIsProxy() == false)
		{
			if (ossp.getArchitecture() != null &&
					ossp.getArchitecture().eIsProxy() == false)
			{
				outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(ossp.getCompiler(), ossp.getArchitecture()));
			}
			else
			{
				outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(ossp.getCompiler()));
			}
		}	
		if (ossp.getMicroprocessor() != null &&
			ossp.getMicroprocessor().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getEnumParameterDefinitions(ossp.getMicroprocessor()));
		}
		if (ossp.getBoard() != null &&
			ossp.getBoard().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getEnumParameterDefinitions(ossp.getBoard()));
			for (MBoardSupportedDevice sdevice : ossp.getBoard().getSupportedDevices())
			{
				outerDefs.addAll(PDLUtil.getDefault().getEnumParameterDefinitions(sdevice.getDevice()));
			}
		}
	
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(PDLUtil.getDefault().getEnumParameterDefinitions(ossp), outerScope);
	}
	
	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within an operating system API.
	 * @param osapi The operating system API.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MEnumParameter_enumDefinition(final MOperatingSystemAPI osapi, EReference reference)
	{	
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		for (MOperatingSystemAPI iosapi : osapi.getInherits())
		{
			if (iosapi.eIsProxy() == false)
			{
				outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(iosapi));
			}
		}
		
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(PDLUtil.getDefault().getEnumParameterDefinitions(osapi), outerScope);
	}
	
	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within an architecture.
	 * @param architecture the architecture.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameter_enumDefinition(final MArchitecture architecture, EReference reference)
	{	
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		for (MArchitecture eArch : architecture.getExtends())
		{
			if (eArch.eIsProxy() == false)
			{
				outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(eArch));
			}
		}
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(PDLUtil.getDefault().getEnumParameterDefinitions(architecture), outerScope);
	}
	
	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within a microprocessor.
	 * @param microprocessor the microprocessor.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameter_enumDefinition(final MMicroprocessor microprocessor, EReference reference)
	{	
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		if (microprocessor.getArchitecture() != null &&
			microprocessor.getArchitecture().eIsProxy() == false)
		{
			outerDefs.addAll(PDLUtil.getDefault().getAllEnumParameterDefinitions(microprocessor.getArchitecture()));
		}
		
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(PDLUtil.getDefault().getEnumParameterDefinitions(microprocessor), outerScope);
	}
	
	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within a board.
	 * @param board the board.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameter_enumDefinition(final MBoard board, EReference reference)
	{	
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		for (MBoardSupportedDevice sdevice : board.getSupportedDevices())
		{
			if (sdevice.getDevice() != null &&
				sdevice.getDevice().eIsProxy() == false)
			{
				outerDefs.addAll(PDLUtil.getDefault().getEnumParameterDefinitions(sdevice.getDevice()));
			}
		}
		
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(PDLUtil.getDefault().getEnumParameterDefinitions(board), outerScope);
	}
	
	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within a device.
	 * @param device the device.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameter_enumDefinition(final MDevice device, EReference reference)
	{	
		return getFullObjectScope(PDLUtil.getDefault().getEnumParameterDefinitions(device));
	}
			
	/**
	 * Provides the scope for the referenceable operating system APIs.
	 * @param element the element to which the reference belongs.
	 * @param reference the object representing the reference.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOperatingSystemAPI(final MPDLPackageElement element, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)element.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)element.eContainer()).getPackage();
		
		try {
			elements = PDLLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(PDLLibraryManager.getLibraryManager().
						getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);
	}
	
	/**
	 * Provides the scope for the referenceable operating systems.
	 * @param element the element to which the reference belongs.
	 * @param reference the object representing the reference.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOperatingSystem(final MPDLPackageElement element, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)element.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)element.eContainer()).getPackage();
		
		try {
			elements = PDLLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(PDLLibraryManager.getLibraryManager().
						getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);
	}
	
	/**
	 * Provides the scope for the referenceable architectures.
	 * @param element the element to which the reference belongs.
	 * @param reference the object representing the reference of the element.
	 * @return the scope of the reference.
	 */
	public IScope scope_MArchitecture(final MPDLPackageElement element, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)element.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)element.eContainer()).getPackage();
		
		try {
			elements = PDLLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(PDLLibraryManager.getLibraryManager().
						getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);
	}
	
	/**
	 * Provides the scope for the referenceable compilers.
	 * @param element the model element to which the reference belongs.
	 * @param reference the object representing the reference of the element.
	 * @return the scope of the reference.
	 */
	public IScope scope_MCompiler(final MPDLPackageElement element, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)element.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)element.eContainer()).getPackage();
		
		try {
			elements = PDLLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(PDLLibraryManager.getLibraryManager().
						getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);
	}
	
	/**
	 * Provides the scope for the referenceable microprocessors.
	 * @param element the model element to which the reference belongs.
	 * @param reference the object representing the reference.
	 * @return the scope of the reference.
	 */
	public IScope scope_MMicroprocessor(final MPDLPackageElement element, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)element.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)element.eContainer()).getPackage();
		
		try {
			elements = PDLLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(PDLLibraryManager.getLibraryManager().
						getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);
	}
	
	/**
	 * Provides the scope for the referenceable boards.
	 * @param element the model element to which the reference belongs.
	 * @param reference the object representing the board field of the
	 *        operating system supported platform.
	 * @return the scope of the reference.
	 */
	public IScope scope_MBoard(final MPDLPackageElement element, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)element.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)element.eContainer()).getPackage();
		
		try {
			elements = PDLLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(PDLLibraryManager.getLibraryManager().
						getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);
	}

	/**
	 * Provides the scope for the referenceable devices.
	 * @param element the model element to which the reference belongs.
	 * @param reference The object representing the board field of the
	 *        operating system supported platform.
	 * @return The scope of the reference.
	 */
	public IScope scope_MDevice(final MPDLPackageElement element, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)element.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)element.eContainer()).getPackage();
		
		try {
			elements = PDLLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(PDLLibraryManager.getLibraryManager().
						getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);
	}
	
	@Override
	public ILibraryManager getFileLibraryManager() throws LibraryManagerException {
		return PDLLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
	/**
	 * Returns the complete set of parameters defined by the platform elements
	 * attached to a given operating system supported platform.
	 * 
	 * @param ossp the operating system supported platform.
	 * @return the set of parameters.
	 */
	protected Set<MParameter> getAllPlatformParameters(MOSSupportedPlatform ossp)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		if (ossp.getArchitecture() != null &&
			ossp.getArchitecture().eIsProxy() == false)
		{
			params.addAll(PDLUtil.getDefault().getAllParameters(ossp.getArchitecture()));
		}
		if (ossp.getCompiler() != null &&
			ossp.getCompiler().eIsProxy() == false)
		{
			if (ossp.getArchitecture() != null &&
				ossp.getArchitecture().eIsProxy() == false)
			{
				params.addAll(PDLUtil.getDefault().getAllParameters(ossp.getCompiler()));
			}
			else
			{
				params.addAll(PDLUtil.getDefault().getAllParameters(ossp.getCompiler(), ossp.getArchitecture()));
			}
		}
		if (ossp.getMicroprocessor() != null &&
			ossp.getMicroprocessor().eIsProxy() == false)
		{
			params.addAll(PDLUtil.getDefault().getParameters(ossp.getMicroprocessor()));
		}
		if (ossp.getBoard() != null &&
			ossp.getBoard().eIsProxy() == false)
		{
			params.addAll(PDLUtil.getDefault().getParameters(ossp.getBoard()));
		}
		
		return params;
	}
	
	/**
	 * Returns the complete set of parameters defined by the constituent elements
	 * of a given platform.
	 * 
	 * @param platform the operating system supported platform.
	 * @return the set of parameters.
	 */
	protected Set<MParameter> getAllPlatformParameters(MPlatform platform)
	{
		Set<MParameter> params = new HashSet<MParameter>();
		
		if (platform.getOsapi() != null &&
			platform.getOsapi().eIsProxy() == false)
		{
			params.addAll(PDLUtil.getDefault().getAllParameters(platform.getOsapi()));
		}
		if (platform.getOs() != null &&
			platform.getOs().eIsProxy() == false)
		{
			params.addAll(PDLUtil.getDefault().getAllParameters(platform.getOs()));
		}
		if (platform.getArchitecture() != null &&
			platform.getArchitecture().eIsProxy() == false)
		{
			params.addAll(PDLUtil.getDefault().getAllParameters(platform.getArchitecture()));
		}
		if (platform.getCompiler() != null &&
			platform.getCompiler().eIsProxy() == false)
		{
			if (platform.getArchitecture() != null &&
				platform.getArchitecture().eIsProxy() == false)
			{
				params.addAll(PDLUtil.getDefault().getAllParameters(platform.getCompiler()));
			}
			else
			{
				params.addAll(PDLUtil.getDefault().getAllParameters(platform.getCompiler(), platform.getArchitecture()));
			}
		}
		if (platform.getMicroprocessor() != null &&
			platform.getMicroprocessor().eIsProxy() == false)
		{
			params.addAll(PDLUtil.getDefault().getParameters(platform.getMicroprocessor()));
		}
		if (platform.getBoard() != null &&
			platform.getBoard().eIsProxy() == false)
		{
			params.addAll(PDLUtil.getDefault().getParameters(platform.getBoard()));
		}
		
		return params;
	}
	
}
