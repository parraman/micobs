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
package es.uah.aut.srg.modeling.util.xpand;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.xpand2.output.FileHandleImpl;
import org.eclipse.xpand2.output.Outlet;

/**
 * Modification of the class {@link FileHandleImpl} to store the generated
 * output into a {@link StringBuilder} object instead of into regular files. 
 *
 */
public class StringFileHandle extends FileHandleImpl {
	
	private final Log log =
			LogFactory.getLog(getClass());
	
	private StringBuilder outputBuffer = null;
	private String absolutePath = null;
	
	public StringFileHandle(final Outlet outlet, final String absolutePath, final StringBuilder outputBuffer) {
		
		super(outlet, null);
		this.outputBuffer = outputBuffer;
		this.absolutePath = absolutePath;

	}

	@Override
	public String getAbsolutePath() {
		return absolutePath;
	}

	@Override
	public void writeAndClose() {

		if (!isOverwrite() && outputBuffer.length() != 0) {
			if (log.isDebugEnabled()) {
			log.debug("Skipping buffer : " + getAbsolutePath() + " cause it is not empty");
			}
			return;
		}
		if (log.isDebugEnabled()) {
		log.debug("Saving buffer : " + getAbsolutePath());
		}
		
		getOutlet().beforeWriteAndClose(this);
		if (getOutlet().shouldWrite(this)) 
		{
			if (isAppend() == true)
			{
				outputBuffer.append(getBytes());
			}
			else
			{
				outputBuffer.insert(0, getBytes());
			}
		}

	}

	@Override
	@Deprecated
	public File getTargetFile() {
		return null;
	}

}
