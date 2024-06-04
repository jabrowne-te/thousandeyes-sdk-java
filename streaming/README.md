# streaming

ThousandEyes for OpenTelemetry API

- API version: 7.0.6

ThousandEyes for OpenTelemetry provides machine-to-machine integration between ThousandEyes and its customers. It allows you to export ThousandEyes telemetry data in OTel format, which is widely used in the industry. With ThousandEyes for OTel, you can leverage frameworks widely used in the observability domain - such as Splunk, Grafana, and Honeycomb - to capture and analyze ThousandEyes data. Any client that supports OTel can use ThousandEyes for OpenTelemetry.

ThousandEyes for OTel is made up of the following components:

* Data streaming APIs that you can use to configure and enable your ThousandEyes tests with OTel-compatible streams,
in particular to configure how ThousandEyes telemetry data is exported to client integrations.
* A set of streaming pipelines called _collectors_ that actively fetch ThousandEyes network test data, enrich the data with some additional
detail, filter, and push the data to the customer-configured endpoints, depending on what you configure via the public APIs.
* Third-party OTel collectors that receive, transform, filter, and export different metrics to client applications such as AppD, or any other OTel-capable client
configuration.

For more information about ThousandEyes for OpenTelemetry, see the [documentation](https://docs.thousandeyes.com/product-documentation/api/opentelemetry).



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 11+
2. Maven/Gradle

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
  <groupId>com.thousandeyes.sdk</groupId>
  <artifactId>streaming</artifactId>
  <version>version</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.thousandeyes.sdk:streaming:version"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/streaming-version.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.thousandeyes.sdk.*;
import com.thousandeyes.sdk.streaming.model.*;
import com.thousandeyes.sdk.streaming.StreamingApi;

public class StreamingApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure clients using the `defaultClient` object, such as
        // overriding the host and port, timeout, etc.
        StreamingApi apiInstance = new StreamingApi(defaultClient);
        String aid = "1234"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
        Stream stream = new Stream(); // Stream | Stream to configure
        try {
            CreateStreamResponse result = apiInstance.createStream(aid, stream);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamingApi#createStream");
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
*StreamingApi* | [**createStream**](docs/StreamingApi.md#createStream) | **POST** /v7/stream | Create data stream
*StreamingApi* | [**createStreamWithHttpInfo**](docs/StreamingApi.md#createStreamWithHttpInfo) | **POST** /v7/stream | Create data stream
*StreamingApi* | [**deleteStream**](docs/StreamingApi.md#deleteStream) | **DELETE** /v7/stream/{id} | Delete a data stream
*StreamingApi* | [**deleteStreamWithHttpInfo**](docs/StreamingApi.md#deleteStreamWithHttpInfo) | **DELETE** /v7/stream/{id} | Delete a data stream
*StreamingApi* | [**getStream**](docs/StreamingApi.md#getStream) | **GET** /v7/stream/{id} | Retrieve data stream
*StreamingApi* | [**getStreamWithHttpInfo**](docs/StreamingApi.md#getStreamWithHttpInfo) | **GET** /v7/stream/{id} | Retrieve data stream
*StreamingApi* | [**getStreams**](docs/StreamingApi.md#getStreams) | **GET** /v7/stream | List data streams
*StreamingApi* | [**getStreamsWithHttpInfo**](docs/StreamingApi.md#getStreamsWithHttpInfo) | **GET** /v7/stream | List data streams
*StreamingApi* | [**updateStream**](docs/StreamingApi.md#updateStream) | **PUT** /v7/stream/{id} | Update data stream
*StreamingApi* | [**updateStreamWithHttpInfo**](docs/StreamingApi.md#updateStreamWithHttpInfo) | **PUT** /v7/stream/{id} | Update data stream


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="BearerAuth"></a>
### BearerAuth


- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
However, the instances of the api clients created from the `ApiClient` are thread-safe and can be re-used.

## Author


