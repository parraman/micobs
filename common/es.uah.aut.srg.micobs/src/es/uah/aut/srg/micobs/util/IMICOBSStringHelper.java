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
package es.uah.aut.srg.micobs.util;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;

/**
 * This interface defines a set of methods for managing strings related
 * to the MICOBS common model objects.
 *
 */
public interface IMICOBSStringHelper {
	
	/**
	 * The delimiter string that will be used to form the object names.
	 */
	public static final String OBJECT_DELIMITER = "::";

	/**
	 * Returns the full name of an element. This name is formed by adding
	 * to the URI of the element a dot '.', the name of the element and the
	 * version between brackets.
	 * @param element the element.
	 * @return the full name of the element.
	 */
	public String getFullElementName(MCommonPackageElement element);

	/**
	 * Returns the reference name of an element. This name is formed by the
	 * name given to the element plus its version between brackets.
	 * @param element the element.
	 * @return the reference name of the element.
	 */
	public String getElementName(MCommonPackageElement element);

	/**
	 * Returns the partial name of an object by moving upwards in its
	 * its containment tree until it has completed "index" steps or reaches
	 * its parent element. The parent element part is its name and version.
	 * 
	 * If index has a negative value, the function will reach the containment
	 * element and returns the full name of the object. If index is zero, the
	 * function will return the name of the object without the part of the
	 * containment element. If index is greater than zero, it will run the
	 * object's containment tree and compose the object's name from the 
	 * parent referenceable objects until reaching the parent element or
	 * completing the hops marked by the index parameter.
	 * 
	 * @param object the referenceable object from which to obtain the name.
	 * @param index the index containing the number of steps to hop in the
	 * 	            object's containment tree. 
	 * @return the partial name of the object.
	 */
	public String getPartialObjectNameToElement(MCommonReferenceableObj object,
			int index);

	/**
	 * Returns the full name of an object by moving upwards in its
	 * its containment tree until it reaches its parent element. The full
	 * name includes the reference name of the containing element.
	 * @param object the object.
	 * @return the full name of the object.
	 */
	public String getFullObjectNameToElement(MCommonReferenceableObj object);

	/**
	 * Returns the relative name of an object by moving upwards in its
	 * its containment tree until it reaches its parent element. The relative
	 * name does not include the reference name of the containing element.
	 * @see #getFullObjectNameToElement(MCommonReferenceableObj)
	 * @param object the object.
	 * @return the full name of the object.
	 */
	public String getRelativeObjectName(MCommonReferenceableObj object);

	/**
	 * Returns the partial name of an object by moving upwards in its
	 * its containment tree until it has completed "index" steps or reaches
	 * its parent element. The parent element part is just its name.
	 * 
	 * If index has a negative value, the function will reach the containment
	 * element and returns the full name of the object. If index is zero, the
	 * function will return the name of the object without the part of the
	 * containment element. If index is greater than zero, it will run the
	 * object's containment tree and compose the object's name from the 
	 * parent referenceable objects until reaching the parent element or
	 * completing the hops marked by the index parameter.
	 * 
	 * @param object The referenceable object from which to obtain the name.
	 * @param index The index containing the number of steps to hop in the
	 * 	            object's containment tree. 
	 * @return The partial name of the object.
	 */
	public String getPartialObjectNameToElementWithoutVersion(
			MCommonReferenceableObj object, int index);

	/**
	 * Returns the full name of an object by moving upwards in its
	 * its containment tree until it reaches its parent element. The full
	 * name includes the name (without the version) of the containing element.
	 * @see #getFullObjectNameToEleme
	 * @param object the object.
	 * @return the full name of the object without the version of the
	 * 		   containing element.
	 */
	public String getFullObjectNameToElementWithoutVersion(
			MCommonReferenceableObj object);

	/**
	 * Returns a string representation of a <code>float</code>
	 * without an exponent field.
	 * @param val the <code>float</code>.
	 * @return a string representation of the <code>float</code> without 
	 * an exponent field.
	 */
	public String toPlainString(Float val);
	
	/**
	 * Concatenates a set of strings substituting all the blanks and non-letter
	 * characters by a delimiter. The input strings are concatenated
	 * using the same delimiter character.
	 * 
	 * @param strings the list of strings.
	 * @return the concatenated string.
	 */
	public String toDefString(String ...strings);
	
	/**
	 * Returns the same string as {@link #toDefString} but with small letters.
	 * @param strings the list of strings.
	 * @return the concatenated string with small letters.
	 */
	public String toLowerDefString(String ... strings);
	
	/**
	 * Returns the same string as {@link #toDefString} but with capital letters.
	 * @param strings the list of strings.
	 * @return the concatenated string with capital letters.
	 */
	public String toUpperDefString(String ... strings);

}