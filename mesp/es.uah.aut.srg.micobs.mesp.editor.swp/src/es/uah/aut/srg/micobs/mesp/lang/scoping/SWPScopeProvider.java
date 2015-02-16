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
package es.uah.aut.srg.micobs.mesp.lang.scoping;

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
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MEnumParamSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MMESPSWPPackageElement;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MParameterSWPSPSwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVAExpression;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitch;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVASwitchCase;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.mesp.xtext.MESPElementAbstractScopeProvider;
import es.uah.aut.srg.micobs.pdl.MBoardSupportedDevice;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class SWPScopeProvider extends MESPElementAbstractScopeProvider {
		
	/**
	 * Provides the scope for the supported platforms of a given software
	 * package.
	 * 
	 * @param swp the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSwPackageSupportedPlatform(MSwPackage swp, EReference reference)
	{
		return getSimpleObjectScope(swp.getSupportedPlatforms());
	}
	
	/**
	 * Provides the scope for the parameters whose values can be assigned
	 * when a software interface is provided by a software package.
	 * 
	 * @param pswi the software interface that is being provided.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(MSwPackageProvidedInterface pswi, EReference reference)
	{
		if (pswi.getSwinterface() == null ||
			pswi.getSwinterface().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		Set<MParameter> params = new HashSet<MParameter>();
		
		for (MSwInterface eswi : pswi.getSwinterface().getExtends())
		{
			params.addAll(mesputil.getAllParameters(eswi));
		}	

		IScope outerScope = getFullObjectScope(params);
		
		return getSimpleObjectScope(mesputil.getParameters(pswi.getSwinterface()), outerScope);
	}
	
	/**
	 * Provides the scope for the quantifiable resources that can be demanded
	 * a software package.
	 * 
	 * @param riface the resource demand expression.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MQuantifiableResourceDemand_resource(final MSwPackageRequiredInterface riface, EReference reference)
	{
		if (riface.getInterface() == null ||
			riface.getInterface().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		if (riface.getInterface() instanceof MSwInterface)
		{
			MSwInterface swi = (MSwInterface) riface.getInterface();
			Set<MQuantifiableResource> qres = new HashSet<MQuantifiableResource>();
			
			for (MSwInterface eswi : swi.getExtends())
			{
				qres.addAll(mesputil.getAllQuantifiableResources(eswi));
			}
			IScope outerScope = getFullObjectScope(qres);
			return getSimpleObjectScope(mesputil.getQuantifiableResources((MSwInterface)riface.getInterface()), outerScope);
		}
		else if (riface.getInterface() instanceof MOSSwInterface)
		{
			MOSSwInterface osswi = (MOSSwInterface) riface.getInterface();
			Set<MQuantifiableResource> qres = new HashSet<MQuantifiableResource>();
			
			for (MOSSwInterface eswi : osswi.getExtends())
			{
				qres.addAll(mesputil.getAllQuantifiableResources(eswi));
			}
			IScope outerScope = getFullObjectScope(qres);
			return getSimpleObjectScope(mesputil.getQuantifiableResources((MOSSwInterface)riface.getInterface()), outerScope);
		}
		else
		{
			return IScope.NULLSCOPE;
		}
		
	}

	
	/**
	 * Provides the scope for the instantiable resources that can be demanded
	 * a software package.
	 * 
	 * @param riface the resource demand expression.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInstantiableResourceDemand_resource(final MSwPackageRequiredInterface riface, EReference reference)
	{
		if (riface.getInterface() == null ||
			riface.getInterface().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
			
		if (riface.getInterface() instanceof MSwInterface)
		{
			MSwInterface swi = (MSwInterface) riface.getInterface();
			Set<MInstantiableResource> qres = new HashSet<MInstantiableResource>();
			
			for (MSwInterface eswi : swi.getExtends())
			{
				qres.addAll(mesputil.getAllInstantiableResources(eswi));
			}
			IScope outerScope = getFullObjectScope(qres);
			return getSimpleObjectScope(mesputil.getInstantiableResources((MSwInterface)riface.getInterface()), outerScope);
		}
		else if (riface.getInterface() instanceof MOSSwInterface)
		{
			MOSSwInterface osswi = (MOSSwInterface) riface.getInterface();
			Set<MInstantiableResource> qres = new HashSet<MInstantiableResource>();
			
			for (MOSSwInterface eswi : osswi.getExtends())
			{
				qres.addAll(mesputil.getAllInstantiableResources(eswi));
			}
			IScope outerScope = getFullObjectScope(qres);
			return getSimpleObjectScope(mesputil.getInstantiableResources((MOSSwInterface)riface.getInterface()), outerScope);
		}
		else
		{
			return IScope.NULLSCOPE;
		}
	}

	/**
	 * Scope that provides the list of integer configuration parameters that
	 * can be used to state the demand of a quantifiable resource by a
	 * software package.
	 * 
	 * @param resource the resource demand expression.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(final MQuantifiableResourceDemand resource, EReference reference)
	{
		MSwPackageRequiredInterface riface = (MSwPackageRequiredInterface) resource.eContainer();
		Set<MCommonReferenceableObj> objs = new HashSet<MCommonReferenceableObj>();
		
		if (riface.eContainer() instanceof MSwPackage)
		{
			MSwPackage swp = (MSwPackage)riface.eContainer();
			
			// First we add the parameters of the software package
			objs.addAll(mesputil.getParameters(swp));
			
			// Then we have to add the parameters obtained from the
			// packages from which it inherits
			for (MSwPackageProvidedInterface pswi : swp.getProvides())
			{
				if (pswi.getSwinterface() != null &&
					pswi.getSwinterface().eIsProxy() == false)
				{
					objs.addAll(mesputil.getAllQuantifiableResources(pswi.getSwinterface()));
				}
			}
			
			// Then the parameters and the quantifiable resources of
			// the interfaces it provides
			for (MAbstractSwPackage pswp : swp.getInherits())
			{
				if (pswp.eIsProxy() == false)
				{
					objs.addAll(mesputil.getAllParameters(pswp));
					for (MSwInterface pswi : mesputil.getAllProvidedSwInterfaces(pswp))
					{
						objs.addAll(mesputil.getAllQuantifiableResources(pswi));
					}
				}
			}		
			
			if (riface.getInterface() != null &&
				riface.getInterface().eIsProxy() == false)
			{
				if (riface.getInterface() instanceof MSwInterface)
				{
					objs.addAll(mesputil.getAllParameters((MSwInterface)riface.getInterface()));
				}
				else
				{
					MOSSwInterface osswi = (MOSSwInterface) riface.getInterface();
					
					objs.addAll(pdlutil.getAllParameters((MOperatingSystemAPI) osswi.getReferencedElement()));
				}
			}

			return getFullObjectScope(objs);
		}
		else
		{	
			MSwPackageSupportedPlatform swpsp = (MSwPackageSupportedPlatform)riface.eContainer();
			MSwPackage swp = (MSwPackage)swpsp.eContainer();
			
			objs.addAll(mesputil.getParameters(swp));
			
			for (MSwPackageProvidedInterface pswi : swp.getProvides())
			{
				if (pswi.getSwinterface() != null &&
					pswi.getSwinterface().eIsProxy() == false)
				{
					objs.addAll(mesputil.getAllQuantifiableResources(pswi.getSwinterface()));
				}
			}
			
			for (MAbstractSwPackage pswp : swp.getInherits())
			{
				if (pswp.eIsProxy() == false)
				{
					objs.addAll(mesputil.getAllParameters(pswp));
					for (MSwInterface pswi : mesputil.getAllProvidedSwInterfaces(pswp))
					{
						objs.addAll(mesputil.getAllQuantifiableResources(pswi));
					}
				}
			}		
			
			objs.addAll(mesputil.getParameters(swpsp));
			objs.addAll(getAllPlatformParameters(swpsp));
			
			
			if (riface.getInterface() != null &&
				riface.getInterface().eIsProxy() == false)
			{
				if (riface.getInterface() instanceof MSwInterface)
				{
					objs.addAll(mesputil.getAllParameters((MSwInterface)riface.getInterface()));
				}
				else
				{
					MOSSwInterface osswi = (MOSSwInterface) riface.getInterface();
					
					objs.addAll(pdlutil.getAllParameters((MOperatingSystemAPI) osswi.getReferencedElement()));
				}
			}
			
			return getFullObjectScope(objs);
		}
		
		
	}
	
	/**
	 * Scope that provides the list of configuration parameters that
	 * can be used to state the default value of a parameter defined by a
	 * software package.
	 * 
	 * @param parameter the parameter.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(final MParameter parameter, EReference reference)
	{
		if (parameter.eContainer() instanceof MAbstractSwPackage)
		{
			MAbstractSwPackage aswp = (MAbstractSwPackage)parameter.eContainer();
			
			Set<MParameter> params = mesputil.getParameters(aswp);
				
			for (MAbstractSwPackage iswp : aswp.getInherits())
			{
				if (iswp.eIsProxy() == false)
				{
					params.addAll(mesputil.getAllParameters(iswp));
				}
			}
			
			if (aswp instanceof MSwPackage)
			{
				MSwPackage swp = (MSwPackage) aswp;
				for (MSwPackageRequiredInterface rswi : swp.getRequires())
				{
					if (rswi.getInterface() != null &&
						rswi.getInterface().eIsProxy() == false &&
						rswi.getInterface() instanceof MSwInterface)
					{
						MSwInterface swi = (MSwInterface)rswi.getInterface();
						params.addAll(mesputil.getAllParameters(swi));
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
		else if (parameter.eContainer() instanceof MSwPackageSupportedPlatform)
		{
			MSwPackageSupportedPlatform swpsp = (MSwPackageSupportedPlatform)parameter.eContainer();
			MSwPackage swp = (MSwPackage)swpsp.eContainer();
			
			Set<MParameter> params = mesputil.getParameters(swp);
			
			for (MAbstractSwPackage iswp : swp.getInherits())
			{
				if (iswp.eIsProxy() == false)
				{
					params.addAll(mesputil.getAllParameters(iswp));
				}
			}
			params.addAll(mesputil.getParameters(swpsp));
			
			for (MSwPackageRequiredInterface rswi : swp.getRequires())
			{
				if (rswi.getInterface() != null &&
					rswi.getInterface().eIsProxy() == false &&
					rswi.getInterface() instanceof MSwInterface)
				{
					MSwInterface swi = (MSwInterface)rswi.getInterface();
					params.addAll(mesputil.getAllParameters(swi));
				}
			}
			
			for (MSwPackageRequiredInterface rswi : swpsp.getRequires())
			{
				if (rswi.getInterface() != null &&
					rswi.getInterface().eIsProxy() == false &&
					rswi.getInterface() instanceof MSwInterface)
				{
					MSwInterface swi = (MSwInterface)rswi.getInterface();
					params.addAll(mesputil.getAllParameters(swi));
				}
			}
			
			params.remove(parameter);
			
			params.addAll(getAllPlatformParameters(swpsp));
			
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
	 * Provides the scope for the parameters of a demanded instantiable
	 * resource.
	 * 
	 * @param ird the object representing the demand of the instantiable
	 *        resource.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MInstantiableResourceDemand ird, EReference reference)
	{
		if (ird.getResource() == null ||
			ird.getResource().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		return getSimpleObjectScope(ird.getResource().getParameters());
	}
	
	/**
	 * Provides the scope for the referenceable objects that can be used
	 * in value assignment to a configuration parameter. In this case,
	 * there can be assignments only in an instantiable resource demand.
	 * 
	 * @param assignment the value assignment expression.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(MParameterValueAssignment assignment, EReference reference)
	{
		MInstantiableResourceDemand dires = (MInstantiableResourceDemand)assignment.eContainer();
		
		MSwPackageRequiredInterface rswi = (MSwPackageRequiredInterface)dires.eContainer();
		if (rswi.eContainer() instanceof MSwPackage)
		{
			MSwPackage swp = (MSwPackage)rswi.eContainer();
			
			Set<MParameter> params = mesputil.getParameters(swp);
				
			for (MAbstractSwPackage iswp : swp.getInherits())
			{
				if (iswp.eIsProxy() == false)
				{
					params.addAll(mesputil.getAllParameters(iswp));
				}
			}

			if (dires.getResource() != null &&
				dires.getResource().eIsProxy() == false)
			{
				params.addAll(mesputil.getParameters(dires.getResource()));
			}
			
			params.remove(assignment.getParameter());
			if (assignment.getParameter() instanceof MEnumParameter)
			{
				// Then we have to return the literals
				MEnumParameter param = (MEnumParameter)assignment.getParameter();
				if (param.getEnumDefinition() != null &&
					param.getEnumDefinition().eIsProxy() == false)
				{
					IScope innerScope = getFullObjectScope(params);
					return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), innerScope);
				}
			}
			return getFullObjectScope(params);
		}
		else if (rswi.eContainer() instanceof MSwPackageSupportedPlatform)
		{
			MSwPackageSupportedPlatform swpsp = (MSwPackageSupportedPlatform)rswi.eContainer();
			MSwPackage swp = (MSwPackage)swpsp.eContainer();
			
			Set<MParameter> params = mesputil.getParameters(swp);
			
			for (MAbstractSwPackage iswp : swp.getInherits())
			{
				if (iswp.eIsProxy() == false)
				{
					params.addAll(mesputil.getAllParameters(iswp));
				}
			}
			params.addAll(mesputil.getParameters(swpsp));
			params.addAll(getAllPlatformParameters(swpsp));
			
			if (dires.getResource() != null &&
				dires.getResource().eIsProxy() == false)
			{
				params.addAll(mesputil.getParameters(dires.getResource()));
			}
			
			params.remove(assignment.getParameter());
			if (assignment.getParameter() instanceof MEnumParameter)
			{
				// Then we have to return the literals
				MEnumParameter param = (MEnumParameter)assignment.getParameter();
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
	 * Provides the scope for the referenceable objects that can be used
	 * in value assignment expression to a provided software interface
	 * parameter value.
	 * 
	 * @param pva the value assignment expression.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(MSwPackageProvidedInterfacePVAExpression pva, EReference reference)
	{
		MSwPackageProvidedInterface pswi = (MSwPackageProvidedInterface) pva.eContainer();

		MAbstractSwPackage aswp = (MAbstractSwPackage)pswi.eContainer();
		
		Set<MParameter> params = mesputil.getParameters(aswp);

		for (MAbstractSwPackage iswp : aswp.getInherits())
		{
			if (iswp.eIsProxy() == false)
			{
				params.addAll(mesputil.getAllParameters(iswp));
			}
		}
		
		if (aswp instanceof MSwPackage)
		{
			MSwPackage swp = (MSwPackage)aswp;
			
			for (MSwPackageRequiredInterface rswi : swp.getRequires())
			{
				if (rswi.getInterface() != null &&
					rswi.getInterface().eIsProxy() == false &&
					rswi.getInterface() instanceof MSwInterface)
				{
					MSwInterface swi = (MSwInterface)rswi.getInterface();
					params.addAll(mesputil.getAllParameters(swi));
				}
			}
		}
		
		if (pswi.getSwinterface() != null &&
			pswi.getSwinterface().eIsProxy() == false)
		{
			params.addAll(mesputil.getAllParameters(pswi.getSwinterface()));
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
	 * in the default value assignment expressions of parameter
	 * depending on the supported platforms.
	 * 
	 * @param pvaSwitchCase the platform-dependent value assignment expression.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(MParameterSWPSPSwitchCase switchCase, EReference reference)
	{
		MParameterSWPSPSwitch parameter = (MParameterSWPSPSwitch) switchCase.eContainer();

		MSwPackage swp = (MSwPackage)parameter.eContainer();
		
		Set<MParameter> params = mesputil.getParameters(swp);

		for (MAbstractSwPackage aswp : swp.getInherits())
		{
			if (aswp.eIsProxy() == false)
			{
				params.addAll(mesputil.getAllParameters(aswp));
			}
		}
		
		for (MSwPackageRequiredInterface rswi : swp.getRequires())
		{
			if (rswi.getInterface() != null &&
				rswi.getInterface().eIsProxy() == false &&
				rswi.getInterface() instanceof MSwInterface)
			{
				MSwInterface swi = (MSwInterface)rswi.getInterface();
				params.addAll(mesputil.getAllParameters(swi));
			}
		}
		
		if (switchCase.getPlatform() != null &&
			switchCase.getPlatform().eIsProxy() == false)
		{
			params.addAll(mesputil.getParameters(switchCase.getPlatform()));
			params.addAll(getAllPlatformParameters(switchCase.getPlatform()));
			
			for (MSwPackageRequiredInterface rswi : switchCase.getPlatform().getRequires())
			{
				if (rswi.getInterface() != null &&
					rswi.getInterface().eIsProxy() == false &&
					rswi.getInterface() instanceof MSwInterface)
				{
					MSwInterface swi = (MSwInterface)rswi;
					params.addAll(mesputil.getAllParameters(swi));
				}
			}
		}
		
		params.remove(parameter);
		
		IScope innerScope = getFullObjectScope(params);
			
		if (parameter instanceof MEnumParamSWPSPSwitch)
		{
			// Then we have to return the literals
			MEnumParamSWPSPSwitch param = (MEnumParamSWPSPSwitch)parameter;
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
	 * in value assignment expression to a provided software interface
	 * parameter value when it is assigned depending on the supported
	 * platforms.
	 * 
	 * @param pva the value assignment expression.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(MSwPackageProvidedInterfacePVASwitchCase pvaSwitchCase, EReference reference)
	{
		MSwPackageProvidedInterfacePVASwitch pva = (MSwPackageProvidedInterfacePVASwitch) pvaSwitchCase.eContainer();
		MSwPackageProvidedInterface pswi = (MSwPackageProvidedInterface) pva.eContainer();

		MAbstractSwPackage aswp = (MAbstractSwPackage)pswi.eContainer();
		
		Set<MParameter> params = mesputil.getParameters(aswp);

		for (MAbstractSwPackage iswp : aswp.getInherits())
		{
			if (iswp.eIsProxy() == false)
			{
				params.addAll(mesputil.getAllParameters(iswp));
			}
		}
		
		if (aswp instanceof MSwPackage)
		{
			MSwPackage swp = (MSwPackage)aswp;
			
			for (MSwPackageRequiredInterface rswi : swp.getRequires())
			{
				if (rswi.getInterface() != null &&
					rswi.getInterface().eIsProxy() == false &&
					rswi.getInterface() instanceof MSwInterface)
				{
					MSwInterface swi = (MSwInterface)rswi.getInterface();
					params.addAll(mesputil.getAllParameters(swi));
				}
			}
		}
		
		if (pswi.getSwinterface() != null &&
			pswi.getSwinterface().eIsProxy() == false)
		{
			params.addAll(mesputil.getAllParameters(pswi.getSwinterface()));
		}
		
		if (pvaSwitchCase.getPlatform() != null &&
			pvaSwitchCase.getPlatform().eIsProxy() == false)
		{
			params.addAll(mesputil.getParameters(pvaSwitchCase.getPlatform()));
			params.addAll(getAllPlatformParameters(pvaSwitchCase.getPlatform()));
			
			for (MSwPackageRequiredInterface rswi : pvaSwitchCase.getPlatform().getRequires())
			{
				if (rswi.getInterface() != null &&
					rswi.getInterface().eIsProxy() == false &&
					rswi.getInterface() instanceof MSwInterface)
				{
					MSwInterface swi = (MSwInterface)rswi;
					params.addAll(mesputil.getAllParameters(swi));
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
	 * to define an enumerated parameter within an abstract SwPackage.
	 * This types are the ones defined by the very package plus the
	 * ones defined by the packages it inherits.
	 * 
	 * @param aswp the enumerated configuration parameter.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameterDefinition(final MAbstractSwPackage aswp, EReference reference)
	{		
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		for (MAbstractSwPackage paswp : aswp.getInherits())
		{
			if (paswp.eIsProxy() == false)
			{
				outerDefs.addAll(mesputil.getAllEnumParameterDefinitions(paswp));
				for (MSwInterface pswi : mesputil.getAllProvidedSwInterfaces(paswp))
				{
					outerDefs.addAll(mesputil.getAllEnumParameterDefinitions(pswi));
				}
			}
		}
		
		for (MSwPackageProvidedInterface pswi : aswp.getProvides())
		{
			if (pswi.getSwinterface().eIsProxy() == false)
			{
				outerDefs.addAll(mesputil.getAllEnumParameterDefinitions(pswi.getSwinterface()));
			}
		}

		if (aswp instanceof MSwPackage)
		{
			MSwPackage swp = (MSwPackage)aswp;

			for (MSwPackageRequiredInterface riface : swp.getRequires())
			{
				if (riface.getInterface() != null &&
					riface.getInterface().eIsProxy() == false)
				{
					if (riface.getInterface() instanceof MSwInterface)
					{
						outerDefs.addAll(mesputil.getAllEnumParameterDefinitions((MSwInterface)riface.getInterface()));
					}
				}
			}
		}
		IScope outerScope = getFullObjectScope(outerDefs);
		
		return getSimpleObjectScope(mesputil.getEnumParameterDefinitions(aswp), outerScope);
	}
	
	/**
	 * Provides the scope for the enumerated types that can be used
	 * to define an enumerated parameter within SwPackage supported
	 * platform. This types are the ones defined by the very package
	 * plus the ones defined by the packages it inherits.
	 * 
	 * @param swpsp the software package supported platform.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MEnumParameterDefinition(final MSwPackageSupportedPlatform swpsp, EReference reference)
	{		
		Set<MEnumParameterDefinition> outerDefs = new HashSet<MEnumParameterDefinition>();
		
		MSwPackage swp = (MSwPackage)swpsp.eContainer();
		
		for (MAbstractSwPackage paswp : swp.getInherits())
		{
			if (paswp.eIsProxy() == false)
			{
				outerDefs.addAll(mesputil.getAllEnumParameterDefinitions(paswp));
				for (MSwInterface pswi : mesputil.getAllProvidedSwInterfaces(paswp))
				{
					outerDefs.addAll(mesputil.getAllEnumParameterDefinitions(pswi));
				}
			}
		}
		
		for (MSwPackageProvidedInterface pswi : swp.getProvides())
		{
			if (pswi.getSwinterface().eIsProxy() == false)
			{
				outerDefs.addAll(mesputil.getAllEnumParameterDefinitions(pswi.getSwinterface()));
			}
		}
	
		for (MSwPackageRequiredInterface riface : swp.getRequires())
		{
			if (riface.getInterface() != null &&
				riface.getInterface().eIsProxy() == false)
			{
				if (riface.getInterface() instanceof MSwInterface)
				{
					outerDefs.addAll(mesputil.getAllEnumParameterDefinitions((MSwInterface)riface.getInterface()));
				}
			}
		}
		for (MSwPackageRequiredInterface riface : swpsp.getRequires())
		{
			if (riface.getInterface() != null &&
				riface.getInterface().eIsProxy() == false)
			{
				if (riface.getInterface() instanceof MSwInterface)
				{
					outerDefs.addAll(mesputil.getAllEnumParameterDefinitions((MSwInterface)riface.getInterface()));
				}
			}
		}
		if (swpsp.getOsapi() != null &&
			swpsp.getOsapi().eIsProxy() == false)
		{
			outerDefs.addAll(pdlutil.getAllEnumParameterDefinitions(swpsp.getOsapi()));
		}
		if (swpsp.getOs() != null &&
			swpsp.getOs().eIsProxy() == false)
		{
			outerDefs.addAll(pdlutil.getAllEnumParameterDefinitions(swpsp.getOs()));
			MOSSupportedPlatform ossp = pdlutil.getMatchingPlatform(swpsp.getOs(), mesputil.toPlatform(swpsp));
			if (ossp != null)
			{
				outerDefs.addAll(pdlutil.getEnumParameterDefinitions(ossp));
			}
		}
		if (swpsp.getArchitecture() != null &&
			swpsp.getArchitecture().eIsProxy() == false)
		{
			outerDefs.addAll(pdlutil.getAllEnumParameterDefinitions(swpsp.getArchitecture()));	
		}
		if (swpsp.getCompiler() != null &&
			swpsp.getCompiler().eIsProxy() == false)
		{
			if (swpsp.getArchitecture() != null &&
				swpsp.getArchitecture().eIsProxy() == false)
			{
				outerDefs.addAll(pdlutil.getAllEnumParameterDefinitions(swpsp.getCompiler(), swpsp.getArchitecture()));
			}
			else
			{
				outerDefs.addAll(pdlutil.getAllEnumParameterDefinitions(swpsp.getCompiler()));	
			}
		}
		if (swpsp.getMicroprocessor() != null &&
				swpsp.getMicroprocessor().eIsProxy() == false)
		{
			outerDefs.addAll(pdlutil.getEnumParameterDefinitions(swpsp.getMicroprocessor()));
		}
		if (swpsp.getBoard() != null &&
			swpsp.getBoard().eIsProxy() == false)
		{
			outerDefs.addAll(pdlutil.getEnumParameterDefinitions(swpsp.getBoard()));
			for (MBoardSupportedDevice sdevice : swpsp.getBoard().getSupportedDevices())
			{
				outerDefs.addAll(pdlutil.getEnumParameterDefinitions(sdevice.getDevice()));
			}
		}
		IScope outerScope = getFullObjectScope(outerDefs);
		return getSimpleObjectScope(mesputil.getEnumParameterDefinitions(swpsp), outerScope);
	}

	/**
	 * Provides the scope with the list of software packages that a
	 * given package can extend. This list includes the software packages
	 * present in the MESP package of the given software package plus the
	 * ones belonging to the imported MESP packages.
	 * 
	 * @param swp the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSwPackage(final MSwPackage swp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		List<MCommonPackage> imports = ((MCommonPackageFile)swp.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)swp.eContainer()).getPackage();
		
		try {
			elements = MESPLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mespswpPackage.eINSTANCE.getMSwPackage());
			elements.addAll(MESPLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mespswpPackage.eINSTANCE.getMSwPackage()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of abstract software packages from
	 * which a given package can inherit. This list includes the software
	 * packages present in the MESP package of the given software package plus
	 * the ones belonging to the imported MESP packages.
	 * 
	 * @param swp the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MAbstractSwPackage(final MAbstractSwPackage swp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		List<MCommonPackage> imports = ((MCommonPackageFile)swp.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)swp.eContainer()).getPackage();
		
		try {
			elements = MESPLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mespswpPackage.eINSTANCE.getMAbstractSwPackage());
			elements.addAll(MESPLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mespswpPackage.eINSTANCE.getMAbstractSwPackage()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of abstract software packages from
	 * which a given abstract package can inherit. This list includes the 
	 * abstract software packages present in the MESP package of the given
	 * software package plus the ones belonging to the imported MESP packages.
	 * 
	 * @param aswp the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MAbstractSwPackage_inherits(final MAbstractSwPackage aswp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		List<MCommonPackage> imports = ((MCommonPackageFile)aswp.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)aswp.eContainer()).getPackage();
		
		try {
			elements = MESPLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(MESPLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}

	/**
	 * Provides the scope with the list of software interfaces that can be
	 * required by a software package. This list includes the software
	 * interfaces present in the MESP package of the given software package
	 * plus the ones belonging to the imported MESP packages.
	 * 
	 * @param element the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSwPackageRequiredInterface_interface(final MMESPSWPPackageElement element, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		List<MCommonPackage> imports = ((MCommonPackageFile)element.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)element.eContainer()).getPackage();
		
		try {
			elements = MESPLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mespswiPackage.eINSTANCE.getMSwInterface());
			elements.addAll(MESPLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mespswiPackage.eINSTANCE.getMSwInterface()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of software interfaces that can be
	 * provided by a software package. This list includes the software
	 * interfaces present in the MESP package of the given software package
	 * plus the ones belonging to the imported MESP packages.
	 * 
	 * @param element the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSwInterface(final MMESPSWPPackageElement element, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		List<MCommonPackage> imports = ((MCommonPackageFile)element.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)element.eContainer()).getPackage();
		
		try {
			elements = MESPLibraryManager.getLibraryManager().
						getElementsOfClass(imports, reference.getEReferenceType());
			elements.addAll(MESPLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, reference.getEReferenceType()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the software interface that can be required
	 * in the definition of a software package supported platform. This list
	 * includes the software interfaces present in the MESP package of the
	 * given software package plus the ones belonging to the imported MESP
	 * packages plus the OSSwInterface corresponding to the OSAPI attached
	 * to the supported platform.
	 * 
	 * @param swpsp the software package supported platform.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MSwPackageRequiredInterface_interface(final MSwPackageSupportedPlatform swpsp, EReference reference)
	{
		MSwPackage element = (MSwPackage)swpsp.eContainer();
		
		Collection <MCommonPackageElement> elements = null;
		List<MCommonPackage> imports = ((MCommonPackageFile)element.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)element.eContainer()).getPackage();

		
		try {
			elements = MESPLibraryManager.getLibraryManager().
					getElementsOfClass(imports, mespswiPackage.eINSTANCE.getMSwInterface());
			elements.addAll(MESPLibraryManager.getLibraryManager().
				getElementsOfClass(elementPackage, mespswiPackage.eINSTANCE.getMSwInterface()));
			if (swpsp.getOsapi() != null &&
				swpsp.getOsapi().eIsProxy() == false &&
				MESPLibraryManager.getLibraryManager().getReferencingElement(
				swpsp.getOsapi(), mesposswiPackage.eINSTANCE.getMOSSwInterface()) != null)
			{
				elements.add(MESPLibraryManager.getLibraryManager().getReferencingElement(
						swpsp.getOsapi(), mesposswiPackage.eINSTANCE.getMOSSwInterface()));
			}
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	/**
	 * Provides the scope with the list of operating system APIs that can be
	 * included in the definition of a software package. This list includes 
	 * the OSAPIs present in the PDL packages imported by the software package.
	 * 
	 * @param swp the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOperatingSystemAPI(final MSwPackage swp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)swp.eContainer()).getImports();
		
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
	 * included in the definition of a software package. This list includes 
	 * the OSs present in the PDL packages imported by the software package.
	 * 
	 * @param swp the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MOperatingSystem(final MSwPackage swp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)swp.eContainer()).getImports();
		
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
	 * included in the definition of a software package. This list includes 
	 * the architectures present in the PDL packages imported by the software
	 * package.
	 * @param swp the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MArchitecture(final MSwPackage swp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)swp.eContainer()).getImports();
		
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
	 * included in the definition of a software package. This list includes 
	 * the compilers present in the PDL packages imported by the software
	 * package.
	 * @param swp the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MCompiler(final MSwPackage swp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)swp.eContainer()).getImports();
		
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
	 * included in the definition of a software package. This list includes 
	 * the microprocessors present in the PDL packages imported by the software
	 * package.
	 * @param swp the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MMicroprocessor(final MSwPackage swp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)swp.eContainer()).getImports();
		
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
	 * definition of a software package. This list includes the boards present
	 * in the PDL packages imported by the software package.
	 * @param swp the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MBoard(final MSwPackage swp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)swp.eContainer()).getImports();
		
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
	 * definition of a software package. This list includes the devices present
	 * in the PDL packages imported by the software package.
	 * @param swp the software package.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MDevice(final MSwPackage swp, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)swp.eContainer()).getImports();
		
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
		return MESPLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(SystemLibraryManager.getLibraryManager());
		importLibraries.add(MESPLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
}