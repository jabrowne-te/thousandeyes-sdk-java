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
import com.thousandeyes.api.endpoint.agents.model.EndpointAgentBulkTransfer207ResponseItemsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointAgentBulkTransfer207Response
 */
@JsonPropertyOrder({
  EndpointAgentBulkTransfer207Response.JSON_PROPERTY_ITEMS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.210211+01:00[Europe/London]")
public class EndpointAgentBulkTransfer207Response {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<EndpointAgentBulkTransfer207ResponseItemsInner> items;

  public EndpointAgentBulkTransfer207Response() { 
  }

  public EndpointAgentBulkTransfer207Response items(List<EndpointAgentBulkTransfer207ResponseItemsInner> items) {
    this.items = items;
    return this;
  }

  public EndpointAgentBulkTransfer207Response addItemsItem(EndpointAgentBulkTransfer207ResponseItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndpointAgentBulkTransfer207ResponseItemsInner> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<EndpointAgentBulkTransfer207ResponseItemsInner> items) {
    this.items = items;
  }


  /**
   * Return true if this endpoint_agent_bulk_transfer_207_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentBulkTransfer207Response endpointAgentBulkTransfer207Response = (EndpointAgentBulkTransfer207Response) o;
    return Objects.equals(this.items, endpointAgentBulkTransfer207Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentBulkTransfer207Response {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

