/*
 * Labels API
 * ### Overview This is API for the Labels API (formerly called groups).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.labels;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.labels.model.CreateAgentLabel201Response;
import com.thousandeyes.api.labels.model.Error;
import com.thousandeyes.api.labels.model.GetLabels200Response;
import com.thousandeyes.api.labels.model.LabelRequest;
import java.net.URI;
import com.thousandeyes.api.labels.model.UnauthorizedError;
import com.thousandeyes.api.labels.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.185032+01:00[Europe/London]")
public class TestApi {
  private final ApiClient apiClient;

  public TestApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Label of type &#x60;test&#x60;
   * Creates a new label (formerly called group) in ThousandEyes, based on properties provided in the POST data.  In order to create a new label, the user attempting the creation must have sufficient privileges to create labels. Regular users are blocked from using any of the POST-based methods. Note: When creating or updating a label and assigning &#x60;agent&#x60; or &#x60;test&#x60;, the user needs permission to modify the objects being added.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest Label resource (optional)
   * @return CreateAgentLabel201Response
   * @throws ApiException if fails to make API call
   */
  public CreateAgentLabel201Response createTestLabel(String aid, LabelRequest labelRequest) throws ApiException {
    ApiResponse<CreateAgentLabel201Response> response = createTestLabelWithHttpInfo(aid, labelRequest);
    return response.getData();
  }

  /**
   * Create a Label of type &#x60;test&#x60;
   * Creates a new label (formerly called group) in ThousandEyes, based on properties provided in the POST data.  In order to create a new label, the user attempting the creation must have sufficient privileges to create labels. Regular users are blocked from using any of the POST-based methods. Note: When creating or updating a label and assigning &#x60;agent&#x60; or &#x60;test&#x60;, the user needs permission to modify the objects being added.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest Label resource (optional)
   * @return ApiResponse&lt;CreateAgentLabel201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateAgentLabel201Response> createTestLabelWithHttpInfo(String aid, LabelRequest labelRequest) throws ApiException {
    createTestLabelValidateRequest();

    var requestBuilder = createTestLabelRequestBuilder(aid, labelRequest);

    return apiClient.send(requestBuilder.build(), CreateAgentLabel201Response.class);
  }

  private void createTestLabelValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder createTestLabelRequestBuilder(String aid, LabelRequest labelRequest) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/labels/test";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(labelRequest);
    return requestBuilder;
  }
  /**
   * Delete a Label object of type &#x60;test&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteTestLabel(String labelId, String aid) throws ApiException {
    deleteTestLabelWithHttpInfo(labelId, aid);
  }

  /**
   * Delete a Label object of type &#x60;test&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteTestLabelWithHttpInfo(String labelId, String aid) throws ApiException {
    deleteTestLabelValidateRequest(labelId);

    var requestBuilder = deleteTestLabelRequestBuilder(labelId, aid);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteTestLabelValidateRequest(String labelId) throws ApiException {
      // verify the required parameter 'labelId' is set
      if (labelId == null) {
        throw new ApiException(400, "Missing the required parameter 'labelId' when calling deleteTestLabel");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteTestLabelRequestBuilder(String labelId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/v7/labels/test/{labelId}"
        .replace("{labelId}", urlEncode(labelId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Get a Label object of type &#x60;test&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return CreateAgentLabel201Response
   * @throws ApiException if fails to make API call
   */
  public CreateAgentLabel201Response getTestLabel(String labelId, String aid) throws ApiException {
    ApiResponse<CreateAgentLabel201Response> response = getTestLabelWithHttpInfo(labelId, aid);
    return response.getData();
  }

  /**
   * Get a Label object of type &#x60;test&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;CreateAgentLabel201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateAgentLabel201Response> getTestLabelWithHttpInfo(String labelId, String aid) throws ApiException {
    getTestLabelValidateRequest(labelId);

    var requestBuilder = getTestLabelRequestBuilder(labelId, aid);

    return apiClient.send(requestBuilder.build(), CreateAgentLabel201Response.class);
  }

  private void getTestLabelValidateRequest(String labelId) throws ApiException {
      // verify the required parameter 'labelId' is set
      if (labelId == null) {
        throw new ApiException(400, "Missing the required parameter 'labelId' when calling getTestLabel");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestLabelRequestBuilder(String labelId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/labels/test/{labelId}"
        .replace("{labelId}", urlEncode(labelId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Get list of Labels of type &#x60;test&#x60;
   * Returns a list of all Test labels (formerly called groups) configured in ThousandEyes.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetLabels200Response
   * @throws ApiException if fails to make API call
   */
  public GetLabels200Response getTestLabels(String aid) throws ApiException {
    ApiResponse<GetLabels200Response> response = getTestLabelsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * Get list of Labels of type &#x60;test&#x60;
   * Returns a list of all Test labels (formerly called groups) configured in ThousandEyes.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetLabels200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetLabels200Response> getTestLabelsWithHttpInfo(String aid) throws ApiException {
    getTestLabelsValidateRequest();

    var requestBuilder = getTestLabelsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetLabels200Response.class);
  }

  private void getTestLabelsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getTestLabelsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/labels/test";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    return requestBuilder;
  }
  /**
   * Update a Label object of type &#x60;test&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest  (optional)
   * @return CreateAgentLabel201Response
   * @throws ApiException if fails to make API call
   */
  public CreateAgentLabel201Response updateTestLabel(String labelId, String aid, LabelRequest labelRequest) throws ApiException {
    ApiResponse<CreateAgentLabel201Response> response = updateTestLabelWithHttpInfo(labelId, aid, labelRequest);
    return response.getData();
  }

  /**
   * Update a Label object of type &#x60;test&#x60;
   * 
   * @param labelId ID of the label to get (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param labelRequest  (optional)
   * @return ApiResponse&lt;CreateAgentLabel201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateAgentLabel201Response> updateTestLabelWithHttpInfo(String labelId, String aid, LabelRequest labelRequest) throws ApiException {
    updateTestLabelValidateRequest(labelId);

    var requestBuilder = updateTestLabelRequestBuilder(labelId, aid, labelRequest);

    return apiClient.send(requestBuilder.build(), CreateAgentLabel201Response.class);
  }

  private void updateTestLabelValidateRequest(String labelId) throws ApiException {
      // verify the required parameter 'labelId' is set
      if (labelId == null) {
        throw new ApiException(400, "Missing the required parameter 'labelId' when calling updateTestLabel");
      }
  }

  private ApiRequest.ApiRequestBuilder updateTestLabelRequestBuilder(String labelId, String aid, LabelRequest labelRequest) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/v7/labels/test/{labelId}"
        .replace("{labelId}", urlEncode(labelId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(labelRequest);
    return requestBuilder;
  }
}
