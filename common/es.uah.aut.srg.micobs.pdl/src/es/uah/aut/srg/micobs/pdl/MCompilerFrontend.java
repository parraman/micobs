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
 * A representation of a compiler frontend. Each one of these elements represent
 * a compiling capability to translate a single programming language to a set
 * of architectures.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MCompilerFrontend#getLanguage <em>Language</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MCompilerFrontend#getArchitectures <em>Architectures</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMCompilerFrontend()
 * @model
 * @generated
 */
public interface MCompilerFrontend extends MCommonReferenceableObj {
	/**
	 * Returns the language of the frontend.
	 * @return the language of the frontend.
	 * @see #setLanguage(MLanguage)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMCompilerFrontend_Language()
	 * @model required="true"
	 * @generated
	 */
	MLanguage getLanguage();

	/**
	 * Sets the language of the frontend.
	 * @param value the new language of the frontend.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(MLanguage value);

	/**
	 * Returns the list of architectures that the frontend supports.
	 * @return the list of architectures that the frontend supports.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMCompilerFrontend_Architectures()
	 * @model required="true"
	 * @generated
	 */
	EList<MArchitecture> getArchitectures();

	/**
	 * Returns the list of parameters defined by the compiler for the
	 * specific frontend.
	 * @return the list of parameters defined for the frontend.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMCompilerFrontend_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParameters();

}
