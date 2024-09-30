/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.tests;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.ExpandTestOptions;
import com.thousandeyes.sdk.tests.model.SipServerTestRequest;
import com.thousandeyes.sdk.tests.model.SipServerTestResponse;
import com.thousandeyes.sdk.tests.model.SipServerTests;
import java.net.URI;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.model.ValidationError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class SipServerTestsApi {
  private final ApiClient apiClient;

  public SipServerTestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create SIP Server test
   * Creates a new SIP Server test. This method requires Account Admin permissions.
   * @param sipServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return SipServerTestResponse
   * @throws ApiException if fails to make API call
   */
  public SipServerTestResponse createSipServerTest(SipServerTestRequest sipServerTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<SipServerTestResponse> response = createSipServerTestWithHttpInfo(sipServerTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Create SIP Server test
   * Creates a new SIP Server test. This method requires Account Admin permissions.
   * @param sipServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;SipServerTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SipServerTestResponse> createSipServerTestWithHttpInfo(SipServerTestRequest sipServerTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    createSipServerTestValidateRequest(sipServerTestRequest);

    var requestBuilder = createSipServerTestRequestBuilder(sipServerTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), SipServerTestResponse.class);
  }

  private void createSipServerTestValidateRequest(SipServerTestRequest sipServerTestRequest) throws ApiException {
      // verify the required parameter 'sipServerTestRequest' is set
      if (sipServerTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'sipServerTestRequest' when calling createSipServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createSipServerTestRequestBuilder(SipServerTestRequest sipServerTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/tests/sip-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(sipServerTestRequest);
    return requestBuilder;
  }
  /**
   * Delete SIP Server test
   * Deletes the specified SIP Server test. This method requires Account Admin permissions.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteSipServerTest(String testId, String aid) throws ApiException {
    deleteSipServerTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete SIP Server test
   * Deletes the specified SIP Server test. This method requires Account Admin permissions.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteSipServerTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteSipServerTestValidateRequest(testId);

    var requestBuilder = deleteSipServerTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteSipServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteSipServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteSipServerTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/tests/sip-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Get SIP Server test
   * Returns details for a SIP Server test, including name, intervals, targets, alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return SipServerTestResponse
   * @throws ApiException if fails to make API call
   */
  public SipServerTestResponse getSipServerTest(String testId, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<SipServerTestResponse> response = getSipServerTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get SIP Server test
   * Returns details for a SIP Server test, including name, intervals, targets, alert rules and agents.
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;SipServerTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SipServerTestResponse> getSipServerTestWithHttpInfo(String testId, String aid, List<ExpandTestOptions> expand) throws ApiException {
    getSipServerTestValidateRequest(testId);

    var requestBuilder = getSipServerTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), SipServerTestResponse.class);
  }

  private void getSipServerTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getSipServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getSipServerTestRequestBuilder(String testId, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/sip-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List SIP Server tests
   * Returns a list of SIP Server tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return SipServerTests
   * @throws ApiException if fails to make API call
   */
  public SipServerTests getSipServerTests(String aid) throws ApiException {
    ApiResponse<SipServerTests> response = getSipServerTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List SIP Server tests
   * Returns a list of SIP Server tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;SipServerTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SipServerTests> getSipServerTestsWithHttpInfo(String aid) throws ApiException {
    getSipServerTestsValidateRequest();

    var requestBuilder = getSipServerTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), SipServerTests.class);
  }

  private void getSipServerTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getSipServerTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/tests/sip-server";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Update SIP Server test
   * Updates a SIP Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId Test ID (required)
   * @param sipServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return SipServerTestResponse
   * @throws ApiException if fails to make API call
   */
  public SipServerTestResponse updateSipServerTest(String testId, SipServerTestRequest sipServerTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiResponse<SipServerTestResponse> response = updateSipServerTestWithHttpInfo(testId, sipServerTestRequest, aid, expand);
    return response.getData();
  }

  /**
   * Update SIP Server test
   * Updates a SIP Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
   * @param testId Test ID (required)
   * @param sipServerTestRequest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;SipServerTestResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SipServerTestResponse> updateSipServerTestWithHttpInfo(String testId, SipServerTestRequest sipServerTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    updateSipServerTestValidateRequest(testId, sipServerTestRequest);

    var requestBuilder = updateSipServerTestRequestBuilder(testId, sipServerTestRequest, aid, expand);

    return apiClient.send(requestBuilder.build(), SipServerTestResponse.class);
  }

  private void updateSipServerTestValidateRequest(String testId, SipServerTestRequest sipServerTestRequest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateSipServerTest");
      }
      // verify the required parameter 'sipServerTestRequest' is set
      if (sipServerTestRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'sipServerTestRequest' when calling updateSipServerTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateSipServerTestRequestBuilder(String testId, SipServerTestRequest sipServerTestRequest, String aid, List<ExpandTestOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/tests/sip-server/{testId}"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(sipServerTestRequest);
    return requestBuilder;
  }
}