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
package es.uah.aut.srg.micobs.mclev.mclevdom;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameter;

/**
 * A representation of a generic component type. The different component types
 * of the different domains inherit from this class.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MComponentType#getPortTypeInstances <em>PortTypeInstances</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMComponentType()
 * @model abstract="true"
 * @generated
 */
public interface MComponentType extends MCommonReferenceableObj {
	/**
	 * Returns the list of attributes defined by the component type. The values
	 * of these attributes are assigned when the components are defined.
	 * @return the list of attributes.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMComponentType_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getAttributes();

	/**
	 * Returns the list of port type instances. These objects define simple
	 * restrictions on the port instantiations of the components.
	 * @return the list of port type instances.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMComponentType_PortTypeInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<MPortTypeInstance> getPortTypeInstances();

}