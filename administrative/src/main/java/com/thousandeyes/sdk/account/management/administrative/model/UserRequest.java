/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.account.management.administrative.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.account.management.administrative.model.UserAccountGroupRole;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UserRequest
 */
@JsonPropertyOrder({
  UserRequest.JSON_PROPERTY_NAME,
  UserRequest.JSON_PROPERTY_EMAIL,
  UserRequest.JSON_PROPERTY_LOGIN_ACCOUNT_GROUP_ID,
  UserRequest.JSON_PROPERTY_ACCOUNT_GROUP_ROLES,
  UserRequest.JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLE_IDS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class UserRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_LOGIN_ACCOUNT_GROUP_ID = "loginAccountGroupId";
  private String loginAccountGroupId;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_ROLES = "accountGroupRoles";
  private List<UserAccountGroupRole> accountGroupRoles = new ArrayList<>();

  public static final String JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLE_IDS = "allAccountGroupRoleIds";
  private List<String> allAccountGroupRoleIds = new ArrayList<>();

  public UserRequest() { 
  }

  public UserRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User&#39;s display name.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UserRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * User&#39;s email address.
   * @return email
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public UserRequest loginAccountGroupId(String loginAccountGroupId) {
    this.loginAccountGroupId = loginAccountGroupId;
    return this;
  }

   /**
   * Unique ID of the login account group.
   * @return loginAccountGroupId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGIN_ACCOUNT_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLoginAccountGroupId() {
    return loginAccountGroupId;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN_ACCOUNT_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoginAccountGroupId(String loginAccountGroupId) {
    this.loginAccountGroupId = loginAccountGroupId;
  }


  public UserRequest accountGroupRoles(List<UserAccountGroupRole> accountGroupRoles) {
    this.accountGroupRoles = accountGroupRoles;
    return this;
  }

  public UserRequest addAccountGroupRolesItem(UserAccountGroupRole accountGroupRolesItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UserAccountGroupRole> getAccountGroupRoles() {
    return accountGroupRoles;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroupRoles(List<UserAccountGroupRole> accountGroupRoles) {
    this.accountGroupRoles = accountGroupRoles;
  }


  public UserRequest allAccountGroupRoleIds(List<String> allAccountGroupRoleIds) {
    this.allAccountGroupRoleIds = allAccountGroupRoleIds;
    return this;
  }

  public UserRequest addAllAccountGroupRoleIdsItem(String allAccountGroupRoleIdsItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAllAccountGroupRoleIds() {
    return allAccountGroupRoleIds;
  }


  @JsonProperty(JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllAccountGroupRoleIds(List<String> allAccountGroupRoleIds) {
    this.allAccountGroupRoleIds = allAccountGroupRoleIds;
  }


  /**
   * Return true if this UserRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRequest userRequest = (UserRequest) o;
    return Objects.equals(this.name, userRequest.name) &&
        Objects.equals(this.email, userRequest.email) &&
        Objects.equals(this.loginAccountGroupId, userRequest.loginAccountGroupId) &&
        Objects.equals(this.accountGroupRoles, userRequest.accountGroupRoles) &&
        Objects.equals(this.allAccountGroupRoleIds, userRequest.allAccountGroupRoleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, loginAccountGroupId, accountGroupRoles, allAccountGroupRoleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRequest {\n");
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
}
