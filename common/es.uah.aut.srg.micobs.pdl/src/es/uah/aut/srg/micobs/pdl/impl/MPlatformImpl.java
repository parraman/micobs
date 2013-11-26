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
package es.uah.aut.srg.micobs.pdl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.pdl.MArchitecture;
import es.uah.aut.srg.micobs.pdl.MBoard;
import es.uah.aut.srg.micobs.pdl.MCompiler;
import es.uah.aut.srg.micobs.pdl.MMicroprocessor;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.pdlPackage;

/**
 * An implementation of the model object '<em><b>MPlatform</b></em>'.
 * 
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MPlatformImpl#getOsapi <em>OSAPI</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MPlatformImpl#getOs <em>OS</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MPlatformImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MPlatformImpl#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MPlatformImpl#getMicroprocessor <em>Microprocessor</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MPlatformImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link es.uah.aut.srg.micobs.pdl.impl.MPlatformImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MPlatformImpl extends MPDLPackageElementImpl implements MPlatform {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> parameters;

	/**
	 * @generated
	 */
	protected MPlatformImpl() {
		super();
	}

	/**
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pdlPackage.Literals.MPLATFORM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MPLATFORM__OSAPI, oldOsapi, osapi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MPLATFORM__OSAPI, oldOsapi, osapi));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MPLATFORM__OS, oldOs, os));
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
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MPLATFORM__OS, oldOs, os));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MPLATFORM__ARCHITECTURE, oldArchitecture, architecture));
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
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MPLATFORM__ARCHITECTURE, oldArchitecture, architecture));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MPLATFORM__COMPILER, oldCompiler, compiler));
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
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MPLATFORM__COMPILER, oldCompiler, compiler));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MPLATFORM__MICROPROCESSOR, oldMicroprocessor, microprocessor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MPLATFORM__MICROPROCESSOR, oldMicroprocessor, microprocessor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pdlPackage.MPLATFORM__BOARD, oldBoard, board));
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
			eNotify(new ENotificationImpl(this, Notification.SET, pdlPackage.MPLATFORM__BOARD, oldBoard, board));
	}

	/**
	 * @generated
	 */
	public EList<MParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MParameter>(MParameter.class, this, pdlPackage.MPLATFORM__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case pdlPackage.MPLATFORM__PARAMETERS:
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
			case pdlPackage.MPLATFORM__OSAPI:
				if (resolve) return getOsapi();
				return basicGetOsapi();
			case pdlPackage.MPLATFORM__OS:
				if (resolve) return getOs();
				return basicGetOs();
			case pdlPackage.MPLATFORM__ARCHITECTURE:
				if (resolve) return getArchitecture();
				return basicGetArchitecture();
			case pdlPackage.MPLATFORM__COMPILER:
				if (resolve) return getCompiler();
				return basicGetCompiler();
			case pdlPackage.MPLATFORM__MICROPROCESSOR:
				if (resolve) return getMicroprocessor();
				return basicGetMicroprocessor();
			case pdlPackage.MPLATFORM__BOARD:
				if (resolve) return getBoard();
				return basicGetBoard();
			case pdlPackage.MPLATFORM__PARAMETERS:
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
			case pdlPackage.MPLATFORM__OSAPI:
				setOsapi((MOperatingSystemAPI)newValue);
				return;
			case pdlPackage.MPLATFORM__OS:
				setOs((MOperatingSystem)newValue);
				return;
			case pdlPackage.MPLATFORM__ARCHITECTURE:
				setArchitecture((MArchitecture)newValue);
				return;
			case pdlPackage.MPLATFORM__COMPILER:
				setCompiler((MCompiler)newValue);
				return;
			case pdlPackage.MPLATFORM__MICROPROCESSOR:
				setMicroprocessor((MMicroprocessor)newValue);
				return;
			case pdlPackage.MPLATFORM__BOARD:
				setBoard((MBoard)newValue);
				return;
			case pdlPackage.MPLATFORM__PARAMETERS:
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
			case pdlPackage.MPLATFORM__OSAPI:
				setOsapi((MOperatingSystemAPI)null);
				return;
			case pdlPackage.MPLATFORM__OS:
				setOs((MOperatingSystem)null);
				return;
			case pdlPackage.MPLATFORM__ARCHITECTURE:
				setArchitecture((MArchitecture)null);
				return;
			case pdlPackage.MPLATFORM__COMPILER:
				setCompiler((MCompiler)null);
				return;
			case pdlPackage.MPLATFORM__MICROPROCESSOR:
				setMicroprocessor((MMicroprocessor)null);
				return;
			case pdlPackage.MPLATFORM__BOARD:
				setBoard((MBoard)null);
				return;
			case pdlPackage.MPLATFORM__PARAMETERS:
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
			case pdlPackage.MPLATFORM__OSAPI:
				return osapi != null;
			case pdlPackage.MPLATFORM__OS:
				return os != null;
			case pdlPackage.MPLATFORM__ARCHITECTURE:
				return architecture != null;
			case pdlPackage.MPLATFORM__COMPILER:
				return compiler != null;
			case pdlPackage.MPLATFORM__MICROPROCESSOR:
				return microprocessor != null;
			case pdlPackage.MPLATFORM__BOARD:
				return board != null;
			case pdlPackage.MPLATFORM__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

}
