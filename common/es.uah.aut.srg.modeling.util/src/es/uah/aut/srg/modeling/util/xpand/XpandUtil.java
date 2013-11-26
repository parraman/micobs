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
package es.uah.aut.srg.modeling.util.xpand;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.internal.xpand2.pr.ProtectedRegionResolverImpl;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

/**
 * Helper functions to trigger M2T Xpand transformations.
 */
public class XpandUtil {
	
	/**
	 * Triggers a M2T Xpand transformation whose output would be a char
	 * sequence outlet that can later be stored in a char buffer.
	 * 
	 * @param containerName name used to identify the outlet and the different
	 * files that will be created.
	 * @param model the intput model.
	 * @param metamodel the EMF registry metamodel used in the transformation.
	 * @param templatePath the path of the Xpand template.
	 * @param append <code>true</code> if, when a file created by the
	 * transformation is accessed again, the new content shall be appended;
	 * <code>false</code> otherwise.
	 * @param parameters optional parameters passed to the Xpand template.
	 * @return the char sequence outlet with the generated textual output.
	 */
	public static CharSequenceOutlet bufferGenerate(String containerName,
			EObject model,
			EmfRegistryMetaModel metamodel,
			String templatePath,
			boolean append,
			Object... parameters)
	{
		
		OutputImpl output = new OutputImpl();
		CharSequenceOutlet outlet = new CharSequenceOutlet(containerName);
	    if (append == true)
	    {
	    	outlet.setAppend(true);
	    }
	    outlet.setOverwrite(true);
	    output.addOutlet(outlet);
	    
	    ProtectedRegionResolverImpl resolv = new ProtectedRegionResolverImpl();
	    resolv.setSrcPathes(containerName);

	    Map<String, Variable> globalVarsMap = new HashMap<String, Variable>();
	    XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, resolv, globalVarsMap, null, null);

	    execCtx.registerMetaModel(metamodel);
	    
	    XpandFacade facade = XpandFacade.create(execCtx);

	    facade.evaluate(templatePath, model, parameters);

	    return outlet;
	}
	
	/**
	 * Triggers a regular M2T Xpand transformation in which the resulting
	 * content will be stored in the file system.
	 * 
	 * @param containerName the root container pathname where the generated
	 * files will be stored.
	 * @param model the intput model.
	 * @param metamodel the EMF registry metamodel used in the transformation.
	 * @param templatePath the path of the Xpand template.
	 * @param append <code>true</code> if, when a file that is being generated
	 * existed previously, the new content shall be appended at the end of the
	 * existing one; <code>false</code> otherwise.
	 * @param parameters optional parameters passed to the Xpand template.
	 */
	public static void generate(String containerName,
			EObject model,
			EmfRegistryMetaModel metamodel,
			String templatePath,
			boolean append,
			Object... parameters)
	{
		
		OutputImpl output = new OutputImpl();
	    Outlet outlet = new Outlet(containerName);
	    if (append == true)
	    {
	    	outlet.setAppend(true);
	    }
	    outlet.setOverwrite(true);
	    output.addOutlet(outlet);
	    
	    ProtectedRegionResolverImpl resolv = new ProtectedRegionResolverImpl();
	    resolv.setSrcPathes(containerName);

	    Map<String, Variable> globalVarsMap = new HashMap<String, Variable>();
	    XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, resolv, globalVarsMap, null, null);

	    execCtx.registerMetaModel(metamodel);
	    
	    XpandFacade facade = XpandFacade.create(execCtx);

	    facade.evaluate(templatePath, model, parameters);

	}
}
