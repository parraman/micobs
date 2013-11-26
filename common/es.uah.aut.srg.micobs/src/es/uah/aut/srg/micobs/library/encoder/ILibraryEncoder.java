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
package es.uah.aut.srg.micobs.library.encoder;

import java.util.List;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.library.LibraryManagerException;

/**
 * Library encoder interface. This interface provides methods for
 * encoding the three different types of library objects: packages,
 * items and versioned items.
 * 
 * Each of these methods returns the library descriptors of the given
 * library object plus the descriptors of the objects on which it depends.
 * For example, if we are encoding a versioned item attached to a model
 * element, the method {@link #getDescriptors(MCommonPackageVersionedItem)}
 * will return the descriptor of the model element plus the descriptor
 * attached to the package to which the element belongs plus the descriptors
 * of the rest of elements on which the main element depends.
 *
 */
public interface ILibraryEncoder {

	/**
	 * Encodes a versioned item library object. It returns the descriptor
	 * associated to the versioned item plus the ones of the elements on
	 * which it depends plus the one corresponding to the package in which
	 * it is defined.
	 * 
	 * The method will throw a {@link LibraryManagerException}
	 * if an error occur when accessing the library.
	 * 
	 * @param versionedItem the versioned item library object to encode.
	 * @return the resulting list of descriptors
	 */
	public List<MDescriptor> getDescriptors(
			MCommonPackageVersionedItem versionedItem)
			throws LibraryManagerException;

	/**
	 * Encodes an item library object. It returns the list of descriptors
	 * associated to the different versioned items of the item
	 * plus the ones of the elements on which they depend plus the one
	 * corresponding to the package in which it is defined.
	 * 
	 * The method will throw a {@link LibraryManagerException}
	 * if an error occur when accessing the library.
	 * 
	 * @param item the item library object to encode.
	 * @return the resulting list of descriptors
	 */
	public List<MDescriptor> getDescriptors(MCommonPackageItem item)
			throws LibraryManagerException;

	/**
	 * Encodes a library package. It returns the list of descriptors
	 * associated to all the items of the package plus the one corresponding
	 * to the package itself.
	 * 
	 * The method will throw a {@link LibraryManagerException}
	 * if an error occur when accessing the library.
	 * 
	 * @param _package the package to encode.
	 * @return the resulting list of descriptors.
	 */
	public List<MDescriptor> getDescriptors(MCommonPackage _package)
			throws LibraryManagerException;

}