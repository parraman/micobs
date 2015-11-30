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
package es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.mclev.lang.services.IFACEGrammarAccess;

public class IFACEParser extends AbstractContentAssistParser {
	
	@Inject
	private IFACEGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalIFACEParser createParser() {
		es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalIFACEParser result = new es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalIFACEParser(null);
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
					put(grammarAccess.getMMCLEVIFACEPackageFileAccess().getGroup(), "rule__MMCLEVIFACEPackageFile__Group__0");
					put(grammarAccess.getMMCLEVIFACEPackageFileAccess().getGroup_3(), "rule__MMCLEVIFACEPackageFile__Group_3__0");
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
					put(grammarAccess.getMInterfaceAccess().getGroup(), "rule__MInterface__Group__0");
					put(grammarAccess.getMInterfaceAccess().getGroup_5(), "rule__MInterface__Group_5__0");
					put(grammarAccess.getMInterfaceAccess().getGroup_5_2(), "rule__MInterface__Group_5_2__0");
					put(grammarAccess.getMMCLEVIFACEPackageFileAccess().getPackageAssignment_1(), "rule__MMCLEVIFACEPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMCLEVIFACEPackageFileAccess().getImportsAssignment_3_1(), "rule__MMCLEVIFACEPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMCLEVIFACEPackageFileAccess().getElementAssignment_4(), "rule__MMCLEVIFACEPackageFile__ElementAssignment_4");
					put(grammarAccess.getMInterfaceAccess().getDomainAssignment_1(), "rule__MInterface__DomainAssignment_1");
					put(grammarAccess.getMInterfaceAccess().getTypeAssignment_3(), "rule__MInterface__TypeAssignment_3");
					put(grammarAccess.getMInterfaceAccess().getNameAssignment_4(), "rule__MInterface__NameAssignment_4");
					put(grammarAccess.getMInterfaceAccess().getExtendsAssignment_5_1(), "rule__MInterface__ExtendsAssignment_5_1");
					put(grammarAccess.getMInterfaceAccess().getExtendsAssignment_5_2_1(), "rule__MInterface__ExtendsAssignment_5_2_1");
					put(grammarAccess.getMInterfaceAccess().getVersionAssignment_9(), "rule__MInterface__VersionAssignment_9");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalIFACEParser typedParser = (es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalIFACEParser) parser;
			typedParser.entryRuleMMCLEVIFACEPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public IFACEGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(IFACEGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
