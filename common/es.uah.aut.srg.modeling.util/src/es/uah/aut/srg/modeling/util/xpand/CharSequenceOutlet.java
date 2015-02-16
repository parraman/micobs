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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.VetoException;
import org.eclipse.xpand2.output.VetoStrategy;
import org.eclipse.xpand2.output.VetoStrategy2;

/**
 * Modification of the class {@link Outlet} to use strings instead of files
 * for storing the generated textual output of Xpand transformations. 
 *
 */
public class CharSequenceOutlet extends Outlet {

	Map<String, StringBuilder> buildersMap = new HashMap<String, StringBuilder>();
	
	public CharSequenceOutlet(String path)
	{
	    super(path);
	}
    
    public StringBuilder getStringBuffer(String name)
    {
    	return buildersMap.get(name);
    }

	@Override
	public FileHandle createFileHandle(String filePath) throws VetoException {
		
		StringBuilder builder = new StringBuilder();
		buildersMap.put(filePath, builder);
		
        StringFileHandle fileHandle = new StringFileHandle(this, filePath, builder);
        for (VetoStrategy vetoStrategy : vetoStrategies) {
        	if (vetoStrategy instanceof VetoStrategy2) {
        		if (((VetoStrategy2)vetoStrategy).hasVetoBeforeOpen(fileHandle)) {
        			throw new VetoException (filePath);
        		}
        	}
        }
        incFilesCreated();    
        return fileHandle;
        
	}
    
    
}
