/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.
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
import com.thousandeyes.api.endpoint.agents.model.PaginationNextLinkLinks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EndpointAgentsSearch200Response
 */
@JsonPropertyOrder({
  EndpointAgentsSearch200Response.JSON_PROPERTY_TOTAL_AGENTS,
  EndpointAgentsSearch200Response.JSON_PROPERTY_AGENTS,
  EndpointAgentsSearch200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:01.770114+01:00[Europe/Lisbon]")
public class EndpointAgentsSearch200Response {
  public static final String JSON_PROPERTY_TOTAL_AGENTS = "totalAgents";
  private Integer totalAgents;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<EndpointAgentsAgentsInner> agents;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private PaginationNextLinkLinks links;

  public EndpointAgentsSearch200Response() { 
  }

  public EndpointAgentsSearch200Response totalAgents(Integer totalAgents) {
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


  public EndpointAgentsSearch200Response agents(List<EndpointAgentsAgentsInner> agents) {
    this.agents = agents;
    return this;
  }

  public EndpointAgentsSearch200Response addAgentsItem(EndpointAgentsAgentsInner agentsItem) {
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


  public EndpointAgentsSearch200Response links(PaginationNextLinkLinks links) {
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

  public PaginationNextLinkLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(PaginationNextLinkLinks links) {
    this.links = links;
  }


  /**
   * Return true if this endpoint_agents_search_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointAgentsSearch200Response endpointAgentsSearch200Response = (EndpointAgentsSearch200Response) o;
    return Objects.equals(this.totalAgents, endpointAgentsSearch200Response.totalAgents) &&
        Objects.equals(this.agents, endpointAgentsSearch200Response.agents) &&
        Objects.equals(this.links, endpointAgentsSearch200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAgents, agents, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointAgentsSearch200Response {\n");
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

