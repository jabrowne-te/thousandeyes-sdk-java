/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
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
import com.thousandeyes.api.model.DynamicBaseTestResultWebex;
import com.thousandeyes.api.model.DynamicTestApplication;
import java.io.IOException;
import java.util.Arrays;

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
 * DynamicBaseTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:26.016985Z[Europe/London]")
public class DynamicBaseTestResult {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private DynamicTestApplication application;

  public static final String SERIALIZED_NAME_WEBEX = "webex";
  @SerializedName(SERIALIZED_NAME_WEBEX)
  private DynamicBaseTestResultWebex webex;

  public DynamicBaseTestResult() {
  }

  public DynamicBaseTestResult application(DynamicTestApplication application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  public DynamicTestApplication getApplication() {
    return application;
  }


  public void setApplication(DynamicTestApplication application) {
    this.application = application;
  }


  public DynamicBaseTestResult webex(DynamicBaseTestResultWebex webex) {
    
    this.webex = webex;
    return this;
  }

   /**
   * Get webex
   * @return webex
  **/
  @javax.annotation.Nullable
  public DynamicBaseTestResultWebex getWebex() {
    return webex;
  }


  public void setWebex(DynamicBaseTestResultWebex webex) {
    this.webex = webex;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicBaseTestResult dynamicBaseTestResult = (DynamicBaseTestResult) o;
    return Objects.equals(this.application, dynamicBaseTestResult.application) &&
        Objects.equals(this.webex, dynamicBaseTestResult.webex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, webex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicBaseTestResult {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    webex: ").append(toIndentedString(webex)).append("\n");
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
    openapiFields.add("application");
    openapiFields.add("webex");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DynamicBaseTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DynamicBaseTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicBaseTestResult is not found in the empty JSON string", DynamicBaseTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DynamicBaseTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DynamicBaseTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `webex`
      if (jsonObj.get("webex") != null && !jsonObj.get("webex").isJsonNull()) {
        DynamicBaseTestResultWebex.validateJsonElement(jsonObj.get("webex"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DynamicBaseTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicBaseTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicBaseTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicBaseTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicBaseTestResult>() {
           @Override
           public void write(JsonWriter out, DynamicBaseTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DynamicBaseTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DynamicBaseTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DynamicBaseTestResult
  * @throws IOException if the JSON string is invalid with respect to DynamicBaseTestResult
  */
  public static DynamicBaseTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicBaseTestResult.class);
  }

 /**
  * Convert an instance of DynamicBaseTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
