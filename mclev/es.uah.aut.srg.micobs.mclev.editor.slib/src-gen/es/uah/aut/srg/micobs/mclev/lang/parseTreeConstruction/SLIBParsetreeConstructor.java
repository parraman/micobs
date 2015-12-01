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

import es.uah.aut.srg.micobs.mclev.lang.services.SLIBGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class SLIBParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private SLIBGrammarAccess grammarAccess;
	
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
			case 0: return new MMCLEVSLIBPackageFile_Group(this, this, 0, inst);
			case 1: return new MMCLEVSLIBPackageElement_Alternatives(this, this, 1, inst);
			case 2: return new MAbstractServiceLibrary_Group(this, this, 2, inst);
			case 3: return new MServiceLibraryProvidedSAI_Group(this, this, 3, inst);
			case 4: return new MSLibProvidedSAIAVA_Alternatives(this, this, 4, inst);
			case 5: return new MSLibProvidedSAIAVAExpression_Group(this, this, 5, inst);
			case 6: return new MSLibProvidedSAIAVASwitch_Group(this, this, 6, inst);
			case 7: return new MSLibProvidedSAIAVASwitchCase_Group(this, this, 7, inst);
			case 8: return new MServiceLibrary_Group(this, this, 8, inst);
			case 9: return new MDriverServiceLibrary_Group(this, this, 9, inst);
			case 10: return new MServiceLibrarySupportedPlatform_Group(this, this, 10, inst);
			case 11: return new MDriverSLibSupportedPlatform_Group(this, this, 11, inst);
			case 12: return new MDriverSLibSupportedDevice_Group(this, this, 12, inst);
			case 13: return new MParameter_Alternatives(this, this, 13, inst);
			case 14: return new MParameterWithoutSLSP_Alternatives(this, this, 14, inst);
			case 15: return new MBooleanParamSLSPSwitch_Group(this, this, 15, inst);
			case 16: return new MBooleanParamSLSPSwitchCase_Group(this, this, 16, inst);
			case 17: return new MStringParamSLSPSwitch_Group(this, this, 17, inst);
			case 18: return new MStringParamSLSPSwitchCase_Group(this, this, 18, inst);
			case 19: return new MIntegerParamSLSPSwitch_Group(this, this, 19, inst);
			case 20: return new MIntegerParamSLSPSwitchCase_Group(this, this, 20, inst);
			case 21: return new MRealParamSLSPSwitch_Group(this, this, 21, inst);
			case 22: return new MRealParamSLSPSwitchCase_Group(this, this, 22, inst);
			case 23: return new MEnumParamSLSPSwitch_Group(this, this, 23, inst);
			case 24: return new MEnumParamSLSPSwitchCase_Group(this, this, 24, inst);
			case 25: return new MIntegerParameterSingleExpression_Group(this, this, 25, inst);
			case 26: return new MEnumParameterDefinition_Group(this, this, 26, inst);
			case 27: return new MEnumParameterSingleExpression_Group(this, this, 27, inst);
			case 28: return new MRealParameterSingleExpression_Group(this, this, 28, inst);
			case 29: return new MEnumParameterLiteralRule_Alternatives(this, this, 29, inst);
			case 30: return new MParameterValue_Alternatives(this, this, 30, inst);
			case 31: return new MParameterValueLiteral_Alternatives(this, this, 31, inst);
			case 32: return new MParameterValueBooleanLiteral_Group(this, this, 32, inst);
			case 33: return new MParameterValueStringLiteral_Group(this, this, 33, inst);
			case 34: return new MParameterValueIntegerLiteral_Group(this, this, 34, inst);
			case 35: return new MParameterValueRealLiteral_Group(this, this, 35, inst);
			case 36: return new MParameterValueRefObject_Group(this, this, 36, inst);
			case 37: return new MParameterValuePAR_Group(this, this, 37, inst);
			case 38: return new MParameterValueExpression_Group(this, this, 38, inst);
			case 39: return new MParameterValueTERM_Group(this, this, 39, inst);
			case 40: return new MParameterRange_Alternatives(this, this, 40, inst);
			case 41: return new MParameterOCR_Group(this, this, 41, inst);
			case 42: return new MParameterOOR_Group(this, this, 42, inst);
			case 43: return new MParameterCOR_Group(this, this, 43, inst);
			case 44: return new MParameterCCR_Group(this, this, 44, inst);
			case 45: return new MEnumParameterLiteral_Group(this, this, 45, inst);
			case 46: return new MEnumParamIntegerLiteral_Group(this, this, 46, inst);
			case 47: return new MEnumParamRealLiteral_Group(this, this, 47, inst);
			case 48: return new MEnumParamStringLiteral_Group(this, this, 48, inst);
			case 49: return new MBooleanParameterSingleExpression_Group(this, this, 49, inst);
			case 50: return new MStringParameterSingleExpression_Group(this, this, 50, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MMCLEVSLIBPackageFile ****************
 *
 * MMCLEVSLIBPackageFile:
 * 	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
 * 	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVSLIBPackageElement;
 *
 **/

// "package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
// imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMCLEVSLIBPackageElement
protected class MMCLEVSLIBPackageFile_Group extends GroupToken {
	
	public MMCLEVSLIBPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVSLIBPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMCLEVSLIBPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "package"
protected class MMCLEVSLIBPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MMCLEVSLIBPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[mclevlibrary::MMCLEVPackage|QualifiedName]
protected class MMCLEVSLIBPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MMCLEVSLIBPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVSLIBPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVSLIBPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMCLEVSLIBPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MMCLEVSLIBPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVSLIBPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("import" imports+=[common::MCommonPackage|QualifiedName] ";")*
protected class MMCLEVSLIBPackageFile_Group_3 extends GroupToken {
	
	public MMCLEVSLIBPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVSLIBPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "import"
protected class MMCLEVSLIBPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MMCLEVSLIBPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVSLIBPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCLEVSLIBPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[common::MCommonPackage|QualifiedName]
protected class MMCLEVSLIBPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MMCLEVSLIBPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVSLIBPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVSLIBPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMCLEVSLIBPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MMCLEVSLIBPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVSLIBPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MMCLEVSLIBPackageElement
protected class MMCLEVSLIBPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MMCLEVSLIBPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVSLIBPackageElement_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVSLIBPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCLEVSLIBPackageFileAccess().getElementMMCLEVSLIBPackageElementParserRuleCall_4_0(); 
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
			case 0: return new MMCLEVSLIBPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCLEVSLIBPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MMCLEVSLIBPackageFile ****************/


/************ begin Rule MMCLEVSLIBPackageElement ****************
 *
 * MMCLEVSLIBPackageElement:
 * 	MDriverServiceLibrary | MServiceLibrary | MAbstractServiceLibrary;
 *
 **/

// MDriverServiceLibrary | MServiceLibrary | MAbstractServiceLibrary
protected class MMCLEVSLIBPackageElement_Alternatives extends AlternativesToken {

	public MMCLEVSLIBPackageElement_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageElementAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVSLIBPackageElement_MDriverServiceLibraryParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCLEVSLIBPackageElement_MServiceLibraryParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMCLEVSLIBPackageElement_MAbstractServiceLibraryParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAbstractServiceLibraryRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMDriverServiceLibraryRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMServiceLibraryRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MDriverServiceLibrary
protected class MMCLEVSLIBPackageElement_MDriverServiceLibraryParserRuleCall_0 extends RuleCallToken {
	
	public MMCLEVSLIBPackageElement_MDriverServiceLibraryParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageElementAccess().getMDriverServiceLibraryParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDriverServiceLibraryRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MDriverServiceLibrary_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MServiceLibrary
protected class MMCLEVSLIBPackageElement_MServiceLibraryParserRuleCall_1 extends RuleCallToken {
	
	public MMCLEVSLIBPackageElement_MServiceLibraryParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageElementAccess().getMServiceLibraryParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMServiceLibraryRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MServiceLibrary_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MAbstractServiceLibrary
protected class MMCLEVSLIBPackageElement_MAbstractServiceLibraryParserRuleCall_2 extends RuleCallToken {
	
	public MMCLEVSLIBPackageElement_MAbstractServiceLibraryParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMCLEVSLIBPackageElementAccess().getMAbstractServiceLibraryParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAbstractServiceLibraryRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MAbstractServiceLibrary_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MMCLEVSLIBPackageElement ****************/






/************ begin Rule MAbstractServiceLibrary ****************
 *
 * MAbstractServiceLibrary:
 * 	"abstract" "service" "library" name=ID ("inherits" inherits+=[MAbstractServiceLibrary|VersionedQualifiedName] (","
 * 	inherits+=[MAbstractServiceLibrary|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("attributes"
 * 	"{" attributes+=MParameterWithoutSLSP+ "}" ";")? & ("provided" "sais" "{" provides+=MServiceLibraryProvidedSAI+ "}"
 * 	";")?) "}" ";";
 *
 **/

// "abstract" "service" "library" name=ID ("inherits" inherits+=[MAbstractServiceLibrary|VersionedQualifiedName] (","
// inherits+=[MAbstractServiceLibrary|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("attributes"
// "{" attributes+=MParameterWithoutSLSP+ "}" ";")? & ("provided" "sais" "{" provides+=MServiceLibraryProvidedSAI+ "}"
// ";")?) "}" ";"
protected class MAbstractServiceLibrary_Group extends GroupToken {
	
	public MAbstractServiceLibrary_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAbstractServiceLibraryRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "abstract"
protected class MAbstractServiceLibrary_AbstractKeyword_0 extends KeywordToken  {
	
	public MAbstractServiceLibrary_AbstractKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getAbstractKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// "service"
protected class MAbstractServiceLibrary_ServiceKeyword_1 extends KeywordToken  {
	
	public MAbstractServiceLibrary_ServiceKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getServiceKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_AbstractKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "library"
protected class MAbstractServiceLibrary_LibraryKeyword_2 extends KeywordToken  {
	
	public MAbstractServiceLibrary_LibraryKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getLibraryKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_ServiceKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MAbstractServiceLibrary_NameAssignment_3 extends AssignmentToken  {
	
	public MAbstractServiceLibrary_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_LibraryKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMAbstractServiceLibraryAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMAbstractServiceLibraryAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ("inherits" inherits+=[MAbstractServiceLibrary|VersionedQualifiedName] (","
// inherits+=[MAbstractServiceLibrary|VersionedQualifiedName])*)?
protected class MAbstractServiceLibrary_Group_4 extends GroupToken {
	
	public MAbstractServiceLibrary_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractServiceLibrary_InheritsAssignment_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "inherits"
protected class MAbstractServiceLibrary_InheritsKeyword_4_0 extends KeywordToken  {
	
	public MAbstractServiceLibrary_InheritsKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getInheritsKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractServiceLibrary|VersionedQualifiedName]
protected class MAbstractServiceLibrary_InheritsAssignment_4_1 extends AssignmentToken  {
	
	public MAbstractServiceLibrary_InheritsAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getInheritsAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_InheritsKeyword_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MAbstractServiceLibrary|VersionedQualifiedName])*
protected class MAbstractServiceLibrary_Group_4_2 extends GroupToken {
	
	public MAbstractServiceLibrary_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_InheritsAssignment_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MAbstractServiceLibrary_CommaKeyword_4_2_0 extends KeywordToken  {
	
	public MAbstractServiceLibrary_CommaKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getCommaKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractServiceLibrary_InheritsAssignment_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractServiceLibrary|VersionedQualifiedName]
protected class MAbstractServiceLibrary_InheritsAssignment_4_2_1 extends AssignmentToken  {
	
	public MAbstractServiceLibrary_InheritsAssignment_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getInheritsAssignment_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_CommaKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAbstractServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MAbstractServiceLibrary_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MAbstractServiceLibrary_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractServiceLibrary_NameAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & ("attributes" "{" attributes+=MParameterWithoutSLSP+ "}" ";")? & ("provided" "sais"
// "{" provides+=MServiceLibraryProvidedSAI+ "}" ";")?
protected class MAbstractServiceLibrary_UnorderedGroup_6 extends UnorderedGroupToken {
	
	public MAbstractServiceLibrary_UnorderedGroup_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getUnorderedGroup_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_Group_6_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractServiceLibrary_Group_6_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MAbstractServiceLibrary_Group_6_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MAbstractServiceLibrary_Group_6_0 extends GroupToken {
	
	public MAbstractServiceLibrary_Group_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getGroup_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_SemicolonKeyword_6_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MAbstractServiceLibrary_VersionKeyword_6_0_0 extends KeywordToken  {
	
	public MAbstractServiceLibrary_VersionKeyword_6_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getVersionKeyword_6_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MAbstractServiceLibrary_ColonEqualsSignKeyword_6_0_1 extends KeywordToken  {
	
	public MAbstractServiceLibrary_ColonEqualsSignKeyword_6_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getColonEqualsSignKeyword_6_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_VersionKeyword_6_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MAbstractServiceLibrary_VersionAssignment_6_0_2 extends AssignmentToken  {
	
	public MAbstractServiceLibrary_VersionAssignment_6_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getVersionAssignment_6_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_ColonEqualsSignKeyword_6_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMAbstractServiceLibraryAccess().getVersionVersionParserRuleCall_6_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMAbstractServiceLibraryAccess().getVersionVersionParserRuleCall_6_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MAbstractServiceLibrary_SemicolonKeyword_6_0_3 extends KeywordToken  {
	
	public MAbstractServiceLibrary_SemicolonKeyword_6_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_6_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_VersionAssignment_6_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("attributes" "{" attributes+=MParameterWithoutSLSP+ "}" ";")?
protected class MAbstractServiceLibrary_Group_6_1 extends GroupToken {
	
	public MAbstractServiceLibrary_Group_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getGroup_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_SemicolonKeyword_6_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attributes"
protected class MAbstractServiceLibrary_AttributesKeyword_6_1_0 extends KeywordToken  {
	
	public MAbstractServiceLibrary_AttributesKeyword_6_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getAttributesKeyword_6_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_Group_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MAbstractServiceLibrary_LeftCurlyBracketKeyword_6_1_1 extends KeywordToken  {
	
	public MAbstractServiceLibrary_LeftCurlyBracketKeyword_6_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getLeftCurlyBracketKeyword_6_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_AttributesKeyword_6_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameterWithoutSLSP+
protected class MAbstractServiceLibrary_AttributesAssignment_6_1_2 extends AssignmentToken  {
	
	public MAbstractServiceLibrary_AttributesAssignment_6_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getAttributesAssignment_6_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutSLSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutSLSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAbstractServiceLibraryAccess().getAttributesMParameterWithoutSLSPParserRuleCall_6_1_2_0(); 
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
			case 0: return new MAbstractServiceLibrary_AttributesAssignment_6_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAbstractServiceLibrary_LeftCurlyBracketKeyword_6_1_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MAbstractServiceLibrary_RightCurlyBracketKeyword_6_1_3 extends KeywordToken  {
	
	public MAbstractServiceLibrary_RightCurlyBracketKeyword_6_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getRightCurlyBracketKeyword_6_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_AttributesAssignment_6_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MAbstractServiceLibrary_SemicolonKeyword_6_1_4 extends KeywordToken  {
	
	public MAbstractServiceLibrary_SemicolonKeyword_6_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_6_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_RightCurlyBracketKeyword_6_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("provided" "sais" "{" provides+=MServiceLibraryProvidedSAI+ "}" ";")?
protected class MAbstractServiceLibrary_Group_6_2 extends GroupToken {
	
	public MAbstractServiceLibrary_Group_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getGroup_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_SemicolonKeyword_6_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "provided"
protected class MAbstractServiceLibrary_ProvidedKeyword_6_2_0 extends KeywordToken  {
	
	public MAbstractServiceLibrary_ProvidedKeyword_6_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getProvidedKeyword_6_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_Group_6_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractServiceLibrary_Group_6_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "sais"
protected class MAbstractServiceLibrary_SaisKeyword_6_2_1 extends KeywordToken  {
	
	public MAbstractServiceLibrary_SaisKeyword_6_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getSaisKeyword_6_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_ProvidedKeyword_6_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MAbstractServiceLibrary_LeftCurlyBracketKeyword_6_2_2 extends KeywordToken  {
	
	public MAbstractServiceLibrary_LeftCurlyBracketKeyword_6_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getLeftCurlyBracketKeyword_6_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_SaisKeyword_6_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// provides+=MServiceLibraryProvidedSAI+
protected class MAbstractServiceLibrary_ProvidesAssignment_6_2_3 extends AssignmentToken  {
	
	public MAbstractServiceLibrary_ProvidesAssignment_6_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getProvidesAssignment_6_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibraryProvidedSAI_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("provides",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("provides");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryProvidedSAIRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAbstractServiceLibraryAccess().getProvidesMServiceLibraryProvidedSAIParserRuleCall_6_2_3_0(); 
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
			case 0: return new MAbstractServiceLibrary_ProvidesAssignment_6_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAbstractServiceLibrary_LeftCurlyBracketKeyword_6_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MAbstractServiceLibrary_RightCurlyBracketKeyword_6_2_4 extends KeywordToken  {
	
	public MAbstractServiceLibrary_RightCurlyBracketKeyword_6_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getRightCurlyBracketKeyword_6_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_ProvidesAssignment_6_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MAbstractServiceLibrary_SemicolonKeyword_6_2_5 extends KeywordToken  {
	
	public MAbstractServiceLibrary_SemicolonKeyword_6_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_6_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_RightCurlyBracketKeyword_6_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MAbstractServiceLibrary_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MAbstractServiceLibrary_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_UnorderedGroup_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MAbstractServiceLibrary_SemicolonKeyword_8 extends KeywordToken  {
	
	public MAbstractServiceLibrary_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractServiceLibraryAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractServiceLibrary_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MAbstractServiceLibrary ****************/


/************ begin Rule MServiceLibraryProvidedSAI ****************
 *
 * MServiceLibraryProvidedSAI:
 * 	"provides" sai=[mclevsai::MSAI|VersionedQualifiedName] "{" attributeValueAssignments+=MSLibProvidedSAIAVA* "}" ";";
 *
 **/

// "provides" sai=[mclevsai::MSAI|VersionedQualifiedName] "{" attributeValueAssignments+=MSLibProvidedSAIAVA* "}" ";"
protected class MServiceLibraryProvidedSAI_Group extends GroupToken {
	
	public MServiceLibraryProvidedSAI_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryProvidedSAIAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibraryProvidedSAI_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMServiceLibraryProvidedSAIRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "provides"
protected class MServiceLibraryProvidedSAI_ProvidesKeyword_0 extends KeywordToken  {
	
	public MServiceLibraryProvidedSAI_ProvidesKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryProvidedSAIAccess().getProvidesKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// sai=[mclevsai::MSAI|VersionedQualifiedName]
protected class MServiceLibraryProvidedSAI_SaiAssignment_1 extends AssignmentToken  {
	
	public MServiceLibraryProvidedSAI_SaiAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryProvidedSAIAccess().getSaiAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibraryProvidedSAI_ProvidesKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("sai",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("sai");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryProvidedSAIAccess().getSaiMSAICrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibraryProvidedSAIAccess().getSaiMSAICrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "{"
protected class MServiceLibraryProvidedSAI_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MServiceLibraryProvidedSAI_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryProvidedSAIAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibraryProvidedSAI_SaiAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MSLibProvidedSAIAVA*
protected class MServiceLibraryProvidedSAI_AttributeValueAssignmentsAssignment_3 extends AssignmentToken  {
	
	public MServiceLibraryProvidedSAI_AttributeValueAssignmentsAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryProvidedSAIAccess().getAttributeValueAssignmentsAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVA_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributeValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSLibProvidedSAIAVARule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMServiceLibraryProvidedSAIAccess().getAttributeValueAssignmentsMSLibProvidedSAIAVAParserRuleCall_3_0(); 
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
			case 0: return new MServiceLibraryProvidedSAI_AttributeValueAssignmentsAssignment_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MServiceLibraryProvidedSAI_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MServiceLibraryProvidedSAI_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MServiceLibraryProvidedSAI_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryProvidedSAIAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibraryProvidedSAI_AttributeValueAssignmentsAssignment_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibraryProvidedSAI_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MServiceLibraryProvidedSAI_SemicolonKeyword_5 extends KeywordToken  {
	
	public MServiceLibraryProvidedSAI_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryProvidedSAIAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibraryProvidedSAI_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MServiceLibraryProvidedSAI ****************/


/************ begin Rule MSLibProvidedSAIAVA ****************
 *
 * MSLibProvidedSAIAVA:
 * 	MSLibProvidedSAIAVAExpression | MSLibProvidedSAIAVASwitch;
 *
 **/

// MSLibProvidedSAIAVAExpression | MSLibProvidedSAIAVASwitch
protected class MSLibProvidedSAIAVA_Alternatives extends AlternativesToken {

	public MSLibProvidedSAIAVA_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVAAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVA_MSLibProvidedSAIAVAExpressionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSLibProvidedSAIAVA_MSLibProvidedSAIAVASwitchParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSLibProvidedSAIAVAExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMSLibProvidedSAIAVASwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MSLibProvidedSAIAVAExpression
protected class MSLibProvidedSAIAVA_MSLibProvidedSAIAVAExpressionParserRuleCall_0 extends RuleCallToken {
	
	public MSLibProvidedSAIAVA_MSLibProvidedSAIAVAExpressionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVAAccess().getMSLibProvidedSAIAVAExpressionParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVAExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSLibProvidedSAIAVAExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MSLibProvidedSAIAVAExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MSLibProvidedSAIAVASwitch
protected class MSLibProvidedSAIAVA_MSLibProvidedSAIAVASwitchParserRuleCall_1 extends RuleCallToken {
	
	public MSLibProvidedSAIAVA_MSLibProvidedSAIAVASwitchParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVAAccess().getMSLibProvidedSAIAVASwitchParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSLibProvidedSAIAVASwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MSLibProvidedSAIAVASwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MSLibProvidedSAIAVA ****************/


/************ begin Rule MSLibProvidedSAIAVAExpression ****************
 *
 * MSLibProvidedSAIAVAExpression:
 * 	"attribute" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":="
 * 	attributeValue=MParameterValueExpression ";";
 *
 **/

// "attribute" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" attributeValue=MParameterValueExpression
// ";"
protected class MSLibProvidedSAIAVAExpression_Group extends GroupToken {
	
	public MSLibProvidedSAIAVAExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVAExpression_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSLibProvidedSAIAVAExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "attribute"
protected class MSLibProvidedSAIAVAExpression_AttributeKeyword_0 extends KeywordToken  {
	
	public MSLibProvidedSAIAVAExpression_AttributeKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getAttributeKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// parameter=[common::MParameter|VersionedQualifiedReferenceName]
protected class MSLibProvidedSAIAVAExpression_ParameterAssignment_1 extends AssignmentToken  {
	
	public MSLibProvidedSAIAVAExpression_ParameterAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getParameterAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVAExpression_AttributeKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameter",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameter");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getParameterMParameterCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getParameterMParameterCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":="
protected class MSLibProvidedSAIAVAExpression_ColonEqualsSignKeyword_2 extends KeywordToken  {
	
	public MSLibProvidedSAIAVAExpression_ColonEqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getColonEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVAExpression_ParameterAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValue=MParameterValueExpression
protected class MSLibProvidedSAIAVAExpression_AttributeValueAssignment_3 extends AssignmentToken  {
	
	public MSLibProvidedSAIAVAExpression_AttributeValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getAttributeValueAssignment_3();
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
		if((value = eObjectConsumer.getConsumable("attributeValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getAttributeValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MSLibProvidedSAIAVAExpression_ColonEqualsSignKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MSLibProvidedSAIAVAExpression_SemicolonKeyword_4 extends KeywordToken  {
	
	public MSLibProvidedSAIAVAExpression_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVAExpressionAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVAExpression_AttributeValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MSLibProvidedSAIAVAExpression ****************/


/************ begin Rule MSLibProvidedSAIAVASwitch ****************
 *
 * MSLibProvidedSAIAVASwitch:
 * 	"attribute" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" "switch" "{"
 * 	cases+=MSLibProvidedSAIAVASwitchCase+ "}" ";";
 *
 **/

// "attribute" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" "switch" "{"
// cases+=MSLibProvidedSAIAVASwitchCase+ "}" ";"
protected class MSLibProvidedSAIAVASwitch_Group extends GroupToken {
	
	public MSLibProvidedSAIAVASwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitch_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSLibProvidedSAIAVASwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "attribute"
protected class MSLibProvidedSAIAVASwitch_AttributeKeyword_0 extends KeywordToken  {
	
	public MSLibProvidedSAIAVASwitch_AttributeKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getAttributeKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// parameter=[common::MParameter|VersionedQualifiedReferenceName]
protected class MSLibProvidedSAIAVASwitch_ParameterAssignment_1 extends AssignmentToken  {
	
	public MSLibProvidedSAIAVASwitch_ParameterAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getParameterAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitch_AttributeKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameter",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameter");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getParameterMParameterCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getParameterMParameterCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":="
protected class MSLibProvidedSAIAVASwitch_ColonEqualsSignKeyword_2 extends KeywordToken  {
	
	public MSLibProvidedSAIAVASwitch_ColonEqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getColonEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitch_ParameterAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MSLibProvidedSAIAVASwitch_SwitchKeyword_3 extends KeywordToken  {
	
	public MSLibProvidedSAIAVASwitch_SwitchKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getSwitchKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitch_ColonEqualsSignKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MSLibProvidedSAIAVASwitch_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MSLibProvidedSAIAVASwitch_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitch_SwitchKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MSLibProvidedSAIAVASwitchCase+
protected class MSLibProvidedSAIAVASwitch_CasesAssignment_5 extends AssignmentToken  {
	
	public MSLibProvidedSAIAVASwitch_CasesAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getCasesAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSLibProvidedSAIAVASwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getCasesMSLibProvidedSAIAVASwitchCaseParserRuleCall_5_0(); 
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
			case 0: return new MSLibProvidedSAIAVASwitch_CasesAssignment_5(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MSLibProvidedSAIAVASwitch_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MSLibProvidedSAIAVASwitch_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MSLibProvidedSAIAVASwitch_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitch_CasesAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MSLibProvidedSAIAVASwitch_SemicolonKeyword_7 extends KeywordToken  {
	
	public MSLibProvidedSAIAVASwitch_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitch_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MSLibProvidedSAIAVASwitch ****************/


/************ begin Rule MSLibProvidedSAIAVASwitchCase ****************
 *
 * MSLibProvidedSAIAVASwitchCase:
 * 	"case" platform=[MServiceLibrarySupportedPlatform] ":" attributeValue=MParameterValueExpression ";";
 *
 **/

// "case" platform=[MServiceLibrarySupportedPlatform] ":" attributeValue=MParameterValueExpression ";"
protected class MSLibProvidedSAIAVASwitchCase_Group extends GroupToken {
	
	public MSLibProvidedSAIAVASwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitchCase_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSLibProvidedSAIAVASwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MSLibProvidedSAIAVASwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MSLibProvidedSAIAVASwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MServiceLibrarySupportedPlatform]
protected class MSLibProvidedSAIAVASwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MSLibProvidedSAIAVASwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MSLibProvidedSAIAVASwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MSLibProvidedSAIAVASwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValue=MParameterValueExpression
protected class MSLibProvidedSAIAVASwitchCase_AttributeValueAssignment_3 extends AssignmentToken  {
	
	public MSLibProvidedSAIAVASwitchCase_AttributeValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getAttributeValueAssignment_3();
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
		if((value = eObjectConsumer.getConsumable("attributeValue",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributeValue");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getAttributeValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MSLibProvidedSAIAVASwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MSLibProvidedSAIAVASwitchCase_SemicolonKeyword_4 extends KeywordToken  {
	
	public MSLibProvidedSAIAVASwitchCase_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSLibProvidedSAIAVASwitchCaseAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSLibProvidedSAIAVASwitchCase_AttributeValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MSLibProvidedSAIAVASwitchCase ****************/


/************ begin Rule MServiceLibrary ****************
 *
 * MServiceLibrary:
 * 	"service" "library" name=ID ("inherits" inherits+=[MAbstractServiceLibrary|VersionedQualifiedName] (","
 * 	inherits+=[MAbstractServiceLibrary|VersionedQualifiedName])*)? ("extends"
 * 	extends+=[MServiceLibrary|VersionedQualifiedName] ("," extends+=[MServiceLibrary|VersionedQualifiedName])*)? "{"
 * 	("version" ":=" version=Version ";" & "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
 * 	languages+=[system::MLanguage|VersionedQualifiedName])* ";" & ("attributes" "{" attributes+=MParameter+ "}" ";")? &
 * 	("provided" "sais" "{" provides+=MServiceLibraryProvidedSAI+ "}" ";")? & ("requires" ":="
 * 	requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")? &
 * 	"supported" "platforms" "{" supportedPlatforms+=MServiceLibrarySupportedPlatform+ "}" ";") "}" ";";
 *
 **/

// "service" "library" name=ID ("inherits" inherits+=[MAbstractServiceLibrary|VersionedQualifiedName] (","
// inherits+=[MAbstractServiceLibrary|VersionedQualifiedName])*)? ("extends"
// extends+=[MServiceLibrary|VersionedQualifiedName] ("," extends+=[MServiceLibrary|VersionedQualifiedName])*)? "{"
// ("version" ":=" version=Version ";" & "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";" & ("attributes" "{" attributes+=MParameter+ "}" ";")? &
// ("provided" "sais" "{" provides+=MServiceLibraryProvidedSAI+ "}" ";")? & ("requires" ":="
// requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")? &
// "supported" "platforms" "{" supportedPlatforms+=MServiceLibrarySupportedPlatform+ "}" ";") "}" ";"
protected class MServiceLibrary_Group extends GroupToken {
	
	public MServiceLibrary_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMServiceLibraryRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "service"
protected class MServiceLibrary_ServiceKeyword_0 extends KeywordToken  {
	
	public MServiceLibrary_ServiceKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getServiceKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// "library"
protected class MServiceLibrary_LibraryKeyword_1 extends KeywordToken  {
	
	public MServiceLibrary_LibraryKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getLibraryKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_ServiceKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MServiceLibrary_NameAssignment_2 extends AssignmentToken  {
	
	public MServiceLibrary_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_LibraryKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMServiceLibraryAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMServiceLibraryAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ("inherits" inherits+=[MAbstractServiceLibrary|VersionedQualifiedName] (","
// inherits+=[MAbstractServiceLibrary|VersionedQualifiedName])*)?
protected class MServiceLibrary_Group_3 extends GroupToken {
	
	public MServiceLibrary_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_InheritsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "inherits"
protected class MServiceLibrary_InheritsKeyword_3_0 extends KeywordToken  {
	
	public MServiceLibrary_InheritsKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getInheritsKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractServiceLibrary|VersionedQualifiedName]
protected class MServiceLibrary_InheritsAssignment_3_1 extends AssignmentToken  {
	
	public MServiceLibrary_InheritsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getInheritsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_InheritsKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MAbstractServiceLibrary|VersionedQualifiedName])*
protected class MServiceLibrary_Group_3_2 extends GroupToken {
	
	public MServiceLibrary_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_InheritsAssignment_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MServiceLibrary_CommaKeyword_3_2_0 extends KeywordToken  {
	
	public MServiceLibrary_CommaKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getCommaKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_InheritsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractServiceLibrary|VersionedQualifiedName]
protected class MServiceLibrary_InheritsAssignment_3_2_1 extends AssignmentToken  {
	
	public MServiceLibrary_InheritsAssignment_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getInheritsAssignment_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_CommaKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_3_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_3_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// ("extends" extends+=[MServiceLibrary|VersionedQualifiedName] ("," extends+=[MServiceLibrary|VersionedQualifiedName])*)?
protected class MServiceLibrary_Group_4 extends GroupToken {
	
	public MServiceLibrary_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_ExtendsAssignment_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "extends"
protected class MServiceLibrary_ExtendsKeyword_4_0 extends KeywordToken  {
	
	public MServiceLibrary_ExtendsKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getExtendsKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_NameAssignment_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MServiceLibrary|VersionedQualifiedName]
protected class MServiceLibrary_ExtendsAssignment_4_1 extends AssignmentToken  {
	
	public MServiceLibrary_ExtendsAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getExtendsAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_ExtendsKeyword_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," extends+=[MServiceLibrary|VersionedQualifiedName])*
protected class MServiceLibrary_Group_4_2 extends GroupToken {
	
	public MServiceLibrary_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_ExtendsAssignment_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MServiceLibrary_CommaKeyword_4_2_0 extends KeywordToken  {
	
	public MServiceLibrary_CommaKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getCommaKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_ExtendsAssignment_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MServiceLibrary|VersionedQualifiedName]
protected class MServiceLibrary_ExtendsAssignment_4_2_1 extends AssignmentToken  {
	
	public MServiceLibrary_ExtendsAssignment_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getExtendsAssignment_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_CommaKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_4_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_4_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MServiceLibrary_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MServiceLibrary_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_Group_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MServiceLibrary_NameAssignment_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";" & ("attributes" "{" attributes+=MParameter+ "}" ";")? &
// ("provided" "sais" "{" provides+=MServiceLibraryProvidedSAI+ "}" ";")? & ("requires" ":="
// requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")? &
// "supported" "platforms" "{" supportedPlatforms+=MServiceLibrarySupportedPlatform+ "}" ";"
protected class MServiceLibrary_UnorderedGroup_6 extends UnorderedGroupToken {
	
	public MServiceLibrary_UnorderedGroup_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getUnorderedGroup_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_6_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MServiceLibrary_Group_6_0 extends GroupToken {
	
	public MServiceLibrary_Group_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_SemicolonKeyword_6_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MServiceLibrary_VersionKeyword_6_0_0 extends KeywordToken  {
	
	public MServiceLibrary_VersionKeyword_6_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getVersionKeyword_6_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MServiceLibrary_ColonEqualsSignKeyword_6_0_1 extends KeywordToken  {
	
	public MServiceLibrary_ColonEqualsSignKeyword_6_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getColonEqualsSignKeyword_6_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_VersionKeyword_6_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MServiceLibrary_VersionAssignment_6_0_2 extends AssignmentToken  {
	
	public MServiceLibrary_VersionAssignment_6_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getVersionAssignment_6_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_ColonEqualsSignKeyword_6_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMServiceLibraryAccess().getVersionVersionParserRuleCall_6_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMServiceLibraryAccess().getVersionVersionParserRuleCall_6_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MServiceLibrary_SemicolonKeyword_6_0_3 extends KeywordToken  {
	
	public MServiceLibrary_SemicolonKeyword_6_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_VersionAssignment_6_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";"
protected class MServiceLibrary_Group_6_1 extends GroupToken {
	
	public MServiceLibrary_Group_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_SemicolonKeyword_6_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "languages"
protected class MServiceLibrary_LanguagesKeyword_6_1_0 extends KeywordToken  {
	
	public MServiceLibrary_LanguagesKeyword_6_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getLanguagesKeyword_6_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MServiceLibrary_ColonEqualsSignKeyword_6_1_1 extends KeywordToken  {
	
	public MServiceLibrary_ColonEqualsSignKeyword_6_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getColonEqualsSignKeyword_6_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_LanguagesKeyword_6_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MServiceLibrary_LanguagesAssignment_6_1_2 extends AssignmentToken  {
	
	public MServiceLibrary_LanguagesAssignment_6_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getLanguagesAssignment_6_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_ColonEqualsSignKeyword_6_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageCrossReference_6_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageCrossReference_6_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MServiceLibrary_Group_6_1_3 extends GroupToken {
	
	public MServiceLibrary_Group_6_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup_6_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_LanguagesAssignment_6_1_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MServiceLibrary_CommaKeyword_6_1_3_0 extends KeywordToken  {
	
	public MServiceLibrary_CommaKeyword_6_1_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getCommaKeyword_6_1_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_6_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_LanguagesAssignment_6_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MServiceLibrary_LanguagesAssignment_6_1_3_1 extends AssignmentToken  {
	
	public MServiceLibrary_LanguagesAssignment_6_1_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getLanguagesAssignment_6_1_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_CommaKeyword_6_1_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageCrossReference_6_1_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibraryAccess().getLanguagesMLanguageCrossReference_6_1_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MServiceLibrary_SemicolonKeyword_6_1_4 extends KeywordToken  {
	
	public MServiceLibrary_SemicolonKeyword_6_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_6_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_LanguagesAssignment_6_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("attributes" "{" attributes+=MParameter+ "}" ";")?
protected class MServiceLibrary_Group_6_2 extends GroupToken {
	
	public MServiceLibrary_Group_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_SemicolonKeyword_6_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attributes"
protected class MServiceLibrary_AttributesKeyword_6_2_0 extends KeywordToken  {
	
	public MServiceLibrary_AttributesKeyword_6_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getAttributesKeyword_6_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MServiceLibrary_LeftCurlyBracketKeyword_6_2_1 extends KeywordToken  {
	
	public MServiceLibrary_LeftCurlyBracketKeyword_6_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_6_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_AttributesKeyword_6_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class MServiceLibrary_AttributesAssignment_6_2_2 extends AssignmentToken  {
	
	public MServiceLibrary_AttributesAssignment_6_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getAttributesAssignment_6_2_2();
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
				element = grammarAccess.getMServiceLibraryAccess().getAttributesMParameterParserRuleCall_6_2_2_0(); 
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
			case 0: return new MServiceLibrary_AttributesAssignment_6_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MServiceLibrary_LeftCurlyBracketKeyword_6_2_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MServiceLibrary_RightCurlyBracketKeyword_6_2_3 extends KeywordToken  {
	
	public MServiceLibrary_RightCurlyBracketKeyword_6_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_6_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_AttributesAssignment_6_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MServiceLibrary_SemicolonKeyword_6_2_4 extends KeywordToken  {
	
	public MServiceLibrary_SemicolonKeyword_6_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_RightCurlyBracketKeyword_6_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("provided" "sais" "{" provides+=MServiceLibraryProvidedSAI+ "}" ";")?
protected class MServiceLibrary_Group_6_3 extends GroupToken {
	
	public MServiceLibrary_Group_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_SemicolonKeyword_6_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "provided"
protected class MServiceLibrary_ProvidedKeyword_6_3_0 extends KeywordToken  {
	
	public MServiceLibrary_ProvidedKeyword_6_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getProvidedKeyword_6_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_6_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_Group_6_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "sais"
protected class MServiceLibrary_SaisKeyword_6_3_1 extends KeywordToken  {
	
	public MServiceLibrary_SaisKeyword_6_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getSaisKeyword_6_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_ProvidedKeyword_6_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MServiceLibrary_LeftCurlyBracketKeyword_6_3_2 extends KeywordToken  {
	
	public MServiceLibrary_LeftCurlyBracketKeyword_6_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_6_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_SaisKeyword_6_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// provides+=MServiceLibraryProvidedSAI+
protected class MServiceLibrary_ProvidesAssignment_6_3_3 extends AssignmentToken  {
	
	public MServiceLibrary_ProvidesAssignment_6_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getProvidesAssignment_6_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibraryProvidedSAI_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("provides",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("provides");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryProvidedSAIRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMServiceLibraryAccess().getProvidesMServiceLibraryProvidedSAIParserRuleCall_6_3_3_0(); 
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
			case 0: return new MServiceLibrary_ProvidesAssignment_6_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MServiceLibrary_LeftCurlyBracketKeyword_6_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MServiceLibrary_RightCurlyBracketKeyword_6_3_4 extends KeywordToken  {
	
	public MServiceLibrary_RightCurlyBracketKeyword_6_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_6_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_ProvidesAssignment_6_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MServiceLibrary_SemicolonKeyword_6_3_5 extends KeywordToken  {
	
	public MServiceLibrary_SemicolonKeyword_6_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_RightCurlyBracketKeyword_6_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("requires" ":=" requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")?
protected class MServiceLibrary_Group_6_4 extends GroupToken {
	
	public MServiceLibrary_Group_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_SemicolonKeyword_6_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "requires"
protected class MServiceLibrary_RequiresKeyword_6_4_0 extends KeywordToken  {
	
	public MServiceLibrary_RequiresKeyword_6_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getRequiresKeyword_6_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_6_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_Group_6_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MServiceLibrary_Group_6_1(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MServiceLibrary_ColonEqualsSignKeyword_6_4_1 extends KeywordToken  {
	
	public MServiceLibrary_ColonEqualsSignKeyword_6_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getColonEqualsSignKeyword_6_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_RequiresKeyword_6_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MServiceLibrary_RequiresAssignment_6_4_2 extends AssignmentToken  {
	
	public MServiceLibrary_RequiresAssignment_6_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getRequiresAssignment_6_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_ColonEqualsSignKeyword_6_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryAccess().getRequiresMSAICrossReference_6_4_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibraryAccess().getRequiresMSAICrossReference_6_4_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])*
protected class MServiceLibrary_Group_6_4_3 extends GroupToken {
	
	public MServiceLibrary_Group_6_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup_6_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_RequiresAssignment_6_4_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MServiceLibrary_CommaKeyword_6_4_3_0 extends KeywordToken  {
	
	public MServiceLibrary_CommaKeyword_6_4_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getCommaKeyword_6_4_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_6_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_RequiresAssignment_6_4_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MServiceLibrary_RequiresAssignment_6_4_3_1 extends AssignmentToken  {
	
	public MServiceLibrary_RequiresAssignment_6_4_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getRequiresAssignment_6_4_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_CommaKeyword_6_4_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryAccess().getRequiresMSAICrossReference_6_4_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibraryAccess().getRequiresMSAICrossReference_6_4_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MServiceLibrary_SemicolonKeyword_6_4_4 extends KeywordToken  {
	
	public MServiceLibrary_SemicolonKeyword_6_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_6_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_RequiresAssignment_6_4_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// "supported" "platforms" "{" supportedPlatforms+=MServiceLibrarySupportedPlatform+ "}" ";"
protected class MServiceLibrary_Group_6_5 extends GroupToken {
	
	public MServiceLibrary_Group_6_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getGroup_6_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_SemicolonKeyword_6_5_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "supported"
protected class MServiceLibrary_SupportedKeyword_6_5_0 extends KeywordToken  {
	
	public MServiceLibrary_SupportedKeyword_6_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getSupportedKeyword_6_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_Group_6_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrary_Group_6_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MServiceLibrary_Group_6_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MServiceLibrary_Group_6_1(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// "platforms"
protected class MServiceLibrary_PlatformsKeyword_6_5_1 extends KeywordToken  {
	
	public MServiceLibrary_PlatformsKeyword_6_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getPlatformsKeyword_6_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_SupportedKeyword_6_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MServiceLibrary_LeftCurlyBracketKeyword_6_5_2 extends KeywordToken  {
	
	public MServiceLibrary_LeftCurlyBracketKeyword_6_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getLeftCurlyBracketKeyword_6_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_PlatformsKeyword_6_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedPlatforms+=MServiceLibrarySupportedPlatform+
protected class MServiceLibrary_SupportedPlatformsAssignment_6_5_3 extends AssignmentToken  {
	
	public MServiceLibrary_SupportedPlatformsAssignment_6_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getSupportedPlatformsAssignment_6_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedPlatforms",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibrarySupportedPlatformRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMServiceLibraryAccess().getSupportedPlatformsMServiceLibrarySupportedPlatformParserRuleCall_6_5_3_0(); 
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
			case 0: return new MServiceLibrary_SupportedPlatformsAssignment_6_5_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MServiceLibrary_LeftCurlyBracketKeyword_6_5_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MServiceLibrary_RightCurlyBracketKeyword_6_5_4 extends KeywordToken  {
	
	public MServiceLibrary_RightCurlyBracketKeyword_6_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_6_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_SupportedPlatformsAssignment_6_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MServiceLibrary_SemicolonKeyword_6_5_5 extends KeywordToken  {
	
	public MServiceLibrary_SemicolonKeyword_6_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_6_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_RightCurlyBracketKeyword_6_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MServiceLibrary_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MServiceLibrary_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_UnorderedGroup_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MServiceLibrary_SemicolonKeyword_8 extends KeywordToken  {
	
	public MServiceLibrary_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibraryAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrary_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MServiceLibrary ****************/


/************ begin Rule MDriverServiceLibrary ****************
 *
 * MDriverServiceLibrary:
 * 	"driver" "service" "library" name=ID ("inherits" inherits+=[MAbstractServiceLibrary|VersionedQualifiedName] (","
 * 	inherits+=[MAbstractServiceLibrary|VersionedQualifiedName])*)? ("extends"
 * 	extends+=[MServiceLibrary|VersionedQualifiedName] ("," extends+=[MServiceLibrary|VersionedQualifiedName])*)? "{"
 * 	("version" ":=" version=Version ";" & "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
 * 	languages+=[system::MLanguage|VersionedQualifiedName])* ";" & ("attributes" "{" attributes+=MParameter+ "}" ";")? &
 * 	("provided" "sais" "{" provides+=MServiceLibraryProvidedSAI+ "}" ";")? & ("requires" ":="
 * 	requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")? &
 * 	"supported" "platforms" "{" supportedPlatforms+=MDriverSLibSupportedPlatform+ "}" ";") "}" ";";
 *
 **/

// "driver" "service" "library" name=ID ("inherits" inherits+=[MAbstractServiceLibrary|VersionedQualifiedName] (","
// inherits+=[MAbstractServiceLibrary|VersionedQualifiedName])*)? ("extends"
// extends+=[MServiceLibrary|VersionedQualifiedName] ("," extends+=[MServiceLibrary|VersionedQualifiedName])*)? "{"
// ("version" ":=" version=Version ";" & "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";" & ("attributes" "{" attributes+=MParameter+ "}" ";")? &
// ("provided" "sais" "{" provides+=MServiceLibraryProvidedSAI+ "}" ";")? & ("requires" ":="
// requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")? &
// "supported" "platforms" "{" supportedPlatforms+=MDriverSLibSupportedPlatform+ "}" ";") "}" ";"
protected class MDriverServiceLibrary_Group extends GroupToken {
	
	public MDriverServiceLibrary_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_SemicolonKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDriverServiceLibraryRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "driver"
protected class MDriverServiceLibrary_DriverKeyword_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_DriverKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getDriverKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// "service"
protected class MDriverServiceLibrary_ServiceKeyword_1 extends KeywordToken  {
	
	public MDriverServiceLibrary_ServiceKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getServiceKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_DriverKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "library"
protected class MDriverServiceLibrary_LibraryKeyword_2 extends KeywordToken  {
	
	public MDriverServiceLibrary_LibraryKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getLibraryKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_ServiceKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MDriverServiceLibrary_NameAssignment_3 extends AssignmentToken  {
	
	public MDriverServiceLibrary_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_LibraryKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDriverServiceLibraryAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMDriverServiceLibraryAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ("inherits" inherits+=[MAbstractServiceLibrary|VersionedQualifiedName] (","
// inherits+=[MAbstractServiceLibrary|VersionedQualifiedName])*)?
protected class MDriverServiceLibrary_Group_4 extends GroupToken {
	
	public MDriverServiceLibrary_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_InheritsAssignment_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "inherits"
protected class MDriverServiceLibrary_InheritsKeyword_4_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_InheritsKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getInheritsKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractServiceLibrary|VersionedQualifiedName]
protected class MDriverServiceLibrary_InheritsAssignment_4_1 extends AssignmentToken  {
	
	public MDriverServiceLibrary_InheritsAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getInheritsAssignment_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_InheritsKeyword_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MAbstractServiceLibrary|VersionedQualifiedName])*
protected class MDriverServiceLibrary_Group_4_2 extends GroupToken {
	
	public MDriverServiceLibrary_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_InheritsAssignment_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MDriverServiceLibrary_CommaKeyword_4_2_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_CommaKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_InheritsAssignment_4_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractServiceLibrary|VersionedQualifiedName]
protected class MDriverServiceLibrary_InheritsAssignment_4_2_1 extends AssignmentToken  {
	
	public MDriverServiceLibrary_InheritsAssignment_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getInheritsAssignment_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_CommaKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverServiceLibraryAccess().getInheritsMAbstractServiceLibraryCrossReference_4_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// ("extends" extends+=[MServiceLibrary|VersionedQualifiedName] ("," extends+=[MServiceLibrary|VersionedQualifiedName])*)?
protected class MDriverServiceLibrary_Group_5 extends GroupToken {
	
	public MDriverServiceLibrary_Group_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_ExtendsAssignment_5_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "extends"
protected class MDriverServiceLibrary_ExtendsKeyword_5_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_ExtendsKeyword_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getExtendsKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_NameAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MServiceLibrary|VersionedQualifiedName]
protected class MDriverServiceLibrary_ExtendsAssignment_5_1 extends AssignmentToken  {
	
	public MDriverServiceLibrary_ExtendsAssignment_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getExtendsAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_ExtendsKeyword_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_5_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_5_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," extends+=[MServiceLibrary|VersionedQualifiedName])*
protected class MDriverServiceLibrary_Group_5_2 extends GroupToken {
	
	public MDriverServiceLibrary_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_ExtendsAssignment_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MDriverServiceLibrary_CommaKeyword_5_2_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_CommaKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_ExtendsAssignment_5_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MServiceLibrary|VersionedQualifiedName]
protected class MDriverServiceLibrary_ExtendsAssignment_5_2_1 extends AssignmentToken  {
	
	public MDriverServiceLibrary_ExtendsAssignment_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getExtendsAssignment_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_CommaKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_5_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverServiceLibraryAccess().getExtendsMServiceLibraryCrossReference_5_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MDriverServiceLibrary_LeftCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MDriverServiceLibrary_LeftCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_Group_4(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverServiceLibrary_NameAssignment_3(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";" & ("attributes" "{" attributes+=MParameter+ "}" ";")? &
// ("provided" "sais" "{" provides+=MServiceLibraryProvidedSAI+ "}" ";")? & ("requires" ":="
// requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")? &
// "supported" "platforms" "{" supportedPlatforms+=MDriverSLibSupportedPlatform+ "}" ";"
protected class MDriverServiceLibrary_UnorderedGroup_7 extends UnorderedGroupToken {
	
	public MDriverServiceLibrary_UnorderedGroup_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getUnorderedGroup_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_7_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MDriverServiceLibrary_Group_7_0 extends GroupToken {
	
	public MDriverServiceLibrary_Group_7_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_SemicolonKeyword_7_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MDriverServiceLibrary_VersionKeyword_7_0_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_VersionKeyword_7_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getVersionKeyword_7_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_LeftCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverServiceLibrary_ColonEqualsSignKeyword_7_0_1 extends KeywordToken  {
	
	public MDriverServiceLibrary_ColonEqualsSignKeyword_7_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getColonEqualsSignKeyword_7_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_VersionKeyword_7_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MDriverServiceLibrary_VersionAssignment_7_0_2 extends AssignmentToken  {
	
	public MDriverServiceLibrary_VersionAssignment_7_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getVersionAssignment_7_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_ColonEqualsSignKeyword_7_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDriverServiceLibraryAccess().getVersionVersionParserRuleCall_7_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMDriverServiceLibraryAccess().getVersionVersionParserRuleCall_7_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MDriverServiceLibrary_SemicolonKeyword_7_0_3 extends KeywordToken  {
	
	public MDriverServiceLibrary_SemicolonKeyword_7_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_VersionAssignment_7_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";"
protected class MDriverServiceLibrary_Group_7_1 extends GroupToken {
	
	public MDriverServiceLibrary_Group_7_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_SemicolonKeyword_7_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "languages"
protected class MDriverServiceLibrary_LanguagesKeyword_7_1_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_LanguagesKeyword_7_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getLanguagesKeyword_7_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_7_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverServiceLibrary_ColonEqualsSignKeyword_7_1_1 extends KeywordToken  {
	
	public MDriverServiceLibrary_ColonEqualsSignKeyword_7_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getColonEqualsSignKeyword_7_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_LanguagesKeyword_7_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MDriverServiceLibrary_LanguagesAssignment_7_1_2 extends AssignmentToken  {
	
	public MDriverServiceLibrary_LanguagesAssignment_7_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getLanguagesAssignment_7_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_ColonEqualsSignKeyword_7_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageCrossReference_7_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageCrossReference_7_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MDriverServiceLibrary_Group_7_1_3 extends GroupToken {
	
	public MDriverServiceLibrary_Group_7_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_LanguagesAssignment_7_1_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MDriverServiceLibrary_CommaKeyword_7_1_3_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_CommaKeyword_7_1_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_7_1_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_7_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_LanguagesAssignment_7_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MDriverServiceLibrary_LanguagesAssignment_7_1_3_1 extends AssignmentToken  {
	
	public MDriverServiceLibrary_LanguagesAssignment_7_1_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getLanguagesAssignment_7_1_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_CommaKeyword_7_1_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageCrossReference_7_1_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverServiceLibraryAccess().getLanguagesMLanguageCrossReference_7_1_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverServiceLibrary_SemicolonKeyword_7_1_4 extends KeywordToken  {
	
	public MDriverServiceLibrary_SemicolonKeyword_7_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_7_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_LanguagesAssignment_7_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("attributes" "{" attributes+=MParameter+ "}" ";")?
protected class MDriverServiceLibrary_Group_7_2 extends GroupToken {
	
	public MDriverServiceLibrary_Group_7_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_SemicolonKeyword_7_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attributes"
protected class MDriverServiceLibrary_AttributesKeyword_7_2_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_AttributesKeyword_7_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getAttributesKeyword_7_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_7_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDriverServiceLibrary_LeftCurlyBracketKeyword_7_2_1 extends KeywordToken  {
	
	public MDriverServiceLibrary_LeftCurlyBracketKeyword_7_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_7_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_AttributesKeyword_7_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameter+
protected class MDriverServiceLibrary_AttributesAssignment_7_2_2 extends AssignmentToken  {
	
	public MDriverServiceLibrary_AttributesAssignment_7_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getAttributesAssignment_7_2_2();
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
				element = grammarAccess.getMDriverServiceLibraryAccess().getAttributesMParameterParserRuleCall_7_2_2_0(); 
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
			case 0: return new MDriverServiceLibrary_AttributesAssignment_7_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverServiceLibrary_LeftCurlyBracketKeyword_7_2_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDriverServiceLibrary_RightCurlyBracketKeyword_7_2_3 extends KeywordToken  {
	
	public MDriverServiceLibrary_RightCurlyBracketKeyword_7_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_7_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_AttributesAssignment_7_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverServiceLibrary_SemicolonKeyword_7_2_4 extends KeywordToken  {
	
	public MDriverServiceLibrary_SemicolonKeyword_7_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_RightCurlyBracketKeyword_7_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("provided" "sais" "{" provides+=MServiceLibraryProvidedSAI+ "}" ";")?
protected class MDriverServiceLibrary_Group_7_3 extends GroupToken {
	
	public MDriverServiceLibrary_Group_7_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_SemicolonKeyword_7_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "provided"
protected class MDriverServiceLibrary_ProvidedKeyword_7_3_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_ProvidedKeyword_7_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getProvidedKeyword_7_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_7_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_Group_7_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "sais"
protected class MDriverServiceLibrary_SaisKeyword_7_3_1 extends KeywordToken  {
	
	public MDriverServiceLibrary_SaisKeyword_7_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getSaisKeyword_7_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_ProvidedKeyword_7_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDriverServiceLibrary_LeftCurlyBracketKeyword_7_3_2 extends KeywordToken  {
	
	public MDriverServiceLibrary_LeftCurlyBracketKeyword_7_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_7_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_SaisKeyword_7_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// provides+=MServiceLibraryProvidedSAI+
protected class MDriverServiceLibrary_ProvidesAssignment_7_3_3 extends AssignmentToken  {
	
	public MDriverServiceLibrary_ProvidesAssignment_7_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getProvidesAssignment_7_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibraryProvidedSAI_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("provides",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("provides");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibraryProvidedSAIRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDriverServiceLibraryAccess().getProvidesMServiceLibraryProvidedSAIParserRuleCall_7_3_3_0(); 
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
			case 0: return new MDriverServiceLibrary_ProvidesAssignment_7_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverServiceLibrary_LeftCurlyBracketKeyword_7_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDriverServiceLibrary_RightCurlyBracketKeyword_7_3_4 extends KeywordToken  {
	
	public MDriverServiceLibrary_RightCurlyBracketKeyword_7_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_7_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_ProvidesAssignment_7_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverServiceLibrary_SemicolonKeyword_7_3_5 extends KeywordToken  {
	
	public MDriverServiceLibrary_SemicolonKeyword_7_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_RightCurlyBracketKeyword_7_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("requires" ":=" requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")?
protected class MDriverServiceLibrary_Group_7_4 extends GroupToken {
	
	public MDriverServiceLibrary_Group_7_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_SemicolonKeyword_7_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "requires"
protected class MDriverServiceLibrary_RequiresKeyword_7_4_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_RequiresKeyword_7_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getRequiresKeyword_7_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_7_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_Group_7_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverServiceLibrary_Group_7_1(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverServiceLibrary_ColonEqualsSignKeyword_7_4_1 extends KeywordToken  {
	
	public MDriverServiceLibrary_ColonEqualsSignKeyword_7_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getColonEqualsSignKeyword_7_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_RequiresKeyword_7_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MDriverServiceLibrary_RequiresAssignment_7_4_2 extends AssignmentToken  {
	
	public MDriverServiceLibrary_RequiresAssignment_7_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getRequiresAssignment_7_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_ColonEqualsSignKeyword_7_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAICrossReference_7_4_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAICrossReference_7_4_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])*
protected class MDriverServiceLibrary_Group_7_4_3 extends GroupToken {
	
	public MDriverServiceLibrary_Group_7_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_RequiresAssignment_7_4_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MDriverServiceLibrary_CommaKeyword_7_4_3_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_CommaKeyword_7_4_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getCommaKeyword_7_4_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_7_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_RequiresAssignment_7_4_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MDriverServiceLibrary_RequiresAssignment_7_4_3_1 extends AssignmentToken  {
	
	public MDriverServiceLibrary_RequiresAssignment_7_4_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getRequiresAssignment_7_4_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_CommaKeyword_7_4_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAICrossReference_7_4_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverServiceLibraryAccess().getRequiresMSAICrossReference_7_4_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverServiceLibrary_SemicolonKeyword_7_4_4 extends KeywordToken  {
	
	public MDriverServiceLibrary_SemicolonKeyword_7_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_7_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_RequiresAssignment_7_4_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// "supported" "platforms" "{" supportedPlatforms+=MDriverSLibSupportedPlatform+ "}" ";"
protected class MDriverServiceLibrary_Group_7_5 extends GroupToken {
	
	public MDriverServiceLibrary_Group_7_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getGroup_7_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_SemicolonKeyword_7_5_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "supported"
protected class MDriverServiceLibrary_SupportedKeyword_7_5_0 extends KeywordToken  {
	
	public MDriverServiceLibrary_SupportedKeyword_7_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getSupportedKeyword_7_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_Group_7_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverServiceLibrary_Group_7_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverServiceLibrary_Group_7_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MDriverServiceLibrary_Group_7_1(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// "platforms"
protected class MDriverServiceLibrary_PlatformsKeyword_7_5_1 extends KeywordToken  {
	
	public MDriverServiceLibrary_PlatformsKeyword_7_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getPlatformsKeyword_7_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_SupportedKeyword_7_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDriverServiceLibrary_LeftCurlyBracketKeyword_7_5_2 extends KeywordToken  {
	
	public MDriverServiceLibrary_LeftCurlyBracketKeyword_7_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getLeftCurlyBracketKeyword_7_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_PlatformsKeyword_7_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedPlatforms+=MDriverSLibSupportedPlatform+
protected class MDriverServiceLibrary_SupportedPlatformsAssignment_7_5_3 extends AssignmentToken  {
	
	public MDriverServiceLibrary_SupportedPlatformsAssignment_7_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getSupportedPlatformsAssignment_7_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedPlatforms",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedPlatformRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDriverServiceLibraryAccess().getSupportedPlatformsMDriverSLibSupportedPlatformParserRuleCall_7_5_3_0(); 
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
			case 0: return new MDriverServiceLibrary_SupportedPlatformsAssignment_7_5_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverServiceLibrary_LeftCurlyBracketKeyword_7_5_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDriverServiceLibrary_RightCurlyBracketKeyword_7_5_4 extends KeywordToken  {
	
	public MDriverServiceLibrary_RightCurlyBracketKeyword_7_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_7_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_SupportedPlatformsAssignment_7_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverServiceLibrary_SemicolonKeyword_7_5_5 extends KeywordToken  {
	
	public MDriverServiceLibrary_SemicolonKeyword_7_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_7_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_RightCurlyBracketKeyword_7_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MDriverServiceLibrary_RightCurlyBracketKeyword_8 extends KeywordToken  {
	
	public MDriverServiceLibrary_RightCurlyBracketKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getRightCurlyBracketKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_UnorderedGroup_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverServiceLibrary_SemicolonKeyword_9 extends KeywordToken  {
	
	public MDriverServiceLibrary_SemicolonKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverServiceLibraryAccess().getSemicolonKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverServiceLibrary_RightCurlyBracketKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MDriverServiceLibrary ****************/


/************ begin Rule MServiceLibrarySupportedPlatform ****************
 *
 * MServiceLibrarySupportedPlatform:
 * 	{MServiceLibrarySupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
 * 	osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
 * 	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
 * 	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
 * 	compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
 * 	microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
 * 	board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("attributes" "{" attributes+=MParameterWithoutSLSP+ "}" ";")? &
 * 	("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
 * 	languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("requires" ":="
 * 	requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")?) "}"
 * 	";";
 *
 **/

// {MServiceLibrarySupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
// osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
// os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
// architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
// compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
// board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("attributes" "{" attributes+=MParameterWithoutSLSP+ "}" ";")? &
// ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("requires" ":="
// requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")?) "}"
// ";"
protected class MServiceLibrarySupportedPlatform_Group extends GroupToken {
	
	public MServiceLibrarySupportedPlatform_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMServiceLibrarySupportedPlatformAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MServiceLibrarySupportedPlatform}
protected class MServiceLibrarySupportedPlatform_MServiceLibrarySupportedPlatformAction_0 extends ActionToken  {

	public MServiceLibrarySupportedPlatform_MServiceLibrarySupportedPlatformAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMServiceLibrarySupportedPlatformAction_0();
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
protected class MServiceLibrarySupportedPlatform_SupportedKeyword_1 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_SupportedKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSupportedKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_MServiceLibrarySupportedPlatformAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "platform"
protected class MServiceLibrarySupportedPlatform_PlatformKeyword_2 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_PlatformKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getPlatformKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_SupportedKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MServiceLibrarySupportedPlatform_NameAssignment_3 extends AssignmentToken  {
	
	public MServiceLibrarySupportedPlatform_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_PlatformKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMServiceLibrarySupportedPlatformAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMServiceLibrarySupportedPlatformAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MServiceLibrarySupportedPlatform_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
// os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
// architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
// compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
// board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("attributes" "{" attributes+=MParameterWithoutSLSP+ "}" ";")? &
// ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")? & ("requires" ":="
// requires+=[mclevsai::MSAI|VersionedQualifiedName] ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")?
protected class MServiceLibrarySupportedPlatform_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MServiceLibrarySupportedPlatform_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_8(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MServiceLibrarySupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MServiceLibrarySupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// "osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";"
protected class MServiceLibrarySupportedPlatform_Group_5_0 extends GroupToken {
	
	public MServiceLibrarySupportedPlatform_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "osapi"
protected class MServiceLibrarySupportedPlatform_OsapiKeyword_5_0_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_OsapiKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_OsapiKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_Alternatives_5_0_2 extends AlternativesToken {

	public MServiceLibrarySupportedPlatform_Alternatives_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_AnyKeyword_5_0_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_OsapiAssignment_5_0_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MServiceLibrarySupportedPlatform_AnyKeyword_5_0_2_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_AnyKeyword_5_0_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_0_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_OsapiAssignment_5_0_2_1 extends AssignmentToken  {
	
	public MServiceLibrarySupportedPlatform_OsapiAssignment_5_0_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiAssignment_5_0_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("osapi",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("osapi");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MServiceLibrarySupportedPlatform_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Alternatives_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "os" ":=" ("any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";"
protected class MServiceLibrarySupportedPlatform_Group_5_1 extends GroupToken {
	
	public MServiceLibrarySupportedPlatform_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_SemicolonKeyword_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "os"
protected class MServiceLibrarySupportedPlatform_OsKeyword_5_1_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_OsKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_1_1 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_OsKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_Alternatives_5_1_2 extends AlternativesToken {

	public MServiceLibrarySupportedPlatform_Alternatives_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_AnyKeyword_5_1_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_OsAssignment_5_1_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MServiceLibrarySupportedPlatform_AnyKeyword_5_1_2_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_AnyKeyword_5_1_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_1_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// os=[pdl::MOperatingSystem|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_OsAssignment_5_1_2_1 extends AssignmentToken  {
	
	public MServiceLibrarySupportedPlatform_OsAssignment_5_1_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsAssignment_5_1_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("os",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("os");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibrarySupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MServiceLibrarySupportedPlatform_SemicolonKeyword_5_1_3 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_SemicolonKeyword_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Alternatives_5_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "architecture" ":=" ("any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";"
protected class MServiceLibrarySupportedPlatform_Group_5_2 extends GroupToken {
	
	public MServiceLibrarySupportedPlatform_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_SemicolonKeyword_5_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "architecture"
protected class MServiceLibrarySupportedPlatform_ArchitectureKeyword_5_2_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_ArchitectureKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_2_1 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ArchitectureKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_Alternatives_5_2_2 extends AlternativesToken {

	public MServiceLibrarySupportedPlatform_Alternatives_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_AnyKeyword_5_2_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_ArchitectureAssignment_5_2_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MServiceLibrarySupportedPlatform_AnyKeyword_5_2_2_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_AnyKeyword_5_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// architecture=[pdl::MArchitecture|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_ArchitectureAssignment_5_2_2_1 extends AssignmentToken  {
	
	public MServiceLibrarySupportedPlatform_ArchitectureAssignment_5_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureAssignment_5_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("architecture",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("architecture");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibrarySupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MServiceLibrarySupportedPlatform_SemicolonKeyword_5_2_3 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_SemicolonKeyword_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Alternatives_5_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("compiler" ":=" compiler=[pdl::MCompiler|VersionedQualifiedName] ";")?
protected class MServiceLibrarySupportedPlatform_Group_5_3 extends GroupToken {
	
	public MServiceLibrarySupportedPlatform_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_SemicolonKeyword_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "compiler"
protected class MServiceLibrarySupportedPlatform_CompilerKeyword_5_3_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_CompilerKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_3_1 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_CompilerKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// compiler=[pdl::MCompiler|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_CompilerAssignment_5_3_2 extends AssignmentToken  {
	
	public MServiceLibrarySupportedPlatform_CompilerAssignment_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerAssignment_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("compiler",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("compiler");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MServiceLibrarySupportedPlatform_SemicolonKeyword_5_3_3 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_SemicolonKeyword_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_CompilerAssignment_5_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "microprocessor" ":=" ("any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";"
protected class MServiceLibrarySupportedPlatform_Group_5_4 extends GroupToken {
	
	public MServiceLibrarySupportedPlatform_Group_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_SemicolonKeyword_5_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "microprocessor"
protected class MServiceLibrarySupportedPlatform_MicroprocessorKeyword_5_4_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_MicroprocessorKeyword_5_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorKeyword_5_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_Group_5_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_4_1 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_MicroprocessorKeyword_5_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_Alternatives_5_4_2 extends AlternativesToken {

	public MServiceLibrarySupportedPlatform_Alternatives_5_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_AnyKeyword_5_4_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_MicroprocessorAssignment_5_4_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MServiceLibrarySupportedPlatform_AnyKeyword_5_4_2_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_AnyKeyword_5_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_MicroprocessorAssignment_5_4_2_1 extends AssignmentToken  {
	
	public MServiceLibrarySupportedPlatform_MicroprocessorAssignment_5_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("microprocessor",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("microprocessor");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibrarySupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MServiceLibrarySupportedPlatform_SemicolonKeyword_5_4_3 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_SemicolonKeyword_5_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Alternatives_5_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "board" ":=" ("any" | board=[pdl::MBoard|VersionedQualifiedName]) ";"
protected class MServiceLibrarySupportedPlatform_Group_5_5 extends GroupToken {
	
	public MServiceLibrarySupportedPlatform_Group_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_SemicolonKeyword_5_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "board"
protected class MServiceLibrarySupportedPlatform_BoardKeyword_5_5_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_BoardKeyword_5_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardKeyword_5_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_5_1 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_BoardKeyword_5_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | board=[pdl::MBoard|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_Alternatives_5_5_2 extends AlternativesToken {

	public MServiceLibrarySupportedPlatform_Alternatives_5_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAlternatives_5_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_AnyKeyword_5_5_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_BoardAssignment_5_5_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MServiceLibrarySupportedPlatform_AnyKeyword_5_5_2_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_AnyKeyword_5_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAnyKeyword_5_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// board=[pdl::MBoard|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_BoardAssignment_5_5_2_1 extends AssignmentToken  {
	
	public MServiceLibrarySupportedPlatform_BoardAssignment_5_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardAssignment_5_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("board",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("board");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibrarySupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MServiceLibrarySupportedPlatform_SemicolonKeyword_5_5_3 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_SemicolonKeyword_5_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Alternatives_5_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("attributes" "{" attributes+=MParameterWithoutSLSP+ "}" ";")?
protected class MServiceLibrarySupportedPlatform_Group_5_6 extends GroupToken {
	
	public MServiceLibrarySupportedPlatform_Group_5_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_SemicolonKeyword_5_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attributes"
protected class MServiceLibrarySupportedPlatform_AttributesKeyword_5_6_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_AttributesKeyword_5_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesKeyword_5_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MServiceLibrarySupportedPlatform_LeftCurlyBracketKeyword_5_6_1 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_LeftCurlyBracketKeyword_5_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLeftCurlyBracketKeyword_5_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_AttributesKeyword_5_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameterWithoutSLSP+
protected class MServiceLibrarySupportedPlatform_AttributesAssignment_5_6_2 extends AssignmentToken  {
	
	public MServiceLibrarySupportedPlatform_AttributesAssignment_5_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesAssignment_5_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutSLSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutSLSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMServiceLibrarySupportedPlatformAccess().getAttributesMParameterWithoutSLSPParserRuleCall_5_6_2_0(); 
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
			case 0: return new MServiceLibrarySupportedPlatform_AttributesAssignment_5_6_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MServiceLibrarySupportedPlatform_LeftCurlyBracketKeyword_5_6_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MServiceLibrarySupportedPlatform_RightCurlyBracketKeyword_5_6_3 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_RightCurlyBracketKeyword_5_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRightCurlyBracketKeyword_5_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_AttributesAssignment_5_6_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MServiceLibrarySupportedPlatform_SemicolonKeyword_5_6_4 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_SemicolonKeyword_5_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_RightCurlyBracketKeyword_5_6_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")?
protected class MServiceLibrarySupportedPlatform_Group_5_7 extends GroupToken {
	
	public MServiceLibrarySupportedPlatform_Group_5_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_SemicolonKeyword_5_7_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "languages"
protected class MServiceLibrarySupportedPlatform_LanguagesKeyword_5_7_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_LanguagesKeyword_5_7_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesKeyword_5_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_7_1 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_7_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_LanguagesKeyword_5_7_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_LanguagesAssignment_5_7_2 extends AssignmentToken  {
	
	public MServiceLibrarySupportedPlatform_LanguagesAssignment_5_7_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesAssignment_5_7_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_7_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_7_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_7_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MServiceLibrarySupportedPlatform_Group_5_7_3 extends GroupToken {
	
	public MServiceLibrarySupportedPlatform_Group_5_7_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_7_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_LanguagesAssignment_5_7_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MServiceLibrarySupportedPlatform_CommaKeyword_5_7_3_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_CommaKeyword_5_7_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCommaKeyword_5_7_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_7_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_LanguagesAssignment_5_7_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_LanguagesAssignment_5_7_3_1 extends AssignmentToken  {
	
	public MServiceLibrarySupportedPlatform_LanguagesAssignment_5_7_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesAssignment_5_7_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_CommaKeyword_5_7_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_7_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibrarySupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_7_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MServiceLibrarySupportedPlatform_SemicolonKeyword_5_7_4 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_SemicolonKeyword_5_7_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_7_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_7_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_LanguagesAssignment_5_7_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("requires" ":=" requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")?
protected class MServiceLibrarySupportedPlatform_Group_5_8 extends GroupToken {
	
	public MServiceLibrarySupportedPlatform_Group_5_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_SemicolonKeyword_5_8_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "requires"
protected class MServiceLibrarySupportedPlatform_RequiresKeyword_5_8_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_RequiresKeyword_5_8_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresKeyword_5_8_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MServiceLibrarySupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_8_1 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_8_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getColonEqualsSignKeyword_5_8_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_RequiresKeyword_5_8_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_RequiresAssignment_5_8_2 extends AssignmentToken  {
	
	public MServiceLibrarySupportedPlatform_RequiresAssignment_5_8_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresAssignment_5_8_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_ColonEqualsSignKeyword_5_8_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAICrossReference_5_8_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAICrossReference_5_8_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])*
protected class MServiceLibrarySupportedPlatform_Group_5_8_3 extends GroupToken {
	
	public MServiceLibrarySupportedPlatform_Group_5_8_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getGroup_5_8_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_RequiresAssignment_5_8_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MServiceLibrarySupportedPlatform_CommaKeyword_5_8_3_0 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_CommaKeyword_5_8_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getCommaKeyword_5_8_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_8_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_RequiresAssignment_5_8_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MServiceLibrarySupportedPlatform_RequiresAssignment_5_8_3_1 extends AssignmentToken  {
	
	public MServiceLibrarySupportedPlatform_RequiresAssignment_5_8_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresAssignment_5_8_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_CommaKeyword_5_8_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAICrossReference_5_8_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRequiresMSAICrossReference_5_8_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MServiceLibrarySupportedPlatform_SemicolonKeyword_5_8_4 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_SemicolonKeyword_5_8_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_5_8_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_Group_5_8_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MServiceLibrarySupportedPlatform_RequiresAssignment_5_8_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MServiceLibrarySupportedPlatform_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MServiceLibrarySupportedPlatform_SemicolonKeyword_7 extends KeywordToken  {
	
	public MServiceLibrarySupportedPlatform_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMServiceLibrarySupportedPlatformAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MServiceLibrarySupportedPlatform_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MServiceLibrarySupportedPlatform ****************/


/************ begin Rule MDriverSLibSupportedPlatform ****************
 *
 * MDriverSLibSupportedPlatform:
 * 	{MDriverSLibSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
 * 	osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
 * 	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
 * 	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
 * 	compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
 * 	microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
 * 	board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("attributes" "{" attributes+=MParameterWithoutSLSP+ "}" ";")? &
 * 	("supported" "devices" "{" supportedDevices+=MDriverSLibSupportedDevice+ "}" ";")? & ("languages" ":="
 * 	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
 * 	";")? & ("requires" ":=" requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
 * 	requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")?) "}" ";";
 *
 **/

// {MDriverSLibSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
// osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
// os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
// architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
// compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
// board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("attributes" "{" attributes+=MParameterWithoutSLSP+ "}" ";")? &
// ("supported" "devices" "{" supportedDevices+=MDriverSLibSupportedDevice+ "}" ";")? & ("languages" ":="
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ";")? & ("requires" ":=" requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")?) "}" ";"
protected class MDriverSLibSupportedPlatform_Group extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDriverSLibSupportedPlatformAccess().getMDriverSLibSupportedPlatformAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MDriverSLibSupportedPlatform}
protected class MDriverSLibSupportedPlatform_MDriverSLibSupportedPlatformAction_0 extends ActionToken  {

	public MDriverSLibSupportedPlatform_MDriverSLibSupportedPlatformAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getMDriverSLibSupportedPlatformAction_0();
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
protected class MDriverSLibSupportedPlatform_SupportedKeyword_1 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SupportedKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_MDriverSLibSupportedPlatformAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "platform"
protected class MDriverSLibSupportedPlatform_PlatformKeyword_2 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_PlatformKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getPlatformKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SupportedKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MDriverSLibSupportedPlatform_NameAssignment_3 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_PlatformKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDriverSLibSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MDriverSLibSupportedPlatform_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
// os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
// architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
// compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
// board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("attributes" "{" attributes+=MParameterWithoutSLSP+ "}" ";")? &
// ("supported" "devices" "{" supportedDevices+=MDriverSLibSupportedDevice+ "}" ";")? & ("languages" ":="
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ";")? & ("requires" ":=" requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")?
protected class MDriverSLibSupportedPlatform_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MDriverSLibSupportedPlatform_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_9(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_Group_5_8(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverSLibSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MDriverSLibSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MDriverSLibSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 4, inst);
			default: return null;
		}	
	}

}

// "osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";"
protected class MDriverSLibSupportedPlatform_Group_5_0 extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "osapi"
protected class MDriverSLibSupportedPlatform_OsapiKeyword_5_0_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_OsapiKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_OsapiKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_Alternatives_5_0_2 extends AlternativesToken {

	public MDriverSLibSupportedPlatform_Alternatives_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_AnyKeyword_5_0_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_OsapiAssignment_5_0_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MDriverSLibSupportedPlatform_AnyKeyword_5_0_2_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_AnyKeyword_5_0_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_0_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_OsapiAssignment_5_0_2_1 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_OsapiAssignment_5_0_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiAssignment_5_0_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("osapi",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("osapi");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSLibSupportedPlatform_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Alternatives_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "os" ":=" ("any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";"
protected class MDriverSLibSupportedPlatform_Group_5_1 extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SemicolonKeyword_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "os"
protected class MDriverSLibSupportedPlatform_OsKeyword_5_1_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_OsKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_1_1 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_OsKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_Alternatives_5_1_2 extends AlternativesToken {

	public MDriverSLibSupportedPlatform_Alternatives_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_AnyKeyword_5_1_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_OsAssignment_5_1_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MDriverSLibSupportedPlatform_AnyKeyword_5_1_2_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_AnyKeyword_5_1_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_1_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// os=[pdl::MOperatingSystem|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_OsAssignment_5_1_2_1 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_OsAssignment_5_1_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsAssignment_5_1_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("os",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("os");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSLibSupportedPlatform_SemicolonKeyword_5_1_3 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SemicolonKeyword_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Alternatives_5_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "architecture" ":=" ("any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";"
protected class MDriverSLibSupportedPlatform_Group_5_2 extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SemicolonKeyword_5_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "architecture"
protected class MDriverSLibSupportedPlatform_ArchitectureKeyword_5_2_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_ArchitectureKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_2_1 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ArchitectureKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_Alternatives_5_2_2 extends AlternativesToken {

	public MDriverSLibSupportedPlatform_Alternatives_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_AnyKeyword_5_2_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_ArchitectureAssignment_5_2_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MDriverSLibSupportedPlatform_AnyKeyword_5_2_2_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_AnyKeyword_5_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// architecture=[pdl::MArchitecture|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_ArchitectureAssignment_5_2_2_1 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_ArchitectureAssignment_5_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("architecture",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("architecture");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSLibSupportedPlatform_SemicolonKeyword_5_2_3 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SemicolonKeyword_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Alternatives_5_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("compiler" ":=" compiler=[pdl::MCompiler|VersionedQualifiedName] ";")?
protected class MDriverSLibSupportedPlatform_Group_5_3 extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SemicolonKeyword_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "compiler"
protected class MDriverSLibSupportedPlatform_CompilerKeyword_5_3_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_CompilerKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_3_1 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_CompilerKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// compiler=[pdl::MCompiler|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_CompilerAssignment_5_3_2 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_CompilerAssignment_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerAssignment_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("compiler",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("compiler");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MDriverSLibSupportedPlatform_SemicolonKeyword_5_3_3 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SemicolonKeyword_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_CompilerAssignment_5_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "microprocessor" ":=" ("any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";"
protected class MDriverSLibSupportedPlatform_Group_5_4 extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SemicolonKeyword_5_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "microprocessor"
protected class MDriverSLibSupportedPlatform_MicroprocessorKeyword_5_4_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_MicroprocessorKeyword_5_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_Group_5_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_4_1 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_MicroprocessorKeyword_5_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_Alternatives_5_4_2 extends AlternativesToken {

	public MDriverSLibSupportedPlatform_Alternatives_5_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_AnyKeyword_5_4_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_MicroprocessorAssignment_5_4_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MDriverSLibSupportedPlatform_AnyKeyword_5_4_2_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_AnyKeyword_5_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_MicroprocessorAssignment_5_4_2_1 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_MicroprocessorAssignment_5_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("microprocessor",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("microprocessor");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSLibSupportedPlatform_SemicolonKeyword_5_4_3 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SemicolonKeyword_5_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Alternatives_5_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "board" ":=" ("any" | board=[pdl::MBoard|VersionedQualifiedName]) ";"
protected class MDriverSLibSupportedPlatform_Group_5_5 extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SemicolonKeyword_5_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "board"
protected class MDriverSLibSupportedPlatform_BoardKeyword_5_5_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_BoardKeyword_5_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardKeyword_5_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_5_1 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_BoardKeyword_5_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | board=[pdl::MBoard|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_Alternatives_5_5_2 extends AlternativesToken {

	public MDriverSLibSupportedPlatform_Alternatives_5_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getAlternatives_5_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_AnyKeyword_5_5_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_BoardAssignment_5_5_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MDriverSLibSupportedPlatform_AnyKeyword_5_5_2_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_AnyKeyword_5_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getAnyKeyword_5_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// board=[pdl::MBoard|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_BoardAssignment_5_5_2_1 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_BoardAssignment_5_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardAssignment_5_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("board",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("board");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSLibSupportedPlatform_SemicolonKeyword_5_5_3 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SemicolonKeyword_5_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Alternatives_5_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("attributes" "{" attributes+=MParameterWithoutSLSP+ "}" ";")?
protected class MDriverSLibSupportedPlatform_Group_5_6 extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group_5_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SemicolonKeyword_5_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attributes"
protected class MDriverSLibSupportedPlatform_AttributesKeyword_5_6_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_AttributesKeyword_5_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesKeyword_5_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDriverSLibSupportedPlatform_LeftCurlyBracketKeyword_5_6_1 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_LeftCurlyBracketKeyword_5_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_AttributesKeyword_5_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributes+=MParameterWithoutSLSP+
protected class MDriverSLibSupportedPlatform_AttributesAssignment_5_6_2 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_AttributesAssignment_5_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesAssignment_5_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutSLSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("attributes",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("attributes");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutSLSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getAttributesMParameterWithoutSLSPParserRuleCall_5_6_2_0(); 
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
			case 0: return new MDriverSLibSupportedPlatform_AttributesAssignment_5_6_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverSLibSupportedPlatform_LeftCurlyBracketKeyword_5_6_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDriverSLibSupportedPlatform_RightCurlyBracketKeyword_5_6_3 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_RightCurlyBracketKeyword_5_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getRightCurlyBracketKeyword_5_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_AttributesAssignment_5_6_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSLibSupportedPlatform_SemicolonKeyword_5_6_4 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SemicolonKeyword_5_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_RightCurlyBracketKeyword_5_6_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("supported" "devices" "{" supportedDevices+=MDriverSLibSupportedDevice+ "}" ";")?
protected class MDriverSLibSupportedPlatform_Group_5_7 extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group_5_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SemicolonKeyword_5_7_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "supported"
protected class MDriverSLibSupportedPlatform_SupportedKeyword_5_7_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SupportedKeyword_5_7_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedKeyword_5_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "devices"
protected class MDriverSLibSupportedPlatform_DevicesKeyword_5_7_1 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_DevicesKeyword_5_7_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getDevicesKeyword_5_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SupportedKeyword_5_7_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDriverSLibSupportedPlatform_LeftCurlyBracketKeyword_5_7_2 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_LeftCurlyBracketKeyword_5_7_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_DevicesKeyword_5_7_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedDevices+=MDriverSLibSupportedDevice+
protected class MDriverSLibSupportedPlatform_SupportedDevicesAssignment_5_7_3 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_SupportedDevicesAssignment_5_7_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedDevicesAssignment_5_7_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedDevice_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedDevices",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedDevices");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedDeviceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getSupportedDevicesMDriverSLibSupportedDeviceParserRuleCall_5_7_3_0(); 
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
			case 0: return new MDriverSLibSupportedPlatform_SupportedDevicesAssignment_5_7_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverSLibSupportedPlatform_LeftCurlyBracketKeyword_5_7_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDriverSLibSupportedPlatform_RightCurlyBracketKeyword_5_7_4 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_RightCurlyBracketKeyword_5_7_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SupportedDevicesAssignment_5_7_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSLibSupportedPlatform_SemicolonKeyword_5_7_5 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SemicolonKeyword_5_7_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_7_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_RightCurlyBracketKeyword_5_7_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")?
protected class MDriverSLibSupportedPlatform_Group_5_8 extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group_5_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SemicolonKeyword_5_8_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "languages"
protected class MDriverSLibSupportedPlatform_LanguagesKeyword_5_8_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_LanguagesKeyword_5_8_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesKeyword_5_8_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverSLibSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_8_1 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_8_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_8_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_LanguagesKeyword_5_8_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_LanguagesAssignment_5_8_2 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_LanguagesAssignment_5_8_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesAssignment_5_8_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_8_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_8_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_8_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MDriverSLibSupportedPlatform_Group_5_8_3 extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group_5_8_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_8_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_LanguagesAssignment_5_8_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MDriverSLibSupportedPlatform_CommaKeyword_5_8_3_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_CommaKeyword_5_8_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getCommaKeyword_5_8_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_8_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_LanguagesAssignment_5_8_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_LanguagesAssignment_5_8_3_1 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_LanguagesAssignment_5_8_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesAssignment_5_8_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_CommaKeyword_5_8_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_8_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_8_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSLibSupportedPlatform_SemicolonKeyword_5_8_4 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SemicolonKeyword_5_8_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_8_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_8_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_LanguagesAssignment_5_8_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("requires" ":=" requires+=[mclevsai::MSAI|VersionedQualifiedName] (","
// requires+=[mclevsai::MSAI|VersionedQualifiedName])* ";")?
protected class MDriverSLibSupportedPlatform_Group_5_9 extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group_5_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_SemicolonKeyword_5_9_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "requires"
protected class MDriverSLibSupportedPlatform_RequiresKeyword_5_9_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_RequiresKeyword_5_9_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresKeyword_5_9_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_8(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverSLibSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MDriverSLibSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_9_1 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_9_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getColonEqualsSignKeyword_5_9_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_RequiresKeyword_5_9_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_RequiresAssignment_5_9_2 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_RequiresAssignment_5_9_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresAssignment_5_9_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_ColonEqualsSignKeyword_5_9_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAICrossReference_5_9_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAICrossReference_5_9_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," requires+=[mclevsai::MSAI|VersionedQualifiedName])*
protected class MDriverSLibSupportedPlatform_Group_5_9_3 extends GroupToken {
	
	public MDriverSLibSupportedPlatform_Group_5_9_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getGroup_5_9_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_RequiresAssignment_5_9_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MDriverSLibSupportedPlatform_CommaKeyword_5_9_3_0 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_CommaKeyword_5_9_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getCommaKeyword_5_9_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_9_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_RequiresAssignment_5_9_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// requires+=[mclevsai::MSAI|VersionedQualifiedName]
protected class MDriverSLibSupportedPlatform_RequiresAssignment_5_9_3_1 extends AssignmentToken  {
	
	public MDriverSLibSupportedPlatform_RequiresAssignment_5_9_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresAssignment_5_9_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_CommaKeyword_5_9_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("requires",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("requires");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAICrossReference_5_9_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSLibSupportedPlatformAccess().getRequiresMSAICrossReference_5_9_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSLibSupportedPlatform_SemicolonKeyword_5_9_4 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SemicolonKeyword_5_9_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_5_9_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_Group_5_9_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedPlatform_RequiresAssignment_5_9_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MDriverSLibSupportedPlatform_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSLibSupportedPlatform_SemicolonKeyword_7 extends KeywordToken  {
	
	public MDriverSLibSupportedPlatform_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedPlatformAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedPlatform_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MDriverSLibSupportedPlatform ****************/


/************ begin Rule MDriverSLibSupportedDevice ****************
 *
 * MDriverSLibSupportedDevice:
 * 	"device" device=[pdl::MDevice|VersionedQualifiedName] name=ID "{" ("required" ":=" required=MParameterValueExpression
 * 	";")? "}" ";";
 *
 **/

// "device" device=[pdl::MDevice|VersionedQualifiedName] name=ID "{" ("required" ":=" required=MParameterValueExpression
// ";")? "}" ";"
protected class MDriverSLibSupportedDevice_Group extends GroupToken {
	
	public MDriverSLibSupportedDevice_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedDeviceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedDevice_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDriverSLibSupportedDeviceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "device"
protected class MDriverSLibSupportedDevice_DeviceKeyword_0 extends KeywordToken  {
	
	public MDriverSLibSupportedDevice_DeviceKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// device=[pdl::MDevice|VersionedQualifiedName]
protected class MDriverSLibSupportedDevice_DeviceAssignment_1 extends AssignmentToken  {
	
	public MDriverSLibSupportedDevice_DeviceAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedDevice_DeviceKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("device",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("device");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSLibSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MDriverSLibSupportedDevice_NameAssignment_2 extends AssignmentToken  {
	
	public MDriverSLibSupportedDevice_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedDeviceAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedDevice_DeviceAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDriverSLibSupportedDeviceAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMDriverSLibSupportedDeviceAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MDriverSLibSupportedDevice_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MDriverSLibSupportedDevice_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedDeviceAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedDevice_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("required" ":=" required=MParameterValueExpression ";")?
protected class MDriverSLibSupportedDevice_Group_4 extends GroupToken {
	
	public MDriverSLibSupportedDevice_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedDeviceAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedDevice_SemicolonKeyword_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "required"
protected class MDriverSLibSupportedDevice_RequiredKeyword_4_0 extends KeywordToken  {
	
	public MDriverSLibSupportedDevice_RequiredKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedDeviceAccess().getRequiredKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedDevice_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSLibSupportedDevice_ColonEqualsSignKeyword_4_1 extends KeywordToken  {
	
	public MDriverSLibSupportedDevice_ColonEqualsSignKeyword_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedDeviceAccess().getColonEqualsSignKeyword_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedDevice_RequiredKeyword_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// required=MParameterValueExpression
protected class MDriverSLibSupportedDevice_RequiredAssignment_4_2 extends AssignmentToken  {
	
	public MDriverSLibSupportedDevice_RequiredAssignment_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedDeviceAccess().getRequiredAssignment_4_2();
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
		if((value = eObjectConsumer.getConsumable("required",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("required");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterValueExpressionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDriverSLibSupportedDeviceAccess().getRequiredMParameterValueExpressionParserRuleCall_4_2_0(); 
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
			case 0: return new MDriverSLibSupportedDevice_ColonEqualsSignKeyword_4_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MDriverSLibSupportedDevice_SemicolonKeyword_4_3 extends KeywordToken  {
	
	public MDriverSLibSupportedDevice_SemicolonKeyword_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedDeviceAccess().getSemicolonKeyword_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedDevice_RequiredAssignment_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "}"
protected class MDriverSLibSupportedDevice_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MDriverSLibSupportedDevice_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedDeviceAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedDevice_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSLibSupportedDevice_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSLibSupportedDevice_SemicolonKeyword_6 extends KeywordToken  {
	
	public MDriverSLibSupportedDevice_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSLibSupportedDeviceAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSLibSupportedDevice_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MDriverSLibSupportedDevice ****************/





/************ begin Rule MParameter ****************
 *
 * MParameter returns common::MParameter:
 * 	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
 * 	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition | MBooleanParamSLSPSwitch
 * 	| MStringParamSLSPSwitch | MIntegerParamSLSPSwitch | MRealParamSLSPSwitch | MEnumParamSLSPSwitch;
 *
 **/

// MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
// MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition | MBooleanParamSLSPSwitch
// | MStringParamSLSPSwitch | MIntegerParamSLSPSwitch | MRealParamSLSPSwitch | MEnumParamSLSPSwitch
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
			case 6: return new MParameter_MBooleanParamSLSPSwitchParserRuleCall_6(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MParameter_MStringParamSLSPSwitchParserRuleCall_7(lastRuleCallOrigin, this, 7, inst);
			case 8: return new MParameter_MIntegerParamSLSPSwitchParserRuleCall_8(lastRuleCallOrigin, this, 8, inst);
			case 9: return new MParameter_MRealParamSLSPSwitchParserRuleCall_9(lastRuleCallOrigin, this, 9, inst);
			case 10: return new MParameter_MEnumParamSLSPSwitchParserRuleCall_10(lastRuleCallOrigin, this, 10, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParamSLSPSwitchRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMBooleanParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParamSLSPSwitchRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionAccess().getMEnumParameterDefinitionAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMIntegerParamSLSPSwitchRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMIntegerParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMRealParamSLSPSwitchRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMRealParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMStringParamSLSPSwitchRule().getType().getClassifier() && 
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

// MBooleanParamSLSPSwitch
protected class MParameter_MBooleanParamSLSPSwitchParserRuleCall_6 extends RuleCallToken {
	
	public MParameter_MBooleanParamSLSPSwitchParserRuleCall_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMBooleanParamSLSPSwitchParserRuleCall_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParamSLSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MBooleanParamSLSPSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MStringParamSLSPSwitch
protected class MParameter_MStringParamSLSPSwitchParserRuleCall_7 extends RuleCallToken {
	
	public MParameter_MStringParamSLSPSwitchParserRuleCall_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMStringParamSLSPSwitchParserRuleCall_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParamSLSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MStringParamSLSPSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MIntegerParamSLSPSwitch
protected class MParameter_MIntegerParamSLSPSwitchParserRuleCall_8 extends RuleCallToken {
	
	public MParameter_MIntegerParamSLSPSwitchParserRuleCall_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMIntegerParamSLSPSwitchParserRuleCall_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParamSLSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MIntegerParamSLSPSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MRealParamSLSPSwitch
protected class MParameter_MRealParamSLSPSwitchParserRuleCall_9 extends RuleCallToken {
	
	public MParameter_MRealParamSLSPSwitchParserRuleCall_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMRealParamSLSPSwitchParserRuleCall_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParamSLSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MRealParamSLSPSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParamSLSPSwitch
protected class MParameter_MEnumParamSLSPSwitchParserRuleCall_10 extends RuleCallToken {
	
	public MParameter_MEnumParamSLSPSwitchParserRuleCall_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMEnumParamSLSPSwitchParserRuleCall_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamSLSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParamSLSPSwitch_Group.class, eObjectConsumer)) return null;
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


/************ begin Rule MParameterWithoutSLSP ****************
 *
 * MParameterWithoutSLSP returns common::MParameter:
 * 	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
 * 	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition;
 *
 **/

// MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
// MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition
protected class MParameterWithoutSLSP_Alternatives extends AlternativesToken {

	public MParameterWithoutSLSP_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMParameterWithoutSLSPAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutSLSP_MIntegerParameterSingleExpressionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterWithoutSLSP_MEnumParameterSingleExpressionParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MParameterWithoutSLSP_MBooleanParameterSingleExpressionParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MParameterWithoutSLSP_MRealParameterSingleExpressionParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MParameterWithoutSLSP_MStringParameterSingleExpressionParserRuleCall_4(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MParameterWithoutSLSP_MEnumParameterDefinitionParserRuleCall_5(lastRuleCallOrigin, this, 5, inst);
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
protected class MParameterWithoutSLSP_MIntegerParameterSingleExpressionParserRuleCall_0 extends RuleCallToken {
	
	public MParameterWithoutSLSP_MIntegerParameterSingleExpressionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutSLSPAccess().getMIntegerParameterSingleExpressionParserRuleCall_0();
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
protected class MParameterWithoutSLSP_MEnumParameterSingleExpressionParserRuleCall_1 extends RuleCallToken {
	
	public MParameterWithoutSLSP_MEnumParameterSingleExpressionParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutSLSPAccess().getMEnumParameterSingleExpressionParserRuleCall_1();
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
protected class MParameterWithoutSLSP_MBooleanParameterSingleExpressionParserRuleCall_2 extends RuleCallToken {
	
	public MParameterWithoutSLSP_MBooleanParameterSingleExpressionParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutSLSPAccess().getMBooleanParameterSingleExpressionParserRuleCall_2();
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
protected class MParameterWithoutSLSP_MRealParameterSingleExpressionParserRuleCall_3 extends RuleCallToken {
	
	public MParameterWithoutSLSP_MRealParameterSingleExpressionParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutSLSPAccess().getMRealParameterSingleExpressionParserRuleCall_3();
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
protected class MParameterWithoutSLSP_MStringParameterSingleExpressionParserRuleCall_4 extends RuleCallToken {
	
	public MParameterWithoutSLSP_MStringParameterSingleExpressionParserRuleCall_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutSLSPAccess().getMStringParameterSingleExpressionParserRuleCall_4();
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
protected class MParameterWithoutSLSP_MEnumParameterDefinitionParserRuleCall_5 extends RuleCallToken {
	
	public MParameterWithoutSLSP_MEnumParameterDefinitionParserRuleCall_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutSLSPAccess().getMEnumParameterDefinitionParserRuleCall_5();
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


/************ end Rule MParameterWithoutSLSP ****************/


/************ begin Rule MBooleanParamSLSPSwitch ****************
 *
 * MBooleanParamSLSPSwitch:
 * 	constant?="const"? "boolean" name=ID ":=" "switch" "{" cases+=MBooleanParamSLSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "boolean" name=ID ":=" "switch" "{" cases+=MBooleanParamSLSPSwitchCase+ "}" ";"
protected class MBooleanParamSLSPSwitch_Group extends GroupToken {
	
	public MBooleanParamSLSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitch_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParamSLSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MBooleanParamSLSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MBooleanParamSLSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMBooleanParamSLSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "boolean"
protected class MBooleanParamSLSPSwitch_BooleanKeyword_1 extends KeywordToken  {
	
	public MBooleanParamSLSPSwitch_BooleanKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchAccess().getBooleanKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MBooleanParamSLSPSwitch_NameAssignment_2 extends AssignmentToken  {
	
	public MBooleanParamSLSPSwitch_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitch_BooleanKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMBooleanParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMBooleanParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MBooleanParamSLSPSwitch_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MBooleanParamSLSPSwitch_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitch_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MBooleanParamSLSPSwitch_SwitchKeyword_4 extends KeywordToken  {
	
	public MBooleanParamSLSPSwitch_SwitchKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchAccess().getSwitchKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitch_ColonEqualsSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MBooleanParamSLSPSwitch_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MBooleanParamSLSPSwitch_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitch_SwitchKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MBooleanParamSLSPSwitchCase+
protected class MBooleanParamSLSPSwitch_CasesAssignment_6 extends AssignmentToken  {
	
	public MBooleanParamSLSPSwitch_CasesAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchAccess().getCasesAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMBooleanParamSLSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMBooleanParamSLSPSwitchAccess().getCasesMBooleanParamSLSPSwitchCaseParserRuleCall_6_0(); 
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
			case 0: return new MBooleanParamSLSPSwitch_CasesAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MBooleanParamSLSPSwitch_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MBooleanParamSLSPSwitch_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MBooleanParamSLSPSwitch_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitch_CasesAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MBooleanParamSLSPSwitch_SemicolonKeyword_8 extends KeywordToken  {
	
	public MBooleanParamSLSPSwitch_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitch_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MBooleanParamSLSPSwitch ****************/


/************ begin Rule MBooleanParamSLSPSwitchCase ****************
 *
 * MBooleanParamSLSPSwitchCase:
 * 	"case" platform=[MServiceLibrarySupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
 *
 **/

// "case" platform=[MServiceLibrarySupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
protected class MBooleanParamSLSPSwitchCase_Group extends GroupToken {
	
	public MBooleanParamSLSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitchCase_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParamSLSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MBooleanParamSLSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MBooleanParamSLSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MServiceLibrarySupportedPlatform]
protected class MBooleanParamSLSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MBooleanParamSLSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MBooleanParamSLSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MBooleanParamSLSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MBooleanParamSLSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MBooleanParamSLSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MBooleanParamSLSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MBooleanParamSLSPSwitchCase_SemicolonKeyword_4 extends KeywordToken  {
	
	public MBooleanParamSLSPSwitchCase_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSLSPSwitchCaseAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSLSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MBooleanParamSLSPSwitchCase ****************/


/************ begin Rule MStringParamSLSPSwitch ****************
 *
 * MStringParamSLSPSwitch:
 * 	constant?="const"? "string" name=ID ":=" "switch" "{" cases+=MStringParamSLSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "string" name=ID ":=" "switch" "{" cases+=MStringParamSLSPSwitchCase+ "}" ";"
protected class MStringParamSLSPSwitch_Group extends GroupToken {
	
	public MStringParamSLSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitch_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParamSLSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MStringParamSLSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MStringParamSLSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMStringParamSLSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "string"
protected class MStringParamSLSPSwitch_StringKeyword_1 extends KeywordToken  {
	
	public MStringParamSLSPSwitch_StringKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchAccess().getStringKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MStringParamSLSPSwitch_NameAssignment_2 extends AssignmentToken  {
	
	public MStringParamSLSPSwitch_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitch_StringKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMStringParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMStringParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MStringParamSLSPSwitch_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MStringParamSLSPSwitch_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitch_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MStringParamSLSPSwitch_SwitchKeyword_4 extends KeywordToken  {
	
	public MStringParamSLSPSwitch_SwitchKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchAccess().getSwitchKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitch_ColonEqualsSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MStringParamSLSPSwitch_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MStringParamSLSPSwitch_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitch_SwitchKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MStringParamSLSPSwitchCase+
protected class MStringParamSLSPSwitch_CasesAssignment_6 extends AssignmentToken  {
	
	public MStringParamSLSPSwitch_CasesAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchAccess().getCasesAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMStringParamSLSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMStringParamSLSPSwitchAccess().getCasesMStringParamSLSPSwitchCaseParserRuleCall_6_0(); 
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
			case 0: return new MStringParamSLSPSwitch_CasesAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MStringParamSLSPSwitch_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MStringParamSLSPSwitch_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MStringParamSLSPSwitch_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitch_CasesAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MStringParamSLSPSwitch_SemicolonKeyword_8 extends KeywordToken  {
	
	public MStringParamSLSPSwitch_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitch_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MStringParamSLSPSwitch ****************/


/************ begin Rule MStringParamSLSPSwitchCase ****************
 *
 * MStringParamSLSPSwitchCase:
 * 	"case" platform=[MServiceLibrarySupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
 *
 **/

// "case" platform=[MServiceLibrarySupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
protected class MStringParamSLSPSwitchCase_Group extends GroupToken {
	
	public MStringParamSLSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitchCase_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParamSLSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MStringParamSLSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MStringParamSLSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MServiceLibrarySupportedPlatform]
protected class MStringParamSLSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MStringParamSLSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMStringParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMStringParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MStringParamSLSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MStringParamSLSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MStringParamSLSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MStringParamSLSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMStringParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MStringParamSLSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MStringParamSLSPSwitchCase_SemicolonKeyword_4 extends KeywordToken  {
	
	public MStringParamSLSPSwitchCase_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSLSPSwitchCaseAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSLSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MStringParamSLSPSwitchCase ****************/


/************ begin Rule MIntegerParamSLSPSwitch ****************
 *
 * MIntegerParamSLSPSwitch:
 * 	constant?="const"? "integer" name=ID ":=" "switch" "{" cases+=MIntegerParamSLSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "integer" name=ID ":=" "switch" "{" cases+=MIntegerParamSLSPSwitchCase+ "}" ";"
protected class MIntegerParamSLSPSwitch_Group extends GroupToken {
	
	public MIntegerParamSLSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitch_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParamSLSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MIntegerParamSLSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MIntegerParamSLSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMIntegerParamSLSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "integer"
protected class MIntegerParamSLSPSwitch_IntegerKeyword_1 extends KeywordToken  {
	
	public MIntegerParamSLSPSwitch_IntegerKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchAccess().getIntegerKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MIntegerParamSLSPSwitch_NameAssignment_2 extends AssignmentToken  {
	
	public MIntegerParamSLSPSwitch_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitch_IntegerKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMIntegerParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMIntegerParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MIntegerParamSLSPSwitch_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MIntegerParamSLSPSwitch_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitch_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MIntegerParamSLSPSwitch_SwitchKeyword_4 extends KeywordToken  {
	
	public MIntegerParamSLSPSwitch_SwitchKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchAccess().getSwitchKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitch_ColonEqualsSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MIntegerParamSLSPSwitch_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MIntegerParamSLSPSwitch_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitch_SwitchKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MIntegerParamSLSPSwitchCase+
protected class MIntegerParamSLSPSwitch_CasesAssignment_6 extends AssignmentToken  {
	
	public MIntegerParamSLSPSwitch_CasesAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchAccess().getCasesAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIntegerParamSLSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIntegerParamSLSPSwitchAccess().getCasesMIntegerParamSLSPSwitchCaseParserRuleCall_6_0(); 
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
			case 0: return new MIntegerParamSLSPSwitch_CasesAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIntegerParamSLSPSwitch_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MIntegerParamSLSPSwitch_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MIntegerParamSLSPSwitch_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitch_CasesAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MIntegerParamSLSPSwitch_SemicolonKeyword_8 extends KeywordToken  {
	
	public MIntegerParamSLSPSwitch_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitch_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIntegerParamSLSPSwitch ****************/


/************ begin Rule MIntegerParamSLSPSwitchCase ****************
 *
 * MIntegerParamSLSPSwitchCase:
 * 	"case" platform=[MServiceLibrarySupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
 * 	range=MParameterRange)? ";";
 *
 **/

// "case" platform=[MServiceLibrarySupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
// range=MParameterRange)? ";"
protected class MIntegerParamSLSPSwitchCase_Group extends GroupToken {
	
	public MIntegerParamSLSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitchCase_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParamSLSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MIntegerParamSLSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MIntegerParamSLSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MServiceLibrarySupportedPlatform]
protected class MIntegerParamSLSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MIntegerParamSLSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MIntegerParamSLSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MIntegerParamSLSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MIntegerParamSLSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MIntegerParamSLSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MIntegerParamSLSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("range" range=MParameterRange)?
protected class MIntegerParamSLSPSwitchCase_Group_4 extends GroupToken {
	
	public MIntegerParamSLSPSwitchCase_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitchCase_RangeAssignment_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "range"
protected class MIntegerParamSLSPSwitchCase_RangeKeyword_4_0 extends KeywordToken  {
	
	public MIntegerParamSLSPSwitchCase_RangeKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getRangeKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// range=MParameterRange
protected class MIntegerParamSLSPSwitchCase_RangeAssignment_4_1 extends AssignmentToken  {
	
	public MIntegerParamSLSPSwitchCase_RangeAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getRangeAssignment_4_1();
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
				element = grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0(); 
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
			case 0: return new MIntegerParamSLSPSwitchCase_RangeKeyword_4_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ";"
protected class MIntegerParamSLSPSwitchCase_SemicolonKeyword_5 extends KeywordToken  {
	
	public MIntegerParamSLSPSwitchCase_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSLSPSwitchCaseAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSLSPSwitchCase_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIntegerParamSLSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIntegerParamSLSPSwitchCase ****************/


/************ begin Rule MRealParamSLSPSwitch ****************
 *
 * MRealParamSLSPSwitch:
 * 	constant?="const"? "real" name=ID ":=" "switch" "{" cases+=MRealParamSLSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "real" name=ID ":=" "switch" "{" cases+=MRealParamSLSPSwitchCase+ "}" ";"
protected class MRealParamSLSPSwitch_Group extends GroupToken {
	
	public MRealParamSLSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitch_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParamSLSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MRealParamSLSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MRealParamSLSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMRealParamSLSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "real"
protected class MRealParamSLSPSwitch_RealKeyword_1 extends KeywordToken  {
	
	public MRealParamSLSPSwitch_RealKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchAccess().getRealKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MRealParamSLSPSwitch_NameAssignment_2 extends AssignmentToken  {
	
	public MRealParamSLSPSwitch_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitch_RealKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMRealParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMRealParamSLSPSwitchAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MRealParamSLSPSwitch_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MRealParamSLSPSwitch_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitch_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MRealParamSLSPSwitch_SwitchKeyword_4 extends KeywordToken  {
	
	public MRealParamSLSPSwitch_SwitchKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchAccess().getSwitchKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitch_ColonEqualsSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MRealParamSLSPSwitch_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MRealParamSLSPSwitch_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitch_SwitchKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MRealParamSLSPSwitchCase+
protected class MRealParamSLSPSwitch_CasesAssignment_6 extends AssignmentToken  {
	
	public MRealParamSLSPSwitch_CasesAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchAccess().getCasesAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMRealParamSLSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMRealParamSLSPSwitchAccess().getCasesMRealParamSLSPSwitchCaseParserRuleCall_6_0(); 
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
			case 0: return new MRealParamSLSPSwitch_CasesAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MRealParamSLSPSwitch_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MRealParamSLSPSwitch_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MRealParamSLSPSwitch_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitch_CasesAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MRealParamSLSPSwitch_SemicolonKeyword_8 extends KeywordToken  {
	
	public MRealParamSLSPSwitch_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitch_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MRealParamSLSPSwitch ****************/


/************ begin Rule MRealParamSLSPSwitchCase ****************
 *
 * MRealParamSLSPSwitchCase:
 * 	"case" platform=[MServiceLibrarySupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
 * 	range=MParameterRange)? ";";
 *
 **/

// "case" platform=[MServiceLibrarySupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
// range=MParameterRange)? ";"
protected class MRealParamSLSPSwitchCase_Group extends GroupToken {
	
	public MRealParamSLSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitchCase_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParamSLSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MRealParamSLSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MRealParamSLSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MServiceLibrarySupportedPlatform]
protected class MRealParamSLSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MRealParamSLSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMRealParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMRealParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MRealParamSLSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MRealParamSLSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MRealParamSLSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MRealParamSLSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMRealParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MRealParamSLSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("range" range=MParameterRange)?
protected class MRealParamSLSPSwitchCase_Group_4 extends GroupToken {
	
	public MRealParamSLSPSwitchCase_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchCaseAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitchCase_RangeAssignment_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "range"
protected class MRealParamSLSPSwitchCase_RangeKeyword_4_0 extends KeywordToken  {
	
	public MRealParamSLSPSwitchCase_RangeKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchCaseAccess().getRangeKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// range=MParameterRange
protected class MRealParamSLSPSwitchCase_RangeAssignment_4_1 extends AssignmentToken  {
	
	public MRealParamSLSPSwitchCase_RangeAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchCaseAccess().getRangeAssignment_4_1();
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
				element = grammarAccess.getMRealParamSLSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0(); 
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
			case 0: return new MRealParamSLSPSwitchCase_RangeKeyword_4_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ";"
protected class MRealParamSLSPSwitchCase_SemicolonKeyword_5 extends KeywordToken  {
	
	public MRealParamSLSPSwitchCase_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSLSPSwitchCaseAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSLSPSwitchCase_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MRealParamSLSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule MRealParamSLSPSwitchCase ****************/


/************ begin Rule MEnumParamSLSPSwitch ****************
 *
 * MEnumParamSLSPSwitch:
 * 	constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
 * 	":=" "switch" "{" cases+=MEnumParamSLSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID ":="
// "switch" "{" cases+=MEnumParamSLSPSwitchCase+ "}" ";"
protected class MEnumParamSLSPSwitch_Group extends GroupToken {
	
	public MEnumParamSLSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitch_SemicolonKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamSLSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MEnumParamSLSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MEnumParamSLSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMEnumParamSLSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "enum"
protected class MEnumParamSLSPSwitch_EnumKeyword_1 extends KeywordToken  {
	
	public MEnumParamSLSPSwitch_EnumKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName]
protected class MEnumParamSLSPSwitch_EnumDefinitionAssignment_2 extends AssignmentToken  {
	
	public MEnumParamSLSPSwitch_EnumDefinitionAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumDefinitionAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitch_EnumKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("enumDefinition",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("enumDefinition");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMEnumParamSLSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MEnumParamSLSPSwitch_NameAssignment_3 extends AssignmentToken  {
	
	public MEnumParamSLSPSwitch_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitch_EnumDefinitionAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamSLSPSwitchAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParamSLSPSwitchAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MEnumParamSLSPSwitch_ColonEqualsSignKeyword_4 extends KeywordToken  {
	
	public MEnumParamSLSPSwitch_ColonEqualsSignKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchAccess().getColonEqualsSignKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitch_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MEnumParamSLSPSwitch_SwitchKeyword_5 extends KeywordToken  {
	
	public MEnumParamSLSPSwitch_SwitchKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchAccess().getSwitchKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitch_ColonEqualsSignKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MEnumParamSLSPSwitch_LeftCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MEnumParamSLSPSwitch_LeftCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchAccess().getLeftCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitch_SwitchKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MEnumParamSLSPSwitchCase+
protected class MEnumParamSLSPSwitch_CasesAssignment_7 extends AssignmentToken  {
	
	public MEnumParamSLSPSwitch_CasesAssignment_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchAccess().getCasesAssignment_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParamSLSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMEnumParamSLSPSwitchAccess().getCasesMEnumParamSLSPSwitchCaseParserRuleCall_7_0(); 
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
			case 0: return new MEnumParamSLSPSwitch_CasesAssignment_7(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MEnumParamSLSPSwitch_LeftCurlyBracketKeyword_6(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MEnumParamSLSPSwitch_RightCurlyBracketKeyword_8 extends KeywordToken  {
	
	public MEnumParamSLSPSwitch_RightCurlyBracketKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchAccess().getRightCurlyBracketKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitch_CasesAssignment_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MEnumParamSLSPSwitch_SemicolonKeyword_9 extends KeywordToken  {
	
	public MEnumParamSLSPSwitch_SemicolonKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchAccess().getSemicolonKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitch_RightCurlyBracketKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MEnumParamSLSPSwitch ****************/


/************ begin Rule MEnumParamSLSPSwitchCase ****************
 *
 * MEnumParamSLSPSwitchCase:
 * 	"case" platform=[MServiceLibrarySupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
 *
 **/

// "case" platform=[MServiceLibrarySupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
protected class MEnumParamSLSPSwitchCase_Group extends GroupToken {
	
	public MEnumParamSLSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitchCase_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamSLSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MEnumParamSLSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MEnumParamSLSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MServiceLibrarySupportedPlatform]
protected class MEnumParamSLSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MEnumParamSLSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getPlatformMServiceLibrarySupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MEnumParamSLSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MEnumParamSLSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MEnumParamSLSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MEnumParamSLSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MEnumParamSLSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MEnumParamSLSPSwitchCase_SemicolonKeyword_4 extends KeywordToken  {
	
	public MEnumParamSLSPSwitchCase_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSLSPSwitchCaseAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSLSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MEnumParamSLSPSwitchCase ****************/


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

}
