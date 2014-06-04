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
package es.uah.aut.srg.micobs.library.ui.handlers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import es.uah.aut.srg.micobs.common.MCommonPackage;
import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.libdesc.MDescriptorField;
import es.uah.aut.srg.micobs.libdesc.libdescFactory;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.adapter.IDependentLibrariesProvider;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapter;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapterFactory;
import es.uah.aut.srg.micobs.library.encoder.impl.LibraryEncoder;
import es.uah.aut.srg.micobs.library.ui.ConfirmElementsDeletion;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.util.impl.MICOBSStringHelper;
import es.uah.aut.srg.modeling.util.file.FileConverter;
import es.uah.aut.srg.modeling.util.file.FileHelper;
import es.uah.aut.srg.modeling.util.string.StringHelper;

/**
 * Class that implements the command that deletes items from the library.
 *
 */
public class DeletePackageItemCommand extends AbstractCommand {

    protected static final String LABEL = EMFEditPlugin.INSTANCE.getString("_UI_DeleteCommand_label");

    protected static final String DESCRIPTION = EMFEditPlugin.INSTANCE.getString("_UI_DeleteCommand_description");

    protected Collection<Object> collection;

    protected ILibraryManager mainLibraryManager;
    
    /**
     * This class is used to keep the information on the deleted data so that
     * the action can be undone.
     *
     */
    protected abstract class LibraryGhost {
    	
		public LibraryGhost() {
			super();
		}
    	
    };
    
    protected class PackageGhost extends LibraryGhost {

    	private String uri;

		public String getUri() {
			return uri;
		}
    	
		public PackageGhost(String uri) {
			super();
			this.uri = uri;
		}
    
    };
    
    protected class ElementGhost extends LibraryGhost {
    	
    	private EClass classifier;
    	private String uri;
    	private String version;

		public ElementGhost(EClass classifier, String uri, String version) {
			super();
			this.classifier = classifier;
			this.uri = uri;
			this.version = version;
		}
    	
		public EClass getEClass()
		{
			return this.classifier;
		}
		
		public String getUri()
		{
			return this.uri;
		}
		
		public String getVersion()
		{
			return this.version;
		}
    };
    
    /**
     * Class that is used to store the data of the model files that are being
     * deleted so that the action can later be undone if required.
     *
     */
    protected class ItemModelFile {
    	
    	public File getFile() {
			return file;
		}
		
		public byte[] getFileBuffer() {
			return fileBuffer;
		}
		
		public String getLocalModelURI() {
			return localModelURI;
		}
		
		public ILibraryManager getManager() {
			return manager;
		}

		public ItemModelFile(ILibraryManager manager, String localModelURI, File file, byte[] fileBuffer) {
			super();
			
			this.manager = manager;
			this.localModelURI = localModelURI;
			this.file = file;
			this.fileBuffer = fileBuffer;
			
			fields = new ArrayList<MDescriptorField>();
			
		}

		protected File file;
    	protected byte[] fileBuffer;
    	protected String localModelURI;
    	protected ILibraryManager manager;
    	
    	protected List<MDescriptorField> fields;

		public List<MDescriptorField> getFields() {
			return fields;
		}

		public void setFields(List<MDescriptorField> fields) {
			this.fields = fields;
		}
    	
    };
    
    /**
     * Class used to store the relatinoships between a model element
     * and the manager of its corresponding library.
     *
     */
    protected class LibraryManagerElement {
    	
    	protected ILibraryManager manager;
    	protected MCommonPackageElement element;
    	
		public ILibraryManager getManager() {
			return manager;
		}
		public MCommonPackageElement getElement() {
			return element;
		}
		
		public LibraryManagerElement(MCommonPackageElement element,
				ILibraryManager manager) {
			super();
			this.manager = manager;
			this.element = element;
			
		}

    };
    
    /**
     * Specialized table item provider used to represent the list of model elements
     * that will be deleted in the operation.
     *
     */
    protected class LibraryManagerElementTableItemProvider implements ITableLabelProvider {
    	
		@Override
		public void addListener(ILabelProviderListener listener) {
			
		}

		@Override
		public void dispose() {
			
		}

		@Override
		public boolean isLabelProperty(Object element, String property) {
			return false;
		}

		@Override
		public void removeListener(ILabelProviderListener listener) {
			
		}

		@Override
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}

		@Override
		public String getColumnText(Object object, int columnIndex) {
			if (object instanceof LibraryManagerElement)
			{
				LibraryManagerElement element = (LibraryManagerElement)object;
				if (columnIndex == 0)
				{
					return element.getManager().getPlugin().getString(
							"_UI_" + element.getManager().getLibraryClass().getName() + "_type");
				}
				else if (columnIndex == 1)
				{
					return element.getManager().getPlugin().getString(
							"_UI_" + element.getElement().eClass().getName() + "_type");
				}
				else if (columnIndex == 2)
				{
					return MICOBSStringHelper.getInstance().getElementName(element.getElement());
				}
				else if (columnIndex == 3)
				{
					MCommonPackageFile pack = (MCommonPackageFile) element.getElement().eContainer();
					if (pack != null && pack.getPackage() != null &&
						pack.getPackage().getUri() != null)
					{
						return pack.getPackage().getUri();
					}
				}
			}
			return null;
		}
    	
    }

    protected List<ItemModelFile> modelFiles;
    
    protected List<String> packageURIs;
    
    protected Collection<LibraryGhost> ghosts;

    /**
     * This constructs a primitive command to remove a collection of values from the specified feature of the owner.
     */
    public DeletePackageItemCommand(ILibraryManager libraryManager, Collection<?> collection)
    {
        super(LABEL, DESCRIPTION);
        this.mainLibraryManager = libraryManager;

        // Initialize all the fields from the command parameter.
        //
        this.collection = collection == null ? null : new ArrayList<Object>(collection);
    	this.modelFiles = new ArrayList<ItemModelFile>();
    	this.packageURIs = new ArrayList<String>();
    	this.ghosts = new HashSet<LibraryGhost>();

    }

	@Override
	public boolean canUndo() {
		return (modelFiles.isEmpty() == false ||
				packageURIs.isEmpty() == false);
	}

	@Override
    protected boolean prepare() 
    {
        if (collection != null)
        {
            for (Object object : collection)
            {
                if (object instanceof MCommonPackage ||
                	object instanceof MCommonPackageItem ||
                	object instanceof MCommonPackageVersionedItem)
                {
                	continue;
                }
                return false;
            }
            return true;
        }
        return false;

    }
	
	/**
	 * Returns a linked hash map with all the elements that point to a given
	 * model element and thus have to be erased, and their corresponding
	 * library managers.
	 * 
	 * If an error occurs when accessing any of the libraries, the method will
	 * throw a {@link LibraryManagerException}.
	 * 
	 * @param element the element of which the referencing elements will be obtained.
	 * @param manager the library manager of the element.
	 * @return a linked hash map with all the elements that point to a given
	 * model element and their corresponding library managers.
	 */
	protected LinkedHashMap<MCommonPackageElement, LibraryManagerElement> getReferencingElements(MCommonPackageElement element, ILibraryManager manager) throws LibraryManagerException
	{
		LinkedHashMap<MCommonPackageElement, LibraryManagerElement> elements = new LinkedHashMap<MCommonPackageElement, LibraryManagerElement>();
		
		for (MCommonPackageElement ele : manager.getAllElements())
		{
			if (ele == element)
			{
				continue;
			}
			if (LibraryEncoder.getReferencedElements(ele).contains(element))
			{
				// Then we have to add its own referencing elements and,
				// finally, add itself.
				elements.putAll(getReferencingElements(ele, manager));
				elements.put(ele, new LibraryManagerElement(ele, manager));
			}
		}
		String libraryID = LibraryAdapterFactory.getAdapterFactory().getLibraryID(manager.getLibraryClass().getName());
		LibraryAdapter adapter = LibraryAdapterFactory.getAdapterFactory().getAdapter(libraryID);
		if (adapter != null)
		{
			IDependentLibrariesProvider provider = (IDependentLibrariesProvider) adapter.adapt(IDependentLibrariesProvider.class);
			if (provider != null)
			{
				for (ILibraryManager mng : provider.getDependentLibraries())
				{
					for (MCommonPackageElement ele : mng.getAllElements())
					{
						if (LibraryEncoder.getReferencedElements(ele).contains(element))
						{
							// Then we have to add its own referencing elements and,
							// finally, add itself.
							elements.putAll(getReferencingElements(ele, mng));
							elements.put(ele, new LibraryManagerElement(ele, mng));
						}
					}
				}
			}
		}

		
		return elements;
	}
    
	@Override
	public void execute()
	{
        if (collection != null)
        {
            for (Object object : collection)
            {
                if (object instanceof MCommonPackage)
                {
                	MCommonPackage _package = (MCommonPackage)object;
                	ghosts.add(new PackageGhost(_package.getUri()));
                }
                else if (object instanceof MCommonPackageItem)
                {
                	MCommonPackageItem item = (MCommonPackageItem)object;
                	for (MCommonPackageVersionedItem versionedItem : item.getVersionedItems())
                	{
                    	MCommonPackageElement element;
    					try {
    						element = mainLibraryManager.getElement(versionedItem);
    					} catch (LibraryManagerException e) {
    						MICOBSPlugin.getPlugin().log(e);
    						return;
    					}
                    	ghosts.add(new ElementGhost(element.eClass(), element.getUri(), element.getVersion()));
                	}
                }
                else if (object instanceof MCommonPackageVersionedItem)
                {
                	MCommonPackageVersionedItem versionedItem = (MCommonPackageVersionedItem)object;
                	MCommonPackageElement element;
					try {
						element = mainLibraryManager.getElement(versionedItem);
					} catch (LibraryManagerException e) {
						MICOBSPlugin.getPlugin().log(e);
						return;
					}
                	ghosts.add(new ElementGhost(element.eClass(), element.getUri(), element.getVersion()));
                }
                else
                {
                	return;
                }
            }
           	doExecute();
        }
	}
	
	protected void doExecute()
    {	
		LinkedHashMap<MCommonPackageElement, LibraryManagerElement> elementsToErase = 
				new LinkedHashMap<MCommonPackageElement, LibraryManagerElement>();
        
    	modelFiles.clear();
    	packageURIs.clear();
        
        for (LibraryGhost object : ghosts)
        {
        	// We have to select the versioned items that are going to be
        	// deleted. There are two list of versioned items, the main list,
        	// derived from the user's selection, and the referenced list,
        	// which is the list of elements that reference the elements we
        	// want to delete.
            if (object instanceof ElementGhost)
            {
            	// We have to add the elements to the list of elements to erase
            	ElementGhost ghost = (ElementGhost)object;
            	
            	MCommonPackageElement element = null;
            	
            	// Now we have to add first all the versioned items
            	// corresponding to the elements that this item represents
            	try {
            		element = mainLibraryManager.getElement(ghost.getEClass(), 
                			ghost.getUri(), ghost.getVersion());
					elementsToErase.putAll(getReferencingElements(element, mainLibraryManager));
				} catch (LibraryManagerException e) {
					MICOBSPlugin.INSTANCE.log(e);
					modelFiles.clear();
					packageURIs.clear();
					return;
				}
            	elementsToErase.put(element, new LibraryManagerElement(element, mainLibraryManager));
            }
            else
            {
            	PackageGhost ghost = (PackageGhost)object;

            	MCommonPackage pack = mainLibraryManager.getPackage(ghost.getUri());
            	
            	for (MCommonPackageItem item : pack.getItems())
            	{
                	for (MCommonPackageVersionedItem versionedItem : item.getVersionedItems())
                	{
                		MCommonPackageElement element;
						try {
							element = mainLibraryManager.getElement(versionedItem);
						} catch (LibraryManagerException e) {
							MICOBSPlugin.INSTANCE.log(e);
							modelFiles.clear();
							packageURIs.clear();
							return;
						}
                    	try {
							elementsToErase.putAll(getReferencingElements(element, mainLibraryManager));
						} catch (LibraryManagerException e) {
							MICOBSPlugin.INSTANCE.log(e);
							modelFiles.clear();
							packageURIs.clear();
							return;
						}
                    	elementsToErase.put(element, new LibraryManagerElement(element, mainLibraryManager));
                	}
            	}
            	packageURIs.add(pack.getUri());
            }
        	
        }
        
        // Now we have the list of elements to we erase and we have to confirm
        // it if the list is not empty
        
        if (elementsToErase.isEmpty() == false)
        {
        	IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        	ConfirmElementsDeletion dialog = new ConfirmElementsDeletion(window.getShell(), true);
        	dialog.setInput(elementsToErase.values());
        	dialog.setLabelProvider(new LibraryManagerElementTableItemProvider());
        	dialog.setMessage("These elements are going to be erased. Would you like to continue?");
        	dialog.addColumn("Library", 15);
        	dialog.addColumn("Type", 20);
        	dialog.addColumn("Element", 30);
        	dialog.addColumn("Package", 60);
        	if (dialog.open() != Dialog.OK)
        	{
        		modelFiles.clear();
        		packageURIs.clear();
        		return;
        	}
        }

        // We have the confirmation, so we can delete the elements
        for (LibraryManagerElement libElement : elementsToErase.values())
        {
            // We have to delete the file!
        	MCommonPackageElement element = libElement.getElement();
        	ILibraryManager manager = libElement.getManager();
        	
        	MCommonPackageVersionedItem versionedItem;
			try {
				versionedItem = manager.getVersionedItem(element);
			} catch (LibraryManagerException e) {
				MICOBSPlugin.INSTANCE.log(e);
				modelFiles.clear();
				packageURIs.clear();
	        	return;
			}

            URI itemURI = URI.createURI(versionedItem.getLocalModelURI());

            if (itemURI != null && itemURI.isPlatformPlugin())
            {
               	try {
               		File destFile = FileConverter.platformPluginURItoFile(itemURI);
               		byte [] modelFileBuffer = null;
               		if (destFile.isFile())
               		{
                   		modelFileBuffer = FileHelper.loadBinaryFile(destFile);
                     	destFile.delete();
                      		
                      	ItemModelFile item = new ItemModelFile(manager, versionedItem.getLocalModelURI(), destFile, modelFileBuffer);
                       	for (EAttribute attribute : versionedItem.eClass().getEAllAttributes())
                       	{
                    		if (attribute.getName().matches(commonPackage.eINSTANCE.getMCommonPackageVersionedItem_Version().getName()) ||
                    			attribute.getName().matches(commonPackage.eINSTANCE.getMCommonPackageVersionedItem_LocalModelURI().getName()) ||
                    			attribute.getEAttributeType() != EcorePackage.eINSTANCE.getEString())
                    		{
                    			continue;
                    		}
                    		MDescriptorField field = libdescFactory.eINSTANCE.createMDescriptorField();
                    		field.setName(attribute.getName());
                    		field.setValue((String) versionedItem.eGet(attribute));
                    		item.getFields().add(field);
                       	}
                       	modelFiles.add(item);
                	}
                } catch (IOException e) {
                	MICOBSPlugin.INSTANCE.log(e);
    				modelFiles.clear();
    				packageURIs.clear();
    	        	return;
                }
            }
            try {
				manager.removeElement(element.eClass(), element.getUri(), element.getVersion());
				manager.saveLibrary();
			} catch (LibraryManagerException e) {
				MICOBSPlugin.INSTANCE.log(e);
				modelFiles.clear();
				packageURIs.clear();
	        	return;
			} catch (IOException e) {
				MICOBSPlugin.INSTANCE.log(e);
				modelFiles.clear();
				packageURIs.clear();
	        	return;
			}
        }
        
        for (String uri : packageURIs)
        {
            IPath packageFolder = mainLibraryManager.getPlugin().getStateLocation().append(ILibraryManager.LIBRARY_FOLDER);
            packageFolder = packageFolder.append(ILibraryManager.PACKAGES_FOLDER);

            packageFolder = packageFolder.append(StringHelper.toLowerDefString(uri));
            
			FileHelper.deleteFolder(packageFolder.toOSString());

            try {
            	mainLibraryManager.removePackage(uri);
            	mainLibraryManager.saveLibrary();
    		} catch (LibraryManagerException e) {
    			MICOBSPlugin.INSTANCE.log(e);
				modelFiles.clear();
				packageURIs.clear();
	        	return;
    		} catch (IOException e) {
    			MICOBSPlugin.INSTANCE.log(e);
				modelFiles.clear();
				packageURIs.clear();
	        	return;
			}
        }
    }
	
	@Override
	public void undo()
	{
		 for (LibraryGhost object : ghosts)
	     {
			if (object instanceof PackageGhost)
			{
				PackageGhost ghost = (PackageGhost)object;
				
	            IPath packageFolder = mainLibraryManager.getPlugin().getStateLocation().append(ILibraryManager.LIBRARY_FOLDER);
	            packageFolder = packageFolder.append(ILibraryManager.PACKAGES_FOLDER);

	            packageFolder = packageFolder.append(StringHelper.toLowerDefString(ghost.getUri()));

               	FileHelper.createFolder(packageFolder.toOSString());
               	
                try {
                	mainLibraryManager.addPackage(ghost.getUri());
                	mainLibraryManager.saveLibrary();
        		} catch (LibraryManagerException e) {
        			MICOBSPlugin.INSTANCE.log(e);
    				modelFiles.clear();
    				packageURIs.clear();
    	        	return;
        		} catch (IOException e) {
        			MICOBSPlugin.INSTANCE.log(e);
    				modelFiles.clear();
    				packageURIs.clear();
    	        	return;
    			}
			}
        }
        
        // we have to copy back the files
        for (ItemModelFile modelFile : modelFiles)
        {
        	File destFile = modelFile.getFile();
            byte [] modelFileBuffer = modelFile.getFileBuffer();
            ILibraryManager manager = modelFile.getManager();
            String localModelURI = modelFile.getLocalModelURI();

            try {
            	FileHelper.saveToFile(destFile, modelFileBuffer);
            	MCommonPackageVersionedItem versionedItem = manager.putElement(URI.createURI(localModelURI, true));
            	
            	for (MDescriptorField field : modelFile.getFields())
            	{
            		EStructuralFeature feature = versionedItem.eClass().getEStructuralFeature(field.getName());
    				if (feature == null ||
    					!(feature instanceof EAttribute) ||
    					!(((EAttribute)feature).getEAttributeType() == EcorePackage.eINSTANCE.getEString()))
    				{
    					continue; // This would be VERY strange
    				}
    				versionedItem.eSet(feature, field.getValue());
            	}
            	
            	manager.saveLibrary();
            } catch (IOException e) {
              	MICOBSPlugin.INSTANCE.log(e);
            } catch (LibraryManagerException e) {
               	MICOBSPlugin.INSTANCE.log(e);
            }
        }
	}

    @Override
    public void redo() 
    {
    	doExecute();
    }

}
