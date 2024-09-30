/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.tests.results;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.reflect.TypeUtils;
import com.thousandeyes.sdk.tests.results.model.Error;
import java.time.OffsetDateTime;
import com.thousandeyes.sdk.tests.results.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.results.model.ValidationError;
import com.thousandeyes.sdk.tests.results.model.WebTransactionDetailTestResults;
import com.thousandeyes.sdk.tests.results.model.WebTransactionPageDetailTestResults;
import com.thousandeyes.sdk.tests.results.model.WebTransactionTestResults;

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
public class WebTransactionsTestResultsApi {
  private final ApiClient apiClient;

  public WebTransactionsTestResultsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get detailed web transactions test result by agent, round, and page
   * Returns a page of web transaction test results for an agent and round. 
   * @param testId Test ID (required)
   * @param agentId Agent ID (required)
   * @param roundId Round ID (required)
   * @param pageId Web page ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return WebTransactionPageDetailTestResults
   * @throws ApiException if fails to make API call
   */
  public WebTransactionPageDetailTestResults getTestWebTransactionAgentRoundPageResults(String testId, String agentId, String roundId, String pageId, String aid) throws ApiException {
    ApiResponse<WebTransactionPageDetailTestResults> response = getTestWebTransactionAgentRoundPageResultsWithHttpInfo(testId, agentId, roundId, pageId, aid);
    return response.getData();
  }

  /**
   * Get detailed web transactions test result by agent, round, and page
   * Returns a page of web transaction test results for an agent and round. 
   * @param testId Test ID (required)
   * @param agentId Agent ID (required)
   * @param roundId Round ID (required)
   * @param pageId Web page ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;WebTransactionPageDetailTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebTransactionPageDetailTestResults> getTestWebTransactionAgentRoundPageResultsWithHttpInfo(String testId, String agentId, String roundId, String pageId, String aid) throws ApiException {
    getTestWebTransactionAgentRoundPageResultsValidateRequest(testId, agentId, roundId, pageId);

    var requestBuilder = getTestWebTransactionAgentRoundPageResultsRequestBuilder(testId, agentId, roundId, pageId, aid);

    return apiClient.send(requestBuilder.build(), WebTransactionPageDetailTestResults.class);
  }

  private void getTestWebTransactionAgentRoundPageResultsValidateRequest(String testId, String agentId, String roundId, String pageId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestWebTransactionAgentRoundPageResults");
      }
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling getTestWebTransactionAgentRoundPageResults");
      }
      // verify the required parameter 'roundId' is set
      if (roundId == null) {
        throw new ApiException(400, "Missing the required parameter 'roundId' when calling getTestWebTransactionAgentRoundPageResults");
      }
      // verify the required parameter 'pageId' is set
      if (pageId == null) {
        throw new ApiException(400, "Missing the required parameter 'pageId' when calling getTestWebTransactionAgentRoundPageResults");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestWebTransactionAgentRoundPageResultsRequestBuilder(String testId, String agentId, String roundId, String pageId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/test-results/{testId}/web-transactions/agent/{agentId}/round/{roundId}/page/{pageId}"
        .replace("{testId}", urlEncode(testId.toString()))
        .replace("{agentId}", urlEncode(agentId.toString()))
        .replace("{roundId}", urlEncode(roundId.toString()))
        .replace("{pageId}", urlEncode(pageId.toString()));
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
   * Get web transactions test results by agent and round
   * Returns test results for web transactions for a given agent and round. 
   * @param testId Test ID (required)
   * @param agentId Agent ID (required)
   * @param roundId Round ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return WebTransactionDetailTestResults
   * @throws ApiException if fails to make API call
   */
  public WebTransactionDetailTestResults getTestWebTransactionAgentRoundResults(String testId, String agentId, String roundId, String aid) throws ApiException {
    ApiResponse<WebTransactionDetailTestResults> response = getTestWebTransactionAgentRoundResultsWithHttpInfo(testId, agentId, roundId, aid);
    return response.getData();
  }

  /**
   * Get web transactions test results by agent and round
   * Returns test results for web transactions for a given agent and round. 
   * @param testId Test ID (required)
   * @param agentId Agent ID (required)
   * @param roundId Round ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;WebTransactionDetailTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebTransactionDetailTestResults> getTestWebTransactionAgentRoundResultsWithHttpInfo(String testId, String agentId, String roundId, String aid) throws ApiException {
    getTestWebTransactionAgentRoundResultsValidateRequest(testId, agentId, roundId);

    var requestBuilder = getTestWebTransactionAgentRoundResultsRequestBuilder(testId, agentId, roundId, aid);

    return apiClient.send(requestBuilder.build(), WebTransactionDetailTestResults.class);
  }

  private void getTestWebTransactionAgentRoundResultsValidateRequest(String testId, String agentId, String roundId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestWebTransactionAgentRoundResults");
      }
      // verify the required parameter 'agentId' is set
      if (agentId == null) {
        throw new ApiException(400, "Missing the required parameter 'agentId' when calling getTestWebTransactionAgentRoundResults");
      }
      // verify the required parameter 'roundId' is set
      if (roundId == null) {
        throw new ApiException(400, "Missing the required parameter 'roundId' when calling getTestWebTransactionAgentRoundResults");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestWebTransactionAgentRoundResultsRequestBuilder(String testId, String agentId, String roundId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/test-results/{testId}/web-transactions/agent/{agentId}/round/{roundId}"
        .replace("{testId}", urlEncode(testId.toString()))
        .replace("{agentId}", urlEncode(agentId.toString()))
        .replace("{roundId}", urlEncode(roundId.toString()));
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
   * Get web transactions test results
   * Returns test results for web transactions. If you do not specify a window or a start and end date, data is displayed for the most recent testing round. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return WebTransactionTestResults
   * @throws ApiException if fails to make API call
   */
  public WebTransactionTestResults getTestWebTransactionResults(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiResponse<WebTransactionTestResults> response = getTestWebTransactionResultsWithHttpInfo(testId, aid, window, startDate, endDate, cursor);
    return response.getData();
  }

  /**
   * Get web transactions test results
   * Returns test results for web transactions. If you do not specify a window or a start and end date, data is displayed for the most recent testing round. 
   * @param testId Test ID (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @return ApiResponse&lt;WebTransactionTestResults&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<WebTransactionTestResults> getTestWebTransactionResultsWithHttpInfo(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    getTestWebTransactionResultsValidateRequest(testId);

    var requestBuilder = getTestWebTransactionResultsRequestBuilder(testId, aid, window, startDate, endDate, cursor);

    return apiClient.send(requestBuilder.build(), WebTransactionTestResults.class);
  }

  private void getTestWebTransactionResultsValidateRequest(String testId) throws ApiException {
      // verify the required parameter 'testId' is set
      if (testId == null) {
        throw new ApiException(400, "Missing the required parameter 'testId' when calling getTestWebTransactionResults");
      }
  }

  private ApiRequest.ApiRequestBuilder getTestWebTransactionResultsRequestBuilder(String testId, String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/test-results/{testId}/web-transactions"
        .replace("{testId}", urlEncode(testId.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));
    localVarQueryParams.addAll(parameterToPairs("window", window));
    localVarQueryParams.addAll(parameterToPairs("startDate", startDate));
    localVarQueryParams.addAll(parameterToPairs("endDate", endDate));
    localVarQueryParams.addAll(parameterToPairs("cursor", cursor));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
}