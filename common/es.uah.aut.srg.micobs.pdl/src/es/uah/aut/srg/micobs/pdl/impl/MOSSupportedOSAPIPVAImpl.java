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
package es.uah.aut.srg.micobs.pdl.impl;

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.common.impl.MParameterValueAssignmentImpl;
import es.uah.aut.srg.micobs.pdl.MOSSupportedOSAPIPVA;
import es.uah.aut.srg.micobs.pdl.pdlPackage;

/**
 * An implementation of the model object '<em><b>MOSSupportedOSAPIPVA</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedOSAPIPVAImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MOSSupportedOSAPIPVAImpl extends MParameterValueAssignmentImpl implements MOSSupportedOSAPIPVA {
	/**
	 * @generated
	 */
	protected MOSSupportedOSAPIPVAImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdlPackage.Literals.MOS_SUPPORTED_OSAPIPVA;
	}

}