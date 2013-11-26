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
package es.uah.aut.srg.micobs.mesp.mespswp.impl;

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
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageRequiredInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackageSupportedPlatform;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.system.MLanguage;

/**
 * An implementation of the model object '<em><b>MSwPackageSupportedPlatform</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl#getOsapi <em>OSAPI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl#getOs <em>OS</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl#getMicroprocessor <em>Microprocessor</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.mesp.mespswp.impl.MSwPackageSupportedPlatformImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MSwPackageSupportedPlatformImpl extends MCommonReferenceableObjImpl implements MSwPackageSupportedPlatform {
	/**
	 * The cached value of the '{@link #getOsapi() <em>OSAPI</em>}' reference.
	 * @see #getOsapi()
	 * @generated
	 * @ordered
	 */
	protected MOperatingSystemAPI osapi;

	/**
	 * The cached value of the '{@link #getOs() <em>OS</em>}' reference.
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected MOperatingSystem os;

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
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' reference list.
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<MLanguage> languages;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<MSwPackageRequiredInterface> requires;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> parameters;

	/**
	 * @generated
	 */
	protected MSwPackageSupportedPlatformImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return mespswpPackage.Literals.MSW_PACKAGE_SUPPORTED_PLATFORM;
	}

	/**
	 * @generated
	 */
	public MOperatingSystemAPI getOsapi() {
		if (osapi != null && osapi.eIsProxy()) {
			InternalEObject oldOsapi = (InternalEObject)osapi;
			osapi = (MOperatingSystemAPI)eResolveProxy(oldOsapi);
			if (osapi != oldOsapi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__OSAPI, oldOsapi, osapi));
			}
		}
		return osapi;
	}

	/**
	 * @generated
	 */
	public MOperatingSystemAPI basicGetOsapi() {
		return osapi;
	}

	/**
	 * @generated
	 */
	public void setOsapi(MOperatingSystemAPI newOsapi) {
		MOperatingSystemAPI oldOsapi = osapi;
		osapi = newOsapi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__OSAPI, oldOsapi, osapi));
	}

	/**
	 * @generated
	 */
	public MOperatingSystem getOs() {
		if (os != null && os.eIsProxy()) {
			InternalEObject oldOs = (InternalEObject)os;
			os = (MOperatingSystem)eResolveProxy(oldOs);
			if (os != oldOs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__OS, oldOs, os));
			}
		}
		return os;
	}

	/**
	 * @generated
	 */
	public MOperatingSystem basicGetOs() {
		return os;
	}

	/**
	 * @generated
	 */
	public void setOs(MOperatingSystem newOs) {
		MOperatingSystem oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__OS, oldOs, os));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__ARCHITECTURE, oldArchitecture, architecture));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__ARCHITECTURE, oldArchitecture, architecture));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__COMPILER, oldCompiler, compiler));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__COMPILER, oldCompiler, compiler));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__MICROPROCESSOR, oldMicroprocessor, microprocessor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__MICROPROCESSOR, oldMicroprocessor, microprocessor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__BOARD, oldBoard, board));
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
			eNotify(new ENotificationImpl(this, Notification.SET, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__BOARD, oldBoard, board));
	}

	/**
	 * @generated
	 */
	public EList<MLanguage> getLanguages() {
		if (languages == null) {
			languages = new EObjectResolvingEList<MLanguage>(MLanguage.class, this, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__LANGUAGES);
		}
		return languages;
	}

	/**
	 * @generated
	 */
	public EList<MSwPackageRequiredInterface> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<MSwPackageRequiredInterface>(MSwPackageRequiredInterface.class, this, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__REQUIRES);
		}
		return requires;
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MParameter>(MParameter.class, this, mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__PARAMETERS:
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
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__OSAPI:
				if (resolve) return getOsapi();
				return basicGetOsapi();
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__OS:
				if (resolve) return getOs();
				return basicGetOs();
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__ARCHITECTURE:
				if (resolve) return getArchitecture();
				return basicGetArchitecture();
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__COMPILER:
				if (resolve) return getCompiler();
				return basicGetCompiler();
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__MICROPROCESSOR:
				if (resolve) return getMicroprocessor();
				return basicGetMicroprocessor();
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__BOARD:
				if (resolve) return getBoard();
				return basicGetBoard();
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__LANGUAGES:
				return getLanguages();
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__REQUIRES:
				return getRequires();
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__PARAMETERS:
				return getParameters();
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
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__OSAPI:
				setOsapi((MOperatingSystemAPI)newValue);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__OS:
				setOs((MOperatingSystem)newValue);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__ARCHITECTURE:
				setArchitecture((MArchitecture)newValue);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__COMPILER:
				setCompiler((MCompiler)newValue);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__MICROPROCESSOR:
				setMicroprocessor((MMicroprocessor)newValue);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__BOARD:
				setBoard((MBoard)newValue);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends MLanguage>)newValue);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends MSwPackageRequiredInterface>)newValue);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MParameter>)newValue);
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
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__OSAPI:
				setOsapi((MOperatingSystemAPI)null);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__OS:
				setOs((MOperatingSystem)null);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__ARCHITECTURE:
				setArchitecture((MArchitecture)null);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__COMPILER:
				setCompiler((MCompiler)null);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__MICROPROCESSOR:
				setMicroprocessor((MMicroprocessor)null);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__BOARD:
				setBoard((MBoard)null);
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__LANGUAGES:
				getLanguages().clear();
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__REQUIRES:
				getRequires().clear();
				return;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__PARAMETERS:
				getParameters().clear();
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
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__OSAPI:
				return osapi != null;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__OS:
				return os != null;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__ARCHITECTURE:
				return architecture != null;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__COMPILER:
				return compiler != null;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__MICROPROCESSOR:
				return microprocessor != null;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__BOARD:
				return board != null;
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__REQUIRES:
				return requires != null && !requires.isEmpty();
			case mespswpPackage.MSW_PACKAGE_SUPPORTED_PLATFORM__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}