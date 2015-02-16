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
package es.uah.aut.srg.micobs.pdl.util;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import es.uah.aut.srg.micobs.common.MEnumParameterDefinition;
import es.uah.aut.srg.micobs.common.MEnumParameterLiteral;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
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
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.util.IMICOBSUtil;

public interface IPDLUtil {

	/**
	 * Checks if the intersection between two operating system
	 * supported platforms is zero.
	 * 
	 * @param ossp1 first operating system supported platform.
	 * @param ossp2 second operating system supported platform.
	 * @return <code>true</code> if the intersection between the
	 * platforms is not zero; <code>false</code> otherwise.
	 */
	public boolean platformIntersection(MOSSupportedPlatform ossp1,
			MOSSupportedPlatform ossp2);

	/**
	 * Checks if an operating system supported platform matches the configuration
	 * of a given platform.
	 * 
	 * @param supportedPlatform the operating system supported platform.
	 * @param platform the platform
	 * @return <code>true</code> if the platforms do match; <code>false</code>
	 * otherwise.
	 */
	public boolean matchesPlatform(MOSSupportedPlatform supportedPlatform,
			MPlatform platform);

	/**
	 * Checks if an operating system supports a given platform. In order to do so,
	 * the method checks if one of the supported platforms of the operating
	 * system matches the platform using the method
	 * {@link #matchesPlatform(MOSSupportedPlatform, MPlatform)}.
	 * 
	 * @param os the operating system.
	 * @param platform the platform.
	 * @return <code>true</code> if the operating system supports the platform;
	 * <code>false</code> otherwise.
	 */
	public boolean supportsPlatform(MOperatingSystem os, MPlatform platform);

	/**
	 * Returns, if exists, the one and only supported platform of an operating
	 * system that matches a given platform.
	 * 
	 * @param os the operating system.
	 * @param platform the platform.
	 * @return the supported platform that matches the platform or
	 * <code>null</code> if no supported platform matches the platform.
	 */
	public MOSSupportedPlatform getMatchingPlatform(MOperatingSystem os,
			MPlatform platform);

	/**
	 * Returns all the parameters defined by an operating system. The
	 * returned set contains all the common parameters defined by the operating
	 * system itself plus the ones defined by the operating systems from
	 * which it inherits.
	 * 
	 * @param os the operating system.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getAllParameters(MOperatingSystem os);

	/**
	 * Returns all the parameters defined by an operating system applications
	 * programming interface. The returned set contains all the parameters defined
	 * by the OSAPI itself plus the ones defined by the interfaces from which
	 * it inherits.
	 * 
	 * @param osapi the OSAPI.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getAllParameters(MOperatingSystemAPI osapi);

	/**
	 * Returns the map between all the value assignments
	 * attached to a given OSAPI that is being supported by a given
	 * operating system.
	 * 
	 * @param os the operating system.
	 * @param osapi the OSAPI.
	 * @return the map between the parameters and their corresponding value
	 * assignments.
	 */
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(
			MOperatingSystem os, MOperatingSystemAPI osapi);

	/**
	 * Returns the map between all the value assignments
	 * attached to all the OSAPIs that are being supported by a given
	 * operating system.
	 * 
	 * @param os the operating system.
	 * @return the map between the parameters and their corresponding value
	 * assignments.
	 */
	public Map<MParameter, MParameterValueAssignment> getMapAllParameterValueAssignments(
			MOperatingSystem os);

	/**
	 * Returns the set with all the value assignments attached to a given 
	 * OSAPI that is being supported by a given operating system.
	 * 
	 * @param os the operating system.
	 * @param osapi the OSAPI.
	 * @return the set of parameter value assignments.
	 */
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(
			MOperatingSystem os, MOperatingSystemAPI osapi);

	/**
	 * Returns the set with all the value assignments attached to all the
	 * OSAPIs that are being supported by a given operating system.
	 * 
	 * @param os the operating system.
	 * @return the set of parameter value assignments.
	 */
	public Set<MParameterValueAssignment> getAllParameterValueAssignments(
			MOperatingSystem os);
	
	/**
	 * Returns all the parameters defined by an operating system. The
	 * returned set contains all the common parameters defined by the operating
	 * system itself plus the ones defined by the operating systems from
	 * which it inherits plus the ones defined by the supported platform that
	 * matches the given platform.
	 * 
	 * @param os the operating system.
	 * @param platform the platform.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getAllParameters(MOperatingSystem os,
			MPlatform platform);

	/**
	 * Returns the parameters defined by an operating system programming interface.
	 * 
	 * @param osapi the OSAPI.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getParameters(MOperatingSystemAPI osapi);

	/**
	 * Returns the parameters defined by a device.
	 * 
	 * @param device the device.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getParameters(MDevice device);

	/**
	 * Returns the parameters defined by an architecture.
	 * 
	 * @param arch the architecture.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getParameters(MArchitecture arch);

	/**
	 * Returns all the parameters defined by an architecture. The set includes
	 * the parameters defined by the architecture itself plus the ones defined
	 * by the architectures it extends.
	 * 
	 * @param arch the architecture.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getAllParameters(MArchitecture arch);

	/**
	 * Returns the parameters defined by a microprocessor.
	 * 
	 * @param microprocessor the microprocessor.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getParameters(MMicroprocessor microprocessor);

	/**
	 * Returns the parameters defined by a board.
	 * 
	 * @param board the board.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getParameters(MBoard board);

	/**
	 * Returns the parameters defined by a compiler frontend.
	 * 
	 * @param frontend the frontend.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getParameters(MCompilerFrontend frontend);

	/**
	 * Returns the parameters defined by a compiler independently of the
	 * frontend.
	 * 
	 * @param compiler the compiler.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getParameters(MCompiler compiler);

	/**
	 * Returns all the parameters defined by a compiler for a given
	 * architecture. This set includes the parameters defined by the
	 * compiler independently of the frontend plus the ones defined
	 * the frontends that support the given architecture plus the
	 * ones defined by the extended compilers.
	 * 
	 * @param compiler the compiler.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getAllParameters(MCompiler compiler,
			MArchitecture arch);

	/**
	 * Returns all the parameters defined by a compiler independently
	 * of the different frontends. This set includes the independent
	 * parameters defined by the compilers it extends.
	 * 
	 * @param compiler the compiler.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getAllParameters(MCompiler compiler);

	/**
	 * Returns the parameters defined by a platform.
	 * 
	 * @param platform the platform.
	 * @return the parameters defined by the platform.
	 */
	public Set<MParameter> getParameters(MPlatform platform);

	/**
	 * Returns the complete set of parameters defined by a platform.
	 * This set includes the parameters defined by the platform plus the
	 * ones defined by its components (OS, architecture, compiler,
	 * microprocessor and board).
	 * 
	 * @param platform the platform.
	 * @return the parameters defined by the platform.
	 */
	public Set<MParameter> getAllParameters(MPlatform platform);

	/**
	 * Returns the common parameters defined by an operating system.
	 * 
	 * @param os the operating system.
	 * @return the common parameters defined by the operating system.
	 */
	public Set<MParameter> getParameters(MOperatingSystem os);

	/**
	 * Returns the parameters of an operating system defined for a
	 * specific supported platform.
	 * 
	 * @param ossp the operating system supported platform.
	 * @return the set of configuration parameters.
	 */
	public Set<MParameter> getParameters(MOSSupportedPlatform ossp);

	/**
	 * Returns the set of enumerated parameter definitions defined by a platform.
	 * 
	 * @param platform the platform. 
	 * @return the set of enumerated parameter definitions defined by the platform.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MPlatform platform);

	/**
	 * Returns the set of enumerated parameter definitions defined by an operating
	 * system.
	 * 
	 * @param os the operating system. 
	 * @return the set of enumerated parameter definitions defined by the operating
	 * system.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MOperatingSystem os);

	/**
	 * Returns all the common enumerated parameter definitions defined by an
	 * operating system for a given platform plus the ones defined by the
	 * operating systems from which it inherits.
	 * 
	 * @param os the operating system. 
	 * @param platform the platform.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MOperatingSystem os, MPlatform platform);

	/**
	 * Returns all the common enumerated parameter definitions defined by an
	 * operating system plus the ones defined by the operating systems from
	 * which it inherits.
	 * 
	 * @param os the operating system. 
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MOperatingSystem os);

	/**
	 * Returns the set of enumerated parameter definitions defined by an operating
	 * system applications programming interface.
	 * 
	 * @param osapi the OSAPI
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MOperatingSystemAPI osapi);

	/**
	 * Returns the set of enumerated parameter definitions defined by a device.
	 * 
	 * @param device the device.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MDevice device);

	/**
	 * Returns all the enumerated parameter definitions defined by an
	 * operating system applications programming interface plus the ones
	 * defined by the interfaces from which it inherits.
	 * 
	 * @param osapi the OSAPI. 
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MOperatingSystemAPI osapi);

	/**
	 * Returns all the enumerated parameter definitions defined by an
	 * architecture.
	 * 
	 * @param arch the architecture. 
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MArchitecture arch);

	/**
	 * Returns the set of enumerated parameter definitions defined by a
	 * compiler.
	 * 
	 * @param compiler the compiler. 
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MCompiler compiler);

	/**
	 * Returns the set of enumerated parameter definitions defined by a
	 * compiler frontend.
	 * 
	 * @param frontend the compiler frontend. 
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MCompilerFrontend frontend);

	/**
	 * Returns all the enumerated parameter definitions defined by a
	 * compiler independently of the frontends. The set includes the list
	 * of definitions defined by compilers extended by the given
	 * compiler.
	 * 
	 * @param compiler the compiler frontend.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MCompiler compiler);

	/**
	 * Returns all the enumerated parameter definitions defined by a
	 * compiler for a given architecture. The set includes the list
	 * of definitions defined by compilers extended by the given
	 * compiler.
	 * 
	 * @param compiler the compiler frontend.
	 * @param arch the architecture.
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MCompiler compiler, MArchitecture arch);

	/**
	 * Returns all the enumerated parameter definitions defined by an
	 * architecture plus the ones defined by the architectures it
	 * extends.
	 * 
	 * @param arch the architecture. 
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getAllEnumParameterDefinitions(
			MArchitecture arch);

	/**
	 * Returns all the enumerated parameter definitions defined by an
	 * operating system supported platform.
	 * 
	 * @param ossp the operating system supported platform. 
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MOSSupportedPlatform ossp);

	/**
	 * Returns all the enumerated parameter definitions defined by a
	 * microprocessor.
	 * 
	 * @param mp the microprocessor. 
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MMicroprocessor mp);

	/**
	 * Returns all the enumerated parameter definitions defined by a
	 * board.
	 * 
	 * @param board the board. 
	 * @return the set of enumerated parameter definitions.
	 */
	public Set<MEnumParameterDefinition> getEnumParameterDefinitions(
			MBoard board);

	/**
	 * Returns the set of interfaces from which an OSAPI inherits.
	 * 
	 * @param osapi the operating system applications programming interface.
	 * @return the set of inherited interfaces.
	 */
	public Set<MOperatingSystemAPI> getInheritedOSAPIs(MOperatingSystemAPI osapi);

	/**
	 * Returns the set of operating systems from which an operating system
	 * inherits.
	 * 
	 * @param osapi the operating system.
	 * @return the set of inherited interfaces.
	 */
	public Set<MOperatingSystem> getInheritedOperatingSystems(
			MOperatingSystem os);

	/**
	 * Returns the set of compilers extended by a given compiler.
	 * 
	 * @param compiler the compiler.
	 * @return the set of extended compilers.
	 */
	public Set<MCompiler> getExtendedCompilers(MCompiler compiler);

	/**
	 * Returns the set of architectures extended by a given architecture.
	 * 
	 * @param architectures the architectures.
	 * @return the set of extended architectures.
	 */
	public Set<MArchitecture> getExtendedArchitectures(
			MArchitecture architecture);

	/**
	 * Checks if any of the frontends of a compiler supports a given
	 * programming language for a given architecture.
	 * @param compiler the compiler.
	 * @param lang the programming language.
	 * @param architecture the architecture.
	 * @return <code>true</code> if the compiler supports the programming
	 * language for the architecture; <code>false</code> otherwise.
	 */
	public boolean supportsLanguageForArchitecture(MCompiler compiler,
			MLanguage lang, MArchitecture architecture);

	/**
	 * Returns the complete set of OSAPIs supported by a given operating system.
	 * This set includes the OSAPIs supported by the OS itself plus the ones
	 * supported by the operating systems from which it inherits.
	 * 
	 * @param os the operating system.
	 * @return the set of OSAPIs supported by the operating system.
	 */
	public Set<MOperatingSystemAPI> getAllSupportedOSAPIs(MOperatingSystem os);

	/**
	 * Returns all the devices supported by a given board. The returned set
	 * contains the references to the actual devices that are supported.
	 * 
	 * @param board the board.
	 * @return the set of supported devices.
	 */
	public Set<MDevice> getBoardSupportedDevices(MBoard board);

	/**
	 * Returns the <code>MBoardSupportedDevice</code> structure corresponding
	 * to the support declaration of a board of a given device. If the board
	 * does not support the device, the method returns <code>null</code>.
	 * 
	 * @param board the board.
	 * @param device the requested device.
	 * @return the <code>MBoardSupportedDevice</code> structure corresponding
	 * to the supported device or <code>null</code> if the device is not
	 * supported by the board.
	 */
	public MBoardSupportedDevice getBoardSupportedDevice(MBoard board,
			MDevice device);

	/**
	 * Returns the literal value assigned to an enumerated parameter for a
	 * given platform.
	 * @param assignment the assignment expression to an enumerated parameter.
	 * @param assignments the collection of value assignments to the parameters
	 *                    used in the definition of the value assignment.
	 * @param platform the platform.
	 * @return the literal value assigned to the parameter.
	 * @see IMICOBSUtil#parseEnumParameterValueAssignment(MParameterValueAssignment, Collection)
	 */
	public MEnumParameterLiteral parseEnumExpression(
			MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException;

	/**
	 * Returns the literal value assigned to a boolean parameter for a
	 * given platform.
	 * @param expression the assignment expression to a boolean parameter.
	 * @param assignments the collection of value assignments to the parameters
	 *                    used in the definition of the value assignment.
	 * @param platform the platform.
	 * @return the value assigned to the parameter.
	 * @see IMICOBSUtil#parseBooleanParameterValueAssignment(MParameterValueAssignment, Collection)
	 */
	public Boolean parseBooleanExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException;
	
	/**
	 * Returns the literal value assigned to a string parameter for a
	 * given platform.
	 * @param expression the assignment expression to a string parameter.
	 * @param assignments the collection of value assignments to the parameters
	 *                    used in the definition of the value assignment.
	 * @param platform the platform.
	 * @return the value assigned to the parameter.
	 * @see IMICOBSUtil#parseBooleanParameterValueAssignment(MParameterValueAssignment, Collection)
	 */
	public String parseStringExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException;
	
	/**
	 * Returns the literal value assigned to an integer parameter for a
	 * given platform.
	 * @param expression the assignment expression to an integer parameter.
	 * @param assignments the collection of value assignments to the parameters
	 *                    used in the definition of the value assignment.
	 * @param platform the platform.
	 * @return the value assigned to the parameter.
	 * @see IMICOBSUtil#parseBooleanParameterValueAssignment(MParameterValueAssignment, Collection)
	 */
	public Long parseIntegerExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException;
	
	/**
	 * Returns the literal value assigned to a real parameter for a
	 * given platform.
	 * @param expression the assignment expression to a real parameter.
	 * @param assignments the collection of value assignments to the parameters
	 *                    used in the definition of the value assignment.
	 * @param platform the platform.
	 * @return the value assigned to the parameter.
	 * @see IMICOBSUtil#parseBooleanParameterValueAssignment(MParameterValueAssignment, Collection)
	 */
	public Float parseRealExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments,
			MPlatform platform) throws IllegalArgumentException;
	
	/**
	 * Returns a platform object constructed out of an OSAPI, an OS, and
	 * the fields of the operating system supported platform passed as
	 * parameters.
	 * 
	 * @param osapi the operating system API.
	 * @param os the operating system.
	 * @param ossp the operating system supported platform.
	 * @return the equivalent platform object.
	 */
	MPlatform toPlatform(MOperatingSystemAPI osapi, MOperatingSystem os,
			MOSSupportedPlatform ossp);

	/**
	 * Returns the range of a supported platform-dependent global integer
	 * or real parameter.
	 * @param parameter the parameter.
	 * @param platform the platform on which the package is to be deployed.
	 * @return the range or <code>null</code> if no range has been defined.
	 */
	MParameterRange getRange(MParameter parameter, MPlatform platform)
			throws IllegalArgumentException;

	/**
	 * Returns the default parameter value assignment expression of a supported
	 * platform-dependent global parameter.
	 * @param parameter the parameter.
	 * @param platform the platform on which the package is to be deployed.
	 * @return the default parameter value assignment expression.
	 */
	MParameterValueExpression getDefaultValue(MParameter parameter,
			MPlatform platform);

	/**
	 * Returns the value assigned to a parameter within a given value
	 * assignment for a given platform.
	 * @param assignment the parameter value assignment object.
	 * @param platform the platform on which the package is to be deployed.
	 * @return the parameter value expression.
	 */
	MParameterValueExpression getParameterValue(MParameterValueAssignment assignment,
			MPlatform platform);

}