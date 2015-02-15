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
package es.uah.aut.srg.micobs.library;

/**
 * Library manager exception used to notify errors related to the
 * library management.
 *
 */
public class LibraryManagerException extends Exception {

	private static final long serialVersionUID = 7177181664993688450L;

	public LibraryManagerException(String cause)
	{
		super(cause);
	}
	
	public LibraryManagerException(String cause, Throwable t)
	{
		super(cause, t);
	}
}
