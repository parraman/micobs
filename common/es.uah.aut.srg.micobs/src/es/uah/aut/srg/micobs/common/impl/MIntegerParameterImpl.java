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
package es.uah.aut.srg.micobs.common.impl;

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.common.MIntegerParameter;
import es.uah.aut.srg.micobs.common.commonPackage;

/**
 * An implementation of the model object '<em><b>MIntegerParameter</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MIntegerParameterImpl#getRange <em>Range</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.common.impl.MIntegerParameterImpl#getDefaultValue <em>DefaultValue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MIntegerParameterImpl extends MParameterImpl implements MIntegerParameter {
	/**
	 * @generated
	 */
	protected MIntegerParameterImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return commonPackage.Literals.MINTEGER_PARAMETER;
	}

}