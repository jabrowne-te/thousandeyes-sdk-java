/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.endpoint.agents.model.SelfLinks;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConnectionString
 */
@JsonPropertyOrder({
  ConnectionString.JSON_PROPERTY_CONNECTION_STRING,
  ConnectionString.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ConnectionString {
  public static final String JSON_PROPERTY_CONNECTION_STRING = "connectionString";
  private String connectionString;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public ConnectionString() { 
  }

  public ConnectionString connectionString(String connectionString) {
    this.connectionString = connectionString;
    return this;
  }

   /**
   * The connection string is used for some integrations and other client types. 
   * @return connectionString
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTION_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionString() {
    return connectionString;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionString(String connectionString) {
    this.connectionString = connectionString;
  }


  public ConnectionString links(SelfLinks links) {
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
   * Return true if this ConnectionString object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionString connectionString = (ConnectionString) o;
    return Objects.equals(this.connectionString, connectionString.connectionString) &&
        Objects.equals(this.links, connectionString.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionString, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionString {\n");
    sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
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
