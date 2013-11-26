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
package es.uah.aut.srg.micobs.mesp.mespctool.generator.ui.handlers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;

import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.provider.mesppswpItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.ui.handlers.GenerateResourcesHandler;

/**
 * Abstract handler used to generate the default construction files
 * of a platform software package. This handler shall be fully
 * implemented for the different languages installed in the framework.
 *
 */
public abstract class GeneratePlatformSwPackageConstructionFiles extends GenerateResourcesHandler {

	@Override
	protected String getConfirmDialogMessage() {
		return MESPPlugin.INSTANCE.getString("_UI_GeneratePlatformSwPackageConstructionFiles_ConfirmDialog_message");
	}

	@Override
	protected String getModelClassErrorMessage() {
		return MESPPlugin.INSTANCE.getString("_UI_GeneratePlatformSwPackageConstructionFiles_ModelClassError_message");
	}

	@Override
	protected EClass getModelEClass() {
		return mesppswpPackage.eINSTANCE.getMMESPPSWPPackageFile();
	}

	@Override
	protected AdapterFactory getItemProviderAdapterFactory() {
		return new mesppswpItemProviderAdapterFactory();
	}

}
