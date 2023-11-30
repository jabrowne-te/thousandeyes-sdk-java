/*
 * Internet Insights API
 * # Overview We are happy to announce the release of the Internet Insights API set. This limited release includes endpoints that: * Make our catalog provider and Internet outage data accessible to API users. * Provide access to advanced filtering, which is part of our next-generation API efforts to allow API users to fine-tune queries across all of our APIs in a consistent manner.  Internet Insights provide visibility into core Internet infrastructure, including: ISPs, DNS providers, IaaS, CDNs , and SaaS providers. It tracks the macro-level impact of Internet events on individual users and enterprise networks connecting at the edge of the Internet. These events include: Outages, Routing hijacks and leaks, DDoS attacks, And political interference, among others.  Future releases of the Internet Insights API set will further unlock access to core Internet Insights functionality, unlocking potential integrations to enrich customer process flows. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.JSON;

/**
 * Catalog provider
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:28.269079Z[Europe/London]")
public class ApiCatalogProvider {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  private String providerName;

  public static final String SERIALIZED_NAME_PROVIDER_TYPE = "providerType";
  @SerializedName(SERIALIZED_NAME_PROVIDER_TYPE)
  private String providerType;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_ASNS_COUNT = "asnsCount";
  @SerializedName(SERIALIZED_NAME_ASNS_COUNT)
  private Integer asnsCount;

  public static final String SERIALIZED_NAME_COUNTRIES_COUNT = "countriesCount";
  @SerializedName(SERIALIZED_NAME_COUNTRIES_COUNT)
  private Integer countriesCount;

  public static final String SERIALIZED_NAME_LOCATIONS_COUNT = "locationsCount";
  @SerializedName(SERIALIZED_NAME_LOCATIONS_COUNT)
  private Integer locationsCount;

  public static final String SERIALIZED_NAME_INTERFACES_COUNT = "interfacesCount";
  @SerializedName(SERIALIZED_NAME_INTERFACES_COUNT)
  private Integer interfacesCount;

  public static final String SERIALIZED_NAME_INCLUDED = "included";
  @SerializedName(SERIALIZED_NAME_INCLUDED)
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
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }


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
  @javax.annotation.Nullable
  public String getProviderName() {
    return providerName;
  }


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
  @javax.annotation.Nullable
  public String getProviderType() {
    return providerType;
  }


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
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }


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
  @javax.annotation.Nullable
  public String getDataType() {
    return dataType;
  }


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
  @javax.annotation.Nullable
  public Integer getAsnsCount() {
    return asnsCount;
  }


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
  @javax.annotation.Nullable
  public Integer getCountriesCount() {
    return countriesCount;
  }


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
  @javax.annotation.Nullable
  public Integer getLocationsCount() {
    return locationsCount;
  }


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
  @javax.annotation.Nullable
  public Integer getInterfacesCount() {
    return interfacesCount;
  }


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
  @javax.annotation.Nullable
  public Boolean getIncluded() {
    return included;
  }


  public void setIncluded(Boolean included) {
    this.included = included;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("providerName");
    openapiFields.add("providerType");
    openapiFields.add("region");
    openapiFields.add("dataType");
    openapiFields.add("asnsCount");
    openapiFields.add("countriesCount");
    openapiFields.add("locationsCount");
    openapiFields.add("interfacesCount");
    openapiFields.add("included");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiCatalogProvider
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiCatalogProvider.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiCatalogProvider is not found in the empty JSON string", ApiCatalogProvider.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiCatalogProvider.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiCatalogProvider` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("providerName") != null && !jsonObj.get("providerName").isJsonNull()) && !jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
      }
      if ((jsonObj.get("providerType") != null && !jsonObj.get("providerType").isJsonNull()) && !jsonObj.get("providerType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerType").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("dataType") != null && !jsonObj.get("dataType").isJsonNull()) && !jsonObj.get("dataType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiCatalogProvider.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiCatalogProvider' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiCatalogProvider> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiCatalogProvider.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiCatalogProvider>() {
           @Override
           public void write(JsonWriter out, ApiCatalogProvider value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiCatalogProvider read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiCatalogProvider given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiCatalogProvider
  * @throws IOException if the JSON string is invalid with respect to ApiCatalogProvider
  */
  public static ApiCatalogProvider fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiCatalogProvider.class);
  }

 /**
  * Convert an instance of ApiCatalogProvider to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
