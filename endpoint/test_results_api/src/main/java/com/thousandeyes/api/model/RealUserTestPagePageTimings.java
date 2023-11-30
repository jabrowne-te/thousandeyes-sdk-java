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
 * RealUserTestPagePageTimings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:26.016985Z[Europe/London]")
public class RealUserTestPagePageTimings {
  public static final String SERIALIZED_NAME_ON_CONTENT_LOAD = "onContentLoad";
  @SerializedName(SERIALIZED_NAME_ON_CONTENT_LOAD)
  private Integer onContentLoad;

  public static final String SERIALIZED_NAME_ON_LOAD = "onLoad";
  @SerializedName(SERIALIZED_NAME_ON_LOAD)
  private Integer onLoad;

  public RealUserTestPagePageTimings() {
  }

  
  public RealUserTestPagePageTimings(
     Integer onContentLoad, 
     Integer onLoad
  ) {
    this();
    this.onContentLoad = onContentLoad;
    this.onLoad = onLoad;
  }

   /**
   * DOM load time in milliseconds.
   * @return onContentLoad
  **/
  @javax.annotation.Nullable
  public Integer getOnContentLoad() {
    return onContentLoad;
  }




   /**
   * Page load time in milliseconds.
   * @return onLoad
  **/
  @javax.annotation.Nullable
  public Integer getOnLoad() {
    return onLoad;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealUserTestPagePageTimings realUserTestPagePageTimings = (RealUserTestPagePageTimings) o;
    return Objects.equals(this.onContentLoad, realUserTestPagePageTimings.onContentLoad) &&
        Objects.equals(this.onLoad, realUserTestPagePageTimings.onLoad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onContentLoad, onLoad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealUserTestPagePageTimings {\n");
    sb.append("    onContentLoad: ").append(toIndentedString(onContentLoad)).append("\n");
    sb.append("    onLoad: ").append(toIndentedString(onLoad)).append("\n");
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
    openapiFields.add("onContentLoad");
    openapiFields.add("onLoad");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RealUserTestPagePageTimings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RealUserTestPagePageTimings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RealUserTestPagePageTimings is not found in the empty JSON string", RealUserTestPagePageTimings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RealUserTestPagePageTimings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RealUserTestPagePageTimings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RealUserTestPagePageTimings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RealUserTestPagePageTimings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RealUserTestPagePageTimings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RealUserTestPagePageTimings.class));

       return (TypeAdapter<T>) new TypeAdapter<RealUserTestPagePageTimings>() {
           @Override
           public void write(JsonWriter out, RealUserTestPagePageTimings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RealUserTestPagePageTimings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RealUserTestPagePageTimings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RealUserTestPagePageTimings
  * @throws IOException if the JSON string is invalid with respect to RealUserTestPagePageTimings
  */
  public static RealUserTestPagePageTimings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RealUserTestPagePageTimings.class);
  }

 /**
  * Convert an instance of RealUserTestPagePageTimings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
