/********************************************************************************
 * Copyright (c) 2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
package org.eclipse.emfcloud.cmmn.glsp.model;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emfcloud.cmmn.glsp.CMMNFacade;
import org.eclipse.emfcloud.modelserver.client.ModelServerClient;
import org.eclipse.emfcloud.modelserver.client.NotificationSubscriptionListener;
import org.eclipse.emfcloud.modelserver.client.Response;
import org.eclipse.emfcloud.modelserver.edit.CommandCodec;
import org.eclipse.emfcloud.validation.EMFFacetConstraints;
import org.eclipse.emfcloud.validation.ValidationFilter;
import org.eclipse.emfcloud.validation.ValidationFramework;
import org.eclipse.emfcloud.validation.ValidationResult;

import com.google.common.base.Preconditions;

public class CMMNModelServerAccess {

	private static Logger LOGGER = Logger.getLogger(CMMNModelServerAccess.class);

	private static final String FORMAT_XMI = "xmi";

	private String sourceURI;
	
	private ValidationFramework validationFramework;

	private ModelServerClient modelServerClient;
	private NotificationSubscriptionListener<EObject> subscriptionListener;
	private CommandCodec commandCodec;

	public CMMNModelServerAccess(final String sourceURI, final ModelServerClient modelServerClient,
			final CommandCodec commandCodec, CMMNValidationResultChangeListener changeListener) {
		Preconditions.checkNotNull(modelServerClient);
		this.sourceURI = sourceURI;
		this.validationFramework = new ValidationFramework(sourceURI, modelServerClient, changeListener);
		this.modelServerClient = modelServerClient;
		this.commandCodec = commandCodec;
	}

	public ValidationFramework getValidationFramework() {
		return validationFramework;
	}

	public CommandCodec getCommandCodec() {
		return commandCodec;
	}

	public ModelServerClient getModelServerClient() {
		return modelServerClient;
	}

	public void subscribe(NotificationSubscriptionListener<EObject> subscriptionListener) {
		LOGGER.info("EcoreModelServerAccess - subscribe");
		this.subscriptionListener = subscriptionListener;
		this.modelServerClient.subscribe(sourceURI, subscriptionListener, FORMAT_XMI);
	}

	public void unsubscribe() {
		LOGGER.info("EcoreModelServerAccess - unsubscribe");
		if (subscriptionListener != null) {
			this.modelServerClient.unsubscribe(sourceURI);
		}
	}
	
	public CompletableFuture<Void> validate() throws IOException, InterruptedException, ExecutionException {
		return this.validationFramework.validate();
	}
	
	public List<ValidationResult> getValidationResult() throws IOException, InterruptedException, ExecutionException {
		return this.validationFramework.recentValidationResult;
	}
	
	public void initConstraintList() {
		this.validationFramework.getConstraintList();
	}
	
	public EMFFacetConstraints getConstraintList(int elementID, int featureID) {
		return this.validationFramework.inputValidationMap.get(elementID).get(featureID);
	}
	
	public void subscribeToValidation() {
		this.validationFramework.subscribeToValidation();
	}
	
	public void unsubscribeFromValidation() {
		this.validationFramework.unsubscribeFromValidation();
	}
	
	public void addValidationFilter(List<ValidationFilter> contraintValues) throws IOException, InterruptedException, ExecutionException {
		this.validationFramework.addValidationFilter(contraintValues);
	}
	
	public void removeValidationFilter(List<ValidationFilter> contraintValues) throws IOException, InterruptedException, ExecutionException {
		this.validationFramework.removeValidationFilter(contraintValues);
	}
	
	public void toggleValidationFilter(ValidationFilter contraintValue) throws IOException, InterruptedException, ExecutionException {
		this.validationFramework.toggleValidationFilter(contraintValue);
	}
	
	
	//not validated
	private CMMNFacade cmmnFacade;
	
	public CompletableFuture<Response<EObject>> update() {
		EObject root = cmmnFacade.getSemanticResource().getContents().get(0);
		return modelServerClient.update(sourceURI, root, FORMAT_XMI);
	}
	
	public void setEcoreFacade(CMMNFacade cmmnFacade) {
		this.cmmnFacade = cmmnFacade;
	}


}