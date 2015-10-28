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
package es.uah.aut.srg.micobs.mclev.mclevflatmcad.provider;


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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import es.uah.aut.srg.micobs.common.commonFactory;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadFactory;
import es.uah.aut.srg.micobs.mclev.mclevflatmcad.mclevflatmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibFactory;
import es.uah.aut.srg.micobs.mclev.plugin.MCLEVPlugin;
import es.uah.aut.srg.micobs.pdl.pdlFactory;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevflatmcad.MFlatMCADTarget} object.
 * @generated
 */
public class MFlatMCADTargetItemProvider
	extends ItemProviderAdapter
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
	public MFlatMCADTargetItemProvider(AdapterFactory adapterFactory) {
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

			addDeploymentPlatformPropertyDescriptor(object);
			addLeafDeploymentAlternativePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Deployment Platform feature.
	 * @generated
	 */
	protected void addDeploymentPlatformPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MFlatMCADTarget_deploymentPlatform_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MFlatMCADTarget_deploymentPlatform_feature", "_UI_MFlatMCADTarget_type"),
				 mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__DEPLOYMENT_PLATFORM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Leaf Deployment Alternative feature.
	 * @generated
	 */
	protected void addLeafDeploymentAlternativePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MFlatMCADTarget_leafDeploymentAlternative_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MFlatMCADTarget_leafDeploymentAlternative_feature", "_UI_MFlatMCADTarget_type"),
				 mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__LEAF_DEPLOYMENT_ALTERNATIVE,
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
			childrenFeatures.add(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS);
			childrenFeatures.add(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__LIBRARIES);
			childrenFeatures.add(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__COMPONENTS);
			childrenFeatures.add(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__CONNECTIONS);
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
	 * This returns MFlatMCADTarget.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MFlatMCADTarget"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_MFlatMCADTarget_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MFlatMCADTarget.class)) {
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS:
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__LIBRARIES:
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__COMPONENTS:
			case mclevflatmcadPackage.MFLAT_MCAD_TARGET__CONNECTIONS:
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
				(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 commonFactory.eINSTANCE.createMParameterValueAssignmentSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 pdlFactory.eINSTANCE.createMOSSupportedOSAPIPVAExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 pdlFactory.eINSTANCE.createMOSSupportedOSAPIPVASwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 mclevslibFactory.eINSTANCE.createMSLibProvidedSAIAVASwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 mclevslibFactory.eINSTANCE.createMSLibProvidedSAIAVAExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__LIBRARIES,
				 mclevflatmcadFactory.eINSTANCE.createMFlatServiceLibraryInstance()));

		newChildDescriptors.add
			(createChildParameter
				(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__LIBRARIES,
				 mclevflatmcadFactory.eINSTANCE.createMFlatDriverSLibInstance()));

		newChildDescriptors.add
			(createChildParameter
				(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__COMPONENTS,
				 mclevflatmcadFactory.eINSTANCE.createMFlatComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(mclevflatmcadPackage.Literals.MFLAT_MCAD_TARGET__CONNECTIONS,
				 mclevflatmcadFactory.eINSTANCE.createMFlatConnection()));
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