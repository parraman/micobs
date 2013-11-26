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
package es.uah.aut.srg.micobs.system;

import org.eclipse.emf.common.util.EList;

/**
 * A representation of a language. A language can extend zero or more
 * languages. A language extension implies that all the features of the
 * extended languages are also present in the new language and that all
 * the previously implemented code is compatible with and can be called from
 * code written in the new language.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.system.MLanguage#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.system.systemPackage#getMLanguage()
 * @model
 * @generated
 */
public interface MLanguage extends MSYSTEMPackageElement {
	/**
	 * Returns the list of languages extended by this language.
	 * @return the list of languages extended by this language.
	 * @see es.uah.aut.srg.micobs.system.systemPackage#getMLanguage_Extends()
	 * @model
	 * @generated
	 */
	EList<MLanguage> getExtends();

}
