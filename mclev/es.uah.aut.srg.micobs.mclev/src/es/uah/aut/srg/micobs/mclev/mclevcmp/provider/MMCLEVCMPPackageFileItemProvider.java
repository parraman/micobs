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
package es.uah.aut.srg.micobs.mclev.mclevcmp.provider;


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

import es.uah.aut.srg.micobs.common.commonPackage;
import es.uah.aut.srg.micobs.common.provider.MCommonPackageFileItemProvider;
import es.uah.aut.srg.micobs.mclev.mclevcmp.mclevcmpFactory;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomFactory;
import es.uah.aut.srg.micobs.mclev.mcleviface.mclevifaceFactory;
import es.uah.aut.srg.micobs.mclev.mclevimap.mclevimapFactory;
import es.uah.aut.srg.micobs.mclev.mclevsai.mclevsaiFactory;
import es.uah.aut.srg.micobs.mclev.plugin.MCLEVPlugin;
import es.uah.aut.srg.micobs.pdl.pdlFactory;
import es.uah.aut.srg.micobs.system.systemFactory;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevcmp.MMCLEVCMPPackageFile} object.
 * @generated
 */
public class MMCLEVCMPPackageFileItemProvider
	extends MCommonPackageFileItemProvider
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
	public MMCLEVCMPPackageFileItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns MMCLEVCMPPackageFile.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MMCLEVCMPPackageFile"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_MMCLEVCMPPackageFile_type");
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
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 mclevcmpFactory.eINSTANCE.createMComponent()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 mclevcmpFactory.eINSTANCE.createMAbstractComponent()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 mclevdomFactory.eINSTANCE.createMAODomain()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 mclevdomFactory.eINSTANCE.createMIODomain()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 mclevifaceFactory.eINSTANCE.createMInterface()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 mclevimapFactory.eINSTANCE.createMInterfaceMapping()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 pdlFactory.eINSTANCE.createMBoard()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 pdlFactory.eINSTANCE.createMMicroprocessor()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 pdlFactory.eINSTANCE.createMOperatingSystem()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 pdlFactory.eINSTANCE.createMOperatingSystemAPI()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 pdlFactory.eINSTANCE.createMArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 pdlFactory.eINSTANCE.createMPlatform()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 pdlFactory.eINSTANCE.createMCompiler()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 pdlFactory.eINSTANCE.createMDevice()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 mclevsaiFactory.eINSTANCE.createMSAI()));

		newChildDescriptors.add
			(createChildParameter
				(commonPackage.Literals.MCOMMON_PACKAGE_FILE__ELEMENT,
				 systemFactory.eINSTANCE.createMLanguage()));
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
