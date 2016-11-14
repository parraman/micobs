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

import es.uah.aut.srg.micobs.mclev.lang.services.MCADGrammarAccess;

public class MCADParser extends AbstractContentAssistParser {
	
	@Inject
	private MCADGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalMCADParser createParser() {
		es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalMCADParser result = new es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalMCADParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMConnectionAccess().getAlternatives(), "rule__MConnection__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getMServiceLibraryInstanceAccess().getAlternatives(), "rule__MServiceLibraryInstance__Alternatives");
					put(grammarAccess.getMParameterValueAccess().getAlternatives(), "rule__MParameterValue__Alternatives");
					put(grammarAccess.getMParameterValueLiteralAccess().getAlternatives(), "rule__MParameterValueLiteral__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives(), "rule__MParameterValueExpressionOperators__Alternatives");
					put(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives(), "rule__MParameterValueTERMOperators__Alternatives");
					put(grammarAccess.getMMCLEVMCADPackageFileAccess().getGroup(), "rule__MMCLEVMCADPackageFile__Group__0");
					put(grammarAccess.getMMCLEVMCADPackageFileAccess().getGroup_3(), "rule__MMCLEVMCADPackageFile__Group_3__0");
					put(grammarAccess.getMMCADeploymentAccess().getGroup(), "rule__MMCADeployment__Group__0");
					put(grammarAccess.getMMCADeploymentAccess().getGroup_5_0(), "rule__MMCADeployment__Group_5_0__0");
					put(grammarAccess.getMMCADeploymentAccess().getGroup_5_1(), "rule__MMCADeployment__Group_5_1__0");
					put(grammarAccess.getMMCADeploymentAccess().getGroup_5_2(), "rule__MMCADeployment__Group_5_2__0");
					put(grammarAccess.getMMCADeploymentAccess().getGroup_5_3(), "rule__MMCADeployment__Group_5_3__0");
					put(grammarAccess.getMMCADeploymentAccess().getGroup_5_4(), "rule__MMCADeployment__Group_5_4__0");
					put(grammarAccess.getMMCADeploymentAccess().getGroup_5_5(), "rule__MMCADeployment__Group_5_5__0");
					put(grammarAccess.getMMCADeploymentAccess().getGroup_5_6(), "rule__MMCADeployment__Group_5_6__0");
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
					put(grammarAccess.getMCommonConnectionAccess().getGroup(), "rule__MCommonConnection__Group__0");
					put(grammarAccess.getMCommonConnectionAccess().getGroup_12(), "rule__MCommonConnection__Group_12__0");
					put(grammarAccess.getMConnectionSwitchAccess().getGroup(), "rule__MConnectionSwitch__Group__0");
					put(grammarAccess.getMConnectionSwitchCaseAccess().getGroup(), "rule__MConnectionSwitchCase__Group__0");
					put(grammarAccess.getMConnectionSwitchCaseAccess().getGroup_10(), "rule__MConnectionSwitchCase__Group_10__0");
					put(grammarAccess.getMComponentInstanceAccess().getGroup(), "rule__MComponentInstance__Group__0");
					put(grammarAccess.getMRegularServiceLibraryInstanceAccess().getGroup(), "rule__MRegularServiceLibraryInstance__Group__0");
					put(grammarAccess.getMDriverSLibInstanceAccess().getGroup(), "rule__MDriverSLibInstance__Group__0");
					put(grammarAccess.getMDriverSLibInstanceAccess().getGroup_4_0(), "rule__MDriverSLibInstance__Group_4_0__0");
					put(grammarAccess.getMDriverSLibInstanceAccess().getGroup_4_1(), "rule__MDriverSLibInstance__Group_4_1__0");
					put(grammarAccess.getMDeviceDriverMappingAccess().getGroup(), "rule__MDeviceDriverMapping__Group__0");
					put(grammarAccess.getMDeploymentAlternativeAccess().getGroup(), "rule__MDeploymentAlternative__Group__0");
					put(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_0(), "rule__MDeploymentAlternative__Group_5_0__0");
					put(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_0_4(), "rule__MDeploymentAlternative__Group_5_0_4__0");
					put(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_1(), "rule__MDeploymentAlternative__Group_5_1__0");
					put(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_2(), "rule__MDeploymentAlternative__Group_5_2__0");
					put(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_3(), "rule__MDeploymentAlternative__Group_5_3__0");
					put(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_4(), "rule__MDeploymentAlternative__Group_5_4__0");
					put(grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_5(), "rule__MDeploymentAlternative__Group_5_5__0");
					put(grammarAccess.getMDeploymentPlatformAccess().getGroup(), "rule__MDeploymentPlatform__Group__0");
					put(grammarAccess.getMDeploymentPlatformAccess().getGroup_4_0(), "rule__MDeploymentPlatform__Group_4_0__0");
					put(grammarAccess.getMDeploymentPlatformAccess().getGroup_4_1(), "rule__MDeploymentPlatform__Group_4_1__0");
					put(grammarAccess.getMDeploymentPlatformAccess().getGroup_4_2(), "rule__MDeploymentPlatform__Group_4_2__0");
					put(grammarAccess.getMDeployedDeviceAccess().getGroup(), "rule__MDeployedDevice__Group__0");
					put(grammarAccess.getMAttributeValueAssignmentAccess().getGroup(), "rule__MAttributeValueAssignment__Group__0");
					put(grammarAccess.getMParameterValueAssignmentAccess().getGroup(), "rule__MParameterValueAssignment__Group__0");
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
					put(grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageAssignment_1(), "rule__MMCLEVMCADPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMCLEVMCADPackageFileAccess().getImportsAssignment_3_1(), "rule__MMCLEVMCADPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMCLEVMCADPackageFileAccess().getElementAssignment_4(), "rule__MMCLEVMCADPackageFile__ElementAssignment_4");
					put(grammarAccess.getMMCADeploymentAccess().getDomainAssignment_2(), "rule__MMCADeployment__DomainAssignment_2");
					put(grammarAccess.getMMCADeploymentAccess().getNameAssignment_3(), "rule__MMCADeployment__NameAssignment_3");
					put(grammarAccess.getMMCADeploymentAccess().getVersionAssignment_5_0_2(), "rule__MMCADeployment__VersionAssignment_5_0_2");
					put(grammarAccess.getMMCADeploymentAccess().getAttributeValueAssignmentsAssignment_5_1_3(), "rule__MMCADeployment__AttributeValueAssignmentsAssignment_5_1_3");
					put(grammarAccess.getMMCADeploymentAccess().getDeploymentPlatformsAssignment_5_2_3(), "rule__MMCADeployment__DeploymentPlatformsAssignment_5_2_3");
					put(grammarAccess.getMMCADeploymentAccess().getDeploymentAlternativesAssignment_5_3_3(), "rule__MMCADeployment__DeploymentAlternativesAssignment_5_3_3");
					put(grammarAccess.getMMCADeploymentAccess().getComponentsAssignment_5_4_2(), "rule__MMCADeployment__ComponentsAssignment_5_4_2");
					put(grammarAccess.getMMCADeploymentAccess().getConnectionsAssignment_5_5_2(), "rule__MMCADeployment__ConnectionsAssignment_5_5_2");
					put(grammarAccess.getMMCADeploymentAccess().getLibrariesAssignment_5_6_2(), "rule__MMCADeployment__LibrariesAssignment_5_6_2");
					put(grammarAccess.getMCommonConnectionAccess().getClientInstanceAssignment_2(), "rule__MCommonConnection__ClientInstanceAssignment_2");
					put(grammarAccess.getMCommonConnectionAccess().getClientPortAssignment_4(), "rule__MCommonConnection__ClientPortAssignment_4");
					put(grammarAccess.getMCommonConnectionAccess().getServerInstanceAssignment_6(), "rule__MCommonConnection__ServerInstanceAssignment_6");
					put(grammarAccess.getMCommonConnectionAccess().getServerPortAssignment_8(), "rule__MCommonConnection__ServerPortAssignment_8");
					put(grammarAccess.getMCommonConnectionAccess().getConnectorAssignment_10(), "rule__MCommonConnection__ConnectorAssignment_10");
					put(grammarAccess.getMCommonConnectionAccess().getIfaceMappingAssignment_12_2(), "rule__MCommonConnection__IfaceMappingAssignment_12_2");
					put(grammarAccess.getMCommonConnectionAccess().getAttributeValueAssignmentsAssignment_13(), "rule__MCommonConnection__AttributeValueAssignmentsAssignment_13");
					put(grammarAccess.getMConnectionSwitchAccess().getClientInstanceAssignment_3(), "rule__MConnectionSwitch__ClientInstanceAssignment_3");
					put(grammarAccess.getMConnectionSwitchAccess().getClientPortAssignment_5(), "rule__MConnectionSwitch__ClientPortAssignment_5");
					put(grammarAccess.getMConnectionSwitchAccess().getCasesAssignment_8(), "rule__MConnectionSwitch__CasesAssignment_8");
					put(grammarAccess.getMConnectionSwitchCaseAccess().getAlternativeAssignment_2(), "rule__MConnectionSwitchCase__AlternativeAssignment_2");
					put(grammarAccess.getMConnectionSwitchCaseAccess().getServerInstanceAssignment_4(), "rule__MConnectionSwitchCase__ServerInstanceAssignment_4");
					put(grammarAccess.getMConnectionSwitchCaseAccess().getServerPortAssignment_6(), "rule__MConnectionSwitchCase__ServerPortAssignment_6");
					put(grammarAccess.getMConnectionSwitchCaseAccess().getConnectorAssignment_8(), "rule__MConnectionSwitchCase__ConnectorAssignment_8");
					put(grammarAccess.getMConnectionSwitchCaseAccess().getIfaceMappingAssignment_10_2(), "rule__MConnectionSwitchCase__IfaceMappingAssignment_10_2");
					put(grammarAccess.getMConnectionSwitchCaseAccess().getAttributeValueAssignmentsAssignment_11(), "rule__MConnectionSwitchCase__AttributeValueAssignmentsAssignment_11");
					put(grammarAccess.getMComponentInstanceAccess().getComponentAssignment_2(), "rule__MComponentInstance__ComponentAssignment_2");
					put(grammarAccess.getMComponentInstanceAccess().getNameAssignment_3(), "rule__MComponentInstance__NameAssignment_3");
					put(grammarAccess.getMComponentInstanceAccess().getAttributeValueAssignmentsAssignment_5(), "rule__MComponentInstance__AttributeValueAssignmentsAssignment_5");
					put(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryAssignment_1(), "rule__MRegularServiceLibraryInstance__LibraryAssignment_1");
					put(grammarAccess.getMRegularServiceLibraryInstanceAccess().getAttributeValueAssignmentsAssignment_3(), "rule__MRegularServiceLibraryInstance__AttributeValueAssignmentsAssignment_3");
					put(grammarAccess.getMDriverSLibInstanceAccess().getLibraryAssignment_2(), "rule__MDriverSLibInstance__LibraryAssignment_2");
					put(grammarAccess.getMDriverSLibInstanceAccess().getAttributeValueAssignmentsAssignment_4_0_3(), "rule__MDriverSLibInstance__AttributeValueAssignmentsAssignment_4_0_3");
					put(grammarAccess.getMDriverSLibInstanceAccess().getDeviceDriverMappingsAssignment_4_1_3(), "rule__MDriverSLibInstance__DeviceDriverMappingsAssignment_4_1_3");
					put(grammarAccess.getMDeviceDriverMappingAccess().getSupportedDeviceAssignment_2(), "rule__MDeviceDriverMapping__SupportedDeviceAssignment_2");
					put(grammarAccess.getMDeviceDriverMappingAccess().getDeployedDeviceAssignment_6(), "rule__MDeviceDriverMapping__DeployedDeviceAssignment_6");
					put(grammarAccess.getMDeploymentAlternativeAccess().getNameAssignment_3(), "rule__MDeploymentAlternative__NameAssignment_3");
					put(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_5_0_3(), "rule__MDeploymentAlternative__DeploymentPlatformsAssignment_5_0_3");
					put(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_5_0_4_1(), "rule__MDeploymentAlternative__DeploymentPlatformsAssignment_5_0_4_1");
					put(grammarAccess.getMDeploymentAlternativeAccess().getAttributeValueAssignmentsAssignment_5_1_3(), "rule__MDeploymentAlternative__AttributeValueAssignmentsAssignment_5_1_3");
					put(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentAlternativesAssignment_5_2_3(), "rule__MDeploymentAlternative__DeploymentAlternativesAssignment_5_2_3");
					put(grammarAccess.getMDeploymentAlternativeAccess().getComponentsAssignment_5_3_2(), "rule__MDeploymentAlternative__ComponentsAssignment_5_3_2");
					put(grammarAccess.getMDeploymentAlternativeAccess().getConnectionsAssignment_5_4_2(), "rule__MDeploymentAlternative__ConnectionsAssignment_5_4_2");
					put(grammarAccess.getMDeploymentAlternativeAccess().getLibrariesAssignment_5_5_2(), "rule__MDeploymentAlternative__LibrariesAssignment_5_5_2");
					put(grammarAccess.getMDeploymentPlatformAccess().getNameAssignment_2(), "rule__MDeploymentPlatform__NameAssignment_2");
					put(grammarAccess.getMDeploymentPlatformAccess().getPlatformAssignment_4_0_2(), "rule__MDeploymentPlatform__PlatformAssignment_4_0_2");
					put(grammarAccess.getMDeploymentPlatformAccess().getDeployedDevicesAssignment_4_1_3(), "rule__MDeploymentPlatform__DeployedDevicesAssignment_4_1_3");
					put(grammarAccess.getMDeploymentPlatformAccess().getParameterValueAssignmentsAssignment_4_2_3(), "rule__MDeploymentPlatform__ParameterValueAssignmentsAssignment_4_2_3");
					put(grammarAccess.getMDeployedDeviceAccess().getDeviceAssignment_1(), "rule__MDeployedDevice__DeviceAssignment_1");
					put(grammarAccess.getMDeployedDeviceAccess().getNameAssignment_2(), "rule__MDeployedDevice__NameAssignment_2");
					put(grammarAccess.getMDeployedDeviceAccess().getParameterValueAssignmentsAssignment_4(), "rule__MDeployedDevice__ParameterValueAssignmentsAssignment_4");
					put(grammarAccess.getMAttributeValueAssignmentAccess().getParameterAssignment_1(), "rule__MAttributeValueAssignment__ParameterAssignment_1");
					put(grammarAccess.getMAttributeValueAssignmentAccess().getParameterValueAssignment_3(), "rule__MAttributeValueAssignment__ParameterValueAssignment_3");
					put(grammarAccess.getMParameterValueAssignmentAccess().getParameterAssignment_1(), "rule__MParameterValueAssignment__ParameterAssignment_1");
					put(grammarAccess.getMParameterValueAssignmentAccess().getParameterValueAssignment_3(), "rule__MParameterValueAssignment__ParameterValueAssignment_3");
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
					put(grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5(), "rule__MMCADeployment__UnorderedGroup_5");
					put(grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4(), "rule__MDriverSLibInstance__UnorderedGroup_4");
					put(grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5(), "rule__MDeploymentAlternative__UnorderedGroup_5");
					put(grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4(), "rule__MDeploymentPlatform__UnorderedGroup_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalMCADParser typedParser = (es.uah.aut.srg.micobs.mclev.lang.ui.contentassist.antlr.internal.InternalMCADParser) parser;
			typedParser.entryRuleMMCLEVMCADPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MCADGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MCADGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
