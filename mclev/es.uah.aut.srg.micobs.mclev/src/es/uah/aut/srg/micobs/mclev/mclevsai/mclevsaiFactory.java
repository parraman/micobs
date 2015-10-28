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
package es.uah.aut.srg.micobs.mclev.mclevsai;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * @see es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage
 * @generated
 */
public interface mclevsaiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	mclevsaiFactory eINSTANCE = es.uah.aut.srg.micobs.mclev.mclevsai.impl.mclevsaiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MSAI</em>'.
	 * @return a new object of class '<em>MSAI</em>'.
	 * @generated
	 */
	MSAI createMSAI();

	/**
	 * Returns a new object of class '<em>MMCLEVSAIPackageFile</em>'.
	 * @return a new object of class '<em>MMCLEVSAIPackageFile</em>'.
	 * @generated
	 */
	MMCLEVSAIPackageFile createMMCLEVSAIPackageFile();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	mclevsaiPackage getmclevsaiPackage();

}