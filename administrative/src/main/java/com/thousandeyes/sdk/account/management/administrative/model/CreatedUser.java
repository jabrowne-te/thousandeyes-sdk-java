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
import com.thousandeyes.sdk.account.management.administrative.model.AccountGroup;
import com.thousandeyes.sdk.account.management.administrative.model.AccountGroupRole;
import com.thousandeyes.sdk.account.management.administrative.model.Role;
import com.thousandeyes.sdk.account.management.administrative.model.SelfLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreatedUser
 */
@JsonPropertyOrder({
  CreatedUser.JSON_PROPERTY_NAME,
  CreatedUser.JSON_PROPERTY_EMAIL,
  CreatedUser.JSON_PROPERTY_UID,
  CreatedUser.JSON_PROPERTY_DATE_REGISTERED,
  CreatedUser.JSON_PROPERTY_LOGIN_ACCOUNT_GROUP,
  CreatedUser.JSON_PROPERTY_ACCOUNT_GROUP_ROLES,
  CreatedUser.JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLES,
  CreatedUser.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class CreatedUser {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_UID = "uid";
  private String uid;

  public static final String JSON_PROPERTY_DATE_REGISTERED = "dateRegistered";
  private OffsetDateTime dateRegistered;

  public static final String JSON_PROPERTY_LOGIN_ACCOUNT_GROUP = "loginAccountGroup";
  private AccountGroup loginAccountGroup;

  public static final String JSON_PROPERTY_ACCOUNT_GROUP_ROLES = "accountGroupRoles";
  private List<AccountGroupRole> accountGroupRoles = new ArrayList<>();

  public static final String JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLES = "allAccountGroupRoles";
  private List<Role> allAccountGroupRoles = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public CreatedUser() { 
  }

  public CreatedUser name(String name) {
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


  public CreatedUser email(String email) {
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


  public CreatedUser uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Unique ID of the user.
   * @return uid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUid() {
    return uid;
  }


  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUid(String uid) {
    this.uid = uid;
  }


  public CreatedUser dateRegistered(OffsetDateTime dateRegistered) {
    this.dateRegistered = dateRegistered;
    return this;
  }

   /**
   * UTC date the user registered their account (ISO date-time format).
   * @return dateRegistered
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateRegistered() {
    return dateRegistered;
  }


  @JsonProperty(JSON_PROPERTY_DATE_REGISTERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateRegistered(OffsetDateTime dateRegistered) {
    this.dateRegistered = dateRegistered;
  }


  public CreatedUser loginAccountGroup(AccountGroup loginAccountGroup) {
    this.loginAccountGroup = loginAccountGroup;
    return this;
  }

   /**
   * Get loginAccountGroup
   * @return loginAccountGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGIN_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountGroup getLoginAccountGroup() {
    return loginAccountGroup;
  }


  @JsonProperty(JSON_PROPERTY_LOGIN_ACCOUNT_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoginAccountGroup(AccountGroup loginAccountGroup) {
    this.loginAccountGroup = loginAccountGroup;
  }


  public CreatedUser accountGroupRoles(List<AccountGroupRole> accountGroupRoles) {
    this.accountGroupRoles = accountGroupRoles;
    return this;
  }

  public CreatedUser addAccountGroupRolesItem(AccountGroupRole accountGroupRolesItem) {
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

  public List<AccountGroupRole> getAccountGroupRoles() {
    return accountGroupRoles;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroupRoles(List<AccountGroupRole> accountGroupRoles) {
    this.accountGroupRoles = accountGroupRoles;
  }


  public CreatedUser allAccountGroupRoles(List<Role> allAccountGroupRoles) {
    this.allAccountGroupRoles = allAccountGroupRoles;
    return this;
  }

  public CreatedUser addAllAccountGroupRolesItem(Role allAccountGroupRolesItem) {
    if (this.allAccountGroupRoles == null) {
      this.allAccountGroupRoles = new ArrayList<>();
    }
    this.allAccountGroupRoles.add(allAccountGroupRolesItem);
    return this;
  }

   /**
   * Get allAccountGroupRoles
   * @return allAccountGroupRoles
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Role> getAllAccountGroupRoles() {
    return allAccountGroupRoles;
  }


  @JsonProperty(JSON_PROPERTY_ALL_ACCOUNT_GROUP_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllAccountGroupRoles(List<Role> allAccountGroupRoles) {
    this.allAccountGroupRoles = allAccountGroupRoles;
  }


  public CreatedUser links(SelfLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinks links) {
    this.links = links;
  }


  /**
   * Return true if this CreatedUser object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedUser createdUser = (CreatedUser) o;
    return Objects.equals(this.name, createdUser.name) &&
        Objects.equals(this.email, createdUser.email) &&
        Objects.equals(this.uid, createdUser.uid) &&
        Objects.equals(this.dateRegistered, createdUser.dateRegistered) &&
        Objects.equals(this.loginAccountGroup, createdUser.loginAccountGroup) &&
        Objects.equals(this.accountGroupRoles, createdUser.accountGroupRoles) &&
        Objects.equals(this.allAccountGroupRoles, createdUser.allAccountGroupRoles) &&
        Objects.equals(this.links, createdUser.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, uid, dateRegistered, loginAccountGroup, accountGroupRoles, allAccountGroupRoles, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedUser {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    dateRegistered: ").append(toIndentedString(dateRegistered)).append("\n");
    sb.append("    loginAccountGroup: ").append(toIndentedString(loginAccountGroup)).append("\n");
    sb.append("    accountGroupRoles: ").append(toIndentedString(accountGroupRoles)).append("\n");
    sb.append("    allAccountGroupRoles: ").append(toIndentedString(allAccountGroupRoles)).append("\n");
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
}
