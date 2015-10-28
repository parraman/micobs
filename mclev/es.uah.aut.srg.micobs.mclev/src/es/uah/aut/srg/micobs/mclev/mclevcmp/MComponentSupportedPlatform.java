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
package es.uah.aut.srg.micobs.mclev.mclevcmp;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A representation of a component supported platform.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getOsapi <em>OSAPI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getOs <em>OS</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getMicroprocessor <em>Microprocessor</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getBoard <em>Board</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getAttributeValueAssignments <em>Attribute Value Assignments</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getInternalComponents <em>Internal Components</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getConnections <em>Connections</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevcmp.MComponentSupportedPlatform#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform()
 * @model
 * @generated
 */
public interface MComponentSupportedPlatform extends MCommonReferenceableObj {
	/**
	 * Returns the supported operating system applications programming interface.
	 * @return the supported operating system applications programming interface or
	 * <code>null</code> if the implementation of the component does not depend
	 * on the OSAPI.
	 * @see #setOsapi(MOperatingSystemAPI)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform_Osapi()
	 * @model
	 * @generated
	 */
	MOperatingSystemAPI getOsapi();

	/**
	 * Sets the supported operating system applications programming interface.
	 * @param value the new supported operating system applications programming interface.
	 * @see #getOsapi()
	 * @generated
	 */
	void setOsapi(MOperatingSystemAPI value);

	/**
	 * Returns the supported operating system.
	 * @return the supported operating system or <code>null</code> if the implementation of the
	 * component does not depend on the underlying OS.
	 * @see #setOs(MOperatingSystem)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform_Os()
	 * @model
	 * @generated
	 */
	MOperatingSystem getOs();

	/**
	 * Sets the supported operating system.
	 * @param value the new supported operating system.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(MOperatingSystem value);

	/**
	 * Returns the supported architecture.
	 * @return the supported architecture or <code>null</code> if the implementation of the
	 * component does not depend on the architecture.
	 * @see #setArchitecture(MArchitecture)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform_Architecture()
	 * @model
	 * @generated
	 */
	MArchitecture getArchitecture();

	/**
	 * Sets the supported architecture.
	 * @param value the new supported architecture.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(MArchitecture value);

	/**
	 * Returns the supported compiler.
	 * @return the supported compiler or <code>null</code> if the implementation of the
	 * component does not depend on the compiler used to build it.
	 * @see #setCompiler(MCompiler)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform_Compiler()
	 * @model
	 * @generated
	 */
	MCompiler getCompiler();

	/**
	 * Sets the supported compiler.
	 * @param value the new supported compiler.
	 * @see #getCompiler()
	 * @generated
	 */
	void setCompiler(MCompiler value);

	/**
	 * Returns the supported microprocessor.
	 * @return the supported microprocessor or <code>null</code> if the implementation of the
	 * component does not depend on the microprocessor.
	 * @see #setMicroprocessor(MMicroprocessor)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform_Microprocessor()
	 * @model
	 * @generated
	 */
	MMicroprocessor getMicroprocessor();

	/**
	 * Sets the supported microprocessor.
	 * @param value the new supported microprocessor.
	 * @see #getMicroprocessor()
	 * @generated
	 */
	void setMicroprocessor(MMicroprocessor value);

	/**
	 * Returns the supported board.
	 * @return the supported board or <code>null</code> if the implementation of the
	 * component does not depend on the board.
	 * @see #setBoard(MBoard)
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform_Board()
	 * @model
	 * @generated
	 */
	MBoard getBoard();

	/**
	 * Sets the supported board.
	 * @param value the new supported board.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(MBoard value);

	/**
	 * Returns the list of SAIs required for this specific supported
	 * platform.
	 * @return the list of required interfaces.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform_Requires()
	 * @model
	 * @generated
	 */
	EList<MSAI> getRequires();

	/**
	 * Returns the list of languages in which the component is
	 * implemented for this specific supported platform.
	 * @return the list of implementation languages.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform_Languages()
	 * @model
	 * @generated
	 */
	EList<MLanguage> getLanguages();

	/**
	 * Returns the list of value assignments to the attributes defined for the
	 * type of the component for this specific supported platform.
	 * @return the list of attribute value assignments.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform_AttributeValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameterValueAssignment> getAttributeValueAssignments();

	/**
	 * Returns the list of component instances defined as part of the internal
	 * architecture of the component.
	 * @return the list of internal component instances.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform_InternalComponents()
	 * @model containment="true"
	 * @generated
	 */
	EList<MInternalComponentInstance> getInternalComponents();

	/**
	 * Returns the list of connections defined among the component instances
	 * that are part of the internal architecture of the component.
	 * @return the list of internal connections.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<MInternalComponentConnection> getConnections();

	/**
	 * Returns the list of attributes for this specific supported platform.
	 * @return the list of attributes.
	 * @see es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpPackage#getMComponentSupportedPlatform_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getAttributes();

}