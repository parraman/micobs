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
package es.uah.aut.srg.micobs.mclev.domain.edroom.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.common.MIntegerParameter;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMProtocol;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.EDROOMReplyMessage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.edroomprot.edroomprotPackage;
import es.uah.aut.srg.micobs.mclev.domain.edroom.library.edroomlibrary.manager.EDROOMLibraryManager;
import es.uah.aut.srg.micobs.mclev.domain.edroom.plugin.EDROOMPlugin;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;
import es.uah.aut.srg.micobs.mclev.mclevdom.MConnector;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODAbstractComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODComponentType;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance;
import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.util.IParameterAssignmentResolver;

/**
 * Class with a set of static functions and labels used during the generation
 * process. These functions are used to obtain different static models from
 * the MESP and MCLEV libraries. These models shall be already present in the
 * library before accessing these methods.
 * 
 * Also, the class provides methods to help in the transformation process
 * between the MCLEV and MESP models.
 *
 */
public class EDROOMUtil {

	public static final EDROOMUtil INSTANCE = new EDROOMUtil();

	public static final String EDROOM_DOMAIN_URI = "es.uah.aut.srg.micobs.mclev.domains.EDROOM";
	public static final String EDROOM_DOMAIN_VERSION = "v1";
	public static final String EDROOM_CPP_COMPONENT_TYPE_NAME = "EDROOMCPPComponent";
	public static final String EDROOM_STARTUP_PRIORITY_ATTRIBUTE_NAME = "startup_priority";
	public static final String EDROOM_STACK_SIZE_ATTRIBUTE_NAME = "stack_size";
	public static final String EDROOM_MSG_QUEUE_DIMENSION_ATTRIBUTE_NAME = "msg_queue_dimension";
	public static final String EDROOM_CONNECTOR_NAME = "EDROOMConnector";

	private MIODomain edroom = null;
	private MIODComponentType edroomCPPComponentType = null;
	private MConnector edroomConnector = null;

	/**
	 * Returns the model element corresponding to the EDROOM domain. If the model
	 * is not present in the library (mainly due to an error), the method will
	 * return <code>null</code>.
	 * 
	 * @return the model element corresponding to the EDROOM 
	 * 		   implementation-oriented domain.
	 */
	public MIODomain getEDROOMDomain()
	{
		if (edroom == null)
		{
			try {
				MCommonPackageElement element =
						MCLEVLibraryManager.getLibraryManager().getElement(
								mclevdomPackage.eINSTANCE.getMIODomain(),
								EDROOM_DOMAIN_URI, EDROOM_DOMAIN_VERSION);
				if (element != null &&
					element instanceof MIODomain)
				{
					edroom = (MIODomain) element;
				}
			} catch (LibraryManagerException e) {
				EDROOMPlugin.INSTANCE.log(e);
			}
		}
		return edroom;
	}

	/**
	 * Returns the object corresponding to the EDROOM CPP Component Type. 
	 * If the object cannot be found (mainly due to an error), the method will
	 * return <code>null</code>.
	 * 
	 * @return the object corresponding to the EDROOM CPP Component Type. 
	 */
	public MIODComponentType getEDROOMCPPComponentType()
	{
		if (edroomCPPComponentType == null)
		{
			if (getEDROOMDomain() != null)
			{
				for (MIODAbstractComponentType actype :
						getEDROOMDomain().getComponentTypes())
				{
					if (actype.getName().matches(EDROOM_CPP_COMPONENT_TYPE_NAME) &&
						actype instanceof MIODComponentType)
					{
						edroomCPPComponentType = (MIODComponentType) actype;
						break;
					}
				}
			}
		}
		return edroomCPPComponentType;
	}

	/**
	 * Returns the object corresponding to the generic EDROOM connector. 
	 * If the object cannot be found (mainly due to an error), the method will
	 * return <code>null</code>.
	 * 
	 * @return the object corresponding to the generic EDROOM connector. 
	 */
	public MConnector getEDROOMConnector()
	{
		if (edroomConnector == null)
		{
			if (getEDROOMDomain() != null)
			{
				for (MConnector conn :
					getEDROOMDomain().getConnectors())
				{
					if (conn.getName().matches(EDROOM_CONNECTOR_NAME))
					{
						edroomConnector = conn;
						break;
					}
				}
			}
		}
		return edroomConnector;
	}

	/**
	 * Returns the value of a given integer parameter after applying a
	 * collection of parameter value assignments.
	 * 
	 * @param name the name of the parameter.
	 * @param vas the collection of value assignments.
	 * @param attributes the complete collection of attributes that can be
	 * 	      referenced from the value assignment expressions.
	 * 
	 * @return the final value of the parameter.
	 */
	public Long getParameter(String name, final Collection<MParameterValueAssignment> vas,
			final Collection<MParameter> attributes) {

		final Map<MParameter, MParameterValueAssignment> vamap = new HashMap<MParameter, MParameterValueAssignment>();
		for (MParameterValueAssignment va : vas)
		{
			vamap.put(va.getParameter(), va);
		}

		for (final MParameterValueAssignment va : vas)
		{
			if (va.getParameter() != null &&
				va.getParameter().getName().matches(name))
			{
				return MCLEVUtil.getDefault().parseIntegerExpression(MCLEVUtil.getDefault().getParameterValue(va), new IParameterAssignmentResolver() {

					@Override
					public MParameter getParameter() {
						return va.getParameter();
					}

					@Override
					public MParameterValueExpression getAssignmentExpression(
							MParameter parameter) {
						return (vamap.get(parameter) == null) ? null :
							    MCLEVUtil.getDefault().getParameterValue(vamap.get(parameter));
					}
				});
			}
		}

		for (MParameter parameter : attributes)
		{
			if (parameter instanceof MIntegerParameter &&
				parameter.getName().matches(name))
			{
				final MIntegerParameter param = (MIntegerParameter)parameter;
				return MCLEVUtil.getDefault().parseIntegerExpression(MCLEVUtil.getDefault().getDefaultValue(param), new IParameterAssignmentResolver() {

					@Override
					public MParameter getParameter() {
						return param;
					}

					@Override
					public MParameterValueExpression getAssignmentExpression(
							MParameter parameter) {
						return (vamap.get(parameter) == null) ? null :
							    MCLEVUtil.getDefault().getParameterValue(vamap.get(parameter));
					}
				});
			}
		}
		return null;

	}

	
	/**
	 * Returns the final value of the startup priority attribute of a
	 * component instance.
	 * 
	 * @param inst the component instance.
	 * @return the integer value corresponding to the startup priority.
	 */
	public Long getEDROOMStartupPriority(MFlatComponentInstance inst)
	{
		if (inst.getComponent() == null ||
			inst.getComponent().getType() == null ||
			inst.getComponent().getType() != getEDROOMCPPComponentType())
		{
			return null;
		}

		return getParameter(EDROOM_STARTUP_PRIORITY_ATTRIBUTE_NAME,
				inst.getAttributeValueAssignments(), inst.getComponent().getAttributes());
	}

	/**
	 * Returns the final value of the stack size attribute of a
	 * component instance.
	 * 
	 * @param inst the component instance.
	 * @return the integer value corresponding to the stack size.
	 */
	public Long getEDROOMStackSize(MFlatComponentInstance inst)
	{
		if (inst.getComponent() == null ||
			inst.getComponent().getType() == null ||
			inst.getComponent().getType() != getEDROOMCPPComponentType())
		{
			return null;
		}

		return getParameter(EDROOM_STACK_SIZE_ATTRIBUTE_NAME,
				inst.getAttributeValueAssignments(), inst.getComponent().getAttributes());
	}

	/**
	 * Returns the final value of the message queue size attribute of a
	 * component instance.
	 * 
	 * @param inst the component instance.
	 * @return the integer value corresponding to the message queue size.
	 */
	public Long getEDROOMMsgQueueDimension(MFlatComponentInstance inst)
	{
		if (inst.getComponent() == null ||
			inst.getComponent().getType() == null ||
			inst.getComponent().getType() != getEDROOMCPPComponentType())
		{
			return null;
		}

		return getParameter(EDROOM_MSG_QUEUE_DIMENSION_ATTRIBUTE_NAME,
				inst.getAttributeValueAssignments(), inst.getComponent().getAttributes());
	}

	
	/**
	 * Returns the EDROOM protocol model corresponding to a given MCLEV
	 * interface. The method will look up for the protocol model in the
	 * library. If the model cannot be found, the method will return
	 * <code>null</code>.
	 * 
	 * @param iface the interface.
	 * @return the protocol model corresponding to the interface or
	 * 		   <code>null</code> if the model could not be found.
	 */
	public EDROOMProtocol getEDROOMProtocolOfInterface(MInterface iface)
	{
		try {
			return (EDROOMProtocol) EDROOMLibraryManager.getLibraryManager().
					getReferencingElement(iface, edroomprotPackage.eINSTANCE.getEDROOMProtocol());
		} catch (LibraryManagerException e) {
			EDROOMPlugin.INSTANCE.log(e);
			return null;
		}
	}

	/**
	 * Returns the set of input reply messages defined by a given protocol.
	 * 
	 * @param protocol the protocol.
	 * @return the set of input reply messages.
	 */
	public Set<EDROOMReplyMessage> getInputReplyMessages(EDROOMProtocol protocol)
	{
		Set<EDROOMReplyMessage> replies = new HashSet<EDROOMReplyMessage>();

		for (EDROOMMessage message : protocol.getInputMessages())
		{
			if (message instanceof EDROOMReplyMessage)
			{
				replies.add((EDROOMReplyMessage) message);
			}
		}
		return replies;
	}

	/**
	 * Returns the complete set of input reply messages defined by a given
	 * protocol, including the ones defined by the protocols it extends.
	 * 
	 * @param protocol the protocol.
	 * @return the set of input reply messages.
	 */
	public Set<EDROOMReplyMessage> getAllInputReplyMessages(EDROOMProtocol protocol)
	{
		Set<EDROOMReplyMessage> replies = getInputReplyMessages(protocol);

		for (EDROOMProtocol eprot : protocol.getExtends())
		{
			replies.addAll(getAllInputReplyMessages(eprot));
		}
		return replies;
	}

	/**
	 * Returns the set of output reply messages defined by a given protocol.
	 * 
	 * @param protocol the protocol.
	 * @return the set of output reply messages.
	 */
	public Set<EDROOMReplyMessage> getOutputReplyMessages(EDROOMProtocol protocol)
	{
		Set<EDROOMReplyMessage> replies = new HashSet<EDROOMReplyMessage>();

		for (EDROOMMessage message : protocol.getOutputMessages())
		{
			if (message instanceof EDROOMReplyMessage)
			{
				replies.add((EDROOMReplyMessage) message);
			}
		}

		return replies;
	}

	/**
	 * Returns the complete set of output reply messages defined by a given
	 * protocol, including the ones defined by the protocols it extends.
	 * 
	 * @param protocol the protocol.
	 * @return the set of output reply messages.
	 */
	public Set<EDROOMReplyMessage> getAllOutputReplyMessages(EDROOMProtocol protocol)
	{
		Set<EDROOMReplyMessage> replies = getOutputReplyMessages(protocol);

		for (EDROOMProtocol eprot : protocol.getExtends())
		{
			replies.addAll(getAllOutputReplyMessages(eprot));
		}
		return replies;
	}

	/**
	 * Returns the software package model from a given component.
	 * This method will locate the library entry of the MCLEV model and then
	 * check if the fields referencing the MESP model element are defined. If
	 * so, it will locate the model on the MESP library and return it if
	 * present. If the model cannot be located, the method will return
	 * <code>null</code>.
	 * 
	 * @param cmp the component.
	 * @return the software package corresponding to the component.
	 */
	public MSwPackage getSwPackageOfComponent(MComponent cmp)
	{
		if (cmp == null)
		{
			return null;
		}
		MCommonPackageVersionedItem vitem = null;

		try {
			vitem = MCLEVLibraryManager.getLibraryManager().getVersionedItem(cmp);
		} catch (LibraryManagerException e) {
			EDROOMPlugin.INSTANCE.log(e);
			return null;
		}

		if (vitem == null || !(vitem instanceof MMCLEVVersionedItemComponent))
		{
			return null;
		}

		MMCLEVVersionedItemComponent vicmp = (MMCLEVVersionedItemComponent) vitem;
		if (vicmp.getSwPackageURI() == null ||
			vicmp.getSwPackageURI() == "" ||
			vicmp.getSwPackageVersion() == null ||
			vicmp.getSwPackageVersion() == "")
		{
			return null;
		}

		MCommonPackageElement element = null;
		try {
			element = MESPLibraryManager.getLibraryManager().getElement(mespswpPackage.eINSTANCE.getMSwPackage(),
					vicmp.getSwPackageURI(), vicmp.getSwPackageVersion());
		} catch (LibraryManagerException e) {
			EDROOMPlugin.INSTANCE.log(e);
			return null;
		}

		if (element == null ||
			!(element instanceof MSwPackage))
		{
			return null;
		}

		return (MSwPackage)element;
	}
	
	/**
	 * Returns the driver software package model from a given driver service
	 * library. This method will locate the library entry of the MCLEV model
	 * and then check if the fields referencing the MESP model element are 
	 * defined. If so, it will locate the model on the MESP library and return
	 * it if present. If the model cannot be located, the method will return
	 * <code>null</code>.
	 * 
	 * @param drvslib the driver service library.
	 * @return the driver software package corresponding to the service library.
	 */
	public static MDriverSwPackage getSwPackageOfDriverServiceLibrary(MDriverServiceLibrary drvslib)
	{
		if (drvslib == null)
		{
			return null;
		}
		MCommonPackageVersionedItem vitem = null;
		
		try {
			vitem = MCLEVLibraryManager.getLibraryManager().getVersionedItem(drvslib);
		} catch (LibraryManagerException e) {
			EDROOMPlugin.INSTANCE.log(e);
			return null;
		}
		
		if (vitem == null || !(vitem instanceof MMCLEVVersionedItemDriverServiceLibrary))
		{
			return null;
		}
		
		MMCLEVVersionedItemDriverServiceLibrary vislib = (MMCLEVVersionedItemDriverServiceLibrary) vitem;
		if (vislib.getSwPackageURI() == null ||
			vislib.getSwPackageURI() == "" ||
			vislib.getSwPackageVersion() == null ||
			vislib.getSwPackageVersion() == "")
		{
			return null;
		}
		
		MCommonPackageElement element = null;
		try {
			element = MESPLibraryManager.getLibraryManager().getElement(
					mespswpPackage.eINSTANCE.getMDriverSwPackage(),
					vislib.getSwPackageURI(), vislib.getSwPackageVersion());
		} catch (LibraryManagerException e) {
			EDROOMPlugin.INSTANCE.log(e);
			return null;
		}
		
		if (element == null ||
			!(element instanceof MDriverSwPackage))
		{
			return null;
		}
		
		return (MDriverSwPackage)element;
	}

	/**
	 * Returns the software package model from a given regular service library.
	 * This method will locate the library entry of the MCLEV model and then
	 * check if the fields referencing the MESP model element are defined. If
	 * so, it will locate the model on the MESP library and return it if
	 * present. If the model cannot be located, the method will return
	 * <code>null</code>.
	 * 
	 * @param slib the service library.
	 * @return the software package corresponding to the service library.
	 */
	public MSwPackage getSwPackageOfServiceLibrary(MServiceLibrary slib)
	{
		if (slib == null)
		{
			return null;
		}
		MCommonPackageVersionedItem vitem = null;

		try {
			vitem = MCLEVLibraryManager.getLibraryManager().getVersionedItem(slib);
		} catch (LibraryManagerException e) {
			EDROOMPlugin.INSTANCE.log(e);
			return null;
		}

		if (vitem == null || !(vitem instanceof MMCLEVVersionedItemServiceLibrary))
		{
			return null;
		}

		MMCLEVVersionedItemServiceLibrary vislib = (MMCLEVVersionedItemServiceLibrary) vitem;
		if (vislib.getSwPackageURI() == null ||
			vislib.getSwPackageURI() == "" ||
			vislib.getSwPackageVersion() == null ||
			vislib.getSwPackageVersion() == "")
		{
			return null;
		}

		MCommonPackageElement element = null;
		try {
			element = MESPLibraryManager.getLibraryManager().getElement(
					mespswpPackage.eINSTANCE.getMSwPackage(),
					vislib.getSwPackageURI(), vislib.getSwPackageVersion());
		} catch (LibraryManagerException e) {
			EDROOMPlugin.INSTANCE.log(e);
			return null;
		}

		if (element == null ||
			!(element instanceof MSwPackage))
		{
			return null;
		}

		return (MSwPackage)element;
	}

}
