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

package es.uah.aut.srg.micobs.mclev.domain.edroom.lang;

import es.uah.aut.srg.micobs.mclev.domain.edroom.lang.PROTStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages
 * without equinox extension registry
 */
public class PROTStandaloneSetup extends PROTStandaloneSetupGenerated{

	public static void doSetup() {
		new PROTStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

