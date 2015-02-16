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
package es.uah.aut.srg.micobs.pdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.impl.MCommonReferenceableObjImpl;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MOSSupportedPlatform;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MOSSupportedPlatform</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedPlatformImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedPlatformImpl#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedPlatformImpl#getMicroprocessor <em>Microprocessor</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedPlatformImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MOSSupportedPlatformImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MOSSupportedPlatformImpl extends MCommonReferenceableObjImpl implements MOSSupportedPlatform {
	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' reference.
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected MArchitecture architecture;

	/**
	 * The cached value of the '{@link #getCompiler() <em>Compiler</em>}' reference.
	 * @see #getCompiler()
	 * @generated
	 * @ordered
	 */
	protected MCompiler compiler;

	/**
	 * The cached value of the '{@link #getMicroprocessor() <em>Microprocessor</em>}' reference.
	 * @see #getMicroprocessor()
	 * @generated
	 * @ordered
	 */
	protected MMicroprocessor microprocessor;

	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' reference.
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected MBoard board;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> parameters;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' reference list.
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<MLanguage> languages;

	/**
	 * @generated
	 */
	protected MOSSupportedPlatformImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdlPackage.Literals.MOS_SUPPORTED_PLATFORM;
	}

	/**
	 * @generated
	 */
	public MArchitecture getArchitecture() {
		if (architecture != null && architecture.eIsProxy()) {
			InternalEObject oldArchitecture = (InternalEObject)architecture;
			architecture = (MArchitecture)eResolveProxy(oldArchitecture);
			if (architecture != oldArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MOS_SUPPORTED_PLATFORM__ARCHITECTURE, oldArchitecture, architecture));
			}
		}
		return architecture;
	}

	/**
	 * @generated
	 */
	public MArchitecture basicGetArchitecture() {
		return architecture;
	}

	/**
	 * @generated
	 */
	public void setArchitecture(MArchitecture newArchitecture) {
		MArchitecture oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MOS_SUPPORTED_PLATFORM__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * @generated
	 */
	public MCompiler getCompiler() {
		if (compiler != null && compiler.eIsProxy()) {
			InternalEObject oldCompiler = (InternalEObject)compiler;
			compiler = (MCompiler)eResolveProxy(oldCompiler);
			if (compiler != oldCompiler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MOS_SUPPORTED_PLATFORM__COMPILER, oldCompiler, compiler));
			}
		}
		return compiler;
	}

	/**
	 * @generated
	 */
	public MCompiler basicGetCompiler() {
		return compiler;
	}

	/**
	 * @generated
	 */
	public void setCompiler(MCompiler newCompiler) {
		MCompiler oldCompiler = compiler;
		compiler = newCompiler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MOS_SUPPORTED_PLATFORM__COMPILER, oldCompiler, compiler));
	}

	/**
	 * @generated
	 */
	public MMicroprocessor getMicroprocessor() {
		if (microprocessor != null && microprocessor.eIsProxy()) {
			InternalEObject oldMicroprocessor = (InternalEObject)microprocessor;
			microprocessor = (MMicroprocessor)eResolveProxy(oldMicroprocessor);
			if (microprocessor != oldMicroprocessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MOS_SUPPORTED_PLATFORM__MICROPROCESSOR, oldMicroprocessor, microprocessor));
			}
		}
		return microprocessor;
	}

	/**
	 * @generated
	 */
	public MMicroprocessor basicGetMicroprocessor() {
		return microprocessor;
	}

	/**
	 * @generated
	 */
	public void setMicroprocessor(MMicroprocessor newMicroprocessor) {
		MMicroprocessor oldMicroprocessor = microprocessor;
		microprocessor = newMicroprocessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MOS_SUPPORTED_PLATFORM__MICROPROCESSOR, oldMicroprocessor, microprocessor));
	}

	/**
	 * @generated
	 */
	public MBoard getBoard() {
		if (board != null && board.eIsProxy()) {
			InternalEObject oldBoard = (InternalEObject)board;
			board = (MBoard)eResolveProxy(oldBoard);
			if (board != oldBoard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MOS_SUPPORTED_PLATFORM__BOARD, oldBoard, board));
			}
		}
		return board;
	}

	/**
	 * @generated
	 */
	public MBoard basicGetBoard() {
		return board;
	}

	/**
	 * @generated
	 */
	public void setBoard(MBoard newBoard) {
		MBoard oldBoard = board;
		board = newBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MOS_SUPPORTED_PLATFORM__BOARD, oldBoard, board));
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MParameter>(MParameter.class, this, pdlPackage.MOS_SUPPORTED_PLATFORM__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated
	 */
	public EList<MLanguage> getLanguages() {
		if (languages == null) {
			languages = new EObjectResolvingEList<MLanguage>(MLanguage.class, this, pdlPackage.MOS_SUPPORTED_PLATFORM__LANGUAGES);
		}
		return languages;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case pdlPackage.MOS_SUPPORTED_PLATFORM__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case pdlPackage.MOS_SUPPORTED_PLATFORM__ARCHITECTURE:
				if (resolve) return getArchitecture();
				return basicGetArchitecture();
			case pdlPackage.MOS_SUPPORTED_PLATFORM__COMPILER:
				if (resolve) return getCompiler();
				return basicGetCompiler();
			case pdlPackage.MOS_SUPPORTED_PLATFORM__MICROPROCESSOR:
				if (resolve) return getMicroprocessor();
				return basicGetMicroprocessor();
			case pdlPackage.MOS_SUPPORTED_PLATFORM__BOARD:
				if (resolve) return getBoard();
				return basicGetBoard();
			case pdlPackage.MOS_SUPPORTED_PLATFORM__PARAMETERS:
				return getParameters();
			case pdlPackage.MOS_SUPPORTED_PLATFORM__LANGUAGES:
				return getLanguages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case pdlPackage.MOS_SUPPORTED_PLATFORM__ARCHITECTURE:
				setArchitecture((MArchitecture)newValue);
				return;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__COMPILER:
				setCompiler((MCompiler)newValue);
				return;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__MICROPROCESSOR:
				setMicroprocessor((MMicroprocessor)newValue);
				return;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__BOARD:
				setBoard((MBoard)newValue);
				return;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MParameter>)newValue);
				return;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends MLanguage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case pdlPackage.MOS_SUPPORTED_PLATFORM__ARCHITECTURE:
				setArchitecture((MArchitecture)null);
				return;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__COMPILER:
				setCompiler((MCompiler)null);
				return;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__MICROPROCESSOR:
				setMicroprocessor((MMicroprocessor)null);
				return;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__BOARD:
				setBoard((MBoard)null);
				return;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__PARAMETERS:
				getParameters().clear();
				return;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__LANGUAGES:
				getLanguages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case pdlPackage.MOS_SUPPORTED_PLATFORM__ARCHITECTURE:
				return architecture != null;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__COMPILER:
				return compiler != null;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__MICROPROCESSOR:
				return microprocessor != null;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__BOARD:
				return board != null;
			case pdlPackage.MOS_SUPPORTED_PLATFORM__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case pdlPackage.MOS_SUPPORTED_PLATFORM__LANGUAGES:
				return languages != null && !languages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
