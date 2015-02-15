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

import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;

/**
 * Interface that extends the original library manager interface 
 * to support referencing elements. A referencing element is a special kind
 * of element that has a reference to another element.
 * 
 * When a referencing element is stored in the library, a relationship is
 * build between it and element to which it points. Later, using the
 * {@link #getReferencingElement} method, a referencing element of a given
 * class can be obtained from the original pointed element.
 *
 */
public interface IReferencingLibraryManager extends ILibraryManager {

	
	/**
	 * Returns the referencing element of a given class that points to
	 * a given element.
	 * 
	 * If any error occurs when accessing the library, the method will
	 * throw a {@link LibraryManagerException}.
	 * 
	 * @param element the original element to which the referencing element
	 * points.
	 * @param class_ the class of the referencing element.
	 * @return the referencing element of class <code>class_</code> that points
	 * to the element <code>element</code>. If no referencing element were
	 * found, the method will return <code>null</code>.
	 */
	MCommonPackageReferencingElement getReferencingElement(MCommonPackageElement element, EClass class_) throws LibraryManagerException;
	
	
}
