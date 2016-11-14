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
package es.uah.aut.srg.micobs.mesp.lang.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;

import es.uah.aut.srg.micobs.mesp.lang.services.DEPGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class DEPParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private DEPGrammarAccess grammarAccess;
	
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
			case 0: return new MMESPDEPPackageFile_Group(this, this, 0, inst);
			case 1: return new MMESPDEPPackageElement_MMESPDeploymentParserRuleCall(this, this, 1, inst);
			case 2: return new MMESPDeployment_Group(this, this, 2, inst);
			case 3: return new MSwPackageRequiredInterface_Group(this, this, 3, inst);
			case 4: return new MResourceDemand_Alternatives(this, this, 4, inst);
			case 5: return new MInstantiableResourceDemand_Group(this, this, 5, inst);
			case 6: return new MQuantifiableResourceDemand_Group(this, this, 6, inst);
			case 7: return new MMESPSwPackageDeployment_Alternatives(this, this, 7, inst);
			case 8: return new MMESPRegularSwPackageDeployment_Group(this, this, 8, inst);
			case 9: return new MMESPDriverSwPackageDeployment_Group(this, this, 9, inst);
			case 10: return new MMESPDeviceDriverMapping_Group(this, this, 10, inst);
			case 11: return new MParameterValueAssignment_Group(this, this, 11, inst);
			case 12: return new MParameterValue_Alternatives(this, this, 12, inst);
			case 13: return new MParameterValueLiteral_Alternatives(this, this, 13, inst);
			case 14: return new MParameterValueBooleanLiteral_Group(this, this, 14, inst);
			case 15: return new MParameterValueStringLiteral_Group(this, this, 15, inst);
			case 16: return new MParameterValueIntegerLiteral_Group(this, this, 16, inst);
			case 17: return new MParameterValueRealLiteral_Group(this, this, 17, inst);
			case 18: return new MParameterValueRefObject_Group(this, this, 18, inst);
			case 19: return new MParameterValuePAR_Group(this, this, 19, inst);
			case 20: return new MParameterValueExpression_Group(this, this, 20, inst);
			case 21: return new MParameterValueTERM_Group(this, this, 21, inst);
			case 22: return new MMESPDeploymentPlatform_Group(this, this, 22, inst);
			case 23: return new MMESPDeployedDevice_Group(this, this, 23, inst);
			case 24: return new MMESPDeploymentAlternative_Group(this, this, 24, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MMESPDEPPackageFile ****************
 *
 * MMESPDEPPackageFile:
 * 	'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
 * 	imports+=[common::MCommonPackage|QualifiedName] ';')*
 * 	element=MMESPDEPPackageElement;
 *
 **/

// 'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
// imports+=[common::MCommonPackage|QualifiedName] ';')* element=MMESPDEPPackageElement
protected class MMESPDEPPackageFile_Group extends GroupToken {
	
	public MMESPDEPPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDEPPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDEPPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPDEPPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'package'
protected class MMESPDEPPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MMESPDEPPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDEPPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[mesplibrary::MMESPPackage|QualifiedName]
protected class MMESPDEPPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MMESPDEPPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDEPPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDEPPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDEPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDEPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMESPDEPPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MMESPDEPPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDEPPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDEPPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('import' imports+=[common::MCommonPackage|QualifiedName] ';')*
protected class MMESPDEPPackageFile_Group_3 extends GroupToken {
	
	public MMESPDEPPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDEPPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDEPPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'import'
protected class MMESPDEPPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MMESPDEPPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDEPPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDEPPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDEPPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[common::MCommonPackage|QualifiedName]
protected class MMESPDEPPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MMESPDEPPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDEPPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDEPPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDEPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDEPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMESPDEPPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MMESPDEPPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDEPPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDEPPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MMESPDEPPackageElement
protected class MMESPDEPPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MMESPDEPPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDEPPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDEPPackageElement_MMESPDeploymentParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDEPPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPDEPPackageFileAccess().getElementMMESPDEPPackageElementParserRuleCall_4_0(); 
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
			case 0: return new MMESPDEPPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDEPPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MMESPDEPPackageFile ****************/


/************ begin Rule MMESPDEPPackageElement ****************
 *
 * MMESPDEPPackageElement:
 * 	MMESPDeployment;
 *
 **/

// MMESPDeployment
protected class MMESPDEPPackageElement_MMESPDeploymentParserRuleCall extends RuleCallToken {
	
	public MMESPDEPPackageElement_MMESPDeploymentParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMESPDEPPackageElementAccess().getMMESPDeploymentParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPDeploymentAccess().getMMESPDeploymentAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MMESPDeployment_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule MMESPDEPPackageElement ****************/


/************ begin Rule MMESPDeployment ****************
 *
 * MMESPDeployment:
 * 	{MMESPDeployment}
 * 	'deployment' 'project'
 * 	name=ID
 * 	'{' ('version' ':=' version=Version ';' & 'construction' 'tool' ':='
 * 	ctool=[mespctool::MConstructionTool|VersionedQualifiedName] ';' & ('languages' ':='
 * 	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
 * 	';')?
 * 	& 'deployment' 'platforms' '{'
 * 	deploymentPlatforms+=MMESPDeploymentPlatform+
 * 	'}' ';' & ('required' 'interfaces' '{'
 * 	requires+=MSwPackageRequiredInterface+
 * 	'}' ';')?
 * 	& ('swpackages' '{'
 * 	deployedSwPackages+=MMESPSwPackageDeployment+
 * 	'}' ';')?
 * 	& ('deployment' 'alternatives'
 * 	'{'
 * 	deploymentAlternatives+=MMESPDeploymentAlternative+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// {MMESPDeployment} 'deployment' 'project' name=ID '{' ('version' ':=' version=Version ';' & 'construction' 'tool' ':='
// ctool=[mespctool::MConstructionTool|VersionedQualifiedName] ';' & ('languages' ':='
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ';')? & 'deployment' 'platforms' '{' deploymentPlatforms+=MMESPDeploymentPlatform+ '}' ';' & ('required' 'interfaces'
// '{' requires+=MSwPackageRequiredInterface+ '}' ';')? & ('swpackages' '{' deployedSwPackages+=MMESPSwPackageDeployment+
// '}' ';')? & ('deployment' 'alternatives' '{' deploymentAlternatives+=MMESPDeploymentAlternative+ '}' ';')?) '}' ';'
protected class MMESPDeployment_Group extends GroupToken {
	
	public MMESPDeployment_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPDeploymentAccess().getMMESPDeploymentAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MMESPDeployment}
protected class MMESPDeployment_MMESPDeploymentAction_0 extends ActionToken  {

	public MMESPDeployment_MMESPDeploymentAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getMMESPDeploymentAction_0();
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
protected class MMESPDeployment_DeploymentKeyword_1 extends KeywordToken  {
	
	public MMESPDeployment_DeploymentKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_MMESPDeploymentAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'project'
protected class MMESPDeployment_ProjectKeyword_2 extends KeywordToken  {
	
	public MMESPDeployment_ProjectKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getProjectKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_DeploymentKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MMESPDeployment_NameAssignment_3 extends AssignmentToken  {
	
	public MMESPDeployment_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_ProjectKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMMESPDeploymentAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMMESPDeploymentAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MMESPDeployment_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MMESPDeployment_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('version' ':=' version=Version ';' & 'construction' 'tool' ':='
// ctool=[mespctool::MConstructionTool|VersionedQualifiedName] ';' & ('languages' ':='
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ';')? & 'deployment' 'platforms' '{' deploymentPlatforms+=MMESPDeploymentPlatform+ '}' ';' & ('required' 'interfaces'
// '{' requires+=MSwPackageRequiredInterface+ '}' ';')? & ('swpackages' '{' deployedSwPackages+=MMESPSwPackageDeployment+
// '}' ';')? & ('deployment' 'alternatives' '{' deploymentAlternatives+=MMESPDeploymentAlternative+ '}' ';')?)
protected class MMESPDeployment_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MMESPDeployment_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_Group_5_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeployment_Group_5_5(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMESPDeployment_Group_5_4(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MMESPDeployment_Group_5_3(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// 'version' ':=' version=Version ';'
protected class MMESPDeployment_Group_5_0 extends GroupToken {
	
	public MMESPDeployment_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'version'
protected class MMESPDeployment_VersionKeyword_5_0_0 extends KeywordToken  {
	
	public MMESPDeployment_VersionKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getVersionKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MMESPDeployment_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public MMESPDeployment_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_VersionKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MMESPDeployment_VersionAssignment_5_0_2 extends AssignmentToken  {
	
	public MMESPDeployment_VersionAssignment_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getVersionAssignment_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMMESPDeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMMESPDeploymentAccess().getVersionVersionParserRuleCall_5_0_2_0();
			return obj;
		}
		return null;
	}

}

// ';'
protected class MMESPDeployment_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public MMESPDeployment_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_VersionAssignment_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// 'construction' 'tool' ':=' ctool=[mespctool::MConstructionTool|VersionedQualifiedName] ';'
protected class MMESPDeployment_Group_5_1 extends GroupToken {
	
	public MMESPDeployment_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_SemicolonKeyword_5_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'construction'
protected class MMESPDeployment_ConstructionKeyword_5_1_0 extends KeywordToken  {
	
	public MMESPDeployment_ConstructionKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getConstructionKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'tool'
protected class MMESPDeployment_ToolKeyword_5_1_1 extends KeywordToken  {
	
	public MMESPDeployment_ToolKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getToolKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_ConstructionKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MMESPDeployment_ColonEqualsSignKeyword_5_1_2 extends KeywordToken  {
	
	public MMESPDeployment_ColonEqualsSignKeyword_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_ToolKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ctool=[mespctool::MConstructionTool|VersionedQualifiedName]
protected class MMESPDeployment_CtoolAssignment_5_1_3 extends AssignmentToken  {
	
	public MMESPDeployment_CtoolAssignment_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getCtoolAssignment_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_ColonEqualsSignKeyword_5_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ctool",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ctool");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeploymentAccess().getCtoolMConstructionToolCrossReference_5_1_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDeploymentAccess().getCtoolMConstructionToolCrossReference_5_1_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMESPDeployment_SemicolonKeyword_5_1_4 extends KeywordToken  {
	
	public MMESPDeployment_SemicolonKeyword_5_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_CtoolAssignment_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
protected class MMESPDeployment_Group_5_2 extends GroupToken {
	
	public MMESPDeployment_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_SemicolonKeyword_5_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'languages'
protected class MMESPDeployment_LanguagesKeyword_5_2_0 extends KeywordToken  {
	
	public MMESPDeployment_LanguagesKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getLanguagesKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MMESPDeployment_ColonEqualsSignKeyword_5_2_1 extends KeywordToken  {
	
	public MMESPDeployment_ColonEqualsSignKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getColonEqualsSignKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_LanguagesKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MMESPDeployment_LanguagesAssignment_5_2_2 extends AssignmentToken  {
	
	public MMESPDeployment_LanguagesAssignment_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getLanguagesAssignment_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageCrossReference_5_2_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageCrossReference_5_2_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MMESPDeployment_Group_5_2_3 extends GroupToken {
	
	public MMESPDeployment_Group_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getGroup_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_LanguagesAssignment_5_2_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MMESPDeployment_CommaKeyword_5_2_3_0 extends KeywordToken  {
	
	public MMESPDeployment_CommaKeyword_5_2_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getCommaKeyword_5_2_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_Group_5_2_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeployment_LanguagesAssignment_5_2_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MMESPDeployment_LanguagesAssignment_5_2_3_1 extends AssignmentToken  {
	
	public MMESPDeployment_LanguagesAssignment_5_2_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getLanguagesAssignment_5_2_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_CommaKeyword_5_2_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageCrossReference_5_2_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDeploymentAccess().getLanguagesMLanguageCrossReference_5_2_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MMESPDeployment_SemicolonKeyword_5_2_4 extends KeywordToken  {
	
	public MMESPDeployment_SemicolonKeyword_5_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_Group_5_2_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeployment_LanguagesAssignment_5_2_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// 'deployment' 'platforms' '{' deploymentPlatforms+=MMESPDeploymentPlatform+ '}' ';'
protected class MMESPDeployment_Group_5_3 extends GroupToken {
	
	public MMESPDeployment_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_SemicolonKeyword_5_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'deployment'
protected class MMESPDeployment_DeploymentKeyword_5_3_0 extends KeywordToken  {
	
	public MMESPDeployment_DeploymentKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeployment_Group_5_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'platforms'
protected class MMESPDeployment_PlatformsKeyword_5_3_1 extends KeywordToken  {
	
	public MMESPDeployment_PlatformsKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getPlatformsKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_DeploymentKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMESPDeployment_LeftCurlyBracketKeyword_5_3_2 extends KeywordToken  {
	
	public MMESPDeployment_LeftCurlyBracketKeyword_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_PlatformsKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deploymentPlatforms+=MMESPDeploymentPlatform+
protected class MMESPDeployment_DeploymentPlatformsAssignment_5_3_3 extends AssignmentToken  {
	
	public MMESPDeployment_DeploymentPlatformsAssignment_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getDeploymentPlatformsAssignment_5_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deploymentPlatforms",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deploymentPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeploymentPlatformRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPDeploymentAccess().getDeploymentPlatformsMMESPDeploymentPlatformParserRuleCall_5_3_3_0(); 
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
			case 0: return new MMESPDeployment_DeploymentPlatformsAssignment_5_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDeployment_LeftCurlyBracketKeyword_5_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPDeployment_RightCurlyBracketKeyword_5_3_4 extends KeywordToken  {
	
	public MMESPDeployment_RightCurlyBracketKeyword_5_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_DeploymentPlatformsAssignment_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeployment_SemicolonKeyword_5_3_5 extends KeywordToken  {
	
	public MMESPDeployment_SemicolonKeyword_5_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_RightCurlyBracketKeyword_5_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('required' 'interfaces' '{' requires+=MSwPackageRequiredInterface+ '}' ';')?
protected class MMESPDeployment_Group_5_4 extends GroupToken {
	
	public MMESPDeployment_Group_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getGroup_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_SemicolonKeyword_5_4_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'required'
protected class MMESPDeployment_RequiredKeyword_5_4_0 extends KeywordToken  {
	
	public MMESPDeployment_RequiredKeyword_5_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getRequiredKeyword_5_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'interfaces'
protected class MMESPDeployment_InterfacesKeyword_5_4_1 extends KeywordToken  {
	
	public MMESPDeployment_InterfacesKeyword_5_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getInterfacesKeyword_5_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_RequiredKeyword_5_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMESPDeployment_LeftCurlyBracketKeyword_5_4_2 extends KeywordToken  {
	
	public MMESPDeployment_LeftCurlyBracketKeyword_5_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_InterfacesKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=MSwPackageRequiredInterface+
protected class MMESPDeployment_RequiresAssignment_5_4_3 extends AssignmentToken  {
	
	public MMESPDeployment_RequiresAssignment_5_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getRequiresAssignment_5_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageRequiredInterface_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageRequiredInterfaceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPDeploymentAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_4_3_0(); 
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
			case 0: return new MMESPDeployment_RequiresAssignment_5_4_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDeployment_LeftCurlyBracketKeyword_5_4_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPDeployment_RightCurlyBracketKeyword_5_4_4 extends KeywordToken  {
	
	public MMESPDeployment_RightCurlyBracketKeyword_5_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_RequiresAssignment_5_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeployment_SemicolonKeyword_5_4_5 extends KeywordToken  {
	
	public MMESPDeployment_SemicolonKeyword_5_4_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_4_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_RightCurlyBracketKeyword_5_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('swpackages' '{' deployedSwPackages+=MMESPSwPackageDeployment+ '}' ';')?
protected class MMESPDeployment_Group_5_5 extends GroupToken {
	
	public MMESPDeployment_Group_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getGroup_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_SemicolonKeyword_5_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'swpackages'
protected class MMESPDeployment_SwpackagesKeyword_5_5_0 extends KeywordToken  {
	
	public MMESPDeployment_SwpackagesKeyword_5_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getSwpackagesKeyword_5_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_Group_5_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeployment_Group_5_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMESPDeployment_LeftCurlyBracketKeyword_5_5_1 extends KeywordToken  {
	
	public MMESPDeployment_LeftCurlyBracketKeyword_5_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_SwpackagesKeyword_5_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deployedSwPackages+=MMESPSwPackageDeployment+
protected class MMESPDeployment_DeployedSwPackagesAssignment_5_5_2 extends AssignmentToken  {
	
	public MMESPDeployment_DeployedSwPackagesAssignment_5_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getDeployedSwPackagesAssignment_5_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPSwPackageDeployment_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deployedSwPackages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deployedSwPackages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPSwPackageDeploymentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPDeploymentAccess().getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_5_5_2_0(); 
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
			case 0: return new MMESPDeployment_DeployedSwPackagesAssignment_5_5_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDeployment_LeftCurlyBracketKeyword_5_5_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPDeployment_RightCurlyBracketKeyword_5_5_3 extends KeywordToken  {
	
	public MMESPDeployment_RightCurlyBracketKeyword_5_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_DeployedSwPackagesAssignment_5_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeployment_SemicolonKeyword_5_5_4 extends KeywordToken  {
	
	public MMESPDeployment_SemicolonKeyword_5_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_RightCurlyBracketKeyword_5_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('deployment' 'alternatives' '{' deploymentAlternatives+=MMESPDeploymentAlternative+ '}' ';')?
protected class MMESPDeployment_Group_5_6 extends GroupToken {
	
	public MMESPDeployment_Group_5_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getGroup_5_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_SemicolonKeyword_5_6_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'deployment'
protected class MMESPDeployment_DeploymentKeyword_5_6_0 extends KeywordToken  {
	
	public MMESPDeployment_DeploymentKeyword_5_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getDeploymentKeyword_5_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_Group_5_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeployment_Group_5_4(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMESPDeployment_Group_5_3(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// 'alternatives'
protected class MMESPDeployment_AlternativesKeyword_5_6_1 extends KeywordToken  {
	
	public MMESPDeployment_AlternativesKeyword_5_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getAlternativesKeyword_5_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_DeploymentKeyword_5_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMESPDeployment_LeftCurlyBracketKeyword_5_6_2 extends KeywordToken  {
	
	public MMESPDeployment_LeftCurlyBracketKeyword_5_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getLeftCurlyBracketKeyword_5_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_AlternativesKeyword_5_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deploymentAlternatives+=MMESPDeploymentAlternative+
protected class MMESPDeployment_DeploymentAlternativesAssignment_5_6_3 extends AssignmentToken  {
	
	public MMESPDeployment_DeploymentAlternativesAssignment_5_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getDeploymentAlternativesAssignment_5_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deploymentAlternatives",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deploymentAlternatives");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeploymentAlternativeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPDeploymentAccess().getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_5_6_3_0(); 
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
			case 0: return new MMESPDeployment_DeploymentAlternativesAssignment_5_6_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDeployment_LeftCurlyBracketKeyword_5_6_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPDeployment_RightCurlyBracketKeyword_5_6_4 extends KeywordToken  {
	
	public MMESPDeployment_RightCurlyBracketKeyword_5_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_5_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_DeploymentAlternativesAssignment_5_6_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeployment_SemicolonKeyword_5_6_5 extends KeywordToken  {
	
	public MMESPDeployment_SemicolonKeyword_5_6_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_5_6_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_RightCurlyBracketKeyword_5_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MMESPDeployment_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MMESPDeployment_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeployment_SemicolonKeyword_7 extends KeywordToken  {
	
	public MMESPDeployment_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployment_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MMESPDeployment ****************/


/************ begin Rule MSwPackageRequiredInterface ****************
 *
 * MSwPackageRequiredInterface mespswp::MSwPackageRequiredInterface:
 * 	'requires'
 * 	interface=[common::MCommonPackageElement|VersionedQualifiedName]
 * 	'{'
 * 	resourceDemands+=MResourceDemand*
 * 	'}' ';'
 *
 **/

// 'requires' interface=[common::MCommonPackageElement|VersionedQualifiedName] '{' resourceDemands+=MResourceDemand* '}'
// ';'
protected class MSwPackageRequiredInterface_Group extends GroupToken {
	
	public MSwPackageRequiredInterface_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageRequiredInterfaceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageRequiredInterface_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSwPackageRequiredInterfaceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'requires'
protected class MSwPackageRequiredInterface_RequiresKeyword_0 extends KeywordToken  {
	
	public MSwPackageRequiredInterface_RequiresKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageRequiredInterfaceAccess().getRequiresKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// interface=[common::MCommonPackageElement|VersionedQualifiedName]
protected class MSwPackageRequiredInterface_InterfaceAssignment_1 extends AssignmentToken  {
	
	public MSwPackageRequiredInterface_InterfaceAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageRequiredInterface_RequiresKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("interface",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("interface");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceMCommonPackageElementCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageRequiredInterfaceAccess().getInterfaceMCommonPackageElementCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '{'
protected class MSwPackageRequiredInterface_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MSwPackageRequiredInterface_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageRequiredInterfaceAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageRequiredInterface_InterfaceAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// resourceDemands+=MResourceDemand*
protected class MSwPackageRequiredInterface_ResourceDemandsAssignment_3 extends AssignmentToken  {
	
	public MSwPackageRequiredInterface_ResourceDemandsAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageRequiredInterfaceAccess().getResourceDemandsAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MResourceDemand_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("resourceDemands",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("resourceDemands");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMResourceDemandRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMSwPackageRequiredInterfaceAccess().getResourceDemandsMResourceDemandParserRuleCall_3_0(); 
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
			case 0: return new MSwPackageRequiredInterface_ResourceDemandsAssignment_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MSwPackageRequiredInterface_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MSwPackageRequiredInterface_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MSwPackageRequiredInterface_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageRequiredInterfaceAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageRequiredInterface_ResourceDemandsAssignment_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageRequiredInterface_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MSwPackageRequiredInterface_SemicolonKeyword_5 extends KeywordToken  {
	
	public MSwPackageRequiredInterface_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageRequiredInterfaceAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageRequiredInterface_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MSwPackageRequiredInterface ****************/


/************ begin Rule MResourceDemand ****************
 *
 * MResourceDemand mespswp::MResourceDemand:
 * 	MQuantifiableResourceDemand | MInstantiableResourceDemand
 *
 **/

// MQuantifiableResourceDemand | MInstantiableResourceDemand
protected class MResourceDemand_Alternatives extends AlternativesToken {

	public MResourceDemand_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMResourceDemandAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MResourceDemand_MQuantifiableResourceDemandParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MResourceDemand_MInstantiableResourceDemandParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInstantiableResourceDemandRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMQuantifiableResourceDemandAccess().getMQuantifiableResourceDemandAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MQuantifiableResourceDemand
protected class MResourceDemand_MQuantifiableResourceDemandParserRuleCall_0 extends RuleCallToken {
	
	public MResourceDemand_MQuantifiableResourceDemandParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMResourceDemandAccess().getMQuantifiableResourceDemandParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MQuantifiableResourceDemand_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMQuantifiableResourceDemandAccess().getMQuantifiableResourceDemandAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MQuantifiableResourceDemand_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MInstantiableResourceDemand
protected class MResourceDemand_MInstantiableResourceDemandParserRuleCall_1 extends RuleCallToken {
	
	public MResourceDemand_MInstantiableResourceDemandParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMResourceDemandAccess().getMInstantiableResourceDemandParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInstantiableResourceDemand_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInstantiableResourceDemandRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MInstantiableResourceDemand_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MResourceDemand ****************/


/************ begin Rule MInstantiableResourceDemand ****************
 *
 * MInstantiableResourceDemand mespswp::MInstantiableResourceDemand:
 * 	'instantiable' 'resource'
 * 	resource=[mespcommon::MInstantiableResource|VersionedQualifiedReferenceName] name=ID
 * 	'{'
 * 	parameterValueAssignments+=MParameterValueAssignment*
 * 	'}'
 * 	';'
 *
 **/

// 'instantiable' 'resource' resource=[mespcommon::MInstantiableResource|VersionedQualifiedReferenceName] name=ID '{'
// parameterValueAssignments+=MParameterValueAssignment* '}' ';'
protected class MInstantiableResourceDemand_Group extends GroupToken {
	
	public MInstantiableResourceDemand_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInstantiableResourceDemandAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInstantiableResourceDemand_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInstantiableResourceDemandRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'instantiable'
protected class MInstantiableResourceDemand_InstantiableKeyword_0 extends KeywordToken  {
	
	public MInstantiableResourceDemand_InstantiableKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInstantiableResourceDemandAccess().getInstantiableKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'resource'
protected class MInstantiableResourceDemand_ResourceKeyword_1 extends KeywordToken  {
	
	public MInstantiableResourceDemand_ResourceKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInstantiableResourceDemandAccess().getResourceKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInstantiableResourceDemand_InstantiableKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// resource=[mespcommon::MInstantiableResource|VersionedQualifiedReferenceName]
protected class MInstantiableResourceDemand_ResourceAssignment_2 extends AssignmentToken  {
	
	public MInstantiableResourceDemand_ResourceAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInstantiableResourceDemandAccess().getResourceAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInstantiableResourceDemand_ResourceKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("resource",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("resource");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInstantiableResourceDemandAccess().getResourceMInstantiableResourceCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInstantiableResourceDemandAccess().getResourceMInstantiableResourceCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MInstantiableResourceDemand_NameAssignment_3 extends AssignmentToken  {
	
	public MInstantiableResourceDemand_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInstantiableResourceDemandAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInstantiableResourceDemand_ResourceAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMInstantiableResourceDemandAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMInstantiableResourceDemandAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MInstantiableResourceDemand_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MInstantiableResourceDemand_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInstantiableResourceDemandAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInstantiableResourceDemand_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValueAssignments+=MParameterValueAssignment*
protected class MInstantiableResourceDemand_ParameterValueAssignmentsAssignment_5 extends AssignmentToken  {
	
	public MInstantiableResourceDemand_ParameterValueAssignmentsAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInstantiableResourceDemandAccess().getParameterValueAssignmentsAssignment_5();
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
				element = grammarAccess.getMInstantiableResourceDemandAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0(); 
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
			case 0: return new MInstantiableResourceDemand_ParameterValueAssignmentsAssignment_5(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MInstantiableResourceDemand_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MInstantiableResourceDemand_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MInstantiableResourceDemand_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInstantiableResourceDemandAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInstantiableResourceDemand_ParameterValueAssignmentsAssignment_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInstantiableResourceDemand_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MInstantiableResourceDemand_SemicolonKeyword_7 extends KeywordToken  {
	
	public MInstantiableResourceDemand_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInstantiableResourceDemandAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInstantiableResourceDemand_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MInstantiableResourceDemand ****************/


/************ begin Rule MQuantifiableResourceDemand ****************
 *
 * MQuantifiableResourceDemand mespswp::MQuantifiableResourceDemand:
 * 	{mespswp::MQuantifiableResourceDemand}
 * 	'quantifiable' 'resource'
 * 	resource=[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName]
 * 	':='
 * 	resourceValue=MParameterValueExpression
 * 	';'
 *
 **/

// {mespswp::MQuantifiableResourceDemand} 'quantifiable' 'resource'
// resource=[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName] ':='
// resourceValue=MParameterValueExpression ';'
protected class MQuantifiableResourceDemand_Group extends GroupToken {
	
	public MQuantifiableResourceDemand_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMQuantifiableResourceDemandAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MQuantifiableResourceDemand_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMQuantifiableResourceDemandAccess().getMQuantifiableResourceDemandAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {mespswp::MQuantifiableResourceDemand}
protected class MQuantifiableResourceDemand_MQuantifiableResourceDemandAction_0 extends ActionToken  {

	public MQuantifiableResourceDemand_MQuantifiableResourceDemandAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMQuantifiableResourceDemandAccess().getMQuantifiableResourceDemandAction_0();
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

// 'quantifiable'
protected class MQuantifiableResourceDemand_QuantifiableKeyword_1 extends KeywordToken  {
	
	public MQuantifiableResourceDemand_QuantifiableKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMQuantifiableResourceDemandAccess().getQuantifiableKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MQuantifiableResourceDemand_MQuantifiableResourceDemandAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'resource'
protected class MQuantifiableResourceDemand_ResourceKeyword_2 extends KeywordToken  {
	
	public MQuantifiableResourceDemand_ResourceKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMQuantifiableResourceDemandAccess().getResourceKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MQuantifiableResourceDemand_QuantifiableKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// resource=[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName]
protected class MQuantifiableResourceDemand_ResourceAssignment_3 extends AssignmentToken  {
	
	public MQuantifiableResourceDemand_ResourceAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMQuantifiableResourceDemandAccess().getResourceAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MQuantifiableResourceDemand_ResourceKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("resource",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("resource");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMQuantifiableResourceDemandAccess().getResourceMQuantifiableResourceCrossReference_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMQuantifiableResourceDemandAccess().getResourceMQuantifiableResourceCrossReference_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ':='
protected class MQuantifiableResourceDemand_ColonEqualsSignKeyword_4 extends KeywordToken  {
	
	public MQuantifiableResourceDemand_ColonEqualsSignKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMQuantifiableResourceDemandAccess().getColonEqualsSignKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MQuantifiableResourceDemand_ResourceAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// resourceValue=MParameterValueExpression
protected class MQuantifiableResourceDemand_ResourceValueAssignment_5 extends AssignmentToken  {
	
	public MQuantifiableResourceDemand_ResourceValueAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMQuantifiableResourceDemandAccess().getResourceValueAssignment_5();
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
		if((value = eObjectConsumer.getConsumable("resourceValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("resourceValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMQuantifiableResourceDemandAccess().getResourceValueMParameterValueExpressionParserRuleCall_5_0(); 
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
			case 0: return new MQuantifiableResourceDemand_ColonEqualsSignKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ';'
protected class MQuantifiableResourceDemand_SemicolonKeyword_6 extends KeywordToken  {
	
	public MQuantifiableResourceDemand_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMQuantifiableResourceDemandAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MQuantifiableResourceDemand_ResourceValueAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MQuantifiableResourceDemand ****************/






/************ begin Rule MMESPSwPackageDeployment ****************
 *
 * MMESPSwPackageDeployment:
 * 	MMESPRegularSwPackageDeployment | MMESPDriverSwPackageDeployment;
 *
 **/

// MMESPRegularSwPackageDeployment | MMESPDriverSwPackageDeployment
protected class MMESPSwPackageDeployment_Alternatives extends AlternativesToken {

	public MMESPSwPackageDeployment_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMMESPSwPackageDeploymentAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPSwPackageDeployment_MMESPRegularSwPackageDeploymentParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPSwPackageDeployment_MMESPDriverSwPackageDeploymentParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getMMESPSwPackageDeploymentAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MMESPRegularSwPackageDeployment
protected class MMESPSwPackageDeployment_MMESPRegularSwPackageDeploymentParserRuleCall_0 extends RuleCallToken {
	
	public MMESPSwPackageDeployment_MMESPRegularSwPackageDeploymentParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMESPSwPackageDeploymentAccess().getMMESPRegularSwPackageDeploymentParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPRegularSwPackageDeployment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getMMESPSwPackageDeploymentAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MMESPRegularSwPackageDeployment_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MMESPDriverSwPackageDeployment
protected class MMESPSwPackageDeployment_MMESPDriverSwPackageDeploymentParserRuleCall_1 extends RuleCallToken {
	
	public MMESPSwPackageDeployment_MMESPDriverSwPackageDeploymentParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMESPSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MMESPDriverSwPackageDeployment_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MMESPSwPackageDeployment ****************/


/************ begin Rule MMESPRegularSwPackageDeployment ****************
 *
 * MMESPRegularSwPackageDeployment MMESPSwPackageDeployment:
 * 	{MMESPSwPackageDeployment}
 * 	'swpackage' swPackage=[mespswp::MSwPackage|VersionedQualifiedName]
 * 	'{'
 * 	parameterValueAssignments+=MParameterValueAssignment*
 * 	'}' ';'
 *
 **/

// {MMESPSwPackageDeployment} 'swpackage' swPackage=[mespswp::MSwPackage|VersionedQualifiedName] '{'
// parameterValueAssignments+=MParameterValueAssignment* '}' ';'
protected class MMESPRegularSwPackageDeployment_Group extends GroupToken {
	
	public MMESPRegularSwPackageDeployment_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPRegularSwPackageDeployment_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getMMESPSwPackageDeploymentAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MMESPSwPackageDeployment}
protected class MMESPRegularSwPackageDeployment_MMESPSwPackageDeploymentAction_0 extends ActionToken  {

	public MMESPRegularSwPackageDeployment_MMESPSwPackageDeploymentAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getMMESPSwPackageDeploymentAction_0();
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

// 'swpackage'
protected class MMESPRegularSwPackageDeployment_SwpackageKeyword_1 extends KeywordToken  {
	
	public MMESPRegularSwPackageDeployment_SwpackageKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwpackageKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPRegularSwPackageDeployment_MMESPSwPackageDeploymentAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// swPackage=[mespswp::MSwPackage|VersionedQualifiedName]
protected class MMESPRegularSwPackageDeployment_SwPackageAssignment_2 extends AssignmentToken  {
	
	public MMESPRegularSwPackageDeployment_SwPackageAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwPackageAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPRegularSwPackageDeployment_SwpackageKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("swPackage",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("swPackage");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwPackageMSwPackageCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSwPackageMSwPackageCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '{'
protected class MMESPRegularSwPackageDeployment_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MMESPRegularSwPackageDeployment_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPRegularSwPackageDeployment_SwPackageAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValueAssignments+=MParameterValueAssignment*
protected class MMESPRegularSwPackageDeployment_ParameterValueAssignmentsAssignment_4 extends AssignmentToken  {
	
	public MMESPRegularSwPackageDeployment_ParameterValueAssignmentsAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getParameterValueAssignmentsAssignment_4();
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
				element = grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0(); 
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
			case 0: return new MMESPRegularSwPackageDeployment_ParameterValueAssignmentsAssignment_4(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPRegularSwPackageDeployment_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPRegularSwPackageDeployment_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MMESPRegularSwPackageDeployment_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPRegularSwPackageDeployment_ParameterValueAssignmentsAssignment_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPRegularSwPackageDeployment_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPRegularSwPackageDeployment_SemicolonKeyword_6 extends KeywordToken  {
	
	public MMESPRegularSwPackageDeployment_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPRegularSwPackageDeploymentAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPRegularSwPackageDeployment_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MMESPRegularSwPackageDeployment ****************/


/************ begin Rule MMESPDriverSwPackageDeployment ****************
 *
 * MMESPDriverSwPackageDeployment:
 * 	{MMESPDriverSwPackageDeployment}
 * 	'driver' swPackage=[mespswp::MDriverSwPackage|VersionedQualifiedName]
 * 	'{' (('parameter' 'values'
 * 	'{'
 * 	parameterValueAssignments+=MParameterValueAssignment+
 * 	'}' ';')?
 * 	& ('device' 'mappings' '{'
 * 	deviceDriverMappings+=MMESPDeviceDriverMapping+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// {MMESPDriverSwPackageDeployment} 'driver' swPackage=[mespswp::MDriverSwPackage|VersionedQualifiedName] '{' (('parameter'
// 'values' '{' parameterValueAssignments+=MParameterValueAssignment+ '}' ';')? & ('device' 'mappings' '{'
// deviceDriverMappings+=MMESPDeviceDriverMapping+ '}' ';')?) '}' ';'
protected class MMESPDriverSwPackageDeployment_Group extends GroupToken {
	
	public MMESPDriverSwPackageDeployment_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MMESPDriverSwPackageDeployment}
protected class MMESPDriverSwPackageDeployment_MMESPDriverSwPackageDeploymentAction_0 extends ActionToken  {

	public MMESPDriverSwPackageDeployment_MMESPDriverSwPackageDeploymentAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMMESPDriverSwPackageDeploymentAction_0();
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
protected class MMESPDriverSwPackageDeployment_DriverKeyword_1 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_DriverKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDriverKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_MMESPDriverSwPackageDeploymentAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// swPackage=[mespswp::MDriverSwPackage|VersionedQualifiedName]
protected class MMESPDriverSwPackageDeployment_SwPackageAssignment_2 extends AssignmentToken  {
	
	public MMESPDriverSwPackageDeployment_SwPackageAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSwPackageAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_DriverKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("swPackage",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("swPackage");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSwPackageMDriverSwPackageCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSwPackageMDriverSwPackageCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '{'
protected class MMESPDriverSwPackageDeployment_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_SwPackageAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// (('parameter' 'values' '{' parameterValueAssignments+=MParameterValueAssignment+ '}' ';')? & ('device' 'mappings' '{'
// deviceDriverMappings+=MMESPDeviceDriverMapping+ '}' ';')?)
protected class MMESPDriverSwPackageDeployment_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MMESPDriverSwPackageDeployment_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDriverSwPackageDeployment_Group_4_0(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMESPDriverSwPackageDeployment_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// ('parameter' 'values' '{' parameterValueAssignments+=MParameterValueAssignment+ '}' ';')?
protected class MMESPDriverSwPackageDeployment_Group_4_0 extends GroupToken {
	
	public MMESPDriverSwPackageDeployment_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_SemicolonKeyword_4_0_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'parameter'
protected class MMESPDriverSwPackageDeployment_ParameterKeyword_4_0_0 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_ParameterKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'values'
protected class MMESPDriverSwPackageDeployment_ValuesKeyword_4_0_1 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_ValuesKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getValuesKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_ParameterKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMESPDriverSwPackageDeployment_LeftCurlyBracketKeyword_4_0_2 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_LeftCurlyBracketKeyword_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_ValuesKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValueAssignments+=MParameterValueAssignment+
protected class MMESPDriverSwPackageDeployment_ParameterValueAssignmentsAssignment_4_0_3 extends AssignmentToken  {
	
	public MMESPDriverSwPackageDeployment_ParameterValueAssignmentsAssignment_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterValueAssignmentsAssignment_4_0_3();
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
				element = grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0_3_0(); 
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
			case 0: return new MMESPDriverSwPackageDeployment_ParameterValueAssignmentsAssignment_4_0_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDriverSwPackageDeployment_LeftCurlyBracketKeyword_4_0_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPDriverSwPackageDeployment_RightCurlyBracketKeyword_4_0_4 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_RightCurlyBracketKeyword_4_0_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_4_0_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_ParameterValueAssignmentsAssignment_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDriverSwPackageDeployment_SemicolonKeyword_4_0_5 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_SemicolonKeyword_4_0_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_4_0_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_RightCurlyBracketKeyword_4_0_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('device' 'mappings' '{' deviceDriverMappings+=MMESPDeviceDriverMapping+ '}' ';')?
protected class MMESPDriverSwPackageDeployment_Group_4_1 extends GroupToken {
	
	public MMESPDriverSwPackageDeployment_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_SemicolonKeyword_4_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'device'
protected class MMESPDriverSwPackageDeployment_DeviceKeyword_4_1_0 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_DeviceKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDriverSwPackageDeployment_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'mappings'
protected class MMESPDriverSwPackageDeployment_MappingsKeyword_4_1_1 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_MappingsKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getMappingsKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_DeviceKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMESPDriverSwPackageDeployment_LeftCurlyBracketKeyword_4_1_2 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_LeftCurlyBracketKeyword_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getLeftCurlyBracketKeyword_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_MappingsKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deviceDriverMappings+=MMESPDeviceDriverMapping+
protected class MMESPDriverSwPackageDeployment_DeviceDriverMappingsAssignment_4_1_3 extends AssignmentToken  {
	
	public MMESPDriverSwPackageDeployment_DeviceDriverMappingsAssignment_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceDriverMappingsAssignment_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeviceDriverMapping_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deviceDriverMappings",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deviceDriverMappings");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeviceDriverMappingRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getDeviceDriverMappingsMMESPDeviceDriverMappingParserRuleCall_4_1_3_0(); 
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
			case 0: return new MMESPDriverSwPackageDeployment_DeviceDriverMappingsAssignment_4_1_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDriverSwPackageDeployment_LeftCurlyBracketKeyword_4_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPDriverSwPackageDeployment_RightCurlyBracketKeyword_4_1_4 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_RightCurlyBracketKeyword_4_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_4_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_DeviceDriverMappingsAssignment_4_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDriverSwPackageDeployment_SemicolonKeyword_4_1_5 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_SemicolonKeyword_4_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_4_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_RightCurlyBracketKeyword_4_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MMESPDriverSwPackageDeployment_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDriverSwPackageDeployment_SemicolonKeyword_6 extends KeywordToken  {
	
	public MMESPDriverSwPackageDeployment_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDriverSwPackageDeploymentAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDriverSwPackageDeployment_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MMESPDriverSwPackageDeployment ****************/


/************ begin Rule MMESPDeviceDriverMapping ****************
 *
 * MMESPDeviceDriverMapping:
 * 	'supported' 'device' supportedDevice=[mespswp::MDriverSwPackageSupportedDevice|VersionedQualifiedReferenceName]
 * 	'->'
 * 	'deployed' 'device' deployedDevice=[MMESPDeployedDevice|VersionedQualifiedReferenceName] ';';
 *
 **/

// 'supported' 'device' supportedDevice=[mespswp::MDriverSwPackageSupportedDevice|VersionedQualifiedReferenceName] '->'
// 'deployed' 'device' deployedDevice=[MMESPDeployedDevice|VersionedQualifiedReferenceName] ';'
protected class MMESPDeviceDriverMapping_Group extends GroupToken {
	
	public MMESPDeviceDriverMapping_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeviceDriverMappingAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeviceDriverMapping_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPDeviceDriverMappingRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'supported'
protected class MMESPDeviceDriverMapping_SupportedKeyword_0 extends KeywordToken  {
	
	public MMESPDeviceDriverMapping_SupportedKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'device'
protected class MMESPDeviceDriverMapping_DeviceKeyword_1 extends KeywordToken  {
	
	public MMESPDeviceDriverMapping_DeviceKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeviceDriverMappingAccess().getDeviceKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeviceDriverMapping_SupportedKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedDevice=[mespswp::MDriverSwPackageSupportedDevice|VersionedQualifiedReferenceName]
protected class MMESPDeviceDriverMapping_SupportedDeviceAssignment_2 extends AssignmentToken  {
	
	public MMESPDeviceDriverMapping_SupportedDeviceAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedDeviceAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeviceDriverMapping_DeviceKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedDevice",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedDevice");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedDeviceMDriverSwPackageSupportedDeviceCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDeviceDriverMappingAccess().getSupportedDeviceMDriverSwPackageSupportedDeviceCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// '->'
protected class MMESPDeviceDriverMapping_HyphenMinusGreaterThanSignKeyword_3 extends KeywordToken  {
	
	public MMESPDeviceDriverMapping_HyphenMinusGreaterThanSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeviceDriverMapping_SupportedDeviceAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'deployed'
protected class MMESPDeviceDriverMapping_DeployedKeyword_4 extends KeywordToken  {
	
	public MMESPDeviceDriverMapping_DeployedKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeviceDriverMapping_HyphenMinusGreaterThanSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'device'
protected class MMESPDeviceDriverMapping_DeviceKeyword_5 extends KeywordToken  {
	
	public MMESPDeviceDriverMapping_DeviceKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeviceDriverMappingAccess().getDeviceKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeviceDriverMapping_DeployedKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deployedDevice=[MMESPDeployedDevice|VersionedQualifiedReferenceName]
protected class MMESPDeviceDriverMapping_DeployedDeviceAssignment_6 extends AssignmentToken  {
	
	public MMESPDeviceDriverMapping_DeployedDeviceAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedDeviceAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeviceDriverMapping_DeviceKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deployedDevice",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deployedDevice");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedDeviceMMESPDeployedDeviceCrossReference_6_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDeviceDriverMappingAccess().getDeployedDeviceMMESPDeployedDeviceCrossReference_6_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMESPDeviceDriverMapping_SemicolonKeyword_7 extends KeywordToken  {
	
	public MMESPDeviceDriverMapping_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeviceDriverMappingAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeviceDriverMapping_DeployedDeviceAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MMESPDeviceDriverMapping ****************/


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


/************ begin Rule MMESPDeploymentPlatform ****************
 *
 * MMESPDeploymentPlatform:
 * 	'deployment' 'platform'
 * 	name=ID
 * 	'{' ('platform' ':=' platform=[pdl::MPlatform|VersionedQualifiedName] ';' & 'pswpackage' ':='
 * 	platformSwPackage=[mesppswp::MPlatformSwPackage|VersionedQualifiedName] ';' & ('deployed' 'devices' '{'
 * 	deployedDevices+=MMESPDeployedDevice+
 * 	'}' ';')?
 * 	& ('parameter' 'values'
 * 	'{'
 * 	parameterValueAssignments+=MParameterValueAssignment+
 * 	'}' ';')?)
 * 	'}'
 * 	';';
 *
 **/

// 'deployment' 'platform' name=ID '{' ('platform' ':=' platform=[pdl::MPlatform|VersionedQualifiedName] ';' & 'pswpackage'
// ':=' platformSwPackage=[mesppswp::MPlatformSwPackage|VersionedQualifiedName] ';' & ('deployed' 'devices' '{'
// deployedDevices+=MMESPDeployedDevice+ '}' ';')? & ('parameter' 'values' '{'
// parameterValueAssignments+=MParameterValueAssignment+ '}' ';')?) '}' ';'
protected class MMESPDeploymentPlatform_Group extends GroupToken {
	
	public MMESPDeploymentPlatform_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPDeploymentPlatformRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'deployment'
protected class MMESPDeploymentPlatform_DeploymentKeyword_0 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_DeploymentKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getDeploymentKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'platform'
protected class MMESPDeploymentPlatform_PlatformKeyword_1 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_PlatformKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_DeploymentKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MMESPDeploymentPlatform_NameAssignment_2 extends AssignmentToken  {
	
	public MMESPDeploymentPlatform_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_PlatformKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMMESPDeploymentPlatformAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMMESPDeploymentPlatformAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MMESPDeploymentPlatform_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('platform' ':=' platform=[pdl::MPlatform|VersionedQualifiedName] ';' & 'pswpackage' ':='
// platformSwPackage=[mesppswp::MPlatformSwPackage|VersionedQualifiedName] ';' & ('deployed' 'devices' '{'
// deployedDevices+=MMESPDeployedDevice+ '}' ';')? & ('parameter' 'values' '{'
// parameterValueAssignments+=MParameterValueAssignment+ '}' ';')?)
protected class MMESPDeploymentPlatform_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MMESPDeploymentPlatform_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_Group_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeploymentPlatform_Group_4_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMESPDeploymentPlatform_Group_4_1(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// 'platform' ':=' platform=[pdl::MPlatform|VersionedQualifiedName] ';'
protected class MMESPDeploymentPlatform_Group_4_0 extends GroupToken {
	
	public MMESPDeploymentPlatform_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_SemicolonKeyword_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'platform'
protected class MMESPDeploymentPlatform_PlatformKeyword_4_0_0 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_PlatformKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MMESPDeploymentPlatform_ColonEqualsSignKeyword_4_0_1 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_ColonEqualsSignKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getColonEqualsSignKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_PlatformKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// platform=[pdl::MPlatform|VersionedQualifiedName]
protected class MMESPDeploymentPlatform_PlatformAssignment_4_0_2 extends AssignmentToken  {
	
	public MMESPDeploymentPlatform_PlatformAssignment_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformAssignment_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_ColonEqualsSignKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformMPlatformCrossReference_4_0_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformMPlatformCrossReference_4_0_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMESPDeploymentPlatform_SemicolonKeyword_4_0_3 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_SemicolonKeyword_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_PlatformAssignment_4_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// 'pswpackage' ':=' platformSwPackage=[mesppswp::MPlatformSwPackage|VersionedQualifiedName] ';'
protected class MMESPDeploymentPlatform_Group_4_1 extends GroupToken {
	
	public MMESPDeploymentPlatform_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_SemicolonKeyword_4_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'pswpackage'
protected class MMESPDeploymentPlatform_PswpackageKeyword_4_1_0 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_PswpackageKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getPswpackageKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MMESPDeploymentPlatform_ColonEqualsSignKeyword_4_1_1 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_ColonEqualsSignKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getColonEqualsSignKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_PswpackageKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// platformSwPackage=[mesppswp::MPlatformSwPackage|VersionedQualifiedName]
protected class MMESPDeploymentPlatform_PlatformSwPackageAssignment_4_1_2 extends AssignmentToken  {
	
	public MMESPDeploymentPlatform_PlatformSwPackageAssignment_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformSwPackageAssignment_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_ColonEqualsSignKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platformSwPackage",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platformSwPackage");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformSwPackageMPlatformSwPackageCrossReference_4_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDeploymentPlatformAccess().getPlatformSwPackageMPlatformSwPackageCrossReference_4_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMESPDeploymentPlatform_SemicolonKeyword_4_1_3 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_SemicolonKeyword_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_PlatformSwPackageAssignment_4_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('deployed' 'devices' '{' deployedDevices+=MMESPDeployedDevice+ '}' ';')?
protected class MMESPDeploymentPlatform_Group_4_2 extends GroupToken {
	
	public MMESPDeploymentPlatform_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_SemicolonKeyword_4_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'deployed'
protected class MMESPDeploymentPlatform_DeployedKeyword_4_2_0 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_DeployedKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'devices'
protected class MMESPDeploymentPlatform_DevicesKeyword_4_2_1 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_DevicesKeyword_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getDevicesKeyword_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_DeployedKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMESPDeploymentPlatform_LeftCurlyBracketKeyword_4_2_2 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_LeftCurlyBracketKeyword_4_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_DevicesKeyword_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deployedDevices+=MMESPDeployedDevice+
protected class MMESPDeploymentPlatform_DeployedDevicesAssignment_4_2_3 extends AssignmentToken  {
	
	public MMESPDeploymentPlatform_DeployedDevicesAssignment_4_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedDevicesAssignment_4_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployedDevice_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deployedDevices",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deployedDevices");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeployedDeviceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPDeploymentPlatformAccess().getDeployedDevicesMMESPDeployedDeviceParserRuleCall_4_2_3_0(); 
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
			case 0: return new MMESPDeploymentPlatform_DeployedDevicesAssignment_4_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDeploymentPlatform_LeftCurlyBracketKeyword_4_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPDeploymentPlatform_RightCurlyBracketKeyword_4_2_4 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_RightCurlyBracketKeyword_4_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_DeployedDevicesAssignment_4_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeploymentPlatform_SemicolonKeyword_4_2_5 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_SemicolonKeyword_4_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_RightCurlyBracketKeyword_4_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('parameter' 'values' '{' parameterValueAssignments+=MParameterValueAssignment+ '}' ';')?
protected class MMESPDeploymentPlatform_Group_4_3 extends GroupToken {
	
	public MMESPDeploymentPlatform_Group_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getGroup_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_SemicolonKeyword_4_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'parameter'
protected class MMESPDeploymentPlatform_ParameterKeyword_4_3_0 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_ParameterKeyword_4_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getParameterKeyword_4_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeploymentPlatform_Group_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'values'
protected class MMESPDeploymentPlatform_ValuesKeyword_4_3_1 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_ValuesKeyword_4_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getValuesKeyword_4_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_ParameterKeyword_4_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMESPDeploymentPlatform_LeftCurlyBracketKeyword_4_3_2 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_LeftCurlyBracketKeyword_4_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getLeftCurlyBracketKeyword_4_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_ValuesKeyword_4_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValueAssignments+=MParameterValueAssignment+
protected class MMESPDeploymentPlatform_ParameterValueAssignmentsAssignment_4_3_3 extends AssignmentToken  {
	
	public MMESPDeploymentPlatform_ParameterValueAssignmentsAssignment_4_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getParameterValueAssignmentsAssignment_4_3_3();
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
				element = grammarAccess.getMMESPDeploymentPlatformAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_3_3_0(); 
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
			case 0: return new MMESPDeploymentPlatform_ParameterValueAssignmentsAssignment_4_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDeploymentPlatform_LeftCurlyBracketKeyword_4_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPDeploymentPlatform_RightCurlyBracketKeyword_4_3_4 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_RightCurlyBracketKeyword_4_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_4_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_ParameterValueAssignmentsAssignment_4_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeploymentPlatform_SemicolonKeyword_4_3_5 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_SemicolonKeyword_4_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_4_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_RightCurlyBracketKeyword_4_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MMESPDeploymentPlatform_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeploymentPlatform_SemicolonKeyword_6 extends KeywordToken  {
	
	public MMESPDeploymentPlatform_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentPlatformAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentPlatform_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MMESPDeploymentPlatform ****************/


/************ begin Rule MMESPDeployedDevice ****************
 *
 * MMESPDeployedDevice:
 * 	'device'
 * 	device=[pdl::MDevice|VersionedQualifiedName] name=ID
 * 	'{'
 * 	parameterValueAssignments+=MParameterValueAssignment*
 * 	'}' ';';
 *
 **/

// 'device' device=[pdl::MDevice|VersionedQualifiedName] name=ID '{' parameterValueAssignments+=MParameterValueAssignment*
// '}' ';'
protected class MMESPDeployedDevice_Group extends GroupToken {
	
	public MMESPDeployedDevice_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeployedDeviceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployedDevice_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPDeployedDeviceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'device'
protected class MMESPDeployedDevice_DeviceKeyword_0 extends KeywordToken  {
	
	public MMESPDeployedDevice_DeviceKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeployedDeviceAccess().getDeviceKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// device=[pdl::MDevice|VersionedQualifiedName]
protected class MMESPDeployedDevice_DeviceAssignment_1 extends AssignmentToken  {
	
	public MMESPDeployedDevice_DeviceAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeployedDeviceAccess().getDeviceAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployedDevice_DeviceKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("device",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("device");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeployedDeviceAccess().getDeviceMDeviceCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDeployedDeviceAccess().getDeviceMDeviceCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MMESPDeployedDevice_NameAssignment_2 extends AssignmentToken  {
	
	public MMESPDeployedDevice_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeployedDeviceAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployedDevice_DeviceAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMMESPDeployedDeviceAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMMESPDeployedDeviceAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MMESPDeployedDevice_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MMESPDeployedDevice_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeployedDeviceAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployedDevice_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValueAssignments+=MParameterValueAssignment*
protected class MMESPDeployedDevice_ParameterValueAssignmentsAssignment_4 extends AssignmentToken  {
	
	public MMESPDeployedDevice_ParameterValueAssignmentsAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeployedDeviceAccess().getParameterValueAssignmentsAssignment_4();
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
				element = grammarAccess.getMMESPDeployedDeviceAccess().getParameterValueAssignmentsMParameterValueAssignmentParserRuleCall_4_0(); 
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
			case 0: return new MMESPDeployedDevice_ParameterValueAssignmentsAssignment_4(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDeployedDevice_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPDeployedDevice_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MMESPDeployedDevice_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeployedDeviceAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployedDevice_ParameterValueAssignmentsAssignment_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeployedDevice_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeployedDevice_SemicolonKeyword_6 extends KeywordToken  {
	
	public MMESPDeployedDevice_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeployedDeviceAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeployedDevice_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MMESPDeployedDevice ****************/


/************ begin Rule MMESPDeploymentAlternative ****************
 *
 * MMESPDeploymentAlternative:
 * 	'deployment' 'alternative'
 * 	name=ID
 * 	'{' ('deployment' 'platforms' ':=' deploymentPlatforms+=[MMESPDeploymentPlatform] (","
 * 	deploymentPlatforms+=[MMESPDeploymentPlatform])* ';' & ('languages' ':='
 * 	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
 * 	';')?
 * 	& ('swpackages' '{'
 * 	deployedSwPackages+=MMESPSwPackageDeployment+
 * 	'}' ';')?
 * 	& ('required' 'interfaces' '{'
 * 	requires+=MSwPackageRequiredInterface+
 * 	'}' ';')?
 * 	& ('deployment' 'alternatives'
 * 	'{'
 * 	deploymentAlternatives+=MMESPDeploymentAlternative+
 * 	'}' ';')?)
 * 	'}' ';';
 *
 **/

// 'deployment' 'alternative' name=ID '{' ('deployment' 'platforms' ':=' deploymentPlatforms+=[MMESPDeploymentPlatform]
// ("," deploymentPlatforms+=[MMESPDeploymentPlatform])* ';' & ('languages' ':='
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ';')? & ('swpackages' '{' deployedSwPackages+=MMESPSwPackageDeployment+ '}' ';')? & ('required' 'interfaces' '{'
// requires+=MSwPackageRequiredInterface+ '}' ';')? & ('deployment' 'alternatives' '{'
// deploymentAlternatives+=MMESPDeploymentAlternative+ '}' ';')?) '}' ';'
protected class MMESPDeploymentAlternative_Group extends GroupToken {
	
	public MMESPDeploymentAlternative_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPDeploymentAlternativeRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'deployment'
protected class MMESPDeploymentAlternative_DeploymentKeyword_0 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_DeploymentKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'alternative'
protected class MMESPDeploymentAlternative_AlternativeKeyword_1 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_AlternativeKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getAlternativeKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_DeploymentKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MMESPDeploymentAlternative_NameAssignment_2 extends AssignmentToken  {
	
	public MMESPDeploymentAlternative_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_AlternativeKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMMESPDeploymentAlternativeAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMMESPDeploymentAlternativeAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// '{'
protected class MMESPDeploymentAlternative_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('deployment' 'platforms' ':=' deploymentPlatforms+=[MMESPDeploymentPlatform] (","
// deploymentPlatforms+=[MMESPDeploymentPlatform])* ';' & ('languages' ':='
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ';')? & ('swpackages' '{' deployedSwPackages+=MMESPSwPackageDeployment+ '}' ';')? & ('required' 'interfaces' '{'
// requires+=MSwPackageRequiredInterface+ '}' ';')? & ('deployment' 'alternatives' '{'
// deploymentAlternatives+=MMESPDeploymentAlternative+ '}' ';')?)
protected class MMESPDeploymentAlternative_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MMESPDeploymentAlternative_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_Group_4_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeploymentAlternative_Group_4_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMESPDeploymentAlternative_Group_4_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MMESPDeploymentAlternative_Group_4_1(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MMESPDeploymentAlternative_Group_4_0(lastRuleCallOrigin, this, 4, inst);
			default: return null;
		}	
	}

}

// 'deployment' 'platforms' ':=' deploymentPlatforms+=[MMESPDeploymentPlatform] (","
// deploymentPlatforms+=[MMESPDeploymentPlatform])* ';'
protected class MMESPDeploymentAlternative_Group_4_0 extends GroupToken {
	
	public MMESPDeploymentAlternative_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_SemicolonKeyword_4_0_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'deployment'
protected class MMESPDeploymentAlternative_DeploymentKeyword_4_0_0 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_DeploymentKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'platforms'
protected class MMESPDeploymentAlternative_PlatformsKeyword_4_0_1 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_PlatformsKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getPlatformsKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_DeploymentKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MMESPDeploymentAlternative_ColonEqualsSignKeyword_4_0_2 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_ColonEqualsSignKeyword_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getColonEqualsSignKeyword_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_PlatformsKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deploymentPlatforms+=[MMESPDeploymentPlatform]
protected class MMESPDeploymentAlternative_DeploymentPlatformsAssignment_4_0_3 extends AssignmentToken  {
	
	public MMESPDeploymentAlternative_DeploymentPlatformsAssignment_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_ColonEqualsSignKeyword_4_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deploymentPlatforms",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deploymentPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," deploymentPlatforms+=[MMESPDeploymentPlatform])*
protected class MMESPDeploymentAlternative_Group_4_0_4 extends GroupToken {
	
	public MMESPDeploymentAlternative_Group_4_0_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_0_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_DeploymentPlatformsAssignment_4_0_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MMESPDeploymentAlternative_CommaKeyword_4_0_4_0 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_CommaKeyword_4_0_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getCommaKeyword_4_0_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_Group_4_0_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeploymentAlternative_DeploymentPlatformsAssignment_4_0_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// deploymentPlatforms+=[MMESPDeploymentPlatform]
protected class MMESPDeploymentAlternative_DeploymentPlatformsAssignment_4_0_4_1 extends AssignmentToken  {
	
	public MMESPDeploymentAlternative_DeploymentPlatformsAssignment_4_0_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsAssignment_4_0_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_CommaKeyword_4_0_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deploymentPlatforms",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deploymentPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentPlatformsMMESPDeploymentPlatformCrossReference_4_0_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MMESPDeploymentAlternative_SemicolonKeyword_4_0_5 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_SemicolonKeyword_4_0_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_0_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_Group_4_0_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeploymentAlternative_DeploymentPlatformsAssignment_4_0_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ('languages' ':=' languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ';')?
protected class MMESPDeploymentAlternative_Group_4_1 extends GroupToken {
	
	public MMESPDeploymentAlternative_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_SemicolonKeyword_4_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'languages'
protected class MMESPDeploymentAlternative_LanguagesKeyword_4_1_0 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_LanguagesKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MMESPDeploymentAlternative_ColonEqualsSignKeyword_4_1_1 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_ColonEqualsSignKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getColonEqualsSignKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_LanguagesKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MMESPDeploymentAlternative_LanguagesAssignment_4_1_2 extends AssignmentToken  {
	
	public MMESPDeploymentAlternative_LanguagesAssignment_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesAssignment_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_ColonEqualsSignKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageCrossReference_4_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageCrossReference_4_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MMESPDeploymentAlternative_Group_4_1_3 extends GroupToken {
	
	public MMESPDeploymentAlternative_Group_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_LanguagesAssignment_4_1_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MMESPDeploymentAlternative_CommaKeyword_4_1_3_0 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_CommaKeyword_4_1_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getCommaKeyword_4_1_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_Group_4_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeploymentAlternative_LanguagesAssignment_4_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MMESPDeploymentAlternative_LanguagesAssignment_4_1_3_1 extends AssignmentToken  {
	
	public MMESPDeploymentAlternative_LanguagesAssignment_4_1_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesAssignment_4_1_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_CommaKeyword_4_1_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPDeploymentAlternativeAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MMESPDeploymentAlternative_SemicolonKeyword_4_1_4 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_SemicolonKeyword_4_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_Group_4_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeploymentAlternative_LanguagesAssignment_4_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ('swpackages' '{' deployedSwPackages+=MMESPSwPackageDeployment+ '}' ';')?
protected class MMESPDeploymentAlternative_Group_4_2 extends GroupToken {
	
	public MMESPDeploymentAlternative_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_SemicolonKeyword_4_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'swpackages'
protected class MMESPDeploymentAlternative_SwpackagesKeyword_4_2_0 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_SwpackagesKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getSwpackagesKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeploymentAlternative_Group_4_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMESPDeploymentAlternative_LeftCurlyBracketKeyword_4_2_1 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_LeftCurlyBracketKeyword_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_SwpackagesKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deployedSwPackages+=MMESPSwPackageDeployment+
protected class MMESPDeploymentAlternative_DeployedSwPackagesAssignment_4_2_2 extends AssignmentToken  {
	
	public MMESPDeploymentAlternative_DeployedSwPackagesAssignment_4_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getDeployedSwPackagesAssignment_4_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPSwPackageDeployment_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deployedSwPackages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deployedSwPackages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPSwPackageDeploymentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPDeploymentAlternativeAccess().getDeployedSwPackagesMMESPSwPackageDeploymentParserRuleCall_4_2_2_0(); 
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
			case 0: return new MMESPDeploymentAlternative_DeployedSwPackagesAssignment_4_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDeploymentAlternative_LeftCurlyBracketKeyword_4_2_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPDeploymentAlternative_RightCurlyBracketKeyword_4_2_3 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_RightCurlyBracketKeyword_4_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_DeployedSwPackagesAssignment_4_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeploymentAlternative_SemicolonKeyword_4_2_4 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_SemicolonKeyword_4_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_RightCurlyBracketKeyword_4_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('required' 'interfaces' '{' requires+=MSwPackageRequiredInterface+ '}' ';')?
protected class MMESPDeploymentAlternative_Group_4_3 extends GroupToken {
	
	public MMESPDeploymentAlternative_Group_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_SemicolonKeyword_4_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'required'
protected class MMESPDeploymentAlternative_RequiredKeyword_4_3_0 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_RequiredKeyword_4_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiredKeyword_4_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeploymentAlternative_Group_4_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMESPDeploymentAlternative_Group_4_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// 'interfaces'
protected class MMESPDeploymentAlternative_InterfacesKeyword_4_3_1 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_InterfacesKeyword_4_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getInterfacesKeyword_4_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_RequiredKeyword_4_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMESPDeploymentAlternative_LeftCurlyBracketKeyword_4_3_2 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_LeftCurlyBracketKeyword_4_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_InterfacesKeyword_4_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=MSwPackageRequiredInterface+
protected class MMESPDeploymentAlternative_RequiresAssignment_4_3_3 extends AssignmentToken  {
	
	public MMESPDeploymentAlternative_RequiresAssignment_4_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiresAssignment_4_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageRequiredInterface_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageRequiredInterfaceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPDeploymentAlternativeAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_4_3_3_0(); 
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
			case 0: return new MMESPDeploymentAlternative_RequiresAssignment_4_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDeploymentAlternative_LeftCurlyBracketKeyword_4_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPDeploymentAlternative_RightCurlyBracketKeyword_4_3_4 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_RightCurlyBracketKeyword_4_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_RequiresAssignment_4_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeploymentAlternative_SemicolonKeyword_4_3_5 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_SemicolonKeyword_4_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_RightCurlyBracketKeyword_4_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ('deployment' 'alternatives' '{' deploymentAlternatives+=MMESPDeploymentAlternative+ '}' ';')?
protected class MMESPDeploymentAlternative_Group_4_4 extends GroupToken {
	
	public MMESPDeploymentAlternative_Group_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getGroup_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_SemicolonKeyword_4_4_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'deployment'
protected class MMESPDeploymentAlternative_DeploymentKeyword_4_4_0 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_DeploymentKeyword_4_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentKeyword_4_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_Group_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPDeploymentAlternative_Group_4_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMESPDeploymentAlternative_Group_4_1(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MMESPDeploymentAlternative_Group_4_0(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// 'alternatives'
protected class MMESPDeploymentAlternative_AlternativesKeyword_4_4_1 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_AlternativesKeyword_4_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getAlternativesKeyword_4_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_DeploymentKeyword_4_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// '{'
protected class MMESPDeploymentAlternative_LeftCurlyBracketKeyword_4_4_2 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_LeftCurlyBracketKeyword_4_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getLeftCurlyBracketKeyword_4_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_AlternativesKeyword_4_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deploymentAlternatives+=MMESPDeploymentAlternative+
protected class MMESPDeploymentAlternative_DeploymentAlternativesAssignment_4_4_3 extends AssignmentToken  {
	
	public MMESPDeploymentAlternative_DeploymentAlternativesAssignment_4_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentAlternativesAssignment_4_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deploymentAlternatives",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deploymentAlternatives");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPDeploymentAlternativeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPDeploymentAlternativeAccess().getDeploymentAlternativesMMESPDeploymentAlternativeParserRuleCall_4_4_3_0(); 
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
			case 0: return new MMESPDeploymentAlternative_DeploymentAlternativesAssignment_4_4_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPDeploymentAlternative_LeftCurlyBracketKeyword_4_4_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// '}'
protected class MMESPDeploymentAlternative_RightCurlyBracketKeyword_4_4_4 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_RightCurlyBracketKeyword_4_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_4_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_DeploymentAlternativesAssignment_4_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeploymentAlternative_SemicolonKeyword_4_4_5 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_SemicolonKeyword_4_4_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_4_4_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_RightCurlyBracketKeyword_4_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MMESPDeploymentAlternative_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MMESPDeploymentAlternative_SemicolonKeyword_6 extends KeywordToken  {
	
	public MMESPDeploymentAlternative_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPDeploymentAlternativeAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPDeploymentAlternative_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MMESPDeploymentAlternative ****************/




}
