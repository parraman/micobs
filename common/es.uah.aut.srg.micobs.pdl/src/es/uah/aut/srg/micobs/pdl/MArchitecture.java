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
 * A representation of an architecture.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.MArchitecture#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMArchitecture()
 * @model
 * @generated
 */
public interface MArchitecture extends MPDLPackageElement {
	/**
	 * Returns the list of extended architectures. The architecture
	 * is compatible with all the architectured listed.
	 * @return the list of extended architectures.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMArchitecture_Extends()
	 * @model
	 * @generated
	 */
	EList<MArchitecture> getExtends();

	/**
	 * Returns the list of parameters defined by the architecture.
	 * @return the list of parameters.
	 * @see es.uah.aut.srg.micobs.pdl.pdlPackage#getMArchitecture_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParameters();

}
