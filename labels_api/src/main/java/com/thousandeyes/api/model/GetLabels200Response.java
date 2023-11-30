/*
 * Labels API
 * ### Overview This is API for the Labels API (formerly called groups).
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
import com.thousandeyes.api.model.Label;
import com.thousandeyes.api.model.SelfLinksLinks;
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
 * GetLabels200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:09.561314Z[Europe/London]")
public class GetLabels200Response {
  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<Label> labels;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public GetLabels200Response() {
  }

  public GetLabels200Response labels(List<Label> labels) {
    
    this.labels = labels;
    return this;
  }

  public GetLabels200Response addLabelsItem(Label labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<Label> getLabels() {
    return labels;
  }


  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }


  public GetLabels200Response links(SelfLinksLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public SelfLinksLinks getLinks() {
    return links;
  }


  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLabels200Response getLabels200Response = (GetLabels200Response) o;
    return Objects.equals(this.labels, getLabels200Response.labels) &&
        Objects.equals(this.links, getLabels200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLabels200Response {\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("labels");
    openapiFields.add("_links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetLabels200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetLabels200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLabels200Response is not found in the empty JSON string", GetLabels200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetLabels200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLabels200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull()) {
        JsonArray jsonArraylabels = jsonObj.getAsJsonArray("labels");
        if (jsonArraylabels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("labels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
          }

          // validate the optional field `labels` (array)
          for (int i = 0; i < jsonArraylabels.size(); i++) {
            Label.validateJsonElement(jsonArraylabels.get(i));
          };
        }
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SelfLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLabels200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLabels200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLabels200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLabels200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLabels200Response>() {
           @Override
           public void write(JsonWriter out, GetLabels200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLabels200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetLabels200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetLabels200Response
  * @throws IOException if the JSON string is invalid with respect to GetLabels200Response
  */
  public static GetLabels200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLabels200Response.class);
  }

 /**
  * Convert an instance of GetLabels200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
