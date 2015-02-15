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
 * A representation of a data item whose values are valid depending on the
 * values of a certain set of parameters. The values of the parameters are
 * expressed as a set of ranges listed on a {@link MParameterValueRangesList}.
 * 
 * In order to store the dependent data, classes shall be defined that
 * inherit from this abstract class.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.MParameterValueDependentItem#getRanges <em>Ranges</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueDependentItem()
 * @model abstract="true"
 * @generated
 */
public interface MParameterValueDependentItem extends EObject {
	/**
	 * Returns the list of value ranges of the parameters on which the validity
	 * of the data item depends.
	 * @return the list of value ranges of the parameters on which the validity
	 * of the data item depends.
	 * @see #setRanges(MParameterValueRangesList)
	 * @see es.uah.aut.srg.micobs.common.commonPackage#getMParameterValueDependentItem_Ranges()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueRange> getRanges();

}
