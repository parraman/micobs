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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.common.provider.MCommonPackageItemItemProvider;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageItem;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.mclevlibraryFactory;
import es.uah.aut.srg.micobs.mclev.plugin.MCLEVPlugin;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVPackageItem} object.
 * @generated
 */
public class MMCLEVPackageItemItemProvider
	extends MCommonPackageItemItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * @generated
	 */
	public MMCLEVPackageItemItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MMCLEVPackageItem)object).getUri();
		return label == null || label.length() == 0 ?
			getString("_UI_MMCLEVPackageItem_type") :
			getString("_UI_MMCLEVPackageItem_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
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
				(commonPackage.Literals.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS,
				 mclevlibraryFactory.eINSTANCE.createMMCLEVVersionedItemComponent()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS,
				 mclevlibraryFactory.eINSTANCE.createMMCLEVVersionedItemSAI()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS,
				 mclevlibraryFactory.eINSTANCE.createMMCLEVVersionedItemInterface()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS,
				 mclevlibraryFactory.eINSTANCE.createMMCLEVVersionedItemInterfaceMapping()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS,
				 mclevlibraryFactory.eINSTANCE.createMMCLEVVersionedItemServiceLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS,
				 mclevlibraryFactory.eINSTANCE.createMMCLEVVersionedItemIODomain()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS,
				 mclevlibraryFactory.eINSTANCE.createMMCLEVVersionedItemAODomain()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS,
				 mclevlibraryFactory.eINSTANCE.createMMCLEVVersionedItemMCAD()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS,
				 mclevlibraryFactory.eINSTANCE.createMMCLEVVersionedItemAbstractComponent()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS,
				 mclevlibraryFactory.eINSTANCE.createMMCLEVVersionedItemAbstractServiceLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS,
				 mclevlibraryFactory.eINSTANCE.createMMCLEVVersionedItemFlatMCAD()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_ITEM__VERSIONED_ITEMS,
				 mclevlibraryFactory.eINSTANCE.createMMCLEVVersionedItemDriverServiceLibrary()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MCLEVPlugin.INSTANCE;
	}

}
