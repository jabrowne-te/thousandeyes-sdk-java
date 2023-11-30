/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
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
 * UnassignEnterpriseAgentFromClusterRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:12.244629Z[Europe/London]")
public class UnassignEnterpriseAgentFromClusterRequest {
  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<String> members;

  public UnassignEnterpriseAgentFromClusterRequest() {
  }

  public UnassignEnterpriseAgentFromClusterRequest members(List<String> members) {
    
    this.members = members;
    return this;
  }

  public UnassignEnterpriseAgentFromClusterRequest addMembersItem(String membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Contains list of member IDs. (get &#x60;memberId&#x60; from &#x60;/agents/{agentId}&#x60; endpoint)
   * @return members
  **/
  @javax.annotation.Nullable
  public List<String> getMembers() {
    return members;
  }


  public void setMembers(List<String> members) {
    this.members = members;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnassignEnterpriseAgentFromClusterRequest unassignEnterpriseAgentFromClusterRequest = (UnassignEnterpriseAgentFromClusterRequest) o;
    return Objects.equals(this.members, unassignEnterpriseAgentFromClusterRequest.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnassignEnterpriseAgentFromClusterRequest {\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
    openapiFields.add("members");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UnassignEnterpriseAgentFromClusterRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UnassignEnterpriseAgentFromClusterRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnassignEnterpriseAgentFromClusterRequest is not found in the empty JSON string", UnassignEnterpriseAgentFromClusterRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UnassignEnterpriseAgentFromClusterRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnassignEnterpriseAgentFromClusterRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("members") != null && !jsonObj.get("members").isJsonNull() && !jsonObj.get("members").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `members` to be an array in the JSON string but got `%s`", jsonObj.get("members").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnassignEnterpriseAgentFromClusterRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnassignEnterpriseAgentFromClusterRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnassignEnterpriseAgentFromClusterRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnassignEnterpriseAgentFromClusterRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UnassignEnterpriseAgentFromClusterRequest>() {
           @Override
           public void write(JsonWriter out, UnassignEnterpriseAgentFromClusterRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnassignEnterpriseAgentFromClusterRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UnassignEnterpriseAgentFromClusterRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnassignEnterpriseAgentFromClusterRequest
  * @throws IOException if the JSON string is invalid with respect to UnassignEnterpriseAgentFromClusterRequest
  */
  public static UnassignEnterpriseAgentFromClusterRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnassignEnterpriseAgentFromClusterRequest.class);
  }

 /**
  * Convert an instance of UnassignEnterpriseAgentFromClusterRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
