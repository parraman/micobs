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
package es.uah.aut.srg.micobs.mclev.mclevmcad.provider;


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

import es.uah.aut.srg.micobs.common.commonFactory;
import es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadFactory;
import es.uah.aut.srg.micobs.mclev.mclevmcad.mclevmcadPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.mclevslibFactory;
import es.uah.aut.srg.micobs.pdl.pdlFactory;

/**
 * This is the item provider adapter for a {@link es.uah.aut.srg.micobs.mclev.mclevmcad.MMCADeployment} object.
 * @generated
 */
public class MMCADeploymentItemProvider
	extends MMCLEVMCADPackageElementItemProvider
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
	public MMCADeploymentItemProvider(AdapterFactory adapterFactory) {
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

			addDomainPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Domain feature.
	 * @generated
	 */
	protected void addDomainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MMCADeployment_domain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MMCADeployment_domain_feature", "_UI_MMCADeployment_type"),
				 mclevmcadPackage.Literals.MMCA_DEPLOYMENT__DOMAIN,
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
			childrenFeatures.add(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__LIBRARIES);
			childrenFeatures.add(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__COMPONENTS);
			childrenFeatures.add(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS);
			childrenFeatures.add(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES);
			childrenFeatures.add(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__CONNECTIONS);
			childrenFeatures.add(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__DEPLOYMENT_PLATFORMS);
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
	 * This returns MMCADeployment.gif.
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MMCADeployment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MMCADeployment)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MMCADeployment_type") :
			getString("_UI_MMCADeployment_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MMCADeployment.class)) {
			case mclevmcadPackage.MMCA_DEPLOYMENT__LIBRARIES:
			case mclevmcadPackage.MMCA_DEPLOYMENT__COMPONENTS:
			case mclevmcadPackage.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS:
			case mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES:
			case mclevmcadPackage.MMCA_DEPLOYMENT__CONNECTIONS:
			case mclevmcadPackage.MMCA_DEPLOYMENT__DEPLOYMENT_PLATFORMS:
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
				(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__LIBRARIES,
				 mclevmcadFactory.eINSTANCE.createMServiceLibraryInstance()));

		newChildDescriptors.add
			(createChildParameter
				(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__LIBRARIES,
				 mclevmcadFactory.eINSTANCE.createMDriverSLibInstance()));

		newChildDescriptors.add
			(createChildParameter
				(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__COMPONENTS,
				 mclevmcadFactory.eINSTANCE.createMComponentInstance()));

		newChildDescriptors.add
			(createChildParameter
				(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 commonFactory.eINSTANCE.createMParameterValueAssignmentSingleExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 pdlFactory.eINSTANCE.createMOSSupportedOSAPIPVAExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 pdlFactory.eINSTANCE.createMOSSupportedOSAPIPVASwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 mclevslibFactory.eINSTANCE.createMSLibProvidedSAIAVASwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__ATTRIBUTE_VALUE_ASSIGNMENTS,
				 mclevslibFactory.eINSTANCE.createMSLibProvidedSAIAVAExpression()));

		newChildDescriptors.add
			(createChildParameter
				(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__DEPLOYMENT_ALTERNATIVES,
				 mclevmcadFactory.eINSTANCE.createMDeploymentAlternative()));

		newChildDescriptors.add
			(createChildParameter
				(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__CONNECTIONS,
				 mclevmcadFactory.eINSTANCE.createMCommonConnection()));

		newChildDescriptors.add
			(createChildParameter
				(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__CONNECTIONS,
				 mclevmcadFactory.eINSTANCE.createMConnectionSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(mclevmcadPackage.Literals.MMCA_DEPLOYMENT__DEPLOYMENT_PLATFORMS,
				 mclevmcadFactory.eINSTANCE.createMDeploymentPlatform()));
	}

}