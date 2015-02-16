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
package es.uah.aut.srg.micobs.mesp.lang.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SWPUiModule extends es.uah.aut.srg.micobs.mesp.lang.ui.AbstractSWPUiModule {
	public SWPUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public void configureResourceLocator(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.emf.common.util.ResourceLocator.class).toInstance(MESPPlugin.INSTANCE);
	}
}
