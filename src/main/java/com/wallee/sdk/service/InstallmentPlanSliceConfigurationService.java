package com.wallee.sdk.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.json.Json;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.InstallmentPlanSliceConfiguration;


public class InstallmentPlanSliceConfigurationService {
    private ApiClient apiClient;

    public InstallmentPlanSliceConfigurationService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param filter  The filter which restricts the installment plan slice configurations which are used to calculate the count.
     * @return Long
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-plan-slice-configuration-service--count">Count Documentation</a>
     **/
    public Long count(Long spaceId, EntityQueryFilter filter) throws IOException {
        HttpResponse response = countForHttpResponse(spaceId, filter);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>(){});
    }

    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param filter  The filter which restricts the installment plan slice configurations which are used to calculate the count.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return Long
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-plan-slice-configuration-service--count">Count Documentation</a>
     **/
    public Long count(Long spaceId, EntityQueryFilter filter, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(spaceId, filter, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>(){});
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, true, apiClient, "/installment-plan-slice-configuration/count");
    }

    public HttpResponse countForHttpResponse(Long spaceId, InputStream filter, String mediaType) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, mediaType, true, apiClient, "/installment-plan-slice-configuration/count");
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "count");
        ServiceUtils.checkParam(filter == null, "filter", "count");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/installment-plan-slice-configuration/count");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(filter);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the installment plan slice configuration which should be returned.
     * @return InstallmentPlanSliceConfiguration
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-plan-slice-configuration-service--read">Read Documentation</a>
     **/
    public InstallmentPlanSliceConfiguration read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<InstallmentPlanSliceConfiguration>() {
        });
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param id      The id of the installment plan slice configuration which should be returned.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return InstallmentPlanSliceConfiguration
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-plan-slice-configuration-service--read">Read Documentation</a>
     **/
    public InstallmentPlanSliceConfiguration read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<InstallmentPlanSliceConfiguration>() {
        });
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, apiClient, "/installment-plan-slice-configuration/read");
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, params, apiClient, "/installment-plan-slice-configuration/read");
    }


    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the installment plan slice configurations which are returned by the search.
     * @return List&lt;InstallmentPlanSliceConfiguration&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-plan-slice-configuration-service--search">Search Documentation</a>
     **/
    public List<InstallmentPlanSliceConfiguration> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<InstallmentPlanSliceConfiguration>>() {
        });
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the installment plan slice configurations which are returned by the search.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;InstallmentPlanSliceConfiguration&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#installment-plan-slice-configuration-service--search">Search Documentation</a>
     **/
    public List<InstallmentPlanSliceConfiguration> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<InstallmentPlanSliceConfiguration>>() {
        });
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/installment-plan-slice-configuration/search");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse searchForHttpResponse(Long spaceId, InputStream query, String mediaType) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/installment-plan-slice-configuration/search");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        ServiceUtils.checkParam(spaceId == null, "spaceId", "search");
        ServiceUtils.checkParam(query == null, "query", "search");

        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/installment-plan-slice-configuration/search");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        uriBuilder = ServiceUtils.addParamToUriBuilder(allParams, uriBuilder);

        GenericUrl genericUrl = new GenericUrl(uriBuilder.build().toString());

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
