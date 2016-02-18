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
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MEnumParamSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MParameterSLSPSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVAExpression;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitch;
import es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.mclev.xtext.MCLEVElementAbstractScopeProvider;
import es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;

/**
 * This class contains custom scoping description.
 */
public class SLIBScopeProvider extends MCLEVElementAbstractScopeProvider {
	
	/**
	 * Provides the scope for the supported platforms of a given service
	 * library.
	 * 
	 * @param slib the service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MServiceLibrarySupportedPlatform(MServiceLibrary slib, EReference reference)
	{
		return getSimpleObjectScope(slib.getSupportedPlatforms());
	}
	
	/**
	 * Scope that provides the list of configuration parameters that
	 * can be used to state the default value of a parameter defined by a
	 * service library.
	 * 
	 * @param parameter the parameter.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(final MParameter parameter, EReference reference)
	{
		if (parameter.eContainer() instanceof MAbstractServiceLibrary)
		{
			MAbstractServiceLibrary aswp = (MAbstractServiceLibrary)parameter.eContainer();
			
			Set<MParameter> params = MCLEVUtil.getDefault().getAttributes(aswp);
				
			for (MAbstractServiceLibrary iswp : aswp.getInherits())
			{
				if (iswp.eIsProxy() == false)
				{
					params.addAll(MCLEVUtil.getDefault().getAllAttributes(iswp));
				}
			}
			
			if (aswp instanceof MServiceLibrary)
			{
				MServiceLibrary swp = (MServiceLibrary) aswp;
				for (MSAI sai : swp.getRequires())
				{
					if (sai.eIsProxy())
					{
						params.addAll(MCLEVUtil.getDefault().getAllAttributes(sai));
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
		else if (parameter.eContainer() instanceof MServiceLibrarySupportedPlatform)
		{
			MServiceLibrarySupportedPlatform slsp = (MServiceLibrarySupportedPlatform)parameter.eContainer();
			MServiceLibrary slib = (MServiceLibrary)slsp.eContainer();
			
			Set<MParameter> params = MCLEVUtil.getDefault().getAttributes(slib);
			
			for (MAbstractServiceLibrary aslib : slib.getInherits())
			{
				if (aslib.eIsProxy() == false)
				{
					params.addAll(MCLEVUtil.getDefault().getAllAttributes(aslib));
				}
			}
			params.addAll(MCLEVUtil.getDefault().getAttributes(slsp));
			
			for (MSAI sai : slib.getRequires())
			{
				if (sai.eIsProxy() == false)
				{
					params.addAll(MCLEVUtil.getDefault().getAllAttributes(sai));
				}
			}
			
			for (MSAI sai : slsp.getRequires())
			{
				if (sai.eIsProxy() == false)
				{
					params.addAll(MCLEVUtil.getDefault().getAllAttributes(sai));
				}
			}
			
			params.remove(parameter);
			
			params.addAll(getAllPlatformParameters(slsp));
			
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
	 * Provides the scope for the parameters whose values can be assigned
	 * when a SAI is provided by a service library.
	 * 
	 * @param psai the SAI that is being provided.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(MServiceLibraryProvidedSAI psai, EReference reference)
	{
		if (psai.getSai() == null ||
			psai.getSai().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MSAI eswi : psai.getSai().getExtends())
		{
			params.addAll(MCLEVUtil.getDefault().getAllAttributes(eswi));
		}	

		IScope outerScope = getFullObjectScope(params);
		
		return getSimpleObjectScope(MCLEVUtil.getDefault().getAttributes(psai.getSai()), outerScope);
	}

	
	public IScope scope_MParameterValueRefObject_object(MSLibProvidedSAIAVAExpression pva, EReference reference)
	{
		MServiceLibraryProvidedSAI pswi = (MServiceLibraryProvidedSAI) pva.eContainer();

		MAbstractServiceLibrary aslib = (MAbstractServiceLibrary)pswi.eContainer();
		
		Set<MParameter> params = MCLEVUtil.getDefault().getAttributes(aslib);

		for (MAbstractServiceLibrary iswp : aslib.getInherits())
		{
			if (iswp.eIsProxy() == false)
			{
				params.addAll(MCLEVUtil.getDefault().getAllAttributes(iswp));
			}
		}
		
		if (aslib instanceof MServiceLibrary)
		{
			MServiceLibrary swp = (MServiceLibrary)aslib;
			
			for (MSAI rsai : swp.getRequires())
			{
				if (rsai.eIsProxy())
				{
					params.addAll(MCLEVUtil.getDefault().getAllAttributes(rsai));
				}
			}
		}
		
		if (pswi.getSai() != null &&
			pswi.getSai().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getAllAttributes(pswi.getSai()));
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
	
	public IScope scope_MParameterValueRefObject_object(MParameterSLSPSwitchCase switchCase, EReference reference)
	{
		MParameterSLSPSwitch parameter = (MParameterSLSPSwitch) switchCase.eContainer();

		MServiceLibrary swp = (MServiceLibrary)parameter.eContainer();
		
		Set<MParameter> params = MCLEVUtil.getDefault().getAttributes(swp);

		for (MAbstractServiceLibrary aswp : swp.getInherits())
		{
			if (aswp.eIsProxy() == false)
			{
				params.addAll(MCLEVUtil.getDefault().getAllAttributes(aswp));
			}
		}
		
		for (MSAI rswi : swp.getRequires())
		{
			if (rswi.eIsProxy() == false)
			{
				params.addAll(MCLEVUtil.getDefault().getAllAttributes(rswi));
			}
		}
		
		if (switchCase.getPlatform() != null &&
			switchCase.getPlatform().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getAttributes(switchCase.getPlatform()));
			params.addAll(getAllPlatformParameters(switchCase.getPlatform()));
			
			for (MSAI rswi : switchCase.getPlatform().getRequires())
			{
				if (rswi.eIsProxy() == false)
				{
					params.addAll(MCLEVUtil.getDefault().getAllAttributes(rswi));
				}
			}
		}
		
		params.remove(parameter);
		
		IScope innerScope = getFullObjectScope(params);
			
		if (parameter instanceof MEnumParamSLSPSwitch)
		{
			// Then we have to return the literals
			MEnumParamSLSPSwitch param = (MEnumParamSLSPSwitch)parameter;
			if (param.getEnumDefinition() != null &&
				param.getEnumDefinition().eIsProxy() == false)
			{	
				return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), innerScope);
			}
		}

		return innerScope;
	}
	
	/**
	 * Provides the scope for the referenceable objects that can be used
	 * in value assignment expression to a provided SAI parameter value.
	 * 
	 * @param pva the value assignment expression.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(MSLibProvidedSAIAVASwitchCase pvaSwitchCase, EReference reference)
	{
		MSLibProvidedSAIAVASwitch pva = (MSLibProvidedSAIAVASwitch) pvaSwitchCase.eContainer();
		MServiceLibraryProvidedSAI pswi = (MServiceLibraryProvidedSAI) pva.eContainer();

		MAbstractServiceLibrary aswp = (MAbstractServiceLibrary)pswi.eContainer();
		
		Set<MParameter> params = MCLEVUtil.getDefault().getAttributes(aswp);

		for (MAbstractServiceLibrary iswp : aswp.getInherits())
		{
			if (iswp.eIsProxy() == false)
			{
				params.addAll(MCLEVUtil.getDefault().getAllAttributes(iswp));
			}
		}
		
		if (aswp instanceof MServiceLibrary)
		{
			MServiceLibrary swp = (MServiceLibrary)aswp;
			
			for (MSAI rswi : swp.getRequires())
			{
				if (rswi.eIsProxy() == false)
				{
					params.addAll(MCLEVUtil.getDefault().getAllAttributes(rswi));
				}
			}
		}
		
		if (pswi.getSai() != null &&
			pswi.getSai().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getAllAttributes(pswi.getSai()));
		}
		
		if (pvaSwitchCase.getPlatform() != null &&
			pvaSwitchCase.getPlatform().eIsProxy() == false)
		{
			params.addAll(MCLEVUtil.getDefault().getAttributes(pvaSwitchCase.getPlatform()));
			params.addAll(getAllPlatformParameters(pvaSwitchCase.getPlatform()));
			
			for (MSAI rswi : pvaSwitchCase.getPlatform().getRequires())
			{
				if (rswi.eIsProxy() == false)
				{
					params.addAll(MCLEVUtil.getDefault().getAllAttributes(rswi));
				}
			}
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
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within an abstract service library.
	 * This types are the ones defined by the very library plus the
	 * ones defined by the libraries it inherits.
	 * Implements Restriction TBD
	 * @param ires the enumerated configuration parameter.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameterDefinition(final MAbstractServiceLibrary aswp, EReference reference)
	{		
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		for (MAbstractServiceLibrary paswp : aswp.getInherits())
		{
			if (paswp.eIsProxy() == false)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(paswp));
				for (MSAI pswi : MCLEVUtil.getDefault().getAllProvidedSAIs(paswp))
				{
					outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(pswi));
				}
			}
		}
		for (MServiceLibraryProvidedSAI pswi : aswp.getProvides())
		{
			if (pswi.getSai().eIsProxy() == false)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(pswi.getSai()));
			}
		}

		if (aswp instanceof MServiceLibrary)
		{
			MServiceLibrary swp = (MServiceLibrary)aswp;
			for (MSAI riface : swp.getRequires())
			{
				if (riface.eIsProxy() == false)
				{
					outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(riface));
				}
			}
		}
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(MCLEVUtil.getDefault().getEnumAttributeDefinitions(aswp), outerScope);
	}
	
	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within service library supported
	 * platform.
	 * This types are the ones defined by the very library plus the
	 * ones defined by the libraries it inherits.
	 * Implements Restriction TBD
	 * @param slibsp the service library supported platform.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameter_enumDefinition(final MServiceLibrarySupportedPlatform slibsp, EReference reference)
	{		
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		MServiceLibrary swp = (MServiceLibrary)slibsp.eContainer();
		
		for (MAbstractServiceLibrary paswp : swp.getInherits())
		{
			if (paswp.eIsProxy() == false)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(paswp));
				for (MSAI pswi : MCLEVUtil.getDefault().getAllProvidedSAIs(paswp))
				{
					outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(pswi));
				}
			}
		}
		
		for (MServiceLibraryProvidedSAI pswi : swp.getProvides())
		{
			if (pswi.getSai().eIsProxy() == false)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(pswi.getSai()));
			}
		}
		
		for (MSAI riface : swp.getRequires())
		{
			if (riface.eIsProxy() == false)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(riface));
			}
		}
		
		for (MSAI riface : slibsp.getRequires())
		{
			if (riface.eIsProxy() == false)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumAttributeDefinitions(riface));
			}
		}
		
		if (slibsp.getOsapi() != null &&
			slibsp.getOsapi().eIsProxy() == false)
		{
			outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumParameterDefinitions(slibsp.getOsapi()));
		}
		if (slibsp.getOs() != null &&
			slibsp.getOs().eIsProxy() == false)
		{
			outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumParameterDefinitions(slibsp.getOs()));
			MOSSupportedPlatform ossp = MCLEVUtil.getDefault().getMatchingPlatform(slibsp.getOs(), MCLEVUtil.getDefault().toPlatform(slibsp));
			if (ossp != null)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getEnumParameterDefinitions(ossp));
			}
		}
		if (slibsp.getArchitecture() != null &&
			slibsp.getArchitecture().eIsProxy() == false)
		{
			outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumParameterDefinitions(slibsp.getArchitecture()));	
		}
		
		if (slibsp.getCompiler() != null &&
			slibsp.getCompiler().eIsProxy() == false)
		{
			if (slibsp.getArchitecture() != null &&
				slibsp.getArchitecture().eIsProxy() == false)
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumParameterDefinitions(slibsp.getCompiler(), slibsp.getArchitecture()));
			}
			else
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getAllEnumParameterDefinitions(slibsp.getCompiler()));	
			}
		}
		
		if (slibsp.getMicroprocessor() != null &&
			slibsp.getMicroprocessor().eIsProxy() == false)
		{
			outerDefs.addAll(MCLEVUtil.getDefault().getEnumParameterDefinitions(slibsp.getMicroprocessor()));
		}
		
		if (slibsp.getBoard() != null &&
			slibsp.getBoard().eIsProxy() == false)
		{
			outerDefs.addAll(MCLEVUtil.getDefault().getEnumParameterDefinitions(slibsp.getBoard()));
			for (MBoardSupportedDevice sdevice : slibsp.getBoard().getSupportedDevices())
			{
				outerDefs.addAll(MCLEVUtil.getDefault().getEnumParameterDefinitions(sdevice.getDevice()));
			}
		}
		
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(MCLEVUtil.getDefault().getEnumAttributeDefinitions(slibsp), outerScope);
	}
	
	/**
	 * Provides the scope with the list of SAIs that can be included as part of
	 * the definition of a service library (both abstract and regular).
	 * @param aslib the service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSAI(final MAbstractServiceLibrary aslib, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)aslib.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)aslib.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mclevsaiPackage.eINSTANCE.getMSAI());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevsaiPackage.eINSTANCE.getMSAI()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of abstract service libraries that can
	 * be included as inheritance references in the definition of an abstract
	 * service library.
	 * @param aslib the abstract service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MAbstractServiceLibrary(final MAbstractServiceLibrary aslib, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)aslib.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)aslib.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mclevslibPackage.eINSTANCE.getMAbstractServiceLibrary());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevslibPackage.eINSTANCE.getMAbstractServiceLibrary()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of regular service libraries that can
	 * be included as inheritance references in the definition of a service 
	 * library.
	 * @param slib the service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MServiceLibrary(final MServiceLibrary slib, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)slib.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)slib.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mclevslibPackage.eINSTANCE.getMServiceLibrary());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevslibPackage.eINSTANCE.getMServiceLibrary()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of operating system APIs that can be
	 * included in the definition of a service library. This list includes the
	 * operating systems APIs present in the PDL packages imported by the
	 * service library.
	 * @param slib the service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOperatingSystemAPI(final MServiceLibrary slib, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)slib.eContainer()).getImports();
		
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
	 * included in the definition of a service library. This list includes the
	 * operating systems present in the PDL packages imported by the service
	 * library.
	 * @param slib the service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOperatingSystem(final MServiceLibrary slib, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)slib.eContainer()).getImports();
		
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
	 * Provides the scope with the list of architectures that can be included
	 * in the definition of a service library. This list includes the
	 * compilers present in the PDL packages imported by the service library.
	 * @param slib the service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MArchitecture(final MServiceLibrary slib, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)slib.eContainer()).getImports();
		
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
	 * Provides the scope with the list of compilers that can be included in
	 * the definition of a service library. This list includes the compilers
	 * present in the PDL packages imported by the service library.
	 * @param slib the service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MCompiler(final MServiceLibrary slib, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)slib.eContainer()).getImports();
		
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
	 * Provides the scope with the list of microprocessors that can be included
	 * in the definition of a service library. This list includes the
	 * microprocessors present in the PDL packages imported by the service
	 * library.
	 * @param slib the service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MMicroprocessor(final MServiceLibrary slib, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)slib.eContainer()).getImports();
		
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
	 * definition of a service library. This list includes the boards present
	 * in the PDL packages imported by the service library.
	 * @param slib the service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MBoard(final MServiceLibrary slib, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)slib.eContainer()).getImports();
		
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
	 * Provides the scope with the list of devices that can be included in the
	 * definition of a service library. This list includes the devices present
	 * in the PDL packages imported by the service library.
	 * @param slib the service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MDevice(final MServiceLibrary slib, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)slib.eContainer()).getImports();
		
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
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		importLibraries.add(MCLEVLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
}
