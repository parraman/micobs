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
package es.uah.aut.srg.micobs.lang.asm_SPARC_v8.util;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.lang.asm_SPARC_v8.plugin.LangAsm_SPARC_v8Plugin;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;


/**
 * asm_SPARC(v8) Language model helper functions.
 *
 */
public class LangAsm_SPARC_v8Util {

	public static final String LANGUAGE_ASM_SPARC_V8_URI = "es.uah.aut.srg.micobs.langs.asm_SPARC";
	public static final String LANGUAGE_ASM_SPARC_V8_VERSION = "v8";

	private static MLanguage asm_sparc_v8 = null;
	
	/**
	 * Returns the model corresponding to the asm_SPARC(v8) language.
	 * @return the model of the asm_SPARC(v8) language.
	 */
	public static MLanguage getLanguageAsm_SPARC_v8()
	{
		if (asm_sparc_v8 == null)
		{
			try {
				MCommonPackageElement element = 
						SystemLibraryManager.getLibraryManager().getElement(
								systemPackage.eINSTANCE.getMLanguage(),
								LANGUAGE_ASM_SPARC_V8_URI, LANGUAGE_ASM_SPARC_V8_VERSION);
				if (element != null &&
					element instanceof MLanguage)
				{
					asm_sparc_v8 = (MLanguage) element;
				}
			} catch (LibraryManagerException e) {
				LangAsm_SPARC_v8Plugin.INSTANCE.log(e);
			}
		}
		return asm_sparc_v8;
	}

}
