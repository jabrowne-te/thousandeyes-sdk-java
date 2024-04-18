/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.api.endpoint.tests.results;

import static com.thousandeyes.api.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.api.client.RequestUtil.urlEncode;

import com.thousandeyes.api.client.ApiClient;
import com.thousandeyes.api.client.ApiException;
import com.thousandeyes.api.client.ApiResponse;
import com.thousandeyes.api.client.ApiRequest;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.api.endpoint.tests.results.model.Error;
import com.thousandeyes.api.endpoint.tests.results.model.GetEndpointLocalNetworkTopologyDetails200Response;
import com.thousandeyes.api.endpoint.tests.results.model.GetEndpointLocalNetworks200Response;
import com.thousandeyes.api.endpoint.tests.results.model.GetEndpointLocalNetworksTopologies200Response;
import com.thousandeyes.api.endpoint.tests.results.model.GetEndpointLocalNetworksTopologiesRequest;
import java.time.OffsetDateTime;
import com.thousandeyes.api.endpoint.tests.results.model.UnauthorizedError;
import com.thousandeyes.api.endpoint.tests.results.model.ValidationError;

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

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:02.083600+01:00[Europe/Lisbon]")
public class LocalNetworkTestsResultsApi {
  private final ApiClient apiClient;

  public LocalNetworkTestsResultsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieve endpoint local network topology
   * Returns detailed data of a local network topology. 
   * @param networkTopologyId The network topology ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetEndpointLocalNetworkTopologyDetails200Response
   * @throws ApiException if fails to make API call
   */
  public GetEndpointLocalNetworkTopologyDetails200Response getEndpointLocalNetworkTopologyDetails(String networkTopologyId, String aid) throws ApiException {
    ApiResponse<GetEndpointLocalNetworkTopologyDetails200Response> response = getEndpointLocalNetworkTopologyDetailsWithHttpInfo(networkTopologyId, aid);
    return response.getData();
  }

  /**
   * Retrieve endpoint local network topology
   * Returns detailed data of a local network topology. 
   * @param networkTopologyId The network topology ID. (required)
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetEndpointLocalNetworkTopologyDetails200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEndpointLocalNetworkTopologyDetails200Response> getEndpointLocalNetworkTopologyDetailsWithHttpInfo(String networkTopologyId, String aid) throws ApiException {
    getEndpointLocalNetworkTopologyDetailsValidateRequest(networkTopologyId);

    var requestBuilder = getEndpointLocalNetworkTopologyDetailsRequestBuilder(networkTopologyId, aid);

    return apiClient.send(requestBuilder.build(), GetEndpointLocalNetworkTopologyDetails200Response.class);
  }

  private void getEndpointLocalNetworkTopologyDetailsValidateRequest(String networkTopologyId) throws ApiException {
      // verify the required parameter 'networkTopologyId' is set
      if (networkTopologyId == null) {
        throw new ApiException(400, "Missing the required parameter 'networkTopologyId' when calling getEndpointLocalNetworkTopologyDetails");
      }
  }

  private ApiRequest.ApiRequestBuilder getEndpointLocalNetworkTopologyDetailsRequestBuilder(String networkTopologyId, String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/test-results/local-networks/topologies/{networkTopologyId}"
        .replace("{networkTopologyId}", urlEncode(networkTopologyId.toString()));
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
   * List local networks
   * Returns a list of all the networks used by endpoint agents.  Sends back a &#x60;localNetworks&#x60; array. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return GetEndpointLocalNetworks200Response
   * @throws ApiException if fails to make API call
   */
  public GetEndpointLocalNetworks200Response getEndpointLocalNetworks(String aid) throws ApiException {
    ApiResponse<GetEndpointLocalNetworks200Response> response = getEndpointLocalNetworksWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List local networks
   * Returns a list of all the networks used by endpoint agents.  Sends back a &#x60;localNetworks&#x60; array. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;GetEndpointLocalNetworks200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEndpointLocalNetworks200Response> getEndpointLocalNetworksWithHttpInfo(String aid) throws ApiException {
    getEndpointLocalNetworksValidateRequest();

    var requestBuilder = getEndpointLocalNetworksRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), GetEndpointLocalNetworks200Response.class);
  }

  private void getEndpointLocalNetworksValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getEndpointLocalNetworksRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/v7/endpoint/test-results/local-networks";
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
   * List endpoint network topologies probes
   * Returns a list of all endpoint local network topologies probes.  Results from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter?window&#x3D;12h&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Warning Note that a maximum of 12h worth of data can be retrieved at once.  If you need more, you need to make multiple requests.  Returns a &#x60;results&#x60; array of network topology probes.  Network topology probes shown are from the latest round, or based on the time range specified. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param getEndpointLocalNetworksTopologiesRequest  (optional)
   * @return GetEndpointLocalNetworksTopologies200Response
   * @throws ApiException if fails to make API call
   */
  public GetEndpointLocalNetworksTopologies200Response getEndpointLocalNetworksTopologies(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, GetEndpointLocalNetworksTopologiesRequest getEndpointLocalNetworksTopologiesRequest) throws ApiException {
    ApiResponse<GetEndpointLocalNetworksTopologies200Response> response = getEndpointLocalNetworksTopologiesWithHttpInfo(aid, window, startDate, endDate, cursor, getEndpointLocalNetworksTopologiesRequest);
    return response.getData();
  }

  /**
   * List endpoint network topologies probes
   * Returns a list of all endpoint local network topologies probes.  Results from the last round are provided unless an explicit start and end is provided with &#x60;startDate&#x60;, &#x60;endDate&#x60; or &#x60;window&#x60; optional parameters.  ## Request body filters This endpoint supports complex filtering using the request body. It is important these filters remain unaltered when making use of pagination, otherwise the results will not be coherent with the original request.  ### Multiple filter fields When multiple filter fields are provided, a logical &#x60;AND&#x60; is applied between the filters.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Filter field with multiple values When a filter field contains multiple values, a logical &#x60;OR&#x60; is applied between the filter values.  &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Combination of request parameters and body filters &#x60;&#x60;&#x60; curl --location --request POST &#39;https://api.thousandeyes.com/v7/endpoint/test-results/local-networks/topologies/filter?window&#x3D;12h&#39; --header &#39;Authorization: Bearer $token&#39; --header &#39;Content-Type: application/json&#39; --data-raw &#39;{   \&quot;searchFilters\&quot;: {     \&quot;platform\&quot;: [ \&quot;mac\&quot; ],     \&quot;domain\&quot;: [ \&quot;thousandeyes.com\&quot; ],     \&quot;networkId\&quot;: [ \&quot;660b34109d12\&quot;, \&quot;660b34109d15\&quot; ]   }}&#39; &#x60;&#x60;&#x60;  ### Warning Note that a maximum of 12h worth of data can be retrieved at once.  If you need more, you need to make multiple requests.  Returns a &#x60;results&#x60; array of network topology probes.  Network topology probes shown are from the latest round, or based on the time range specified. 
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @param window A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. (optional)
   * @param startDate Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param endDate Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. (optional)
   * @param cursor (Optional) Opaque cursor used for pagination. Clients should use &#x60;next&#x60; value from &#x60;_links&#x60; instead of this parameter. (optional)
   * @param getEndpointLocalNetworksTopologiesRequest  (optional)
   * @return ApiResponse&lt;GetEndpointLocalNetworksTopologies200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetEndpointLocalNetworksTopologies200Response> getEndpointLocalNetworksTopologiesWithHttpInfo(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, GetEndpointLocalNetworksTopologiesRequest getEndpointLocalNetworksTopologiesRequest) throws ApiException {
    getEndpointLocalNetworksTopologiesValidateRequest();

    var requestBuilder = getEndpointLocalNetworksTopologiesRequestBuilder(aid, window, startDate, endDate, cursor, getEndpointLocalNetworksTopologiesRequest);

    return apiClient.send(requestBuilder.build(), GetEndpointLocalNetworksTopologies200Response.class);
  }

  private void getEndpointLocalNetworksTopologiesValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getEndpointLocalNetworksTopologiesRequestBuilder(String aid, String window, OffsetDateTime startDate, OffsetDateTime endDate, String cursor, GetEndpointLocalNetworksTopologiesRequest getEndpointLocalNetworksTopologiesRequest) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/v7/endpoint/test-results/local-networks/topologies/filter";
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

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of("ThousandEyesSDK-Java/1.0.0-SNAPSHOT"));
    requestBuilder.requestBody(getEndpointLocalNetworksTopologiesRequest);
    return requestBuilder;
  }
}
