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
 * TcpConnect
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:26.016985Z[Europe/London]")
public class TcpConnect {
  public static final String SERIALIZED_NAME_RTT = "rtt";
  @SerializedName(SERIALIZED_NAME_RTT)
  private Double rtt;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_INFO_FLAGS = "infoFlags";
  @SerializedName(SERIALIZED_NAME_INFO_FLAGS)
  private List<String> infoFlags;

  public TcpConnect() {
  }

  
  public TcpConnect(
     Double rtt, 
     String errorCode, 
     String error, 
     List<String> infoFlags
  ) {
    this();
    this.rtt = rtt;
    this.errorCode = errorCode;
    this.error = error;
    this.infoFlags = infoFlags;
  }

   /**
   * Represents the number of milliseconds required to establish TCP connectivity with the target
   * @return rtt
  **/
  @javax.annotation.Nullable
  public Double getRtt() {
    return rtt;
  }




   /**
   * Only present when there is an error
   * @return errorCode
  **/
  @javax.annotation.Nullable
  public String getErrorCode() {
    return errorCode;
  }




   /**
   * Only present when there is an error
   * @return error
  **/
  @javax.annotation.Nullable
  public String getError() {
    return error;
  }




   /**
   * Get infoFlags
   * @return infoFlags
  **/
  @javax.annotation.Nullable
  public List<String> getInfoFlags() {
    return infoFlags;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TcpConnect tcpConnect = (TcpConnect) o;
    return Objects.equals(this.rtt, tcpConnect.rtt) &&
        Objects.equals(this.errorCode, tcpConnect.errorCode) &&
        Objects.equals(this.error, tcpConnect.error) &&
        Objects.equals(this.infoFlags, tcpConnect.infoFlags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rtt, errorCode, error, infoFlags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TcpConnect {\n");
    sb.append("    rtt: ").append(toIndentedString(rtt)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    infoFlags: ").append(toIndentedString(infoFlags)).append("\n");
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
    openapiFields.add("rtt");
    openapiFields.add("errorCode");
    openapiFields.add("error");
    openapiFields.add("infoFlags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TcpConnect
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TcpConnect.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TcpConnect is not found in the empty JSON string", TcpConnect.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TcpConnect.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TcpConnect` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonNull()) && !jsonObj.get("errorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCode").toString()));
      }
      if ((jsonObj.get("error") != null && !jsonObj.get("error").isJsonNull()) && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("infoFlags") != null && !jsonObj.get("infoFlags").isJsonNull() && !jsonObj.get("infoFlags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `infoFlags` to be an array in the JSON string but got `%s`", jsonObj.get("infoFlags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TcpConnect.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TcpConnect' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TcpConnect> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TcpConnect.class));

       return (TypeAdapter<T>) new TypeAdapter<TcpConnect>() {
           @Override
           public void write(JsonWriter out, TcpConnect value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TcpConnect read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TcpConnect given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TcpConnect
  * @throws IOException if the JSON string is invalid with respect to TcpConnect
  */
  public static TcpConnect fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TcpConnect.class);
  }

 /**
  * Convert an instance of TcpConnect to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
