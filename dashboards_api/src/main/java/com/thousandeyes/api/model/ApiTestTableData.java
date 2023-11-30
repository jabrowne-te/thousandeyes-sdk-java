/*
 * Dashboards API
 * Manage ThousandEyes Dashboards
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
import com.thousandeyes.api.model.ApiTestTableGraphletsData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Data shown in a test table widget.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:19.739212Z[Europe/London]")
public class ApiTestTableData {
  public static final String SERIALIZED_NAME_TEST_ID = "testId";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private String testId;

  public static final String SERIALIZED_NAME_TEST_NAME = "testName";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_TEST_TYPE = "testType";
  @SerializedName(SERIALIZED_NAME_TEST_TYPE)
  private String testType;

  public static final String SERIALIZED_NAME_ALERT_COUNT = "alertCount";
  @SerializedName(SERIALIZED_NAME_ALERT_COUNT)
  private Long alertCount;

  public static final String SERIALIZED_NAME_IS_SHARED = "isShared";
  @SerializedName(SERIALIZED_NAME_IS_SHARED)
  private Boolean isShared;

  public static final String SERIALIZED_NAME_GRAPHLETS = "graphlets";
  @SerializedName(SERIALIZED_NAME_GRAPHLETS)
  private List<ApiTestTableGraphletsData> graphlets;

  public ApiTestTableData() {
  }

  public ApiTestTableData testId(String testId) {
    
    this.testId = testId;
    return this;
  }

   /**
   * Identifier of the test.
   * @return testId
  **/
  @javax.annotation.Nullable
  public String getTestId() {
    return testId;
  }


  public void setTestId(String testId) {
    this.testId = testId;
  }


  public ApiTestTableData testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * Name of the test.
   * @return testName
  **/
  @javax.annotation.Nullable
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


  public ApiTestTableData target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * Configured target of the test.
   * @return target
  **/
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public ApiTestTableData testType(String testType) {
    
    this.testType = testType;
    return this;
  }

   /**
   * Type of the test.
   * @return testType
  **/
  @javax.annotation.Nullable
  public String getTestType() {
    return testType;
  }


  public void setTestType(String testType) {
    this.testType = testType;
  }


  public ApiTestTableData alertCount(Long alertCount) {
    
    this.alertCount = alertCount;
    return this;
  }

   /**
   * Number of active alerts of the test.
   * @return alertCount
  **/
  @javax.annotation.Nullable
  public Long getAlertCount() {
    return alertCount;
  }


  public void setAlertCount(Long alertCount) {
    this.alertCount = alertCount;
  }


  public ApiTestTableData isShared(Boolean isShared) {
    
    this.isShared = isShared;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if test is shared, &#x60;false&#x60; otherwise.
   * @return isShared
  **/
  @javax.annotation.Nullable
  public Boolean getIsShared() {
    return isShared;
  }


  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }


  public ApiTestTableData graphlets(List<ApiTestTableGraphletsData> graphlets) {
    
    this.graphlets = graphlets;
    return this;
  }

  public ApiTestTableData addGraphletsItem(ApiTestTableGraphletsData graphletsItem) {
    if (this.graphlets == null) {
      this.graphlets = new ArrayList<>();
    }
    this.graphlets.add(graphletsItem);
    return this;
  }

   /**
   * List of time series points for test metrics in the last 12 hours.
   * @return graphlets
  **/
  @javax.annotation.Nullable
  public List<ApiTestTableGraphletsData> getGraphlets() {
    return graphlets;
  }


  public void setGraphlets(List<ApiTestTableGraphletsData> graphlets) {
    this.graphlets = graphlets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiTestTableData apiTestTableData = (ApiTestTableData) o;
    return Objects.equals(this.testId, apiTestTableData.testId) &&
        Objects.equals(this.testName, apiTestTableData.testName) &&
        Objects.equals(this.target, apiTestTableData.target) &&
        Objects.equals(this.testType, apiTestTableData.testType) &&
        Objects.equals(this.alertCount, apiTestTableData.alertCount) &&
        Objects.equals(this.isShared, apiTestTableData.isShared) &&
        Objects.equals(this.graphlets, apiTestTableData.graphlets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testId, testName, target, testType, alertCount, isShared, graphlets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiTestTableData {\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    alertCount: ").append(toIndentedString(alertCount)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    graphlets: ").append(toIndentedString(graphlets)).append("\n");
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
    openapiFields.add("testId");
    openapiFields.add("testName");
    openapiFields.add("target");
    openapiFields.add("testType");
    openapiFields.add("alertCount");
    openapiFields.add("isShared");
    openapiFields.add("graphlets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiTestTableData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiTestTableData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiTestTableData is not found in the empty JSON string", ApiTestTableData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiTestTableData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiTestTableData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("testId") != null && !jsonObj.get("testId").isJsonNull()) && !jsonObj.get("testId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testId").toString()));
      }
      if ((jsonObj.get("testName") != null && !jsonObj.get("testName").isJsonNull()) && !jsonObj.get("testName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testName").toString()));
      }
      if ((jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) && !jsonObj.get("target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target").toString()));
      }
      if ((jsonObj.get("testType") != null && !jsonObj.get("testType").isJsonNull()) && !jsonObj.get("testType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testType").toString()));
      }
      if (jsonObj.get("graphlets") != null && !jsonObj.get("graphlets").isJsonNull()) {
        JsonArray jsonArraygraphlets = jsonObj.getAsJsonArray("graphlets");
        if (jsonArraygraphlets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("graphlets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `graphlets` to be an array in the JSON string but got `%s`", jsonObj.get("graphlets").toString()));
          }

          // validate the optional field `graphlets` (array)
          for (int i = 0; i < jsonArraygraphlets.size(); i++) {
            ApiTestTableGraphletsData.validateJsonElement(jsonArraygraphlets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiTestTableData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiTestTableData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiTestTableData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiTestTableData.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiTestTableData>() {
           @Override
           public void write(JsonWriter out, ApiTestTableData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiTestTableData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiTestTableData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiTestTableData
  * @throws IOException if the JSON string is invalid with respect to ApiTestTableData
  */
  public static ApiTestTableData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiTestTableData.class);
  }

 /**
  * Convert an instance of ApiTestTableData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
