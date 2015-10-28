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
package es.uah.aut.srg.micobs.mclev.library.mclevlibrary.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryPackage;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary} object.
 * @generated
 */
public class MMCLEVVersionedItemDriverServiceLibraryItemProvider
	extends MMCLEVPackageVersionedItemItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * @generated
	 */
	public MMCLEVVersionedItemDriverServiceLibraryItemProvider(AdapterFactory adapterFactory) {
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

			addSwPackageURIPropertyDescriptor(object);
			addSwPackageVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the SwPackage URI feature.
	 * @generated
	 */
	protected void addSwPackageURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMCLEVVersionedItemDriverServiceLibrary_swPackageURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMCLEVVersionedItemDriverServiceLibrary_swPackageURI_feature", "_UI_MMCLEVVersionedItemDriverServiceLibrary_type"),
				 mclevlibraryPackage.Literals.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sw Package Version feature.
	 * @generated
	 */
	protected void addSwPackageVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMCLEVVersionedItemDriverServiceLibrary_swPackageVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMCLEVVersionedItemDriverServiceLibrary_swPackageVersion_feature", "_UI_MMCLEVVersionedItemDriverServiceLibrary_type"),
				 mclevlibraryPackage.Literals.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Version.gif.
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Version"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((MMCLEVVersionedItemDriverServiceLibrary)object).getVersion();
		return label == null || label.length() == 0 ?
			getString("_UI_MMCLEVVersionedItem_version") :
			getString("_UI_MMCLEVVersionedItem_version") + ": " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MMCLEVVersionedItemDriverServiceLibrary.class)) {
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_URI:
			case mclevlibraryPackage.MMCLEV_VERSIONED_ITEM_DRIVER_SERVICE_LIBRARY__SW_PACKAGE_VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
