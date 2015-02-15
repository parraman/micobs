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
package es.uah.aut.srg.micobs.util.impl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.util.IMICOBSStringHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Helper functions to manage strings of the MICOBS common classes.
 */
public class MICOBSStringHelper implements IMICOBSStringHelper {
	
	private static MICOBSStringHelper INSTANCE;
	
	/**
	 * Returns the singleton instance of the MICOBS string helper class.
	 * 
	 * @return the singleton instance.
	 */
	public static MICOBSStringHelper getInstance()
	{
		if (INSTANCE == null)
		{
			INSTANCE = new MICOBSStringHelper();
		}
		return INSTANCE;
	}
		
	@Override
	public String getFullElementName(MCommonPackageElement element)
	{
		return (element.getUri() + "(" + element.getVersion() + ")");
	}
	
	@Override
	public String getElementName(MCommonPackageElement element)
	{
		return (element.getName() + "(" + element.getVersion() + ")");
	}

	@Override
	public String getPartialObjectNameToElement(MCommonReferenceableObj object, int index)
	{
		String name = object.getName();
		
		EObject container = object.eContainer();
		
		int i = 1;
		
		for (;;)
		{
			if (container == null ||
				index == i)
			{
				return name;
			}
			else if (container instanceof MCommonPackageElement)
			{
				if (index != 0)
				{
					MCommonPackageElement tmp = (MCommonPackageElement)container;
					return getElementName(tmp) + OBJECT_DELIMITER + name;
				}
				else
				{
					return name;
				}
			}
			else if (container instanceof MCommonReferenceableObj)
			{
				MCommonReferenceableObj tmp = (MCommonReferenceableObj)container;
				if (index <= 0 || i < index)
				{
					name = tmp.getName() + OBJECT_DELIMITER + name;
					i++;
				}
				else
				{
					return tmp.getName() + OBJECT_DELIMITER + name;
				}
			}
			container = container.eContainer();
		}
	}
	
	@Override
	public String getFullObjectNameToElement(MCommonReferenceableObj object)
	{
		return getPartialObjectNameToElement(object, -1);
	}

	@Override
	public String getRelativeObjectName(MCommonReferenceableObj object)
	{
		return getPartialObjectNameToElement(object, 0);
	}
	
	@Override
	public String getPartialObjectNameToElementWithoutVersion(MCommonReferenceableObj object, int index)
	{
		String name = object.getName();
		
		EObject container = object.eContainer();
		
		int i = 1;
		
		for (;;)
		{
			if (container == null ||
				index == i)
			{
				return name;
			}
			else if (container instanceof MCommonPackageElement)
			{
				if (index != 0)
				{
					MCommonPackageElement tmp = (MCommonPackageElement)container;
					return tmp.getName() + OBJECT_DELIMITER + name;
				}
				else
				{
					return name;
				}
			}
			else if (container instanceof MCommonReferenceableObj)
			{
				MCommonReferenceableObj tmp = (MCommonReferenceableObj)container;
				if (index <= 0 || i < index)
				{
					name = tmp.getName() + OBJECT_DELIMITER + name;
					i++;
				}
				else
				{
					return tmp.getName() + OBJECT_DELIMITER + name;
				}
			}
			container = container.eContainer();
		}
	}

	@Override
	public String getFullObjectNameToElementWithoutVersion(MCommonReferenceableObj object)
	{
		return getPartialObjectNameToElementWithoutVersion(object, -1);
	}

	@Override
	public String toPlainString(Float val)
	{
		String str = BigDecimal.valueOf(val).toPlainString();
		if (str.split("[.]").length == 1)
		{
			str += ".0";
		}
		return str;
	}

	@Override
	public String toDefString(String... strings) {
		return StringHelper.toDefString(strings);
	}

	@Override
	public String toLowerDefString(String... strings) {
		return StringHelper.toLowerDefString(strings);
	}

	@Override
	public String toUpperDefString(String... strings) {
		return StringHelper.toUpperDefString(strings);
	}
	
}
