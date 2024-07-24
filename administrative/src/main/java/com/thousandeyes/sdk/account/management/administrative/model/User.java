/*
 * Administrative API
 * Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * The version of the OpenAPI document: 7.0.10
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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * User
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_NAME,
  User.JSON_PROPERTY_EMAIL,
  User.JSON_PROPERTY_UID,
  User.JSON_PROPERTY_DATE_REGISTERED,
  User.JSON_PROPERTY_LOGIN_ACCOUNT_GROUP
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class User {
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

  public User() { 
  }

  public User name(String name) {
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


  public User email(String email) {
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


  public User uid(String uid) {
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


  public User dateRegistered(OffsetDateTime dateRegistered) {
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


  public User loginAccountGroup(AccountGroup loginAccountGroup) {
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


  /**
   * Return true if this User object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.name, user.name) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.uid, user.uid) &&
        Objects.equals(this.dateRegistered, user.dateRegistered) &&
        Objects.equals(this.loginAccountGroup, user.loginAccountGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, uid, dateRegistered, loginAccountGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    dateRegistered: ").append(toIndentedString(dateRegistered)).append("\n");
    sb.append("    loginAccountGroup: ").append(toIndentedString(loginAccountGroup)).append("\n");
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

