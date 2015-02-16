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
package es.uah.aut.srg.micobs.mesp.mespcommon;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MParameter;

/**
 * A representation of an instantiable resource.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespcommon.MInstantiableResource#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage#getMInstantiableResource()
 * @model
 * @generated
 */
public interface MInstantiableResource extends MProvidedResource {
	/**
	 * Returns the list of parameters defined by the instantiable resource.
	 * @return the list of parameters defined by the instantiable resource.
	 * @see es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage#getMInstantiableResource_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParameters();

}
