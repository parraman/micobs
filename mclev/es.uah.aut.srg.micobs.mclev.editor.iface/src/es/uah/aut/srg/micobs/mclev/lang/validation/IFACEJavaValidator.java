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

import org.eclipse.xtext.validation.Check;

import es.uah.aut.srg.micobs.mclev.mcleviface.MInterface;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifacePackage;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVStringHelper;
import es.uah.aut.srg.micobs.mclev.util.impl.MCLEVUtil;
 

public class IFACEJavaValidator extends AbstractIFACEJavaValidator {

	/**
	 * Checks that the types of the interfaces extended by an interface match
	 * the type of the new interface or are one of the types from which they
	 * inherit. Implements Restriction 65.
	 * 
	 * @param iface the interface to check.
	 */
	@Check
	public void checkMInterface_ExtendedInterfacesType(MInterface iface)
	{
		if (iface.getExtends().isEmpty())
		{
			return;
		}
		int i = 0;
		for (MInterface eiface : iface.getExtends())
		{
			if (eiface.eIsProxy() == true)
			{
				i++;
				continue;
			}
			if (iface.getType() != eiface.getType() &&
				MCLEVUtil.getDefault().getInheritedInterfaceTypes(iface.getType()).contains(eiface.getType()) == false)
			{
				error("Interface type " +
					  MCLEVStringHelper.getDefault().getFullObjectNameToElement(eiface.getType()) +
					  " is not supported by the selected type of interface",
					  mclevifacePackage.eINSTANCE.getMInterface_Extends(), i);
			}
			i++;
		}
	}
}
