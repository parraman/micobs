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
package es.uah.aut.srg.micobs.lang.c_c99.util;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.lang.c_c99.plugin.LangC_C99Plugin;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;


/**
 * C(C99) Language model helper functions.
 *
 */
public class LangC_C99Util {

	public static final String LANGUAGE_C_C99_URI = "es.uah.aut.srg.micobs.langs.C";
	public static final String LANGUAGE_C_C99_VERSION = "C99";

	private static MLanguage c_c99 = null;
	
	/**
	 * Returns the model corresponding to the C(C99) language.
	 * @return the model of the C(C99) language.
	 */
	public static MLanguage getLanguageC_C99()
	{
		if (c_c99 == null)
		{
			try {
				MCommonPackageElement element = 
						SystemLibraryManager.getLibraryManager().getElement(LANGUAGE_C_C99_URI, LANGUAGE_C_C99_VERSION);
				if (element != null &&
					element instanceof MLanguage)
				{
					c_c99 = (MLanguage) element;
				}
			} catch (LibraryManagerException e) {
				LangC_C99Plugin.INSTANCE.log(e);
			}
		}
		return c_c99;
	}

}
