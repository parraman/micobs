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
package es.uah.aut.srg.micobs.lang.cpp_98.util;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.lang.cpp_98.plugin.LangCPP_98Plugin;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;


/**
 * CPP(98) Language model helper functions.
 *
 */
public class LangCPP_98Util {

	public static final String LANGUAGE_CPP_98_URI = "es.uah.aut.srg.micobs.langs.CPP";
	public static final String LANGUAGE_CPP_98_VERSION = "98";

	private static MLanguage cpp_98 = null;
	
	/**
	 * Returns the model corresponding to the CPP(98) language.
	 * @return the model of the CPP(98) language.
	 */
	public static MLanguage getLanguageCPP_98()
	{
		if (cpp_98 == null)
		{
			try {
				MCommonPackageElement element = 
						SystemLibraryManager.getLibraryManager().getElement(
								systemPackage.eINSTANCE.getMLanguage(),
								LANGUAGE_CPP_98_URI, LANGUAGE_CPP_98_VERSION);
				if (element != null &&
					element instanceof MLanguage)
				{
					cpp_98 = (MLanguage) element;
				}
			} catch (LibraryManagerException e) {
				LangCPP_98Plugin.INSTANCE.log(e);
			}
		}
		return cpp_98;
	}

}
