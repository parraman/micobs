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
package es.uah.aut.srg.micobs.xtext;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;

import com.google.inject.Inject;

/**
 * Class that overrides the standard Xtext linking diagnostic
 * message provider. This class uses the resource locator of the
 * plugin that defines the model to provide a more comprehensive
 * kind of unresolved proxy messages.
 *
 */
public class MICOBSLinkingDiagnosticMessageProvider extends
		LinkingDiagnosticMessageProvider {

	@Inject
	ResourceLocator resourceLocator;
	
	@Override
	public DiagnosticMessage getUnresolvedProxyMessage(
			ILinkingDiagnosticContext context) {
		EClass referenceType = context.getReference().getEReferenceType();
		String linkText = "";
		try {
			linkText = context.getLinkText();
		} catch (IllegalNodeException e){
			linkText = e.getNode().getText();
		}
		String msg;
		if (resourceLocator.getString("_UI_" + referenceType.getName() + "_type") == null)
		{
			msg = "Couldn't resolve reference to '" + referenceType.getName() + " " + linkText + "'.";
		}
		else
		{
			msg = "Couldn't resolve reference to '" + 
					resourceLocator.getString("_UI_" + referenceType.getName() + "_type") +
				  " " + linkText + "'.";
		}
		return new DiagnosticMessage(msg, Severity.ERROR, Diagnostic.LINKING_DIAGNOSTIC);
	}
	
}
