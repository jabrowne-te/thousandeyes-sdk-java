/*
 * Usage API
 * ## Overview These usage endpoints define the following operations: * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the API definitions below for detailed usage instructions and optional parameters.
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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * EnterpriseAgentUnitsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:30.044048Z[Europe/London]")
public class EnterpriseAgentUnitsInner {
  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private Object aid = null;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUP_NAME = "accountGroupName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUP_NAME)
  private Object accountGroupName = null;

  public static final String SERIALIZED_NAME_AGENT_ID = "agentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private String agentId;

  public static final String SERIALIZED_NAME_AGENT_NAME = "agentName";
  @SerializedName(SERIALIZED_NAME_AGENT_NAME)
  private String agentName;

  public static final String SERIALIZED_NAME_ENTERPRISE_UNITS_USED = "enterpriseUnitsUsed";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_UNITS_USED)
  private Long enterpriseUnitsUsed;

  public static final String SERIALIZED_NAME_ENTERPRISE_UNITS_PROJECTED = "enterpriseUnitsProjected";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_UNITS_PROJECTED)
  private Long enterpriseUnitsProjected;

  public static final String SERIALIZED_NAME_VAGENT_ID = "vagentId";
  @SerializedName(SERIALIZED_NAME_VAGENT_ID)
  private String vagentId;

  public EnterpriseAgentUnitsInner() {
  }

  public EnterpriseAgentUnitsInner aid(Object aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * Unique identifier of the account group owning the enterprise agent units.
   * @return aid
  **/
  @javax.annotation.Nullable
  public Object getAid() {
    return aid;
  }


  public void setAid(Object aid) {
    this.aid = aid;
  }


  public EnterpriseAgentUnitsInner accountGroupName(Object accountGroupName) {
    
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * Name of the account group which owns the enterprise agent units.
   * @return accountGroupName
  **/
  @javax.annotation.Nullable
  public Object getAccountGroupName() {
    return accountGroupName;
  }


  public void setAccountGroupName(Object accountGroupName) {
    this.accountGroupName = accountGroupName;
  }


  public EnterpriseAgentUnitsInner agentId(String agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * Unique identifier of the enterprise agent generating usage.
   * @return agentId
  **/
  @javax.annotation.Nullable
  public String getAgentId() {
    return agentId;
  }


  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  public EnterpriseAgentUnitsInner agentName(String agentName) {
    
    this.agentName = agentName;
    return this;
  }

   /**
   * Name of the enterprise agent generating usage.
   * @return agentName
  **/
  @javax.annotation.Nullable
  public String getAgentName() {
    return agentName;
  }


  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public EnterpriseAgentUnitsInner enterpriseUnitsUsed(Long enterpriseUnitsUsed) {
    
    this.enterpriseUnitsUsed = enterpriseUnitsUsed;
    return this;
  }

   /**
   * Number of enterprise agent units owned by the specific account group in the usage period.
   * @return enterpriseUnitsUsed
  **/
  @javax.annotation.Nullable
  public Long getEnterpriseUnitsUsed() {
    return enterpriseUnitsUsed;
  }


  public void setEnterpriseUnitsUsed(Long enterpriseUnitsUsed) {
    this.enterpriseUnitsUsed = enterpriseUnitsUsed;
  }


  public EnterpriseAgentUnitsInner enterpriseUnitsProjected(Long enterpriseUnitsProjected) {
    
    this.enterpriseUnitsProjected = enterpriseUnitsProjected;
    return this;
  }

   /**
   * Number of enterprise units projected in the current usage period, based on units consumed to date and configuration of enabled tests. This value is updated hourly. Returns non-zero value only for organizations with metered billing.
   * @return enterpriseUnitsProjected
  **/
  @javax.annotation.Nullable
  public Long getEnterpriseUnitsProjected() {
    return enterpriseUnitsProjected;
  }


  public void setEnterpriseUnitsProjected(Long enterpriseUnitsProjected) {
    this.enterpriseUnitsProjected = enterpriseUnitsProjected;
  }


  public EnterpriseAgentUnitsInner vagentId(String vagentId) {
    
    this.vagentId = vagentId;
    return this;
  }

   /**
   * Unique identifier of the virtual agent generating usage
   * @return vagentId
  **/
  @javax.annotation.Nullable
  public String getVagentId() {
    return vagentId;
  }


  public void setVagentId(String vagentId) {
    this.vagentId = vagentId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseAgentUnitsInner enterpriseAgentUnitsInner = (EnterpriseAgentUnitsInner) o;
    return Objects.equals(this.aid, enterpriseAgentUnitsInner.aid) &&
        Objects.equals(this.accountGroupName, enterpriseAgentUnitsInner.accountGroupName) &&
        Objects.equals(this.agentId, enterpriseAgentUnitsInner.agentId) &&
        Objects.equals(this.agentName, enterpriseAgentUnitsInner.agentName) &&
        Objects.equals(this.enterpriseUnitsUsed, enterpriseAgentUnitsInner.enterpriseUnitsUsed) &&
        Objects.equals(this.enterpriseUnitsProjected, enterpriseAgentUnitsInner.enterpriseUnitsProjected) &&
        Objects.equals(this.vagentId, enterpriseAgentUnitsInner.vagentId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName, agentId, agentName, enterpriseUnitsUsed, enterpriseUnitsProjected, vagentId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseAgentUnitsInner {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    enterpriseUnitsUsed: ").append(toIndentedString(enterpriseUnitsUsed)).append("\n");
    sb.append("    enterpriseUnitsProjected: ").append(toIndentedString(enterpriseUnitsProjected)).append("\n");
    sb.append("    vagentId: ").append(toIndentedString(vagentId)).append("\n");
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
    openapiFields.add("aid");
    openapiFields.add("accountGroupName");
    openapiFields.add("agentId");
    openapiFields.add("agentName");
    openapiFields.add("enterpriseUnitsUsed");
    openapiFields.add("enterpriseUnitsProjected");
    openapiFields.add("vagentId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EnterpriseAgentUnitsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnterpriseAgentUnitsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnterpriseAgentUnitsInner is not found in the empty JSON string", EnterpriseAgentUnitsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnterpriseAgentUnitsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnterpriseAgentUnitsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("agentId") != null && !jsonObj.get("agentId").isJsonNull()) && !jsonObj.get("agentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentId").toString()));
      }
      if ((jsonObj.get("agentName") != null && !jsonObj.get("agentName").isJsonNull()) && !jsonObj.get("agentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentName").toString()));
      }
      if ((jsonObj.get("vagentId") != null && !jsonObj.get("vagentId").isJsonNull()) && !jsonObj.get("vagentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vagentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vagentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseAgentUnitsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseAgentUnitsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseAgentUnitsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseAgentUnitsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseAgentUnitsInner>() {
           @Override
           public void write(JsonWriter out, EnterpriseAgentUnitsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseAgentUnitsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseAgentUnitsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseAgentUnitsInner
  * @throws IOException if the JSON string is invalid with respect to EnterpriseAgentUnitsInner
  */
  public static EnterpriseAgentUnitsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseAgentUnitsInner.class);
  }

 /**
  * Convert an instance of EnterpriseAgentUnitsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
