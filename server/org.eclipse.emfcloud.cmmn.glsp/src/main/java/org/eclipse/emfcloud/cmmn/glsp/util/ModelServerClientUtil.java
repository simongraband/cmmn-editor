package org.eclipse.emfcloud.cmmn.glsp.util;

import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Paths;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emfcloud.modelserver.client.ModelServerClient;

public final class ModelServerClientUtil {
    private static final String FORMAT = "xmi";
    private static final String MODEL_SERVER_BASE_URL = "http://localhost:8081/api/v1/";

    private ModelServerClientUtil() {
    }

    public static EObject loadResource(URI uri) throws Exception {
        ModelServerClient client = new ModelServerClient(MODEL_SERVER_BASE_URL);
        return client.get(Paths.get(uri).getFileName().toString(), FORMAT).get().body();
    }

    public static <T> Optional<T> loadResource(URI uri, Class<T> clazz) throws Exception {
        EObject eObject = loadResource(uri);
        return clazz.isInstance(eObject) ? Optional.of(clazz.cast(eObject)) : Optional.empty();
    }
}