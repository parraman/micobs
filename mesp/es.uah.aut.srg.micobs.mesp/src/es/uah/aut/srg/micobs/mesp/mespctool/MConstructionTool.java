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
package es.uah.aut.srg.micobs.mesp.mespctool;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A representation of a construction tool.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespctool.MConstructionTool#getSupportedLanguages <em>Supported Languages</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage#getMConstructionTool()
 * @model
 * @generated
 */
public interface MConstructionTool extends MMESPCTOOLPackageElement {
	/**
	 * Returns the list of construction tools extended by this tool.
	 * @return the list of construction tools extended by this tool.
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage#getMConstructionTool_Extends()
	 * @model
	 * @generated
	 */
	EList<MConstructionTool> getExtends();

	/**
	 * Returns the list of programming languages supported by the construction
	 * tool.
	 * @return the list of programming languages supported by the construction
	 * tool.
	 * @see es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage#getMConstructionTool_SupportedLanguages()
	 * @model
	 * @generated
	 */
	EList<MLanguage> getSupportedLanguages();

}
