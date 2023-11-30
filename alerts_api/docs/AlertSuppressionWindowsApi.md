# AlertSuppressionWindowsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSuppressionWindows**](AlertSuppressionWindowsApi.md#createSuppressionWindows) | **POST** /v7/alert-suppression-windows | Create alert suppression window |
| [**deleteSuppressionWindow**](AlertSuppressionWindowsApi.md#deleteSuppressionWindow) | **DELETE** /v7/alert-suppression-windows/{windowId} | Delete alert suppression window |
| [**getSuppressionWindowDetails**](AlertSuppressionWindowsApi.md#getSuppressionWindowDetails) | **GET** /v7/alert-suppression-windows/{windowId} | Retrieve alert suppression window |
| [**getSuppressionWindows**](AlertSuppressionWindowsApi.md#getSuppressionWindows) | **GET** /v7/alert-suppression-windows | List alert suppression windows |
| [**updateSuppressionWindow**](AlertSuppressionWindowsApi.md#updateSuppressionWindow) | **PUT** /v7/alert-suppression-windows/{windowId} | Update alert suppression window |


<a id="createSuppressionWindows"></a>
# **createSuppressionWindows**
> CreateSuppressionWindows201Response createSuppressionWindows(alertSuppressionWindowRequest, aid, expand)

Create alert suppression window

Creates a new alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can create alert suppression windows.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.AlertSuppressionWindowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
    AlertSuppressionWindowRequest alertSuppressionWindowRequest = new AlertSuppressionWindowRequest(); // AlertSuppressionWindowRequest | 
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
    try {
      CreateSuppressionWindows201Response result = apiInstance.createSuppressionWindows(alertSuppressionWindowRequest, aid, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertSuppressionWindowsApi#createSuppressionWindows");
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
| **alertSuppressionWindowRequest** | [**AlertSuppressionWindowRequest**](AlertSuppressionWindowRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. | [optional] |

### Return type

[**CreateSuppressionWindows201Response**](CreateSuppressionWindows201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/hal+json
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location -  <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

<a id="deleteSuppressionWindow"></a>
# **deleteSuppressionWindow**
> deleteSuppressionWindow(windowId, aid)

Delete alert suppression window

Deletes an alert suppression window.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.AlertSuppressionWindowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
    String windowId = "2411"; // String | Unique window ID.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      apiInstance.deleteSuppressionWindow(windowId, aid);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertSuppressionWindowsApi#deleteSuppressionWindow");
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
| **windowId** | **String**| Unique window ID. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |

<a id="getSuppressionWindowDetails"></a>
# **getSuppressionWindowDetails**
> CreateSuppressionWindows201Response getSuppressionWindowDetails(windowId, aid, expand)

Retrieve alert suppression window

Returns detailed information about an alert suppression window configured in your account group.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.AlertSuppressionWindowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
    String windowId = "2411"; // String | Unique window ID.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
    try {
      CreateSuppressionWindows201Response result = apiInstance.getSuppressionWindowDetails(windowId, aid, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertSuppressionWindowsApi#getSuppressionWindowDetails");
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
| **windowId** | **String**| Unique window ID. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. | [optional] |

### Return type

[**CreateSuppressionWindows201Response**](CreateSuppressionWindows201Response.md)

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

<a id="getSuppressionWindows"></a>
# **getSuppressionWindows**
> GetSuppressionWindows200Response getSuppressionWindows(aid)

List alert suppression windows

Returns a list of all alert suppression windows configured in your account group.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.AlertSuppressionWindowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      GetSuppressionWindows200Response result = apiInstance.getSuppressionWindows(aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertSuppressionWindowsApi#getSuppressionWindows");
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
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**GetSuppressionWindows200Response**](GetSuppressionWindows200Response.md)

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

<a id="updateSuppressionWindow"></a>
# **updateSuppressionWindow**
> CreateSuppressionWindows201Response updateSuppressionWindow(windowId, alertSuppressionWindowRequest, aid, expand)

Update alert suppression window

Updates an alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can update alert suppression windows.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.AlertSuppressionWindowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AlertSuppressionWindowsApi apiInstance = new AlertSuppressionWindowsApi(defaultClient);
    String windowId = "2411"; // String | Unique window ID.
    AlertSuppressionWindowRequest alertSuppressionWindowRequest = new AlertSuppressionWindowRequest(); // AlertSuppressionWindowRequest | 
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    List<Expand> expand = Arrays.asList(); // List<Expand> | Optional parameter on whether or not to expand alert related resources.  Without this parameter, there's no default expansion. For example, to expand the \"tests\" resource, use the `?expand=test` query.
    try {
      CreateSuppressionWindows201Response result = apiInstance.updateSuppressionWindow(windowId, alertSuppressionWindowRequest, aid, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlertSuppressionWindowsApi#updateSuppressionWindow");
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
| **windowId** | **String**| Unique window ID. | |
| **alertSuppressionWindowRequest** | [**AlertSuppressionWindowRequest**](AlertSuppressionWindowRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| Optional parameter on whether or not to expand alert related resources.  Without this parameter, there&#39;s no default expansion. For example, to expand the \&quot;tests\&quot; resource, use the &#x60;?expand&#x3D;test&#x60; query. | [optional] |

### Return type

[**CreateSuppressionWindows201Response**](CreateSuppressionWindows201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/hal+json
 - **Accept**: application/hal+json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Insufficient permissions to query endpoint |  -  |
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
