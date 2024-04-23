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
import com.thousandeyes.api.endpoint.agents.model.EndpointAgentsAgentsInner;
import com.thousandeyes.api.endpoint.agents.model.PaginationNextAndSelfLinkLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointAgentsList200Response
 */
@JsonPropertyOrder({
  EndpointAgentsList200Response.JSON_PROPERTY_TOTAL_AGENTS,
  EndpointAgentsList200Response.JSON_PROPERTY_AGENTS,
  EndpointAgentsList200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.210211+01:00[Europe/London]")
public class EndpointAgentsList200Response {
  public static final String JSON_PROPERTY_TOTAL_AGENTS = "totalAgents";
  private Integer totalAgents;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<EndpointAgentsAgentsInner> agents;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private PaginationNextAndSelfLinkLinks links;

  public EndpointAgentsList200Response() { 
  }

  public EndpointAgentsList200Response totalAgents(Integer totalAgents) {
    this.totalAgents = totalAgents;
    return this;
  }

   /**
   * The total number of agents.
   * @return totalAgents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalAgents() {
    return totalAgents;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAgents(Integer totalAgents) {
    this.totalAgents = totalAgents;
  }


  public EndpointAgentsList200Response agents(List<EndpointAgentsAgentsInner> agents) {
    this.agents = agents;
    return this;
  }

  public EndpointAgentsList200Response addAgentsItem(EndpointAgentsAgentsInner agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EndpointAgentsAgentsInner> getAgents() {
    return agents;
  }


  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgents(List<EndpointAgentsAgentsInner> agents) {
    this.agents = agents;
  }


  public EndpointAgentsList200Response links(PaginationNextAndSelfLinkLinks links) {
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

  public PaginationNextAndSelfLinkLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(PaginationNextAndSelfLinkLinks links) {
    this.links = links;
  }


  /**
   * Return true if this endpoint_agents_list_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentsList200Response endpointAgentsList200Response = (EndpointAgentsList200Response) o;
    return Objects.equals(this.totalAgents, endpointAgentsList200Response.totalAgents) &&
        Objects.equals(this.agents, endpointAgentsList200Response.agents) &&
        Objects.equals(this.links, endpointAgentsList200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAgents, agents, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentsList200Response {\n");
    sb.append("    totalAgents: ").append(toIndentedString(totalAgents)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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

