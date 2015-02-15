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

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

/**
 * Generic Xtext quickfix provider that provides a quickfix when a package is
 * missing from the list of imported packages.
 *
 */
public class MICOBSQuickFixProvider extends DefaultQuickfixProvider {

	/**
	 * Quickfix for when a package is missing from the list of imported packages.
	 * This quickfix suggest the addition of the missing package.
	 * 
	 * @param issue the issue object.
	 * @param acceptor the resolution acceptor.
	 */
	@Fix(MICOBSAbstractJavaValidator.MISSING_PACKAGE_IMPORT)
	public void missingPackageImport(final Issue issue, IssueResolutionAcceptor acceptor) {
		
		acceptor.accept(issue, "Import package '" + issue.getData()[0] + "'" , 
				"Add package '" +
						issue.getData()[0] + "' to the list of imported packages" , null, 
	    new IModification() {
	        public void apply(IModificationContext context) 
	      throws Exception {
	          IXtextDocument xtextDocument = context.getXtextDocument();
	          xtextDocument.replace(xtextDocument.getLineOffset(issue.getLineNumber()), 0, 
	                                "import " + issue.getData()[0] + ";\n" );
	        }
	      }
	    );
	}
	
}
