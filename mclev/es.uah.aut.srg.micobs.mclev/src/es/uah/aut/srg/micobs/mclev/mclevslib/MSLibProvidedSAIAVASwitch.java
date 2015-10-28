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
package es.uah.aut.srg.micobs.mclev.mclevslib;

import org.eclipse.emf.common.util.EList;

/**
 * A representation of a service library provided SAI attribute
 * value assignment that uses a supported platform switch to define the
 * value.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MSLibProvidedSAIAVASwitch#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMSLibProvidedSAIAVASwitch()
 * @model
 * @generated
 */
public interface MSLibProvidedSAIAVASwitch extends MSLibProvidedSAIAVA {
	/**
	 * Returns the list of value assignments depending on the different
	 * supported platforms.
	 * @return the list of value assignments.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMSLibProvidedSAIAVASwitch_Cases()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MSLibProvidedSAIAVASwitchCase> getCases();

}