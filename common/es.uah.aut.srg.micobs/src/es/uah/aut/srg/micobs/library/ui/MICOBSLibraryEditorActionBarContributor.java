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
package es.uah.aut.srg.micobs.library.ui;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.IPage;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageItem;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapter;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapterFactory;
import es.uah.aut.srg.micobs.library.ui.handlers.AddPackageAction;
import es.uah.aut.srg.micobs.library.ui.handlers.DeletePackageItemAction;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.util.impl.MICOBSUtilProvider;

/**
 * Class that implements a generic action bar contributor for library editors.
 * It is a modification of the standard generated contributor that defines the
 * set of available actions.
 *
 */
public abstract class MICOBSLibraryEditorActionBarContributor extends 
	MultiPageEditorActionBarContributor 
	implements 
	IMenuListener,
	IPropertyListener
{
	/**
	 * This keeps track of the current editor part.
	 */
	protected IEditorPart activeEditor;

	/**
	 * This is the action used to implement delete.
	 */
	protected DeletePackageItemAction deletePackageElementAction;

	/**
	 * This is the action used to implement undo.
	 */
	protected UndoAction undoAction;

	/**
	 * This is the action used to implement redo.
	 */
	protected RedoAction redoAction;


	protected AddPackageAction addPackageAction;
	
	/**
	 * This is the action used to perform validation.
	 */
	protected ValidateAction validateAction;
	
	/**
	 * This is used to encode the style bits.
	 */
	protected int style;
	
	/**
	 * This keeps track of the current selection provider.
	 * @generated
	 */
	protected ISelectionProvider selectionProvider;

	
	/**
	 * This action opens the Properties view.
	 * @generated
	 */
	protected IAction showPropertiesViewAction =
		new Action(MICOBSPlugin.INSTANCE.getString("_UI_ShowPropertiesView_menu_item")) {
			@Override
			public void run() {
				try {
					getPage().showView("org.eclipse.ui.views.PropertySheet");
				}
				catch (PartInitException exception) {
					exception.printStackTrace();
				}
			}
		};

	/**
	 * This creates an instance of the contributor.
	 */
	public MICOBSLibraryEditorActionBarContributor()
	{
		super();
		try {
			addPackageAction = new AddPackageAction(getLibraryManager(),
					getLibraryFactory(), getPackageClass());
		} catch (LibraryManagerException e) {
			MICOBSPlugin.INSTANCE.log(e);
		}

	}

	@Override
	public void init(IActionBars actionBars)
	{
		super.init(actionBars);
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();

		deletePackageElementAction = createDeleteAction(); 
		deletePackageElementAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), deletePackageElementAction);

		undoAction = createUndoAction();
		undoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);

		redoAction = createRedoAction();
		redoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);
		
		validateAction = new ValidateAction() {
			
			@Override
			protected Diagnostician createDiagnostician(final AdapterFactory adapterFactory, final IProgressMonitor progressMonitor)
			{
				return 
					new Diagnostician()
			      	{
			        	@Override
			        	public String getObjectLabel(EObject eObject)
			        	{
			        		if (adapterFactory != null && !eObject.eIsProxy())
			        		{
		        				if (eObject instanceof MCommonPackageVersionedItem)
		        				{
		        					MCommonPackageItem item = (MCommonPackageItem) eObject.eContainer();
		        					IItemLabelProvider packageItemLabelProvider = (IItemLabelProvider)adapterFactory.adapt(item, IItemLabelProvider.class);
		        					if (packageItemLabelProvider != null)
		        					{
		        						return packageItemLabelProvider.getText(item) + "(" + ((MCommonPackageVersionedItem)eObject).getVersion() + ")";
		        					}
		        				}
		        				else
		        				{
		        					IItemLabelProvider itemLabelProvider = (IItemLabelProvider)adapterFactory.adapt(eObject, IItemLabelProvider.class);
		        					if (itemLabelProvider != null)
		        					{
		        						return itemLabelProvider.getText(eObject);
		        					}
		        				}
			        		}
			        		return super.getObjectLabel(eObject);
			        	}
			        
			        	@Override
			        	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context)
			        	{
			        		progressMonitor.worked(1);
			        		if (eObject instanceof MCommonPackageVersionedItem)
			        		{
			        			// We have to check also the element
			        			MCommonPackageVersionedItem versionedItem = (MCommonPackageVersionedItem) eObject;
			        			
			        			EObject root = EcoreUtil.getRootContainer(versionedItem);
			        			String libraryID = LibraryAdapterFactory.getAdapterFactory().getLibraryID(root.eClass().getName());
			        			LibraryAdapter adapter = 
			        					LibraryAdapterFactory.getAdapterFactory().getAdapter(libraryID);
			        			ILibraryManager libraryManager = null;
			        			if (adapter != null)
			        			{
			        				libraryManager = (ILibraryManager) adapter.adapt(ILibraryManager.class);
			        				MCommonPackageElement element;
			        				try {
										element = libraryManager.getElement(versionedItem);
									} catch (LibraryManagerException e) {
										MICOBSPlugin.INSTANCE.log(e);
										return super.validate(eClass, eObject, diagnostics, context);
									}
			        				if (element != null)
			        				{
			        					Resource modelResource = element.eResource();
			        					if (modelResource instanceof XtextResource)
			        					{
			        						IResourceValidator validator = 
			        							((XtextResource)modelResource).getResourceServiceProvider().getResourceValidator();
			        						List<Issue> issues = validator.validate(modelResource, CheckMode.ALL, null);
			        						Diagnostic diag = MICOBSUtilProvider.getMICOBSUtil().convertToDiagnostic(getObjectLabel(eObject), eObject, adapterFactory, issues);
			        						if (diag.getSeverity() != Diagnostic.OK)
			        						{
			        							diagnostics.add(diag);
			        						}
			        						return super.validate(eClass, eObject, diagnostics, context);
			        					}
			        				}

			        			}
			        		}
			        		return super.validate(eClass, eObject, diagnostics, context);
			        	}
			      	};
			}
		};
	}

	/**
	 * Returns the action used to implement delete.
	 * @see #deletePackageElementAction
	 * @since 2.6
	 */
	protected DeletePackageItemAction createDeleteAction()
	{
		try {
			return new DeletePackageItemAction(getLibraryManager());
		} catch (LibraryManagerException e) {
			MICOBSPlugin.INSTANCE.log(e);
			return null;
		}
	}

	/**
	 * Returns the action used to implement undo.
	 * @see #undoAction
	 * @since 2.6
	 */
	protected UndoAction createUndoAction()
	{
		return new UndoAction();
	}

	/**
	 * Returns the action used to implement redo.
	 * @see #redoAction
	 * @since 2.6
	 */
	protected RedoAction createRedoAction()
	{
		return new RedoAction();
	}


	/**
	 * This determines whether or not the delete action should clean up all references to the deleted objects.
	 * It is false by default, to provide the same beahviour, by default, as in EMF 2.1 and before.
	 * You should probably override this method to return true, in order to get the new, more useful beahviour.
	 * @since 2.2
	 */
	protected boolean removeAllReferencesOnDelete()
	{
		return false;
	}

	public void shareGlobalActions(IPage page, IActionBars actionBars)
	{
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);
	}

	/**
	 * @deprecated
	 */
	@Deprecated
	public void setActiveView(IViewPart part)
	{
		IActionBars actionBars = part.getViewSite().getActionBars();
		actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(), undoAction);
		actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(), redoAction);

		actionBars.updateActionBars();
	}

	public IEditorPart getActiveEditor()
	{
		return activeEditor;
	}

	@Override
	public void setActiveEditor(IEditorPart part) 
	{
		super.setActiveEditor(part);

		if (part != activeEditor)
		{
			if (activeEditor != null)
			{
				deactivate();
			}

			if (part instanceof IEditingDomainProvider)
			{
				activeEditor = part;
				activate();
			}
		}
	}

	@Override
	public void setActivePage(IEditorPart part) 
	{
		// Do nothing
	}

	public void deactivate()
	{
		activeEditor.removePropertyListener(this);

		deletePackageElementAction.setActiveWorkbenchPart(null);
		addPackageAction.setActiveWorkbenchPart(null);
		undoAction.setActiveWorkbenchPart(null);
		redoAction.setActiveWorkbenchPart(null);
		validateAction.setActiveWorkbenchPart(null);

		ISelectionProvider selectionProvider = 
			activeEditor instanceof ISelectionProvider ?
				(ISelectionProvider)activeEditor :
				activeEditor.getEditorSite().getSelectionProvider();

		if (selectionProvider != null)
		{
			selectionProvider.removeSelectionChangedListener(addPackageAction);
			selectionProvider.removeSelectionChangedListener(deletePackageElementAction);
			selectionProvider.removeSelectionChangedListener(validateAction);
		}
	}

	public void activate()
	{
		activeEditor.addPropertyListener(this);

		deletePackageElementAction.setActiveWorkbenchPart(activeEditor);
		addPackageAction.setActiveWorkbenchPart(activeEditor);
		undoAction.setActiveWorkbenchPart(activeEditor);
		redoAction.setActiveWorkbenchPart(activeEditor);
		validateAction.setActiveWorkbenchPart(activeEditor);

		ISelectionProvider selectionProvider = 
			activeEditor instanceof ISelectionProvider ?
				(ISelectionProvider)activeEditor :
					activeEditor.getEditorSite().getSelectionProvider();

		if (selectionProvider != null)
		{
			selectionProvider.addSelectionChangedListener(deletePackageElementAction);
			selectionProvider.addSelectionChangedListener(addPackageAction);
			selectionProvider.addSelectionChangedListener(validateAction);
		}
		update();
	}

	public void update()
	{
		ISelectionProvider selectionProvider = 
			activeEditor instanceof ISelectionProvider ?
				(ISelectionProvider)activeEditor :
					activeEditor.getEditorSite().getSelectionProvider();

		if (selectionProvider != null)
		{
			ISelection selection = selectionProvider.getSelection();
			IStructuredSelection structuredSelection =
				selection instanceof IStructuredSelection ?  (IStructuredSelection)selection : StructuredSelection.EMPTY;

			deletePackageElementAction.updateSelection(structuredSelection);
			addPackageAction.updateSelection(structuredSelection);
			validateAction.updateSelection(structuredSelection);
		}

		undoAction.update();
		redoAction.update();

	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help fill the context menus with contributions from the Edit menu.
	 */
	public void menuAboutToShow(IMenuManager menuManager)
	{
		menuManager.add(new Separator("edit"));

		// Add the edit menu actions.
		if (addPackageAction.isEnabled())
		{
			menuManager.add(new ActionContributionItem(addPackageAction));
			menuManager.add(new Separator());
		}
		menuManager.add(new ActionContributionItem(undoAction));
		menuManager.add(new ActionContributionItem(redoAction));
		menuManager.add(new Separator());
		menuManager.add(new ActionContributionItem(deletePackageElementAction));
		menuManager.add(new Separator());
		menuManager.add(new ActionContributionItem(validateAction));

		menuManager.add(new Separator("additions"));
		menuManager.add(new Separator());
		// Add our other standard marker.
		//
		menuManager.add(new Separator("additions-end"));

  		addGlobalActions(menuManager);
	}

	/**
	 * This inserts global actions before the "additions-end" separator.
	 */
	protected void addGlobalActions(IMenuManager menuManager)
	{
		menuManager.insertAfter("additions-end", new Separator("ui-actions"));
		menuManager.insertAfter("ui-actions", showPropertiesViewAction);
	}

	public void propertyChanged(Object source, int id)
	{
		update();
	}
	
	/**
	 * Returns the manager linked to the library that is to be edited
	 * with the editor associated to the action bar contributor.
	 * 
	 * If a problem occurs when accessing the library manager, the method
	 * will throw a {@link LibraryManagerException}
	 * @return the library manager.
	 * @throws LibraryManagerException
	 */
	protected abstract ILibraryManager getLibraryManager() throws LibraryManagerException;

	/**
	 * Returns the <code>EFactory</code> object associated to the library
	 * that is to be edited with the editor associated to the final
	 * action bar contributor.
	 * 
	 * @return the <code>EFactory</code> object.
	 */
	protected abstract EFactory getLibraryFactory();
	
	
	/**
	 * Returns the <code>EClass</code> object corresponding to the main
	 * class of the library that is to be edited with the editor
	 * associated to the final action bar contributor.
	 * 
	 * @return the <code>EClass</code> object.
	 */
	protected abstract EClass getPackageClass();
	

}
