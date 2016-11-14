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

import es.uah.aut.srg.micobs.mesp.lang.services.DEPGrammarAccess;

public class DEPParser extends AbstractContentAssistParser {
	
	@Inject
	private DEPGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalDEPParser createParser() {
		es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalDEPParser result = new es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalDEPParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMResourceDemandAccess().getAlternatives(), "rule__MResourceDemand__Alternatives");
					put(grammarAccess.getVersionAccess().getAlternatives_0(), "rule__Version__Alternatives_0");
					put(grammarAccess.getVersionAccess().getAlternatives_1_1(), "rule__Version__Alternatives_1_1");
					put(grammarAccess.getMMESPSwPackageDeploymentAccess().getAlternatives(), "rule__MMESPSwPackageDeployment__Alternatives");
					put(grammarAccess.getMParameterValueAccess().getAlternatives(), "rule__MParameterValue__Alternatives");
					put(grammarAccess.getMParameterValueLiteralAccess().getAlternatives(), "rule__MParameterValueLiteral__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getINTEGERAccess().getAlternatives(), "rule__INTEGER__Alternatives");
					put(grammarAccess.getMParameterValueExpressionOperatorsAccess().getAlternatives(), "rule__MParameterValueExpressionOperators__Alternatives");
					put(grammarAccess.getMParameterValueTERMOperatorsAccess().getAlternatives(), "rule__MParameterValueTERMOperators__Alternatives");
					put(grammarAccess.getMMESPDEPPackageFileAccess().getGroup(), "rule__MMESPDEPPackageFile__Group__0");
					put(grammarAccess.getMMESPDEPPackageFileAccess().getGroup_3(), "rule__MMESPDEPPackageFile__Group_3__0");
					put(grammarAccess.getMMESPDeploymentAccess().getGroup(), "rule__MMESPDeployment__Group__0");
					put(grammarAccess.getMMESPDeploymentAccess().getGroup_5_0(), "rule__MMESPDeployment__Group_5_0__0");
					put(grammarAccess.getMMESPDeploymentAccess().getGroup_5_1(), "rule__MMESPDeployment__Group_5_1__0");
					put(grammarAccess.getMMESPDeploymentAccess().getGroup_5_2(), "rule__MMESPDeployment__Group_5_2__0");
					put(grammarAccess.getMMESPDeploymentAccess().getGroup_5_2_3(), "rule__MMESPDeployment__Group_5_2_3__0");
					put(grammarAccess.getMMESPDeploymentAccess().getGroup_5_3(), "rule__MMESPDeployment__Group_5_3__0");
					put(grammarAccess.getMMESPDeploymentAccess().getGroup_5_4(), "rule__MMESPDeployment__Group_5_4__0");
					put(grammarAccess.getMMESPDeploymentAccess().getGroup_5_5(), "rule__MMESPDeployment__Group_5_5__0");
					put(grammarAccess.getMMESPDeploymentAccess().getGroup_5_6(), "rule__MMESPDeployment__Group_5_6__0");
					put(grammarAccess.getMSwPackageRequiredInterfaceAccess().getGroup(), "rule__MSwPackageRequiredInterface__Group__0");
					put(grammarAccess.getMInstantiableResourceDemandAccess().getGroup(), "rule__MInstantiableResourceDemand__Group__0");
					put(grammarAccess.getMQuantifiableResourceDemandAccess().getGroup(), "rule__MQuantifiableResourceDemand__Group__0");
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
					put(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getGroup(), "rule__MMESPRegularSwPackageDeployment__Group__0");
					put(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getGroup(), "rule__MMESPDriverSwPackageDeployment__Group__0");
					put(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getGroup_4_0(), "rule__MMESPDriverSwPackageDeployment__Group_4_0__0");
					put(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getGroup_4_1(), "rule__MMESPDriverSwPackageDeployment__Group_4_1__0");
					put(grammarAccess.getMMESPDeviceDriverMappingAccess().getGroup(), "rule__MMESPDeviceDriverMapping__Group__0");
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
					put(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup(), "rule__MMESPDeploymentPlatform__Group__0");
					put(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_0(), "rule__MMESPDeploymentPlatform__Group_4_0__0");
					put(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_1(), "rule__MMESPDeploymentPlatform__Group_4_1__0");
					put(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_2(), "rule__MMESPDeploymentPlatform__Group_4_2__0");
					put(grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_3(), "rule__MMESPDeploymentPlatform__Group_4_3__0");
					put(grammarAccess.getMMESPDeployedDeviceAccess().getGroup(), "rule__MMESPDeployedDevice__Group__0");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup(), "rule__MMESPDeploymentAlternative__Group__0");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_0(), "rule__MMESPDeploymentAlternative__Group_4_0__0");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_0_4(), "rule__MMESPDeploymentAlternative__Group_4_0_4__0");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_1(), "rule__MMESPDeploymentAlternative__Group_4_1__0");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_1_3(), "rule__MMESPDeploymentAlternative__Group_4_1_3__0");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_2(), "rule__MMESPDeploymentAlternative__Group_4_2__0");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_3(), "rule__MMESPDeploymentAlternative__Group_4_3__0");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_4(), "rule__MMESPDeploymentAlternative__Group_4_4__0");
					put(grammarAccess.getINTEGERAccess().getGroup_0(), "rule__INTEGER__Group_0__0");
					put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
					put(grammarAccess.getREALAccess().getGroup_1(), "rule__REAL__Group_1__0");
					put(grammarAccess.getREALAccess().getGroup_2(), "rule__REAL__Group_2__0");
					put(grammarAccess.getMMESPDEPPackageFileAccess().getPackageAssignment_1(), "rule__MMESPDEPPackageFile__PackageAssignment_1");
					put(grammarAccess.getMMESPDEPPackageFileAccess().getImportsAssignment_3_1(), "rule__MMESPDEPPackageFile__ImportsAssignment_3_1");
					put(grammarAccess.getMMESPDEPPackageFileAccess().getElementAssignment_4(), "rule__MMESPDEPPackageFile__ElementAssignment_4");
					put(grammarAccess.getMMESPDeploymentAccess().getNameAssignment_3(), "rule__MMESPDeployment__NameAssignment_3");
					put(grammarAccess.getMMESPDeploymentAccess().getVersionAssignment_5_0_2(), "rule__MMESPDeployment__VersionAssignment_5_0_2");
					put(grammarAccess.getMMESPDeploymentAccess().getCtoolAssignment_5_1_3(), "rule__MMESPDeployment__CtoolAssignment_5_1_3");
					put(grammarAccess.getMMESPDeploymentAccess().getLanguagesAssignment_5_2_2(), "rule__MMESPDeployment__LanguagesAssignment_5_2_2");
					put(grammarAccess.getMMESPDeploymentAccess().getLanguagesAssignment_5_2_3_1(), "rule__MMESPDeployment__LanguagesAssignment_5_2_3_1");
					put(grammarAccess.getMMESPDeploymentAccess().getDeploymentPlatformsAssignment_5_3_3(), "rule__MMESPDeployment__DeploymentPlatformsAssignment_5_3_3");
					put(grammarAccess.getMMESPDeploymentAccess().getRequiresAssignment_5_4_3(), "rule__MMESPDeployment__RequiresAssignment_5_4_3");
					put(grammarAccess.getMMESPDeploymentAccess().getDeployedSwPackagesAssignment_5_5_2(), "rule__MMESPDeployment__DeployedSwPackagesAssignment_5_5_2");
					put(grammarAccess.getMMESPDeploymentAccess().getDeploymentAlternativesAssignment_5_6_3(), "rule__MMESPDeployment__DeploymentAlternativesAssignment_5_6_3");
					put(grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceAssignment_1(), "rule__MSwPackageRequiredInterface__InterfaceAssignment_1");
					put(grammarAccess.getMSwPackageRequiredInterfaceAccess().getResourceDemandsAssignment_3(), "rule__MSwPackageRequiredInterface__ResourceDemandsAssignment_3");
					put(grammarAccess.getMInstantiableResourceDemandAccess().getResourceAssignment_2(), "rule__MInstantiableResourceDemand__ResourceAssignment_2");
					put(grammarAccess.getMInstantiableResourceDemandAccess().getNameAssignment_3(), "rule__MInstantiableResourceDemand__NameAssignment_3");
					put(grammarAccess.getMInstantiableResourceDemandAccess().getParameterValueAssignmentsAssignment_5(), "rule__MInstantiableResourceDemand__ParameterValueAssignmentsAssignment_5");
					put(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceAssignment_3(), "rule__MQuantifiableResourceDemand__ResourceAssignment_3");
					put(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceValueAssignment_5(), "rule__MQuantifiableResourceDemand__ResourceValueAssignment_5");
					put(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwPackageAssignment_2(), "rule__MMESPRegularSwPackageDeployment__SwPackageAssignment_2");
					put(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getParameterValueAssignmentsAssignment_4(), "rule__MMESPRegularSwPackageDeployment__ParameterValueAssignmentsAssignment_4");
					put(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSwPackageAssignment_2(), "rule__MMESPDriverSwPackageDeployment__SwPackageAssignment_2");
					put(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterValueAssignmentsAssignment_4_0_3(), "rule__MMESPDriverSwPackageDeployment__ParameterValueAssignmentsAssignment_4_0_3");
					put(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceDriverMappingsAssignment_4_1_3(), "rule__MMESPDriverSwPackageDeployment__DeviceDriverMappingsAssignment_4_1_3");
					put(grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedDeviceAssignment_2(), "rule__MMESPDeviceDriverMapping__SupportedDeviceAssignment_2");
					put(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedDeviceAssignment_6(), "rule__MMESPDeviceDriverMapping__DeployedDeviceAssignment_6");
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
					put(grammarAccess.getMMESPDeploymentPlatformAccess().getNameAssignment_2(), "rule__MMESPDeploymentPlatform__NameAssignment_2");
					put(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformAssignment_4_0_2(), "rule__MMESPDeploymentPlatform__PlatformAssignment_4_0_2");
					put(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformSwPackageAssignment_4_1_2(), "rule__MMESPDeploymentPlatform__PlatformSwPackageAssignment_4_1_2");
					put(grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedDevicesAssignment_4_2_3(), "rule__MMESPDeploymentPlatform__DeployedDevicesAssignment_4_2_3");
					put(grammarAccess.getMMESPDeploymentPlatformAccess().getParameterValueAssignmentsAssignment_4_3_3(), "rule__MMESPDeploymentPlatform__ParameterValueAssignmentsAssignment_4_3_3");
					put(grammarAccess.getMMESPDeployedDeviceAccess().getDeviceAssignment_1(), "rule__MMESPDeployedDevice__DeviceAssignment_1");
					put(grammarAccess.getMMESPDeployedDeviceAccess().getNameAssignment_2(), "rule__MMESPDeployedDevice__NameAssignment_2");
					put(grammarAccess.getMMESPDeployedDeviceAccess().getParameterValueAssignmentsAssignment_4(), "rule__MMESPDeployedDevice__ParameterValueAssignmentsAssignment_4");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getNameAssignment_2(), "rule__MMESPDeploymentAlternative__NameAssignment_2");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_4_0_3(), "rule__MMESPDeploymentAlternative__DeploymentPlatformsAssignment_4_0_3");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_4_0_4_1(), "rule__MMESPDeploymentAlternative__DeploymentPlatformsAssignment_4_0_4_1");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesAssignment_4_1_2(), "rule__MMESPDeploymentAlternative__LanguagesAssignment_4_1_2");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesAssignment_4_1_3_1(), "rule__MMESPDeploymentAlternative__LanguagesAssignment_4_1_3_1");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeployedSwPackagesAssignment_4_2_2(), "rule__MMESPDeploymentAlternative__DeployedSwPackagesAssignment_4_2_2");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiresAssignment_4_3_3(), "rule__MMESPDeploymentAlternative__RequiresAssignment_4_3_3");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentAlternativesAssignment_4_4_3(), "rule__MMESPDeploymentAlternative__DeploymentAlternativesAssignment_4_4_3");
					put(grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5(), "rule__MMESPDeployment__UnorderedGroup_5");
					put(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4(), "rule__MMESPDriverSwPackageDeployment__UnorderedGroup_4");
					put(grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4(), "rule__MMESPDeploymentPlatform__UnorderedGroup_4");
					put(grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4(), "rule__MMESPDeploymentAlternative__UnorderedGroup_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalDEPParser typedParser = (es.uah.aut.srg.micobs.mesp.lang.ui.contentassist.antlr.internal.InternalDEPParser) parser;
			typedParser.entryRuleMMESPDEPPackageFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DEPGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DEPGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
