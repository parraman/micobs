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
package es.uah.aut.srg.micobs.library.ui.handlers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.command.AbortExecutionException;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import es.uah.aut.srg.micobs.common.MCommonLibrary;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.util.impl.KeysetManager;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Class that implements the command used to add a package to a library.
 *
 */
public class AddPackageCommand extends AbstractCommand {

    @Override
    public void dispose() 
    {
        super.dispose();
    }

    /**
     * This caches the label.
     */
    protected static final String LABEL = MICOBSPlugin.INSTANCE.getString("_UI_AddPackageCommand_label");

    /**
     * This caches the description.
     */
    protected static final String DESCRIPTION = MICOBSPlugin.INSTANCE.getString("_UI_AddPackageCommand_description");

    /**
     * This is the collection of objects being removed.
     */
    protected Collection<Object> collection;

    protected EditingDomain domain;

    protected ILibraryManager libraryManager;

    protected String packageName;

    /**
     * This constructs a primitive command to remove a collection of values from the specified feature of the owner.
     */
    public AddPackageCommand(EditingDomain domain, 
    		Collection<?> collection, 
    		ILibraryManager libraryManager)
    {
        super(LABEL, DESCRIPTION);
        this.domain = domain;
        
        // Initialize all the fields from the command parameter.
        //
        this.collection = collection == null ? null : new ArrayList<Object>(collection);
        this.libraryManager = libraryManager;
    }

    @Override
    protected boolean prepare() 
    {
        if (collection != null &&
                collection.size() == 1)
        {
            Iterator<?> i = collection.iterator();

            Object object = i.next();
            if (!(object instanceof MCommonLibrary) ||
                    (libraryManager == null))
            {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void execute() 
    {
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

        InputDialog libraryInput = new InputDialog(window.getShell(), "Package name", "New package name", null, new IInputValidator(){

            @Override
            public String isValid(String newText) 
            {
                if (newText.endsWith("."))
                {
                    return "Package name cannot end with a dot";
                }
                for (int i = 0; i < newText.length(); i++)
                {
                    char c = newText.charAt(i);
                    if ('a'<=c && c<='z') continue;
                    if ('0'<=c && c<='9') continue;
                    if (c=='.') continue;
                    if (c=='_') continue;
                    return "Wrong character set";
                }
                for (String s : newText.split("\\."))
                {
                	String t = s.trim();
                	if (KeysetManager.getKeysetManager().getKeywords().contains(t))
                	{
                		return t + " is a registered keyword";
                	}
                }

                if (libraryManager.getPackage(newText) != null)
                {
                    return "Package name already exists in the library";
                }
                return null;
            }
        });

        if (libraryInput.open() != Diagnostic.OK)
        {
            throw new AbortExecutionException();
        }
        packageName = libraryInput.getValue();
        
        try {
			libraryManager.addPackage(packageName);
		} catch (LibraryManagerException e) {
			MICOBSPlugin.INSTANCE.log(e);
			throw new AbortExecutionException();
		}

        URI libraryURI = libraryManager.getLibraryPlatformURI();

        if (libraryURI != null && libraryURI.isPlatformPlugin())
        {
            IPath newPackageFolder = libraryManager.getPlugin().getStateLocation().append(ILibraryManager.LIBRARY_FOLDER);
            newPackageFolder = newPackageFolder.append(ILibraryManager.PACKAGES_FOLDER);

            newPackageFolder = newPackageFolder.append(StringHelper.toLowerDefString(packageName));

            FileHelper.createFolder(newPackageFolder.toOSString());
        }
    }

    @Override
    public void undo() 
    {
        URI libraryURI = libraryManager.getLibraryPlatformURI();

        if (libraryURI != null && libraryURI.isPlatformPlugin())
        {
            IPath newPackageFolder = libraryManager.getPlugin().getStateLocation().append(ILibraryManager.LIBRARY_FOLDER);
            newPackageFolder = newPackageFolder.append(ILibraryManager.PACKAGES_FOLDER);

            newPackageFolder = newPackageFolder.append(StringHelper.toLowerDefString(packageName));

            FileHelper.deleteFolder(newPackageFolder.toOSString());
        }
        try {
			libraryManager.removePackage(packageName);
		} catch (LibraryManagerException e) {
			MICOBSPlugin.INSTANCE.log(e);
            throw new AbortExecutionException();
		}
    }

    @Override
    public void redo() 
    {  	
        try {
			libraryManager.addPackage(packageName);
		} catch (LibraryManagerException e) {
			MICOBSPlugin.INSTANCE.log(e);
            throw new AbortExecutionException();
		}

        URI libraryURI = libraryManager.getLibraryPlatformURI();

        if (libraryURI != null && libraryURI.isPlatformPlugin())
        {
            IPath newPackageFolder = libraryManager.getPlugin().getStateLocation().append(ILibraryManager.LIBRARY_FOLDER);
            newPackageFolder = newPackageFolder.append(ILibraryManager.PACKAGES_FOLDER);

            newPackageFolder = newPackageFolder.append(StringHelper.toLowerDefString(packageName));

            FileHelper.createFolder(newPackageFolder.toOSString());
        }
    }
}
