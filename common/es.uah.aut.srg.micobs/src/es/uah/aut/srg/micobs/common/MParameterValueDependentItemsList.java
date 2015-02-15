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
package es.uah.aut.srg.micobs.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of a list of data items whose validity depends on the
 * values of a set of parameters. Each element of the list is of a class
 * derived from {@link MParameterValueDependentItem} and defines value ranges
 * for a set of parameters that mark if the data stored in the item is valid
 * or not.
 * 
 * The intersection between the value ranges of the elements of the list must
 * always be zero, so that only one of the items of the list is valid. 
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueDependentItemsList#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueDependentItemsList()
 * @model
 * @generated
 */
public interface MParameterValueDependentItemsList extends EObject {
	/**
	 * Returns the list of data items whose validity depends on the
	 * values of a set of parameters.
	 * @return the list of data items whose validity depends on the
	 * 		   values of a set of parameters.
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueDependentItemsList_Items()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MParameterValueDependentItem> getItems();

}