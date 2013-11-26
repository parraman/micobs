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
package es.uah.aut.srg.micobs.pdl.xtext;

import java.util.Map;
import java.util.Set;

import com.google.inject.Inject;

import es.uah.aut.srg.micobs.common.MBooleanParameter;
import es.uah.aut.srg.micobs.common.MEnumParameter;
import es.uah.aut.srg.micobs.common.MIntegerParameter;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.MRealParameter;
import es.uah.aut.srg.micobs.common.MStringParameter;
import es.uah.aut.srg.micobs.pdl.MPlatform;
import es.uah.aut.srg.micobs.pdl.util.IPDLUtil;
import es.uah.aut.srg.micobs.pdl.util.IPlatformParameterAssignmentResolver;
import es.uah.aut.srg.micobs.xtext.MICOBSAbstractJavaValidator;

/**
 * Generic PDL java validator for Xtext models. Includes checking functions
 * for the common PDL model elements.
 *
 */
public abstract class PDLAbstractJavaValidator extends
		MICOBSAbstractJavaValidator {
	
	@Inject
	protected IPDLUtil pdlutil;
	
	/**
	 * Helper function that checks a collection of parameter value assignments
	 * depending on a given platform.
	 * 
	 * This collection is provided as a map between the parameters and their
	 * assignments.
	 * 
	 * @param platform the platform.
	 * @param expressions the map between the parameters and their assignment
	 * expressions.
	 */
	protected void checkParameterValueAssignments(
			final Map<MParameter, MParameterValueAssignment> assignments,
			final MPlatform platform)
	{
		// We have to check all the parameters

		for (final MParameter parameter : assignments.keySet())
		{
			IPlatformParameterAssignmentResolver resolver = new IPlatformParameterAssignmentResolver() {

				@Override
				public MParameter getParameter() {
					return parameter;
				}

				@Override
				public MParameterValueExpression getAssignmentExpression(
						MParameter parameter) {
					return (assignments.get(parameter) == null) ? null : 
						pdlutil.getParameterValue(assignments.get(parameter), platform);
				}

				@Override
				public MPlatform getPlatform() {
					return platform;
				}
			};

			if (parameter instanceof MBooleanParameter)
			{
				if (!checkBooleanParameterExpression(
						pdlutil.getParameterValue(assignments.get(parameter), platform), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MStringParameter)
			{
				if (!checkStringParameterExpression(
						pdlutil.getParameterValue(assignments.get(parameter), platform), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MIntegerParameter)
			{
				if (!checkIntegerParameterLimits(
						pdlutil.getRange(parameter, platform), 
						pdlutil.getParameterValue(assignments.get(parameter), platform), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MRealParameter)
			{
				if (!checkRealParameterLimits(
						pdlutil.getRange(parameter, platform), 
						pdlutil.getParameterValue(assignments.get(parameter), platform), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MEnumParameter)
			{
				if (!checkEnumParameterExpression(
						pdlutil.getParameterValue(assignments.get(parameter), platform), resolver))
				{
					break;
				}
			}
		}

	}
	
	/**
	 * Helper function that checks a collection of parameter default values.
	 * Apart from the set of parameters, the method receives an optional
	 * mapping between parameters that might eventually be referenced in
	 * the definition of the default values and their corresponding assignments.
	 * 
	 * @param parameters the set of parameters to check.
	 * @param assignments the map between the parameters and their assignment
	 * expressions.
	 */
	protected void checkParameterDefaultValues(Set<MParameter> parameters,
			final MPlatform platform)
	{
		// We have to check all the parameters

		for (final MParameter parameter : parameters)
		{
			IPlatformParameterAssignmentResolver resolver = new IPlatformParameterAssignmentResolver() {

				@Override
				public MParameter getParameter() {
					return parameter;
				}

				@Override
				public MParameterValueExpression getAssignmentExpression(
						MParameter parameter) {
					return null;
				}

				@Override
				public MPlatform getPlatform() {
					return platform;
				}
			};

			if (parameter instanceof MBooleanParameter)
			{
				if (!checkBooleanParameterExpression(
						pdlutil.getDefaultValue(parameter, platform), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MStringParameter)
			{
				if (!checkStringParameterExpression(
						pdlutil.getDefaultValue(parameter, platform), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MIntegerParameter)
			{
				if (!checkIntegerParameterLimits(
						pdlutil.getRange(parameter, platform), 
						pdlutil.getDefaultValue(parameter, platform), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MRealParameter)
			{
				if (!checkRealParameterLimits(
						pdlutil.getRange(parameter, platform), 
						pdlutil.getDefaultValue(parameter, platform), resolver))
				{
					break;
				}
			}
			else if (parameter instanceof MEnumParameter)
			{
				if (!checkEnumParameterExpression(
						pdlutil.getDefaultValue(parameter, platform), resolver))
				{
					break;
				}
			}
		}

	}

}
