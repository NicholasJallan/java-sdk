package com.wallee.sdk.service;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.RestLanguage;


public class LanguageService {
    private ApiClient apiClient;

    public LanguageService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * All
     * This operation returns all languages.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @return List&lt;RestLanguage&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#language-service--all">All Documentation</a>
     **/
    public List<RestLanguage> all() throws IOException {
        HttpResponse response = allForHttpResponse();
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<RestLanguage>>() {
        });
    }

    /**
     * All
     * This operation returns all languages.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;RestLanguage&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#language-service--all">All Documentation</a>
     **/
    public List<RestLanguage> all(Map<String, Object> params) throws IOException {
        HttpResponse response = allForHttpResponse(params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<RestLanguage>>() {
        });
    }

    public HttpResponse allForHttpResponse() throws IOException {

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/language/all");

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, null).execute();
    }

    public HttpResponse allForHttpResponse(Map<String, Object> params) throws IOException {
        return ServiceUtils.allForHttpResponse(params, apiClient, "/language/all");
    }


}
