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
package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.internal.PROTActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass.
 */
public class PROTExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PROTActivator.getInstance().getBundle();
	}

	@Override
	protected Injector getInjector() {
		return PROTActivator.getInstance().getInjector(PROTActivator.ES_UAH_AUT_SRG_MICOBS_MCLEV_DOMAIN_EDROOM_LANG_PROT);
	}

}
