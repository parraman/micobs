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
package es.uah.aut.srg.micobs.mesp.mesposswp;

import org.eclipse.emf.ecore.EFactory;

/**
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * 
 * @see es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage
 * @generated
 */
public interface mesposswpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * @generated
	 */
	mesposswpFactory eINSTANCE = es.uah.aut.srg.micobs.mesp.mesposswp.impl.mesposswpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MOSSwPackage</em>'.
	 * @return a new object of class '<em>MOSSwPackage</em>'.
	 * @generated
	 */
	MOSSwPackage createMOSSwPackage();

	/**
	 * Returns a new object of class '<em>MMESPOSSWPPackageFile</em>'.
	 * @return a new object of class '<em>MMESPOSSWPPackageFile</em>'.
	 * @generated
	 */
	MMESPOSSWPPackageFile createMMESPOSSWPPackageFile();

	/**
	 * Returns the package supported by this factory.
	 * @return the package supported by this factory.
	 * @generated
	 */
	mesposswpPackage getmesposswpPackage();

}
