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
package es.uah.aut.srg.micobs.pdl.library.pdllibrary.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.jface.viewers.StyledString;

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.common.provider.MCommonPackageItemProvider;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.pdllibraryFactory;
import es.uah.aut.srg.micobs.pdl.plugin.PDLPlugin;
import es.uah.aut.srg.micobs.util.impl.MICOBSAdapterFactoryLabelProvider.IStyledTextProvider;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.pdl.library.pdllibrary.MPDLPackage} object.
 * @generated
 */
public class MPDLPackageItemProvider
	extends MCommonPackageItemProvider
	implements
		IEditingDomainItemProvider, 
		IStructuredItemContentProvider, 
		ITreeItemContentProvider,
		IStyledTextProvider,
		IItemLabelProvider, 
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * @generated
	 */
	public MPDLPackageItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns MPDLPackage.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MPDLPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MPDLPackage)object).getUri();
		return label == null || label.length() == 0 ?
			getString("_UI_MPDLPackage_type") :
			getString("_UI_MPDLPackage_type") + " " + label;
	}
	
	@Override
	public StyledString getStyledText(Object object) {
		String label = ((MPDLPackage)object).getUri();
		if (label == null || label.length() == 0)
		{
			return new StyledString(getString("_UI_MPDLPackage_type"), StyledString.DECORATIONS_STYLER);
		}
		else
		{
			StyledString name = new StyledString(label);
			name.append(" : " + getString("_UI_MPDLPackage_type"), StyledString.DECORATIONS_STYLER);
			return name;
		}
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
				(commonPackage.Literals.MCOMMON_PACKAGE__ITEMS,
				 pdllibraryFactory.eINSTANCE.createMPDLItemOperatingSystemAPI()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE__ITEMS,
				 pdllibraryFactory.eINSTANCE.createMPDLItemOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE__ITEMS,
				 pdllibraryFactory.eINSTANCE.createMPDLItemArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE__ITEMS,
				 pdllibraryFactory.eINSTANCE.createMPDLItemMicroprocessor()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE__ITEMS,
				 pdllibraryFactory.eINSTANCE.createMPDLItemBoard()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE__ITEMS,
				 pdllibraryFactory.eINSTANCE.createMPDLItemPlatform()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE__ITEMS,
				 pdllibraryFactory.eINSTANCE.createMPDLItemCompiler()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE__ITEMS,
				 pdllibraryFactory.eINSTANCE.createMPDLItemDevice()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PDLPlugin.INSTANCE;
	}

}
