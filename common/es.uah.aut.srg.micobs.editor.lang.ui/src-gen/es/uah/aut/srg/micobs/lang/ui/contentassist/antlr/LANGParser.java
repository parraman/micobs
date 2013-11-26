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
package es.uah.aut.srg.micobs.lang.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.lang.services.LANGGrammarAccess;

public class LANGParser extends AbstractContentAssistParser {
	
	@Inject
	private LANGGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal.InternalLANGParser createParser() {
		es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal.InternalLANGParser result = new es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal.InternalLANGParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getMSYSTEMPackageFileAccess().getGroup(), "rule__MSYSTEMPackageFile__Group__0");
					put(grammarAccess.getMSYSTEMPackageFileAccess().getGroup_3(), "rule__MSYSTEMPackageFile__Group_3__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_0_1(), "rule__Version__Group_0_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getVersionedQualifiedNameAccess().getGroup(), "rule__VersionedQualifiedName__Group__0");
					put(grammarAccess.getMLanguageAccess().getGroup(), "rule__MLanguage__Group__0");
					put(grammarAccess.getMLanguageAccess().getGroup_2(), "rule__MLanguage__Group_2__0");
					put(grammarAccess.getMLanguageAccess().getGroup_2_2(), "rule__MLanguage__Group_2_2__0");
					put(grammarAccess.getMSYSTEMPackageFileAccess().getPackageAssignment_1(), "rule__MSYSTEMPackageFile__PackageAssignment_1");
					put(grammarAccess.getMSYSTEMPackageFileAccess().getImportsAssignment_3_1(), "rule__MSYSTEMPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMSYSTEMPackageFileAccess().getElementAssignment_4(), "rule__MSYSTEMPackageFile__ElementAssignment_4");
					put(grammarAccess.getMLanguageAccess().getNameAssignment_1(), "rule__MLanguage__NameAssignment_1");
					put(grammarAccess.getMLanguageAccess().getExtendsAssignment_2_1(), "rule__MLanguage__ExtendsAssignment_2_1");
					put(grammarAccess.getMLanguageAccess().getExtendsAssignment_2_2_1(), "rule__MLanguage__ExtendsAssignment_2_2_1");
					put(grammarAccess.getMLanguageAccess().getVersionAssignment_6(), "rule__MLanguage__VersionAssignment_6");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal.InternalLANGParser typedParser = (es.uah.aut.srg.micobs.lang.ui.contentassist.antlr.internal.InternalLANGParser) parser;
			typedParser.entryRuleMSYSTEMPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LANGGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LANGGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}