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
package es.uah.aut.srg.modeling.util.string;

public class StringHelper {
	
	/**
	 * Returns the delimiter used to separate the strings. The delimiter should
	 * be a one-character string.
	 * @return the delimiter.
	 */
	protected static String getDelimiter()
	{
		return "_";
	}
	
	/**
	 * Concatenates a set of strings substituting all the blanks and non-letter
	 * characters by the delimiter (see {@link #getDelimiter()}). The input
	 * strings are concatenated using the same delimiter character.
	 * 
	 * @param strings the list of strings.
	 * @return the concatenated string.
	 */
	public static String toDefString(String ...strings)
	{
		String result = strings[0];
		for (int i = 1; i < strings.length; i++)
		{
			result += getDelimiter() + strings[i];
		}
		
		return result.replaceAll("\\(", getDelimiter()).replaceAll("\\)", getDelimiter()).replaceAll(" ", getDelimiter()).replaceAll("\\/", getDelimiter()).replaceAll("\\.", getDelimiter()).replaceAll("-", getDelimiter()).replaceAll(":", getDelimiter()).replaceAll("([" + getDelimiter() + "]+)", getDelimiter()).replaceAll("([" + getDelimiter() + "]+)$", "");		
	}

	/**
	 * Returns the same string as {@link #toDefString} but with small letters.
	 * @param strings the list of strings.
	 * @return the concatenated string with small letters.
	 */
	public static String toLowerDefString(String ... strings)
	{
		return toDefString(strings).toLowerCase();
	}
	
	/**
	 * Returns the same string as {@link #toDefString} but with capital letters.
	 * @param strings the list of strings.
	 * @return the concatenated string with capital letters.
	 */
	public static String toUpperDefString(String ... strings)
	{
		return toDefString(strings).toUpperCase();
	}

}
