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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;

import es.uah.aut.srg.micobs.mesp.mesposswi.provider.mesposswiItemProviderAdapterFactory;
import es.uah.aut.srg.micobs.mesp.plugin.MESPPlugin;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPUtilProvider;
import es.uah.aut.srg.micobs.xtext.MICOBSCancelableDiagnostician;
import es.uah.aut.srg.micobs.xtext.MICOBSDescriptionAssociator;
import es.uah.aut.srg.micobs.xtext.MICOBSLazyLinker;
import es.uah.aut.srg.micobs.xtext.MICOBSLinkingDiagnosticMessageProvider;
import es.uah.aut.srg.micobs.xtext.MICOBSQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class OSSWIRuntimeModule extends es.uah.aut.srg.micobs.mesp.lang.AbstractOSSWIRuntimeModule {

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
		binder.bind(org.eclipse.emf.common.util.ResourceLocator.class).toInstance(MESPPlugin.INSTANCE);
		binder.bind(es.uah.aut.srg.micobs.util.IMICOBSUtil.class).toInstance(MESPUtilProvider.getMICOBSUtil());
		binder.bind(es.uah.aut.srg.micobs.pdl.util.IPDLUtil.class).toInstance(MESPUtilProvider.getPDLUtil());
		binder.bind(es.uah.aut.srg.micobs.mesp.util.IMESPUtil.class).toInstance(MESPUtilProvider.getMESPUtil());
	}
	
	public Class<? extends ILinkingDiagnosticMessageProvider> bindILinkingDiagnosticMessageProvider() {
		return MICOBSLinkingDiagnosticMessageProvider.class;
	}
	
	public Class<? extends AdapterFactory> bindAdapterFactory() {
		return mesposswiItemProviderAdapterFactory.class;
	}
	
	public Class<? extends Diagnostician> bindDiagnostician() {
		return MICOBSCancelableDiagnostician.class;
	}
	
}
