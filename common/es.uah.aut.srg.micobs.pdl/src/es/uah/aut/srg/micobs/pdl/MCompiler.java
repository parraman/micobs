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

import es.uah.aut.srg.micobs.common.MParameter;

/**
 * A representation of a compiler.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MCompiler#getFrontends <em>Frontends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MCompiler#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMCompiler()
 * @model
 * @generated
 */
public interface MCompiler extends MPDLPackageElement {
	/**
	 * Returns the list of frontends defined by the compiler.
	 * @return the value of the '<em>Frontends</em>' containment reference list.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMCompiler_Frontends()
	 * @model containment="true"
	 * @generated
	 */
	EList<MCompilerFrontend> getFrontends();

	/**
	 * Returns the list of compilers that this compiler extends. When a compiler
	 * extends another, this means that it supports all the frontends of the
	 * latter.
	 * @return the list of compilers that this compiler extends.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMCompiler_Extends()
	 * @model
	 * @generated
	 */
	EList<MCompiler> getExtends();

	/**
	 * Returns the list of parameters defined by the compiler independently
	 * of the frontends.
	 * @return the list of parameters defined by the compiler.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMCompiler_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParameters();

}