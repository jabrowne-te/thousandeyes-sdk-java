/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.tests.results.model.Agent;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DnssecTestResult
 */
@JsonPropertyOrder({
  DnssecTestResult.JSON_PROPERTY_DATE,
  DnssecTestResult.JSON_PROPERTY_ROUND_ID,
  DnssecTestResult.JSON_PROPERTY_LINKS,
  DnssecTestResult.JSON_PROPERTY_START_TIME,
  DnssecTestResult.JSON_PROPERTY_END_TIME,
  DnssecTestResult.JSON_PROPERTY_AGENT,
  DnssecTestResult.JSON_PROPERTY_IS_VALID,
  DnssecTestResult.JSON_PROPERTY_ERROR_DETAILS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.392286+01:00[Europe/London]")
public class DnssecTestResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private Object links;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private Integer startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private Integer endTime;

  public static final String JSON_PROPERTY_AGENT = "agent";
  private Agent agent;

  public static final String JSON_PROPERTY_IS_VALID = "isValid";
  private Boolean isValid;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "errorDetails";
  private String errorDetails;

  public DnssecTestResult() { 
  }

  @JsonCreator
  public DnssecTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_START_TIME) Integer startTime, 
    @JsonProperty(JSON_PROPERTY_END_TIME) Integer endTime, 
    @JsonProperty(JSON_PROPERTY_IS_VALID) Boolean isValid, 
    @JsonProperty(JSON_PROPERTY_ERROR_DETAILS) String errorDetails
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.isValid = isValid;
    this.errorDetails = errorDetails;
  }

   /**
   * Data point date UTC (ISO date-time format).
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




  public DnssecTestResult links(Object links) {
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

  public Object getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(Object links) {
    this.links = links;
  }


   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartTime() {
    return startTime;
  }




   /**
   * Epoch time (seconds) indicating the end time of the round
   * @return endTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndTime() {
    return endTime;
  }




  public DnssecTestResult agent(Agent agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Agent getAgent() {
    return agent;
  }


  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgent(Agent agent) {
    this.agent = agent;
  }


   /**
   * Indicates if keychain is valid (if false see errorDetails field)
   * @return isValid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsValid() {
    return isValid;
  }




   /**
   * Error details, if an error were encountered
   * @return errorDetails
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDetails() {
    return errorDetails;
  }




  /**
   * Return true if this DnssecTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnssecTestResult dnssecTestResult = (DnssecTestResult) o;
    return Objects.equals(this.date, dnssecTestResult.date) &&
        Objects.equals(this.roundId, dnssecTestResult.roundId) &&
        Objects.equals(this.links, dnssecTestResult.links) &&
        Objects.equals(this.startTime, dnssecTestResult.startTime) &&
        Objects.equals(this.endTime, dnssecTestResult.endTime) &&
        Objects.equals(this.agent, dnssecTestResult.agent) &&
        Objects.equals(this.isValid, dnssecTestResult.isValid) &&
        Objects.equals(this.errorDetails, dnssecTestResult.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, startTime, endTime, agent, isValid, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnssecTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

