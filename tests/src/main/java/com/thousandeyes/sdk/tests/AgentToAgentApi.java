/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.6
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

import com.thousandeyes.sdk.tests.model.AgentToAgentTest;
import com.thousandeyes.sdk.tests.model.AgentToAgentTests;
import com.thousandeyes.sdk.tests.model.Error;
import com.thousandeyes.sdk.tests.model.Expand;
import java.net.URI;
import com.thousandeyes.sdk.tests.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.model.UpdateAgentToAgentTest;
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
public class AgentToAgentApi {
  private final ApiClient apiClient;

  public AgentToAgentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create Agent to Agent test
   * Creates a new Agent to Agent test. This method requires Account Admin permissions.
   * @param updateAgentToAgentTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return AgentToAgentTest
   * @throws ApiException if fails to make API call
   */
  public AgentToAgentTest createAgentToAgentTest(UpdateAgentToAgentTest updateAgentToAgentTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<AgentToAgentTest> response = createAgentToAgentTestWithHttpInfo(updateAgentToAgentTest, aid, expand);
    return response.getData();
  }

  /**
   * Create Agent to Agent test
   * Creates a new Agent to Agent test. This method requires Account Admin permissions.
   * @param updateAgentToAgentTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;AgentToAgentTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentToAgentTest> createAgentToAgentTestWithHttpInfo(UpdateAgentToAgentTest updateAgentToAgentTest, String aid, List<Expand> expand) throws ApiException {
    createAgentToAgentTestValidateRequest(updateAgentToAgentTest);

    var requestBuilder = createAgentToAgentTestRequestBuilder(updateAgentToAgentTest, aid, expand);

    return apiClient.send(requestBuilder.build(), AgentToAgentTest.class);
  }

  private void createAgentToAgentTestValidateRequest(UpdateAgentToAgentTest updateAgentToAgentTest) throws ApiException {
      // verify the required parameter 'updateAgentToAgentTest' is set
      if (updateAgentToAgentTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateAgentToAgentTest' when calling createAgentToAgentTest");
      }
  }

  private ApiRequest.ApiRequestBuilder createAgentToAgentTestRequestBuilder(UpdateAgentToAgentTest updateAgentToAgentTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/tests/agent-to-agent";
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
    requestBuilder.requestBody(updateAgentToAgentTest);
    return requestBuilder;
  }
  /**
   * Delete Agent to Agent test
   * Deletes the specified Agent to Agent test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteAgentToAgentTest(String testId, String aid) throws ApiException {
    deleteAgentToAgentTestWithHttpInfo(testId, aid);
  }

  /**
   * Delete Agent to Agent test
   * Deletes the specified Agent to Agent test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAgentToAgentTestWithHttpInfo(String testId, String aid) throws ApiException {
    deleteAgentToAgentTestValidateRequest(testId);

    var requestBuilder = deleteAgentToAgentTestRequestBuilder(testId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteAgentToAgentTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling deleteAgentToAgentTest");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteAgentToAgentTestRequestBuilder(String testId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/tests/agent-to-agent/{testId}"
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
   * Get Agent to Agent test
   * Returns details for a Agent to Agent test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return AgentToAgentTest
   * @throws ApiException if fails to make API call
   */
  public AgentToAgentTest getAgentToAgentTest(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<AgentToAgentTest> response = getAgentToAgentTestWithHttpInfo(testId, aid, expand);
    return response.getData();
  }

  /**
   * Get Agent to Agent test
   * Returns details for a Agent to Agent test, including name, intervals, targets, alert rules and agents.
   * @param testId ID of the test (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;AgentToAgentTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentToAgentTest> getAgentToAgentTestWithHttpInfo(String testId, String aid, List<Expand> expand) throws ApiException {
    getAgentToAgentTestValidateRequest(testId);

    var requestBuilder = getAgentToAgentTestRequestBuilder(testId, aid, expand);

    return apiClient.send(requestBuilder.build(), AgentToAgentTest.class);
  }

  private void getAgentToAgentTestValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getAgentToAgentTest");
      }
  }

  private ApiRequest.ApiRequestBuilder getAgentToAgentTestRequestBuilder(String testId, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/agent-to-agent/{testId}"
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
   * List Agent to Agent tests
   * Returns a list of Agent to Agent tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return AgentToAgentTests
   * @throws ApiException if fails to make API call
   */
  public AgentToAgentTests getAgentToAgentTests(String aid) throws ApiException {
    ApiResponse<AgentToAgentTests> response = getAgentToAgentTestsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List Agent to Agent tests
   * Returns a list of Agent to Agent tests and saved events.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;AgentToAgentTests&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentToAgentTests> getAgentToAgentTestsWithHttpInfo(String aid) throws ApiException {
    getAgentToAgentTestsValidateRequest();

    var requestBuilder = getAgentToAgentTestsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), AgentToAgentTests.class);
  }

  private void getAgentToAgentTestsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getAgentToAgentTestsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/tests/agent-to-agent";
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
   * Update Agent to Agent test
   * Updates a Agent to Agent test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateAgentToAgentTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return AgentToAgentTest
   * @throws ApiException if fails to make API call
   */
  public AgentToAgentTest updateAgentToAgentTest(String testId, UpdateAgentToAgentTest updateAgentToAgentTest, String aid, List<Expand> expand) throws ApiException {
    ApiResponse<AgentToAgentTest> response = updateAgentToAgentTestWithHttpInfo(testId, updateAgentToAgentTest, aid, expand);
    return response.getData();
  }

  /**
   * Update Agent to Agent test
   * Updates a Agent to Agent test. This method requires Account Admin permissions.
   * @param testId ID of the test (required)
   * @param updateAgentToAgentTest  (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param expand Optional parameter on whether or not to expand the test sub-resources. By default no expansion is going to take place if the query parameter is not present. If the user wishes to expand the &#x60;agents&#x60; sub-resource, they need to pass the &#x60;?expand&#x3D;agent&#x60; query. (optional
   * @return ApiResponse&lt;AgentToAgentTest&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AgentToAgentTest> updateAgentToAgentTestWithHttpInfo(String testId, UpdateAgentToAgentTest updateAgentToAgentTest, String aid, List<Expand> expand) throws ApiException {
    updateAgentToAgentTestValidateRequest(testId, updateAgentToAgentTest);

    var requestBuilder = updateAgentToAgentTestRequestBuilder(testId, updateAgentToAgentTest, aid, expand);

    return apiClient.send(requestBuilder.build(), AgentToAgentTest.class);
  }

  private void updateAgentToAgentTestValidateRequest(String testId, UpdateAgentToAgentTest updateAgentToAgentTest) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling updateAgentToAgentTest");
      }
      // verify the required parameter 'updateAgentToAgentTest' is set
      if (updateAgentToAgentTest == null) {
        throw new ApiException(400, "Missing the required parameter 'updateAgentToAgentTest' when calling updateAgentToAgentTest");
      }
  }

  private ApiRequest.ApiRequestBuilder updateAgentToAgentTestRequestBuilder(String testId, UpdateAgentToAgentTest updateAgentToAgentTest, String aid, List<Expand> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/tests/agent-to-agent/{testId}"
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
    requestBuilder.requestBody(updateAgentToAgentTest);
    return requestBuilder;
  }
}