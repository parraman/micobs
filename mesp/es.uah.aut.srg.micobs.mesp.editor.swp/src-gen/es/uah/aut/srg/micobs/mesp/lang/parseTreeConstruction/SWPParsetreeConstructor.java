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

import es.uah.aut.srg.micobs.mesp.lang.services.SWPGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class SWPParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private SWPGrammarAccess grammarAccess;
	
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
			case 0: return new MMESPSWPPackageFile_Group(this, this, 0, inst);
			case 1: return new MMESPSWPPackageElement_Alternatives(this, this, 1, inst);
			case 2: return new MAbstractSwPackage_Group(this, this, 2, inst);
			case 3: return new MSwPackageProvidedInterface_Group(this, this, 3, inst);
			case 4: return new MSwPackageProvidedInterfacePVA_Alternatives(this, this, 4, inst);
			case 5: return new MSwPackageProvidedInterfacePVAExpression_Group(this, this, 5, inst);
			case 6: return new MSwPackageProvidedInterfacePVASwitch_Group(this, this, 6, inst);
			case 7: return new MSwPackageProvidedInterfacePVASwitchCase_Group(this, this, 7, inst);
			case 8: return new MSwPackageRequiredInterface_Group(this, this, 8, inst);
			case 9: return new MSwPackage_Group(this, this, 9, inst);
			case 10: return new MDriverSwPackage_Group(this, this, 10, inst);
			case 11: return new MDriverSwPackageSupportedPlatform_Group(this, this, 11, inst);
			case 12: return new MDriverSwPackageSupportedDevice_Group(this, this, 12, inst);
			case 13: return new MSwPackageSupportedPlatform_Group(this, this, 13, inst);
			case 14: return new MParameterValueAssignment_Group(this, this, 14, inst);
			case 15: return new MResourceDemand_Alternatives(this, this, 15, inst);
			case 16: return new MInstantiableResourceDemand_Group(this, this, 16, inst);
			case 17: return new MQuantifiableResourceDemand_Group(this, this, 17, inst);
			case 18: return new MParameter_Alternatives(this, this, 18, inst);
			case 19: return new MParameterWithoutSWPSP_Alternatives(this, this, 19, inst);
			case 20: return new MBooleanParamSWPSPSwitch_Group(this, this, 20, inst);
			case 21: return new MBooleanParamSWPSPSwitchCase_Group(this, this, 21, inst);
			case 22: return new MStringParamSWPSPSwitch_Group(this, this, 22, inst);
			case 23: return new MStringParamSWPSPSwitchCase_Group(this, this, 23, inst);
			case 24: return new MIntegerParamSWPSPSwitch_Group(this, this, 24, inst);
			case 25: return new MIntegerParamSWPSPSwitchCase_Group(this, this, 25, inst);
			case 26: return new MRealParamSWPSPSwitch_Group(this, this, 26, inst);
			case 27: return new MRealParamSWPSPSwitchCase_Group(this, this, 27, inst);
			case 28: return new MEnumParamSWPSPSwitch_Group(this, this, 28, inst);
			case 29: return new MEnumParamSWPSPSwitchCase_Group(this, this, 29, inst);
			case 30: return new MBooleanParameterSingleExpression_Group(this, this, 30, inst);
			case 31: return new MStringParameterSingleExpression_Group(this, this, 31, inst);
			case 32: return new MIntegerParameterSingleExpression_Group(this, this, 32, inst);
			case 33: return new MEnumParameterDefinition_Group(this, this, 33, inst);
			case 34: return new MEnumParameterSingleExpression_Group(this, this, 34, inst);
			case 35: return new MRealParameterSingleExpression_Group(this, this, 35, inst);
			case 36: return new MEnumParameterLiteralRule_Alternatives(this, this, 36, inst);
			case 37: return new MParameterValue_Alternatives(this, this, 37, inst);
			case 38: return new MParameterValueLiteral_Alternatives(this, this, 38, inst);
			case 39: return new MParameterValueBooleanLiteral_Group(this, this, 39, inst);
			case 40: return new MParameterValueStringLiteral_Group(this, this, 40, inst);
			case 41: return new MParameterValueIntegerLiteral_Group(this, this, 41, inst);
			case 42: return new MParameterValueRealLiteral_Group(this, this, 42, inst);
			case 43: return new MParameterValueRefObject_Group(this, this, 43, inst);
			case 44: return new MParameterValuePAR_Group(this, this, 44, inst);
			case 45: return new MParameterValueExpression_Group(this, this, 45, inst);
			case 46: return new MParameterValueTERM_Group(this, this, 46, inst);
			case 47: return new MParameterRange_Alternatives(this, this, 47, inst);
			case 48: return new MParameterOCR_Group(this, this, 48, inst);
			case 49: return new MParameterOOR_Group(this, this, 49, inst);
			case 50: return new MParameterCOR_Group(this, this, 50, inst);
			case 51: return new MParameterCCR_Group(this, this, 51, inst);
			case 52: return new MEnumParameterLiteral_Group(this, this, 52, inst);
			case 53: return new MEnumParamIntegerLiteral_Group(this, this, 53, inst);
			case 54: return new MEnumParamRealLiteral_Group(this, this, 54, inst);
			case 55: return new MEnumParamStringLiteral_Group(this, this, 55, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MMESPSWPPackageFile ****************
 *
 * MMESPSWPPackageFile:
 * 	"package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
 * 	imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPSWPPackageElement;
 *
 **/

// "package" package=[mesplibrary::MMESPPackage|QualifiedName] ";" ("import"
// imports+=[common::MCommonPackage|QualifiedName] ";")* element=MMESPSWPPackageElement
protected class MMESPSWPPackageFile_Group extends GroupToken {
	
	public MMESPSWPPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPSWPPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPSWPPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "package"
protected class MMESPSWPPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MMESPSWPPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[mesplibrary::MMESPPackage|QualifiedName]
protected class MMESPSWPPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MMESPSWPPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPSWPPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMESPSWPPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MMESPSWPPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPSWPPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("import" imports+=[common::MCommonPackage|QualifiedName] ";")*
protected class MMESPSWPPackageFile_Group_3 extends GroupToken {
	
	public MMESPSWPPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPSWPPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "import"
protected class MMESPSWPPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MMESPSWPPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPSWPPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPSWPPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[common::MCommonPackage|QualifiedName]
protected class MMESPSWPPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MMESPSWPPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPSWPPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMESPSWPPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MMESPSWPPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPSWPPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MMESPSWPPackageElement
protected class MMESPSWPPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MMESPSWPPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPSWPPackageElement_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPSWPPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPSWPPackageFileAccess().getElementMMESPSWPPackageElementParserRuleCall_4_0(); 
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
			case 0: return new MMESPSWPPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPSWPPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MMESPSWPPackageFile ****************/


/************ begin Rule MMESPSWPPackageElement ****************
 *
 * MMESPSWPPackageElement:
 * 	MDriverSwPackage | MSwPackage | MAbstractSwPackage;
 *
 **/

// MDriverSwPackage | MSwPackage | MAbstractSwPackage
protected class MMESPSWPPackageElement_Alternatives extends AlternativesToken {

	public MMESPSWPPackageElement_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageElementAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPSWPPackageElement_MDriverSwPackageParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPSWPPackageElement_MSwPackageParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MMESPSWPPackageElement_MAbstractSwPackageParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAbstractSwPackageRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMDriverSwPackageRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMSwPackageRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MDriverSwPackage
protected class MMESPSWPPackageElement_MDriverSwPackageParserRuleCall_0 extends RuleCallToken {
	
	public MMESPSWPPackageElement_MDriverSwPackageParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageElementAccess().getMDriverSwPackageParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDriverSwPackageRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MDriverSwPackage_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MSwPackage
protected class MMESPSWPPackageElement_MSwPackageParserRuleCall_1 extends RuleCallToken {
	
	public MMESPSWPPackageElement_MSwPackageParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageElementAccess().getMSwPackageParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSwPackageRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MSwPackage_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MAbstractSwPackage
protected class MMESPSWPPackageElement_MAbstractSwPackageParserRuleCall_2 extends RuleCallToken {
	
	public MMESPSWPPackageElement_MAbstractSwPackageParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMESPSWPPackageElementAccess().getMAbstractSwPackageParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAbstractSwPackageRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MAbstractSwPackage_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MMESPSWPPackageElement ****************/






/************ begin Rule MAbstractSwPackage ****************
 *
 * MAbstractSwPackage:
 * 	"abstract" "swpackage" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
 * 	inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("configuration"
 * 	"parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? & ("provided" "interfaces" "{"
 * 	provides+=MSwPackageProvidedInterface+ "}" ";")?) "}" ";";
 *
 **/

// "abstract" "swpackage" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
// inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & ("configuration"
// "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? & ("provided" "interfaces" "{"
// provides+=MSwPackageProvidedInterface+ "}" ";")?) "}" ";"
protected class MAbstractSwPackage_Group extends GroupToken {
	
	public MAbstractSwPackage_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMAbstractSwPackageRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "abstract"
protected class MAbstractSwPackage_AbstractKeyword_0 extends KeywordToken  {
	
	public MAbstractSwPackage_AbstractKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getAbstractKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// "swpackage"
protected class MAbstractSwPackage_SwpackageKeyword_1 extends KeywordToken  {
	
	public MAbstractSwPackage_SwpackageKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getSwpackageKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_AbstractKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MAbstractSwPackage_NameAssignment_2 extends AssignmentToken  {
	
	public MAbstractSwPackage_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_SwpackageKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMAbstractSwPackageAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMAbstractSwPackageAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
// inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)?
protected class MAbstractSwPackage_Group_3 extends GroupToken {
	
	public MAbstractSwPackage_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractSwPackage_InheritsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "inherits"
protected class MAbstractSwPackage_InheritsKeyword_3_0 extends KeywordToken  {
	
	public MAbstractSwPackage_InheritsKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getInheritsKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractSwPackage|VersionedQualifiedName]
protected class MAbstractSwPackage_InheritsAssignment_3_1 extends AssignmentToken  {
	
	public MAbstractSwPackage_InheritsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getInheritsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_InheritsKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MAbstractSwPackage|VersionedQualifiedName])*
protected class MAbstractSwPackage_Group_3_2 extends GroupToken {
	
	public MAbstractSwPackage_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_InheritsAssignment_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MAbstractSwPackage_CommaKeyword_3_2_0 extends KeywordToken  {
	
	public MAbstractSwPackage_CommaKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getCommaKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractSwPackage_InheritsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractSwPackage|VersionedQualifiedName]
protected class MAbstractSwPackage_InheritsAssignment_3_2_1 extends AssignmentToken  {
	
	public MAbstractSwPackage_InheritsAssignment_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getInheritsAssignment_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_CommaKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_3_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMAbstractSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_3_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MAbstractSwPackage_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MAbstractSwPackage_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractSwPackage_NameAssignment_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & ("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? &
// ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")?
protected class MAbstractSwPackage_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MAbstractSwPackage_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractSwPackage_Group_5_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MAbstractSwPackage_Group_5_0(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MAbstractSwPackage_Group_5_0 extends GroupToken {
	
	public MAbstractSwPackage_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MAbstractSwPackage_VersionKeyword_5_0_0 extends KeywordToken  {
	
	public MAbstractSwPackage_VersionKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getVersionKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MAbstractSwPackage_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public MAbstractSwPackage_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_VersionKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MAbstractSwPackage_VersionAssignment_5_0_2 extends AssignmentToken  {
	
	public MAbstractSwPackage_VersionAssignment_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getVersionAssignment_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMAbstractSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMAbstractSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MAbstractSwPackage_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public MAbstractSwPackage_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_VersionAssignment_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")?
protected class MAbstractSwPackage_Group_5_1 extends GroupToken {
	
	public MAbstractSwPackage_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_SemicolonKeyword_5_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MAbstractSwPackage_ConfigurationKeyword_5_1_0 extends KeywordToken  {
	
	public MAbstractSwPackage_ConfigurationKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getConfigurationKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MAbstractSwPackage_ParametersKeyword_5_1_1 extends KeywordToken  {
	
	public MAbstractSwPackage_ParametersKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getParametersKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_ConfigurationKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MAbstractSwPackage_LeftCurlyBracketKeyword_5_1_2 extends KeywordToken  {
	
	public MAbstractSwPackage_LeftCurlyBracketKeyword_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getLeftCurlyBracketKeyword_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_ParametersKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameterWithoutSWPSP+
protected class MAbstractSwPackage_ParametersAssignment_5_1_3 extends AssignmentToken  {
	
	public MAbstractSwPackage_ParametersAssignment_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getParametersAssignment_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutSWPSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameters",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutSWPSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAbstractSwPackageAccess().getParametersMParameterWithoutSWPSPParserRuleCall_5_1_3_0(); 
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
			case 0: return new MAbstractSwPackage_ParametersAssignment_5_1_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAbstractSwPackage_LeftCurlyBracketKeyword_5_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MAbstractSwPackage_RightCurlyBracketKeyword_5_1_4 extends KeywordToken  {
	
	public MAbstractSwPackage_RightCurlyBracketKeyword_5_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getRightCurlyBracketKeyword_5_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_ParametersAssignment_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MAbstractSwPackage_SemicolonKeyword_5_1_5 extends KeywordToken  {
	
	public MAbstractSwPackage_SemicolonKeyword_5_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_5_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_RightCurlyBracketKeyword_5_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")?
protected class MAbstractSwPackage_Group_5_2 extends GroupToken {
	
	public MAbstractSwPackage_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_SemicolonKeyword_5_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "provided"
protected class MAbstractSwPackage_ProvidedKeyword_5_2_0 extends KeywordToken  {
	
	public MAbstractSwPackage_ProvidedKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getProvidedKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MAbstractSwPackage_Group_5_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "interfaces"
protected class MAbstractSwPackage_InterfacesKeyword_5_2_1 extends KeywordToken  {
	
	public MAbstractSwPackage_InterfacesKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getInterfacesKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_ProvidedKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MAbstractSwPackage_LeftCurlyBracketKeyword_5_2_2 extends KeywordToken  {
	
	public MAbstractSwPackage_LeftCurlyBracketKeyword_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getLeftCurlyBracketKeyword_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_InterfacesKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// provides+=MSwPackageProvidedInterface+
protected class MAbstractSwPackage_ProvidesAssignment_5_2_3 extends AssignmentToken  {
	
	public MAbstractSwPackage_ProvidesAssignment_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getProvidesAssignment_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterface_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("provides",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("provides");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageProvidedInterfaceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMAbstractSwPackageAccess().getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_2_3_0(); 
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
			case 0: return new MAbstractSwPackage_ProvidesAssignment_5_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MAbstractSwPackage_LeftCurlyBracketKeyword_5_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MAbstractSwPackage_RightCurlyBracketKeyword_5_2_4 extends KeywordToken  {
	
	public MAbstractSwPackage_RightCurlyBracketKeyword_5_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getRightCurlyBracketKeyword_5_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_ProvidesAssignment_5_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MAbstractSwPackage_SemicolonKeyword_5_2_5 extends KeywordToken  {
	
	public MAbstractSwPackage_SemicolonKeyword_5_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_5_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_RightCurlyBracketKeyword_5_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MAbstractSwPackage_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MAbstractSwPackage_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MAbstractSwPackage_SemicolonKeyword_7 extends KeywordToken  {
	
	public MAbstractSwPackage_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMAbstractSwPackageAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MAbstractSwPackage_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MAbstractSwPackage ****************/


/************ begin Rule MSwPackageProvidedInterface ****************
 *
 * MSwPackageProvidedInterface:
 * 	"provides" swinterface=[mespswi::MSwInterface|VersionedQualifiedName] "{"
 * 	parameterValueAssignments+=MSwPackageProvidedInterfacePVA* "}" ";";
 *
 **/

// "provides" swinterface=[mespswi::MSwInterface|VersionedQualifiedName] "{"
// parameterValueAssignments+=MSwPackageProvidedInterfacePVA* "}" ";"
protected class MSwPackageProvidedInterface_Group extends GroupToken {
	
	public MSwPackageProvidedInterface_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfaceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterface_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSwPackageProvidedInterfaceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "provides"
protected class MSwPackageProvidedInterface_ProvidesKeyword_0 extends KeywordToken  {
	
	public MSwPackageProvidedInterface_ProvidesKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfaceAccess().getProvidesKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// swinterface=[mespswi::MSwInterface|VersionedQualifiedName]
protected class MSwPackageProvidedInterface_SwinterfaceAssignment_1 extends AssignmentToken  {
	
	public MSwPackageProvidedInterface_SwinterfaceAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfaceAccess().getSwinterfaceAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterface_ProvidesKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("swinterface",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("swinterface");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageProvidedInterfaceAccess().getSwinterfaceMSwInterfaceCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageProvidedInterfaceAccess().getSwinterfaceMSwInterfaceCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "{"
protected class MSwPackageProvidedInterface_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MSwPackageProvidedInterface_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfaceAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterface_SwinterfaceAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValueAssignments+=MSwPackageProvidedInterfacePVA*
protected class MSwPackageProvidedInterface_ParameterValueAssignmentsAssignment_3 extends AssignmentToken  {
	
	public MSwPackageProvidedInterface_ParameterValueAssignmentsAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfaceAccess().getParameterValueAssignmentsAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVA_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameterValueAssignments",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameterValueAssignments");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageProvidedInterfacePVARule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMSwPackageProvidedInterfaceAccess().getParameterValueAssignmentsMSwPackageProvidedInterfacePVAParserRuleCall_3_0(); 
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
			case 0: return new MSwPackageProvidedInterface_ParameterValueAssignmentsAssignment_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MSwPackageProvidedInterface_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MSwPackageProvidedInterface_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MSwPackageProvidedInterface_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfaceAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterface_ParameterValueAssignmentsAssignment_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageProvidedInterface_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MSwPackageProvidedInterface_SemicolonKeyword_5 extends KeywordToken  {
	
	public MSwPackageProvidedInterface_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfaceAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterface_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MSwPackageProvidedInterface ****************/


/************ begin Rule MSwPackageProvidedInterfacePVA ****************
 *
 * MSwPackageProvidedInterfacePVA:
 * 	MSwPackageProvidedInterfacePVAExpression | MSwPackageProvidedInterfacePVASwitch;
 *
 **/

// MSwPackageProvidedInterfacePVAExpression | MSwPackageProvidedInterfacePVASwitch
protected class MSwPackageProvidedInterfacePVA_Alternatives extends AlternativesToken {

	public MSwPackageProvidedInterfacePVA_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVAAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVA_MSwPackageProvidedInterfacePVAExpressionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageProvidedInterfacePVA_MSwPackageProvidedInterfacePVASwitchParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSwPackageProvidedInterfacePVAExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMSwPackageProvidedInterfacePVASwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MSwPackageProvidedInterfacePVAExpression
protected class MSwPackageProvidedInterfacePVA_MSwPackageProvidedInterfacePVAExpressionParserRuleCall_0 extends RuleCallToken {
	
	public MSwPackageProvidedInterfacePVA_MSwPackageProvidedInterfacePVAExpressionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVAAccess().getMSwPackageProvidedInterfacePVAExpressionParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVAExpression_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSwPackageProvidedInterfacePVAExpressionRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MSwPackageProvidedInterfacePVAExpression_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MSwPackageProvidedInterfacePVASwitch
protected class MSwPackageProvidedInterfacePVA_MSwPackageProvidedInterfacePVASwitchParserRuleCall_1 extends RuleCallToken {
	
	public MSwPackageProvidedInterfacePVA_MSwPackageProvidedInterfacePVASwitchParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVAAccess().getMSwPackageProvidedInterfacePVASwitchParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSwPackageProvidedInterfacePVASwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MSwPackageProvidedInterfacePVASwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MSwPackageProvidedInterfacePVA ****************/


/************ begin Rule MSwPackageProvidedInterfacePVAExpression ****************
 *
 * MSwPackageProvidedInterfacePVAExpression:
 * 	"parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":="
 * 	parameterValue=MParameterValueExpression ";";
 *
 **/

// "parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" parameterValue=MParameterValueExpression
// ";"
protected class MSwPackageProvidedInterfacePVAExpression_Group extends GroupToken {
	
	public MSwPackageProvidedInterfacePVAExpression_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVAExpression_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSwPackageProvidedInterfacePVAExpressionRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "parameter"
protected class MSwPackageProvidedInterfacePVAExpression_ParameterKeyword_0 extends KeywordToken  {
	
	public MSwPackageProvidedInterfacePVAExpression_ParameterKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// parameter=[common::MParameter|VersionedQualifiedReferenceName]
protected class MSwPackageProvidedInterfacePVAExpression_ParameterAssignment_1 extends AssignmentToken  {
	
	public MSwPackageProvidedInterfacePVAExpression_ParameterAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVAExpression_ParameterKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameter",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameter");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterMParameterCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterMParameterCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":="
protected class MSwPackageProvidedInterfacePVAExpression_ColonEqualsSignKeyword_2 extends KeywordToken  {
	
	public MSwPackageProvidedInterfacePVAExpression_ColonEqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getColonEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVAExpression_ParameterAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValue=MParameterValueExpression
protected class MSwPackageProvidedInterfacePVAExpression_ParameterValueAssignment_3 extends AssignmentToken  {
	
	public MSwPackageProvidedInterfacePVAExpression_ParameterValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterValueAssignment_3();
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
				element = grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MSwPackageProvidedInterfacePVAExpression_ColonEqualsSignKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MSwPackageProvidedInterfacePVAExpression_SemicolonKeyword_4 extends KeywordToken  {
	
	public MSwPackageProvidedInterfacePVAExpression_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVAExpressionAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVAExpression_ParameterValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MSwPackageProvidedInterfacePVAExpression ****************/


/************ begin Rule MSwPackageProvidedInterfacePVASwitch ****************
 *
 * MSwPackageProvidedInterfacePVASwitch:
 * 	"parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" "switch" "{"
 * 	cases+=MSwPackageProvidedInterfacePVASwitchCase+ "}" ";";
 *
 **/

// "parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" "switch" "{"
// cases+=MSwPackageProvidedInterfacePVASwitchCase+ "}" ";"
protected class MSwPackageProvidedInterfacePVASwitch_Group extends GroupToken {
	
	public MSwPackageProvidedInterfacePVASwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitch_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSwPackageProvidedInterfacePVASwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "parameter"
protected class MSwPackageProvidedInterfacePVASwitch_ParameterKeyword_0 extends KeywordToken  {
	
	public MSwPackageProvidedInterfacePVASwitch_ParameterKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// parameter=[common::MParameter|VersionedQualifiedReferenceName]
protected class MSwPackageProvidedInterfacePVASwitch_ParameterAssignment_1 extends AssignmentToken  {
	
	public MSwPackageProvidedInterfacePVASwitch_ParameterAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitch_ParameterKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameter",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameter");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterMParameterCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getParameterMParameterCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":="
protected class MSwPackageProvidedInterfacePVASwitch_ColonEqualsSignKeyword_2 extends KeywordToken  {
	
	public MSwPackageProvidedInterfacePVASwitch_ColonEqualsSignKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getColonEqualsSignKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitch_ParameterAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MSwPackageProvidedInterfacePVASwitch_SwitchKeyword_3 extends KeywordToken  {
	
	public MSwPackageProvidedInterfacePVASwitch_SwitchKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getSwitchKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitch_ColonEqualsSignKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MSwPackageProvidedInterfacePVASwitch_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MSwPackageProvidedInterfacePVASwitch_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitch_SwitchKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MSwPackageProvidedInterfacePVASwitchCase+
protected class MSwPackageProvidedInterfacePVASwitch_CasesAssignment_5 extends AssignmentToken  {
	
	public MSwPackageProvidedInterfacePVASwitch_CasesAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getCasesAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getCasesMSwPackageProvidedInterfacePVASwitchCaseParserRuleCall_5_0(); 
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
			case 0: return new MSwPackageProvidedInterfacePVASwitch_CasesAssignment_5(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MSwPackageProvidedInterfacePVASwitch_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MSwPackageProvidedInterfacePVASwitch_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MSwPackageProvidedInterfacePVASwitch_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitch_CasesAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MSwPackageProvidedInterfacePVASwitch_SemicolonKeyword_7 extends KeywordToken  {
	
	public MSwPackageProvidedInterfacePVASwitch_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitch_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MSwPackageProvidedInterfacePVASwitch ****************/


/************ begin Rule MSwPackageProvidedInterfacePVASwitchCase ****************
 *
 * MSwPackageProvidedInterfacePVASwitchCase:
 * 	"case" platform=[MSwPackageSupportedPlatform] ":" parameterValue=MParameterValueExpression ";";
 *
 **/

// "case" platform=[MSwPackageSupportedPlatform] ":" parameterValue=MParameterValueExpression ";"
protected class MSwPackageProvidedInterfacePVASwitchCase_Group extends GroupToken {
	
	public MSwPackageProvidedInterfacePVASwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitchCase_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MSwPackageProvidedInterfacePVASwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MSwPackageProvidedInterfacePVASwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MSwPackageSupportedPlatform]
protected class MSwPackageProvidedInterfacePVASwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MSwPackageProvidedInterfacePVASwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MSwPackageProvidedInterfacePVASwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MSwPackageProvidedInterfacePVASwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameterValue=MParameterValueExpression
protected class MSwPackageProvidedInterfacePVASwitchCase_ParameterValueAssignment_3 extends AssignmentToken  {
	
	public MSwPackageProvidedInterfacePVASwitchCase_ParameterValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getParameterValueAssignment_3();
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
				element = grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getParameterValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MSwPackageProvidedInterfacePVASwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MSwPackageProvidedInterfacePVASwitchCase_SemicolonKeyword_4 extends KeywordToken  {
	
	public MSwPackageProvidedInterfacePVASwitchCase_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageProvidedInterfacePVASwitchCaseAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterfacePVASwitchCase_ParameterValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MSwPackageProvidedInterfacePVASwitchCase ****************/


/************ begin Rule MSwPackageRequiredInterface ****************
 *
 * MSwPackageRequiredInterface:
 * 	"requires" interface=[common::MCommonPackageElement|VersionedQualifiedName] "{" resourceDemands+=MResourceDemand* "}"
 * 	";";
 *
 **/

// "requires" interface=[common::MCommonPackageElement|VersionedQualifiedName] "{" resourceDemands+=MResourceDemand* "}"
// ";"
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

// "requires"
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

// "{"
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

// "}"
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

// ";"
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


/************ begin Rule MSwPackage ****************
 *
 * MSwPackage:
 * 	"swpackage" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
 * 	inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? ("extends" extends+=[MSwPackage|VersionedQualifiedName] (","
 * 	extends+=[MSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
 * 	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
 * 	& "construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
 * 	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
 * 	parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
 * 	("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
 * 	supportedPlatforms+=MSwPackageSupportedPlatform+ "}" ";") "}" ";";
 *
 **/

// "swpackage" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
// inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? ("extends" extends+=[MSwPackage|VersionedQualifiedName] (","
// extends+=[MSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
// & "construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
// parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
// ("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
// supportedPlatforms+=MSwPackageSupportedPlatform+ "}" ";") "}" ";"
protected class MSwPackage_Group extends GroupToken {
	
	public MSwPackage_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSwPackageRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "swpackage"
protected class MSwPackage_SwpackageKeyword_0 extends KeywordToken  {
	
	public MSwPackage_SwpackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getSwpackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MSwPackage_NameAssignment_1 extends AssignmentToken  {
	
	public MSwPackage_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_SwpackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMSwPackageAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMSwPackageAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
// inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)?
protected class MSwPackage_Group_2 extends GroupToken {
	
	public MSwPackage_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "inherits"
protected class MSwPackage_InheritsKeyword_2_0 extends KeywordToken  {
	
	public MSwPackage_InheritsKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getInheritsKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractSwPackage|VersionedQualifiedName]
protected class MSwPackage_InheritsAssignment_2_1 extends AssignmentToken  {
	
	public MSwPackage_InheritsAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getInheritsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_InheritsKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MAbstractSwPackage|VersionedQualifiedName])*
protected class MSwPackage_Group_2_2 extends GroupToken {
	
	public MSwPackage_Group_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_InheritsAssignment_2_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MSwPackage_CommaKeyword_2_2_0 extends KeywordToken  {
	
	public MSwPackage_CommaKeyword_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getCommaKeyword_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractSwPackage|VersionedQualifiedName]
protected class MSwPackage_InheritsAssignment_2_2_1 extends AssignmentToken  {
	
	public MSwPackage_InheritsAssignment_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getInheritsAssignment_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_CommaKeyword_2_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// ("extends" extends+=[MSwPackage|VersionedQualifiedName] ("," extends+=[MSwPackage|VersionedQualifiedName])*)?
protected class MSwPackage_Group_3 extends GroupToken {
	
	public MSwPackage_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_ExtendsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "extends"
protected class MSwPackage_ExtendsKeyword_3_0 extends KeywordToken  {
	
	public MSwPackage_ExtendsKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getExtendsKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_NameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MSwPackage|VersionedQualifiedName]
protected class MSwPackage_ExtendsAssignment_3_1 extends AssignmentToken  {
	
	public MSwPackage_ExtendsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getExtendsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_ExtendsKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageAccess().getExtendsMSwPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageAccess().getExtendsMSwPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," extends+=[MSwPackage|VersionedQualifiedName])*
protected class MSwPackage_Group_3_2 extends GroupToken {
	
	public MSwPackage_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_ExtendsAssignment_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MSwPackage_CommaKeyword_3_2_0 extends KeywordToken  {
	
	public MSwPackage_CommaKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getCommaKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_ExtendsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MSwPackage|VersionedQualifiedName]
protected class MSwPackage_ExtendsAssignment_3_2_1 extends AssignmentToken  {
	
	public MSwPackage_ExtendsAssignment_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getExtendsAssignment_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_CommaKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageAccess().getExtendsMSwPackageCrossReference_3_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageAccess().getExtendsMSwPackageCrossReference_3_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MSwPackage_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MSwPackage_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_Group_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MSwPackage_NameAssignment_1(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";" & "construction" "tools" ":="
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
// parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
// ("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
// supportedPlatforms+=MSwPackageSupportedPlatform+ "}" ";"
protected class MSwPackage_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MSwPackage_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_5_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MSwPackage_Group_5_0 extends GroupToken {
	
	public MSwPackage_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MSwPackage_VersionKeyword_5_0_0 extends KeywordToken  {
	
	public MSwPackage_VersionKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getVersionKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MSwPackage_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public MSwPackage_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_VersionKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MSwPackage_VersionAssignment_5_0_2 extends AssignmentToken  {
	
	public MSwPackage_VersionAssignment_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getVersionAssignment_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MSwPackage_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public MSwPackage_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_VersionAssignment_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";"
protected class MSwPackage_Group_5_1 extends GroupToken {
	
	public MSwPackage_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_SemicolonKeyword_5_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "languages"
protected class MSwPackage_LanguagesKeyword_5_1_0 extends KeywordToken  {
	
	public MSwPackage_LanguagesKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getLanguagesKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MSwPackage_ColonEqualsSignKeyword_5_1_1 extends KeywordToken  {
	
	public MSwPackage_ColonEqualsSignKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getColonEqualsSignKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_LanguagesKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MSwPackage_LanguagesAssignment_5_1_2 extends AssignmentToken  {
	
	public MSwPackage_LanguagesAssignment_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getLanguagesAssignment_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MSwPackage_Group_5_1_3 extends GroupToken {
	
	public MSwPackage_Group_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_LanguagesAssignment_5_1_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MSwPackage_CommaKeyword_5_1_3_0 extends KeywordToken  {
	
	public MSwPackage_CommaKeyword_5_1_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getCommaKeyword_5_1_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_5_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_LanguagesAssignment_5_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MSwPackage_LanguagesAssignment_5_1_3_1 extends AssignmentToken  {
	
	public MSwPackage_LanguagesAssignment_5_1_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getLanguagesAssignment_5_1_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_CommaKeyword_5_1_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MSwPackage_SemicolonKeyword_5_1_4 extends KeywordToken  {
	
	public MSwPackage_SemicolonKeyword_5_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_5_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_LanguagesAssignment_5_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// "construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";"
protected class MSwPackage_Group_5_2 extends GroupToken {
	
	public MSwPackage_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_SemicolonKeyword_5_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "construction"
protected class MSwPackage_ConstructionKeyword_5_2_0 extends KeywordToken  {
	
	public MSwPackage_ConstructionKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getConstructionKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "tools"
protected class MSwPackage_ToolsKeyword_5_2_1 extends KeywordToken  {
	
	public MSwPackage_ToolsKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getToolsKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_ConstructionKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MSwPackage_ColonEqualsSignKeyword_5_2_2 extends KeywordToken  {
	
	public MSwPackage_ColonEqualsSignKeyword_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getColonEqualsSignKeyword_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_ToolsKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
protected class MSwPackage_CtoolsAssignment_5_2_3 extends AssignmentToken  {
	
	public MSwPackage_CtoolsAssignment_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getCtoolsAssignment_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_ColonEqualsSignKeyword_5_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ctools",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ctools");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])*
protected class MSwPackage_Group_5_2_4 extends GroupToken {
	
	public MSwPackage_Group_5_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_5_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_CtoolsAssignment_5_2_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MSwPackage_CommaKeyword_5_2_4_0 extends KeywordToken  {
	
	public MSwPackage_CommaKeyword_5_2_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getCommaKeyword_5_2_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_5_2_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_CtoolsAssignment_5_2_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
protected class MSwPackage_CtoolsAssignment_5_2_4_1 extends AssignmentToken  {
	
	public MSwPackage_CtoolsAssignment_5_2_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getCtoolsAssignment_5_2_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_CommaKeyword_5_2_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ctools",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ctools");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MSwPackage_SemicolonKeyword_5_2_5 extends KeywordToken  {
	
	public MSwPackage_SemicolonKeyword_5_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_5_2_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_CtoolsAssignment_5_2_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")?
protected class MSwPackage_Group_5_3 extends GroupToken {
	
	public MSwPackage_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_SemicolonKeyword_5_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MSwPackage_ConfigurationKeyword_5_3_0 extends KeywordToken  {
	
	public MSwPackage_ConfigurationKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getConfigurationKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MSwPackage_ParametersKeyword_5_3_1 extends KeywordToken  {
	
	public MSwPackage_ParametersKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getParametersKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_ConfigurationKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MSwPackage_LeftCurlyBracketKeyword_5_3_2 extends KeywordToken  {
	
	public MSwPackage_LeftCurlyBracketKeyword_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_ParametersKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameter+
protected class MSwPackage_ParametersAssignment_5_3_3 extends AssignmentToken  {
	
	public MSwPackage_ParametersAssignment_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getParametersAssignment_5_3_3();
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
				element = grammarAccess.getMSwPackageAccess().getParametersMParameterParserRuleCall_5_3_3_0(); 
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
			case 0: return new MSwPackage_ParametersAssignment_5_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MSwPackage_LeftCurlyBracketKeyword_5_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MSwPackage_RightCurlyBracketKeyword_5_3_4 extends KeywordToken  {
	
	public MSwPackage_RightCurlyBracketKeyword_5_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_ParametersAssignment_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MSwPackage_SemicolonKeyword_5_3_5 extends KeywordToken  {
	
	public MSwPackage_SemicolonKeyword_5_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_RightCurlyBracketKeyword_5_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")?
protected class MSwPackage_Group_5_4 extends GroupToken {
	
	public MSwPackage_Group_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_SemicolonKeyword_5_4_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "provided"
protected class MSwPackage_ProvidedKeyword_5_4_0 extends KeywordToken  {
	
	public MSwPackage_ProvidedKeyword_5_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getProvidedKeyword_5_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_Group_5_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "interfaces"
protected class MSwPackage_InterfacesKeyword_5_4_1 extends KeywordToken  {
	
	public MSwPackage_InterfacesKeyword_5_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getInterfacesKeyword_5_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_ProvidedKeyword_5_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MSwPackage_LeftCurlyBracketKeyword_5_4_2 extends KeywordToken  {
	
	public MSwPackage_LeftCurlyBracketKeyword_5_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_InterfacesKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// provides+=MSwPackageProvidedInterface+
protected class MSwPackage_ProvidesAssignment_5_4_3 extends AssignmentToken  {
	
	public MSwPackage_ProvidesAssignment_5_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getProvidesAssignment_5_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterface_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("provides",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("provides");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageProvidedInterfaceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMSwPackageAccess().getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0(); 
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
			case 0: return new MSwPackage_ProvidesAssignment_5_4_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MSwPackage_LeftCurlyBracketKeyword_5_4_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MSwPackage_RightCurlyBracketKeyword_5_4_4 extends KeywordToken  {
	
	public MSwPackage_RightCurlyBracketKeyword_5_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_ProvidesAssignment_5_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MSwPackage_SemicolonKeyword_5_4_5 extends KeywordToken  {
	
	public MSwPackage_SemicolonKeyword_5_4_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_4_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_RightCurlyBracketKeyword_5_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")?
protected class MSwPackage_Group_5_5 extends GroupToken {
	
	public MSwPackage_Group_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_SemicolonKeyword_5_5_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "required"
protected class MSwPackage_RequiredKeyword_5_5_0 extends KeywordToken  {
	
	public MSwPackage_RequiredKeyword_5_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getRequiredKeyword_5_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_5_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_Group_5_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MSwPackage_Group_5_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "interfaces"
protected class MSwPackage_InterfacesKeyword_5_5_1 extends KeywordToken  {
	
	public MSwPackage_InterfacesKeyword_5_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getInterfacesKeyword_5_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_RequiredKeyword_5_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MSwPackage_LeftCurlyBracketKeyword_5_5_2 extends KeywordToken  {
	
	public MSwPackage_LeftCurlyBracketKeyword_5_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_InterfacesKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=MSwPackageRequiredInterface+
protected class MSwPackage_RequiresAssignment_5_5_3 extends AssignmentToken  {
	
	public MSwPackage_RequiresAssignment_5_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getRequiresAssignment_5_5_3();
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
				element = grammarAccess.getMSwPackageAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0(); 
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
			case 0: return new MSwPackage_RequiresAssignment_5_5_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MSwPackage_LeftCurlyBracketKeyword_5_5_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MSwPackage_RightCurlyBracketKeyword_5_5_4 extends KeywordToken  {
	
	public MSwPackage_RightCurlyBracketKeyword_5_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_RequiresAssignment_5_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MSwPackage_SemicolonKeyword_5_5_5 extends KeywordToken  {
	
	public MSwPackage_SemicolonKeyword_5_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_RightCurlyBracketKeyword_5_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "supported" "platforms" "{" supportedPlatforms+=MSwPackageSupportedPlatform+ "}" ";"
protected class MSwPackage_Group_5_6 extends GroupToken {
	
	public MSwPackage_Group_5_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getGroup_5_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_SemicolonKeyword_5_6_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "supported"
protected class MSwPackage_SupportedKeyword_5_6_0 extends KeywordToken  {
	
	public MSwPackage_SupportedKeyword_5_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getSupportedKeyword_5_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_Group_5_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackage_Group_5_4(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MSwPackage_Group_5_3(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MSwPackage_Group_5_2(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// "platforms"
protected class MSwPackage_PlatformsKeyword_5_6_1 extends KeywordToken  {
	
	public MSwPackage_PlatformsKeyword_5_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getPlatformsKeyword_5_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_SupportedKeyword_5_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MSwPackage_LeftCurlyBracketKeyword_5_6_2 extends KeywordToken  {
	
	public MSwPackage_LeftCurlyBracketKeyword_5_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getLeftCurlyBracketKeyword_5_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_PlatformsKeyword_5_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedPlatforms+=MSwPackageSupportedPlatform+
protected class MSwPackage_SupportedPlatformsAssignment_5_6_3 extends AssignmentToken  {
	
	public MSwPackage_SupportedPlatformsAssignment_5_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getSupportedPlatformsAssignment_5_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedPlatforms",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageSupportedPlatformRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMSwPackageAccess().getSupportedPlatformsMSwPackageSupportedPlatformParserRuleCall_5_6_3_0(); 
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
			case 0: return new MSwPackage_SupportedPlatformsAssignment_5_6_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MSwPackage_LeftCurlyBracketKeyword_5_6_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MSwPackage_RightCurlyBracketKeyword_5_6_4 extends KeywordToken  {
	
	public MSwPackage_RightCurlyBracketKeyword_5_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_5_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_SupportedPlatformsAssignment_5_6_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MSwPackage_SemicolonKeyword_5_6_5 extends KeywordToken  {
	
	public MSwPackage_SemicolonKeyword_5_6_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getSemicolonKeyword_5_6_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_RightCurlyBracketKeyword_5_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MSwPackage_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MSwPackage_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MSwPackage_SemicolonKeyword_7 extends KeywordToken  {
	
	public MSwPackage_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackage_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MSwPackage ****************/


/************ begin Rule MDriverSwPackage ****************
 *
 * MDriverSwPackage:
 * 	"driver" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
 * 	inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? ("extends" extends+=[MSwPackage|VersionedQualifiedName] (","
 * 	extends+=[MSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
 * 	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
 * 	& "construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
 * 	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
 * 	parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
 * 	("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
 * 	supportedPlatforms+=MDriverSwPackageSupportedPlatform+ "}" ";") "}" ";";
 *
 **/

// "driver" name=ID ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
// inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)? ("extends" extends+=[MSwPackage|VersionedQualifiedName] (","
// extends+=[MSwPackage|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "languages" ":="
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])* ";"
// & "construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
// parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
// ("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
// supportedPlatforms+=MDriverSwPackageSupportedPlatform+ "}" ";") "}" ";"
protected class MDriverSwPackage_Group extends GroupToken {
	
	public MDriverSwPackage_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDriverSwPackageRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "driver"
protected class MDriverSwPackage_DriverKeyword_0 extends KeywordToken  {
	
	public MDriverSwPackage_DriverKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getDriverKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MDriverSwPackage_NameAssignment_1 extends AssignmentToken  {
	
	public MDriverSwPackage_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_DriverKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDriverSwPackageAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMDriverSwPackageAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ("inherits" inherits+=[MAbstractSwPackage|VersionedQualifiedName] (","
// inherits+=[MAbstractSwPackage|VersionedQualifiedName])*)?
protected class MDriverSwPackage_Group_2 extends GroupToken {
	
	public MDriverSwPackage_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "inherits"
protected class MDriverSwPackage_InheritsKeyword_2_0 extends KeywordToken  {
	
	public MDriverSwPackage_InheritsKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getInheritsKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractSwPackage|VersionedQualifiedName]
protected class MDriverSwPackage_InheritsAssignment_2_1 extends AssignmentToken  {
	
	public MDriverSwPackage_InheritsAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getInheritsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_InheritsKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[MAbstractSwPackage|VersionedQualifiedName])*
protected class MDriverSwPackage_Group_2_2 extends GroupToken {
	
	public MDriverSwPackage_Group_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_InheritsAssignment_2_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MDriverSwPackage_CommaKeyword_2_2_0 extends KeywordToken  {
	
	public MDriverSwPackage_CommaKeyword_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_InheritsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// inherits+=[MAbstractSwPackage|VersionedQualifiedName]
protected class MDriverSwPackage_InheritsAssignment_2_2_1 extends AssignmentToken  {
	
	public MDriverSwPackage_InheritsAssignment_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getInheritsAssignment_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_CommaKeyword_2_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageAccess().getInheritsMAbstractSwPackageCrossReference_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// ("extends" extends+=[MSwPackage|VersionedQualifiedName] ("," extends+=[MSwPackage|VersionedQualifiedName])*)?
protected class MDriverSwPackage_Group_3 extends GroupToken {
	
	public MDriverSwPackage_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_ExtendsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "extends"
protected class MDriverSwPackage_ExtendsKeyword_3_0 extends KeywordToken  {
	
	public MDriverSwPackage_ExtendsKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getExtendsKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_NameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MSwPackage|VersionedQualifiedName]
protected class MDriverSwPackage_ExtendsAssignment_3_1 extends AssignmentToken  {
	
	public MDriverSwPackage_ExtendsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getExtendsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_ExtendsKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," extends+=[MSwPackage|VersionedQualifiedName])*
protected class MDriverSwPackage_Group_3_2 extends GroupToken {
	
	public MDriverSwPackage_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_ExtendsAssignment_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MDriverSwPackage_CommaKeyword_3_2_0 extends KeywordToken  {
	
	public MDriverSwPackage_CommaKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_ExtendsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MSwPackage|VersionedQualifiedName]
protected class MDriverSwPackage_ExtendsAssignment_3_2_1 extends AssignmentToken  {
	
	public MDriverSwPackage_ExtendsAssignment_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getExtendsAssignment_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_CommaKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageCrossReference_3_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageAccess().getExtendsMSwPackageCrossReference_3_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MDriverSwPackage_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MDriverSwPackage_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_Group_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverSwPackage_NameAssignment_1(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";" & "construction" "tools" ":="
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";" & ("configuration" "parameters" "{"
// parameters+=MParameter+ "}" ";")? & ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")? &
// ("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")? & "supported" "platforms" "{"
// supportedPlatforms+=MDriverSwPackageSupportedPlatform+ "}" ";"
protected class MDriverSwPackage_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MDriverSwPackage_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_5_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MDriverSwPackage_Group_5_0 extends GroupToken {
	
	public MDriverSwPackage_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MDriverSwPackage_VersionKeyword_5_0_0 extends KeywordToken  {
	
	public MDriverSwPackage_VersionKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getVersionKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSwPackage_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public MDriverSwPackage_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_VersionKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MDriverSwPackage_VersionAssignment_5_0_2 extends AssignmentToken  {
	
	public MDriverSwPackage_VersionAssignment_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getVersionAssignment_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDriverSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMDriverSwPackageAccess().getVersionVersionParserRuleCall_5_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MDriverSwPackage_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public MDriverSwPackage_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_VersionAssignment_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";"
protected class MDriverSwPackage_Group_5_1 extends GroupToken {
	
	public MDriverSwPackage_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_SemicolonKeyword_5_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "languages"
protected class MDriverSwPackage_LanguagesKeyword_5_1_0 extends KeywordToken  {
	
	public MDriverSwPackage_LanguagesKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getLanguagesKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSwPackage_ColonEqualsSignKeyword_5_1_1 extends KeywordToken  {
	
	public MDriverSwPackage_ColonEqualsSignKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getColonEqualsSignKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_LanguagesKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MDriverSwPackage_LanguagesAssignment_5_1_2 extends AssignmentToken  {
	
	public MDriverSwPackage_LanguagesAssignment_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getLanguagesAssignment_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MDriverSwPackage_Group_5_1_3 extends GroupToken {
	
	public MDriverSwPackage_Group_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_LanguagesAssignment_5_1_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MDriverSwPackage_CommaKeyword_5_1_3_0 extends KeywordToken  {
	
	public MDriverSwPackage_CommaKeyword_5_1_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_5_1_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_5_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_LanguagesAssignment_5_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MDriverSwPackage_LanguagesAssignment_5_1_3_1 extends AssignmentToken  {
	
	public MDriverSwPackage_LanguagesAssignment_5_1_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getLanguagesAssignment_5_1_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_CommaKeyword_5_1_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageAccess().getLanguagesMLanguageCrossReference_5_1_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSwPackage_SemicolonKeyword_5_1_4 extends KeywordToken  {
	
	public MDriverSwPackage_SemicolonKeyword_5_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_5_1_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_LanguagesAssignment_5_1_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// "construction" "tools" ":=" ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ";"
protected class MDriverSwPackage_Group_5_2 extends GroupToken {
	
	public MDriverSwPackage_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_SemicolonKeyword_5_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "construction"
protected class MDriverSwPackage_ConstructionKeyword_5_2_0 extends KeywordToken  {
	
	public MDriverSwPackage_ConstructionKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getConstructionKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "tools"
protected class MDriverSwPackage_ToolsKeyword_5_2_1 extends KeywordToken  {
	
	public MDriverSwPackage_ToolsKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getToolsKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_ConstructionKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSwPackage_ColonEqualsSignKeyword_5_2_2 extends KeywordToken  {
	
	public MDriverSwPackage_ColonEqualsSignKeyword_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getColonEqualsSignKeyword_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_ToolsKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
protected class MDriverSwPackage_CtoolsAssignment_5_2_3 extends AssignmentToken  {
	
	public MDriverSwPackage_CtoolsAssignment_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getCtoolsAssignment_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_ColonEqualsSignKeyword_5_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ctools",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ctools");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])*
protected class MDriverSwPackage_Group_5_2_4 extends GroupToken {
	
	public MDriverSwPackage_Group_5_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_5_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_CtoolsAssignment_5_2_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MDriverSwPackage_CommaKeyword_5_2_4_0 extends KeywordToken  {
	
	public MDriverSwPackage_CommaKeyword_5_2_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getCommaKeyword_5_2_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_5_2_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_CtoolsAssignment_5_2_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
protected class MDriverSwPackage_CtoolsAssignment_5_2_4_1 extends AssignmentToken  {
	
	public MDriverSwPackage_CtoolsAssignment_5_2_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getCtoolsAssignment_5_2_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_CommaKeyword_5_2_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ctools",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ctools");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageAccess().getCtoolsMConstructionToolCrossReference_5_2_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSwPackage_SemicolonKeyword_5_2_5 extends KeywordToken  {
	
	public MDriverSwPackage_SemicolonKeyword_5_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_5_2_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_CtoolsAssignment_5_2_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")?
protected class MDriverSwPackage_Group_5_3 extends GroupToken {
	
	public MDriverSwPackage_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_SemicolonKeyword_5_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MDriverSwPackage_ConfigurationKeyword_5_3_0 extends KeywordToken  {
	
	public MDriverSwPackage_ConfigurationKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getConfigurationKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MDriverSwPackage_ParametersKeyword_5_3_1 extends KeywordToken  {
	
	public MDriverSwPackage_ParametersKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getParametersKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_ConfigurationKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDriverSwPackage_LeftCurlyBracketKeyword_5_3_2 extends KeywordToken  {
	
	public MDriverSwPackage_LeftCurlyBracketKeyword_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_ParametersKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameter+
protected class MDriverSwPackage_ParametersAssignment_5_3_3 extends AssignmentToken  {
	
	public MDriverSwPackage_ParametersAssignment_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getParametersAssignment_5_3_3();
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
				element = grammarAccess.getMDriverSwPackageAccess().getParametersMParameterParserRuleCall_5_3_3_0(); 
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
			case 0: return new MDriverSwPackage_ParametersAssignment_5_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverSwPackage_LeftCurlyBracketKeyword_5_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDriverSwPackage_RightCurlyBracketKeyword_5_3_4 extends KeywordToken  {
	
	public MDriverSwPackage_RightCurlyBracketKeyword_5_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_ParametersAssignment_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSwPackage_SemicolonKeyword_5_3_5 extends KeywordToken  {
	
	public MDriverSwPackage_SemicolonKeyword_5_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_RightCurlyBracketKeyword_5_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("provided" "interfaces" "{" provides+=MSwPackageProvidedInterface+ "}" ";")?
protected class MDriverSwPackage_Group_5_4 extends GroupToken {
	
	public MDriverSwPackage_Group_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_SemicolonKeyword_5_4_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "provided"
protected class MDriverSwPackage_ProvidedKeyword_5_4_0 extends KeywordToken  {
	
	public MDriverSwPackage_ProvidedKeyword_5_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getProvidedKeyword_5_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_Group_5_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "interfaces"
protected class MDriverSwPackage_InterfacesKeyword_5_4_1 extends KeywordToken  {
	
	public MDriverSwPackage_InterfacesKeyword_5_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getInterfacesKeyword_5_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_ProvidedKeyword_5_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDriverSwPackage_LeftCurlyBracketKeyword_5_4_2 extends KeywordToken  {
	
	public MDriverSwPackage_LeftCurlyBracketKeyword_5_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_InterfacesKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// provides+=MSwPackageProvidedInterface+
protected class MDriverSwPackage_ProvidesAssignment_5_4_3 extends AssignmentToken  {
	
	public MDriverSwPackage_ProvidesAssignment_5_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getProvidesAssignment_5_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageProvidedInterface_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("provides",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("provides");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageProvidedInterfaceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDriverSwPackageAccess().getProvidesMSwPackageProvidedInterfaceParserRuleCall_5_4_3_0(); 
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
			case 0: return new MDriverSwPackage_ProvidesAssignment_5_4_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverSwPackage_LeftCurlyBracketKeyword_5_4_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDriverSwPackage_RightCurlyBracketKeyword_5_4_4 extends KeywordToken  {
	
	public MDriverSwPackage_RightCurlyBracketKeyword_5_4_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_4_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_ProvidesAssignment_5_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSwPackage_SemicolonKeyword_5_4_5 extends KeywordToken  {
	
	public MDriverSwPackage_SemicolonKeyword_5_4_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_4_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_RightCurlyBracketKeyword_5_4_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")?
protected class MDriverSwPackage_Group_5_5 extends GroupToken {
	
	public MDriverSwPackage_Group_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_SemicolonKeyword_5_5_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "required"
protected class MDriverSwPackage_RequiredKeyword_5_5_0 extends KeywordToken  {
	
	public MDriverSwPackage_RequiredKeyword_5_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getRequiredKeyword_5_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_5_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_Group_5_3(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverSwPackage_Group_5_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "interfaces"
protected class MDriverSwPackage_InterfacesKeyword_5_5_1 extends KeywordToken  {
	
	public MDriverSwPackage_InterfacesKeyword_5_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getInterfacesKeyword_5_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_RequiredKeyword_5_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDriverSwPackage_LeftCurlyBracketKeyword_5_5_2 extends KeywordToken  {
	
	public MDriverSwPackage_LeftCurlyBracketKeyword_5_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_InterfacesKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=MSwPackageRequiredInterface+
protected class MDriverSwPackage_RequiresAssignment_5_5_3 extends AssignmentToken  {
	
	public MDriverSwPackage_RequiresAssignment_5_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getRequiresAssignment_5_5_3();
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
				element = grammarAccess.getMDriverSwPackageAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_5_3_0(); 
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
			case 0: return new MDriverSwPackage_RequiresAssignment_5_5_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverSwPackage_LeftCurlyBracketKeyword_5_5_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDriverSwPackage_RightCurlyBracketKeyword_5_5_4 extends KeywordToken  {
	
	public MDriverSwPackage_RightCurlyBracketKeyword_5_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_RequiresAssignment_5_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSwPackage_SemicolonKeyword_5_5_5 extends KeywordToken  {
	
	public MDriverSwPackage_SemicolonKeyword_5_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_RightCurlyBracketKeyword_5_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "supported" "platforms" "{" supportedPlatforms+=MDriverSwPackageSupportedPlatform+ "}" ";"
protected class MDriverSwPackage_Group_5_6 extends GroupToken {
	
	public MDriverSwPackage_Group_5_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getGroup_5_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_SemicolonKeyword_5_6_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "supported"
protected class MDriverSwPackage_SupportedKeyword_5_6_0 extends KeywordToken  {
	
	public MDriverSwPackage_SupportedKeyword_5_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getSupportedKeyword_5_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_Group_5_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackage_Group_5_4(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverSwPackage_Group_5_3(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MDriverSwPackage_Group_5_2(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// "platforms"
protected class MDriverSwPackage_PlatformsKeyword_5_6_1 extends KeywordToken  {
	
	public MDriverSwPackage_PlatformsKeyword_5_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getPlatformsKeyword_5_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_SupportedKeyword_5_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDriverSwPackage_LeftCurlyBracketKeyword_5_6_2 extends KeywordToken  {
	
	public MDriverSwPackage_LeftCurlyBracketKeyword_5_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getLeftCurlyBracketKeyword_5_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_PlatformsKeyword_5_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedPlatforms+=MDriverSwPackageSupportedPlatform+
protected class MDriverSwPackage_SupportedPlatformsAssignment_5_6_3 extends AssignmentToken  {
	
	public MDriverSwPackage_SupportedPlatformsAssignment_5_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getSupportedPlatformsAssignment_5_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedPlatforms",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedPlatforms");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageSupportedPlatformRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDriverSwPackageAccess().getSupportedPlatformsMDriverSwPackageSupportedPlatformParserRuleCall_5_6_3_0(); 
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
			case 0: return new MDriverSwPackage_SupportedPlatformsAssignment_5_6_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverSwPackage_LeftCurlyBracketKeyword_5_6_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDriverSwPackage_RightCurlyBracketKeyword_5_6_4 extends KeywordToken  {
	
	public MDriverSwPackage_RightCurlyBracketKeyword_5_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_5_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_SupportedPlatformsAssignment_5_6_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSwPackage_SemicolonKeyword_5_6_5 extends KeywordToken  {
	
	public MDriverSwPackage_SemicolonKeyword_5_6_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_5_6_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_RightCurlyBracketKeyword_5_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MDriverSwPackage_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MDriverSwPackage_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSwPackage_SemicolonKeyword_7 extends KeywordToken  {
	
	public MDriverSwPackage_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackage_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MDriverSwPackage ****************/


/************ begin Rule MDriverSwPackageSupportedPlatform ****************
 *
 * MDriverSwPackageSupportedPlatform:
 * 	{MDriverSwPackageSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
 * 	osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
 * 	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
 * 	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
 * 	compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
 * 	microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
 * 	board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
 * 	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
 * 	";")? & ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")? & ("required" "interfaces" "{"
 * 	requires+=MSwPackageRequiredInterface+ "}" ";")? & ("supported" "devices" "{"
 * 	supportedDevices+=MDriverSwPackageSupportedDevice+ "}" ";")?) "}" ";";
 *
 **/

// {MDriverSwPackageSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
// osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
// os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
// architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
// compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
// board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ";")? & ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")? & ("required" "interfaces" "{"
// requires+=MSwPackageRequiredInterface+ "}" ";")? & ("supported" "devices" "{"
// supportedDevices+=MDriverSwPackageSupportedDevice+ "}" ";")?) "}" ";"
protected class MDriverSwPackageSupportedPlatform_Group extends GroupToken {
	
	public MDriverSwPackageSupportedPlatform_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMDriverSwPackageSupportedPlatformAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MDriverSwPackageSupportedPlatform}
protected class MDriverSwPackageSupportedPlatform_MDriverSwPackageSupportedPlatformAction_0 extends ActionToken  {

	public MDriverSwPackageSupportedPlatform_MDriverSwPackageSupportedPlatformAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMDriverSwPackageSupportedPlatformAction_0();
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
protected class MDriverSwPackageSupportedPlatform_SupportedKeyword_1 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SupportedKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_MDriverSwPackageSupportedPlatformAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "platform"
protected class MDriverSwPackageSupportedPlatform_PlatformKeyword_2 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_PlatformKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getPlatformKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SupportedKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MDriverSwPackageSupportedPlatform_NameAssignment_3 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedPlatform_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_PlatformKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MDriverSwPackageSupportedPlatform_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
// os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
// architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
// compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
// board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ";")? & ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")? & ("required" "interfaces" "{"
// requires+=MSwPackageRequiredInterface+ "}" ";")? & ("supported" "devices" "{"
// supportedDevices+=MDriverSwPackageSupportedDevice+ "}" ";")?
protected class MDriverSwPackageSupportedPlatform_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MDriverSwPackageSupportedPlatform_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group_5_9(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedPlatform_Group_5_8(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverSwPackageSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MDriverSwPackageSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MDriverSwPackageSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 4, inst);
			default: return null;
		}	
	}

}

// "osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";"
protected class MDriverSwPackageSupportedPlatform_Group_5_0 extends GroupToken {
	
	public MDriverSwPackageSupportedPlatform_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "osapi"
protected class MDriverSwPackageSupportedPlatform_OsapiKeyword_5_0_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_OsapiKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_OsapiKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_Alternatives_5_0_2 extends AlternativesToken {

	public MDriverSwPackageSupportedPlatform_Alternatives_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_AnyKeyword_5_0_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedPlatform_OsapiAssignment_5_0_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MDriverSwPackageSupportedPlatform_AnyKeyword_5_0_2_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_AnyKeyword_5_0_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_0_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_OsapiAssignment_5_0_2_1 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedPlatform_OsapiAssignment_5_0_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiAssignment_5_0_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("osapi",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("osapi");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Alternatives_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "os" ":=" ("any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";"
protected class MDriverSwPackageSupportedPlatform_Group_5_1 extends GroupToken {
	
	public MDriverSwPackageSupportedPlatform_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "os"
protected class MDriverSwPackageSupportedPlatform_OsKeyword_5_1_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_OsKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_1_1 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_OsKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_Alternatives_5_1_2 extends AlternativesToken {

	public MDriverSwPackageSupportedPlatform_Alternatives_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_AnyKeyword_5_1_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedPlatform_OsAssignment_5_1_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MDriverSwPackageSupportedPlatform_AnyKeyword_5_1_2_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_AnyKeyword_5_1_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_1_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// os=[pdl::MOperatingSystem|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_OsAssignment_5_1_2_1 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedPlatform_OsAssignment_5_1_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsAssignment_5_1_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("os",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("os");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_1_3 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Alternatives_5_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "architecture" ":=" ("any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";"
protected class MDriverSwPackageSupportedPlatform_Group_5_2 extends GroupToken {
	
	public MDriverSwPackageSupportedPlatform_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "architecture"
protected class MDriverSwPackageSupportedPlatform_ArchitectureKeyword_5_2_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_ArchitectureKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_2_1 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ArchitectureKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_Alternatives_5_2_2 extends AlternativesToken {

	public MDriverSwPackageSupportedPlatform_Alternatives_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_AnyKeyword_5_2_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedPlatform_ArchitectureAssignment_5_2_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MDriverSwPackageSupportedPlatform_AnyKeyword_5_2_2_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_AnyKeyword_5_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// architecture=[pdl::MArchitecture|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_ArchitectureAssignment_5_2_2_1 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedPlatform_ArchitectureAssignment_5_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("architecture",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("architecture");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_2_3 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Alternatives_5_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("compiler" ":=" compiler=[pdl::MCompiler|VersionedQualifiedName] ";")?
protected class MDriverSwPackageSupportedPlatform_Group_5_3 extends GroupToken {
	
	public MDriverSwPackageSupportedPlatform_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "compiler"
protected class MDriverSwPackageSupportedPlatform_CompilerKeyword_5_3_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_CompilerKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_3_1 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_CompilerKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// compiler=[pdl::MCompiler|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_CompilerAssignment_5_3_2 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedPlatform_CompilerAssignment_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerAssignment_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("compiler",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("compiler");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_3_3 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_CompilerAssignment_5_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "microprocessor" ":=" ("any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";"
protected class MDriverSwPackageSupportedPlatform_Group_5_4 extends GroupToken {
	
	public MDriverSwPackageSupportedPlatform_Group_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "microprocessor"
protected class MDriverSwPackageSupportedPlatform_MicroprocessorKeyword_5_4_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_MicroprocessorKeyword_5_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedPlatform_Group_5_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_4_1 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_MicroprocessorKeyword_5_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_Alternatives_5_4_2 extends AlternativesToken {

	public MDriverSwPackageSupportedPlatform_Alternatives_5_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_AnyKeyword_5_4_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedPlatform_MicroprocessorAssignment_5_4_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MDriverSwPackageSupportedPlatform_AnyKeyword_5_4_2_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_AnyKeyword_5_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_MicroprocessorAssignment_5_4_2_1 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedPlatform_MicroprocessorAssignment_5_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("microprocessor",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("microprocessor");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_4_3 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Alternatives_5_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "board" ":=" ("any" | board=[pdl::MBoard|VersionedQualifiedName]) ";"
protected class MDriverSwPackageSupportedPlatform_Group_5_5 extends GroupToken {
	
	public MDriverSwPackageSupportedPlatform_Group_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "board"
protected class MDriverSwPackageSupportedPlatform_BoardKeyword_5_5_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_BoardKeyword_5_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardKeyword_5_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_5_1 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_BoardKeyword_5_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | board=[pdl::MBoard|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_Alternatives_5_5_2 extends AlternativesToken {

	public MDriverSwPackageSupportedPlatform_Alternatives_5_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAlternatives_5_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_AnyKeyword_5_5_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedPlatform_BoardAssignment_5_5_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MDriverSwPackageSupportedPlatform_AnyKeyword_5_5_2_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_AnyKeyword_5_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getAnyKeyword_5_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// board=[pdl::MBoard|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_BoardAssignment_5_5_2_1 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedPlatform_BoardAssignment_5_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardAssignment_5_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("board",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("board");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_5_3 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Alternatives_5_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")?
protected class MDriverSwPackageSupportedPlatform_Group_5_6 extends GroupToken {
	
	public MDriverSwPackageSupportedPlatform_Group_5_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "languages"
protected class MDriverSwPackageSupportedPlatform_LanguagesKeyword_5_6_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_LanguagesKeyword_5_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesKeyword_5_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_6_1 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_LanguagesKeyword_5_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_LanguagesAssignment_5_6_2 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedPlatform_LanguagesAssignment_5_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MDriverSwPackageSupportedPlatform_Group_5_6_3 extends GroupToken {
	
	public MDriverSwPackageSupportedPlatform_Group_5_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_LanguagesAssignment_5_6_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MDriverSwPackageSupportedPlatform_CommaKeyword_5_6_3_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_CommaKeyword_5_6_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getCommaKeyword_5_6_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group_5_6_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedPlatform_LanguagesAssignment_5_6_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MDriverSwPackageSupportedPlatform_LanguagesAssignment_5_6_3_1 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedPlatform_LanguagesAssignment_5_6_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_CommaKeyword_5_6_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_6_4 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group_5_6_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedPlatform_LanguagesAssignment_5_6_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameter+ "}" ";")?
protected class MDriverSwPackageSupportedPlatform_Group_5_7 extends GroupToken {
	
	public MDriverSwPackageSupportedPlatform_Group_5_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_7_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MDriverSwPackageSupportedPlatform_ConfigurationKeyword_5_7_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_ConfigurationKeyword_5_7_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getConfigurationKeyword_5_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MDriverSwPackageSupportedPlatform_ParametersKeyword_5_7_1 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_ParametersKeyword_5_7_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersKeyword_5_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ConfigurationKeyword_5_7_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDriverSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_7_2 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_7_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ParametersKeyword_5_7_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameter+
protected class MDriverSwPackageSupportedPlatform_ParametersAssignment_5_7_3 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedPlatform_ParametersAssignment_5_7_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersAssignment_5_7_3();
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
				element = grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getParametersMParameterParserRuleCall_5_7_3_0(); 
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
			case 0: return new MDriverSwPackageSupportedPlatform_ParametersAssignment_5_7_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_7_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDriverSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_7_4 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_7_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_ParametersAssignment_5_7_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_7_5 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_7_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_7_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_7_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")?
protected class MDriverSwPackageSupportedPlatform_Group_5_8 extends GroupToken {
	
	public MDriverSwPackageSupportedPlatform_Group_5_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_8_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "required"
protected class MDriverSwPackageSupportedPlatform_RequiredKeyword_5_8_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_RequiredKeyword_5_8_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiredKeyword_5_8_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverSwPackageSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "interfaces"
protected class MDriverSwPackageSupportedPlatform_InterfacesKeyword_5_8_1 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_InterfacesKeyword_5_8_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getInterfacesKeyword_5_8_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_RequiredKeyword_5_8_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDriverSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_8_2 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_8_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_InterfacesKeyword_5_8_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=MSwPackageRequiredInterface+
protected class MDriverSwPackageSupportedPlatform_RequiresAssignment_5_8_3 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedPlatform_RequiresAssignment_5_8_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiresAssignment_5_8_3();
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
				element = grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0(); 
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
			case 0: return new MDriverSwPackageSupportedPlatform_RequiresAssignment_5_8_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_8_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDriverSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_8_4 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_8_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_RequiresAssignment_5_8_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_8_5 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_8_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_8_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_8_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("supported" "devices" "{" supportedDevices+=MDriverSwPackageSupportedDevice+ "}" ";")?
protected class MDriverSwPackageSupportedPlatform_Group_5_9 extends GroupToken {
	
	public MDriverSwPackageSupportedPlatform_Group_5_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getGroup_5_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_9_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "supported"
protected class MDriverSwPackageSupportedPlatform_SupportedKeyword_5_9_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SupportedKeyword_5_9_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedKeyword_5_9_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_Group_5_8(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MDriverSwPackageSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MDriverSwPackageSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// "devices"
protected class MDriverSwPackageSupportedPlatform_DevicesKeyword_5_9_1 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_DevicesKeyword_5_9_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getDevicesKeyword_5_9_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SupportedKeyword_5_9_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MDriverSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_9_2 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_9_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_9_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_DevicesKeyword_5_9_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedDevices+=MDriverSwPackageSupportedDevice+
protected class MDriverSwPackageSupportedPlatform_SupportedDevicesAssignment_5_9_3 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedPlatform_SupportedDevicesAssignment_5_9_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedDevicesAssignment_5_9_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedDevice_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedDevices",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedDevices");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageSupportedDeviceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSupportedDevicesMDriverSwPackageSupportedDeviceParserRuleCall_5_9_3_0(); 
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
			case 0: return new MDriverSwPackageSupportedPlatform_SupportedDevicesAssignment_5_9_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MDriverSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_9_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MDriverSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_9_4 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_9_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_9_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_SupportedDevicesAssignment_5_9_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_9_5 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SemicolonKeyword_5_9_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_9_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_9_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MDriverSwPackageSupportedPlatform_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSwPackageSupportedPlatform_SemicolonKeyword_7 extends KeywordToken  {
	
	public MDriverSwPackageSupportedPlatform_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedPlatformAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedPlatform_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MDriverSwPackageSupportedPlatform ****************/


/************ begin Rule MDriverSwPackageSupportedDevice ****************
 *
 * MDriverSwPackageSupportedDevice:
 * 	"device" device=[pdl::MDevice|VersionedQualifiedName] name=ID "{" ("required" ":=" required=MParameterValueExpression
 * 	";")? "}" ";";
 *
 **/

// "device" device=[pdl::MDevice|VersionedQualifiedName] name=ID "{" ("required" ":=" required=MParameterValueExpression
// ";")? "}" ";"
protected class MDriverSwPackageSupportedDevice_Group extends GroupToken {
	
	public MDriverSwPackageSupportedDevice_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedDevice_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMDriverSwPackageSupportedDeviceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "device"
protected class MDriverSwPackageSupportedDevice_DeviceKeyword_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedDevice_DeviceKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// device=[pdl::MDevice|VersionedQualifiedName]
protected class MDriverSwPackageSupportedDevice_DeviceAssignment_1 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedDevice_DeviceAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedDevice_DeviceKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("device",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("device");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getDeviceMDeviceCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MDriverSwPackageSupportedDevice_NameAssignment_2 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedDevice_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedDevice_DeviceAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MDriverSwPackageSupportedDevice_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MDriverSwPackageSupportedDevice_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedDevice_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("required" ":=" required=MParameterValueExpression ";")?
protected class MDriverSwPackageSupportedDevice_Group_4 extends GroupToken {
	
	public MDriverSwPackageSupportedDevice_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedDevice_SemicolonKeyword_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "required"
protected class MDriverSwPackageSupportedDevice_RequiredKeyword_4_0 extends KeywordToken  {
	
	public MDriverSwPackageSupportedDevice_RequiredKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRequiredKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedDevice_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MDriverSwPackageSupportedDevice_ColonEqualsSignKeyword_4_1 extends KeywordToken  {
	
	public MDriverSwPackageSupportedDevice_ColonEqualsSignKeyword_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getColonEqualsSignKeyword_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedDevice_RequiredKeyword_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// required=MParameterValueExpression
protected class MDriverSwPackageSupportedDevice_RequiredAssignment_4_2 extends AssignmentToken  {
	
	public MDriverSwPackageSupportedDevice_RequiredAssignment_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRequiredAssignment_4_2();
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
				element = grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRequiredMParameterValueExpressionParserRuleCall_4_2_0(); 
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
			case 0: return new MDriverSwPackageSupportedDevice_ColonEqualsSignKeyword_4_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MDriverSwPackageSupportedDevice_SemicolonKeyword_4_3 extends KeywordToken  {
	
	public MDriverSwPackageSupportedDevice_SemicolonKeyword_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getSemicolonKeyword_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedDevice_RequiredAssignment_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "}"
protected class MDriverSwPackageSupportedDevice_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MDriverSwPackageSupportedDevice_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedDevice_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MDriverSwPackageSupportedDevice_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MDriverSwPackageSupportedDevice_SemicolonKeyword_6 extends KeywordToken  {
	
	public MDriverSwPackageSupportedDevice_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMDriverSwPackageSupportedDeviceAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MDriverSwPackageSupportedDevice_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MDriverSwPackageSupportedDevice ****************/


/************ begin Rule MSwPackageSupportedPlatform ****************
 *
 * MSwPackageSupportedPlatform:
 * 	{MSwPackageSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
 * 	osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
 * 	os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
 * 	architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
 * 	compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
 * 	microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
 * 	board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
 * 	languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
 * 	";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? & ("required" "interfaces" "{"
 * 	requires+=MSwPackageRequiredInterface+ "}" ";")?) "}" ";";
 *
 **/

// {MSwPackageSupportedPlatform} "supported" "platform" name=ID "{" ("osapi" ":=" ("any" |
// osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
// os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
// architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
// compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
// board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? & ("required" "interfaces" "{"
// requires+=MSwPackageRequiredInterface+ "}" ";")?) "}" ";"
protected class MSwPackageSupportedPlatform_Group extends GroupToken {
	
	public MSwPackageSupportedPlatform_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSwPackageSupportedPlatformAccess().getMSwPackageSupportedPlatformAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MSwPackageSupportedPlatform}
protected class MSwPackageSupportedPlatform_MSwPackageSupportedPlatformAction_0 extends ActionToken  {

	public MSwPackageSupportedPlatform_MSwPackageSupportedPlatformAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getMSwPackageSupportedPlatformAction_0();
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
protected class MSwPackageSupportedPlatform_SupportedKeyword_1 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_SupportedKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getSupportedKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_MSwPackageSupportedPlatformAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "platform"
protected class MSwPackageSupportedPlatform_PlatformKeyword_2 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_PlatformKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getPlatformKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_SupportedKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MSwPackageSupportedPlatform_NameAssignment_3 extends AssignmentToken  {
	
	public MSwPackageSupportedPlatform_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_PlatformKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMSwPackageSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMSwPackageSupportedPlatformAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MSwPackageSupportedPlatform_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";" & "os" ":=" ("any" |
// os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";" & "architecture" ":=" ("any" |
// architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";" & ("compiler" ":="
// compiler=[pdl::MCompiler|VersionedQualifiedName] ";")? & "microprocessor" ":=" ("any" |
// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";" & "board" ":=" ("any" |
// board=[pdl::MBoard|VersionedQualifiedName]) ";" & ("languages" ":="
// languages+=[system::MLanguage|VersionedQualifiedName] ("," languages+=[system::MLanguage|VersionedQualifiedName])*
// ";")? & ("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")? & ("required" "interfaces" "{"
// requires+=MSwPackageRequiredInterface+ "}" ";")?
protected class MSwPackageSupportedPlatform_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MSwPackageSupportedPlatform_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Group_5_8(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MSwPackageSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MSwPackageSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// "osapi" ":=" ("any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]) ";"
protected class MSwPackageSupportedPlatform_Group_5_0 extends GroupToken {
	
	public MSwPackageSupportedPlatform_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "osapi"
protected class MSwPackageSupportedPlatform_OsapiKeyword_5_0_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_OsapiKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_OsapiKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_Alternatives_5_0_2 extends AlternativesToken {

	public MSwPackageSupportedPlatform_Alternatives_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_AnyKeyword_5_0_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageSupportedPlatform_OsapiAssignment_5_0_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MSwPackageSupportedPlatform_AnyKeyword_5_0_2_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_AnyKeyword_5_0_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_0_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// osapi=[pdl::MOperatingSystemAPI|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_OsapiAssignment_5_0_2_1 extends AssignmentToken  {
	
	public MSwPackageSupportedPlatform_OsapiAssignment_5_0_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiAssignment_5_0_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("osapi",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("osapi");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageSupportedPlatformAccess().getOsapiMOperatingSystemAPICrossReference_5_0_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MSwPackageSupportedPlatform_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Alternatives_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "os" ":=" ("any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]) ";"
protected class MSwPackageSupportedPlatform_Group_5_1 extends GroupToken {
	
	public MSwPackageSupportedPlatform_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_SemicolonKeyword_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "os"
protected class MSwPackageSupportedPlatform_OsKeyword_5_1_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_OsKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getOsKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_1_1 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_OsKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | os=[pdl::MOperatingSystem|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_Alternatives_5_1_2 extends AlternativesToken {

	public MSwPackageSupportedPlatform_Alternatives_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_AnyKeyword_5_1_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageSupportedPlatform_OsAssignment_5_1_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MSwPackageSupportedPlatform_AnyKeyword_5_1_2_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_AnyKeyword_5_1_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_1_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// os=[pdl::MOperatingSystem|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_OsAssignment_5_1_2_1 extends AssignmentToken  {
	
	public MSwPackageSupportedPlatform_OsAssignment_5_1_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getOsAssignment_5_1_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("os",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("os");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageSupportedPlatformAccess().getOsMOperatingSystemCrossReference_5_1_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MSwPackageSupportedPlatform_SemicolonKeyword_5_1_3 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_SemicolonKeyword_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Alternatives_5_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "architecture" ":=" ("any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]) ";"
protected class MSwPackageSupportedPlatform_Group_5_2 extends GroupToken {
	
	public MSwPackageSupportedPlatform_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_SemicolonKeyword_5_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "architecture"
protected class MSwPackageSupportedPlatform_ArchitectureKeyword_5_2_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_ArchitectureKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_2_1 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ArchitectureKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | architecture=[pdl::MArchitecture|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_Alternatives_5_2_2 extends AlternativesToken {

	public MSwPackageSupportedPlatform_Alternatives_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_AnyKeyword_5_2_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageSupportedPlatform_ArchitectureAssignment_5_2_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MSwPackageSupportedPlatform_AnyKeyword_5_2_2_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_AnyKeyword_5_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// architecture=[pdl::MArchitecture|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_ArchitectureAssignment_5_2_2_1 extends AssignmentToken  {
	
	public MSwPackageSupportedPlatform_ArchitectureAssignment_5_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureAssignment_5_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("architecture",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("architecture");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageSupportedPlatformAccess().getArchitectureMArchitectureCrossReference_5_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MSwPackageSupportedPlatform_SemicolonKeyword_5_2_3 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_SemicolonKeyword_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Alternatives_5_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("compiler" ":=" compiler=[pdl::MCompiler|VersionedQualifiedName] ";")?
protected class MSwPackageSupportedPlatform_Group_5_3 extends GroupToken {
	
	public MSwPackageSupportedPlatform_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_SemicolonKeyword_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "compiler"
protected class MSwPackageSupportedPlatform_CompilerKeyword_5_3_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_CompilerKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_3_1 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_CompilerKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// compiler=[pdl::MCompiler|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_CompilerAssignment_5_3_2 extends AssignmentToken  {
	
	public MSwPackageSupportedPlatform_CompilerAssignment_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerAssignment_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("compiler",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("compiler");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageSupportedPlatformAccess().getCompilerMCompilerCrossReference_5_3_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MSwPackageSupportedPlatform_SemicolonKeyword_5_3_3 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_SemicolonKeyword_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_CompilerAssignment_5_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "microprocessor" ":=" ("any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]) ";"
protected class MSwPackageSupportedPlatform_Group_5_4 extends GroupToken {
	
	public MSwPackageSupportedPlatform_Group_5_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_SemicolonKeyword_5_4_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "microprocessor"
protected class MSwPackageSupportedPlatform_MicroprocessorKeyword_5_4_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_MicroprocessorKeyword_5_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorKeyword_5_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageSupportedPlatform_Group_5_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_4_1 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_MicroprocessorKeyword_5_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_Alternatives_5_4_2 extends AlternativesToken {

	public MSwPackageSupportedPlatform_Alternatives_5_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_AnyKeyword_5_4_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageSupportedPlatform_MicroprocessorAssignment_5_4_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MSwPackageSupportedPlatform_AnyKeyword_5_4_2_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_AnyKeyword_5_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// microprocessor=[pdl::MMicroprocessor|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_MicroprocessorAssignment_5_4_2_1 extends AssignmentToken  {
	
	public MSwPackageSupportedPlatform_MicroprocessorAssignment_5_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorAssignment_5_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("microprocessor",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("microprocessor");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageSupportedPlatformAccess().getMicroprocessorMMicroprocessorCrossReference_5_4_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MSwPackageSupportedPlatform_SemicolonKeyword_5_4_3 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_SemicolonKeyword_5_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Alternatives_5_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "board" ":=" ("any" | board=[pdl::MBoard|VersionedQualifiedName]) ";"
protected class MSwPackageSupportedPlatform_Group_5_5 extends GroupToken {
	
	public MSwPackageSupportedPlatform_Group_5_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_SemicolonKeyword_5_5_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "board"
protected class MSwPackageSupportedPlatform_BoardKeyword_5_5_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_BoardKeyword_5_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardKeyword_5_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Group_5_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_5_1 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_BoardKeyword_5_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "any" | board=[pdl::MBoard|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_Alternatives_5_5_2 extends AlternativesToken {

	public MSwPackageSupportedPlatform_Alternatives_5_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getAlternatives_5_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_AnyKeyword_5_5_2_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageSupportedPlatform_BoardAssignment_5_5_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "any"
protected class MSwPackageSupportedPlatform_AnyKeyword_5_5_2_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_AnyKeyword_5_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getAnyKeyword_5_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// board=[pdl::MBoard|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_BoardAssignment_5_5_2_1 extends AssignmentToken  {
	
	public MSwPackageSupportedPlatform_BoardAssignment_5_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardAssignment_5_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("board",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("board");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageSupportedPlatformAccess().getBoardMBoardCrossReference_5_5_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MSwPackageSupportedPlatform_SemicolonKeyword_5_5_3 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_SemicolonKeyword_5_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Alternatives_5_5_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("languages" ":=" languages+=[system::MLanguage|VersionedQualifiedName] (","
// languages+=[system::MLanguage|VersionedQualifiedName])* ";")?
protected class MSwPackageSupportedPlatform_Group_5_6 extends GroupToken {
	
	public MSwPackageSupportedPlatform_Group_5_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_SemicolonKeyword_5_6_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "languages"
protected class MSwPackageSupportedPlatform_LanguagesKeyword_5_6_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_LanguagesKeyword_5_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesKeyword_5_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_6_1 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getColonEqualsSignKeyword_5_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_LanguagesKeyword_5_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_LanguagesAssignment_5_6_2 extends AssignmentToken  {
	
	public MSwPackageSupportedPlatform_LanguagesAssignment_5_6_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ColonEqualsSignKeyword_5_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," languages+=[system::MLanguage|VersionedQualifiedName])*
protected class MSwPackageSupportedPlatform_Group_5_6_3 extends GroupToken {
	
	public MSwPackageSupportedPlatform_Group_5_6_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_6_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_LanguagesAssignment_5_6_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MSwPackageSupportedPlatform_CommaKeyword_5_6_3_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_CommaKeyword_5_6_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getCommaKeyword_5_6_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Group_5_6_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageSupportedPlatform_LanguagesAssignment_5_6_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// languages+=[system::MLanguage|VersionedQualifiedName]
protected class MSwPackageSupportedPlatform_LanguagesAssignment_5_6_3_1 extends AssignmentToken  {
	
	public MSwPackageSupportedPlatform_LanguagesAssignment_5_6_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesAssignment_5_6_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_CommaKeyword_5_6_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("languages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("languages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSwPackageSupportedPlatformAccess().getLanguagesMLanguageCrossReference_5_6_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ";"
protected class MSwPackageSupportedPlatform_SemicolonKeyword_5_6_4 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_SemicolonKeyword_5_6_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_6_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Group_5_6_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageSupportedPlatform_LanguagesAssignment_5_6_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ("configuration" "parameters" "{" parameters+=MParameterWithoutSWPSP+ "}" ";")?
protected class MSwPackageSupportedPlatform_Group_5_7 extends GroupToken {
	
	public MSwPackageSupportedPlatform_Group_5_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_SemicolonKeyword_5_7_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "configuration"
protected class MSwPackageSupportedPlatform_ConfigurationKeyword_5_7_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_ConfigurationKeyword_5_7_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getConfigurationKeyword_5_7_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "parameters"
protected class MSwPackageSupportedPlatform_ParametersKeyword_5_7_1 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_ParametersKeyword_5_7_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersKeyword_5_7_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ConfigurationKeyword_5_7_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_7_2 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_7_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_7_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ParametersKeyword_5_7_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// parameters+=MParameterWithoutSWPSP+
protected class MSwPackageSupportedPlatform_ParametersAssignment_5_7_3 extends AssignmentToken  {
	
	public MSwPackageSupportedPlatform_ParametersAssignment_5_7_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersAssignment_5_7_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutSWPSP_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("parameters",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("parameters");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMParameterWithoutSWPSPRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMSwPackageSupportedPlatformAccess().getParametersMParameterWithoutSWPSPParserRuleCall_5_7_3_0(); 
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
			case 0: return new MSwPackageSupportedPlatform_ParametersAssignment_5_7_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_7_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_7_4 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_7_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_7_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_ParametersAssignment_5_7_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MSwPackageSupportedPlatform_SemicolonKeyword_5_7_5 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_SemicolonKeyword_5_7_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_7_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_7_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("required" "interfaces" "{" requires+=MSwPackageRequiredInterface+ "}" ";")?
protected class MSwPackageSupportedPlatform_Group_5_8 extends GroupToken {
	
	public MSwPackageSupportedPlatform_Group_5_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getGroup_5_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_SemicolonKeyword_5_8_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "required"
protected class MSwPackageSupportedPlatform_RequiredKeyword_5_8_0 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_RequiredKeyword_5_8_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiredKeyword_5_8_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_Group_5_7(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSwPackageSupportedPlatform_Group_5_6(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MSwPackageSupportedPlatform_Group_5_5(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "interfaces"
protected class MSwPackageSupportedPlatform_InterfacesKeyword_5_8_1 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_InterfacesKeyword_5_8_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getInterfacesKeyword_5_8_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_RequiredKeyword_5_8_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_8_2 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_8_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getLeftCurlyBracketKeyword_5_8_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_InterfacesKeyword_5_8_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// requires+=MSwPackageRequiredInterface+
protected class MSwPackageSupportedPlatform_RequiresAssignment_5_8_3 extends AssignmentToken  {
	
	public MSwPackageSupportedPlatform_RequiresAssignment_5_8_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiresAssignment_5_8_3();
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
				element = grammarAccess.getMSwPackageSupportedPlatformAccess().getRequiresMSwPackageRequiredInterfaceParserRuleCall_5_8_3_0(); 
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
			case 0: return new MSwPackageSupportedPlatform_RequiresAssignment_5_8_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MSwPackageSupportedPlatform_LeftCurlyBracketKeyword_5_8_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_8_4 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_8_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_5_8_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_RequiresAssignment_5_8_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MSwPackageSupportedPlatform_SemicolonKeyword_5_8_5 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_SemicolonKeyword_5_8_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_5_8_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_RightCurlyBracketKeyword_5_8_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MSwPackageSupportedPlatform_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MSwPackageSupportedPlatform_SemicolonKeyword_7 extends KeywordToken  {
	
	public MSwPackageSupportedPlatform_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSwPackageSupportedPlatformAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSwPackageSupportedPlatform_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MSwPackageSupportedPlatform ****************/


/************ begin Rule MParameterValueAssignment ****************
 *
 * MParameterValueAssignment returns common::MParameterValueAssignmentSingleExpression:
 * 	"parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":="
 * 	parameterValue=MParameterValueExpression ";";
 *
 **/

// "parameter" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" parameterValue=MParameterValueExpression
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

// "parameter"
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





/************ begin Rule MResourceDemand ****************
 *
 * MResourceDemand:
 * 	MQuantifiableResourceDemand | MInstantiableResourceDemand;
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
 * MInstantiableResourceDemand:
 * 	"instantiable" "resource" resource=[mespcommon::MInstantiableResource|VersionedQualifiedReferenceName] name=ID "{"
 * 	parameterValueAssignments+=MParameterValueAssignment* "}" ";";
 *
 **/

// "instantiable" "resource" resource=[mespcommon::MInstantiableResource|VersionedQualifiedReferenceName] name=ID "{"
// parameterValueAssignments+=MParameterValueAssignment* "}" ";"
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

// "instantiable"
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

// "resource"
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

// "{"
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

// "}"
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

// ";"
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
 * MQuantifiableResourceDemand:
 * 	{MQuantifiableResourceDemand} "quantifiable" "resource"
 * 	resource=[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName] ":="
 * 	resourceValue=MParameterValueExpression ";";
 *
 **/

// {MQuantifiableResourceDemand} "quantifiable" "resource"
// resource=[mespcommon::MQuantifiableResource|VersionedQualifiedReferenceName] ":="
// resourceValue=MParameterValueExpression ";"
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

// {MQuantifiableResourceDemand}
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

// "quantifiable"
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

// "resource"
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

// ":="
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

// ";"
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


/************ begin Rule MParameter ****************
 *
 * MParameter returns common::MParameter:
 * 	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
 * 	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition |
 * 	MBooleanParamSWPSPSwitch | MStringParamSWPSPSwitch | MIntegerParamSWPSPSwitch | MRealParamSWPSPSwitch |
 * 	MEnumParamSWPSPSwitch;
 *
 **/

// MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
// MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition | MBooleanParamSWPSPSwitch
// | MStringParamSWPSPSwitch | MIntegerParamSWPSPSwitch | MRealParamSWPSPSwitch | MEnumParamSWPSPSwitch
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
			case 6: return new MParameter_MBooleanParamSWPSPSwitchParserRuleCall_6(lastRuleCallOrigin, this, 6, inst);
			case 7: return new MParameter_MStringParamSWPSPSwitchParserRuleCall_7(lastRuleCallOrigin, this, 7, inst);
			case 8: return new MParameter_MIntegerParamSWPSPSwitchParserRuleCall_8(lastRuleCallOrigin, this, 8, inst);
			case 9: return new MParameter_MRealParamSWPSPSwitchParserRuleCall_9(lastRuleCallOrigin, this, 9, inst);
			case 10: return new MParameter_MEnumParamSWPSPSwitchParserRuleCall_10(lastRuleCallOrigin, this, 10, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParamSWPSPSwitchRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMBooleanParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParamSWPSPSwitchRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterDefinitionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMEnumParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMIntegerParamSWPSPSwitchRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMIntegerParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMRealParamSWPSPSwitchRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMRealParameterSingleExpressionRule().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMStringParamSWPSPSwitchRule().getType().getClassifier() && 
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

// MBooleanParamSWPSPSwitch
protected class MParameter_MBooleanParamSWPSPSwitchParserRuleCall_6 extends RuleCallToken {
	
	public MParameter_MBooleanParamSWPSPSwitchParserRuleCall_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMBooleanParamSWPSPSwitchParserRuleCall_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParamSWPSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MBooleanParamSWPSPSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MStringParamSWPSPSwitch
protected class MParameter_MStringParamSWPSPSwitchParserRuleCall_7 extends RuleCallToken {
	
	public MParameter_MStringParamSWPSPSwitchParserRuleCall_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMStringParamSWPSPSwitchParserRuleCall_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParamSWPSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MStringParamSWPSPSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MIntegerParamSWPSPSwitch
protected class MParameter_MIntegerParamSWPSPSwitchParserRuleCall_8 extends RuleCallToken {
	
	public MParameter_MIntegerParamSWPSPSwitchParserRuleCall_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMIntegerParamSWPSPSwitchParserRuleCall_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParamSWPSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MIntegerParamSWPSPSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MRealParamSWPSPSwitch
protected class MParameter_MRealParamSWPSPSwitchParserRuleCall_9 extends RuleCallToken {
	
	public MParameter_MRealParamSWPSPSwitchParserRuleCall_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMRealParamSWPSPSwitchParserRuleCall_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParamSWPSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MRealParamSWPSPSwitch_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MEnumParamSWPSPSwitch
protected class MParameter_MEnumParamSWPSPSwitchParserRuleCall_10 extends RuleCallToken {
	
	public MParameter_MEnumParamSWPSPSwitchParserRuleCall_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterAccess().getMEnumParamSWPSPSwitchParserRuleCall_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitch_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamSWPSPSwitchRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MEnumParamSWPSPSwitch_Group.class, eObjectConsumer)) return null;
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


/************ begin Rule MParameterWithoutSWPSP ****************
 *
 * MParameterWithoutSWPSP returns common::MParameter:
 * 	MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
 * 	MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition;
 *
 **/

// MIntegerParameterSingleExpression | MEnumParameterSingleExpression | MBooleanParameterSingleExpression |
// MRealParameterSingleExpression | MStringParameterSingleExpression | MEnumParameterDefinition
protected class MParameterWithoutSWPSP_Alternatives extends AlternativesToken {

	public MParameterWithoutSWPSP_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMParameterWithoutSWPSPAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MParameterWithoutSWPSP_MIntegerParameterSingleExpressionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MParameterWithoutSWPSP_MEnumParameterSingleExpressionParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MParameterWithoutSWPSP_MBooleanParameterSingleExpressionParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MParameterWithoutSWPSP_MRealParameterSingleExpressionParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MParameterWithoutSWPSP_MStringParameterSingleExpressionParserRuleCall_4(lastRuleCallOrigin, this, 4, inst);
			case 5: return new MParameterWithoutSWPSP_MEnumParameterDefinitionParserRuleCall_5(lastRuleCallOrigin, this, 5, inst);
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
protected class MParameterWithoutSWPSP_MIntegerParameterSingleExpressionParserRuleCall_0 extends RuleCallToken {
	
	public MParameterWithoutSWPSP_MIntegerParameterSingleExpressionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutSWPSPAccess().getMIntegerParameterSingleExpressionParserRuleCall_0();
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
protected class MParameterWithoutSWPSP_MEnumParameterSingleExpressionParserRuleCall_1 extends RuleCallToken {
	
	public MParameterWithoutSWPSP_MEnumParameterSingleExpressionParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutSWPSPAccess().getMEnumParameterSingleExpressionParserRuleCall_1();
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
protected class MParameterWithoutSWPSP_MBooleanParameterSingleExpressionParserRuleCall_2 extends RuleCallToken {
	
	public MParameterWithoutSWPSP_MBooleanParameterSingleExpressionParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutSWPSPAccess().getMBooleanParameterSingleExpressionParserRuleCall_2();
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
protected class MParameterWithoutSWPSP_MRealParameterSingleExpressionParserRuleCall_3 extends RuleCallToken {
	
	public MParameterWithoutSWPSP_MRealParameterSingleExpressionParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutSWPSPAccess().getMRealParameterSingleExpressionParserRuleCall_3();
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
protected class MParameterWithoutSWPSP_MStringParameterSingleExpressionParserRuleCall_4 extends RuleCallToken {
	
	public MParameterWithoutSWPSP_MStringParameterSingleExpressionParserRuleCall_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutSWPSPAccess().getMStringParameterSingleExpressionParserRuleCall_4();
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
protected class MParameterWithoutSWPSP_MEnumParameterDefinitionParserRuleCall_5 extends RuleCallToken {
	
	public MParameterWithoutSWPSP_MEnumParameterDefinitionParserRuleCall_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMParameterWithoutSWPSPAccess().getMEnumParameterDefinitionParserRuleCall_5();
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


/************ end Rule MParameterWithoutSWPSP ****************/


/************ begin Rule MBooleanParamSWPSPSwitch ****************
 *
 * MBooleanParamSWPSPSwitch:
 * 	constant?="const"? "boolean" name=ID ":=" "switch" "{" cases+=MBooleanParamSWPSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "boolean" name=ID ":=" "switch" "{" cases+=MBooleanParamSWPSPSwitchCase+ "}" ";"
protected class MBooleanParamSWPSPSwitch_Group extends GroupToken {
	
	public MBooleanParamSWPSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitch_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParamSWPSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MBooleanParamSWPSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MBooleanParamSWPSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMBooleanParamSWPSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "boolean"
protected class MBooleanParamSWPSPSwitch_BooleanKeyword_1 extends KeywordToken  {
	
	public MBooleanParamSWPSPSwitch_BooleanKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchAccess().getBooleanKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MBooleanParamSWPSPSwitch_NameAssignment_2 extends AssignmentToken  {
	
	public MBooleanParamSWPSPSwitch_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitch_BooleanKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMBooleanParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMBooleanParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MBooleanParamSWPSPSwitch_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MBooleanParamSWPSPSwitch_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitch_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MBooleanParamSWPSPSwitch_SwitchKeyword_4 extends KeywordToken  {
	
	public MBooleanParamSWPSPSwitch_SwitchKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchAccess().getSwitchKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitch_ColonEqualsSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MBooleanParamSWPSPSwitch_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MBooleanParamSWPSPSwitch_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitch_SwitchKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MBooleanParamSWPSPSwitchCase+
protected class MBooleanParamSWPSPSwitch_CasesAssignment_6 extends AssignmentToken  {
	
	public MBooleanParamSWPSPSwitch_CasesAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchAccess().getCasesAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMBooleanParamSWPSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMBooleanParamSWPSPSwitchAccess().getCasesMBooleanParamSWPSPSwitchCaseParserRuleCall_6_0(); 
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
			case 0: return new MBooleanParamSWPSPSwitch_CasesAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MBooleanParamSWPSPSwitch_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MBooleanParamSWPSPSwitch_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MBooleanParamSWPSPSwitch_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitch_CasesAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MBooleanParamSWPSPSwitch_SemicolonKeyword_8 extends KeywordToken  {
	
	public MBooleanParamSWPSPSwitch_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitch_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MBooleanParamSWPSPSwitch ****************/


/************ begin Rule MBooleanParamSWPSPSwitchCase ****************
 *
 * MBooleanParamSWPSPSwitchCase:
 * 	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
 *
 **/

// "case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
protected class MBooleanParamSWPSPSwitchCase_Group extends GroupToken {
	
	public MBooleanParamSWPSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitchCase_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMBooleanParamSWPSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MBooleanParamSWPSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MBooleanParamSWPSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MSwPackageSupportedPlatform]
protected class MBooleanParamSWPSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MBooleanParamSWPSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MBooleanParamSWPSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MBooleanParamSWPSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MBooleanParamSWPSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MBooleanParamSWPSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MBooleanParamSWPSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MBooleanParamSWPSPSwitchCase_SemicolonKeyword_4 extends KeywordToken  {
	
	public MBooleanParamSWPSPSwitchCase_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMBooleanParamSWPSPSwitchCaseAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MBooleanParamSWPSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MBooleanParamSWPSPSwitchCase ****************/


/************ begin Rule MStringParamSWPSPSwitch ****************
 *
 * MStringParamSWPSPSwitch:
 * 	constant?="const"? "string" name=ID ":=" "switch" "{" cases+=MStringParamSWPSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "string" name=ID ":=" "switch" "{" cases+=MStringParamSWPSPSwitchCase+ "}" ";"
protected class MStringParamSWPSPSwitch_Group extends GroupToken {
	
	public MStringParamSWPSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitch_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParamSWPSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MStringParamSWPSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MStringParamSWPSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMStringParamSWPSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "string"
protected class MStringParamSWPSPSwitch_StringKeyword_1 extends KeywordToken  {
	
	public MStringParamSWPSPSwitch_StringKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchAccess().getStringKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MStringParamSWPSPSwitch_NameAssignment_2 extends AssignmentToken  {
	
	public MStringParamSWPSPSwitch_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitch_StringKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMStringParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMStringParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MStringParamSWPSPSwitch_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MStringParamSWPSPSwitch_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitch_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MStringParamSWPSPSwitch_SwitchKeyword_4 extends KeywordToken  {
	
	public MStringParamSWPSPSwitch_SwitchKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchAccess().getSwitchKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitch_ColonEqualsSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MStringParamSWPSPSwitch_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MStringParamSWPSPSwitch_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitch_SwitchKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MStringParamSWPSPSwitchCase+
protected class MStringParamSWPSPSwitch_CasesAssignment_6 extends AssignmentToken  {
	
	public MStringParamSWPSPSwitch_CasesAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchAccess().getCasesAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMStringParamSWPSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMStringParamSWPSPSwitchAccess().getCasesMStringParamSWPSPSwitchCaseParserRuleCall_6_0(); 
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
			case 0: return new MStringParamSWPSPSwitch_CasesAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MStringParamSWPSPSwitch_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MStringParamSWPSPSwitch_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MStringParamSWPSPSwitch_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitch_CasesAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MStringParamSWPSPSwitch_SemicolonKeyword_8 extends KeywordToken  {
	
	public MStringParamSWPSPSwitch_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitch_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MStringParamSWPSPSwitch ****************/


/************ begin Rule MStringParamSWPSPSwitchCase ****************
 *
 * MStringParamSWPSPSwitchCase:
 * 	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
 *
 **/

// "case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
protected class MStringParamSWPSPSwitchCase_Group extends GroupToken {
	
	public MStringParamSWPSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitchCase_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMStringParamSWPSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MStringParamSWPSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MStringParamSWPSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MSwPackageSupportedPlatform]
protected class MStringParamSWPSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MStringParamSWPSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MStringParamSWPSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MStringParamSWPSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MStringParamSWPSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MStringParamSWPSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MStringParamSWPSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MStringParamSWPSPSwitchCase_SemicolonKeyword_4 extends KeywordToken  {
	
	public MStringParamSWPSPSwitchCase_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMStringParamSWPSPSwitchCaseAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MStringParamSWPSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MStringParamSWPSPSwitchCase ****************/


/************ begin Rule MIntegerParamSWPSPSwitch ****************
 *
 * MIntegerParamSWPSPSwitch:
 * 	constant?="const"? "integer" name=ID ":=" "switch" "{" cases+=MIntegerParamSWPSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "integer" name=ID ":=" "switch" "{" cases+=MIntegerParamSWPSPSwitchCase+ "}" ";"
protected class MIntegerParamSWPSPSwitch_Group extends GroupToken {
	
	public MIntegerParamSWPSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitch_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParamSWPSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MIntegerParamSWPSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MIntegerParamSWPSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMIntegerParamSWPSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "integer"
protected class MIntegerParamSWPSPSwitch_IntegerKeyword_1 extends KeywordToken  {
	
	public MIntegerParamSWPSPSwitch_IntegerKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchAccess().getIntegerKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MIntegerParamSWPSPSwitch_NameAssignment_2 extends AssignmentToken  {
	
	public MIntegerParamSWPSPSwitch_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitch_IntegerKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMIntegerParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMIntegerParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MIntegerParamSWPSPSwitch_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MIntegerParamSWPSPSwitch_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitch_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MIntegerParamSWPSPSwitch_SwitchKeyword_4 extends KeywordToken  {
	
	public MIntegerParamSWPSPSwitch_SwitchKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchAccess().getSwitchKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitch_ColonEqualsSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MIntegerParamSWPSPSwitch_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MIntegerParamSWPSPSwitch_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitch_SwitchKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MIntegerParamSWPSPSwitchCase+
protected class MIntegerParamSWPSPSwitch_CasesAssignment_6 extends AssignmentToken  {
	
	public MIntegerParamSWPSPSwitch_CasesAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchAccess().getCasesAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIntegerParamSWPSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMIntegerParamSWPSPSwitchAccess().getCasesMIntegerParamSWPSPSwitchCaseParserRuleCall_6_0(); 
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
			case 0: return new MIntegerParamSWPSPSwitch_CasesAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MIntegerParamSWPSPSwitch_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MIntegerParamSWPSPSwitch_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MIntegerParamSWPSPSwitch_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitch_CasesAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MIntegerParamSWPSPSwitch_SemicolonKeyword_8 extends KeywordToken  {
	
	public MIntegerParamSWPSPSwitch_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitch_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIntegerParamSWPSPSwitch ****************/


/************ begin Rule MIntegerParamSWPSPSwitchCase ****************
 *
 * MIntegerParamSWPSPSwitchCase:
 * 	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
 * 	range=MParameterRange)? ";";
 *
 **/

// "case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
// range=MParameterRange)? ";"
protected class MIntegerParamSWPSPSwitchCase_Group extends GroupToken {
	
	public MIntegerParamSWPSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitchCase_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMIntegerParamSWPSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MIntegerParamSWPSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MIntegerParamSWPSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MSwPackageSupportedPlatform]
protected class MIntegerParamSWPSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MIntegerParamSWPSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MIntegerParamSWPSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MIntegerParamSWPSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MIntegerParamSWPSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MIntegerParamSWPSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MIntegerParamSWPSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("range" range=MParameterRange)?
protected class MIntegerParamSWPSPSwitchCase_Group_4 extends GroupToken {
	
	public MIntegerParamSWPSPSwitchCase_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitchCase_RangeAssignment_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "range"
protected class MIntegerParamSWPSPSwitchCase_RangeKeyword_4_0 extends KeywordToken  {
	
	public MIntegerParamSWPSPSwitchCase_RangeKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getRangeKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// range=MParameterRange
protected class MIntegerParamSWPSPSwitchCase_RangeAssignment_4_1 extends AssignmentToken  {
	
	public MIntegerParamSWPSPSwitchCase_RangeAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getRangeAssignment_4_1();
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
				element = grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0(); 
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
			case 0: return new MIntegerParamSWPSPSwitchCase_RangeKeyword_4_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ";"
protected class MIntegerParamSWPSPSwitchCase_SemicolonKeyword_5 extends KeywordToken  {
	
	public MIntegerParamSWPSPSwitchCase_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMIntegerParamSWPSPSwitchCaseAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MIntegerParamSWPSPSwitchCase_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MIntegerParamSWPSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule MIntegerParamSWPSPSwitchCase ****************/


/************ begin Rule MRealParamSWPSPSwitch ****************
 *
 * MRealParamSWPSPSwitch:
 * 	constant?="const"? "real" name=ID ":=" "switch" "{" cases+=MRealParamSWPSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "real" name=ID ":=" "switch" "{" cases+=MRealParamSWPSPSwitchCase+ "}" ";"
protected class MRealParamSWPSPSwitch_Group extends GroupToken {
	
	public MRealParamSWPSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitch_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParamSWPSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MRealParamSWPSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MRealParamSWPSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMRealParamSWPSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "real"
protected class MRealParamSWPSPSwitch_RealKeyword_1 extends KeywordToken  {
	
	public MRealParamSWPSPSwitch_RealKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchAccess().getRealKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// name=ID
protected class MRealParamSWPSPSwitch_NameAssignment_2 extends AssignmentToken  {
	
	public MRealParamSWPSPSwitch_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitch_RealKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMRealParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMRealParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MRealParamSWPSPSwitch_ColonEqualsSignKeyword_3 extends KeywordToken  {
	
	public MRealParamSWPSPSwitch_ColonEqualsSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchAccess().getColonEqualsSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitch_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MRealParamSWPSPSwitch_SwitchKeyword_4 extends KeywordToken  {
	
	public MRealParamSWPSPSwitch_SwitchKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchAccess().getSwitchKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitch_ColonEqualsSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MRealParamSWPSPSwitch_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MRealParamSWPSPSwitch_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitch_SwitchKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MRealParamSWPSPSwitchCase+
protected class MRealParamSWPSPSwitch_CasesAssignment_6 extends AssignmentToken  {
	
	public MRealParamSWPSPSwitch_CasesAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchAccess().getCasesAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMRealParamSWPSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMRealParamSWPSPSwitchAccess().getCasesMRealParamSWPSPSwitchCaseParserRuleCall_6_0(); 
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
			case 0: return new MRealParamSWPSPSwitch_CasesAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MRealParamSWPSPSwitch_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MRealParamSWPSPSwitch_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MRealParamSWPSPSwitch_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitch_CasesAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MRealParamSWPSPSwitch_SemicolonKeyword_8 extends KeywordToken  {
	
	public MRealParamSWPSPSwitch_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitch_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MRealParamSWPSPSwitch ****************/


/************ begin Rule MRealParamSWPSPSwitchCase ****************
 *
 * MRealParamSWPSPSwitchCase:
 * 	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
 * 	range=MParameterRange)? ";";
 *
 **/

// "case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ("range"
// range=MParameterRange)? ";"
protected class MRealParamSWPSPSwitchCase_Group extends GroupToken {
	
	public MRealParamSWPSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitchCase_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRealParamSWPSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MRealParamSWPSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MRealParamSWPSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MSwPackageSupportedPlatform]
protected class MRealParamSWPSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MRealParamSWPSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MRealParamSWPSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MRealParamSWPSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MRealParamSWPSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MRealParamSWPSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MRealParamSWPSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ("range" range=MParameterRange)?
protected class MRealParamSWPSPSwitchCase_Group_4 extends GroupToken {
	
	public MRealParamSWPSPSwitchCase_Group_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitchCase_RangeAssignment_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "range"
protected class MRealParamSWPSPSwitchCase_RangeKeyword_4_0 extends KeywordToken  {
	
	public MRealParamSWPSPSwitchCase_RangeKeyword_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getRangeKeyword_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// range=MParameterRange
protected class MRealParamSWPSPSwitchCase_RangeAssignment_4_1 extends AssignmentToken  {
	
	public MRealParamSWPSPSwitchCase_RangeAssignment_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getRangeAssignment_4_1();
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
				element = grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getRangeMParameterRangeParserRuleCall_4_1_0(); 
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
			case 0: return new MRealParamSWPSPSwitchCase_RangeKeyword_4_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


// ";"
protected class MRealParamSWPSPSwitchCase_SemicolonKeyword_5 extends KeywordToken  {
	
	public MRealParamSWPSPSwitchCase_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRealParamSWPSPSwitchCaseAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRealParamSWPSPSwitchCase_Group_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MRealParamSWPSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


/************ end Rule MRealParamSWPSPSwitchCase ****************/


/************ begin Rule MEnumParamSWPSPSwitch ****************
 *
 * MEnumParamSWPSPSwitch:
 * 	constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID
 * 	":=" "switch" "{" cases+=MEnumParamSWPSPSwitchCase+ "}" ";";
 *
 **/

// constant?="const"? "enum" enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName] name=ID ":="
// "switch" "{" cases+=MEnumParamSWPSPSwitchCase+ "}" ";"
protected class MEnumParamSWPSPSwitch_Group extends GroupToken {
	
	public MEnumParamSWPSPSwitch_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitch_SemicolonKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamSWPSPSwitchRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// constant?="const"?
protected class MEnumParamSWPSPSwitch_ConstantAssignment_0 extends AssignmentToken  {
	
	public MEnumParamSWPSPSwitch_ConstantAssignment_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchAccess().getConstantAssignment_0();
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
			element = grammarAccess.getMEnumParamSWPSPSwitchAccess().getConstantConstKeyword_0_0();
			return obj;
		}
		return null;
	}

}

// "enum"
protected class MEnumParamSWPSPSwitch_EnumKeyword_1 extends KeywordToken  {
	
	public MEnumParamSWPSPSwitch_EnumKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitch_ConstantAssignment_0(lastRuleCallOrigin, this, 0, inst);
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index - 1, inst);
		}	
	}

}

// enumDefinition=[common::MEnumParameterDefinition|VersionedQualifiedReferenceName]
protected class MEnumParamSWPSPSwitch_EnumDefinitionAssignment_2 extends AssignmentToken  {
	
	public MEnumParamSWPSPSwitch_EnumDefinitionAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumDefinitionAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitch_EnumKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("enumDefinition",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("enumDefinition");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMEnumParamSWPSPSwitchAccess().getEnumDefinitionMEnumParameterDefinitionCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MEnumParamSWPSPSwitch_NameAssignment_3 extends AssignmentToken  {
	
	public MEnumParamSWPSPSwitch_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitch_EnumDefinitionAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMEnumParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMEnumParamSWPSPSwitchAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ":="
protected class MEnumParamSWPSPSwitch_ColonEqualsSignKeyword_4 extends KeywordToken  {
	
	public MEnumParamSWPSPSwitch_ColonEqualsSignKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchAccess().getColonEqualsSignKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitch_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "switch"
protected class MEnumParamSWPSPSwitch_SwitchKeyword_5 extends KeywordToken  {
	
	public MEnumParamSWPSPSwitch_SwitchKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchAccess().getSwitchKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitch_ColonEqualsSignKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MEnumParamSWPSPSwitch_LeftCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MEnumParamSWPSPSwitch_LeftCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchAccess().getLeftCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitch_SwitchKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// cases+=MEnumParamSWPSPSwitchCase+
protected class MEnumParamSWPSPSwitch_CasesAssignment_7 extends AssignmentToken  {
	
	public MEnumParamSWPSPSwitch_CasesAssignment_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchAccess().getCasesAssignment_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitchCase_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("cases",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("cases");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParamSWPSPSwitchCaseRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMEnumParamSWPSPSwitchAccess().getCasesMEnumParamSWPSPSwitchCaseParserRuleCall_7_0(); 
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
			case 0: return new MEnumParamSWPSPSwitch_CasesAssignment_7(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MEnumParamSWPSPSwitch_LeftCurlyBracketKeyword_6(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MEnumParamSWPSPSwitch_RightCurlyBracketKeyword_8 extends KeywordToken  {
	
	public MEnumParamSWPSPSwitch_RightCurlyBracketKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchAccess().getRightCurlyBracketKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitch_CasesAssignment_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MEnumParamSWPSPSwitch_SemicolonKeyword_9 extends KeywordToken  {
	
	public MEnumParamSWPSPSwitch_SemicolonKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchAccess().getSemicolonKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitch_RightCurlyBracketKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MEnumParamSWPSPSwitch ****************/


/************ begin Rule MEnumParamSWPSPSwitchCase ****************
 *
 * MEnumParamSWPSPSwitchCase:
 * 	"case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";";
 *
 **/

// "case" platform=[MSwPackageSupportedPlatform] ":" defaultValue=MParameterValueExpression ";"
protected class MEnumParamSWPSPSwitchCase_Group extends GroupToken {
	
	public MEnumParamSWPSPSwitchCase_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitchCase_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMEnumParamSWPSPSwitchCaseRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "case"
protected class MEnumParamSWPSPSwitchCase_CaseKeyword_0 extends KeywordToken  {
	
	public MEnumParamSWPSPSwitchCase_CaseKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getCaseKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// platform=[MSwPackageSupportedPlatform]
protected class MEnumParamSWPSPSwitchCase_PlatformAssignment_1 extends AssignmentToken  {
	
	public MEnumParamSWPSPSwitchCase_PlatformAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getPlatformAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitchCase_CaseKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("platform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("platform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getPlatformMSwPackageSupportedPlatformCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ":"
protected class MEnumParamSWPSPSwitchCase_ColonKeyword_2 extends KeywordToken  {
	
	public MEnumParamSWPSPSwitchCase_ColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitchCase_PlatformAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// defaultValue=MParameterValueExpression
protected class MEnumParamSWPSPSwitchCase_DefaultValueAssignment_3 extends AssignmentToken  {
	
	public MEnumParamSWPSPSwitchCase_DefaultValueAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getDefaultValueAssignment_3();
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
				element = grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getDefaultValueMParameterValueExpressionParserRuleCall_3_0(); 
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
			case 0: return new MEnumParamSWPSPSwitchCase_ColonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// ";"
protected class MEnumParamSWPSPSwitchCase_SemicolonKeyword_4 extends KeywordToken  {
	
	public MEnumParamSWPSPSwitchCase_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMEnumParamSWPSPSwitchCaseAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MEnumParamSWPSPSwitchCase_DefaultValueAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MEnumParamSWPSPSwitchCase ****************/


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

}
