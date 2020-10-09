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
import com.wallee.sdk.model.ShopifySubscription;
import com.wallee.sdk.model.ShopifySubscriptionCreationRequest;
import com.wallee.sdk.model.ShopifySubscriptionUpdateAddressesRequest;
import com.wallee.sdk.model.ShopifySubscriptionUpdateRequest;
import com.wallee.sdk.model.ShopifySubscriptionVersion;


public class ShopifySubscriptionService {
    private ApiClient apiClient;

    public ShopifySubscriptionService(ApiClient apiClient) {
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
     * @param filter  The filter which restricts the entities which are used to calculate the count.
     * @return Long
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--count">Count Documentation</a>
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
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return Long
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--count">Count Documentation</a>
     **/
    public Long count(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        HttpResponse response = countForHttpResponse(filter, spaceId, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<Long>(){});
    }

    public HttpResponse countForHttpResponse(Long spaceId, EntityQueryFilter filter) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, false, apiClient, "/shopify-subscription/count");
    }

    public HttpResponse countForHttpResponse(Long spaceId, InputStream filter, String mediaType) throws IOException {
        return ServiceUtils.countForHttpResponse(spaceId, filter, mediaType, false, apiClient, "/shopify-subscription/count");
    }

    public HttpResponse countForHttpResponse(EntityQueryFilter filter, Long spaceId, Map<String, Object> params) throws IOException {
        return ServiceUtils.countForHttpResponse(filter, spaceId, params, apiClient, "/shopify-subscription/count");
    }


    /**
     * Create
     * This operation allows to create a Shopify subscription.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param creationRequest
     * @return ShopifySubscriptionVersion
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--create">Create Documentation</a>
     **/
    public ShopifySubscriptionVersion create(Long spaceId, ShopifySubscriptionCreationRequest creationRequest) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, creationRequest);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<ShopifySubscriptionVersion>() {
        });
    }

    /**
     * Create
     * This operation allows to create a Shopify subscription.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param creationRequest
     * @param params          Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return ShopifySubscriptionVersion
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--create">Create Documentation</a>
     **/
    public ShopifySubscriptionVersion create(Long spaceId, ShopifySubscriptionCreationRequest creationRequest, Map<String, Object> params) throws IOException {
        HttpResponse response = createForHttpResponse(spaceId, creationRequest, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<ShopifySubscriptionVersion>() {
        });
    }

    public HttpResponse createForHttpResponse(Long spaceId, ShopifySubscriptionCreationRequest creationRequest) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "create"));
        }// verify the required parameter 'creationRequest' is set
        if (creationRequest == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "creationRequest", "create"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/create");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(creationRequest);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse createForHttpResponse(Long spaceId, InputStream creationRequest, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "create"));
        }// verify the required parameter 'creationRequest' is set
        if (creationRequest == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "creationRequest", "create"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/create");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, creationRequest);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse createForHttpResponse(Long spaceId, ShopifySubscriptionCreationRequest creationRequest, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "create"));
        }// verify the required parameter 'creationRequest' is set
        if (creationRequest == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "creationRequest", "create"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/create");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap : allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(creationRequest);
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
     * @param id      The id of the Shopify subscription which should be returned.
     * @return ShopifySubscription
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--read">Read Documentation</a>
     **/
    public ShopifySubscription read(Long spaceId, Long id) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<ShopifySubscription>() {
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
     * @param id      The id of the Shopify subscription which should be returned.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return ShopifySubscription
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--read">Read Documentation</a>
     **/
    public ShopifySubscription read(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        HttpResponse response = readForHttpResponse(spaceId, id, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<ShopifySubscription>() {
        });
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, apiClient, "/shopify-subscription/read");
    }

    public HttpResponse readForHttpResponse(Long spaceId, Long id, Map<String, Object> params) throws IOException {
        return ServiceUtils.readForHttpResponse(spaceId, id, params, apiClient, "/shopify-subscription/read");
    }


    /**
     * Search
     * Searches for the entities as specified by the given query.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param query   The query restricts the Shopify subscriptions which are returned by the search.
     * @return List&lt;ShopifySubscription&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--search">Search Documentation</a>
     **/
    public List<ShopifySubscription> search(Long spaceId, EntityQuery query) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<ShopifySubscription>>() {
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
     * @param query   The query restricts the Shopify subscriptions which are returned by the search.
     * @param params  Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return List&lt;ShopifySubscription&gt;
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--search">Search Documentation</a>
     **/
    public List<ShopifySubscription> search(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        HttpResponse response = searchForHttpResponse(spaceId, query, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<List<ShopifySubscription>>() {
        });
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "search"));
        }// verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "query", "search"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/search");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse searchForHttpResponse(Long spaceId, InputStream query, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "search"));
        }// verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "query", "search"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/search");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse searchForHttpResponse(Long spaceId, EntityQuery query, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "search"));
        }// verify the required parameter 'query' is set
        if (query == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "query", "search"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/search");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap : allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(query);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Terminate
     * This operation allows to terminate a Shopify subscription.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscriptionId           The ID identifies the Shopify subscription which should be terminated.
     * @param respectTerminationPeriod The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately.
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--terminate">Terminate Documentation</a>
     **/
    public void terminate(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod) throws IOException {
        terminateForHttpResponse(spaceId, subscriptionId, respectTerminationPeriod);
    }

    /**
     * Terminate
     * This operation allows to terminate a Shopify subscription.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscriptionId           The ID identifies the Shopify subscription which should be terminated.
     * @param respectTerminationPeriod The respect termination period controls whether the termination period configured on the product version should be respected or if the operation should take effect immediately.
     * @param params                   Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--terminate">Terminate Documentation</a>
     **/
    public void terminate(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod, Map<String, Object> params) throws IOException {
        terminateForHttpResponse(spaceId, subscriptionId, respectTerminationPeriod, params);
    }

    public HttpResponse terminateForHttpResponse(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "terminate"));
        }// verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "subscriptionId", "terminate"));
        }// verify the required parameter 'respectTerminationPeriod' is set
        if (respectTerminationPeriod == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "respectTerminationPeriod", "terminate"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/terminate");
        {
            String key = "spaceId";
            uriBuilder = uriBuilder.queryParam(key, spaceId);
        }
        {
            String key = "subscriptionId";
            uriBuilder = uriBuilder.queryParam(key, subscriptionId);
        }
        String key = "respectTerminationPeriod";
        uriBuilder = uriBuilder.queryParam(key, respectTerminationPeriod);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse terminateForHttpResponse(Long spaceId, Long subscriptionId, Boolean respectTerminationPeriod, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "terminate"));
        }// verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "subscriptionId", "terminate"));
        }// verify the required parameter 'respectTerminationPeriod' is set
        if (respectTerminationPeriod == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "respectTerminationPeriod", "terminate"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/terminate");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);
        // Add the required query param 'subscriptionId' to the map of query params
        allParams.put("subscriptionId", subscriptionId);
        // Add the required query param 'respectTerminationPeriod' to the map of query params
        allParams.put("respectTerminationPeriod", respectTerminationPeriod);

        for (Map.Entry<String, Object> entryMap : allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(null);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Update
     * This operation allows to update a Shopify subscription.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscription
     * @return ShopifySubscriptionVersion
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--update">Update Documentation</a>
     **/
    public ShopifySubscriptionVersion update(Long spaceId, ShopifySubscriptionUpdateRequest subscription) throws IOException {
        HttpResponse response = updateForHttpResponse(spaceId, subscription);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<ShopifySubscriptionVersion>() {
        });
    }

    /**
     * Update
     * This operation allows to update a Shopify subscription.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param subscription
     * @param params       Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return ShopifySubscriptionVersion
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--update">Update Documentation</a>
     **/
    public ShopifySubscriptionVersion update(Long spaceId, ShopifySubscriptionUpdateRequest subscription, Map<String, Object> params) throws IOException {
        HttpResponse response = updateForHttpResponse(spaceId, subscription, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<ShopifySubscriptionVersion>() {
        });
    }

    public HttpResponse updateForHttpResponse(Long spaceId, ShopifySubscriptionUpdateRequest subscription) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "update"));
        }// verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "subscription", "update"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/update");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(subscription);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse updateForHttpResponse(Long spaceId, InputStream subscription, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "update"));
        }// verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "subscription", "update"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/update");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, subscription);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse updateForHttpResponse(Long spaceId, ShopifySubscriptionUpdateRequest subscription, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "update"));
        }// verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "subscription", "update"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/update");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap : allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(subscription);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


    /**
     * Update Addresses
     * This operation allows to update a Shopify subscription addresses.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param updateRequest
     * @return ShopifySubscriptionVersion
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--update-addresses">Update Addresses Documentation</a>
     **/
    public ShopifySubscriptionVersion updateAddresses(Long spaceId, ShopifySubscriptionUpdateAddressesRequest updateRequest) throws IOException {
        HttpResponse response = updateAddressesForHttpResponse(spaceId, updateRequest);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<ShopifySubscriptionVersion>() {
        });
    }

    /**
     * Update Addresses
     * This operation allows to update a Shopify subscription addresses.
     * <p><b>200</b> - This status code indicates that a client request was successfully received, understood, and accepted.
     * <p><b>442</b> - This status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error.
     * <p><b>542</b> - This status code indicates that the server encountered an unexpected condition that prevented it from fulfilling the client request.
     *
     * @param spaceId
     * @param updateRequest
     * @param params        Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
     * @return ShopifySubscriptionVersion
     * @throws IOException if an error occurs while attempting to invoke the API
     *                     For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#shopify-subscription-service--update-addresses">Update Addresses Documentation</a>
     **/
    public ShopifySubscriptionVersion updateAddresses(Long spaceId, ShopifySubscriptionUpdateAddressesRequest updateRequest, Map<String, Object> params) throws IOException {
        HttpResponse response = updateAddressesForHttpResponse(spaceId, updateRequest, params);
        return apiClient.getObjectMapper().readValue(response.getContent(), new TypeReference<ShopifySubscriptionVersion>() {
        });
    }

    public HttpResponse updateAddressesForHttpResponse(Long spaceId, ShopifySubscriptionUpdateAddressesRequest updateRequest) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "updateAddresses"));
        }// verify the required parameter 'updateRequest' is set
        if (updateRequest == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "updateRequest", "updateAddresses"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/update-addresses");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateRequest);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse updateAddressesForHttpResponse(Long spaceId, InputStream updateRequest, String mediaType) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "updateAddresses"));
        }// verify the required parameter 'updateRequest' is set
        if (updateRequest == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "updateRequest", "updateAddresses"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/update-addresses");
        String key = "spaceId";
        uriBuilder = uriBuilder.queryParam(key, spaceId);

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, updateRequest);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse updateAddressesForHttpResponse(Long spaceId, ShopifySubscriptionUpdateAddressesRequest updateRequest, Map<String, Object> params) throws IOException {
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "spaceId", "updateAddresses"));
        }// verify the required parameter 'updateRequest' is set
        if (updateRequest == null) {
            throw new IllegalArgumentException(String.format(ServiceUtils.MISSING_PARAM_1_WHEN_CALLING_2, "updateRequest", "updateAddresses"));
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/shopify-subscription/update-addresses");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<>() : new HashMap<>(params);
        // Add the required query param 'spaceId' to the map of query params
        allParams.put("spaceId", spaceId);

        for (Map.Entry<String, Object> entryMap : allParams.entrySet()) {
            String key = entryMap.getKey();
            Object value = entryMap.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String url = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(url);

        HttpContent content = apiClient.new JacksonJsonHttpContent(updateRequest);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
