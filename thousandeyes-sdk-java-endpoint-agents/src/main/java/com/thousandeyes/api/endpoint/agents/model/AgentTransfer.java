/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AgentTransfer
 */
@JsonPropertyOrder({
  AgentTransfer.JSON_PROPERTY_AGENT_ID,
  AgentTransfer.JSON_PROPERTY_FROM_AID,
  AgentTransfer.JSON_PROPERTY_TO_AID
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.210211+01:00[Europe/London]")
public class AgentTransfer {
  public static final String JSON_PROPERTY_AGENT_ID = "agentId";
  private UUID agentId;

  public static final String JSON_PROPERTY_FROM_AID = "fromAid";
  private String fromAid;

  public static final String JSON_PROPERTY_TO_AID = "toAid";
  private String toAid;

  public AgentTransfer() { 
  }

  @JsonCreator
  public AgentTransfer(
    @JsonProperty(JSON_PROPERTY_AGENT_ID) UUID agentId
  ) {
  this();
    this.agentId = agentId;
  }

   /**
   * Identifier of the agent this applies to.
   * @return agentId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAgentId() {
    return agentId;
  }




  public AgentTransfer fromAid(String fromAid) {
    this.fromAid = fromAid;
    return this;
  }

   /**
   * A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint.
   * @return fromAid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromAid() {
    return fromAid;
  }


  @JsonProperty(JSON_PROPERTY_FROM_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromAid(String fromAid) {
    this.fromAid = fromAid;
  }


  public AgentTransfer toAid(String toAid) {
    this.toAid = toAid;
    return this;
  }

   /**
   * A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint.
   * @return toAid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToAid() {
    return toAid;
  }


  @JsonProperty(JSON_PROPERTY_TO_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToAid(String toAid) {
    this.toAid = toAid;
  }


  /**
   * Return true if this AgentTransfer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentTransfer agentTransfer = (AgentTransfer) o;
    return Objects.equals(this.agentId, agentTransfer.agentId) &&
        Objects.equals(this.fromAid, agentTransfer.fromAid) &&
        Objects.equals(this.toAid, agentTransfer.toAid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, fromAid, toAid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentTransfer {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    fromAid: ").append(toIndentedString(fromAid)).append("\n");
    sb.append("    toAid: ").append(toIndentedString(toAid)).append("\n");
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

