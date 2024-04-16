/*
 * Credentials API
 * ### Overview Manage credentials for transaction tests using the Credentials API.   The following permissions are required to access Credentials API endpoints:  * `Settings Tests Read` for read operations.  * `Settings Tests Update` for write operations.  * `View sensitive data in web transaction scripts` to view the encrypted value property of credentials.  * `Settings Tests Create Transaction (Tx) Tests` to create credentials.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.credentials.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.credentials.model.SelfLinksLinks;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CredentialWithoutValue
 */
@JsonPropertyOrder({
  CredentialWithoutValue.JSON_PROPERTY_LINKS,
  CredentialWithoutValue.JSON_PROPERTY_ID,
  CredentialWithoutValue.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-02-07T22:58:17.545814Z[Europe/Lisbon]")
public class CredentialWithoutValue {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public CredentialWithoutValue() { 
  }

  public CredentialWithoutValue links(SelfLinksLinks links) {
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

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  public CredentialWithoutValue id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the credential.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public CredentialWithoutValue name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the credential.
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


  /**
   * Return true if this CredentialWithoutValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialWithoutValue credentialWithoutValue = (CredentialWithoutValue) o;
    return Objects.equals(this.links, credentialWithoutValue.links) &&
        Objects.equals(this.id, credentialWithoutValue.id) &&
        Objects.equals(this.name, credentialWithoutValue.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialWithoutValue {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
