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

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;

import es.uah.aut.srg.micobs.mclev.domain.edroom.lang.services.PROTGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class PROTParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {

	@Inject
	private PROTGrammarAccess grammarAccess;

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
			case 0: return new EDROOMPROTPackageFile_Group(this, this, 0, inst);
			case 1: return new EDROOMPROTPackageElement_EDROOMProtocolParserRuleCall(this, this, 1, inst);
			case 2: return new EDROOMProtocol_Group(this, this, 2, inst);
			case 3: return new EDROOMMessage_Alternatives(this, this, 3, inst);
			case 4: return new EDROOMSendMessage_Group(this, this, 4, inst);
			case 5: return new EDROOMInvokeMessage_Group(this, this, 5, inst);
			case 6: return new EDROOMReplyMessage_Group(this, this, 6, inst);
			default: return null;
		}
	}
}


/************ begin Rule EDROOMPROTPackageFile ****************
 *
 * EDROOMPROTPackageFile:
 * 	"package" package=[edroomlibrary::EDROOMPackage|QualifiedName] ";" ("import"
 * 	imports+=[common::MCommonPackage|QualifiedName] ";")* element=EDROOMPROTPackageElement;
 *
 **/

// "package" package=[edroomlibrary::EDROOMPackage|QualifiedName] ";" ("import"
// imports+=[common::MCommonPackage|QualifiedName] ";")* element=EDROOMPROTPackageElement
protected class EDROOMPROTPackageFile_Group extends GroupToken {

	public EDROOMPROTPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMPROTPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMPROTPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMPROTPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "package"
protected class EDROOMPROTPackageFile_PackageKeyword_0 extends KeywordToken  {

	public EDROOMPROTPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMPROTPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}
	}

}

// package=[edroomlibrary::EDROOMPackage|QualifiedName]
protected class EDROOMPROTPackageFile_PackageAssignment_1 extends AssignmentToken  {

	public EDROOMPROTPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMPROTPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMPROTPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMPROTPackageFileAccess().getPackageEDROOMPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMPROTPackageFileAccess().getPackageEDROOMPackageCrossReference_1_0();
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class EDROOMPROTPackageFile_SemicolonKeyword_2 extends KeywordToken  {

	public EDROOMPROTPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMPROTPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMPROTPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ("import" imports+=[common::MCommonPackage|QualifiedName] ";")*
protected class EDROOMPROTPackageFile_Group_3 extends GroupToken {

	public EDROOMPROTPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMPROTPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMPROTPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "import"
protected class EDROOMPROTPackageFile_ImportKeyword_3_0 extends KeywordToken  {

	public EDROOMPROTPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMPROTPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMPROTPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMPROTPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// imports+=[common::MCommonPackage|QualifiedName]
protected class EDROOMPROTPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {

	public EDROOMPROTPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMPROTPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMPROTPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMPROTPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMPROTPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0();
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class EDROOMPROTPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {

	public EDROOMPROTPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMPROTPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMPROTPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// element=EDROOMPROTPackageElement
protected class EDROOMPROTPackageFile_ElementAssignment_4 extends AssignmentToken  {

	public EDROOMPROTPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMPROTPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMPROTPackageElement_EDROOMProtocolParserRuleCall(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMPROTPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEDROOMPROTPackageFileAccess().getElementEDROOMPROTPackageElementParserRuleCall_4_0();
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EDROOMPROTPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new EDROOMPROTPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}
	}
}

/************ end Rule EDROOMPROTPackageFile ****************/

/************ begin Rule EDROOMPROTPackageElement ****************
 *
 * EDROOMPROTPackageElement:
 * 	EDROOMProtocol;
 *
 **/

// EDROOMProtocol
protected class EDROOMPROTPackageElement_EDROOMProtocolParserRuleCall extends RuleCallToken {

	public EDROOMPROTPackageElement_EDROOMProtocolParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMPROTPackageElementAccess().getEDROOMProtocolParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMProtocolAccess().getEDROOMProtocolAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMProtocol_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

/************ end Rule EDROOMPROTPackageElement ****************/

/************ begin Rule EDROOMProtocol ****************
 *
 * EDROOMProtocol:
 * 	{EDROOMProtocol} "protocol" name=ID ("extends" extends+=[EDROOMProtocol|VersionedQualifiedName] (","
 * 	extends+=[EDROOMProtocol|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "interface" ":="
 * 	referencedElement=[mcleviface::MInterface|VersionedQualifiedName] ";" & ("input" "messages" "{"
 * 	inputMessages+=EDROOMMessage+ "}" ";")? & ("output" "messages" "{" outputMessages+=EDROOMMessage+ "}" ";")?) "}" ";";
 *
 **/

// {EDROOMProtocol} "protocol" name=ID ("extends" extends+=[EDROOMProtocol|VersionedQualifiedName] (","
// extends+=[EDROOMProtocol|VersionedQualifiedName])*)? "{" ("version" ":=" version=Version ";" & "interface" ":="
// referencedElement=[mcleviface::MInterface|VersionedQualifiedName] ";" & ("input" "messages" "{"
// inputMessages+=EDROOMMessage+ "}" ";")? & ("output" "messages" "{" outputMessages+=EDROOMMessage+ "}" ";")?) "}" ";"
protected class EDROOMProtocol_Group extends GroupToken {

	public EDROOMProtocol_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMProtocolAccess().getEDROOMProtocolAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMProtocol}
protected class EDROOMProtocol_EDROOMProtocolAction_0 extends ActionToken  {

	public EDROOMProtocol_EDROOMProtocolAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getEDROOMProtocolAction_0();
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

// "protocol"
protected class EDROOMProtocol_ProtocolKeyword_1 extends KeywordToken  {

	public EDROOMProtocol_ProtocolKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getProtocolKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_EDROOMProtocolAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// name=ID
protected class EDROOMProtocol_NameAssignment_2 extends AssignmentToken  {

	public EDROOMProtocol_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_ProtocolKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMProtocolAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMProtocolAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ("extends" extends+=[EDROOMProtocol|VersionedQualifiedName] ("," extends+=[EDROOMProtocol|VersionedQualifiedName])*)?
protected class EDROOMProtocol_Group_3 extends GroupToken {

	public EDROOMProtocol_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMProtocol_ExtendsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// "extends"
protected class EDROOMProtocol_ExtendsKeyword_3_0 extends KeywordToken  {

	public EDROOMProtocol_ExtendsKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getExtendsKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// extends+=[EDROOMProtocol|VersionedQualifiedName]
protected class EDROOMProtocol_ExtendsAssignment_3_1 extends AssignmentToken  {

	public EDROOMProtocol_ExtendsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getExtendsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_ExtendsKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolCrossReference_3_1_0();
				return obj;
			}
		}
		return null;
	}

}

// ("," extends+=[EDROOMProtocol|VersionedQualifiedName])*
protected class EDROOMProtocol_Group_3_2 extends GroupToken {

	public EDROOMProtocol_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_ExtendsAssignment_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ","
protected class EDROOMProtocol_CommaKeyword_3_2_0 extends KeywordToken  {

	public EDROOMProtocol_CommaKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getCommaKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMProtocol_ExtendsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// extends+=[EDROOMProtocol|VersionedQualifiedName]
protected class EDROOMProtocol_ExtendsAssignment_3_2_1 extends AssignmentToken  {

	public EDROOMProtocol_ExtendsAssignment_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getExtendsAssignment_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_CommaKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolCrossReference_3_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMProtocolAccess().getExtendsEDROOMProtocolCrossReference_3_2_1_0();
				return obj;
			}
		}
		return null;
	}

}

// "{"
protected class EDROOMProtocol_LeftCurlyBracketKeyword_4 extends KeywordToken  {

	public EDROOMProtocol_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMProtocol_NameAssignment_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// "version" ":=" version=Version ";" & "interface" ":=" referencedElement=[mcleviface::MInterface|VersionedQualifiedName]
// ";" & ("input" "messages" "{" inputMessages+=EDROOMMessage+ "}" ";")? & ("output" "messages" "{"
// outputMessages+=EDROOMMessage+ "}" ";")?
protected class EDROOMProtocol_UnorderedGroup_5 extends UnorderedGroupToken {

	public EDROOMProtocol_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_Group_5_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMProtocol_Group_5_2(lastRuleCallOrigin, this, 1, inst);
			case 2: return new EDROOMProtocol_Group_5_1(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}
	}

}

// "version" ":=" version=Version ";"
protected class EDROOMProtocol_Group_5_0 extends GroupToken {

	public EDROOMProtocol_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "version"
protected class EDROOMProtocol_VersionKeyword_5_0_0 extends KeywordToken  {

	public EDROOMProtocol_VersionKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getVersionKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ":="
protected class EDROOMProtocol_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {

	public EDROOMProtocol_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_VersionKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// version=Version
protected class EDROOMProtocol_VersionAssignment_5_0_2 extends AssignmentToken  {

	public EDROOMProtocol_VersionAssignment_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getVersionAssignment_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMProtocolAccess().getVersionVersionParserRuleCall_5_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getEDROOMProtocolAccess().getVersionVersionParserRuleCall_5_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class EDROOMProtocol_SemicolonKeyword_5_0_3 extends KeywordToken  {

	public EDROOMProtocol_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_VersionAssignment_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "interface" ":=" referencedElement=[mcleviface::MInterface|VersionedQualifiedName] ";"
protected class EDROOMProtocol_Group_5_1 extends GroupToken {

	public EDROOMProtocol_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_SemicolonKeyword_5_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "interface"
protected class EDROOMProtocol_InterfaceKeyword_5_1_0 extends KeywordToken  {

	public EDROOMProtocol_InterfaceKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getInterfaceKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ":="
protected class EDROOMProtocol_ColonEqualsSignKeyword_5_1_1 extends KeywordToken  {

	public EDROOMProtocol_ColonEqualsSignKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getColonEqualsSignKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_InterfaceKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// referencedElement=[mcleviface::MInterface|VersionedQualifiedName]
protected class EDROOMProtocol_ReferencedElementAssignment_5_1_2 extends AssignmentToken  {

	public EDROOMProtocol_ReferencedElementAssignment_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getReferencedElementAssignment_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_ColonEqualsSignKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("referencedElement",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("referencedElement");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMProtocolAccess().getReferencedElementMInterfaceCrossReference_5_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMProtocolAccess().getReferencedElementMInterfaceCrossReference_5_1_2_0();
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class EDROOMProtocol_SemicolonKeyword_5_1_3 extends KeywordToken  {

	public EDROOMProtocol_SemicolonKeyword_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_ReferencedElementAssignment_5_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ("input" "messages" "{" inputMessages+=EDROOMMessage+ "}" ";")?
protected class EDROOMProtocol_Group_5_2 extends GroupToken {

	public EDROOMProtocol_Group_5_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getGroup_5_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_SemicolonKeyword_5_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "input"
protected class EDROOMProtocol_InputKeyword_5_2_0 extends KeywordToken  {

	public EDROOMProtocol_InputKeyword_5_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getInputKeyword_5_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "messages"
protected class EDROOMProtocol_MessagesKeyword_5_2_1 extends KeywordToken  {

	public EDROOMProtocol_MessagesKeyword_5_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getMessagesKeyword_5_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_InputKeyword_5_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "{"
protected class EDROOMProtocol_LeftCurlyBracketKeyword_5_2_2 extends KeywordToken  {

	public EDROOMProtocol_LeftCurlyBracketKeyword_5_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_5_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_MessagesKeyword_5_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// inputMessages+=EDROOMMessage+
protected class EDROOMProtocol_InputMessagesAssignment_5_2_3 extends AssignmentToken  {

	public EDROOMProtocol_InputMessagesAssignment_5_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getInputMessagesAssignment_5_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMMessage_Alternatives(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("inputMessages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("inputMessages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMMessageRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEDROOMProtocolAccess().getInputMessagesEDROOMMessageParserRuleCall_5_2_3_0();
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EDROOMProtocol_InputMessagesAssignment_5_2_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new EDROOMProtocol_LeftCurlyBracketKeyword_5_2_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}
	}
}

// "}"
protected class EDROOMProtocol_RightCurlyBracketKeyword_5_2_4 extends KeywordToken  {

	public EDROOMProtocol_RightCurlyBracketKeyword_5_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_5_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_InputMessagesAssignment_5_2_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMProtocol_SemicolonKeyword_5_2_5 extends KeywordToken  {

	public EDROOMProtocol_SemicolonKeyword_5_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_RightCurlyBracketKeyword_5_2_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ("output" "messages" "{" outputMessages+=EDROOMMessage+ "}" ";")?
protected class EDROOMProtocol_Group_5_3 extends GroupToken {

	public EDROOMProtocol_Group_5_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getGroup_5_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_SemicolonKeyword_5_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "output"
protected class EDROOMProtocol_OutputKeyword_5_3_0 extends KeywordToken  {

	public EDROOMProtocol_OutputKeyword_5_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getOutputKeyword_5_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_Group_5_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMProtocol_Group_5_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// "messages"
protected class EDROOMProtocol_MessagesKeyword_5_3_1 extends KeywordToken  {

	public EDROOMProtocol_MessagesKeyword_5_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getMessagesKeyword_5_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_OutputKeyword_5_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "{"
protected class EDROOMProtocol_LeftCurlyBracketKeyword_5_3_2 extends KeywordToken  {

	public EDROOMProtocol_LeftCurlyBracketKeyword_5_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getLeftCurlyBracketKeyword_5_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_MessagesKeyword_5_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// outputMessages+=EDROOMMessage+
protected class EDROOMProtocol_OutputMessagesAssignment_5_3_3 extends AssignmentToken  {

	public EDROOMProtocol_OutputMessagesAssignment_5_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getOutputMessagesAssignment_5_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMMessage_Alternatives(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("outputMessages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("outputMessages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMMessageRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getEDROOMProtocolAccess().getOutputMessagesEDROOMMessageParserRuleCall_5_3_3_0();
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new EDROOMProtocol_OutputMessagesAssignment_5_3_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new EDROOMProtocol_LeftCurlyBracketKeyword_5_3_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}
	}
}

// "}"
protected class EDROOMProtocol_RightCurlyBracketKeyword_5_3_4 extends KeywordToken  {

	public EDROOMProtocol_RightCurlyBracketKeyword_5_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_5_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_OutputMessagesAssignment_5_3_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMProtocol_SemicolonKeyword_5_3_5 extends KeywordToken  {

	public EDROOMProtocol_SemicolonKeyword_5_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_5_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_RightCurlyBracketKeyword_5_3_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// "}"
protected class EDROOMProtocol_RightCurlyBracketKeyword_6 extends KeywordToken  {

	public EDROOMProtocol_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMProtocol_SemicolonKeyword_7 extends KeywordToken  {

	public EDROOMProtocol_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMProtocolAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMProtocol_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMProtocol ****************/

/************ begin Rule EDROOMMessage ****************
 *
 * EDROOMMessage:
 * 	EDROOMSendMessage | EDROOMInvokeMessage | EDROOMReplyMessage;
 *
 **/

// EDROOMSendMessage | EDROOMInvokeMessage | EDROOMReplyMessage
protected class EDROOMMessage_Alternatives extends AlternativesToken {

	public EDROOMMessage_Alternatives(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Alternatives getGrammarElement() {
		return grammarAccess.getEDROOMMessageAccess().getAlternatives();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMMessage_EDROOMSendMessageParserRuleCall_0(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMMessage_EDROOMInvokeMessageParserRuleCall_1(lastRuleCallOrigin, this, 1, inst);
			case 2: return new EDROOMMessage_EDROOMReplyMessageParserRuleCall_2(lastRuleCallOrigin, this, 2, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMInvokeMessageAccess().getEDROOMInvokeMessageAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMReplyMessageAccess().getEDROOMReplyMessageAction_0().getType().getClassifier() &&
		   getEObject().eClass() != grammarAccess.getEDROOMSendMessageAccess().getEDROOMSendMessageAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// EDROOMSendMessage
protected class EDROOMMessage_EDROOMSendMessageParserRuleCall_0 extends RuleCallToken {

	public EDROOMMessage_EDROOMSendMessageParserRuleCall_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMMessageAccess().getEDROOMSendMessageParserRuleCall_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMSendMessage_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMSendMessageAccess().getEDROOMSendMessageAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMSendMessage_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMInvokeMessage
protected class EDROOMMessage_EDROOMInvokeMessageParserRuleCall_1 extends RuleCallToken {

	public EDROOMMessage_EDROOMInvokeMessageParserRuleCall_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMMessageAccess().getEDROOMInvokeMessageParserRuleCall_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMInvokeMessageAccess().getEDROOMInvokeMessageAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMInvokeMessage_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

// EDROOMReplyMessage
protected class EDROOMMessage_EDROOMReplyMessageParserRuleCall_2 extends RuleCallToken {

	public EDROOMMessage_EDROOMReplyMessageParserRuleCall_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getEDROOMMessageAccess().getEDROOMReplyMessageParserRuleCall_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMReplyMessage_Group(this, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMReplyMessageAccess().getEDROOMReplyMessageAction_0().getType().getClassifier())
			return null;
		if(checkForRecursion(EDROOMReplyMessage_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}
	}
}

/************ end Rule EDROOMMessage ****************/

/************ begin Rule EDROOMSendMessage ****************
 *
 * EDROOMSendMessage:
 * 	{EDROOMSendMessage} "send" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")" ";";
 *
 **/

// {EDROOMSendMessage} "send" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")" ";"
protected class EDROOMSendMessage_Group extends GroupToken {

	public EDROOMSendMessage_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMSendMessageAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMSendMessage_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMSendMessageAccess().getEDROOMSendMessageAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMSendMessage}
protected class EDROOMSendMessage_EDROOMSendMessageAction_0 extends ActionToken  {

	public EDROOMSendMessage_EDROOMSendMessageAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMSendMessageAccess().getEDROOMSendMessageAction_0();
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

// "send"
protected class EDROOMSendMessage_SendKeyword_1 extends KeywordToken  {

	public EDROOMSendMessage_SendKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMSendMessageAccess().getSendKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMSendMessage_EDROOMSendMessageAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// name=ID
protected class EDROOMSendMessage_NameAssignment_2 extends AssignmentToken  {

	public EDROOMSendMessage_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMSendMessageAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMSendMessage_SendKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMSendMessageAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMSendMessageAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "("
protected class EDROOMSendMessage_LeftParenthesisKeyword_3 extends KeywordToken  {

	public EDROOMSendMessage_LeftParenthesisKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMSendMessageAccess().getLeftParenthesisKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMSendMessage_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]?
protected class EDROOMSendMessage_DataClassAssignment_4 extends AssignmentToken  {

	public EDROOMSendMessage_DataClassAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMSendMessageAccess().getDataClassAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMSendMessage_LeftParenthesisKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("dataClass",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("dataClass");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMSendMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMSendMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0();
				return obj;
			}
		}
		return null;
	}

}

// ")"
protected class EDROOMSendMessage_RightParenthesisKeyword_5 extends KeywordToken  {

	public EDROOMSendMessage_RightParenthesisKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMSendMessageAccess().getRightParenthesisKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMSendMessage_DataClassAssignment_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMSendMessage_LeftParenthesisKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMSendMessage_SemicolonKeyword_6 extends KeywordToken  {

	public EDROOMSendMessage_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMSendMessageAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMSendMessage_RightParenthesisKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMSendMessage ****************/

/************ begin Rule EDROOMInvokeMessage ****************
 *
 * EDROOMInvokeMessage:
 * 	{EDROOMInvokeMessage} "invoke" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")"
 * 	"replies" replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName] (","
 * 	replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName])* ";";
 *
 **/

// {EDROOMInvokeMessage} "invoke" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")"
// "replies" replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName] (","
// replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName])* ";"
protected class EDROOMInvokeMessage_Group extends GroupToken {

	public EDROOMInvokeMessage_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_SemicolonKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMInvokeMessageAccess().getEDROOMInvokeMessageAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMInvokeMessage}
protected class EDROOMInvokeMessage_EDROOMInvokeMessageAction_0 extends ActionToken  {

	public EDROOMInvokeMessage_EDROOMInvokeMessageAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getEDROOMInvokeMessageAction_0();
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

// "invoke"
protected class EDROOMInvokeMessage_InvokeKeyword_1 extends KeywordToken  {

	public EDROOMInvokeMessage_InvokeKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getInvokeKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_EDROOMInvokeMessageAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// name=ID
protected class EDROOMInvokeMessage_NameAssignment_2 extends AssignmentToken  {

	public EDROOMInvokeMessage_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_InvokeKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMInvokeMessageAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMInvokeMessageAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "("
protected class EDROOMInvokeMessage_LeftParenthesisKeyword_3 extends KeywordToken  {

	public EDROOMInvokeMessage_LeftParenthesisKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getLeftParenthesisKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]?
protected class EDROOMInvokeMessage_DataClassAssignment_4 extends AssignmentToken  {

	public EDROOMInvokeMessage_DataClassAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getDataClassAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_LeftParenthesisKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("dataClass",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("dataClass");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMInvokeMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMInvokeMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0();
				return obj;
			}
		}
		return null;
	}

}

// ")"
protected class EDROOMInvokeMessage_RightParenthesisKeyword_5 extends KeywordToken  {

	public EDROOMInvokeMessage_RightParenthesisKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getRightParenthesisKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_DataClassAssignment_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMInvokeMessage_LeftParenthesisKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// "replies"
protected class EDROOMInvokeMessage_RepliesKeyword_6 extends KeywordToken  {

	public EDROOMInvokeMessage_RepliesKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getRepliesKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_RightParenthesisKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName]
protected class EDROOMInvokeMessage_RepliesAssignment_7 extends AssignmentToken  {

	public EDROOMInvokeMessage_RepliesAssignment_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getRepliesAssignment_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_RepliesKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("replies",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("replies");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageCrossReference_7_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageCrossReference_7_0();
				return obj;
			}
		}
		return null;
	}

}

// ("," replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName])*
protected class EDROOMInvokeMessage_Group_8 extends GroupToken {

	public EDROOMInvokeMessage_Group_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getGroup_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_RepliesAssignment_8_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// ","
protected class EDROOMInvokeMessage_CommaKeyword_8_0 extends KeywordToken  {

	public EDROOMInvokeMessage_CommaKeyword_8_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getCommaKeyword_8_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_Group_8(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMInvokeMessage_RepliesAssignment_7(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// replies+=[EDROOMReplyMessage|VersionedQualifiedReferenceName]
protected class EDROOMInvokeMessage_RepliesAssignment_8_1 extends AssignmentToken  {

	public EDROOMInvokeMessage_RepliesAssignment_8_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getRepliesAssignment_8_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_CommaKeyword_8_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("replies",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("replies");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageCrossReference_8_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMInvokeMessageAccess().getRepliesEDROOMReplyMessageCrossReference_8_1_0();
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class EDROOMInvokeMessage_SemicolonKeyword_9 extends KeywordToken  {

	public EDROOMInvokeMessage_SemicolonKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMInvokeMessageAccess().getSemicolonKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMInvokeMessage_Group_8(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMInvokeMessage_RepliesAssignment_7(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMInvokeMessage ****************/

/************ begin Rule EDROOMReplyMessage ****************
 *
 * EDROOMReplyMessage:
 * 	{EDROOMReplyMessage} "reply" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")" ";";
 *
 **/

// {EDROOMReplyMessage} "reply" name=ID "(" dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]? ")" ";"
protected class EDROOMReplyMessage_Group extends GroupToken {

	public EDROOMReplyMessage_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Group getGrammarElement() {
		return grammarAccess.getEDROOMReplyMessageAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMReplyMessage_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getEDROOMReplyMessageAccess().getEDROOMReplyMessageAction_0().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// {EDROOMReplyMessage}
protected class EDROOMReplyMessage_EDROOMReplyMessageAction_0 extends ActionToken  {

	public EDROOMReplyMessage_EDROOMReplyMessageAction_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Action getGrammarElement() {
		return grammarAccess.getEDROOMReplyMessageAccess().getEDROOMReplyMessageAction_0();
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

// "reply"
protected class EDROOMReplyMessage_ReplyKeyword_1 extends KeywordToken  {

	public EDROOMReplyMessage_ReplyKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMReplyMessageAccess().getReplyKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMReplyMessage_EDROOMReplyMessageAction_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// name=ID
protected class EDROOMReplyMessage_NameAssignment_2 extends AssignmentToken  {

	public EDROOMReplyMessage_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMReplyMessageAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMReplyMessage_ReplyKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getEDROOMReplyMessageAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getEDROOMReplyMessageAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// "("
protected class EDROOMReplyMessage_LeftParenthesisKeyword_3 extends KeywordToken  {

	public EDROOMReplyMessage_LeftParenthesisKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMReplyMessageAccess().getLeftParenthesisKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMReplyMessage_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

// dataClass=[edroomdclass::EDROOMDataClass|VersionedQualifiedName]?
protected class EDROOMReplyMessage_DataClassAssignment_4 extends AssignmentToken  {

	public EDROOMReplyMessage_DataClassAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getEDROOMReplyMessageAccess().getDataClassAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMReplyMessage_LeftParenthesisKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("dataClass",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("dataClass");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getEDROOMReplyMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getEDROOMReplyMessageAccess().getDataClassEDROOMDataClassCrossReference_4_0();
				return obj;
			}
		}
		return null;
	}

}

// ")"
protected class EDROOMReplyMessage_RightParenthesisKeyword_5 extends KeywordToken  {

	public EDROOMReplyMessage_RightParenthesisKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMReplyMessageAccess().getRightParenthesisKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMReplyMessage_DataClassAssignment_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new EDROOMReplyMessage_LeftParenthesisKeyword_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}
	}

}

// ";"
protected class EDROOMReplyMessage_SemicolonKeyword_6 extends KeywordToken  {

	public EDROOMReplyMessage_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}

	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getEDROOMReplyMessageAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new EDROOMReplyMessage_RightParenthesisKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}
	}

}

/************ end Rule EDROOMReplyMessage ****************/

}
