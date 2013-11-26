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
package es.uah.aut.srg.micobs.diagnostic;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import es.uah.aut.srg.micobs.plugin.MICOBSPlugin;

/**
 * Diagnostic class that provides static construction methods and extends the
 * {@link org.eclipse.emf.common.util.BasicDiagnostic BasicDiagnostic} class.
 *
 */
public class CheckingDiagnostic extends BasicDiagnostic {
	
	protected EStructuralFeature feature = null;
	
	
	/**
	 * Returns whether the severity of the diagnostic is a <em>WARNING</em> or
	 * not.
	 * @return <code>true</code> if the severity of the diagnostic is a <em>warning</em>
	 * 		   and false otherwise.
	 */
	public boolean isWarning()
	{
		return (severity == WARNING);
	}
	
	/**
	 * Returns whether the severity of the diagnostic is an <em>ERROR</em> or
	 * not.
	 * @return <code>true</code> if the severity of the diagnostic is an <em>error</em>
	 * 		   and false otherwise.
	 */
	public boolean isError()
	{
		return (severity == ERROR);
	}
	
	/**
	 * Returns whether the severity of the diagnostic is an <em>OK</em> or
	 * not.
	 * @return <code>true</code> if the severity of the diagnostic is an <em>OK</em>
	 * 		   and false otherwise.
	 */
	public boolean isOK()
	{
		return (severity == ERROR);
	}
	
	/**
	 * Private constructor of the class.
	 * @param severity the severity of the diagnostic.
	 * @param message the message attached to the diagnostic.
	 * @param source the model object that is the source of the diagnostic.
	 * @param feature the feature of the model object to which the diagnostic refers.
	 */
	private CheckingDiagnostic(int severity, String message, EObject source, EStructuralFeature feature)
	{
		super(severity, (source == null) ? MICOBSPlugin.INSTANCE.getSymbolicName() : source.toString(), 0, message, new Object[] { source, feature });
		this.feature = feature;
	}

	/**
	 * Constructs a <em>WARNING</em> diagnostic of a given source model object with a
	 * given message.
	 * @param message the message attached to the diagnostic.
	 * @param source the object that is the source of the diagnostic.
	 * @return the new object.
	 */
	public static CheckingDiagnostic createWarning(String message, EObject source)
	{
		return new CheckingDiagnostic(WARNING, message, source, null);
	}

	/**
	 * Constructs a <em>WARNING</em> diagnostic of a given source model object
	 * and a given feature with an attached message.
	 * @param message the message attached to the diagnostic.
	 * @param source the object that is the source of the diagnostic.
	 * @return the new object.
	 */
	public static CheckingDiagnostic createWarning(String message, EObject source, EStructuralFeature feature)
	{
		return new CheckingDiagnostic(WARNING, message, source, feature);
	}

	/**
	 * Constructs an <em>ERROR</em> diagnostic of a given source model object with a
	 * given message.
	 * @param message the message attached to the diagnostic.
	 * @param source the object that is the source of the diagnostic.
	 * @return the new object.
	 */
	public static CheckingDiagnostic createError(String message, EObject source)
	{
		return new CheckingDiagnostic(ERROR, message, source, null);
	}
	
	/**
	 * Constructs an <em>ERROR</em> diagnostic of a given source model object
	 * and a given feature with an attached message.
	 * @param message the message attached to the diagnostic.
	 * @param source the object that is the source of the diagnostic.
	 * @return the new object.
	 */
	public static CheckingDiagnostic createError(String message, EObject source, EStructuralFeature feature)
	{
		return new CheckingDiagnostic(ERROR, message, source, feature);
	}

	/**
	 * Constructs an <em>OK</em> diagnostic of a given source model object with a
	 * given message.
	 * @param message the message attached to the diagnostic.
	 * @param source the object that is the source of the diagnostic.
	 * @return the new object.
	 */
	public static CheckingDiagnostic createOK(String message, EObject source)
	{
		return new CheckingDiagnostic(OK, message, source, null);
	}
	
	/**
	 * Constructs an <em>OK</em> diagnostic of a given source model object
	 * and a given feature with an attached message.
	 * @param message the message attached to the diagnostic.
	 * @param source the object that is the source of the diagnostic.
	 * @return the new object.
	 */
	public static CheckingDiagnostic createOK(String message, EObject source, EStructuralFeature feature)
	{
		return new CheckingDiagnostic(OK, message, source, feature);
	}
	
	/**
	 * Constructs a generic <em>ERROR</em> diagnostic with only an attached
	 * message.
	 * @param message the message attached to the diagnostic.
	 * @return the new object.
	 */
	public static CheckingDiagnostic createError(String message) {
		return new CheckingDiagnostic(ERROR, message, null, null);
	}


	/**
	 * Returns the feature to which the diagnostic refers.
	 * @return the feature to which the diagnostic refers.
	 */
	public EStructuralFeature getFeature() {
		return feature;
	}
	
}
