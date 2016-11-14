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

import es.uah.aut.srg.micobs.mesp.lang.services.CTOOLGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class CTOOLParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private CTOOLGrammarAccess grammarAccess;
	
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
			case 0: return new MMESPCTOOLPackageFile_Group(this, this, 0, inst);
			case 1: return new MMESPCTOOLPackageElement_MConstructionToolParserRuleCall(this, this, 1, inst);
			case 2: return new MConstructionTool_Group(this, this, 2, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MMESPCTOOLPackageFile ****************
 *
 * MMESPCTOOLPackageFile:
 * 	'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
 * 	imports+=[common::MCommonPackage|QualifiedName] ';')*
 * 	element=MMESPCTOOLPackageElement;
 *
 **/

// 'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
// imports+=[common::MCommonPackage|QualifiedName] ';')* element=MMESPCTOOLPackageElement
protected class MMESPCTOOLPackageFile_Group extends GroupToken {
	
	public MMESPCTOOLPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPCTOOLPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPCTOOLPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPCTOOLPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'package'
protected class MMESPCTOOLPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MMESPCTOOLPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[mesplibrary::MMESPPackage|QualifiedName]
protected class MMESPCTOOLPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MMESPCTOOLPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPCTOOLPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageMMESPPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPCTOOLPackageFileAccess().getPackageMMESPPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMESPCTOOLPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MMESPCTOOLPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPCTOOLPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPCTOOLPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('import' imports+=[common::MCommonPackage|QualifiedName] ';')*
protected class MMESPCTOOLPackageFile_Group_3 extends GroupToken {
	
	public MMESPCTOOLPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPCTOOLPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPCTOOLPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'import'
protected class MMESPCTOOLPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MMESPCTOOLPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPCTOOLPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPCTOOLPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPCTOOLPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[common::MCommonPackage|QualifiedName]
protected class MMESPCTOOLPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MMESPCTOOLPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPCTOOLPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPCTOOLPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPCTOOLPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPCTOOLPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMESPCTOOLPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MMESPCTOOLPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPCTOOLPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPCTOOLPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MMESPCTOOLPackageElement
protected class MMESPCTOOLPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MMESPCTOOLPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPCTOOLPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPCTOOLPackageElement_MConstructionToolParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPCTOOLPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPCTOOLPackageFileAccess().getElementMMESPCTOOLPackageElementParserRuleCall_4_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MMESPCTOOLPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPCTOOLPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MMESPCTOOLPackageFile ****************/


/************ begin Rule MMESPCTOOLPackageElement ****************
 *
 * MMESPCTOOLPackageElement:
 * 	MConstructionTool;
 *
 **/

// MConstructionTool
protected class MMESPCTOOLPackageElement_MConstructionToolParserRuleCall extends RuleCallToken {
	
	public MMESPCTOOLPackageElement_MConstructionToolParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMESPCTOOLPackageElementAccess().getMConstructionToolParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMConstructionToolRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MConstructionTool_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule MMESPCTOOLPackageElement ****************/






/************ begin Rule MConstructionTool ****************
 *
 * MConstructionTool:
 * 	'construction' 'tool'
 * 	name=ID ('extends' extends+=[MConstructionTool|VersionedQualifiedName] (","
 * 	extends+=[MConstructionTool|VersionedQualifiedName])*)?
 * 	'{' ('version' ':=' version=Version ';' & 'supported' 'languages' ':='
 * 	supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
 * 	supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ';')
 * 	'}'
 * 	';';
 *
 **/

// 'construction' 'tool' name=ID ('extends' extends+=[MConstructionTool|VersionedQualifiedName] (","
// extends+=[MConstructionTool|VersionedQualifiedName])*)? '{' ('version' ':=' version=Version ';' & 'supported'
// 'languages' ':=' supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
// supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ';') '}' ';'
protected class MConstructionTool_Group extends GroupToken {
	
	public MConstructionTool_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMConstructionToolRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'construction'
protected class MConstructionTool_ConstructionKeyword_0 extends KeywordToken  {
	
	public MConstructionTool_ConstructionKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getConstructionKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// 'tool'
protected class MConstructionTool_ToolKeyword_1 extends KeywordToken  {
	
	public MConstructionTool_ToolKeyword_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getToolKeyword_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_ConstructionKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// name=ID
protected class MConstructionTool_NameAssignment_2 extends AssignmentToken  {
	
	public MConstructionTool_NameAssignment_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getNameAssignment_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_ToolKeyword_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMConstructionToolAccess().getNameIDTerminalRuleCall_2_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMConstructionToolAccess().getNameIDTerminalRuleCall_2_0();
			return obj;
		}
		return null;
	}

}

// ('extends' extends+=[MConstructionTool|VersionedQualifiedName] (","
// extends+=[MConstructionTool|VersionedQualifiedName])*)?
protected class MConstructionTool_Group_3 extends GroupToken {
	
	public MConstructionTool_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConstructionTool_ExtendsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'extends'
protected class MConstructionTool_ExtendsKeyword_3_0 extends KeywordToken  {
	
	public MConstructionTool_ExtendsKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getExtendsKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_NameAssignment_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// extends+=[MConstructionTool|VersionedQualifiedName]
protected class MConstructionTool_ExtendsAssignment_3_1 extends AssignmentToken  {
	
	public MConstructionTool_ExtendsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getExtendsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_ExtendsKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," extends+=[MConstructionTool|VersionedQualifiedName])*
protected class MConstructionTool_Group_3_2 extends GroupToken {
	
	public MConstructionTool_Group_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getGroup_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_ExtendsAssignment_3_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MConstructionTool_CommaKeyword_3_2_0 extends KeywordToken  {
	
	public MConstructionTool_CommaKeyword_3_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getCommaKeyword_3_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_Group_3_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConstructionTool_ExtendsAssignment_3_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MConstructionTool|VersionedQualifiedName]
protected class MConstructionTool_ExtendsAssignment_3_2_1 extends AssignmentToken  {
	
	public MConstructionTool_ExtendsAssignment_3_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getExtendsAssignment_3_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_CommaKeyword_3_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolCrossReference_3_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConstructionToolAccess().getExtendsMConstructionToolCrossReference_3_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// '{'
protected class MConstructionTool_LeftCurlyBracketKeyword_4 extends KeywordToken  {
	
	public MConstructionTool_LeftCurlyBracketKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getLeftCurlyBracketKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConstructionTool_NameAssignment_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ('version' ':=' version=Version ';' & 'supported' 'languages' ':='
// supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
// supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ';')
protected class MConstructionTool_UnorderedGroup_5 extends UnorderedGroupToken {
	
	public MConstructionTool_UnorderedGroup_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getUnorderedGroup_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_Group_5_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'version' ':=' version=Version ';'
protected class MConstructionTool_Group_5_0 extends GroupToken {
	
	public MConstructionTool_Group_5_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getGroup_5_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_SemicolonKeyword_5_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'version'
protected class MConstructionTool_VersionKeyword_5_0_0 extends KeywordToken  {
	
	public MConstructionTool_VersionKeyword_5_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getVersionKeyword_5_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_LeftCurlyBracketKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MConstructionTool_ColonEqualsSignKeyword_5_0_1 extends KeywordToken  {
	
	public MConstructionTool_ColonEqualsSignKeyword_5_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getColonEqualsSignKeyword_5_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_VersionKeyword_5_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MConstructionTool_VersionAssignment_5_0_2 extends AssignmentToken  {
	
	public MConstructionTool_VersionAssignment_5_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getVersionAssignment_5_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_ColonEqualsSignKeyword_5_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMConstructionToolAccess().getVersionVersionParserRuleCall_5_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMConstructionToolAccess().getVersionVersionParserRuleCall_5_0_2_0();
			return obj;
		}
		return null;
	}

}

// ';'
protected class MConstructionTool_SemicolonKeyword_5_0_3 extends KeywordToken  {
	
	public MConstructionTool_SemicolonKeyword_5_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_5_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_VersionAssignment_5_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// 'supported' 'languages' ':=' supportedLanguages+=[system::MLanguage|VersionedQualifiedName] (","
// supportedLanguages+=[system::MLanguage|VersionedQualifiedName])* ';'
protected class MConstructionTool_Group_5_1 extends GroupToken {
	
	public MConstructionTool_Group_5_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getGroup_5_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_SemicolonKeyword_5_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'supported'
protected class MConstructionTool_SupportedKeyword_5_1_0 extends KeywordToken  {
	
	public MConstructionTool_SupportedKeyword_5_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getSupportedKeyword_5_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_Group_5_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'languages'
protected class MConstructionTool_LanguagesKeyword_5_1_1 extends KeywordToken  {
	
	public MConstructionTool_LanguagesKeyword_5_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getLanguagesKeyword_5_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_SupportedKeyword_5_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MConstructionTool_ColonEqualsSignKeyword_5_1_2 extends KeywordToken  {
	
	public MConstructionTool_ColonEqualsSignKeyword_5_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getColonEqualsSignKeyword_5_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_LanguagesKeyword_5_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// supportedLanguages+=[system::MLanguage|VersionedQualifiedName]
protected class MConstructionTool_SupportedLanguagesAssignment_5_1_3 extends AssignmentToken  {
	
	public MConstructionTool_SupportedLanguagesAssignment_5_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getSupportedLanguagesAssignment_5_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_ColonEqualsSignKeyword_5_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedLanguages",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedLanguages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageCrossReference_5_1_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageCrossReference_5_1_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," supportedLanguages+=[system::MLanguage|VersionedQualifiedName])*
protected class MConstructionTool_Group_5_1_4 extends GroupToken {
	
	public MConstructionTool_Group_5_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getGroup_5_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_SupportedLanguagesAssignment_5_1_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MConstructionTool_CommaKeyword_5_1_4_0 extends KeywordToken  {
	
	public MConstructionTool_CommaKeyword_5_1_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getCommaKeyword_5_1_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_Group_5_1_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConstructionTool_SupportedLanguagesAssignment_5_1_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// supportedLanguages+=[system::MLanguage|VersionedQualifiedName]
protected class MConstructionTool_SupportedLanguagesAssignment_5_1_4_1 extends AssignmentToken  {
	
	public MConstructionTool_SupportedLanguagesAssignment_5_1_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getSupportedLanguagesAssignment_5_1_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_CommaKeyword_5_1_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("supportedLanguages",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("supportedLanguages");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageCrossReference_5_1_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMConstructionToolAccess().getSupportedLanguagesMLanguageCrossReference_5_1_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MConstructionTool_SemicolonKeyword_5_1_5 extends KeywordToken  {
	
	public MConstructionTool_SemicolonKeyword_5_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_5_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_Group_5_1_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MConstructionTool_SupportedLanguagesAssignment_5_1_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MConstructionTool_RightCurlyBracketKeyword_6 extends KeywordToken  {
	
	public MConstructionTool_RightCurlyBracketKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getRightCurlyBracketKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_UnorderedGroup_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MConstructionTool_SemicolonKeyword_7 extends KeywordToken  {
	
	public MConstructionTool_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMConstructionToolAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MConstructionTool_RightCurlyBracketKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MConstructionTool ****************/

}
