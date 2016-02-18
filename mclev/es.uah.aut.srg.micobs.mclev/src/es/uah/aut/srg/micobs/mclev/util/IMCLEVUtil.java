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
package es.uah.aut.srg.micobs.mclev.util;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackage;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MAbstractComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentConnection;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MInternalComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MPort;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MServerPort;
import es.uah.aut.srg.micobs.mclev.mclevdom.MAODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MComponentTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevdom.MDomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExchangeModel;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalClientPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MExternalServerPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInterfaceType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalClientPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MInternalServerPortTypeInstance;
import es.uah.aut.srg.micobs.mclev.mclevdom.MPortType;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MConnection;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeploymentAlternative;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDeviceDriverMapping;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MDriverSLibInstance;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.mclev.mclevslib.MAbstractServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverSLibSupportedDevice;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrarySupportedPlatform;
import es.uah.aut.srg.micobs.pdl.MPlatform;

public interface IMCLEVUtil {

	/**
	 * Returns a platform object constructed out of the fields of the
	 * service library supported platform passed as a parameter.
	 * 
	 * @param slibsp the service library supported platform.
	 * @return the equivalent platform object.
	 */
	public MPlatform toPlatform(MServiceLibrarySupportedPlatform slibsp);

	/**
	 * Returns a set with all the ports defined by a component that are not
	 * relay ports. The set includes both the internal and external ports.
	 * If the component does not define any port or it defines only relay
	 * ports, the method will return an empty set.
	 * 
	 * @param component the component.
	 * @return the set of ports.
	 */
	public Set<MPort> getAllPortsWithoutRelay(MComponent component);

	/**
	 * Returns a set with all the ports defined by a component. If the
	 * component is abstract, the set will include only the external ports. On
	 * the other hand, if the component is a regular one, it will also include
	 * the set of internal ports. If the component does not define any
	 * port, the method will return an empty set.
	 * 
	 * @param component the component.
	 * @return the set of ports.
	 */
	public Set<MPort> getAllPorts(MAbstractComponent component);

	/**
	 * The set of internal component connections defined to short circuit
	 * the membrane of a component. If the component does not define
	 * any short circuit connection, the method will return an empty set.
	 * 
	 * @param component the component.
	 * @return the set of short circuit connections.
	 */
	public Set<MInternalComponentConnection> getShortCircuitConnections(
			MComponent component);

	/**
	 * Returns the set with all the components that are part of the global
	 * (i.e. the platform-independent) internal structure of another component
	 * plus their own sub-components. The set is made only out of the
	 * components, <em>not</em> the instances. If the component does not define
	 * any instances, the method will return an empty set.
	 * 
	 * @param component the component.
	 * @return the set of components.
	 */
	public Set<MComponent> getAllInternalComponents(MComponent component);

	/**
	 * Returns the set will all the components that are part of internal
	 * structure of another component. The set includes the components of the
	 * global part as well as the ones defined as part of the supported
	 * platform that matches the platform passed as parameter. If the 
	 * none of the component's supported platforms matches the platform,
	 * it will only include the components of the global part. If the
	 * internal structure is empty, the method will return an empty set.
	 *  
	 * @param component the component.
	 * @param platform the matching platform.
	 * @return the set of components.
	 */
	public Set<MComponent> getAllInternalComponents(MComponent component,
			MPlatform platform);

	/**
	 * Returns the set will all the components that are part of the internal
	 * structure of another component. The set includes the components of the
	 * global part plus the ones defined as part of the supported platforms
	 * match the set of platforms passed as parameter.  If the 
	 * none of the component's supported platforms matches any of the 
	 * platforms, it will only include the components of the global part. If
	 * the internal structure is empty, the method will return an empty set.
	 * 
	 * @param component the component.
	 * @param platforms the set of platforms to match.
	 * @return the set of components.
	 */
	public Set<MComponent> getAllInternalComponents(MComponent component,
			Collection<MPlatform> platforms);

	/**
	 * Returns the set of internal component instances defined as part of the
	 * internal architecture of a component. The set includes the instances of
	 * the global part plus the ones defined as part of the supported platform
	 * that matches the platform passed as parameter. If none of the
	 * component's supported platforms matches the platform, it will only
	 * include the components of the global part. If the internal structure is
	 * empty, the method will return an empty set.
	 * 
	 * @param component the component.
	 * @param platform the platform to match.
	 * @return the set of component instances.
	 */
	public Set<MInternalComponentInstance> getInternalInstances(
			MComponent component, MPlatform platform);

	/**
	 * Returns the set of enumerated attribute definitions defined within
	 * a given service library supported platform.
	 * 
	 * @param slibsp the service library supported platform.
	 * @return the set of enumerated attribute definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumAttributeDefinitions(
			MServiceLibrarySupportedPlatform slibsp);

	/**
	 * Returns all the common enumerated attribute definitions defined by a
	 * service access interface plus the ones defined by the interfaces it
	 * extends.
	 * 
	 * @param sai the service access interface.
	 * @return the set of enumerated attribute definitions.
	 */
	public Set<MEnumParameterDefinition> getAllEnumAttributeDefinitions(MSAI sai);

	/**
	 * Returns the set of enumerated attribute definitions defined within
	 * a given service access interface.
	 * 
	 * @param sai the service access interface.
	 * @return the set of enumerated attribute definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumAttributeDefinitions(MSAI sai);

	/**
	 * Returns complete the set of enumerated attribute definitions defined
	 * within a given abstract service library plus the ones defined by the
	 * libraries from which it inherits.
	 * 
	 * @param aslib the abstract service library.
	 * @return the set of enumerated attribute definitions.
	 */
	public Set<MEnumParameterDefinition> getAllEnumAttributeDefinitions(
			MAbstractServiceLibrary aslib);

	/**
	 * Returns the set of enumerated attribute definitions defined within
	 * a given abstract service library.
	 * 
	 * @param aslib the abstract service library.
	 * @return the set of enumerated attribute definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumAttributeDefinitions(
			MAbstractServiceLibrary aslib);

	/**
	 * Returns the set of attributes defined by a given component,
	 * either if it is abstract or regular, independently of the
	 * platform where it will be instantiated.
	 * 
	 * @param acmp the component.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAttributes(MAbstractComponent acmp);

	/**
	 * Returns the set of attributes defined by a given implementation-oriented
	 * domain, independently of the underlying deployment platform.
	 * 
	 * @param iod the implementation-oriented domain.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAttributes(MIODomain iod);

	/**
	 * Returns the set of attributes defined by a given application-oriented
	 * domain.
	 * 
	 * @param aod the application-oriented domain.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAttributes(MAODomain aod);

	/**
	 * Returns the set of parameters defined by a given service library,
	 * either if it is abstract or regular, independently of the
	 * platform where it will be instantiated.
	 * 
	 * @param aslib the service library.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAttributes(MAbstractServiceLibrary aslib);

	/**
	 * Returns the set of attributes defined by a service access interface.
	 * 
	 * @param sai the service access interface.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAttributes(MSAI sai);

	/**
	 * Returns the attributes defined for a given implementation-oriented
	 * domain supported platform.
	 * 
	 * @param iodsp the implementation-oriented domain supported platform.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAttributes(MIODomainSupportedPlatform iodsp);

	/**
	 * Returns the attributes defined for a given component supported platform.
	 * 
	 * @param csp the component supported platform.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAttributes(MComponentSupportedPlatform csp);

	/**
	 * Returns the attributes defined for a given service library supported
	 * platform.
	 * 
	 * @param slsp the service library supported platform.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAttributes(MServiceLibrarySupportedPlatform slsp);

	/**
	 * Returns the complete set of attributes defined by a software interface.
	 * This list includes all the attributes defined by the very interface plus
	 * the ones defined by the interfaces it extends.
	 * 
	 * @param swi the software interface.
	 * @return the set of parameters.
	 */
	public Set<MParameter> getAllAttributes(MIODomain iod);

	/**
	 * Returns the complete set of attributes defined by a service access
	 * interface. This list includes all the attributes defined by the very
	 * interface plus the ones defined by the interfaces it extends.
	 * 
	 * @param sai the service access interface.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAllAttributes(MSAI sai);

	/**
	 * Returns the complete set of parameters defined by an
	 * implementation-oriented domain independently of the underlying
	 * deployment platform. This set includes the parameters defined by the
	 * domain itself plus the ones defined by the domains from which it
	 * inherits. 
	 * 
	 * @param iod the implementation-oriented domain.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAllAttributes(MAODomain iod);

	/**
	 * Returns the complete set of parameters defined by a component, either
	 * if it is abstract or regular, independently of the platform on which it
	 * will be deployed. This set includes the parameters defined by the
	 * component itself plus the ones defined by the packages from which it
	 * inherits. 
	 * 
	 * @param acmp the component.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAllAttributes(MAbstractComponent acmp);

	/**
	 * Returns the complete set of parameters defined by a service library,
	 * either if it is abstract or regular, independently of the platform on
	 * which it will be deployed. This set includes the parameters defined by
	 * the component itself plus the ones defined by the packages from which it
	 * inherits. 
	 * 
	 * @param aslib the service library.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAllAttributes(MAbstractServiceLibrary aslib);

	/**
	 * This function returns all the Service Access Interfaces (SAIs)
	 * effectively provided by a service library. This list includes the
	 * interfaces provided by the very library plus all the ones provided
	 * by the libraries from which it inherits plus the interfaces they all 
	 * extend minus the SAIs already provided by the service libraries
	 * extended by the library.
	 * 
	 * @param slib the service library.
	 * @return the set of provided SAIs.
	 */
	public Set<MSAI> getAllEffectivelyProvidedSAIs(MServiceLibrary slib);

	/**
	 * Returns a map between the attributes of a given service library and
	 * their corresponding value assignments when it is deployed on a given
	 * deployment alternative.
	 * 
	 * @param slinst the deployed service library.
	 * @param alternative the alternative on which it is deployed.
	 * @return the map between the attributes and their corresponding value
	 * assignments.
	 */
	public Map<MParameter, MParameterValueAssignment> getMapAllAttributeValueAssignments(
			MServiceLibraryInstance slinst, MDeploymentAlternative alternative);

	/**
	 * Returns the complete set of attribute value assignments for a given
	 * deployed service library. The set of assignments includes the ones
	 * corresponding to the specific service library instance plus the ones
	 * that might have been assigned in the rest of the parent alternatives
	 * or the deployment model root.
	 *  
	 * @param slinst the service library instance.
	 * @return the complete set of attribute value assignments.
	 */
	public Set<MParameterValueAssignment> getAllAttributeValueAssignments(
			MServiceLibraryInstance slinst);

	/**
	 * Returns a map between the supported devices of a given driver service
	 * library and the actual deployed devices to which they are attached
	 * when the driver is deployed on a given deployment alternative.
	 * 
	 * @param drvInst the deployed driver service library.
	 * @param alternative the alternative on which it is deployed.
	 * @return the map between the parameters and their corresponding value
	 * assignments.
	 */
	public Map<MDriverSLibSupportedDevice, MDeviceDriverMapping> getMapAllDriverMappings(
			MDriverSLibInstance drvInst, MDeploymentAlternative alternative);

	/**
	 * Returns the complete set of device driver mappings for a given
	 * deployed driver. The set of mappings includes the ones corresponding
	 * to the specific driver instance plus the ones that might have been
	 * defined in the rest of the parent alternatives or the deployment model
	 * root.
	 * 
	 * @param drvInst the driver service library instance.
	 * @return the complete set of device driver mappings.
	 */
	public Set<MDeviceDriverMapping> getAllDriverMappings(
			MDriverSLibInstance drvInst);

	/**
	 * This function returns all the interface types supported by a given
	 * type of port. The returned set includes the interface types supported
	 * by the very connector plus the types supported by the connectors from
	 * which it inherits.
	 * 
	 * @param ptype the port type.
	 * @return the set of supported interface types.
	 */
	public Set<MInterfaceType> getAllInterfaceTypes(MPortType ptype);

	/**
	 * This function returns all the interface types supported by a given
	 * exchange model. The returned set includes the interface types supported
	 * by the very model plus the types supported by the models from which it
	 * inherits.
	 * 
	 * @param em the exchange model.
	 * @return the set of supported interface types.
	 */
	public Set<MInterfaceType> getAllInterfaceTypes(MExchangeModel em);

	/**
	 * This function returns all the client port types supported by a given
	 * connector.The returned set includes the client port types supported
	 * by the very connector plus the types supported by the connectors from
	 * which it inherits.
	 * 
	 * @param conn the connector.
	 * @return The set of supported client port types.
	 */
	public Set<MPortType> getAllClientPortTypes(MConnector conn);

	/**
	 * This function returns all the server port types supported by a given
	 * connector.The returned set includes the server port types supported
	 * by the very connector plus the types supported by the connectors from
	 * which it inherits.
	 * @param conn The connector.
	 * @return The set of supported sever port types.
	 */
	public Set<MPortType> getAllServerPortTypes(MConnector conn);

	/**
	 * Returns a map with all the component type instances of a component type
	 * indexed by the types of component to which the instances belong.
	 * @param ctype The component type.
	 * @return The map with the component type instances.
	 */
	public Map<MComponentType, MComponentTypeInstance> getAllComponentTypeInstances(
			MComponentType ctype);

	/**
	 * Returns a map with all the component type instances of a domain
	 * indexed by the types of component to which the instances belong.
	 * @param domain The domain.
	 * @return The map with the component type instances.
	 */
	public Map<MComponentType, MComponentTypeInstance> getAllComponentTypeInstances(
			MDomain domain);

	/**
	 * Returns the set of service libraries extended by a given library.
	 * 
	 * @param slib the service library.
	 * @return the service libraries extended by the library.
	 */
	public Set<MServiceLibrary> getAllExtendedLibraries(MServiceLibrary slib);

	/**
	 * This function returns all the SAIs effectively provided by a service
	 * library. This list includes the interfaces provided by the very library
	 * plus all the ones provided by the library from which it inherits plus
	 * the interfaces they all extend.
	 * 
	 * @param slib The service library.
	 * @return The set of provided SAIs.
	 */
	public Set<MSAI> getAllProvidedSAIs(MServiceLibrary slib);

	/**
	 * Returns all the required service access interfaces of a service library
	 * when it is deployed on a given platform.
	 * 
	 * @param slib the service library.
	 * @param platform the platform.
	 * @return the set of required service access interfaces.
	 */
	public Set<MSAI> getAllRequiredSAIs(MServiceLibrary slib, MPlatform platform);

	/**
	 * Returns all the required service access interfaces of an
	 * implementation-oriented domain when it is deployed on a given platform.
	 * 
	 * @param domain the implementation-oriented domain.
	 * @param platform the platform.
	 * @return the set of required service access interfaces.
	 */
	public Set<MSAI> getAllRequiredSAIs(MIODomain domain, MPlatform platform);

	/**
	 * Returns all the required service access interfaces of a component
	 * when it is deployed on a given platform.
	 * 
	 * @param cmp the component.
	 * @param platform the platform.
	 * @return the set of required service access interfaces.
	 */
	public Set<MSAI> getAllRequiredSAIs(MComponent cmp, MPlatform platform);

	/**
	 * This function returns a map with the external client port type instances
	 * of a given component type.
	 * 
	 * @param ctype the component type.
	 * @return the map with the external client port type instances.
	 */
	public Map<MPortType, MExternalClientPortTypeInstance> getAllExternalClientPortTypeInstances(
			MComponentType ctype);

	/**
	 * This function returns a map with the external server port type instances
	 * of a given component type.
	 * 
	 * @param ctype the component type.
	 * @return the map with the external server port type instances.
	 */
	public Map<MPortType, MExternalServerPortTypeInstance> getAllExternalServerPortTypeInstances(
			MComponentType ctype);

	/**
	 * This function returns a map with the internal client port type instances
	 * of a given component type.
	 * 
	 * @param ctype the component type.
	 * @return the map with the internal client port type instances.
	 */
	public Map<MPortType, MInternalClientPortTypeInstance> getAllInternalClientPortTypeInstances(
			MComponentType ctype);

	/**
	 * This function returns a map with the internal server port type instances
	 * of a given component type.
	 * 
	 * @param ctype the component type.
	 * @return the map with the internal server port type instances.
	 */
	public Map<MPortType, MInternalServerPortTypeInstance> getAllInternalServerPortTypeInstances(
			MComponentType ctype);

	/**
	 * This function returns all the connectors from the alternative passed as
	 * parameter to the uppermost level, i.e. the root of the deployment model.
	 * 
	 * @param alternative the alternative from which the connectors will be
	 * obtained.
	 * @return the set of connections.
	 */
	public Set<MConnection> getAllConnections(MDeploymentAlternative alternative);

	/**
	 * Returns the set of components inherited by a given component.
	 * 
	 * @param component the component.
	 * @return the set of inherited components. If the component parameter is
	 * 		   null, it returns an empty list.
	 */
	public Set<MAbstractComponent> getInheritedComponents(
			MAbstractComponent component);

	/**
	 * Returns the set of libraries inherited by a given library.
	 * 
	 * @param library the library.
	 * @return the set of inherited components. If the component parameter is
	 * 		   null, it returns an empty list.
	 */
	public Set<MAbstractServiceLibrary> getInheritedServiceLibraries(
			MAbstractServiceLibrary library);

	/**
	 * Returns the set of client ports defined in the internal membrane of a
	 * component. If the component does not define any client ports in its
	 * internal structure, the method will return an empty set.
	 * 
	 * @param component the component.
	 * @return the set of internal client ports.
	 */
	public Set<MClientPort> getInternalClientPorts(MComponent component);

	/**
	 * Returns the set of server ports defined in the internal membrane of a
	 * component. If the component does not define any server ports in its
	 * internal membrane, the method will return an empty set.
	 * 
	 * @param component the component.
	 * @return the set of internal server ports.
	 */
	public Set<MServerPort> getInternalServerPorts(MComponent component);

	/**
	 * Returns the complete set of server ports defined by a component. If the
	 * component is abstract, the set will include only the ports of the
	 * external membrane. On the other hand, if the component is a regular one,
	 * the set will include the ports defined on both the internal and the
	 * external membranes. The set will, in any case, include the ports defined
	 * by the components from which the component inherits. If the component
	 * does not define any server ports in its membranes, the method will
	 * return an empty set.
	 * 
	 * @param component the component.
	 * @return the complete set of server ports.
	 */
	public Set<MServerPort> getAllServerPorts(MAbstractComponent component);

	/**
	 * Returns the complete set of client ports defined by a component. If the
	 * component is abstract, the set will include only the ports of the
	 * external membrane. On the other hand, if the component is a regular one,
	 * the set will include the ports defined on both the internal and the
	 * external membranes. The set will, in any case, include the ports defined
	 * by the components from which the component inherits. If the component
	 * does not define any client ports in its membranes, the method will
	 * return an empty set.
	 * 
	 * @param component the component.
	 * @return the complete set of client ports.
	 */
	public Set<MClientPort> getAllClientPorts(MAbstractComponent component);

	/**
	 * Returns the set of external server ports defined by a component. The set
	 * will include the ports defined by the components from which the
	 * component inherits. If the component does not define any external server
	 * port, the method will return an empty set.
	 * 
	 * @param component the component.
	 * @return the set of external server ports.
	 */
	public Set<MServerPort> getAllExternalServerPorts(
			MAbstractComponent component);

	/**
	 * Returns the set of external ports defined by a component. The set
	 * will include the ports defined by the components from which the
	 * component inherits. If the component does not define any external
	 * port, the method will return an empty set.
	 * 
	 * @param component the component.
	 * @return the set of external ports.
	 */
	public Set<MPort> getAllExternalPorts(MAbstractComponent component);

	/**
	 * Returns the set of external client ports defined by a component. The set
	 * will include the ports defined by the components from which the
	 * component inherits. If the component does not define any external client
	 * port, the method will return an empty set.
	 * 
	 * @param component the component.
	 * @return the set of external client ports.
	 */
	public Set<MClientPort> getAllExternalClientPorts(
			MAbstractComponent component);

	/**
	 * Returns the MCAD model that is the root of a given deployment
	 * alternative.
	 * 
	 * @param alternative the alternative.
	 * @return the root of the deployment model.
	 */
	public MMCADeployment getDeploymentRoot(MDeploymentAlternative alternative);

	/**
	 * Returns the MCAD model that is the root of the deployment alternative
	 * where a component instance is deployed.
	 *  
	 * @param alternative the alternative.
	 * @return the root of the deployment model where the component instance
	 * is deployed.
	 */
	public MMCADeployment getDeploymentRoot(MComponentInstance instance);

	/**
	 * Returns the full set of component types defined by a given
	 * implementation-oriented domain. The set includes the types defined
	 * by the given domain plus the ones defined by the domains from which
	 * it inherits.
	 * 
	 * @param domain the implementation-oriented domain.
	 * @return the set of component types.
	 */
	public Set<MComponentType> getAllComponentTypes(MIODomain domain);

	/**
	 * Returns the full set of exchange models defined by a given
	 * implementation-oriented domain. The set includes the models defined
	 * by the given domain plus the ones defined by the domains from which
	 * it inherits.
	 * 
	 * @param domain the implementation-oriented domain.
	 * @return the set of exchange models.
	 */
	public Set<MExchangeModel> getAllExchangeModels(MIODomain domain);

	/**
	 * Returns the full set of connectors defined by a given
	 * implementation-oriented domain. The set includes the connectors defined
	 * by the given domain plus the ones defined by the domains from which
	 * it inherits.
	 * 
	 * @param domain the implementation-oriented domain.
	 * @return the set of connectors.
	 */
	public Set<MConnector> getAllConnectors(MIODomain domain);

	/**
	 * Returns the full set of connectors defined by a given
	 * application-oriented domain. The set includes the connectors defined
	 * by the given domain plus the ones defined by the domains from which
	 * it inherits.
	 * 
	 * @param domain the application-oriented domain.
	 * @return the set of connectors.
	 */
	public Set<MConnector> getAllConnectors(MAODomain domain);

	/**
	 * Returns the full set of port types defined by a given
	 * implementation-oriented domain. The set includes the types defined
	 * by the given domain plus the ones defined by the domains from which
	 * it inherits.
	 * 
	 * @param domain the implementation-oriented domain.
	 * @return the set of port types.
	 */
	public Set<MPortType> getAllPortTypes(MIODomain domain);

	/**
	 * Returns the full set of interface types defined by a given
	 * implementation-oriented domain. The set includes the types defined
	 * by the given domain plus the ones defined by the domains from which
	 * it inherits.
	 * 
	 * @param domain the implementation-oriented domain.
	 * @return the set of interface types.
	 */
	public Set<MInterfaceType> getAllInterfaceTypes(MIODomain domain);

	/**
	 * Returns the full set of interface types defined by a given
	 * application-oriented domain. The set includes the types defined
	 * by the given domain plus the ones defined by the domains from which
	 * it inherits.
	 * 
	 * @param domain the application-oriented domain.
	 * @return the set of interface types.
	 */
	public Set<MInterfaceType> getAllInterfaceTypes(MAODomain domain);

	/**
	 * Returns the full set of port types defined by a given
	 * application-oriented domain. The set includes the types defined
	 * by the given domain plus the ones defined by the domains from which
	 * it inherits.
	 * 
	 * @param domain the application-oriented domain.
	 * @return the set of port types.
	 */
	public Set<MPortType> getAllPortTypes(MAODomain domain);

	/**
	 * Returns the full set of component types defined by a given
	 * application-oriented domain. The set includes the types defined
	 * by the given domain plus the ones defined by the domains from which
	 * it inherits.
	 * 
	 * @param domain the application-oriented domain.
	 * @return the set of component types.
	 */
	public Set<MComponentType> getAllComponentTypes(MAODomain domain);

	/**
	 * Returns the MCAD model that is the root of the deployment alternative
	 * where a connection is established.
	 *  
	 * @param alternative the alternative.
	 * @return the root of the deployment model where the connection
	 * is established.
	 */
	public MMCADeployment getDeploymentRoot(MConnection connection);

	/**
	 * Returns the set of all attributes defined by a component type. The set
	 * includes the attributes defined by the type itself plus the ones defined
	 * by the types from which it inherits.
	 * 
	 * @param componentType the component type.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAllAttributes(MComponentType componentType);

	/**
	 * Returns the set of all the independent-role attributes, together with
	 * the server-role ones, defined by a port type. The set includes the
	 * attributes defined by the type itself plus the ones defined by the
	 * types from which it inherits.
	 * 
	 * @param portType the port type.
	 * @return the complete set of attributes.
	 */
	public Set<MParameter> getAllServerPortAttributes(MPortType portType);

	/**
	 * Returns the set of all the attributes of a server port.
	 * 
	 * @param port the server port.
	 * @return the complete set of attributes.
	 */
	public Set<MParameter> getAllAttributes(MServerPort port);

	/**
	 * Returns the set of independent-role attributes, together with
	 * the client-role ones, defined by a port type.
	 * 
	 * @param portType the port type.
	 * @return the complete set of attributes.
	 */
	public Set<MParameter> getClientPortAttributes(MPortType portType);

	/**
	 * Returns the set of all the independent-role attributes, together with
	 * the client-role ones, defined by a port type. The set includes the
	 * attributes defined by the type itself plus the ones defined by the
	 * types from which it inherits.
	 * 
	 * @param portType the port type.
	 * @return the complete set of attributes.
	 */
	public Set<MParameter> getAllClientPortAttributes(MPortType portType);

	/**
	 * Returns the set of all the attributes of a client port.
	 * 
	 * @param port the client port.
	 * @return the complete set of attributes.
	 */
	public Set<MParameter> getAllAttributes(MClientPort port);

	/**
	 * Returns the set of independent-role attributes, together with
	 * the server-role ones, defined by a port type.
	 * 
	 * @param portType the port type.
	 * @return the complete set of attributes.
	 */
	public Set<MParameter> getServerPortAttributes(MPortType portType);

	/**
	 * Returns the set of attributes defined by a connector.
	 * 
	 * @param connector the connector.
	 * @return the set of attributes.
	 */
	public Set<MParameter> getAttributes(MConnector connector);

	/**
	 * Returns the set of all attributes defined by a connector. This set
	 * includes the attributes defined by the connector plus the ones
	 * defined by the connectors from which it inherits.
	 * 
	 * @param connector the connector.
	 * @return the complete set of attributes.
	 */
	public Set<MParameter> getAllAttributes(MConnector connector);

	/**
	 * Returns the set of leaf deployment alternatives that hung 
	 * from a particular alternative.
	 * 
	 * @param alternative the alternative.
	 * @return the set of leaf deployment alternatives that can be reached
	 * from the alternative.
	 */
	public Set<MDeploymentAlternative> getLeafDeploymentAlternatives(
			MDeploymentAlternative alternative);

	/**
	 * Returns the complete set of leaf deployment alternatives of a deployment
	 * model.
	 * 
	 * @param deployment the deployment model.
	 * @return the set of leaf deployment alternatives.
	 */
	public Set<MDeploymentAlternative> getLeafDeploymentAlternatives(
			MMCADeployment deployment);

	/**
	 * Obtains the set of component instances from an alternative.
	 * This set includes the instances of the given alternative plus the ones
	 * included by its parent alternatives up to the root of the deployment
	 * model.
	 * 
	 * @param alternative the alternative.
	 * @return the set of component instances.
	 */
	public Set<MComponentInstance> getAllComponentInstances(
			MDeploymentAlternative alternative);

	/**
	 * Returns the mappings between the service libraries deployed for a given
	 * alternative and their corresponding library instances.
	 * 
	 * @param alternative the deployment alternative.
	 * @return the mapping between the libraries and their instances.
	 */
	public Map<MServiceLibrary, MServiceLibraryInstance> getMapAllServiceLibraryInstances(
			MDeploymentAlternative alternative);

	/**
	 * Obtains the set of service library instances from an alternative.
	 * This set includes the instances of the given alternative plus the ones
	 * included by its parent alternatives up to the root of the deployment
	 * model.
	 * 
	 * @param alternative the alternative.
	 * @return the set of service library instances.
	 */
	public Set<MServiceLibraryInstance> getAllServiceLibraryInstances(
			MDeploymentAlternative alternative);

	/**
	 * Returns the set of interfaces extended by a given interface.
	 * 
	 * @param iface the interface.
	 * @return the set of extended interface.
	 */
	public Set<MInterface> getExtendedInterfaces(MInterface iface);

	/**
	 * Returns the set of Service Access Interfaces (SAIs) extended
	 * by a given SAI.
	 * 
	 * @param sai the SAI.
	 * @return the set of extended SAIs.
	 */
	public Set<MSAI> getAllExtendedSAIs(MSAI sai);

	/**
	 * Returns the set of interface types inherited by a given interface
	 * type.
	 * 
	 * @param itype the interface type.
	 * @return the set of inherited interface types.
	 */
	public Set<MInterfaceType> getInheritedInterfaceTypes(MInterfaceType itype);

	/**
	 * Returns the set of domains inherited by a given implementation-oriented
	 * domain.
	 * 
	 * @param domain the implementation-oriented domain.
	 * @return the set of inherited domains.
	 */
	public Set<MIODomain> getInheritedDomains(MIODomain domain);

	/**
	 * Returns the set of domains inherited by a given application-oriented
	 * domain.
	 * 
	 * @param domain the application-oriented domain.
	 * @return the set of inherited domains.
	 */
	public Set<MAODomain> getInheritedDomains(MAODomain domain);

	/**
	 * Returns the set of types inherited by a given port type.
	 * 
	 * @param portType the port type.
	 * @return the set of inherited port types.
	 */
	public Set<MPortType> getInheritedPortTypes(MPortType portType);

	/**
	 * Returns the set of connectors inherited by a given connectors.
	 * 
	 * @param connector the connector.
	 * @return the set of inherited connectors.
	 */
	public Set<MConnector> getInheritedConnectors(MConnector connector);

	/**
	 * Returns the set of types inherited by a given component type.
	 * 
	 * @param componentType the component type.
	 * @return the set of inherited port types.
	 */
	public Set<MComponentType> getInheritedComponentTypes(
			MComponentType componentType);

	/**
	 * Returns the set of models inherited by a given exchange model.
	 * 
	 * @param em the exchange model.
	 * @return the set of inherited exchange models.
	 */
	public Set<MExchangeModel> getInheritedExchangeModels(MExchangeModel em);

	/**
	 * Checks if the intersection between two implementation-oriented supported
	 * platforms is zero.
	 * 
	 * @param iodsp1 the first supported platform.
	 * @param iodsp2 the second supported platform.
	 * @return <code>true</code> if the intersection between the supported
	 * platforms is zero; <code>false</code> otherwise.
	 */
	public boolean platformIntersection(MIODomainSupportedPlatform iodsp1,
			MIODomainSupportedPlatform iodsp2);

	/**
	 * Checks if an implementation-oriented supported platform matches with a 
	 * particular platform.
	 * 
	 * @param supportedPlatform the supported platform to check.
	 * @param platform the platform.
	 * @return <code>true</code> if the supported platform matches the
	 * platform; <code>false</code> otherwise.
	 */
	public boolean matchesPlatform(
			MIODomainSupportedPlatform supportedPlatform, MPlatform platform);

	/**
	 * Checks if an implementation-oriented domain supports a given platform.
	 * 
	 * @param iod the implementation-oriented domain.
	 * @param platform the platform.
	 * @return <code>true</code> if the domain supports the platform;
	 * <code>false</code> otherwise.
	 */
	public boolean supportsPlatform(MIODomain iod, MPlatform platform);

	/**
	 * Returns the supported platform of an implementation-oriented domain that
	 * matches a particular platform.
	 * 
	 * @param iod the implementation-oriented domain.
	 * @param platform the platform.
	 * @return the supported platform that matches the platform or
	 * <code>null</code> if there is none.
	 */
	public MIODomainSupportedPlatform getMatchingPlatform(MIODomain iod,
			MPlatform platform);

	/**
	 * Checks if the intersection between two service library supported
	 * platforms is zero.
	 * 
	 * @param slsp1 the first supported platform.
	 * @param slsp2 the second supported platform.
	 * @return <code>true</code> if the intersection between the supported
	 * platforms is zero; <code>false</code> otherwise.
	 */
	public boolean platformIntersection(MServiceLibrarySupportedPlatform slsp1,
			MServiceLibrarySupportedPlatform slsp2);

	/**
	 * Checks if a service library supported platform matches with a 
	 * particular platform.
	 * 
	 * @param supportedPlatform the supported platform to check.
	 * @param platform the platform.
	 * @return <code>true</code> if the supported platform matches the
	 * platform; <code>false</code> otherwise.
	 */
	public boolean matchesPlatform(
			MServiceLibrarySupportedPlatform supportedPlatform,
			MPlatform platform);

	/**
	 * Checks if a service library supports a given platform.
	 * 
	 * @param slib the service library.
	 * @param platform the platform.
	 * @return <code>true</code> if the domain supports the platform;
	 * <code>false</code> otherwise.
	 */
	public boolean supportsPlatform(MServiceLibrary slib, MPlatform platform);

	/**
	 * Returns the supported platform of service library that matches a
	 * particular platform.
	 * 
	 * @param slib the service library.
	 * @param platform the platform.
	 * @return the supported platform that matches the platform or
	 * <code>null</code> if there is none.
	 */
	public MServiceLibrarySupportedPlatform getMatchingPlatform(
			MServiceLibrary slib, MPlatform platform);

	/**
	 * Checks if the intersection between two component supported
	 * platforms is zero.
	 * 
	 * @param cmpsp1 the first supported platform.
	 * @param cmpsp2 the second supported platform.
	 * @return <code>true</code> if the intersection between the supported
	 * platforms is zero; <code>false</code> otherwise.
	 */
	public boolean platformIntersection(MComponentSupportedPlatform cmpsp1,
			MComponentSupportedPlatform cmpsp2);

	/**
	 * Checks if a component supported platform matches with a particular
	 * platform.
	 * 
	 * @param supportedPlatform the supported platform to check.
	 * @param platform the platform.
	 * @return <code>true</code> if the supported platform matches the
	 * platform; <code>false</code> otherwise.
	 */
	public boolean matchesPlatform(
			MComponentSupportedPlatform supportedPlatform, MPlatform platform);

	/**
	 * Checks if a component supported platform matches to another
	 * supported platform.
	 * 
	 * @param csp the supported platform to check.
	 * @param platform the platform.
	 * @return <code>true</code> if the supported platform matches the
	 * platform; <code>false</code> otherwise.
	 */
	public boolean matchesPlatform(MComponentSupportedPlatform csp,
			MComponentSupportedPlatform csplt);

	/**
	 * Checks if a component supports a given component supported platform.
	 * 
	 * @param cmp the component.
	 * @param csp the component supported platform.
	 * @return <code>true</code> if the domain supports the platform;
	 * <code>false</code> otherwise.
	 */
	public boolean supportsPlatform(MComponent cmp,
			MComponentSupportedPlatform csp);

	/**
	 * Checks if a component supports a given platform.
	 * 
	 * @param slib the service library.
	 * @param platform the platform.
	 * @return <code>true</code> if the domain supports the platform;
	 * <code>false</code> otherwise.
	 */
	public boolean supportsPlatform(MComponent cmp, MPlatform platform);

	/**
	 * Returns the supported platform of a component that matches
	 * a particular platform.
	 * 
	 * @param cmp the component.
	 * @param platform the platform.
	 * @return the supported platform that matches the platform or
	 * <code>null</code> if there is none.
	 */
	public MComponentSupportedPlatform getMatchingPlatform(MComponent cmp,
			MPlatform platform);

	/**
	 * Returns the supported platform of a component that matches
	 * a particular component supported platform.
	 * 
	 * @param cmp the component.
	 * @param csplt the component supported platform.
	 * @return the supported platform that matches the platform or
	 * <code>null</code> if there is none.
	 */
	public MComponentSupportedPlatform getMatchingPlatform(MComponent cmp,
			MComponentSupportedPlatform csplt);

	/**
	 * This function returns all the SAIs provided by a service library.
	 * This list includes the SAIs provided by the very library plus the ones
	 * provided by the libraries from which it inherits, plus the SAIs provided
	 * by the libraries it extends plus the interfaces they all extend.
	 * 
	 * @param aslib The software package.
	 * @return The set of provided SAIs.
	 */
	public Set<MSAI> getAllProvidedSAIs(MAbstractServiceLibrary aslib);

	/**
	 * Returns the set of Service Access Interfaces (SAIs) required by a
	 * given SAI. This set includes the ones required by the interface itself
	 * plus the ones required by the interfaces it extends.
	 * 
	 * @param sai the SAI.
	 * @return the set of required SAIs.
	 */
	public Set<MSAI> getAllRequiredSAIs(MSAI sai);
	
	/**
	 * Returns <code>true</code> if the port passed as parameter belongs to the
	 * given component and if the port is a relay port, i.e. if the
	 * component defines a short circuit connection for the port.
	 * 
	 * @param component the component.
	 * @param port the port to check.
	 * @return <code>true</code> if the port is a relay port, 
	 * <code>false</code> otherwise.
	 */
	public boolean isRelayPort(MComponent component, MClientPort port);

	/**
	 * Returns a platform object constructed out of the fields of the
	 * component supported platform passed as a parameter.
	 * 
	 * @param csp the component supported platform.
	 * @return the equivalent platform object.
	 */
	public MPlatform toPlatform(MComponentSupportedPlatform csp);

	/**
	 * Returns the set of enumerated parameter definitions defined within
	 * a given component supported platform.
	 * 
	 * @param csp the component supported platform.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumAttributeDefinitions(
			MComponentSupportedPlatform csp);

	/**
	 * Returns complete the set of enumerated attribute definitions defined
	 * within a given abstract component plus the ones defined by the
	 * components from which it inherits.
	 * 
	 * @param acmp the abstract component.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getAllEnumAttributeDefinitions(
			MAbstractComponent acmp);
	
	/**
	 * Returns the set of enumerated attribute definitions defined within
	 * a given abstract component.
	 * 
	 * @param acmp the component.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumAttributeDefinitions(
			MAbstractComponent acmp);
	
	/**
	 * Returns an SAI object from its URI and version. If no SAI
	 * can be found, the method will return <code>null</code>.
	 * 
	 * @param uri the URI of the SAI.
	 * @param version the version of the SAI.
	 * @return the SAI object or <code>null</code> if no SAI could
	 *         be found.
	 */
	public MSAI getSAI(String uri, String version);

	/**
	 * Returns an component object from its URI and version. If no component
	 * can be found, the method will return <code>null</code>.
	 * 
	 * @param uri the URI of the component.
	 * @param version the version of the component.
	 * @return the component object or <code>null</code> if no component could
	 *         be found.
	 */
	public MComponent getComponent(String uri, String version);

	/**
	 * Returns an MCLEV Package from its URI. If no package
	 * can be found, the method will return <code>null</code>.
	 * 
	 * @param uri the URI of the package.
	 * @return the package or <code>null</code> if no package could
	 *         be found.
	 */
	public MMCLEVPackage getMCLEVPackage(String uri);
	
	/**
	 * Returns an interface object from its URI and version. If no interface
	 * can be found, the method will return <code>null</code>.
	 * 
	 * @param uri the URI of the interface.
	 * @param version the version of the interface.
	 * @return the interface object or <code>null</code> if no interface could
	 *         be found.
	 */
	public MInterface getInterface(String uri, String version);

}
