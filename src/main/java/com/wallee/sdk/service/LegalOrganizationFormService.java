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
import com.wallee.sdk.model.LegalOrganizationForm;
import com.wallee.sdk.model.ServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LegalOrganizationFormService {
    private ApiClient apiClient;

    public LegalOrganizationFormService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for all
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--all">All Documentation</a>
     */
    public com.squareup.okhttp.Call allCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/legal-organization-form/all";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call allValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = allCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * All
     * This operation returns all entities which are available.
     * @return List&lt;LegalOrganizationForm&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--all">All Documentation</a>
     */
    public List<LegalOrganizationForm> all() throws ApiException {
        ApiResponse<List<LegalOrganizationForm>> resp = allWithHttpInfo();
        return resp.getData();
    }

    /**
     * All
     * This operation returns all entities which are available.
     * @return ApiResponse&lt;List&lt;LegalOrganizationForm&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--all">All Documentation</a>
     */
    public ApiResponse<List<LegalOrganizationForm>> allWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = allValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<LegalOrganizationForm>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All (asynchronously)
     * This operation returns all entities which are available.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--all">All Documentation</a>
     */
    public com.squareup.okhttp.Call allAsync(final ApiCallback<List<LegalOrganizationForm>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = allValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LegalOrganizationForm>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for country
     * @param code The country in ISO 3166-1 alpha-2 format, for which all legal organization forms should be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--country">Find by Country Documentation</a>
     */
    public com.squareup.okhttp.Call countryCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/legal-organization-form/country";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (code != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("code", code));

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
    private com.squareup.okhttp.Call countryValidateBeforeCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling country(Async)");
        }
        

        com.squareup.okhttp.Call call = countryCall(code, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Find by Country
     * This operation returns all legal organization forms for a given country.
     * @param code The country in ISO 3166-1 alpha-2 format, for which all legal organization forms should be returned. (required)
     * @return List&lt;LegalOrganizationForm&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--country">Find by Country Documentation</a>
     */
    public List<LegalOrganizationForm> country(String code) throws ApiException {
        ApiResponse<List<LegalOrganizationForm>> resp = countryWithHttpInfo(code);
        return resp.getData();
    }

    /**
     * Find by Country
     * This operation returns all legal organization forms for a given country.
     * @param code The country in ISO 3166-1 alpha-2 format, for which all legal organization forms should be returned. (required)
     * @return ApiResponse&lt;List&lt;LegalOrganizationForm&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--country">Find by Country Documentation</a>
     */
    public ApiResponse<List<LegalOrganizationForm>> countryWithHttpInfo(String code) throws ApiException {
        com.squareup.okhttp.Call call = countryValidateBeforeCall(code, null, null);
        Type localVarReturnType = new TypeToken<List<LegalOrganizationForm>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find by Country (asynchronously)
     * This operation returns all legal organization forms for a given country.
     * @param code The country in ISO 3166-1 alpha-2 format, for which all legal organization forms should be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--country">Find by Country Documentation</a>
     */
    public com.squareup.okhttp.Call countryAsync(String code, final ApiCallback<List<LegalOrganizationForm>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = countryValidateBeforeCall(code, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LegalOrganizationForm>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for read
     * @param id The id of the legal organization form which should be returned. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/legal-organization-form/read";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call readValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling read(Async)");
        }
        

        com.squareup.okhttp.Call call = readCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param id The id of the legal organization form which should be returned. (required)
     * @return LegalOrganizationForm
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--read">Read Documentation</a>
     */
    public LegalOrganizationForm read(Long id) throws ApiException {
        ApiResponse<LegalOrganizationForm> resp = readWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Read
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param id The id of the legal organization form which should be returned. (required)
     * @return ApiResponse&lt;LegalOrganizationForm&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--read">Read Documentation</a>
     */
    public ApiResponse<LegalOrganizationForm> readWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = readValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<LegalOrganizationForm>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read (asynchronously)
     * Reads the entity with the given &#39;id&#39; and returns it.
     * @param id The id of the legal organization form which should be returned. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * For more information visit this link.
     * @see <a href="https://app-wallee.com/doc/api/web-service#legal-organization-form-service--read">Read Documentation</a>
     */
    public com.squareup.okhttp.Call readAsync(Long id, final ApiCallback<LegalOrganizationForm> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = readValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LegalOrganizationForm>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
