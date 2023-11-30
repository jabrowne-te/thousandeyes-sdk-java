/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API.  This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.
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
import com.thousandeyes.api.model.AccountGroupRolesRequestBodyInner;
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
 * UserRequestBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:07.206171Z[Europe/London]")
public class UserRequestBody {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_LOGIN_ACCOUNT_GROUP_ID = "loginAccountGroupId";
  @SerializedName(SERIALIZED_NAME_LOGIN_ACCOUNT_GROUP_ID)
  private String loginAccountGroupId;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUP_ROLES = "accountGroupRoles";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUP_ROLES)
  private List<AccountGroupRolesRequestBodyInner> accountGroupRoles;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT_GROUP_ROLE_IDS = "allAccountGroupRoleIds";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT_GROUP_ROLE_IDS)
  private List<String> allAccountGroupRoleIds;

  public UserRequestBody() {
  }

  public UserRequestBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * User&#39;s display name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserRequestBody email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * User&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserRequestBody loginAccountGroupId(String loginAccountGroupId) {
    
    this.loginAccountGroupId = loginAccountGroupId;
    return this;
  }

   /**
   * Unique ID of the login account group.
   * @return loginAccountGroupId
  **/
  @javax.annotation.Nullable
  public String getLoginAccountGroupId() {
    return loginAccountGroupId;
  }


  public void setLoginAccountGroupId(String loginAccountGroupId) {
    this.loginAccountGroupId = loginAccountGroupId;
  }


  public UserRequestBody accountGroupRoles(List<AccountGroupRolesRequestBodyInner> accountGroupRoles) {
    
    this.accountGroupRoles = accountGroupRoles;
    return this;
  }

  public UserRequestBody addAccountGroupRolesItem(AccountGroupRolesRequestBodyInner accountGroupRolesItem) {
    if (this.accountGroupRoles == null) {
      this.accountGroupRoles = new ArrayList<>();
    }
    this.accountGroupRoles.add(accountGroupRolesItem);
    return this;
  }

   /**
   * Get accountGroupRoles
   * @return accountGroupRoles
  **/
  @javax.annotation.Nullable
  public List<AccountGroupRolesRequestBodyInner> getAccountGroupRoles() {
    return accountGroupRoles;
  }


  public void setAccountGroupRoles(List<AccountGroupRolesRequestBodyInner> accountGroupRoles) {
    this.accountGroupRoles = accountGroupRoles;
  }


  public UserRequestBody allAccountGroupRoleIds(List<String> allAccountGroupRoleIds) {
    
    this.allAccountGroupRoleIds = allAccountGroupRoleIds;
    return this;
  }

  public UserRequestBody addAllAccountGroupRoleIdsItem(String allAccountGroupRoleIdsItem) {
    if (this.allAccountGroupRoleIds == null) {
      this.allAccountGroupRoleIds = new ArrayList<>();
    }
    this.allAccountGroupRoleIds.add(allAccountGroupRoleIdsItem);
    return this;
  }

   /**
   * Unique IDs representing the roles.
   * @return allAccountGroupRoleIds
  **/
  @javax.annotation.Nullable
  public List<String> getAllAccountGroupRoleIds() {
    return allAccountGroupRoleIds;
  }


  public void setAllAccountGroupRoleIds(List<String> allAccountGroupRoleIds) {
    this.allAccountGroupRoleIds = allAccountGroupRoleIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRequestBody userRequestBody = (UserRequestBody) o;
    return Objects.equals(this.name, userRequestBody.name) &&
        Objects.equals(this.email, userRequestBody.email) &&
        Objects.equals(this.loginAccountGroupId, userRequestBody.loginAccountGroupId) &&
        Objects.equals(this.accountGroupRoles, userRequestBody.accountGroupRoles) &&
        Objects.equals(this.allAccountGroupRoleIds, userRequestBody.allAccountGroupRoleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, loginAccountGroupId, accountGroupRoles, allAccountGroupRoleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRequestBody {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    loginAccountGroupId: ").append(toIndentedString(loginAccountGroupId)).append("\n");
    sb.append("    accountGroupRoles: ").append(toIndentedString(accountGroupRoles)).append("\n");
    sb.append("    allAccountGroupRoleIds: ").append(toIndentedString(allAccountGroupRoleIds)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("loginAccountGroupId");
    openapiFields.add("accountGroupRoles");
    openapiFields.add("allAccountGroupRoleIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UserRequestBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UserRequestBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserRequestBody is not found in the empty JSON string", UserRequestBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UserRequestBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserRequestBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("loginAccountGroupId") != null && !jsonObj.get("loginAccountGroupId").isJsonNull()) && !jsonObj.get("loginAccountGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loginAccountGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loginAccountGroupId").toString()));
      }
      if (jsonObj.get("accountGroupRoles") != null && !jsonObj.get("accountGroupRoles").isJsonNull()) {
        JsonArray jsonArrayaccountGroupRoles = jsonObj.getAsJsonArray("accountGroupRoles");
        if (jsonArrayaccountGroupRoles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("accountGroupRoles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `accountGroupRoles` to be an array in the JSON string but got `%s`", jsonObj.get("accountGroupRoles").toString()));
          }

          // validate the optional field `accountGroupRoles` (array)
          for (int i = 0; i < jsonArrayaccountGroupRoles.size(); i++) {
            AccountGroupRolesRequestBodyInner.validateJsonElement(jsonArrayaccountGroupRoles.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("allAccountGroupRoleIds") != null && !jsonObj.get("allAccountGroupRoleIds").isJsonNull() && !jsonObj.get("allAccountGroupRoleIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allAccountGroupRoleIds` to be an array in the JSON string but got `%s`", jsonObj.get("allAccountGroupRoleIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserRequestBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserRequestBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserRequestBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserRequestBody.class));

       return (TypeAdapter<T>) new TypeAdapter<UserRequestBody>() {
           @Override
           public void write(JsonWriter out, UserRequestBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserRequestBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserRequestBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserRequestBody
  * @throws IOException if the JSON string is invalid with respect to UserRequestBody
  */
  public static UserRequestBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserRequestBody.class);
  }

 /**
  * Convert an instance of UserRequestBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
