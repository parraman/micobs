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
import es.uah.aut.srg.micobs.common.MCommonPackageParametricReferencingElement;

/**
 * Interface that extends the referencing library manager interface 
 * to support parametric referencing elements. Parametric referencing elements 
 * are a special kind of referencing element that have two references to
 * other elements:
 * 
 * <ul>
 * 		<li>A reference to the main element.</li>
 * 		<li>A parametric reference to a second element. This reference will be
 * 			used to discard between the different referencing elements that
 * 			reference the main element.</li>
 * </ul>
 * 
 * Like this, the library manager will hold the structure necessary to maintain
 * more that one referencing element pointing to the same element. The selection
 * of the right referencing element will be done depending on the value of the
 * parametric reference by using the {@link #getParametricReferencingElement} method.
 *
 */
public interface IParametricReferencingLibraryManager extends IReferencingLibraryManager {

	
	/**
	 * Returns the parametric referencing element that references a given object and whose
	 * parametric reference points to another object which is also passed as a parameter.
	 * 
	 * If any error occurs when accessing the library, the method will
	 * throw a {@link LibraryManagerException}.
	 * 
	 * @param element the original element to which the referencing element
	 * points.
	 * @param parameter the parameter used to discard between the referencing elements.
	 * @param class_ the class to which the parametric referencing element belongs.
	 * @return the parametric referencing element or <code>null</code> if there was none.
	 */
	MCommonPackageParametricReferencingElement getParametricReferencingElement(MCommonPackageElement element, MCommonPackageElement parameter, EClass class_) throws LibraryManagerException;
	
	
}
