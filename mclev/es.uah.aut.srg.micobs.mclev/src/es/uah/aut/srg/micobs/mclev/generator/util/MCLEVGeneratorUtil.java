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
package es.uah.aut.srg.micobs.mclev.generator.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MMCLEVFLATMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapPackage;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCLEVMCADPackageFile;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibPackage;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.systemPackage;
import es.uah.aut.srg.modeling.util.xpand.XpandUtil;

/**
 * Class that provides methods to launch model transformations on MCLEV models.
 *
 */
public class MCLEVGeneratorUtil {

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
				mclevflatmcadPackage.eINSTANCE};
    	}
	};
	
	/**
	 * Launches a M2T transformation to generate a default MCAD deployment
	 * model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void generateDefaultMCADeployment(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::DefaultMMCADeployment::main",
			false);
	}
	
	/**
	 * Launches a M2T transformation to serialize a Flat MCAD deployment
	 * model file.
	 * @param containerName the name of the container folder where the resulting
	 * file will be stored.
	 * @param model the model to be transformed.
	 * @param monitor the progress monitor that controls the activity.
	 */
	public static void serializeFlatMCAD(String containerName, 
			EObject model, 
			IProgressMonitor monitor)
	{
		XpandUtil.generate(containerName, 
			model, 
			metamodel, 
			"template::FlatMCADSerializer::main",
			false);
	}

	private static final URI generateFlatMCADTransformationURI =
			URI.createPlatformPluginURI("/es.uah.aut.srg.micobs.mclev/transformations/generateFlatMCAD.qvto", true);
	
	
	/**
	 * Launches a M2M transformation to generate a Flat MCAD model from an MCAD
	 * deployment model.
	 * @param file the root model object of the package file that stores the
	 * MCAD model.
	 * @param monitor the progress monitor that controls the activity.
	 * @return a root model object with the resulting Flat MCAD model or
	 * <code>null</code> if an error occurred during the transformation.
	 */
	public static MMCLEVFLATMCADPackageFile generateFlatMCAD(MMCLEVMCADPackageFile file, IProgressMonitor monitor)
	{
		TransformationExecutor executor = new TransformationExecutor(generateFlatMCADTransformationURI);
		
		ExecutionContext context = new ExecutionContextImpl();
		
		List<EObject> inputModels = new ArrayList<EObject>();
		inputModels.add(file);
		
		ModelExtent input = new BasicModelExtent(inputModels);
		
		ModelExtent output = new BasicModelExtent();
		
		ExecutionDiagnostic diagnostic = executor.execute(context, input, output);
		
		if (diagnostic.getSeverity() == Diagnostic.OK)
		{
			EObject result = output.getContents().get(0);
			if (result instanceof MMCLEVFLATMCADPackageFile)
			{
				return (MMCLEVFLATMCADPackageFile) result;
			}
		}
		return null;
	}
}


