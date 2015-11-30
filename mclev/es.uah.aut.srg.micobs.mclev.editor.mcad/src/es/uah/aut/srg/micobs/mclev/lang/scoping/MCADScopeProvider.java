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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.scoping.IScope;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MCommonConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitch;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnectionSwitchCase;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentPlatform;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.xtext.MICOBSElementAbstractScopeProvider;

/**
 * This class contains custom scoping description.
 */
public class MCADScopeProvider extends MICOBSElementAbstractScopeProvider {
	
	/**
	 * Provides the scope for the parameters of a deployed device.
	 * 
	 * @param depdev the deployed device.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MDeployedDevice depdev, EReference reference)
	{
		if (depdev.getDevice() == null ||
			depdev.getDevice().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		return getSimpleObjectScope(MCLEVUtil.getDefault().getParameters(depdev.getDevice()));
	}
	
	/**
	 * Provides the scope for the deployed devices that can be mapped to
	 * a particular driver service library.
	 * 
	 * @param drvInst the deployed driver service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MDeployedDevice(MDriverSLibInstance drvInst, EReference reference)
	{
		Collection<MDeploymentPlatform> dplts = null;
		
		if (drvInst.eContainer() instanceof MMCADeployment)
		{
			// It is deployed at the model root
			dplts = ((MMCADeployment)drvInst.eContainer()).getDeploymentPlatforms();
		}
		else
		{
			// It is deployed at an alternative
			dplts = ((MDeploymentAlternative)drvInst.eContainer()).getDeploymentPlatforms();
		}
		
		Set<MDeployedDevice> ddevices = new HashSet<MDeployedDevice>();
		
		for (MDeploymentPlatform dplt : dplts)
		{
			ddevices.addAll(dplt.getDeployedDevices());
		}
		return getRelativeObjectScope(ddevices);
	}
	
	/**
	 * Provides the scope for the supported devices of a given
	 * driver service library.
	 * 
	 * @param drvInst the deployed driver service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MDriverSLibSupportedDevice(MDriverSLibInstance drvInst, EReference reference)
	{
		if (drvInst.getLibrary() == null ||
			drvInst.getLibrary().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		Set<MDriverSLibSupportedDevice> sdevices = new HashSet<MDriverSLibSupportedDevice>();
		
		for (MServiceLibrarySupportedPlatform swpsp : drvInst.getLibrary().getSupportedPlatforms())
		{
			MDriverSLibSupportedPlatform drvsp = (MDriverSLibSupportedPlatform)swpsp;
			
			sdevices.addAll(drvsp.getSupportedDevices());
		}
		return getRelativeObjectScope(sdevices);
	}
	
	/**
	 * Provides the scope for the elements than can be referenced when
	 * assigning a new value to a parameter.
	 * 
	 * @param assignment the configuration parameter.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(MParameterValueAssignment assignment, EReference reference)
	{		
		MMCADeployment deployment = null;
		MDeploymentAlternative alternative = null;
		Collection<MDeploymentPlatform> dplts = null;

		Set<MParameter> attributes = new HashSet<MParameter>();
		
		if (assignment.eContainer() instanceof MComponentInstance)
		{
			MComponentInstance inst = (MComponentInstance)assignment.eContainer();		
			
			if (inst.eContainer() instanceof MMCADeployment)
			{
				deployment = (MMCADeployment) inst.eContainer();
				dplts = deployment.getDeploymentPlatforms();
			}
			else
			{
				alternative = (MDeploymentAlternative) inst.eContainer();
				deployment = MCLEVUtil.getDefault().getDeploymentRoot(alternative);
				dplts = alternative.getDeploymentPlatforms();
			}
			
			if (inst.getComponent() != null &&
				inst.getComponent().eIsProxy() == false)
			{
				MComponent cmp = inst.getComponent();
												
				attributes.addAll(MCLEVUtil.getDefault().getAllAttributes(cmp));
					
				for (MComponentSupportedPlatform csp : cmp.getSupportedPlatforms())
				{
					for (MDeploymentPlatform dplt : dplts)
					{
						if (dplt.getPlatform() != null &&
							dplt.getPlatform().eIsProxy() == false &&
							MCLEVUtil.getDefault().matchesPlatform(csp, dplt.getPlatform()))
						{
							attributes.addAll(MCLEVUtil.getDefault().getAttributes(csp));
						}
					}
				}
			}
		}
		else if (assignment.eContainer() instanceof MServiceLibraryInstance)
		{
			MServiceLibraryInstance slinst = (MServiceLibraryInstance)assignment.eContainer();

			if (slinst.eContainer() instanceof MMCADeployment)
			{
				deployment = (MMCADeployment) slinst.eContainer();
				dplts = deployment.getDeploymentPlatforms();
			}
			else
			{
				alternative = (MDeploymentAlternative) slinst.eContainer();
				deployment = MCLEVUtil.getDefault().getDeploymentRoot(alternative);
				dplts = alternative.getDeploymentPlatforms();
			}
			
			MServiceLibrary slib = slinst.getLibrary();
						
			attributes.addAll(MCLEVUtil.getDefault().getAllAttributes(slib));
			
			for (MServiceLibrarySupportedPlatform slsp : slib.getSupportedPlatforms())
			{
				for (MDeploymentPlatform dplt : dplts)
				{
					if (dplt.getPlatform() != null &&
						dplt.getPlatform().eIsProxy() == false &&
						MCLEVUtil.getDefault().matchesPlatform(slsp, dplt.getPlatform()))
					{
						attributes.addAll(MCLEVUtil.getDefault().getAttributes(slsp));
					}
				}
			}
		}
		else if (assignment.eContainer() instanceof MDeploymentPlatform)
		{
			MDeploymentPlatform dplt = (MDeploymentPlatform)assignment.eContainer();
			deployment = (MMCADeployment) dplt.eContainer();
			dplts = new HashSet<MDeploymentPlatform>();
			dplts.add(dplt);
			
			if (dplt.getPlatform() != null &&
				dplt.getPlatform().eIsProxy() == false)
			{
				attributes.addAll(MCLEVUtil.getDefault().getAllParameters(dplt.getPlatform()));
			}
		}
		else if (assignment.eContainer() instanceof MDeployedDevice)
		{
			MDeployedDevice depDev = (MDeployedDevice)assignment.eContainer();
			MDeploymentPlatform dplt = (MDeploymentPlatform) depDev.eContainer();
			deployment = (MMCADeployment) dplt.eContainer();
			dplts = new HashSet<MDeploymentPlatform>();
			dplts.add(dplt);
			
			if (dplt.getPlatform() != null &&
				dplt.getPlatform().eIsProxy() == false)
			{
				attributes.addAll(MCLEVUtil.getDefault().getAllParameters(dplt.getPlatform()));
			}
			
			if (depDev.getDevice() != null &&
				depDev.getDevice().eIsProxy() == false)
			{
				attributes.addAll(MCLEVUtil.getDefault().getParameters(depDev.getDevice()));
			}
			
		}
					
		if (deployment.getDomain() != null &&
			deployment.getDomain().eIsProxy() == false)
		{
			if (deployment.getDomain() instanceof MIODomain)
			{
				MIODomain domain = (MIODomain)deployment.getDomain();
					
				attributes.addAll(MCLEVUtil.getDefault().getAllAttributes(domain));

				for (MDeploymentPlatform dplt : dplts)
				{
					if (dplt.getPlatform() != null &&
						dplt.getPlatform().eIsProxy() == false)
					{
						MIODomainSupportedPlatform iodsp = MCLEVUtil.getDefault().getMatchingPlatform(domain, dplt.getPlatform());
						if (iodsp != null)
						{
							attributes.addAll(MCLEVUtil.getDefault().getAttributes(iodsp));
						}
					}
				}
			}
			else
			{
				MAODomain domain = (MAODomain)deployment.getDomain();
					
				attributes.addAll(MCLEVUtil.getDefault().getAllAttributes(domain));
			}
		}
		
		if (assignment.getParameter() != null &&
			assignment.getParameter().eIsProxy() == false)
		{
			attributes.remove(assignment.getParameter());
			
			IScope outerScope = getFullObjectScope(attributes);
			
			if (assignment.getParameter() instanceof MEnumParameter)
			{
				MEnumParameter param = (MEnumParameter)assignment.getParameter();
				if (param.getEnumDefinition() != null &&
					param.getEnumDefinition().eIsProxy() == false)
				{
					return getSimpleObjectScope(param.getEnumDefinition().getLiterals(), outerScope);
				}
			}
		}
		
		return getFullObjectScope(attributes);

	}
	
	/**
	 * Provides the scope for the deployment platforms that can be attached to
	 * a deployment alternative. If the alternative belongs to the root model,
	 * the scope comprises the whole list of defined platforms. If the
	 * alternative belongs to another alternative, the scope shall comprise
	 * only the platforms selected for the parent alternative.
	 * Implements Restrictions 156 and 157.
	 * 
	 * @param alternative the deployment alternative.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	
	public IScope scope_MDeploymentPlatform(final MDeploymentAlternative alternative, EReference reference)
	{
		if (alternative.eContainer() instanceof MMCADeployment)
		{
			MMCADeployment deployment = ((MMCADeployment)alternative.eContainer());
			return getRelativeObjectScope(deployment.getDeploymentPlatforms());
		}
		else
		{
			MDeploymentAlternative parent = ((MDeploymentAlternative)alternative.eContainer());
			Set<MDeploymentPlatform> dplts = new HashSet<MDeploymentPlatform>();
			for (MDeploymentPlatform dplt : parent.getDeploymentPlatforms())
			{
				if (dplt.eIsProxy() == true)
				{
					continue;
				}
				dplts.add(dplt);
			}
			return getRelativeObjectScope(dplts);
		}
	}
	
	/**
	 * Provides the scope for the configuration parameters of a
	 * deployment platform.
	 * Implements Restriction 167.
	 * 
	 * @param dplt the deployment platform.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MDeploymentPlatform dplt, EReference reference)
	{
		if (dplt.getPlatform() == null ||
			dplt.getPlatform().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		Set<MParameter> outer = MCLEVUtil.getDefault().getAllParameters(dplt.getPlatform().getOs());
		outer.addAll(MCLEVUtil.getDefault().getParameters(MCLEVUtil.getDefault().getMatchingPlatform(dplt.getPlatform().getOs(), dplt.getPlatform())));
		outer.addAll(MCLEVUtil.getDefault().getAllParameters(dplt.getPlatform().getArchitecture()));
		outer.addAll(MCLEVUtil.getDefault().getAllParameters(dplt.getPlatform().getCompiler(),
				dplt.getPlatform().getArchitecture()));
		
		if (dplt.getPlatform().getMicroprocessor() != null)
		{
			outer.addAll(MCLEVUtil.getDefault().getParameters(dplt.getPlatform().getMicroprocessor()));
		}
		if (dplt.getPlatform().getBoard() != null)
		{
			outer.addAll(MCLEVUtil.getDefault().getParameters(dplt.getPlatform().getBoard()));
		}
		
		IScope parentScope = getFullObjectScope(outer);
		
		return getSimpleObjectScope(MCLEVUtil.getDefault().getParameters(dplt.getPlatform()), parentScope);
	}
	
	/**
	 * Provides the list of attributes of a component connection.
	 * These attributes are extracted from the ones defined by the attached 
	 * connector.
	 * Implements Restriction 177.
	 * 
	 * @param cnx the common connection.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MCommonConnection cnx, EReference reference)
	{
		if (cnx.getConnector() == null ||
			cnx.getConnector().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		IScope outerScope = IScope.NULLSCOPE;
		MConnector connector = cnx.getConnector();
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		for (MConnector iconn : connector.getInherits())
		{
			attributes.addAll(MCLEVUtil.getDefault().getAllAttributes(iconn));
		}
		outerScope = getFullObjectScope(attributes);
		
		return getSimpleObjectScope(connector.getAttributes(), outerScope);

	}
	
	/**
	 * Provides the list of attributes of an connection switch case.
	 * These attributes are extracted from the ones defined by the attached 
	 * connector.
	 * Implements Restriction 185.
	 * 
	 * @param scase the connection switch case.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MConnectionSwitchCase scase, EReference reference)
	{
		if (scase.getConnector() == null ||
			scase.getConnector().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
			
		IScope outerScope = IScope.NULLSCOPE;
		MConnector connector = scase.getConnector();
		Set<MParameter> attributes = new HashSet<MParameter>();
			
		for (MConnector iconn : connector.getInherits())
		{
			attributes.addAll(MCLEVUtil.getDefault().getAllAttributes(iconn));
		}
		outerScope = getFullObjectScope(attributes);
			
		return getSimpleObjectScope(connector.getAttributes(), outerScope);
	}
	
	/**
	 * Provides the list of boolean attributes of a service library whose
	 * values can be assigned when the library is deployed as part of a
	 * deployment model.
	 * Implements Restrictions 207 and 208.
	 * 
	 * @param instance the deployed service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MServiceLibraryInstance instance, EReference reference)
	{
		if (instance.getLibrary() == null ||
			instance.getLibrary().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		MServiceLibrary slib = instance.getLibrary();
		
		Set<MDeploymentPlatform> dplts = new HashSet<MDeploymentPlatform>();
		
		if (instance.eContainer() instanceof MMCADeployment)
		{
			// We are in the root, the list of platforms is the whole:
			MMCADeployment dep = (MMCADeployment)instance.eContainer();
			dplts.addAll(dep.getDeploymentPlatforms());
		}
		else
		{
			MDeploymentAlternative alt = (MDeploymentAlternative)instance.eContainer();
			dplts.addAll(alt.getDeploymentPlatforms());
		}
			
		Set<MParameter> outerAttributes = new HashSet<MParameter>();
		
		for (MAbstractServiceLibrary aslib : slib.getInherits())
		{
			outerAttributes.addAll(MCLEVUtil.getDefault().getAllAttributes(aslib));
		}
		
		IScope outerScope = getFullObjectScope(outerAttributes);
		
		Set<MParameter> innerAttributes = MCLEVUtil.getDefault().getAttributes(slib);

		for (MDeploymentPlatform dplt : dplts)
		{
			if (dplt.getPlatform() != null &&
				dplt.getPlatform().eIsProxy() == false)
			{
				MServiceLibrarySupportedPlatform slsp = MCLEVUtil.getDefault().getMatchingPlatform(slib, dplt.getPlatform());
				if (slsp != null)
				{
					innerAttributes.addAll(MCLEVUtil.getDefault().getAttributes(slsp));
				}
			}
		}

		return getRelativeObjectScope(innerAttributes, outerScope);

	}
	
	/**
	 * Provides the list of attributes of a component whose values can
	 * be assigned when the component is instantiated as part of the
	 * architecture of a deployment model.
	 * Implements Restrictions 173 and 174.
	 * 
	 * @param instance the instance of the component.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MComponentInstance instance, EReference reference)
	{
		if (instance.getComponent() == null ||
			instance.getComponent().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		MComponent cmp = instance.getComponent();
			
		Set<MDeploymentPlatform> dplts = new HashSet<MDeploymentPlatform>();
			
		if (instance.eContainer() instanceof MMCADeployment)
		{
			// We are in the root, the list of platforms is the whole:
			MMCADeployment dep = (MMCADeployment)instance.eContainer();
			dplts.addAll(dep.getDeploymentPlatforms());
		}
		else
		{
			MDeploymentAlternative alt = (MDeploymentAlternative)instance.eContainer();
			dplts.addAll(alt.getDeploymentPlatforms());
		}
			
		Set<MParameter> outerAttributes = new HashSet<MParameter>();
			
		for (MAbstractComponent acmp : cmp.getInherits())
		{
			outerAttributes.addAll(MCLEVUtil.getDefault().getAllAttributes(acmp));
		}
			
		IScope outerScope = getFullObjectScope(outerAttributes);
			
		Set<MParameter> innerAttributes = MCLEVUtil.getDefault().getAttributes(cmp);

		for (MDeploymentPlatform dplt : dplts)
		{
			if (dplt.getPlatform() != null &&
				dplt.getPlatform().eIsProxy() == false)
			{
				MComponentSupportedPlatform csp = MCLEVUtil.getDefault().getMatchingPlatform(cmp, dplt.getPlatform());
				if (csp != null)
				{
					innerAttributes.addAll(MCLEVUtil.getDefault().getAttributes(csp));
				}
			}
		}

		return getRelativeObjectScope(innerAttributes, outerScope);
	}

	/**
	 * Provides the list of boolean attributes whose values can be assigned in
	 * the definition of a deployment model. These attributes are extracted
	 * from the definition of the domain attached to the deployment model.
	 * 
	 * @param deployment the deployment model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(MMCADeployment deployment, EReference reference)
	{
		if (deployment.getDomain() == null ||
			deployment.getDomain().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		IScope outerScope = IScope.NULLSCOPE;
		
		if (deployment.getDomain() instanceof MIODomain)
		{
			MIODomain domain = (MIODomain)deployment.getDomain();
			
			Set<MParameter> outerAttributes = new HashSet<MParameter>();
			
			for (MIODomain piod : domain.getInherits())
			{
				outerAttributes.addAll(MCLEVUtil.getDefault().getAllAttributes(piod));
			}
			
			outerScope = getFullObjectScope(outerAttributes);
			
			Set<MParameter> innerAttributes = MCLEVUtil.getDefault().getAttributes(domain);

			for (MDeploymentPlatform dplt : 
				deployment.getDeploymentPlatforms())
			{
				if (dplt.getPlatform() != null &&
					dplt.getPlatform().eIsProxy() == false)
				{
					MIODomainSupportedPlatform iodsp = MCLEVUtil.getDefault().getMatchingPlatform(domain, dplt.getPlatform());
					if (iodsp != null)
					{
						innerAttributes.addAll(MCLEVUtil.getDefault().getAttributes(iodsp));
					}
				}
			}
			
			return getRelativeObjectScope(innerAttributes, outerScope);
		}
		else
		{
			MAODomain domain = (MAODomain)deployment.getDomain();
			
			Set<MParameter> outerAttributes = new HashSet<MParameter>();
			
			for (MAODomain piod : domain.getInherits())
			{
				outerAttributes.addAll(MCLEVUtil.getDefault().getAllAttributes(piod));
			}
			
			outerScope = getFullObjectScope(outerAttributes);
			
			return getRelativeObjectScope(MCLEVUtil.getDefault().getAttributes(domain), outerScope);
		}
	}
	
	/**
	 * Provides the list of alternatives that can be used as case
	 * alternatives in the definition of a connection switch.
	 * Implements Restrictions 188 and 189.
	 * 
	 * @param connSwitch the connection switch.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MDeploymentAlternative(final MConnectionSwitch connSwitch, EReference reference)
	{
		
		if (connSwitch.eContainer() instanceof MMCADeployment)
		{
			// The alternatives are the ones of the root element
			MMCADeployment deployment = (MMCADeployment)connSwitch.eContainer();
			return getRelativeObjectScope(deployment.getDeploymentAlternatives());
		}
		else
		{
			// The alternatives are the ones of the parent alternative
			// The alternatives are the ones of the root element
			MDeploymentAlternative alternative = (MDeploymentAlternative)connSwitch.eContainer();			
			return getRelativeObjectScope(alternative.getDeploymentAlternatives());
		}
		
	}
	
	/**
	 * Provides the list of possible component instances that can be used
	 * as the destination instance of a connection switch. These instances are
	 * the ones defined by the alternative attached to the corresponding case.
	 * Implements Restrictions 190 and 191.
	 * 
	 * @param switchCase the connection switch case alternative.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MConnectionSwitchCase_componentInstance2(
			final MConnectionSwitchCase switchCase, EReference reference)
	{
		if (switchCase.getAlternative() == null ||
			switchCase.getAlternative().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		return getRelativeObjectScope(switchCase.getAlternative().getComponents());
	}
	
	/**
	 * Provides the list of server ports that can be used as destinations of
	 * a connection switch. These ports are obtained from the definition of the
	 * component corresponding to the destination instance.
	 * Implements Restriction 194.
	 * 
	 * @param switchCase the connection switch case alternative.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MConnectionSwitchCase_serverPort(
			final MConnectionSwitchCase switchCase, EReference reference)
	{
		if (switchCase.getServerInstance() == null ||
			switchCase.getServerInstance().eIsProxy() == true ||
			switchCase.getServerInstance().getComponent() == null ||
			switchCase.getServerInstance().getComponent().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		MComponent component = switchCase.getServerInstance().getComponent();
		
		return getRelativeObjectScope(MCLEVUtil.getDefault().getAllExternalServerPorts(component));		
	}
	
	/**
	 * Provides the list of server ports that can be used as destinations of
	 * a common connection. These ports are obtained from the definition of the
	 * component corresponding to the destination instance.
	 * Implements Restriction 180.
	 * 
	 * @param connection the common connection.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MCommonConnection_serverPort(
			final MCommonConnection connection, EReference reference)
	{
		if (connection.getServerInstance() == null ||
			connection.getServerInstance().eIsProxy() == true ||
			connection.getServerInstance().getComponent() == null ||
			connection.getServerInstance().getComponent().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		MComponent component = connection.getServerInstance().getComponent();

		return getRelativeObjectScope(MCLEVUtil.getDefault().getAllExternalServerPorts(component));
	}
	
	/**
	 * Provides the list of client ports that can be used as sources of
	 * a connection switch. These ports are obtained from the definition of the
	 * component corresponding to the destination instance.
	 * Implements Restriction 187.
	 * 
	 * @param connSwitch the connection switch.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MConnectionSwitch_clientPort(
			final MConnectionSwitch connSwitch, EReference reference)
	{
		if (connSwitch.getClientInstance() == null ||
			connSwitch.getClientInstance().eIsProxy() == true ||
			connSwitch.getClientInstance().getComponent() == null ||
			connSwitch.getClientInstance().getComponent().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		MComponent component = connSwitch.getClientInstance().getComponent();
			
		return getRelativeObjectScope(MCLEVUtil.getDefault().getAllExternalClientPorts(component));
	}
	
	/**
	 * Provides the list of client ports that can be used as sources of
	 * a common connection. These ports are obtained from the definition 
	 * of the component corresponding to the destination instance.
	 * Implements Restriction 179.
	 * 
	 * @param connection the common connection.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MCommonConnection_clientPort(
			final MCommonConnection connection, EReference reference)
	{
		if (connection.getClientInstance() == null ||
			connection.getClientInstance().eIsProxy() == true ||
			connection.getClientInstance().getComponent() == null ||
			connection.getClientInstance().getComponent().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		MComponent component = connection.getClientInstance().getComponent();
		
		return getRelativeObjectScope(MCLEVUtil.getDefault().getAllExternalClientPorts(component));
	}
	
	/**
	 * Provides the list of component instances that can be used as sources of
	 * connection switches. This list is formed by the common component
	 * instances of the deployment model.
	 * 
	 * @param connSwitch the connection switch.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MComponentInstance(
			final MConnectionSwitch connSwitch, EReference reference)
	{
		if (connSwitch.eContainer() instanceof MMCADeployment)
		{
			// The source of the connection switch is the root of the model
			MMCADeployment deployment = (MMCADeployment)connSwitch.eContainer();
			return getRelativeObjectScope(deployment.getComponents());
		}
		else
		{
			// The source is an alternative
			MDeploymentAlternative alternative = (MDeploymentAlternative)connSwitch.eContainer();
			return getRelativeObjectScope(alternative.getComponents());
		}
	}
	
	/**
	 * Provides the list of component instances that can be used as sources of
	 * common connections. If the connection is placed on the root model, the
	 * instances are the ones defined by the root node. On the other hand, if
	 * the connection is defined on an alternative, the instances are the ones
	 * defined by that particular alternative.
	 * Implements Restrictions 182 and 183.
	 * 
	 * @param connSwitch the connection switch.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MComponentInstance(
			final MCommonConnection connection, EReference reference)
	{
		if (connection.eContainer() instanceof MMCADeployment)
		{
			// It is an alternative independent instance:
			MMCADeployment deployment = (MMCADeployment)connection.eContainer();
			return getRelativeObjectScope(deployment.getComponents());
		}
		else
		{
			// It depends on the alternative:
			MDeploymentAlternative alternative = (MDeploymentAlternative)connection.eContainer();
			return getRelativeObjectScope(alternative.getComponents());
		}
	}
	
	
	
	/**
	 * Provides the scope with the list of connectors that can be
	 * used in the definition the architecture of an MCAD model.
	 * Implements Restriction 176 and 184.
	 * 
	 * @param deployment the MCAD model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MConnector(final MMCADeployment deployment, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		
		if (deployment.getDomain() == null ||
			deployment.getDomain().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		if (deployment.getDomain() instanceof MIODomain)
		{
			MIODomain domain = (MIODomain) deployment.getDomain();
			
			Set<MConnector> outerConns = new HashSet<MConnector>();
			
			for (MIODomain iod : domain.getInherits())
			{
				outerConns.addAll(MCLEVUtil.getDefault().getAllConnectors(iod));
			}
			outerScope = getFullObjectScope(outerConns);
			
			return getRelativeObjectScope(domain.getConnectors(), outerScope);	
		}
		else
		{
			MAODomain domain = (MAODomain) deployment.getDomain();
			
			Set<MConnector> outerConns = new HashSet<MConnector>();
			
			for (MAODomain iod : domain.getInherits())
			{
				outerConns.addAll(MCLEVUtil.getDefault().getAllConnectors(iod));
			}
			outerScope = getFullObjectScope(outerConns);
			
			return getRelativeObjectScope(domain.getConnectors(), outerScope);	
		}

	}
	
	/**
	 * Provides the scope with the list of interface mapping that can be
	 * attached to the connectors that are part of the architecture of an
	 * MCAD model.
	 * 
	 * @param deployment the MCAD model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MInterfaceMapping(final MMCADeployment deployment, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)deployment.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)deployment.eContainer()).getPackage();
		
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
	 * Provides the scope with the list of service libraries that can be
	 * deployed in an MCAD model.
	 * 
	 * @param deployment the MCAD model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MServiceLibrary(final MMCADeployment deployment, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)deployment.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)deployment.eContainer()).getPackage();
		
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
	 * Provides the scope with the list of driver service libraries that can be
	 * deployed in an MCAD model.
	 * 
	 * @param deployment the MCAD model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MServiceLibraryInstance_library(final MDriverSLibInstance drvInst, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		MCommonPackageFile packageFile = (MCommonPackageFile) EcoreUtil.getRootContainer(drvInst);
		final List<MCommonPackage> imports = packageFile.getImports();
		MCommonPackage elementPackage = packageFile.getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
						getElementsOfClass(imports, mclevslibPackage.eINSTANCE.getMDriverServiceLibrary());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevslibPackage.eINSTANCE.getMDriverServiceLibrary()));
		} catch (LibraryManagerException e) {
			e.printStackTrace();
			return IScope.NULLSCOPE;
		}
		
		return getFullElementScope(elements);

	}
	
	
	/**
	 * Provides the scope with the list of domains that can be attached to the
	 * definition of an MCAD model.
	 * 
	 * @param deployment the MCAD model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MMCADeployment_domain(final MMCADeployment deployment, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)deployment.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)deployment.eContainer()).getPackage();
		
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
	 * Provides the scope with the list of components that can be instantiated
	 * as part of the architecture of an MCAD model.
	 * 
	 * @param deployment the MCAD model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MComponent(final MMCADeployment deployment, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)deployment.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)deployment.eContainer()).getPackage();
		
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
	 * Provides the scope with the list of platforms that can be used in the
	 * definition of an MCAD model.
	 * 
	 * @param deployment the MCAD model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MPlatform(final MMCADeployment deployment, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)deployment.eContainer()).getImports();
		
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
	 * Provides the scope with the list of devices that can be deployed
	 * in an MCAD model.
	 * 
	 * @param deployment the MCAD model.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MDevice(final MMCADeployment deployment, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)deployment.eContainer()).getImports();
		
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
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
}
