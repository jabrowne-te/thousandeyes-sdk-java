# AgentToAgentApi

All URIs are relative to *https://api.thousandeyes.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postInstantTestAgentToAgent**](AgentToAgentApi.md#postInstantTestAgentToAgent) | **POST** /v7/tests/agent-to-agent/instant | Create agent-to-agent instant test |


<a id="postInstantTestAgentToAgent"></a>
# **postInstantTestAgentToAgent**
> AgentToAgentInstantTest postInstantTestAgentToAgent(agentToAgentInstantTestRequest, aid, expand)

Create agent-to-agent instant test

Creates and runs a new agent-to-agent instant test.

### Example
```java
// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.AgentToAgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AgentToAgentApi apiInstance = new AgentToAgentApi(defaultClient);
    AgentToAgentInstantTestRequest agentToAgentInstantTestRequest = new AgentToAgentInstantTestRequest(); // AgentToAgentInstantTestRequest | 
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    List<Expand> expand = Arrays.asList(); // List<Expand> | (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the `agents` sub-resource, use the query `?expand=agent`.
    try {
      AgentToAgentInstantTest result = apiInstance.postInstantTestAgentToAgent(agentToAgentInstantTestRequest, aid, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentToAgentApi#postInstantTestAgentToAgent");
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
| **agentToAgentInstantTestRequest** | [**AgentToAgentInstantTestRequest**](AgentToAgentInstantTestRequest.md)|  | |
| **aid** | **String**| A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. | [optional] |
| **expand** | [**List&lt;Expand&gt;**](Expand.md)| (Optional) Indicates if the test sub-resources should be expanded. Defaults to no expansion. To expand the &#x60;agents&#x60; sub-resource, use the query &#x60;?expand&#x3D;agent&#x60;. | [optional] |

### Return type

[**AgentToAgentInstantTest**](AgentToAgentInstantTest.md)

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
| **404** | Not found |  -  |
| **429** | Exhausted rate limit for the organization |  -  |
| **500** | Internal server error |  -  |
| **502** | Bad Gateway |  -  |
| **0** | An error occurred |  -  |
