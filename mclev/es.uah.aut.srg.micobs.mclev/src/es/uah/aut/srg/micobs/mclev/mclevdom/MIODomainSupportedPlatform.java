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
package es.uah.aut.srg.micobs.mclev.mclevdom;

import org.eclipse.emf.common.util.EList;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.mclev.mclevsai.MSAI;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * A representation of a supported platform defined by an
 * implementation-oriented domain.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getOsapi <em>OSAPI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getOs <em>OS</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getMicroprocessor <em>Microprocessor</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getBoard <em>Board</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MIODomainSupportedPlatform#getLanguages <em>Languages</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomainSupportedPlatform()
 * @model
 * @generated
 */
public interface MIODomainSupportedPlatform extends MCommonReferenceableObj {
	/**
	 * Returns the supported operating system applications programming interface.
	 * @return the supported operating system applications programming interface or
	 * <code>null</code> if the implementation-oriented domain does not depend
	 * on the OSAPI.
	 * @see #setOsapi(MOperatingSystemAPI)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomainSupportedPlatform_Osapi()
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
	 * @return the supported operating system or <code>null</code> if the
	 * implementation-oriented domain does not depend on the underlying OS.
	 * @see #setOs(MOperatingSystem)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomainSupportedPlatform_Os()
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
	 * @return the supported architecture or <code>null</code> if the
	 * implementation-oriented domain does not depend on the architecture.
	 * @see #setArchitecture(MArchitecture)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomainSupportedPlatform_Architecture()
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
	 * @return the supported compiler or <code>null</code> if the
	 * implementation-oriented domain does not depend on the compiler used
	 * to build it.
	 * @see #setCompiler(MCompiler)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomainSupportedPlatform_Compiler()
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
	 * @return the supported microprocessor or <code>null</code> if the
	 * implementation-oriented domain does not depend on the microprocessor.
	 * @see #setMicroprocessor(MMicroprocessor)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomainSupportedPlatform_Microprocessor()
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
	 * @return the supported board or <code>null</code> if the
	 * implementation-oriented domain does not depend on the board.
	 * @see #setBoard(MBoard)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomainSupportedPlatform_Board()
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
	 * Returns the list of attributes for this specific supported platform.
	 * @return the list of attributes.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomainSupportedPlatform_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getAttributes();

	/**
	 * Returns the list of SAIs required for this specific supported
	 * platform.
	 * @return the list of required interfaces.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomainSupportedPlatform_Requires()
	 * @model
	 * @generated
	 */
	EList<MSAI> getRequires();

	/**
	 * Returns the list of languages supported by the implementation-oriented
	 * domain for this specific platform.
	 * @return the list of implementation languages.
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMIODomainSupportedPlatform_Languages()
	 * @model
	 * @generated
	 */
	EList<MLanguage> getLanguages();

}