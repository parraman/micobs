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

package es.uah.aut.srg.micobs.mclev.lang.ui.quickfix;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import es.uah.aut.srg.micobs.mclev.lang.validation.DOMJavaValidator;
import es.uah.aut.srg.micobs.xtext.MICOBSQuickFixProvider;

public class DOMQuickfixProvider extends MICOBSQuickFixProvider {

	@Fix(DOMJavaValidator.IMPROPER_IODSUPPORTEDPLATFORM_NAME)
	public void properSwPackageSupportedPlatformName(final Issue issue, IssueResolutionAcceptor acceptor) {
		
		acceptor.accept(issue, "Change name to '" + issue.getData()[1] + "'" , 
				"Change the name of the implementation oriented domain supported platform to the recommended name '" +
						issue.getData()[1] + "'" , null, 
	    new IModification() {
	        public void apply(IModificationContext context) 
	      throws Exception {
	          IXtextDocument xtextDocument = context.getXtextDocument();
	          xtextDocument.replace(issue.getOffset(), (issue.getData()[0]).length(), 
	                                issue.getData()[1]);
	        }
	      }
	    );
	}

}
