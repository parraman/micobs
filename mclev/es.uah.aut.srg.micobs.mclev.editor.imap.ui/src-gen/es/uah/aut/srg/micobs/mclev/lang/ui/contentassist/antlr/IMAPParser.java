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

import es.uah.aut.srg.micobs.mclev.lang.services.IMAPGrammarAccess;

public class IMAPParser extends AbstractContentAssistParser {
	
	@Inject
	private IMAPGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalIMAPParser createParser() {
		es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalIMAPParser result = new es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalIMAPParser(null);
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
					put(grammarAccess.getMMCLEVIMAPPackageFileAccess().getGroup(), "rule__MMCLEVIMAPPackageFile__Group__0");
					put(grammarAccess.getMMCLEVIMAPPackageFileAccess().getGroup_3(), "rule__MMCLEVIMAPPackageFile__Group_3__0");
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
					put(grammarAccess.getMInterfaceMappingAccess().getGroup(), "rule__MInterfaceMapping__Group__0");
					put(grammarAccess.getMInterfaceMappingAccess().getGroup_6_0(), "rule__MInterfaceMapping__Group_6_0__0");
					put(grammarAccess.getMInterfaceMappingAccess().getGroup_6_1(), "rule__MInterfaceMapping__Group_6_1__0");
					put(grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageAssignment_1(), "rule__MMCLEVIMAPPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportsAssignment_3_1(), "rule__MMCLEVIMAPPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMCLEVIMAPPackageFileAccess().getElementAssignment_4(), "rule__MMCLEVIMAPPackageFile__ElementAssignment_4");
					put(grammarAccess.getMInterfaceMappingAccess().getDomainAssignment_1(), "rule__MInterfaceMapping__DomainAssignment_1");
					put(grammarAccess.getMInterfaceMappingAccess().getTypeAssignment_3(), "rule__MInterfaceMapping__TypeAssignment_3");
					put(grammarAccess.getMInterfaceMappingAccess().getNameAssignment_4(), "rule__MInterfaceMapping__NameAssignment_4");
					put(grammarAccess.getMInterfaceMappingAccess().getVersionAssignment_6_0_2(), "rule__MInterfaceMapping__VersionAssignment_6_0_2");
					put(grammarAccess.getMInterfaceMappingAccess().getInterfacesAssignment_6_1_2(), "rule__MInterfaceMapping__InterfacesAssignment_6_1_2");
					put(grammarAccess.getMInterfaceMappingAccess().getInterfacesAssignment_6_1_4(), "rule__MInterfaceMapping__InterfacesAssignment_6_1_4");
					put(grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6(), "rule__MInterfaceMapping__UnorderedGroup_6");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalIMAPParser typedParser = (es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalIMAPParser) parser;
			typedParser.entryRuleMMCLEVIMAPPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public IMAPGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(IMAPGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
