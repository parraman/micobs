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
package es.uah.aut.srg.micobs.library;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.MDescriptorField;
import es.uah.aut.srg.micobs.libdesc.MDescriptorList;

/**
 * Library descriptors static helper functions.
 *
 */
public class LibraryDescriptor {

	public static String REMOTEMODELURI_FIELDNAME = "remoteModelURI";
	public static String REPOSITORYFOLDERURI_FIELDNAME = "repositoryFolderURI";
	public static String VERSION_FIELDNAME = "version";
	
	/**
	 * Returns the hash key of a library descriptor.
	 * @param descriptor the descriptor.
	 * @return the hash key of the descriptor.
	 */
	protected static String getHash(MDescriptor descriptor)
	{
		String hash = descriptor.getUri() +
					  descriptor.getLibrary() +
					  descriptor.getItem();
		for (MDescriptorField field : descriptor.getFields())
		{
			if (field.getName().matches(VERSION_FIELDNAME))
			{
				hash += field.getValue();
				break;
			}
		}
		return hash;
	}
	
	/**
	 * Removes duplicated descriptors from a descriptor list.
	 * @param list the descriptor list.
	 */
	public static void removeDuplicatedDescriptors(MDescriptorList list) {
		
		Set<String> hashes = new HashSet<String>();
		
		for (Iterator<MDescriptor> d = list.getDescriptors().iterator(); d.hasNext(); )
		{
			MDescriptor descriptor = d.next();
			
			if (hashes.add(getHash(descriptor)) == false)
			{
				d.remove();
			}
		}
	}


	
}
