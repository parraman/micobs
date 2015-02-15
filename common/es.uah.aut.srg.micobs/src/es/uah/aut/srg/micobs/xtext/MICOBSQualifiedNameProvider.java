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
package es.uah.aut.srg.micobs.xtext;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.util.IMICOBSStringHelper;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;

/**
 * MICOBS common elements Xtext qualified name provider. This class extends
 * the default Xtext qualified name provider, providing methods to create
 * the qualified names of elements and objects of the MICOBS models.
 *
 */
public class MICOBSQualifiedNameProvider extends 
	DefaultDeclarativeQualifiedNameProvider {
	
	/**
	 * Static class used to modify the default delimiter.
	 *
	 */
	public static class MICOBSDefaultNameConverter extends IQualifiedNameConverter.DefaultImpl {

		@Override
		public String getDelimiter() {
			return IMICOBSStringHelper.OBJECT_DELIMITER;
		}
		
	}
	
	/**
	 * Returns the qualified name of a package.
	 * @param pack the package.
	 * @return the qualified name of the package.
	 */
	public QualifiedName qualifiedName(MCommonPackage pack) {
		if (pack.getUri() == null)
			return null;
		else
			return getConverter().toQualifiedName(pack.getUri());
	  }
	
	/**
	 * Returns the qualified name of a MICOBS model element.
	 * @param element the element.
	 * @return the qualified name of the model element.
	 */
	public QualifiedName qualifiedName(MCommonPackageElement element) {
		if (element.getName() == null || element.getVersion() == null)
			return null;
		else
			return getConverter().toQualifiedName(MICOBSStringHelper.getInstance().getElementName(element));
	  }
	
	/**
	 * Returns the qualified name of a common referenceable object.
	 * @param object the object.
	 * @return the qualified name of the common referenceable object.
	 */
	public QualifiedName qualifiedName(MCommonReferenceableObj object)
	{	
		return getConverter().toQualifiedName(MICOBSStringHelper.getInstance().getFullObjectNameToElement(object));
	}

}
