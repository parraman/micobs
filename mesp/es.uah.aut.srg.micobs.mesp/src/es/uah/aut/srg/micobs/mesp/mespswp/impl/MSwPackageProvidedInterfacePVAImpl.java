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
package es.uah.aut.srg.micobs.mesp.mespswp.impl;

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.common.impl.MParameterValueAssignmentImpl;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageProvidedInterfacePVA;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;

/**
 * An implementation of the model object '<em><b>MSwPackageProvidedInterfacePVA</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageProvidedInterfacePVAImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MSwPackageProvidedInterfacePVAImpl extends MParameterValueAssignmentImpl implements MSwPackageProvidedInterfacePVA {
	/**
	 * @generated
	 */
	protected MSwPackageProvidedInterfacePVAImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswpPackage.Literals.MSW_PACKAGE_PROVIDED_INTERFACE_PVA;
	}

}