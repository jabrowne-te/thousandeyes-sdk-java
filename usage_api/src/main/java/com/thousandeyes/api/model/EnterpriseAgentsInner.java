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
 * EnterpriseAgentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:30.044048Z[Europe/London]")
public class EnterpriseAgentsInner {
  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private Object aid = null;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUP_NAME = "accountGroupName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUP_NAME)
  private Object accountGroupName = null;

  public static final String SERIALIZED_NAME_ENTERPRISE_AGENTS_USED = "enterpriseAgentsUsed";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_AGENTS_USED)
  private Long enterpriseAgentsUsed;

  public EnterpriseAgentsInner() {
  }

  public EnterpriseAgentsInner aid(Object aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * A unique identifier that specifies the account group that owns the enterprise agents.
   * @return aid
  **/
  @javax.annotation.Nullable
  public Object getAid() {
    return aid;
  }


  public void setAid(Object aid) {
    this.aid = aid;
  }


  public EnterpriseAgentsInner accountGroupName(Object accountGroupName) {
    
    this.accountGroupName = accountGroupName;
    return this;
  }

   /**
   * Name of the account group which owns the enterprise agents.
   * @return accountGroupName
  **/
  @javax.annotation.Nullable
  public Object getAccountGroupName() {
    return accountGroupName;
  }


  public void setAccountGroupName(Object accountGroupName) {
    this.accountGroupName = accountGroupName;
  }


  public EnterpriseAgentsInner enterpriseAgentsUsed(Long enterpriseAgentsUsed) {
    
    this.enterpriseAgentsUsed = enterpriseAgentsUsed;
    return this;
  }

   /**
   * Number of enterprise agents owned by the specific account group in the usage period.
   * @return enterpriseAgentsUsed
  **/
  @javax.annotation.Nullable
  public Long getEnterpriseAgentsUsed() {
    return enterpriseAgentsUsed;
  }


  public void setEnterpriseAgentsUsed(Long enterpriseAgentsUsed) {
    this.enterpriseAgentsUsed = enterpriseAgentsUsed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseAgentsInner enterpriseAgentsInner = (EnterpriseAgentsInner) o;
    return Objects.equals(this.aid, enterpriseAgentsInner.aid) &&
        Objects.equals(this.accountGroupName, enterpriseAgentsInner.accountGroupName) &&
        Objects.equals(this.enterpriseAgentsUsed, enterpriseAgentsInner.enterpriseAgentsUsed);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aid, accountGroupName, enterpriseAgentsUsed);
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
    sb.append("class EnterpriseAgentsInner {\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    accountGroupName: ").append(toIndentedString(accountGroupName)).append("\n");
    sb.append("    enterpriseAgentsUsed: ").append(toIndentedString(enterpriseAgentsUsed)).append("\n");
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
    openapiFields.add("enterpriseAgentsUsed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EnterpriseAgentsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EnterpriseAgentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnterpriseAgentsInner is not found in the empty JSON string", EnterpriseAgentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EnterpriseAgentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnterpriseAgentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseAgentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseAgentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseAgentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseAgentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseAgentsInner>() {
           @Override
           public void write(JsonWriter out, EnterpriseAgentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseAgentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseAgentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseAgentsInner
  * @throws IOException if the JSON string is invalid with respect to EnterpriseAgentsInner
  */
  public static EnterpriseAgentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseAgentsInner.class);
  }

 /**
  * Convert an instance of EnterpriseAgentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
