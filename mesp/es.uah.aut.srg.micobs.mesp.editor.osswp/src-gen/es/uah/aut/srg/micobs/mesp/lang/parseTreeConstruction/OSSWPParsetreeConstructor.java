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

import es.uah.aut.srg.micobs.mesp.lang.services.OSSWPGrammarAccess;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class OSSWPParsetreeConstructor extends org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor {
		
	@Inject
	private OSSWPGrammarAccess grammarAccess;
	
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
			case 0: return new MMESPOSSWPPackageFile_Group(this, this, 0, inst);
			case 1: return new MMESPOSSWPPackageElement_MOSSwPackageParserRuleCall(this, this, 1, inst);
			case 2: return new MOSSwPackage_Group(this, this, 2, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MMESPOSSWPPackageFile ****************
 *
 * MMESPOSSWPPackageFile:
 * 	'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
 * 	imports+=[common::MCommonPackage|QualifiedName] ';')*
 * 	element=MMESPOSSWPPackageElement;
 *
 **/

// 'package' package=[mesplibrary::MMESPPackage|QualifiedName] ';' ('import'
// imports+=[common::MCommonPackage|QualifiedName] ';')* element=MMESPOSSWPPackageElement
protected class MMESPOSSWPPackageFile_Group extends GroupToken {
	
	public MMESPOSSWPPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPOSSWPPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMESPOSSWPPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'package'
protected class MMESPOSSWPPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MMESPOSSWPPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[mesplibrary::MMESPPackage|QualifiedName]
protected class MMESPOSSWPPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MMESPOSSWPPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPOSSWPPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPOSSWPPackageFileAccess().getPackageMMESPPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMESPOSSWPPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MMESPOSSWPPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPOSSWPPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ('import' imports+=[common::MCommonPackage|QualifiedName] ';')*
protected class MMESPOSSWPPackageFile_Group_3 extends GroupToken {
	
	public MMESPOSSWPPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMESPOSSWPPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPOSSWPPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'import'
protected class MMESPOSSWPPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MMESPOSSWPPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPOSSWPPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPOSSWPPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMESPOSSWPPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[common::MCommonPackage|QualifiedName]
protected class MMESPOSSWPPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MMESPOSSWPPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPOSSWPPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMESPOSSWPPackageFileAccess().getImportsMCommonPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MMESPOSSWPPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MMESPOSSWPPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMESPOSSWPPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPOSSWPPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MMESPOSSWPPackageElement
protected class MMESPOSSWPPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MMESPOSSWPPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMESPOSSWPPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMESPOSSWPPackageElement_MOSSwPackageParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMESPOSSWPPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMESPOSSWPPackageFileAccess().getElementMMESPOSSWPPackageElementParserRuleCall_4_0(); 
				consumed = obj;
				return param;
			}
		}
		return null;
	}

    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		if(value == inst.getEObject() && !inst.isConsumed()) return null;
		switch(index) {
			case 0: return new MMESPOSSWPPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMESPOSSWPPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MMESPOSSWPPackageFile ****************/


/************ begin Rule MMESPOSSWPPackageElement ****************
 *
 * MMESPOSSWPPackageElement:
 * 	MOSSwPackage;
 *
 **/

// MOSSwPackage
protected class MMESPOSSWPPackageElement_MOSSwPackageParserRuleCall extends RuleCallToken {
	
	public MMESPOSSWPPackageElement_MOSSwPackageParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMESPOSSWPPackageElementAccess().getMOSSwPackageParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOSSwPackageRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MOSSwPackage_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule MMESPOSSWPPackageElement ****************/





/************ begin Rule MOSSwPackage ****************
 *
 * MOSSwPackage:
 * 	'osswpackage'
 * 	name=ID ('extends' extends+=[MOSSwPackage|VersionedQualifiedName] (","
 * 	extends+=[MOSSwPackage|VersionedQualifiedName])*)?
 * 	'{' ('version' ':=' version=Version ';' & 'os' ':=' referencedElement=[pdl::MOperatingSystem|VersionedQualifiedName]
 * 	';' & 'construction' 'tools' ':=' ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
 * 	ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';' & ('provided' 'osswis' ':='
 * 	providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName] (","
 * 	providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName])* ';')?)
 * 	'}' ';';
 *
 **/

// 'osswpackage' name=ID ('extends' extends+=[MOSSwPackage|VersionedQualifiedName] (","
// extends+=[MOSSwPackage|VersionedQualifiedName])*)? '{' ('version' ':=' version=Version ';' & 'os' ':='
// referencedElement=[pdl::MOperatingSystem|VersionedQualifiedName] ';' & 'construction' 'tools' ':='
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';' & ('provided' 'osswis' ':='
// providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName] (","
// providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName])* ';')?) '}' ';'
protected class MOSSwPackage_Group extends GroupToken {
	
	public MOSSwPackage_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_SemicolonKeyword_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMOSSwPackageRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// 'osswpackage'
protected class MOSSwPackage_OsswpackageKeyword_0 extends KeywordToken  {
	
	public MOSSwPackage_OsswpackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getOsswpackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// name=ID
protected class MOSSwPackage_NameAssignment_1 extends AssignmentToken  {
	
	public MOSSwPackage_NameAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getNameAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_OsswpackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMOSSwPackageAccess().getNameIDTerminalRuleCall_1_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMOSSwPackageAccess().getNameIDTerminalRuleCall_1_0();
			return obj;
		}
		return null;
	}

}

// ('extends' extends+=[MOSSwPackage|VersionedQualifiedName] ("," extends+=[MOSSwPackage|VersionedQualifiedName])*)?
protected class MOSSwPackage_Group_2 extends GroupToken {
	
	public MOSSwPackage_Group_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getGroup_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSwPackage_ExtendsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'extends'
protected class MOSSwPackage_ExtendsKeyword_2_0 extends KeywordToken  {
	
	public MOSSwPackage_ExtendsKeyword_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getExtendsKeyword_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_NameAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// extends+=[MOSSwPackage|VersionedQualifiedName]
protected class MOSSwPackage_ExtendsAssignment_2_1 extends AssignmentToken  {
	
	public MOSSwPackage_ExtendsAssignment_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_ExtendsKeyword_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," extends+=[MOSSwPackage|VersionedQualifiedName])*
protected class MOSSwPackage_Group_2_2 extends GroupToken {
	
	public MOSSwPackage_Group_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getGroup_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_ExtendsAssignment_2_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MOSSwPackage_CommaKeyword_2_2_0 extends KeywordToken  {
	
	public MOSSwPackage_CommaKeyword_2_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getCommaKeyword_2_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_Group_2_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSwPackage_ExtendsAssignment_2_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// extends+=[MOSSwPackage|VersionedQualifiedName]
protected class MOSSwPackage_ExtendsAssignment_2_2_1 extends AssignmentToken  {
	
	public MOSSwPackage_ExtendsAssignment_2_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getExtendsAssignment_2_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_CommaKeyword_2_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("extends",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("extends");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_2_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSwPackageAccess().getExtendsMOSSwPackageCrossReference_2_2_1_0(); 
				return obj;
			}
		}
		return null;
	}

}



// '{'
protected class MOSSwPackage_LeftCurlyBracketKeyword_3 extends KeywordToken  {
	
	public MOSSwPackage_LeftCurlyBracketKeyword_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getLeftCurlyBracketKeyword_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_Group_2(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSwPackage_NameAssignment_1(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ('version' ':=' version=Version ';' & 'os' ':=' referencedElement=[pdl::MOperatingSystem|VersionedQualifiedName] ';' &
// 'construction' 'tools' ':=' ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';' & ('provided' 'osswis' ':='
// providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName] (","
// providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName])* ';')?)
protected class MOSSwPackage_UnorderedGroup_4 extends UnorderedGroupToken {
	
	public MOSSwPackage_UnorderedGroup_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getUnorderedGroup_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_Group_4_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSwPackage_Group_4_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// 'version' ':=' version=Version ';'
protected class MOSSwPackage_Group_4_0 extends GroupToken {
	
	public MOSSwPackage_Group_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getGroup_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_SemicolonKeyword_4_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'version'
protected class MOSSwPackage_VersionKeyword_4_0_0 extends KeywordToken  {
	
	public MOSSwPackage_VersionKeyword_4_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getVersionKeyword_4_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_LeftCurlyBracketKeyword_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MOSSwPackage_ColonEqualsSignKeyword_4_0_1 extends KeywordToken  {
	
	public MOSSwPackage_ColonEqualsSignKeyword_4_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_VersionKeyword_4_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MOSSwPackage_VersionAssignment_4_0_2 extends AssignmentToken  {
	
	public MOSSwPackage_VersionAssignment_4_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getVersionAssignment_4_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_ColonEqualsSignKeyword_4_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMOSSwPackageAccess().getVersionVersionParserRuleCall_4_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMOSSwPackageAccess().getVersionVersionParserRuleCall_4_0_2_0();
			return obj;
		}
		return null;
	}

}

// ';'
protected class MOSSwPackage_SemicolonKeyword_4_0_3 extends KeywordToken  {
	
	public MOSSwPackage_SemicolonKeyword_4_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_VersionAssignment_4_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// 'os' ':=' referencedElement=[pdl::MOperatingSystem|VersionedQualifiedName] ';'
protected class MOSSwPackage_Group_4_1 extends GroupToken {
	
	public MOSSwPackage_Group_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getGroup_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_SemicolonKeyword_4_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'os'
protected class MOSSwPackage_OsKeyword_4_1_0 extends KeywordToken  {
	
	public MOSSwPackage_OsKeyword_4_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getOsKeyword_4_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_Group_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MOSSwPackage_ColonEqualsSignKeyword_4_1_1 extends KeywordToken  {
	
	public MOSSwPackage_ColonEqualsSignKeyword_4_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_OsKeyword_4_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// referencedElement=[pdl::MOperatingSystem|VersionedQualifiedName]
protected class MOSSwPackage_ReferencedElementAssignment_4_1_2 extends AssignmentToken  {
	
	public MOSSwPackage_ReferencedElementAssignment_4_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getReferencedElementAssignment_4_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_ColonEqualsSignKeyword_4_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("referencedElement",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("referencedElement");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemCrossReference_4_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSwPackageAccess().getReferencedElementMOperatingSystemCrossReference_4_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ';'
protected class MOSSwPackage_SemicolonKeyword_4_1_3 extends KeywordToken  {
	
	public MOSSwPackage_SemicolonKeyword_4_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_ReferencedElementAssignment_4_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// 'construction' 'tools' ':=' ctools+=[mespctool::MConstructionTool|VersionedQualifiedName] (","
// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])* ';'
protected class MOSSwPackage_Group_4_2 extends GroupToken {
	
	public MOSSwPackage_Group_4_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getGroup_4_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_SemicolonKeyword_4_2_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'construction'
protected class MOSSwPackage_ConstructionKeyword_4_2_0 extends KeywordToken  {
	
	public MOSSwPackage_ConstructionKeyword_4_2_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getConstructionKeyword_4_2_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_Group_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'tools'
protected class MOSSwPackage_ToolsKeyword_4_2_1 extends KeywordToken  {
	
	public MOSSwPackage_ToolsKeyword_4_2_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getToolsKeyword_4_2_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_ConstructionKeyword_4_2_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MOSSwPackage_ColonEqualsSignKeyword_4_2_2 extends KeywordToken  {
	
	public MOSSwPackage_ColonEqualsSignKeyword_4_2_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_2_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_ToolsKeyword_4_2_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
protected class MOSSwPackage_CtoolsAssignment_4_2_3 extends AssignmentToken  {
	
	public MOSSwPackage_CtoolsAssignment_4_2_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_ColonEqualsSignKeyword_4_2_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ctools",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ctools");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," ctools+=[mespctool::MConstructionTool|VersionedQualifiedName])*
protected class MOSSwPackage_Group_4_2_4 extends GroupToken {
	
	public MOSSwPackage_Group_4_2_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getGroup_4_2_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_CtoolsAssignment_4_2_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MOSSwPackage_CommaKeyword_4_2_4_0 extends KeywordToken  {
	
	public MOSSwPackage_CommaKeyword_4_2_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_2_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_Group_4_2_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSwPackage_CtoolsAssignment_4_2_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// ctools+=[mespctool::MConstructionTool|VersionedQualifiedName]
protected class MOSSwPackage_CtoolsAssignment_4_2_4_1 extends AssignmentToken  {
	
	public MOSSwPackage_CtoolsAssignment_4_2_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getCtoolsAssignment_4_2_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_CommaKeyword_4_2_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("ctools",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("ctools");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSwPackageAccess().getCtoolsMConstructionToolCrossReference_4_2_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MOSSwPackage_SemicolonKeyword_4_2_5 extends KeywordToken  {
	
	public MOSSwPackage_SemicolonKeyword_4_2_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_2_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_Group_4_2_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSwPackage_CtoolsAssignment_4_2_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}


// ('provided' 'osswis' ':=' providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName] (","
// providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName])* ';')?
protected class MOSSwPackage_Group_4_3 extends GroupToken {
	
	public MOSSwPackage_Group_4_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getGroup_4_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_SemicolonKeyword_4_3_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'provided'
protected class MOSSwPackage_ProvidedKeyword_4_3_0 extends KeywordToken  {
	
	public MOSSwPackage_ProvidedKeyword_4_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getProvidedKeyword_4_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_Group_4_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// 'osswis'
protected class MOSSwPackage_OsswisKeyword_4_3_1 extends KeywordToken  {
	
	public MOSSwPackage_OsswisKeyword_4_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getOsswisKeyword_4_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_ProvidedKeyword_4_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ':='
protected class MOSSwPackage_ColonEqualsSignKeyword_4_3_2 extends KeywordToken  {
	
	public MOSSwPackage_ColonEqualsSignKeyword_4_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getColonEqualsSignKeyword_4_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_OsswisKeyword_4_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName]
protected class MOSSwPackage_ProvidedOSSWIsAssignment_4_3_3 extends AssignmentToken  {
	
	public MOSSwPackage_ProvidedOSSWIsAssignment_4_3_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_ColonEqualsSignKeyword_4_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("providedOSSWIs",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("providedOSSWIs");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ("," providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName])*
protected class MOSSwPackage_Group_4_3_4 extends GroupToken {
	
	public MOSSwPackage_Group_4_3_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getGroup_4_3_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_ProvidedOSSWIsAssignment_4_3_4_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ","
protected class MOSSwPackage_CommaKeyword_4_3_4_0 extends KeywordToken  {
	
	public MOSSwPackage_CommaKeyword_4_3_4_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getCommaKeyword_4_3_4_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_Group_4_3_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSwPackage_ProvidedOSSWIsAssignment_4_3_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// providedOSSWIs+=[mesposswi::MOSSwInterface|VersionedQualifiedName]
protected class MOSSwPackage_ProvidedOSSWIsAssignment_4_3_4_1 extends AssignmentToken  {
	
	public MOSSwPackage_ProvidedOSSWIsAssignment_4_3_4_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsAssignment_4_3_4_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_CommaKeyword_4_3_4_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("providedOSSWIs",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("providedOSSWIs");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_4_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMOSSwPackageAccess().getProvidedOSSWIsMOSSwInterfaceCrossReference_4_3_4_1_0(); 
				return obj;
			}
		}
		return null;
	}

}


// ';'
protected class MOSSwPackage_SemicolonKeyword_4_3_5 extends KeywordToken  {
	
	public MOSSwPackage_SemicolonKeyword_4_3_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_4_3_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_Group_4_3_4(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MOSSwPackage_ProvidedOSSWIsAssignment_4_3_3(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}



// '}'
protected class MOSSwPackage_RightCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MOSSwPackage_RightCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getRightCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_UnorderedGroup_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ';'
protected class MOSSwPackage_SemicolonKeyword_6 extends KeywordToken  {
	
	public MOSSwPackage_SemicolonKeyword_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMOSSwPackageAccess().getSemicolonKeyword_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MOSSwPackage_RightCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MOSSwPackage ****************/

}
