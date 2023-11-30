# thousandeyes-java-sdk

Labels API
- API version: 7.0.0
  - Build date: 2023-11-30T09:45:09.561314Z[Europe/London]

### Overview
This is API for the Labels API (formerly called groups).


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.thousandeyes</groupId>
  <artifactId>thousandeyes-java-sdk</artifactId>
  <version>7.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'thousandeyes-java-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'thousandeyes-java-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.thousandeyes:thousandeyes-java-sdk:7.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/thousandeyes-java-sdk-7.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.thousandeyes.ApiClient;
import com.thousandeyes.ApiException;
import com.thousandeyes.Configuration;
import com.thousandeyes.auth.*;
import com.thousandeyes.models.*;
import com.thousandeyes.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    LabelRequest labelRequest = new LabelRequest(); // LabelRequest | Label resource
    try {
      CreateAgentLabel201Response result = apiInstance.createAgentLabel(aid, labelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#createAgentLabel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.thousandeyes.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AgentApi* | [**createAgentLabel**](docs/AgentApi.md#createAgentLabel) | **POST** /v7/labels/agent | Create a Label of type &#x60;agent&#x60;
*AgentApi* | [**deleteAgentLabel**](docs/AgentApi.md#deleteAgentLabel) | **DELETE** /v7/labels/agent/{labelId} | Delete a Label object of type &#x60;agent&#x60;
*AgentApi* | [**getAgentLabel**](docs/AgentApi.md#getAgentLabel) | **GET** /v7/labels/agent/{labelId} | Get a Label object of type &#x60;agent&#x60;
*AgentApi* | [**updateAgentLabel**](docs/AgentApi.md#updateAgentLabel) | **PUT** /v7/labels/agent/{labelId} | Update a Label object of type &#x60;agent&#x60;
*AllLabelsApi* | [**getLabels**](docs/AllLabelsApi.md#getLabels) | **GET** /v7/labels | Get list of Labels
*DashboardApi* | [**createDashboardLabel**](docs/DashboardApi.md#createDashboardLabel) | **POST** /v7/labels/dashboard | Create a Label of type &#x60;dashboard&#x60;
*DashboardApi* | [**deleteDashboardLabel**](docs/DashboardApi.md#deleteDashboardLabel) | **DELETE** /v7/labels/dashboard/{labelId} | Delete a Label object of type &#x60;dashboard&#x60;
*DashboardApi* | [**getDashboardLabel**](docs/DashboardApi.md#getDashboardLabel) | **GET** /v7/labels/dashboard/{labelId} | Get a Label object of type &#x60;dashboard&#x60;
*DashboardApi* | [**updateDashboardLabel**](docs/DashboardApi.md#updateDashboardLabel) | **PUT** /v7/labels/dashboard/{labelId} | Update a Label object of type &#x60;dashboard&#x60;
*EndpointTestApi* | [**createEndpointTestsLabel**](docs/EndpointTestApi.md#createEndpointTestsLabel) | **POST** /v7/labels/endpoint-test | Create a Label of type &#x60;endpoint-test&#x60;
*EndpointTestApi* | [**deleteEndpointTestLabel**](docs/EndpointTestApi.md#deleteEndpointTestLabel) | **DELETE** /v7/labels/endpoint-test/{labelId} | Delete a Label object of type &#x60;endpoint-test&#x60;
*EndpointTestApi* | [**getEndpointTestLabel**](docs/EndpointTestApi.md#getEndpointTestLabel) | **GET** /v7/labels/endpoint-test/{labelId} | Get a Label object of type &#x60;endpoint-test&#x60;
*EndpointTestApi* | [**updateEndpointTestLabel**](docs/EndpointTestApi.md#updateEndpointTestLabel) | **PUT** /v7/labels/endpoint-test/{labelId} | Update a Label object of type &#x60;endpoint-test&#x60;
*TestApi* | [**createTestLabel**](docs/TestApi.md#createTestLabel) | **POST** /v7/labels/test | Create a Label of type &#x60;test&#x60;
*TestApi* | [**deleteTestLabel**](docs/TestApi.md#deleteTestLabel) | **DELETE** /v7/labels/test/{labelId} | Delete a Label object of type &#x60;test&#x60;
*TestApi* | [**getTestLabel**](docs/TestApi.md#getTestLabel) | **GET** /v7/labels/test/{labelId} | Get a Label object of type &#x60;test&#x60;
*TestApi* | [**updateTestLabel**](docs/TestApi.md#updateTestLabel) | **PUT** /v7/labels/test/{labelId} | Update a Label object of type &#x60;test&#x60;


## Documentation for Models

 - [CreateAgentLabel201Response](docs/CreateAgentLabel201Response.md)
 - [Error](docs/Error.md)
 - [GetLabels200Response](docs/GetLabels200Response.md)
 - [Label](docs/Label.md)
 - [LabelDetail](docs/LabelDetail.md)
 - [LabelRequest](docs/LabelRequest.md)
 - [LabelType](docs/LabelType.md)
 - [Labels](docs/Labels.md)
 - [Link](docs/Link.md)
 - [SelfLinks](docs/SelfLinks.md)
 - [SelfLinksLinks](docs/SelfLinksLinks.md)
 - [UnauthorizedError](docs/UnauthorizedError.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="BearerAuth"></a>
### BearerAuth

- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


