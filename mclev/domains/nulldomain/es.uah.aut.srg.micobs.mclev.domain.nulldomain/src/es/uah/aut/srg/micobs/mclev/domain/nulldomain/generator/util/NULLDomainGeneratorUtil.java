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
package es.uah.aut.srg.micobs.mclev.domain.nulldomain.generator.util;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryPackage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.modeling.util.xpand.XpandUtil;

/**
 * Class that provides methods to launch model transformations on models using
 * the NULL domain.
 */
public class NULLDomainGeneratorUtil {

	protected static EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
		@Override
		protected EPackage[] allPackages() {
			return new EPackage[] { EcorePackage.eINSTANCE, 
				commonPackage.eINSTANCE,
				systemPackage.eINSTANCE,
				pdlPackage.eINSTANCE,
				mclevdomPackage.eINSTANCE,
				mclevcmpPackage.eINSTANCE,
				mclevsaiPackage.eINSTANCE,
				mclevslibPackage.eINSTANCE,
				mclevimapPackage.eINSTANCE,
				mclevmcadPackage.eINSTANCE,
				mclevflatmcadPackage.eINSTANCE,
				pdllibraryPackage.eINSTANCE};
    	}
	};
	
	/**
	 * Launches a M2T transformation to generate the MESP deployment model
	 * from a flat MCAD model defined over the NULLDomain component domain.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateMESPDeployment(String containerName, 
			EObject model, 
			IProgressMonitor monitor,
			MCommonPackage selectedPackage)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::BuildMESPDeployment::main",
			false, selectedPackage);
	}

	/**
	 * Launches a M2T transformation to generate the main deployment code of
	 * an application.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateMainCode(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::BuildDeploymentMainCode::main",
			false);
	}
}


