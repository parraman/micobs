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
package es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageElement;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageFile;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMReplyMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMSendMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage;

/**
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 *
 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage
 * @generated
 */
public class edroomprotAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * @generated
	 */
	protected static edroomprotPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * @generated
	 */
	public edroomprotAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = edroomprotPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * @generated
	 */
	protected edroomprotSwitch<Adapter> modelSwitch =
		new edroomprotSwitch<Adapter>() {
			@Override
			public Adapter caseEDROOMProtocol(EDROOMProtocol object) {
				return createEDROOMProtocolAdapter();
			}
			@Override
			public Adapter caseEDROOMMessage(EDROOMMessage object) {
				return createEDROOMMessageAdapter();
			}
			@Override
			public Adapter caseEDROOMSendMessage(EDROOMSendMessage object) {
				return createEDROOMSendMessageAdapter();
			}
			@Override
			public Adapter caseEDROOMInvokeMessage(EDROOMInvokeMessage object) {
				return createEDROOMInvokeMessageAdapter();
			}
			@Override
			public Adapter caseEDROOMReplyMessage(EDROOMReplyMessage object) {
				return createEDROOMReplyMessageAdapter();
			}
			@Override
			public Adapter caseEDROOMPROTPackageFile(EDROOMPROTPackageFile object) {
				return createEDROOMPROTPackageFileAdapter();
			}
			@Override
			public Adapter caseEDROOMPROTPackageElement(EDROOMPROTPackageElement object) {
				return createEDROOMPROTPackageElementAdapter();
			}
			@Override
			public Adapter caseMCommonPackageElement(MCommonPackageElement object) {
				return createMCommonPackageElementAdapter();
			}
			@Override
			public Adapter caseMCommonPackageReferencingElement(MCommonPackageReferencingElement object) {
				return createMCommonPackageReferencingElementAdapter();
			}
			@Override
			public Adapter caseMCommonReferenceableObj(MCommonReferenceableObj object) {
				return createMCommonReferenceableObjAdapter();
			}
			@Override
			public Adapter caseMCommonPackageFile(MCommonPackageFile object) {
				return createMCommonPackageFileAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol <em>EDROOMProtocol</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol
	 * @generated
	 */
	public Adapter createEDROOMProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage <em>EDROOMMessage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage
	 * @generated
	 */
	public Adapter createEDROOMMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMSendMessage <em>EDROOMSendMessage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMSendMessage
	 * @generated
	 */
	public Adapter createEDROOMSendMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage <em>EDROOMInvokeMessage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMInvokeMessage
	 * @generated
	 */
	public Adapter createEDROOMInvokeMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMReplyMessage <em>EDROOMReplyMessage</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMReplyMessage
	 * @generated
	 */
	public Adapter createEDROOMReplyMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageFile <em>EDROOMPROTPackageFile</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageFile
	 * @generated
	 */
	public Adapter createEDROOMPROTPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageElement <em>EDROOMPROTPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMPROTPackageElement
	 * @generated
	 */
	public Adapter createEDROOMPROTPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageElement <em>MCommonPackageElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageElement
	 * @generated
	 */
	public Adapter createMCommonPackageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement <em>MCommonPackageReferencingElement</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageReferencingElement
	 * @generated
	 */
	public Adapter createMCommonPackageReferencingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonReferenceableObj <em>MCommonReferenceableObj</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonReferenceableObj
	 * @generated
	 */
	public Adapter createMCommonReferenceableObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.micobs.common.MCommonPackageFile <em>MCommonPackageFile</em>}'.
	 * @return the new adapter.
	 * @see es.uah.aut.srg.micobs.common.MCommonPackageFile
	 * @generated
	 */
	public Adapter createMCommonPackageFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

}
