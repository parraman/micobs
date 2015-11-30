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
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeployedDevice;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;
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
public class FLATMCADScopeProvider extends MICOBSElementAbstractScopeProvider {
	
	/**
	 * Provides the scope for the deployed devices that can be mapped to
	 * a particular driver service library.
	 * 
	 * @param drvInst the deployed driver service library.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MDeployedDevice(MFlatDriverSLibInstance drvInst, EReference reference)
	{
		MFlatMCADTarget target = (MFlatMCADTarget) drvInst.eContainer();
		
		Set<MDeployedDevice> ddevices = new HashSet<MDeployedDevice>();
		
		if (target.getDeploymentPlatform() != null &&
			target.getDeploymentPlatform().eIsProxy() == false)
		{
			ddevices.addAll(target.getDeploymentPlatform().getDeployedDevices());
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
	public IScope scope_MDriverSLibSupportedDevice(MFlatDriverSLibInstance drvInst, EReference reference)
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
	 * Provides the list of boolean attributes of a service library whose
	 * values can be assigned when the library is deployed as part of a
	 * flat deployment model.
	 * @param instance The deployed service library.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MFlatServiceLibraryInstance instance, EReference reference)
	{
		if (instance.getLibrary() == null ||
			instance.getLibrary().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		MServiceLibrary slib = instance.getLibrary();
		MFlatMCADTarget target = (MFlatMCADTarget) instance.eContainer();
					
		Set<MParameter> outerAttributes = new HashSet<MParameter>();
		
		for (MAbstractServiceLibrary aslib : slib.getInherits())
		{
			outerAttributes.addAll(MCLEVUtil.getDefault().getAllAttributes(aslib));
		}
		
		IScope outerScope = getFullObjectScope(outerAttributes);
		
		Set<MParameter> innerAttributes = new HashSet<MParameter>();
		innerAttributes.addAll(MCLEVUtil.getDefault().getAttributes(slib));
		
		if (target.getDeploymentPlatform() != null &&
			target.getDeploymentPlatform().eIsProxy() == false)
		{
			MServiceLibrarySupportedPlatform slsp = MCLEVUtil.getDefault().getMatchingPlatform(slib, target.getDeploymentPlatform().getPlatform());
			if (slsp != null)
			{
				innerAttributes.addAll(MCLEVUtil.getDefault().getAttributes(slsp));
			}
		}

		return getRelativeObjectScope(innerAttributes, outerScope);

	}
	
	/**
	 * Provides the list of attributes of a component whose values can
	 * be assigned when the component is instantiated as part of the
	 * architecture of a flat deployment model.
	 * @param instance The instance of the component.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(final MFlatComponentInstance instance, EReference reference)
	{
		if (instance.getComponent() == null ||
			instance.getComponent().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		MComponent cmp = instance.getComponent();
		
		MFlatMCADTarget target = (MFlatMCADTarget) instance.eContainer();
			
		Set<MParameter> outerAttributes = new HashSet<MParameter>();
			
		for (MAbstractComponent acmp : cmp.getInherits())
		{
			outerAttributes.addAll(MCLEVUtil.getDefault().getAllAttributes(acmp));
		}
			
		IScope outerScope = getFullObjectScope(outerAttributes);
			
		Set<MParameter> innerAttributes = new HashSet<MParameter>();
		innerAttributes.addAll(MCLEVUtil.getDefault().getAttributes(cmp));
			
		if (target.getDeploymentPlatform() != null &&
			target.getDeploymentPlatform().eIsProxy() == false)
		{
			MComponentSupportedPlatform csp = MCLEVUtil.getDefault().getMatchingPlatform(cmp, target.getDeploymentPlatform().getPlatform());
			if (csp != null)
			{
				innerAttributes.addAll(MCLEVUtil.getDefault().getAttributes(csp));
			}
		}

		return getRelativeObjectScope(innerAttributes, outerScope);
	}
	
	/**
	 * Provides the scope for the elements than can be referenced when
	 * assigning a new value to a parameter
	 * @param assignment the configuration parameter.
	 * @param reference the object representing the reference within the
	 *        given class.
	 * @return the scope of the reference.
	 */
	public IScope scope_MParameterValueRefObject_object(MParameterValueAssignment assignment, EReference reference)
	{		
		MFlatMCADTarget target = null;
		MFlatMCAD flatMCAD = null;

		Set<MParameter> attributes = new HashSet<MParameter>();
		
		if (assignment.eContainer() instanceof MFlatComponentInstance)
		{
			MFlatComponentInstance inst = (MFlatComponentInstance)assignment.eContainer();		
			target = (MFlatMCADTarget)inst.eContainer();
			flatMCAD = (MFlatMCAD) target.eContainer();
			
			if (inst.getComponent() != null &&
				inst.getComponent().eIsProxy() == false)
			{
				MComponent cmp = inst.getComponent();
												
				attributes.addAll(MCLEVUtil.getDefault().getAllAttributes(cmp));
					
				for (MComponentSupportedPlatform csp : cmp.getSupportedPlatforms())
				{
					if (target.getDeploymentPlatform().getPlatform() != null &&
						target.getDeploymentPlatform().getPlatform().eIsProxy() == false &&
						MCLEVUtil.getDefault().matchesPlatform(csp, target.getDeploymentPlatform().getPlatform()))
					{
						attributes.addAll(MCLEVUtil.getDefault().getAttributes(csp));
					}
				}
			}
		}
		else if (assignment.eContainer() instanceof MFlatServiceLibraryInstance)
		{
			MFlatServiceLibraryInstance slinst = (MFlatServiceLibraryInstance)assignment.eContainer();
			target = (MFlatMCADTarget)slinst.eContainer();
			flatMCAD = (MFlatMCAD) target.eContainer();
			MServiceLibrary slib = slinst.getLibrary();
						
			attributes.addAll(MCLEVUtil.getDefault().getAllAttributes(slib));
			
			for (MServiceLibrarySupportedPlatform slsp : slib.getSupportedPlatforms())
			{
				if (target.getDeploymentPlatform().getPlatform() != null &&
					target.getDeploymentPlatform().getPlatform().eIsProxy() == false &&
					MCLEVUtil.getDefault().matchesPlatform(slsp, target.getDeploymentPlatform().getPlatform()))
				{
					attributes.addAll(MCLEVUtil.getDefault().getAttributes(slsp));
				}
			}
		}
					
		if (flatMCAD.getReferencedElement() != null &&
			flatMCAD.getReferencedElement().eIsProxy() == false &&
			flatMCAD.getReferencedElement() instanceof MMCADeployment &&
			((MMCADeployment)flatMCAD.getReferencedElement()).getDomain() != null &&
			((MMCADeployment)flatMCAD.getReferencedElement()).getDomain().eIsProxy() == false)
		{
			MMCADeployment deployment = ((MMCADeployment)flatMCAD.getReferencedElement());
			if (deployment.getDomain() instanceof MIODomain)
			{
				MIODomain domain = (MIODomain)deployment.getDomain();
					
				attributes.addAll(MCLEVUtil.getDefault().getAllAttributes(domain));

				if (target.getDeploymentPlatform().getPlatform() != null &&
					target.getDeploymentPlatform().getPlatform().eIsProxy() == false)
				{
					MIODomainSupportedPlatform iodsp = MCLEVUtil.getDefault().getMatchingPlatform(domain, 
							target.getDeploymentPlatform().getPlatform());
					if (iodsp != null)
					{
						attributes.addAll(MCLEVUtil.getDefault().getAttributes(iodsp));
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
	 * Provides the list of boolean attributes whose values can be assigned in
	 * the definition of a flat deployment model. These attributes are extracted
	 * from the definition of the domain attached to the deployment model.
	 * @param target The flat deployment model.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MParameterValueAssignment_parameter(MFlatMCADTarget target, EReference reference)
	{
		MFlatMCAD flatMCAD = (MFlatMCAD) target.eContainer();
		
		if (flatMCAD.getReferencedElement() == null ||
			flatMCAD.getReferencedElement().eIsProxy() == true ||
			!(flatMCAD.getReferencedElement() instanceof MMCADeployment))
		{
			return IScope.NULLSCOPE;
		}
			
		MMCADeployment deployment = (MMCADeployment) flatMCAD.getReferencedElement();
		
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
			
			Set<MParameter> innerAttributes = new HashSet<MParameter>();
			innerAttributes.addAll(MCLEVUtil.getDefault().getAttributes(domain));
				
			if (target.getDeploymentPlatform() != null &&
				target.getDeploymentPlatform().eIsProxy() == false)
			{
				MIODomainSupportedPlatform iodsp = MCLEVUtil.getDefault().getMatchingPlatform(domain, target.getDeploymentPlatform().getPlatform());
				if (iodsp != null)
				{
					innerAttributes.addAll(MCLEVUtil.getDefault().getAttributes(iodsp));
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
	 * Provides the list of server ports that can be used as destinations of
	 * a flat connection.
	 * @param connection The flat connection.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MFlatConnection_serverPort(
			final MFlatConnection connection, EReference reference)
	{
		if (connection.getServerInstance() == null ||
			connection.getServerInstance().eIsProxy() == true ||
			connection.getServerInstance().getComponent() == null ||
			connection.getServerInstance().getComponent().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		MComponent component = connection.getServerInstance().getComponent();
		
		return getRelativeObjectScope(MCLEVUtil.getDefault().getAllServerPorts(component));
	}
	
	/**
	 * Provides the list of client ports that can be used as sources of
	 * a flat connection.
	 * @param connection The flat connection.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MFlatConnection_clientPort(
			final MFlatConnection connection, EReference reference)
	{
		if (connection.getClientInstance() == null ||
			connection.getClientInstance().eIsProxy() == true ||
			connection.getClientInstance().getComponent() == null ||
			connection.getClientInstance().getComponent().eIsProxy() == true)
		{
			return IScope.NULLSCOPE;
		}
		
		MComponent component = connection.getClientInstance().getComponent();
				
		return getRelativeObjectScope(MCLEVUtil.getDefault().getAllClientPorts(component));
	}
	
	/**
	 * Provides the list of component instances that can be used as sources of
	 * flat connections.
	 * @param connection The flat connection.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MFlatComponentInstance(
			final MFlatMCADTarget target, EReference reference)
	{
		return getRelativeObjectScope(target.getComponents());
		
	}
	
	public IScope scope_MDeploymentAlternative(final MFlatMCAD flatMCAD, EReference reference)
	{		
		if (flatMCAD.getReferencedElement() == null ||
			flatMCAD.getReferencedElement().eIsProxy() == true ||
			!(flatMCAD.getReferencedElement() instanceof MMCADeployment))
		{
			return IScope.NULLSCOPE;
		}
		
		MMCADeployment deployment = (MMCADeployment) flatMCAD.getReferencedElement();
		
		return getRelativeObjectScope(MCLEVUtil.getDefault().getLeafDeploymentAlternatives(deployment));
	}
	
	public IScope scope_MDeploymentPlatform(final MFlatMCAD flatMCAD, EReference reference)
	{		
		if (flatMCAD.getReferencedElement() == null ||
			flatMCAD.getReferencedElement().eIsProxy() == true ||
			!(flatMCAD.getReferencedElement() instanceof MMCADeployment))
		{
			return IScope.NULLSCOPE;
		}
		
		MMCADeployment deployment = (MMCADeployment) flatMCAD.getReferencedElement();
		
		return getSimpleObjectScope(deployment.getDeploymentPlatforms());
	}
	
	/**
	 * Provides the scope with the list of connectors that can be
	 * used in the definition the architecture of a flat MCAD model.
	 * Implements Restriction 176 and 184.
	 * @param flatMCAD The flat MCAD model.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MConnector(final MFlatMCAD flatMCAD, EReference reference)
	{
		IScope outerScope = IScope.NULLSCOPE;
		
		if (flatMCAD.getReferencedElement() == null ||
			flatMCAD.getReferencedElement().eIsProxy() == true ||
			!(flatMCAD.getReferencedElement() instanceof MMCADeployment))
		{
			return IScope.NULLSCOPE;
		}
		
		MMCADeployment deployment = (MMCADeployment) flatMCAD.getReferencedElement();
		
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
	 * attached to the connectors that are part of the architecture of a
	 * flat MCAD model.
	 * @param flatMCAD The flat MCAD model.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MInterfaceMapping(final MFlatMCAD flatMCAD, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)flatMCAD.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)flatMCAD.eContainer()).getPackage();
		
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
	 * Provides the scope with the list of driver service libraries that can be
	 * deployed in a flat MCAD model.
	 * @param drvInst a driver service library instance.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MFlatServiceLibraryInstance_library(final MFlatDriverSLibInstance drvInst, EReference reference)
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
	 * Provides the scope with the list of service libraries that can be
	 * deployed in a flat MCAD model.
	 * @param flatMCAD The flat MCAD model.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MServiceLibrary(final MFlatMCAD flatMCAD, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)flatMCAD.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)flatMCAD.eContainer()).getPackage();
		
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
	 * Provides the scope with the list of components that can be instantiated
	 * as part of the architecture of a flat MCAD model.
	 * @param flatMCAD The flat MCAD model.
	 * @param reference The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MComponent(final MFlatMCAD flatMCAD, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)flatMCAD.eContainer()).getImports();
		MCommonPackage elementPackage = ((MCommonPackageFile)flatMCAD.eContainer()).getPackage();
		
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
	 * Provides the scope for the MCAD model corresponding to a flat MCAD
	 * deployment model.
	 * @param flatMCAD The flat MCAD model.
	 * @param The object representing the reference within the
	 *        given class.
	 * @return The scope of the reference.
	 */
	public IScope scope_MCommonPackageReferencingElement_referencedElement(final MFlatMCAD flatMCAD, EReference reference)
	{
		Collection <MCommonPackageElement> elements = null;
		final List<MCommonPackage> imports = ((MCommonPackageFile)flatMCAD.eContainer()).getImports();
		final MCommonPackage elementPackage = ((MCommonPackageFile)flatMCAD.eContainer()).getPackage();
		
		try {
			elements = MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(imports, mclevmcadPackage.eINSTANCE.getMMCADeployment());
			elements.addAll(MCLEVLibraryManager.getLibraryManager().
					getElementsOfClass(elementPackage, mclevmcadPackage.eINSTANCE.getMMCADeployment()));		
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
