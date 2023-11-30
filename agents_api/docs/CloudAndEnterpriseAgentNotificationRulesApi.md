# CloudAndEnterpriseAgentNotificationRulesApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAgentsNotificationRule**](CloudAndEnterpriseAgentNotificationRulesApi.md#getAgentsNotificationRule) | **GET** /v7/agents/notification-rules/{notificationRuleId} | Retrieve agent notification rule |
| [**getAgentsNotificationRules**](CloudAndEnterpriseAgentNotificationRulesApi.md#getAgentsNotificationRules) | **GET** /v7/agents/notification-rules | List agent notification rules |


<a id="getAgentsNotificationRule"></a>
# **getAgentsNotificationRule**
> GetAgentsNotificationRule200Response getAgentsNotificationRule(notificationRuleId, aid)

Retrieve agent notification rule

Returns details of an agent notification rule, including agents it is assigned to. 

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.CloudAndEnterpriseAgentNotificationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudAndEnterpriseAgentNotificationRulesApi apiInstance = new CloudAndEnterpriseAgentNotificationRulesApi(defaultClient);
    String notificationRuleId = "281474976710706"; // String | Unique ID for the agent notification rule.
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      GetAgentsNotificationRule200Response result = apiInstance.getAgentsNotificationRule(notificationRuleId, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAndEnterpriseAgentNotificationRulesApi#getAgentsNotificationRule");
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
| **notificationRuleId** | **String**| Unique ID for the agent notification rule. | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |

### Return type

[**GetAgentsNotificationRule200Response**](GetAgentsNotificationRule200Response.md)

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
| **0** | An error occurred |  -  |

<a id="getAgentsNotificationRules"></a>
# **getAgentsNotificationRules**
> GetAgentsNotificationRules200Response getAgentsNotificationRules(aid)

List agent notification rules

Returns a list of all agent notification rules configured under the account.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.CloudAndEnterpriseAgentNotificationRulesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CloudAndEnterpriseAgentNotificationRulesApi apiInstance = new CloudAndEnterpriseAgentNotificationRulesApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      GetAgentsNotificationRules200Response result = apiInstance.getAgentsNotificationRules(aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAndEnterpriseAgentNotificationRulesApi#getAgentsNotificationRules");
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

[**GetAgentsNotificationRules200Response**](GetAgentsNotificationRules200Response.md)

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
| **0** | An error occurred |  -  |
