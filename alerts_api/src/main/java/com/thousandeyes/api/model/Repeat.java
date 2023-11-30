/*
 * Alerts API
 *  ## Overview Manage all alerts, alert rules and alert suppression windows.
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
import com.thousandeyes.api.model.DaysOfWeek;
import com.thousandeyes.api.model.IntervalType;
import com.thousandeyes.api.model.RepeatType;
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
 * Repeat options.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:08.473114Z[Europe/London]")
public class Repeat {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private RepeatType type;

  public static final String SERIALIZED_NAME_INTERVAL_TYPE = "intervalType";
  @SerializedName(SERIALIZED_NAME_INTERVAL_TYPE)
  private IntervalType intervalType;

  public static final String SERIALIZED_NAME_INTERVAL_LENGTH = "intervalLength";
  @SerializedName(SERIALIZED_NAME_INTERVAL_LENGTH)
  private Integer intervalLength;

  public static final String SERIALIZED_NAME_DAYS_OF_WEEK = "daysOfWeek";
  @SerializedName(SERIALIZED_NAME_DAYS_OF_WEEK)
  private List<DaysOfWeek> daysOfWeek;

  public Repeat() {
  }

  public Repeat type(RepeatType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public RepeatType getType() {
    return type;
  }


  public void setType(RepeatType type) {
    this.type = type;
  }


  public Repeat intervalType(IntervalType intervalType) {
    
    this.intervalType = intervalType;
    return this;
  }

   /**
   * Get intervalType
   * @return intervalType
  **/
  @javax.annotation.Nullable
  public IntervalType getIntervalType() {
    return intervalType;
  }


  public void setIntervalType(IntervalType intervalType) {
    this.intervalType = intervalType;
  }


  public Repeat intervalLength(Integer intervalLength) {
    
    this.intervalLength = intervalLength;
    return this;
  }

   /**
   * Number of &#x60;intervalTypes&#x60; to wait before reactivating the alert suppression window.
   * @return intervalLength
  **/
  @javax.annotation.Nullable
  public Integer getIntervalLength() {
    return intervalLength;
  }


  public void setIntervalLength(Integer intervalLength) {
    this.intervalLength = intervalLength;
  }


  public Repeat daysOfWeek(List<DaysOfWeek> daysOfWeek) {
    
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public Repeat addDaysOfWeekItem(DaysOfWeek daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

   /**
   * Get daysOfWeek
   * @return daysOfWeek
  **/
  @javax.annotation.Nullable
  public List<DaysOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }


  public void setDaysOfWeek(List<DaysOfWeek> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repeat repeat = (Repeat) o;
    return Objects.equals(this.type, repeat.type) &&
        Objects.equals(this.intervalType, repeat.intervalType) &&
        Objects.equals(this.intervalLength, repeat.intervalLength) &&
        Objects.equals(this.daysOfWeek, repeat.daysOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, intervalType, intervalLength, daysOfWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repeat {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    intervalType: ").append(toIndentedString(intervalType)).append("\n");
    sb.append("    intervalLength: ").append(toIndentedString(intervalLength)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("intervalType");
    openapiFields.add("intervalLength");
    openapiFields.add("daysOfWeek");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Repeat
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Repeat.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Repeat is not found in the empty JSON string", Repeat.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Repeat.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Repeat` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("daysOfWeek") != null && !jsonObj.get("daysOfWeek").isJsonNull() && !jsonObj.get("daysOfWeek").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `daysOfWeek` to be an array in the JSON string but got `%s`", jsonObj.get("daysOfWeek").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Repeat.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Repeat' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Repeat> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Repeat.class));

       return (TypeAdapter<T>) new TypeAdapter<Repeat>() {
           @Override
           public void write(JsonWriter out, Repeat value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Repeat read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Repeat given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Repeat
  * @throws IOException if the JSON string is invalid with respect to Repeat
  */
  public static Repeat fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Repeat.class);
  }

 /**
  * Convert an instance of Repeat to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
