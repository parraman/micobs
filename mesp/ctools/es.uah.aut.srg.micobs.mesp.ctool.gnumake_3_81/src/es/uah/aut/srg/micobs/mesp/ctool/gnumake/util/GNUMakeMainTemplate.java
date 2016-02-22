package es.uah.aut.srg.micobs.mesp.ctool.gnumake.util;

import es.uah.aut.srg.micobs.common.MCommonPackageElement;
import es.uah.aut.srg.micobs.library.LibraryManagerException;
import es.uah.aut.srg.micobs.mesp.ctool.gnumake.plugin.GNUMakePlugin;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.pdlPackage;
import es.uah.aut.srg.micobs.pdl.library.pdllibrary.manager.PDLLibraryManager;

/**
 * Class that represents an installed main folder generator template for
 * a given platform.
 *
 */
public class GNUMakeMainTemplate {
	
	public GNUMakeMainTemplate(String platformURI, String platformVersion,
			String templateName) {
		super();
		this.platformURI = platformURI;
		this.platformVersion = platformVersion;
		this.templateName = templateName;
	}

	/**
	 * Returns the URI of the attached platform.
	 * @return the platform's URI.
	 */
	public String getPlatformURI() {
		return platformURI;
	}

	/**
	 * Returns the version of the attached platform.
	 * @return the new version of the platform.
	 */
	public String getPlatformVersion() {
		return platformVersion;
	}

	/**
	 * Returns the name of the template.
	 * @return the name of the template.
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * Sets the name of the template.
	 * @param templateName the new template name.
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	
	/**
	 * Returns the model object corresponding to the Platform.
	 * @return the model of the GNU Make construction tool.
	 */
	public MPlatform getPlatform()
	{
		if (platform == null)
		{
			try {
				MCommonPackageElement element = 
						PDLLibraryManager.getLibraryManager().getElement(
								pdlPackage.eINSTANCE.getMPlatform(),
								platformURI, platformVersion);
				if (element != null &&
					element instanceof MPlatform)
				{
					platform = (MPlatform) element;
				}
			} catch (LibraryManagerException e) {
				GNUMakePlugin.INSTANCE.log(e);
			}
		}
		return platform;
	}

	/**
	 * URI of the platform
	 */
	protected String platformURI;
	/**
	 * Version of the platform
	 */
	protected String platformVersion;

	/**
	 * Name of the template
	 */
	protected String templateName;
	
	/**
	 * The platform object
	 */
	protected MPlatform platform;

}
