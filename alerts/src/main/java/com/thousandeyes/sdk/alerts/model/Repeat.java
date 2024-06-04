/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.alerts.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.alerts.model.DaysOfWeek;
import com.thousandeyes.sdk.alerts.model.IntervalType;
import com.thousandeyes.sdk.alerts.model.RepeatType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Repeat options.
 */
@JsonPropertyOrder({
  Repeat.JSON_PROPERTY_TYPE,
  Repeat.JSON_PROPERTY_INTERVAL_TYPE,
  Repeat.JSON_PROPERTY_INTERVAL_LENGTH,
  Repeat.JSON_PROPERTY_DAYS_OF_WEEK
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class Repeat {
  public static final String JSON_PROPERTY_TYPE = "type";
  private RepeatType type;

  public static final String JSON_PROPERTY_INTERVAL_TYPE = "intervalType";
  private IntervalType intervalType;

  public static final String JSON_PROPERTY_INTERVAL_LENGTH = "intervalLength";
  private Integer intervalLength;

  public static final String JSON_PROPERTY_DAYS_OF_WEEK = "daysOfWeek";
  private List<DaysOfWeek> daysOfWeek = new ArrayList<>();

  public Repeat() { 
  }

  public Repeat type(RepeatType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RepeatType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(RepeatType type) {
    this.type = type;
  }


  public Repeat intervalType(IntervalType intervalType) {
    this.intervalType = intervalType;
    return this;
  }

   /**
   * Get intervalType
   * @return intervalType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IntervalType getIntervalType() {
    return intervalType;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntervalType(IntervalType intervalType) {
    this.intervalType = intervalType;
  }


  public Repeat intervalLength(Integer intervalLength) {
    this.intervalLength = intervalLength;
    return this;
  }

   /**
   * Number of &#x60;intervalTypes&#x60; to wait before reactivating the alert suppression window.
   * @return intervalLength
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIntervalLength() {
    return intervalLength;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntervalLength(Integer intervalLength) {
    this.intervalLength = intervalLength;
  }


  public Repeat daysOfWeek(List<DaysOfWeek> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
    return this;
  }

  public Repeat addDaysOfWeekItem(DaysOfWeek daysOfWeekItem) {
    if (this.daysOfWeek == null) {
      this.daysOfWeek = new ArrayList<>();
    }
    this.daysOfWeek.add(daysOfWeekItem);
    return this;
  }

   /**
   * Get daysOfWeek
   * @return daysOfWeek
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DAYS_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DaysOfWeek> getDaysOfWeek() {
    return daysOfWeek;
  }


  @JsonProperty(JSON_PROPERTY_DAYS_OF_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDaysOfWeek(List<DaysOfWeek> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }


  /**
   * Return true if this Repeat object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repeat repeat = (Repeat) o;
    return Objects.equals(this.type, repeat.type) &&
        Objects.equals(this.intervalType, repeat.intervalType) &&
        Objects.equals(this.intervalLength, repeat.intervalLength) &&
        Objects.equals(this.daysOfWeek, repeat.daysOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, intervalType, intervalLength, daysOfWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repeat {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    intervalType: ").append(toIndentedString(intervalType)).append("\n");
    sb.append("    intervalLength: ").append(toIndentedString(intervalLength)).append("\n");
    sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
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
