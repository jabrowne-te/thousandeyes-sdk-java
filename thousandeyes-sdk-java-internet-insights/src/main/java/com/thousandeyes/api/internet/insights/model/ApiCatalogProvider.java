/*
 * Internet Insights API
 * We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that:  * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.internet.insights.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Catalog provider
 */
@JsonPropertyOrder({
  ApiCatalogProvider.JSON_PROPERTY_ID,
  ApiCatalogProvider.JSON_PROPERTY_PROVIDER_NAME,
  ApiCatalogProvider.JSON_PROPERTY_PROVIDER_TYPE,
  ApiCatalogProvider.JSON_PROPERTY_REGION,
  ApiCatalogProvider.JSON_PROPERTY_DATA_TYPE,
  ApiCatalogProvider.JSON_PROPERTY_ASNS_COUNT,
  ApiCatalogProvider.JSON_PROPERTY_COUNTRIES_COUNT,
  ApiCatalogProvider.JSON_PROPERTY_LOCATIONS_COUNT,
  ApiCatalogProvider.JSON_PROPERTY_INTERFACES_COUNT,
  ApiCatalogProvider.JSON_PROPERTY_INCLUDED
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.131336+01:00[Europe/London]")
public class ApiCatalogProvider {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_PROVIDER_NAME = "providerName";
  private String providerName;

  public static final String JSON_PROPERTY_PROVIDER_TYPE = "providerType";
  private String providerType;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_DATA_TYPE = "dataType";
  private String dataType;

  public static final String JSON_PROPERTY_ASNS_COUNT = "asnsCount";
  private Integer asnsCount;

  public static final String JSON_PROPERTY_COUNTRIES_COUNT = "countriesCount";
  private Integer countriesCount;

  public static final String JSON_PROPERTY_LOCATIONS_COUNT = "locationsCount";
  private Integer locationsCount;

  public static final String JSON_PROPERTY_INTERFACES_COUNT = "interfacesCount";
  private Integer interfacesCount;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private Boolean included;

  public ApiCatalogProvider() { 
  }

  public ApiCatalogProvider id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * The catalog provider ID.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public ApiCatalogProvider providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * The name of the catalog provider.
   * @return providerName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderName() {
    return providerName;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }


  public ApiCatalogProvider providerType(String providerType) {
    this.providerType = providerType;
    return this;
  }

   /**
   * The type of catalog provider.
   * @return providerType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProviderType() {
    return providerType;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }


  public ApiCatalogProvider region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The catalog provider region.
   * @return region
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public ApiCatalogProvider dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * The type of data produced by the provider.
   * @return dataType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataType() {
    return dataType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public ApiCatalogProvider asnsCount(Integer asnsCount) {
    this.asnsCount = asnsCount;
    return this;
  }

   /**
   * The number of ASN&#39;s covered by the provider.
   * @return asnsCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASNS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAsnsCount() {
    return asnsCount;
  }


  @JsonProperty(JSON_PROPERTY_ASNS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsnsCount(Integer asnsCount) {
    this.asnsCount = asnsCount;
  }


  public ApiCatalogProvider countriesCount(Integer countriesCount) {
    this.countriesCount = countriesCount;
    return this;
  }

   /**
   * The number of countries covered by the provider.
   * @return countriesCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCountriesCount() {
    return countriesCount;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRIES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountriesCount(Integer countriesCount) {
    this.countriesCount = countriesCount;
  }


  public ApiCatalogProvider locationsCount(Integer locationsCount) {
    this.locationsCount = locationsCount;
    return this;
  }

   /**
   * The number of locations covered by the provider.
   * @return locationsCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLocationsCount() {
    return locationsCount;
  }


  @JsonProperty(JSON_PROPERTY_LOCATIONS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationsCount(Integer locationsCount) {
    this.locationsCount = locationsCount;
  }


  public ApiCatalogProvider interfacesCount(Integer interfacesCount) {
    this.interfacesCount = interfacesCount;
    return this;
  }

   /**
   * The number of interfaces covered by the provider.
   * @return interfacesCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERFACES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInterfacesCount() {
    return interfacesCount;
  }


  @JsonProperty(JSON_PROPERTY_INTERFACES_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterfacesCount(Integer interfacesCount) {
    this.interfacesCount = interfacesCount;
  }


  public ApiCatalogProvider included(Boolean included) {
    this.included = included;
    return this;
  }

   /**
   * Indicates whether the catalog provider is included in the licensed packages.
   * @return included
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncluded() {
    return included;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncluded(Boolean included) {
    this.included = included;
  }


  /**
   * Return true if this ApiCatalogProvider object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiCatalogProvider apiCatalogProvider = (ApiCatalogProvider) o;
    return Objects.equals(this.id, apiCatalogProvider.id) &&
        Objects.equals(this.providerName, apiCatalogProvider.providerName) &&
        Objects.equals(this.providerType, apiCatalogProvider.providerType) &&
        Objects.equals(this.region, apiCatalogProvider.region) &&
        Objects.equals(this.dataType, apiCatalogProvider.dataType) &&
        Objects.equals(this.asnsCount, apiCatalogProvider.asnsCount) &&
        Objects.equals(this.countriesCount, apiCatalogProvider.countriesCount) &&
        Objects.equals(this.locationsCount, apiCatalogProvider.locationsCount) &&
        Objects.equals(this.interfacesCount, apiCatalogProvider.interfacesCount) &&
        Objects.equals(this.included, apiCatalogProvider.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, providerName, providerType, region, dataType, asnsCount, countriesCount, locationsCount, interfacesCount, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiCatalogProvider {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    asnsCount: ").append(toIndentedString(asnsCount)).append("\n");
    sb.append("    countriesCount: ").append(toIndentedString(countriesCount)).append("\n");
    sb.append("    locationsCount: ").append(toIndentedString(locationsCount)).append("\n");
    sb.append("    interfacesCount: ").append(toIndentedString(interfacesCount)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

