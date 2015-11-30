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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.parsetree.reconstr.IEObjectConsumer;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.mclev.lang.services.IMAPGrammarAccess;

@SuppressWarnings("all")
public class IMAPParsetreeConstructor extends AbstractParseTreeConstructor {
		
	@Inject
	private IMAPGrammarAccess grammarAccess;
	
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
			case 0: return new MMCLEVIMAPPackageFile_Group(this, this, 0, inst);
			case 1: return new MMCLEVIMAPPackageElement_MInterfaceMappingParserRuleCall(this, this, 1, inst);
			case 2: return new MInterfaceMapping_Group(this, this, 2, inst);
			default: return null;
		}	
	}	
}
	

/************ begin Rule MMCLEVIMAPPackageFile ****************
 *
 * MMCLEVIMAPPackageFile:
 * 	"package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
 * 	imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ";")* element=MMCLEVIMAPPackageElement;
 *
 **/

// "package" package=[mclevlibrary::MMCLEVPackage|QualifiedName] ";" ("import"
// imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ";")* element=MMCLEVIMAPPackageElement
protected class MMCLEVIMAPPackageFile_Group extends GroupToken {
	
	public MMCLEVIMAPPackageFile_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVIMAPPackageFileAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIMAPPackageFile_ElementAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMMCLEVIMAPPackageFileRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "package"
protected class MMCLEVIMAPPackageFile_PackageKeyword_0 extends KeywordToken  {
	
	public MMCLEVIMAPPackageFile_PackageKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// package=[mclevlibrary::MMCLEVPackage|QualifiedName]
protected class MMCLEVIMAPPackageFile_PackageAssignment_1 extends AssignmentToken  {
	
	public MMCLEVIMAPPackageFile_PackageAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIMAPPackageFile_PackageKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("package",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("package");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVIMAPPackageFileAccess().getPackageMMCLEVPackageCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMCLEVIMAPPackageFile_SemicolonKeyword_2 extends KeywordToken  {
	
	public MMCLEVIMAPPackageFile_SemicolonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVIMAPPackageFileAccess().getSemicolonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIMAPPackageFile_PackageAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ("import" imports+=[mclevlibrary::MMCLEVPackage|QualifiedName] ";")*
protected class MMCLEVIMAPPackageFile_Group_3 extends GroupToken {
	
	public MMCLEVIMAPPackageFile_Group_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMMCLEVIMAPPackageFileAccess().getGroup_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIMAPPackageFile_SemicolonKeyword_3_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "import"
protected class MMCLEVIMAPPackageFile_ImportKeyword_3_0 extends KeywordToken  {
	
	public MMCLEVIMAPPackageFile_ImportKeyword_3_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportKeyword_3_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIMAPPackageFile_Group_3(lastRuleCallOrigin, this, 0, inst);
			case 1: return new MMCLEVIMAPPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, this, 1, inst);
			default: return null;
		}	
	}

}

// imports+=[mclevlibrary::MMCLEVPackage|QualifiedName]
protected class MMCLEVIMAPPackageFile_ImportsAssignment_3_1 extends AssignmentToken  {
	
	public MMCLEVIMAPPackageFile_ImportsAssignment_3_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportsAssignment_3_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIMAPPackageFile_ImportKeyword_3_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("imports",false)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("imports");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportsMMCLEVPackageCrossReference_3_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMMCLEVIMAPPackageFileAccess().getImportsMMCLEVPackageCrossReference_3_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MMCLEVIMAPPackageFile_SemicolonKeyword_3_2 extends KeywordToken  {
	
	public MMCLEVIMAPPackageFile_SemicolonKeyword_3_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMMCLEVIMAPPackageFileAccess().getSemicolonKeyword_3_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIMAPPackageFile_ImportsAssignment_3_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// element=MMCLEVIMAPPackageElement
protected class MMCLEVIMAPPackageFile_ElementAssignment_4 extends AssignmentToken  {
	
	public MMCLEVIMAPPackageFile_ElementAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMMCLEVIMAPPackageFileAccess().getElementAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MMCLEVIMAPPackageElement_MInterfaceMappingParserRuleCall(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("element",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("element");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::RuleCallImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMMCLEVIMAPPackageElementRule().getType().getClassifier())) {
				type = AssignmentType.PARSER_RULE_CALL;
				element = grammarAccess.getMMCLEVIMAPPackageFileAccess().getElementMMCLEVIMAPPackageElementParserRuleCall_4_0(); 
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
			case 0: return new MMCLEVIMAPPackageFile_Group_3(lastRuleCallOrigin, next, actIndex, consumed);
			case 1: return new MMCLEVIMAPPackageFile_SemicolonKeyword_2(lastRuleCallOrigin, next, actIndex, consumed);
			default: return null;
		}	
	}	
}


/************ end Rule MMCLEVIMAPPackageFile ****************/


/************ begin Rule MMCLEVIMAPPackageElement ****************
 *
 * MMCLEVIMAPPackageElement:
 * 	MInterfaceMapping;
 *
 **/

// MInterfaceMapping
protected class MMCLEVIMAPPackageElement_MInterfaceMappingParserRuleCall extends RuleCallToken {
	
	public MMCLEVIMAPPackageElement_MInterfaceMappingParserRuleCall(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public RuleCall getGrammarElement() {
		return grammarAccess.getMMCLEVIMAPPackageElementAccess().getMInterfaceMappingParserRuleCall();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_Group(this, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInterfaceMappingRule().getType().getClassifier())
			return null;
		if(checkForRecursion(MInterfaceMapping_Group.class, eObjectConsumer)) return null;
		return eObjectConsumer;
	}
	
    @Override
	public AbstractToken createFollowerAfterReturn(AbstractToken next,	int actIndex, int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(next, actIndex , index, inst);
		}	
	}	
}

/************ end Rule MMCLEVIMAPPackageElement ****************/






/************ begin Rule MInterfaceMapping ****************
 *
 * MInterfaceMapping:
 * 	"mapping" domain=[mclevdom::MIODomain|VersionedQualifiedName] "::"
 * 	type=[mclevdom::MExchangeModel|VersionedQualifiedReferenceName] name=ID "{" ("version" ":=" version=Version ";" &
 * 	"interfaces" ":=" interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ","
 * 	interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ";") "}" ";";
 *
 **/

// "mapping" domain=[mclevdom::MIODomain|VersionedQualifiedName] "::"
// type=[mclevdom::MExchangeModel|VersionedQualifiedReferenceName] name=ID "{" ("version" ":=" version=Version ";" &
// "interfaces" ":=" interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ","
// interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ";") "}" ";"
protected class MInterfaceMapping_Group extends GroupToken {
	
	public MInterfaceMapping_Group(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getGroup();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_SemicolonKeyword_8(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override
	public IEObjectConsumer tryConsume() {
		if(getEObject().eClass() != grammarAccess.getMInterfaceMappingRule().getType().getClassifier())
			return null;
		return eObjectConsumer;
	}

}

// "mapping"
protected class MInterfaceMapping_MappingKeyword_0 extends KeywordToken  {
	
	public MInterfaceMapping_MappingKeyword_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getMappingKeyword_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			default: return lastRuleCallOrigin.createFollowerAfterReturn(this, index, index, inst);
		}	
	}

}

// domain=[mclevdom::MIODomain|VersionedQualifiedName]
protected class MInterfaceMapping_DomainAssignment_1 extends AssignmentToken  {
	
	public MInterfaceMapping_DomainAssignment_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getDomainAssignment_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_MappingKeyword_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("domain",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("domain");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInterfaceMappingAccess().getDomainMIODomainCrossReference_1_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInterfaceMappingAccess().getDomainMIODomainCrossReference_1_0(); 
				return obj;
			}
		}
		return null;
	}

}

// "::"
protected class MInterfaceMapping_ColonColonKeyword_2 extends KeywordToken  {
	
	public MInterfaceMapping_ColonColonKeyword_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getColonColonKeyword_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_DomainAssignment_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// type=[mclevdom::MExchangeModel|VersionedQualifiedReferenceName]
protected class MInterfaceMapping_TypeAssignment_3 extends AssignmentToken  {
	
	public MInterfaceMapping_TypeAssignment_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getTypeAssignment_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_ColonColonKeyword_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("type",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("type");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInterfaceMappingAccess().getTypeMExchangeModelCrossReference_3_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInterfaceMappingAccess().getTypeMExchangeModelCrossReference_3_0(); 
				return obj;
			}
		}
		return null;
	}

}

// name=ID
protected class MInterfaceMapping_NameAssignment_4 extends AssignmentToken  {
	
	public MInterfaceMapping_NameAssignment_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getNameAssignment_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_TypeAssignment_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("name",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("name");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMInterfaceMappingAccess().getNameIDTerminalRuleCall_4_0(), value, null)) {
			type = AssignmentType.TERMINAL_RULE_CALL;
			element = grammarAccess.getMInterfaceMappingAccess().getNameIDTerminalRuleCall_4_0();
			return obj;
		}
		return null;
	}

}

// "{"
protected class MInterfaceMapping_LeftCurlyBracketKeyword_5 extends KeywordToken  {
	
	public MInterfaceMapping_LeftCurlyBracketKeyword_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getLeftCurlyBracketKeyword_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_NameAssignment_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";" & "interfaces" ":=" interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ","
// interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ";"
protected class MInterfaceMapping_UnorderedGroup_6 extends UnorderedGroupToken {
	
	public MInterfaceMapping_UnorderedGroup_6(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public UnorderedGroup getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getUnorderedGroup_6();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_Group_6_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version" ":=" version=Version ";"
protected class MInterfaceMapping_Group_6_0 extends GroupToken {
	
	public MInterfaceMapping_Group_6_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getGroup_6_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_SemicolonKeyword_6_0_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "version"
protected class MInterfaceMapping_VersionKeyword_6_0_0 extends KeywordToken  {
	
	public MInterfaceMapping_VersionKeyword_6_0_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getVersionKeyword_6_0_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_LeftCurlyBracketKeyword_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MInterfaceMapping_ColonEqualsSignKeyword_6_0_1 extends KeywordToken  {
	
	public MInterfaceMapping_ColonEqualsSignKeyword_6_0_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getColonEqualsSignKeyword_6_0_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_VersionKeyword_6_0_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// version=Version
protected class MInterfaceMapping_VersionAssignment_6_0_2 extends AssignmentToken  {
	
	public MInterfaceMapping_VersionAssignment_6_0_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getVersionAssignment_6_0_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_ColonEqualsSignKeyword_6_0_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("version",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("version");
		if(valueSerializer.isValid(obj.getEObject(), grammarAccess.getMInterfaceMappingAccess().getVersionVersionParserRuleCall_6_0_2_0(), value, null)) {
			type = AssignmentType.DATATYPE_RULE_CALL;
			element = grammarAccess.getMInterfaceMappingAccess().getVersionVersionParserRuleCall_6_0_2_0();
			return obj;
		}
		return null;
	}

}

// ";"
protected class MInterfaceMapping_SemicolonKeyword_6_0_3 extends KeywordToken  {
	
	public MInterfaceMapping_SemicolonKeyword_6_0_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getSemicolonKeyword_6_0_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_VersionAssignment_6_0_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


// "interfaces" ":=" interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ","
// interfaces+=[mcleviface::MInterface|VersionedQualifiedName] ";"
protected class MInterfaceMapping_Group_6_1 extends GroupToken {
	
	public MInterfaceMapping_Group_6_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Group getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getGroup_6_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_SemicolonKeyword_6_1_5(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// "interfaces"
protected class MInterfaceMapping_InterfacesKeyword_6_1_0 extends KeywordToken  {
	
	public MInterfaceMapping_InterfacesKeyword_6_1_0(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getInterfacesKeyword_6_1_0();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_Group_6_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ":="
protected class MInterfaceMapping_ColonEqualsSignKeyword_6_1_1 extends KeywordToken  {
	
	public MInterfaceMapping_ColonEqualsSignKeyword_6_1_1(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getColonEqualsSignKeyword_6_1_1();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_InterfacesKeyword_6_1_0(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// interfaces+=[mcleviface::MInterface|VersionedQualifiedName]
protected class MInterfaceMapping_InterfacesAssignment_6_1_2 extends AssignmentToken  {
	
	public MInterfaceMapping_InterfacesAssignment_6_1_2(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getInterfacesAssignment_6_1_2();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_ColonEqualsSignKeyword_6_1_1(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("interfaces",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("interfaces");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceCrossReference_6_1_2_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceCrossReference_6_1_2_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ","
protected class MInterfaceMapping_CommaKeyword_6_1_3 extends KeywordToken  {
	
	public MInterfaceMapping_CommaKeyword_6_1_3(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getCommaKeyword_6_1_3();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_InterfacesAssignment_6_1_2(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// interfaces+=[mcleviface::MInterface|VersionedQualifiedName]
protected class MInterfaceMapping_InterfacesAssignment_6_1_4 extends AssignmentToken  {
	
	public MInterfaceMapping_InterfacesAssignment_6_1_4(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Assignment getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getInterfacesAssignment_6_1_4();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_CommaKeyword_6_1_3(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

    @Override	
	public IEObjectConsumer tryConsume() {
		if((value = eObjectConsumer.getConsumable("interfaces",true)) == null) return null;
		IEObjectConsumer obj = eObjectConsumer.cloneAndConsume("interfaces");
		if(value instanceof EObject) { // org::eclipse::xtext::impl::CrossReferenceImpl
			IEObjectConsumer param = createEObjectConsumer((EObject)value);
			if(param.isInstanceOf(grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceCrossReference_6_1_4_0().getType().getClassifier())) {
				type = AssignmentType.CROSS_REFERENCE;
				element = grammarAccess.getMInterfaceMappingAccess().getInterfacesMInterfaceCrossReference_6_1_4_0(); 
				return obj;
			}
		}
		return null;
	}

}

// ";"
protected class MInterfaceMapping_SemicolonKeyword_6_1_5 extends KeywordToken  {
	
	public MInterfaceMapping_SemicolonKeyword_6_1_5(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getSemicolonKeyword_6_1_5();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_InterfacesAssignment_6_1_4(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}



// "}"
protected class MInterfaceMapping_RightCurlyBracketKeyword_7 extends KeywordToken  {
	
	public MInterfaceMapping_RightCurlyBracketKeyword_7(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getRightCurlyBracketKeyword_7();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_UnorderedGroup_6(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}

// ";"
protected class MInterfaceMapping_SemicolonKeyword_8 extends KeywordToken  {
	
	public MInterfaceMapping_SemicolonKeyword_8(AbstractToken lastRuleCallOrigin, AbstractToken next, int transitionIndex, IEObjectConsumer eObjectConsumer) {
		super(lastRuleCallOrigin, next, transitionIndex, eObjectConsumer);
	}
	
	@Override
	public Keyword getGrammarElement() {
		return grammarAccess.getMInterfaceMappingAccess().getSemicolonKeyword_8();
	}

    @Override
	public AbstractToken createFollower(int index, IEObjectConsumer inst) {
		switch(index) {
			case 0: return new MInterfaceMapping_RightCurlyBracketKeyword_7(lastRuleCallOrigin, this, 0, inst);
			default: return null;
		}	
	}

}


/************ end Rule MInterfaceMapping ****************/

}
