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
package es.uah.aut.srg.micobs.lang.parseTreeConstruction;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;

import es.uah.aut.srg.micobs.lang.services.PDLGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class PDLParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private PDLGrammarAccess grammarAccess;
	
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
			case 0: return new MPDLPackageFile_Group(this, this, 0, inst);
			case 1: return new MPDLPackageElement_Alternatives(this, this, 1, inst);
			case 2: return new MCompiler_Group(this, this, 2, inst);
			case 3: return new MCompilerFrontend_Group(this, this, 3, inst);
			case 4: return new MBoard_Group(this, this, 4, inst);
			case 5: return new MBoardSupportedDevice_Group(this, this, 5, inst);
			case 6: return new MMicroprocessor_Group(this, this, 6, inst);
			case 7: return new MOperatingSystem_Group(this, this, 7, inst);
			case 8: return new MOSSupportedOSAPI_Group(this, this, 8, inst);
			case 9: return new MOSSupportedOSAPIPVA_Alternatives(this, this, 9, inst);
			case 10: return new MOSSupportedOSAPIPVAExpression_Group(this, this, 10, inst);
			case 11: return new MOSSupportedOSAPIPVASwitch_Group(this, this, 11, inst);
			case 12: return new MOSSupportedOSAPIPVASwitchCase_Group(this, this, 12, inst);
			case 13: return new MParameter_Alternatives(this, this, 13, inst);
			case 14: return new MBooleanParamOSSPSwitch_Group(this, this, 14, inst);
			case 15: return new MBooleanParamOSSPSwitchCase_Group(this, this, 15, inst);
			case 16: return new MStringParamOSSPSwitch_Group(this, this, 16, inst);
			case 17: return new MStringParamOSSPSwitchCase_Group(this, this, 17, inst);
			case 18: return new MIntegerParamOSSPSwitch_Group(this, this, 18, inst);
			case 19: return new MIntegerParamOSSPSwitchCase_Group(this, this, 19, inst);
			case 20: return new MRealParamOSSPSwitch_Group(this, this, 20, inst);
			case 21: return new MRealParamOSSPSwitchCase_Group(this, this, 21, inst);
			case 22: return new MEnumParamOSSPSwitch_Group(this, this, 22, inst);
			case 23: return new MEnumParamOSSPSwitchCase_Group(this, this, 23, inst);
			case 24: return new MParameterWithoutOSSP_Alternatives(this, this, 24, inst);
			case 25: return new MIntegerParameterSingleExpression_Group(this, this, 25, inst);
			case 26: return new MEnumParameterDefinition_Group(this, this, 26, inst);
			case 27: return new MEnumParameterSingleExpression_Group(this, this, 27, inst);
			case 28: return new MRealParameterSingleExpression_Group(this, this, 28, inst);
			case 29: return new MEnumParameterLiteralRule_Alternatives(this, this, 29, inst);
			case 30: return new MEnumParameterLiteral_Group(this, this, 30, inst);
			case 31: return new MEnumParamIntegerLiteral_Group(this, this, 31, inst);
			case 32: return new MEnumParamRealLiteral_Group(this, this, 32, inst);
			case 33: return new MEnumParamStringLiteral_Group(this, this, 33, inst);
			case 34: return new MBooleanParameterSingleExpression_Group(this, this, 34, inst);
			case 35: return new MStringParameterSingleExpression_Group(this, this, 35, inst);
			case 36: return new MParameterValue_Alternatives(this, this, 36, inst);
			case 37: return new MParameterValueLiteral_Alternatives(this, this, 37, inst);
			case 38: return new MParameterValueBooleanLiteral_Group(this, this, 38, inst);
			case 39: return new MParameterValueStringLiteral_Group(this, this, 39, inst);
			case 40: return new MParameterValueIntegerLiteral_Group(this, this, 40, inst);
			case 41: return new MParameterValueRealLiteral_Group(this, this, 41, inst);
			case 42: return new MParameterValueRefObject_Group(this, this, 42, inst);
			case 43: return new MParameterValuePAR_Group(this, this, 43, inst);
			case 44: return new MParameterValueExpression_Group(this, this, 44, inst);
			case 45: return new MParameterValueTERM_Group(this, this, 45, inst);
			case 46: return new MParameterRange_Alternatives(this, this, 46, inst);
			case 47: return new MParameterOCR_Group(this, this, 47, inst);
			case 48: return new MParameterOOR_Group(this, this, 48, inst);
			case 49: return new MParameterCOR_Group(this, this, 49, inst);
			case 50: return new MParameterCCR_Group(this, this, 50, inst);
			case 51: return new MOperatingSystemAPI_Group(this, this, 51, inst);
			case 52: return new MDevice_Group(this, this, 52, inst);
			case 53: return new MArchitecture_Group(this, this, 53, inst);
			case 54: return new MOSSupportedPlatform_Group(this, this, 54, inst);
			case 55: return new MPlatform_Group(this, this, 55, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MPDLPackageFile ****************
 *
 * MPDLPackageFile:
 * 	"package" package=[pdllibrary::MPDLPackage|QualifiedName] ";" ("import"
 * 	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MPDLPackageElement;
 *
 **/

// "package" package=[pdllibrary::MPDLPackage|QualifiedName] ";" ("import" imports+=[common::MCommonPackage|QualifiedName]
// ";")* element=MPDLPackageElement
protected class MPDLPackageFile_Group extends GroupToken {
	
	public MPDLPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPDLPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPDLPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMPDLPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "package"
protected class MPDLPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MPDLPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPDLPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[pdllibrary::MPDLPackage|QualifiedName]
protected class MPDLPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MPDLPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPDLPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPDLPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPDLPackageFileAccess().getPackageMPDLPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPDLPackageFileAccess().getPackageMPDLPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MPDLPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MPDLPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPDLPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPDLPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("import" imports+=[common::MCommonPackage|QualifiedName] ";")*
protected class MPDLPackageFile_Group_3 extends GroupToken {
	
	public MPDLPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPDLPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPDLPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "import"
protected class MPDLPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MPDLPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPDLPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPDLPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPDLPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[common::MCommonPackage|QualifiedName]
protected class MPDLPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MPDLPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPDLPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPDLPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPDLPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPDLPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MPDLPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MPDLPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPDLPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPDLPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MPDLPackageElement
protected class MPDLPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MPDLPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPDLPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPDLPackageElement_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPDLPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMPDLPackageFileAccess().getElementMPDLPackageElementParserRuleCall_4_0(); 
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
			case 0: return new MPDLPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MPDLPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MPDLPackageFile ****************/


/************ begin Rule MPDLPackageElement ****************
 *
 * MPDLPackageElement:
 * 	MBoard | MMicroprocessor | MOperatingSystem | MOperatingSystemAPI | MArchitecture | MPlatform | MCompiler | MDevice;
 *
 **/

// MBoard | MMicroprocessor | MOperatingSystem | MOperatingSystemAPI | MArchitecture | MPlatform | MCompiler | MDevice
protected class MPDLPackageElement_Alternatives extends AlternativesToken {

	public MPDLPackageElement_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMPDLPackageElementAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPDLPackageElement_MBoardParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPDLPackageElement_MMicroprocessorParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MPDLPackageElement_MOperatingSystemParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MPDLPackageElement_MOperatingSystemAPIParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MPDLPackageElement_MArchitectureParserRuleCall_4(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MPDLPackageElement_MPlatformParserRuleCall_5(lastRuleCallOrigin, this, 5, inst);
			case 6: return new MPDLPackageElement_MCompilerParserRuleCall_6(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MPDLPackageElement_MDeviceParserRuleCall_7(lastRuleCallOrigin, this, 7, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMArchitectureRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMBoardRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMCompilerRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMDeviceRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMMicroprocessorRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMOperatingSystemRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMOperatingSystemAPIRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMPlatformRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MBoard
protected class MPDLPackageElement_MBoardParserRuleCall_0 extends RuleCallToken {
	
	public MPDLPackageElement_MBoardParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMPDLPackageElementAccess().getMBoardParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBoardRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MBoard_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MMicroprocessor
protected class MPDLPackageElement_MMicroprocessorParserRuleCall_1 extends RuleCallToken {
	
	public MPDLPackageElement_MMicroprocessorParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMPDLPackageElementAccess().getMMicroprocessorParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMicroprocessorRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MMicroprocessor_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MOperatingSystem
protected class MPDLPackageElement_MOperatingSystemParserRuleCall_2 extends RuleCallToken {
	
	public MPDLPackageElement_MOperatingSystemParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMPDLPackageElementAccess().getMOperatingSystemParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOperatingSystemRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MOperatingSystem_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MOperatingSystemAPI
protected class MPDLPackageElement_MOperatingSystemAPIParserRuleCall_3 extends RuleCallToken {
	
	public MPDLPackageElement_MOperatingSystemAPIParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMPDLPackageElementAccess().getMOperatingSystemAPIParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOperatingSystemAPIRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MOperatingSystemAPI_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MArchitecture
protected class MPDLPackageElement_MArchitectureParserRuleCall_4 extends RuleCallToken {
	
	public MPDLPackageElement_MArchitectureParserRuleCall_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMPDLPackageElementAccess().getMArchitectureParserRuleCall_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMArchitectureRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MArchitecture_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MPlatform
protected class MPDLPackageElement_MPlatformParserRuleCall_5 extends RuleCallToken {
	
	public MPDLPackageElement_MPlatformParserRuleCall_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMPDLPackageElementAccess().getMPlatformParserRuleCall_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMPlatformRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MPlatform_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MCompiler
protected class MPDLPackageElement_MCompilerParserRuleCall_6 extends RuleCallToken {
	
	public MPDLPackageElement_MCompilerParserRuleCall_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMPDLPackageElementAccess().getMCompilerParserRuleCall_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMCompilerRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MCompiler_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MDevice
protected class MPDLPackageElement_MDeviceParserRuleCall_7 extends RuleCallToken {
	
	public MPDLPackageElement_MDeviceParserRuleCall_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMPDLPackageElementAccess().getMDeviceParserRuleCall_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDeviceRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MDevice_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MPDLPackageElement ****************/






/************ begin Rule MCompiler ****************
 *
 * MCompiler:
 * 	"compiler" name=ID ("extends" extends+=[MCompiler|VersionedQualifiedName] (","
 * 	extends+=[MCompiler|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("frontends" "{"
 * 	frontends+=MCompilerFrontend+ "}" ";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}"
 * 	";")?) "}" ";";
 *
 **/

// "compiler" name=ID ("extends" extends+=[MCompiler|VersionedQualifiedName] (","
// extends+=[MCompiler|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("frontends" "{"
// frontends+=MCompilerFrontend+ "}" ";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}"
// ";")?) "}" ";"
protected class MCompiler_Group extends GroupToken {
	
	public MCompiler_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMCompilerRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "compiler"
protected class MCompiler_CompilerKeyword_0 extends KeywordToken  {
	
	public MCompiler_CompilerKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getCompilerKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MCompiler_NameAssignment_1 extends AssignmentToken  {
	
	public MCompiler_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_CompilerKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMCompilerAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMCompilerAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ("extends" extends+=[MCompiler|VersionedQualifiedName] ("," extends+=[MCompiler|VersionedQualifiedName])*)?
protected class MCompiler_Group_2 extends GroupToken {
	
	public MCompiler_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MCompiler_ExtendsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "extends"
protected class MCompiler_ExtendsKeyword_2_0 extends KeywordToken  {
	
	public MCompiler_ExtendsKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getExtendsKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// extends+=[MCompiler|VersionedQualifiedName]
protected class MCompiler_ExtendsAssignment_2_1 extends AssignmentToken  {
	
	public MCompiler_ExtendsAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getExtendsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_ExtendsKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMCompilerAccess().getExtendsMCompilerCrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMCompilerAccess().getExtendsMCompilerCrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," extends+=[MCompiler|VersionedQualifiedName])*
protected class MCompiler_Group_2_2 extends GroupToken {
	
	public MCompiler_Group_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getGroup_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_ExtendsAssignment_2_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MCompiler_CommaKeyword_2_2_0 extends KeywordToken  {
	
	public MCompiler_CommaKeyword_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getCommaKeyword_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MCompiler_ExtendsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MCompiler|VersionedQualifiedName]
protected class MCompiler_ExtendsAssignment_2_2_1 extends AssignmentToken  {
	
	public MCompiler_ExtendsAssignment_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getExtendsAssignment_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_CommaKeyword_2_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMCompilerAccess().getExtendsMCompilerCrossReference_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMCompilerAccess().getExtendsMCompilerCrossReference_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MCompiler_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MCompiler_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MCompiler_NameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & ("frontends" "{" frontends+=MCompilerFrontend+ "}" ";")? & ("configuration"
// "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MCompiler_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MCompiler_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MCompiler_Group_4_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MCompiler_Group_4_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MCompiler_Group_4_0 extends GroupToken {
	
	public MCompiler_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_SemicolonKeyword_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MCompiler_VersionKeyword_4_0_0 extends KeywordToken  {
	
	public MCompiler_VersionKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getVersionKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MCompiler_ColonEqualsSignKeyword_4_0_1 extends KeywordToken  {
	
	public MCompiler_ColonEqualsSignKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getColonEqualsSignKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_VersionKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MCompiler_VersionAssignment_4_0_2 extends AssignmentToken  {
	
	public MCompiler_VersionAssignment_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getVersionAssignment_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_ColonEqualsSignKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMCompilerAccess().getVersionVersionParserRuleCall_4_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMCompilerAccess().getVersionVersionParserRuleCall_4_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MCompiler_SemicolonKeyword_4_0_3 extends KeywordToken  {
	
	public MCompiler_SemicolonKeyword_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getSemicolonKeyword_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_VersionAssignment_4_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("frontends" "{" frontends+=MCompilerFrontend+ "}" ";")?
protected class MCompiler_Group_4_1 extends GroupToken {
	
	public MCompiler_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_SemicolonKeyword_4_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "frontends"
protected class MCompiler_FrontendsKeyword_4_1_0 extends KeywordToken  {
	
	public MCompiler_FrontendsKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getFrontendsKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MCompiler_LeftCurlyBracketKeyword_4_1_1 extends KeywordToken  {
	
	public MCompiler_LeftCurlyBracketKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getLeftCurlyBracketKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_FrontendsKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// frontends+=MCompilerFrontend+
protected class MCompiler_FrontendsAssignment_4_1_2 extends AssignmentToken  {
	
	public MCompiler_FrontendsAssignment_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getFrontendsAssignment_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("frontends",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("frontends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMCompilerFrontendRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMCompilerAccess().getFrontendsMCompilerFrontendParserRuleCall_4_1_2_0(); 
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
			case 0: return new MCompiler_FrontendsAssignment_4_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MCompiler_LeftCurlyBracketKeyword_4_1_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MCompiler_RightCurlyBracketKeyword_4_1_3 extends KeywordToken  {
	
	public MCompiler_RightCurlyBracketKeyword_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getRightCurlyBracketKeyword_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_FrontendsAssignment_4_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MCompiler_SemicolonKeyword_4_1_4 extends KeywordToken  {
	
	public MCompiler_SemicolonKeyword_4_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getSemicolonKeyword_4_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_RightCurlyBracketKeyword_4_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MCompiler_Group_4_2 extends GroupToken {
	
	public MCompiler_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_SemicolonKeyword_4_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MCompiler_ConfigurationKeyword_4_2_0 extends KeywordToken  {
	
	public MCompiler_ConfigurationKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getConfigurationKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MCompiler_Group_4_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MCompiler_ParametersKeyword_4_2_1 extends KeywordToken  {
	
	public MCompiler_ParametersKeyword_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getParametersKeyword_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_ConfigurationKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MCompiler_LeftCurlyBracketKeyword_4_2_2 extends KeywordToken  {
	
	public MCompiler_LeftCurlyBracketKeyword_4_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getLeftCurlyBracketKeyword_4_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_ParametersKeyword_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameterWithoutOSSP+
protected class MCompiler_ParametersAssignment_4_2_3 extends AssignmentToken  {
	
	public MCompiler_ParametersAssignment_4_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getParametersAssignment_4_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutOSSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameters",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutOSSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMCompilerAccess().getParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0(); 
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
			case 0: return new MCompiler_ParametersAssignment_4_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MCompiler_LeftCurlyBracketKeyword_4_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MCompiler_RightCurlyBracketKeyword_4_2_4 extends KeywordToken  {
	
	public MCompiler_RightCurlyBracketKeyword_4_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getRightCurlyBracketKeyword_4_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_ParametersAssignment_4_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MCompiler_SemicolonKeyword_4_2_5 extends KeywordToken  {
	
	public MCompiler_SemicolonKeyword_4_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getSemicolonKeyword_4_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_RightCurlyBracketKeyword_4_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MCompiler_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MCompiler_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MCompiler_SemicolonKeyword_6 extends KeywordToken  {
	
	public MCompiler_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompiler_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MCompiler ****************/


/************ begin Rule MCompilerFrontend ****************
 *
 * MCompilerFrontend:
 * 	"frontend" name=ID "{" ("language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" & "architectures" ":="
 * 	architectures+=[MArchitecture|VersionedQualifiedName] ("," architectures+=[MArchitecture|VersionedQualifiedName])* ";"
 * 	& ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
 *
 **/

// "frontend" name=ID "{" ("language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" & "architectures" ":="
// architectures+=[MArchitecture|VersionedQualifiedName] ("," architectures+=[MArchitecture|VersionedQualifiedName])* ";"
// & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
protected class MCompilerFrontend_Group extends GroupToken {
	
	public MCompilerFrontend_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMCompilerFrontendRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "frontend"
protected class MCompilerFrontend_FrontendKeyword_0 extends KeywordToken  {
	
	public MCompilerFrontend_FrontendKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getFrontendKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MCompilerFrontend_NameAssignment_1 extends AssignmentToken  {
	
	public MCompilerFrontend_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_FrontendKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMCompilerFrontendAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMCompilerFrontendAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MCompilerFrontend_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MCompilerFrontend_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" & "architectures" ":="
// architectures+=[MArchitecture|VersionedQualifiedName] ("," architectures+=[MArchitecture|VersionedQualifiedName])* ";"
// & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MCompilerFrontend_UnorderedGroup_3 extends UnorderedGroupToken {
	
	public MCompilerFrontend_UnorderedGroup_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getUnorderedGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MCompilerFrontend_Group_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";"
protected class MCompilerFrontend_Group_3_0 extends GroupToken {
	
	public MCompilerFrontend_Group_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getGroup_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_SemicolonKeyword_3_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "language"
protected class MCompilerFrontend_LanguageKeyword_3_0_0 extends KeywordToken  {
	
	public MCompilerFrontend_LanguageKeyword_3_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getLanguageKeyword_3_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MCompilerFrontend_ColonEqualsSignKeyword_3_0_1 extends KeywordToken  {
	
	public MCompilerFrontend_ColonEqualsSignKeyword_3_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getColonEqualsSignKeyword_3_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_LanguageKeyword_3_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// language=[system::MLanguage|VersionedQualifiedName]
protected class MCompilerFrontend_LanguageAssignment_3_0_2 extends AssignmentToken  {
	
	public MCompilerFrontend_LanguageAssignment_3_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getLanguageAssignment_3_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_ColonEqualsSignKeyword_3_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("language",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("language");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMCompilerFrontendAccess().getLanguageMLanguageCrossReference_3_0_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMCompilerFrontendAccess().getLanguageMLanguageCrossReference_3_0_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MCompilerFrontend_SemicolonKeyword_3_0_3 extends KeywordToken  {
	
	public MCompilerFrontend_SemicolonKeyword_3_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_3_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_LanguageAssignment_3_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "architectures" ":=" architectures+=[MArchitecture|VersionedQualifiedName] (","
// architectures+=[MArchitecture|VersionedQualifiedName])* ";"
protected class MCompilerFrontend_Group_3_1 extends GroupToken {
	
	public MCompilerFrontend_Group_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getGroup_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_SemicolonKeyword_3_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "architectures"
protected class MCompilerFrontend_ArchitecturesKeyword_3_1_0 extends KeywordToken  {
	
	public MCompilerFrontend_ArchitecturesKeyword_3_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getArchitecturesKeyword_3_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_Group_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MCompilerFrontend_ColonEqualsSignKeyword_3_1_1 extends KeywordToken  {
	
	public MCompilerFrontend_ColonEqualsSignKeyword_3_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getColonEqualsSignKeyword_3_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_ArchitecturesKeyword_3_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// architectures+=[MArchitecture|VersionedQualifiedName]
protected class MCompilerFrontend_ArchitecturesAssignment_3_1_2 extends AssignmentToken  {
	
	public MCompilerFrontend_ArchitecturesAssignment_3_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getArchitecturesAssignment_3_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_ColonEqualsSignKeyword_3_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("architectures",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("architectures");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureCrossReference_3_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureCrossReference_3_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," architectures+=[MArchitecture|VersionedQualifiedName])*
protected class MCompilerFrontend_Group_3_1_3 extends GroupToken {
	
	public MCompilerFrontend_Group_3_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getGroup_3_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_ArchitecturesAssignment_3_1_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MCompilerFrontend_CommaKeyword_3_1_3_0 extends KeywordToken  {
	
	public MCompilerFrontend_CommaKeyword_3_1_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getCommaKeyword_3_1_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_Group_3_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MCompilerFrontend_ArchitecturesAssignment_3_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// architectures+=[MArchitecture|VersionedQualifiedName]
protected class MCompilerFrontend_ArchitecturesAssignment_3_1_3_1 extends AssignmentToken  {
	
	public MCompilerFrontend_ArchitecturesAssignment_3_1_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getArchitecturesAssignment_3_1_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_CommaKeyword_3_1_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("architectures",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("architectures");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureCrossReference_3_1_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMCompilerFrontendAccess().getArchitecturesMArchitectureCrossReference_3_1_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MCompilerFrontend_SemicolonKeyword_3_1_4 extends KeywordToken  {
	
	public MCompilerFrontend_SemicolonKeyword_3_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_3_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_Group_3_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MCompilerFrontend_ArchitecturesAssignment_3_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MCompilerFrontend_Group_3_2 extends GroupToken {
	
	public MCompilerFrontend_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_SemicolonKeyword_3_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MCompilerFrontend_ConfigurationKeyword_3_2_0 extends KeywordToken  {
	
	public MCompilerFrontend_ConfigurationKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getConfigurationKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_Group_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MCompilerFrontend_ParametersKeyword_3_2_1 extends KeywordToken  {
	
	public MCompilerFrontend_ParametersKeyword_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getParametersKeyword_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_ConfigurationKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MCompilerFrontend_LeftCurlyBracketKeyword_3_2_2 extends KeywordToken  {
	
	public MCompilerFrontend_LeftCurlyBracketKeyword_3_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getLeftCurlyBracketKeyword_3_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_ParametersKeyword_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameterWithoutOSSP+
protected class MCompilerFrontend_ParametersAssignment_3_2_3 extends AssignmentToken  {
	
	public MCompilerFrontend_ParametersAssignment_3_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getParametersAssignment_3_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutOSSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameters",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutOSSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMCompilerFrontendAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0(); 
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
			case 0: return new MCompilerFrontend_ParametersAssignment_3_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MCompilerFrontend_LeftCurlyBracketKeyword_3_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MCompilerFrontend_RightCurlyBracketKeyword_3_2_4 extends KeywordToken  {
	
	public MCompilerFrontend_RightCurlyBracketKeyword_3_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getRightCurlyBracketKeyword_3_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_ParametersAssignment_3_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MCompilerFrontend_SemicolonKeyword_3_2_5 extends KeywordToken  {
	
	public MCompilerFrontend_SemicolonKeyword_3_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_3_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_RightCurlyBracketKeyword_3_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MCompilerFrontend_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MCompilerFrontend_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_UnorderedGroup_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MCompilerFrontend_SemicolonKeyword_5 extends KeywordToken  {
	
	public MCompilerFrontend_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMCompilerFrontendAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MCompilerFrontend_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MCompilerFrontend ****************/


/************ begin Rule MBoard ****************
 *
 * MBoard:
 * 	"board" name=ID "{" ("version" ":=" version=Version ";" & ("supported" "devices" "{"
 * 	supportedDevices+=MBoardSupportedDevice+ "}" ";")? & "microprocessor" ":="
 * 	microprocessor=[MMicroprocessor|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
 * 	parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
 *
 **/

// "board" name=ID "{" ("version" ":=" version=Version ";" & ("supported" "devices" "{"
// supportedDevices+=MBoardSupportedDevice+ "}" ";")? & "microprocessor" ":="
// microprocessor=[MMicroprocessor|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
// parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
protected class MBoard_Group extends GroupToken {
	
	public MBoard_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBoardAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBoardRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "board"
protected class MBoard_BoardKeyword_0 extends KeywordToken  {
	
	public MBoard_BoardKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getBoardKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MBoard_NameAssignment_1 extends AssignmentToken  {
	
	public MBoard_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBoardAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_BoardKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMBoardAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMBoardAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MBoard_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MBoard_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & ("supported" "devices" "{" supportedDevices+=MBoardSupportedDevice+ "}" ";")? &
// "microprocessor" ":=" microprocessor=[MMicroprocessor|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
// parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MBoard_UnorderedGroup_3 extends UnorderedGroupToken {
	
	public MBoard_UnorderedGroup_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMBoardAccess().getUnorderedGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_Group_3_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MBoard_Group_3_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MBoard_Group_3_0 extends GroupToken {
	
	public MBoard_Group_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBoardAccess().getGroup_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_SemicolonKeyword_3_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MBoard_VersionKeyword_3_0_0 extends KeywordToken  {
	
	public MBoard_VersionKeyword_3_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getVersionKeyword_3_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MBoard_ColonEqualsSignKeyword_3_0_1 extends KeywordToken  {
	
	public MBoard_ColonEqualsSignKeyword_3_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getColonEqualsSignKeyword_3_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_VersionKeyword_3_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MBoard_VersionAssignment_3_0_2 extends AssignmentToken  {
	
	public MBoard_VersionAssignment_3_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBoardAccess().getVersionAssignment_3_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_ColonEqualsSignKeyword_3_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMBoardAccess().getVersionVersionParserRuleCall_3_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMBoardAccess().getVersionVersionParserRuleCall_3_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MBoard_SemicolonKeyword_3_0_3 extends KeywordToken  {
	
	public MBoard_SemicolonKeyword_3_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getSemicolonKeyword_3_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_VersionAssignment_3_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("supported" "devices" "{" supportedDevices+=MBoardSupportedDevice+ "}" ";")?
protected class MBoard_Group_3_1 extends GroupToken {
	
	public MBoard_Group_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBoardAccess().getGroup_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_SemicolonKeyword_3_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "supported"
protected class MBoard_SupportedKeyword_3_1_0 extends KeywordToken  {
	
	public MBoard_SupportedKeyword_3_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getSupportedKeyword_3_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_Group_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "devices"
protected class MBoard_DevicesKeyword_3_1_1 extends KeywordToken  {
	
	public MBoard_DevicesKeyword_3_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getDevicesKeyword_3_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_SupportedKeyword_3_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MBoard_LeftCurlyBracketKeyword_3_1_2 extends KeywordToken  {
	
	public MBoard_LeftCurlyBracketKeyword_3_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getLeftCurlyBracketKeyword_3_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_DevicesKeyword_3_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedDevices+=MBoardSupportedDevice+
protected class MBoard_SupportedDevicesAssignment_3_1_3 extends AssignmentToken  {
	
	public MBoard_SupportedDevicesAssignment_3_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBoardAccess().getSupportedDevicesAssignment_3_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoardSupportedDevice_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedDevices",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedDevices");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMBoardSupportedDeviceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMBoardAccess().getSupportedDevicesMBoardSupportedDeviceParserRuleCall_3_1_3_0(); 
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
			case 0: return new MBoard_SupportedDevicesAssignment_3_1_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MBoard_LeftCurlyBracketKeyword_3_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MBoard_RightCurlyBracketKeyword_3_1_4 extends KeywordToken  {
	
	public MBoard_RightCurlyBracketKeyword_3_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getRightCurlyBracketKeyword_3_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_SupportedDevicesAssignment_3_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MBoard_SemicolonKeyword_3_1_5 extends KeywordToken  {
	
	public MBoard_SemicolonKeyword_3_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getSemicolonKeyword_3_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_RightCurlyBracketKeyword_3_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "microprocessor" ":=" microprocessor=[MMicroprocessor|VersionedQualifiedName] ";"
protected class MBoard_Group_3_2 extends GroupToken {
	
	public MBoard_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBoardAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_SemicolonKeyword_3_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "microprocessor"
protected class MBoard_MicroprocessorKeyword_3_2_0 extends KeywordToken  {
	
	public MBoard_MicroprocessorKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getMicroprocessorKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_Group_3_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MBoard_Group_3_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MBoard_ColonEqualsSignKeyword_3_2_1 extends KeywordToken  {
	
	public MBoard_ColonEqualsSignKeyword_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getColonEqualsSignKeyword_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_MicroprocessorKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// microprocessor=[MMicroprocessor|VersionedQualifiedName]
protected class MBoard_MicroprocessorAssignment_3_2_2 extends AssignmentToken  {
	
	public MBoard_MicroprocessorAssignment_3_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBoardAccess().getMicroprocessorAssignment_3_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_ColonEqualsSignKeyword_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("microprocessor",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("microprocessor");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMBoardAccess().getMicroprocessorMMicroprocessorCrossReference_3_2_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMBoardAccess().getMicroprocessorMMicroprocessorCrossReference_3_2_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MBoard_SemicolonKeyword_3_2_3 extends KeywordToken  {
	
	public MBoard_SemicolonKeyword_3_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getSemicolonKeyword_3_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_MicroprocessorAssignment_3_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MBoard_Group_3_3 extends GroupToken {
	
	public MBoard_Group_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBoardAccess().getGroup_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_SemicolonKeyword_3_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MBoard_ConfigurationKeyword_3_3_0 extends KeywordToken  {
	
	public MBoard_ConfigurationKeyword_3_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getConfigurationKeyword_3_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MBoard_ParametersKeyword_3_3_1 extends KeywordToken  {
	
	public MBoard_ParametersKeyword_3_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getParametersKeyword_3_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_ConfigurationKeyword_3_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MBoard_LeftCurlyBracketKeyword_3_3_2 extends KeywordToken  {
	
	public MBoard_LeftCurlyBracketKeyword_3_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getLeftCurlyBracketKeyword_3_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_ParametersKeyword_3_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameterWithoutOSSP+
protected class MBoard_ParametersAssignment_3_3_3 extends AssignmentToken  {
	
	public MBoard_ParametersAssignment_3_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBoardAccess().getParametersAssignment_3_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutOSSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameters",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutOSSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMBoardAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_3_3_0(); 
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
			case 0: return new MBoard_ParametersAssignment_3_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MBoard_LeftCurlyBracketKeyword_3_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MBoard_RightCurlyBracketKeyword_3_3_4 extends KeywordToken  {
	
	public MBoard_RightCurlyBracketKeyword_3_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getRightCurlyBracketKeyword_3_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_ParametersAssignment_3_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MBoard_SemicolonKeyword_3_3_5 extends KeywordToken  {
	
	public MBoard_SemicolonKeyword_3_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getSemicolonKeyword_3_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_RightCurlyBracketKeyword_3_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MBoard_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MBoard_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_UnorderedGroup_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MBoard_SemicolonKeyword_5 extends KeywordToken  {
	
	public MBoard_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoard_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MBoard ****************/


/************ begin Rule MBoardSupportedDevice ****************
 *
 * MBoardSupportedDevice:
 * 	"device" device=[MDevice|VersionedQualifiedName] "range" lowerBound=MParameterValueExpression "to"
 * 	upperBound=MParameterValueExpression ";";
 *
 **/

// "device" device=[MDevice|VersionedQualifiedName] "range" lowerBound=MParameterValueExpression "to"
// upperBound=MParameterValueExpression ";"
protected class MBoardSupportedDevice_Group extends GroupToken {
	
	public MBoardSupportedDevice_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBoardSupportedDeviceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoardSupportedDevice_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBoardSupportedDeviceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "device"
protected class MBoardSupportedDevice_DeviceKeyword_0 extends KeywordToken  {
	
	public MBoardSupportedDevice_DeviceKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardSupportedDeviceAccess().getDeviceKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// device=[MDevice|VersionedQualifiedName]
protected class MBoardSupportedDevice_DeviceAssignment_1 extends AssignmentToken  {
	
	public MBoardSupportedDevice_DeviceAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBoardSupportedDeviceAccess().getDeviceAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoardSupportedDevice_DeviceKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("device",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("device");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMBoardSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMBoardSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "range"
protected class MBoardSupportedDevice_RangeKeyword_2 extends KeywordToken  {
	
	public MBoardSupportedDevice_RangeKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardSupportedDeviceAccess().getRangeKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoardSupportedDevice_DeviceAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// lowerBound=MParameterValueExpression
protected class MBoardSupportedDevice_LowerBoundAssignment_3 extends AssignmentToken  {
	
	public MBoardSupportedDevice_LowerBoundAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBoardSupportedDeviceAccess().getLowerBoundAssignment_3();
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
		if((value = eObjectConsumer.getConsumable("lowerBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("lowerBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMBoardSupportedDeviceAccess().getLowerBoundMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MBoardSupportedDevice_RangeKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "to"
protected class MBoardSupportedDevice_ToKeyword_4 extends KeywordToken  {
	
	public MBoardSupportedDevice_ToKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardSupportedDeviceAccess().getToKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoardSupportedDevice_LowerBoundAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// upperBound=MParameterValueExpression
protected class MBoardSupportedDevice_UpperBoundAssignment_5 extends AssignmentToken  {
	
	public MBoardSupportedDevice_UpperBoundAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBoardSupportedDeviceAccess().getUpperBoundAssignment_5();
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
		if((value = eObjectConsumer.getConsumable("upperBound",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("upperBound");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMBoardSupportedDeviceAccess().getUpperBoundMParameterValueExpressionParserRuleCall_5_0(); 
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
			case 0: return new MBoardSupportedDevice_ToKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MBoardSupportedDevice_SemicolonKeyword_6 extends KeywordToken  {
	
	public MBoardSupportedDevice_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBoardSupportedDeviceAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBoardSupportedDevice_UpperBoundAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MBoardSupportedDevice ****************/


/************ begin Rule MMicroprocessor ****************
 *
 * MMicroprocessor:
 * 	"microprocessor" name=ID "{" ("version" ":=" version=Version ";" & "architecture" ":="
 * 	architecture=[MArchitecture|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
 * 	parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
 *
 **/

// "microprocessor" name=ID "{" ("version" ":=" version=Version ";" & "architecture" ":="
// architecture=[MArchitecture|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
// parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
protected class MMicroprocessor_Group extends GroupToken {
	
	public MMicroprocessor_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMicroprocessorRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "microprocessor"
protected class MMicroprocessor_MicroprocessorKeyword_0 extends KeywordToken  {
	
	public MMicroprocessor_MicroprocessorKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getMicroprocessorKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MMicroprocessor_NameAssignment_1 extends AssignmentToken  {
	
	public MMicroprocessor_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_MicroprocessorKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMMicroprocessorAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMMicroprocessorAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MMicroprocessor_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MMicroprocessor_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & "architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";" &
// ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MMicroprocessor_UnorderedGroup_3 extends UnorderedGroupToken {
	
	public MMicroprocessor_UnorderedGroup_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getUnorderedGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMicroprocessor_Group_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MMicroprocessor_Group_3_0 extends GroupToken {
	
	public MMicroprocessor_Group_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getGroup_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_SemicolonKeyword_3_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MMicroprocessor_VersionKeyword_3_0_0 extends KeywordToken  {
	
	public MMicroprocessor_VersionKeyword_3_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getVersionKeyword_3_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MMicroprocessor_ColonEqualsSignKeyword_3_0_1 extends KeywordToken  {
	
	public MMicroprocessor_ColonEqualsSignKeyword_3_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getColonEqualsSignKeyword_3_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_VersionKeyword_3_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MMicroprocessor_VersionAssignment_3_0_2 extends AssignmentToken  {
	
	public MMicroprocessor_VersionAssignment_3_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getVersionAssignment_3_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_ColonEqualsSignKeyword_3_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMMicroprocessorAccess().getVersionVersionParserRuleCall_3_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMMicroprocessorAccess().getVersionVersionParserRuleCall_3_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MMicroprocessor_SemicolonKeyword_3_0_3 extends KeywordToken  {
	
	public MMicroprocessor_SemicolonKeyword_3_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_3_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_VersionAssignment_3_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";"
protected class MMicroprocessor_Group_3_1 extends GroupToken {
	
	public MMicroprocessor_Group_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getGroup_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_SemicolonKeyword_3_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "architecture"
protected class MMicroprocessor_ArchitectureKeyword_3_1_0 extends KeywordToken  {
	
	public MMicroprocessor_ArchitectureKeyword_3_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getArchitectureKeyword_3_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_Group_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MMicroprocessor_ColonEqualsSignKeyword_3_1_1 extends KeywordToken  {
	
	public MMicroprocessor_ColonEqualsSignKeyword_3_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getColonEqualsSignKeyword_3_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_ArchitectureKeyword_3_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// architecture=[MArchitecture|VersionedQualifiedName]
protected class MMicroprocessor_ArchitectureAssignment_3_1_2 extends AssignmentToken  {
	
	public MMicroprocessor_ArchitectureAssignment_3_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getArchitectureAssignment_3_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_ColonEqualsSignKeyword_3_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("architecture",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("architecture");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMicroprocessorAccess().getArchitectureMArchitectureCrossReference_3_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMicroprocessorAccess().getArchitectureMArchitectureCrossReference_3_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMicroprocessor_SemicolonKeyword_3_1_3 extends KeywordToken  {
	
	public MMicroprocessor_SemicolonKeyword_3_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_3_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_ArchitectureAssignment_3_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MMicroprocessor_Group_3_2 extends GroupToken {
	
	public MMicroprocessor_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_SemicolonKeyword_3_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MMicroprocessor_ConfigurationKeyword_3_2_0 extends KeywordToken  {
	
	public MMicroprocessor_ConfigurationKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getConfigurationKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_Group_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MMicroprocessor_ParametersKeyword_3_2_1 extends KeywordToken  {
	
	public MMicroprocessor_ParametersKeyword_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getParametersKeyword_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_ConfigurationKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MMicroprocessor_LeftCurlyBracketKeyword_3_2_2 extends KeywordToken  {
	
	public MMicroprocessor_LeftCurlyBracketKeyword_3_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getLeftCurlyBracketKeyword_3_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_ParametersKeyword_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameterWithoutOSSP+
protected class MMicroprocessor_ParametersAssignment_3_2_3 extends AssignmentToken  {
	
	public MMicroprocessor_ParametersAssignment_3_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getParametersAssignment_3_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutOSSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameters",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutOSSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMicroprocessorAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_2_3_0(); 
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
			case 0: return new MMicroprocessor_ParametersAssignment_3_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMicroprocessor_LeftCurlyBracketKeyword_3_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MMicroprocessor_RightCurlyBracketKeyword_3_2_4 extends KeywordToken  {
	
	public MMicroprocessor_RightCurlyBracketKeyword_3_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getRightCurlyBracketKeyword_3_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_ParametersAssignment_3_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MMicroprocessor_SemicolonKeyword_3_2_5 extends KeywordToken  {
	
	public MMicroprocessor_SemicolonKeyword_3_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_3_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_RightCurlyBracketKeyword_3_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MMicroprocessor_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MMicroprocessor_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_UnorderedGroup_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MMicroprocessor_SemicolonKeyword_5 extends KeywordToken  {
	
	public MMicroprocessor_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMicroprocessorAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMicroprocessor_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MMicroprocessor ****************/


/************ begin Rule MOperatingSystem ****************
 *
 * MOperatingSystem:
 * 	"os" name=ID ("inherits" inherits+=[MOperatingSystem|VersionedQualifiedName] (","
 * 	inherits+=[MOperatingSystem|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
 * 	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
 * 	& ("supported" "osapis" "{" supportedOSAPIs+=MOSSupportedOSAPI+ "}" ";")? & "supported" "platforms" "{"
 * 	supportedPlatforms+=MOSSupportedPlatform+ "}" ";" & ("configuration" "parameters" "{" parameters+=MParameter+ "}"
 * 	";")?) "}" ";";
 *
 **/

// "os" name=ID ("inherits" inherits+=[MOperatingSystem|VersionedQualifiedName] (","
// inherits+=[MOperatingSystem|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
// & ("supported" "osapis" "{" supportedOSAPIs+=MOSSupportedOSAPI+ "}" ";")? & "supported" "platforms" "{"
// supportedPlatforms+=MOSSupportedPlatform+ "}" ";" & ("configuration" "parameters" "{" parameters+=MParameter+ "}"
// ";")?) "}" ";"
protected class MOperatingSystem_Group extends GroupToken {
	
	public MOperatingSystem_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOperatingSystemRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "os"
protected class MOperatingSystem_OsKeyword_0 extends KeywordToken  {
	
	public MOperatingSystem_OsKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getOsKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MOperatingSystem_NameAssignment_1 extends AssignmentToken  {
	
	public MOperatingSystem_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_OsKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMOperatingSystemAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMOperatingSystemAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ("inherits" inherits+=[MOperatingSystem|VersionedQualifiedName] (","
// inherits+=[MOperatingSystem|VersionedQualifiedName])*)?
protected class MOperatingSystem_Group_2 extends GroupToken {
	
	public MOperatingSystem_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOperatingSystem_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "inherits"
protected class MOperatingSystem_InheritsKeyword_2_0 extends KeywordToken  {
	
	public MOperatingSystem_InheritsKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getInheritsKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MOperatingSystem|VersionedQualifiedName]
protected class MOperatingSystem_InheritsAssignment_2_1 extends AssignmentToken  {
	
	public MOperatingSystem_InheritsAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getInheritsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_InheritsKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemCrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemCrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MOperatingSystem|VersionedQualifiedName])*
protected class MOperatingSystem_Group_2_2 extends GroupToken {
	
	public MOperatingSystem_Group_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getGroup_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_InheritsAssignment_2_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MOperatingSystem_CommaKeyword_2_2_0 extends KeywordToken  {
	
	public MOperatingSystem_CommaKeyword_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getCommaKeyword_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOperatingSystem_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MOperatingSystem|VersionedQualifiedName]
protected class MOperatingSystem_InheritsAssignment_2_2_1 extends AssignmentToken  {
	
	public MOperatingSystem_InheritsAssignment_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getInheritsAssignment_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_CommaKeyword_2_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemCrossReference_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOperatingSystemAccess().getInheritsMOperatingSystemCrossReference_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MOperatingSystem_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MOperatingSystem_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOperatingSystem_NameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";" & ("supported" "osapis" "{"
// supportedOSAPIs+=MOSSupportedOSAPI+ "}" ";")? & "supported" "platforms" "{" supportedPlatforms+=MOSSupportedPlatform+
// "}" ";" & ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")?
protected class MOperatingSystem_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MOperatingSystem_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_Group_4_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOperatingSystem_Group_4_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MOperatingSystem_Group_4_0 extends GroupToken {
	
	public MOperatingSystem_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_SemicolonKeyword_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MOperatingSystem_VersionKeyword_4_0_0 extends KeywordToken  {
	
	public MOperatingSystem_VersionKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getVersionKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MOperatingSystem_ColonEqualsSignKeyword_4_0_1 extends KeywordToken  {
	
	public MOperatingSystem_ColonEqualsSignKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getColonEqualsSignKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_VersionKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MOperatingSystem_VersionAssignment_4_0_2 extends AssignmentToken  {
	
	public MOperatingSystem_VersionAssignment_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getVersionAssignment_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_ColonEqualsSignKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMOperatingSystemAccess().getVersionVersionParserRuleCall_4_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMOperatingSystemAccess().getVersionVersionParserRuleCall_4_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MOperatingSystem_SemicolonKeyword_4_0_3 extends KeywordToken  {
	
	public MOperatingSystem_SemicolonKeyword_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_VersionAssignment_4_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";"
protected class MOperatingSystem_Group_4_1 extends GroupToken {
	
	public MOperatingSystem_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_SemicolonKeyword_4_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "languages"
protected class MOperatingSystem_LanguagesKeyword_4_1_0 extends KeywordToken  {
	
	public MOperatingSystem_LanguagesKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getLanguagesKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MOperatingSystem_ColonEqualsSignKeyword_4_1_1 extends KeywordToken  {
	
	public MOperatingSystem_ColonEqualsSignKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getColonEqualsSignKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_LanguagesKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MOperatingSystem_LanguagesAssignment_4_1_2 extends AssignmentToken  {
	
	public MOperatingSystem_LanguagesAssignment_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getLanguagesAssignment_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_ColonEqualsSignKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageCrossReference_4_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageCrossReference_4_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MOperatingSystem_Group_4_1_3 extends GroupToken {
	
	public MOperatingSystem_Group_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getGroup_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_LanguagesAssignment_4_1_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MOperatingSystem_CommaKeyword_4_1_3_0 extends KeywordToken  {
	
	public MOperatingSystem_CommaKeyword_4_1_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getCommaKeyword_4_1_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_Group_4_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOperatingSystem_LanguagesAssignment_4_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MOperatingSystem_LanguagesAssignment_4_1_3_1 extends AssignmentToken  {
	
	public MOperatingSystem_LanguagesAssignment_4_1_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getLanguagesAssignment_4_1_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_CommaKeyword_4_1_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOperatingSystemAccess().getLanguagesMLanguageCrossReference_4_1_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MOperatingSystem_SemicolonKeyword_4_1_4 extends KeywordToken  {
	
	public MOperatingSystem_SemicolonKeyword_4_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_Group_4_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOperatingSystem_LanguagesAssignment_4_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("supported" "osapis" "{" supportedOSAPIs+=MOSSupportedOSAPI+ "}" ";")?
protected class MOperatingSystem_Group_4_2 extends GroupToken {
	
	public MOperatingSystem_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_SemicolonKeyword_4_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "supported"
protected class MOperatingSystem_SupportedKeyword_4_2_0 extends KeywordToken  {
	
	public MOperatingSystem_SupportedKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getSupportedKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "osapis"
protected class MOperatingSystem_OsapisKeyword_4_2_1 extends KeywordToken  {
	
	public MOperatingSystem_OsapisKeyword_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getOsapisKeyword_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_SupportedKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MOperatingSystem_LeftCurlyBracketKeyword_4_2_2 extends KeywordToken  {
	
	public MOperatingSystem_LeftCurlyBracketKeyword_4_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_4_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_OsapisKeyword_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedOSAPIs+=MOSSupportedOSAPI+
protected class MOperatingSystem_SupportedOSAPIsAssignment_4_2_3 extends AssignmentToken  {
	
	public MOperatingSystem_SupportedOSAPIsAssignment_4_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getSupportedOSAPIsAssignment_4_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPI_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedOSAPIs",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedOSAPIs");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedOSAPIRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMOperatingSystemAccess().getSupportedOSAPIsMOSSupportedOSAPIParserRuleCall_4_2_3_0(); 
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
			case 0: return new MOperatingSystem_SupportedOSAPIsAssignment_4_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MOperatingSystem_LeftCurlyBracketKeyword_4_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MOperatingSystem_RightCurlyBracketKeyword_4_2_4 extends KeywordToken  {
	
	public MOperatingSystem_RightCurlyBracketKeyword_4_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_4_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_SupportedOSAPIsAssignment_4_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MOperatingSystem_SemicolonKeyword_4_2_5 extends KeywordToken  {
	
	public MOperatingSystem_SemicolonKeyword_4_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_RightCurlyBracketKeyword_4_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "supported" "platforms" "{" supportedPlatforms+=MOSSupportedPlatform+ "}" ";"
protected class MOperatingSystem_Group_4_3 extends GroupToken {
	
	public MOperatingSystem_Group_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getGroup_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_SemicolonKeyword_4_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "supported"
protected class MOperatingSystem_SupportedKeyword_4_3_0 extends KeywordToken  {
	
	public MOperatingSystem_SupportedKeyword_4_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getSupportedKeyword_4_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOperatingSystem_Group_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "platforms"
protected class MOperatingSystem_PlatformsKeyword_4_3_1 extends KeywordToken  {
	
	public MOperatingSystem_PlatformsKeyword_4_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getPlatformsKeyword_4_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_SupportedKeyword_4_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MOperatingSystem_LeftCurlyBracketKeyword_4_3_2 extends KeywordToken  {
	
	public MOperatingSystem_LeftCurlyBracketKeyword_4_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_4_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_PlatformsKeyword_4_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedPlatforms+=MOSSupportedPlatform+
protected class MOperatingSystem_SupportedPlatformsAssignment_4_3_3 extends AssignmentToken  {
	
	public MOperatingSystem_SupportedPlatformsAssignment_4_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getSupportedPlatformsAssignment_4_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedPlatforms",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedPlatformRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMOperatingSystemAccess().getSupportedPlatformsMOSSupportedPlatformParserRuleCall_4_3_3_0(); 
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
			case 0: return new MOperatingSystem_SupportedPlatformsAssignment_4_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MOperatingSystem_LeftCurlyBracketKeyword_4_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MOperatingSystem_RightCurlyBracketKeyword_4_3_4 extends KeywordToken  {
	
	public MOperatingSystem_RightCurlyBracketKeyword_4_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_4_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_SupportedPlatformsAssignment_4_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MOperatingSystem_SemicolonKeyword_4_3_5 extends KeywordToken  {
	
	public MOperatingSystem_SemicolonKeyword_4_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_RightCurlyBracketKeyword_4_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")?
protected class MOperatingSystem_Group_4_4 extends GroupToken {
	
	public MOperatingSystem_Group_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getGroup_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_SemicolonKeyword_4_4_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MOperatingSystem_ConfigurationKeyword_4_4_0 extends KeywordToken  {
	
	public MOperatingSystem_ConfigurationKeyword_4_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getConfigurationKeyword_4_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_Group_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MOperatingSystem_ParametersKeyword_4_4_1 extends KeywordToken  {
	
	public MOperatingSystem_ParametersKeyword_4_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getParametersKeyword_4_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_ConfigurationKeyword_4_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MOperatingSystem_LeftCurlyBracketKeyword_4_4_2 extends KeywordToken  {
	
	public MOperatingSystem_LeftCurlyBracketKeyword_4_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getLeftCurlyBracketKeyword_4_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_ParametersKeyword_4_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameter+
protected class MOperatingSystem_ParametersAssignment_4_4_3 extends AssignmentToken  {
	
	public MOperatingSystem_ParametersAssignment_4_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getParametersAssignment_4_4_3();
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
		if((value = eObjectConsumer.getConsumable("parameters",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMOperatingSystemAccess().getParametersMParameterParserRuleCall_4_4_3_0(); 
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
			case 0: return new MOperatingSystem_ParametersAssignment_4_4_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MOperatingSystem_LeftCurlyBracketKeyword_4_4_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MOperatingSystem_RightCurlyBracketKeyword_4_4_4 extends KeywordToken  {
	
	public MOperatingSystem_RightCurlyBracketKeyword_4_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_4_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_ParametersAssignment_4_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MOperatingSystem_SemicolonKeyword_4_4_5 extends KeywordToken  {
	
	public MOperatingSystem_SemicolonKeyword_4_4_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_4_4_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_RightCurlyBracketKeyword_4_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MOperatingSystem_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MOperatingSystem_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MOperatingSystem_SemicolonKeyword_6 extends KeywordToken  {
	
	public MOperatingSystem_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystem_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MOperatingSystem ****************/


/************ begin Rule MOSSupportedOSAPI ****************
 *
 * MOSSupportedOSAPI:
 * 	"supports" osapi=[MOperatingSystemAPI|VersionedQualifiedName] "{" parameterValueAssignments+=MOSSupportedOSAPIPVA* "}"
 * 	";";
 *
 **/

// "supports" osapi=[MOperatingSystemAPI|VersionedQualifiedName] "{" parameterValueAssignments+=MOSSupportedOSAPIPVA* "}"
// ";"
protected class MOSSupportedOSAPI_Group extends GroupToken {
	
	public MOSSupportedOSAPI_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPI_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOSSupportedOSAPIRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "supports"
protected class MOSSupportedOSAPI_SupportsKeyword_0 extends KeywordToken  {
	
	public MOSSupportedOSAPI_SupportsKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIAccess().getSupportsKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// osapi=[MOperatingSystemAPI|VersionedQualifiedName]
protected class MOSSupportedOSAPI_OsapiAssignment_1 extends AssignmentToken  {
	
	public MOSSupportedOSAPI_OsapiAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIAccess().getOsapiAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPI_SupportsKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("osapi",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("osapi");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedOSAPIAccess().getOsapiMOperatingSystemAPICrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSupportedOSAPIAccess().getOsapiMOperatingSystemAPICrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "{"
protected class MOSSupportedOSAPI_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MOSSupportedOSAPI_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPI_OsapiAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValueAssignments+=MOSSupportedOSAPIPVA*
protected class MOSSupportedOSAPI_ParameterValueAssignmentsAssignment_3 extends AssignmentToken  {
	
	public MOSSupportedOSAPI_ParameterValueAssignmentsAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIAccess().getParameterValueAssignmentsAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVA_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameterValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameterValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedOSAPIPVARule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMOSSupportedOSAPIAccess().getParameterValueAssignmentsMOSSupportedOSAPIPVAParserRuleCall_3_0(); 
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
			case 0: return new MOSSupportedOSAPI_ParameterValueAssignmentsAssignment_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MOSSupportedOSAPI_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MOSSupportedOSAPI_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MOSSupportedOSAPI_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPI_ParameterValueAssignmentsAssignment_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSupportedOSAPI_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MOSSupportedOSAPI_SemicolonKeyword_5 extends KeywordToken  {
	
	public MOSSupportedOSAPI_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPI_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MOSSupportedOSAPI ****************/


/************ begin Rule MOSSupportedOSAPIPVA ****************
 *
 * MOSSupportedOSAPIPVA:
 * 	MOSSupportedOSAPIPVAExpression | MOSSupportedOSAPIPVASwitch;
 *
 **/

// MOSSupportedOSAPIPVAExpression | MOSSupportedOSAPIPVASwitch
protected class MOSSupportedOSAPIPVA_Alternatives extends AlternativesToken {

	public MOSSupportedOSAPIPVA_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVAAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVA_MOSSupportedOSAPIPVAExpressionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSupportedOSAPIPVA_MOSSupportedOSAPIPVASwitchParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOSSupportedOSAPIPVAExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMOSSupportedOSAPIPVASwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MOSSupportedOSAPIPVAExpression
protected class MOSSupportedOSAPIPVA_MOSSupportedOSAPIPVAExpressionParserRuleCall_0 extends RuleCallToken {
	
	public MOSSupportedOSAPIPVA_MOSSupportedOSAPIPVAExpressionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVAAccess().getMOSSupportedOSAPIPVAExpressionParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVAExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOSSupportedOSAPIPVAExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MOSSupportedOSAPIPVAExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MOSSupportedOSAPIPVASwitch
protected class MOSSupportedOSAPIPVA_MOSSupportedOSAPIPVASwitchParserRuleCall_1 extends RuleCallToken {
	
	public MOSSupportedOSAPIPVA_MOSSupportedOSAPIPVASwitchParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVAAccess().getMOSSupportedOSAPIPVASwitchParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOSSupportedOSAPIPVASwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MOSSupportedOSAPIPVASwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MOSSupportedOSAPIPVA ****************/


/************ begin Rule MOSSupportedOSAPIPVAExpression ****************
 *
 * MOSSupportedOSAPIPVAExpression:
 * 	"parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":="
 * 	parameterValue=MParameterValueExpression ";";
 *
 **/

// "parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" parameterValue=MParameterValueExpression
// ";"
protected class MOSSupportedOSAPIPVAExpression_Group extends GroupToken {
	
	public MOSSupportedOSAPIPVAExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVAExpression_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOSSupportedOSAPIPVAExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "parameter"
protected class MOSSupportedOSAPIPVAExpression_ParameterKeyword_0 extends KeywordToken  {
	
	public MOSSupportedOSAPIPVAExpression_ParameterKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// parameter=[common::MParameter|VersionedQualifiedReferenceName]
protected class MOSSupportedOSAPIPVAExpression_ParameterAssignment_1 extends AssignmentToken  {
	
	public MOSSupportedOSAPIPVAExpression_ParameterAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVAExpression_ParameterKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameter",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameter");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterMParameterCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterMParameterCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":="
protected class MOSSupportedOSAPIPVAExpression_ColonEqualsSignKeyword_2 extends KeywordToken  {
	
	public MOSSupportedOSAPIPVAExpression_ColonEqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getColonEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVAExpression_ParameterAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValue=MParameterValueExpression
protected class MOSSupportedOSAPIPVAExpression_ParameterValueAssignment_3 extends AssignmentToken  {
	
	public MOSSupportedOSAPIPVAExpression_ParameterValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterValueAssignment_3();
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
				element = grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MOSSupportedOSAPIPVAExpression_ColonEqualsSignKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MOSSupportedOSAPIPVAExpression_SemicolonKeyword_4 extends KeywordToken  {
	
	public MOSSupportedOSAPIPVAExpression_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVAExpressionAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVAExpression_ParameterValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MOSSupportedOSAPIPVAExpression ****************/


/************ begin Rule MOSSupportedOSAPIPVASwitch ****************
 *
 * MOSSupportedOSAPIPVASwitch:
 * 	"switch" "(" parameter=[common::MParameter|VersionedQualifiedReferenceName] ")" "{"
 * 	cases+=MOSSupportedOSAPIPVASwitchCase "}" ";";
 *
 **/

// "switch" "(" parameter=[common::MParameter|VersionedQualifiedReferenceName] ")" "{"
// cases+=MOSSupportedOSAPIPVASwitchCase "}" ";"
protected class MOSSupportedOSAPIPVASwitch_Group extends GroupToken {
	
	public MOSSupportedOSAPIPVASwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitch_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOSSupportedOSAPIPVASwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "switch"
protected class MOSSupportedOSAPIPVASwitch_SwitchKeyword_0 extends KeywordToken  {
	
	public MOSSupportedOSAPIPVASwitch_SwitchKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getSwitchKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// "("
protected class MOSSupportedOSAPIPVASwitch_LeftParenthesisKeyword_1 extends KeywordToken  {
	
	public MOSSupportedOSAPIPVASwitch_LeftParenthesisKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getLeftParenthesisKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitch_SwitchKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameter=[common::MParameter|VersionedQualifiedReferenceName]
protected class MOSSupportedOSAPIPVASwitch_ParameterAssignment_2 extends AssignmentToken  {
	
	public MOSSupportedOSAPIPVASwitch_ParameterAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getParameterAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitch_LeftParenthesisKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameter",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameter");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getParameterMParameterCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getParameterMParameterCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ")"
protected class MOSSupportedOSAPIPVASwitch_RightParenthesisKeyword_3 extends KeywordToken  {
	
	public MOSSupportedOSAPIPVASwitch_RightParenthesisKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getRightParenthesisKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitch_ParameterAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MOSSupportedOSAPIPVASwitch_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MOSSupportedOSAPIPVASwitch_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitch_RightParenthesisKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MOSSupportedOSAPIPVASwitchCase
protected class MOSSupportedOSAPIPVASwitch_CasesAssignment_5 extends AssignmentToken  {
	
	public MOSSupportedOSAPIPVASwitch_CasesAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getCasesAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getCasesMOSSupportedOSAPIPVASwitchCaseParserRuleCall_5_0(); 
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
			case 0: return new MOSSupportedOSAPIPVASwitch_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MOSSupportedOSAPIPVASwitch_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MOSSupportedOSAPIPVASwitch_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitch_CasesAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MOSSupportedOSAPIPVASwitch_SemicolonKeyword_7 extends KeywordToken  {
	
	public MOSSupportedOSAPIPVASwitch_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitch_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MOSSupportedOSAPIPVASwitch ****************/


/************ begin Rule MOSSupportedOSAPIPVASwitchCase ****************
 *
 * MOSSupportedOSAPIPVASwitchCase:
 * 	"case" platform=[MOSSupportedPlatform] ":" parameterValue=MParameterValueExpression ";";
 *
 **/

// "case" platform=[MOSSupportedPlatform] ":" parameterValue=MParameterValueExpression ";"
protected class MOSSupportedOSAPIPVASwitchCase_Group extends GroupToken {
	
	public MOSSupportedOSAPIPVASwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitchCase_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOSSupportedOSAPIPVASwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MOSSupportedOSAPIPVASwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MOSSupportedOSAPIPVASwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MOSSupportedPlatform]
protected class MOSSupportedOSAPIPVASwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MOSSupportedOSAPIPVASwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MOSSupportedOSAPIPVASwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MOSSupportedOSAPIPVASwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValue=MParameterValueExpression
protected class MOSSupportedOSAPIPVASwitchCase_ParameterValueAssignment_3 extends AssignmentToken  {
	
	public MOSSupportedOSAPIPVASwitchCase_ParameterValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getParameterValueAssignment_3();
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
				element = grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MOSSupportedOSAPIPVASwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MOSSupportedOSAPIPVASwitchCase_SemicolonKeyword_4 extends KeywordToken  {
	
	public MOSSupportedOSAPIPVASwitchCase_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedOSAPIPVASwitchCaseAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedOSAPIPVASwitchCase_ParameterValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MOSSupportedOSAPIPVASwitchCase ****************/


/************ begin Rule MParameter ****************
 *
 * MParameter returns common::MParameter:
 * 	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
 * 	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition | MBooleanParamOSSPSwitch
 * 	| MStringParamOSSPSwitch | MIntegerParamOSSPSwitch | MRealParamOSSPSwitch | MEnumParamOSSPSwitch;
 *
 **/

// MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
// MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition | MBooleanParamOSSPSwitch
// | MStringParamOSSPSwitch | MIntegerParamOSSPSwitch | MRealParamOSSPSwitch | MEnumParamOSSPSwitch
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
			case 6: return new MParameter_MBooleanParamOSSPSwitchParserRuleCall_6(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MParameter_MStringParamOSSPSwitchParserRuleCall_7(lastRuleCallOrigin, this, 7, inst);
			case 8: return new MParameter_MIntegerParamOSSPSwitchParserRuleCall_8(lastRuleCallOrigin, this, 8, inst);
			case 9: return new MParameter_MRealParamOSSPSwitchParserRuleCall_9(lastRuleCallOrigin, this, 9, inst);
			case 10: return new MParameter_MEnumParamOSSPSwitchParserRuleCall_10(lastRuleCallOrigin, this, 10, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParamOSSPSwitchRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMBooleanParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParamOSSPSwitchRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMIntegerParamOSSPSwitchRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMIntegerParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMRealParamOSSPSwitchRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMRealParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMStringParamOSSPSwitchRule().getType().getClassifier() && 
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
		if(getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionRule().getType().getClassifier())
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

// MBooleanParamOSSPSwitch
protected class MParameter_MBooleanParamOSSPSwitchParserRuleCall_6 extends RuleCallToken {
	
	public MParameter_MBooleanParamOSSPSwitchParserRuleCall_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMBooleanParamOSSPSwitchParserRuleCall_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParamOSSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MBooleanParamOSSPSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MStringParamOSSPSwitch
protected class MParameter_MStringParamOSSPSwitchParserRuleCall_7 extends RuleCallToken {
	
	public MParameter_MStringParamOSSPSwitchParserRuleCall_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMStringParamOSSPSwitchParserRuleCall_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParamOSSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MStringParamOSSPSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MIntegerParamOSSPSwitch
protected class MParameter_MIntegerParamOSSPSwitchParserRuleCall_8 extends RuleCallToken {
	
	public MParameter_MIntegerParamOSSPSwitchParserRuleCall_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMIntegerParamOSSPSwitchParserRuleCall_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParamOSSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MIntegerParamOSSPSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MRealParamOSSPSwitch
protected class MParameter_MRealParamOSSPSwitchParserRuleCall_9 extends RuleCallToken {
	
	public MParameter_MRealParamOSSPSwitchParserRuleCall_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMRealParamOSSPSwitchParserRuleCall_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParamOSSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MRealParamOSSPSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParamOSSPSwitch
protected class MParameter_MEnumParamOSSPSwitchParserRuleCall_10 extends RuleCallToken {
	
	public MParameter_MEnumParamOSSPSwitchParserRuleCall_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMEnumParamOSSPSwitchParserRuleCall_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamOSSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParamOSSPSwitch_Group.class, eObjectConsumer)) return null;
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


/************ begin Rule MBooleanParamOSSPSwitch ****************
 *
 * MBooleanParamOSSPSwitch:
 * 	constant?="const"? "boolean" name=ID ":=" "switch" "{" cases+=MBooleanParamOSSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "boolean" name=ID ":=" "switch" "{" cases+=MBooleanParamOSSPSwitchCase+ "}" ";"
protected class MBooleanParamOSSPSwitch_Group extends GroupToken {
	
	public MBooleanParamOSSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitch_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParamOSSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MBooleanParamOSSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MBooleanParamOSSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMBooleanParamOSSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "boolean"
protected class MBooleanParamOSSPSwitch_BooleanKeyword_1 extends KeywordToken  {
	
	public MBooleanParamOSSPSwitch_BooleanKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchAccess().getBooleanKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MBooleanParamOSSPSwitch_NameAssignment_2 extends AssignmentToken  {
	
	public MBooleanParamOSSPSwitch_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitch_BooleanKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMBooleanParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMBooleanParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MBooleanParamOSSPSwitch_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MBooleanParamOSSPSwitch_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitch_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MBooleanParamOSSPSwitch_SwitchKeyword_4 extends KeywordToken  {
	
	public MBooleanParamOSSPSwitch_SwitchKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchAccess().getSwitchKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitch_ColonEqualsSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MBooleanParamOSSPSwitch_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MBooleanParamOSSPSwitch_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitch_SwitchKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MBooleanParamOSSPSwitchCase+
protected class MBooleanParamOSSPSwitch_CasesAssignment_6 extends AssignmentToken  {
	
	public MBooleanParamOSSPSwitch_CasesAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchAccess().getCasesAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMBooleanParamOSSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMBooleanParamOSSPSwitchAccess().getCasesMBooleanParamOSSPSwitchCaseParserRuleCall_6_0(); 
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
			case 0: return new MBooleanParamOSSPSwitch_CasesAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MBooleanParamOSSPSwitch_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MBooleanParamOSSPSwitch_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MBooleanParamOSSPSwitch_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitch_CasesAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MBooleanParamOSSPSwitch_SemicolonKeyword_8 extends KeywordToken  {
	
	public MBooleanParamOSSPSwitch_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitch_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MBooleanParamOSSPSwitch ****************/


/************ begin Rule MBooleanParamOSSPSwitchCase ****************
 *
 * MBooleanParamOSSPSwitchCase:
 * 	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
 *
 **/

// "case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
protected class MBooleanParamOSSPSwitchCase_Group extends GroupToken {
	
	public MBooleanParamOSSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitchCase_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParamOSSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MBooleanParamOSSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MBooleanParamOSSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MOSSupportedPlatform]
protected class MBooleanParamOSSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MBooleanParamOSSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MBooleanParamOSSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MBooleanParamOSSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MBooleanParamOSSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MBooleanParamOSSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MBooleanParamOSSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MBooleanParamOSSPSwitchCase_SemicolonKeyword_4 extends KeywordToken  {
	
	public MBooleanParamOSSPSwitchCase_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamOSSPSwitchCaseAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamOSSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MBooleanParamOSSPSwitchCase ****************/


/************ begin Rule MStringParamOSSPSwitch ****************
 *
 * MStringParamOSSPSwitch:
 * 	constant?="const"? "string" name=ID ":=" "switch" "{" cases+=MStringParamOSSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "string" name=ID ":=" "switch" "{" cases+=MStringParamOSSPSwitchCase+ "}" ";"
protected class MStringParamOSSPSwitch_Group extends GroupToken {
	
	public MStringParamOSSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitch_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParamOSSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MStringParamOSSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MStringParamOSSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMStringParamOSSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "string"
protected class MStringParamOSSPSwitch_StringKeyword_1 extends KeywordToken  {
	
	public MStringParamOSSPSwitch_StringKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchAccess().getStringKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MStringParamOSSPSwitch_NameAssignment_2 extends AssignmentToken  {
	
	public MStringParamOSSPSwitch_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitch_StringKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMStringParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMStringParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MStringParamOSSPSwitch_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MStringParamOSSPSwitch_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitch_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MStringParamOSSPSwitch_SwitchKeyword_4 extends KeywordToken  {
	
	public MStringParamOSSPSwitch_SwitchKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchAccess().getSwitchKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitch_ColonEqualsSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MStringParamOSSPSwitch_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MStringParamOSSPSwitch_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitch_SwitchKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MStringParamOSSPSwitchCase+
protected class MStringParamOSSPSwitch_CasesAssignment_6 extends AssignmentToken  {
	
	public MStringParamOSSPSwitch_CasesAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchAccess().getCasesAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMStringParamOSSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMStringParamOSSPSwitchAccess().getCasesMStringParamOSSPSwitchCaseParserRuleCall_6_0(); 
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
			case 0: return new MStringParamOSSPSwitch_CasesAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MStringParamOSSPSwitch_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MStringParamOSSPSwitch_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MStringParamOSSPSwitch_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitch_CasesAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MStringParamOSSPSwitch_SemicolonKeyword_8 extends KeywordToken  {
	
	public MStringParamOSSPSwitch_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitch_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MStringParamOSSPSwitch ****************/


/************ begin Rule MStringParamOSSPSwitchCase ****************
 *
 * MStringParamOSSPSwitchCase:
 * 	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
 *
 **/

// "case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
protected class MStringParamOSSPSwitchCase_Group extends GroupToken {
	
	public MStringParamOSSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitchCase_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParamOSSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MStringParamOSSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MStringParamOSSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MOSSupportedPlatform]
protected class MStringParamOSSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MStringParamOSSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMStringParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMStringParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MStringParamOSSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MStringParamOSSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MStringParamOSSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MStringParamOSSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMStringParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MStringParamOSSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MStringParamOSSPSwitchCase_SemicolonKeyword_4 extends KeywordToken  {
	
	public MStringParamOSSPSwitchCase_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamOSSPSwitchCaseAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamOSSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MStringParamOSSPSwitchCase ****************/


/************ begin Rule MIntegerParamOSSPSwitch ****************
 *
 * MIntegerParamOSSPSwitch:
 * 	constant?="const"? "integer" name=ID ":=" "switch" "{" cases+=MIntegerParamOSSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "integer" name=ID ":=" "switch" "{" cases+=MIntegerParamOSSPSwitchCase+ "}" ";"
protected class MIntegerParamOSSPSwitch_Group extends GroupToken {
	
	public MIntegerParamOSSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitch_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParamOSSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MIntegerParamOSSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MIntegerParamOSSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMIntegerParamOSSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "integer"
protected class MIntegerParamOSSPSwitch_IntegerKeyword_1 extends KeywordToken  {
	
	public MIntegerParamOSSPSwitch_IntegerKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchAccess().getIntegerKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MIntegerParamOSSPSwitch_NameAssignment_2 extends AssignmentToken  {
	
	public MIntegerParamOSSPSwitch_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitch_IntegerKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMIntegerParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMIntegerParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MIntegerParamOSSPSwitch_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MIntegerParamOSSPSwitch_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitch_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MIntegerParamOSSPSwitch_SwitchKeyword_4 extends KeywordToken  {
	
	public MIntegerParamOSSPSwitch_SwitchKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchAccess().getSwitchKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitch_ColonEqualsSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MIntegerParamOSSPSwitch_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MIntegerParamOSSPSwitch_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitch_SwitchKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MIntegerParamOSSPSwitchCase+
protected class MIntegerParamOSSPSwitch_CasesAssignment_6 extends AssignmentToken  {
	
	public MIntegerParamOSSPSwitch_CasesAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchAccess().getCasesAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIntegerParamOSSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIntegerParamOSSPSwitchAccess().getCasesMIntegerParamOSSPSwitchCaseParserRuleCall_6_0(); 
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
			case 0: return new MIntegerParamOSSPSwitch_CasesAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIntegerParamOSSPSwitch_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MIntegerParamOSSPSwitch_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MIntegerParamOSSPSwitch_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitch_CasesAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MIntegerParamOSSPSwitch_SemicolonKeyword_8 extends KeywordToken  {
	
	public MIntegerParamOSSPSwitch_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitch_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIntegerParamOSSPSwitch ****************/


/************ begin Rule MIntegerParamOSSPSwitchCase ****************
 *
 * MIntegerParamOSSPSwitchCase:
 * 	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range" range=MParameterRange)?
 * 	";";
 *
 **/

// "case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";"
protected class MIntegerParamOSSPSwitchCase_Group extends GroupToken {
	
	public MIntegerParamOSSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitchCase_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParamOSSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MIntegerParamOSSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MIntegerParamOSSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MOSSupportedPlatform]
protected class MIntegerParamOSSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MIntegerParamOSSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MIntegerParamOSSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MIntegerParamOSSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MIntegerParamOSSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MIntegerParamOSSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MIntegerParamOSSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("range" range=MParameterRange)?
protected class MIntegerParamOSSPSwitchCase_Group_4 extends GroupToken {
	
	public MIntegerParamOSSPSwitchCase_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitchCase_RangeAssignment_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "range"
protected class MIntegerParamOSSPSwitchCase_RangeKeyword_4_0 extends KeywordToken  {
	
	public MIntegerParamOSSPSwitchCase_RangeKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getRangeKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// range=MParameterRange
protected class MIntegerParamOSSPSwitchCase_RangeAssignment_4_1 extends AssignmentToken  {
	
	public MIntegerParamOSSPSwitchCase_RangeAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getRangeAssignment_4_1();
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
				element = grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0(); 
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
			case 0: return new MIntegerParamOSSPSwitchCase_RangeKeyword_4_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ";"
protected class MIntegerParamOSSPSwitchCase_SemicolonKeyword_5 extends KeywordToken  {
	
	public MIntegerParamOSSPSwitchCase_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamOSSPSwitchCaseAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamOSSPSwitchCase_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIntegerParamOSSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIntegerParamOSSPSwitchCase ****************/


/************ begin Rule MRealParamOSSPSwitch ****************
 *
 * MRealParamOSSPSwitch:
 * 	constant?="const"? "real" name=ID ":=" "switch" "{" cases+=MRealParamOSSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "real" name=ID ":=" "switch" "{" cases+=MRealParamOSSPSwitchCase+ "}" ";"
protected class MRealParamOSSPSwitch_Group extends GroupToken {
	
	public MRealParamOSSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitch_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParamOSSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MRealParamOSSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MRealParamOSSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMRealParamOSSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "real"
protected class MRealParamOSSPSwitch_RealKeyword_1 extends KeywordToken  {
	
	public MRealParamOSSPSwitch_RealKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchAccess().getRealKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MRealParamOSSPSwitch_NameAssignment_2 extends AssignmentToken  {
	
	public MRealParamOSSPSwitch_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitch_RealKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMRealParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMRealParamOSSPSwitchAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MRealParamOSSPSwitch_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MRealParamOSSPSwitch_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitch_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MRealParamOSSPSwitch_SwitchKeyword_4 extends KeywordToken  {
	
	public MRealParamOSSPSwitch_SwitchKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchAccess().getSwitchKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitch_ColonEqualsSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MRealParamOSSPSwitch_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MRealParamOSSPSwitch_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitch_SwitchKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MRealParamOSSPSwitchCase+
protected class MRealParamOSSPSwitch_CasesAssignment_6 extends AssignmentToken  {
	
	public MRealParamOSSPSwitch_CasesAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchAccess().getCasesAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMRealParamOSSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMRealParamOSSPSwitchAccess().getCasesMRealParamOSSPSwitchCaseParserRuleCall_6_0(); 
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
			case 0: return new MRealParamOSSPSwitch_CasesAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MRealParamOSSPSwitch_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MRealParamOSSPSwitch_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MRealParamOSSPSwitch_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitch_CasesAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MRealParamOSSPSwitch_SemicolonKeyword_8 extends KeywordToken  {
	
	public MRealParamOSSPSwitch_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitch_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MRealParamOSSPSwitch ****************/


/************ begin Rule MRealParamOSSPSwitchCase ****************
 *
 * MRealParamOSSPSwitchCase:
 * 	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range" range=MParameterRange)?
 * 	";";
 *
 **/

// "case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range" range=MParameterRange)? ";"
protected class MRealParamOSSPSwitchCase_Group extends GroupToken {
	
	public MRealParamOSSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitchCase_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParamOSSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MRealParamOSSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MRealParamOSSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MOSSupportedPlatform]
protected class MRealParamOSSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MRealParamOSSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMRealParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMRealParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MRealParamOSSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MRealParamOSSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MRealParamOSSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MRealParamOSSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMRealParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MRealParamOSSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("range" range=MParameterRange)?
protected class MRealParamOSSPSwitchCase_Group_4 extends GroupToken {
	
	public MRealParamOSSPSwitchCase_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchCaseAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitchCase_RangeAssignment_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "range"
protected class MRealParamOSSPSwitchCase_RangeKeyword_4_0 extends KeywordToken  {
	
	public MRealParamOSSPSwitchCase_RangeKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchCaseAccess().getRangeKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// range=MParameterRange
protected class MRealParamOSSPSwitchCase_RangeAssignment_4_1 extends AssignmentToken  {
	
	public MRealParamOSSPSwitchCase_RangeAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchCaseAccess().getRangeAssignment_4_1();
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
				element = grammarAccess.getMRealParamOSSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0(); 
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
			case 0: return new MRealParamOSSPSwitchCase_RangeKeyword_4_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ";"
protected class MRealParamOSSPSwitchCase_SemicolonKeyword_5 extends KeywordToken  {
	
	public MRealParamOSSPSwitchCase_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamOSSPSwitchCaseAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamOSSPSwitchCase_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MRealParamOSSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule MRealParamOSSPSwitchCase ****************/


/************ begin Rule MEnumParamOSSPSwitch ****************
 *
 * MEnumParamOSSPSwitch:
 * 	constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
 * 	":=" "switch" "{" cases+=MEnumParamOSSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID ":="
// "switch" "{" cases+=MEnumParamOSSPSwitchCase+ "}" ";"
protected class MEnumParamOSSPSwitch_Group extends GroupToken {
	
	public MEnumParamOSSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitch_SemicolonKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamOSSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MEnumParamOSSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MEnumParamOSSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMEnumParamOSSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "enum"
protected class MEnumParamOSSPSwitch_EnumKeyword_1 extends KeywordToken  {
	
	public MEnumParamOSSPSwitch_EnumKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName]
protected class MEnumParamOSSPSwitch_EnumDefinitionAssignment_2 extends AssignmentToken  {
	
	public MEnumParamOSSPSwitch_EnumDefinitionAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumDefinitionAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitch_EnumKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("enumDefinition",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("enumDefinition");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMEnumParamOSSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MEnumParamOSSPSwitch_NameAssignment_3 extends AssignmentToken  {
	
	public MEnumParamOSSPSwitch_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitch_EnumDefinitionAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamOSSPSwitchAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParamOSSPSwitchAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MEnumParamOSSPSwitch_ColonEqualsSignKeyword_4 extends KeywordToken  {
	
	public MEnumParamOSSPSwitch_ColonEqualsSignKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchAccess().getColonEqualsSignKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitch_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MEnumParamOSSPSwitch_SwitchKeyword_5 extends KeywordToken  {
	
	public MEnumParamOSSPSwitch_SwitchKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchAccess().getSwitchKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitch_ColonEqualsSignKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MEnumParamOSSPSwitch_LeftCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MEnumParamOSSPSwitch_LeftCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchAccess().getLeftCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitch_SwitchKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MEnumParamOSSPSwitchCase+
protected class MEnumParamOSSPSwitch_CasesAssignment_7 extends AssignmentToken  {
	
	public MEnumParamOSSPSwitch_CasesAssignment_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchAccess().getCasesAssignment_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParamOSSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMEnumParamOSSPSwitchAccess().getCasesMEnumParamOSSPSwitchCaseParserRuleCall_7_0(); 
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
			case 0: return new MEnumParamOSSPSwitch_CasesAssignment_7(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MEnumParamOSSPSwitch_LeftCurlyBracketKeyword_6(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MEnumParamOSSPSwitch_RightCurlyBracketKeyword_8 extends KeywordToken  {
	
	public MEnumParamOSSPSwitch_RightCurlyBracketKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchAccess().getRightCurlyBracketKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitch_CasesAssignment_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MEnumParamOSSPSwitch_SemicolonKeyword_9 extends KeywordToken  {
	
	public MEnumParamOSSPSwitch_SemicolonKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchAccess().getSemicolonKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitch_RightCurlyBracketKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MEnumParamOSSPSwitch ****************/


/************ begin Rule MEnumParamOSSPSwitchCase ****************
 *
 * MEnumParamOSSPSwitchCase:
 * 	"case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
 *
 **/

// "case" platform=[MOSSupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
protected class MEnumParamOSSPSwitchCase_Group extends GroupToken {
	
	public MEnumParamOSSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitchCase_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamOSSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MEnumParamOSSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MEnumParamOSSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MOSSupportedPlatform]
protected class MEnumParamOSSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MEnumParamOSSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getPlatformMOSSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MEnumParamOSSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MEnumParamOSSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MEnumParamOSSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MEnumParamOSSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MEnumParamOSSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MEnumParamOSSPSwitchCase_SemicolonKeyword_4 extends KeywordToken  {
	
	public MEnumParamOSSPSwitchCase_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamOSSPSwitchCaseAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamOSSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MEnumParamOSSPSwitchCase ****************/


/************ begin Rule MParameterWithoutOSSP ****************
 *
 * MParameterWithoutOSSP returns common::MParameter:
 * 	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
 * 	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition;
 *
 **/

// MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
// MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition
protected class MParameterWithoutOSSP_Alternatives extends AlternativesToken {

	public MParameterWithoutOSSP_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMParameterWithoutOSSPAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutOSSP_MIntegerParameterSingleExpressionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterWithoutOSSP_MEnumParameterSingleExpressionParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MParameterWithoutOSSP_MBooleanParameterSingleExpressionParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MParameterWithoutOSSP_MRealParameterSingleExpressionParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MParameterWithoutOSSP_MStringParameterSingleExpressionParserRuleCall_4(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MParameterWithoutOSSP_MEnumParameterDefinitionParserRuleCall_5(lastRuleCallOrigin, this, 5, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMIntegerParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMRealParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMStringParameterSingleExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MIntegerParameterSingleExpression
protected class MParameterWithoutOSSP_MIntegerParameterSingleExpressionParserRuleCall_0 extends RuleCallToken {
	
	public MParameterWithoutOSSP_MIntegerParameterSingleExpressionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutOSSPAccess().getMIntegerParameterSingleExpressionParserRuleCall_0();
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
protected class MParameterWithoutOSSP_MEnumParameterSingleExpressionParserRuleCall_1 extends RuleCallToken {
	
	public MParameterWithoutOSSP_MEnumParameterSingleExpressionParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutOSSPAccess().getMEnumParameterSingleExpressionParserRuleCall_1();
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
protected class MParameterWithoutOSSP_MBooleanParameterSingleExpressionParserRuleCall_2 extends RuleCallToken {
	
	public MParameterWithoutOSSP_MBooleanParameterSingleExpressionParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutOSSPAccess().getMBooleanParameterSingleExpressionParserRuleCall_2();
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
protected class MParameterWithoutOSSP_MRealParameterSingleExpressionParserRuleCall_3 extends RuleCallToken {
	
	public MParameterWithoutOSSP_MRealParameterSingleExpressionParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutOSSPAccess().getMRealParameterSingleExpressionParserRuleCall_3();
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
protected class MParameterWithoutOSSP_MStringParameterSingleExpressionParserRuleCall_4 extends RuleCallToken {
	
	public MParameterWithoutOSSP_MStringParameterSingleExpressionParserRuleCall_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutOSSPAccess().getMStringParameterSingleExpressionParserRuleCall_4();
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
protected class MParameterWithoutOSSP_MEnumParameterDefinitionParserRuleCall_5 extends RuleCallToken {
	
	public MParameterWithoutOSSP_MEnumParameterDefinitionParserRuleCall_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutOSSPAccess().getMEnumParameterDefinitionParserRuleCall_5();
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
		if(getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionRule().getType().getClassifier())
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


/************ end Rule MParameterWithoutOSSP ****************/


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
 * 	"enum" name=ID "{" literals+=MEnumParameterLiteralRule ("," literals+=MEnumParameterLiteralRule)* "}" ";";
 *
 **/

// "enum" name=ID "{" literals+=MEnumParameterLiteralRule ("," literals+=MEnumParameterLiteralRule)* "}" ";"
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
			case 0: return new MEnumParameterDefinition_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "enum"
protected class MEnumParameterDefinition_EnumKeyword_0 extends KeywordToken  {
	
	public MEnumParameterDefinition_EnumKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getEnumKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MEnumParameterDefinition_NameAssignment_1 extends AssignmentToken  {
	
	public MEnumParameterDefinition_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_EnumKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MEnumParameterDefinition_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MEnumParameterDefinition_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// literals+=MEnumParameterLiteralRule
protected class MEnumParameterDefinition_LiteralsAssignment_3 extends AssignmentToken  {
	
	public MEnumParameterDefinition_LiteralsAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_3();
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
				element = grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_3_0(); 
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
			case 0: return new MEnumParameterDefinition_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("," literals+=MEnumParameterLiteralRule)*
protected class MEnumParameterDefinition_Group_4 extends GroupToken {
	
	public MEnumParameterDefinition_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_LiteralsAssignment_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MEnumParameterDefinition_CommaKeyword_4_0 extends KeywordToken  {
	
	public MEnumParameterDefinition_CommaKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getCommaKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MEnumParameterDefinition_LiteralsAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// literals+=MEnumParameterLiteralRule
protected class MEnumParameterDefinition_LiteralsAssignment_4_1 extends AssignmentToken  {
	
	public MEnumParameterDefinition_LiteralsAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsAssignment_4_1();
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
				element = grammarAccess.getMEnumParameterDefinitionAccess().getLiteralsMEnumParameterLiteralRuleParserRuleCall_4_1_0(); 
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
			case 0: return new MEnumParameterDefinition_CommaKeyword_4_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// "}"
protected class MEnumParameterDefinition_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MEnumParameterDefinition_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MEnumParameterDefinition_LiteralsAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MEnumParameterDefinition_SemicolonKeyword_6 extends KeywordToken  {
	
	public MEnumParameterDefinition_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParameterDefinitionAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParameterDefinition_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
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


/************ begin Rule MOperatingSystemAPI ****************
 *
 * MOperatingSystemAPI:
 * 	"osapi" name=ID ("inherits" inherits+=[MOperatingSystemAPI|VersionedQualifiedName] (","
 * 	inherits+=[MOperatingSystemAPI|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "language" ":="
 * 	language=[system::MLanguage|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
 * 	parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
 *
 **/

// "osapi" name=ID ("inherits" inherits+=[MOperatingSystemAPI|VersionedQualifiedName] (","
// inherits+=[MOperatingSystemAPI|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "language" ":="
// language=[system::MLanguage|VersionedQualifiedName] ";" & ("configuration" "parameters" "{"
// parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
protected class MOperatingSystemAPI_Group extends GroupToken {
	
	public MOperatingSystemAPI_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOperatingSystemAPIRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "osapi"
protected class MOperatingSystemAPI_OsapiKeyword_0 extends KeywordToken  {
	
	public MOperatingSystemAPI_OsapiKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getOsapiKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MOperatingSystemAPI_NameAssignment_1 extends AssignmentToken  {
	
	public MOperatingSystemAPI_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_OsapiKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMOperatingSystemAPIAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMOperatingSystemAPIAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ("inherits" inherits+=[MOperatingSystemAPI|VersionedQualifiedName] (","
// inherits+=[MOperatingSystemAPI|VersionedQualifiedName])*)?
protected class MOperatingSystemAPI_Group_2 extends GroupToken {
	
	public MOperatingSystemAPI_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOperatingSystemAPI_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "inherits"
protected class MOperatingSystemAPI_InheritsKeyword_2_0 extends KeywordToken  {
	
	public MOperatingSystemAPI_InheritsKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getInheritsKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MOperatingSystemAPI|VersionedQualifiedName]
protected class MOperatingSystemAPI_InheritsAssignment_2_1 extends AssignmentToken  {
	
	public MOperatingSystemAPI_InheritsAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getInheritsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_InheritsKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPICrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPICrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MOperatingSystemAPI|VersionedQualifiedName])*
protected class MOperatingSystemAPI_Group_2_2 extends GroupToken {
	
	public MOperatingSystemAPI_Group_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getGroup_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_InheritsAssignment_2_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MOperatingSystemAPI_CommaKeyword_2_2_0 extends KeywordToken  {
	
	public MOperatingSystemAPI_CommaKeyword_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getCommaKeyword_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOperatingSystemAPI_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MOperatingSystemAPI|VersionedQualifiedName]
protected class MOperatingSystemAPI_InheritsAssignment_2_2_1 extends AssignmentToken  {
	
	public MOperatingSystemAPI_InheritsAssignment_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getInheritsAssignment_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_CommaKeyword_2_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPICrossReference_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOperatingSystemAPIAccess().getInheritsMOperatingSystemAPICrossReference_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MOperatingSystemAPI_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MOperatingSystemAPI_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOperatingSystemAPI_NameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & "language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";" &
// ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MOperatingSystemAPI_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MOperatingSystemAPI_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOperatingSystemAPI_Group_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MOperatingSystemAPI_Group_4_0 extends GroupToken {
	
	public MOperatingSystemAPI_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_SemicolonKeyword_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MOperatingSystemAPI_VersionKeyword_4_0_0 extends KeywordToken  {
	
	public MOperatingSystemAPI_VersionKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getVersionKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MOperatingSystemAPI_ColonEqualsSignKeyword_4_0_1 extends KeywordToken  {
	
	public MOperatingSystemAPI_ColonEqualsSignKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getColonEqualsSignKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_VersionKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MOperatingSystemAPI_VersionAssignment_4_0_2 extends AssignmentToken  {
	
	public MOperatingSystemAPI_VersionAssignment_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getVersionAssignment_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_ColonEqualsSignKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMOperatingSystemAPIAccess().getVersionVersionParserRuleCall_4_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMOperatingSystemAPIAccess().getVersionVersionParserRuleCall_4_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MOperatingSystemAPI_SemicolonKeyword_4_0_3 extends KeywordToken  {
	
	public MOperatingSystemAPI_SemicolonKeyword_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_VersionAssignment_4_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "language" ":=" language=[system::MLanguage|VersionedQualifiedName] ";"
protected class MOperatingSystemAPI_Group_4_1 extends GroupToken {
	
	public MOperatingSystemAPI_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_SemicolonKeyword_4_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "language"
protected class MOperatingSystemAPI_LanguageKeyword_4_1_0 extends KeywordToken  {
	
	public MOperatingSystemAPI_LanguageKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getLanguageKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MOperatingSystemAPI_ColonEqualsSignKeyword_4_1_1 extends KeywordToken  {
	
	public MOperatingSystemAPI_ColonEqualsSignKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getColonEqualsSignKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_LanguageKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// language=[system::MLanguage|VersionedQualifiedName]
protected class MOperatingSystemAPI_LanguageAssignment_4_1_2 extends AssignmentToken  {
	
	public MOperatingSystemAPI_LanguageAssignment_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getLanguageAssignment_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_ColonEqualsSignKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("language",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("language");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOperatingSystemAPIAccess().getLanguageMLanguageCrossReference_4_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOperatingSystemAPIAccess().getLanguageMLanguageCrossReference_4_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MOperatingSystemAPI_SemicolonKeyword_4_1_3 extends KeywordToken  {
	
	public MOperatingSystemAPI_SemicolonKeyword_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_LanguageAssignment_4_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MOperatingSystemAPI_Group_4_2 extends GroupToken {
	
	public MOperatingSystemAPI_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_SemicolonKeyword_4_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MOperatingSystemAPI_ConfigurationKeyword_4_2_0 extends KeywordToken  {
	
	public MOperatingSystemAPI_ConfigurationKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getConfigurationKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MOperatingSystemAPI_ParametersKeyword_4_2_1 extends KeywordToken  {
	
	public MOperatingSystemAPI_ParametersKeyword_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getParametersKeyword_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_ConfigurationKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MOperatingSystemAPI_LeftCurlyBracketKeyword_4_2_2 extends KeywordToken  {
	
	public MOperatingSystemAPI_LeftCurlyBracketKeyword_4_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getLeftCurlyBracketKeyword_4_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_ParametersKeyword_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameterWithoutOSSP+
protected class MOperatingSystemAPI_ParametersAssignment_4_2_3 extends AssignmentToken  {
	
	public MOperatingSystemAPI_ParametersAssignment_4_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getParametersAssignment_4_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutOSSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameters",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutOSSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMOperatingSystemAPIAccess().getParametersMParameterWithoutOSSPParserRuleCall_4_2_3_0(); 
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
			case 0: return new MOperatingSystemAPI_ParametersAssignment_4_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MOperatingSystemAPI_LeftCurlyBracketKeyword_4_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MOperatingSystemAPI_RightCurlyBracketKeyword_4_2_4 extends KeywordToken  {
	
	public MOperatingSystemAPI_RightCurlyBracketKeyword_4_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getRightCurlyBracketKeyword_4_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_ParametersAssignment_4_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MOperatingSystemAPI_SemicolonKeyword_4_2_5 extends KeywordToken  {
	
	public MOperatingSystemAPI_SemicolonKeyword_4_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_4_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_RightCurlyBracketKeyword_4_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MOperatingSystemAPI_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MOperatingSystemAPI_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MOperatingSystemAPI_SemicolonKeyword_6 extends KeywordToken  {
	
	public MOperatingSystemAPI_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOperatingSystemAPIAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOperatingSystemAPI_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MOperatingSystemAPI ****************/


/************ begin Rule MDevice ****************
 *
 * MDevice:
 * 	"device" name=ID "{" ("version" ":=" version=Version ";" & ("configuration" "parameters" "{"
 * 	parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
 *
 **/

// "device" name=ID "{" ("version" ":=" version=Version ";" & ("configuration" "parameters" "{"
// parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
protected class MDevice_Group extends GroupToken {
	
	public MDevice_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDeviceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "device"
protected class MDevice_DeviceKeyword_0 extends KeywordToken  {
	
	public MDevice_DeviceKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getDeviceKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MDevice_NameAssignment_1 extends AssignmentToken  {
	
	public MDevice_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_DeviceKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDeviceAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMDeviceAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MDevice_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MDevice_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MDevice_UnorderedGroup_3 extends UnorderedGroupToken {
	
	public MDevice_UnorderedGroup_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getUnorderedGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_Group_3_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDevice_Group_3_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MDevice_Group_3_0 extends GroupToken {
	
	public MDevice_Group_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getGroup_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_SemicolonKeyword_3_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MDevice_VersionKeyword_3_0_0 extends KeywordToken  {
	
	public MDevice_VersionKeyword_3_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getVersionKeyword_3_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDevice_ColonEqualsSignKeyword_3_0_1 extends KeywordToken  {
	
	public MDevice_ColonEqualsSignKeyword_3_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getColonEqualsSignKeyword_3_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_VersionKeyword_3_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MDevice_VersionAssignment_3_0_2 extends AssignmentToken  {
	
	public MDevice_VersionAssignment_3_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getVersionAssignment_3_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_ColonEqualsSignKeyword_3_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDeviceAccess().getVersionVersionParserRuleCall_3_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMDeviceAccess().getVersionVersionParserRuleCall_3_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MDevice_SemicolonKeyword_3_0_3 extends KeywordToken  {
	
	public MDevice_SemicolonKeyword_3_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getSemicolonKeyword_3_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_VersionAssignment_3_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MDevice_Group_3_1 extends GroupToken {
	
	public MDevice_Group_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getGroup_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_SemicolonKeyword_3_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MDevice_ConfigurationKeyword_3_1_0 extends KeywordToken  {
	
	public MDevice_ConfigurationKeyword_3_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getConfigurationKeyword_3_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_Group_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MDevice_ParametersKeyword_3_1_1 extends KeywordToken  {
	
	public MDevice_ParametersKeyword_3_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getParametersKeyword_3_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_ConfigurationKeyword_3_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDevice_LeftCurlyBracketKeyword_3_1_2 extends KeywordToken  {
	
	public MDevice_LeftCurlyBracketKeyword_3_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getLeftCurlyBracketKeyword_3_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_ParametersKeyword_3_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameterWithoutOSSP+
protected class MDevice_ParametersAssignment_3_1_3 extends AssignmentToken  {
	
	public MDevice_ParametersAssignment_3_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getParametersAssignment_3_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutOSSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameters",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutOSSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDeviceAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_1_3_0(); 
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
			case 0: return new MDevice_ParametersAssignment_3_1_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDevice_LeftCurlyBracketKeyword_3_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDevice_RightCurlyBracketKeyword_3_1_4 extends KeywordToken  {
	
	public MDevice_RightCurlyBracketKeyword_3_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getRightCurlyBracketKeyword_3_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_ParametersAssignment_3_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDevice_SemicolonKeyword_3_1_5 extends KeywordToken  {
	
	public MDevice_SemicolonKeyword_3_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getSemicolonKeyword_3_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_RightCurlyBracketKeyword_3_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MDevice_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MDevice_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_UnorderedGroup_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDevice_SemicolonKeyword_5 extends KeywordToken  {
	
	public MDevice_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDeviceAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDevice_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MDevice ****************/


/************ begin Rule MArchitecture ****************
 *
 * MArchitecture:
 * 	"architecture" name=ID ("extends" extends+=[MArchitecture|VersionedQualifiedName] (","
 * 	extends+=[MArchitecture|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("configuration"
 * 	"parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
 *
 **/

// "architecture" name=ID ("extends" extends+=[MArchitecture|VersionedQualifiedName] (","
// extends+=[MArchitecture|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("configuration"
// "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
protected class MArchitecture_Group extends GroupToken {
	
	public MArchitecture_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMArchitectureRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "architecture"
protected class MArchitecture_ArchitectureKeyword_0 extends KeywordToken  {
	
	public MArchitecture_ArchitectureKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getArchitectureKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MArchitecture_NameAssignment_1 extends AssignmentToken  {
	
	public MArchitecture_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_ArchitectureKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMArchitectureAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMArchitectureAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ("extends" extends+=[MArchitecture|VersionedQualifiedName] ("," extends+=[MArchitecture|VersionedQualifiedName])*)?
protected class MArchitecture_Group_2 extends GroupToken {
	
	public MArchitecture_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MArchitecture_ExtendsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "extends"
protected class MArchitecture_ExtendsKeyword_2_0 extends KeywordToken  {
	
	public MArchitecture_ExtendsKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getExtendsKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// extends+=[MArchitecture|VersionedQualifiedName]
protected class MArchitecture_ExtendsAssignment_2_1 extends AssignmentToken  {
	
	public MArchitecture_ExtendsAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getExtendsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_ExtendsKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMArchitectureAccess().getExtendsMArchitectureCrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMArchitectureAccess().getExtendsMArchitectureCrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," extends+=[MArchitecture|VersionedQualifiedName])*
protected class MArchitecture_Group_2_2 extends GroupToken {
	
	public MArchitecture_Group_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getGroup_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_ExtendsAssignment_2_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MArchitecture_CommaKeyword_2_2_0 extends KeywordToken  {
	
	public MArchitecture_CommaKeyword_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getCommaKeyword_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MArchitecture_ExtendsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MArchitecture|VersionedQualifiedName]
protected class MArchitecture_ExtendsAssignment_2_2_1 extends AssignmentToken  {
	
	public MArchitecture_ExtendsAssignment_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getExtendsAssignment_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_CommaKeyword_2_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMArchitectureAccess().getExtendsMArchitectureCrossReference_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMArchitectureAccess().getExtendsMArchitectureCrossReference_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MArchitecture_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MArchitecture_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MArchitecture_NameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MArchitecture_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MArchitecture_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MArchitecture_Group_4_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MArchitecture_Group_4_0 extends GroupToken {
	
	public MArchitecture_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_SemicolonKeyword_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MArchitecture_VersionKeyword_4_0_0 extends KeywordToken  {
	
	public MArchitecture_VersionKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getVersionKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MArchitecture_ColonEqualsSignKeyword_4_0_1 extends KeywordToken  {
	
	public MArchitecture_ColonEqualsSignKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getColonEqualsSignKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_VersionKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MArchitecture_VersionAssignment_4_0_2 extends AssignmentToken  {
	
	public MArchitecture_VersionAssignment_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getVersionAssignment_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_ColonEqualsSignKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMArchitectureAccess().getVersionVersionParserRuleCall_4_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMArchitectureAccess().getVersionVersionParserRuleCall_4_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MArchitecture_SemicolonKeyword_4_0_3 extends KeywordToken  {
	
	public MArchitecture_SemicolonKeyword_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getSemicolonKeyword_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_VersionAssignment_4_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MArchitecture_Group_4_1 extends GroupToken {
	
	public MArchitecture_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_SemicolonKeyword_4_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MArchitecture_ConfigurationKeyword_4_1_0 extends KeywordToken  {
	
	public MArchitecture_ConfigurationKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getConfigurationKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MArchitecture_ParametersKeyword_4_1_1 extends KeywordToken  {
	
	public MArchitecture_ParametersKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getParametersKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_ConfigurationKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MArchitecture_LeftCurlyBracketKeyword_4_1_2 extends KeywordToken  {
	
	public MArchitecture_LeftCurlyBracketKeyword_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getLeftCurlyBracketKeyword_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_ParametersKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameterWithoutOSSP+
protected class MArchitecture_ParametersAssignment_4_1_3 extends AssignmentToken  {
	
	public MArchitecture_ParametersAssignment_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getParametersAssignment_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutOSSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameters",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutOSSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMArchitectureAccess().getParametersMParameterWithoutOSSPParserRuleCall_4_1_3_0(); 
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
			case 0: return new MArchitecture_ParametersAssignment_4_1_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MArchitecture_LeftCurlyBracketKeyword_4_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MArchitecture_RightCurlyBracketKeyword_4_1_4 extends KeywordToken  {
	
	public MArchitecture_RightCurlyBracketKeyword_4_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getRightCurlyBracketKeyword_4_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_ParametersAssignment_4_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MArchitecture_SemicolonKeyword_4_1_5 extends KeywordToken  {
	
	public MArchitecture_SemicolonKeyword_4_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getSemicolonKeyword_4_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_RightCurlyBracketKeyword_4_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MArchitecture_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MArchitecture_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MArchitecture_SemicolonKeyword_6 extends KeywordToken  {
	
	public MArchitecture_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMArchitectureAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MArchitecture_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MArchitecture ****************/


/************ begin Rule MOSSupportedPlatform ****************
 *
 * MOSSupportedPlatform:
 * 	{MOSSupportedPlatform} "supported" "platform" name=ID "{" ("architecture" ":="
 * 	architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":=" compiler=[MCompiler|VersionedQualifiedName]
 * 	";" & "microprocessor" ":=" ("any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":="
 * 	("any" | board=[MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
 * 	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
 * 	";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";";
 *
 **/

// {MOSSupportedPlatform} "supported" "platform" name=ID "{" ("architecture" ":="
// architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":=" compiler=[MCompiler|VersionedQualifiedName]
// ";" & "microprocessor" ":=" ("any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any"
// | board=[MBoard|VersionedQualifiedName]) ";" & ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName]
// ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("configuration" "parameters" "{"
// parameters+=MParameterWithoutOSSP+ "}" ";")?) "}" ";"
protected class MOSSupportedPlatform_Group extends GroupToken {
	
	public MOSSupportedPlatform_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOSSupportedPlatformAccess().getMOSSupportedPlatformAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MOSSupportedPlatform}
protected class MOSSupportedPlatform_MOSSupportedPlatformAction_0 extends ActionToken  {

	public MOSSupportedPlatform_MOSSupportedPlatformAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getMOSSupportedPlatformAction_0();
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
protected class MOSSupportedPlatform_SupportedKeyword_1 extends KeywordToken  {
	
	public MOSSupportedPlatform_SupportedKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getSupportedKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_MOSSupportedPlatformAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "platform"
protected class MOSSupportedPlatform_PlatformKeyword_2 extends KeywordToken  {
	
	public MOSSupportedPlatform_PlatformKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getPlatformKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_SupportedKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MOSSupportedPlatform_NameAssignment_3 extends AssignmentToken  {
	
	public MOSSupportedPlatform_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_PlatformKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMOSSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMOSSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MOSSupportedPlatform_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MOSSupportedPlatform_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":="
// compiler=[MCompiler|VersionedQualifiedName] ";" & "microprocessor" ":=" ("any" |
// microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
// board=[MBoard|VersionedQualifiedName]) ";" & ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName]
// ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("configuration" "parameters" "{"
// parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MOSSupportedPlatform_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MOSSupportedPlatform_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSupportedPlatform_Group_5_4(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MOSSupportedPlatform_Group_5_3(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";"
protected class MOSSupportedPlatform_Group_5_0 extends GroupToken {
	
	public MOSSupportedPlatform_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "architecture"
protected class MOSSupportedPlatform_ArchitectureKeyword_5_0_0 extends KeywordToken  {
	
	public MOSSupportedPlatform_ArchitectureKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getArchitectureKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MOSSupportedPlatform_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public MOSSupportedPlatform_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_ArchitectureKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// architecture=[MArchitecture|VersionedQualifiedName]
protected class MOSSupportedPlatform_ArchitectureAssignment_5_0_2 extends AssignmentToken  {
	
	public MOSSupportedPlatform_ArchitectureAssignment_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getArchitectureAssignment_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("architecture",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("architecture");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_0_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_0_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MOSSupportedPlatform_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public MOSSupportedPlatform_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_ArchitectureAssignment_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "compiler" ":=" compiler=[MCompiler|VersionedQualifiedName] ";"
protected class MOSSupportedPlatform_Group_5_1 extends GroupToken {
	
	public MOSSupportedPlatform_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_SemicolonKeyword_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "compiler"
protected class MOSSupportedPlatform_CompilerKeyword_5_1_0 extends KeywordToken  {
	
	public MOSSupportedPlatform_CompilerKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getCompilerKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MOSSupportedPlatform_ColonEqualsSignKeyword_5_1_1 extends KeywordToken  {
	
	public MOSSupportedPlatform_ColonEqualsSignKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_CompilerKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// compiler=[MCompiler|VersionedQualifiedName]
protected class MOSSupportedPlatform_CompilerAssignment_5_1_2 extends AssignmentToken  {
	
	public MOSSupportedPlatform_CompilerAssignment_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getCompilerAssignment_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("compiler",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("compiler");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MOSSupportedPlatform_SemicolonKeyword_5_1_3 extends KeywordToken  {
	
	public MOSSupportedPlatform_SemicolonKeyword_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_CompilerAssignment_5_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "microprocessor" ":=" ("any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";"
protected class MOSSupportedPlatform_Group_5_2 extends GroupToken {
	
	public MOSSupportedPlatform_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_SemicolonKeyword_5_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "microprocessor"
protected class MOSSupportedPlatform_MicroprocessorKeyword_5_2_0 extends KeywordToken  {
	
	public MOSSupportedPlatform_MicroprocessorKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MOSSupportedPlatform_ColonEqualsSignKeyword_5_2_1 extends KeywordToken  {
	
	public MOSSupportedPlatform_ColonEqualsSignKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_MicroprocessorKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]
protected class MOSSupportedPlatform_Alternatives_5_2_2 extends AlternativesToken {

	public MOSSupportedPlatform_Alternatives_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getAlternatives_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_AnyKeyword_5_2_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSupportedPlatform_MicroprocessorAssignment_5_2_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MOSSupportedPlatform_AnyKeyword_5_2_2_0 extends KeywordToken  {
	
	public MOSSupportedPlatform_AnyKeyword_5_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getAnyKeyword_5_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// microprocessor=[MMicroprocessor|VersionedQualifiedName]
protected class MOSSupportedPlatform_MicroprocessorAssignment_5_2_2_1 extends AssignmentToken  {
	
	public MOSSupportedPlatform_MicroprocessorAssignment_5_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorAssignment_5_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("microprocessor",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("microprocessor");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MOSSupportedPlatform_SemicolonKeyword_5_2_3 extends KeywordToken  {
	
	public MOSSupportedPlatform_SemicolonKeyword_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_Alternatives_5_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "board" ":=" ("any" | board=[MBoard|VersionedQualifiedName]) ";"
protected class MOSSupportedPlatform_Group_5_3 extends GroupToken {
	
	public MOSSupportedPlatform_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_SemicolonKeyword_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "board"
protected class MOSSupportedPlatform_BoardKeyword_5_3_0 extends KeywordToken  {
	
	public MOSSupportedPlatform_BoardKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getBoardKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MOSSupportedPlatform_ColonEqualsSignKeyword_5_3_1 extends KeywordToken  {
	
	public MOSSupportedPlatform_ColonEqualsSignKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_BoardKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | board=[MBoard|VersionedQualifiedName]
protected class MOSSupportedPlatform_Alternatives_5_3_2 extends AlternativesToken {

	public MOSSupportedPlatform_Alternatives_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getAlternatives_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_AnyKeyword_5_3_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSupportedPlatform_BoardAssignment_5_3_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MOSSupportedPlatform_AnyKeyword_5_3_2_0 extends KeywordToken  {
	
	public MOSSupportedPlatform_AnyKeyword_5_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getAnyKeyword_5_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_ColonEqualsSignKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// board=[MBoard|VersionedQualifiedName]
protected class MOSSupportedPlatform_BoardAssignment_5_3_2_1 extends AssignmentToken  {
	
	public MOSSupportedPlatform_BoardAssignment_5_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getBoardAssignment_5_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_ColonEqualsSignKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("board",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("board");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedPlatformAccess().getBoardMBoardCrossReference_5_3_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSupportedPlatformAccess().getBoardMBoardCrossReference_5_3_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MOSSupportedPlatform_SemicolonKeyword_5_3_3 extends KeywordToken  {
	
	public MOSSupportedPlatform_SemicolonKeyword_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_Alternatives_5_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")?
protected class MOSSupportedPlatform_Group_5_4 extends GroupToken {
	
	public MOSSupportedPlatform_Group_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_SemicolonKeyword_5_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "languages"
protected class MOSSupportedPlatform_LanguagesKeyword_5_4_0 extends KeywordToken  {
	
	public MOSSupportedPlatform_LanguagesKeyword_5_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getLanguagesKeyword_5_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MOSSupportedPlatform_ColonEqualsSignKeyword_5_4_1 extends KeywordToken  {
	
	public MOSSupportedPlatform_ColonEqualsSignKeyword_5_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_LanguagesKeyword_5_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MOSSupportedPlatform_LanguagesAssignment_5_4_2 extends AssignmentToken  {
	
	public MOSSupportedPlatform_LanguagesAssignment_5_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getLanguagesAssignment_5_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_ColonEqualsSignKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_4_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_4_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MOSSupportedPlatform_Group_5_4_3 extends GroupToken {
	
	public MOSSupportedPlatform_Group_5_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_LanguagesAssignment_5_4_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MOSSupportedPlatform_CommaKeyword_5_4_3_0 extends KeywordToken  {
	
	public MOSSupportedPlatform_CommaKeyword_5_4_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getCommaKeyword_5_4_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_Group_5_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSupportedPlatform_LanguagesAssignment_5_4_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MOSSupportedPlatform_LanguagesAssignment_5_4_3_1 extends AssignmentToken  {
	
	public MOSSupportedPlatform_LanguagesAssignment_5_4_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getLanguagesAssignment_5_4_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_CommaKeyword_5_4_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_4_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_4_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MOSSupportedPlatform_SemicolonKeyword_5_4_4 extends KeywordToken  {
	
	public MOSSupportedPlatform_SemicolonKeyword_5_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_Group_5_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSupportedPlatform_LanguagesAssignment_5_4_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MOSSupportedPlatform_Group_5_5 extends GroupToken {
	
	public MOSSupportedPlatform_Group_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getGroup_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_SemicolonKeyword_5_5_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MOSSupportedPlatform_ConfigurationKeyword_5_5_0 extends KeywordToken  {
	
	public MOSSupportedPlatform_ConfigurationKeyword_5_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getConfigurationKeyword_5_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_Group_5_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSupportedPlatform_Group_5_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MOSSupportedPlatform_ParametersKeyword_5_5_1 extends KeywordToken  {
	
	public MOSSupportedPlatform_ParametersKeyword_5_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getParametersKeyword_5_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_ConfigurationKeyword_5_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MOSSupportedPlatform_LeftCurlyBracketKeyword_5_5_2 extends KeywordToken  {
	
	public MOSSupportedPlatform_LeftCurlyBracketKeyword_5_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_ParametersKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameterWithoutOSSP+
protected class MOSSupportedPlatform_ParametersAssignment_5_5_3 extends AssignmentToken  {
	
	public MOSSupportedPlatform_ParametersAssignment_5_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getParametersAssignment_5_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutOSSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameters",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutOSSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMOSSupportedPlatformAccess().getParametersMParameterWithoutOSSPParserRuleCall_5_5_3_0(); 
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
			case 0: return new MOSSupportedPlatform_ParametersAssignment_5_5_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MOSSupportedPlatform_LeftCurlyBracketKeyword_5_5_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MOSSupportedPlatform_RightCurlyBracketKeyword_5_5_4 extends KeywordToken  {
	
	public MOSSupportedPlatform_RightCurlyBracketKeyword_5_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getRightCurlyBracketKeyword_5_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_ParametersAssignment_5_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MOSSupportedPlatform_SemicolonKeyword_5_5_5 extends KeywordToken  {
	
	public MOSSupportedPlatform_SemicolonKeyword_5_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_5_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_RightCurlyBracketKeyword_5_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MOSSupportedPlatform_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MOSSupportedPlatform_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MOSSupportedPlatform_SemicolonKeyword_7 extends KeywordToken  {
	
	public MOSSupportedPlatform_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSupportedPlatformAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSupportedPlatform_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MOSSupportedPlatform ****************/


/************ begin Rule MPlatform ****************
 *
 * MPlatform:
 * 	"platform" name=ID "{" ("version" ":=" version=Version ";" & "osapi" ":="
 * 	osapi=[MOperatingSystemAPI|VersionedQualifiedName] ";" & "os" ":=" os=[MOperatingSystem|VersionedQualifiedName] ";" &
 * 	"architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":="
 * 	compiler=[MCompiler|VersionedQualifiedName] ";" & "microprocessor" ":=" ("any" |
 * 	microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
 * 	board=[MBoard|VersionedQualifiedName]) ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}"
 * 	";")?) "}" ";";
 *
 **/

// "platform" name=ID "{" ("version" ":=" version=Version ";" & "osapi" ":="
// osapi=[MOperatingSystemAPI|VersionedQualifiedName] ";" & "os" ":=" os=[MOperatingSystem|VersionedQualifiedName] ";" &
// "architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":="
// compiler=[MCompiler|VersionedQualifiedName] ";" & "microprocessor" ":=" ("any" |
// microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
// board=[MBoard|VersionedQualifiedName]) ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}"
// ";")?) "}" ";"
protected class MPlatform_Group extends GroupToken {
	
	public MPlatform_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMPlatformRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "platform"
protected class MPlatform_PlatformKeyword_0 extends KeywordToken  {
	
	public MPlatform_PlatformKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getPlatformKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MPlatform_NameAssignment_1 extends AssignmentToken  {
	
	public MPlatform_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_PlatformKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMPlatformAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMPlatformAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MPlatform_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MPlatform_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & "osapi" ":=" osapi=[MOperatingSystemAPI|VersionedQualifiedName] ";" & "os" ":="
// os=[MOperatingSystem|VersionedQualifiedName] ";" & "architecture" ":="
// architecture=[MArchitecture|VersionedQualifiedName] ";" & "compiler" ":=" compiler=[MCompiler|VersionedQualifiedName]
// ";" & "microprocessor" ":=" ("any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any"
// | board=[MBoard|VersionedQualifiedName]) ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}"
// ";")?
protected class MPlatform_UnorderedGroup_3 extends UnorderedGroupToken {
	
	public MPlatform_UnorderedGroup_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getUnorderedGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_Group_3_7(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPlatform_Group_3_6(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MPlatform_Group_3_0 extends GroupToken {
	
	public MPlatform_Group_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getGroup_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_SemicolonKeyword_3_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MPlatform_VersionKeyword_3_0_0 extends KeywordToken  {
	
	public MPlatform_VersionKeyword_3_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getVersionKeyword_3_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MPlatform_ColonEqualsSignKeyword_3_0_1 extends KeywordToken  {
	
	public MPlatform_ColonEqualsSignKeyword_3_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_VersionKeyword_3_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MPlatform_VersionAssignment_3_0_2 extends AssignmentToken  {
	
	public MPlatform_VersionAssignment_3_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getVersionAssignment_3_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ColonEqualsSignKeyword_3_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMPlatformAccess().getVersionVersionParserRuleCall_3_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMPlatformAccess().getVersionVersionParserRuleCall_3_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MPlatform_SemicolonKeyword_3_0_3 extends KeywordToken  {
	
	public MPlatform_SemicolonKeyword_3_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_VersionAssignment_3_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "osapi" ":=" osapi=[MOperatingSystemAPI|VersionedQualifiedName] ";"
protected class MPlatform_Group_3_1 extends GroupToken {
	
	public MPlatform_Group_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getGroup_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_SemicolonKeyword_3_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "osapi"
protected class MPlatform_OsapiKeyword_3_1_0 extends KeywordToken  {
	
	public MPlatform_OsapiKeyword_3_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getOsapiKeyword_3_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_Group_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MPlatform_ColonEqualsSignKeyword_3_1_1 extends KeywordToken  {
	
	public MPlatform_ColonEqualsSignKeyword_3_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_OsapiKeyword_3_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// osapi=[MOperatingSystemAPI|VersionedQualifiedName]
protected class MPlatform_OsapiAssignment_3_1_2 extends AssignmentToken  {
	
	public MPlatform_OsapiAssignment_3_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getOsapiAssignment_3_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ColonEqualsSignKeyword_3_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("osapi",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("osapi");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPlatformAccess().getOsapiMOperatingSystemAPICrossReference_3_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPlatformAccess().getOsapiMOperatingSystemAPICrossReference_3_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MPlatform_SemicolonKeyword_3_1_3 extends KeywordToken  {
	
	public MPlatform_SemicolonKeyword_3_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_OsapiAssignment_3_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "os" ":=" os=[MOperatingSystem|VersionedQualifiedName] ";"
protected class MPlatform_Group_3_2 extends GroupToken {
	
	public MPlatform_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_SemicolonKeyword_3_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "os"
protected class MPlatform_OsKeyword_3_2_0 extends KeywordToken  {
	
	public MPlatform_OsKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getOsKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_Group_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MPlatform_ColonEqualsSignKeyword_3_2_1 extends KeywordToken  {
	
	public MPlatform_ColonEqualsSignKeyword_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_OsKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// os=[MOperatingSystem|VersionedQualifiedName]
protected class MPlatform_OsAssignment_3_2_2 extends AssignmentToken  {
	
	public MPlatform_OsAssignment_3_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getOsAssignment_3_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ColonEqualsSignKeyword_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("os",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("os");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPlatformAccess().getOsMOperatingSystemCrossReference_3_2_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPlatformAccess().getOsMOperatingSystemCrossReference_3_2_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MPlatform_SemicolonKeyword_3_2_3 extends KeywordToken  {
	
	public MPlatform_SemicolonKeyword_3_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_OsAssignment_3_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "architecture" ":=" architecture=[MArchitecture|VersionedQualifiedName] ";"
protected class MPlatform_Group_3_3 extends GroupToken {
	
	public MPlatform_Group_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getGroup_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_SemicolonKeyword_3_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "architecture"
protected class MPlatform_ArchitectureKeyword_3_3_0 extends KeywordToken  {
	
	public MPlatform_ArchitectureKeyword_3_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getArchitectureKeyword_3_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MPlatform_ColonEqualsSignKeyword_3_3_1 extends KeywordToken  {
	
	public MPlatform_ColonEqualsSignKeyword_3_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ArchitectureKeyword_3_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// architecture=[MArchitecture|VersionedQualifiedName]
protected class MPlatform_ArchitectureAssignment_3_3_2 extends AssignmentToken  {
	
	public MPlatform_ArchitectureAssignment_3_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getArchitectureAssignment_3_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ColonEqualsSignKeyword_3_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("architecture",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("architecture");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPlatformAccess().getArchitectureMArchitectureCrossReference_3_3_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPlatformAccess().getArchitectureMArchitectureCrossReference_3_3_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MPlatform_SemicolonKeyword_3_3_3 extends KeywordToken  {
	
	public MPlatform_SemicolonKeyword_3_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ArchitectureAssignment_3_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "compiler" ":=" compiler=[MCompiler|VersionedQualifiedName] ";"
protected class MPlatform_Group_3_4 extends GroupToken {
	
	public MPlatform_Group_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getGroup_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_SemicolonKeyword_3_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "compiler"
protected class MPlatform_CompilerKeyword_3_4_0 extends KeywordToken  {
	
	public MPlatform_CompilerKeyword_3_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getCompilerKeyword_3_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_Group_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MPlatform_ColonEqualsSignKeyword_3_4_1 extends KeywordToken  {
	
	public MPlatform_ColonEqualsSignKeyword_3_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_CompilerKeyword_3_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// compiler=[MCompiler|VersionedQualifiedName]
protected class MPlatform_CompilerAssignment_3_4_2 extends AssignmentToken  {
	
	public MPlatform_CompilerAssignment_3_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getCompilerAssignment_3_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ColonEqualsSignKeyword_3_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("compiler",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("compiler");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPlatformAccess().getCompilerMCompilerCrossReference_3_4_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPlatformAccess().getCompilerMCompilerCrossReference_3_4_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MPlatform_SemicolonKeyword_3_4_3 extends KeywordToken  {
	
	public MPlatform_SemicolonKeyword_3_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_CompilerAssignment_3_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "microprocessor" ":=" ("any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]) ";"
protected class MPlatform_Group_3_5 extends GroupToken {
	
	public MPlatform_Group_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getGroup_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_SemicolonKeyword_3_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "microprocessor"
protected class MPlatform_MicroprocessorKeyword_3_5_0 extends KeywordToken  {
	
	public MPlatform_MicroprocessorKeyword_3_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getMicroprocessorKeyword_3_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_Group_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MPlatform_ColonEqualsSignKeyword_3_5_1 extends KeywordToken  {
	
	public MPlatform_ColonEqualsSignKeyword_3_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_MicroprocessorKeyword_3_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | microprocessor=[MMicroprocessor|VersionedQualifiedName]
protected class MPlatform_Alternatives_3_5_2 extends AlternativesToken {

	public MPlatform_Alternatives_3_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getAlternatives_3_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_AnyKeyword_3_5_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPlatform_MicroprocessorAssignment_3_5_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MPlatform_AnyKeyword_3_5_2_0 extends KeywordToken  {
	
	public MPlatform_AnyKeyword_3_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getAnyKeyword_3_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ColonEqualsSignKeyword_3_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// microprocessor=[MMicroprocessor|VersionedQualifiedName]
protected class MPlatform_MicroprocessorAssignment_3_5_2_1 extends AssignmentToken  {
	
	public MPlatform_MicroprocessorAssignment_3_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getMicroprocessorAssignment_3_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ColonEqualsSignKeyword_3_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("microprocessor",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("microprocessor");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_3_5_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_3_5_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MPlatform_SemicolonKeyword_3_5_3 extends KeywordToken  {
	
	public MPlatform_SemicolonKeyword_3_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_Alternatives_3_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "board" ":=" ("any" | board=[MBoard|VersionedQualifiedName]) ";"
protected class MPlatform_Group_3_6 extends GroupToken {
	
	public MPlatform_Group_3_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getGroup_3_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_SemicolonKeyword_3_6_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "board"
protected class MPlatform_BoardKeyword_3_6_0 extends KeywordToken  {
	
	public MPlatform_BoardKeyword_3_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getBoardKeyword_3_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_Group_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MPlatform_ColonEqualsSignKeyword_3_6_1 extends KeywordToken  {
	
	public MPlatform_ColonEqualsSignKeyword_3_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getColonEqualsSignKeyword_3_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_BoardKeyword_3_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | board=[MBoard|VersionedQualifiedName]
protected class MPlatform_Alternatives_3_6_2 extends AlternativesToken {

	public MPlatform_Alternatives_3_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getAlternatives_3_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_AnyKeyword_3_6_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MPlatform_BoardAssignment_3_6_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MPlatform_AnyKeyword_3_6_2_0 extends KeywordToken  {
	
	public MPlatform_AnyKeyword_3_6_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getAnyKeyword_3_6_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ColonEqualsSignKeyword_3_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// board=[MBoard|VersionedQualifiedName]
protected class MPlatform_BoardAssignment_3_6_2_1 extends AssignmentToken  {
	
	public MPlatform_BoardAssignment_3_6_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getBoardAssignment_3_6_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ColonEqualsSignKeyword_3_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("board",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("board");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMPlatformAccess().getBoardMBoardCrossReference_3_6_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMPlatformAccess().getBoardMBoardCrossReference_3_6_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MPlatform_SemicolonKeyword_3_6_3 extends KeywordToken  {
	
	public MPlatform_SemicolonKeyword_3_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_Alternatives_3_6_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameterWithoutOSSP+ "}" ";")?
protected class MPlatform_Group_3_7 extends GroupToken {
	
	public MPlatform_Group_3_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getGroup_3_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_SemicolonKeyword_3_7_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MPlatform_ConfigurationKeyword_3_7_0 extends KeywordToken  {
	
	public MPlatform_ConfigurationKeyword_3_7_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getConfigurationKeyword_3_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_Group_3_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MPlatform_ParametersKeyword_3_7_1 extends KeywordToken  {
	
	public MPlatform_ParametersKeyword_3_7_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getParametersKeyword_3_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ConfigurationKeyword_3_7_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MPlatform_LeftCurlyBracketKeyword_3_7_2 extends KeywordToken  {
	
	public MPlatform_LeftCurlyBracketKeyword_3_7_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getLeftCurlyBracketKeyword_3_7_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ParametersKeyword_3_7_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameterWithoutOSSP+
protected class MPlatform_ParametersAssignment_3_7_3 extends AssignmentToken  {
	
	public MPlatform_ParametersAssignment_3_7_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getParametersAssignment_3_7_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutOSSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameters",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutOSSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMPlatformAccess().getParametersMParameterWithoutOSSPParserRuleCall_3_7_3_0(); 
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
			case 0: return new MPlatform_ParametersAssignment_3_7_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MPlatform_LeftCurlyBracketKeyword_3_7_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MPlatform_RightCurlyBracketKeyword_3_7_4 extends KeywordToken  {
	
	public MPlatform_RightCurlyBracketKeyword_3_7_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getRightCurlyBracketKeyword_3_7_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_ParametersAssignment_3_7_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MPlatform_SemicolonKeyword_3_7_5 extends KeywordToken  {
	
	public MPlatform_SemicolonKeyword_3_7_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getSemicolonKeyword_3_7_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_RightCurlyBracketKeyword_3_7_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MPlatform_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MPlatform_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_UnorderedGroup_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MPlatform_SemicolonKeyword_5 extends KeywordToken  {
	
	public MPlatform_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMPlatformAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MPlatform_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MPlatform ****************/




}
