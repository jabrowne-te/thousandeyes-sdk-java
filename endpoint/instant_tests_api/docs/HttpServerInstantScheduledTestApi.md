# HttpServerInstantScheduledTestApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postHttpServerInstantTest**](HttpServerInstantScheduledTestApi.md#postHttpServerInstantTest) | **POST** /v7/endpoint/tests/scheduled-tests/http-server/instant | Run http server instant scheduled test |


<a id="postHttpServerInstantTest"></a>
# **postHttpServerInstantTest**
> EndpointHttpServerTest postHttpServerInstantTest(endpointHttpServerInstantTest, aid)

Run http server instant scheduled test

Creates and runs a new endpoint http server instant scheduled test in ThousandEyes.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.HttpServerInstantScheduledTestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    HttpServerInstantScheduledTestApi apiInstance = new HttpServerInstantScheduledTestApi(defaultClient);
    EndpointHttpServerInstantTest endpointHttpServerInstantTest = new EndpointHttpServerInstantTest(); // EndpointHttpServerInstantTest | 
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      EndpointHttpServerTest result = apiInstance.postHttpServerInstantTest(endpointHttpServerInstantTest, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HttpServerInstantScheduledTestApi#postHttpServerInstantTest");
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
| **endpointHttpServerInstantTest** | [**EndpointHttpServerInstantTest**](EndpointHttpServerInstantTest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**EndpointHttpServerTest**](EndpointHttpServerTest.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location -  <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |
