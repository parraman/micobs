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
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;

/**
 * A representation of a provision by a service library of an interface.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI#getSai <em>SAI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibraryProvidedSAI#getAttributeValueAssignments <em>AttributeValueAssignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMServiceLibraryProvidedSAI()
 * @model
 * @generated
 */
public interface MServiceLibraryProvidedSAI extends EObject {
	/**
	 * Returns the service access interface (SAI) that is being provided.
	 * @return the SAI that is being provided.
	 * @see #setSai(MSAI)
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMServiceLibraryProvidedSAI_Sai()
	 * @model required="true"
	 * @generated
	 */
	MSAI getSai();

	/**
	 * Sets the SAI that is being provided.
	 * @param value the new SAI that is being provided.
	 * @see #getSai()
	 * @generated
	 */
	void setSai(MSAI value);

	/**
	 * Returns the list of value assignments to the parameters defined by the
	 * interface that is being provided.
	 * @return the list of value assignments to the parameters defined by the
	 * interface that is being provided.
	 * @see es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage#getMServiceLibraryProvidedSAI_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MSLibProvidedSAIAVA> getAttributeValueAssignments();

}