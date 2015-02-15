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
package es.uah.aut.srg.micobs.libdesc.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.viewers.StyledString;

import es.uah.aut.srg.micobs.libdesc.MDescriptor;
import es.uah.aut.srg.micobs.libdesc.libdescFactory;
import es.uah.aut.srg.micobs.libdesc.libdescPackage;
import es.uah.aut.srg.micobs.library.ILibraryManager;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapter;
import es.uah.aut.srg.micobs.library.adapter.LibraryAdapterFactory;
import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;
import es.uah.aut.srg.micobs.util.impl.MICOBSAdapterFactoryLabelProvider.IStyledTextProvider;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.libdesc.MDescriptor} object.
 * @generated
 */
public class MDescriptorItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IStyledTextProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * @generated
	 */
	public MDescriptorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUriPropertyDescriptor(object);
			addLibraryPropertyDescriptor(object);
			addItemPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uri feature.
	 * @generated
	 */
	protected void addUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDescriptor_uri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDescriptor_uri_feature", "_UI_MDescriptor_type"),
				 libdescPackage.Literals.MDESCRIPTOR__URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Library feature.
	 * @generated
	 */
	protected void addLibraryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDescriptor_library_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDescriptor_library_feature", "_UI_MDescriptor_type"),
				 libdescPackage.Literals.MDESCRIPTOR__LIBRARY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Item feature.
	 * @generated
	 */
	protected void addItemPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MDescriptor_item_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MDescriptor_item_feature", "_UI_MDescriptor_type"),
				 libdescPackage.Literals.MDESCRIPTOR__ITEM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(libdescPackage.Literals.MDESCRIPTOR__FIELDS);
		}
		return childrenFeatures;
	}

	/**
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MDescriptor.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		MDescriptor descriptor = (MDescriptor)object;
		// Now we have to get the adapter:
		LibraryAdapter adapter = 
				LibraryAdapterFactory.getAdapterFactory().getAdapter(descriptor.getLibrary());

		if (adapter != null)
		{
			ILibraryManager libraryManager = (ILibraryManager) adapter.adapt(ILibraryManager.class);
			if (libraryManager != null)
			{
				return overlayImage(object, libraryManager.getPlugin().getImage("full/obj16/" + descriptor.getItem()));
			}
		}
		return null;
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		MDescriptor descriptor = (MDescriptor)object;
		// Now we have to get the adapter:
		LibraryAdapter adapter = 
				LibraryAdapterFactory.getAdapterFactory().getAdapter(descriptor.getLibrary());

		if (adapter != null)
		{
			ILibraryManager libraryManager = (ILibraryManager) adapter.adapt(ILibraryManager.class);
			if (libraryManager != null)
			{
				return "(" + libraryManager.getPlugin().getString("_UI_" + libraryManager.getLibraryClass().getName() + "_type") + ") " +
					libraryManager.getPlugin().getString("_UI_" + descriptor.getItem() + "_type") + " : " +
					descriptor.getUri();
			}
		}
		return getString("_UI_MDescriptor_unknown");
	}
	
	@Override
	public StyledString getStyledText(Object object) {
		MDescriptor descriptor = (MDescriptor)object;

		// Now we have to get the adapter:
		LibraryAdapter adapter = 
				LibraryAdapterFactory.getAdapterFactory().getAdapter(descriptor.getLibrary());

		if (adapter != null)
		{
			ILibraryManager libraryManager = (ILibraryManager) adapter.adapt(ILibraryManager.class);
			if (libraryManager != null)
			{
				if (libraryManager.getPackageClass().getName().matches(descriptor.getItem()))
				{
					// The item is a package
					if (descriptor.getUri() != null && descriptor.getUri().length() >= 1)
					{
						StyledString uri = new StyledString(descriptor.getUri());
						uri.append(" : " + libraryManager.getPlugin().getString("_UI_" + descriptor.getItem() + "_type"), StyledString.DECORATIONS_STYLER);
						uri.append(" - " + libraryManager.getPlugin().getString("_UI_" + libraryManager.getLibraryClass().getName() + "_type"), StyledString.QUALIFIER_STYLER);
						return uri;
					}
				}
				else
				{
					if (descriptor.getUri() != null && descriptor.getUri().length() >= 1)
					{
						String[] tmp = descriptor.getUri().split("[.]");
						String label = "";
						if (tmp != null && tmp.length >= 1)
							label = tmp[tmp.length-1];
					
						if (label != null && label.length() >= 1)
						{
							StyledString uri = new StyledString(label);
							uri.append(" : " + libraryManager.getPlugin().getString("_UI_" + descriptor.getItem() + "_type"), StyledString.DECORATIONS_STYLER);
							uri.append(" - " + libraryManager.getPlugin().getString("_UI_" + libraryManager.getLibraryClass().getName() + "_type"), StyledString.QUALIFIER_STYLER);
							return uri;
						}
					}
				}
			}
		}
		return new StyledString(getString("_UI_MDescriptor_unknown"), StyledString.DECORATIONS_STYLER);

	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MDescriptor.class)) {
			case libdescPackage.MDESCRIPTOR__URI:
			case libdescPackage.MDESCRIPTOR__LIBRARY:
			case libdescPackage.MDESCRIPTOR__ITEM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case libdescPackage.MDESCRIPTOR__FIELDS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(libdescPackage.Literals.MDESCRIPTOR__FIELDS,
				 libdescFactory.eINSTANCE.createMDescriptorField()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MICOBSPlugin.INSTANCE;
	}

}
