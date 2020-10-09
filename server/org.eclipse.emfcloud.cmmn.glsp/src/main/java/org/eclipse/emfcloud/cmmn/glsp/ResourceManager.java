/********************************************************************************
 * Copyright (c) 2019-2020 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0, or the MIT License which is
 * available at https://opensource.org/licenses/MIT.
 *
 * SPDX-License-Identifier: EPL-2.0 OR MIT
 ********************************************************************************/
package org.eclipse.emfcloud.cmmn.glsp;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emfcloud.cmmn.glsp.model.CMMNModelState;
import org.eclipse.emfcloud.metamodel.CMMN.CMMNPackage;
import org.eclipse.emfcloud.metamodel.CMMN.util.CMMNAdapterFactory;
import org.eclipse.emfcloud.metamodel.enotation.EnotationPackage;
import org.eclipse.glsp.api.protocol.GLSPServerException;
import org.eclipse.glsp.api.utils.ClientOptions;

public class ResourceManager {
	public static final String CMMN_EXTENSION = ".cmmn";
	public static final String NOTATION_EXTENSION = ".enotation";

	private static Logger LOGGER = Logger.getLogger(ResourceManager.class);

	// TODO: check why is null in this case
	// @Inject
	// private ModelServerClientProvider modelServerClientProvider;

	private ResourceSet resourceSet;
	private String baseSourceUri;
	private CMMNFacade cmmnFacade;
	private EditingDomain editingDomain;

	public ResourceManager(CMMNModelState modelState) {
		String sourceURI = ClientOptions.getValue(modelState.getClientOptions(), ClientOptions.SOURCE_URI)
				.orElseThrow(() -> new GLSPServerException("No source uri given to load model!"));
		if (!sourceURI.endsWith(CMMN_EXTENSION) && !sourceURI.endsWith(NOTATION_EXTENSION)) {
			throw new GLSPServerException("Could not setup ResourceManager: \n Invalid file extension: " + sourceURI);
		}

		this.baseSourceUri = sourceURI.substring(0, sourceURI.lastIndexOf('.'));
		this.resourceSet = setupResourceSet();
		createCMMNFacade(modelState);
	}

	protected ResourceSet setupResourceSet() {
		editingDomain = new AdapterFactoryEditingDomain(new CMMNAdapterFactory(), new BasicCommandStack());
		ResourceSet resourceSet = editingDomain.getResourceSet();
		resourceSet.getPackageRegistry().put(CMMNPackage.eINSTANCE.getNsURI(), CMMNPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(EnotationPackage.eINSTANCE.getNsURI(), EnotationPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		return resourceSet;
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	public CMMNFacade getCMMNFacade() {
		return cmmnFacade;
	}

	protected CMMNFacade createCMMNFacade(CMMNModelState modelState) {
		try {
			Resource semanticResource = loadResource(convertToFile(getSemanticURI()));
			Resource notationResource = loadResource(convertToFile(getNotationURI()));
			cmmnFacade = new CMMNFacade(semanticResource, notationResource, modelState.getIndex());
			return cmmnFacade;
		} catch (IOException e) {
			LOGGER.error(e);
			throw new GLSPServerException("Error during model loading", e);
		}
	}

	public String getSemanticURI() {
		return baseSourceUri + CMMN_EXTENSION;
	}

	public String getNotationURI() {
		return baseSourceUri + NOTATION_EXTENSION;
	}

	private File convertToFile(String sourceURI) {
		if (sourceURI != null) {
			return new File(sourceURI);
		}
		return null;
	}

	private Resource loadResource(File file) throws IOException {
		Resource resource = createResource(file.getAbsolutePath());
		configureResource(resource);
		if (file.exists()) {
			resource.load(Collections.EMPTY_MAP);
		}
		return resource;
	}

	private Resource loadResource(File file, EObject root) throws IOException {
		Resource resource = createResource(file.getAbsolutePath());
		resource.getContents().clear();
		resource.getContents().add(root);
		configureResource(resource);
		return resource;
	}

	private void configureResource(Resource resource) {
		if (resource instanceof XMLResource) {
			XMLResource xmlResource = (XMLResource) resource;
			xmlResource.getDefaultSaveOptions().put(XMLResource.OPTION_PROCESS_DANGLING_HREF,
					XMLResource.OPTION_PROCESS_DANGLING_HREF_RECORD);
		}
	}

	private Resource createResource(String path) {
		return resourceSet.createResource(URI.createFileURI(path));
	}

	public void save() {
		try {
			cmmnFacade.getSemanticResource().save(Collections.EMPTY_MAP);
			cmmnFacade.getNotationResource().save(Collections.EMPTY_MAP);
			handleSaveErrors(cmmnFacade.getSemanticResource());
			handleSaveErrors(cmmnFacade.getNotationResource());
		} catch (IOException e) {
			throw new GLSPServerException("Could not save notation resource", e);
		}
	}

	private void handleSaveErrors(Resource resource) {
		if (resource.getErrors().isEmpty()) {
			return;
		}

		LOGGER.error("Some errors have been found while saving " + resource.getURI().lastSegment() + ":");
		for (Diagnostic d : resource.getErrors()) {
			if (d instanceof Exception) {
				LOGGER.error(d.getMessage(), (Exception) d);
			}
		}

	}

}
