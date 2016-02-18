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
package es.uah.aut.srg.micobs.mclev.domain.edroom.lang.parseTreeConstruction;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.mclev.domain.edroom.lang.services.DCLASSGrammarAccess;

@SuppressWarnings("all")
public class DCLASSParsetreeConstructor extends AbstractParseTreeConstructor {

	@Inject
	private DCLASSGrammarAccess grammarAccess;

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
			case 0: return new EDROOMDCLASSPackageFile_Group(this, this, 0, inst);
			case 1: return new EDROOMDCLASSPackageElement_EDROOMDataClassParserRuleCall(this, this, 1, inst);
			case 2: return new EDROOMDataClass_Group(this, this, 2, inst);
			case 3: return new EDROOMDataDefinition_Alternatives(this, this, 3, inst);
			case 4: return new EDROOMDataDefinitionUnion_Group(this, this, 4, inst);
			case 5: return new EDROOMDataDefinitionEnum_Group(this, this, 5, inst);
			case 6: return new EDROOMDataDefinitionEnumElement_Group(this, this, 6, inst);
			case 7: return new EDROOMDataDefinitionUnionElement_Alternatives(this, this, 7, inst);
			case 8: return new EDROOMDataDefinitionUnionElementBasic_Group(this, this, 8, inst);
			case 9: return new EDROOMDataDefinitionUnionElementBasicArray_Group(this, this, 9, inst);
			case 10: return new EDROOMDataDefinitionUnionElementClass_Group(this, this, 10, inst);
			case 11: return new EDROOMDataDefinitionUnionElementClassArray_Group(this, this, 11, inst);
			case 12: return new EDROOMDataDefinitionUnionElementUnion_Group(this, this, 12, inst);
			case 13: return new EDROOMDataDefinitionUnionElementUnionArray_Group(this, this, 13, inst);
			case 14: return new EDROOMDataDefinitionUnionElementEnum_Group(this, this, 14, inst);
			case 15: return new EDROOMDataDefinitionUnionElementEnumArray_Group(this, this, 15, inst);
			case 16: return new EDROOMDataField_Alternatives(this, this, 16, inst);
			case 17: return new EDROOMDataFieldBasic_Group(this, this, 17, inst);
			case 18: return new EDROOMDataFieldBasicArray_Group(this, this, 18, inst);
			case 19: return new EDROOMDataFieldClass_Group(this, this, 19, inst);
			case 20: return new EDROOMDataFieldClassArray_Group(this, this, 20, inst);
			case 21: return new EDROOMDataFieldUnion_Group(this, this, 21, inst);
			case 22: return new EDROOMDataFieldUnionArray_Group(this, this, 22, inst);
			case 23: return new EDROOMDataFieldEnum_Group(this, this, 23, inst);
			case 24: return new EDROOMDataFieldEnumArray_Group(this, this, 24, inst);
			default: return null;
		}
	}
}


/************ begin Rule EDROOMDCLASSPackageFile ****************
 *
 * EDROOMDCLASSPackageFile:
 * 	"package" package=[edroomlibrary::EDROOMPackage|QualifiedName] ";" ("import"
 * 	imports+=[edroomlibrary::EDROOMPackage|QualifiedName] ";")* element=EDROOMDCLASSPackageElement;
 *
 **/

// "package" package=[edroomlibrary::EDROOMPackage|QualifiedName] ";" ("import"
// imports+=[edroomlibrary::EDROOMPackage|QualifiedName] ";")* element=EDROOMDCLASSPackageElement
protected class EDROOMDCLASSPackageFile_Group extends GroupToken {

	public EDROOMDCLASSPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDCLASSPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDCLASSPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDCLASSPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "package"
protected class EDROOMDCLASSPackageFile_PackageKeyword_0 extends KeywordToken  {

	public EDROOMDCLASSPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDCLASSPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}
	}

}

// package=[edroomlibrary::EDROOMPackage|QualifiedName]
protected class EDROOMDCLASSPackageFile_PackageAssignment_1 extends AssignmentToken  {

	public EDROOMDCLASSPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDCLASSPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDCLASSPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDCLASSPackageFileAccess().getPackageEDROOMPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDCLASSPackageFileAccess().getPackageEDROOMPackageCrossReference_1_0();
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class EDROOMDCLASSPackageFile_SemicolonKeyword_2 extends KeywordToken  {

	public EDROOMDCLASSPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDCLASSPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDCLASSPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ("import" imports+=[edroomlibrary::EDROOMPackage|QualifiedName] ";")*
protected class EDROOMDCLASSPackageFile_Group_3 extends GroupToken {

	public EDROOMDCLASSPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDCLASSPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDCLASSPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "import"
protected class EDROOMDCLASSPackageFile_ImportKeyword_3_0 extends KeywordToken  {

	public EDROOMDCLASSPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDCLASSPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDCLASSPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDCLASSPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// imports+=[edroomlibrary::EDROOMPackage|QualifiedName]
protected class EDROOMDCLASSPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {

	public EDROOMDCLASSPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDCLASSPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDCLASSPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDCLASSPackageFileAccess().getImportsEDROOMPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDCLASSPackageFileAccess().getImportsEDROOMPackageCrossReference_3_1_0();
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class EDROOMDCLASSPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {

	public EDROOMDCLASSPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDCLASSPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDCLASSPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// element=EDROOMDCLASSPackageElement
protected class EDROOMDCLASSPackageFile_ElementAssignment_4 extends AssignmentToken  {

	public EDROOMDCLASSPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDCLASSPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDCLASSPackageElement_EDROOMDataClassParserRuleCall(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDCLASSPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEDROOMDCLASSPackageFileAccess().getElementEDROOMDCLASSPackageElementParserRuleCall_4_0();
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EDROOMDCLASSPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new EDROOMDCLASSPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}
	}
}

/************ end Rule EDROOMDCLASSPackageFile ****************/

/************ begin Rule EDROOMDCLASSPackageElement ****************
 *
 * EDROOMDCLASSPackageElement:
 * 	EDROOMDataClass;
 *
 **/

// EDROOMDataClass
protected class EDROOMDCLASSPackageElement_EDROOMDataClassParserRuleCall extends RuleCallToken {

	public EDROOMDCLASSPackageElement_EDROOMDataClassParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDCLASSPackageElementAccess().getEDROOMDataClassParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataClassAccess().getEDROOMDataClassAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataClass_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

/************ end Rule EDROOMDCLASSPackageElement ****************/

/************ begin Rule EDROOMDataClass ****************
 *
 * EDROOMDataClass:
 * 	{EDROOMDataClass} "dataclass" name=ID ("inherits" inherits+=[EDROOMDataClass|VersionedQualifiedName] (","
 * 	inherits+=[EDROOMDataClass|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" &
 * 	(definitions+=EDROOMDataDefinition | fields+=EDROOMDataField)*) "}" ";";
 *
 **/

// {EDROOMDataClass} "dataclass" name=ID ("inherits" inherits+=[EDROOMDataClass|VersionedQualifiedName] (","
// inherits+=[EDROOMDataClass|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" &
// (definitions+=EDROOMDataDefinition | fields+=EDROOMDataField)*) "}" ";"
protected class EDROOMDataClass_Group extends GroupToken {

	public EDROOMDataClass_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataClassAccess().getEDROOMDataClassAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataClass}
protected class EDROOMDataClass_EDROOMDataClassAction_0 extends ActionToken  {

	public EDROOMDataClass_EDROOMDataClassAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getEDROOMDataClassAction_0();
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

// "dataclass"
protected class EDROOMDataClass_DataclassKeyword_1 extends KeywordToken  {

	public EDROOMDataClass_DataclassKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getDataclassKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_EDROOMDataClassAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// name=ID
protected class EDROOMDataClass_NameAssignment_2 extends AssignmentToken  {

	public EDROOMDataClass_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_DataclassKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataClassAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataClassAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ("inherits" inherits+=[EDROOMDataClass|VersionedQualifiedName] (","
// inherits+=[EDROOMDataClass|VersionedQualifiedName])*)?
protected class EDROOMDataClass_Group_3 extends GroupToken {

	public EDROOMDataClass_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDataClass_InheritsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// "inherits"
protected class EDROOMDataClass_InheritsKeyword_3_0 extends KeywordToken  {

	public EDROOMDataClass_InheritsKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getInheritsKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// inherits+=[EDROOMDataClass|VersionedQualifiedName]
protected class EDROOMDataClass_InheritsAssignment_3_1 extends AssignmentToken  {

	public EDROOMDataClass_InheritsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getInheritsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_InheritsKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataClassAccess().getInheritsEDROOMDataClassCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataClassAccess().getInheritsEDROOMDataClassCrossReference_3_1_0();
				return obj;
			}
		}
		return null;
	}

}

// ("," inherits+=[EDROOMDataClass|VersionedQualifiedName])*
protected class EDROOMDataClass_Group_3_2 extends GroupToken {

	public EDROOMDataClass_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_InheritsAssignment_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ","
protected class EDROOMDataClass_CommaKeyword_3_2_0 extends KeywordToken  {

	public EDROOMDataClass_CommaKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getCommaKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDataClass_InheritsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// inherits+=[EDROOMDataClass|VersionedQualifiedName]
protected class EDROOMDataClass_InheritsAssignment_3_2_1 extends AssignmentToken  {

	public EDROOMDataClass_InheritsAssignment_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getInheritsAssignment_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_CommaKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inherits",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inherits");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataClassAccess().getInheritsEDROOMDataClassCrossReference_3_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataClassAccess().getInheritsEDROOMDataClassCrossReference_3_2_1_0();
				return obj;
			}
		}
		return null;
	}

}

// "{"
protected class EDROOMDataClass_LeftCurlyBracketKeyword_4 extends KeywordToken  {

	public EDROOMDataClass_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDataClass_NameAssignment_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// "version" ":=" version=Version ";" & (definitions+=EDROOMDataDefinition | fields+=EDROOMDataField)*
protected class EDROOMDataClass_UnorderedGroup_5 extends UnorderedGroupToken {

	public EDROOMDataClass_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_Alternatives_5_1(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDataClass_Group_5_0(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// "version" ":=" version=Version ";"
protected class EDROOMDataClass_Group_5_0 extends GroupToken {

	public EDROOMDataClass_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "version"
protected class EDROOMDataClass_VersionKeyword_5_0_0 extends KeywordToken  {

	public EDROOMDataClass_VersionKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getVersionKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ":="
protected class EDROOMDataClass_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {

	public EDROOMDataClass_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_VersionKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// version=Version
protected class EDROOMDataClass_VersionAssignment_5_0_2 extends AssignmentToken  {

	public EDROOMDataClass_VersionAssignment_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getVersionAssignment_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataClassAccess().getVersionVersionParserRuleCall_5_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getEDROOMDataClassAccess().getVersionVersionParserRuleCall_5_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class EDROOMDataClass_SemicolonKeyword_5_0_3 extends KeywordToken  {

	public EDROOMDataClass_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_VersionAssignment_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// (definitions+=EDROOMDataDefinition | fields+=EDROOMDataField)*
protected class EDROOMDataClass_Alternatives_5_1 extends AlternativesToken {

	public EDROOMDataClass_Alternatives_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getAlternatives_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_DefinitionsAssignment_5_1_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDataClass_FieldsAssignment_5_1_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// definitions+=EDROOMDataDefinition
protected class EDROOMDataClass_DefinitionsAssignment_5_1_0 extends AssignmentToken  {

	public EDROOMDataClass_DefinitionsAssignment_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getDefinitionsAssignment_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinition_Alternatives(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("definitions",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("definitions");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataDefinitionRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEDROOMDataClassAccess().getDefinitionsEDROOMDataDefinitionParserRuleCall_5_1_0_0();
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EDROOMDataClass_Alternatives_5_1(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new EDROOMDataClass_Group_5_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}
	}
}

// fields+=EDROOMDataField
protected class EDROOMDataClass_FieldsAssignment_5_1_1 extends AssignmentToken  {

	public EDROOMDataClass_FieldsAssignment_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getFieldsAssignment_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataField_Alternatives(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("fields",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("fields");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataFieldRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEDROOMDataClassAccess().getFieldsEDROOMDataFieldParserRuleCall_5_1_1_0();
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EDROOMDataClass_Alternatives_5_1(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new EDROOMDataClass_Group_5_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}
	}
}

// "}"
protected class EDROOMDataClass_RightCurlyBracketKeyword_6 extends KeywordToken  {

	public EDROOMDataClass_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMDataClass_SemicolonKeyword_7 extends KeywordToken  {

	public EDROOMDataClass_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataClassAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataClass_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataClass ****************/

/************ begin Rule EDROOMDataDefinition ****************
 *
 * EDROOMDataDefinition:
 * 	EDROOMDataDefinitionUnion | EDROOMDataDefinitionEnum;
 *
 **/

// EDROOMDataDefinitionUnion | EDROOMDataDefinitionEnum
protected class EDROOMDataDefinition_Alternatives extends AlternativesToken {

	public EDROOMDataDefinition_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinition_EDROOMDataDefinitionUnionParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDataDefinition_EDROOMDataDefinitionEnumParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionEnumAccess().getEDROOMDataDefinitionEnumAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionAccess().getEDROOMDataDefinitionUnionAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// EDROOMDataDefinitionUnion
protected class EDROOMDataDefinition_EDROOMDataDefinitionUnionParserRuleCall_0 extends RuleCallToken {

	public EDROOMDataDefinition_EDROOMDataDefinitionUnionParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionAccess().getEDROOMDataDefinitionUnionParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnion_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionAccess().getEDROOMDataDefinitionUnionAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataDefinitionUnion_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataDefinitionEnum
protected class EDROOMDataDefinition_EDROOMDataDefinitionEnumParserRuleCall_1 extends RuleCallToken {

	public EDROOMDataDefinition_EDROOMDataDefinitionEnumParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionAccess().getEDROOMDataDefinitionEnumParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnum_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionEnumAccess().getEDROOMDataDefinitionEnumAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataDefinitionEnum_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

/************ end Rule EDROOMDataDefinition ****************/

/************ begin Rule EDROOMDataDefinitionUnion ****************
 *
 * EDROOMDataDefinitionUnion:
 * 	{EDROOMDataDefinitionUnion} "union" name=ID "{" elements+=EDROOMDataDefinitionUnionElement
 * 	elements+=EDROOMDataDefinitionUnionElement elements+=EDROOMDataDefinitionUnionElement* "}" ";";
 *
 **/

// {EDROOMDataDefinitionUnion} "union" name=ID "{" elements+=EDROOMDataDefinitionUnionElement
// elements+=EDROOMDataDefinitionUnionElement elements+=EDROOMDataDefinitionUnionElement* "}" ";"
protected class EDROOMDataDefinitionUnion_Group extends GroupToken {

	public EDROOMDataDefinitionUnion_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnion_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionAccess().getEDROOMDataDefinitionUnionAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataDefinitionUnion}
protected class EDROOMDataDefinitionUnion_EDROOMDataDefinitionUnionAction_0 extends ActionToken  {

	public EDROOMDataDefinitionUnion_EDROOMDataDefinitionUnionAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionAccess().getEDROOMDataDefinitionUnionAction_0();
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

// "union"
protected class EDROOMDataDefinitionUnion_UnionKeyword_1 extends KeywordToken  {

	public EDROOMDataDefinitionUnion_UnionKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionAccess().getUnionKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnion_EDROOMDataDefinitionUnionAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// name=ID
protected class EDROOMDataDefinitionUnion_NameAssignment_2 extends AssignmentToken  {

	public EDROOMDataDefinitionUnion_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnion_UnionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class EDROOMDataDefinitionUnion_LeftCurlyBracketKeyword_3 extends KeywordToken  {

	public EDROOMDataDefinitionUnion_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnion_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// elements+=EDROOMDataDefinitionUnionElement
protected class EDROOMDataDefinitionUnion_ElementsAssignment_4 extends AssignmentToken  {

	public EDROOMDataDefinitionUnion_ElementsAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionAccess().getElementsAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElement_Alternatives(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataDefinitionUnionElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEDROOMDataDefinitionUnionAccess().getElementsEDROOMDataDefinitionUnionElementParserRuleCall_4_0();
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnion_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}
	}
}

// elements+=EDROOMDataDefinitionUnionElement
protected class EDROOMDataDefinitionUnion_ElementsAssignment_5 extends AssignmentToken  {

	public EDROOMDataDefinitionUnion_ElementsAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionAccess().getElementsAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElement_Alternatives(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataDefinitionUnionElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEDROOMDataDefinitionUnionAccess().getElementsEDROOMDataDefinitionUnionElementParserRuleCall_5_0();
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnion_ElementsAssignment_4(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}
	}
}

// elements+=EDROOMDataDefinitionUnionElement*
protected class EDROOMDataDefinitionUnion_ElementsAssignment_6 extends AssignmentToken  {

	public EDROOMDataDefinitionUnion_ElementsAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionAccess().getElementsAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElement_Alternatives(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataDefinitionUnionElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEDROOMDataDefinitionUnionAccess().getElementsEDROOMDataDefinitionUnionElementParserRuleCall_6_0();
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnion_ElementsAssignment_6(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new EDROOMDataDefinitionUnion_ElementsAssignment_5(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}
	}
}

// "}"
protected class EDROOMDataDefinitionUnion_RightCurlyBracketKeyword_7 extends KeywordToken  {

	public EDROOMDataDefinitionUnion_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnion_ElementsAssignment_6(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDataDefinitionUnion_ElementsAssignment_5(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMDataDefinitionUnion_SemicolonKeyword_8 extends KeywordToken  {

	public EDROOMDataDefinitionUnion_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnion_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataDefinitionUnion ****************/

/************ begin Rule EDROOMDataDefinitionEnum ****************
 *
 * EDROOMDataDefinitionEnum:
 * 	{EDROOMDataDefinitionEnum} "enum" name=ID "{" elements+=EDROOMDataDefinitionEnumElement (","
 * 	elements+=EDROOMDataDefinitionEnumElement)* "}" ";";
 *
 **/

// {EDROOMDataDefinitionEnum} "enum" name=ID "{" elements+=EDROOMDataDefinitionEnumElement (","
// elements+=EDROOMDataDefinitionEnumElement)* "}" ";"
protected class EDROOMDataDefinitionEnum_Group extends GroupToken {

	public EDROOMDataDefinitionEnum_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnum_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionEnumAccess().getEDROOMDataDefinitionEnumAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataDefinitionEnum}
protected class EDROOMDataDefinitionEnum_EDROOMDataDefinitionEnumAction_0 extends ActionToken  {

	public EDROOMDataDefinitionEnum_EDROOMDataDefinitionEnumAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumAccess().getEDROOMDataDefinitionEnumAction_0();
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
protected class EDROOMDataDefinitionEnum_EnumKeyword_1 extends KeywordToken  {

	public EDROOMDataDefinitionEnum_EnumKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumAccess().getEnumKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnum_EDROOMDataDefinitionEnumAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// name=ID
protected class EDROOMDataDefinitionEnum_NameAssignment_2 extends AssignmentToken  {

	public EDROOMDataDefinitionEnum_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnum_EnumKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionEnumAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionEnumAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class EDROOMDataDefinitionEnum_LeftCurlyBracketKeyword_3 extends KeywordToken  {

	public EDROOMDataDefinitionEnum_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnum_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// elements+=EDROOMDataDefinitionEnumElement
protected class EDROOMDataDefinitionEnum_ElementsAssignment_4 extends AssignmentToken  {

	public EDROOMDataDefinitionEnum_ElementsAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumAccess().getElementsAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnumElement_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataDefinitionEnumElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEDROOMDataDefinitionEnumAccess().getElementsEDROOMDataDefinitionEnumElementParserRuleCall_4_0();
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnum_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}
	}
}

// ("," elements+=EDROOMDataDefinitionEnumElement)*
protected class EDROOMDataDefinitionEnum_Group_5 extends GroupToken {

	public EDROOMDataDefinitionEnum_Group_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumAccess().getGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnum_ElementsAssignment_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ","
protected class EDROOMDataDefinitionEnum_CommaKeyword_5_0 extends KeywordToken  {

	public EDROOMDataDefinitionEnum_CommaKeyword_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumAccess().getCommaKeyword_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnum_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDataDefinitionEnum_ElementsAssignment_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// elements+=EDROOMDataDefinitionEnumElement
protected class EDROOMDataDefinitionEnum_ElementsAssignment_5_1 extends AssignmentToken  {

	public EDROOMDataDefinitionEnum_ElementsAssignment_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumAccess().getElementsAssignment_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnumElement_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataDefinitionEnumElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEDROOMDataDefinitionEnumAccess().getElementsEDROOMDataDefinitionEnumElementParserRuleCall_5_1_0();
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnum_CommaKeyword_5_0(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}
	}
}

// "}"
protected class EDROOMDataDefinitionEnum_RightCurlyBracketKeyword_6 extends KeywordToken  {

	public EDROOMDataDefinitionEnum_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnum_Group_5(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDataDefinitionEnum_ElementsAssignment_4(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMDataDefinitionEnum_SemicolonKeyword_7 extends KeywordToken  {

	public EDROOMDataDefinitionEnum_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnum_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataDefinitionEnum ****************/

/************ begin Rule EDROOMDataDefinitionEnumElement ****************
 *
 * EDROOMDataDefinitionEnumElement:
 * 	{EDROOMDataDefinitionEnumElement} name=ID ("=" value=EInt)?;
 *
 **/

// {EDROOMDataDefinitionEnumElement} name=ID ("=" value=EInt)?
protected class EDROOMDataDefinitionEnumElement_Group extends GroupToken {

	public EDROOMDataDefinitionEnumElement_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnumElement_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDataDefinitionEnumElement_NameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getEDROOMDataDefinitionEnumElementAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataDefinitionEnumElement}
protected class EDROOMDataDefinitionEnumElement_EDROOMDataDefinitionEnumElementAction_0 extends ActionToken  {

	public EDROOMDataDefinitionEnumElement_EDROOMDataDefinitionEnumElementAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getEDROOMDataDefinitionEnumElementAction_0();
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
protected class EDROOMDataDefinitionEnumElement_NameAssignment_1 extends AssignmentToken  {

	public EDROOMDataDefinitionEnumElement_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnumElement_EDROOMDataDefinitionEnumElementAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ("=" value=EInt)?
protected class EDROOMDataDefinitionEnumElement_Group_2 extends GroupToken {

	public EDROOMDataDefinitionEnumElement_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnumElement_ValueAssignment_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "="
protected class EDROOMDataDefinitionEnumElement_EqualsSignKeyword_2_0 extends KeywordToken  {

	public EDROOMDataDefinitionEnumElement_EqualsSignKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getEqualsSignKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnumElement_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// value=EInt
protected class EDROOMDataDefinitionEnumElement_ValueAssignment_2_1 extends AssignmentToken  {

	public EDROOMDataDefinitionEnumElement_ValueAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getValueAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionEnumElement_EqualsSignKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("value",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("value");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getValueEIntParserRuleCall_2_1_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionEnumElementAccess().getValueEIntParserRuleCall_2_1_0();
			return obj;
		}
		return null;
	}

}

/************ end Rule EDROOMDataDefinitionEnumElement ****************/

/************ begin Rule EDROOMDataDefinitionUnionElement ****************
 *
 * EDROOMDataDefinitionUnionElement:
 * 	EDROOMDataDefinitionUnionElementBasic | EDROOMDataDefinitionUnionElementBasicArray |
 * 	EDROOMDataDefinitionUnionElementClass | EDROOMDataDefinitionUnionElementClassArray |
 * 	EDROOMDataDefinitionUnionElementUnion | EDROOMDataDefinitionUnionElementUnionArray |
 * 	EDROOMDataDefinitionUnionElementEnum | EDROOMDataDefinitionUnionElementEnumArray;
 *
 **/

// EDROOMDataDefinitionUnionElementBasic | EDROOMDataDefinitionUnionElementBasicArray |
// EDROOMDataDefinitionUnionElementClass | EDROOMDataDefinitionUnionElementClassArray |
// EDROOMDataDefinitionUnionElementUnion | EDROOMDataDefinitionUnionElementUnionArray |
// EDROOMDataDefinitionUnionElementEnum | EDROOMDataDefinitionUnionElementEnumArray
protected class EDROOMDataDefinitionUnionElement_Alternatives extends AlternativesToken {

	public EDROOMDataDefinitionUnionElement_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementBasicParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementBasicArrayParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementClassParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementClassArrayParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementUnionParserRuleCall_4(lastRuleCallOrigin, this, 4, inst);
			case 5: return new EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementUnionArrayParserRuleCall_5(lastRuleCallOrigin, this, 5, inst);
			case 6: return new EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementEnumParserRuleCall_6(lastRuleCallOrigin, this, 6, inst);
			case 7: return new EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementEnumArrayParserRuleCall_7(lastRuleCallOrigin, this, 7, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getEDROOMDataDefinitionUnionElementBasicAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getEDROOMDataDefinitionUnionElementBasicArrayAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getEDROOMDataDefinitionUnionElementClassAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getEDROOMDataDefinitionUnionElementClassArrayAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getEDROOMDataDefinitionUnionElementEnumAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getEDROOMDataDefinitionUnionElementEnumArrayAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getEDROOMDataDefinitionUnionElementUnionAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getEDROOMDataDefinitionUnionElementUnionArrayAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// EDROOMDataDefinitionUnionElementBasic
protected class EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementBasicParserRuleCall_0 extends RuleCallToken {

	public EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementBasicParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementBasicParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasic_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getEDROOMDataDefinitionUnionElementBasicAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataDefinitionUnionElementBasic_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataDefinitionUnionElementBasicArray
protected class EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementBasicArrayParserRuleCall_1 extends RuleCallToken {

	public EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementBasicArrayParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementBasicArrayParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasicArray_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getEDROOMDataDefinitionUnionElementBasicArrayAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataDefinitionUnionElementBasicArray_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataDefinitionUnionElementClass
protected class EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementClassParserRuleCall_2 extends RuleCallToken {

	public EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementClassParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementClassParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClass_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getEDROOMDataDefinitionUnionElementClassAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataDefinitionUnionElementClass_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataDefinitionUnionElementClassArray
protected class EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementClassArrayParserRuleCall_3 extends RuleCallToken {

	public EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementClassArrayParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementClassArrayParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClassArray_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getEDROOMDataDefinitionUnionElementClassArrayAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataDefinitionUnionElementClassArray_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataDefinitionUnionElementUnion
protected class EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementUnionParserRuleCall_4 extends RuleCallToken {

	public EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementUnionParserRuleCall_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementUnionParserRuleCall_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnion_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getEDROOMDataDefinitionUnionElementUnionAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataDefinitionUnionElementUnion_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataDefinitionUnionElementUnionArray
protected class EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementUnionArrayParserRuleCall_5 extends RuleCallToken {

	public EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementUnionArrayParserRuleCall_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementUnionArrayParserRuleCall_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnionArray_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getEDROOMDataDefinitionUnionElementUnionArrayAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataDefinitionUnionElementUnionArray_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataDefinitionUnionElementEnum
protected class EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementEnumParserRuleCall_6 extends RuleCallToken {

	public EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementEnumParserRuleCall_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementEnumParserRuleCall_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnum_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getEDROOMDataDefinitionUnionElementEnumAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataDefinitionUnionElementEnum_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataDefinitionUnionElementEnumArray
protected class EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementEnumArrayParserRuleCall_7 extends RuleCallToken {

	public EDROOMDataDefinitionUnionElement_EDROOMDataDefinitionUnionElementEnumArrayParserRuleCall_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementAccess().getEDROOMDataDefinitionUnionElementEnumArrayParserRuleCall_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnumArray_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getEDROOMDataDefinitionUnionElementEnumArrayAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataDefinitionUnionElementEnumArray_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

/************ end Rule EDROOMDataDefinitionUnionElement ****************/

/************ begin Rule EDROOMDataDefinitionUnionElementBasic ****************
 *
 * EDROOMDataDefinitionUnionElementBasic:
 * 	{EDROOMDataDefinitionUnionElementBasic} type=EDROOMBasicType name=ID ";";
 *
 **/

// {EDROOMDataDefinitionUnionElementBasic} type=EDROOMBasicType name=ID ";"
protected class EDROOMDataDefinitionUnionElementBasic_Group extends GroupToken {

	public EDROOMDataDefinitionUnionElementBasic_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasic_SemicolonKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getEDROOMDataDefinitionUnionElementBasicAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataDefinitionUnionElementBasic}
protected class EDROOMDataDefinitionUnionElementBasic_EDROOMDataDefinitionUnionElementBasicAction_0 extends ActionToken  {

	public EDROOMDataDefinitionUnionElementBasic_EDROOMDataDefinitionUnionElementBasicAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getEDROOMDataDefinitionUnionElementBasicAction_0();
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

// type=EDROOMBasicType
protected class EDROOMDataDefinitionUnionElementBasic_TypeAssignment_1 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementBasic_TypeAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getTypeAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasic_EDROOMDataDefinitionUnionElementBasicAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(enumLitSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getTypeEDROOMBasicTypeEnumRuleCall_1_0(), value, null)) {
			type = AssignmentType.ENUM_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getTypeEDROOMBasicTypeEnumRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataDefinitionUnionElementBasic_NameAssignment_2 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementBasic_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasic_TypeAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class EDROOMDataDefinitionUnionElementBasic_SemicolonKeyword_3 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementBasic_SemicolonKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicAccess().getSemicolonKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasic_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataDefinitionUnionElementBasic ****************/

/************ begin Rule EDROOMDataDefinitionUnionElementBasicArray ****************
 *
 * EDROOMDataDefinitionUnionElementBasicArray:
 * 	{EDROOMDataDefinitionUnionElementBasicArray} type=EDROOMBasicType name=ID "[" elements=EInt "]" ";";
 *
 **/

// {EDROOMDataDefinitionUnionElementBasicArray} type=EDROOMBasicType name=ID "[" elements=EInt "]" ";"
protected class EDROOMDataDefinitionUnionElementBasicArray_Group extends GroupToken {

	public EDROOMDataDefinitionUnionElementBasicArray_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasicArray_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getEDROOMDataDefinitionUnionElementBasicArrayAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataDefinitionUnionElementBasicArray}
protected class EDROOMDataDefinitionUnionElementBasicArray_EDROOMDataDefinitionUnionElementBasicArrayAction_0 extends ActionToken  {

	public EDROOMDataDefinitionUnionElementBasicArray_EDROOMDataDefinitionUnionElementBasicArrayAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getEDROOMDataDefinitionUnionElementBasicArrayAction_0();
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

// type=EDROOMBasicType
protected class EDROOMDataDefinitionUnionElementBasicArray_TypeAssignment_1 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementBasicArray_TypeAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getTypeAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasicArray_EDROOMDataDefinitionUnionElementBasicArrayAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(enumLitSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getTypeEDROOMBasicTypeEnumRuleCall_1_0(), value, null)) {
			type = AssignmentType.ENUM_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getTypeEDROOMBasicTypeEnumRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataDefinitionUnionElementBasicArray_NameAssignment_2 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementBasicArray_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasicArray_TypeAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "["
protected class EDROOMDataDefinitionUnionElementBasicArray_LeftSquareBracketKeyword_3 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementBasicArray_LeftSquareBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getLeftSquareBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasicArray_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// elements=EInt
protected class EDROOMDataDefinitionUnionElementBasicArray_ElementsAssignment_4 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementBasicArray_ElementsAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getElementsAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasicArray_LeftSquareBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getElementsEIntParserRuleCall_4_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getElementsEIntParserRuleCall_4_0();
			return obj;
		}
		return null;
	}

}

// "]"
protected class EDROOMDataDefinitionUnionElementBasicArray_RightSquareBracketKeyword_5 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementBasicArray_RightSquareBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getRightSquareBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasicArray_ElementsAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMDataDefinitionUnionElementBasicArray_SemicolonKeyword_6 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementBasicArray_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementBasicArrayAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementBasicArray_RightSquareBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataDefinitionUnionElementBasicArray ****************/

/************ begin Rule EDROOMDataDefinitionUnionElementClass ****************
 *
 * EDROOMDataDefinitionUnionElementClass:
 * 	{EDROOMDataDefinitionUnionElementClass} type=[EDROOMDataClass] name=ID ";";
 *
 **/

// {EDROOMDataDefinitionUnionElementClass} type=[EDROOMDataClass] name=ID ";"
protected class EDROOMDataDefinitionUnionElementClass_Group extends GroupToken {

	public EDROOMDataDefinitionUnionElementClass_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClass_SemicolonKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getEDROOMDataDefinitionUnionElementClassAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataDefinitionUnionElementClass}
protected class EDROOMDataDefinitionUnionElementClass_EDROOMDataDefinitionUnionElementClassAction_0 extends ActionToken  {

	public EDROOMDataDefinitionUnionElementClass_EDROOMDataDefinitionUnionElementClassAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getEDROOMDataDefinitionUnionElementClassAction_0();
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

// type=[EDROOMDataClass]
protected class EDROOMDataDefinitionUnionElementClass_TypeAssignment_1 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementClass_TypeAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getTypeAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClass_EDROOMDataDefinitionUnionElementClassAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getTypeEDROOMDataClassCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getTypeEDROOMDataClassCrossReference_1_0();
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataDefinitionUnionElementClass_NameAssignment_2 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementClass_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClass_TypeAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class EDROOMDataDefinitionUnionElementClass_SemicolonKeyword_3 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementClass_SemicolonKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassAccess().getSemicolonKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClass_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataDefinitionUnionElementClass ****************/

/************ begin Rule EDROOMDataDefinitionUnionElementClassArray ****************
 *
 * EDROOMDataDefinitionUnionElementClassArray:
 * 	{EDROOMDataDefinitionUnionElementClassArray} type=[EDROOMDataClass] name=ID "[" elements=EInt "]" ";";
 *
 **/

// {EDROOMDataDefinitionUnionElementClassArray} type=[EDROOMDataClass] name=ID "[" elements=EInt "]" ";"
protected class EDROOMDataDefinitionUnionElementClassArray_Group extends GroupToken {

	public EDROOMDataDefinitionUnionElementClassArray_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClassArray_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getEDROOMDataDefinitionUnionElementClassArrayAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataDefinitionUnionElementClassArray}
protected class EDROOMDataDefinitionUnionElementClassArray_EDROOMDataDefinitionUnionElementClassArrayAction_0 extends ActionToken  {

	public EDROOMDataDefinitionUnionElementClassArray_EDROOMDataDefinitionUnionElementClassArrayAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getEDROOMDataDefinitionUnionElementClassArrayAction_0();
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

// type=[EDROOMDataClass]
protected class EDROOMDataDefinitionUnionElementClassArray_TypeAssignment_1 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementClassArray_TypeAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getTypeAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClassArray_EDROOMDataDefinitionUnionElementClassArrayAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getTypeEDROOMDataClassCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getTypeEDROOMDataClassCrossReference_1_0();
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataDefinitionUnionElementClassArray_NameAssignment_2 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementClassArray_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClassArray_TypeAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "["
protected class EDROOMDataDefinitionUnionElementClassArray_LeftSquareBracketKeyword_3 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementClassArray_LeftSquareBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getLeftSquareBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClassArray_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// elements=EInt
protected class EDROOMDataDefinitionUnionElementClassArray_ElementsAssignment_4 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementClassArray_ElementsAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getElementsAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClassArray_LeftSquareBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getElementsEIntParserRuleCall_4_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getElementsEIntParserRuleCall_4_0();
			return obj;
		}
		return null;
	}

}

// "]"
protected class EDROOMDataDefinitionUnionElementClassArray_RightSquareBracketKeyword_5 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementClassArray_RightSquareBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getRightSquareBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClassArray_ElementsAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMDataDefinitionUnionElementClassArray_SemicolonKeyword_6 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementClassArray_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementClassArrayAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementClassArray_RightSquareBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataDefinitionUnionElementClassArray ****************/

/************ begin Rule EDROOMDataDefinitionUnionElementUnion ****************
 *
 * EDROOMDataDefinitionUnionElementUnion:
 * 	{EDROOMDataDefinitionUnionElementUnion} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
 * 	name=ID ";";
 *
 **/

// {EDROOMDataDefinitionUnionElementUnion} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName] name=ID
// ";"
protected class EDROOMDataDefinitionUnionElementUnion_Group extends GroupToken {

	public EDROOMDataDefinitionUnionElementUnion_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnion_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getEDROOMDataDefinitionUnionElementUnionAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataDefinitionUnionElementUnion}
protected class EDROOMDataDefinitionUnionElementUnion_EDROOMDataDefinitionUnionElementUnionAction_0 extends ActionToken  {

	public EDROOMDataDefinitionUnionElementUnion_EDROOMDataDefinitionUnionElementUnionAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getEDROOMDataDefinitionUnionElementUnionAction_0();
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

// "union"
protected class EDROOMDataDefinitionUnionElementUnion_UnionKeyword_1 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementUnion_UnionKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getUnionKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnion_EDROOMDataDefinitionUnionElementUnionAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
protected class EDROOMDataDefinitionUnionElementUnion_TypeAssignment_2 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementUnion_TypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnion_UnionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getTypeEDROOMDataDefinitionUnionCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getTypeEDROOMDataDefinitionUnionCrossReference_2_0();
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataDefinitionUnionElementUnion_NameAssignment_3 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementUnion_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnion_TypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class EDROOMDataDefinitionUnionElementUnion_SemicolonKeyword_4 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementUnion_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnion_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataDefinitionUnionElementUnion ****************/

/************ begin Rule EDROOMDataDefinitionUnionElementUnionArray ****************
 *
 * EDROOMDataDefinitionUnionElementUnionArray:
 * 	{EDROOMDataDefinitionUnionElementUnionArray} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
 * 	name=ID "[" elements=EInt "]" ";";
 *
 **/

// {EDROOMDataDefinitionUnionElementUnionArray} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
// name=ID "[" elements=EInt "]" ";"
protected class EDROOMDataDefinitionUnionElementUnionArray_Group extends GroupToken {

	public EDROOMDataDefinitionUnionElementUnionArray_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnionArray_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getEDROOMDataDefinitionUnionElementUnionArrayAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataDefinitionUnionElementUnionArray}
protected class EDROOMDataDefinitionUnionElementUnionArray_EDROOMDataDefinitionUnionElementUnionArrayAction_0 extends ActionToken  {

	public EDROOMDataDefinitionUnionElementUnionArray_EDROOMDataDefinitionUnionElementUnionArrayAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getEDROOMDataDefinitionUnionElementUnionArrayAction_0();
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

// "union"
protected class EDROOMDataDefinitionUnionElementUnionArray_UnionKeyword_1 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementUnionArray_UnionKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getUnionKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnionArray_EDROOMDataDefinitionUnionElementUnionArrayAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
protected class EDROOMDataDefinitionUnionElementUnionArray_TypeAssignment_2 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementUnionArray_TypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnionArray_UnionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getTypeEDROOMDataDefinitionUnionCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getTypeEDROOMDataDefinitionUnionCrossReference_2_0();
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataDefinitionUnionElementUnionArray_NameAssignment_3 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementUnionArray_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnionArray_TypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "["
protected class EDROOMDataDefinitionUnionElementUnionArray_LeftSquareBracketKeyword_4 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementUnionArray_LeftSquareBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getLeftSquareBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnionArray_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// elements=EInt
protected class EDROOMDataDefinitionUnionElementUnionArray_ElementsAssignment_5 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementUnionArray_ElementsAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getElementsAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnionArray_LeftSquareBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getElementsEIntParserRuleCall_5_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getElementsEIntParserRuleCall_5_0();
			return obj;
		}
		return null;
	}

}

// "]"
protected class EDROOMDataDefinitionUnionElementUnionArray_RightSquareBracketKeyword_6 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementUnionArray_RightSquareBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getRightSquareBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnionArray_ElementsAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMDataDefinitionUnionElementUnionArray_SemicolonKeyword_7 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementUnionArray_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementUnionArrayAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementUnionArray_RightSquareBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataDefinitionUnionElementUnionArray ****************/

/************ begin Rule EDROOMDataDefinitionUnionElementEnum ****************
 *
 * EDROOMDataDefinitionUnionElementEnum:
 * 	{EDROOMDataDefinitionUnionElementEnum} "union" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID
 * 	";";
 *
 **/

// {EDROOMDataDefinitionUnionElementEnum} "union" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID
// ";"
protected class EDROOMDataDefinitionUnionElementEnum_Group extends GroupToken {

	public EDROOMDataDefinitionUnionElementEnum_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnum_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getEDROOMDataDefinitionUnionElementEnumAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataDefinitionUnionElementEnum}
protected class EDROOMDataDefinitionUnionElementEnum_EDROOMDataDefinitionUnionElementEnumAction_0 extends ActionToken  {

	public EDROOMDataDefinitionUnionElementEnum_EDROOMDataDefinitionUnionElementEnumAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getEDROOMDataDefinitionUnionElementEnumAction_0();
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

// "union"
protected class EDROOMDataDefinitionUnionElementEnum_UnionKeyword_1 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementEnum_UnionKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getUnionKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnum_EDROOMDataDefinitionUnionElementEnumAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
protected class EDROOMDataDefinitionUnionElementEnum_TypeAssignment_2 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementEnum_TypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnum_UnionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getTypeEDROOMDataDefinitionEnumCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getTypeEDROOMDataDefinitionEnumCrossReference_2_0();
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataDefinitionUnionElementEnum_NameAssignment_3 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementEnum_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnum_TypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class EDROOMDataDefinitionUnionElementEnum_SemicolonKeyword_4 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementEnum_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnum_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataDefinitionUnionElementEnum ****************/

/************ begin Rule EDROOMDataDefinitionUnionElementEnumArray ****************
 *
 * EDROOMDataDefinitionUnionElementEnumArray:
 * 	{EDROOMDataDefinitionUnionElementEnumArray} "union" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
 * 	name=ID "[" elements=EInt "]" ";";
 *
 **/

// {EDROOMDataDefinitionUnionElementEnumArray} "union" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
// name=ID "[" elements=EInt "]" ";"
protected class EDROOMDataDefinitionUnionElementEnumArray_Group extends GroupToken {

	public EDROOMDataDefinitionUnionElementEnumArray_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnumArray_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getEDROOMDataDefinitionUnionElementEnumArrayAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataDefinitionUnionElementEnumArray}
protected class EDROOMDataDefinitionUnionElementEnumArray_EDROOMDataDefinitionUnionElementEnumArrayAction_0 extends ActionToken  {

	public EDROOMDataDefinitionUnionElementEnumArray_EDROOMDataDefinitionUnionElementEnumArrayAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getEDROOMDataDefinitionUnionElementEnumArrayAction_0();
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

// "union"
protected class EDROOMDataDefinitionUnionElementEnumArray_UnionKeyword_1 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementEnumArray_UnionKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getUnionKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnumArray_EDROOMDataDefinitionUnionElementEnumArrayAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
protected class EDROOMDataDefinitionUnionElementEnumArray_TypeAssignment_2 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementEnumArray_TypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnumArray_UnionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getTypeEDROOMDataDefinitionEnumCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getTypeEDROOMDataDefinitionEnumCrossReference_2_0();
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataDefinitionUnionElementEnumArray_NameAssignment_3 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementEnumArray_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnumArray_TypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "["
protected class EDROOMDataDefinitionUnionElementEnumArray_LeftSquareBracketKeyword_4 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementEnumArray_LeftSquareBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getLeftSquareBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnumArray_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// elements=EInt
protected class EDROOMDataDefinitionUnionElementEnumArray_ElementsAssignment_5 extends AssignmentToken  {

	public EDROOMDataDefinitionUnionElementEnumArray_ElementsAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getElementsAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnumArray_LeftSquareBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getElementsEIntParserRuleCall_5_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getElementsEIntParserRuleCall_5_0();
			return obj;
		}
		return null;
	}

}

// "]"
protected class EDROOMDataDefinitionUnionElementEnumArray_RightSquareBracketKeyword_6 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementEnumArray_RightSquareBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getRightSquareBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnumArray_ElementsAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMDataDefinitionUnionElementEnumArray_SemicolonKeyword_7 extends KeywordToken  {

	public EDROOMDataDefinitionUnionElementEnumArray_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataDefinitionUnionElementEnumArrayAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataDefinitionUnionElementEnumArray_RightSquareBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataDefinitionUnionElementEnumArray ****************/

/************ begin Rule EDROOMDataField ****************
 *
 * EDROOMDataField:
 * 	EDROOMDataFieldBasic | EDROOMDataFieldBasicArray | EDROOMDataFieldClass | EDROOMDataFieldClassArray |
 * 	EDROOMDataFieldUnion | EDROOMDataFieldUnionArray | EDROOMDataFieldEnum | EDROOMDataFieldEnumArray;
 *
 **/

// EDROOMDataFieldBasic | EDROOMDataFieldBasicArray | EDROOMDataFieldClass | EDROOMDataFieldClassArray |
// EDROOMDataFieldUnion | EDROOMDataFieldUnionArray | EDROOMDataFieldEnum | EDROOMDataFieldEnumArray
protected class EDROOMDataField_Alternatives extends AlternativesToken {

	public EDROOMDataField_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataField_EDROOMDataFieldBasicParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMDataField_EDROOMDataFieldBasicArrayParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new EDROOMDataField_EDROOMDataFieldClassParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			case 3: return new EDROOMDataField_EDROOMDataFieldClassArrayParserRuleCall_3(lastRuleCallOrigin, this, 3, inst);
			case 4: return new EDROOMDataField_EDROOMDataFieldUnionParserRuleCall_4(lastRuleCallOrigin, this, 4, inst);
			case 5: return new EDROOMDataField_EDROOMDataFieldUnionArrayParserRuleCall_5(lastRuleCallOrigin, this, 5, inst);
			case 6: return new EDROOMDataField_EDROOMDataFieldEnumParserRuleCall_6(lastRuleCallOrigin, this, 6, inst);
			case 7: return new EDROOMDataField_EDROOMDataFieldEnumArrayParserRuleCall_7(lastRuleCallOrigin, this, 7, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldBasicAccess().getEDROOMDataFieldBasicAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataFieldBasicArrayAccess().getEDROOMDataFieldBasicArrayAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataFieldClassAccess().getEDROOMDataFieldClassAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataFieldClassArrayAccess().getEDROOMDataFieldClassArrayAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataFieldEnumAccess().getEDROOMDataFieldEnumAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataFieldEnumArrayAccess().getEDROOMDataFieldEnumArrayAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataFieldUnionAccess().getEDROOMDataFieldUnionAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMDataFieldUnionArrayAccess().getEDROOMDataFieldUnionArrayAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// EDROOMDataFieldBasic
protected class EDROOMDataField_EDROOMDataFieldBasicParserRuleCall_0 extends RuleCallToken {

	public EDROOMDataField_EDROOMDataFieldBasicParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldBasicParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasic_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldBasicAccess().getEDROOMDataFieldBasicAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataFieldBasic_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataFieldBasicArray
protected class EDROOMDataField_EDROOMDataFieldBasicArrayParserRuleCall_1 extends RuleCallToken {

	public EDROOMDataField_EDROOMDataFieldBasicArrayParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldBasicArrayParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasicArray_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldBasicArrayAccess().getEDROOMDataFieldBasicArrayAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataFieldBasicArray_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataFieldClass
protected class EDROOMDataField_EDROOMDataFieldClassParserRuleCall_2 extends RuleCallToken {

	public EDROOMDataField_EDROOMDataFieldClassParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldClassParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClass_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldClassAccess().getEDROOMDataFieldClassAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataFieldClass_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataFieldClassArray
protected class EDROOMDataField_EDROOMDataFieldClassArrayParserRuleCall_3 extends RuleCallToken {

	public EDROOMDataField_EDROOMDataFieldClassArrayParserRuleCall_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldClassArrayParserRuleCall_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClassArray_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldClassArrayAccess().getEDROOMDataFieldClassArrayAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataFieldClassArray_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataFieldUnion
protected class EDROOMDataField_EDROOMDataFieldUnionParserRuleCall_4 extends RuleCallToken {

	public EDROOMDataField_EDROOMDataFieldUnionParserRuleCall_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldUnionParserRuleCall_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnion_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldUnionAccess().getEDROOMDataFieldUnionAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataFieldUnion_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataFieldUnionArray
protected class EDROOMDataField_EDROOMDataFieldUnionArrayParserRuleCall_5 extends RuleCallToken {

	public EDROOMDataField_EDROOMDataFieldUnionArrayParserRuleCall_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldUnionArrayParserRuleCall_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnionArray_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldUnionArrayAccess().getEDROOMDataFieldUnionArrayAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataFieldUnionArray_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataFieldEnum
protected class EDROOMDataField_EDROOMDataFieldEnumParserRuleCall_6 extends RuleCallToken {

	public EDROOMDataField_EDROOMDataFieldEnumParserRuleCall_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldEnumParserRuleCall_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnum_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldEnumAccess().getEDROOMDataFieldEnumAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataFieldEnum_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMDataFieldEnumArray
protected class EDROOMDataField_EDROOMDataFieldEnumArrayParserRuleCall_7 extends RuleCallToken {

	public EDROOMDataField_EDROOMDataFieldEnumArrayParserRuleCall_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldAccess().getEDROOMDataFieldEnumArrayParserRuleCall_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnumArray_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldEnumArrayAccess().getEDROOMDataFieldEnumArrayAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMDataFieldEnumArray_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

/************ end Rule EDROOMDataField ****************/

/************ begin Rule EDROOMDataFieldBasic ****************
 *
 * EDROOMDataFieldBasic:
 * 	{EDROOMDataFieldBasic} type=EDROOMBasicType name=ID ";";
 *
 **/

// {EDROOMDataFieldBasic} type=EDROOMBasicType name=ID ";"
protected class EDROOMDataFieldBasic_Group extends GroupToken {

	public EDROOMDataFieldBasic_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasic_SemicolonKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldBasicAccess().getEDROOMDataFieldBasicAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataFieldBasic}
protected class EDROOMDataFieldBasic_EDROOMDataFieldBasicAction_0 extends ActionToken  {

	public EDROOMDataFieldBasic_EDROOMDataFieldBasicAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicAccess().getEDROOMDataFieldBasicAction_0();
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

// type=EDROOMBasicType
protected class EDROOMDataFieldBasic_TypeAssignment_1 extends AssignmentToken  {

	public EDROOMDataFieldBasic_TypeAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicAccess().getTypeAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasic_EDROOMDataFieldBasicAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(enumLitSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldBasicAccess().getTypeEDROOMBasicTypeEnumRuleCall_1_0(), value, null)) {
			type = AssignmentType.ENUM_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldBasicAccess().getTypeEDROOMBasicTypeEnumRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataFieldBasic_NameAssignment_2 extends AssignmentToken  {

	public EDROOMDataFieldBasic_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasic_TypeAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldBasicAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldBasicAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class EDROOMDataFieldBasic_SemicolonKeyword_3 extends KeywordToken  {

	public EDROOMDataFieldBasic_SemicolonKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicAccess().getSemicolonKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasic_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataFieldBasic ****************/

/************ begin Rule EDROOMDataFieldBasicArray ****************
 *
 * EDROOMDataFieldBasicArray:
 * 	{EDROOMDataFieldBasicArray} type=EDROOMBasicType name=ID "[" elements=EInt "]" ";";
 *
 **/

// {EDROOMDataFieldBasicArray} type=EDROOMBasicType name=ID "[" elements=EInt "]" ";"
protected class EDROOMDataFieldBasicArray_Group extends GroupToken {

	public EDROOMDataFieldBasicArray_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicArrayAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasicArray_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldBasicArrayAccess().getEDROOMDataFieldBasicArrayAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataFieldBasicArray}
protected class EDROOMDataFieldBasicArray_EDROOMDataFieldBasicArrayAction_0 extends ActionToken  {

	public EDROOMDataFieldBasicArray_EDROOMDataFieldBasicArrayAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicArrayAccess().getEDROOMDataFieldBasicArrayAction_0();
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

// type=EDROOMBasicType
protected class EDROOMDataFieldBasicArray_TypeAssignment_1 extends AssignmentToken  {

	public EDROOMDataFieldBasicArray_TypeAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicArrayAccess().getTypeAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasicArray_EDROOMDataFieldBasicArrayAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(enumLitSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldBasicArrayAccess().getTypeEDROOMBasicTypeEnumRuleCall_1_0(), value, null)) {
			type = AssignmentType.ENUM_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldBasicArrayAccess().getTypeEDROOMBasicTypeEnumRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataFieldBasicArray_NameAssignment_2 extends AssignmentToken  {

	public EDROOMDataFieldBasicArray_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicArrayAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasicArray_TypeAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldBasicArrayAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldBasicArrayAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "["
protected class EDROOMDataFieldBasicArray_LeftSquareBracketKeyword_3 extends KeywordToken  {

	public EDROOMDataFieldBasicArray_LeftSquareBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicArrayAccess().getLeftSquareBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasicArray_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// elements=EInt
protected class EDROOMDataFieldBasicArray_ElementsAssignment_4 extends AssignmentToken  {

	public EDROOMDataFieldBasicArray_ElementsAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicArrayAccess().getElementsAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasicArray_LeftSquareBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldBasicArrayAccess().getElementsEIntParserRuleCall_4_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldBasicArrayAccess().getElementsEIntParserRuleCall_4_0();
			return obj;
		}
		return null;
	}

}

// "]"
protected class EDROOMDataFieldBasicArray_RightSquareBracketKeyword_5 extends KeywordToken  {

	public EDROOMDataFieldBasicArray_RightSquareBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicArrayAccess().getRightSquareBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasicArray_ElementsAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMDataFieldBasicArray_SemicolonKeyword_6 extends KeywordToken  {

	public EDROOMDataFieldBasicArray_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldBasicArrayAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldBasicArray_RightSquareBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataFieldBasicArray ****************/

/************ begin Rule EDROOMDataFieldClass ****************
 *
 * EDROOMDataFieldClass:
 * 	{EDROOMDataFieldClass} type=[EDROOMDataClass|VersionedQualifiedName] name=ID ";";
 *
 **/

// {EDROOMDataFieldClass} type=[EDROOMDataClass|VersionedQualifiedName] name=ID ";"
protected class EDROOMDataFieldClass_Group extends GroupToken {

	public EDROOMDataFieldClass_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClass_SemicolonKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldClassAccess().getEDROOMDataFieldClassAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataFieldClass}
protected class EDROOMDataFieldClass_EDROOMDataFieldClassAction_0 extends ActionToken  {

	public EDROOMDataFieldClass_EDROOMDataFieldClassAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassAccess().getEDROOMDataFieldClassAction_0();
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

// type=[EDROOMDataClass|VersionedQualifiedName]
protected class EDROOMDataFieldClass_TypeAssignment_1 extends AssignmentToken  {

	public EDROOMDataFieldClass_TypeAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassAccess().getTypeAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClass_EDROOMDataFieldClassAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataFieldClassAccess().getTypeEDROOMDataClassCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataFieldClassAccess().getTypeEDROOMDataClassCrossReference_1_0();
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataFieldClass_NameAssignment_2 extends AssignmentToken  {

	public EDROOMDataFieldClass_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClass_TypeAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldClassAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldClassAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class EDROOMDataFieldClass_SemicolonKeyword_3 extends KeywordToken  {

	public EDROOMDataFieldClass_SemicolonKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassAccess().getSemicolonKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClass_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataFieldClass ****************/

/************ begin Rule EDROOMDataFieldClassArray ****************
 *
 * EDROOMDataFieldClassArray:
 * 	{EDROOMDataFieldClassArray} type=[EDROOMDataClass|VersionedQualifiedName] name=ID "[" elements=EInt "]" ";";
 *
 **/

// {EDROOMDataFieldClassArray} type=[EDROOMDataClass|VersionedQualifiedName] name=ID "[" elements=EInt "]" ";"
protected class EDROOMDataFieldClassArray_Group extends GroupToken {

	public EDROOMDataFieldClassArray_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassArrayAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClassArray_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldClassArrayAccess().getEDROOMDataFieldClassArrayAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataFieldClassArray}
protected class EDROOMDataFieldClassArray_EDROOMDataFieldClassArrayAction_0 extends ActionToken  {

	public EDROOMDataFieldClassArray_EDROOMDataFieldClassArrayAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassArrayAccess().getEDROOMDataFieldClassArrayAction_0();
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

// type=[EDROOMDataClass|VersionedQualifiedName]
protected class EDROOMDataFieldClassArray_TypeAssignment_1 extends AssignmentToken  {

	public EDROOMDataFieldClassArray_TypeAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassArrayAccess().getTypeAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClassArray_EDROOMDataFieldClassArrayAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataFieldClassArrayAccess().getTypeEDROOMDataClassCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataFieldClassArrayAccess().getTypeEDROOMDataClassCrossReference_1_0();
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataFieldClassArray_NameAssignment_2 extends AssignmentToken  {

	public EDROOMDataFieldClassArray_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassArrayAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClassArray_TypeAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldClassArrayAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldClassArrayAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "["
protected class EDROOMDataFieldClassArray_LeftSquareBracketKeyword_3 extends KeywordToken  {

	public EDROOMDataFieldClassArray_LeftSquareBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassArrayAccess().getLeftSquareBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClassArray_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// elements=EInt
protected class EDROOMDataFieldClassArray_ElementsAssignment_4 extends AssignmentToken  {

	public EDROOMDataFieldClassArray_ElementsAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassArrayAccess().getElementsAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClassArray_LeftSquareBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldClassArrayAccess().getElementsEIntParserRuleCall_4_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldClassArrayAccess().getElementsEIntParserRuleCall_4_0();
			return obj;
		}
		return null;
	}

}

// "]"
protected class EDROOMDataFieldClassArray_RightSquareBracketKeyword_5 extends KeywordToken  {

	public EDROOMDataFieldClassArray_RightSquareBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassArrayAccess().getRightSquareBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClassArray_ElementsAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMDataFieldClassArray_SemicolonKeyword_6 extends KeywordToken  {

	public EDROOMDataFieldClassArray_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldClassArrayAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldClassArray_RightSquareBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataFieldClassArray ****************/

/************ begin Rule EDROOMDataFieldUnion ****************
 *
 * EDROOMDataFieldUnion:
 * 	{EDROOMDataFieldUnion} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName] name=ID ";";
 *
 **/

// {EDROOMDataFieldUnion} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName] name=ID ";"
protected class EDROOMDataFieldUnion_Group extends GroupToken {

	public EDROOMDataFieldUnion_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnion_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldUnionAccess().getEDROOMDataFieldUnionAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataFieldUnion}
protected class EDROOMDataFieldUnion_EDROOMDataFieldUnionAction_0 extends ActionToken  {

	public EDROOMDataFieldUnion_EDROOMDataFieldUnionAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionAccess().getEDROOMDataFieldUnionAction_0();
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

// "union"
protected class EDROOMDataFieldUnion_UnionKeyword_1 extends KeywordToken  {

	public EDROOMDataFieldUnion_UnionKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionAccess().getUnionKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnion_EDROOMDataFieldUnionAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
protected class EDROOMDataFieldUnion_TypeAssignment_2 extends AssignmentToken  {

	public EDROOMDataFieldUnion_TypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnion_UnionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataFieldUnionAccess().getTypeEDROOMDataDefinitionUnionCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataFieldUnionAccess().getTypeEDROOMDataDefinitionUnionCrossReference_2_0();
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataFieldUnion_NameAssignment_3 extends AssignmentToken  {

	public EDROOMDataFieldUnion_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnion_TypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldUnionAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldUnionAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class EDROOMDataFieldUnion_SemicolonKeyword_4 extends KeywordToken  {

	public EDROOMDataFieldUnion_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnion_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataFieldUnion ****************/

/************ begin Rule EDROOMDataFieldUnionArray ****************
 *
 * EDROOMDataFieldUnionArray:
 * 	{EDROOMDataFieldUnionArray} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName] name=ID "["
 * 	elements=EInt "]" ";";
 *
 **/

// {EDROOMDataFieldUnionArray} "union" type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName] name=ID "["
// elements=EInt "]" ";"
protected class EDROOMDataFieldUnionArray_Group extends GroupToken {

	public EDROOMDataFieldUnionArray_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionArrayAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnionArray_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldUnionArrayAccess().getEDROOMDataFieldUnionArrayAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataFieldUnionArray}
protected class EDROOMDataFieldUnionArray_EDROOMDataFieldUnionArrayAction_0 extends ActionToken  {

	public EDROOMDataFieldUnionArray_EDROOMDataFieldUnionArrayAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionArrayAccess().getEDROOMDataFieldUnionArrayAction_0();
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

// "union"
protected class EDROOMDataFieldUnionArray_UnionKeyword_1 extends KeywordToken  {

	public EDROOMDataFieldUnionArray_UnionKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionArrayAccess().getUnionKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnionArray_EDROOMDataFieldUnionArrayAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// type=[EDROOMDataDefinitionUnion|VersionedQualifiedReferenceName]
protected class EDROOMDataFieldUnionArray_TypeAssignment_2 extends AssignmentToken  {

	public EDROOMDataFieldUnionArray_TypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionArrayAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnionArray_UnionKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataFieldUnionArrayAccess().getTypeEDROOMDataDefinitionUnionCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataFieldUnionArrayAccess().getTypeEDROOMDataDefinitionUnionCrossReference_2_0();
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataFieldUnionArray_NameAssignment_3 extends AssignmentToken  {

	public EDROOMDataFieldUnionArray_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionArrayAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnionArray_TypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldUnionArrayAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldUnionArrayAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "["
protected class EDROOMDataFieldUnionArray_LeftSquareBracketKeyword_4 extends KeywordToken  {

	public EDROOMDataFieldUnionArray_LeftSquareBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionArrayAccess().getLeftSquareBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnionArray_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// elements=EInt
protected class EDROOMDataFieldUnionArray_ElementsAssignment_5 extends AssignmentToken  {

	public EDROOMDataFieldUnionArray_ElementsAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionArrayAccess().getElementsAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnionArray_LeftSquareBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldUnionArrayAccess().getElementsEIntParserRuleCall_5_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldUnionArrayAccess().getElementsEIntParserRuleCall_5_0();
			return obj;
		}
		return null;
	}

}

// "]"
protected class EDROOMDataFieldUnionArray_RightSquareBracketKeyword_6 extends KeywordToken  {

	public EDROOMDataFieldUnionArray_RightSquareBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionArrayAccess().getRightSquareBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnionArray_ElementsAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMDataFieldUnionArray_SemicolonKeyword_7 extends KeywordToken  {

	public EDROOMDataFieldUnionArray_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldUnionArrayAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldUnionArray_RightSquareBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataFieldUnionArray ****************/

/************ begin Rule EDROOMDataFieldEnum ****************
 *
 * EDROOMDataFieldEnum:
 * 	{EDROOMDataFieldEnum} "enum" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID ";";
 *
 **/

// {EDROOMDataFieldEnum} "enum" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID ";"
protected class EDROOMDataFieldEnum_Group extends GroupToken {

	public EDROOMDataFieldEnum_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnum_SemicolonKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldEnumAccess().getEDROOMDataFieldEnumAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataFieldEnum}
protected class EDROOMDataFieldEnum_EDROOMDataFieldEnumAction_0 extends ActionToken  {

	public EDROOMDataFieldEnum_EDROOMDataFieldEnumAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumAccess().getEDROOMDataFieldEnumAction_0();
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
protected class EDROOMDataFieldEnum_EnumKeyword_1 extends KeywordToken  {

	public EDROOMDataFieldEnum_EnumKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumAccess().getEnumKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnum_EDROOMDataFieldEnumAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
protected class EDROOMDataFieldEnum_TypeAssignment_2 extends AssignmentToken  {

	public EDROOMDataFieldEnum_TypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnum_EnumKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataFieldEnumAccess().getTypeEDROOMDataDefinitionEnumCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataFieldEnumAccess().getTypeEDROOMDataDefinitionEnumCrossReference_2_0();
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataFieldEnum_NameAssignment_3 extends AssignmentToken  {

	public EDROOMDataFieldEnum_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnum_TypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldEnumAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldEnumAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class EDROOMDataFieldEnum_SemicolonKeyword_4 extends KeywordToken  {

	public EDROOMDataFieldEnum_SemicolonKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumAccess().getSemicolonKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnum_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataFieldEnum ****************/

/************ begin Rule EDROOMDataFieldEnumArray ****************
 *
 * EDROOMDataFieldEnumArray:
 * 	{EDROOMDataFieldEnumArray} "enum" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID "["
 * 	elements=EInt "]" ";";
 *
 **/

// {EDROOMDataFieldEnumArray} "enum" type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName] name=ID "["
// elements=EInt "]" ";"
protected class EDROOMDataFieldEnumArray_Group extends GroupToken {

	public EDROOMDataFieldEnumArray_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumArrayAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnumArray_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMDataFieldEnumArrayAccess().getEDROOMDataFieldEnumArrayAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMDataFieldEnumArray}
protected class EDROOMDataFieldEnumArray_EDROOMDataFieldEnumArrayAction_0 extends ActionToken  {

	public EDROOMDataFieldEnumArray_EDROOMDataFieldEnumArrayAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumArrayAccess().getEDROOMDataFieldEnumArrayAction_0();
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
protected class EDROOMDataFieldEnumArray_EnumKeyword_1 extends KeywordToken  {

	public EDROOMDataFieldEnumArray_EnumKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumArrayAccess().getEnumKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnumArray_EDROOMDataFieldEnumArrayAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// type=[EDROOMDataDefinitionEnum|VersionedQualifiedReferenceName]
protected class EDROOMDataFieldEnumArray_TypeAssignment_2 extends AssignmentToken  {

	public EDROOMDataFieldEnumArray_TypeAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumArrayAccess().getTypeAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnumArray_EnumKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMDataFieldEnumArrayAccess().getTypeEDROOMDataDefinitionEnumCrossReference_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMDataFieldEnumArrayAccess().getTypeEDROOMDataDefinitionEnumCrossReference_2_0();
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class EDROOMDataFieldEnumArray_NameAssignment_3 extends AssignmentToken  {

	public EDROOMDataFieldEnumArray_NameAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumArrayAccess().getNameAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnumArray_TypeAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldEnumArrayAccess().getNameIDTerminalRuleCall_3_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldEnumArrayAccess().getNameIDTerminalRuleCall_3_0();
			return obj;
		}
		return null;
	}

}

// "["
protected class EDROOMDataFieldEnumArray_LeftSquareBracketKeyword_4 extends KeywordToken  {

	public EDROOMDataFieldEnumArray_LeftSquareBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumArrayAccess().getLeftSquareBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnumArray_NameAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// elements=EInt
protected class EDROOMDataFieldEnumArray_ElementsAssignment_5 extends AssignmentToken  {

	public EDROOMDataFieldEnumArray_ElementsAssignment_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumArrayAccess().getElementsAssignment_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnumArray_LeftSquareBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("elements",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("elements");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMDataFieldEnumArrayAccess().getElementsEIntParserRuleCall_5_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getEDROOMDataFieldEnumArrayAccess().getElementsEIntParserRuleCall_5_0();
			return obj;
		}
		return null;
	}

}

// "]"
protected class EDROOMDataFieldEnumArray_RightSquareBracketKeyword_6 extends KeywordToken  {

	public EDROOMDataFieldEnumArray_RightSquareBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumArrayAccess().getRightSquareBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnumArray_ElementsAssignment_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMDataFieldEnumArray_SemicolonKeyword_7 extends KeywordToken  {

	public EDROOMDataFieldEnumArray_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMDataFieldEnumArrayAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMDataFieldEnumArray_RightSquareBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMDataFieldEnumArray ****************/

}
