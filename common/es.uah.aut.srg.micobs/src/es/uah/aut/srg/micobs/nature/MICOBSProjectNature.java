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
package es.uah.aut.srg.micobs.nature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * MICOBS Project nature class.
 *
 */
public class MICOBSProjectNature implements IProjectNature {

	private IProject project;
	
	/**
	 * The MICOBS project nature ID.
	 */
	public static final String NATURE_ID = "es.uah.aut.srg.micobs.nature.project";
	
	@Override
	public void configure() throws CoreException {

	}

	@Override
	public void deconfigure() throws CoreException {

	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}
	
	/**
	 * Adds the MICOBS nature to a given project.
	 * @param project the project.
	 */
	public static void addNature(IProject project) 
	{ 
		if (!project.isOpen())
			return;
		
		IProjectDescription description;
		
		try {
			description = project.getDescription();
		} catch (CoreException e) {
			MICOBSPlugin.INSTANCE.log(e); 
			return;
		}
		
		List<String> newIds = new ArrayList<String>(); 
		newIds.addAll(Arrays.asList(description.getNatureIds())); 
		
		int index = newIds.indexOf(NATURE_ID);
		
		if (index != -1)
		{
			return;
		}
		
		newIds.add(NATURE_ID); 
		description.setNatureIds(newIds.toArray(new String[newIds.size()]));
		
		try {
			project.setDescription(description, null);
		} catch (CoreException e) {
			MICOBSPlugin.INSTANCE.log(e); 
		}
	}
	
	/**
	 * Returns whether a project has the MICOBS project nature or not.
	 * @param project the project to check.
	 * @return <code>true</code> if the project has the MICOBS nature or
	 * 		   <code>false</code> otherwise.
	 */
	public static boolean hasNature(IProject project) 
	{ 
		try {
			return project.isOpen() && project.hasNature(NATURE_ID);
		} catch (CoreException e) {
			MICOBSPlugin.INSTANCE.log(e); 
			return false;
		}
	}
	
	/**
	 * Removes the MICOBS nature from a given project.
	 * @param project the project.
	 */
	public static void removeNature(IProject project) 
	{ 
		if (!project.isOpen()) {
			return;
		}

		IProjectDescription description; 
		
		try {
			description = project.getDescription();
		} catch (CoreException e) {
			MICOBSPlugin.INSTANCE.log(e); 
			return;
		}
		
		List<String> newIds = new ArrayList<String>(); 
		newIds.addAll(Arrays.asList(description.getNatureIds())); 
		
		int index = newIds.indexOf(NATURE_ID); 
		
		if (index == -1)
		{
			return;
		} 
		
		newIds.remove(index); 
		description.setNatureIds(newIds.toArray(new String[newIds.size()]));
		
		try {
			project.setDescription(description, null);
		} catch (CoreException e) {
			MICOBSPlugin.INSTANCE.log(e); 
		}
	}

}
