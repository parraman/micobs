/*******************************************************************************
 * Copyright (c) 2013 UAH Space Research Group.
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
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor;

import es.uah.aut.srg.micobs.lang.services.LANGGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class LANGParsetreeConstructor extends AbstractParseTreeConstructor {
		
	@Inject
	private LANGGrammarAccess grammarAccess;
	
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
			case 0: return new MSYSTEMPackageFile_Group(this, this, 0, inst);
			case 1: return new MSYSTEMPackageElement_MLanguageParserRuleCall(this, this, 1, inst);
			case 2: return new MLanguage_Group(this, this, 2, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MSYSTEMPackageFile ****************
 *
 * MSYSTEMPackageFile:
 * 	"package" package=[systemlibrary::MSystemPackage|QualifiedName] ";" ("import"
 * 	imports+=[systemlibrary::MSystemPackage|QualifiedName] ";")* element=MSYSTEMPackageElement;
 *
 **/

// "package" package=[systemlibrary::MSystemPackage|QualifiedName] ";" ("import"
// imports+=[systemlibrary::MSystemPackage|QualifiedName] ";")* element=MSYSTEMPackageElement
protected class MSYSTEMPackageFile_Group extends GroupToken {
	
	public MSYSTEMPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSYSTEMPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSYSTEMPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMSYSTEMPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "package"
protected class MSYSTEMPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MSYSTEMPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSYSTEMPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[systemlibrary::MSystemPackage|QualifiedName]
protected class MSYSTEMPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MSYSTEMPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSYSTEMPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSYSTEMPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSYSTEMPackageFileAccess().getPackageMSystemPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSYSTEMPackageFileAccess().getPackageMSystemPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MSYSTEMPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MSYSTEMPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSYSTEMPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSYSTEMPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("import" imports+=[systemlibrary::MSystemPackage|QualifiedName] ";")*
protected class MSYSTEMPackageFile_Group_3 extends GroupToken {
	
	public MSYSTEMPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMSYSTEMPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSYSTEMPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "import"
protected class MSYSTEMPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MSYSTEMPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSYSTEMPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSYSTEMPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MSYSTEMPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[systemlibrary::MSystemPackage|QualifiedName]
protected class MSYSTEMPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MSYSTEMPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSYSTEMPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSYSTEMPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSYSTEMPackageFileAccess().getImportsMSystemPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMSYSTEMPackageFileAccess().getImportsMSystemPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MSYSTEMPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MSYSTEMPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMSYSTEMPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSYSTEMPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MSYSTEMPackageElement
protected class MSYSTEMPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MSYSTEMPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMSYSTEMPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MSYSTEMPackageElement_MLanguageParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMSYSTEMPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMSYSTEMPackageFileAccess().getElementMSYSTEMPackageElementParserRuleCall_4_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MSYSTEMPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MSYSTEMPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MSYSTEMPackageFile ****************/


/************ begin Rule MSYSTEMPackageElement ****************
 *
 * MSYSTEMPackageElement:
 * 	MLanguage;
 *
 **/

// MLanguage
protected class MSYSTEMPackageElement_MLanguageParserRuleCall extends RuleCallToken {
	
	public MSYSTEMPackageElement_MLanguageParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMSYSTEMPackageElementAccess().getMLanguageParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMLanguageRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MLanguage_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule MSYSTEMPackageElement ****************/





/************ begin Rule MLanguage ****************
 *
 * MLanguage:
 * 	"language" name=ID ("extends" extends+=[MLanguage|VersionedQualifiedName] (","
 * 	extends+=[MLanguage|VersionedQualifiedName])*)? "{" "version" ":=" version=Version ";" "}" ";";
 *
 **/

// "language" name=ID ("extends" extends+=[MLanguage|VersionedQualifiedName] (","
// extends+=[MLanguage|VersionedQualifiedName])*)? "{" "version" ":=" version=Version ";" "}" ";"
protected class MLanguage_Group extends GroupToken {
	
	public MLanguage_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_SemicolonKeyword_9(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMLanguageRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "language"
protected class MLanguage_LanguageKeyword_0 extends KeywordToken  {
	
	public MLanguage_LanguageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getLanguageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MLanguage_NameAssignment_1 extends AssignmentToken  {
	
	public MLanguage_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_LanguageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMLanguageAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMLanguageAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ("extends" extends+=[MLanguage|VersionedQualifiedName] ("," extends+=[MLanguage|VersionedQualifiedName])*)?
protected class MLanguage_Group_2 extends GroupToken {
	
	public MLanguage_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MLanguage_ExtendsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "extends"
protected class MLanguage_ExtendsKeyword_2_0 extends KeywordToken  {
	
	public MLanguage_ExtendsKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getExtendsKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// extends+=[MLanguage|VersionedQualifiedName]
protected class MLanguage_ExtendsAssignment_2_1 extends AssignmentToken  {
	
	public MLanguage_ExtendsAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getExtendsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_ExtendsKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMLanguageAccess().getExtendsMLanguageCrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMLanguageAccess().getExtendsMLanguageCrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," extends+=[MLanguage|VersionedQualifiedName])*
protected class MLanguage_Group_2_2 extends GroupToken {
	
	public MLanguage_Group_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getGroup_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_ExtendsAssignment_2_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MLanguage_CommaKeyword_2_2_0 extends KeywordToken  {
	
	public MLanguage_CommaKeyword_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getCommaKeyword_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MLanguage_ExtendsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MLanguage|VersionedQualifiedName]
protected class MLanguage_ExtendsAssignment_2_2_1 extends AssignmentToken  {
	
	public MLanguage_ExtendsAssignment_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getExtendsAssignment_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_CommaKeyword_2_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMLanguageAccess().getExtendsMLanguageCrossReference_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMLanguageAccess().getExtendsMLanguageCrossReference_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// "{"
protected class MLanguage_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MLanguage_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MLanguage_NameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MLanguage_VersionKeyword_4 extends KeywordToken  {
	
	public MLanguage_VersionKeyword_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getVersionKeyword_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MLanguage_ColonEqualsSignKeyword_5 extends KeywordToken  {
	
	public MLanguage_ColonEqualsSignKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getColonEqualsSignKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_VersionKeyword_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MLanguage_VersionAssignment_6 extends AssignmentToken  {
	
	public MLanguage_VersionAssignment_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getVersionAssignment_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_ColonEqualsSignKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMLanguageAccess().getVersionVersionParserRuleCall_6_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMLanguageAccess().getVersionVersionParserRuleCall_6_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MLanguage_SemicolonKeyword_7 extends KeywordToken  {
	
	public MLanguage_SemicolonKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getSemicolonKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_VersionAssignment_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "}"
protected class MLanguage_RightCurlyBracketKeyword_8 extends KeywordToken  {
	
	public MLanguage_RightCurlyBracketKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getRightCurlyBracketKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_SemicolonKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MLanguage_SemicolonKeyword_9 extends KeywordToken  {
	
	public MLanguage_SemicolonKeyword_9(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMLanguageAccess().getSemicolonKeyword_9();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MLanguage_RightCurlyBracketKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MLanguage ****************/

}
