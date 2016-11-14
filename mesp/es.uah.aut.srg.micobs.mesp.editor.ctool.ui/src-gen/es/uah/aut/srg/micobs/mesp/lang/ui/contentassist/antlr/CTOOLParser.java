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
package es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.mesp.lang.services.CTOOLGrammarAccess;

public class CTOOLParser extends AbstractContentAssistParser {
	
	@Inject
	private CTOOLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalCTOOLParser createParser() {
		es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalCTOOLParser result = new es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalCTOOLParser(null);
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
					put(grammarAccess.getMMESPCTOOLPackageFileAccess().getGroup(), "rule__MMESPCTOOLPackageFile__Group__0");
					put(grammarAccess.getMMESPCTOOLPackageFileAccess().getGroup_3(), "rule__MMESPCTOOLPackageFile__Group_3__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_0_1(), "rule__Version__Group_0_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getVersionedQualifiedNameAccess().getGroup(), "rule__VersionedQualifiedName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup(), "rule__VersionedQualifiedReferenceName__Group__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_0(), "rule__VersionedQualifiedReferenceName__Group_0__0");
					put(grammarAccess.getVersionedQualifiedReferenceNameAccess().getGroup_2(), "rule__VersionedQualifiedReferenceName__Group_2__0");
					put(grammarAccess.getMConstructionToolAccess().getGroup(), "rule__MConstructionTool__Group__0");
					put(grammarAccess.getMConstructionToolAccess().getGroup_3(), "rule__MConstructionTool__Group_3__0");
					put(grammarAccess.getMConstructionToolAccess().getGroup_3_2(), "rule__MConstructionTool__Group_3_2__0");
					put(grammarAccess.getMConstructionToolAccess().getGroup_5_0(), "rule__MConstructionTool__Group_5_0__0");
					put(grammarAccess.getMConstructionToolAccess().getGroup_5_1(), "rule__MConstructionTool__Group_5_1__0");
					put(grammarAccess.getMConstructionToolAccess().getGroup_5_1_4(), "rule__MConstructionTool__Group_5_1_4__0");
					put(grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageAssignment_1(), "rule__MMESPCTOOLPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMESPCTOOLPackageFileAccess().getImportsAssignment_3_1(), "rule__MMESPCTOOLPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMESPCTOOLPackageFileAccess().getElementAssignment_4(), "rule__MMESPCTOOLPackageFile__ElementAssignment_4");
					put(grammarAccess.getMConstructionToolAccess().getNameAssignment_2(), "rule__MConstructionTool__NameAssignment_2");
					put(grammarAccess.getMConstructionToolAccess().getExtendsAssignment_3_1(), "rule__MConstructionTool__ExtendsAssignment_3_1");
					put(grammarAccess.getMConstructionToolAccess().getExtendsAssignment_3_2_1(), "rule__MConstructionTool__ExtendsAssignment_3_2_1");
					put(grammarAccess.getMConstructionToolAccess().getVersionAssignment_5_0_2(), "rule__MConstructionTool__VersionAssignment_5_0_2");
					put(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesAssignment_5_1_3(), "rule__MConstructionTool__SupportedLanguagesAssignment_5_1_3");
					put(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesAssignment_5_1_4_1(), "rule__MConstructionTool__SupportedLanguagesAssignment_5_1_4_1");
					put(grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5(), "rule__MConstructionTool__UnorderedGroup_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalCTOOLParser typedParser = (es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalCTOOLParser) parser;
			typedParser.entryRuleMMESPCTOOLPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CTOOLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CTOOLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
