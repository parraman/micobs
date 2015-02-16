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
package es.uah.aut.srg.micobs.mesp.util.ui;

import java.util.Set;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeployment;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentAlternative;
import es.uah.aut.srg.micobs.mesp.mespdep.MMESPDeploymentPlatform;
import es.uah.aut.srg.micobs.mesp.util.impl.MESPUtilProvider;

/**
 * Helper methods related to the UI.
 *
 */
public class MESPUtilUI {

	/**
	 * Displays a dialog to request the user the selection of a given
	 * deployment platform from the ones defined by a given
	 * deployment platform.
	 * 
	 * @param shell the shell that will be used to display the dialog.
	 * @param deployment the deployment model.
	 * @return the selected deployment platform or <code>null</code> if the
	 * dialog was cancelled.
	 */
	public static MMESPDeploymentPlatform selectDeploymentPlatform(Shell shell, MMESPDeployment deployment)
	{
		if (deployment.getDeploymentPlatforms().isEmpty())
		{
			return null;
		}
		ElementListSelectionDialog select = new ElementListSelectionDialog(shell, 
				new MMESPDeploymentPlatformLabelProvider());
		select.setMultipleSelection(false);
		select.setElements(
				deployment.getDeploymentPlatforms().toArray(
						new MMESPDeploymentPlatform[deployment.getDeploymentPlatforms().size()]));
		select.setTitle("Platform selection");
		select.setMessage("Select the deployment platform");
		
		if (select.open() != Dialog.OK)
		{
			return null;
		}
		return (MMESPDeploymentPlatform) select.getFirstResult();
	}

	/**
	 * Displays a dialog to request the user the selection of a given
	 * deployment platform from the ones attached to a given
	 * deployment alternative.
	 * 
	 * @param shell the shell that will be used to display the dialog.
	 * @param alternative the deployment alternative.
	 * @return the selected deployment platform or <code>null</code> if the
	 * dialog was cancelled.
	 */
	public static MMESPDeploymentPlatform selectDeploymentPlatform(Shell shell, MMESPDeploymentAlternative alternative)
	{
		if (alternative.getDeploymentPlatforms().isEmpty())
		{
			return null;
		}
		ElementListSelectionDialog select = new ElementListSelectionDialog(shell, 
				new MMESPDeploymentPlatformLabelProvider());
		select.setMultipleSelection(false);
		select.setElements(alternative.getDeploymentPlatforms().toArray(new MMESPDeploymentPlatform[alternative.getDeploymentPlatforms().size()]));
		select.setTitle("Platform selection");
		select.setMessage("Select the deployment platform");
		
		if (select.open() != Dialog.OK)
		{
			return null;
		}
		return (MMESPDeploymentPlatform) select.getFirstResult();
	}
	
	/**
	 * Displays a dialog to request the user the selection of a 
	 * leaf deployment alternative from a given deployment model.
	 * 
	 * @param shell the shell that will be used to display the dialog.
	 * @param deployment the deployment model.
	 * @return the selected leaf deployment alternative or <code>null</code> if
	 * the dialog was cancelled.
	 */
	public static MMESPDeploymentAlternative selectLeafAlternative(Shell shell, MMESPDeployment deployment)
	{
		if (deployment.getDeploymentAlternatives().isEmpty())
		{
			return null;
		}
		ElementListSelectionDialog select = new ElementListSelectionDialog(shell, 
				new MMESPAlternativeLabelProvider());
		select.setMultipleSelection(false);
		Set<MMESPDeploymentAlternative> alternatives = MESPUtilProvider.getMESPUtil().getLeafDeploymentAlternatives(deployment);
		select.setElements(alternatives.toArray(new MMESPDeploymentAlternative[alternatives.size()]));
		select.setTitle("Alternative selection");
		select.setMessage("Select the deployment alternative");
		
		if (select.open() != Dialog.OK)
		{
			return null;
		}
		return (MMESPDeploymentAlternative) select.getFirstResult();
	}

	
}
