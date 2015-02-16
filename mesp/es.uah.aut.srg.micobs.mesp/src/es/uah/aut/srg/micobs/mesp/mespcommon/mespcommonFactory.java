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

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * 
 * @see es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage
 * @generated
 */
public interface mespcommonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	mespcommonFactory eINSTANCE = es.uah.aut.srg.micobs.mesp.mespcommon.impl.mespcommonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MQuantifiableResource</em>'.
	 * @return a new object of class '<em>MQuantifiableResource</em>'.
	 * @generated
	 */
	MQuantifiableResource createMQuantifiableResource();

	/**
	 * Returns a new object of class '<em>MInstantiableResource</em>'.
	 * @return a new object of class '<em>MInstantiableResource</em>'.
	 * @generated
	 */
	MInstantiableResource createMInstantiableResource();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	mespcommonPackage getmespcommonPackage();

}
