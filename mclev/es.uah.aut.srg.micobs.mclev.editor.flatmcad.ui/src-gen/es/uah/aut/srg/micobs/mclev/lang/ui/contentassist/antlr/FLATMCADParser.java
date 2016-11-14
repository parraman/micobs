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
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.mclev.lang.services.FLATMCADGrammarAccess;

public class FLATMCADParser extends AbstractContentAssistParser {
	
	@Inject
	private FLATMCADGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalFLATMCADParser createParser() {
		es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalFLATMCADParser result = new es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalFLATMCADParser(null);
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
					put(grammarAccess.getMFlatServiceLibraryInstanceAccess().getAlternatives(), "rule__MFlatServiceLibraryInstance__Alternatives");
					put(grammarAccess.getMParameterValueAccess().getAlternatives(), "rule__MParameterValue__Alternatives");
					put(grammarAccess.getMParameterValueLiteralAccess().getAlternatives(), "rule__MParameterValueLiteral__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives(), "rule__MParameterValueExpressionOperators__Alternatives");
					put(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives(), "rule__MParameterValueTERMOperators__Alternatives");
					put(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getGroup(), "rule__MMCLEVFLATMCADPackageFile__Group__0");
					put(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getGroup_3(), "rule__MMCLEVFLATMCADPackageFile__Group_3__0");
					put(grammarAccess.getMFlatMCADAccess().getGroup(), "rule__MFlatMCAD__Group__0");
					put(grammarAccess.getMFlatMCADAccess().getGroup_4_0(), "rule__MFlatMCAD__Group_4_0__0");
					put(grammarAccess.getMFlatMCADAccess().getGroup_4_1(), "rule__MFlatMCAD__Group_4_1__0");
					put(grammarAccess.getMFlatMCADAccess().getGroup_4_2(), "rule__MFlatMCAD__Group_4_2__0");
					put(grammarAccess.getMFlatMCADTargetAccess().getGroup(), "rule__MFlatMCADTarget__Group__0");
					put(grammarAccess.getMFlatMCADTargetAccess().getGroup_1_0(), "rule__MFlatMCADTarget__Group_1_0__0");
					put(grammarAccess.getMFlatMCADTargetAccess().getGroup_1_1(), "rule__MFlatMCADTarget__Group_1_1__0");
					put(grammarAccess.getMFlatMCADTargetAccess().getGroup_3_0(), "rule__MFlatMCADTarget__Group_3_0__0");
					put(grammarAccess.getMFlatMCADTargetAccess().getGroup_3_1(), "rule__MFlatMCADTarget__Group_3_1__0");
					put(grammarAccess.getMFlatMCADTargetAccess().getGroup_3_2(), "rule__MFlatMCADTarget__Group_3_2__0");
					put(grammarAccess.getMFlatMCADTargetAccess().getGroup_3_3(), "rule__MFlatMCADTarget__Group_3_3__0");
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
					put(grammarAccess.getMFlatConnectionAccess().getGroup(), "rule__MFlatConnection__Group__0");
					put(grammarAccess.getMFlatConnectionAccess().getGroup_12(), "rule__MFlatConnection__Group_12__0");
					put(grammarAccess.getMFlatComponentInstanceAccess().getGroup(), "rule__MFlatComponentInstance__Group__0");
					put(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getGroup(), "rule__MRegularFlatServiceLibraryInstance__Group__0");
					put(grammarAccess.getMFlatDriverSLibInstanceAccess().getGroup(), "rule__MFlatDriverSLibInstance__Group__0");
					put(grammarAccess.getMFlatDriverSLibInstanceAccess().getGroup_4_0(), "rule__MFlatDriverSLibInstance__Group_4_0__0");
					put(grammarAccess.getMFlatDriverSLibInstanceAccess().getGroup_4_1(), "rule__MFlatDriverSLibInstance__Group_4_1__0");
					put(grammarAccess.getMFlatDeviceDriverMappingAccess().getGroup(), "rule__MFlatDeviceDriverMapping__Group__0");
					put(grammarAccess.getMAttributeValueAssignmentAccess().getGroup(), "rule__MAttributeValueAssignment__Group__0");
					put(grammarAccess.getMParameterValueBooleanLiteralAccess().getGroup(), "rule__MParameterValueBooleanLiteral__Group__0");
					put(grammarAccess.getMParameterValueStringLiteralAccess().getGroup(), "rule__MParameterValueStringLiteral__Group__0");
					put(grammarAccess.getMParameterValueIntegerLiteralAccess().getGroup(), "rule__MParameterValueIntegerLiteral__Group__0");
					put(grammarAccess.getMParameterValueRealLiteralAccess().getGroup(), "rule__MParameterValueRealLiteral__Group__0");
					put(grammarAccess.getMParameterValueRefObjectAccess().getGroup(), "rule__MParameterValueRefObject__Group__0");
					put(grammarAccess.getMParameterValuePARAccess().getGroup(), "rule__MParameterValuePAR__Group__0");
					put(grammarAccess.getMParameterValueExpressionAccess().getGroup(), "rule__MParameterValueExpression__Group__0");
					put(grammarAccess.getMParameterValueExpressionAccess().getGroup_2(), "rule__MParameterValueExpression__Group_2__0");
					put(grammarAccess.getMParameterValueTERMAccess().getGroup(), "rule__MParameterValueTERM__Group__0");
					put(grammarAccess.getMParameterValueTERMAccess().getGroup_2(), "rule__MParameterValueTERM__Group_2__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
					put(grammarAccess.getREALAccess().getGroup_1(), "rule__REAL__Group_1__0");
					put(grammarAccess.getREALAccess().getGroup_2(), "rule__REAL__Group_2__0");
					put(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageAssignment_1(), "rule__MMCLEVFLATMCADPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportsAssignment_3_1(), "rule__MMCLEVFLATMCADPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getElementAssignment_4(), "rule__MMCLEVFLATMCADPackageFile__ElementAssignment_4");
					put(grammarAccess.getMFlatMCADAccess().getNameAssignment_2(), "rule__MFlatMCAD__NameAssignment_2");
					put(grammarAccess.getMFlatMCADAccess().getVersionAssignment_4_0_2(), "rule__MFlatMCAD__VersionAssignment_4_0_2");
					put(grammarAccess.getMFlatMCADAccess().getReferencedElementAssignment_4_1_3(), "rule__MFlatMCAD__ReferencedElementAssignment_4_1_3");
					put(grammarAccess.getMFlatMCADAccess().getTargetsAssignment_4_2_3(), "rule__MFlatMCAD__TargetsAssignment_4_2_3");
					put(grammarAccess.getMFlatMCADTargetAccess().getDeploymentPlatformAssignment_1_0_1(), "rule__MFlatMCADTarget__DeploymentPlatformAssignment_1_0_1");
					put(grammarAccess.getMFlatMCADTargetAccess().getLeafDeploymentAlternativeAssignment_1_1_1(), "rule__MFlatMCADTarget__LeafDeploymentAlternativeAssignment_1_1_1");
					put(grammarAccess.getMFlatMCADTargetAccess().getAttributeValueAssignmentsAssignment_3_0_3(), "rule__MFlatMCADTarget__AttributeValueAssignmentsAssignment_3_0_3");
					put(grammarAccess.getMFlatMCADTargetAccess().getComponentsAssignment_3_1_2(), "rule__MFlatMCADTarget__ComponentsAssignment_3_1_2");
					put(grammarAccess.getMFlatMCADTargetAccess().getConnectionsAssignment_3_2_2(), "rule__MFlatMCADTarget__ConnectionsAssignment_3_2_2");
					put(grammarAccess.getMFlatMCADTargetAccess().getLibrariesAssignment_3_3_2(), "rule__MFlatMCADTarget__LibrariesAssignment_3_3_2");
					put(grammarAccess.getMFlatConnectionAccess().getClientInstanceAssignment_2(), "rule__MFlatConnection__ClientInstanceAssignment_2");
					put(grammarAccess.getMFlatConnectionAccess().getClientPortAssignment_4(), "rule__MFlatConnection__ClientPortAssignment_4");
					put(grammarAccess.getMFlatConnectionAccess().getServerInstanceAssignment_6(), "rule__MFlatConnection__ServerInstanceAssignment_6");
					put(grammarAccess.getMFlatConnectionAccess().getServerPortAssignment_8(), "rule__MFlatConnection__ServerPortAssignment_8");
					put(grammarAccess.getMFlatConnectionAccess().getConnectorAssignment_10(), "rule__MFlatConnection__ConnectorAssignment_10");
					put(grammarAccess.getMFlatConnectionAccess().getIfaceMappingAssignment_12_2(), "rule__MFlatConnection__IfaceMappingAssignment_12_2");
					put(grammarAccess.getMFlatConnectionAccess().getAttributeValueAssignmentsAssignment_13(), "rule__MFlatConnection__AttributeValueAssignmentsAssignment_13");
					put(grammarAccess.getMFlatComponentInstanceAccess().getComponentAssignment_2(), "rule__MFlatComponentInstance__ComponentAssignment_2");
					put(grammarAccess.getMFlatComponentInstanceAccess().getNameAssignment_3(), "rule__MFlatComponentInstance__NameAssignment_3");
					put(grammarAccess.getMFlatComponentInstanceAccess().getAttributeValueAssignmentsAssignment_5(), "rule__MFlatComponentInstance__AttributeValueAssignmentsAssignment_5");
					put(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryAssignment_1(), "rule__MRegularFlatServiceLibraryInstance__LibraryAssignment_1");
					put(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getAttributeValueAssignmentsAssignment_3(), "rule__MRegularFlatServiceLibraryInstance__AttributeValueAssignmentsAssignment_3");
					put(grammarAccess.getMFlatDriverSLibInstanceAccess().getLibraryAssignment_2(), "rule__MFlatDriverSLibInstance__LibraryAssignment_2");
					put(grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeValueAssignmentsAssignment_4_0_3(), "rule__MFlatDriverSLibInstance__AttributeValueAssignmentsAssignment_4_0_3");
					put(grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceDriverMappingsAssignment_4_1_3(), "rule__MFlatDriverSLibInstance__DeviceDriverMappingsAssignment_4_1_3");
					put(grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedDeviceAssignment_2(), "rule__MFlatDeviceDriverMapping__SupportedDeviceAssignment_2");
					put(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedDeviceAssignment_6(), "rule__MFlatDeviceDriverMapping__DeployedDeviceAssignment_6");
					put(grammarAccess.getMAttributeValueAssignmentAccess().getParameterAssignment_1(), "rule__MAttributeValueAssignment__ParameterAssignment_1");
					put(grammarAccess.getMAttributeValueAssignmentAccess().getParameterValueAssignment_3(), "rule__MAttributeValueAssignment__ParameterValueAssignment_3");
					put(grammarAccess.getMParameterValueBooleanLiteralAccess().getValueAssignment_1(), "rule__MParameterValueBooleanLiteral__ValueAssignment_1");
					put(grammarAccess.getMParameterValueStringLiteralAccess().getIsRawAssignment_1(), "rule__MParameterValueStringLiteral__IsRawAssignment_1");
					put(grammarAccess.getMParameterValueStringLiteralAccess().getValueAssignment_2(), "rule__MParameterValueStringLiteral__ValueAssignment_2");
					put(grammarAccess.getMParameterValueIntegerLiteralAccess().getValueAssignment_1(), "rule__MParameterValueIntegerLiteral__ValueAssignment_1");
					put(grammarAccess.getMParameterValueRealLiteralAccess().getValueAssignment_1(), "rule__MParameterValueRealLiteral__ValueAssignment_1");
					put(grammarAccess.getMParameterValueRefObjectAccess().getObjectAssignment_1(), "rule__MParameterValueRefObject__ObjectAssignment_1");
					put(grammarAccess.getMParameterValuePARAccess().getValueAssignment_1(), "rule__MParameterValuePAR__ValueAssignment_1");
					put(grammarAccess.getMParameterValueExpressionAccess().getLeftAssignment_1(), "rule__MParameterValueExpression__LeftAssignment_1");
					put(grammarAccess.getMParameterValueExpressionAccess().getOperationAssignment_2_0(), "rule__MParameterValueExpression__OperationAssignment_2_0");
					put(grammarAccess.getMParameterValueExpressionAccess().getRightAssignment_2_1(), "rule__MParameterValueExpression__RightAssignment_2_1");
					put(grammarAccess.getMParameterValueTERMAccess().getLeftAssignment_1(), "rule__MParameterValueTERM__LeftAssignment_1");
					put(grammarAccess.getMParameterValueTERMAccess().getOperationAssignment_2_0(), "rule__MParameterValueTERM__OperationAssignment_2_0");
					put(grammarAccess.getMParameterValueTERMAccess().getRightAssignment_2_1(), "rule__MParameterValueTERM__RightAssignment_2_1");
					put(grammarAccess.getMFlatMCADAccess().getUnorderedGroup_4(), "rule__MFlatMCAD__UnorderedGroup_4");
					put(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1(), "rule__MFlatMCADTarget__UnorderedGroup_1");
					put(grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3(), "rule__MFlatMCADTarget__UnorderedGroup_3");
					put(grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4(), "rule__MFlatDriverSLibInstance__UnorderedGroup_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalFLATMCADParser typedParser = (es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalFLATMCADParser) parser;
			typedParser.entryRuleMMCLEVFLATMCADPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FLATMCADGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FLATMCADGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
