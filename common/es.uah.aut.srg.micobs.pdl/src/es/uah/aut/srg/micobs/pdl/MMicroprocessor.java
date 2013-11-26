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
 * A representation of a microprocessor.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MMicroprocessor#getArchitecture <em>Architecture</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMMicroprocessor()
 * @model
 * @generated
 */
public interface MMicroprocessor extends MPDLPackageElement {
	/**
	 * Returns the architecture implemented by the microprocessor.
	 * @return the architecture implemented by the microprocessor.
	 * @see #setArchitecture(MArchitecture)
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMMicroprocessor_Architecture()
	 * @model required="true"
	 * @generated
	 */
	MArchitecture getArchitecture();

	/**
	 * Sets the architecture implemented by the microprocessor.
	 * @param value the new architecture implemented by the microprocessor.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(MArchitecture value);

	/**
	 * Returns the list of parameters defined by the microprocessor.
	 * @return the list of parameters defined by the microprocessor.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMMicroprocessor_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParameters();

}
