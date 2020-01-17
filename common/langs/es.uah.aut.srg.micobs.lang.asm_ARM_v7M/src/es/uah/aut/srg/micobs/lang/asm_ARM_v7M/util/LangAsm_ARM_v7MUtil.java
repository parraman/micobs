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
package es.uah.aut.srg.micobs.lang.asm_ARM_v7M.util;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.lang.asm_ARM_v7M.plugin.LangAsm_ARM_v7MPlugin;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;


/**
 * asm_ARM(v7M) Language model helper functions.
 *
 */
public class LangAsm_ARM_v7MUtil {

	public static final String LANGUAGE_ASM_ARM_V7M_URI = "es.uah.aut.srg.micobs.langs.asm_ARM";
	public static final String LANGUAGE_ASM_ARM_V7M_VERSION = "v7M";

	private static MLanguage asm_arm_v7m = null;
	
	/**
	 * Returns the model corresponding to the asm_ARM(v7M) language.
	 * @return the model of the asm_ARM(v7M) language.
	 */
	public static MLanguage getLanguageAsm_ARM_v7M()
	{
		if (asm_arm_v7m == null)
		{
			try {
				MCommonPackageElement element = 
						SystemLibraryManager.getLibraryManager().getElement(
								systemPackage.eINSTANCE.getMLanguage(),
								LANGUAGE_ASM_ARM_V7M_URI, LANGUAGE_ASM_ARM_V7M_VERSION);
				if (element != null &&
					element instanceof MLanguage)
				{
					asm_arm_v7m = (MLanguage) element;
				}
			} catch (LibraryManagerException e) {
				LangAsm_ARM_v7MPlugin.INSTANCE.log(e);
			}
		}
		return asm_arm_v7m;
	}

}
