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
package es.uah.aut.srg.micobs.mesp.lang.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import es.uah.aut.srg.micobs.mesp.lang.services.PSWPGrammarAccess;

public class PSWPParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private PSWPGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected es.uah.aut.srg.micobs.mesp.lang.parser.antlr.internal.InternalPSWPParser createParser(XtextTokenStream stream) {
		return new es.uah.aut.srg.micobs.mesp.lang.parser.antlr.internal.InternalPSWPParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "MMESPPSWPPackageFile";
	}
	
	public PSWPGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PSWPGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
