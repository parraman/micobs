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
package es.uah.aut.srg.micobs.library.adapter;

import java.util.Set;

import es.uah.aut.srg.micobs.library.ILibraryManager;

/**
 * Interface used to provide the managers of the set of libraries that
 * depend on a certain library.
 *
 */
public interface IDependingLibrariesProvider {

	/**
	 * Returns the managers of the set of libraries on which a particular
	 * library depends.
	 * @return the managers of the set of libraries on which a particular
	 *         library depends.
	 */
	public Set<ILibraryManager> getDependingLibraries();
	
}
