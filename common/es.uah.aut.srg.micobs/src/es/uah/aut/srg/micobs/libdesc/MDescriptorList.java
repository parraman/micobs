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
package es.uah.aut.srg.micobs.libdesc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * This class corresponds to the root model object of a file containing a list
 * of descriptors.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.libdesc.MDescriptorList#getDescriptors <em>Descriptors</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage#getMDescriptorList()
 * @model
 * @generated
 */
public interface MDescriptorList extends EObject {
	/**
	 * Returns the list of descriptors stored in the file.
	 * @return the list of descriptors.
	 * @see es.uah.aut.srg.micobs.libdesc.libdescPackage#getMDescriptorList_Descriptors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MDescriptor> getDescriptors();

}
