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
import com.thousandeyes.api.tests.results.model.Monitor;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BgpTestResult
 */
@JsonPropertyOrder({
  BgpTestResult.JSON_PROPERTY_DATE,
  BgpTestResult.JSON_PROPERTY_ROUND_ID,
  BgpTestResult.JSON_PROPERTY_LINKS,
  BgpTestResult.JSON_PROPERTY_MONITOR,
  BgpTestResult.JSON_PROPERTY_PREFIX_ID,
  BgpTestResult.JSON_PROPERTY_PREFIX,
  BgpTestResult.JSON_PROPERTY_START_TIME,
  BgpTestResult.JSON_PROPERTY_END_TIME,
  BgpTestResult.JSON_PROPERTY_UPDATES,
  BgpTestResult.JSON_PROPERTY_PATH_CHANGES,
  BgpTestResult.JSON_PROPERTY_REACHABILITY
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.392286+01:00[Europe/London]")
public class BgpTestResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private Object links;

  public static final String JSON_PROPERTY_MONITOR = "monitor";
  private Monitor monitor;

  public static final String JSON_PROPERTY_PREFIX_ID = "prefixId";
  private String prefixId;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private Integer startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private Integer endTime;

  public static final String JSON_PROPERTY_UPDATES = "updates";
  private Double updates;

  public static final String JSON_PROPERTY_PATH_CHANGES = "pathChanges";
  private Double pathChanges;

  public static final String JSON_PROPERTY_REACHABILITY = "reachability";
  private Double reachability;

  public BgpTestResult() { 
  }

  @JsonCreator
  public BgpTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_START_TIME) Integer startTime, 
    @JsonProperty(JSON_PROPERTY_END_TIME) Integer endTime
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.startTime = startTime;
    this.endTime = endTime;
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




  public BgpTestResult links(Object links) {
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


  public BgpTestResult monitor(Monitor monitor) {
    this.monitor = monitor;
    return this;
  }

   /**
   * Get monitor
   * @return monitor
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Monitor getMonitor() {
    return monitor;
  }


  @JsonProperty(JSON_PROPERTY_MONITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
  }


  public BgpTestResult prefixId(String prefixId) {
    this.prefixId = prefixId;
    return this;
  }

   /**
   * Internally tracked prefix ID.
   * @return prefixId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefixId() {
    return prefixId;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefixId(String prefixId) {
    this.prefixId = prefixId;
  }


  public BgpTestResult prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Prefix being tracked.
   * @return prefix
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefix(String prefix) {
    this.prefix = prefix;
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




  public BgpTestResult updates(Double updates) {
    this.updates = updates;
    return this;
  }

   /**
   * Number of updates tracked against this prefix by this monitor.
   * @return updates
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getUpdates() {
    return updates;
  }


  @JsonProperty(JSON_PROPERTY_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdates(Double updates) {
    this.updates = updates;
  }


  public BgpTestResult pathChanges(Double pathChanges) {
    this.pathChanges = pathChanges;
    return this;
  }

   /**
   * Number of path changes tracked against this prefix by this monitor.
   * @return pathChanges
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PATH_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPathChanges() {
    return pathChanges;
  }


  @JsonProperty(JSON_PROPERTY_PATH_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathChanges(Double pathChanges) {
    this.pathChanges = pathChanges;
  }


  public BgpTestResult reachability(Double reachability) {
    this.reachability = reachability;
    return this;
  }

   /**
   * Percentage reachability
   * @return reachability
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REACHABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getReachability() {
    return reachability;
  }


  @JsonProperty(JSON_PROPERTY_REACHABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachability(Double reachability) {
    this.reachability = reachability;
  }


  /**
   * Return true if this BgpTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BgpTestResult bgpTestResult = (BgpTestResult) o;
    return Objects.equals(this.date, bgpTestResult.date) &&
        Objects.equals(this.roundId, bgpTestResult.roundId) &&
        Objects.equals(this.links, bgpTestResult.links) &&
        Objects.equals(this.monitor, bgpTestResult.monitor) &&
        Objects.equals(this.prefixId, bgpTestResult.prefixId) &&
        Objects.equals(this.prefix, bgpTestResult.prefix) &&
        Objects.equals(this.startTime, bgpTestResult.startTime) &&
        Objects.equals(this.endTime, bgpTestResult.endTime) &&
        Objects.equals(this.updates, bgpTestResult.updates) &&
        Objects.equals(this.pathChanges, bgpTestResult.pathChanges) &&
        Objects.equals(this.reachability, bgpTestResult.reachability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, monitor, prefixId, prefix, startTime, endTime, updates, pathChanges, reachability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BgpTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    prefixId: ").append(toIndentedString(prefixId)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
    sb.append("    pathChanges: ").append(toIndentedString(pathChanges)).append("\n");
    sb.append("    reachability: ").append(toIndentedString(reachability)).append("\n");
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

