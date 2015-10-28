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

import es.uah.aut.srg.micobs.common.MParameterRange;

/**
 * A representation of a default value assignment for an
 * implementation-oriented domain's real attribute for a given platform.
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitchCase#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMRealParamIODSPSwitchCase()
 * @model
 * @generated
 */
public interface MRealParamIODSPSwitchCase extends MParameterIODSPSwitchCase {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(MParameterRange)
	 * @see es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage#getMRealParamIODSPSwitchCase_Range()
	 * @model containment="true"
	 * @generated
	 */
	MParameterRange getRange();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.micobs.mclev.mclevdom.MRealParamIODSPSwitchCase#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(MParameterRange value);

} // MRealParamIODSPSwitchCase
