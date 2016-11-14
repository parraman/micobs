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

import es.uah.aut.srg.micobs.mesp.lang.services.OSSWPGrammarAccess;

public class OSSWPParser extends AbstractContentAssistParser {
	
	@Inject
	private OSSWPGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalOSSWPParser createParser() {
		es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalOSSWPParser result = new es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalOSSWPParser(null);
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
					put(grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup(), "rule__MMESPOSSWPPackageFile__Group__0");
					put(grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup_3(), "rule__MMESPOSSWPPackageFile__Group_3__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup(), "rule__Version__Group__0");
					put(grammarAccess.getVersionAccess().getGroup_0_1(), "rule__Version__Group_0_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1(), "rule__Version__Group_1__0");
					put(grammarAccess.getVersionAccess().getGroup_1_1_1(), "rule__Version__Group_1_1_1__0");
					put(grammarAccess.getVersionedQualifiedNameAccess().getGroup(), "rule__VersionedQualifiedName__Group__0");
					put(grammarAccess.getMOSSwPackageAccess().getGroup(), "rule__MOSSwPackage__Group__0");
					put(grammarAccess.getMOSSwPackageAccess().getGroup_2(), "rule__MOSSwPackage__Group_2__0");
					put(grammarAccess.getMOSSwPackageAccess().getGroup_2_2(), "rule__MOSSwPackage__Group_2_2__0");
					put(grammarAccess.getMOSSwPackageAccess().getGroup_4_0(), "rule__MOSSwPackage__Group_4_0__0");
					put(grammarAccess.getMOSSwPackageAccess().getGroup_4_1(), "rule__MOSSwPackage__Group_4_1__0");
					put(grammarAccess.getMOSSwPackageAccess().getGroup_4_2(), "rule__MOSSwPackage__Group_4_2__0");
					put(grammarAccess.getMOSSwPackageAccess().getGroup_4_2_4(), "rule__MOSSwPackage__Group_4_2_4__0");
					put(grammarAccess.getMOSSwPackageAccess().getGroup_4_3(), "rule__MOSSwPackage__Group_4_3__0");
					put(grammarAccess.getMOSSwPackageAccess().getGroup_4_3_4(), "rule__MOSSwPackage__Group_4_3_4__0");
					put(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageAssignment_1(), "rule__MMESPOSSWPPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsAssignment_3_1(), "rule__MMESPOSSWPPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMESPOSSWPPackageFileAccess().getElementAssignment_4(), "rule__MMESPOSSWPPackageFile__ElementAssignment_4");
					put(grammarAccess.getMOSSwPackageAccess().getNameAssignment_1(), "rule__MOSSwPackage__NameAssignment_1");
					put(grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_1(), "rule__MOSSwPackage__ExtendsAssignment_2_1");
					put(grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_2_1(), "rule__MOSSwPackage__ExtendsAssignment_2_2_1");
					put(grammarAccess.getMOSSwPackageAccess().getVersionAssignment_4_0_2(), "rule__MOSSwPackage__VersionAssignment_4_0_2");
					put(grammarAccess.getMOSSwPackageAccess().getReferencedElementAssignment_4_1_2(), "rule__MOSSwPackage__ReferencedElementAssignment_4_1_2");
					put(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_3(), "rule__MOSSwPackage__CtoolsAssignment_4_2_3");
					put(grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_4_1(), "rule__MOSSwPackage__CtoolsAssignment_4_2_4_1");
					put(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_3(), "rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_3");
					put(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_4_1(), "rule__MOSSwPackage__ProvidedOSSWIsAssignment_4_3_4_1");
					put(grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4(), "rule__MOSSwPackage__UnorderedGroup_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalOSSWPParser typedParser = (es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalOSSWPParser) parser;
			typedParser.entryRuleMMESPOSSWPPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public OSSWPGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(OSSWPGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
