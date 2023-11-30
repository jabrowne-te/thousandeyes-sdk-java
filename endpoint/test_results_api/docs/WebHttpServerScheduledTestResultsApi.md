# WebHttpServerScheduledTestResultsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTestResultHttpServer**](WebHttpServerScheduledTestResultsApi.md#getTestResultHttpServer) | **GET** /v7/endpoint/test-results/scheduled-tests/{testId}/http-server | Retrieve HTTP server scheduled test results |


<a id="getTestResultHttpServer"></a>
# **getTestResultHttpServer**
> GetTestResultHttpServer200Response getTestResultHttpServer(testId, aid, window, startDate, endDate, cursor, expand)

Retrieve HTTP server scheduled test results

Returns component-level (DNS, Connect, Wait and Receive) timing for the load of an object over HTTP. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.WebHttpServerScheduledTestResultsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    WebHttpServerScheduledTestResultsApi apiInstance = new WebHttpServerScheduledTestResultsApi(defaultClient);
    String testId = "202701"; // String | Test ID
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
    OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
    OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
    String cursor = "cursor_example"; // String | (Optional) Opaque cursor used for pagination. Clients should use `_links` instead of this parameter.
    List<Expand> expand = Arrays.asList(); // List<Expand> | This parameter is optional and determines whether to expand resources related to test results. By default, no expansion occurs when this query parameter is omitted. To expand a specific resource, such as \"header,\" append `?expand=header` to the query.
    try {
      GetTestResultHttpServer200Response result = apiInstance.getTestResultHttpServer(testId, aid, window, startDate, endDate, cursor, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebHttpServerScheduledTestResultsApi#getTestResultHttpServer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **testId** | **String**| Test ID | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **window** | **String**| A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. | [optional] |
| **startDate** | **OffsetDateTime**| Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **endDate** | **OffsetDateTime**| Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **cursor** | **String**| (Optional) Opaque cursor used for pagination. Clients should use &#x60;_links&#x60; instead of this parameter. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| This parameter is optional and determines whether to expand resources related to test results. By default, no expansion occurs when this query parameter is omitted. To expand a specific resource, such as \&quot;header,\&quot; append &#x60;?expand&#x3D;header&#x60; to the query. | [optional] |

### Return type

[**GetTestResultHttpServer200Response**](GetTestResultHttpServer200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
