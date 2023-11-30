# thousandeyes-java-sdk

Internet Insights API
- API version: 7.0.0
  - Build date: 2023-11-30T09:45:28.269079Z[Europe/London]

# Overview
We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that:
* Make our catalog provider and Internet outage data accessible to API users.
* Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.

Internet Insights provide visibility into core Internet infrastructure, including: ISPs, DNS providers, IaaS, CDNs , and SaaS providers.
It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include: Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.

Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows.



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
import com.thousandeyes.api.CatalogProvidersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thousandeyes.com");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    CatalogProvidersApi apiInstance = new CatalogProvidersApi(defaultClient);
    ApiCatalogProviderFilter apiCatalogProviderFilter = new ApiCatalogProviderFilter(); // ApiCatalogProviderFilter | 
    String aid = "2067"; // String | A unique identifier associated with your account group. You can retrieve your `AccountGroupId` from the `/account-groups` endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response.
    try {
      ApiCatalogProviderResponse result = apiInstance.catalogProviderList(apiCatalogProviderFilter, aid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogProvidersApi#catalogProviderList");
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
*CatalogProvidersApi* | [**catalogProviderList**](docs/CatalogProvidersApi.md#catalogProviderList) | **POST** /v7/internet-insights/catalog/providers/filter | List catalog providers
*CatalogProvidersApi* | [**getCatalogProvider**](docs/CatalogProvidersApi.md#getCatalogProvider) | **GET** /v7/internet-insights/catalog/providers/{providerId} | Retrieve a catalog provider
*OutagesApiPublicApi* | [**getOutagesApp**](docs/OutagesApiPublicApi.md#getOutagesApp) | **GET** /v7/internet-insights/outages/app/{outageId} | Retrieve application outage
*OutagesApiPublicApi* | [**getOutagesFilter**](docs/OutagesApiPublicApi.md#getOutagesFilter) | **POST** /v7/internet-insights/outages/filter | List network and application outages
*OutagesApiPublicApi* | [**getOutagesNet**](docs/OutagesApiPublicApi.md#getOutagesNet) | **GET** /v7/internet-insights/outages/net/{outageId} | Retrieve network outage


## Documentation for Models

 - [ApiAffectedAgent](docs/ApiAffectedAgent.md)
 - [ApiAffectedTest](docs/ApiAffectedTest.md)
 - [ApiApplicationOutageAffectedLocation](docs/ApiApplicationOutageAffectedLocation.md)
 - [ApiApplicationOutageAffectedServer](docs/ApiApplicationOutageAffectedServer.md)
 - [ApiApplicationOutageDetails](docs/ApiApplicationOutageDetails.md)
 - [ApiApplicationOutageResponse](docs/ApiApplicationOutageResponse.md)
 - [ApiAsn](docs/ApiAsn.md)
 - [ApiCatalogProvider](docs/ApiCatalogProvider.md)
 - [ApiCatalogProviderDetails](docs/ApiCatalogProviderDetails.md)
 - [ApiCatalogProviderDetailsLocationsInner](docs/ApiCatalogProviderDetailsLocationsInner.md)
 - [ApiCatalogProviderDetailsResponse](docs/ApiCatalogProviderDetailsResponse.md)
 - [ApiCatalogProviderFilter](docs/ApiCatalogProviderFilter.md)
 - [ApiCatalogProviderResponse](docs/ApiCatalogProviderResponse.md)
 - [ApiCatalogProviderResponseAllOfProvidersInner](docs/ApiCatalogProviderResponseAllOfProvidersInner.md)
 - [ApiNetworkOutageAffectedLocation](docs/ApiNetworkOutageAffectedLocation.md)
 - [ApiNetworkOutageDetails](docs/ApiNetworkOutageDetails.md)
 - [ApiNetworkOutageResponse](docs/ApiNetworkOutageResponse.md)
 - [ApiOutage](docs/ApiOutage.md)
 - [ApiOutageFilter](docs/ApiOutageFilter.md)
 - [ApiOutagesResponse](docs/ApiOutagesResponse.md)
 - [ApiOutagesResponseAllOfOutagesInner](docs/ApiOutagesResponseAllOfOutagesInner.md)
 - [Error](docs/Error.md)
 - [Link](docs/Link.md)
 - [OutageScope](docs/OutageScope.md)
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


