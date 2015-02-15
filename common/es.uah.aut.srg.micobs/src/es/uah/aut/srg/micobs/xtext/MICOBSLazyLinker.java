/*******************************************************************************
 * Copyright (c) 2013-2015 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     MICOBS SRG Team - Initial API and implementation
 * 
 * Based on an original implementation of Geppeto by cloudsmith.
 * http://cloudsmith.github.io/geppetto/
 * 
 ******************************************************************************/
package es.uah.aut.srg.micobs.xtext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.linking.lazy.LazyLinker;

import com.google.inject.Inject;

public class MICOBSLazyLinker extends LazyLinker {

	@Inject
	private MICOBSDescriptionAssociator descriptionAssociator;
	
	@Override
	protected void afterModelLinked(EObject model, IDiagnosticConsumer diagnosticsConsumer) {
		descriptionAssociator.linkDocumentation(model);
	}
	
}
