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
package es.uah.aut.srg.micobs.mesp.generator.util;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mesp.mespcommon.mespcommonPackage;
import es.uah.aut.srg.micobs.mesp.mespctool.mespctoolPackage;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mesposswi.mesposswiPackage;
import es.uah.aut.srg.micobs.mesp.mesposswp.mesposswpPackage;
import es.uah.aut.srg.micobs.mesp.mesppswp.mesppswpPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.modeling.util.xpand.XpandUtil;

/**
 * Class that provides methods to launch model transformations on MESP models.
 *
 */
public class MESPGeneratorUtil {

	protected static EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
		@Override
		protected EPackage[] allPackages() {
			return new EPackage[] { EcorePackage.eINSTANCE, 
				commonPackage.eINSTANCE,
				systemPackage.eINSTANCE,
				pdlPackage.eINSTANCE,
				mespcommonPackage.eINSTANCE,
				mespctoolPackage.eINSTANCE,
				mesposswiPackage.eINSTANCE,
				mesposswpPackage.eINSTANCE,
				mespswiPackage.eINSTANCE,
				mespswpPackage.eINSTANCE,
				mesppswpPackage.eINSTANCE,
				mespdepPackage.eINSTANCE };
    	}
	};
	
	/**
	 * Launches a M2T transformation to generate a default operating system
	 * software interface model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMOSSwInterface(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMOSSwInterface::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate a default software interface
	 * model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMSwInterface(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMSwInterface::main",
			false);
	}

	/**
	 * Launches a M2T transformation to generate a default software package
	 * model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMSwPackage(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMSwPackage::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate a default driver software
	 * package model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMDriverSwPackage(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMDriverSwPackage::main",
			false);
	}

	/**
	 * Launches a M2T transformation to generate a default software package
	 * model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMOSSwPackage(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMOSSwPackage::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate a default platform software
	 * package model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMPlatformSwPackage(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMPlatformSwPackage::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate a default deployment model
	 * file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMMESPDeployment(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMMESPDeployment::main",
			false);
	}

}
