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


package com.thousandeyes.sdk.account.management.admin.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Role
 */
@JsonPropertyOrder({
  Role.JSON_PROPERTY_NAME,
  Role.JSON_PROPERTY_ROLE_ID,
  Role.JSON_PROPERTY_IS_BUILTIN,
  Role.JSON_PROPERTY_HAS_MANAGEMENT_PERMISSIONS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class Role {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ROLE_ID = "roleId";
  private String roleId;

  public static final String JSON_PROPERTY_IS_BUILTIN = "isBuiltin";
  private Boolean isBuiltin;

  public static final String JSON_PROPERTY_HAS_MANAGEMENT_PERMISSIONS = "hasManagementPermissions";
  private Boolean hasManagementPermissions;

  public Role() { 
  }

  public Role name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the role.
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


  public Role roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * Unique ID representing the role.
   * @return roleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoleId() {
    return roleId;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public Role isBuiltin(Boolean isBuiltin) {
    this.isBuiltin = isBuiltin;
    return this;
  }

   /**
   * Flag indicating if the role is built-in (Account Admin, Organization Admin, Regular User).
   * @return isBuiltin
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BUILTIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBuiltin() {
    return isBuiltin;
  }


  @JsonProperty(JSON_PROPERTY_IS_BUILTIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsBuiltin(Boolean isBuiltin) {
    this.isBuiltin = isBuiltin;
  }


  public Role hasManagementPermissions(Boolean hasManagementPermissions) {
    this.hasManagementPermissions = hasManagementPermissions;
    return this;
  }

   /**
   * Flag indicating whether the user has management permissions.
   * @return hasManagementPermissions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_MANAGEMENT_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasManagementPermissions() {
    return hasManagementPermissions;
  }


  @JsonProperty(JSON_PROPERTY_HAS_MANAGEMENT_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasManagementPermissions(Boolean hasManagementPermissions) {
    this.hasManagementPermissions = hasManagementPermissions;
  }


  /**
   * Return true if this Role object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.name, role.name) &&
        Objects.equals(this.roleId, role.roleId) &&
        Objects.equals(this.isBuiltin, role.isBuiltin) &&
        Objects.equals(this.hasManagementPermissions, role.hasManagementPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, roleId, isBuiltin, hasManagementPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    isBuiltin: ").append(toIndentedString(isBuiltin)).append("\n");
    sb.append("    hasManagementPermissions: ").append(toIndentedString(hasManagementPermissions)).append("\n");
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
