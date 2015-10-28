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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;

/**
 * A representation of an MCLEV flat deployment model.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCAD#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatMCAD()
 * @model
 * @generated
 */
public interface MFlatMCAD extends MMCLEVFLATMCADPackageElement, MCommonPackageReferencingElement {
	/**
	 * Returns the list of deployment targets defined by the model.
	 * @return the list of deployment targets.
	 * @see es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage#getMFlatMCAD_Targets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MFlatMCADTarget> getTargets();

}