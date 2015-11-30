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
package es.uah.aut.srg.micobs.mclev.lang;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

import es.uah.aut.srg.micobs.mclev.mclevmcad.provider.mclevmcadItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mclev.plugin.MCLEVPlugin;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.xtext.MICOBSCancelableDiagnostician;
import es.uah.aut.srg.micobs.xtext.MICOBSDescriptionAssociator;
import es.uah.aut.srg.micobs.xtext.MICOBSLazyLinker;
import es.uah.aut.srg.micobs.xtext.MICOBSLinkingDiagnosticMessageProvider;
import es.uah.aut.srg.micobs.xtext.MICOBSQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class FLATMCADRuntimeModule extends es.uah.aut.srg.micobs.mclev.lang.AbstractFLATMCADRuntimeModule {

	public Class<? extends IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return MICOBSQualifiedNameProvider.MICOBSDefaultNameConverter.class;
	}
	
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {  
		return MICOBSQualifiedNameProvider.class;
	}
	
	public Class<? extends MICOBSDescriptionAssociator> bindDescriptionAssociator() {
		return MICOBSDescriptionAssociator.class;
	}
	
	public Class<? extends ILinker> bindILinker() {
		return MICOBSLazyLinker.class;
	}

	public void configureResourceLocator(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.emf.common.util.ResourceLocator.class).toInstance(MCLEVPlugin.INSTANCE);
		binder.bind(es.uah.aut.srg.micobs.util.IMICOBSUtil.class).toInstance(MCLEVUtil.getDefault());
	}
	
	public Class<? extends ILinkingDiagnosticMessageProvider> bindILinkingDiagnosticMessageProvider() {
		return MICOBSLinkingDiagnosticMessageProvider.class;
	}
	
	public Class<? extends AdapterFactory> bindAdapterFactory() {
		return mclevmcadItemProviderAdapterFactory.class;
	}
	
	public Class<? extends Diagnostician> bindDiagnostician() {
		return MICOBSCancelableDiagnostician.class;
	}
	
}
