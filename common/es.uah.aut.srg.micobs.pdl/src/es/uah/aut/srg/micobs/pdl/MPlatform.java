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
package es.uah.aut.srg.micobs.pdl;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MParameter;

/**
 * A representation of a platform.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MPlatform#getOsapi <em>Osapi</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MPlatform#getOs <em>Os</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MPlatform#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MPlatform#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MPlatform#getMicroprocessor <em>Microprocessor</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MPlatform#getBoard <em>Board</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MPlatform#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMPlatform()
 * @model
 * @generated
 */
public interface MPlatform extends MPDLPackageElement {
	/**
	 * Returns the OSAPI of the platform.
	 * @return the OSAPI of the platform.
	 * @see #setOsapi(MOperatingSystemAPI)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMPlatform_Osapi()
	 * @model required="true"
	 * @generated
	 */
	MOperatingSystemAPI getOsapi();

	/**
	 * Sets the OSAPI of the platform.
	 * @param value the new OSAPI of the platform.
	 * @see #getOsapi()
	 * @generated
	 */
	void setOsapi(MOperatingSystemAPI value);

	/**
	 * Returns the operating system of the platform.
	 * @return the operating system of the platform.
	 * @see #setOs(MOperatingSystem)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMPlatform_Os()
	 * @model required="true"
	 * @generated
	 */
	MOperatingSystem getOs();

	/**
	 * Sets the operating system of the platform.
	 * @param value the new operating system of the platform.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(MOperatingSystem value);

	/**
	 * Returns the architecture of the platform.
	 * @return the architecture of the platform.
	 * @see #setArchitecture(MArchitecture)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMPlatform_Architecture()
	 * @model required="true"
	 * @generated
	 */
	MArchitecture getArchitecture();

	/**
	 * Sets the architecture of the platform.
	 * @param value the new architecture of the platform.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(MArchitecture value);

	/**
	 * Returns the compiler of the platform.
	 * @return the compiler of the platform.
	 * @see #setCompiler(MCompiler)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMPlatform_Compiler()
	 * @model required="true"
	 * @generated
	 */
	MCompiler getCompiler();

	/**
	 * Sets the compiler of the platform.
	 * @param value the new compiler of the platform.
	 * @see #getCompiler()
	 * @generated
	 */
	void setCompiler(MCompiler value);

	/**
	 * Returns the microprocessor of the platform.
	 * @return the microprocessor of the platform.
	 * @see #setMicroprocessor(MMicroprocessor)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMPlatform_Microprocessor()
	 * @model
	 * @generated
	 */
	MMicroprocessor getMicroprocessor();

	/**
	 * Sets the microprocessor of the platform.
	 * @param value the new microprocessor of the platform.
	 * @see #getMicroprocessor()
	 * @generated
	 */
	void setMicroprocessor(MMicroprocessor value);

	/**
	 * Returns the board of the platform.
	 * @return the board of the platform.
	 * @see #setBoard(MBoard)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMPlatform_Board()
	 * @model
	 * @generated
	 */
	MBoard getBoard();

	/**
	 * Sets the board of the platform.
	 * @param value the new board of the platform.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(MBoard value);

	/**
	 * Returns the list of configuration parameters of the platform.
	 * @return the list of configuration parameters of the platform.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMPlatform_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParameters();

}
