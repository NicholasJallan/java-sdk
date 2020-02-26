/**
*  SDK
*
* This library allows to interact with the  payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.service;

import com.wallee.sdk.ApiCallback;
import com.wallee.sdk.ApiClient;
import com.wallee.sdk.ApiException;
import com.wallee.sdk.ApiResponse;
import com.wallee.sdk.Pair;
import com.wallee.sdk.ProgressRequestBody;
import com.wallee.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.wallee.sdk.model.ClientError;
import com.wallee.sdk.model.EntityQuery;
import com.wallee.sdk.model.EntityQueryFilter;
import com.wallee.sdk.model.ServerError;
import com.wallee.sdk.model.SubscriptionSuspension;
import com.wallee.sdk.model.SubscriptionSuspensionCreate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptionSuspensionService {
    private ApiClient apiClient;

    public SubscriptionSuspensionService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for count
     * @param spaceId  (required)
     * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--count">Count Documentation</a>
     */
    public com.squareup.okhttp.Call countCall(Long spaceId, EntityQueryFilter filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = filter;

        // create path and map variables
        String localVarPath = "/subscription-suspension/count";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call countValidateBeforeCall(Long spaceId, EntityQueryFilter filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling count(Async)");
        }
        

        com.squareup.okhttp.Call call = countCall(spaceId, filter, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * @param spaceId  (required)
     * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
     * @return Long
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--count">Count Documentation</a>
     */
    public Long count(Long spaceId, EntityQueryFilter filter) throws ApiException {
        ApiResponse<Long> resp = countWithHttpInfo(spaceId, filter);
        return resp.getData();
    }

    /**
     * Count
     * Counts the number of items in the database as restricted by the given filter.
     * @param spaceId  (required)
     * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
     * @return ApiResponse&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--count">Count Documentation</a>
     */
    public ApiResponse<Long> countWithHttpInfo(Long spaceId, EntityQueryFilter filter) throws ApiException {
        com.squareup.okhttp.Call call = countValidateBeforeCall(spaceId, filter, null, null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Count (asynchronously)
     * Counts the number of items in the database as restricted by the given filter.
     * @param spaceId  (required)
     * @param filter The filter which restricts the entities which are used to calculate the count. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--count">Count Documentation</a>
     */
    public com.squareup.okhttp.Call countAsync(Long spaceId, EntityQueryFilter filter, final ApiCallback<Long> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = countValidateBeforeCall(spaceId, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for create
     * @param spaceId  (required)
     * @param suspension  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--create">Create Documentation</a>
     */
    public com.squareup.okhttp.Call createCall(Long spaceId, SubscriptionSuspensionCreate suspension, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = suspension;

        // create path and map variables
        String localVarPath = "/subscription-suspension/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createValidateBeforeCall(Long spaceId, SubscriptionSuspensionCreate suspension, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling create(Async)");
        }
        
        // verify the required parameter 'suspension' is set
        if (suspension == null) {
            throw new ApiException("Missing the required parameter 'suspension' when calling create(Async)");
        }
        

        com.squareup.okhttp.Call call = createCall(spaceId, suspension, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create
     * The create operation creates a new subscription suspension.
     * @param spaceId  (required)
     * @param suspension  (required)
     * @return SubscriptionSuspension
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--create">Create Documentation</a>
     */
    public SubscriptionSuspension create(Long spaceId, SubscriptionSuspensionCreate suspension) throws ApiException {
        ApiResponse<SubscriptionSuspension> resp = createWithHttpInfo(spaceId, suspension);
        return resp.getData();
    }

    /**
     * Create
     * The create operation creates a new subscription suspension.
     * @param spaceId  (required)
     * @param suspension  (required)
     * @return ApiResponse&lt;SubscriptionSuspension&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--create">Create Documentation</a>
     */
    public ApiResponse<SubscriptionSuspension> createWithHttpInfo(Long spaceId, SubscriptionSuspensionCreate suspension) throws ApiException {
        com.squareup.okhttp.Call call = createValidateBeforeCall(spaceId, suspension, null, null);
        Type localVarReturnType = new TypeToken<SubscriptionSuspension>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create (asynchronously)
     * The create operation creates a new subscription suspension.
     * @param spaceId  (required)
     * @param suspension  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--create">Create Documentation</a>
     */
    public com.squareup.okhttp.Call createAsync(Long spaceId, SubscriptionSuspensionCreate suspension, final ApiCallback<SubscriptionSuspension> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createValidateBeforeCall(spaceId, suspension, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubscriptionSuspension>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for read
     * @param spaceId  (required)
     * @param id The id of the suspension which should be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/subscription-suspension/read";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "*/*"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call readValidateBeforeCall(Long spaceId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling read(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling read(Async)");
        }
        

        com.squareup.okhttp.Call call = readCall(spaceId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the suspension which should be returned. (required)
     * @return SubscriptionSuspension
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--read">Read Documentation</a>
     */
    public SubscriptionSuspension read(Long spaceId, Long id) throws ApiException {
        ApiResponse<SubscriptionSuspension> resp = readWithHttpInfo(spaceId, id);
        return resp.getData();
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the suspension which should be returned. (required)
     * @return ApiResponse&lt;SubscriptionSuspension&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--read">Read Documentation</a>
     */
    public ApiResponse<SubscriptionSuspension> readWithHttpInfo(Long spaceId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = readValidateBeforeCall(spaceId, id, null, null);
        Type localVarReturnType = new TypeToken<SubscriptionSuspension>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read (asynchronously)
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param spaceId  (required)
     * @param id The id of the suspension which should be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readAsync(Long spaceId, Long id, final ApiCallback<SubscriptionSuspension> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = readValidateBeforeCall(spaceId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubscriptionSuspension>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for search
     * @param spaceId  (required)
     * @param query The query restricts the subscription suspensions which are returned by the search. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--search">Search Documentation</a>
     */
    public com.squareup.okhttp.Call searchCall(Long spaceId, EntityQuery query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = query;

        // create path and map variables
        String localVarPath = "/subscription-suspension/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchValidateBeforeCall(Long spaceId, EntityQuery query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling search(Async)");
        }
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling search(Async)");
        }
        

        com.squareup.okhttp.Call call = searchCall(spaceId, query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the subscription suspensions which are returned by the search. (required)
     * @return List&lt;SubscriptionSuspension&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--search">Search Documentation</a>
     */
    public List<SubscriptionSuspension> search(Long spaceId, EntityQuery query) throws ApiException {
        ApiResponse<List<SubscriptionSuspension>> resp = searchWithHttpInfo(spaceId, query);
        return resp.getData();
    }

    /**
     * Search
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the subscription suspensions which are returned by the search. (required)
     * @return ApiResponse&lt;List&lt;SubscriptionSuspension&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--search">Search Documentation</a>
     */
    public ApiResponse<List<SubscriptionSuspension>> searchWithHttpInfo(Long spaceId, EntityQuery query) throws ApiException {
        com.squareup.okhttp.Call call = searchValidateBeforeCall(spaceId, query, null, null);
        Type localVarReturnType = new TypeToken<List<SubscriptionSuspension>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search (asynchronously)
     * Searches for the entities as specified by the given query.
     * @param spaceId  (required)
     * @param query The query restricts the subscription suspensions which are returned by the search. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--search">Search Documentation</a>
     */
    public com.squareup.okhttp.Call searchAsync(Long spaceId, EntityQuery query, final ApiCallback<List<SubscriptionSuspension>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchValidateBeforeCall(spaceId, query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SubscriptionSuspension>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for terminate
     * @param spaceId  (required)
     * @param suspensionId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--terminate">terminate Documentation</a>
     */
    public com.squareup.okhttp.Call terminateCall(Long spaceId, Long suspensionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/subscription-suspension/terminate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (spaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("spaceId", spaceId));
        if (suspensionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("suspensionId", suspensionId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call terminateValidateBeforeCall(Long spaceId, Long suspensionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling terminate(Async)");
        }
        
        // verify the required parameter 'suspensionId' is set
        if (suspensionId == null) {
            throw new ApiException("Missing the required parameter 'suspensionId' when calling terminate(Async)");
        }
        

        com.squareup.okhttp.Call call = terminateCall(spaceId, suspensionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * terminate
     * The create operation creates a new subscription suspension.
     * @param spaceId  (required)
     * @param suspensionId  (required)
     * @return SubscriptionSuspension
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--terminate">terminate Documentation</a>
     */
    public SubscriptionSuspension terminate(Long spaceId, Long suspensionId) throws ApiException {
        ApiResponse<SubscriptionSuspension> resp = terminateWithHttpInfo(spaceId, suspensionId);
        return resp.getData();
    }

    /**
     * terminate
     * The create operation creates a new subscription suspension.
     * @param spaceId  (required)
     * @param suspensionId  (required)
     * @return ApiResponse&lt;SubscriptionSuspension&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--terminate">terminate Documentation</a>
     */
    public ApiResponse<SubscriptionSuspension> terminateWithHttpInfo(Long spaceId, Long suspensionId) throws ApiException {
        com.squareup.okhttp.Call call = terminateValidateBeforeCall(spaceId, suspensionId, null, null);
        Type localVarReturnType = new TypeToken<SubscriptionSuspension>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * terminate (asynchronously)
     * The create operation creates a new subscription suspension.
     * @param spaceId  (required)
     * @param suspensionId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#subscription-suspension-service--terminate">terminate Documentation</a>
     */
    public com.squareup.okhttp.Call terminateAsync(Long spaceId, Long suspensionId, final ApiCallback<SubscriptionSuspension> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = terminateValidateBeforeCall(spaceId, suspensionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubscriptionSuspension>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
