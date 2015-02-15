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
package es.uah.aut.srg.micobs.ui.wizards;

import java.net.URI;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.IWizardPage;

/**
 * Public interface of the initial page/s that can be used to create
 * a MICOBS project. This kind of pages is used by the MICOBS
 * project creation wizard to ask for the main 
 *
 */
public interface IMICOBSProjectCreationPage extends IWizardPage {

	/**
	 * If the project will be created in a folder of an existing workspace
	 * project, this method will return the handle of the storing project.
	 * 
	 * @return the handle of the project or <code>null</code> if
	 * a new project will be created.
	 */
	IProject getProjectHandle();
	
	/**
	 * If the project will be created as part of an existing workspace
	 * project, this method will return the folder in which it will be
	 * stored.
	 * 
	 * @return the root folder of the project or <code>null</code> if
	 * a new project will be created.
	 */
	IContainer getRootFolder();
	
	/**
	 * If a new project is to be created, it returns the URI of the location
	 * where the new project will be stored. By default, this location will be
	 * the current workspace and, in this case, the method will return
	 * <code>null</code>.
	 * 
	 * @return the location where the project will be stored.
	 */
	URI getProjectLocationURI();

	/**
	 * Returns <code>true</code> if the project will be stored as a folder
	 * of an existing workspace project.
	 * 
	 * @return <code>true</code> if the project will be stored as a folder of
	 * an existing workspace project or <code>false</code> otherwise.
	 */
	boolean useExistingProject();

	/**
	 * Returns the name of the project.
	 * @return the name of the project.
	 */
	String getProjectName();
	
}
