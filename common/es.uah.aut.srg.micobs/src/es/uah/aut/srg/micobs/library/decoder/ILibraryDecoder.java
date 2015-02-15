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
package es.uah.aut.srg.micobs.library.decoder;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;

import es.uah.aut.srg.micobs.libdesc.MDescriptor;

/**
 * Interface that provides a standard method for decoding a library descriptor.
 *
 */
public interface ILibraryDecoder {

	/**
	 * Decodes a library descriptor. The method returns a {@link Diagnostic}
	 * object with the result of the decoding process.
	 * 
	 * @param descriptor the descriptor to be decoded.
	 * @param monitor the progress monitor that controls the execution process.
	 * @return the diagnostic of the decoding process.
	 */
	Diagnostic decodeDescriptor(MDescriptor descriptor, IProgressMonitor monitor);
	
}
