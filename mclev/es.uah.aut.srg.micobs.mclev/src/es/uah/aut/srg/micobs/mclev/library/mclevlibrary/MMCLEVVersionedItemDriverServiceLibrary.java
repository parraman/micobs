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
package es.uah.aut.srg.micobs.mclev.library.mclevlibrary;


/**
 * A representation of an MCLEV Library versioned item corresponding to the
 * model of a driver service library.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary#getSwPackageURI <em>Sw Package URI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary#getSwPackageVersion <em>Sw Package Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage#getMMCLEVVersionedItemDriverServiceLibrary()
 * @model
 * @generated
 */
public interface MMCLEVVersionedItemDriverServiceLibrary extends MMCLEVPackageVersionedItem {
	/**
	 * Returns the URI of the MESP driver software package that stores the
	 * implementation of the driver service library or <code>null</code>
	 * if no software package is defined for the service library.
	 * @return the URI of the attached MESP driver software package or
	 * <code>null</code> if no software package is defined for the
	 * driver service library.
	 * @see #setSwPackageURI(String)
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage#getMMCLEVVersionedItemDriverServiceLibrary_SwPackageURI()
	 * @model
	 * @generated
	 */
	String getSwPackageURI();

	/**
	 * Sets the URI of the MESP driver software package that stores the
	 * implementation of the driver service library.
	 * @param value the new URI of the attached MESP driver software package.
	 * @see #getSwPackageURI()
	 * @generated
	 */
	void setSwPackageURI(String value);

	/**
	 * Returns the version of the MESP software package that stores the
	 * implementation of the driver service library or <code>null</code>
	 * if no software package is defined for the service library.
	 * @return the version of the attached MESP software package or
	 * <code>null</code> if no software package is defined for the driver
	 * service library.
	 * @see #setSwPackageVersion(String)
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage#getMMCLEVVersionedItemDriverServiceLibrary_SwPackageVersion()
	 * @model
	 * @generated
	 */
	String getSwPackageVersion();

	/**
	 * Sets the version of the MESP software package that stores the
	 * implementation of the driver service library.
	 * @param value the new version of the attached MESP software package.
	 * @see #getSwPackageVersion()
	 * @generated
	 */
	void setSwPackageVersion(String value);

}