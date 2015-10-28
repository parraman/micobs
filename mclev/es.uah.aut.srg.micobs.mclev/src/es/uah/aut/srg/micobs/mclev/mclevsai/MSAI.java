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
package es.uah.aut.srg.micobs.mclev.mclevsai;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A representation of a Service Access Interface (SAI).
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getExtends <em>Extends</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getLanguage <em>Language</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevsai.MSAI#getRequiredOSAPI <em>Required OSAPI</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage#getMSAI()
 * @model
 * @generated
 */
public interface MSAI extends MMCLEVSAIPackageElement {
	/**
	 * Returns the list of SAIs extended by the interface.
	 * @return the list of SAIs extended by the interface.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage#getMSAI_Extends()
	 * @model
	 * @generated
	 */
	EList<MSAI> getExtends();

	/**
	 * Returns the programming language of the SAI.
	 * @return the programming language of the SAI.
	 * @see #setLanguage(MLanguage)
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage#getMSAI_Language()
	 * @model required="true"
	 * @generated
	 */
	MLanguage getLanguage();

	/**
	 * Sets the programming language of the SAI.
	 * @param value the new programming language of the SAI.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(MLanguage value);

	/**
	 * Returns the list of SAIs required by the interface.
	 * @return the list of SAIs required by the interface.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage#getMSAI_Requires()
	 * @model
	 * @generated
	 */
	EList<MSAI> getRequires();

	/**
	 * Returns the list of attributes defined by the SAI.
	 * @return the list of attributes defined by the SAI.
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage#getMSAI_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getAttributes();

	/**
	 * Returns the operating system API required by the SAI or 
	 * <code>null</code> if it does not require any OSAPI.
	 * @return the required OSAPI or <code>null</code> if no OSAPI
	 * is required.
	 * @see #setRequiredOSAPI(MOperatingSystemAPI)
	 * @see es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage#getMSAI_RequiredOSAPI()
	 * @model
	 * @generated
	 */
	MOperatingSystemAPI getRequiredOSAPI();

	/**
	 * Sets the operating system API required by the SAI.
	 * @param value the new operating system API required by the SAI.
	 * @see #getRequiredOSAPI()
	 * @generated
	 */
	void setRequiredOSAPI(MOperatingSystemAPI value);

}