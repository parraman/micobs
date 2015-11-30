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

import es.uah.aut.srg.micobs.mclev.lang.services.FLATMCADGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class FLATMCADParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private FLATMCADGrammarAccess grammarAccess;
	
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
			case 0: return new MMCLEVFLATMCADPackageFile_Group(this, this, 0, inst);
			case 1: return new MMCLEVFLATMCADPackageElement_MFlatMCADParserRuleCall(this, this, 1, inst);
			case 2: return new MFlatMCAD_Group(this, this, 2, inst);
			case 3: return new MFlatMCADTarget_Group(this, this, 3, inst);
			case 4: return new MFlatConnection_Group(this, this, 4, inst);
			case 5: return new MFlatComponentInstance_Group(this, this, 5, inst);
			case 6: return new MFlatServiceLibraryInstance_Alternatives(this, this, 6, inst);
			case 7: return new MRegularFlatServiceLibraryInstance_Group(this, this, 7, inst);
			case 8: return new MFlatDriverSLibInstance_Group(this, this, 8, inst);
			case 9: return new MFlatDeviceDriverMapping_Group(this, this, 9, inst);
			case 10: return new MAttributeValueAssignment_Group(this, this, 10, inst);
			case 11: return new MParameterValue_Alternatives(this, this, 11, inst);
			case 12: return new MParameterValueLiteral_Alternatives(this, this, 12, inst);
			case 13: return new MParameterValueBooleanLiteral_Group(this, this, 13, inst);
			case 14: return new MParameterValueStringLiteral_Group(this, this, 14, inst);
			case 15: return new MParameterValueIntegerLiteral_Group(this, this, 15, inst);
			case 16: return new MParameterValueRealLiteral_Group(this, this, 16, inst);
			case 17: return new MParameterValueRefObject_Group(this, this, 17, inst);
			case 18: return new MParameterValuePAR_Group(this, this, 18, inst);
			case 19: return new MParameterValueExpression_Group(this, this, 19, inst);
			case 20: return new MParameterValueTERM_Group(this, this, 20, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MMCLEVFLATMCADPackageFile ****************
 *
 * MMCLEVFLATMCADPackageFile:
 * 	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
 * 	imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ";")* element=MMCLEVFLATMCADPackageElement;
 *
 **/

// "package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
// imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ";")* element=MMCLEVFLATMCADPackageElement
protected class MMCLEVFLATMCADPackageFile_Group extends GroupToken {
	
	public MMCLEVFLATMCADPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVFLATMCADPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMCLEVFLATMCADPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "package"
protected class MMCLEVFLATMCADPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MMCLEVFLATMCADPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[mclevlibrary::MMCLEVPackage|QualifiedName]
protected class MMCLEVFLATMCADPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MMCLEVFLATMCADPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVFLATMCADPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMCLEVFLATMCADPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MMCLEVFLATMCADPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVFLATMCADPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("import" imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ";")*
protected class MMCLEVFLATMCADPackageFile_Group_3 extends GroupToken {
	
	public MMCLEVFLATMCADPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVFLATMCADPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "import"
protected class MMCLEVFLATMCADPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MMCLEVFLATMCADPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVFLATMCADPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCLEVFLATMCADPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[mclevlibrary::MMCLEVPackage|QualifiedName]
protected class MMCLEVFLATMCADPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MMCLEVFLATMCADPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVFLATMCADPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportsMMCLEVPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getImportsMMCLEVPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMCLEVFLATMCADPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MMCLEVFLATMCADPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVFLATMCADPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MMCLEVFLATMCADPackageElement
protected class MMCLEVFLATMCADPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MMCLEVFLATMCADPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVFLATMCADPackageElement_MFlatMCADParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVFLATMCADPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCLEVFLATMCADPackageFileAccess().getElementMMCLEVFLATMCADPackageElementParserRuleCall_4_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MMCLEVFLATMCADPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCLEVFLATMCADPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MMCLEVFLATMCADPackageFile ****************/


/************ begin Rule MMCLEVFLATMCADPackageElement ****************
 *
 * MMCLEVFLATMCADPackageElement:
 * 	MFlatMCAD;
 *
 **/

// MFlatMCAD
protected class MMCLEVFLATMCADPackageElement_MFlatMCADParserRuleCall extends RuleCallToken {
	
	public MMCLEVFLATMCADPackageElement_MFlatMCADParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMCLEVFLATMCADPackageElementAccess().getMFlatMCADParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMFlatMCADRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MFlatMCAD_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule MMCLEVFLATMCADPackageElement ****************/


/************ begin Rule MFlatMCAD ****************
 *
 * MFlatMCAD:
 * 	"flat mcad" name=ID "{" ("version" ":=" version=Version ";" & "deployment" "project" ":="
 * 	referencedElement=[mclevmcad::MMCADeployment|VersionedQualifiedName] ";" & "deployment" "targets" "{"
 * 	targets+=MFlatMCADTarget+ "}" ";") "}" ";";
 *
 **/

// "flat mcad" name=ID "{" ("version" ":=" version=Version ";" & "deployment" "project" ":="
// referencedElement=[mclevmcad::MMCADeployment|VersionedQualifiedName] ";" & "deployment" "targets" "{"
// targets+=MFlatMCADTarget+ "}" ";") "}" ";"
protected class MFlatMCAD_Group extends GroupToken {
	
	public MFlatMCAD_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMFlatMCADRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "flat mcad"
protected class MFlatMCAD_FlatMcadKeyword_0 extends KeywordToken  {
	
	public MFlatMCAD_FlatMcadKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getFlatMcadKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MFlatMCAD_NameAssignment_1 extends AssignmentToken  {
	
	public MFlatMCAD_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_FlatMcadKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMFlatMCADAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMFlatMCADAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MFlatMCAD_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MFlatMCAD_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & "deployment" "project" ":="
// referencedElement=[mclevmcad::MMCADeployment|VersionedQualifiedName] ";" & "deployment" "targets" "{"
// targets+=MFlatMCADTarget+ "}" ";"
protected class MFlatMCAD_UnorderedGroup_3 extends UnorderedGroupToken {
	
	public MFlatMCAD_UnorderedGroup_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getUnorderedGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MFlatMCAD_Group_3_0 extends GroupToken {
	
	public MFlatMCAD_Group_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getGroup_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_SemicolonKeyword_3_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MFlatMCAD_VersionKeyword_3_0_0 extends KeywordToken  {
	
	public MFlatMCAD_VersionKeyword_3_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getVersionKeyword_3_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MFlatMCAD_ColonEqualsSignKeyword_3_0_1 extends KeywordToken  {
	
	public MFlatMCAD_ColonEqualsSignKeyword_3_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getColonEqualsSignKeyword_3_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_VersionKeyword_3_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MFlatMCAD_VersionAssignment_3_0_2 extends AssignmentToken  {
	
	public MFlatMCAD_VersionAssignment_3_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getVersionAssignment_3_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_ColonEqualsSignKeyword_3_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMFlatMCADAccess().getVersionVersionParserRuleCall_3_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMFlatMCADAccess().getVersionVersionParserRuleCall_3_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MFlatMCAD_SemicolonKeyword_3_0_3 extends KeywordToken  {
	
	public MFlatMCAD_SemicolonKeyword_3_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_3_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_VersionAssignment_3_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "deployment" "project" ":=" referencedElement=[mclevmcad::MMCADeployment|VersionedQualifiedName] ";"
protected class MFlatMCAD_Group_3_1 extends GroupToken {
	
	public MFlatMCAD_Group_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getGroup_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_SemicolonKeyword_3_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "deployment"
protected class MFlatMCAD_DeploymentKeyword_3_1_0 extends KeywordToken  {
	
	public MFlatMCAD_DeploymentKeyword_3_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getDeploymentKeyword_3_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_Group_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "project"
protected class MFlatMCAD_ProjectKeyword_3_1_1 extends KeywordToken  {
	
	public MFlatMCAD_ProjectKeyword_3_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getProjectKeyword_3_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_DeploymentKeyword_3_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MFlatMCAD_ColonEqualsSignKeyword_3_1_2 extends KeywordToken  {
	
	public MFlatMCAD_ColonEqualsSignKeyword_3_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getColonEqualsSignKeyword_3_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_ProjectKeyword_3_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// referencedElement=[mclevmcad::MMCADeployment|VersionedQualifiedName]
protected class MFlatMCAD_ReferencedElementAssignment_3_1_3 extends AssignmentToken  {
	
	public MFlatMCAD_ReferencedElementAssignment_3_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getReferencedElementAssignment_3_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_ColonEqualsSignKeyword_3_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("referencedElement",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("referencedElement");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatMCADAccess().getReferencedElementMMCADeploymentCrossReference_3_1_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatMCADAccess().getReferencedElementMMCADeploymentCrossReference_3_1_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MFlatMCAD_SemicolonKeyword_3_1_4 extends KeywordToken  {
	
	public MFlatMCAD_SemicolonKeyword_3_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_3_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_ReferencedElementAssignment_3_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "deployment" "targets" "{" targets+=MFlatMCADTarget+ "}" ";"
protected class MFlatMCAD_Group_3_2 extends GroupToken {
	
	public MFlatMCAD_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_SemicolonKeyword_3_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "deployment"
protected class MFlatMCAD_DeploymentKeyword_3_2_0 extends KeywordToken  {
	
	public MFlatMCAD_DeploymentKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getDeploymentKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_Group_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "targets"
protected class MFlatMCAD_TargetsKeyword_3_2_1 extends KeywordToken  {
	
	public MFlatMCAD_TargetsKeyword_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getTargetsKeyword_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_DeploymentKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MFlatMCAD_LeftCurlyBracketKeyword_3_2_2 extends KeywordToken  {
	
	public MFlatMCAD_LeftCurlyBracketKeyword_3_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getLeftCurlyBracketKeyword_3_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_TargetsKeyword_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// targets+=MFlatMCADTarget+
protected class MFlatMCAD_TargetsAssignment_3_2_3 extends AssignmentToken  {
	
	public MFlatMCAD_TargetsAssignment_3_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getTargetsAssignment_3_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("targets",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("targets");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatMCADTargetRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMFlatMCADAccess().getTargetsMFlatMCADTargetParserRuleCall_3_2_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MFlatMCAD_TargetsAssignment_3_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MFlatMCAD_LeftCurlyBracketKeyword_3_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MFlatMCAD_RightCurlyBracketKeyword_3_2_4 extends KeywordToken  {
	
	public MFlatMCAD_RightCurlyBracketKeyword_3_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getRightCurlyBracketKeyword_3_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_TargetsAssignment_3_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MFlatMCAD_SemicolonKeyword_3_2_5 extends KeywordToken  {
	
	public MFlatMCAD_SemicolonKeyword_3_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_3_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_RightCurlyBracketKeyword_3_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MFlatMCAD_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MFlatMCAD_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_UnorderedGroup_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MFlatMCAD_SemicolonKeyword_5 extends KeywordToken  {
	
	public MFlatMCAD_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCAD_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MFlatMCAD ****************/


/************ begin Rule MFlatMCADTarget ****************
 *
 * MFlatMCADTarget:
 * 	"target" ("platform" deploymentPlatform=[mclevmcad::MDeploymentPlatform] & ("alternative"
 * 	leafDeploymentAlternative=[mclevmcad::MDeploymentAlternative|VersionedQualifiedReferenceName])?) "{" (("attribute"
 * 	"values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("components" "{"
 * 	components+=MFlatComponentInstance+ "}" ";")? & ("connections" "{" connections+=MFlatConnection+ "}" ";")? &
 * 	("libraries" "{" libraries+=MFlatServiceLibraryInstance+ "}" ";")?) "}" ";";
 *
 **/

// "target" ("platform" deploymentPlatform=[mclevmcad::MDeploymentPlatform] & ("alternative"
// leafDeploymentAlternative=[mclevmcad::MDeploymentAlternative|VersionedQualifiedReferenceName])?) "{" (("attribute"
// "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("components" "{"
// components+=MFlatComponentInstance+ "}" ";")? & ("connections" "{" connections+=MFlatConnection+ "}" ";")? &
// ("libraries" "{" libraries+=MFlatServiceLibraryInstance+ "}" ";")?) "}" ";"
protected class MFlatMCADTarget_Group extends GroupToken {
	
	public MFlatMCADTarget_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMFlatMCADTargetRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "target"
protected class MFlatMCADTarget_TargetKeyword_0 extends KeywordToken  {
	
	public MFlatMCADTarget_TargetKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getTargetKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// "platform" deploymentPlatform=[mclevmcad::MDeploymentPlatform] & ("alternative"
// leafDeploymentAlternative=[mclevmcad::MDeploymentAlternative|VersionedQualifiedReferenceName])?
protected class MFlatMCADTarget_UnorderedGroup_1 extends UnorderedGroupToken {
	
	public MFlatMCADTarget_UnorderedGroup_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_Group_1_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MFlatMCADTarget_Group_1_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "platform" deploymentPlatform=[mclevmcad::MDeploymentPlatform]
protected class MFlatMCADTarget_Group_1_0 extends GroupToken {
	
	public MFlatMCADTarget_Group_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getGroup_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_DeploymentPlatformAssignment_1_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "platform"
protected class MFlatMCADTarget_PlatformKeyword_1_0_0 extends KeywordToken  {
	
	public MFlatMCADTarget_PlatformKeyword_1_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getPlatformKeyword_1_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_TargetKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deploymentPlatform=[mclevmcad::MDeploymentPlatform]
protected class MFlatMCADTarget_DeploymentPlatformAssignment_1_0_1 extends AssignmentToken  {
	
	public MFlatMCADTarget_DeploymentPlatformAssignment_1_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getDeploymentPlatformAssignment_1_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_PlatformKeyword_1_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deploymentPlatform",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deploymentPlatform");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatMCADTargetAccess().getDeploymentPlatformMDeploymentPlatformCrossReference_1_0_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatMCADTargetAccess().getDeploymentPlatformMDeploymentPlatformCrossReference_1_0_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ("alternative" leafDeploymentAlternative=[mclevmcad::MDeploymentAlternative|VersionedQualifiedReferenceName])?
protected class MFlatMCADTarget_Group_1_1 extends GroupToken {
	
	public MFlatMCADTarget_Group_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getGroup_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_LeafDeploymentAlternativeAssignment_1_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "alternative"
protected class MFlatMCADTarget_AlternativeKeyword_1_1_0 extends KeywordToken  {
	
	public MFlatMCADTarget_AlternativeKeyword_1_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getAlternativeKeyword_1_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_Group_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// leafDeploymentAlternative=[mclevmcad::MDeploymentAlternative|VersionedQualifiedReferenceName]
protected class MFlatMCADTarget_LeafDeploymentAlternativeAssignment_1_1_1 extends AssignmentToken  {
	
	public MFlatMCADTarget_LeafDeploymentAlternativeAssignment_1_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getLeafDeploymentAlternativeAssignment_1_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_AlternativeKeyword_1_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("leafDeploymentAlternative",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("leafDeploymentAlternative");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatMCADTargetAccess().getLeafDeploymentAlternativeMDeploymentAlternativeCrossReference_1_1_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatMCADTargetAccess().getLeafDeploymentAlternativeMDeploymentAlternativeCrossReference_1_1_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MFlatMCADTarget_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MFlatMCADTarget_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_UnorderedGroup_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("attribute" "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("components" "{"
// components+=MFlatComponentInstance+ "}" ";")? & ("connections" "{" connections+=MFlatConnection+ "}" ";")? &
// ("libraries" "{" libraries+=MFlatServiceLibraryInstance+ "}" ";")?
protected class MFlatMCADTarget_UnorderedGroup_3 extends UnorderedGroupToken {
	
	public MFlatMCADTarget_UnorderedGroup_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getUnorderedGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_Group_3_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MFlatMCADTarget_Group_3_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MFlatMCADTarget_Group_3_1(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MFlatMCADTarget_Group_3_0(lastRuleCallOrigin, this, 3, inst);
			case 4: return new MFlatMCADTarget_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 4, inst);
			default: return null;
		}	
	}

}

// ("attribute" "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")?
protected class MFlatMCADTarget_Group_3_0 extends GroupToken {
	
	public MFlatMCADTarget_Group_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getGroup_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_SemicolonKeyword_3_0_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attribute"
protected class MFlatMCADTarget_AttributeKeyword_3_0_0 extends KeywordToken  {
	
	public MFlatMCADTarget_AttributeKeyword_3_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getAttributeKeyword_3_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "values"
protected class MFlatMCADTarget_ValuesKeyword_3_0_1 extends KeywordToken  {
	
	public MFlatMCADTarget_ValuesKeyword_3_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getValuesKeyword_3_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_AttributeKeyword_3_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MFlatMCADTarget_LeftCurlyBracketKeyword_3_0_2 extends KeywordToken  {
	
	public MFlatMCADTarget_LeftCurlyBracketKeyword_3_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_ValuesKeyword_3_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MAttributeValueAssignment+
protected class MFlatMCADTarget_AttributeValueAssignmentsAssignment_3_0_3 extends AssignmentToken  {
	
	public MFlatMCADTarget_AttributeValueAssignmentsAssignment_3_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getAttributeValueAssignmentsAssignment_3_0_3();
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
				element = grammarAccess.getMFlatMCADTargetAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MFlatMCADTarget_AttributeValueAssignmentsAssignment_3_0_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MFlatMCADTarget_LeftCurlyBracketKeyword_3_0_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MFlatMCADTarget_RightCurlyBracketKeyword_3_0_4 extends KeywordToken  {
	
	public MFlatMCADTarget_RightCurlyBracketKeyword_3_0_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_0_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_AttributeValueAssignmentsAssignment_3_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MFlatMCADTarget_SemicolonKeyword_3_0_5 extends KeywordToken  {
	
	public MFlatMCADTarget_SemicolonKeyword_3_0_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_0_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_RightCurlyBracketKeyword_3_0_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("components" "{" components+=MFlatComponentInstance+ "}" ";")?
protected class MFlatMCADTarget_Group_3_1 extends GroupToken {
	
	public MFlatMCADTarget_Group_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getGroup_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_SemicolonKeyword_3_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "components"
protected class MFlatMCADTarget_ComponentsKeyword_3_1_0 extends KeywordToken  {
	
	public MFlatMCADTarget_ComponentsKeyword_3_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getComponentsKeyword_3_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_Group_3_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MFlatMCADTarget_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MFlatMCADTarget_LeftCurlyBracketKeyword_3_1_1 extends KeywordToken  {
	
	public MFlatMCADTarget_LeftCurlyBracketKeyword_3_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_ComponentsKeyword_3_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// components+=MFlatComponentInstance+
protected class MFlatMCADTarget_ComponentsAssignment_3_1_2 extends AssignmentToken  {
	
	public MFlatMCADTarget_ComponentsAssignment_3_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getComponentsAssignment_3_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatComponentInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("components",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("components");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatComponentInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMFlatMCADTargetAccess().getComponentsMFlatComponentInstanceParserRuleCall_3_1_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MFlatMCADTarget_ComponentsAssignment_3_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MFlatMCADTarget_LeftCurlyBracketKeyword_3_1_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MFlatMCADTarget_RightCurlyBracketKeyword_3_1_3 extends KeywordToken  {
	
	public MFlatMCADTarget_RightCurlyBracketKeyword_3_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_ComponentsAssignment_3_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MFlatMCADTarget_SemicolonKeyword_3_1_4 extends KeywordToken  {
	
	public MFlatMCADTarget_SemicolonKeyword_3_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_RightCurlyBracketKeyword_3_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("connections" "{" connections+=MFlatConnection+ "}" ";")?
protected class MFlatMCADTarget_Group_3_2 extends GroupToken {
	
	public MFlatMCADTarget_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_SemicolonKeyword_3_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "connections"
protected class MFlatMCADTarget_ConnectionsKeyword_3_2_0 extends KeywordToken  {
	
	public MFlatMCADTarget_ConnectionsKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getConnectionsKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_Group_3_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MFlatMCADTarget_Group_3_0(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MFlatMCADTarget_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MFlatMCADTarget_LeftCurlyBracketKeyword_3_2_1 extends KeywordToken  {
	
	public MFlatMCADTarget_LeftCurlyBracketKeyword_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_ConnectionsKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// connections+=MFlatConnection+
protected class MFlatMCADTarget_ConnectionsAssignment_3_2_2 extends AssignmentToken  {
	
	public MFlatMCADTarget_ConnectionsAssignment_3_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getConnectionsAssignment_3_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("connections",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("connections");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatConnectionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMFlatMCADTargetAccess().getConnectionsMFlatConnectionParserRuleCall_3_2_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MFlatMCADTarget_ConnectionsAssignment_3_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MFlatMCADTarget_LeftCurlyBracketKeyword_3_2_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MFlatMCADTarget_RightCurlyBracketKeyword_3_2_3 extends KeywordToken  {
	
	public MFlatMCADTarget_RightCurlyBracketKeyword_3_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_ConnectionsAssignment_3_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MFlatMCADTarget_SemicolonKeyword_3_2_4 extends KeywordToken  {
	
	public MFlatMCADTarget_SemicolonKeyword_3_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_RightCurlyBracketKeyword_3_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("libraries" "{" libraries+=MFlatServiceLibraryInstance+ "}" ";")?
protected class MFlatMCADTarget_Group_3_3 extends GroupToken {
	
	public MFlatMCADTarget_Group_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getGroup_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_SemicolonKeyword_3_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "libraries"
protected class MFlatMCADTarget_LibrariesKeyword_3_3_0 extends KeywordToken  {
	
	public MFlatMCADTarget_LibrariesKeyword_3_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getLibrariesKeyword_3_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MFlatMCADTarget_Group_3_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MFlatMCADTarget_Group_3_0(lastRuleCallOrigin, this, 2, inst);
			case 3: return new MFlatMCADTarget_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 3, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MFlatMCADTarget_LeftCurlyBracketKeyword_3_3_1 extends KeywordToken  {
	
	public MFlatMCADTarget_LeftCurlyBracketKeyword_3_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getLeftCurlyBracketKeyword_3_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_LibrariesKeyword_3_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// libraries+=MFlatServiceLibraryInstance+
protected class MFlatMCADTarget_LibrariesAssignment_3_3_2 extends AssignmentToken  {
	
	public MFlatMCADTarget_LibrariesAssignment_3_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getLibrariesAssignment_3_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatServiceLibraryInstance_Alternatives(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("libraries",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("libraries");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatServiceLibraryInstanceRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMFlatMCADTargetAccess().getLibrariesMFlatServiceLibraryInstanceParserRuleCall_3_3_2_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MFlatMCADTarget_LibrariesAssignment_3_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MFlatMCADTarget_LeftCurlyBracketKeyword_3_3_1(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MFlatMCADTarget_RightCurlyBracketKeyword_3_3_3 extends KeywordToken  {
	
	public MFlatMCADTarget_RightCurlyBracketKeyword_3_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_3_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_LibrariesAssignment_3_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MFlatMCADTarget_SemicolonKeyword_3_3_4 extends KeywordToken  {
	
	public MFlatMCADTarget_SemicolonKeyword_3_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_3_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_RightCurlyBracketKeyword_3_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MFlatMCADTarget_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MFlatMCADTarget_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_UnorderedGroup_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MFlatMCADTarget_SemicolonKeyword_5 extends KeywordToken  {
	
	public MFlatMCADTarget_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatMCADTargetAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatMCADTarget_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MFlatMCADTarget ****************/






/************ begin Rule MFlatConnection ****************
 *
 * MFlatConnection:
 * 	{MFlatConnection} "connection" clientInstance=[MFlatComponentInstance] "." clientPort=[mclevcmp::MClientPort] "<->"
 * 	serverInstance=[MFlatComponentInstance] "." serverPort=[mclevcmp::MServerPort] "using"
 * 	connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{" ("mapping" ":="
 * 	ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
 * 	attributeValueAssignments+=MAttributeValueAssignment* "}" ";";
 *
 **/

// {MFlatConnection} "connection" clientInstance=[MFlatComponentInstance] "." clientPort=[mclevcmp::MClientPort] "<->"
// serverInstance=[MFlatComponentInstance] "." serverPort=[mclevcmp::MServerPort] "using"
// connector=[mclevdom::MConnector|VersionedQualifiedReferenceName] "{" ("mapping" ":="
// ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
// attributeValueAssignments+=MAttributeValueAssignment* "}" ";"
protected class MFlatConnection_Group extends GroupToken {
	
	public MFlatConnection_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_SemicolonKeyword_15(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMFlatConnectionAccess().getMFlatConnectionAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MFlatConnection}
protected class MFlatConnection_MFlatConnectionAction_0 extends ActionToken  {

	public MFlatConnection_MFlatConnectionAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getMFlatConnectionAction_0();
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
protected class MFlatConnection_ConnectionKeyword_1 extends KeywordToken  {
	
	public MFlatConnection_ConnectionKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getConnectionKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_MFlatConnectionAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// clientInstance=[MFlatComponentInstance]
protected class MFlatConnection_ClientInstanceAssignment_2 extends AssignmentToken  {
	
	public MFlatConnection_ClientInstanceAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getClientInstanceAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_ConnectionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientInstance",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientInstance");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatConnectionAccess().getClientInstanceMFlatComponentInstanceCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatConnectionAccess().getClientInstanceMFlatComponentInstanceCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "."
protected class MFlatConnection_FullStopKeyword_3 extends KeywordToken  {
	
	public MFlatConnection_FullStopKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getFullStopKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_ClientInstanceAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// clientPort=[mclevcmp::MClientPort]
protected class MFlatConnection_ClientPortAssignment_4 extends AssignmentToken  {
	
	public MFlatConnection_ClientPortAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getClientPortAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_FullStopKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("clientPort",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("clientPort");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatConnectionAccess().getClientPortMClientPortCrossReference_4_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatConnectionAccess().getClientPortMClientPortCrossReference_4_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "<->"
protected class MFlatConnection_LessThanSignHyphenMinusGreaterThanSignKeyword_5 extends KeywordToken  {
	
	public MFlatConnection_LessThanSignHyphenMinusGreaterThanSignKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_ClientPortAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// serverInstance=[MFlatComponentInstance]
protected class MFlatConnection_ServerInstanceAssignment_6 extends AssignmentToken  {
	
	public MFlatConnection_ServerInstanceAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getServerInstanceAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_LessThanSignHyphenMinusGreaterThanSignKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverInstance",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverInstance");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatConnectionAccess().getServerInstanceMFlatComponentInstanceCrossReference_6_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatConnectionAccess().getServerInstanceMFlatComponentInstanceCrossReference_6_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "."
protected class MFlatConnection_FullStopKeyword_7 extends KeywordToken  {
	
	public MFlatConnection_FullStopKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getFullStopKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_ServerInstanceAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// serverPort=[mclevcmp::MServerPort]
protected class MFlatConnection_ServerPortAssignment_8 extends AssignmentToken  {
	
	public MFlatConnection_ServerPortAssignment_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getServerPortAssignment_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_FullStopKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("serverPort",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("serverPort");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatConnectionAccess().getServerPortMServerPortCrossReference_8_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatConnectionAccess().getServerPortMServerPortCrossReference_8_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "using"
protected class MFlatConnection_UsingKeyword_9 extends KeywordToken  {
	
	public MFlatConnection_UsingKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getUsingKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_ServerPortAssignment_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// connector=[mclevdom::MConnector|VersionedQualifiedReferenceName]
protected class MFlatConnection_ConnectorAssignment_10 extends AssignmentToken  {
	
	public MFlatConnection_ConnectorAssignment_10(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getConnectorAssignment_10();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_UsingKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("connector",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("connector");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatConnectionAccess().getConnectorMConnectorCrossReference_10_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatConnectionAccess().getConnectorMConnectorCrossReference_10_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "{"
protected class MFlatConnection_LeftCurlyBracketKeyword_11 extends KeywordToken  {
	
	public MFlatConnection_LeftCurlyBracketKeyword_11(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getLeftCurlyBracketKeyword_11();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_ConnectorAssignment_10(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("mapping" ":=" ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName] ";")?
protected class MFlatConnection_Group_12 extends GroupToken {
	
	public MFlatConnection_Group_12(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getGroup_12();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_SemicolonKeyword_12_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "mapping"
protected class MFlatConnection_MappingKeyword_12_0 extends KeywordToken  {
	
	public MFlatConnection_MappingKeyword_12_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getMappingKeyword_12_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_LeftCurlyBracketKeyword_11(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MFlatConnection_ColonEqualsSignKeyword_12_1 extends KeywordToken  {
	
	public MFlatConnection_ColonEqualsSignKeyword_12_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getColonEqualsSignKeyword_12_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_MappingKeyword_12_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ifaceMapping=[mclevimap::MInterfaceMapping|VersionedQualifiedName]
protected class MFlatConnection_IfaceMappingAssignment_12_2 extends AssignmentToken  {
	
	public MFlatConnection_IfaceMappingAssignment_12_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getIfaceMappingAssignment_12_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_ColonEqualsSignKeyword_12_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ifaceMapping",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ifaceMapping");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_12_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatConnectionAccess().getIfaceMappingMInterfaceMappingCrossReference_12_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MFlatConnection_SemicolonKeyword_12_3 extends KeywordToken  {
	
	public MFlatConnection_SemicolonKeyword_12_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getSemicolonKeyword_12_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_IfaceMappingAssignment_12_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// attributeValueAssignments+=MAttributeValueAssignment*
protected class MFlatConnection_AttributeValueAssignmentsAssignment_13 extends AssignmentToken  {
	
	public MFlatConnection_AttributeValueAssignmentsAssignment_13(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getAttributeValueAssignmentsAssignment_13();
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
				element = grammarAccess.getMFlatConnectionAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_13_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MFlatConnection_AttributeValueAssignmentsAssignment_13(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MFlatConnection_Group_12(lastRuleCallOrigin, next, actIndex, consumed);
			case 2: return new MFlatConnection_LeftCurlyBracketKeyword_11(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MFlatConnection_RightCurlyBracketKeyword_14 extends KeywordToken  {
	
	public MFlatConnection_RightCurlyBracketKeyword_14(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getRightCurlyBracketKeyword_14();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_AttributeValueAssignmentsAssignment_13(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MFlatConnection_Group_12(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MFlatConnection_LeftCurlyBracketKeyword_11(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MFlatConnection_SemicolonKeyword_15 extends KeywordToken  {
	
	public MFlatConnection_SemicolonKeyword_15(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatConnectionAccess().getSemicolonKeyword_15();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatConnection_RightCurlyBracketKeyword_14(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MFlatConnection ****************/


/************ begin Rule MFlatComponentInstance ****************
 *
 * MFlatComponentInstance:
 * 	{MFlatComponentInstance} "instance" component=[mclevcmp::MComponent|VersionedQualifiedName] name=ID "{"
 * 	attributeValueAssignments+=MAttributeValueAssignment* "}" ";";
 *
 **/

// {MFlatComponentInstance} "instance" component=[mclevcmp::MComponent|VersionedQualifiedName] name=ID "{"
// attributeValueAssignments+=MAttributeValueAssignment* "}" ";"
protected class MFlatComponentInstance_Group extends GroupToken {
	
	public MFlatComponentInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatComponentInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatComponentInstance_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMFlatComponentInstanceAccess().getMFlatComponentInstanceAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MFlatComponentInstance}
protected class MFlatComponentInstance_MFlatComponentInstanceAction_0 extends ActionToken  {

	public MFlatComponentInstance_MFlatComponentInstanceAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMFlatComponentInstanceAccess().getMFlatComponentInstanceAction_0();
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

// "instance"
protected class MFlatComponentInstance_InstanceKeyword_1 extends KeywordToken  {
	
	public MFlatComponentInstance_InstanceKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatComponentInstanceAccess().getInstanceKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatComponentInstance_MFlatComponentInstanceAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// component=[mclevcmp::MComponent|VersionedQualifiedName]
protected class MFlatComponentInstance_ComponentAssignment_2 extends AssignmentToken  {
	
	public MFlatComponentInstance_ComponentAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatComponentInstanceAccess().getComponentAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatComponentInstance_InstanceKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("component",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("component");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatComponentInstanceAccess().getComponentMComponentCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatComponentInstanceAccess().getComponentMComponentCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MFlatComponentInstance_NameAssignment_3 extends AssignmentToken  {
	
	public MFlatComponentInstance_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatComponentInstanceAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatComponentInstance_ComponentAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMFlatComponentInstanceAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMFlatComponentInstanceAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MFlatComponentInstance_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MFlatComponentInstance_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatComponentInstanceAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatComponentInstance_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MAttributeValueAssignment*
protected class MFlatComponentInstance_AttributeValueAssignmentsAssignment_5 extends AssignmentToken  {
	
	public MFlatComponentInstance_AttributeValueAssignmentsAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatComponentInstanceAccess().getAttributeValueAssignmentsAssignment_5();
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
				element = grammarAccess.getMFlatComponentInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_5_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MFlatComponentInstance_AttributeValueAssignmentsAssignment_5(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MFlatComponentInstance_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MFlatComponentInstance_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MFlatComponentInstance_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatComponentInstanceAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatComponentInstance_AttributeValueAssignmentsAssignment_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MFlatComponentInstance_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MFlatComponentInstance_SemicolonKeyword_7 extends KeywordToken  {
	
	public MFlatComponentInstance_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatComponentInstanceAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatComponentInstance_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MFlatComponentInstance ****************/


/************ begin Rule MFlatServiceLibraryInstance ****************
 *
 * MFlatServiceLibraryInstance:
 * 	MRegularFlatServiceLibraryInstance | MFlatDriverSLibInstance;
 *
 **/

// MRegularFlatServiceLibraryInstance | MFlatDriverSLibInstance
protected class MFlatServiceLibraryInstance_Alternatives extends AlternativesToken {

	public MFlatServiceLibraryInstance_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getMFlatServiceLibraryInstanceAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatServiceLibraryInstance_MRegularFlatServiceLibraryInstanceParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MFlatServiceLibraryInstance_MFlatDriverSLibInstanceParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMFlatDriverSLibInstanceAccess().getMFlatDriverSLibInstanceAction_0().getType().getClassifier() && 
		   getEObject().eClass() != grammarAccess.getMRegularFlatServiceLibraryInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// MRegularFlatServiceLibraryInstance
protected class MFlatServiceLibraryInstance_MRegularFlatServiceLibraryInstanceParserRuleCall_0 extends RuleCallToken {
	
	public MFlatServiceLibraryInstance_MRegularFlatServiceLibraryInstanceParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMFlatServiceLibraryInstanceAccess().getMRegularFlatServiceLibraryInstanceParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRegularFlatServiceLibraryInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRegularFlatServiceLibraryInstanceRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MRegularFlatServiceLibraryInstance_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

// MFlatDriverSLibInstance
protected class MFlatServiceLibraryInstance_MFlatDriverSLibInstanceParserRuleCall_1 extends RuleCallToken {
	
	public MFlatServiceLibraryInstance_MFlatDriverSLibInstanceParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMFlatServiceLibraryInstanceAccess().getMFlatDriverSLibInstanceParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMFlatDriverSLibInstanceAccess().getMFlatDriverSLibInstanceAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(MFlatDriverSLibInstance_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}


/************ end Rule MFlatServiceLibraryInstance ****************/


/************ begin Rule MRegularFlatServiceLibraryInstance ****************
 *
 * MRegularFlatServiceLibraryInstance returns MFlatServiceLibraryInstance:
 * 	"library" library=[mclevslib::MServiceLibrary|VersionedQualifiedName] "{"
 * 	attributeValueAssignments+=MAttributeValueAssignment* "}" ";";
 *
 **/

// "library" library=[mclevslib::MServiceLibrary|VersionedQualifiedName] "{"
// attributeValueAssignments+=MAttributeValueAssignment* "}" ";"
protected class MRegularFlatServiceLibraryInstance_Group extends GroupToken {
	
	public MRegularFlatServiceLibraryInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRegularFlatServiceLibraryInstance_SemicolonKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMRegularFlatServiceLibraryInstanceRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "library"
protected class MRegularFlatServiceLibraryInstance_LibraryKeyword_0 extends KeywordToken  {
	
	public MRegularFlatServiceLibraryInstance_LibraryKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
protected class MRegularFlatServiceLibraryInstance_LibraryAssignment_1 extends AssignmentToken  {
	
	public MRegularFlatServiceLibraryInstance_LibraryAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRegularFlatServiceLibraryInstance_LibraryKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("library",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("library");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryMServiceLibraryCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLibraryMServiceLibraryCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "{"
protected class MRegularFlatServiceLibraryInstance_LeftCurlyBracketKeyword_2 extends KeywordToken  {
	
	public MRegularFlatServiceLibraryInstance_LeftCurlyBracketKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getLeftCurlyBracketKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRegularFlatServiceLibraryInstance_LibraryAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MAttributeValueAssignment*
protected class MRegularFlatServiceLibraryInstance_AttributeValueAssignmentsAssignment_3 extends AssignmentToken  {
	
	public MRegularFlatServiceLibraryInstance_AttributeValueAssignmentsAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getAttributeValueAssignmentsAssignment_3();
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
				element = grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MRegularFlatServiceLibraryInstance_AttributeValueAssignmentsAssignment_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MRegularFlatServiceLibraryInstance_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MRegularFlatServiceLibraryInstance_RightCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MRegularFlatServiceLibraryInstance_RightCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getRightCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRegularFlatServiceLibraryInstance_AttributeValueAssignmentsAssignment_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MRegularFlatServiceLibraryInstance_LeftCurlyBracketKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MRegularFlatServiceLibraryInstance_SemicolonKeyword_5 extends KeywordToken  {
	
	public MRegularFlatServiceLibraryInstance_SemicolonKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMRegularFlatServiceLibraryInstanceAccess().getSemicolonKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MRegularFlatServiceLibraryInstance_RightCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MRegularFlatServiceLibraryInstance ****************/


/************ begin Rule MFlatDriverSLibInstance ****************
 *
 * MFlatDriverSLibInstance:
 * 	{MFlatDriverSLibInstance} "driver" library=[mclevslib::MServiceLibrary|VersionedQualifiedName] "{" (("attribute"
 * 	"values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("device" "mappings" "{"
 * 	deviceDriverMappings+=MFlatDeviceDriverMapping+ "}" ";")?) "}" ";";
 *
 **/

// {MFlatDriverSLibInstance} "driver" library=[mclevslib::MServiceLibrary|VersionedQualifiedName] "{" (("attribute"
// "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("device" "mappings" "{"
// deviceDriverMappings+=MFlatDeviceDriverMapping+ "}" ";")?) "}" ";"
protected class MFlatDriverSLibInstance_Group extends GroupToken {
	
	public MFlatDriverSLibInstance_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMFlatDriverSLibInstanceAccess().getMFlatDriverSLibInstanceAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {MFlatDriverSLibInstance}
protected class MFlatDriverSLibInstance_MFlatDriverSLibInstanceAction_0 extends ActionToken  {

	public MFlatDriverSLibInstance_MFlatDriverSLibInstanceAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Action getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getMFlatDriverSLibInstanceAction_0();
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

// "driver"
protected class MFlatDriverSLibInstance_DriverKeyword_1 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_DriverKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getDriverKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_MFlatDriverSLibInstanceAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// library=[mclevslib::MServiceLibrary|VersionedQualifiedName]
protected class MFlatDriverSLibInstance_LibraryAssignment_2 extends AssignmentToken  {
	
	public MFlatDriverSLibInstance_LibraryAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getLibraryAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_DriverKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("library",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("library");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatDriverSLibInstanceAccess().getLibraryMServiceLibraryCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatDriverSLibInstanceAccess().getLibraryMServiceLibraryCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "{"
protected class MFlatDriverSLibInstance_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_LibraryAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("attribute" "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")? & ("device" "mappings" "{"
// deviceDriverMappings+=MFlatDeviceDriverMapping+ "}" ";")?
protected class MFlatDriverSLibInstance_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MFlatDriverSLibInstance_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MFlatDriverSLibInstance_Group_4_0(lastRuleCallOrigin, this, 1, inst);
			case 2: return new MFlatDriverSLibInstance_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}	
	}

}

// ("attribute" "values" "{" attributeValueAssignments+=MAttributeValueAssignment+ "}" ";")?
protected class MFlatDriverSLibInstance_Group_4_0 extends GroupToken {
	
	public MFlatDriverSLibInstance_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_SemicolonKeyword_4_0_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "attribute"
protected class MFlatDriverSLibInstance_AttributeKeyword_4_0_0 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_AttributeKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "values"
protected class MFlatDriverSLibInstance_ValuesKeyword_4_0_1 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_ValuesKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getValuesKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_AttributeKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MFlatDriverSLibInstance_LeftCurlyBracketKeyword_4_0_2 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_LeftCurlyBracketKeyword_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_ValuesKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// attributeValueAssignments+=MAttributeValueAssignment+
protected class MFlatDriverSLibInstance_AttributeValueAssignmentsAssignment_4_0_3 extends AssignmentToken  {
	
	public MFlatDriverSLibInstance_AttributeValueAssignmentsAssignment_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeValueAssignmentsAssignment_4_0_3();
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
				element = grammarAccess.getMFlatDriverSLibInstanceAccess().getAttributeValueAssignmentsMAttributeValueAssignmentParserRuleCall_4_0_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_AttributeValueAssignmentsAssignment_4_0_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MFlatDriverSLibInstance_LeftCurlyBracketKeyword_4_0_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MFlatDriverSLibInstance_RightCurlyBracketKeyword_4_0_4 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_RightCurlyBracketKeyword_4_0_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_0_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_AttributeValueAssignmentsAssignment_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MFlatDriverSLibInstance_SemicolonKeyword_4_0_5 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_SemicolonKeyword_4_0_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_4_0_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_RightCurlyBracketKeyword_4_0_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// ("device" "mappings" "{" deviceDriverMappings+=MFlatDeviceDriverMapping+ "}" ";")?
protected class MFlatDriverSLibInstance_Group_4_1 extends GroupToken {
	
	public MFlatDriverSLibInstance_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_SemicolonKeyword_4_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "device"
protected class MFlatDriverSLibInstance_DeviceKeyword_4_1_0 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_DeviceKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MFlatDriverSLibInstance_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "mappings"
protected class MFlatDriverSLibInstance_MappingsKeyword_4_1_1 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_MappingsKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getMappingsKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_DeviceKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "{"
protected class MFlatDriverSLibInstance_LeftCurlyBracketKeyword_4_1_2 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_LeftCurlyBracketKeyword_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getLeftCurlyBracketKeyword_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_MappingsKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deviceDriverMappings+=MFlatDeviceDriverMapping+
protected class MFlatDriverSLibInstance_DeviceDriverMappingsAssignment_4_1_3 extends AssignmentToken  {
	
	public MFlatDriverSLibInstance_DeviceDriverMappingsAssignment_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceDriverMappingsAssignment_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDeviceDriverMapping_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deviceDriverMappings",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deviceDriverMappings");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatDeviceDriverMappingRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMFlatDriverSLibInstanceAccess().getDeviceDriverMappingsMFlatDeviceDriverMappingParserRuleCall_4_1_3_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_DeviceDriverMappingsAssignment_4_1_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MFlatDriverSLibInstance_LeftCurlyBracketKeyword_4_1_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}

// "}"
protected class MFlatDriverSLibInstance_RightCurlyBracketKeyword_4_1_4 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_RightCurlyBracketKeyword_4_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_4_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_DeviceDriverMappingsAssignment_4_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MFlatDriverSLibInstance_SemicolonKeyword_4_1_5 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_SemicolonKeyword_4_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_4_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_RightCurlyBracketKeyword_4_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MFlatDriverSLibInstance_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MFlatDriverSLibInstance_SemicolonKeyword_6 extends KeywordToken  {
	
	public MFlatDriverSLibInstance_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDriverSLibInstanceAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDriverSLibInstance_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MFlatDriverSLibInstance ****************/


/************ begin Rule MFlatDeviceDriverMapping ****************
 *
 * MFlatDeviceDriverMapping:
 * 	"supported" "device" supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName] "->"
 * 	"deployed" "device" deployedDevice=[mclevmcad::MDeployedDevice|VersionedQualifiedReferenceName] ";";
 *
 **/

// "supported" "device" supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName] "->"
// "deployed" "device" deployedDevice=[mclevmcad::MDeployedDevice|VersionedQualifiedReferenceName] ";"
protected class MFlatDeviceDriverMapping_Group extends GroupToken {
	
	public MFlatDeviceDriverMapping_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMFlatDeviceDriverMappingAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDeviceDriverMapping_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMFlatDeviceDriverMappingRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "supported"
protected class MFlatDeviceDriverMapping_SupportedKeyword_0 extends KeywordToken  {
	
	public MFlatDeviceDriverMapping_SupportedKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// "device"
protected class MFlatDeviceDriverMapping_DeviceKeyword_1 extends KeywordToken  {
	
	public MFlatDeviceDriverMapping_DeviceKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDeviceDriverMappingAccess().getDeviceKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDeviceDriverMapping_SupportedKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedDevice=[mclevslib::MDriverSLibSupportedDevice|VersionedQualifiedReferenceName]
protected class MFlatDeviceDriverMapping_SupportedDeviceAssignment_2 extends AssignmentToken  {
	
	public MFlatDeviceDriverMapping_SupportedDeviceAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedDeviceAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDeviceDriverMapping_DeviceKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedDevice",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedDevice");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatDeviceDriverMappingAccess().getSupportedDeviceMDriverSLibSupportedDeviceCrossReference_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "->"
protected class MFlatDeviceDriverMapping_HyphenMinusGreaterThanSignKeyword_3 extends KeywordToken  {
	
	public MFlatDeviceDriverMapping_HyphenMinusGreaterThanSignKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDeviceDriverMappingAccess().getHyphenMinusGreaterThanSignKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDeviceDriverMapping_SupportedDeviceAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "deployed"
protected class MFlatDeviceDriverMapping_DeployedKeyword_4 extends KeywordToken  {
	
	public MFlatDeviceDriverMapping_DeployedKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDeviceDriverMapping_HyphenMinusGreaterThanSignKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "device"
protected class MFlatDeviceDriverMapping_DeviceKeyword_5 extends KeywordToken  {
	
	public MFlatDeviceDriverMapping_DeviceKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDeviceDriverMappingAccess().getDeviceKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDeviceDriverMapping_DeployedKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// deployedDevice=[mclevmcad::MDeployedDevice|VersionedQualifiedReferenceName]
protected class MFlatDeviceDriverMapping_DeployedDeviceAssignment_6 extends AssignmentToken  {
	
	public MFlatDeviceDriverMapping_DeployedDeviceAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedDeviceAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDeviceDriverMapping_DeviceKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("deployedDevice",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("deployedDevice");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceCrossReference_6_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMFlatDeviceDriverMappingAccess().getDeployedDeviceMDeployedDeviceCrossReference_6_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MFlatDeviceDriverMapping_SemicolonKeyword_7 extends KeywordToken  {
	
	public MFlatDeviceDriverMapping_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMFlatDeviceDriverMappingAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MFlatDeviceDriverMapping_DeployedDeviceAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MFlatDeviceDriverMapping ****************/


/************ begin Rule MAttributeValueAssignment ****************
 *
 * MAttributeValueAssignment returns common::MParameterValueAssignmentSingleExpression:
 * 	"attribute" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":="
 * 	parameterValue=MParameterValueExpression ";";
 *
 **/

// "attribute" parameter=[common::MParameter|VersionedQualifiedReferenceName] ":=" parameterValue=MParameterValueExpression
// ";"
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

// "attribute"
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

// ":="
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

// ";"
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




}
