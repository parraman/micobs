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
 * model of a service access interface or SAI.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI#getSwInterfaceURI <em>Sw Interface URI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemSAI#getSwInterfaceVersion <em>Sw Interface Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage#getMMCLEVVersionedItemSAI()
 * @model
 * @generated
 */
public interface MMCLEVVersionedItemSAI extends MMCLEVPackageVersionedItem {
	/**
	 * Returns the URI of the MESP software interface corresponding to the
	 * SAI.
	 * @return the URI of the attached MESP software interface.
	 * @see #setSwInterfaceURI(String)
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage#getMMCLEVVersionedItemSAI_SwInterfaceURI()
	 * @model
	 * @generated
	 */
	String getSwInterfaceURI();

	/**
	 * Sets the URI of the MESP software interface corresponding to the
	 * SAI.
	 * @param value the new URI of the attached MESP software interface.
	 * @see #getSwInterfaceURI()
	 * @generated
	 */
	void setSwInterfaceURI(String value);

	/**
	 * Returns the version of the MESP software interface corresponding to the
	 * SAI.
	 * @return the version of the attached MESP software interface.
	 * @see #setSwInterfaceVersion(String)
	 * @see es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage#getMMCLEVVersionedItemSAI_SwInterfaceVersion()
	 * @model
	 * @generated
	 */
	String getSwInterfaceVersion();

	/**
	 * Sets the version of the MESP software interface corresponding to the
	 * SAI.
	 * @param value the new version of the attached MESP software interface.
	 * @see #getSwInterfaceVersion()
	 * @generated
	 */
	void setSwInterfaceVersion(String value);

}