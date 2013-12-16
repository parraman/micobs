package es.uah.aut.srg.micobs.mesp.lang.c_c99.tester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.common.MCommonPackageFile;
import es.uah.aut.srg.micobs.lang.c_c99.util.LangC_C99Util;
import es.uah.aut.srg.micobs.mesp.mesposswi.MOSSwInterface;
import es.uah.aut.srg.micobs.mesp.mesposswp.MOSSwPackage;
import es.uah.aut.srg.micobs.mesp.mespswi.MSwInterface;
import es.uah.aut.srg.micobs.mesp.mespswp.MSwPackage;
import es.uah.aut.srg.micobs.pdl.MOperatingSystem;
import es.uah.aut.srg.micobs.pdl.MOperatingSystemAPI;
import es.uah.aut.srg.micobs.system.MLanguage;

public class MESPLangC_C99Tester extends PropertyTester {

	private static final String PROPERTY_IS_C_C99 = "isC_C99";
	
	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		if (property.equals(PROPERTY_IS_C_C99))
		{
			if (!(receiver instanceof IFile))
				return false;
			
			IFile file = (IFile)receiver;
			XtextResourceSet resourceSet = new XtextResourceSet();
			URI destFile = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			XtextResource destRes = (XtextResource) resourceSet.getResource(destFile, true);
			MCommonPackageFile newPack = (MCommonPackageFile)destRes.getContents().get(0);
			MCommonPackageElement newElement = newPack.getElement();
			
			MLanguage c_c99 = LangC_C99Util.getLanguageC_C99();
			
			if (c_c99 == null)
			{
				// Weird error has happened...
				return false;
			}
			
			if (newElement instanceof MSwPackage &&
				((MSwPackage)newElement).getLanguages().contains(c_c99))
			{
				return true;
			}
			else if (newElement instanceof MSwInterface &&
				((MSwInterface)newElement).getLanguage() == c_c99)
			{
				return true;
			}
			else if (newElement instanceof MOSSwInterface)
			{
				MOSSwInterface osswi = (MOSSwInterface) newElement;
				if (osswi.getReferencedElement() != null &&
					osswi.getReferencedElement() instanceof MOperatingSystemAPI &&
					((MOperatingSystemAPI)osswi.getReferencedElement()).getLanguage() == c_c99)
				{
					return true;
				}
			}
			else if (newElement instanceof MOSSwPackage)
			{
				MOSSwPackage osswp = (MOSSwPackage) newElement;
				if (osswp.getReferencedElement() != null &&
					osswp.getReferencedElement() instanceof MOperatingSystem &&
					((MOperatingSystem)osswp.getReferencedElement()).getLanguages().contains(c_c99))
				{
					return true;
				}
			}
		}
		return false;
	}

}
