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
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.mclev.domain.edroom.lang.services.DCLASSGrammarAccess;

public class DCLASSParser extends AbstractContentAssistParser {

	@Inject
	private DCLASSGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.contentassist.antlr.internal.InternalDCLASSParser createParser() {
		es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.contentassist.antlr.internal.InternalDCLASSParser result = new es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.contentassist.antlr.internal.InternalDCLASSParser(null);
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
					put(grammarAccess.getEDROOMDataClassAccess().getAlternatives_5_1(), "rule__EDROOMDataClass__Alternatives_5_1");
					put(grammarAccess.getEDROOMDataDefinitionAccess().getAlternatives(), "rule__EDROOMDataDefinition__Alternatives");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getAlternatives(), "rule__EDROOMDataDefinitionUnionElement__Alternatives");
					put(grammarAccess.getEDROOMDataFieldAccess().getAlternatives(), "rule__EDROOMDataField__Alternatives");
					put(grammarAccess.getEDROOMBasicTypeAccess().getAlternatives(), "rule__EDROOMBasicType__Alternatives");
					put(grammarAccess.getEDROOMDCLASSPackageFileAccess().getGroup(), "rule__EDROOMDCLASSPackageFile__Group__0");
					put(grammarAccess.getEDROOMDCLASSPackageFileAccess().getGroup_3(), "rule__EDROOMDCLASSPackageFile__Group_3__0");
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
					put(grammarAccess.getEDROOMDataClassAccess().getGroup(), "rule__EDROOMDataClass__Group__0");
					put(grammarAccess.getEDROOMDataClassAccess().getGroup_3(), "rule__EDROOMDataClass__Group_3__0");
					put(grammarAccess.getEDROOMDataClassAccess().getGroup_3_2(), "rule__EDROOMDataClass__Group_3_2__0");
					put(grammarAccess.getEDROOMDataClassAccess().getGroup_5_0(), "rule__EDROOMDataClass__Group_5_0__0");
					put(grammarAccess.getEDROOMDataDefinitionUnionAccess().getGroup(), "rule__EDROOMDataDefinitionUnion__Group__0");
					put(grammarAccess.getEDROOMDataDefinitionEnumAccess().getGroup(), "rule__EDROOMDataDefinitionEnum__Group__0");
					put(grammarAccess.getEDROOMDataDefinitionEnumAccess().getGroup_5(), "rule__EDROOMDataDefinitionEnum__Group_5__0");
					put(grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getGroup(), "rule__EDROOMDataDefinitionEnumElement__Group__0");
					put(grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getGroup_2(), "rule__EDROOMDataDefinitionEnumElement__Group_2__0");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getGroup(), "rule__EDROOMDataDefinitionUnionElementBasic__Group__0");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getGroup(), "rule__EDROOMDataDefinitionUnionElementBasicArray__Group__0");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getGroup(), "rule__EDROOMDataDefinitionUnionElementClass__Group__0");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getGroup(), "rule__EDROOMDataDefinitionUnionElementClassArray__Group__0");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getGroup(), "rule__EDROOMDataDefinitionUnionElementUnion__Group__0");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getGroup(), "rule__EDROOMDataDefinitionUnionElementUnionArray__Group__0");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getGroup(), "rule__EDROOMDataDefinitionUnionElementEnum__Group__0");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getGroup(), "rule__EDROOMDataDefinitionUnionElementEnumArray__Group__0");
					put(grammarAccess.getEDROOMDataFieldBasicAccess().getGroup(), "rule__EDROOMDataFieldBasic__Group__0");
					put(grammarAccess.getEDROOMDataFieldBasicArrayAccess().getGroup(), "rule__EDROOMDataFieldBasicArray__Group__0");
					put(grammarAccess.getEDROOMDataFieldClassAccess().getGroup(), "rule__EDROOMDataFieldClass__Group__0");
					put(grammarAccess.getEDROOMDataFieldClassArrayAccess().getGroup(), "rule__EDROOMDataFieldClassArray__Group__0");
					put(grammarAccess.getEDROOMDataFieldUnionAccess().getGroup(), "rule__EDROOMDataFieldUnion__Group__0");
					put(grammarAccess.getEDROOMDataFieldUnionArrayAccess().getGroup(), "rule__EDROOMDataFieldUnionArray__Group__0");
					put(grammarAccess.getEDROOMDataFieldEnumAccess().getGroup(), "rule__EDROOMDataFieldEnum__Group__0");
					put(grammarAccess.getEDROOMDataFieldEnumArrayAccess().getGroup(), "rule__EDROOMDataFieldEnumArray__Group__0");
					put(grammarAccess.getEDROOMDCLASSPackageFileAccess().getPackageAssignment_1(), "rule__EDROOMDCLASSPackageFile__PackageAssignment_1");
					put(grammarAccess.getEDROOMDCLASSPackageFileAccess().getImportsAssignment_3_1(), "rule__EDROOMDCLASSPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getEDROOMDCLASSPackageFileAccess().getElementAssignment_4(), "rule__EDROOMDCLASSPackageFile__ElementAssignment_4");
					put(grammarAccess.getEDROOMDataClassAccess().getNameAssignment_2(), "rule__EDROOMDataClass__NameAssignment_2");
					put(grammarAccess.getEDROOMDataClassAccess().getInheritsAssignment_3_1(), "rule__EDROOMDataClass__InheritsAssignment_3_1");
					put(grammarAccess.getEDROOMDataClassAccess().getInheritsAssignment_3_2_1(), "rule__EDROOMDataClass__InheritsAssignment_3_2_1");
					put(grammarAccess.getEDROOMDataClassAccess().getVersionAssignment_5_0_2(), "rule__EDROOMDataClass__VersionAssignment_5_0_2");
					put(grammarAccess.getEDROOMDataClassAccess().getDefinitionsAssignment_5_1_0(), "rule__EDROOMDataClass__DefinitionsAssignment_5_1_0");
					put(grammarAccess.getEDROOMDataClassAccess().getFieldsAssignment_5_1_1(), "rule__EDROOMDataClass__FieldsAssignment_5_1_1");
					put(grammarAccess.getEDROOMDataDefinitionUnionAccess().getNameAssignment_2(), "rule__EDROOMDataDefinitionUnion__NameAssignment_2");
					put(grammarAccess.getEDROOMDataDefinitionUnionAccess().getElementsAssignment_4(), "rule__EDROOMDataDefinitionUnion__ElementsAssignment_4");
					put(grammarAccess.getEDROOMDataDefinitionUnionAccess().getElementsAssignment_5(), "rule__EDROOMDataDefinitionUnion__ElementsAssignment_5");
					put(grammarAccess.getEDROOMDataDefinitionUnionAccess().getElementsAssignment_6(), "rule__EDROOMDataDefinitionUnion__ElementsAssignment_6");
					put(grammarAccess.getEDROOMDataDefinitionEnumAccess().getNameAssignment_2(), "rule__EDROOMDataDefinitionEnum__NameAssignment_2");
					put(grammarAccess.getEDROOMDataDefinitionEnumAccess().getElementsAssignment_4(), "rule__EDROOMDataDefinitionEnum__ElementsAssignment_4");
					put(grammarAccess.getEDROOMDataDefinitionEnumAccess().getElementsAssignment_5_1(), "rule__EDROOMDataDefinitionEnum__ElementsAssignment_5_1");
					put(grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getNameAssignment_1(), "rule__EDROOMDataDefinitionEnumElement__NameAssignment_1");
					put(grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getValueAssignment_2_1(), "rule__EDROOMDataDefinitionEnumElement__ValueAssignment_2_1");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getTypeAssignment_1(), "rule__EDROOMDataDefinitionUnionElementBasic__TypeAssignment_1");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getNameAssignment_2(), "rule__EDROOMDataDefinitionUnionElementBasic__NameAssignment_2");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getTypeAssignment_1(), "rule__EDROOMDataDefinitionUnionElementBasicArray__TypeAssignment_1");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getNameAssignment_2(), "rule__EDROOMDataDefinitionUnionElementBasicArray__NameAssignment_2");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getElementsAssignment_4(), "rule__EDROOMDataDefinitionUnionElementBasicArray__ElementsAssignment_4");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getTypeAssignment_1(), "rule__EDROOMDataDefinitionUnionElementClass__TypeAssignment_1");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getNameAssignment_2(), "rule__EDROOMDataDefinitionUnionElementClass__NameAssignment_2");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getTypeAssignment_1(), "rule__EDROOMDataDefinitionUnionElementClassArray__TypeAssignment_1");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getNameAssignment_2(), "rule__EDROOMDataDefinitionUnionElementClassArray__NameAssignment_2");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getElementsAssignment_4(), "rule__EDROOMDataDefinitionUnionElementClassArray__ElementsAssignment_4");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getTypeAssignment_2(), "rule__EDROOMDataDefinitionUnionElementUnion__TypeAssignment_2");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getNameAssignment_3(), "rule__EDROOMDataDefinitionUnionElementUnion__NameAssignment_3");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getTypeAssignment_2(), "rule__EDROOMDataDefinitionUnionElementUnionArray__TypeAssignment_2");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getNameAssignment_3(), "rule__EDROOMDataDefinitionUnionElementUnionArray__NameAssignment_3");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getElementsAssignment_5(), "rule__EDROOMDataDefinitionUnionElementUnionArray__ElementsAssignment_5");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getTypeAssignment_2(), "rule__EDROOMDataDefinitionUnionElementEnum__TypeAssignment_2");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getNameAssignment_3(), "rule__EDROOMDataDefinitionUnionElementEnum__NameAssignment_3");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getTypeAssignment_2(), "rule__EDROOMDataDefinitionUnionElementEnumArray__TypeAssignment_2");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getNameAssignment_3(), "rule__EDROOMDataDefinitionUnionElementEnumArray__NameAssignment_3");
					put(grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getElementsAssignment_5(), "rule__EDROOMDataDefinitionUnionElementEnumArray__ElementsAssignment_5");
					put(grammarAccess.getEDROOMDataFieldBasicAccess().getTypeAssignment_1(), "rule__EDROOMDataFieldBasic__TypeAssignment_1");
					put(grammarAccess.getEDROOMDataFieldBasicAccess().getNameAssignment_2(), "rule__EDROOMDataFieldBasic__NameAssignment_2");
					put(grammarAccess.getEDROOMDataFieldBasicArrayAccess().getTypeAssignment_1(), "rule__EDROOMDataFieldBasicArray__TypeAssignment_1");
					put(grammarAccess.getEDROOMDataFieldBasicArrayAccess().getNameAssignment_2(), "rule__EDROOMDataFieldBasicArray__NameAssignment_2");
					put(grammarAccess.getEDROOMDataFieldBasicArrayAccess().getElementsAssignment_4(), "rule__EDROOMDataFieldBasicArray__ElementsAssignment_4");
					put(grammarAccess.getEDROOMDataFieldClassAccess().getTypeAssignment_1(), "rule__EDROOMDataFieldClass__TypeAssignment_1");
					put(grammarAccess.getEDROOMDataFieldClassAccess().getNameAssignment_2(), "rule__EDROOMDataFieldClass__NameAssignment_2");
					put(grammarAccess.getEDROOMDataFieldClassArrayAccess().getTypeAssignment_1(), "rule__EDROOMDataFieldClassArray__TypeAssignment_1");
					put(grammarAccess.getEDROOMDataFieldClassArrayAccess().getNameAssignment_2(), "rule__EDROOMDataFieldClassArray__NameAssignment_2");
					put(grammarAccess.getEDROOMDataFieldClassArrayAccess().getElementsAssignment_4(), "rule__EDROOMDataFieldClassArray__ElementsAssignment_4");
					put(grammarAccess.getEDROOMDataFieldUnionAccess().getTypeAssignment_2(), "rule__EDROOMDataFieldUnion__TypeAssignment_2");
					put(grammarAccess.getEDROOMDataFieldUnionAccess().getNameAssignment_3(), "rule__EDROOMDataFieldUnion__NameAssignment_3");
					put(grammarAccess.getEDROOMDataFieldUnionArrayAccess().getTypeAssignment_2(), "rule__EDROOMDataFieldUnionArray__TypeAssignment_2");
					put(grammarAccess.getEDROOMDataFieldUnionArrayAccess().getNameAssignment_3(), "rule__EDROOMDataFieldUnionArray__NameAssignment_3");
					put(grammarAccess.getEDROOMDataFieldUnionArrayAccess().getElementsAssignment_5(), "rule__EDROOMDataFieldUnionArray__ElementsAssignment_5");
					put(grammarAccess.getEDROOMDataFieldEnumAccess().getTypeAssignment_2(), "rule__EDROOMDataFieldEnum__TypeAssignment_2");
					put(grammarAccess.getEDROOMDataFieldEnumAccess().getNameAssignment_3(), "rule__EDROOMDataFieldEnum__NameAssignment_3");
					put(grammarAccess.getEDROOMDataFieldEnumArrayAccess().getTypeAssignment_2(), "rule__EDROOMDataFieldEnumArray__TypeAssignment_2");
					put(grammarAccess.getEDROOMDataFieldEnumArrayAccess().getNameAssignment_3(), "rule__EDROOMDataFieldEnumArray__NameAssignment_3");
					put(grammarAccess.getEDROOMDataFieldEnumArrayAccess().getElementsAssignment_5(), "rule__EDROOMDataFieldEnumArray__ElementsAssignment_5");
					put(grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5(), "rule__EDROOMDataClass__UnorderedGroup_5");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.contentassist.antlr.internal.InternalDCLASSParser typedParser = (es.uah.aut.srg.micobs.mclev.domain.edroom.lang.ui.contentassist.antlr.internal.InternalDCLASSParser) parser;
			typedParser.entryRuleEDROOMDCLASSPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DCLASSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DCLASSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
