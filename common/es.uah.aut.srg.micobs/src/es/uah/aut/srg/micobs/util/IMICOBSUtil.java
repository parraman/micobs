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

package es.uah.aut.srg.micobs.util;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Issue;

import es.uah.aut.srg.micobs.common.MCommonReferenceableObj;
import es.uah.aut.srg.micobs.common.MEnumParameterLiteral;
import es.uah.aut.srg.micobs.common.MParameter;
import es.uah.aut.srg.micobs.common.MParameterRange;
import es.uah.aut.srg.micobs.common.MParameterValue;
import es.uah.aut.srg.micobs.common.MParameterValueAssignment;
import es.uah.aut.srg.micobs.common.MParameterValueExpression;
import es.uah.aut.srg.micobs.common.MParameterValueTERM;
import es.uah.aut.srg.micobs.system.MLanguage;
import es.uah.aut.srg.micobs.system.library.systemlibrary.MSystemPackage;

public interface IMICOBSUtil {
	
	public class StringValue {

		public String getString() {
			return theString;
		}

		public void setString(String string) {
			this.theString = string;
		}

		public boolean isRaw() {
			return isRaw;
		}

		public void setRaw(boolean isRaw) {
			this.isRaw = isRaw;
		}

		protected String theString;
		protected boolean isRaw;
		
		public StringValue(String theString, boolean isRaw) {
			super();
			this.theString = theString;
			this.isRaw = isRaw;
		}
		
		@Override
		public String toString() {
			return theString;
		}
		
	}
	

	/**
	 * Returns the literal value corresponding to an enumerated expression.
	 * The function receives the collection of assignments to the parameters
	 * that can be referenced in the enumerated parameter assignment.
	 * @param assignment the value assignment to an enumerated parameter.
	 * @param assignments the collection of value assignments to the parameters
	 *                    used in the definition of the value assignment.
	 * @return the literal value pointed by the expression.
	 * @see #parseEnumExpression(MParameterValueExpression, IParameterAssignmentResolver)
	 */
	public MEnumParameterLiteral parseEnumExpression(
			MParameterValueExpression self,
			Collection<MParameterValueAssignment> assignments)
			throws IllegalArgumentException;

	/**
	 * Returns the literal value corresponding to an enumerated expression.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If the expression is not well formed or the referenced object is not
	 * a enumerated literal, the method will throw an
	 * {@link IllegalArgumentException}.
	 * 
	 * @param expression the expression to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the literal value pointed by the expression.
	 * @throws IllegalArgumentException
	 */
	public MEnumParameterLiteral parseEnumExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;

	/**
	 * Returns the literal value corresponding to the left hand term of an
	 * enumerated expression. The function receives the parameter assignment
	 * resolver that shall be used to map the possible referenced objects to
	 * their respective values.
	 * 
	 * If the expression is not well formed or the referenced object is not
	 * an enumerated literal, the method will throw an
	 * {@link IllegalArgumentException}.
	 * 
	 * @param term the left hand term to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the literal value of the left hand term.
	 * @throws IllegalArgumentException
	 */
	MEnumParameterLiteral parseEnumExpression(
			MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;
	
	/**
	 * Returns the literal value corresponding to a given parameter value.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If any of the expressions that might form the parameter value
	 * is not well formed or the referenced object is not a enumerated
	 * literal, the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param pva the parameter value to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the literal pointed by the parameter value.
	 * @throws IllegalArgumentException
	 */
	public MEnumParameterLiteral parseEnumExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;
	
	/**
	 * Returns the literal value associated to a generic referenceable object.
	 * Depending on its type, the object will be parsed accordingly.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If the referenced object or its representation is not an enumerated
	 * literal, the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param object the generic referenceable object.
	 * @param resolver the parameter assignment resolver.
	 * @return the associated enumerated literal.
	 * @throws IllegalArgumentException
	 */
	MEnumParameterLiteral parseEnumReferencedObject(
			MCommonReferenceableObj object,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;
	
	/**
	 * Returns the value corresponding to a boolean expression. The function
	 * receives the collection of assignments to the parameters
	 * that can be referenced in the boolean expression.
	 * @param expression the value assignment to an enumerated parameter.
	 * @param assignments The collection of value assignments to the parameters
	 *                    used in the definition of the value assignment.
	 * @return The literal value assigned to the parameter.
	 * @see #parseEnumExpression(MParameterValueExpression, IParameterAssignmentResolver)
	 */
	public Boolean parseBooleanExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments)
			throws IllegalArgumentException;

	/**
	 * Returns the value corresponding to a boolean expression.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If the expression is not well formed or the referenced object is not
	 * a boolean, the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param expression the expression to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the literal value pointed by the expression.
	 * @throws IllegalArgumentException
	 */
	public Boolean parseBooleanExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;

	/**
	 * Returns the value corresponding to the left hand term of a boolean
	 * expression. The function receives the parameter assignment resolver
	 * that shall be used to map the possible referenced objects to their
	 * respective values.
	 * 
	 * If the expression is not well formed or the referenced object is not
	 * a boolean, the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param term the left hand term to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the boolean value of the left hand term.
	 * @throws IllegalArgumentException
	 */
	public Boolean parseBooleanExpression(MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;
	
	/**
	 * Returns the boolean value corresponding to a given parameter value.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If any of the expressions that might form the parameter value
	 * is not well formed or the referenced object is not a boolean,
	 * the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param pva the parameter value to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the boolean parameter value.
	 * @throws IllegalArgumentException
	 */
	Boolean parseBooleanExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;
	
	/**
	 * Returns the boolean value associated to a generic referenceable object.
	 * Depending on its type, the pointed object will be parsed accordingly.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If the referenced object or its representation is not a boolean,
	 * the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param object the generic referenceable object.
	 * @param resolver the parameter assignment resolver.
	 * @return the associated boolean value.
	 * @throws IllegalArgumentException
	 */
	Boolean parseBooleanReferencedObject(MCommonReferenceableObj object,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;
	
	/**
	 * Returns the value corresponding to a string expression. The function
	 * receives the collection of assignments to the parameters
	 * that can be referenced in the string expression.
	 * @param expression the string expression.
	 * @param assignments the collection of value assignments to the parameters
	 *                    used in the definition of the expression.
	 * @return the string value of the expression.
	 * @see #parseStringExpression(MParameterValueExpression, IParameterAssignmentResolver)
	 */
	public StringValue parseStringExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments)
			throws IllegalArgumentException;

	/**
	 * Returns the value corresponding to a string expression.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If the expression is not well formed or the referenced object is not
	 * a string, the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param expression the expression to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the string value pointed by the expression.
	 * @throws IllegalArgumentException
	 */
	public StringValue parseStringExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;

	/**
	 * Returns the value corresponding to the left hand term of a string
	 * expression. The function receives the parameter assignment resolver
	 * that shall be used to map the possible referenced objects to their
	 * respective values.
	 * 
	 * If the expression is not well formed or the referenced object is not
	 * a string, the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param term the left hand term to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the string value of the left hand term.
	 * @throws IllegalArgumentException
	 */
	StringValue parseStringExpression(MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;

	/**
	 * Returns the string value corresponding to a given parameter value.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If any of the expressions that might form the parameter value
	 * is not well formed or the referenced object is not a string,
	 * the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param pva the parameter value to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the string parameter value.
	 * @throws IllegalArgumentException
	 */
	StringValue parseStringExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;
	
	/**
	 * Returns the string value associated to a generic referenceable object.
	 * Depending on its type, the pointed object will be parsed accordingly.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If the referenced object or its representation is not a string,
	 * the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param object the generic referenceable object.
	 * @param resolver the parameter assignment resolver.
	 * @return the associated string value.
	 * @throws IllegalArgumentException
	 */
	StringValue parseStringReferencedObject(MCommonReferenceableObj object,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;
	
	/**
	 * Returns the value corresponding to an integer expression. The function
	 * receives the collection of assignments to the parameters
	 * that can be referenced in the string expression.
	 * @param expression the integer expression.
	 * @param assignments the collection of value assignments to the parameters
	 *                    used in the definition of the expression.
	 * @return the integer value of the expression.
	 * @see #parseIntegerExpression(MParameterValueExpression, IParameterAssignmentResolver)
	 */
	public Long parseIntegerExpression(
			MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments)
			throws NumberFormatException, IllegalArgumentException;

	/**
	 * Returns the value corresponding to an integer expression.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If the expression is not well formed or the referenced object is not
	 * an integer, the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param expression the expression to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the integer value pointed by the expression.
	 * @throws IllegalArgumentException
	 */
	public Long parseIntegerExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException;

	/**
	 * Returns the value corresponding to the left hand term of an integer
	 * expression. The function receives the parameter assignment resolver
	 * that shall be used to map the possible referenced objects to their
	 * respective values.
	 * 
	 * If the expression is not well formed or the referenced object is not
	 * an integer, the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param term the left hand term to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the integer value of the left hand term.
	 * @throws IllegalArgumentException
	 */
	Long parseIntegerExpression(MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException;
	
	/**
	 * Returns the integer value corresponding to a given parameter value.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If any of the expressions that might form the parameter value
	 * is not well formed or the referenced object is not an integer,
	 * the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param pva the parameter value to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the integer parameter value.
	 * @throws IllegalArgumentException
	 */
	Long parseIntegerExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException;
	
	/**
	 * Returns the integer value associated to a generic referenceable object.
	 * Depending on its type, the pointed object will be parsed accordingly.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If the referenced object or its representation is not an integer,
	 * the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param object the generic referenceable object.
	 * @param resolver the parameter assignment resolver.
	 * @return the associated integer value.
	 * @throws IllegalArgumentException
	 */
	Long parseIntegerReferencedObject(MCommonReferenceableObj object,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;
	
	/**
	 * Returns the value corresponding to a real expression. The function
	 * receives the collection of assignments to the parameters
	 * that can be referenced in the string expression.
	 * @param expression the real expression.
	 * @param assignments the collection of value assignments to the parameters
	 *                    used in the definition of the expression.
	 * @return the real value of the expression.
	 * @see #parseIntegerExpression(MParameterValueExpression, IParameterAssignmentResolver)
	 */
	public Float parseRealExpression(MParameterValueExpression expression,
			Collection<MParameterValueAssignment> assignments)
			throws NumberFormatException, IllegalArgumentException;

	/**
	 * Returns the value corresponding to a real expression.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If the expression is not well formed or the referenced object is not
	 * of a real type, the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param expression the expression to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the real value pointed by the expression.
	 * @throws IllegalArgumentException
	 */
	public Float parseRealExpression(
			MParameterValueExpression expression,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException;

	/**
	 * Returns the value corresponding to the left hand term of a real
	 * expression. The function receives the parameter assignment resolver
	 * that shall be used to map the possible referenced objects to their
	 * respective values.
	 * 
	 * If the expression is not well formed or the referenced object is not
	 * of a real type, the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param term the left hand term to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the real value of the left hand term.
	 * @throws IllegalArgumentException
	 */
	Float parseRealExpression(MParameterValueTERM term,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException;

	/**
	 * Returns the real value corresponding to a given parameter value.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If any of the expressions that might form the parameter value
	 * is not well formed or the referenced object is not of a real type,
	 * the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param pva the parameter value to be parsed.
	 * @param resolver the parameter assignment resolver.
	 * @return the real parameter value.
	 * @throws IllegalArgumentException
	 */
	Float parseRealExpression(MParameterValue pva,
			IParameterAssignmentResolver resolver)
			throws NumberFormatException, IllegalArgumentException;

	/**
	 * Returns the real value associated to a generic referenceable object.
	 * Depending on its type, the pointed object will be parsed accordingly.
	 * The function receives the parameter assignment resolver that shall
	 * be used to map the possible referenced objects to their respective
	 * values.
	 * 
	 * If the referenced object or its representation is not of a real type,
	 * the method will throw an {@link IllegalArgumentException}.
	 * 
	 * @param object the generic referenceable object.
	 * @param resolver the parameter assignment resolver.
	 * @return the associated real value.
	 * @throws IllegalArgumentException
	 */
	Float parseRealReferencedObject(MCommonReferenceableObj object,
			IParameterAssignmentResolver resolver)
			throws IllegalArgumentException;
	
	/**
	 * Creates a simple boolean expression from a given boolean value.
	 * 
	 * @param bool the boolean value that will be use to construct the
	 * simple expression.
	 * @return the resulting expression.
	 */
	public MParameterValueExpression createBooleanExpression(
			Boolean bool);

	/**
	 * Creates a simple expression from a given string.
	 * 
	 * @param string the string that will be use to construct the
	 * expression.
	 * @return the resulting expression.
	 */
	public MParameterValueExpression createStringExpression(
			String string);
	
	/**
	 * Creates a simple integer expression from a given integer.
	 * 
	 * @param integer the integer value that will be use to construct the
	 * simple expression.
	 * @return the resulting expression.
	 */
	public MParameterValueExpression createIntegerExpression(
			Integer integer);

	/**
	 * Creates a simple real expression from a given floating point value.
	 * 
	 * @param float the floating point value that will be use to construct the
	 * simple expression.
	 * @return the resulting expression.
	 */
	public MParameterValueExpression createRealExpression(Float real);

	/**
	 * Creates a simple expression from a given enumerated literal.
	 * 
	 * @param literal the enumerated literal that will be use to construct the
	 * simple expression.
	 * @return the resulting expression.
	 */
	public MParameterValueExpression createEnumExpression(
			MEnumParameterLiteral literal);

	/**
	 * Adds the Xtext nature to a given workspace project.
	 * 
	 * @param project the project.
	 */
	public void addXtextNature(IProject project);

	/**
	 * Converts a list of Xtext issues in a generic EMF diagnostic object.
	 * 
	 * @param model The root model object.
	 * @param adapterFactory The adapter factory corresponding to the model
	 * 						 object used to obtain the object label.
	 * @param issues The list of Xtext issues.
	 * @return The <code>Diagnostic</code> object.
	 * @see #convertToDiagnostic(String, EObject, AdapterFactory, List)
	 */
	public Diagnostic convertToDiagnostic(EObject model,
			AdapterFactory adapterFactory, List<Issue> issues);

	/**
	 * Converts a list of Xtext issues in a generic EMF diagnostic object.
	 * 
	 * @param label The label assigned to the object. If the value is
	 * 				<code>null</code>, then the label will be obtained from
	 * 				adapter factory passed as parameter.
	 * @param model The root model object.
	 * @param adapterFactory The adapter factory corresponding to the model
	 * 						 object used to obtain the object label.
	 * @param issues The list of Xtext issues.
	 * @return The <code>Diagnostic</code> object.
	 * @see org.eclipse.emf.common.util.Diagnostic
	 */
	public Diagnostic convertToDiagnostic(String label, EObject model,
			AdapterFactory adapterFactory, List<Issue> issues);

	/**
	 * Validates a given resource. Returns a <code>Diagnostic</code> object
	 * with the result of the validation. In order to generate the appropriate
	 * messages, an adapter factory is given to provide the correct names
	 * of the different model elements.
	 * 
	 * @param modelResource the resource that contains the model to be validate.
	 * @param adapterFactory the adapter factory that will provide the names
	 * of the model elements.
	 * @return the diagnostic of the validation.
	 */
	public Diagnostic validateResource(Resource modelResource,
			AdapterFactory adapterFactory);

	/**
	 * Returns the complete list of parent languages of a given language.
	 * 
	 * @param lang the language.
	 * @return the list of parent languages.
	 */
	public Set<MLanguage> getAllParentLanguages(MLanguage lang);

	/**
	 * Returns a language given its URI and version from the set of installed
	 * languages. If no language can be found for the given parameters, the
	 * method will return <code>null</code>
	 * 
	 * @param uri the URI of the requested language.
	 * @param version the version of the requested language.
	 * @return the language object or <code>null</code> if no language could
	 * be found.
	 */
	public MLanguage getLanguage(String uri, String version);
	
	/**
	 * Returns the final value expression used in a given parameter value
	 * assignment.
	 * @param assignment the parameter value assignment.
	 * @return the value expression.
	 */
	MParameterValueExpression getParameterValue(MParameterValueAssignment assignment) throws IllegalArgumentException;
	
	/**
	 * Returns the default value expression of a given parameter.
	 * @param parameter the parameter.
	 * @return the value expression.
	 */
	MParameterValueExpression getDefaultValue(MParameter parameter) throws IllegalArgumentException;
	
	/**
	 * Returns the range of valid values defined for a parameter.
	 * @param parameter the parameter.
	 * @return the parameter range.
	 */
	MParameterRange getRange(MParameter parameter) throws IllegalArgumentException;

	/**
	 * Returns a package with a given URI from the System Library. If the
	 * is not found, it returns <code>null</code>.
	 * @param uri the URI of the package to look for.
	 * @return the package or <code>null</code> if the package could not be
	 *         found. 
	 */
	MSystemPackage getSystemPackage(String uri);
	
}