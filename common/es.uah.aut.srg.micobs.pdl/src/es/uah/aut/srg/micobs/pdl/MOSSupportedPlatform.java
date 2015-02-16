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
package es.uah.aut.srg.micobs.pdl;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A representation of an operating system supported platform.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getMicroprocessor <em>Microprocessor</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getBoard <em>Board</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedPlatform()
 * @model
 * @generated
 */
public interface MOSSupportedPlatform extends MCommonReferenceableObj {
	/**
	 * Returns the architecture of the supported platform.
	 * @return the architecture of the supported platform.
	 * @see #setArchitecture(MArchitecture)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedPlatform_Architecture()
	 * @model required="true"
	 * @generated
	 */
	MArchitecture getArchitecture();

	/**
	 * Sets the architecture of the supported platform.
	 * @param value the new architecture of the supported platform.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(MArchitecture value);

	/**
	 * Returns the compiler of the supported platform.
	 * @return the compiler of the supported platform.
	 * @see #setCompiler(MCompiler)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedPlatform_Compiler()
	 * @model required="true"
	 * @generated
	 */
	MCompiler getCompiler();

	/**
	 * Sets the compiler of the supported platform.
	 * @param value the new compiler of the supported platform.
	 * @see #getCompiler()
	 * @generated
	 */
	void setCompiler(MCompiler value);

	/**
	 * Returns the microprocessor of the supported platform.
	 * @return the microprocessor of the supported platform.
	 * @see #setMicroprocessor(MMicroprocessor)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedPlatform_Microprocessor()
	 * @model
	 * @generated
	 */
	MMicroprocessor getMicroprocessor();

	/**
	 * Sets the microprocessor of the supported platform.
	 * @param value the new microprocessor of the supported platform.
	 * @see #getMicroprocessor()
	 * @generated
	 */
	void setMicroprocessor(MMicroprocessor value);

	/**
	 * Returns the board of the supported platform.
	 * @return the board of the supported platform.
	 * @see #setBoard(MBoard)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedPlatform_Board()
	 * @model
	 * @generated
	 */
	MBoard getBoard();

	/**
	 * Sets the board of the supported platform.
	 * @param value the new board of the supported platform.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(MBoard value);

	/**
	 * Returns the list of configuration parameters defined by the operating system
	 * that are specific for this platform.
	 * @return the list of configuration parameters.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedPlatform_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParameters();

	/**
	 * Returns the list of programming languages in which the operating system
	 * is implemented for this particular platform.
	 * @return the list of programming languages.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMOSSupportedPlatform_Languages()
	 * @model
	 * @generated
	 */
	EList<MLanguage> getLanguages();

}
