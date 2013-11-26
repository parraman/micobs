package es.uah.aut.srg.micobs.mesp.lang.cpp_98.tester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.lang.cpp_98.plugin.MESPLangCPP_98Plugin;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.system.library.systemlibrary.manager.SystemLibraryManager;

public class MESPLangCPP_98Tester extends PropertyTester {

	public static final String LANGUAGE_CPP_98_URI = "es.uah.aut.srg.micobs.langs.CPP";
	public static final String LANGUAGE_CPP_98_VERSION = "98";
	private static final String PROPERTY_IS_CPP_98 = "isCPP_98";
	
	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		if (property.equals(PROPERTY_IS_CPP_98))
		{
			if (!(receiver instanceof IFile))
				return false;
			
			IFile file = (IFile)receiver;
			XtextResourceSet resourceSet = new XtextResourceSet();
			URI destFile = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			XtextResource destRes = (XtextResource) resourceSet.getResource(destFile, true);
			MCommonPackageFile newPack = (MCommonPackageFile)destRes.getContents().get(0);
			MCommonPackageElement newElement = newPack.getElement();
			
			try {
				if (newElement instanceof MSwPackage &&
					((MSwPackage)newElement).getLanguages().contains(SystemLibraryManager.getLibraryManager().getElement(LANGUAGE_CPP_98_URI, LANGUAGE_CPP_98_VERSION)))
				{
					return true;
				}
				else if (newElement instanceof MSwInterface &&
					((MSwInterface)newElement).getLanguage() == SystemLibraryManager.getLibraryManager().getElement(LANGUAGE_CPP_98_URI, LANGUAGE_CPP_98_VERSION))
				{
					return true;
				}
				else if (newElement instanceof MOSSwInterface)
				{
					MOSSwInterface osswi = (MOSSwInterface) newElement;
					if (osswi.getReferencedElement() != null &&
						osswi.getReferencedElement() instanceof MOperatingSystemAPI &&
						((MOperatingSystemAPI)osswi.getReferencedElement()).getLanguage() ==
						SystemLibraryManager.getLibraryManager().getElement(LANGUAGE_CPP_98_URI, LANGUAGE_CPP_98_VERSION))
					{
						return true;
					}
				}
				else if (newElement instanceof MOSSwPackage)
				{
					MOSSwPackage osswp = (MOSSwPackage) newElement;
					if (osswp.getReferencedElement() != null &&
						osswp.getReferencedElement() instanceof MOperatingSystem &&
						((MOperatingSystem)osswp.getReferencedElement()).getLanguages().contains(
						SystemLibraryManager.getLibraryManager().getElement(LANGUAGE_CPP_98_URI, LANGUAGE_CPP_98_VERSION)))
					{
						return true;
					}
				}
			} catch (LibraryManagerException e) {
				MESPLangCPP_98Plugin.INSTANCE.log(e);
				return false;
			}			
		}
		return false;
	}

}
