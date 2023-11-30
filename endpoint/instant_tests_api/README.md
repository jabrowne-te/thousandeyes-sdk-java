# thousandeyes-java-sdk

Endpoint Instant Scheduled Tests API
- API version: 7.0.0
  - Build date: 2023-11-30T09:45:23.306263Z[Europe/London]


### Overview

You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.

The following applies to the Endpoint Instant Scheduled Tests API:

* To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.

* Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition.
* It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints.
The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created.



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
import com.thousandeyes.api.AgentToServerInstantScheduledTestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    AgentToServerInstantScheduledTestApi apiInstance = new AgentToServerInstantScheduledTestApi(defaultClient);
    EndpointAgentToServerInstantTest endpointAgentToServerInstantTest = new EndpointAgentToServerInstantTest(); // EndpointAgentToServerInstantTest | 
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      EndpointAgentToServerTest result = apiInstance.postAgentToServerInstantTest(endpointAgentToServerInstantTest, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentToServerInstantScheduledTestApi#postAgentToServerInstantTest");
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
*AgentToServerInstantScheduledTestApi* | [**postAgentToServerInstantTest**](docs/AgentToServerInstantScheduledTestApi.md#postAgentToServerInstantTest) | **POST** /v7/endpoint/tests/scheduled-tests/agent-to-server/instant | Run agent to server instant scheduled test
*HttpServerInstantScheduledTestApi* | [**postHttpServerInstantTest**](docs/HttpServerInstantScheduledTestApi.md#postHttpServerInstantTest) | **POST** /v7/endpoint/tests/scheduled-tests/http-server/instant | Run http server instant scheduled test
*RunExistingTestApi* | [**postEndpointInstantRun**](docs/RunExistingTestApi.md#postEndpointInstantRun) | **POST** /v7/endpoint/tests/scheduled-tests/{testId}/run | Run endpoint instant scheduled test


## Documentation for Models

 - [AccountGroupId](docs/AccountGroupId.md)
 - [AgentLabelsSelectorType](docs/AgentLabelsSelectorType.md)
 - [AllAgentsSelectorType](docs/AllAgentsSelectorType.md)
 - [EndpointAgentLabelsSelectorConfig](docs/EndpointAgentLabelsSelectorConfig.md)
 - [EndpointAgentSelectorConfig](docs/EndpointAgentSelectorConfig.md)
 - [EndpointAgentToServerInstantTest](docs/EndpointAgentToServerInstantTest.md)
 - [EndpointAgentToServerTest](docs/EndpointAgentToServerTest.md)
 - [EndpointAgentToServerType](docs/EndpointAgentToServerType.md)
 - [EndpointAllAgentsSelectorConfig](docs/EndpointAllAgentsSelectorConfig.md)
 - [EndpointHttpServerBaseTest](docs/EndpointHttpServerBaseTest.md)
 - [EndpointHttpServerInstantTest](docs/EndpointHttpServerInstantTest.md)
 - [EndpointHttpServerTest](docs/EndpointHttpServerTest.md)
 - [EndpointHttpServerType](docs/EndpointHttpServerType.md)
 - [EndpointInstantTest](docs/EndpointInstantTest.md)
 - [EndpointScheduledTestType](docs/EndpointScheduledTestType.md)
 - [EndpointSpecificAgentsSelectorConfig](docs/EndpointSpecificAgentsSelectorConfig.md)
 - [EndpointTest](docs/EndpointTest.md)
 - [EndpointTestAgentSelectorType](docs/EndpointTestAgentSelectorType.md)
 - [EndpointTestAid](docs/EndpointTestAid.md)
 - [EndpointTestAuthType](docs/EndpointTestAuthType.md)
 - [EndpointTestLinks](docs/EndpointTestLinks.md)
 - [EndpointTestLinksSelf](docs/EndpointTestLinksSelf.md)
 - [EndpointTestLinksTestResults](docs/EndpointTestLinksTestResults.md)
 - [EndpointTestProtocol](docs/EndpointTestProtocol.md)
 - [Error](docs/Error.md)
 - [Link](docs/Link.md)
 - [SpecificAgentsSelectorType](docs/SpecificAgentsSelectorType.md)
 - [TestInterval](docs/TestInterval.md)
 - [TestProbeMode](docs/TestProbeMode.md)
 - [TestSslVersionId](docs/TestSslVersionId.md)
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


