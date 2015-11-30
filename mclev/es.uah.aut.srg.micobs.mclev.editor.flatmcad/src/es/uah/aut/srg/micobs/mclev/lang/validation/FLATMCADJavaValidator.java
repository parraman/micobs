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
package es.uah.aut.srg.micobs.mclev.lang.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MClientPort;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatComponentInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatConnection;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatServiceLibraryInstance;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;
import es.uah.aut.srg.micobs.xtext.MICOBSAbstractJavaValidator;
import es.uah.aut.srg.modeling.util.string.StringHelper;
 

public class FLATMCADJavaValidator extends MICOBSAbstractJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/mclev/mclevflatmcad"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://srg.aut.uah.es/micobs/common"));
		return result;
	}
	
	@Override
	public ILibraryManager getFileLibraryManager()
			throws LibraryManagerException {
		return MCLEVLibraryManager.getLibraryManager();
	}

	@Override
	public Collection<ILibraryManager> getImportLibraryManagers()
			throws LibraryManagerException {
		Collection<ILibraryManager> importLibraries = new ArrayList<ILibraryManager>();
		importLibraries.add(MCLEVLibraryManager.getLibraryManager());
		importLibraries.add(PDLLibraryManager.getLibraryManager());
		return importLibraries;
	}
	
	/**
	 * Checks that there are not service libraries deployed twice in the root
	 * of an MCAD model.
	 * @param target The target to check.
	 */
	@Check
	public void checkMFlatServiceLibraryInstancesList_DuplicatedServiceLibraries(MFlatMCADTarget target)
	{
		Set<MServiceLibrary> libraries = new HashSet<MServiceLibrary>();
		
		int i = 0;
		for (MFlatServiceLibraryInstance slinst : target.getLibraries())
		{
			if (slinst.getLibrary() == null ||
				slinst.getLibrary().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (libraries.add(slinst.getLibrary()) == false)
			{
				error("Duplicated service library: " +
					  MCLEVStringHelper.getDefault().getElementName(slinst.getLibrary()), target,
					  mclevflatmcadPackage.eINSTANCE.getMFlatMCADTarget_Libraries(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated assignments on the same attribute
	 * of a plain connection.
	 * Implements Restriction TBC.
	 * @param conn The connection to check.
	 */
	@Check
	public void checkMFlatConnection_DuplicatedAttributeAssignment(MFlatConnection conn)
	{
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		int i = 0;
		for (MParameterValueAssignment va : conn.getAttributeValueAssignments())
		{
			if (va.getParameter() == null ||
					va.getParameter().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (attributes.add(va.getParameter()) == false)
			{
				error("Duplicated assignment on parameter: " +
					  MCLEVStringHelper.getDefault().getRelativeObjectName(va.getParameter()),
					  mclevflatmcadPackage.eINSTANCE.getMFlatConnection_AttributeValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated assignments on the same attribute
	 * of a component instance.
	 * Implements Restriction TBC.
	 * @param inst The connection to check.
	 */
	@Check
	public void checkMFlatComponentInstance_DuplicatedAttributeAssignment(MFlatComponentInstance inst)
	{
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		int i = 0;
		for (MParameterValueAssignment va : inst.getAttributeValueAssignments())
		{
			if (va.getParameter() == null ||
					va.getParameter().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (attributes.add(va.getParameter()) == false)
			{
				error("Duplicated assignment on parameter: " +
					  MCLEVStringHelper.getDefault().getRelativeObjectName(va.getParameter()),
					  mclevflatmcadPackage.eINSTANCE.getMFlatComponentInstance_AttributeValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are no duplicated assignments on the same attribute
	 * of a service library instance.
	 * Implements Restriction TBC.
	 * @param slib The connection to check.
	 */
	@Check
	public void checkMFlatServiceLibraryInstance_DuplicatedAttributeAssignment(MFlatServiceLibraryInstance slib)
	{
		Set<MParameter> attributes = new HashSet<MParameter>();
		
		int i = 0;
		for (MParameterValueAssignment va : slib.getAttributeValueAssignments())
		{
			if (va.getParameter() == null ||
					va.getParameter().eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (attributes.add(va.getParameter()) == false)
			{
				error("Duplicated assignment on parameter: " +
					  MCLEVStringHelper.getDefault().getRelativeObjectName(va.getParameter()),
					  mclevflatmcadPackage.eINSTANCE.getMFlatServiceLibraryInstance_AttributeValueAssignments(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that there are not two instances with the same name on a 
	 * deployment model.
	 * Implements Restriction 169m.
	 * @param target The target to check.
	 */
	@Check
	public void checkMFlatMCADTarget_DuplicatedInstanceName(MFlatMCADTarget target)
	{
		Set<String> names = new HashSet<String>();
		
		int i = 0;
		for (MFlatComponentInstance inst : target.getComponents())
		{
			if (names.add(StringHelper.toLowerDefString(inst.getName())) == false)
			{
				error("Duplicated instance name: " +
					  inst.getName(), target,
					  mclevflatmcadPackage.eINSTANCE.getMFlatMCADTarget_Components(), i);
			}
			i++;
		}
	}
	
	/**
	 * Checks that the connection is always done between different instances.
	 * Implements restriction 181.
	 * @param connection The connection to check.
	 */
	@Check
	public void checkMFlatConnection_differentInstances(MFlatConnection connection)
	{
		if (connection.getClientInstance() != null &&
			connection.getClientInstance().eIsProxy() == false &&
			connection.getServerInstance() != null &&
			connection.getServerInstance().eIsProxy() == false &&
			connection.getClientInstance() ==
			connection.getServerInstance())
		{
			error("Connections between ports of the same instance are not allowed",
					mclevflatmcadPackage.eINSTANCE.getMFlatConnection_ClientInstance());
		}
	}
	
	/**
	 * Checks that the client ports of all the components are connected once
	 * and only once.
	 * Implements restrictions 195 and 196.
	 * @param target The deployment model to check.
	 */
	@Check
	public void checkMFlatMCAD_checkDuplicatedClients(MFlatMCADTarget target)
	{
		Map<MFlatComponentInstance, Set<MClientPort>> connectedPortsMap = new HashMap<MFlatComponentInstance, Set<MClientPort>>();

		int i = 0;

		for (MFlatConnection conn : target.getConnections())
		{
			if (connectedPortsMap.get(conn.getClientInstance()) == null)
			{
				connectedPortsMap.put(conn.getClientInstance(), new HashSet<MClientPort>());
			}
			Set<MClientPort> cports = connectedPortsMap.get(conn.getClientInstance());
			
			if (cports.add(conn.getClientPort()) == false)
			{
				// This means that the client port was already connected
				error("Duplicated connection on the same client port",
					  mclevflatmcadPackage.eINSTANCE.getMFlatMCADTarget_Connections(), i);
			}
			i++;
		}
			
		// Now we have to check that every client port is connected
		i = 0;
		for (MFlatComponentInstance inst : target.getComponents())
		{
			if (inst.getComponent() == null)
			{
				i++;
				continue;
			}
			for (Iterator<MClientPort> p = MCLEVUtil.getDefault().getAllClientPorts(inst.getComponent()).iterator(); p.hasNext(); )
			{
				MClientPort port = p.next();
				if (MCLEVUtil.getDefault().isRelayPort(inst.getComponent(), port) == false &&
					(connectedPortsMap.get(inst) == null ||
					 connectedPortsMap.get(inst).contains(port) == false))
				{
					error("Unconnected client port " + port.getName(),
							mclevflatmcadPackage.eINSTANCE.getMFlatMCADTarget_Components(), i);
				}
			}
			i++;
		}
	}
	
	/**
	 * Checks that, if the connector reference of a connection is null, then
	 * the mapping reference shall also be null. It also checks that, if the
	 * mapping reference is null, then the interfaces of both connectors
	 * must be the same. If the mapping reference is not null, then the
	 * connected interfaces must be the ones defined by the interface mapping.
	 * Implements Restrictions TBC.
	 * @param ccnx The common component connection to check.
	 */
	@Check
	public void checkMFlatConnection_InterfaceMapping(MFlatConnection ccnx)
	{
		if (ccnx.getClientPort() == null ||
			ccnx.getClientPort().eIsProxy() == true ||
			ccnx.getServerPort() == null ||
			ccnx.getServerPort().eIsProxy() == true ||
			ccnx.getConnector() == null ||
			ccnx.getConnector().eIsProxy() == true ||
			(ccnx.getIfaceMapping() != null && ccnx.getIfaceMapping().eIsProxy() == true))
		{
			return;
		}
		
		
		if (ccnx.getIfaceMapping() == null &&
			ccnx.getClientPort().getInterface() != ccnx.getServerPort().getInterface() &&
			MCLEVUtil.getDefault().getExtendedInterfaces(ccnx.getServerPort().getInterface()).contains(ccnx.getClientPort().getInterface()) == false)
		{
			error("Interface mismatch." +
				  " If an interface mapping is not defined, the pair of interfaces at both sides of the connection must match",
			      mclevflatmcadPackage.eINSTANCE.getMFlatConnection_IfaceMapping());
		}
		if (ccnx.getIfaceMapping() != null && 
			(ccnx.getIfaceMapping().getInterfaces().contains(ccnx.getClientPort().getInterface()) == false ||
			 ccnx.getIfaceMapping().getInterfaces().contains(ccnx.getServerPort().getInterface()) == false))
		{
			error("The connected interfaces do not match with the ones defined by the selected interface mapping",
					mclevflatmcadPackage.eINSTANCE.getMFlatConnection_IfaceMapping());
		}
		
	}

}