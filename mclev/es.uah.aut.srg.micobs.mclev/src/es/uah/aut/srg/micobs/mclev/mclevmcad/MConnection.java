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
package es.uah.aut.srg.micobs.mclev.mclevmcad;

import org.eclipse.emf.ecore.EObject;

/**
 * A representation of an abstract connection set between components deployed
 * on an MCAD model. There are two possible types of connection, either regular
 * connections between components that belong to the same part of the component
 * architecture (see {@link MCommonConnection}) or switch connections
 * between components that belong to different deployment alternatives
 * (see {@link MConnectionSwitch}.
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage#getMConnection()
 * @model abstract="true"
 * @generated
 */
public interface MConnection extends EObject {
}