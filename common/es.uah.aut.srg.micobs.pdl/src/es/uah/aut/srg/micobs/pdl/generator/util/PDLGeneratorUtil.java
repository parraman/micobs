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
package es.uah.aut.srg.micobs.pdl.generator.util;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.modeling.util.xpand.XpandUtil;

/**
 * Class that provides methods to launch model transformations on PDL models.
 *
 */
public class PDLGeneratorUtil {

	protected static EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
		@Override
		protected EPackage[] allPackages() {
			return new EPackage[] { EcorePackage.eINSTANCE, 
				commonPackage.eINSTANCE,
				systemPackage.eINSTANCE,
				pdlPackage.eINSTANCE };
    	}
	};
	
	/**
	 * Launches a M2T transformation to generate a default operating system
	 * model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMOperatingSystem(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMOperatingSystem::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate a default OSAPI model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMOperatingSystemAPI(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMOperatingSystemAPI::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate a default architecture
	 * model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMArchitecture(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMArchitecture::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate a default device
	 * model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMDevice(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMDevice::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate a default microprocessor
	 * model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMMicroprocessor(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMMicroprocessor::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate a default board model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMBoard(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMBoard::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to generate a default platform
	 * model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMPlatform(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMPlatform::main",
			false);
	}
	
}
