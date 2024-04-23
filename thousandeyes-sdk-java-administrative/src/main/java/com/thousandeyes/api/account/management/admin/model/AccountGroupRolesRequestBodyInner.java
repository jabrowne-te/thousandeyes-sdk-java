/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.account.management.admin.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AccountGroupRolesRequestBodyInner
 */
@JsonPropertyOrder({
  AccountGroupRolesRequestBodyInner.JSON_PROPERTY_ACCOUNT_GROUP_ID,
  AccountGroupRolesRequestBodyInner.JSON_PROPERTY_ROLE_IDS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.219923+01:00[Europe/London]")
public class AccountGroupRolesRequestBodyInner {
  public static final String JSON_PROPERTY_ACCOUNT_GROUP_ID = "accountGroupId";
  private String accountGroupId;

  public static final String JSON_PROPERTY_ROLE_IDS = "roleIds";
  private List<String> roleIds;

  public AccountGroupRolesRequestBodyInner() { 
  }

  public AccountGroupRolesRequestBodyInner accountGroupId(String accountGroupId) {
    this.accountGroupId = accountGroupId;
    return this;
  }

   /**
   * Unique ID of the account group.
   * @return accountGroupId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountGroupId() {
    return accountGroupId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroupId(String accountGroupId) {
    this.accountGroupId = accountGroupId;
  }


  public AccountGroupRolesRequestBodyInner roleIds(List<String> roleIds) {
    this.roleIds = roleIds;
    return this;
  }

  public AccountGroupRolesRequestBodyInner addRoleIdsItem(String roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * Unique role IDs.
   * @return roleIds
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRoleIds() {
    return roleIds;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
  }


  /**
   * Return true if this AccountGroupRolesRequestBody_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGroupRolesRequestBodyInner accountGroupRolesRequestBodyInner = (AccountGroupRolesRequestBodyInner) o;
    return Objects.equals(this.accountGroupId, accountGroupRolesRequestBodyInner.accountGroupId) &&
        Objects.equals(this.roleIds, accountGroupRolesRequestBodyInner.roleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroupId, roleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGroupRolesRequestBodyInner {\n");
    sb.append("    accountGroupId: ").append(toIndentedString(accountGroupId)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
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

