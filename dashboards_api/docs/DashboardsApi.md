# DashboardsApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDashboard**](DashboardsApi.md#createDashboard) | **POST** /v7/dashboards | Create dashboard |
| [**deleteDashboard**](DashboardsApi.md#deleteDashboard) | **DELETE** /v7/dashboards/{dashboardId} | Delete dashboard |
| [**getDashboardById**](DashboardsApi.md#getDashboardById) | **GET** /v7/dashboards/{dashboardId} | Retrieve dashboard |
| [**getDashboardData**](DashboardsApi.md#getDashboardData) | **GET** /v7/dashboards/{dashboardId}/widgets/{widgetId} | Retrieve dashboard widget data |
| [**getDashboardsForUser**](DashboardsApi.md#getDashboardsForUser) | **GET** /v7/dashboards | List dashboards |
| [**updateDashboard**](DashboardsApi.md#updateDashboard) | **PUT** /v7/dashboards/{dashboardId} | Update dashboard |


<a id="createDashboard"></a>
# **createDashboard**
> ApiDashboard createDashboard(apiDashboard, aid)

Create dashboard

Creates a new dashboard in your account group. To create a dashboard,  you must have one of the following permissions: * &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin).  * &#x60;Edit own dashboard templates&#x60; premission (Regular User). 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.DashboardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DashboardsApi apiInstance = new DashboardsApi(defaultClient);
    ApiDashboard apiDashboard = new ApiDashboard(); // ApiDashboard | Request body schema to create a dashboard.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      ApiDashboard result = apiInstance.createDashboard(apiDashboard, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#createDashboard");
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
| **apiDashboard** | [**ApiDashboard**](ApiDashboard.md)| Request body schema to create a dashboard. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**ApiDashboard**](ApiDashboard.md)

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

<a id="deleteDashboard"></a>
# **deleteDashboard**
> deleteDashboard(dashboardId, aid)

Delete dashboard

Deletes a dashboard using the &#x60;dashboardId&#x60; provided in the request.  **Note**: * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can delete any dashboard. * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only delete the dashboards they have created themselves. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.DashboardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DashboardsApi apiInstance = new DashboardsApi(defaultClient);
    String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | A Identifier for a dashboard which can be obtained from the `/dashboards` endpoint.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      apiInstance.deleteDashboard(dashboardId, aid);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#deleteDashboard");
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
| **dashboardId** | **String**| A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. | |
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

<a id="getDashboardById"></a>
# **getDashboardById**
> ApiDashboard getDashboardById(dashboardId, aid)

Retrieve dashboard

Returns a list of widgets within a dashboard, along with the dashboard&#39;s metadata. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.DashboardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DashboardsApi apiInstance = new DashboardsApi(defaultClient);
    String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | A Identifier for a dashboard which can be obtained from the `/dashboards` endpoint.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      ApiDashboard result = apiInstance.getDashboardById(dashboardId, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getDashboardById");
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
| **dashboardId** | **String**| A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**ApiDashboard**](ApiDashboard.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a id="getDashboardData"></a>
# **getDashboardData**
> GetDashboardData200Response getDashboardData(dashboardId, widgetId, aid, window, startDate, endDate, max, cursor, sort, order)

Retrieve dashboard widget data

Returns the raw data displayed within a widget in the dashboard. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.DashboardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DashboardsApi apiInstance = new DashboardsApi(defaultClient);
    String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | A Identifier for a dashboard which can be obtained from the `/dashboards` endpoint.
    String widgetId = "unpmg"; // String | A Identifier for a widget.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    String window = "12h"; // String | A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: `s` for seconds (default if no type is specified), `m` for minutes, `h` for hours, `d` for days, and `w` for weeks. For a precise date range, use `startDate` and `endDate`.
    OffsetDateTime startDate = OffsetDateTime.parse("2022-07-17T22:00:54Z"); // OffsetDateTime | Use with the `endDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
    OffsetDateTime endDate = OffsetDateTime.parse("2022-07-18T22:00:54Z"); // OffsetDateTime | Defaults to current time the request is made. Use with the `startDate` parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can't be used with `window`.
    BigDecimal max = new BigDecimal("10"); // BigDecimal | Optionally specify the maximum number of objects to retrieve. This only applies to the **Alert List** and **Test Table** Widgets. * The default for the **Alert List** widget is set by its limitBy configuration. * The default value for the **Test Table** widget is 10.
    String cursor = "bGFzdFJvdW5kSWQ9MTY4MTQxMDQ4MA"; // String | An optional pagination cursor. This parameter should not not be used directly. Instead, use the `_links` returned by the API. This feature is only available in the **Test Table** widget.
    String sort = "alertStatus"; // String | Optional sorting parameter with attributes listed comma-separated. This only applies to the **Alert List** and **Test Table** Widgets. * For the **Alert List** widget, you can sort by `alertStatus` or `startTime`. The default is `alertStatus`. * For the **Test Table** widget, you can sort by `alertStatus`, `testName`, or `testType`. The sequence might vary from the web application. The default sort attribute is `alertStatus`.
    DashboardOrder order = DashboardOrder.fromValue("asc"); // DashboardOrder | Optional sorting order parameter that accepts either `asc` (ascending) or `desc` (descending) values. This only applies to the **Alert List** and **Test Table** Widgets.
    try {
      GetDashboardData200Response result = apiInstance.getDashboardData(dashboardId, widgetId, aid, window, startDate, endDate, max, cursor, sort, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getDashboardData");
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
| **dashboardId** | **String**| A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. | |
| **widgetId** | **String**| A Identifier for a widget. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **window** | **String**| A dynamic time interval up to the current time of the request. Specify the interval as a number followed by an optional type: &#x60;s&#x60; for seconds (default if no type is specified), &#x60;m&#x60; for minutes, &#x60;h&#x60; for hours, &#x60;d&#x60; for days, and &#x60;w&#x60; for weeks. For a precise date range, use &#x60;startDate&#x60; and &#x60;endDate&#x60;. | [optional] |
| **startDate** | **OffsetDateTime**| Use with the &#x60;endDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **endDate** | **OffsetDateTime**| Defaults to current time the request is made. Use with the &#x60;startDate&#x60; parameter. Include the complete time (hours, minutes, and seconds) in UTC time zone, following the ISO 8601 date-time format. See the example for reference. Please note that this parameter can&#39;t be used with &#x60;window&#x60;. | [optional] |
| **max** | **BigDecimal**| Optionally specify the maximum number of objects to retrieve. This only applies to the **Alert List** and **Test Table** Widgets. * The default for the **Alert List** widget is set by its limitBy configuration. * The default value for the **Test Table** widget is 10. | [optional] |
| **cursor** | **String**| An optional pagination cursor. This parameter should not not be used directly. Instead, use the &#x60;_links&#x60; returned by the API. This feature is only available in the **Test Table** widget. | [optional] |
| **sort** | **String**| Optional sorting parameter with attributes listed comma-separated. This only applies to the **Alert List** and **Test Table** Widgets. * For the **Alert List** widget, you can sort by &#x60;alertStatus&#x60; or &#x60;startTime&#x60;. The default is &#x60;alertStatus&#x60;. * For the **Test Table** widget, you can sort by &#x60;alertStatus&#x60;, &#x60;testName&#x60;, or &#x60;testType&#x60;. The sequence might vary from the web application. The default sort attribute is &#x60;alertStatus&#x60;. | [optional] |
| **order** | [**DashboardOrder**](.md)| Optional sorting order parameter that accepts either &#x60;asc&#x60; (ascending) or &#x60;desc&#x60; (descending) values. This only applies to the **Alert List** and **Test Table** Widgets. | [optional] [enum: asc, desc] |

### Return type

[**GetDashboardData200Response**](GetDashboardData200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a id="getDashboardsForUser"></a>
# **getDashboardsForUser**
> List&lt;ApiDashboard&gt; getDashboardsForUser(aid)

List dashboards

Returns a list of dashboards and their settings within your account group. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.DashboardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DashboardsApi apiInstance = new DashboardsApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      List<ApiDashboard> result = apiInstance.getDashboardsForUser(aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getDashboardsForUser");
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

[**List&lt;ApiDashboard&gt;**](ApiDashboard.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a id="updateDashboard"></a>
# **updateDashboard**
> ApiDashboard updateDashboard(dashboardId, apiDashboard, aid)

Update dashboard

Updates an existing dashboard in your account group.   **Note**:  * Users with the &#x60;Edit dashboard templates for all users in account group&#x60; permission (Account Admin) can update any dashboard. * Users with the &#x60;Edit own dashboard templates&#x60; permission (Regular User) can only update the dashboards they have created themselves. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.DashboardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DashboardsApi apiInstance = new DashboardsApi(defaultClient);
    String dashboardId = "646f4d2ce3c99b0536c3821e"; // String | A Identifier for a dashboard which can be obtained from the `/dashboards` endpoint.
    ApiDashboard apiDashboard = new ApiDashboard(); // ApiDashboard | Request body schema to update a dashboard.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      ApiDashboard result = apiInstance.updateDashboard(dashboardId, apiDashboard, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#updateDashboard");
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
| **dashboardId** | **String**| A Identifier for a dashboard which can be obtained from the &#x60;/dashboards&#x60; endpoint. | |
| **apiDashboard** | [**ApiDashboard**](ApiDashboard.md)| Request body schema to update a dashboard. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**ApiDashboard**](ApiDashboard.md)

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
