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
package es.uah.aut.srg.micobs.system.library.systemlibrary.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import es.uah.aut.srg.micobs.system.library.systemlibrary.util.systemlibraryAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * 
 * @generated
 */
public class systemlibraryItemProviderAdapterFactory extends systemlibraryAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * @generated
	 */
	public systemlibraryItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemLibrary} instances.
	 * @generated
	 */
	protected MSystemLibraryItemProvider mSystemLibraryItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemLibrary}.
	 * @generated
	 */
	@Override
	public Adapter createMSystemLibraryAdapter() {
		if (mSystemLibraryItemProvider == null) {
			mSystemLibraryItemProvider = new MSystemLibraryItemProvider(this);
		}

		return mSystemLibraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage} instances.
	 * @generated
	 */
	protected MSystemPackageItemProvider mSystemPackageItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage}.
	 * @generated
	 */
	@Override
	public Adapter createMSystemPackageAdapter() {
		if (mSystemPackageItemProvider == null) {
			mSystemPackageItemProvider = new MSystemPackageItemProvider(this);
		}

		return mSystemPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageVersionedItem} instances.
	 * @generated
	 */
	protected MSystemPackageVersionedItemItemProvider mSystemPackageVersionedItemItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackageVersionedItem}.
	 * @generated
	 */
	@Override
	public Adapter createMSystemPackageVersionedItemAdapter() {
		if (mSystemPackageVersionedItemItemProvider == null) {
			mSystemPackageVersionedItemItemProvider = new MSystemPackageVersionedItemItemProvider(this);
		}

		return mSystemPackageVersionedItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemItemLanguage} instances.
	 * @generated
	 */
	protected MSystemItemLanguageItemProvider mSystemItemLanguageItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemItemLanguage}.
	 * @generated
	 */
	@Override
	public Adapter createMSystemItemLanguageAdapter() {
		if (mSystemItemLanguageItemProvider == null) {
			mSystemItemLanguageItemProvider = new MSystemItemLanguageItemProvider(this);
		}

		return mSystemItemLanguageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemVersionedItemLanguage} instances.
	 * @generated
	 */
	protected MSystemVersionedItemLanguageItemProvider mSystemVersionedItemLanguageItemProvider;

	/**
	 * This creates an adapter for a {@link es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemVersionedItemLanguage}.
	 * @generated
	 */
	@Override
	public Adapter createMSystemVersionedItemLanguageAdapter() {
		if (mSystemVersionedItemLanguageItemProvider == null) {
			mSystemVersionedItemLanguageItemProvider = new MSystemVersionedItemLanguageItemProvider(this);
		}

		return mSystemVersionedItemLanguageItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * @generated
	 */
	public void dispose() {
		if (mSystemLibraryItemProvider != null) mSystemLibraryItemProvider.dispose();
		if (mSystemPackageItemProvider != null) mSystemPackageItemProvider.dispose();
		if (mSystemPackageVersionedItemItemProvider != null) mSystemPackageVersionedItemItemProvider.dispose();
		if (mSystemItemLanguageItemProvider != null) mSystemItemLanguageItemProvider.dispose();
		if (mSystemVersionedItemLanguageItemProvider != null) mSystemVersionedItemLanguageItemProvider.dispose();
	}

}
