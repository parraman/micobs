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
package es.uah.aut.srg.micobs.mesp.util;

import java.util.Map;
import java.util.Set;

import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource;
import es.uah.aut.srg.micobs.mesp.mespcommon.MQuantifiableResource;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeviceDriverMapping;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDriverSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPSwPackageDeployment;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.MPlatformSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MAbstractSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackageSupportedDevice;
import es.uah.aut.srg.micobs.mesp.mespswp.MInstantiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MQuantifiableResourceDemand;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.MPlatform;

public interface IMESPUtil {
	
	
	/**
	 * Returns the sum of all the demands of a given resource for a given
	 * platform that are made by the main code and the packages deployed in the
	 * root node of a deployment model.
	 * @param deployment the deployment model.
	 * @param dplt the deployment platform.
	 * @param resource the quantifiable resource.
	 * @return the sum of all the demands of the resource.
	 */
	public Long getSumDemands(MMESPDeployment deployment,
			MMESPDeploymentPlatform dplt, MQuantifiableResource resource);

	/**
	 * Returns a map between all the software interfaces required by the packages
	 * deployed from a leaf alternative and the main code, and their corresponding
	 *  software package required interface objects.
	 * 
	 * @param alternative the leaf alternative from which the map will be obtained.
	 * @return the map between the interfaces and their software package required
	 * interface objects.
	 */
	public Map<MSwInterface, MSwPackageRequiredInterface> getMapAllRequiredSwInterfacesFromAlternative(
			MMESPDeploymentAlternative alternative);

	/**
	 * Returns a map between all the operating system software interfaces required 
	 * by the packages and the main code deployed from a leaf alternative for a 
	 * given platform, and their corresponding software package required interface
	 * objects.
	 * 
	 * @param alternative the leaf alternative from which the map will be obtained.
	 * @param dplt the deployment platform.
	 * @return the map between the interfaces and their software package required
	 * interface objects.
	 */
	public Map<MOSSwInterface, MSwPackageRequiredInterface> getMapAllRequiredOSSwInterfacesFromAlternative(
			MMESPDeploymentAlternative alternative, MMESPDeploymentPlatform dplt);

	/**
	 * Returns all the required interfaces from a leaf deployment alternative and
	 * for a deployment platform. This set includes both the regular software
	 * interfaces and the operating system ones.
	 * 
	 * @param alternative the 
	 * @param dplt
	 * @return
	 */
	public Set<MSwPackageRequiredInterface> getAllRequiredInterfacesFromAlternative(
			MMESPDeploymentAlternative alternative, MMESPDeploymentPlatform dplt);

	public Long getSumDemands(MMESPDeploymentAlternative alternative,
			MMESPDeploymentPlatform dplt, MQuantifiableResource resource);

	/**
	 * Returns, if installed, the platform software package attached to a given
	 * platform.
	 * 
	 * @param platform the platform.
	 * @return the platform software package attached to the platform or
	 * <code>null</code> if the package was not present in the system.
	 */
	public MPlatformSwPackage getPlatformSwPackage(MPlatform platform);

	/**
	 * Returns the map between all the value assignments attached to all 
	 * software interface that are being provided by a given software package.
	 * 
	 * @param swp the software package.
	 * @return the map between the parameters and their corresponding value
	 * assignments.
	 */
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(
			MAbstractSwPackage swp);

	/**
	 * Returns the map between all the value assignments attached to a given 
	 * software interface that is being provided by a given software package.
	 * 
	 * @param swp the software package.
	 * @param swi the software interface.
	 * @return the map between the parameters and their corresponding value
	 * assignments.
	 */
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(
			MAbstractSwPackage swp, MSwInterface swi);

	/**
	 * Returns the set with all the value assignments attached to a given 
	 * software interface that is being provided by a given software package.
	 * 
	 * @param swp the software package.
	 * @param swi the software interface.
	 * @return the set of parameter value assignments.
	 */
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(
			MAbstractSwPackage swp, MSwInterface swi);

	/**
	 * Returns the set with all the value assignments attached to all the 
	 * software interfaces that are being provided by a given software package.
	 * 
	 * @param swp the software package.
	 * @return the set of parameter value assignments.
	 */
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(
			MAbstractSwPackage swp);
	
	/**
	 * Returns a map between the parameters of a given software package and
	 * their corresponding value assignments of a given software package when
	 * it is deployed on a given deployment alternative.
	 * 
	 * @param swpd the deployed software package.
	 * @param alternative the alternative on which it is deployed.
	 * @return the map between the parameters and their corresponding value
	 * assignments.
	 */
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(
			MMESPSwPackageDeployment swpd,
			MMESPDeploymentAlternative alternative);

	/**
	 * Returns the complete set of parameter value assignments for a given
	 * deployed software package. The set of assignments includes the ones
	 * corresponding to the specific software package deployment instance
	 * plus the ones that might have been assigned in the rest of the
	 * parent alternatives or the deployment model root.
	 *  
	 * @param swpd the software package deployment.
	 * @return the complete set of parameter value assignments.
	 */
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(
			MMESPSwPackageDeployment swpd);

	
	/**
	 * Returns the complete set of parameter value assignments for all the
	 * deployed packages. This list includes the parameter value assignments
	 * of the packages plus their software interface parameter value
	 * assignments. If the <code>alternative</code> parameter is
	 * <code>null</code> only the packages deployed at the root of the deployment
	 * model will be considered. If the <code>alternative</code> parameter
	 * points to a leaf deployment alternative, the set will include the
	 * parameter value assignments of all the packages deployed for that
	 * particular alternative.
	 * 
	 * @param deployment the deployment model.
	 * @param alternative the selected leaf deployment alternative.
	 * @return the complete set of parameter value assignments.
	 */
	public Set<MParameterValueAssignment> getAllSwPackageParameterValueAssignments(
			MMESPDeployment deployment, MMESPDeploymentAlternative alternative);
	
	/**
	 * Returns a map between the supported devices of a given driver software
	 * package and the actual deployed devices to which they are attached
	 * when the driver is deployed on a given deployment alternative.
	 * 
	 * @param swpd the deployed driver software package.
	 * @param alternative the alternative on which it is deployed.
	 * @return the map between the parameters and their corresponding value
	 * assignments.
	 */
	public Map<MDriverSwPackageSupportedDevice, MMESPDeviceDriverMapping> getMapAllDriverMappings(
			MMESPDriverSwPackageDeployment swpd,
			MMESPDeploymentAlternative alternative);

	/**
	 * Returns the complete set of device driver mappings for a given
	 * deployed driver. The set of mappings includes the ones corresponding
	 * to the specific driver deployment instance plus the ones that might
	 * have been defined in the rest of the parent alternatives or the
	 * deployment model root.
	 * 
	 * @param swpd the driver software package deployment.
	 * @return the complete set of device driver mappings.
	 */
	public Set<MMESPDeviceDriverMapping> getAllDriverMappings(
			MMESPDriverSwPackageDeployment swpd);

	/**
	 * Returns the set of enumerated parameter definitions defined within
	 * a given software package supported platform.
	 * 
	 * @param swpsp the software package supported platform.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MSwPackageSupportedPlatform swpsp);

	/**
	 * Returns the set of enumerated parameter definitions defined within
	 * a given instantiable resource.
	 * 
	 * @param ires the instantiable resource.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MInstantiableResource ires);

	/**
	 * Returns the set of enumerated parameter definitions defined within
	 * a given software interface.
	 * 
	 * @param swi the software interface.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MSwInterface swi);

	/**
	 * Returns complete the set of enumerated parameter definitions defined
	 * within a given abstract software package plus the ones defined by the
	 * packages from which it inherits.
	 * 
	 * @param aswp the abstract software package.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MAbstractSwPackage aswp);

	/**
	 * Returns the complete set of enumerated parameter definitions
	 * defined within a given software package plus the ones defined
	 * by the packages from which it inherits plus the ones defined
	 * for the software package supported platforms that supports the
	 * given platform. 
	 * 
	 * @param swp the software package.
	 * @param platform the platform.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MSwPackage swp, MPlatform platform);

	/**
	 * Returns the set of enumerated parameter definitions defined within
	 * a given abstract software package.
	 * 
	 * @param aswp the software package.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MAbstractSwPackage aswp);
	
	/**
	 * Returns a platform object constructed out of the fields of the
	 * software package supported platform passed as a parameter.
	 * 
	 * @param swpsp the software package supported platform.
	 * @return the equivalent platform object.
	 */
	public MPlatform toPlatform(MSwPackageSupportedPlatform swpsp);

	/**
	 * Returns all the common enumerated parameter definitions defined by a
	 * software interface plus the ones defined by the interfaces it extends.
	 * 
	 * @param swi the software interface. 
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MSwInterface swi);

	/**
	 * Returns the complete set of operating system software interfaces
	 * implemented by a given operating system software package. This
	 * set includes the OSSwIs implemented by the package itself plus the
	 * ones implemented by the packages it extends.
	 * 
	 * @param osswp the operating system software package.
	 * @return the complete set of operating system software interfaces.
	 */
	public Set<MOSSwInterface> getAllProvidedOSSWIs(MOSSwPackage osswp);

	/**
	 * Returns the mappings between the software packages deployed for a given
	 * alternative and their corresponding package deployment objects.
	 * 
	 * @param alternative the deployment alternative.
	 * @return the mapping between the packages and their deployment objects.
	 */
	public Map<MSwPackage, MMESPSwPackageDeployment> getMapAllDeployedSwPackagesFromAlternative(
			MMESPDeploymentAlternative alternative);

	/**
	 * Obtains the set of deployed packages from an alternative.
	 * This set includes the packages of the given alternative plus the ones
	 * included by its parent alternatives up to the root of the deployment
	 * model.
	 * @param alternative The alternative.
	 * @return The set of deployed software packages.
	 */
	public Set<MMESPSwPackageDeployment> getAllDeployedSwPackagesFromAlternative(
			MMESPDeploymentAlternative alternative);

	/**
	 * Returns the set of leaf deployment alternatives that hung 
	 * from a particular alternative.
	 * 
	 * @param alternative the alternative.
	 * @return the set of leaf deployment alternatives that can be reached
	 * from the alternative.
	 */
	public Set<MMESPDeploymentAlternative> getLeafDeploymentAlternatives(
			MMESPDeploymentAlternative alternative);

	/**
	 * Returns the complete set of leaf deployment alternatives of a deployment
	 * model.
	 * 
	 * @param deployment the deployment model.
	 * @return the set of leaf deployment alternatives.
	 */
	public Set<MMESPDeploymentAlternative> getLeafDeploymentAlternatives(
			MMESPDeployment deployment);

	/**
	 * Checks if the intersection between two software package supported
	 * platforms is zero.
	 * 
	 * @param swrsp1 the first supported platform.
	 * @param swrsp2 the second supported platform.
	 * @return <code>true</code> if the intersection between the supported
	 * platforms is zero; <code>false</code> otherwise.
	 */
	public boolean platformIntersection(MSwPackageSupportedPlatform swrsp1,
			MSwPackageSupportedPlatform swrsp2);

	/**
	 * Checks if a software package supported platform matches with a 
	 * particular platform.
	 * 
	 * @param supportedPlatform the supported platform to check.
	 * @param platform the platform.
	 * @return <code>true</code> if the supported platform matches the
	 * platform; <code>false</code> otherwise.
	 */
	public boolean matchesPlatform(
			MSwPackageSupportedPlatform supportedPlatform, MPlatform platform);

	/**
	 * Checks if a software package supports a given platform.
	 * 
	 * @param swPackage the software package.
	 * @param platform the platform.
	 * @return <code>true</code> if the software package supports
	 * the platform; <code>false</code> otherwise.
	 */
	public boolean supportsPlatform(MSwPackage swPackage, MPlatform platform);

	/**
	 * Returns the supported platform of a software package that matches
	 * a particular platform.
	 * 
	 * @param swp the software package.
	 * @param platform the platform.
	 * @return the supported platform that matches the platform or
	 * <code>null</code> if there is none.
	 */
	public MSwPackageSupportedPlatform getMatchingPlatform(MSwPackage swp,
			MPlatform platform);

	/**
	 * Returns the set of software packages from which a given
	 * package inherits.
	 * 
	 * @param swp the software package, which can be abstract or regular.
	 * @return the set of software packages from which the package inherits.
	 */
	public Set<MAbstractSwPackage> getAllInheritedSwPackages(
			MAbstractSwPackage swp);

	/**
	 * Returns the set of software packages extended by a given package.
	 * 
	 * @param swp the software package.
	 * @return the software packages extended by the package.
	 */
	public Set<MSwPackage> getAllExtendedSwPackages(MSwPackage swp);

	/**
	 * Returns the set of operating system software packages extended by a
	 * given OS software package.
	 * 
	 * @param osswp the operating system software package.
	 * @return the set of extended packages.
	 */
	public Set<MOSSwPackage> getAllExtendedOSSwPackages(MOSSwPackage osswp);

	/**
	 * Returns the complete set of software interfaces extended by a given
	 * interface.
	 * 
	 * @param iface the interface.
	 * @return the complete set of interfaces extended by the interface.
	 */
	public Set<MSwInterface> getAllExtendedSwInterfaces(MSwInterface iface);

	/**
	 * Returns the complete set of operating system software interfaces
	 * extended by a given interface.
	 * 
	 * @param iface the interface.
	 * @return the complete set of interfaces extended by the interface.
	 */
	public Set<MOSSwInterface> getAllExtendedOSSWIs(MOSSwInterface iface);

	/**
	 * This function returns all the software interfaces provided by a
	 * software package. This list includes the interfaces provided by the
	 * very package plus the ones provided by the packages from which it
	 * inherits plus the interfaces they all extend.
	 * 
	 * @param swp the software package.
	 * @return the set of provided software interfaces.
	 */
	public Set<MSwInterface> getAllProvidedSwInterfaces(MAbstractSwPackage aswp);

	/**
	 * This function returns all the software interfaces effectively provided 
	 * by a software package. This list includes the interfaces provided by the
	 * very package plus all the ones provided by the packages from which it
	 * inherits plus the interfaces they all extend minus the interfaces
	 * already provided by the software packages extended by the package.
	 * 
	 * @param swp the software package.
	 * @return the set of effectively provided software interfaces.
	 */
	public Set<MSwInterface> getAllEffectivelyProvidedSwInterfaces(
			MSwPackage swp);

	/**
	 * Returns all the required interface declarations of a software package
	 * that are independent from the platform where it is deployed.
	 * 
	 * @param swp the software package.
	 * @return the required interface declarations.
	 */
	public Set<MSwPackageRequiredInterface> getAllRequiredInterfaces(
			MSwPackage swp);

	/**
	 * Returns all the software interfaces required by a software package
	 * independently from the platform where it is deployed.
	 * 
	 * @param swp the software package.
	 * @return the required software interfaces.
	 */
	public Set<MSwInterface> getAllRequiredSwInterfaces(MSwPackage swp);

	/**
	 * Returns all the required interface declarations of a software package
	 * when it is deployed on a given platform.
	 * 
	 * @param swp the software package.
	 * @param platform the platform.
	 * @return the set of required interface declarations.
	 */
	public Set<MSwPackageRequiredInterface> getAllRequiredInterfaces(
			MSwPackage swp, MPlatform platform);

	/**
	 * Returns all the interfaces required by a software package when it is
	 * deployed on a given platform.
	 * 
	 * @param swp the software package.
	 * @param platform the platform.
	 * @return the set of required interfaces.
	 */
	public Set<MSwInterface> getAllRequiredSwInterfaces(MSwPackage swp,
			MPlatform platform);

	/**
	 * Returns all the interfaces required by a given interface. This set
	 * includes the ones required by the interface itself plus the ones
	 * required by the interfaces it extends.
	 * 
	 * @param swi the software interface.
	 * @return the complete set of required interfaces.
	 */
	public Set<MSwInterface> getAllRequiredSwInterfaces(MSwInterface swi);

	/**
	 * Returns the map between the operating system software interfaces required
	 * by the main code of an application for a given leaf alternative and
	 * their corresponding declaration objects.
	 * 
	 * @param alternative the leaf deployment alternative.
	 * @return the map between the interfaces and the declaration objects.
	 */
	public Map<MOSSwInterface, MSwPackageRequiredInterface> getAllRequiredOSSwInterfacesMap(
			MMESPDeploymentAlternative alternative);

	/**
	 * Returns the map between the software interfaces required by the main
	 * code of an application for a given leaf alternative and their
	 * corresponding declaration objects.
	 * 
	 * @param alternative the leaf deployment alternative.
	 * @return the map between the interfaces and the declaration objects.
	 */
	public Map<MSwInterface, MSwPackageRequiredInterface> getAllRequiredSwInterfacesMap(
			MMESPDeploymentAlternative alternative);

	/**
	 * Returns all the required interface declarations of the main code of
	 * an application for a given leaf deployment alternative.
	 * 
	 * @param alternative the leaf deployment alternative.
	 * @return the set of required interface declarations.
	 */
	public Set<MSwPackageRequiredInterface> getAllRequiredInterfaces(
			MMESPDeploymentAlternative alternative);

	/**
	 * Returns the set of parameters defined by a given software package,
	 * either if it is abstract or regular, independently of the
	 * platform where it will be deployed.
	 * 
	 * @param aswp the software package.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getParameters(MAbstractSwPackage aswp);

	/**
	 * Returns the parameters defined for a given software package supported
	 * platform.
	 * 
	 * @param swpsp the software package supported platform.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getParameters(MSwPackageSupportedPlatform swpsp);

	/**
	 * Returns the complete set of parameters defined by a given software
	 * package, either if it is abstract or regular, independently of the
	 * platform on which it will be deployed. This set includes the
	 * parameters defined by the package itself plus the ones defined
	 * by the packages from which it inherits.
	 * 
	 * @param aswp the software package.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getAllParameters(MAbstractSwPackage aswp);

	/**
	 * Returns the complete set of configuration parameters defined by a
	 * software package for a given platform. The set includes the parameters
	 * defined by the package itself plus the ones defined by the packages
	 * from which it inherits.
	 * 
	 * @param swp the software package.
	 * @param platform the platform.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getAllParameters(MSwPackage swp, MPlatform platform);

	/**
	 * Returns the complete set of parameters defined by a software interface.
	 * This list includes all the parameters defined by the very interface plus
	 * the ones defined by the interfaces it extends.
	 * 
	 * @param swi the software interface.
	 * @return the set of parameters.
	 */
	public Set<MParameter> getAllParameters(MSwInterface swi);

	/**
	 * Returns the set of parameters defined by a software interface.
	 * 
	 * @param swi the software interface.
	 * @return the set of parameters.
	 */
	public Set<MParameter> getParameters(MSwInterface swi);

	/**
	 * Returns the set of quantifiable resources defined by a software
	 * interface.
	 * 
	 * @param iface the software interface.
	 * @return the set of quantifiable resources.
	 */
	public Set<MQuantifiableResource> getQuantifiableResources(
			MSwInterface iface);

	/**
	 * Returns the complete set of quantifiable resources defined by a software
	 * interface. The set includes the resources defined by the interface
	 * plus the ones defined by the interfaces it extends.
	 * 
	 * @param iface the software interface.
	 * @return the set of quantifiable resources.
	 */
	public Set<MQuantifiableResource> getAllQuantifiableResources(
			MSwInterface iface);

	/**
	 * Returns the complete set of quantifiable resources defined by an 
	 * operating system software interface. The set includes the resources
	 * defined by the interface plus the ones defined by the interfaces it
	 * extends.
	 * 
	 * @param osswi the operating system software interface.
	 * @return the set of quantifiable resources.
	 */
	public Set<MQuantifiableResource> getAllQuantifiableResources(
			MOSSwInterface osswi);

	/**
	 * Returns the set of instantiable resources demands of a software package
	 * when it is deployed on a given platform.
	 * 
	 * @param swp the software package.
	 * @param platform the platform.
	 * @return the set of quantifiable resources.
	 */
	public Set<MInstantiableResourceDemand> getInstantiableResourceDemands(
			MSwPackage swp, MPlatform platform);

	/**
	 * Returns the set of quantifiable resources demands of a software package
	 * when it is deployed on a given platform.
	 * 
	 * @param swp the software package.
	 * @param platform the platform.
	 * @return the set of quantifiable resources.
	 */
	public Set<MQuantifiableResourceDemand> getQuantifiableResourceDemands(
			MSwPackage swp, MPlatform platform);

	/**
	 * Returns the set of quantifiable resources defined an operating system
	 * software interface.
	 * 
	 * @param osswi the operating system software interface.
	 * @return the set of quantifiable resources.
	 */
	public Set<MQuantifiableResource> getQuantifiableResources(
			MOSSwInterface osswi);

	/**
	 * Returns the set of instantiable resources defined by a software
	 * interface.
	 * 
	 * @param iface the software interface.
	 * @return the set of instantiable resources defined by the interface.
	 */
	public Set<MInstantiableResource> getInstantiableResources(
			MSwInterface iface);

	/**
	 * Returns the complete set of instantiable resources defined by a software
	 * interface. The set includes the resources defined by the interface
	 * itself plus the ones defined by the interfaces it extends.
	 * @param iface the software interface.
	 * @return the complete set of instantiable resources.
	 */
	public Set<MInstantiableResource> getAllInstantiableResources(
			MSwInterface iface);

	/**
	 * Returns the complete set of instantiable resources defined an operating
	 * system software interface. The set includes the resources defined by
	 * the interface itself plus the ones defined by the interfaces
	 * it extends.
	 * 
	 * @param iface the operating system software interface.
	 * @return the complete set of instantiable resources.
	 */
	public Set<MInstantiableResource> getAllInstantiableResources(
			MOSSwInterface iface);

	/**
	 * The set of instantiable resources defined by an operating system
	 * software interface.
	 * 
	 * @param osswi the operating system software interface.
	 * @return the set of instantiable resources defined by the interface.
	 */
	public Set<MInstantiableResource> getInstantiableResources(
			MOSSwInterface osswi);

	/**
	 * Returns the set of software interfaces provided by the software packages
	 * deployed at the root of the deployment model.
	 * 
	 * @param deployment the deployment model.
	 * @return the set of software interfaces provided by the software packages
	 * deployed at the root of the deployment model.
	 */
	public Set<MSwInterface> getProvidedSwInterfaces(MMESPDeployment deployment);

	/**
	 * Returns the set of software interfaces that intervene in a deployment
	 * project. The set includes the interfaces provided by all
	 * the software packages deployed for all the alternatives.
	 * 
	 * @param deployment the deployment project.
	 * @return the set of provided software interfaces.
	 */
	public Set<MSwInterface> getAllProvidedSwInterfaces(
			MMESPDeployment deployment);

	/**
	 * Returns all the software interfaces provided by the packages
	 * deployed by an application for a given alternative.
	 * 
	 * @param alternative the deployment alternative.
	 * @return the set of software interfaces provided by the deployed
	 * packages.
	 */
	public Set<MSwInterface> getAllProvidedSwInterfaces(
			MMESPDeploymentAlternative alternative);

	/**
	 * Returns the set of operating system software interfaces that intervene
	 * in a deployment project. The set includes the interfaces provided by all
	 * the operating system software packages of all the deployment platforms.
	 * 
	 * @param deployment the deployment project.
	 * @return the set of provided operating system software interfaces.
	 */
	public Set<MOSSwInterface> getAllProvidedOSSwInterfaces(
			MMESPDeployment deployment);

	/**
	 * Returns the set of parameters of an instantiable resource.
	 * 
	 * @param resource the instantiable resource.
	 * @return the set of parameters of the resource.
	 */
	public Set<MParameter> getParameters(MInstantiableResource resource);

	
	/**
	 * Returns the operating system software interface corresponding to the
	 * implementation of the given OSAPI. If no OSSwInterface has been defined,
	 * the function shall return <code>null</code>.
	 * 
	 * @param osapi the operating system API.
	 * @return the operating system software interface or <code>null</code> if
	 * no interface has been defined.
	 */
	public MOSSwInterface getOSSwInterface(MOperatingSystemAPI osapi);

}