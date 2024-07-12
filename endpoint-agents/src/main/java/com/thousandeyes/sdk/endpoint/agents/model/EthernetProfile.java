/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.9
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Information about the ethernet connectivity of this device. Only present if the hardware type is &#x60;ethernet&#x60;. 
 */
@JsonPropertyOrder({
  EthernetProfile.JSON_PROPERTY_LINK_SPEED
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EthernetProfile {
  public static final String JSON_PROPERTY_LINK_SPEED = "linkSpeed";
  private Integer linkSpeed;

  public EthernetProfile() { 
  }

  public EthernetProfile linkSpeed(Integer linkSpeed) {
    this.linkSpeed = linkSpeed;
    return this;
  }

   /**
   * Link speed in Mbps.
   * @return linkSpeed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINK_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLinkSpeed() {
    return linkSpeed;
  }


  @JsonProperty(JSON_PROPERTY_LINK_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkSpeed(Integer linkSpeed) {
    this.linkSpeed = linkSpeed;
  }


  /**
   * Return true if this EthernetProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EthernetProfile ethernetProfile = (EthernetProfile) o;
    return Objects.equals(this.linkSpeed, ethernetProfile.linkSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkSpeed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthernetProfile {\n");
    sb.append("    linkSpeed: ").append(toIndentedString(linkSpeed)).append("\n");
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

