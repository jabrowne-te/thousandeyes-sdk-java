/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.dashboards.model.ApiDataPointGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Data point of a widget.
 */
@JsonPropertyOrder({
  ApiWidgetDataPoint.JSON_PROPERTY_TIMESTAMP,
  ApiWidgetDataPoint.JSON_PROPERTY_NUMBER_OF_DATA_POINTS,
  ApiWidgetDataPoint.JSON_PROPERTY_VALUE,
  ApiWidgetDataPoint.JSON_PROPERTY_GROUPS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiWidgetDataPoint {
  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_NUMBER_OF_DATA_POINTS = "numberOfDataPoints";
  private Long numberOfDataPoints;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<ApiDataPointGroup> groups = new ArrayList<>();

  public ApiWidgetDataPoint() { 
  }

  public ApiWidgetDataPoint timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp of the aggregated data point.
   * @return timestamp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  public ApiWidgetDataPoint numberOfDataPoints(Long numberOfDataPoints) {
    this.numberOfDataPoints = numberOfDataPoints;
    return this;
  }

   /**
   * Number of test data points aggregated into the widget data point.
   * @return numberOfDataPoints
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_DATA_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNumberOfDataPoints() {
    return numberOfDataPoints;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_DATA_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfDataPoints(Long numberOfDataPoints) {
    this.numberOfDataPoints = numberOfDataPoints;
  }


  public ApiWidgetDataPoint value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Aggregated value.
   * @return value
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Double value) {
    this.value = value;
  }


  public ApiWidgetDataPoint groups(List<ApiDataPointGroup> groups) {
    this.groups = groups;
    return this;
  }

  public ApiWidgetDataPoint addGroupsItem(ApiDataPointGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiDataPointGroup> getGroups() {
    return groups;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroups(List<ApiDataPointGroup> groups) {
    this.groups = groups;
  }


  /**
   * Return true if this ApiWidgetDataPoint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiWidgetDataPoint apiWidgetDataPoint = (ApiWidgetDataPoint) o;
    return Objects.equals(this.timestamp, apiWidgetDataPoint.timestamp) &&
        Objects.equals(this.numberOfDataPoints, apiWidgetDataPoint.numberOfDataPoints) &&
        Objects.equals(this.value, apiWidgetDataPoint.value) &&
        Objects.equals(this.groups, apiWidgetDataPoint.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, numberOfDataPoints, value, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiWidgetDataPoint {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    numberOfDataPoints: ").append(toIndentedString(numberOfDataPoints)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

