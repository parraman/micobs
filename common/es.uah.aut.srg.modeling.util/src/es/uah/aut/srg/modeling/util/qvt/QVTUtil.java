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
package es.uah.aut.srg.modeling.util.qvt;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

/**
 * Class with helper methods to launch M2M transformation defined with
 * the Eclipse implementation of QVTo.
 *
 */
public class QVTUtil {

	
	public static List<EObject> transform(IProject project,
			URI uri,
			EObject model,
			IProgressMonitor monitor) {

		TransformationExecutor executor = new TransformationExecutor(uri);
		
		ExecutionContextImpl context = new ExecutionContextImpl();

		// We need this because the BasicModelExtent needs a List of EObjects
		List<EObject> inputModels = new ArrayList<EObject>();
		inputModels.add(model);
		
		BasicModelExtent input = new BasicModelExtent(inputModels);
		
		ModelExtent output = new BasicModelExtent();
		
		ExecutionDiagnostic diagnostic = executor.execute(context, input, output);

		if(diagnostic.getSeverity() == Diagnostic.OK) 
		{
			return output.getContents();
		}
		return null;
	}
	
}
