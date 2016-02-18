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
package es.uah.aut.srg.micobs.mclev.domain.nulldomain.util;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageVersionedItem;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mclev.domain.nulldomain.plugin.NULLDomainPlugin;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemComponent;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.MMCLEVVersionedItemServiceLibrary;
import es.uah.aut.srg.micobs.mclev.library.mclevlibrary.manager.MCLEVLibraryManager;
import es.uah.aut.srg.micobs.mclev.mclevcmp.MComponent;
import es.uah.aut.srg.micobs.mclev.mclevdom.MIODomain;
import es.uah.aut.srg.micobs.mclev.mclevdom.mclevdomPackage;
import es.uah.aut.srg.micobs.mclev.mclevslib.MDriverServiceLibrary;
import es.uah.aut.srg.micobs.mclev.mclevslib.MServiceLibrary;
import es.uah.aut.srg.micobs.mesp.library.mesplibrary.manager.MESPLibraryManager;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswi.mespswiPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MDriverSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswp.mespswpPackage;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;

/**
 * Class with a set of static functions and labels used during the generation
 * process. These functions are used to obtain different static models from
 * the MESP and MCLEV libraries. These models shall be already present in the
 * library before accessing these methods.
 * 
 * Also, the class provides methods to help in the transformation process
 * between the MCLEV and MESP models.
 *
 */
public class NULLDomainUtil {
	
	public static final NULLDomainUtil INSTANCE = new NULLDomainUtil();
	
	public static final String NULLDOMAIN_DOMAIN_URI = "es.uah.aut.srg.micobs.mclev.domains.NULLDomain";
	public static final String NULLDOMAIN_V1_DOMAIN_VERSION = "v1";

	public static final String NULLDOMAIN_SWINTERFACE_URI = "es.uah.aut.srg.micobs.mesp.common.nulldomain.nulldomain_iface";
	public static final String NULLDOMAIN_V1_SWINTERFACE_VERSION = "v1";
	
	public static final String POSIX_OSAPI_URI = "es.uah.aut.srg.micobs.pdl.common.osapi_.POSIX";
	public static final String POSIX_V13_OSAPI_VERSION = "v13";

	public static final String RTEMSAPI_OSAPI_URI = "es.uah.aut.srg.micobs.pdl.common.osapi_.RTEMSAPI";
	public static final String RTEMSAPI_4_6_OSAPI_VERSION = "4.6";
	public static final String RTEMSAPI_4_8_IMPR_OSAPI_VERSION = "4.8_impr";
	
	public static final String PBOOTAPI_OSAPI_URI = "es.uah.aut.srg.micobs.pdl.common.osapi_.pbootapi";
	public static final String PBOOTAPI_V1_OSAPI_VERSION = "v1";

	private static MIODomain nulldomain = null;
	
	private static MSwInterface nulldomain_iface = null;
	
	private static MOperatingSystemAPI rtemsapi_4_6 = null;
	private static MOperatingSystemAPI rtemsapi_4_8_impr = null;
	private static MOperatingSystemAPI posix_v13 = null;
	private static MOperatingSystemAPI pbootapi_v1 = null;
	
	/**
	 * Returns the OSAPI model with URI 
	 * "es.uah.aut.srg.micobs.pdl.common.osapi_.POSIX" and version v13. If the
	 * model is not installed by the time the function is called, it will 
	 * return <code>null</code>.
	 * 
	 * @return the model element of the OSAPI POSIX(v13).
	 */
	public static MOperatingSystemAPI getOsapiPOSIX_v13()
	{
		if (posix_v13 == null)
		{
			try {
				MCommonPackageElement element = 
						PDLLibraryManager.getLibraryManager().getElement(
								pdlPackage.eINSTANCE.getMOperatingSystemAPI(),
								POSIX_OSAPI_URI, POSIX_V13_OSAPI_VERSION);
				if (element != null &&
					element instanceof MOperatingSystemAPI)
				{
					posix_v13 = (MOperatingSystemAPI) element;
				}
			} catch (LibraryManagerException e) {
				NULLDomainPlugin.INSTANCE.log(e);
			}
		}
		return posix_v13;
	}

	/**
	 * Returns the OSAPI model with URI 
	 * "es.uah.aut.srg.micobs.pdl.common.osapi_.RTEMSAPI" and version 4.6. If the
	 * model is not installed by the time the function is called, it will 
	 * return <code>null</code>.
	 * 
	 * @return the model element of the OSAPI RTEMSAPI(4.6).
	 */	
	public static MOperatingSystemAPI getOsapiRTEMSAPI_4_6()
	{
		if (rtemsapi_4_6 == null)
		{
			try {
				MCommonPackageElement element = 
						PDLLibraryManager.getLibraryManager().getElement(
								pdlPackage.eINSTANCE.getMOperatingSystemAPI(),
								RTEMSAPI_OSAPI_URI, RTEMSAPI_4_6_OSAPI_VERSION);
				if (element != null &&
					element instanceof MOperatingSystemAPI)
				{
					rtemsapi_4_6 = (MOperatingSystemAPI) element;
				}
			} catch (LibraryManagerException e) {
				NULLDomainPlugin.INSTANCE.log(e);
			}
		}
		return rtemsapi_4_6;
	}
	
	/**
	 * Returns the OSAPI model with URI 
	 * "es.uah.aut.srg.micobs.pdl.common.osapi_.RTEMSAPI" and version 4.8_impr.
	 * If the model is not installed by the time the function is called, it
	 * will return <code>null</code>.
	 * 
	 * @return the model element of the OSAPI RTEMSAPI(4.8_impr).
	 */	
	public static MOperatingSystemAPI getOsapiRTEMSAPI_4_8_impr()
	{
		if (rtemsapi_4_8_impr == null)
		{
			try {
				MCommonPackageElement element = 
						PDLLibraryManager.getLibraryManager().getElement(
								pdlPackage.eINSTANCE.getMOperatingSystemAPI(),
								RTEMSAPI_OSAPI_URI, RTEMSAPI_4_8_IMPR_OSAPI_VERSION);
				if (element != null &&
					element instanceof MOperatingSystemAPI)
				{
					rtemsapi_4_8_impr = (MOperatingSystemAPI) element;
				}
			} catch (LibraryManagerException e) {
				NULLDomainPlugin.INSTANCE.log(e);
			}
		}
		return rtemsapi_4_8_impr;
	}
	
	/**
	 * Returns the OSAPI model with URI 
	 * "es.uah.aut.srg.micobs.pdl.common.osapi_.pbootapi" and version v1.
	 * If the model is not installed by the time the function is called, it
	 * will return <code>null</code>.
	 * 
	 * @return the model element of the OSAPI pbootapi(v1).
	 */	
	public static MOperatingSystemAPI getOsapiPBOOTAPI_v1()
	{
		if (pbootapi_v1 == null)
		{
			try {
				MCommonPackageElement element = 
						PDLLibraryManager.getLibraryManager().getElement(
								pdlPackage.eINSTANCE.getMOperatingSystemAPI(),
								PBOOTAPI_OSAPI_URI, PBOOTAPI_V1_OSAPI_VERSION);
				if (element != null &&
					element instanceof MOperatingSystemAPI)
				{
					pbootapi_v1 = (MOperatingSystemAPI) element;
				}
			} catch (LibraryManagerException e) {
				NULLDomainPlugin.INSTANCE.log(e);
			}
		}
		return pbootapi_v1;
	}
	
	
	/**
	 * Returns the model element corresponding to the NULL domain. If the model
	 * is not present in the library (mainly due to an error), the method will
	 * return <code>null</code>.
	 * 
	 * @return the model element corresponding to the NULL 
	 * 		   implementation-oriented domain.
	 */
	public static MIODomain getNULLDomain()
	{
		if (nulldomain == null)
		{
			try {
				MCommonPackageElement element = 
						MCLEVLibraryManager.getLibraryManager().getElement(
								mclevdomPackage.eINSTANCE.getMIODomain(),
								NULLDOMAIN_DOMAIN_URI, NULLDOMAIN_V1_DOMAIN_VERSION);
				if (element != null &&
					element instanceof MIODomain)
				{
					nulldomain = (MIODomain) element;
				}
			} catch (LibraryManagerException e) {
				NULLDomainPlugin.INSTANCE.log(e);
			}
		}
		return nulldomain;
	}
	
	/**
	 * Returns the model element corresponding to the NULL domain's software
	 * interface. This interface shall be implemented by the software package
	 * corresponding to the singleton component. If the model is not present in
	 * the library (mainly due to an error), the method will return
	 * <code>null</code>.
	 * 
	 * @return the model element corresponding to the NULL domain's software
	 * 		   interface.
	 */
	public static MSwInterface getNULLDomainSwInterface()
	{
		if (nulldomain_iface == null)
		{
			MCommonPackageElement element = null;
			try {
				element = MESPLibraryManager.getLibraryManager().getElement(
						mespswiPackage.eINSTANCE.getMSwInterface(),
						NULLDOMAIN_SWINTERFACE_URI, NULLDOMAIN_V1_SWINTERFACE_VERSION);
				if (element != null &&
					element instanceof MSwInterface)
				{
					nulldomain_iface = (MSwInterface) element;
				}
			} catch (LibraryManagerException e) {
				NULLDomainPlugin.INSTANCE.log(e);;
			}
		}

		return nulldomain_iface;
	}
	
	/**
	 * Returns the driver software package model from a given driver service
	 * library. This method will locate the library entry of the MCLEV model
	 * and then check if the fields referencing the MESP model element are 
	 * defined. If so, it will locate the model on the MESP library and return
	 * it if present. If the model cannot be located, the method will return
	 * <code>null</code>.
	 * 
	 * @param drvslib the driver service library.
	 * @return the driver software package corresponding to the service library.
	 */
	public static MDriverSwPackage getSwPackageOfDriverServiceLibrary(MDriverServiceLibrary drvslib)
	{
		if (drvslib == null)
		{
			return null;
		}
		MCommonPackageVersionedItem vitem = null;
		
		try {
			vitem = MCLEVLibraryManager.getLibraryManager().getVersionedItem(drvslib);
		} catch (LibraryManagerException e) {
			NULLDomainPlugin.INSTANCE.log(e);
			return null;
		}
		
		if (vitem == null || !(vitem instanceof MMCLEVVersionedItemDriverServiceLibrary))
		{
			return null;
		}
		
		MMCLEVVersionedItemDriverServiceLibrary vislib = (MMCLEVVersionedItemDriverServiceLibrary) vitem;
		if (vislib.getSwPackageURI() == null ||
			vislib.getSwPackageURI() == "" ||
			vislib.getSwPackageVersion() == null ||
			vislib.getSwPackageVersion() == "")
		{
			return null;
		}
		
		MCommonPackageElement element = null;
		try {
			element = MESPLibraryManager.getLibraryManager().getElement(
					mespswpPackage.eINSTANCE.getMDriverSwPackage(),
					vislib.getSwPackageURI(), vislib.getSwPackageVersion());
		} catch (LibraryManagerException e) {
			NULLDomainPlugin.INSTANCE.log(e);
			return null;
		}
		
		if (element == null ||
			!(element instanceof MDriverSwPackage))
		{
			return null;
		}
		
		return (MDriverSwPackage)element;
	}
	
	/**
	 * Returns the software package model from a given regular service library.
	 * This method will locate the library entry of the MCLEV model and then
	 * check if the fields referencing the MESP model element are defined. If
	 * so, it will locate the model on the MESP library and return it if
	 * present. If the model cannot be located, the method will return
	 * <code>null</code>.
	 * 
	 * @param slib the service library.
	 * @return the software package corresponding to the service library.
	 */
	public static MSwPackage getSwPackageOfServiceLibrary(MServiceLibrary slib)
	{
		if (slib == null)
		{
			return null;
		}
		MCommonPackageVersionedItem vitem = null;
		
		try {
			vitem = MCLEVLibraryManager.getLibraryManager().getVersionedItem(slib);
		} catch (LibraryManagerException e) {
			NULLDomainPlugin.INSTANCE.log(e);
			return null;
		}
		
		if (vitem == null || !(vitem instanceof MMCLEVVersionedItemServiceLibrary))
		{
			return null;
		}
		
		MMCLEVVersionedItemServiceLibrary vislib = (MMCLEVVersionedItemServiceLibrary) vitem;
		if (vislib.getSwPackageURI() == null ||
			vislib.getSwPackageURI() == "" ||
			vislib.getSwPackageVersion() == null ||
			vislib.getSwPackageVersion() == "")
		{
			return null;
		}
		
		MCommonPackageElement element = null;
		try {
			element = MESPLibraryManager.getLibraryManager().getElement(
					mespswpPackage.eINSTANCE.getMSwPackage(),
					vislib.getSwPackageURI(), vislib.getSwPackageVersion());
		} catch (LibraryManagerException e) {
			NULLDomainPlugin.INSTANCE.log(e);
			return null;
		}
		
		if (element == null ||
			!(element instanceof MSwPackage))
		{
			return null;
		}
		
		return (MSwPackage)element;
	}
	
	/**
	 * Returns the software package model from a given component. This method
	 * will locate the component entry of the MCLEV model and then check if the
	 * fields referencing the MESP model element are defined. If so, it will
	 * locate the model on the MESP library and return it if present. If the
	 * model cannot be located, the method will return <code>null</code>.
	 * 
	 * @param cmp the component.
	 * @return the software package corresponding to the component.
	 */
	public static MSwPackage getSwPackageOfComponent(MComponent cmp)
	{
		if (cmp == null)
		{
			return null;
		}
		MCommonPackageVersionedItem vitem = null;
		
		try {
			vitem = MCLEVLibraryManager.getLibraryManager().getVersionedItem(cmp);
		} catch (LibraryManagerException e) {
			NULLDomainPlugin.INSTANCE.log(e);
			return null;
		}
		
		if (vitem == null || !(vitem instanceof MMCLEVVersionedItemComponent))
		{
			return null;
		}
		
		MMCLEVVersionedItemComponent vislib = (MMCLEVVersionedItemComponent) vitem;
		if (vislib.getSwPackageURI() == null ||
			vislib.getSwPackageURI() == "" ||
			vislib.getSwPackageVersion() == null ||
			vislib.getSwPackageVersion() == "")
		{
			return null;
		}
		
		MCommonPackageElement element = null;
		try {
			element = MESPLibraryManager.getLibraryManager().getElement(
					mespswpPackage.eINSTANCE.getMSwPackage(),
					vislib.getSwPackageURI(), vislib.getSwPackageVersion());
		} catch (LibraryManagerException e) {
			NULLDomainPlugin.INSTANCE.log(e);
			return null;
		}
		
		if (element == null ||
			!(element instanceof MSwPackage))
		{
			return null;
		}
		
		return (MSwPackage)element;
	}
	
}
