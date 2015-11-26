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

import es.uah.aut.srg.micobs.mclev.lang.services.CMPGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class CMPParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private CMPGrammarAccess grammarAccess;
	
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
			case 0: return new MMCLEVCMPPackageFile_Group(this, this, 0, inst);
			case 1: return new MMCLEVCMPPackageElement_Alternatives(this, this, 1, inst);
			case 2: return new MPort_Alternatives(this, this, 2, inst);
			case 3: return new MInternalConnection_Alternatives(this, this, 3, inst);
			case 4: return new MAbstractComponent_Group(this, this, 4, inst);
			case 5: return new MComponent_Group(this, this, 5, inst);
			case 6: return new MInternalComponentInstance_Group(this, this, 6, inst);
			case 7: return new MServerPort_Group(this, this, 7, inst);
			case 8: return new MClientPort_Group(this, this, 8, inst);
			case 9: return new MParameterValueAssignment_Group(this, this, 9, inst);
			case 10: return new MParameter_Alternatives(this, this, 10, inst);
			case 11: return new MIntegerParameterSingleExpression_Group(this, this, 11, inst);
			case 12: return new MEnumParameterDefinition_Group(this, this, 12, inst);
			case 13: return new MEnumParameterSingleExpression_Group(this, this, 13, inst);
			case 14: return new MRealParameterSingleExpression_Group(this, this, 14, inst);
			case 15: return new MEnumParameterLiteralRule_Alternatives(this, this, 15, inst);
			case 16: return new MParameterValue_Alternatives(this, this, 16, inst);
			case 17: return new MParameterValueLiteral_Alternatives(this, this, 17, inst);
			case 18: return new MParameterValueBooleanLiteral_Group(this, this, 18, inst);
			case 19: return new MParameterValueStringLiteral_Group(this, this, 19, inst);
			case 20: return new MParameterValueIntegerLiteral_Group(this, this, 20, inst);
			case 21: return new MParameterValueRealLiteral_Group(this, this, 21, inst);
			case 22: return new MParameterValueRefObject_Group(this, this, 22, inst);
			case 23: return new MParameterValuePAR_Group(this, this, 23, inst);
			case 24: return new MParameterValueExpression_Group(this, this, 24, inst);
			case 25: return new MParameterValueTERM_Group(this, this, 25, inst);
			case 26: return new MParameterRange_Alternatives(this, this, 26, inst);
			case 27: return new MParameterOCR_Group(this, this, 27, inst);
			case 28: return new MParameterOOR_Group(this, this, 28, inst);
			case 29: return new MParameterCOR_Group(this, this, 29, inst);
			case 30: return new MParameterCCR_Group(this, this, 30, inst);
			case 31: return new MEnumParameterLiteral_Group(this, this, 31, inst);
			case 32: return new MEnumParamIntegerLiteral_Group(this, this, 32, inst);
			case 33: return new MEnumParamRealLiteral_Group(this, this, 33, inst);
			case 34: return new MEnumParamStringLiteral_Group(this, this, 34, inst);
			case 35: return new MBooleanParameterSingleExpression_Group(this, this, 35, inst);
			case 36: return new MStringParameterSingleExpression_Group(this, this, 36, inst);
			case 37: return new MInternalComponentConnection_Group(this, this, 37, inst);
			case 38: return new MInternalComponentPlatformSwitch_Group(this, this, 38, inst);
			case 39: return new MInternalComponentPlatformSwitchCase_Group(this, this, 39, inst);
			case 40: return new ComponentSupportedPlatform_Group(this, this, 40, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MMCLEVCMPPackageFile ****************
 *
 * MMCLEVCMPPackageFile:
 * 	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
 * 	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVCMPPackageElement;
 *
 **/

// "package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
// imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVCMPPackageElement
protected class MMCLEVCMPPackageFile_Group extends GroupToken {
	
	public MMCLEVCMPPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVCMPPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVCMPPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMCLEVCMPPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "package"
protected class MMCLEVCMPPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MMCLEVCMPPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[mclevlibrary::MMCLEVPackage|QualifiedName]
protected class MMCLEVCMPPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MMCLEVCMPPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVCMPPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVCMPPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMCLEVCMPPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MMCLEVCMPPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVCMPPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVCMPPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("import" imports+=[common::MCommonPackage|QualifiedName] ";")*
protected class MMCLEVCMPPackageFile_Group_3 extends GroupToken {
	
	public MMCLEVCMPPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVCMPPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVCMPPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "import"
protected class MMCLEVCMPPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MMCLEVCMPPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVCMPPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVCMPPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCLEVCMPPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[common::MCommonPackage|QualifiedName]
protected class MMCLEVCMPPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MMCLEVCMPPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVCMPPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVCMPPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVCMPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVCMPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMCLEVCMPPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MMCLEVCMPPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVCMPPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVCMPPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MMCLEVCMPPackageElement
protected class MMCLEVCMPPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MMCLEVCMPPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVCMPPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVCMPPackageElement_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVCMPPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCLEVCMPPackageFileAccess().getElementMMCLEVCMPPackageElementParserRuleCall_4_0(); 
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
			case 0: return new MMCLEVCMPPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCLEVCMPPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MMCLEVCMPPackageFile ****************/


/************ begin Rule MMCLEVCMPPackageElement ****************
 *
 * MMCLEVCMPPackageElement:
 * 	MAbstractComponent | MComponent;
 *
 **/

// MAbstractComponent | MComponent
protected class MMCLEVCMPPackageElement_Alternatives extends AlternativesToken {

	public MMCLEVCMPPackageElement_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMMCLEVCMPPackageElementAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVCMPPackageElement_MAbstractComponentParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCLEVCMPPackageElement_MComponentParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAbstractComponentRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMComponentAccess().getMComponentAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MAbstractComponent
protected class MMCLEVCMPPackageElement_MAbstractComponentParserRuleCall_0 extends RuleCallToken {
	
	public MMCLEVCMPPackageElement_MAbstractComponentParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMCLEVCMPPackageElementAccess().getMAbstractComponentParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAbstractComponentRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MAbstractComponent_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MComponent
protected class MMCLEVCMPPackageElement_MComponentParserRuleCall_1 extends RuleCallToken {
	
	public MMCLEVCMPPackageElement_MComponentParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMCLEVCMPPackageElementAccess().getMComponentParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMComponentAccess().getMComponentAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MComponent_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MMCLEVCMPPackageElement ****************/






/************ begin Rule MPort ****************
 *
 * MPort:
 * 	MServerPort | MClientPort;
 *
 **/

// MServerPort | MClientPort
protected class MPort_Alternatives extends AlternativesToken {

	public MPort_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMPortAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPort_MServerPortParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPort_MClientPortParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMClientPortAccess().getMClientPortAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMServerPortAccess().getMServerPortAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MServerPort
protected class MPort_MServerPortParserRuleCall_0 extends RuleCallToken {
	
	public MPort_MServerPortParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMPortAccess().getMServerPortParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServerPort_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMServerPortAccess().getMServerPortAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MServerPort_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MClientPort
protected class MPort_MClientPortParserRuleCall_1 extends RuleCallToken {
	
	public MPort_MClientPortParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMPortAccess().getMClientPortParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MClientPort_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMClientPortAccess().getMClientPortAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MClientPort_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MPort ****************/


/************ begin Rule MInternalConnection ****************
 *
 * MInternalConnection:
 * 	MInternalComponentConnection | MInternalComponentPlatformSwitch;
 *
 **/

// MInternalComponentConnection | MInternalComponentPlatformSwitch
protected class MInternalConnection_Alternatives extends AlternativesToken {

	public MInternalConnection_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMInternalConnectionAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalConnection_MInternalComponentConnectionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalConnection_MInternalComponentPlatformSwitchParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalComponentConnectionAccess().getMInternalComponentConnectionAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMInternalComponentPlatformSwitchAccess().getMInternalComponentPlatformSwitchAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MInternalComponentConnection
protected class MInternalConnection_MInternalComponentConnectionParserRuleCall_0 extends RuleCallToken {
	
	public MInternalConnection_MInternalComponentConnectionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMInternalConnectionAccess().getMInternalComponentConnectionParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalComponentConnectionAccess().getMInternalComponentConnectionAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MInternalComponentConnection_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MInternalComponentPlatformSwitch
protected class MInternalConnection_MInternalComponentPlatformSwitchParserRuleCall_1 extends RuleCallToken {
	
	public MInternalConnection_MInternalComponentPlatformSwitchParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMInternalConnectionAccess().getMInternalComponentPlatformSwitchParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalComponentPlatformSwitchAccess().getMInternalComponentPlatformSwitchAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MInternalComponentPlatformSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MInternalConnection ****************/


/************ begin Rule MAbstractComponent ****************
 *
 * MAbstractComponent:
 * 	"abstract" "component" domain=[mclevdom::MDomain|VersionedQualifiedName] "::"
 * 	type=[mclevdom::MComponentType|VersionedQualifiedReferenceName] name=ID ("inherits"
 * 	inherits+=[MAbstractComponent|VersionedQualifiedName] ("," inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
 * 	"{" ("version" ":=" version=Version ";" & ("attributes" "{" attributes+=MParameter+ "}" ";")? & ("attribute" "values"
 * 	"{" attributeValueAssignments+=MParameterValueAssignment* "}" ";")? & ("external" "ports" "{" externalPorts+=MPort+
 * 	"}" ";")?) "}" ";";
 *
 **/

// "abstract" "component" domain=[mclevdom::MDomain|VersionedQualifiedName] "::"
// type=[mclevdom::MComponentType|VersionedQualifiedReferenceName] name=ID ("inherits"
// inherits+=[MAbstractComponent|VersionedQualifiedName] ("," inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
// "{" ("version" ":=" version=Version ";" & ("attributes" "{" attributes+=MParameter+ "}" ";")? & ("attribute" "values"
// "{" attributeValueAssignments+=MParameterValueAssignment* "}" ";")? & ("external" "ports" "{" externalPorts+=MPort+ "}"
// ";")?) "}" ";"
protected class MAbstractComponent_Group extends GroupToken {
	
	public MAbstractComponent_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_SemicolonKeyword_10(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAbstractComponentRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "abstract"
protected class MAbstractComponent_AbstractKeyword_0 extends KeywordToken  {
	
	public MAbstractComponent_AbstractKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getAbstractKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// "component"
protected class MAbstractComponent_ComponentKeyword_1 extends KeywordToken  {
	
	public MAbstractComponent_ComponentKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getComponentKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_AbstractKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// domain=[mclevdom::MDomain|VersionedQualifiedName]
protected class MAbstractComponent_DomainAssignment_2 extends AssignmentToken  {
	
	public MAbstractComponent_DomainAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getDomainAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_ComponentKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("domain",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("domain");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAbstractComponentAccess().getDomainMDomainCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAbstractComponentAccess().getDomainMDomainCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "::"
protected class MAbstractComponent_ColonColonKeyword_3 extends KeywordToken  {
	
	public MAbstractComponent_ColonColonKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getColonColonKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_DomainAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// type=[mclevdom::MComponentType|VersionedQualifiedReferenceName]
protected class MAbstractComponent_TypeAssignment_4 extends AssignmentToken  {
	
	public MAbstractComponent_TypeAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getTypeAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_ColonColonKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAbstractComponentAccess().getTypeMComponentTypeCrossReference_4_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAbstractComponentAccess().getTypeMComponentTypeCrossReference_4_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MAbstractComponent_NameAssignment_5 extends AssignmentToken  {
	
	public MAbstractComponent_NameAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getNameAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_TypeAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMAbstractComponentAccess().getNameIDTerminalRuleCall_5_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMAbstractComponentAccess().getNameIDTerminalRuleCall_5_0();
			return obj;
		}
		return null;
	}

}

// ("inherits" inherits+=[MAbstractComponent|VersionedQualifiedName] (","
// inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
protected class MAbstractComponent_Group_6 extends GroupToken {
	
	public MAbstractComponent_Group_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getGroup_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_Group_6_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractComponent_InheritsAssignment_6_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "inherits"
protected class MAbstractComponent_InheritsKeyword_6_0 extends KeywordToken  {
	
	public MAbstractComponent_InheritsKeyword_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getInheritsKeyword_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_NameAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractComponent|VersionedQualifiedName]
protected class MAbstractComponent_InheritsAssignment_6_1 extends AssignmentToken  {
	
	public MAbstractComponent_InheritsAssignment_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getInheritsAssignment_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_InheritsKeyword_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentCrossReference_6_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentCrossReference_6_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MAbstractComponent|VersionedQualifiedName])*
protected class MAbstractComponent_Group_6_2 extends GroupToken {
	
	public MAbstractComponent_Group_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getGroup_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_InheritsAssignment_6_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MAbstractComponent_CommaKeyword_6_2_0 extends KeywordToken  {
	
	public MAbstractComponent_CommaKeyword_6_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getCommaKeyword_6_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_Group_6_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractComponent_InheritsAssignment_6_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractComponent|VersionedQualifiedName]
protected class MAbstractComponent_InheritsAssignment_6_2_1 extends AssignmentToken  {
	
	public MAbstractComponent_InheritsAssignment_6_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getInheritsAssignment_6_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_CommaKeyword_6_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentCrossReference_6_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAbstractComponentAccess().getInheritsMAbstractComponentCrossReference_6_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MAbstractComponent_LeftCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MAbstractComponent_LeftCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_Group_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractComponent_NameAssignment_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & ("attributes" "{" attributes+=MParameter+ "}" ";")? & ("attribute" "values" "{"
// attributeValueAssignments+=MParameterValueAssignment* "}" ";")? & ("external" "ports" "{" externalPorts+=MPort+ "}"
// ";")?
protected class MAbstractComponent_UnorderedGroup_8 extends UnorderedGroupToken {
	
	public MAbstractComponent_UnorderedGroup_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getUnorderedGroup_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_Group_8_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractComponent_Group_8_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MAbstractComponent_Group_8_1(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MAbstractComponent_Group_8_0(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MAbstractComponent_Group_8_0 extends GroupToken {
	
	public MAbstractComponent_Group_8_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getGroup_8_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_SemicolonKeyword_8_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MAbstractComponent_VersionKeyword_8_0_0 extends KeywordToken  {
	
	public MAbstractComponent_VersionKeyword_8_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getVersionKeyword_8_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_LeftCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MAbstractComponent_ColonEqualsSignKeyword_8_0_1 extends KeywordToken  {
	
	public MAbstractComponent_ColonEqualsSignKeyword_8_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getColonEqualsSignKeyword_8_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_VersionKeyword_8_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MAbstractComponent_VersionAssignment_8_0_2 extends AssignmentToken  {
	
	public MAbstractComponent_VersionAssignment_8_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getVersionAssignment_8_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_ColonEqualsSignKeyword_8_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMAbstractComponentAccess().getVersionVersionParserRuleCall_8_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMAbstractComponentAccess().getVersionVersionParserRuleCall_8_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MAbstractComponent_SemicolonKeyword_8_0_3 extends KeywordToken  {
	
	public MAbstractComponent_SemicolonKeyword_8_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_VersionAssignment_8_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("attributes" "{" attributes+=MParameter+ "}" ";")?
protected class MAbstractComponent_Group_8_1 extends GroupToken {
	
	public MAbstractComponent_Group_8_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getGroup_8_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_SemicolonKeyword_8_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attributes"
protected class MAbstractComponent_AttributesKeyword_8_1_0 extends KeywordToken  {
	
	public MAbstractComponent_AttributesKeyword_8_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getAttributesKeyword_8_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_Group_8_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MAbstractComponent_LeftCurlyBracketKeyword_8_1_1 extends KeywordToken  {
	
	public MAbstractComponent_LeftCurlyBracketKeyword_8_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_AttributesKeyword_8_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class MAbstractComponent_AttributesAssignment_8_1_2 extends AssignmentToken  {
	
	public MAbstractComponent_AttributesAssignment_8_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getAttributesAssignment_8_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAbstractComponentAccess().getAttributesMParameterParserRuleCall_8_1_2_0(); 
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
			case 0: return new MAbstractComponent_AttributesAssignment_8_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAbstractComponent_LeftCurlyBracketKeyword_8_1_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MAbstractComponent_RightCurlyBracketKeyword_8_1_3 extends KeywordToken  {
	
	public MAbstractComponent_RightCurlyBracketKeyword_8_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_AttributesAssignment_8_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MAbstractComponent_SemicolonKeyword_8_1_4 extends KeywordToken  {
	
	public MAbstractComponent_SemicolonKeyword_8_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_RightCurlyBracketKeyword_8_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("attribute" "values" "{" attributeValueAssignments+=MParameterValueAssignment* "}" ";")?
protected class MAbstractComponent_Group_8_2 extends GroupToken {
	
	public MAbstractComponent_Group_8_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getGroup_8_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_SemicolonKeyword_8_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attribute"
protected class MAbstractComponent_AttributeKeyword_8_2_0 extends KeywordToken  {
	
	public MAbstractComponent_AttributeKeyword_8_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getAttributeKeyword_8_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_Group_8_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractComponent_Group_8_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "values"
protected class MAbstractComponent_ValuesKeyword_8_2_1 extends KeywordToken  {
	
	public MAbstractComponent_ValuesKeyword_8_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getValuesKeyword_8_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_AttributeKeyword_8_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MAbstractComponent_LeftCurlyBracketKeyword_8_2_2 extends KeywordToken  {
	
	public MAbstractComponent_LeftCurlyBracketKeyword_8_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_ValuesKeyword_8_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MParameterValueAssignment*
protected class MAbstractComponent_AttributeValueAssignmentsAssignment_8_2_3 extends AssignmentToken  {
	
	public MAbstractComponent_AttributeValueAssignmentsAssignment_8_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getAttributeValueAssignmentsAssignment_8_2_3();
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
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAbstractComponentAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_2_3_0(); 
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
			case 0: return new MAbstractComponent_AttributeValueAssignmentsAssignment_8_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAbstractComponent_LeftCurlyBracketKeyword_8_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MAbstractComponent_RightCurlyBracketKeyword_8_2_4 extends KeywordToken  {
	
	public MAbstractComponent_RightCurlyBracketKeyword_8_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_AttributeValueAssignmentsAssignment_8_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MAbstractComponent_SemicolonKeyword_8_2_5 extends KeywordToken  {
	
	public MAbstractComponent_SemicolonKeyword_8_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_RightCurlyBracketKeyword_8_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("external" "ports" "{" externalPorts+=MPort+ "}" ";")?
protected class MAbstractComponent_Group_8_3 extends GroupToken {
	
	public MAbstractComponent_Group_8_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getGroup_8_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_SemicolonKeyword_8_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "external"
protected class MAbstractComponent_ExternalKeyword_8_3_0 extends KeywordToken  {
	
	public MAbstractComponent_ExternalKeyword_8_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getExternalKeyword_8_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_Group_8_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractComponent_Group_8_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MAbstractComponent_Group_8_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "ports"
protected class MAbstractComponent_PortsKeyword_8_3_1 extends KeywordToken  {
	
	public MAbstractComponent_PortsKeyword_8_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getPortsKeyword_8_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_ExternalKeyword_8_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MAbstractComponent_LeftCurlyBracketKeyword_8_3_2 extends KeywordToken  {
	
	public MAbstractComponent_LeftCurlyBracketKeyword_8_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getLeftCurlyBracketKeyword_8_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_PortsKeyword_8_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// externalPorts+=MPort+
protected class MAbstractComponent_ExternalPortsAssignment_8_3_3 extends AssignmentToken  {
	
	public MAbstractComponent_ExternalPortsAssignment_8_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getExternalPortsAssignment_8_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPort_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("externalPorts",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("externalPorts");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPortRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAbstractComponentAccess().getExternalPortsMPortParserRuleCall_8_3_3_0(); 
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
			case 0: return new MAbstractComponent_ExternalPortsAssignment_8_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAbstractComponent_LeftCurlyBracketKeyword_8_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MAbstractComponent_RightCurlyBracketKeyword_8_3_4 extends KeywordToken  {
	
	public MAbstractComponent_RightCurlyBracketKeyword_8_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_8_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_ExternalPortsAssignment_8_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MAbstractComponent_SemicolonKeyword_8_3_5 extends KeywordToken  {
	
	public MAbstractComponent_SemicolonKeyword_8_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_8_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_RightCurlyBracketKeyword_8_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MAbstractComponent_RightCurlyBracketKeyword_9 extends KeywordToken  {
	
	public MAbstractComponent_RightCurlyBracketKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getRightCurlyBracketKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_UnorderedGroup_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MAbstractComponent_SemicolonKeyword_10 extends KeywordToken  {
	
	public MAbstractComponent_SemicolonKeyword_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractComponentAccess().getSemicolonKeyword_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractComponent_RightCurlyBracketKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MAbstractComponent ****************/


/************ begin Rule MComponent ****************
 *
 * MComponent:
 * 	{MComponent} "component" domain=[mclevdom::MDomain|VersionedQualifiedName] "::"
 * 	type=[mclevdom::MComponentType|VersionedQualifiedReferenceName] name=ID ("inherits"
 * 	inherits+=[MAbstractComponent|VersionedQualifiedName] ("," inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
 * 	"{" ("version" ":=" version=Version ";" & ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
 * 	languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("attributes" "{" attributes+=MParameter+ "}" ";")? &
 * 	("attribute" "values" "{" attributeValueAssignments+=MParameterValueAssignment* "}" ";")? & ("external" "ports" "{"
 * 	externalPorts+=MPort+ "}" ";")? & ("internal" "ports" "{" internalPorts+=MPort+ "}" ";")? & ("requires" ":="
 * 	requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")? &
 * 	("supported" "platforms" "{" supportedPlatforms+=ComponentSupportedPlatform+ "}" ";")? & ("subcomponent" "instances"
 * 	"{" internalComponents+=MInternalComponentInstance+ "}" ";")? & ("connections" "{" connections+=MInternalConnection+
 * 	"}" ";")?) "}" ";";
 *
 **/

// {MComponent} "component" domain=[mclevdom::MDomain|VersionedQualifiedName] "::"
// type=[mclevdom::MComponentType|VersionedQualifiedReferenceName] name=ID ("inherits"
// inherits+=[MAbstractComponent|VersionedQualifiedName] ("," inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
// "{" ("version" ":=" version=Version ";" & ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("attributes" "{" attributes+=MParameter+ "}" ";")? &
// ("attribute" "values" "{" attributeValueAssignments+=MParameterValueAssignment* "}" ";")? & ("external" "ports" "{"
// externalPorts+=MPort+ "}" ";")? & ("internal" "ports" "{" internalPorts+=MPort+ "}" ";")? & ("requires" ":="
// requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")? &
// ("supported" "platforms" "{" supportedPlatforms+=ComponentSupportedPlatform+ "}" ";")? & ("subcomponent" "instances"
// "{" internalComponents+=MInternalComponentInstance+ "}" ";")? & ("connections" "{" connections+=MInternalConnection+
// "}" ";")?) "}" ";"
protected class MComponent_Group extends GroupToken {
	
	public MComponent_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SemicolonKeyword_10(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMComponentAccess().getMComponentAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MComponent}
protected class MComponent_MComponentAction_0 extends ActionToken  {

	public MComponent_MComponentAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMComponentAccess().getMComponentAction_0();
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

// "component"
protected class MComponent_ComponentKeyword_1 extends KeywordToken  {
	
	public MComponent_ComponentKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getComponentKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_MComponentAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// domain=[mclevdom::MDomain|VersionedQualifiedName]
protected class MComponent_DomainAssignment_2 extends AssignmentToken  {
	
	public MComponent_DomainAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getDomainAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_ComponentKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("domain",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("domain");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMComponentAccess().getDomainMDomainCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMComponentAccess().getDomainMDomainCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "::"
protected class MComponent_ColonColonKeyword_3 extends KeywordToken  {
	
	public MComponent_ColonColonKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getColonColonKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_DomainAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// type=[mclevdom::MComponentType|VersionedQualifiedReferenceName]
protected class MComponent_TypeAssignment_4 extends AssignmentToken  {
	
	public MComponent_TypeAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getTypeAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_ColonColonKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMComponentAccess().getTypeMComponentTypeCrossReference_4_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMComponentAccess().getTypeMComponentTypeCrossReference_4_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MComponent_NameAssignment_5 extends AssignmentToken  {
	
	public MComponent_NameAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getNameAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_TypeAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMComponentAccess().getNameIDTerminalRuleCall_5_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMComponentAccess().getNameIDTerminalRuleCall_5_0();
			return obj;
		}
		return null;
	}

}

// ("inherits" inherits+=[MAbstractComponent|VersionedQualifiedName] (","
// inherits+=[MAbstractComponent|VersionedQualifiedName])*)?
protected class MComponent_Group_6 extends GroupToken {
	
	public MComponent_Group_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_6_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_InheritsAssignment_6_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "inherits"
protected class MComponent_InheritsKeyword_6_0 extends KeywordToken  {
	
	public MComponent_InheritsKeyword_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getInheritsKeyword_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_NameAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractComponent|VersionedQualifiedName]
protected class MComponent_InheritsAssignment_6_1 extends AssignmentToken  {
	
	public MComponent_InheritsAssignment_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getInheritsAssignment_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_InheritsKeyword_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentCrossReference_6_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMComponentAccess().getInheritsMAbstractComponentCrossReference_6_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MAbstractComponent|VersionedQualifiedName])*
protected class MComponent_Group_6_2 extends GroupToken {
	
	public MComponent_Group_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_InheritsAssignment_6_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MComponent_CommaKeyword_6_2_0 extends KeywordToken  {
	
	public MComponent_CommaKeyword_6_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getCommaKeyword_6_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_6_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_InheritsAssignment_6_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractComponent|VersionedQualifiedName]
protected class MComponent_InheritsAssignment_6_2_1 extends AssignmentToken  {
	
	public MComponent_InheritsAssignment_6_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getInheritsAssignment_6_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_CommaKeyword_6_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMComponentAccess().getInheritsMAbstractComponentCrossReference_6_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMComponentAccess().getInheritsMAbstractComponentCrossReference_6_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MComponent_LeftCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MComponent_LeftCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_NameAssignment_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("attributes" "{" attributes+=MParameter+ "}" ";")? &
// ("attribute" "values" "{" attributeValueAssignments+=MParameterValueAssignment* "}" ";")? & ("external" "ports" "{"
// externalPorts+=MPort+ "}" ";")? & ("internal" "ports" "{" internalPorts+=MPort+ "}" ";")? & ("requires" ":="
// requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")? &
// ("supported" "platforms" "{" supportedPlatforms+=ComponentSupportedPlatform+ "}" ";")? & ("subcomponent" "instances"
// "{" internalComponents+=MInternalComponentInstance+ "}" ";")? & ("connections" "{" connections+=MInternalConnection+
// "}" ";")?
protected class MComponent_UnorderedGroup_8 extends UnorderedGroupToken {
	
	public MComponent_UnorderedGroup_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMComponentAccess().getUnorderedGroup_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_9(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_Group_8_8(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MComponent_Group_8_7(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MComponent_Group_8_6(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MComponent_Group_8_5(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MComponent_Group_8_4(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MComponent_Group_8_3(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MComponent_Group_8_2(lastRuleCallOrigin, this, 7, inst);
			case 8: return new MComponent_Group_8_1(lastRuleCallOrigin, this, 8, inst);
			case 9: return new MComponent_Group_8_0(lastRuleCallOrigin, this, 9, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MComponent_Group_8_0 extends GroupToken {
	
	public MComponent_Group_8_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_8_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SemicolonKeyword_8_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MComponent_VersionKeyword_8_0_0 extends KeywordToken  {
	
	public MComponent_VersionKeyword_8_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getVersionKeyword_8_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_LeftCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MComponent_ColonEqualsSignKeyword_8_0_1 extends KeywordToken  {
	
	public MComponent_ColonEqualsSignKeyword_8_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_VersionKeyword_8_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MComponent_VersionAssignment_8_0_2 extends AssignmentToken  {
	
	public MComponent_VersionAssignment_8_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getVersionAssignment_8_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_ColonEqualsSignKeyword_8_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMComponentAccess().getVersionVersionParserRuleCall_8_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMComponentAccess().getVersionVersionParserRuleCall_8_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MComponent_SemicolonKeyword_8_0_3 extends KeywordToken  {
	
	public MComponent_SemicolonKeyword_8_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSemicolonKeyword_8_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_VersionAssignment_8_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")?
protected class MComponent_Group_8_1 extends GroupToken {
	
	public MComponent_Group_8_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_8_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SemicolonKeyword_8_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "languages"
protected class MComponent_LanguagesKeyword_8_1_0 extends KeywordToken  {
	
	public MComponent_LanguagesKeyword_8_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getLanguagesKeyword_8_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MComponent_ColonEqualsSignKeyword_8_1_1 extends KeywordToken  {
	
	public MComponent_ColonEqualsSignKeyword_8_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_LanguagesKeyword_8_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MComponent_LanguagesAssignment_8_1_2 extends AssignmentToken  {
	
	public MComponent_LanguagesAssignment_8_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getLanguagesAssignment_8_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_ColonEqualsSignKeyword_8_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMComponentAccess().getLanguagesMLanguageCrossReference_8_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMComponentAccess().getLanguagesMLanguageCrossReference_8_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MComponent_Group_8_1_3 extends GroupToken {
	
	public MComponent_Group_8_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_8_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_LanguagesAssignment_8_1_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MComponent_CommaKeyword_8_1_3_0 extends KeywordToken  {
	
	public MComponent_CommaKeyword_8_1_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getCommaKeyword_8_1_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_LanguagesAssignment_8_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MComponent_LanguagesAssignment_8_1_3_1 extends AssignmentToken  {
	
	public MComponent_LanguagesAssignment_8_1_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getLanguagesAssignment_8_1_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_CommaKeyword_8_1_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMComponentAccess().getLanguagesMLanguageCrossReference_8_1_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMComponentAccess().getLanguagesMLanguageCrossReference_8_1_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MComponent_SemicolonKeyword_8_1_4 extends KeywordToken  {
	
	public MComponent_SemicolonKeyword_8_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSemicolonKeyword_8_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_LanguagesAssignment_8_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("attributes" "{" attributes+=MParameter+ "}" ";")?
protected class MComponent_Group_8_2 extends GroupToken {
	
	public MComponent_Group_8_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_8_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SemicolonKeyword_8_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attributes"
protected class MComponent_AttributesKeyword_8_2_0 extends KeywordToken  {
	
	public MComponent_AttributesKeyword_8_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getAttributesKeyword_8_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_Group_8_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MComponent_LeftCurlyBracketKeyword_8_2_1 extends KeywordToken  {
	
	public MComponent_LeftCurlyBracketKeyword_8_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_AttributesKeyword_8_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class MComponent_AttributesAssignment_8_2_2 extends AssignmentToken  {
	
	public MComponent_AttributesAssignment_8_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getAttributesAssignment_8_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMComponentAccess().getAttributesMParameterParserRuleCall_8_2_2_0(); 
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
			case 0: return new MComponent_AttributesAssignment_8_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MComponent_LeftCurlyBracketKeyword_8_2_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MComponent_RightCurlyBracketKeyword_8_2_3 extends KeywordToken  {
	
	public MComponent_RightCurlyBracketKeyword_8_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_AttributesAssignment_8_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MComponent_SemicolonKeyword_8_2_4 extends KeywordToken  {
	
	public MComponent_SemicolonKeyword_8_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSemicolonKeyword_8_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_RightCurlyBracketKeyword_8_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("attribute" "values" "{" attributeValueAssignments+=MParameterValueAssignment* "}" ";")?
protected class MComponent_Group_8_3 extends GroupToken {
	
	public MComponent_Group_8_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_8_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SemicolonKeyword_8_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attribute"
protected class MComponent_AttributeKeyword_8_3_0 extends KeywordToken  {
	
	public MComponent_AttributeKeyword_8_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getAttributeKeyword_8_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_Group_8_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MComponent_Group_8_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "values"
protected class MComponent_ValuesKeyword_8_3_1 extends KeywordToken  {
	
	public MComponent_ValuesKeyword_8_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getValuesKeyword_8_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_AttributeKeyword_8_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MComponent_LeftCurlyBracketKeyword_8_3_2 extends KeywordToken  {
	
	public MComponent_LeftCurlyBracketKeyword_8_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_ValuesKeyword_8_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MParameterValueAssignment*
protected class MComponent_AttributeValueAssignmentsAssignment_8_3_3 extends AssignmentToken  {
	
	public MComponent_AttributeValueAssignmentsAssignment_8_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getAttributeValueAssignmentsAssignment_8_3_3();
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
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMComponentAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_8_3_3_0(); 
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
			case 0: return new MComponent_AttributeValueAssignmentsAssignment_8_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MComponent_LeftCurlyBracketKeyword_8_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MComponent_RightCurlyBracketKeyword_8_3_4 extends KeywordToken  {
	
	public MComponent_RightCurlyBracketKeyword_8_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_AttributeValueAssignmentsAssignment_8_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MComponent_SemicolonKeyword_8_3_5 extends KeywordToken  {
	
	public MComponent_SemicolonKeyword_8_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSemicolonKeyword_8_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_RightCurlyBracketKeyword_8_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("external" "ports" "{" externalPorts+=MPort+ "}" ";")?
protected class MComponent_Group_8_4 extends GroupToken {
	
	public MComponent_Group_8_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_8_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SemicolonKeyword_8_4_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "external"
protected class MComponent_ExternalKeyword_8_4_0 extends KeywordToken  {
	
	public MComponent_ExternalKeyword_8_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getExternalKeyword_8_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_Group_8_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MComponent_Group_8_1(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MComponent_Group_8_0(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// "ports"
protected class MComponent_PortsKeyword_8_4_1 extends KeywordToken  {
	
	public MComponent_PortsKeyword_8_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getPortsKeyword_8_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_ExternalKeyword_8_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MComponent_LeftCurlyBracketKeyword_8_4_2 extends KeywordToken  {
	
	public MComponent_LeftCurlyBracketKeyword_8_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_PortsKeyword_8_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// externalPorts+=MPort+
protected class MComponent_ExternalPortsAssignment_8_4_3 extends AssignmentToken  {
	
	public MComponent_ExternalPortsAssignment_8_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getExternalPortsAssignment_8_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPort_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("externalPorts",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("externalPorts");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPortRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMComponentAccess().getExternalPortsMPortParserRuleCall_8_4_3_0(); 
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
			case 0: return new MComponent_ExternalPortsAssignment_8_4_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MComponent_LeftCurlyBracketKeyword_8_4_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MComponent_RightCurlyBracketKeyword_8_4_4 extends KeywordToken  {
	
	public MComponent_RightCurlyBracketKeyword_8_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_ExternalPortsAssignment_8_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MComponent_SemicolonKeyword_8_4_5 extends KeywordToken  {
	
	public MComponent_SemicolonKeyword_8_4_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSemicolonKeyword_8_4_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_RightCurlyBracketKeyword_8_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("internal" "ports" "{" internalPorts+=MPort+ "}" ";")?
protected class MComponent_Group_8_5 extends GroupToken {
	
	public MComponent_Group_8_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_8_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SemicolonKeyword_8_5_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "internal"
protected class MComponent_InternalKeyword_8_5_0 extends KeywordToken  {
	
	public MComponent_InternalKeyword_8_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getInternalKeyword_8_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_Group_8_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MComponent_Group_8_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MComponent_Group_8_1(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MComponent_Group_8_0(lastRuleCallOrigin, this, 4, inst);
			default: return null;
		}	
	}

}

// "ports"
protected class MComponent_PortsKeyword_8_5_1 extends KeywordToken  {
	
	public MComponent_PortsKeyword_8_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getPortsKeyword_8_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_InternalKeyword_8_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MComponent_LeftCurlyBracketKeyword_8_5_2 extends KeywordToken  {
	
	public MComponent_LeftCurlyBracketKeyword_8_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_PortsKeyword_8_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// internalPorts+=MPort+
protected class MComponent_InternalPortsAssignment_8_5_3 extends AssignmentToken  {
	
	public MComponent_InternalPortsAssignment_8_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getInternalPortsAssignment_8_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPort_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("internalPorts",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("internalPorts");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPortRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMComponentAccess().getInternalPortsMPortParserRuleCall_8_5_3_0(); 
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
			case 0: return new MComponent_InternalPortsAssignment_8_5_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MComponent_LeftCurlyBracketKeyword_8_5_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MComponent_RightCurlyBracketKeyword_8_5_4 extends KeywordToken  {
	
	public MComponent_RightCurlyBracketKeyword_8_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_InternalPortsAssignment_8_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MComponent_SemicolonKeyword_8_5_5 extends KeywordToken  {
	
	public MComponent_SemicolonKeyword_8_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSemicolonKeyword_8_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_RightCurlyBracketKeyword_8_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("requires" ":=" requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")?
protected class MComponent_Group_8_6 extends GroupToken {
	
	public MComponent_Group_8_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_8_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SemicolonKeyword_8_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "requires"
protected class MComponent_RequiresKeyword_8_6_0 extends KeywordToken  {
	
	public MComponent_RequiresKeyword_8_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getRequiresKeyword_8_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_Group_8_4(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MComponent_Group_8_3(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MComponent_Group_8_2(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MComponent_Group_8_1(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MComponent_Group_8_0(lastRuleCallOrigin, this, 5, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MComponent_ColonEqualsSignKeyword_8_6_1 extends KeywordToken  {
	
	public MComponent_ColonEqualsSignKeyword_8_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getColonEqualsSignKeyword_8_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_RequiresKeyword_8_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MComponent_RequiresAssignment_8_6_2 extends AssignmentToken  {
	
	public MComponent_RequiresAssignment_8_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getRequiresAssignment_8_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_ColonEqualsSignKeyword_8_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMComponentAccess().getRequiresMSAICrossReference_8_6_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMComponentAccess().getRequiresMSAICrossReference_8_6_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])*
protected class MComponent_Group_8_6_3 extends GroupToken {
	
	public MComponent_Group_8_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_8_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_RequiresAssignment_8_6_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MComponent_CommaKeyword_8_6_3_0 extends KeywordToken  {
	
	public MComponent_CommaKeyword_8_6_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getCommaKeyword_8_6_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_6_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_RequiresAssignment_8_6_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MComponent_RequiresAssignment_8_6_3_1 extends AssignmentToken  {
	
	public MComponent_RequiresAssignment_8_6_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getRequiresAssignment_8_6_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_CommaKeyword_8_6_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMComponentAccess().getRequiresMSAICrossReference_8_6_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMComponentAccess().getRequiresMSAICrossReference_8_6_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MComponent_SemicolonKeyword_8_6_4 extends KeywordToken  {
	
	public MComponent_SemicolonKeyword_8_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSemicolonKeyword_8_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_6_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_RequiresAssignment_8_6_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("supported" "platforms" "{" supportedPlatforms+=ComponentSupportedPlatform+ "}" ";")?
protected class MComponent_Group_8_7 extends GroupToken {
	
	public MComponent_Group_8_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_8_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SemicolonKeyword_8_7_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "supported"
protected class MComponent_SupportedKeyword_8_7_0 extends KeywordToken  {
	
	public MComponent_SupportedKeyword_8_7_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSupportedKeyword_8_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_Group_8_5(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MComponent_Group_8_4(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MComponent_Group_8_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MComponent_Group_8_2(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MComponent_Group_8_1(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MComponent_Group_8_0(lastRuleCallOrigin, this, 6, inst);
			default: return null;
		}	
	}

}

// "platforms"
protected class MComponent_PlatformsKeyword_8_7_1 extends KeywordToken  {
	
	public MComponent_PlatformsKeyword_8_7_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getPlatformsKeyword_8_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SupportedKeyword_8_7_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MComponent_LeftCurlyBracketKeyword_8_7_2 extends KeywordToken  {
	
	public MComponent_LeftCurlyBracketKeyword_8_7_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_7_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_PlatformsKeyword_8_7_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedPlatforms+=ComponentSupportedPlatform+
protected class MComponent_SupportedPlatformsAssignment_8_7_3 extends AssignmentToken  {
	
	public MComponent_SupportedPlatformsAssignment_8_7_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSupportedPlatformsAssignment_8_7_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedPlatforms",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getComponentSupportedPlatformRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMComponentAccess().getSupportedPlatformsComponentSupportedPlatformParserRuleCall_8_7_3_0(); 
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
			case 0: return new MComponent_SupportedPlatformsAssignment_8_7_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MComponent_LeftCurlyBracketKeyword_8_7_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MComponent_RightCurlyBracketKeyword_8_7_4 extends KeywordToken  {
	
	public MComponent_RightCurlyBracketKeyword_8_7_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_7_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SupportedPlatformsAssignment_8_7_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MComponent_SemicolonKeyword_8_7_5 extends KeywordToken  {
	
	public MComponent_SemicolonKeyword_8_7_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSemicolonKeyword_8_7_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_RightCurlyBracketKeyword_8_7_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("subcomponent" "instances" "{" internalComponents+=MInternalComponentInstance+ "}" ";")?
protected class MComponent_Group_8_8 extends GroupToken {
	
	public MComponent_Group_8_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_8_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SemicolonKeyword_8_8_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "subcomponent"
protected class MComponent_SubcomponentKeyword_8_8_0 extends KeywordToken  {
	
	public MComponent_SubcomponentKeyword_8_8_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSubcomponentKeyword_8_8_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_7(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_Group_8_6(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MComponent_Group_8_5(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MComponent_Group_8_4(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MComponent_Group_8_3(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MComponent_Group_8_2(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MComponent_Group_8_1(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MComponent_Group_8_0(lastRuleCallOrigin, this, 7, inst);
			default: return null;
		}	
	}

}

// "instances"
protected class MComponent_InstancesKeyword_8_8_1 extends KeywordToken  {
	
	public MComponent_InstancesKeyword_8_8_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getInstancesKeyword_8_8_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SubcomponentKeyword_8_8_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MComponent_LeftCurlyBracketKeyword_8_8_2 extends KeywordToken  {
	
	public MComponent_LeftCurlyBracketKeyword_8_8_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_8_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_InstancesKeyword_8_8_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// internalComponents+=MInternalComponentInstance+
protected class MComponent_InternalComponentsAssignment_8_8_3 extends AssignmentToken  {
	
	public MComponent_InternalComponentsAssignment_8_8_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getInternalComponentsAssignment_8_8_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("internalComponents",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("internalComponents");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMComponentAccess().getInternalComponentsMInternalComponentInstanceParserRuleCall_8_8_3_0(); 
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
			case 0: return new MComponent_InternalComponentsAssignment_8_8_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MComponent_LeftCurlyBracketKeyword_8_8_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MComponent_RightCurlyBracketKeyword_8_8_4 extends KeywordToken  {
	
	public MComponent_RightCurlyBracketKeyword_8_8_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_8_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_InternalComponentsAssignment_8_8_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MComponent_SemicolonKeyword_8_8_5 extends KeywordToken  {
	
	public MComponent_SemicolonKeyword_8_8_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSemicolonKeyword_8_8_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_RightCurlyBracketKeyword_8_8_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("connections" "{" connections+=MInternalConnection+ "}" ";")?
protected class MComponent_Group_8_9 extends GroupToken {
	
	public MComponent_Group_8_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMComponentAccess().getGroup_8_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_SemicolonKeyword_8_9_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "connections"
protected class MComponent_ConnectionsKeyword_8_9_0 extends KeywordToken  {
	
	public MComponent_ConnectionsKeyword_8_9_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getConnectionsKeyword_8_9_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_Group_8_8(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MComponent_Group_8_7(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MComponent_Group_8_6(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MComponent_Group_8_5(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MComponent_Group_8_4(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MComponent_Group_8_3(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MComponent_Group_8_2(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MComponent_Group_8_1(lastRuleCallOrigin, this, 7, inst);
			case 8: return new MComponent_Group_8_0(lastRuleCallOrigin, this, 8, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MComponent_LeftCurlyBracketKeyword_8_9_1 extends KeywordToken  {
	
	public MComponent_LeftCurlyBracketKeyword_8_9_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getLeftCurlyBracketKeyword_8_9_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_ConnectionsKeyword_8_9_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// connections+=MInternalConnection+
protected class MComponent_ConnectionsAssignment_8_9_2 extends AssignmentToken  {
	
	public MComponent_ConnectionsAssignment_8_9_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMComponentAccess().getConnectionsAssignment_8_9_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalConnection_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("connections",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("connections");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalConnectionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMComponentAccess().getConnectionsMInternalConnectionParserRuleCall_8_9_2_0(); 
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
			case 0: return new MComponent_ConnectionsAssignment_8_9_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MComponent_LeftCurlyBracketKeyword_8_9_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MComponent_RightCurlyBracketKeyword_8_9_3 extends KeywordToken  {
	
	public MComponent_RightCurlyBracketKeyword_8_9_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_8_9_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_ConnectionsAssignment_8_9_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MComponent_SemicolonKeyword_8_9_4 extends KeywordToken  {
	
	public MComponent_SemicolonKeyword_8_9_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSemicolonKeyword_8_9_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_RightCurlyBracketKeyword_8_9_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MComponent_RightCurlyBracketKeyword_9 extends KeywordToken  {
	
	public MComponent_RightCurlyBracketKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getRightCurlyBracketKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_UnorderedGroup_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MComponent_SemicolonKeyword_10 extends KeywordToken  {
	
	public MComponent_SemicolonKeyword_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMComponentAccess().getSemicolonKeyword_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MComponent_RightCurlyBracketKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MComponent ****************/


/************ begin Rule MInternalComponentInstance ****************
 *
 * MInternalComponentInstance:
 * 	isSingleton?="singleton"? "instance" component=[MComponent|VersionedQualifiedName] name=ID "{"
 * 	attributeValueAssignments+=MParameterValueAssignment* "}" ";";
 *
 **/

// isSingleton?="singleton"? "instance" component=[MComponent|VersionedQualifiedName] name=ID "{"
// attributeValueAssignments+=MParameterValueAssignment* "}" ";"
protected class MInternalComponentInstance_Group extends GroupToken {
	
	public MInternalComponentInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInternalComponentInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentInstance_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalComponentInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// isSingleton?="singleton"?
protected class MInternalComponentInstance_IsSingletonAssignment_0 extends AssignmentToken  {
	
	public MInternalComponentInstance_IsSingletonAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentInstanceAccess().getIsSingletonAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("isSingleton",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("isSingleton");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMInternalComponentInstanceAccess().getIsSingletonSingletonKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "instance"
protected class MInternalComponentInstance_InstanceKeyword_1 extends KeywordToken  {
	
	public MInternalComponentInstance_InstanceKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentInstanceAccess().getInstanceKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentInstance_IsSingletonAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// component=[MComponent|VersionedQualifiedName]
protected class MInternalComponentInstance_ComponentAssignment_2 extends AssignmentToken  {
	
	public MInternalComponentInstance_ComponentAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentInstanceAccess().getComponentAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentInstance_InstanceKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("component",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("component");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentInstanceAccess().getComponentMComponentCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentInstanceAccess().getComponentMComponentCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MInternalComponentInstance_NameAssignment_3 extends AssignmentToken  {
	
	public MInternalComponentInstance_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentInstanceAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentInstance_ComponentAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMInternalComponentInstanceAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMInternalComponentInstanceAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MInternalComponentInstance_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MInternalComponentInstance_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentInstanceAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentInstance_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MParameterValueAssignment*
protected class MInternalComponentInstance_AttributeValueAssignmentsAssignment_5 extends AssignmentToken  {
	
	public MInternalComponentInstance_AttributeValueAssignmentsAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentInstanceAccess().getAttributeValueAssignmentsAssignment_5();
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
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMInternalComponentInstanceAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_0(); 
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
			case 0: return new MInternalComponentInstance_AttributeValueAssignmentsAssignment_5(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MInternalComponentInstance_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MInternalComponentInstance_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MInternalComponentInstance_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentInstanceAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentInstance_AttributeValueAssignmentsAssignment_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalComponentInstance_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MInternalComponentInstance_SemicolonKeyword_7 extends KeywordToken  {
	
	public MInternalComponentInstance_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentInstanceAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentInstance_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MInternalComponentInstance ****************/


/************ begin Rule MServerPort ****************
 *
 * MServerPort:
 * 	{MServerPort} "server" type=[mclevdom::MPortType|VersionedQualifiedReferenceName]
 * 	interface=[mcleviface::MInterface|VersionedQualifiedName] name=ID "{"
 * 	attributeValueAssignments+=MParameterValueAssignment* "}" ";";
 *
 **/

// {MServerPort} "server" type=[mclevdom::MPortType|VersionedQualifiedReferenceName]
// interface=[mcleviface::MInterface|VersionedQualifiedName] name=ID "{"
// attributeValueAssignments+=MParameterValueAssignment* "}" ";"
protected class MServerPort_Group extends GroupToken {
	
	public MServerPort_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServerPortAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServerPort_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMServerPortAccess().getMServerPortAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MServerPort}
protected class MServerPort_MServerPortAction_0 extends ActionToken  {

	public MServerPort_MServerPortAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMServerPortAccess().getMServerPortAction_0();
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

// "server"
protected class MServerPort_ServerKeyword_1 extends KeywordToken  {
	
	public MServerPort_ServerKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServerPortAccess().getServerKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServerPort_MServerPortAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// type=[mclevdom::MPortType|VersionedQualifiedReferenceName]
protected class MServerPort_TypeAssignment_2 extends AssignmentToken  {
	
	public MServerPort_TypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServerPortAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServerPort_ServerKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServerPortAccess().getTypeMPortTypeCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServerPortAccess().getTypeMPortTypeCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// interface=[mcleviface::MInterface|VersionedQualifiedName]
protected class MServerPort_InterfaceAssignment_3 extends AssignmentToken  {
	
	public MServerPort_InterfaceAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServerPortAccess().getInterfaceAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServerPort_TypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("interface",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("interface");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServerPortAccess().getInterfaceMInterfaceCrossReference_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServerPortAccess().getInterfaceMInterfaceCrossReference_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MServerPort_NameAssignment_4 extends AssignmentToken  {
	
	public MServerPort_NameAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServerPortAccess().getNameAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServerPort_InterfaceAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMServerPortAccess().getNameIDTerminalRuleCall_4_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMServerPortAccess().getNameIDTerminalRuleCall_4_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MServerPort_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MServerPort_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServerPortAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServerPort_NameAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MParameterValueAssignment*
protected class MServerPort_AttributeValueAssignmentsAssignment_6 extends AssignmentToken  {
	
	public MServerPort_AttributeValueAssignmentsAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServerPortAccess().getAttributeValueAssignmentsAssignment_6();
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
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMServerPortAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0(); 
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
			case 0: return new MServerPort_AttributeValueAssignmentsAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MServerPort_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MServerPort_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MServerPort_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServerPortAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServerPort_AttributeValueAssignmentsAssignment_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServerPort_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MServerPort_SemicolonKeyword_8 extends KeywordToken  {
	
	public MServerPort_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServerPortAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServerPort_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MServerPort ****************/


/************ begin Rule MClientPort ****************
 *
 * MClientPort:
 * 	{MClientPort} "client" type=[mclevdom::MPortType|VersionedQualifiedReferenceName]
 * 	interface=[mcleviface::MInterface|VersionedQualifiedName] name=ID "{"
 * 	attributeValueAssignments+=MParameterValueAssignment* "}" ";";
 *
 **/

// {MClientPort} "client" type=[mclevdom::MPortType|VersionedQualifiedReferenceName]
// interface=[mcleviface::MInterface|VersionedQualifiedName] name=ID "{"
// attributeValueAssignments+=MParameterValueAssignment* "}" ";"
protected class MClientPort_Group extends GroupToken {
	
	public MClientPort_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMClientPortAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MClientPort_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMClientPortAccess().getMClientPortAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MClientPort}
protected class MClientPort_MClientPortAction_0 extends ActionToken  {

	public MClientPort_MClientPortAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMClientPortAccess().getMClientPortAction_0();
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

// "client"
protected class MClientPort_ClientKeyword_1 extends KeywordToken  {
	
	public MClientPort_ClientKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMClientPortAccess().getClientKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MClientPort_MClientPortAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// type=[mclevdom::MPortType|VersionedQualifiedReferenceName]
protected class MClientPort_TypeAssignment_2 extends AssignmentToken  {
	
	public MClientPort_TypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMClientPortAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MClientPort_ClientKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMClientPortAccess().getTypeMPortTypeCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMClientPortAccess().getTypeMPortTypeCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// interface=[mcleviface::MInterface|VersionedQualifiedName]
protected class MClientPort_InterfaceAssignment_3 extends AssignmentToken  {
	
	public MClientPort_InterfaceAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMClientPortAccess().getInterfaceAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MClientPort_TypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("interface",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("interface");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMClientPortAccess().getInterfaceMInterfaceCrossReference_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMClientPortAccess().getInterfaceMInterfaceCrossReference_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MClientPort_NameAssignment_4 extends AssignmentToken  {
	
	public MClientPort_NameAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMClientPortAccess().getNameAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MClientPort_InterfaceAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMClientPortAccess().getNameIDTerminalRuleCall_4_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMClientPortAccess().getNameIDTerminalRuleCall_4_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MClientPort_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MClientPort_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMClientPortAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MClientPort_NameAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MParameterValueAssignment*
protected class MClientPort_AttributeValueAssignmentsAssignment_6 extends AssignmentToken  {
	
	public MClientPort_AttributeValueAssignmentsAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMClientPortAccess().getAttributeValueAssignmentsAssignment_6();
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
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMClientPortAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_0(); 
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
			case 0: return new MClientPort_AttributeValueAssignmentsAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MClientPort_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MClientPort_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MClientPort_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMClientPortAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MClientPort_AttributeValueAssignmentsAssignment_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MClientPort_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MClientPort_SemicolonKeyword_8 extends KeywordToken  {
	
	public MClientPort_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMClientPortAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MClientPort_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MClientPort ****************/


/************ begin Rule MParameterValueAssignment ****************
 *
 * MParameterValueAssignment returns common::MParameterValueAssignmentSingleExpression:
 * 	"attribute" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":="
 * 	parameterValue=MParameterValueExpression ";";
 *
 **/

// "attribute" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" parameterValue=MParameterValueExpression
// ";"
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

// "attribute"
protected class MParameterValueAssignment_AttributeKeyword_0 extends KeywordToken  {
	
	public MParameterValueAssignment_AttributeKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterValueAssignmentAccess().getAttributeKeyword_0();
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
			case 0: return new MParameterValueAssignment_AttributeKeyword_0(lastRuleCallOrigin, this, 0, inst);
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

// ":="
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

// ";"
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


/************ begin Rule MParameter ****************
 *
 * MParameter returns common::MParameter:
 * 	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
 * 	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition;
 *
 **/

// MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
// MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition
protected class MParameter_Alternatives extends AlternativesToken {

	public MParameter_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMParameterAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_MIntegerParameterSingleExpressionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameter_MEnumParameterSingleExpressionParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MParameter_MBooleanParameterSingleExpressionParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MParameter_MRealParameterSingleExpressionParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MParameter_MStringParameterSingleExpressionParserRuleCall_4(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MParameter_MEnumParameterDefinitionParserRuleCall_5(lastRuleCallOrigin, this, 5, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMIntegerParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMRealParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMStringParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MIntegerParameterSingleExpression
protected class MParameter_MIntegerParameterSingleExpressionParserRuleCall_0 extends RuleCallToken {
	
	public MParameter_MIntegerParameterSingleExpressionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMIntegerParameterSingleExpressionParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParameterSingleExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MIntegerParameterSingleExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParameterSingleExpression
protected class MParameter_MEnumParameterSingleExpressionParserRuleCall_1 extends RuleCallToken {
	
	public MParameter_MEnumParameterSingleExpressionParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMEnumParameterSingleExpressionParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterSingleExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParameterSingleExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MBooleanParameterSingleExpression
protected class MParameter_MBooleanParameterSingleExpressionParserRuleCall_2 extends RuleCallToken {
	
	public MParameter_MBooleanParameterSingleExpressionParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMBooleanParameterSingleExpressionParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParameterSingleExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParameterSingleExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MBooleanParameterSingleExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MRealParameterSingleExpression
protected class MParameter_MRealParameterSingleExpressionParserRuleCall_3 extends RuleCallToken {
	
	public MParameter_MRealParameterSingleExpressionParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMRealParameterSingleExpressionParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParameterSingleExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MRealParameterSingleExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MStringParameterSingleExpression
protected class MParameter_MStringParameterSingleExpressionParserRuleCall_4 extends RuleCallToken {
	
	public MParameter_MStringParameterSingleExpressionParserRuleCall_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMStringParameterSingleExpressionParserRuleCall_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParameterSingleExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParameterSingleExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MStringParameterSingleExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParameterDefinition
protected class MParameter_MEnumParameterDefinitionParserRuleCall_5 extends RuleCallToken {
	
	public MParameter_MEnumParameterDefinitionParserRuleCall_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMEnumParameterDefinitionParserRuleCall_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParameterDefinition_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MParameter ****************/


/************ begin Rule MIntegerParameterSingleExpression ****************
 *
 * MIntegerParameterSingleExpression returns common::MIntegerParameterSingleExpression:
 * 	constant?="const"? "integer" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";";
 *
 **/

// constant?="const"? "integer" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";"
protected class MIntegerParameterSingleExpression_Group extends GroupToken {
	
	public MIntegerParameterSingleExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MIntegerParameterSingleExpression_ConstantAssignment_0 extends AssignmentToken  {
	
	public MIntegerParameterSingleExpression_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("constant",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("constant");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMIntegerParameterSingleExpressionAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "integer"
protected class MIntegerParameterSingleExpression_IntegerKeyword_1 extends KeywordToken  {
	
	public MIntegerParameterSingleExpression_IntegerKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getIntegerKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MIntegerParameterSingleExpression_NameAssignment_2 extends AssignmentToken  {
	
	public MIntegerParameterSingleExpression_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_IntegerKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMIntegerParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MIntegerParameterSingleExpression_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MIntegerParameterSingleExpression_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MIntegerParameterSingleExpression_DefaultValueAssignment_4 extends AssignmentToken  {
	
	public MIntegerParameterSingleExpression_DefaultValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueAssignment_4();
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
		if((value = eObjectConsumer.getConsumable("defaultValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("defaultValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIntegerParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MIntegerParameterSingleExpression_ColonEqualsSignKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("range" range=MParameterRange)?
protected class MIntegerParameterSingleExpression_Group_5 extends GroupToken {
	
	public MIntegerParameterSingleExpression_Group_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_RangeAssignment_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "range"
protected class MIntegerParameterSingleExpression_RangeKeyword_5_0 extends KeywordToken  {
	
	public MIntegerParameterSingleExpression_RangeKeyword_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_DefaultValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// range=MParameterRange
protected class MIntegerParameterSingleExpression_RangeAssignment_5_1 extends AssignmentToken  {
	
	public MIntegerParameterSingleExpression_RangeAssignment_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterRange_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("range",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("range");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRangeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIntegerParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0(); 
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
			case 0: return new MIntegerParameterSingleExpression_RangeKeyword_5_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ";"
protected class MIntegerParameterSingleExpression_SemicolonKeyword_6 extends KeywordToken  {
	
	public MIntegerParameterSingleExpression_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParameterSingleExpressionAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParameterSingleExpression_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIntegerParameterSingleExpression_DefaultValueAssignment_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIntegerParameterSingleExpression ****************/


/************ begin Rule MEnumParameterDefinition ****************
 *
 * MEnumParameterDefinition returns common::MEnumParameterDefinition:
 * 	{common::MEnumParameterDefinition} "enum" name=ID "{" literals+=MEnumParameterLiteralRule (","
 * 	literals+=MEnumParameterLiteralRule)* "}" ";";
 *
 **/

// {common::MEnumParameterDefinition} "enum" name=ID "{" literals+=MEnumParameterLiteralRule (","
// literals+=MEnumParameterLiteralRule)* "}" ";"
protected class MEnumParameterDefinition_Group extends GroupToken {
	
	public MEnumParameterDefinition_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MEnumParameterDefinition}
protected class MEnumParameterDefinition_MEnumParameterDefinitionAction_0 extends ActionToken  {

	public MEnumParameterDefinition_MEnumParameterDefinitionAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0();
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

// "enum"
protected class MEnumParameterDefinition_EnumKeyword_1 extends KeywordToken  {
	
	public MEnumParameterDefinition_EnumKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_MEnumParameterDefinitionAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MEnumParameterDefinition_NameAssignment_2 extends AssignmentToken  {
	
	public MEnumParameterDefinition_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_EnumKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MEnumParameterDefinition_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MEnumParameterDefinition_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// literals+=MEnumParameterLiteralRule
protected class MEnumParameterDefinition_LiteralsAssignment_4 extends AssignmentToken  {
	
	public MEnumParameterDefinition_LiteralsAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterLiteralRule_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("literals",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("literals");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParameterLiteralRuleRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_0(); 
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
			case 0: return new MEnumParameterDefinition_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," literals+=MEnumParameterLiteralRule)*
protected class MEnumParameterDefinition_Group_5 extends GroupToken {
	
	public MEnumParameterDefinition_Group_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_LiteralsAssignment_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MEnumParameterDefinition_CommaKeyword_5_0 extends KeywordToken  {
	
	public MEnumParameterDefinition_CommaKeyword_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MEnumParameterDefinition_LiteralsAssignment_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// literals+=MEnumParameterLiteralRule
protected class MEnumParameterDefinition_LiteralsAssignment_5_1 extends AssignmentToken  {
	
	public MEnumParameterDefinition_LiteralsAssignment_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterLiteralRule_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("literals",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("literals");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParameterLiteralRuleRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_5_1_0(); 
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
			case 0: return new MEnumParameterDefinition_CommaKeyword_5_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// "}"
protected class MEnumParameterDefinition_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MEnumParameterDefinition_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MEnumParameterDefinition_LiteralsAssignment_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MEnumParameterDefinition_SemicolonKeyword_7 extends KeywordToken  {
	
	public MEnumParameterDefinition_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MEnumParameterDefinition ****************/


/************ begin Rule MEnumParameterSingleExpression ****************
 *
 * MEnumParameterSingleExpression returns common::MEnumParameterSingleExpression:
 * 	constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
 * 	":=" defaultValue=MParameterValueExpression ";";
 *
 **/

// constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID ":="
// defaultValue=MParameterValueExpression ";"
protected class MEnumParameterSingleExpression_Group extends GroupToken {
	
	public MEnumParameterSingleExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MEnumParameterSingleExpression_ConstantAssignment_0 extends AssignmentToken  {
	
	public MEnumParameterSingleExpression_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("constant",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("constant");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMEnumParameterSingleExpressionAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "enum"
protected class MEnumParameterSingleExpression_EnumKeyword_1 extends KeywordToken  {
	
	public MEnumParameterSingleExpression_EnumKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName]
protected class MEnumParameterSingleExpression_EnumDefinitionAssignment_2 extends AssignmentToken  {
	
	public MEnumParameterSingleExpression_EnumDefinitionAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_EnumKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("enumDefinition",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("enumDefinition");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMEnumParameterSingleExpressionAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MEnumParameterSingleExpression_NameAssignment_3 extends AssignmentToken  {
	
	public MEnumParameterSingleExpression_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_EnumDefinitionAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParameterSingleExpressionAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MEnumParameterSingleExpression_ColonEqualsSignKeyword_4 extends KeywordToken  {
	
	public MEnumParameterSingleExpression_ColonEqualsSignKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getColonEqualsSignKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MEnumParameterSingleExpression_DefaultValueAssignment_5 extends AssignmentToken  {
	
	public MEnumParameterSingleExpression_DefaultValueAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueAssignment_5();
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
		if((value = eObjectConsumer.getConsumable("defaultValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("defaultValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMEnumParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_5_0(); 
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
			case 0: return new MEnumParameterSingleExpression_ColonEqualsSignKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MEnumParameterSingleExpression_SemicolonKeyword_6 extends KeywordToken  {
	
	public MEnumParameterSingleExpression_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterSingleExpressionAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterSingleExpression_DefaultValueAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MEnumParameterSingleExpression ****************/


/************ begin Rule MRealParameterSingleExpression ****************
 *
 * MRealParameterSingleExpression returns common::MRealParameterSingleExpression:
 * 	constant?="const"? "real" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";";
 *
 **/

// constant?="const"? "real" name=ID ":=" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";"
protected class MRealParameterSingleExpression_Group extends GroupToken {
	
	public MRealParameterSingleExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MRealParameterSingleExpression_ConstantAssignment_0 extends AssignmentToken  {
	
	public MRealParameterSingleExpression_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getConstantAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("constant",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("constant");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMRealParameterSingleExpressionAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "real"
protected class MRealParameterSingleExpression_RealKeyword_1 extends KeywordToken  {
	
	public MRealParameterSingleExpression_RealKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getRealKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MRealParameterSingleExpression_NameAssignment_2 extends AssignmentToken  {
	
	public MRealParameterSingleExpression_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_RealKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMRealParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MRealParameterSingleExpression_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MRealParameterSingleExpression_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MRealParameterSingleExpression_DefaultValueAssignment_4 extends AssignmentToken  {
	
	public MRealParameterSingleExpression_DefaultValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueAssignment_4();
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
		if((value = eObjectConsumer.getConsumable("defaultValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("defaultValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMRealParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MRealParameterSingleExpression_ColonEqualsSignKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("range" range=MParameterRange)?
protected class MRealParameterSingleExpression_Group_5 extends GroupToken {
	
	public MRealParameterSingleExpression_Group_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_RangeAssignment_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "range"
protected class MRealParameterSingleExpression_RangeKeyword_5_0 extends KeywordToken  {
	
	public MRealParameterSingleExpression_RangeKeyword_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getRangeKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_DefaultValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// range=MParameterRange
protected class MRealParameterSingleExpression_RangeAssignment_5_1 extends AssignmentToken  {
	
	public MRealParameterSingleExpression_RangeAssignment_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getRangeAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterRange_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("range",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("range");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRangeRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMRealParameterSingleExpressionAccess().getRangeMParameterRangeParserRuleCall_5_1_0(); 
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
			case 0: return new MRealParameterSingleExpression_RangeKeyword_5_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ";"
protected class MRealParameterSingleExpression_SemicolonKeyword_6 extends KeywordToken  {
	
	public MRealParameterSingleExpression_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParameterSingleExpressionAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParameterSingleExpression_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MRealParameterSingleExpression_DefaultValueAssignment_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule MRealParameterSingleExpression ****************/


/************ begin Rule MEnumParameterLiteralRule ****************
 *
 * MEnumParameterLiteralRule returns common::MEnumParameterLiteral:
 * 	MEnumParameterLiteral | MEnumParamIntegerLiteral | MEnumParamRealLiteral | MEnumParamStringLiteral;
 *
 **/

// MEnumParameterLiteral | MEnumParamIntegerLiteral | MEnumParamRealLiteral | MEnumParamStringLiteral
protected class MEnumParameterLiteralRule_Alternatives extends AlternativesToken {

	public MEnumParameterLiteralRule_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralRuleAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterLiteralRule_MEnumParameterLiteralParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MEnumParameterLiteralRule_MEnumParamIntegerLiteralParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MEnumParameterLiteralRule_MEnumParamRealLiteralParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MEnumParameterLiteralRule_MEnumParamStringLiteralParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MEnumParameterLiteral
protected class MEnumParameterLiteralRule_MEnumParameterLiteralParserRuleCall_0 extends RuleCallToken {
	
	public MEnumParameterLiteralRule_MEnumParameterLiteralParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParameterLiteralParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParameterLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParamIntegerLiteral
protected class MEnumParameterLiteralRule_MEnumParamIntegerLiteralParserRuleCall_1 extends RuleCallToken {
	
	public MEnumParameterLiteralRule_MEnumParamIntegerLiteralParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamIntegerLiteralParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamIntegerLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParamIntegerLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParamRealLiteral
protected class MEnumParameterLiteralRule_MEnumParamRealLiteralParserRuleCall_2 extends RuleCallToken {
	
	public MEnumParameterLiteralRule_MEnumParamRealLiteralParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamRealLiteralParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamRealLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParamRealLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParamStringLiteral
protected class MEnumParameterLiteralRule_MEnumParamStringLiteralParserRuleCall_3 extends RuleCallToken {
	
	public MEnumParameterLiteralRule_MEnumParamStringLiteralParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralRuleAccess().getMEnumParamStringLiteralParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamStringLiteral_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParamStringLiteral_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MEnumParameterLiteralRule ****************/


/************ begin Rule MParameterValue ****************
 *
 * MParameterValue returns common::MParameterValue:
 * 	MParameterValueLiteral | MParameterValueRefObject | MParameterValuePAR;
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
 * MParameterValueLiteral returns common::MParameterValueLiteral:
 * 	MParameterValueBooleanLiteral | MParameterValueStringLiteral | MParameterValueIntegerLiteral |
 * 	MParameterValueRealLiteral;
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
 * MParameterValueBooleanLiteral returns common::MParameterValueBooleanLiteral:
 * 	{common::MParameterValueBooleanLiteral} value=EBoolean;
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
 * MParameterValueStringLiteral returns common::MParameterValueStringLiteral:
 * 	{common::MParameterValueStringLiteral} value=STRING;
 *
 **/

// {common::MParameterValueStringLiteral} value=STRING
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
			case 0: return new MParameterValueStringLiteral_ValueAssignment_1(lastRuleCallOrigin, this, 0, inst);
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

// value=STRING
protected class MParameterValueStringLiteral_ValueAssignment_1 extends AssignmentToken  {
	
	public MParameterValueStringLiteral_ValueAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterValueStringLiteralAccess().getValueAssignment_1();
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
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMParameterValueStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MParameterValueStringLiteral ****************/


/************ begin Rule MParameterValueIntegerLiteral ****************
 *
 * MParameterValueIntegerLiteral returns common::MParameterValueIntegerLiteral:
 * 	{common::MParameterValueIntegerLiteral} value=INTEGER;
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
 * MParameterValueRealLiteral returns common::MParameterValueRealLiteral:
 * 	{common::MParameterValueRealLiteral} value=REAL;
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
 * MParameterValueRefObject returns common::MParameterValueRefObject:
 * 	{common::MParameterValueRefObject} object=[common::MCommonReferenceableObj|VersionedQualifiedReferenceName];
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
 * MParameterValuePAR returns common::MParameterValuePAR:
 * 	"(" value=MParameterValueExpression ")";
 *
 **/

// "(" value=MParameterValueExpression ")"
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

// "("
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

// ")"
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
 * MParameterValueExpression returns common::MParameterValueExpression:
 * 	{common::MParameterValueExpression} left=MParameterValueTERM (operation=MParameterValueExpressionOperators
 * 	right=MParameterValueExpression)?;
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
 * MParameterValueTERM returns common::MParameterValueTERM:
 * 	{common::MParameterValueTERM} left=MParameterValue (operation=MParameterValueTERMOperators
 * 	right=MParameterValueTERM)?;
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


/************ begin Rule MParameterRange ****************
 *
 * MParameterRange returns common::MParameterRange:
 * 	MParameterOCR | MParameterOOR | MParameterCOR | MParameterCCR;
 *
 **/

// MParameterOCR | MParameterOOR | MParameterCOR | MParameterCCR
protected class MParameterRange_Alternatives extends AlternativesToken {

	public MParameterRange_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMParameterRangeAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterRange_MParameterOCRParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterRange_MParameterOORParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MParameterRange_MParameterCORParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MParameterRange_MParameterCCRParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterCORAccess().getMParameterCORAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMParameterOORAccess().getMParameterOORAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MParameterOCR
protected class MParameterRange_MParameterOCRParserRuleCall_0 extends RuleCallToken {
	
	public MParameterRange_MParameterOCRParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterRangeAccess().getMParameterOCRParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOCR_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterOCR_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterOOR
protected class MParameterRange_MParameterOORParserRuleCall_1 extends RuleCallToken {
	
	public MParameterRange_MParameterOORParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterRangeAccess().getMParameterOORParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOOR_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterOORAccess().getMParameterOORAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterOOR_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterCOR
protected class MParameterRange_MParameterCORParserRuleCall_2 extends RuleCallToken {
	
	public MParameterRange_MParameterCORParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterRangeAccess().getMParameterCORParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCOR_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterCORAccess().getMParameterCORAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterCOR_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MParameterCCR
protected class MParameterRange_MParameterCCRParserRuleCall_3 extends RuleCallToken {
	
	public MParameterRange_MParameterCCRParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterRangeAccess().getMParameterCCRParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCCR_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MParameterCCR_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MParameterRange ****************/


/************ begin Rule MParameterOCR ****************
 *
 * MParameterOCR returns common::MParameterOCR:
 * 	{common::MParameterOCR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]";
 *
 **/

// {common::MParameterOCR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]"
protected class MParameterOCR_Group extends GroupToken {
	
	public MParameterOCR_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOCR_RightSquareBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterOCR}
protected class MParameterOCR_MParameterOCRAction_0 extends ActionToken  {

	public MParameterOCR_MParameterOCRAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getMParameterOCRAction_0();
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

// "("
protected class MParameterOCR_LeftParenthesisKeyword_1 extends KeywordToken  {
	
	public MParameterOCR_LeftParenthesisKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getLeftParenthesisKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOCR_MParameterOCRAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerValue=MParameterValueExpression
protected class MParameterOCR_LowerValueAssignment_2 extends AssignmentToken  {
	
	public MParameterOCR_LowerValueAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getLowerValueAssignment_2();
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
		if((value = eObjectConsumer.getConsumable("lowerValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterOCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0(); 
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
			case 0: return new MParameterOCR_LeftParenthesisKeyword_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ","
protected class MParameterOCR_CommaKeyword_3 extends KeywordToken  {
	
	public MParameterOCR_CommaKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getCommaKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOCR_LowerValueAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperValue=MParameterValueExpression
protected class MParameterOCR_UpperValueAssignment_4 extends AssignmentToken  {
	
	public MParameterOCR_UpperValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getUpperValueAssignment_4();
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
		if((value = eObjectConsumer.getConsumable("upperValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterOCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MParameterOCR_CommaKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "]"
protected class MParameterOCR_RightSquareBracketKeyword_5 extends KeywordToken  {
	
	public MParameterOCR_RightSquareBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterOCRAccess().getRightSquareBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOCR_UpperValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MParameterOCR ****************/


/************ begin Rule MParameterOOR ****************
 *
 * MParameterOOR returns common::MParameterOOR:
 * 	{common::MParameterOOR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")";
 *
 **/

// {common::MParameterOOR} "(" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")"
protected class MParameterOOR_Group extends GroupToken {
	
	public MParameterOOR_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOOR_RightParenthesisKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterOORAccess().getMParameterOORAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterOOR}
protected class MParameterOOR_MParameterOORAction_0 extends ActionToken  {

	public MParameterOOR_MParameterOORAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getMParameterOORAction_0();
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

// "("
protected class MParameterOOR_LeftParenthesisKeyword_1 extends KeywordToken  {
	
	public MParameterOOR_LeftParenthesisKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getLeftParenthesisKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOOR_MParameterOORAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerValue=MParameterValueExpression
protected class MParameterOOR_LowerValueAssignment_2 extends AssignmentToken  {
	
	public MParameterOOR_LowerValueAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getLowerValueAssignment_2();
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
		if((value = eObjectConsumer.getConsumable("lowerValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterOORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0(); 
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
			case 0: return new MParameterOOR_LeftParenthesisKeyword_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ","
protected class MParameterOOR_CommaKeyword_3 extends KeywordToken  {
	
	public MParameterOOR_CommaKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getCommaKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOOR_LowerValueAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperValue=MParameterValueExpression
protected class MParameterOOR_UpperValueAssignment_4 extends AssignmentToken  {
	
	public MParameterOOR_UpperValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getUpperValueAssignment_4();
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
		if((value = eObjectConsumer.getConsumable("upperValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterOORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MParameterOOR_CommaKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class MParameterOOR_RightParenthesisKeyword_5 extends KeywordToken  {
	
	public MParameterOOR_RightParenthesisKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterOORAccess().getRightParenthesisKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterOOR_UpperValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MParameterOOR ****************/


/************ begin Rule MParameterCOR ****************
 *
 * MParameterCOR returns common::MParameterCOR:
 * 	{common::MParameterCOR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")";
 *
 **/

// {common::MParameterCOR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression ")"
protected class MParameterCOR_Group extends GroupToken {
	
	public MParameterCOR_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCOR_RightParenthesisKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterCORAccess().getMParameterCORAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterCOR}
protected class MParameterCOR_MParameterCORAction_0 extends ActionToken  {

	public MParameterCOR_MParameterCORAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getMParameterCORAction_0();
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

// "["
protected class MParameterCOR_LeftSquareBracketKeyword_1 extends KeywordToken  {
	
	public MParameterCOR_LeftSquareBracketKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getLeftSquareBracketKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCOR_MParameterCORAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerValue=MParameterValueExpression
protected class MParameterCOR_LowerValueAssignment_2 extends AssignmentToken  {
	
	public MParameterCOR_LowerValueAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getLowerValueAssignment_2();
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
		if((value = eObjectConsumer.getConsumable("lowerValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterCORAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0(); 
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
			case 0: return new MParameterCOR_LeftSquareBracketKeyword_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ","
protected class MParameterCOR_CommaKeyword_3 extends KeywordToken  {
	
	public MParameterCOR_CommaKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getCommaKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCOR_LowerValueAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperValue=MParameterValueExpression
protected class MParameterCOR_UpperValueAssignment_4 extends AssignmentToken  {
	
	public MParameterCOR_UpperValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getUpperValueAssignment_4();
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
		if((value = eObjectConsumer.getConsumable("upperValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterCORAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MParameterCOR_CommaKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ")"
protected class MParameterCOR_RightParenthesisKeyword_5 extends KeywordToken  {
	
	public MParameterCOR_RightParenthesisKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterCORAccess().getRightParenthesisKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCOR_UpperValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MParameterCOR ****************/


/************ begin Rule MParameterCCR ****************
 *
 * MParameterCCR returns common::MParameterCCR:
 * 	{common::MParameterCCR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]";
 *
 **/

// {common::MParameterCCR} "[" lowerValue=MParameterValueExpression "," upperValue=MParameterValueExpression "]"
protected class MParameterCCR_Group extends GroupToken {
	
	public MParameterCCR_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCCR_RightSquareBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MParameterCCR}
protected class MParameterCCR_MParameterCCRAction_0 extends ActionToken  {

	public MParameterCCR_MParameterCCRAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getMParameterCCRAction_0();
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

// "["
protected class MParameterCCR_LeftSquareBracketKeyword_1 extends KeywordToken  {
	
	public MParameterCCR_LeftSquareBracketKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getLeftSquareBracketKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCCR_MParameterCCRAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerValue=MParameterValueExpression
protected class MParameterCCR_LowerValueAssignment_2 extends AssignmentToken  {
	
	public MParameterCCR_LowerValueAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getLowerValueAssignment_2();
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
		if((value = eObjectConsumer.getConsumable("lowerValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterCCRAccess().getLowerValueMParameterValueExpressionParserRuleCall_2_0(); 
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
			case 0: return new MParameterCCR_LeftSquareBracketKeyword_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ","
protected class MParameterCCR_CommaKeyword_3 extends KeywordToken  {
	
	public MParameterCCR_CommaKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getCommaKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCCR_LowerValueAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperValue=MParameterValueExpression
protected class MParameterCCR_UpperValueAssignment_4 extends AssignmentToken  {
	
	public MParameterCCR_UpperValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getUpperValueAssignment_4();
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
		if((value = eObjectConsumer.getConsumable("upperValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMParameterCCRAccess().getUpperValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MParameterCCR_CommaKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "]"
protected class MParameterCCR_RightSquareBracketKeyword_5 extends KeywordToken  {
	
	public MParameterCCR_RightSquareBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMParameterCCRAccess().getRightSquareBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterCCR_UpperValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MParameterCCR ****************/


/************ begin Rule MEnumParameterLiteral ****************
 *
 * MEnumParameterLiteral returns common::MEnumParameterLiteral:
 * 	{common::MEnumParameterLiteral} name=ID;
 *
 **/

// {common::MEnumParameterLiteral} name=ID
protected class MEnumParameterLiteral_Group extends GroupToken {
	
	public MEnumParameterLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterLiteral_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MEnumParameterLiteral}
protected class MEnumParameterLiteral_MEnumParameterLiteralAction_0 extends ActionToken  {

	public MEnumParameterLiteral_MEnumParameterLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralAccess().getMEnumParameterLiteralAction_0();
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

// name=ID
protected class MEnumParameterLiteral_NameAssignment_1 extends AssignmentToken  {
	
	public MEnumParameterLiteral_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterLiteralAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterLiteral_MEnumParameterLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParameterLiteralAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParameterLiteralAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MEnumParameterLiteral ****************/


/************ begin Rule MEnumParamIntegerLiteral ****************
 *
 * MEnumParamIntegerLiteral returns common::MEnumParamIntegerLiteral:
 * 	{common::MEnumParamIntegerLiteral} name=ID "=" value=INTEGER;
 *
 **/

// {common::MEnumParamIntegerLiteral} name=ID "=" value=INTEGER
protected class MEnumParamIntegerLiteral_Group extends GroupToken {
	
	public MEnumParamIntegerLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParamIntegerLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamIntegerLiteral_ValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MEnumParamIntegerLiteral}
protected class MEnumParamIntegerLiteral_MEnumParamIntegerLiteralAction_0 extends ActionToken  {

	public MEnumParamIntegerLiteral_MEnumParamIntegerLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMEnumParamIntegerLiteralAccess().getMEnumParamIntegerLiteralAction_0();
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

// name=ID
protected class MEnumParamIntegerLiteral_NameAssignment_1 extends AssignmentToken  {
	
	public MEnumParamIntegerLiteral_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamIntegerLiteralAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamIntegerLiteral_MEnumParamIntegerLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamIntegerLiteralAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParamIntegerLiteralAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "="
protected class MEnumParamIntegerLiteral_EqualsSignKeyword_2 extends KeywordToken  {
	
	public MEnumParamIntegerLiteral_EqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamIntegerLiteralAccess().getEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamIntegerLiteral_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// value=INTEGER
protected class MEnumParamIntegerLiteral_ValueAssignment_3 extends AssignmentToken  {
	
	public MEnumParamIntegerLiteral_ValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamIntegerLiteralAccess().getValueAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamIntegerLiteral_EqualsSignKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamIntegerLiteralAccess().getValueINTEGERParserRuleCall_3_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMEnumParamIntegerLiteralAccess().getValueINTEGERParserRuleCall_3_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MEnumParamIntegerLiteral ****************/


/************ begin Rule MEnumParamRealLiteral ****************
 *
 * MEnumParamRealLiteral returns common::MEnumParamRealLiteral:
 * 	{common::MEnumParamRealLiteral} name=ID "=" value=REAL;
 *
 **/

// {common::MEnumParamRealLiteral} name=ID "=" value=REAL
protected class MEnumParamRealLiteral_Group extends GroupToken {
	
	public MEnumParamRealLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParamRealLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamRealLiteral_ValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MEnumParamRealLiteral}
protected class MEnumParamRealLiteral_MEnumParamRealLiteralAction_0 extends ActionToken  {

	public MEnumParamRealLiteral_MEnumParamRealLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMEnumParamRealLiteralAccess().getMEnumParamRealLiteralAction_0();
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

// name=ID
protected class MEnumParamRealLiteral_NameAssignment_1 extends AssignmentToken  {
	
	public MEnumParamRealLiteral_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamRealLiteralAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamRealLiteral_MEnumParamRealLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamRealLiteralAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParamRealLiteralAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "="
protected class MEnumParamRealLiteral_EqualsSignKeyword_2 extends KeywordToken  {
	
	public MEnumParamRealLiteral_EqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamRealLiteralAccess().getEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamRealLiteral_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// value=REAL
protected class MEnumParamRealLiteral_ValueAssignment_3 extends AssignmentToken  {
	
	public MEnumParamRealLiteral_ValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamRealLiteralAccess().getValueAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamRealLiteral_EqualsSignKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamRealLiteralAccess().getValueREALParserRuleCall_3_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMEnumParamRealLiteralAccess().getValueREALParserRuleCall_3_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MEnumParamRealLiteral ****************/


/************ begin Rule MEnumParamStringLiteral ****************
 *
 * MEnumParamStringLiteral returns common::MEnumParamStringLiteral:
 * 	{common::MEnumParamStringLiteral} name=ID "=" value=STRING;
 *
 **/

// {common::MEnumParamStringLiteral} name=ID "=" value=STRING
protected class MEnumParamStringLiteral_Group extends GroupToken {
	
	public MEnumParamStringLiteral_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParamStringLiteralAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamStringLiteral_ValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {common::MEnumParamStringLiteral}
protected class MEnumParamStringLiteral_MEnumParamStringLiteralAction_0 extends ActionToken  {

	public MEnumParamStringLiteral_MEnumParamStringLiteralAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMEnumParamStringLiteralAccess().getMEnumParamStringLiteralAction_0();
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

// name=ID
protected class MEnumParamStringLiteral_NameAssignment_1 extends AssignmentToken  {
	
	public MEnumParamStringLiteral_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamStringLiteralAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamStringLiteral_MEnumParamStringLiteralAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamStringLiteralAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParamStringLiteralAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "="
protected class MEnumParamStringLiteral_EqualsSignKeyword_2 extends KeywordToken  {
	
	public MEnumParamStringLiteral_EqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamStringLiteralAccess().getEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamStringLiteral_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// value=STRING
protected class MEnumParamStringLiteral_ValueAssignment_3 extends AssignmentToken  {
	
	public MEnumParamStringLiteral_ValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamStringLiteralAccess().getValueAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamStringLiteral_EqualsSignKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamStringLiteralAccess().getValueSTRINGTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParamStringLiteralAccess().getValueSTRINGTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}


/************ end Rule MEnumParamStringLiteral ****************/


/************ begin Rule MBooleanParameterSingleExpression ****************
 *
 * MBooleanParameterSingleExpression returns common::MBooleanParameterSingleExpression:
 * 	constant?="const"? "boolean" name=ID ":=" defaultValue=MParameterValueExpression ";";
 *
 **/

// constant?="const"? "boolean" name=ID ":=" defaultValue=MParameterValueExpression ";"
protected class MBooleanParameterSingleExpression_Group extends GroupToken {
	
	public MBooleanParameterSingleExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParameterSingleExpression_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MBooleanParameterSingleExpression_ConstantAssignment_0 extends AssignmentToken  {
	
	public MBooleanParameterSingleExpression_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("constant",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("constant");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMBooleanParameterSingleExpressionAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "boolean"
protected class MBooleanParameterSingleExpression_BooleanKeyword_1 extends KeywordToken  {
	
	public MBooleanParameterSingleExpression_BooleanKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getBooleanKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParameterSingleExpression_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MBooleanParameterSingleExpression_NameAssignment_2 extends AssignmentToken  {
	
	public MBooleanParameterSingleExpression_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParameterSingleExpression_BooleanKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMBooleanParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MBooleanParameterSingleExpression_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MBooleanParameterSingleExpression_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParameterSingleExpression_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MBooleanParameterSingleExpression_DefaultValueAssignment_4 extends AssignmentToken  {
	
	public MBooleanParameterSingleExpression_DefaultValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueAssignment_4();
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
		if((value = eObjectConsumer.getConsumable("defaultValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("defaultValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMBooleanParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MBooleanParameterSingleExpression_ColonEqualsSignKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MBooleanParameterSingleExpression_SemicolonKeyword_5 extends KeywordToken  {
	
	public MBooleanParameterSingleExpression_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParameterSingleExpressionAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParameterSingleExpression_DefaultValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MBooleanParameterSingleExpression ****************/


/************ begin Rule MStringParameterSingleExpression ****************
 *
 * MStringParameterSingleExpression returns common::MStringParameterSingleExpression:
 * 	constant?="const"? "string" name=ID ":=" defaultValue=MParameterValueExpression ";";
 *
 **/

// constant?="const"? "string" name=ID ":=" defaultValue=MParameterValueExpression ";"
protected class MStringParameterSingleExpression_Group extends GroupToken {
	
	public MStringParameterSingleExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParameterSingleExpression_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MStringParameterSingleExpression_ConstantAssignment_0 extends AssignmentToken  {
	
	public MStringParameterSingleExpression_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getConstantAssignment_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("constant",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("constant");
		if(Boolean.TRUE.equals(value)) { // org::eclipse::xtext::impl::KeywordImpl
			type = AssignmentType.KEYWORD;
			element = grammarAccess.getMStringParameterSingleExpressionAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "string"
protected class MStringParameterSingleExpression_StringKeyword_1 extends KeywordToken  {
	
	public MStringParameterSingleExpression_StringKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getStringKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParameterSingleExpression_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MStringParameterSingleExpression_NameAssignment_2 extends AssignmentToken  {
	
	public MStringParameterSingleExpression_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParameterSingleExpression_StringKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMStringParameterSingleExpressionAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MStringParameterSingleExpression_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MStringParameterSingleExpression_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParameterSingleExpression_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MStringParameterSingleExpression_DefaultValueAssignment_4 extends AssignmentToken  {
	
	public MStringParameterSingleExpression_DefaultValueAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueAssignment_4();
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
		if((value = eObjectConsumer.getConsumable("defaultValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("defaultValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMStringParameterSingleExpressionAccess().getDefaultValueMParameterValueExpressionParserRuleCall_4_0(); 
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
			case 0: return new MStringParameterSingleExpression_ColonEqualsSignKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MStringParameterSingleExpression_SemicolonKeyword_5 extends KeywordToken  {
	
	public MStringParameterSingleExpression_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParameterSingleExpressionAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParameterSingleExpression_DefaultValueAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MStringParameterSingleExpression ****************/


/************ begin Rule MInternalComponentConnection ****************
 *
 * MInternalComponentConnection:
 * 	{MInternalComponentConnection} "connection" ("this" |
 * 	clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) "." clientPort=[MClientPort] "<->"
 * 	("this" | serverInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) "." serverPort=[MServerPort]
 * 	("using" connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{" ("mapping" ":="
 * 	ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")? ("attribute"
 * 	attributeValueAssignments+=MParameterValueAssignment)* "}")? ";";
 *
 **/

// {MInternalComponentConnection} "connection" ("this" |
// clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) "." clientPort=[MClientPort] "<->" ("this"
// | serverInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) "." serverPort=[MServerPort] ("using"
// connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{" ("mapping" ":="
// ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")? ("attribute"
// attributeValueAssignments+=MParameterValueAssignment)* "}")? ";"
protected class MInternalComponentConnection_Group extends GroupToken {
	
	public MInternalComponentConnection_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_SemicolonKeyword_10(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalComponentConnectionAccess().getMInternalComponentConnectionAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MInternalComponentConnection}
protected class MInternalComponentConnection_MInternalComponentConnectionAction_0 extends ActionToken  {

	public MInternalComponentConnection_MInternalComponentConnectionAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getMInternalComponentConnectionAction_0();
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

// "connection"
protected class MInternalComponentConnection_ConnectionKeyword_1 extends KeywordToken  {
	
	public MInternalComponentConnection_ConnectionKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getConnectionKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_MInternalComponentConnectionAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "this" | clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]
protected class MInternalComponentConnection_Alternatives_2 extends AlternativesToken {

	public MInternalComponentConnection_Alternatives_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getAlternatives_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_ThisKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalComponentConnection_ClientInstanceAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "this"
protected class MInternalComponentConnection_ThisKeyword_2_0 extends KeywordToken  {
	
	public MInternalComponentConnection_ThisKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getThisKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_ConnectionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]
protected class MInternalComponentConnection_ClientInstanceAssignment_2_1 extends AssignmentToken  {
	
	public MInternalComponentConnection_ClientInstanceAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getClientInstanceAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_ConnectionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientInstance",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientInstance");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentConnectionAccess().getClientInstanceMInternalComponentInstanceCrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentConnectionAccess().getClientInstanceMInternalComponentInstanceCrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// "."
protected class MInternalComponentConnection_FullStopKeyword_3 extends KeywordToken  {
	
	public MInternalComponentConnection_FullStopKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getFullStopKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_Alternatives_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// clientPort=[MClientPort]
protected class MInternalComponentConnection_ClientPortAssignment_4 extends AssignmentToken  {
	
	public MInternalComponentConnection_ClientPortAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getClientPortAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_FullStopKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientPort",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientPort");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentConnectionAccess().getClientPortMClientPortCrossReference_4_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentConnectionAccess().getClientPortMClientPortCrossReference_4_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "<->"
protected class MInternalComponentConnection_LessThanSignHyphenMinusGreaterThanSignKeyword_5 extends KeywordToken  {
	
	public MInternalComponentConnection_LessThanSignHyphenMinusGreaterThanSignKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_ClientPortAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "this" | serverInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]
protected class MInternalComponentConnection_Alternatives_6 extends AlternativesToken {

	public MInternalComponentConnection_Alternatives_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getAlternatives_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_ThisKeyword_6_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalComponentConnection_ServerInstanceAssignment_6_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "this"
protected class MInternalComponentConnection_ThisKeyword_6_0 extends KeywordToken  {
	
	public MInternalComponentConnection_ThisKeyword_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getThisKeyword_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_LessThanSignHyphenMinusGreaterThanSignKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// serverInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]
protected class MInternalComponentConnection_ServerInstanceAssignment_6_1 extends AssignmentToken  {
	
	public MInternalComponentConnection_ServerInstanceAssignment_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getServerInstanceAssignment_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_LessThanSignHyphenMinusGreaterThanSignKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverInstance",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverInstance");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentConnectionAccess().getServerInstanceMInternalComponentInstanceCrossReference_6_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentConnectionAccess().getServerInstanceMInternalComponentInstanceCrossReference_6_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// "."
protected class MInternalComponentConnection_FullStopKeyword_7 extends KeywordToken  {
	
	public MInternalComponentConnection_FullStopKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getFullStopKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_Alternatives_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// serverPort=[MServerPort]
protected class MInternalComponentConnection_ServerPortAssignment_8 extends AssignmentToken  {
	
	public MInternalComponentConnection_ServerPortAssignment_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getServerPortAssignment_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_FullStopKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverPort",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverPort");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentConnectionAccess().getServerPortMServerPortCrossReference_8_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentConnectionAccess().getServerPortMServerPortCrossReference_8_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("using" connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{" ("mapping" ":="
// ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")? ("attribute"
// attributeValueAssignments+=MParameterValueAssignment)* "}")?
protected class MInternalComponentConnection_Group_9 extends GroupToken {
	
	public MInternalComponentConnection_Group_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getGroup_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_RightCurlyBracketKeyword_9_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "using"
protected class MInternalComponentConnection_UsingKeyword_9_0 extends KeywordToken  {
	
	public MInternalComponentConnection_UsingKeyword_9_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getUsingKeyword_9_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_ServerPortAssignment_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
protected class MInternalComponentConnection_ConnectorAssignment_9_1 extends AssignmentToken  {
	
	public MInternalComponentConnection_ConnectorAssignment_9_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getConnectorAssignment_9_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_UsingKeyword_9_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("connector",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("connector");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentConnectionAccess().getConnectorMConnectorCrossReference_9_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentConnectionAccess().getConnectorMConnectorCrossReference_9_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "{"
protected class MInternalComponentConnection_LeftCurlyBracketKeyword_9_2 extends KeywordToken  {
	
	public MInternalComponentConnection_LeftCurlyBracketKeyword_9_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getLeftCurlyBracketKeyword_9_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_ConnectorAssignment_9_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("mapping" ":=" ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
protected class MInternalComponentConnection_Group_9_3 extends GroupToken {
	
	public MInternalComponentConnection_Group_9_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getGroup_9_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_SemicolonKeyword_9_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "mapping"
protected class MInternalComponentConnection_MappingKeyword_9_3_0 extends KeywordToken  {
	
	public MInternalComponentConnection_MappingKeyword_9_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getMappingKeyword_9_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_LeftCurlyBracketKeyword_9_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MInternalComponentConnection_ColonEqualsSignKeyword_9_3_1 extends KeywordToken  {
	
	public MInternalComponentConnection_ColonEqualsSignKeyword_9_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getColonEqualsSignKeyword_9_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_MappingKeyword_9_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName]
protected class MInternalComponentConnection_IfaceMappingAssignment_9_3_2 extends AssignmentToken  {
	
	public MInternalComponentConnection_IfaceMappingAssignment_9_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getIfaceMappingAssignment_9_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_ColonEqualsSignKeyword_9_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ifaceMapping",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ifaceMapping");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_9_3_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_9_3_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MInternalComponentConnection_SemicolonKeyword_9_3_3 extends KeywordToken  {
	
	public MInternalComponentConnection_SemicolonKeyword_9_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getSemicolonKeyword_9_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_IfaceMappingAssignment_9_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("attribute" attributeValueAssignments+=MParameterValueAssignment)*
protected class MInternalComponentConnection_Group_9_4 extends GroupToken {
	
	public MInternalComponentConnection_Group_9_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getGroup_9_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_AttributeValueAssignmentsAssignment_9_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attribute"
protected class MInternalComponentConnection_AttributeKeyword_9_4_0 extends KeywordToken  {
	
	public MInternalComponentConnection_AttributeKeyword_9_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getAttributeKeyword_9_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_Group_9_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalComponentConnection_Group_9_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MInternalComponentConnection_LeftCurlyBracketKeyword_9_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MParameterValueAssignment
protected class MInternalComponentConnection_AttributeValueAssignmentsAssignment_9_4_1 extends AssignmentToken  {
	
	public MInternalComponentConnection_AttributeValueAssignmentsAssignment_9_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getAttributeValueAssignmentsAssignment_9_4_1();
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
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMInternalComponentConnectionAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_9_4_1_0(); 
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
			case 0: return new MInternalComponentConnection_AttributeKeyword_9_4_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// "}"
protected class MInternalComponentConnection_RightCurlyBracketKeyword_9_5 extends KeywordToken  {
	
	public MInternalComponentConnection_RightCurlyBracketKeyword_9_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getRightCurlyBracketKeyword_9_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_Group_9_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalComponentConnection_Group_9_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MInternalComponentConnection_LeftCurlyBracketKeyword_9_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}


// ";"
protected class MInternalComponentConnection_SemicolonKeyword_10 extends KeywordToken  {
	
	public MInternalComponentConnection_SemicolonKeyword_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentConnectionAccess().getSemicolonKeyword_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_Group_9(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalComponentConnection_ServerPortAssignment_8(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule MInternalComponentConnection ****************/


/************ begin Rule MInternalComponentPlatformSwitch ****************
 *
 * MInternalComponentPlatformSwitch:
 * 	{MInternalComponentPlatformSwitch} "connection" ("this" |
 * 	clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) "." clientPort=[MClientPort] "<->"
 * 	"switch" "{" cases+=MInternalComponentPlatformSwitchCase+ "}" ";";
 *
 **/

// {MInternalComponentPlatformSwitch} "connection" ("this" |
// clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]) "." clientPort=[MClientPort] "<->"
// "switch" "{" cases+=MInternalComponentPlatformSwitchCase+ "}" ";"
protected class MInternalComponentPlatformSwitch_Group extends GroupToken {
	
	public MInternalComponentPlatformSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_SemicolonKeyword_10(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalComponentPlatformSwitchAccess().getMInternalComponentPlatformSwitchAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MInternalComponentPlatformSwitch}
protected class MInternalComponentPlatformSwitch_MInternalComponentPlatformSwitchAction_0 extends ActionToken  {

	public MInternalComponentPlatformSwitch_MInternalComponentPlatformSwitchAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getMInternalComponentPlatformSwitchAction_0();
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

// "connection"
protected class MInternalComponentPlatformSwitch_ConnectionKeyword_1 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitch_ConnectionKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getConnectionKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_MInternalComponentPlatformSwitchAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "this" | clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]
protected class MInternalComponentPlatformSwitch_Alternatives_2 extends AlternativesToken {

	public MInternalComponentPlatformSwitch_Alternatives_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getAlternatives_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_ThisKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalComponentPlatformSwitch_ClientInstanceAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "this"
protected class MInternalComponentPlatformSwitch_ThisKeyword_2_0 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitch_ThisKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getThisKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_ConnectionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// clientInstance=[MInternalComponentInstance|VersionedQualifiedReferenceName]
protected class MInternalComponentPlatformSwitch_ClientInstanceAssignment_2_1 extends AssignmentToken  {
	
	public MInternalComponentPlatformSwitch_ClientInstanceAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientInstanceAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_ConnectionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientInstance",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientInstance");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientInstanceMInternalComponentInstanceCrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientInstanceMInternalComponentInstanceCrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// "."
protected class MInternalComponentPlatformSwitch_FullStopKeyword_3 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitch_FullStopKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getFullStopKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_Alternatives_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// clientPort=[MClientPort]
protected class MInternalComponentPlatformSwitch_ClientPortAssignment_4 extends AssignmentToken  {
	
	public MInternalComponentPlatformSwitch_ClientPortAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientPortAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_FullStopKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientPort",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientPort");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientPortMClientPortCrossReference_4_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentPlatformSwitchAccess().getClientPortMClientPortCrossReference_4_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "<->"
protected class MInternalComponentPlatformSwitch_LessThanSignHyphenMinusGreaterThanSignKeyword_5 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitch_LessThanSignHyphenMinusGreaterThanSignKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_ClientPortAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MInternalComponentPlatformSwitch_SwitchKeyword_6 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitch_SwitchKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getSwitchKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_LessThanSignHyphenMinusGreaterThanSignKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MInternalComponentPlatformSwitch_LeftCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitch_LeftCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getLeftCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_SwitchKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MInternalComponentPlatformSwitchCase+
protected class MInternalComponentPlatformSwitch_CasesAssignment_8 extends AssignmentToken  {
	
	public MInternalComponentPlatformSwitch_CasesAssignment_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getCasesAssignment_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentPlatformSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMInternalComponentPlatformSwitchAccess().getCasesMInternalComponentPlatformSwitchCaseParserRuleCall_8_0(); 
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
			case 0: return new MInternalComponentPlatformSwitch_CasesAssignment_8(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MInternalComponentPlatformSwitch_LeftCurlyBracketKeyword_7(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MInternalComponentPlatformSwitch_RightCurlyBracketKeyword_9 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitch_RightCurlyBracketKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getRightCurlyBracketKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_CasesAssignment_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MInternalComponentPlatformSwitch_SemicolonKeyword_10 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitch_SemicolonKeyword_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchAccess().getSemicolonKeyword_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitch_RightCurlyBracketKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MInternalComponentPlatformSwitch ****************/


/************ begin Rule MInternalComponentPlatformSwitchCase ****************
 *
 * MInternalComponentPlatformSwitchCase:
 * 	"case" platform=[MComponentSupportedPlatform] ":" ("this" | serverInstance=[MInternalComponentInstance]) "."
 * 	serverPort=[MServerPort] ("using" connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{" ("mapping" ":="
 * 	ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")? ("attribute"
 * 	attributeValueAssignments+=MParameterValueAssignment)* "}")? ";";
 *
 **/

// "case" platform=[MComponentSupportedPlatform] ":" ("this" | serverInstance=[MInternalComponentInstance]) "."
// serverPort=[MServerPort] ("using" connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{" ("mapping" ":="
// ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")? ("attribute"
// attributeValueAssignments+=MParameterValueAssignment)* "}")? ";"
protected class MInternalComponentPlatformSwitchCase_Group extends GroupToken {
	
	public MInternalComponentPlatformSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInternalComponentPlatformSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MInternalComponentPlatformSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MComponentSupportedPlatform]
protected class MInternalComponentPlatformSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MInternalComponentPlatformSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getPlatformMComponentSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getPlatformMComponentSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MInternalComponentPlatformSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "this" | serverInstance=[MInternalComponentInstance]
protected class MInternalComponentPlatformSwitchCase_Alternatives_3 extends AlternativesToken {

	public MInternalComponentPlatformSwitchCase_Alternatives_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAlternatives_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_ThisKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalComponentPlatformSwitchCase_ServerInstanceAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "this"
protected class MInternalComponentPlatformSwitchCase_ThisKeyword_3_0 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitchCase_ThisKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getThisKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_ColonKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// serverInstance=[MInternalComponentInstance]
protected class MInternalComponentPlatformSwitchCase_ServerInstanceAssignment_3_1 extends AssignmentToken  {
	
	public MInternalComponentPlatformSwitchCase_ServerInstanceAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerInstanceAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_ColonKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverInstance",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverInstance");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerInstanceMInternalComponentInstanceCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerInstanceMInternalComponentInstanceCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// "."
protected class MInternalComponentPlatformSwitchCase_FullStopKeyword_4 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitchCase_FullStopKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getFullStopKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_Alternatives_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// serverPort=[MServerPort]
protected class MInternalComponentPlatformSwitchCase_ServerPortAssignment_5 extends AssignmentToken  {
	
	public MInternalComponentPlatformSwitchCase_ServerPortAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerPortAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_FullStopKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverPort",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverPort");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerPortMServerPortCrossReference_5_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getServerPortMServerPortCrossReference_5_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("using" connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{" ("mapping" ":="
// ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")? ("attribute"
// attributeValueAssignments+=MParameterValueAssignment)* "}")?
protected class MInternalComponentPlatformSwitchCase_Group_6 extends GroupToken {
	
	public MInternalComponentPlatformSwitchCase_Group_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_RightCurlyBracketKeyword_6_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "using"
protected class MInternalComponentPlatformSwitchCase_UsingKeyword_6_0 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitchCase_UsingKeyword_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getUsingKeyword_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_ServerPortAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
protected class MInternalComponentPlatformSwitchCase_ConnectorAssignment_6_1 extends AssignmentToken  {
	
	public MInternalComponentPlatformSwitchCase_ConnectorAssignment_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getConnectorAssignment_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_UsingKeyword_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("connector",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("connector");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getConnectorMConnectorCrossReference_6_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getConnectorMConnectorCrossReference_6_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "{"
protected class MInternalComponentPlatformSwitchCase_LeftCurlyBracketKeyword_6_2 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitchCase_LeftCurlyBracketKeyword_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getLeftCurlyBracketKeyword_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_ConnectorAssignment_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("mapping" ":=" ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
protected class MInternalComponentPlatformSwitchCase_Group_6_3 extends GroupToken {
	
	public MInternalComponentPlatformSwitchCase_Group_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_SemicolonKeyword_6_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "mapping"
protected class MInternalComponentPlatformSwitchCase_MappingKeyword_6_3_0 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitchCase_MappingKeyword_6_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getMappingKeyword_6_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_LeftCurlyBracketKeyword_6_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MInternalComponentPlatformSwitchCase_ColonEqualsSignKeyword_6_3_1 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitchCase_ColonEqualsSignKeyword_6_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getColonEqualsSignKeyword_6_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_MappingKeyword_6_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName]
protected class MInternalComponentPlatformSwitchCase_IfaceMappingAssignment_6_3_2 extends AssignmentToken  {
	
	public MInternalComponentPlatformSwitchCase_IfaceMappingAssignment_6_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getIfaceMappingAssignment_6_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_ColonEqualsSignKeyword_6_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ifaceMapping",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ifaceMapping");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getIfaceMappingMInterfaceMappingCrossReference_6_3_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getIfaceMappingMInterfaceMappingCrossReference_6_3_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MInternalComponentPlatformSwitchCase_SemicolonKeyword_6_3_3 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitchCase_SemicolonKeyword_6_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getSemicolonKeyword_6_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_IfaceMappingAssignment_6_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("attribute" attributeValueAssignments+=MParameterValueAssignment)*
protected class MInternalComponentPlatformSwitchCase_Group_6_4 extends GroupToken {
	
	public MInternalComponentPlatformSwitchCase_Group_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getGroup_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_AttributeValueAssignmentsAssignment_6_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attribute"
protected class MInternalComponentPlatformSwitchCase_AttributeKeyword_6_4_0 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitchCase_AttributeKeyword_6_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeKeyword_6_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_Group_6_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalComponentPlatformSwitchCase_Group_6_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MInternalComponentPlatformSwitchCase_LeftCurlyBracketKeyword_6_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MParameterValueAssignment
protected class MInternalComponentPlatformSwitchCase_AttributeValueAssignmentsAssignment_6_4_1 extends AssignmentToken  {
	
	public MInternalComponentPlatformSwitchCase_AttributeValueAssignmentsAssignment_6_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeValueAssignmentsAssignment_6_4_1();
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
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_6_4_1_0(); 
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
			case 0: return new MInternalComponentPlatformSwitchCase_AttributeKeyword_6_4_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// "}"
protected class MInternalComponentPlatformSwitchCase_RightCurlyBracketKeyword_6_5 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitchCase_RightCurlyBracketKeyword_6_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getRightCurlyBracketKeyword_6_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_Group_6_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalComponentPlatformSwitchCase_Group_6_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MInternalComponentPlatformSwitchCase_LeftCurlyBracketKeyword_6_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}


// ";"
protected class MInternalComponentPlatformSwitchCase_SemicolonKeyword_7 extends KeywordToken  {
	
	public MInternalComponentPlatformSwitchCase_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInternalComponentPlatformSwitchCaseAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentPlatformSwitchCase_Group_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MInternalComponentPlatformSwitchCase_ServerPortAssignment_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule MInternalComponentPlatformSwitchCase ****************/


/************ begin Rule ComponentSupportedPlatform ****************
 *
 * ComponentSupportedPlatform returns MComponentSupportedPlatform:
 * 	{MComponentSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
 * 	osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
 * 	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
 * 	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
 * 	compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
 * 	microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
 * 	board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("requires" ":=" requires+=[mclevsai::MSAI|VersionedQualifiedName]
 * 	("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")? & ("attribute" "values" "{"
 * 	attributeValueAssignments+=MParameterValueAssignment* "}" ";")? & ("attributes" "{" attributes+=MParameter+ "}" ";")?
 * 	& ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
 * 	languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("subcomponent" "instances" "{"
 * 	internalComponents+=MInternalComponentInstance+ "}" ";")? & ("connections" "{"
 * 	connections+=MInternalComponentConnection+ "}" ";")?) "}" ";";
 *
 **/

// {MComponentSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
// osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
// os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
// architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
// compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
// board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("requires" ":=" requires+=[mclevsai::MSAI|VersionedQualifiedName]
// ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")? & ("attribute" "values" "{"
// attributeValueAssignments+=MParameterValueAssignment* "}" ";")? & ("attributes" "{" attributes+=MParameter+ "}" ";")? &
// ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("subcomponent" "instances" "{"
// internalComponents+=MInternalComponentInstance+ "}" ";")? & ("connections" "{"
// connections+=MInternalComponentConnection+ "}" ";")?) "}" ";"
protected class ComponentSupportedPlatform_Group extends GroupToken {
	
	public ComponentSupportedPlatform_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getComponentSupportedPlatformAccess().getMComponentSupportedPlatformAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MComponentSupportedPlatform}
protected class ComponentSupportedPlatform_MComponentSupportedPlatformAction_0 extends ActionToken  {

	public ComponentSupportedPlatform_MComponentSupportedPlatformAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getMComponentSupportedPlatformAction_0();
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

// "supported"
protected class ComponentSupportedPlatform_SupportedKeyword_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SupportedKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSupportedKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_MComponentSupportedPlatformAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "platform"
protected class ComponentSupportedPlatform_PlatformKeyword_2 extends KeywordToken  {
	
	public ComponentSupportedPlatform_PlatformKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getPlatformKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SupportedKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class ComponentSupportedPlatform_NameAssignment_3 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_PlatformKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getComponentSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getComponentSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class ComponentSupportedPlatform_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public ComponentSupportedPlatform_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
// os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
// architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
// compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
// board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("requires" ":=" requires+=[mclevsai::MSAI|VersionedQualifiedName]
// ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")? & ("attribute" "values" "{"
// attributeValueAssignments+=MParameterValueAssignment* "}" ";")? & ("attributes" "{" attributes+=MParameter+ "}" ";")? &
// ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("subcomponent" "instances" "{"
// internalComponents+=MInternalComponentInstance+ "}" ";")? & ("connections" "{"
// connections+=MInternalComponentConnection+ "}" ";")?
protected class ComponentSupportedPlatform_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public ComponentSupportedPlatform_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_11(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_Group_5_10(lastRuleCallOrigin, this, 1, inst);
			case 2: return new ComponentSupportedPlatform_Group_5_9(lastRuleCallOrigin, this, 2, inst);
			case 3: return new ComponentSupportedPlatform_Group_5_8(lastRuleCallOrigin, this, 3, inst);
			case 4: return new ComponentSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 4, inst);
			case 5: return new ComponentSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 5, inst);
			case 6: return new ComponentSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 6, inst);
			default: return null;
		}	
	}

}

// "osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";"
protected class ComponentSupportedPlatform_Group_5_0 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "osapi"
protected class ComponentSupportedPlatform_OsapiKeyword_5_0_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_OsapiKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getOsapiKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class ComponentSupportedPlatform_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_OsapiKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
protected class ComponentSupportedPlatform_Alternatives_5_0_2 extends AlternativesToken {

	public ComponentSupportedPlatform_Alternatives_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_AnyKeyword_5_0_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_OsapiAssignment_5_0_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class ComponentSupportedPlatform_AnyKeyword_5_0_2_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_AnyKeyword_5_0_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_0_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
protected class ComponentSupportedPlatform_OsapiAssignment_5_0_2_1 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_OsapiAssignment_5_0_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getOsapiAssignment_5_0_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("osapi",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("osapi");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getComponentSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getComponentSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Alternatives_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "os" ":=" ("any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";"
protected class ComponentSupportedPlatform_Group_5_1 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "os"
protected class ComponentSupportedPlatform_OsKeyword_5_1_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_OsKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getOsKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class ComponentSupportedPlatform_ColonEqualsSignKeyword_5_1_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_ColonEqualsSignKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_OsKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]
protected class ComponentSupportedPlatform_Alternatives_5_1_2 extends AlternativesToken {

	public ComponentSupportedPlatform_Alternatives_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_AnyKeyword_5_1_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_OsAssignment_5_1_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class ComponentSupportedPlatform_AnyKeyword_5_1_2_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_AnyKeyword_5_1_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_1_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// os=[pdl::MOperatingSystem|VersionedQualifiedName]
protected class ComponentSupportedPlatform_OsAssignment_5_1_2_1 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_OsAssignment_5_1_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getOsAssignment_5_1_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("os",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("os");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getComponentSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getComponentSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_5_1_3 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Alternatives_5_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "architecture" ":=" ("any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";"
protected class ComponentSupportedPlatform_Group_5_2 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_5_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "architecture"
protected class ComponentSupportedPlatform_ArchitectureKeyword_5_2_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_ArchitectureKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getArchitectureKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class ComponentSupportedPlatform_ColonEqualsSignKeyword_5_2_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_ColonEqualsSignKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ArchitectureKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]
protected class ComponentSupportedPlatform_Alternatives_5_2_2 extends AlternativesToken {

	public ComponentSupportedPlatform_Alternatives_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_AnyKeyword_5_2_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_ArchitectureAssignment_5_2_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class ComponentSupportedPlatform_AnyKeyword_5_2_2_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_AnyKeyword_5_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// architecture=[pdl::MArchitecture|VersionedQualifiedName]
protected class ComponentSupportedPlatform_ArchitectureAssignment_5_2_2_1 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_ArchitectureAssignment_5_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("architecture",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("architecture");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getComponentSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getComponentSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_5_2_3 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Alternatives_5_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("compiler" ":=" compiler=[pdl::MCompiler|VersionedQualifiedName] ";")?
protected class ComponentSupportedPlatform_Group_5_3 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "compiler"
protected class ComponentSupportedPlatform_CompilerKeyword_5_3_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_CompilerKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getCompilerKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class ComponentSupportedPlatform_ColonEqualsSignKeyword_5_3_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_ColonEqualsSignKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_CompilerKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// compiler=[pdl::MCompiler|VersionedQualifiedName]
protected class ComponentSupportedPlatform_CompilerAssignment_5_3_2 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_CompilerAssignment_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getCompilerAssignment_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("compiler",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("compiler");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getComponentSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getComponentSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_5_3_3 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_CompilerAssignment_5_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "microprocessor" ":=" ("any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";"
protected class ComponentSupportedPlatform_Group_5_4 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_5_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "microprocessor"
protected class ComponentSupportedPlatform_MicroprocessorKeyword_5_4_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_MicroprocessorKeyword_5_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_Group_5_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ":="
protected class ComponentSupportedPlatform_ColonEqualsSignKeyword_5_4_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_ColonEqualsSignKeyword_5_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_MicroprocessorKeyword_5_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
protected class ComponentSupportedPlatform_Alternatives_5_4_2 extends AlternativesToken {

	public ComponentSupportedPlatform_Alternatives_5_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_AnyKeyword_5_4_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_MicroprocessorAssignment_5_4_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class ComponentSupportedPlatform_AnyKeyword_5_4_2_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_AnyKeyword_5_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
protected class ComponentSupportedPlatform_MicroprocessorAssignment_5_4_2_1 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_MicroprocessorAssignment_5_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("microprocessor",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("microprocessor");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getComponentSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_5_4_3 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_5_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Alternatives_5_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "board" ":=" ("any" | board=[pdl::MBoard|VersionedQualifiedName]) ";"
protected class ComponentSupportedPlatform_Group_5_5 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_5_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "board"
protected class ComponentSupportedPlatform_BoardKeyword_5_5_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_BoardKeyword_5_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getBoardKeyword_5_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class ComponentSupportedPlatform_ColonEqualsSignKeyword_5_5_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_ColonEqualsSignKeyword_5_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_BoardKeyword_5_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | board=[pdl::MBoard|VersionedQualifiedName]
protected class ComponentSupportedPlatform_Alternatives_5_5_2 extends AlternativesToken {

	public ComponentSupportedPlatform_Alternatives_5_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAlternatives_5_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_AnyKeyword_5_5_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_BoardAssignment_5_5_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class ComponentSupportedPlatform_AnyKeyword_5_5_2_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_AnyKeyword_5_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAnyKeyword_5_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// board=[pdl::MBoard|VersionedQualifiedName]
protected class ComponentSupportedPlatform_BoardAssignment_5_5_2_1 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_BoardAssignment_5_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getBoardAssignment_5_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("board",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("board");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getComponentSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getComponentSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_5_5_3 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_5_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Alternatives_5_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("requires" ":=" requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")?
protected class ComponentSupportedPlatform_Group_5_6 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_5_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "requires"
protected class ComponentSupportedPlatform_RequiresKeyword_5_6_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_RequiresKeyword_5_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getRequiresKeyword_5_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class ComponentSupportedPlatform_ColonEqualsSignKeyword_5_6_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_ColonEqualsSignKeyword_5_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_RequiresKeyword_5_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class ComponentSupportedPlatform_RequiresAssignment_5_6_2 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_RequiresAssignment_5_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getRequiresAssignment_5_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAICrossReference_5_6_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAICrossReference_5_6_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])*
protected class ComponentSupportedPlatform_Group_5_6_3 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_RequiresAssignment_5_6_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class ComponentSupportedPlatform_CommaKeyword_5_6_3_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_CommaKeyword_5_6_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getCommaKeyword_5_6_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_6_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_RequiresAssignment_5_6_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class ComponentSupportedPlatform_RequiresAssignment_5_6_3_1 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_RequiresAssignment_5_6_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getRequiresAssignment_5_6_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_CommaKeyword_5_6_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAICrossReference_5_6_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getComponentSupportedPlatformAccess().getRequiresMSAICrossReference_5_6_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_5_6_4 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_5_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_6_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_RequiresAssignment_5_6_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("attribute" "values" "{" attributeValueAssignments+=MParameterValueAssignment* "}" ";")?
protected class ComponentSupportedPlatform_Group_5_7 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_5_7_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attribute"
protected class ComponentSupportedPlatform_AttributeKeyword_5_7_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_AttributeKeyword_5_7_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAttributeKeyword_5_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "values"
protected class ComponentSupportedPlatform_ValuesKeyword_5_7_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_ValuesKeyword_5_7_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getValuesKeyword_5_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_AttributeKeyword_5_7_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class ComponentSupportedPlatform_LeftCurlyBracketKeyword_5_7_2 extends KeywordToken  {
	
	public ComponentSupportedPlatform_LeftCurlyBracketKeyword_5_7_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ValuesKeyword_5_7_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MParameterValueAssignment*
protected class ComponentSupportedPlatform_AttributeValueAssignmentsAssignment_5_7_3 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_AttributeValueAssignmentsAssignment_5_7_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAttributeValueAssignmentsAssignment_5_7_3();
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
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueAssignmentRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getComponentSupportedPlatformAccess().getAttributeValueAssignmentsMParameterValueAssignmentParserRuleCall_5_7_3_0(); 
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
			case 0: return new ComponentSupportedPlatform_AttributeValueAssignmentsAssignment_5_7_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new ComponentSupportedPlatform_LeftCurlyBracketKeyword_5_7_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class ComponentSupportedPlatform_RightCurlyBracketKeyword_5_7_4 extends KeywordToken  {
	
	public ComponentSupportedPlatform_RightCurlyBracketKeyword_5_7_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_AttributeValueAssignmentsAssignment_5_7_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_5_7_5 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_5_7_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_7_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_RightCurlyBracketKeyword_5_7_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("attributes" "{" attributes+=MParameter+ "}" ";")?
protected class ComponentSupportedPlatform_Group_5_8 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_5_8_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attributes"
protected class ComponentSupportedPlatform_AttributesKeyword_5_8_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_AttributesKeyword_5_8_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAttributesKeyword_5_8_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 1, inst);
			case 2: return new ComponentSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "{"
protected class ComponentSupportedPlatform_LeftCurlyBracketKeyword_5_8_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_LeftCurlyBracketKeyword_5_8_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_AttributesKeyword_5_8_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class ComponentSupportedPlatform_AttributesAssignment_5_8_2 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_AttributesAssignment_5_8_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getAttributesAssignment_5_8_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameter_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getComponentSupportedPlatformAccess().getAttributesMParameterParserRuleCall_5_8_2_0(); 
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
			case 0: return new ComponentSupportedPlatform_AttributesAssignment_5_8_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new ComponentSupportedPlatform_LeftCurlyBracketKeyword_5_8_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class ComponentSupportedPlatform_RightCurlyBracketKeyword_5_8_3 extends KeywordToken  {
	
	public ComponentSupportedPlatform_RightCurlyBracketKeyword_5_8_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_AttributesAssignment_5_8_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_5_8_4 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_5_8_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_8_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_RightCurlyBracketKeyword_5_8_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")?
protected class ComponentSupportedPlatform_Group_5_9 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_5_9_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "languages"
protected class ComponentSupportedPlatform_LanguagesKeyword_5_9_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_LanguagesKeyword_5_9_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getLanguagesKeyword_5_9_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_8(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 1, inst);
			case 2: return new ComponentSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 2, inst);
			case 3: return new ComponentSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// ":="
protected class ComponentSupportedPlatform_ColonEqualsSignKeyword_5_9_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_ColonEqualsSignKeyword_5_9_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getColonEqualsSignKeyword_5_9_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_LanguagesKeyword_5_9_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class ComponentSupportedPlatform_LanguagesAssignment_5_9_2 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_LanguagesAssignment_5_9_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getLanguagesAssignment_5_9_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ColonEqualsSignKeyword_5_9_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_9_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_9_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class ComponentSupportedPlatform_Group_5_9_3 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_9_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_9_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_LanguagesAssignment_5_9_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class ComponentSupportedPlatform_CommaKeyword_5_9_3_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_CommaKeyword_5_9_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getCommaKeyword_5_9_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_9_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_LanguagesAssignment_5_9_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class ComponentSupportedPlatform_LanguagesAssignment_5_9_3_1 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_LanguagesAssignment_5_9_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getLanguagesAssignment_5_9_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_CommaKeyword_5_9_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_9_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getComponentSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_9_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_5_9_4 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_5_9_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_9_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_9_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_LanguagesAssignment_5_9_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("subcomponent" "instances" "{" internalComponents+=MInternalComponentInstance+ "}" ";")?
protected class ComponentSupportedPlatform_Group_5_10 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_5_10_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "subcomponent"
protected class ComponentSupportedPlatform_SubcomponentKeyword_5_10_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SubcomponentKeyword_5_10_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSubcomponentKeyword_5_10_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_9(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_Group_5_8(lastRuleCallOrigin, this, 1, inst);
			case 2: return new ComponentSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 2, inst);
			case 3: return new ComponentSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 3, inst);
			case 4: return new ComponentSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 4, inst);
			default: return null;
		}	
	}

}

// "instances"
protected class ComponentSupportedPlatform_InstancesKeyword_5_10_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_InstancesKeyword_5_10_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getInstancesKeyword_5_10_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SubcomponentKeyword_5_10_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class ComponentSupportedPlatform_LeftCurlyBracketKeyword_5_10_2 extends KeywordToken  {
	
	public ComponentSupportedPlatform_LeftCurlyBracketKeyword_5_10_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_10_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_InstancesKeyword_5_10_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// internalComponents+=MInternalComponentInstance+
protected class ComponentSupportedPlatform_InternalComponentsAssignment_5_10_3 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_InternalComponentsAssignment_5_10_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getInternalComponentsAssignment_5_10_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("internalComponents",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("internalComponents");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getComponentSupportedPlatformAccess().getInternalComponentsMInternalComponentInstanceParserRuleCall_5_10_3_0(); 
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
			case 0: return new ComponentSupportedPlatform_InternalComponentsAssignment_5_10_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new ComponentSupportedPlatform_LeftCurlyBracketKeyword_5_10_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class ComponentSupportedPlatform_RightCurlyBracketKeyword_5_10_4 extends KeywordToken  {
	
	public ComponentSupportedPlatform_RightCurlyBracketKeyword_5_10_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_10_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_InternalComponentsAssignment_5_10_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_5_10_5 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_5_10_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_10_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_RightCurlyBracketKeyword_5_10_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("connections" "{" connections+=MInternalComponentConnection+ "}" ";")?
protected class ComponentSupportedPlatform_Group_5_11 extends GroupToken {
	
	public ComponentSupportedPlatform_Group_5_11(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getGroup_5_11();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_SemicolonKeyword_5_11_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "connections"
protected class ComponentSupportedPlatform_ConnectionsKeyword_5_11_0 extends KeywordToken  {
	
	public ComponentSupportedPlatform_ConnectionsKeyword_5_11_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getConnectionsKeyword_5_11_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_Group_5_10(lastRuleCallOrigin, this, 0, inst);
			case 1: return new ComponentSupportedPlatform_Group_5_9(lastRuleCallOrigin, this, 1, inst);
			case 2: return new ComponentSupportedPlatform_Group_5_8(lastRuleCallOrigin, this, 2, inst);
			case 3: return new ComponentSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 3, inst);
			case 4: return new ComponentSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 4, inst);
			case 5: return new ComponentSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 5, inst);
			default: return null;
		}	
	}

}

// "{"
protected class ComponentSupportedPlatform_LeftCurlyBracketKeyword_5_11_1 extends KeywordToken  {
	
	public ComponentSupportedPlatform_LeftCurlyBracketKeyword_5_11_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_11_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ConnectionsKeyword_5_11_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// connections+=MInternalComponentConnection+
protected class ComponentSupportedPlatform_ConnectionsAssignment_5_11_2 extends AssignmentToken  {
	
	public ComponentSupportedPlatform_ConnectionsAssignment_5_11_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getConnectionsAssignment_5_11_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInternalComponentConnection_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("connections",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("connections");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInternalComponentConnectionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getComponentSupportedPlatformAccess().getConnectionsMInternalComponentConnectionParserRuleCall_5_11_2_0(); 
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
			case 0: return new ComponentSupportedPlatform_ConnectionsAssignment_5_11_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new ComponentSupportedPlatform_LeftCurlyBracketKeyword_5_11_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class ComponentSupportedPlatform_RightCurlyBracketKeyword_5_11_3 extends KeywordToken  {
	
	public ComponentSupportedPlatform_RightCurlyBracketKeyword_5_11_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_5_11_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_ConnectionsAssignment_5_11_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_5_11_4 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_5_11_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_5_11_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_RightCurlyBracketKeyword_5_11_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class ComponentSupportedPlatform_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public ComponentSupportedPlatform_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class ComponentSupportedPlatform_SemicolonKeyword_7 extends KeywordToken  {
	
	public ComponentSupportedPlatform_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getComponentSupportedPlatformAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new ComponentSupportedPlatform_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule ComponentSupportedPlatform ****************/

}
