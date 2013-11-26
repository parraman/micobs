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
package es.uah.aut.srg.micobs.mesp.lang;

import es.uah.aut.srg.micobs.mesp.lang.SWIStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SWIStandaloneSetup extends SWIStandaloneSetupGenerated{

	public static void doSetup() {
		new SWIStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

