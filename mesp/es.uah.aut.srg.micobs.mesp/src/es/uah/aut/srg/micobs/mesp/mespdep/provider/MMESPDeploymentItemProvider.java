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
package es.uah.aut.srg.micobs.mesp.mespdep.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepFactory;
import es.uah.aut.srg.micobs.mesp.mespdep.mespdepPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpFactory;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment} object.
 * @generated
 */
public class MMESPDeploymentItemProvider
	extends MMESPDEPPackageElementItemProvider
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
	public MMESPDeploymentItemProvider(AdapterFactory adapterFactory) {
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

			addCtoolPropertyDescriptor(object);
			addLanguagesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ctool feature.
	 * @generated
	 */
	protected void addCtoolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMESPDeployment_ctool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMESPDeployment_ctool_feature", "_UI_MMESPDeployment_type"),
				 mespdepPackage.Literals.MMESP_DEPLOYMENT__CTOOL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Languages feature.
	 * @generated
	 */
	protected void addLanguagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMESPDeployment_languages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMESPDeployment_languages_feature", "_UI_MMESPDeployment_type"),
				 mespdepPackage.Literals.MMESP_DEPLOYMENT__LANGUAGES,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(mespdepPackage.Literals.MMESP_DEPLOYMENT__REQUIRES);
			childrenFeatures.add(mespdepPackage.Literals.MMESP_DEPLOYMENT__DEPLOYED_SW_PACKAGES);
			childrenFeatures.add(mespdepPackage.Literals.MMESP_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES);
			childrenFeatures.add(mespdepPackage.Literals.MMESP_DEPLOYMENT__DEPLOYMENT_PLATFORMS);
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
	 * This returns MMESPDeployment.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MMESPDeployment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MMESPDeployment)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MMESPDeployment_type") :
			getString("_UI_MMESPDeployment_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MMESPDeployment.class)) {
			case mespdepPackage.MMESP_DEPLOYMENT__REQUIRES:
			case mespdepPackage.MMESP_DEPLOYMENT__DEPLOYED_SW_PACKAGES:
			case mespdepPackage.MMESP_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES:
			case mespdepPackage.MMESP_DEPLOYMENT__DEPLOYMENT_PLATFORMS:
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
				(mespdepPackage.Literals.MMESP_DEPLOYMENT__REQUIRES,
				 mespswpFactory.eINSTANCE.createMSwPackageRequiredInterface()));

		newChildDescriptors.add
			(createChildParameter
				(mespdepPackage.Literals.MMESP_DEPLOYMENT__DEPLOYED_SW_PACKAGES,
				 mespdepFactory.eINSTANCE.createMMESPSwPackageDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(mespdepPackage.Literals.MMESP_DEPLOYMENT__DEPLOYED_SW_PACKAGES,
				 mespdepFactory.eINSTANCE.createMMESPDriverSwPackageDeployment()));

		newChildDescriptors.add
			(createChildParameter
				(mespdepPackage.Literals.MMESP_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES,
				 mespdepFactory.eINSTANCE.createMMESPDeploymentAlternative()));

		newChildDescriptors.add
			(createChildParameter
				(mespdepPackage.Literals.MMESP_DEPLOYMENT__DEPLOYMENT_PLATFORMS,
				 mespdepFactory.eINSTANCE.createMMESPDeploymentPlatform()));
	}

}
