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
package es.uah.aut.srg.micobs.mclev.lang.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;

import es.uah.aut.srg.micobs.mclev.lang.services.MCADGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class MCADParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private MCADGrammarAccess grammarAccess;
	
	@Override
	protected AbstractToken getRootToken(IEObjectConsumer inst) {
		return new ThisRootNode(inst);	
	}
	
protected class ThisRootNode extends RootToken {
	public ThisRootNode(IEObjectConsumer inst) {
		super(inst);
	}
	
	@Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVMCADPackageFile_Group(this, this, 0, inst);
			case 1: return new MMCLEVMCADPackageElement_MMCADeploymentParserRuleCall(this, this, 1, inst);
			case 2: return new MMCADeployment_Group(this, this, 2, inst);
			case 3: return new MConnection_Alternatives(this, this, 3, inst);
			case 4: return new MCommonConnection_Group(this, this, 4, inst);
			case 5: return new MConnectionSwitch_Group(this, this, 5, inst);
			case 6: return new MConnectionSwitchCase_Group(this, this, 6, inst);
			case 7: return new MComponentInstance_Group(this, this, 7, inst);
			case 8: return new MServiceLibraryInstance_Alternatives(this, this, 8, inst);
			case 9: return new MRegularServiceLibraryInstance_Group(this, this, 9, inst);
			case 10: return new MDriverSLibInstance_Group(this, this, 10, inst);
			case 11: return new MDeviceDriverMapping_Group(this, this, 11, inst);
			case 12: return new MDeploymentAlternative_Group(this, this, 12, inst);
			case 13: return new MDeploymentPlatform_Group(this, this, 13, inst);
			case 14: return new MDeployedDevice_Group(this, this, 14, inst);
			case 15: return new MAttributeValueAssignment_Group(this, this, 15, inst);
			case 16: return new MParameterValueAssignment_Group(this, this, 16, inst);
			case 17: return new MParameterValue_Alternatives(this, this, 17, inst);
			case 18: return new MParameterValueLiteral_Alternatives(this, this, 18, inst);
			case 19: return new MParameterValueBooleanLiteral_Group(this, this, 19, inst);
			case 20: return new MParameterValueStringLiteral_Group(this, this, 20, inst);
			case 21: return new MParameterValueIntegerLiteral_Group(this, this, 21, inst);
			case 22: return new MParameterValueRealLiteral_Group(this, this, 22, inst);
			case 23: return new MParameterValueRefObject_Group(this, this, 23, inst);
			case 24: return new MParameterValuePAR_Group(this, this, 24, inst);
			case 25: return new MParameterValueExpression_Group(this, this, 25, inst);
			case 26: return new MParameterValueTERM_Group(this, this, 26, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MMCLEVMCADPackageFile ****************
 *
 * MMCLEVMCADPackageFile:
 * 	'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
 * 	imports+=[common::MCommonPackage|QualifiedName] ';')*
 * 	element=MMCLEVMCADPackageElement;
 *
 **/

// 'package' package=[mclevlibrary::MMCLEVPackage|QualifiedName] ';' ('import'
// imports+=[common::MCommonPackage|QualifiedName] ';')* element=MMCLEVMCADPackageElement
protected class MMCLEVMCADPackageFile_Group extends GroupToken {
	
	public MMCLEVMCADPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVMCADPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVMCADPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMCLEVMCADPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'package'
protected class MMCLEVMCADPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MMCLEVMCADPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[mclevlibrary::MMCLEVPackage|QualifiedName]
protected class MMCLEVMCADPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MMCLEVMCADPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVMCADPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVMCADPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMCLEVMCADPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MMCLEVMCADPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVMCADPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVMCADPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('import' imports+=[common::MCommonPackage|QualifiedName] ';')*
protected class MMCLEVMCADPackageFile_Group_3 extends GroupToken {
	
	public MMCLEVMCADPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVMCADPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVMCADPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'import'
protected class MMCLEVMCADPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MMCLEVMCADPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVMCADPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVMCADPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCLEVMCADPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[common::MCommonPackage|QualifiedName]
protected class MMCLEVMCADPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MMCLEVMCADPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVMCADPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVMCADPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVMCADPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVMCADPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMCLEVMCADPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MMCLEVMCADPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVMCADPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVMCADPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MMCLEVMCADPackageElement
protected class MMCLEVMCADPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MMCLEVMCADPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVMCADPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVMCADPackageElement_MMCADeploymentParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVMCADPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCLEVMCADPackageFileAccess().getElementMMCLEVMCADPackageElementParserRuleCall_4_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MMCLEVMCADPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCLEVMCADPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MMCLEVMCADPackageFile ****************/


/************ begin Rule MMCLEVMCADPackageElement ****************
 *
 * MMCLEVMCADPackageElement:
 * 	MMCADeployment;
 *
 **/

// MMCADeployment
protected class MMCLEVMCADPackageElement_MMCADeploymentParserRuleCall extends RuleCallToken {
	
	public MMCLEVMCADPackageElement_MMCADeploymentParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMCLEVMCADPackageElementAccess().getMMCADeploymentParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMCADeploymentRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MMCADeployment_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule MMCLEVMCADPackageElement ****************/


/************ begin Rule MMCADeployment ****************
 *
 * MMCADeployment:
 * 	'deployment' 'project'
 * 	domain=[mclevdom::MDomain|VersionedQualifiedName] name=ID
 * 	'{' ('version' ':=' version=Version ';' & ('attribute' 'values'
 * 	'{'
 * 	attributeValueAssignments+=MAttributeValueAssignment+
 * 	'}' ';')?
 * 	& ('deployment' 'platforms'
 * 	'{'
 * 	deploymentPlatforms+=MDeploymentPlatform+
 * 	'}' ';')?
 * 	& ('deployment' 'alternatives'
 * 	'{'
 * 	deploymentAlternatives+=MDeploymentAlternative+
 * 	'}' ';')?
 * 	& ('components'
 * 	'{'
 * 	components+=MComponentInstance+
 * 	'}' ';')?
 * 	& ('connections'
 * 	'{'
 * 	connections+=MConnection+
 * 	'}' ';')?
 * 	& ('libraries'
 * 	'{'
 * 	libraries+=MServiceLibraryInstance+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// 'deployment' 'project' domain=[mclevdom::MDomain|VersionedQualifiedName] name=ID '{' ('version' ':=' version=Version ';'
// & ('attribute' 'values' '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')? & ('deployment' 'platforms'
// '{' deploymentPlatforms+=MDeploymentPlatform+ '}' ';')? & ('deployment' 'alternatives' '{'
// deploymentAlternatives+=MDeploymentAlternative+ '}' ';')? & ('components' '{' components+=MComponentInstance+ '}' ';')?
// & ('connections' '{' connections+=MConnection+ '}' ';')? & ('libraries' '{' libraries+=MServiceLibraryInstance+ '}'
// ';')?) '}' ';'
protected class MMCADeployment_Group extends GroupToken {
	
	public MMCADeployment_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMCADeploymentRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'deployment'
protected class MMCADeployment_DeploymentKeyword_0 extends KeywordToken  {
	
	public MMCADeployment_DeploymentKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'project'
protected class MMCADeployment_ProjectKeyword_1 extends KeywordToken  {
	
	public MMCADeployment_ProjectKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getProjectKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_DeploymentKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// domain=[mclevdom::MDomain|VersionedQualifiedName]
protected class MMCADeployment_DomainAssignment_2 extends AssignmentToken  {
	
	public MMCADeployment_DomainAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getDomainAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_ProjectKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("domain",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("domain");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCADeploymentAccess().getDomainMDomainCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCADeploymentAccess().getDomainMDomainCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MMCADeployment_NameAssignment_3 extends AssignmentToken  {
	
	public MMCADeployment_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_DomainAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMMCADeploymentAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMMCADeploymentAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MMCADeployment_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MMCADeployment_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('version' ':=' version=Version ';' & ('attribute' 'values' '{' attributeValueAssignments+=MAttributeValueAssignment+
// '}' ';')? & ('deployment' 'platforms' '{' deploymentPlatforms+=MDeploymentPlatform+ '}' ';')? & ('deployment'
// 'alternatives' '{' deploymentAlternatives+=MDeploymentAlternative+ '}' ';')? & ('components' '{'
// components+=MComponentInstance+ '}' ';')? & ('connections' '{' connections+=MConnection+ '}' ';')? & ('libraries' '{'
// libraries+=MServiceLibraryInstance+ '}' ';')?)
protected class MMCADeployment_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MMCADeployment_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_Group_5_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCADeployment_Group_5_5(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMCADeployment_Group_5_4(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MMCADeployment_Group_5_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MMCADeployment_Group_5_2(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MMCADeployment_Group_5_1(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MMCADeployment_Group_5_0(lastRuleCallOrigin, this, 6, inst);
			default: return null;
		}	
	}

}

// 'version' ':=' version=Version ';'
protected class MMCADeployment_Group_5_0 extends GroupToken {
	
	public MMCADeployment_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'version'
protected class MMCADeployment_VersionKeyword_5_0_0 extends KeywordToken  {
	
	public MMCADeployment_VersionKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getVersionKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MMCADeployment_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public MMCADeployment_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_VersionKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MMCADeployment_VersionAssignment_5_0_2 extends AssignmentToken  {
	
	public MMCADeployment_VersionAssignment_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getVersionAssignment_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMMCADeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMMCADeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0();
			return obj;
		}
		return null;
	}

}

// ';'
protected class MMCADeployment_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public MMCADeployment_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_VersionAssignment_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('attribute' 'values' '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')?
protected class MMCADeployment_Group_5_1 extends GroupToken {
	
	public MMCADeployment_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_SemicolonKeyword_5_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'attribute'
protected class MMCADeployment_AttributeKeyword_5_1_0 extends KeywordToken  {
	
	public MMCADeployment_AttributeKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getAttributeKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'values'
protected class MMCADeployment_ValuesKeyword_5_1_1 extends KeywordToken  {
	
	public MMCADeployment_ValuesKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getValuesKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_AttributeKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMCADeployment_LeftCurlyBracketKeyword_5_1_2 extends KeywordToken  {
	
	public MMCADeployment_LeftCurlyBracketKeyword_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_ValuesKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MAttributeValueAssignment+
protected class MMCADeployment_AttributeValueAssignmentsAssignment_5_1_3 extends AssignmentToken  {
	
	public MMCADeployment_AttributeValueAssignmentsAssignment_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getAttributeValueAssignmentsAssignment_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAttributeValueAssignment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAttributeValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCADeploymentAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MMCADeployment_AttributeValueAssignmentsAssignment_5_1_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCADeployment_LeftCurlyBracketKeyword_5_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMCADeployment_RightCurlyBracketKeyword_5_1_4 extends KeywordToken  {
	
	public MMCADeployment_RightCurlyBracketKeyword_5_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_AttributeValueAssignmentsAssignment_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMCADeployment_SemicolonKeyword_5_1_5 extends KeywordToken  {
	
	public MMCADeployment_SemicolonKeyword_5_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_RightCurlyBracketKeyword_5_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('deployment' 'platforms' '{' deploymentPlatforms+=MDeploymentPlatform+ '}' ';')?
protected class MMCADeployment_Group_5_2 extends GroupToken {
	
	public MMCADeployment_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_SemicolonKeyword_5_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'deployment'
protected class MMCADeployment_DeploymentKeyword_5_2_0 extends KeywordToken  {
	
	public MMCADeployment_DeploymentKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCADeployment_Group_5_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'platforms'
protected class MMCADeployment_PlatformsKeyword_5_2_1 extends KeywordToken  {
	
	public MMCADeployment_PlatformsKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getPlatformsKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_DeploymentKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMCADeployment_LeftCurlyBracketKeyword_5_2_2 extends KeywordToken  {
	
	public MMCADeployment_LeftCurlyBracketKeyword_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_PlatformsKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deploymentPlatforms+=MDeploymentPlatform+
protected class MMCADeployment_DeploymentPlatformsAssignment_5_2_3 extends AssignmentToken  {
	
	public MMCADeployment_DeploymentPlatformsAssignment_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getDeploymentPlatformsAssignment_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deploymentPlatforms",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deploymentPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDeploymentPlatformRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCADeploymentAccess().getDeploymentPlatformsMDeploymentPlatformParserRuleCall_5_2_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MMCADeployment_DeploymentPlatformsAssignment_5_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCADeployment_LeftCurlyBracketKeyword_5_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMCADeployment_RightCurlyBracketKeyword_5_2_4 extends KeywordToken  {
	
	public MMCADeployment_RightCurlyBracketKeyword_5_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_DeploymentPlatformsAssignment_5_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMCADeployment_SemicolonKeyword_5_2_5 extends KeywordToken  {
	
	public MMCADeployment_SemicolonKeyword_5_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_RightCurlyBracketKeyword_5_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('deployment' 'alternatives' '{' deploymentAlternatives+=MDeploymentAlternative+ '}' ';')?
protected class MMCADeployment_Group_5_3 extends GroupToken {
	
	public MMCADeployment_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_SemicolonKeyword_5_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'deployment'
protected class MMCADeployment_DeploymentKeyword_5_3_0 extends KeywordToken  {
	
	public MMCADeployment_DeploymentKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getDeploymentKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCADeployment_Group_5_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMCADeployment_Group_5_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// 'alternatives'
protected class MMCADeployment_AlternativesKeyword_5_3_1 extends KeywordToken  {
	
	public MMCADeployment_AlternativesKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getAlternativesKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_DeploymentKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMCADeployment_LeftCurlyBracketKeyword_5_3_2 extends KeywordToken  {
	
	public MMCADeployment_LeftCurlyBracketKeyword_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_AlternativesKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deploymentAlternatives+=MDeploymentAlternative+
protected class MMCADeployment_DeploymentAlternativesAssignment_5_3_3 extends AssignmentToken  {
	
	public MMCADeployment_DeploymentAlternativesAssignment_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getDeploymentAlternativesAssignment_5_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deploymentAlternatives",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deploymentAlternatives");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDeploymentAlternativeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCADeploymentAccess().getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_3_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MMCADeployment_DeploymentAlternativesAssignment_5_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCADeployment_LeftCurlyBracketKeyword_5_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMCADeployment_RightCurlyBracketKeyword_5_3_4 extends KeywordToken  {
	
	public MMCADeployment_RightCurlyBracketKeyword_5_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_DeploymentAlternativesAssignment_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMCADeployment_SemicolonKeyword_5_3_5 extends KeywordToken  {
	
	public MMCADeployment_SemicolonKeyword_5_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_RightCurlyBracketKeyword_5_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('components' '{' components+=MComponentInstance+ '}' ';')?
protected class MMCADeployment_Group_5_4 extends GroupToken {
	
	public MMCADeployment_Group_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getGroup_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_SemicolonKeyword_5_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'components'
protected class MMCADeployment_ComponentsKeyword_5_4_0 extends KeywordToken  {
	
	public MMCADeployment_ComponentsKeyword_5_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getComponentsKeyword_5_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCADeployment_Group_5_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMCADeployment_Group_5_1(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MMCADeployment_Group_5_0(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMCADeployment_LeftCurlyBracketKeyword_5_4_1 extends KeywordToken  {
	
	public MMCADeployment_LeftCurlyBracketKeyword_5_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_ComponentsKeyword_5_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// components+=MComponentInstance+
protected class MMCADeployment_ComponentsAssignment_5_4_2 extends AssignmentToken  {
	
	public MMCADeployment_ComponentsAssignment_5_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getComponentsAssignment_5_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponentInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("components",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("components");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMComponentInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCADeploymentAccess().getComponentsMComponentInstanceParserRuleCall_5_4_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MMCADeployment_ComponentsAssignment_5_4_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCADeployment_LeftCurlyBracketKeyword_5_4_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMCADeployment_RightCurlyBracketKeyword_5_4_3 extends KeywordToken  {
	
	public MMCADeployment_RightCurlyBracketKeyword_5_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_ComponentsAssignment_5_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMCADeployment_SemicolonKeyword_5_4_4 extends KeywordToken  {
	
	public MMCADeployment_SemicolonKeyword_5_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_RightCurlyBracketKeyword_5_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('connections' '{' connections+=MConnection+ '}' ';')?
protected class MMCADeployment_Group_5_5 extends GroupToken {
	
	public MMCADeployment_Group_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getGroup_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_SemicolonKeyword_5_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'connections'
protected class MMCADeployment_ConnectionsKeyword_5_5_0 extends KeywordToken  {
	
	public MMCADeployment_ConnectionsKeyword_5_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getConnectionsKeyword_5_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_Group_5_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCADeployment_Group_5_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMCADeployment_Group_5_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MMCADeployment_Group_5_1(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MMCADeployment_Group_5_0(lastRuleCallOrigin, this, 4, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMCADeployment_LeftCurlyBracketKeyword_5_5_1 extends KeywordToken  {
	
	public MMCADeployment_LeftCurlyBracketKeyword_5_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_ConnectionsKeyword_5_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// connections+=MConnection+
protected class MMCADeployment_ConnectionsAssignment_5_5_2 extends AssignmentToken  {
	
	public MMCADeployment_ConnectionsAssignment_5_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getConnectionsAssignment_5_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnection_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("connections",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("connections");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCADeploymentAccess().getConnectionsMConnectionParserRuleCall_5_5_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MMCADeployment_ConnectionsAssignment_5_5_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCADeployment_LeftCurlyBracketKeyword_5_5_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMCADeployment_RightCurlyBracketKeyword_5_5_3 extends KeywordToken  {
	
	public MMCADeployment_RightCurlyBracketKeyword_5_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_ConnectionsAssignment_5_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMCADeployment_SemicolonKeyword_5_5_4 extends KeywordToken  {
	
	public MMCADeployment_SemicolonKeyword_5_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_RightCurlyBracketKeyword_5_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('libraries' '{' libraries+=MServiceLibraryInstance+ '}' ';')?
protected class MMCADeployment_Group_5_6 extends GroupToken {
	
	public MMCADeployment_Group_5_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getGroup_5_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_SemicolonKeyword_5_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'libraries'
protected class MMCADeployment_LibrariesKeyword_5_6_0 extends KeywordToken  {
	
	public MMCADeployment_LibrariesKeyword_5_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getLibrariesKeyword_5_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_Group_5_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCADeployment_Group_5_4(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMCADeployment_Group_5_3(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MMCADeployment_Group_5_2(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MMCADeployment_Group_5_1(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MMCADeployment_Group_5_0(lastRuleCallOrigin, this, 5, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMCADeployment_LeftCurlyBracketKeyword_5_6_1 extends KeywordToken  {
	
	public MMCADeployment_LeftCurlyBracketKeyword_5_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getLeftCurlyBracketKeyword_5_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_LibrariesKeyword_5_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// libraries+=MServiceLibraryInstance+
protected class MMCADeployment_LibrariesAssignment_5_6_2 extends AssignmentToken  {
	
	public MMCADeployment_LibrariesAssignment_5_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getLibrariesAssignment_5_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibraryInstance_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("libraries",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("libraries");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCADeploymentAccess().getLibrariesMServiceLibraryInstanceParserRuleCall_5_6_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MMCADeployment_LibrariesAssignment_5_6_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCADeployment_LeftCurlyBracketKeyword_5_6_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMCADeployment_RightCurlyBracketKeyword_5_6_3 extends KeywordToken  {
	
	public MMCADeployment_RightCurlyBracketKeyword_5_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_5_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_LibrariesAssignment_5_6_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMCADeployment_SemicolonKeyword_5_6_4 extends KeywordToken  {
	
	public MMCADeployment_SemicolonKeyword_5_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_5_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_RightCurlyBracketKeyword_5_6_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MMCADeployment_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MMCADeployment_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMCADeployment_SemicolonKeyword_7 extends KeywordToken  {
	
	public MMCADeployment_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCADeploymentAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCADeployment_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MMCADeployment ****************/


/************ begin Rule MConnection ****************
 *
 * MConnection:
 * 	MCommonConnection | MConnectionSwitch;
 *
 **/

// MCommonConnection | MConnectionSwitch
protected class MConnection_Alternatives extends AlternativesToken {

	public MConnection_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMConnectionAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnection_MCommonConnectionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConnection_MConnectionSwitchParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMCommonConnectionAccess().getMCommonConnectionAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMConnectionSwitchAccess().getMConnectionSwitchAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MCommonConnection
protected class MConnection_MCommonConnectionParserRuleCall_0 extends RuleCallToken {
	
	public MConnection_MCommonConnectionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMConnectionAccess().getMCommonConnectionParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMCommonConnectionAccess().getMCommonConnectionAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MCommonConnection_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MConnectionSwitch
protected class MConnection_MConnectionSwitchParserRuleCall_1 extends RuleCallToken {
	
	public MConnection_MConnectionSwitchParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMConnectionAccess().getMConnectionSwitchParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMConnectionSwitchAccess().getMConnectionSwitchAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MConnectionSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MConnection ****************/






/************ begin Rule MCommonConnection ****************
 *
 * MCommonConnection:
 * 	{MCommonConnection}
 * 	'connection' clientInstance=[MComponentInstance] '.'
 * 	clientPort=[mclevcmp::MClientPort] '<->'
 * 	serverInstance=[MComponentInstance] '.'
 * 	serverPort=[mclevcmp::MServerPort] 'using'
 * 	connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
 * 	'{' ('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')?
 * 	attributeValueAssignments+=MAttributeValueAssignment*
 * 	'}' ';';
 *
 **/

// {MCommonConnection} 'connection' clientInstance=[MComponentInstance] '.' clientPort=[mclevcmp::MClientPort] '<->'
// serverInstance=[MComponentInstance] '.' serverPort=[mclevcmp::MServerPort] 'using'
// connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] '{' ('mapping' ':='
// ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')?
// attributeValueAssignments+=MAttributeValueAssignment* '}' ';'
protected class MCommonConnection_Group extends GroupToken {
	
	public MCommonConnection_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_SemicolonKeyword_15(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMCommonConnectionAccess().getMCommonConnectionAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MCommonConnection}
protected class MCommonConnection_MCommonConnectionAction_0 extends ActionToken  {

	public MCommonConnection_MCommonConnectionAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getMCommonConnectionAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// 'connection'
protected class MCommonConnection_ConnectionKeyword_1 extends KeywordToken  {
	
	public MCommonConnection_ConnectionKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getConnectionKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_MCommonConnectionAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// clientInstance=[MComponentInstance]
protected class MCommonConnection_ClientInstanceAssignment_2 extends AssignmentToken  {
	
	public MCommonConnection_ClientInstanceAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getClientInstanceAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_ConnectionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientInstance",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientInstance");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMCommonConnectionAccess().getClientInstanceMComponentInstanceCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMCommonConnectionAccess().getClientInstanceMComponentInstanceCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '.'
protected class MCommonConnection_FullStopKeyword_3 extends KeywordToken  {
	
	public MCommonConnection_FullStopKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getFullStopKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_ClientInstanceAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// clientPort=[mclevcmp::MClientPort]
protected class MCommonConnection_ClientPortAssignment_4 extends AssignmentToken  {
	
	public MCommonConnection_ClientPortAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getClientPortAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_FullStopKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientPort",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientPort");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMCommonConnectionAccess().getClientPortMClientPortCrossReference_4_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMCommonConnectionAccess().getClientPortMClientPortCrossReference_4_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '<->'
protected class MCommonConnection_LessThanSignHyphenMinusGreaterThanSignKeyword_5 extends KeywordToken  {
	
	public MCommonConnection_LessThanSignHyphenMinusGreaterThanSignKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_ClientPortAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// serverInstance=[MComponentInstance]
protected class MCommonConnection_ServerInstanceAssignment_6 extends AssignmentToken  {
	
	public MCommonConnection_ServerInstanceAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getServerInstanceAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_LessThanSignHyphenMinusGreaterThanSignKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverInstance",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverInstance");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMCommonConnectionAccess().getServerInstanceMComponentInstanceCrossReference_6_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMCommonConnectionAccess().getServerInstanceMComponentInstanceCrossReference_6_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '.'
protected class MCommonConnection_FullStopKeyword_7 extends KeywordToken  {
	
	public MCommonConnection_FullStopKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getFullStopKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_ServerInstanceAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// serverPort=[mclevcmp::MServerPort]
protected class MCommonConnection_ServerPortAssignment_8 extends AssignmentToken  {
	
	public MCommonConnection_ServerPortAssignment_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getServerPortAssignment_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_FullStopKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverPort",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverPort");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMCommonConnectionAccess().getServerPortMServerPortCrossReference_8_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMCommonConnectionAccess().getServerPortMServerPortCrossReference_8_0(); 
				return obj;
			}
		}
		return null;
	}

}

// 'using'
protected class MCommonConnection_UsingKeyword_9 extends KeywordToken  {
	
	public MCommonConnection_UsingKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getUsingKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_ServerPortAssignment_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
protected class MCommonConnection_ConnectorAssignment_10 extends AssignmentToken  {
	
	public MCommonConnection_ConnectorAssignment_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getConnectorAssignment_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_UsingKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("connector",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("connector");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMCommonConnectionAccess().getConnectorMConnectorCrossReference_10_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMCommonConnectionAccess().getConnectorMConnectorCrossReference_10_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '{'
protected class MCommonConnection_LeftCurlyBracketKeyword_11 extends KeywordToken  {
	
	public MCommonConnection_LeftCurlyBracketKeyword_11(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getLeftCurlyBracketKeyword_11();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_ConnectorAssignment_10(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')?
protected class MCommonConnection_Group_12 extends GroupToken {
	
	public MCommonConnection_Group_12(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getGroup_12();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_SemicolonKeyword_12_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'mapping'
protected class MCommonConnection_MappingKeyword_12_0 extends KeywordToken  {
	
	public MCommonConnection_MappingKeyword_12_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getMappingKeyword_12_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_LeftCurlyBracketKeyword_11(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MCommonConnection_ColonEqualsSignKeyword_12_1 extends KeywordToken  {
	
	public MCommonConnection_ColonEqualsSignKeyword_12_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getColonEqualsSignKeyword_12_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_MappingKeyword_12_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName]
protected class MCommonConnection_IfaceMappingAssignment_12_2 extends AssignmentToken  {
	
	public MCommonConnection_IfaceMappingAssignment_12_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getIfaceMappingAssignment_12_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_ColonEqualsSignKeyword_12_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ifaceMapping",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ifaceMapping");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMCommonConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_12_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMCommonConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_12_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MCommonConnection_SemicolonKeyword_12_3 extends KeywordToken  {
	
	public MCommonConnection_SemicolonKeyword_12_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getSemicolonKeyword_12_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_IfaceMappingAssignment_12_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// attributeValueAssignments+=MAttributeValueAssignment*
protected class MCommonConnection_AttributeValueAssignmentsAssignment_13 extends AssignmentToken  {
	
	public MCommonConnection_AttributeValueAssignmentsAssignment_13(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getAttributeValueAssignmentsAssignment_13();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAttributeValueAssignment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAttributeValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMCommonConnectionAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MCommonConnection_AttributeValueAssignmentsAssignment_13(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MCommonConnection_Group_12(lastRuleCallOrigin, next, actIndex, consumed);
			case 2: return new MCommonConnection_LeftCurlyBracketKeyword_11(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MCommonConnection_RightCurlyBracketKeyword_14 extends KeywordToken  {
	
	public MCommonConnection_RightCurlyBracketKeyword_14(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getRightCurlyBracketKeyword_14();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_AttributeValueAssignmentsAssignment_13(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MCommonConnection_Group_12(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MCommonConnection_LeftCurlyBracketKeyword_11(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MCommonConnection_SemicolonKeyword_15 extends KeywordToken  {
	
	public MCommonConnection_SemicolonKeyword_15(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCommonConnectionAccess().getSemicolonKeyword_15();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCommonConnection_RightCurlyBracketKeyword_14(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MCommonConnection ****************/


/************ begin Rule MConnectionSwitch ****************
 *
 * MConnectionSwitch:
 * 	{MConnectionSwitch}
 * 	'switch' '(' clientInstance=[MComponentInstance] '.'
 * 	clientPort=[mclevcmp::MClientPort] ')'
 * 	'{'
 * 	cases+=MConnectionSwitchCase+
 * 	'}' ';';
 *
 **/

// {MConnectionSwitch} 'switch' '(' clientInstance=[MComponentInstance] '.' clientPort=[mclevcmp::MClientPort] ')' '{'
// cases+=MConnectionSwitchCase+ '}' ';'
protected class MConnectionSwitch_Group extends GroupToken {
	
	public MConnectionSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConnectionSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitch_SemicolonKeyword_10(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMConnectionSwitchAccess().getMConnectionSwitchAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MConnectionSwitch}
protected class MConnectionSwitch_MConnectionSwitchAction_0 extends ActionToken  {

	public MConnectionSwitch_MConnectionSwitchAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMConnectionSwitchAccess().getMConnectionSwitchAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// 'switch'
protected class MConnectionSwitch_SwitchKeyword_1 extends KeywordToken  {
	
	public MConnectionSwitch_SwitchKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchAccess().getSwitchKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitch_MConnectionSwitchAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '('
protected class MConnectionSwitch_LeftParenthesisKeyword_2 extends KeywordToken  {
	
	public MConnectionSwitch_LeftParenthesisKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchAccess().getLeftParenthesisKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitch_SwitchKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// clientInstance=[MComponentInstance]
protected class MConnectionSwitch_ClientInstanceAssignment_3 extends AssignmentToken  {
	
	public MConnectionSwitch_ClientInstanceAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectionSwitchAccess().getClientInstanceAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitch_LeftParenthesisKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientInstance",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientInstance");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectionSwitchAccess().getClientInstanceMComponentInstanceCrossReference_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectionSwitchAccess().getClientInstanceMComponentInstanceCrossReference_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '.'
protected class MConnectionSwitch_FullStopKeyword_4 extends KeywordToken  {
	
	public MConnectionSwitch_FullStopKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchAccess().getFullStopKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitch_ClientInstanceAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// clientPort=[mclevcmp::MClientPort]
protected class MConnectionSwitch_ClientPortAssignment_5 extends AssignmentToken  {
	
	public MConnectionSwitch_ClientPortAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectionSwitchAccess().getClientPortAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitch_FullStopKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientPort",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientPort");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectionSwitchAccess().getClientPortMClientPortCrossReference_5_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectionSwitchAccess().getClientPortMClientPortCrossReference_5_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ')'
protected class MConnectionSwitch_RightParenthesisKeyword_6 extends KeywordToken  {
	
	public MConnectionSwitch_RightParenthesisKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchAccess().getRightParenthesisKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitch_ClientPortAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MConnectionSwitch_LeftCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MConnectionSwitch_LeftCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchAccess().getLeftCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitch_RightParenthesisKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MConnectionSwitchCase+
protected class MConnectionSwitch_CasesAssignment_8 extends AssignmentToken  {
	
	public MConnectionSwitch_CasesAssignment_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectionSwitchAccess().getCasesAssignment_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectionSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMConnectionSwitchAccess().getCasesMConnectionSwitchCaseParserRuleCall_8_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MConnectionSwitch_CasesAssignment_8(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MConnectionSwitch_LeftCurlyBracketKeyword_7(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MConnectionSwitch_RightCurlyBracketKeyword_9 extends KeywordToken  {
	
	public MConnectionSwitch_RightCurlyBracketKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchAccess().getRightCurlyBracketKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitch_CasesAssignment_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MConnectionSwitch_SemicolonKeyword_10 extends KeywordToken  {
	
	public MConnectionSwitch_SemicolonKeyword_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchAccess().getSemicolonKeyword_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitch_RightCurlyBracketKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MConnectionSwitch ****************/


/************ begin Rule MConnectionSwitchCase ****************
 *
 * MConnectionSwitchCase:
 * 	{MConnectionSwitchCase}
 * 	'case' alternative=[MDeploymentAlternative] ':'
 * 	serverInstance=[MComponentInstance] '.'
 * 	serverPort=[mclevcmp::MServerPort]
 * 	'using' connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
 * 	'{' ('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')?
 * 	attributeValueAssignments+=MAttributeValueAssignment*
 * 	'}' ';';
 *
 **/

// {MConnectionSwitchCase} 'case' alternative=[MDeploymentAlternative] ':' serverInstance=[MComponentInstance] '.'
// serverPort=[mclevcmp::MServerPort] 'using' connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] '{'
// ('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')?
// attributeValueAssignments+=MAttributeValueAssignment* '}' ';'
protected class MConnectionSwitchCase_Group extends GroupToken {
	
	public MConnectionSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_SemicolonKeyword_13(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMConnectionSwitchCaseAccess().getMConnectionSwitchCaseAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MConnectionSwitchCase}
protected class MConnectionSwitchCase_MConnectionSwitchCaseAction_0 extends ActionToken  {

	public MConnectionSwitchCase_MConnectionSwitchCaseAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getMConnectionSwitchCaseAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// 'case'
protected class MConnectionSwitchCase_CaseKeyword_1 extends KeywordToken  {
	
	public MConnectionSwitchCase_CaseKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getCaseKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_MConnectionSwitchCaseAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// alternative=[MDeploymentAlternative]
protected class MConnectionSwitchCase_AlternativeAssignment_2 extends AssignmentToken  {
	
	public MConnectionSwitchCase_AlternativeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getAlternativeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_CaseKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("alternative",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("alternative");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectionSwitchCaseAccess().getAlternativeMDeploymentAlternativeCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectionSwitchCaseAccess().getAlternativeMDeploymentAlternativeCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ':'
protected class MConnectionSwitchCase_ColonKeyword_3 extends KeywordToken  {
	
	public MConnectionSwitchCase_ColonKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getColonKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_AlternativeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// serverInstance=[MComponentInstance]
protected class MConnectionSwitchCase_ServerInstanceAssignment_4 extends AssignmentToken  {
	
	public MConnectionSwitchCase_ServerInstanceAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getServerInstanceAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_ColonKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverInstance",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverInstance");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectionSwitchCaseAccess().getServerInstanceMComponentInstanceCrossReference_4_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectionSwitchCaseAccess().getServerInstanceMComponentInstanceCrossReference_4_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '.'
protected class MConnectionSwitchCase_FullStopKeyword_5 extends KeywordToken  {
	
	public MConnectionSwitchCase_FullStopKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getFullStopKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_ServerInstanceAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// serverPort=[mclevcmp::MServerPort]
protected class MConnectionSwitchCase_ServerPortAssignment_6 extends AssignmentToken  {
	
	public MConnectionSwitchCase_ServerPortAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getServerPortAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_FullStopKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverPort",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverPort");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectionSwitchCaseAccess().getServerPortMServerPortCrossReference_6_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectionSwitchCaseAccess().getServerPortMServerPortCrossReference_6_0(); 
				return obj;
			}
		}
		return null;
	}

}

// 'using'
protected class MConnectionSwitchCase_UsingKeyword_7 extends KeywordToken  {
	
	public MConnectionSwitchCase_UsingKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getUsingKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_ServerPortAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
protected class MConnectionSwitchCase_ConnectorAssignment_8 extends AssignmentToken  {
	
	public MConnectionSwitchCase_ConnectorAssignment_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getConnectorAssignment_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_UsingKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("connector",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("connector");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectionSwitchCaseAccess().getConnectorMConnectorCrossReference_8_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectionSwitchCaseAccess().getConnectorMConnectorCrossReference_8_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '{'
protected class MConnectionSwitchCase_LeftCurlyBracketKeyword_9 extends KeywordToken  {
	
	public MConnectionSwitchCase_LeftCurlyBracketKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getLeftCurlyBracketKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_ConnectorAssignment_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('mapping' ':=' ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ';')?
protected class MConnectionSwitchCase_Group_10 extends GroupToken {
	
	public MConnectionSwitchCase_Group_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getGroup_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_SemicolonKeyword_10_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'mapping'
protected class MConnectionSwitchCase_MappingKeyword_10_0 extends KeywordToken  {
	
	public MConnectionSwitchCase_MappingKeyword_10_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getMappingKeyword_10_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_LeftCurlyBracketKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MConnectionSwitchCase_ColonEqualsSignKeyword_10_1 extends KeywordToken  {
	
	public MConnectionSwitchCase_ColonEqualsSignKeyword_10_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getColonEqualsSignKeyword_10_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_MappingKeyword_10_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName]
protected class MConnectionSwitchCase_IfaceMappingAssignment_10_2 extends AssignmentToken  {
	
	public MConnectionSwitchCase_IfaceMappingAssignment_10_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getIfaceMappingAssignment_10_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_ColonEqualsSignKeyword_10_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ifaceMapping",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ifaceMapping");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectionSwitchCaseAccess().getIfaceMappingMInterfaceMappingCrossReference_10_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConnectionSwitchCaseAccess().getIfaceMappingMInterfaceMappingCrossReference_10_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MConnectionSwitchCase_SemicolonKeyword_10_3 extends KeywordToken  {
	
	public MConnectionSwitchCase_SemicolonKeyword_10_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getSemicolonKeyword_10_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_IfaceMappingAssignment_10_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// attributeValueAssignments+=MAttributeValueAssignment*
protected class MConnectionSwitchCase_AttributeValueAssignmentsAssignment_11 extends AssignmentToken  {
	
	public MConnectionSwitchCase_AttributeValueAssignmentsAssignment_11(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getAttributeValueAssignmentsAssignment_11();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAttributeValueAssignment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAttributeValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMConnectionSwitchCaseAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_11_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MConnectionSwitchCase_AttributeValueAssignmentsAssignment_11(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MConnectionSwitchCase_Group_10(lastRuleCallOrigin, next, actIndex, consumed);
			case 2: return new MConnectionSwitchCase_LeftCurlyBracketKeyword_9(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MConnectionSwitchCase_RightCurlyBracketKeyword_12 extends KeywordToken  {
	
	public MConnectionSwitchCase_RightCurlyBracketKeyword_12(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getRightCurlyBracketKeyword_12();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_AttributeValueAssignmentsAssignment_11(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConnectionSwitchCase_Group_10(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MConnectionSwitchCase_LeftCurlyBracketKeyword_9(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MConnectionSwitchCase_SemicolonKeyword_13 extends KeywordToken  {
	
	public MConnectionSwitchCase_SemicolonKeyword_13(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConnectionSwitchCaseAccess().getSemicolonKeyword_13();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnectionSwitchCase_RightCurlyBracketKeyword_12(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MConnectionSwitchCase ****************/


/************ begin Rule MComponentInstance ****************
 *
 * MComponentInstance:
 * 	{MComponentInstance}
 * 	'instance'
 * 	component=[mclevcmp::MComponent|VersionedQualifiedName] name=ID
 * 	'{'
 * 	attributeValueAssignments+=MAttributeValueAssignment*
 * 	'}' ';';
 *
 **/

// {MComponentInstance} 'instance' component=[mclevcmp::MComponent|VersionedQualifiedName] name=ID '{'
// attributeValueAssignments+=MAttributeValueAssignment* '}' ';'
protected class MComponentInstance_Group extends GroupToken {
	
	public MComponentInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponentInstance_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMComponentInstanceAccess().getMComponentInstanceAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MComponentInstance}
protected class MComponentInstance_MComponentInstanceAction_0 extends ActionToken  {

	public MComponentInstance_MComponentInstanceAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMComponentInstanceAccess().getMComponentInstanceAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// 'instance'
protected class MComponentInstance_InstanceKeyword_1 extends KeywordToken  {
	
	public MComponentInstance_InstanceKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentInstanceAccess().getInstanceKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponentInstance_MComponentInstanceAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// component=[mclevcmp::MComponent|VersionedQualifiedName]
protected class MComponentInstance_ComponentAssignment_2 extends AssignmentToken  {
	
	public MComponentInstance_ComponentAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentInstanceAccess().getComponentAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponentInstance_InstanceKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("component",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("component");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMComponentInstanceAccess().getComponentMComponentCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMComponentInstanceAccess().getComponentMComponentCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MComponentInstance_NameAssignment_3 extends AssignmentToken  {
	
	public MComponentInstance_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentInstanceAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponentInstance_ComponentAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMComponentInstanceAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMComponentInstanceAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MComponentInstance_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MComponentInstance_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentInstanceAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponentInstance_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MAttributeValueAssignment*
protected class MComponentInstance_AttributeValueAssignmentsAssignment_5 extends AssignmentToken  {
	
	public MComponentInstance_AttributeValueAssignmentsAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentInstanceAccess().getAttributeValueAssignmentsAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAttributeValueAssignment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAttributeValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMComponentInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MComponentInstance_AttributeValueAssignmentsAssignment_5(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MComponentInstance_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MComponentInstance_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MComponentInstance_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentInstanceAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponentInstance_AttributeValueAssignmentsAssignment_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponentInstance_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MComponentInstance_SemicolonKeyword_7 extends KeywordToken  {
	
	public MComponentInstance_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentInstanceAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponentInstance_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MComponentInstance ****************/


/************ begin Rule MServiceLibraryInstance ****************
 *
 * MServiceLibraryInstance:
 * 	MRegularServiceLibraryInstance | MDriverSLibInstance;
 *
 **/

// MRegularServiceLibraryInstance | MDriverSLibInstance
protected class MServiceLibraryInstance_Alternatives extends AlternativesToken {

	public MServiceLibraryInstance_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMServiceLibraryInstanceAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibraryInstance_MRegularServiceLibraryInstanceParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibraryInstance_MDriverSLibInstanceParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDriverSLibInstanceAccess().getMDriverSLibInstanceAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMRegularServiceLibraryInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MRegularServiceLibraryInstance
protected class MServiceLibraryInstance_MRegularServiceLibraryInstanceParserRuleCall_0 extends RuleCallToken {
	
	public MServiceLibraryInstance_MRegularServiceLibraryInstanceParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMServiceLibraryInstanceAccess().getMRegularServiceLibraryInstanceParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRegularServiceLibraryInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRegularServiceLibraryInstanceRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MRegularServiceLibraryInstance_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MDriverSLibInstance
protected class MServiceLibraryInstance_MDriverSLibInstanceParserRuleCall_1 extends RuleCallToken {
	
	public MServiceLibraryInstance_MDriverSLibInstanceParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMServiceLibraryInstanceAccess().getMDriverSLibInstanceParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDriverSLibInstanceAccess().getMDriverSLibInstanceAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MDriverSLibInstance_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MServiceLibraryInstance ****************/


/************ begin Rule MRegularServiceLibraryInstance ****************
 *
 * MRegularServiceLibraryInstance MServiceLibraryInstance:
 * 	'library'
 * 	library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
 * 	'{'
 * 	attributeValueAssignments+=MAttributeValueAssignment*
 * 	'}' ';'
 *
 **/

// 'library' library=[mclevslib::MServiceLibrary|VersionedQualifiedName] '{'
// attributeValueAssignments+=MAttributeValueAssignment* '}' ';'
protected class MRegularServiceLibraryInstance_Group extends GroupToken {
	
	public MRegularServiceLibraryInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRegularServiceLibraryInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRegularServiceLibraryInstance_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRegularServiceLibraryInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'library'
protected class MRegularServiceLibraryInstance_LibraryKeyword_0 extends KeywordToken  {
	
	public MRegularServiceLibraryInstance_LibraryKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
protected class MRegularServiceLibraryInstance_LibraryAssignment_1 extends AssignmentToken  {
	
	public MRegularServiceLibraryInstance_LibraryAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRegularServiceLibraryInstance_LibraryKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("library",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("library");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryMServiceLibraryCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMRegularServiceLibraryInstanceAccess().getLibraryMServiceLibraryCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '{'
protected class MRegularServiceLibraryInstance_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MRegularServiceLibraryInstance_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRegularServiceLibraryInstanceAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRegularServiceLibraryInstance_LibraryAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MAttributeValueAssignment*
protected class MRegularServiceLibraryInstance_AttributeValueAssignmentsAssignment_3 extends AssignmentToken  {
	
	public MRegularServiceLibraryInstance_AttributeValueAssignmentsAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRegularServiceLibraryInstanceAccess().getAttributeValueAssignmentsAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAttributeValueAssignment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAttributeValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMRegularServiceLibraryInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MRegularServiceLibraryInstance_AttributeValueAssignmentsAssignment_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MRegularServiceLibraryInstance_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MRegularServiceLibraryInstance_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MRegularServiceLibraryInstance_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRegularServiceLibraryInstanceAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRegularServiceLibraryInstance_AttributeValueAssignmentsAssignment_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MRegularServiceLibraryInstance_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MRegularServiceLibraryInstance_SemicolonKeyword_5 extends KeywordToken  {
	
	public MRegularServiceLibraryInstance_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRegularServiceLibraryInstanceAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRegularServiceLibraryInstance_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MRegularServiceLibraryInstance ****************/


/************ begin Rule MDriverSLibInstance ****************
 *
 * MDriverSLibInstance:
 * 	{MDriverSLibInstance}
 * 	'driver'
 * 	library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
 * 	'{' (('attribute' 'values'
 * 	'{'
 * 	attributeValueAssignments+=MAttributeValueAssignment+
 * 	'}' ';')?
 * 	& ('device' 'mappings' '{'
 * 	deviceDriverMappings+=MDeviceDriverMapping+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// {MDriverSLibInstance} 'driver' library=[mclevslib::MServiceLibrary|VersionedQualifiedName] '{' (('attribute' 'values'
// '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')? & ('device' 'mappings' '{'
// deviceDriverMappings+=MDeviceDriverMapping+ '}' ';')?) '}' ';'
protected class MDriverSLibInstance_Group extends GroupToken {
	
	public MDriverSLibInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDriverSLibInstanceAccess().getMDriverSLibInstanceAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MDriverSLibInstance}
protected class MDriverSLibInstance_MDriverSLibInstanceAction_0 extends ActionToken  {

	public MDriverSLibInstance_MDriverSLibInstanceAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getMDriverSLibInstanceAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// 'driver'
protected class MDriverSLibInstance_DriverKeyword_1 extends KeywordToken  {
	
	public MDriverSLibInstance_DriverKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getDriverKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_MDriverSLibInstanceAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
protected class MDriverSLibInstance_LibraryAssignment_2 extends AssignmentToken  {
	
	public MDriverSLibInstance_LibraryAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getLibraryAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_DriverKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("library",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("library");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibInstanceAccess().getLibraryMServiceLibraryCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSLibInstanceAccess().getLibraryMServiceLibraryCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '{'
protected class MDriverSLibInstance_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MDriverSLibInstance_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_LibraryAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// (('attribute' 'values' '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')? & ('device' 'mappings' '{'
// deviceDriverMappings+=MDeviceDriverMapping+ '}' ';')?)
protected class MDriverSLibInstance_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MDriverSLibInstance_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibInstance_Group_4_0(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverSLibInstance_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// ('attribute' 'values' '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')?
protected class MDriverSLibInstance_Group_4_0 extends GroupToken {
	
	public MDriverSLibInstance_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_SemicolonKeyword_4_0_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'attribute'
protected class MDriverSLibInstance_AttributeKeyword_4_0_0 extends KeywordToken  {
	
	public MDriverSLibInstance_AttributeKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getAttributeKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'values'
protected class MDriverSLibInstance_ValuesKeyword_4_0_1 extends KeywordToken  {
	
	public MDriverSLibInstance_ValuesKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getValuesKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_AttributeKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MDriverSLibInstance_LeftCurlyBracketKeyword_4_0_2 extends KeywordToken  {
	
	public MDriverSLibInstance_LeftCurlyBracketKeyword_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_ValuesKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MAttributeValueAssignment+
protected class MDriverSLibInstance_AttributeValueAssignmentsAssignment_4_0_3 extends AssignmentToken  {
	
	public MDriverSLibInstance_AttributeValueAssignmentsAssignment_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getAttributeValueAssignmentsAssignment_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAttributeValueAssignment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAttributeValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDriverSLibInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MDriverSLibInstance_AttributeValueAssignmentsAssignment_4_0_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverSLibInstance_LeftCurlyBracketKeyword_4_0_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MDriverSLibInstance_RightCurlyBracketKeyword_4_0_4 extends KeywordToken  {
	
	public MDriverSLibInstance_RightCurlyBracketKeyword_4_0_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_0_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_AttributeValueAssignmentsAssignment_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDriverSLibInstance_SemicolonKeyword_4_0_5 extends KeywordToken  {
	
	public MDriverSLibInstance_SemicolonKeyword_4_0_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_4_0_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_RightCurlyBracketKeyword_4_0_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('device' 'mappings' '{' deviceDriverMappings+=MDeviceDriverMapping+ '}' ';')?
protected class MDriverSLibInstance_Group_4_1 extends GroupToken {
	
	public MDriverSLibInstance_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_SemicolonKeyword_4_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'device'
protected class MDriverSLibInstance_DeviceKeyword_4_1_0 extends KeywordToken  {
	
	public MDriverSLibInstance_DeviceKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getDeviceKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibInstance_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'mappings'
protected class MDriverSLibInstance_MappingsKeyword_4_1_1 extends KeywordToken  {
	
	public MDriverSLibInstance_MappingsKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getMappingsKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_DeviceKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MDriverSLibInstance_LeftCurlyBracketKeyword_4_1_2 extends KeywordToken  {
	
	public MDriverSLibInstance_LeftCurlyBracketKeyword_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_MappingsKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deviceDriverMappings+=MDeviceDriverMapping+
protected class MDriverSLibInstance_DeviceDriverMappingsAssignment_4_1_3 extends AssignmentToken  {
	
	public MDriverSLibInstance_DeviceDriverMappingsAssignment_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getDeviceDriverMappingsAssignment_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeviceDriverMapping_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deviceDriverMappings",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deviceDriverMappings");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDeviceDriverMappingRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDriverSLibInstanceAccess().getDeviceDriverMappingsMDeviceDriverMappingParserRuleCall_4_1_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MDriverSLibInstance_DeviceDriverMappingsAssignment_4_1_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverSLibInstance_LeftCurlyBracketKeyword_4_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MDriverSLibInstance_RightCurlyBracketKeyword_4_1_4 extends KeywordToken  {
	
	public MDriverSLibInstance_RightCurlyBracketKeyword_4_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_DeviceDriverMappingsAssignment_4_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDriverSLibInstance_SemicolonKeyword_4_1_5 extends KeywordToken  {
	
	public MDriverSLibInstance_SemicolonKeyword_4_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_4_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_RightCurlyBracketKeyword_4_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MDriverSLibInstance_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MDriverSLibInstance_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDriverSLibInstance_SemicolonKeyword_6 extends KeywordToken  {
	
	public MDriverSLibInstance_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibInstanceAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibInstance_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MDriverSLibInstance ****************/


/************ begin Rule MDeviceDriverMapping ****************
 *
 * MDeviceDriverMapping:
 * 	'supported' 'device' supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName]
 * 	'->'
 * 	'deployed' 'device' deployedDevice=[MDeployedDevice|VersionedQualifiedReferenceName] ';';
 *
 **/

// 'supported' 'device' supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName] '->'
// 'deployed' 'device' deployedDevice=[MDeployedDevice|VersionedQualifiedReferenceName] ';'
protected class MDeviceDriverMapping_Group extends GroupToken {
	
	public MDeviceDriverMapping_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeviceDriverMappingAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeviceDriverMapping_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDeviceDriverMappingRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'supported'
protected class MDeviceDriverMapping_SupportedKeyword_0 extends KeywordToken  {
	
	public MDeviceDriverMapping_SupportedKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceDriverMappingAccess().getSupportedKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'device'
protected class MDeviceDriverMapping_DeviceKeyword_1 extends KeywordToken  {
	
	public MDeviceDriverMapping_DeviceKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceDriverMappingAccess().getDeviceKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeviceDriverMapping_SupportedKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName]
protected class MDeviceDriverMapping_SupportedDeviceAssignment_2 extends AssignmentToken  {
	
	public MDeviceDriverMapping_SupportedDeviceAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeviceDriverMappingAccess().getSupportedDeviceAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeviceDriverMapping_DeviceKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedDevice",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedDevice");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '->'
protected class MDeviceDriverMapping_HyphenMinusGreaterThanSignKeyword_3 extends KeywordToken  {
	
	public MDeviceDriverMapping_HyphenMinusGreaterThanSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeviceDriverMapping_SupportedDeviceAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'deployed'
protected class MDeviceDriverMapping_DeployedKeyword_4 extends KeywordToken  {
	
	public MDeviceDriverMapping_DeployedKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceDriverMappingAccess().getDeployedKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeviceDriverMapping_HyphenMinusGreaterThanSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'device'
protected class MDeviceDriverMapping_DeviceKeyword_5 extends KeywordToken  {
	
	public MDeviceDriverMapping_DeviceKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceDriverMappingAccess().getDeviceKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeviceDriverMapping_DeployedKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deployedDevice=[MDeployedDevice|VersionedQualifiedReferenceName]
protected class MDeviceDriverMapping_DeployedDeviceAssignment_6 extends AssignmentToken  {
	
	public MDeviceDriverMapping_DeployedDeviceAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeviceDriverMappingAccess().getDeployedDeviceAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeviceDriverMapping_DeviceKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deployedDevice",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deployedDevice");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceCrossReference_6_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceCrossReference_6_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MDeviceDriverMapping_SemicolonKeyword_7 extends KeywordToken  {
	
	public MDeviceDriverMapping_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceDriverMappingAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeviceDriverMapping_DeployedDeviceAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MDeviceDriverMapping ****************/


/************ begin Rule MDeploymentAlternative ****************
 *
 * MDeploymentAlternative:
 * 	{MDeploymentAlternative}
 * 	'deployment' 'alternative'
 * 	name=ID
 * 	'{' ('deployment' 'platforms' ':=' deploymentPlatforms+=[MDeploymentPlatform] (","
 * 	deploymentPlatforms+=[MDeploymentPlatform])* ';' & ('attribute' 'values'
 * 	'{'
 * 	attributeValueAssignments+=MAttributeValueAssignment+
 * 	'}' ';')?
 * 	& ('deployment' 'alternatives'
 * 	'{'
 * 	deploymentAlternatives+=MDeploymentAlternative+
 * 	'}' ';')?
 * 	& ('components'
 * 	'{'
 * 	components+=MComponentInstance+
 * 	'}' ';')?
 * 	& ('connections'
 * 	'{'
 * 	connections+=MConnection+
 * 	'}' ';')?
 * 	& ('libraries'
 * 	'{'
 * 	libraries+=MServiceLibraryInstance+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// {MDeploymentAlternative} 'deployment' 'alternative' name=ID '{' ('deployment' 'platforms' ':='
// deploymentPlatforms+=[MDeploymentPlatform] ("," deploymentPlatforms+=[MDeploymentPlatform])* ';' & ('attribute'
// 'values' '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')? & ('deployment' 'alternatives' '{'
// deploymentAlternatives+=MDeploymentAlternative+ '}' ';')? & ('components' '{' components+=MComponentInstance+ '}' ';')?
// & ('connections' '{' connections+=MConnection+ '}' ';')? & ('libraries' '{' libraries+=MServiceLibraryInstance+ '}'
// ';')?) '}' ';'
protected class MDeploymentAlternative_Group extends GroupToken {
	
	public MDeploymentAlternative_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDeploymentAlternativeAccess().getMDeploymentAlternativeAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MDeploymentAlternative}
protected class MDeploymentAlternative_MDeploymentAlternativeAction_0 extends ActionToken  {

	public MDeploymentAlternative_MDeploymentAlternativeAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getMDeploymentAlternativeAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// 'deployment'
protected class MDeploymentAlternative_DeploymentKeyword_1 extends KeywordToken  {
	
	public MDeploymentAlternative_DeploymentKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_MDeploymentAlternativeAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'alternative'
protected class MDeploymentAlternative_AlternativeKeyword_2 extends KeywordToken  {
	
	public MDeploymentAlternative_AlternativeKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getAlternativeKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_DeploymentKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MDeploymentAlternative_NameAssignment_3 extends AssignmentToken  {
	
	public MDeploymentAlternative_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_AlternativeKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDeploymentAlternativeAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMDeploymentAlternativeAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MDeploymentAlternative_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MDeploymentAlternative_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('deployment' 'platforms' ':=' deploymentPlatforms+=[MDeploymentPlatform] (","
// deploymentPlatforms+=[MDeploymentPlatform])* ';' & ('attribute' 'values' '{'
// attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')? & ('deployment' 'alternatives' '{'
// deploymentAlternatives+=MDeploymentAlternative+ '}' ';')? & ('components' '{' components+=MComponentInstance+ '}' ';')?
// & ('connections' '{' connections+=MConnection+ '}' ';')? & ('libraries' '{' libraries+=MServiceLibraryInstance+ '}'
// ';')?)
protected class MDeploymentAlternative_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MDeploymentAlternative_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_Group_5_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDeploymentAlternative_Group_5_4(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDeploymentAlternative_Group_5_3(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MDeploymentAlternative_Group_5_2(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MDeploymentAlternative_Group_5_1(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MDeploymentAlternative_Group_5_0(lastRuleCallOrigin, this, 5, inst);
			default: return null;
		}	
	}

}

// 'deployment' 'platforms' ':=' deploymentPlatforms+=[MDeploymentPlatform] (","
// deploymentPlatforms+=[MDeploymentPlatform])* ';'
protected class MDeploymentAlternative_Group_5_0 extends GroupToken {
	
	public MDeploymentAlternative_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_SemicolonKeyword_5_0_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'deployment'
protected class MDeploymentAlternative_DeploymentKeyword_5_0_0 extends KeywordToken  {
	
	public MDeploymentAlternative_DeploymentKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'platforms'
protected class MDeploymentAlternative_PlatformsKeyword_5_0_1 extends KeywordToken  {
	
	public MDeploymentAlternative_PlatformsKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getPlatformsKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_DeploymentKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MDeploymentAlternative_ColonEqualsSignKeyword_5_0_2 extends KeywordToken  {
	
	public MDeploymentAlternative_ColonEqualsSignKeyword_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getColonEqualsSignKeyword_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_PlatformsKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deploymentPlatforms+=[MDeploymentPlatform]
protected class MDeploymentAlternative_DeploymentPlatformsAssignment_5_0_3 extends AssignmentToken  {
	
	public MDeploymentAlternative_DeploymentPlatformsAssignment_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_ColonEqualsSignKeyword_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deploymentPlatforms",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deploymentPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," deploymentPlatforms+=[MDeploymentPlatform])*
protected class MDeploymentAlternative_Group_5_0_4 extends GroupToken {
	
	public MDeploymentAlternative_Group_5_0_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_0_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_DeploymentPlatformsAssignment_5_0_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MDeploymentAlternative_CommaKeyword_5_0_4_0 extends KeywordToken  {
	
	public MDeploymentAlternative_CommaKeyword_5_0_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getCommaKeyword_5_0_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_Group_5_0_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDeploymentAlternative_DeploymentPlatformsAssignment_5_0_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// deploymentPlatforms+=[MDeploymentPlatform]
protected class MDeploymentAlternative_DeploymentPlatformsAssignment_5_0_4_1 extends AssignmentToken  {
	
	public MDeploymentAlternative_DeploymentPlatformsAssignment_5_0_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_5_0_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_CommaKeyword_5_0_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deploymentPlatforms",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deploymentPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDeploymentAlternativeAccess().getDeploymentPlatformsMDeploymentPlatformCrossReference_5_0_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MDeploymentAlternative_SemicolonKeyword_5_0_5 extends KeywordToken  {
	
	public MDeploymentAlternative_SemicolonKeyword_5_0_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_0_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_Group_5_0_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDeploymentAlternative_DeploymentPlatformsAssignment_5_0_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ('attribute' 'values' '{' attributeValueAssignments+=MAttributeValueAssignment+ '}' ';')?
protected class MDeploymentAlternative_Group_5_1 extends GroupToken {
	
	public MDeploymentAlternative_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_SemicolonKeyword_5_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'attribute'
protected class MDeploymentAlternative_AttributeKeyword_5_1_0 extends KeywordToken  {
	
	public MDeploymentAlternative_AttributeKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getAttributeKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'values'
protected class MDeploymentAlternative_ValuesKeyword_5_1_1 extends KeywordToken  {
	
	public MDeploymentAlternative_ValuesKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getValuesKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_AttributeKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MDeploymentAlternative_LeftCurlyBracketKeyword_5_1_2 extends KeywordToken  {
	
	public MDeploymentAlternative_LeftCurlyBracketKeyword_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_ValuesKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MAttributeValueAssignment+
protected class MDeploymentAlternative_AttributeValueAssignmentsAssignment_5_1_3 extends AssignmentToken  {
	
	public MDeploymentAlternative_AttributeValueAssignmentsAssignment_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getAttributeValueAssignmentsAssignment_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAttributeValueAssignment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAttributeValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDeploymentAlternativeAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_1_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MDeploymentAlternative_AttributeValueAssignmentsAssignment_5_1_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDeploymentAlternative_LeftCurlyBracketKeyword_5_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MDeploymentAlternative_RightCurlyBracketKeyword_5_1_4 extends KeywordToken  {
	
	public MDeploymentAlternative_RightCurlyBracketKeyword_5_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_AttributeValueAssignmentsAssignment_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDeploymentAlternative_SemicolonKeyword_5_1_5 extends KeywordToken  {
	
	public MDeploymentAlternative_SemicolonKeyword_5_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_RightCurlyBracketKeyword_5_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('deployment' 'alternatives' '{' deploymentAlternatives+=MDeploymentAlternative+ '}' ';')?
protected class MDeploymentAlternative_Group_5_2 extends GroupToken {
	
	public MDeploymentAlternative_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_SemicolonKeyword_5_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'deployment'
protected class MDeploymentAlternative_DeploymentKeyword_5_2_0 extends KeywordToken  {
	
	public MDeploymentAlternative_DeploymentKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getDeploymentKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDeploymentAlternative_Group_5_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'alternatives'
protected class MDeploymentAlternative_AlternativesKeyword_5_2_1 extends KeywordToken  {
	
	public MDeploymentAlternative_AlternativesKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getAlternativesKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_DeploymentKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MDeploymentAlternative_LeftCurlyBracketKeyword_5_2_2 extends KeywordToken  {
	
	public MDeploymentAlternative_LeftCurlyBracketKeyword_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_AlternativesKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deploymentAlternatives+=MDeploymentAlternative+
protected class MDeploymentAlternative_DeploymentAlternativesAssignment_5_2_3 extends AssignmentToken  {
	
	public MDeploymentAlternative_DeploymentAlternativesAssignment_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getDeploymentAlternativesAssignment_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deploymentAlternatives",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deploymentAlternatives");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDeploymentAlternativeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDeploymentAlternativeAccess().getDeploymentAlternativesMDeploymentAlternativeParserRuleCall_5_2_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MDeploymentAlternative_DeploymentAlternativesAssignment_5_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDeploymentAlternative_LeftCurlyBracketKeyword_5_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MDeploymentAlternative_RightCurlyBracketKeyword_5_2_4 extends KeywordToken  {
	
	public MDeploymentAlternative_RightCurlyBracketKeyword_5_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_DeploymentAlternativesAssignment_5_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDeploymentAlternative_SemicolonKeyword_5_2_5 extends KeywordToken  {
	
	public MDeploymentAlternative_SemicolonKeyword_5_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_RightCurlyBracketKeyword_5_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('components' '{' components+=MComponentInstance+ '}' ';')?
protected class MDeploymentAlternative_Group_5_3 extends GroupToken {
	
	public MDeploymentAlternative_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_SemicolonKeyword_5_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'components'
protected class MDeploymentAlternative_ComponentsKeyword_5_3_0 extends KeywordToken  {
	
	public MDeploymentAlternative_ComponentsKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getComponentsKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDeploymentAlternative_Group_5_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDeploymentAlternative_Group_5_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MDeploymentAlternative_LeftCurlyBracketKeyword_5_3_1 extends KeywordToken  {
	
	public MDeploymentAlternative_LeftCurlyBracketKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_ComponentsKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// components+=MComponentInstance+
protected class MDeploymentAlternative_ComponentsAssignment_5_3_2 extends AssignmentToken  {
	
	public MDeploymentAlternative_ComponentsAssignment_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getComponentsAssignment_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponentInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("components",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("components");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMComponentInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDeploymentAlternativeAccess().getComponentsMComponentInstanceParserRuleCall_5_3_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MDeploymentAlternative_ComponentsAssignment_5_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDeploymentAlternative_LeftCurlyBracketKeyword_5_3_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MDeploymentAlternative_RightCurlyBracketKeyword_5_3_3 extends KeywordToken  {
	
	public MDeploymentAlternative_RightCurlyBracketKeyword_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_ComponentsAssignment_5_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDeploymentAlternative_SemicolonKeyword_5_3_4 extends KeywordToken  {
	
	public MDeploymentAlternative_SemicolonKeyword_5_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_RightCurlyBracketKeyword_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('connections' '{' connections+=MConnection+ '}' ';')?
protected class MDeploymentAlternative_Group_5_4 extends GroupToken {
	
	public MDeploymentAlternative_Group_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_SemicolonKeyword_5_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'connections'
protected class MDeploymentAlternative_ConnectionsKeyword_5_4_0 extends KeywordToken  {
	
	public MDeploymentAlternative_ConnectionsKeyword_5_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getConnectionsKeyword_5_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDeploymentAlternative_Group_5_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDeploymentAlternative_Group_5_1(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MDeploymentAlternative_Group_5_0(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MDeploymentAlternative_LeftCurlyBracketKeyword_5_4_1 extends KeywordToken  {
	
	public MDeploymentAlternative_LeftCurlyBracketKeyword_5_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_ConnectionsKeyword_5_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// connections+=MConnection+
protected class MDeploymentAlternative_ConnectionsAssignment_5_4_2 extends AssignmentToken  {
	
	public MDeploymentAlternative_ConnectionsAssignment_5_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getConnectionsAssignment_5_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConnection_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("connections",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("connections");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConnectionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDeploymentAlternativeAccess().getConnectionsMConnectionParserRuleCall_5_4_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MDeploymentAlternative_ConnectionsAssignment_5_4_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDeploymentAlternative_LeftCurlyBracketKeyword_5_4_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MDeploymentAlternative_RightCurlyBracketKeyword_5_4_3 extends KeywordToken  {
	
	public MDeploymentAlternative_RightCurlyBracketKeyword_5_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_ConnectionsAssignment_5_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDeploymentAlternative_SemicolonKeyword_5_4_4 extends KeywordToken  {
	
	public MDeploymentAlternative_SemicolonKeyword_5_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_RightCurlyBracketKeyword_5_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('libraries' '{' libraries+=MServiceLibraryInstance+ '}' ';')?
protected class MDeploymentAlternative_Group_5_5 extends GroupToken {
	
	public MDeploymentAlternative_Group_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getGroup_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_SemicolonKeyword_5_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'libraries'
protected class MDeploymentAlternative_LibrariesKeyword_5_5_0 extends KeywordToken  {
	
	public MDeploymentAlternative_LibrariesKeyword_5_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getLibrariesKeyword_5_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_Group_5_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDeploymentAlternative_Group_5_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDeploymentAlternative_Group_5_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MDeploymentAlternative_Group_5_1(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MDeploymentAlternative_Group_5_0(lastRuleCallOrigin, this, 4, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MDeploymentAlternative_LeftCurlyBracketKeyword_5_5_1 extends KeywordToken  {
	
	public MDeploymentAlternative_LeftCurlyBracketKeyword_5_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_5_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_LibrariesKeyword_5_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// libraries+=MServiceLibraryInstance+
protected class MDeploymentAlternative_LibrariesAssignment_5_5_2 extends AssignmentToken  {
	
	public MDeploymentAlternative_LibrariesAssignment_5_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getLibrariesAssignment_5_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibraryInstance_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("libraries",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("libraries");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDeploymentAlternativeAccess().getLibrariesMServiceLibraryInstanceParserRuleCall_5_5_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MDeploymentAlternative_LibrariesAssignment_5_5_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDeploymentAlternative_LeftCurlyBracketKeyword_5_5_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MDeploymentAlternative_RightCurlyBracketKeyword_5_5_3 extends KeywordToken  {
	
	public MDeploymentAlternative_RightCurlyBracketKeyword_5_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_LibrariesAssignment_5_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDeploymentAlternative_SemicolonKeyword_5_5_4 extends KeywordToken  {
	
	public MDeploymentAlternative_SemicolonKeyword_5_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_5_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_RightCurlyBracketKeyword_5_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MDeploymentAlternative_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MDeploymentAlternative_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDeploymentAlternative_SemicolonKeyword_7 extends KeywordToken  {
	
	public MDeploymentAlternative_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentAlternativeAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentAlternative_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MDeploymentAlternative ****************/


/************ begin Rule MDeploymentPlatform ****************
 *
 * MDeploymentPlatform:
 * 	'deployment' 'platform'
 * 	name=ID
 * 	'{' ('platform' ':=' platform=[pdl::MPlatform|VersionedQualifiedName] ';' & ('deployed' 'devices' '{'
 * 	deployedDevices+=MDeployedDevice+
 * 	'}' ';')?
 * 	& ('parameter' 'values'
 * 	'{'
 * 	parameterValueAssignments+=MParameterValueAssignment+
 * 	'}' ';')?)
 * 	'}'
 * 	';';
 *
 **/

// 'deployment' 'platform' name=ID '{' ('platform' ':=' platform=[pdl::MPlatform|VersionedQualifiedName] ';' & ('deployed'
// 'devices' '{' deployedDevices+=MDeployedDevice+ '}' ';')? & ('parameter' 'values' '{'
// parameterValueAssignments+=MParameterValueAssignment+ '}' ';')?) '}' ';'
protected class MDeploymentPlatform_Group extends GroupToken {
	
	public MDeploymentPlatform_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDeploymentPlatformRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'deployment'
protected class MDeploymentPlatform_DeploymentKeyword_0 extends KeywordToken  {
	
	public MDeploymentPlatform_DeploymentKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getDeploymentKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'platform'
protected class MDeploymentPlatform_PlatformKeyword_1 extends KeywordToken  {
	
	public MDeploymentPlatform_PlatformKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getPlatformKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_DeploymentKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MDeploymentPlatform_NameAssignment_2 extends AssignmentToken  {
	
	public MDeploymentPlatform_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_PlatformKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDeploymentPlatformAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMDeploymentPlatformAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MDeploymentPlatform_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MDeploymentPlatform_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('platform' ':=' platform=[pdl::MPlatform|VersionedQualifiedName] ';' & ('deployed' 'devices' '{'
// deployedDevices+=MDeployedDevice+ '}' ';')? & ('parameter' 'values' '{'
// parameterValueAssignments+=MParameterValueAssignment+ '}' ';')?)
protected class MDeploymentPlatform_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MDeploymentPlatform_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDeploymentPlatform_Group_4_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDeploymentPlatform_Group_4_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// 'platform' ':=' platform=[pdl::MPlatform|VersionedQualifiedName] ';'
protected class MDeploymentPlatform_Group_4_0 extends GroupToken {
	
	public MDeploymentPlatform_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_SemicolonKeyword_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'platform'
protected class MDeploymentPlatform_PlatformKeyword_4_0_0 extends KeywordToken  {
	
	public MDeploymentPlatform_PlatformKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getPlatformKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MDeploymentPlatform_ColonEqualsSignKeyword_4_0_1 extends KeywordToken  {
	
	public MDeploymentPlatform_ColonEqualsSignKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getColonEqualsSignKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_PlatformKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// platform=[pdl::MPlatform|VersionedQualifiedName]
protected class MDeploymentPlatform_PlatformAssignment_4_0_2 extends AssignmentToken  {
	
	public MDeploymentPlatform_PlatformAssignment_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getPlatformAssignment_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_ColonEqualsSignKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDeploymentPlatformAccess().getPlatformMPlatformCrossReference_4_0_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDeploymentPlatformAccess().getPlatformMPlatformCrossReference_4_0_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MDeploymentPlatform_SemicolonKeyword_4_0_3 extends KeywordToken  {
	
	public MDeploymentPlatform_SemicolonKeyword_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_PlatformAssignment_4_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('deployed' 'devices' '{' deployedDevices+=MDeployedDevice+ '}' ';')?
protected class MDeploymentPlatform_Group_4_1 extends GroupToken {
	
	public MDeploymentPlatform_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_SemicolonKeyword_4_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'deployed'
protected class MDeploymentPlatform_DeployedKeyword_4_1_0 extends KeywordToken  {
	
	public MDeploymentPlatform_DeployedKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getDeployedKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'devices'
protected class MDeploymentPlatform_DevicesKeyword_4_1_1 extends KeywordToken  {
	
	public MDeploymentPlatform_DevicesKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getDevicesKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_DeployedKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MDeploymentPlatform_LeftCurlyBracketKeyword_4_1_2 extends KeywordToken  {
	
	public MDeploymentPlatform_LeftCurlyBracketKeyword_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_DevicesKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deployedDevices+=MDeployedDevice+
protected class MDeploymentPlatform_DeployedDevicesAssignment_4_1_3 extends AssignmentToken  {
	
	public MDeploymentPlatform_DeployedDevicesAssignment_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getDeployedDevicesAssignment_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeployedDevice_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deployedDevices",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deployedDevices");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDeployedDeviceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDeploymentPlatformAccess().getDeployedDevicesMDeployedDeviceParserRuleCall_4_1_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MDeploymentPlatform_DeployedDevicesAssignment_4_1_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDeploymentPlatform_LeftCurlyBracketKeyword_4_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MDeploymentPlatform_RightCurlyBracketKeyword_4_1_4 extends KeywordToken  {
	
	public MDeploymentPlatform_RightCurlyBracketKeyword_4_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_DeployedDevicesAssignment_4_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDeploymentPlatform_SemicolonKeyword_4_1_5 extends KeywordToken  {
	
	public MDeploymentPlatform_SemicolonKeyword_4_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_RightCurlyBracketKeyword_4_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('parameter' 'values' '{' parameterValueAssignments+=MParameterValueAssignment+ '}' ';')?
protected class MDeploymentPlatform_Group_4_2 extends GroupToken {
	
	public MDeploymentPlatform_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_SemicolonKeyword_4_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'parameter'
protected class MDeploymentPlatform_ParameterKeyword_4_2_0 extends KeywordToken  {
	
	public MDeploymentPlatform_ParameterKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getParameterKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDeploymentPlatform_Group_4_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'values'
protected class MDeploymentPlatform_ValuesKeyword_4_2_1 extends KeywordToken  {
	
	public MDeploymentPlatform_ValuesKeyword_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getValuesKeyword_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_ParameterKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MDeploymentPlatform_LeftCurlyBracketKeyword_4_2_2 extends KeywordToken  {
	
	public MDeploymentPlatform_LeftCurlyBracketKeyword_4_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_ValuesKeyword_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValueAssignments+=MParameterValueAssignment+
protected class MDeploymentPlatform_ParameterValueAssignmentsAssignment_4_2_3 extends AssignmentToken  {
	
	public MDeploymentPlatform_ParameterValueAssignmentsAssignment_4_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getParameterValueAssignmentsAssignment_4_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueAssignment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameterValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameterValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDeploymentPlatformAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_2_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MDeploymentPlatform_ParameterValueAssignmentsAssignment_4_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDeploymentPlatform_LeftCurlyBracketKeyword_4_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MDeploymentPlatform_RightCurlyBracketKeyword_4_2_4 extends KeywordToken  {
	
	public MDeploymentPlatform_RightCurlyBracketKeyword_4_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_ParameterValueAssignmentsAssignment_4_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDeploymentPlatform_SemicolonKeyword_4_2_5 extends KeywordToken  {
	
	public MDeploymentPlatform_SemicolonKeyword_4_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_4_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_RightCurlyBracketKeyword_4_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MDeploymentPlatform_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MDeploymentPlatform_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDeploymentPlatform_SemicolonKeyword_6 extends KeywordToken  {
	
	public MDeploymentPlatform_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeploymentPlatformAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeploymentPlatform_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MDeploymentPlatform ****************/


/************ begin Rule MDeployedDevice ****************
 *
 * MDeployedDevice:
 * 	'device'
 * 	device=[pdl::MDevice|VersionedQualifiedName] name=ID
 * 	'{'
 * 	parameterValueAssignments+=MParameterValueAssignment*
 * 	'}' ';';
 *
 **/

// 'device' device=[pdl::MDevice|VersionedQualifiedName] name=ID '{' parameterValueAssignments+=MParameterValueAssignment*
// '}' ';'
protected class MDeployedDevice_Group extends GroupToken {
	
	public MDeployedDevice_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeployedDeviceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeployedDevice_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDeployedDeviceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'device'
protected class MDeployedDevice_DeviceKeyword_0 extends KeywordToken  {
	
	public MDeployedDevice_DeviceKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeployedDeviceAccess().getDeviceKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// device=[pdl::MDevice|VersionedQualifiedName]
protected class MDeployedDevice_DeviceAssignment_1 extends AssignmentToken  {
	
	public MDeployedDevice_DeviceAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeployedDeviceAccess().getDeviceAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeployedDevice_DeviceKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("device",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("device");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDeployedDeviceAccess().getDeviceMDeviceCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDeployedDeviceAccess().getDeviceMDeviceCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MDeployedDevice_NameAssignment_2 extends AssignmentToken  {
	
	public MDeployedDevice_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeployedDeviceAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeployedDevice_DeviceAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDeployedDeviceAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMDeployedDeviceAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MDeployedDevice_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MDeployedDevice_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeployedDeviceAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeployedDevice_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValueAssignments+=MParameterValueAssignment*
protected class MDeployedDevice_ParameterValueAssignmentsAssignment_4 extends AssignmentToken  {
	
	public MDeployedDevice_ParameterValueAssignmentsAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeployedDeviceAccess().getParameterValueAssignmentsAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueAssignment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameterValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameterValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDeployedDeviceAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MDeployedDevice_ParameterValueAssignmentsAssignment_4(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDeployedDevice_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MDeployedDevice_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MDeployedDevice_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeployedDeviceAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeployedDevice_ParameterValueAssignmentsAssignment_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDeployedDevice_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MDeployedDevice_SemicolonKeyword_6 extends KeywordToken  {
	
	public MDeployedDevice_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeployedDeviceAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDeployedDevice_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MDeployedDevice ****************/


/************ begin Rule MAttributeValueAssignment ****************
 *
 * MAttributeValueAssignment common::MParameterValueAssignmentSingleExpression:
 * 	'attribute'
 * 	parameter=[common::MParameter|VersionedQualifiedReferenceName]
 * 	':='
 * 	parameterValue=MParameterValueExpression ';'
 *
 **/

// 'attribute' parameter=[common::MParameter|VersionedQualifiedReferenceName] ':=' parameterValue=MParameterValueExpression
// ';'
protected class MAttributeValueAssignment_Group extends GroupToken {
	
	public MAttributeValueAssignment_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAttributeValueAssignmentAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAttributeValueAssignment_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAttributeValueAssignmentRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'attribute'
protected class MAttributeValueAssignment_AttributeKeyword_0 extends KeywordToken  {
	
	public MAttributeValueAssignment_AttributeKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAttributeValueAssignmentAccess().getAttributeKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// parameter=[common::MParameter|VersionedQualifiedReferenceName]
protected class MAttributeValueAssignment_ParameterAssignment_1 extends AssignmentToken  {
	
	public MAttributeValueAssignment_ParameterAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAttributeValueAssignmentAccess().getParameterAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAttributeValueAssignment_AttributeKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameter",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameter");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAttributeValueAssignmentAccess().getParameterMParameterCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAttributeValueAssignmentAccess().getParameterMParameterCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ':='
protected class MAttributeValueAssignment_ColonEqualsSignKeyword_2 extends KeywordToken  {
	
	public MAttributeValueAssignment_ColonEqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAttributeValueAssignmentAccess().getColonEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAttributeValueAssignment_ParameterAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValue=MParameterValueExpression
protected class MAttributeValueAssignment_ParameterValueAssignment_3 extends AssignmentToken  {
	
	public MAttributeValueAssignment_ParameterValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAttributeValueAssignmentAccess().getParameterValueAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameterValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameterValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAttributeValueAssignmentAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MAttributeValueAssignment_ColonEqualsSignKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ';'
protected class MAttributeValueAssignment_SemicolonKeyword_4 extends KeywordToken  {
	
	public MAttributeValueAssignment_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAttributeValueAssignmentAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAttributeValueAssignment_ParameterValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MAttributeValueAssignment ****************/


/************ begin Rule MParameterValueAssignment ****************
 *
 * MParameterValueAssignment common::MParameterValueAssignmentSingleExpression:
 * 	'parameter'
 * 	parameter=[common::MParameter|VersionedQualifiedReferenceName]
 * 	':='
 * 	parameterValue=MParameterValueExpression ';'
 *
 **/

// 'parameter' parameter=[common::MParameter|VersionedQualifiedReferenceName] ':=' parameterValue=MParameterValueExpression
// ';'
protected class MParameterValueAssignment_Group extends GroupToken {
	
	public MParameterValueAssignment_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueAssignmentAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueAssignment_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueAssignmentRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'parameter'
protected class MParameterValueAssignment_ParameterKeyword_0 extends KeywordToken  {
	
	public MParameterValueAssignment_ParameterKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterValueAssignmentAccess().getParameterKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// parameter=[common::MParameter|VersionedQualifiedReferenceName]
protected class MParameterValueAssignment_ParameterAssignment_1 extends AssignmentToken  {
	
	public MParameterValueAssignment_ParameterAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueAssignmentAccess().getParameterAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueAssignment_ParameterKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameter",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameter");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueAssignmentAccess().getParameterMParameterCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMParameterValueAssignmentAccess().getParameterMParameterCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ':='
protected class MParameterValueAssignment_ColonEqualsSignKeyword_2 extends KeywordToken  {
	
	public MParameterValueAssignment_ColonEqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterValueAssignmentAccess().getColonEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueAssignment_ParameterAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValue=MParameterValueExpression
protected class MParameterValueAssignment_ParameterValueAssignment_3 extends AssignmentToken  {
	
	public MParameterValueAssignment_ParameterValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueAssignmentAccess().getParameterValueAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameterValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameterValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterValueAssignmentAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MParameterValueAssignment_ColonEqualsSignKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ';'
protected class MParameterValueAssignment_SemicolonKeyword_4 extends KeywordToken  {
	
	public MParameterValueAssignment_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterValueAssignmentAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueAssignment_ParameterValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MParameterValueAssignment ****************/


/************ begin Rule MParameterValue ****************
 *
 * MParameterValue common::MParameterValue:
 * 	MParameterValueLiteral | MParameterValueRefObject | MParameterValuePAR
 *
 **/

// MParameterValueLiteral | MParameterValueRefObject | MParameterValuePAR
protected class MParameterValue_Alternatives extends AlternativesToken {

	public MParameterValue_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMParameterValueAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValue_MParameterValueLiteralParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterValue_MParameterValueRefObjectParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MParameterValue_MParameterValuePARParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValuePARRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MParameterValueLiteral
protected class MParameterValue_MParameterValueLiteralParserRuleCall_0 extends RuleCallToken {
	
	public MParameterValue_MParameterValueLiteralParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueAccess().getMParameterValueLiteralParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueLiteral_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValueLiteral_Alternatives.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterValueRefObject
protected class MParameterValue_MParameterValueRefObjectParserRuleCall_1 extends RuleCallToken {
	
	public MParameterValue_MParameterValueRefObjectParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueAccess().getMParameterValueRefObjectParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueRefObject_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValueRefObject_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterValuePAR
protected class MParameterValue_MParameterValuePARParserRuleCall_2 extends RuleCallToken {
	
	public MParameterValue_MParameterValuePARParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueAccess().getMParameterValuePARParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValuePAR_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValuePARRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValuePAR_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MParameterValue ****************/


/************ begin Rule MParameterValueLiteral ****************
 *
 * MParameterValueLiteral common::MParameterValueLiteral:
 * 	MParameterValueBooleanLiteral | MParameterValueStringLiteral | MParameterValueIntegerLiteral |
 * 	MParameterValueRealLiteral
 *
 **/

// MParameterValueBooleanLiteral | MParameterValueStringLiteral | MParameterValueIntegerLiteral |
// MParameterValueRealLiteral
protected class MParameterValueLiteral_Alternatives extends AlternativesToken {

	public MParameterValueLiteral_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMParameterValueLiteralAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueLiteral_MParameterValueBooleanLiteralParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterValueLiteral_MParameterValueStringLiteralParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MParameterValueLiteral_MParameterValueIntegerLiteralParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MParameterValueLiteral_MParameterValueRealLiteralParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MParameterValueBooleanLiteral
protected class MParameterValueLiteral_MParameterValueBooleanLiteralParserRuleCall_0 extends RuleCallToken {
	
	public MParameterValueLiteral_MParameterValueBooleanLiteralParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueLiteralAccess().getMParameterValueBooleanLiteralParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueBooleanLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValueBooleanLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterValueStringLiteral
protected class MParameterValueLiteral_MParameterValueStringLiteralParserRuleCall_1 extends RuleCallToken {
	
	public MParameterValueLiteral_MParameterValueStringLiteralParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueLiteralAccess().getMParameterValueStringLiteralParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueStringLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValueStringLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterValueIntegerLiteral
protected class MParameterValueLiteral_MParameterValueIntegerLiteralParserRuleCall_2 extends RuleCallToken {
	
	public MParameterValueLiteral_MParameterValueIntegerLiteralParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueLiteralAccess().getMParameterValueIntegerLiteralParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueIntegerLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValueIntegerLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterValueRealLiteral
protected class MParameterValueLiteral_MParameterValueRealLiteralParserRuleCall_3 extends RuleCallToken {
	
	public MParameterValueLiteral_MParameterValueRealLiteralParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterValueLiteralAccess().getMParameterValueRealLiteralParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueRealLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterValueRealLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MParameterValueLiteral ****************/


/************ begin Rule MParameterValueBooleanLiteral ****************
 *
 * MParameterValueBooleanLiteral common::MParameterValueBooleanLiteral:
 * 	{common::MParameterValueBooleanLiteral} value=EBoolean
 *
 **/

// {common::MParameterValueBooleanLiteral} value=EBoolean
protected class MParameterValueBooleanLiteral_Group extends GroupToken {
	
	public MParameterValueBooleanLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueBooleanLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueBooleanLiteral_ValueAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueBooleanLiteral}
protected class MParameterValueBooleanLiteral_MParameterValueBooleanLiteralAction_0 extends ActionToken  {

	public MParameterValueBooleanLiteral_MParameterValueBooleanLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueBooleanLiteralAccess().getMParameterValueBooleanLiteralAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// value=EBoolean
protected class MParameterValueBooleanLiteral_ValueAssignment_1 extends AssignmentToken  {
	
	public MParameterValueBooleanLiteral_ValueAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueBooleanLiteralAccess().getValueAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueBooleanLiteral_MParameterValueBooleanLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueBooleanLiteralAccess().getValueEBooleanParserRuleCall_1_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMParameterValueBooleanLiteralAccess().getValueEBooleanParserRuleCall_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MParameterValueBooleanLiteral ****************/


/************ begin Rule MParameterValueStringLiteral ****************
 *
 * MParameterValueStringLiteral common::MParameterValueStringLiteral:
 * 	{common::MParameterValueStringLiteral} isRaw?='raw'?
 * 	value=STRING
 *
 **/

// {common::MParameterValueStringLiteral} isRaw?='raw'? value=STRING
protected class MParameterValueStringLiteral_Group extends GroupToken {
	
	public MParameterValueStringLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueStringLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueStringLiteral_ValueAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueStringLiteral}
protected class MParameterValueStringLiteral_MParameterValueStringLiteralAction_0 extends ActionToken  {

	public MParameterValueStringLiteral_MParameterValueStringLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueStringLiteralAccess().getMParameterValueStringLiteralAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// isRaw?='raw'?
protected class MParameterValueStringLiteral_IsRawAssignment_1 extends AssignmentToken  {
	
	public MParameterValueStringLiteral_IsRawAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueStringLiteralAccess().getIsRawAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueStringLiteral_MParameterValueStringLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("isRaw",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("isRaw");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMParameterValueStringLiteralAccess().getIsRawRawKeyword_1_0();
			return obj;
		}
		return null;
	}

}

// value=STRING
protected class MParameterValueStringLiteral_ValueAssignment_2 extends AssignmentToken  {
	
	public MParameterValueStringLiteral_ValueAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueStringLiteralAccess().getValueAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueStringLiteral_IsRawAssignment_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterValueStringLiteral_MParameterValueStringLiteralAction_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MParameterValueStringLiteral ****************/


/************ begin Rule MParameterValueIntegerLiteral ****************
 *
 * MParameterValueIntegerLiteral common::MParameterValueIntegerLiteral:
 * 	{common::MParameterValueIntegerLiteral} value=INTEGER
 *
 **/

// {common::MParameterValueIntegerLiteral} value=INTEGER
protected class MParameterValueIntegerLiteral_Group extends GroupToken {
	
	public MParameterValueIntegerLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueIntegerLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueIntegerLiteral_ValueAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueIntegerLiteral}
protected class MParameterValueIntegerLiteral_MParameterValueIntegerLiteralAction_0 extends ActionToken  {

	public MParameterValueIntegerLiteral_MParameterValueIntegerLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueIntegerLiteralAccess().getMParameterValueIntegerLiteralAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// value=INTEGER
protected class MParameterValueIntegerLiteral_ValueAssignment_1 extends AssignmentToken  {
	
	public MParameterValueIntegerLiteral_ValueAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueIntegerLiteralAccess().getValueAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueIntegerLiteral_MParameterValueIntegerLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueIntegerLiteralAccess().getValueINTEGERParserRuleCall_1_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMParameterValueIntegerLiteralAccess().getValueINTEGERParserRuleCall_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MParameterValueIntegerLiteral ****************/


/************ begin Rule MParameterValueRealLiteral ****************
 *
 * MParameterValueRealLiteral common::MParameterValueRealLiteral:
 * 	{common::MParameterValueRealLiteral} value=REAL
 *
 **/

// {common::MParameterValueRealLiteral} value=REAL
protected class MParameterValueRealLiteral_Group extends GroupToken {
	
	public MParameterValueRealLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueRealLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueRealLiteral_ValueAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueRealLiteral}
protected class MParameterValueRealLiteral_MParameterValueRealLiteralAction_0 extends ActionToken  {

	public MParameterValueRealLiteral_MParameterValueRealLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueRealLiteralAccess().getMParameterValueRealLiteralAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// value=REAL
protected class MParameterValueRealLiteral_ValueAssignment_1 extends AssignmentToken  {
	
	public MParameterValueRealLiteral_ValueAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueRealLiteralAccess().getValueAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueRealLiteral_MParameterValueRealLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueRealLiteralAccess().getValueREALParserRuleCall_1_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMParameterValueRealLiteralAccess().getValueREALParserRuleCall_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MParameterValueRealLiteral ****************/


/************ begin Rule MParameterValueRefObject ****************
 *
 * MParameterValueRefObject common::MParameterValueRefObject:
 * 	{common::MParameterValueRefObject} object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName]
 *
 **/

// {common::MParameterValueRefObject} object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName]
protected class MParameterValueRefObject_Group extends GroupToken {
	
	public MParameterValueRefObject_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueRefObjectAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueRefObject_ObjectAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueRefObject}
protected class MParameterValueRefObject_MParameterValueRefObjectAction_0 extends ActionToken  {

	public MParameterValueRefObject_MParameterValueRefObjectAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueRefObjectAccess().getMParameterValueRefObjectAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName]
protected class MParameterValueRefObject_ObjectAssignment_1 extends AssignmentToken  {
	
	public MParameterValueRefObject_ObjectAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueRefObjectAccess().getObjectAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueRefObject_MParameterValueRefObjectAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("object",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("object");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMParameterValueRefObjectAccess().getObjectMCommonReferenceableObjCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


/************ end Rule MParameterValueRefObject ****************/


/************ begin Rule MParameterValuePAR ****************
 *
 * MParameterValuePAR common::MParameterValuePAR:
 * 	'(' value=MParameterValueExpression ')'
 *
 **/

// '(' value=MParameterValueExpression ')'
protected class MParameterValuePAR_Group extends GroupToken {
	
	public MParameterValuePAR_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValuePARAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValuePAR_RightParenthesisKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValuePARRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// '('
protected class MParameterValuePAR_LeftParenthesisKeyword_0 extends KeywordToken  {
	
	public MParameterValuePAR_LeftParenthesisKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterValuePARAccess().getLeftParenthesisKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// value=MParameterValueExpression
protected class MParameterValuePAR_ValueAssignment_1 extends AssignmentToken  {
	
	public MParameterValuePAR_ValueAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValuePARAccess().getValueAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterValuePARAccess().getValueMParameterValueExpressionParserRuleCall_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MParameterValuePAR_LeftParenthesisKeyword_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ')'
protected class MParameterValuePAR_RightParenthesisKeyword_2 extends KeywordToken  {
	
	public MParameterValuePAR_RightParenthesisKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterValuePARAccess().getRightParenthesisKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValuePAR_ValueAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MParameterValuePAR ****************/


/************ begin Rule MParameterValueExpression ****************
 *
 * MParameterValueExpression common::MParameterValueExpression:
 * 	{common::MParameterValueExpression} left=MParameterValueTERM (operation=MParameterValueExpressionOperators
 * 	right=MParameterValueExpression)?
 *
 **/

// {common::MParameterValueExpression} left=MParameterValueTERM (operation=MParameterValueExpressionOperators
// right=MParameterValueExpression)?
protected class MParameterValueExpression_Group extends GroupToken {
	
	public MParameterValueExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterValueExpression_LeftAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueExpressionAccess().getMParameterValueExpressionAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueExpression}
protected class MParameterValueExpression_MParameterValueExpressionAction_0 extends ActionToken  {

	public MParameterValueExpression_MParameterValueExpressionAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueExpressionAccess().getMParameterValueExpressionAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// left=MParameterValueTERM
protected class MParameterValueExpression_LeftAssignment_1 extends AssignmentToken  {
	
	public MParameterValueExpression_LeftAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueExpressionAccess().getLeftAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueTERM_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("left",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("left");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueTERMRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterValueExpressionAccess().getLeftMParameterValueTERMParserRuleCall_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MParameterValueExpression_MParameterValueExpressionAction_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// (operation=MParameterValueExpressionOperators right=MParameterValueExpression)?
protected class MParameterValueExpression_Group_2 extends GroupToken {
	
	public MParameterValueExpression_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueExpressionAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_RightAssignment_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// operation=MParameterValueExpressionOperators
protected class MParameterValueExpression_OperationAssignment_2_0 extends AssignmentToken  {
	
	public MParameterValueExpression_OperationAssignment_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueExpressionAccess().getOperationAssignment_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_LeftAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("operation",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("operation");
		if(enumLitSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0(), value, null)) { 
			type = AssignmentType.ENUM_RULE_CALL;
			element = grammarAccess.getMParameterValueExpressionAccess().getOperationMParameterValueExpressionOperatorsEnumRuleCall_2_0_0();
			return obj;
		}
		return null;
	}

}

// right=MParameterValueExpression
protected class MParameterValueExpression_RightAssignment_2_1 extends AssignmentToken  {
	
	public MParameterValueExpression_RightAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueExpressionAccess().getRightAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("right",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("right");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterValueExpressionAccess().getRightMParameterValueExpressionParserRuleCall_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MParameterValueExpression_OperationAssignment_2_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule MParameterValueExpression ****************/


/************ begin Rule MParameterValueTERM ****************
 *
 * MParameterValueTERM common::MParameterValueTERM:
 * 	{common::MParameterValueTERM} left=MParameterValue (operation=MParameterValueTERMOperators right=MParameterValueTERM)?
 *
 **/

// {common::MParameterValueTERM} left=MParameterValue (operation=MParameterValueTERMOperators right=MParameterValueTERM)?
protected class MParameterValueTERM_Group extends GroupToken {
	
	public MParameterValueTERM_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueTERMAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueTERM_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterValueTERM_LeftAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterValueTERMAccess().getMParameterValueTERMAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterValueTERM}
protected class MParameterValueTERM_MParameterValueTERMAction_0 extends ActionToken  {

	public MParameterValueTERM_MParameterValueTERMAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterValueTERMAccess().getMParameterValueTERMAction_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(!eObjectConsumer.isConsumed()) return null;
		return eObjectConsumer;
	}
}

// left=MParameterValue
protected class MParameterValueTERM_LeftAssignment_1 extends AssignmentToken  {
	
	public MParameterValueTERM_LeftAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueTERMAccess().getLeftAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValue_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("left",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("left");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterValueTERMAccess().getLeftMParameterValueParserRuleCall_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MParameterValueTERM_MParameterValueTERMAction_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// (operation=MParameterValueTERMOperators right=MParameterValueTERM)?
protected class MParameterValueTERM_Group_2 extends GroupToken {
	
	public MParameterValueTERM_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterValueTERMAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueTERM_RightAssignment_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// operation=MParameterValueTERMOperators
protected class MParameterValueTERM_OperationAssignment_2_0 extends AssignmentToken  {
	
	public MParameterValueTERM_OperationAssignment_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueTERMAccess().getOperationAssignment_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueTERM_LeftAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("operation",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("operation");
		if(enumLitSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0(), value, null)) { 
			type = AssignmentType.ENUM_RULE_CALL;
			element = grammarAccess.getMParameterValueTERMAccess().getOperationMParameterValueTERMOperatorsEnumRuleCall_2_0_0();
			return obj;
		}
		return null;
	}

}

// right=MParameterValueTERM
protected class MParameterValueTERM_RightAssignment_2_1 extends AssignmentToken  {
	
	public MParameterValueTERM_RightAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueTERMAccess().getRightAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterValueTERM_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("right",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("right");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueTERMRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterValueTERMAccess().getRightMParameterValueTERMParserRuleCall_2_1_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MParameterValueTERM_OperationAssignment_2_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}



/************ end Rule MParameterValueTERM ****************/




}
