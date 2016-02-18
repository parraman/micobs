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
package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.mclev.domain.edroom.lang.services.PROTGrammarAccess;

public class PROTParser extends AbstractContentAssistParser {

	@Inject
	private PROTGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.contentassist.antlr.internal.InternalPROTParser createParser() {
		es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.contentassist.antlr.internal.InternalPROTParser result = new es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.contentassist.antlr.internal.InternalPROTParser(null);
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
					put(grammarAccess.getEDROOMMessageAccess().getAlternatives(), "rule__EDROOMMessage__Alternatives");
					put(grammarAccess.getEDROOMPROTPackageFileAccess().getGroup(), "rule__EDROOMPROTPackageFile__Group__0");
					put(grammarAccess.getEDROOMPROTPackageFileAccess().getGroup_3(), "rule__EDROOMPROTPackageFile__Group_3__0");
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
					put(grammarAccess.getEDROOMProtocolAccess().getGroup(), "rule__EDROOMProtocol__Group__0");
					put(grammarAccess.getEDROOMProtocolAccess().getGroup_3(), "rule__EDROOMProtocol__Group_3__0");
					put(grammarAccess.getEDROOMProtocolAccess().getGroup_3_2(), "rule__EDROOMProtocol__Group_3_2__0");
					put(grammarAccess.getEDROOMProtocolAccess().getGroup_5_0(), "rule__EDROOMProtocol__Group_5_0__0");
					put(grammarAccess.getEDROOMProtocolAccess().getGroup_5_1(), "rule__EDROOMProtocol__Group_5_1__0");
					put(grammarAccess.getEDROOMProtocolAccess().getGroup_5_2(), "rule__EDROOMProtocol__Group_5_2__0");
					put(grammarAccess.getEDROOMProtocolAccess().getGroup_5_3(), "rule__EDROOMProtocol__Group_5_3__0");
					put(grammarAccess.getEDROOMSendMessageAccess().getGroup(), "rule__EDROOMSendMessage__Group__0");
					put(grammarAccess.getEDROOMInvokeMessageAccess().getGroup(), "rule__EDROOMInvokeMessage__Group__0");
					put(grammarAccess.getEDROOMInvokeMessageAccess().getGroup_8(), "rule__EDROOMInvokeMessage__Group_8__0");
					put(grammarAccess.getEDROOMReplyMessageAccess().getGroup(), "rule__EDROOMReplyMessage__Group__0");
					put(grammarAccess.getEDROOMPROTPackageFileAccess().getPackageAssignment_1(), "rule__EDROOMPROTPackageFile__PackageAssignment_1");
					put(grammarAccess.getEDROOMPROTPackageFileAccess().getImportsAssignment_3_1(), "rule__EDROOMPROTPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getEDROOMPROTPackageFileAccess().getElementAssignment_4(), "rule__EDROOMPROTPackageFile__ElementAssignment_4");
					put(grammarAccess.getEDROOMProtocolAccess().getNameAssignment_2(), "rule__EDROOMProtocol__NameAssignment_2");
					put(grammarAccess.getEDROOMProtocolAccess().getExtendsAssignment_3_1(), "rule__EDROOMProtocol__ExtendsAssignment_3_1");
					put(grammarAccess.getEDROOMProtocolAccess().getExtendsAssignment_3_2_1(), "rule__EDROOMProtocol__ExtendsAssignment_3_2_1");
					put(grammarAccess.getEDROOMProtocolAccess().getVersionAssignment_5_0_2(), "rule__EDROOMProtocol__VersionAssignment_5_0_2");
					put(grammarAccess.getEDROOMProtocolAccess().getReferencedElementAssignment_5_1_2(), "rule__EDROOMProtocol__ReferencedElementAssignment_5_1_2");
					put(grammarAccess.getEDROOMProtocolAccess().getInputMessagesAssignment_5_2_3(), "rule__EDROOMProtocol__InputMessagesAssignment_5_2_3");
					put(grammarAccess.getEDROOMProtocolAccess().getOutputMessagesAssignment_5_3_3(), "rule__EDROOMProtocol__OutputMessagesAssignment_5_3_3");
					put(grammarAccess.getEDROOMSendMessageAccess().getNameAssignment_2(), "rule__EDROOMSendMessage__NameAssignment_2");
					put(grammarAccess.getEDROOMSendMessageAccess().getDataClassAssignment_4(), "rule__EDROOMSendMessage__DataClassAssignment_4");
					put(grammarAccess.getEDROOMInvokeMessageAccess().getNameAssignment_2(), "rule__EDROOMInvokeMessage__NameAssignment_2");
					put(grammarAccess.getEDROOMInvokeMessageAccess().getDataClassAssignment_4(), "rule__EDROOMInvokeMessage__DataClassAssignment_4");
					put(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesAssignment_7(), "rule__EDROOMInvokeMessage__RepliesAssignment_7");
					put(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesAssignment_8_1(), "rule__EDROOMInvokeMessage__RepliesAssignment_8_1");
					put(grammarAccess.getEDROOMReplyMessageAccess().getNameAssignment_2(), "rule__EDROOMReplyMessage__NameAssignment_2");
					put(grammarAccess.getEDROOMReplyMessageAccess().getDataClassAssignment_4(), "rule__EDROOMReplyMessage__DataClassAssignment_4");
					put(grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5(), "rule__EDROOMProtocol__UnorderedGroup_5");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.contentassist.antlr.internal.InternalPROTParser typedParser = (es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.contentassist.antlr.internal.InternalPROTParser) parser;
			typedParser.entryRuleEDROOMPROTPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PROTGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PROTGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
