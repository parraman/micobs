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

import es.uah.aut.srg.micobs.mesp.lang.services.PSWPGrammarAccess;

public class PSWPParser extends AbstractContentAssistParser {
	
	@Inject
	private PSWPGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalPSWPParser createParser() {
		es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalPSWPParser result = new es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalPSWPParser(null);
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
					put(grammarAccess.getMMESPPSWPPackageFileAccess().getGroup(), "rule__MMESPPSWPPackageFile__Group__0");
					put(grammarAccess.getMMESPPSWPPackageFileAccess().getGroup_3(), "rule__MMESPPSWPPackageFile__Group_3__0");
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
					put(grammarAccess.getMPlatformSwPackageAccess().getGroup(), "rule__MPlatformSwPackage__Group__0");
					put(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_0(), "rule__MPlatformSwPackage__Group_3_0__0");
					put(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_1(), "rule__MPlatformSwPackage__Group_3_1__0");
					put(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2(), "rule__MPlatformSwPackage__Group_3_2__0");
					put(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_2_4(), "rule__MPlatformSwPackage__Group_3_2_4__0");
					put(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3(), "rule__MPlatformSwPackage__Group_3_3__0");
					put(grammarAccess.getMPlatformSwPackageAccess().getGroup_3_3_3(), "rule__MPlatformSwPackage__Group_3_3_3__0");
					put(grammarAccess.getMMESPPSWPPackageFileAccess().getPackageAssignment_1(), "rule__MMESPPSWPPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMESPPSWPPackageFileAccess().getImportsAssignment_3_1(), "rule__MMESPPSWPPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMESPPSWPPackageFileAccess().getElementAssignment_4(), "rule__MMESPPSWPPackageFile__ElementAssignment_4");
					put(grammarAccess.getMPlatformSwPackageAccess().getNameAssignment_1(), "rule__MPlatformSwPackage__NameAssignment_1");
					put(grammarAccess.getMPlatformSwPackageAccess().getVersionAssignment_3_0_2(), "rule__MPlatformSwPackage__VersionAssignment_3_0_2");
					put(grammarAccess.getMPlatformSwPackageAccess().getReferencedElementAssignment_3_1_3(), "rule__MPlatformSwPackage__ReferencedElementAssignment_3_1_3");
					put(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_3(), "rule__MPlatformSwPackage__CtoolsAssignment_3_2_3");
					put(grammarAccess.getMPlatformSwPackageAccess().getCtoolsAssignment_3_2_4_1(), "rule__MPlatformSwPackage__CtoolsAssignment_3_2_4_1");
					put(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_2(), "rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_2");
					put(grammarAccess.getMPlatformSwPackageAccess().getOsSwPackagesAssignment_3_3_3_1(), "rule__MPlatformSwPackage__OsSwPackagesAssignment_3_3_3_1");
					put(grammarAccess.getMPlatformSwPackageAccess().getUnorderedGroup_3(), "rule__MPlatformSwPackage__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalPSWPParser typedParser = (es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalPSWPParser) parser;
			typedParser.entryRuleMMESPPSWPPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PSWPGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PSWPGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
