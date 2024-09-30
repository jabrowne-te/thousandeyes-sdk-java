/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results.model;

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
 * TestResultMonitor
 */
@JsonPropertyOrder({
  TestResultMonitor.JSON_PROPERTY_MONITOR_ID,
  TestResultMonitor.JSON_PROPERTY_MONITOR_NAME,
  TestResultMonitor.JSON_PROPERTY_COUNTRY_ID
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class TestResultMonitor {
  public static final String JSON_PROPERTY_MONITOR_ID = "monitorId";
  private String monitorId;

  public static final String JSON_PROPERTY_MONITOR_NAME = "monitorName";
  private String monitorName;

  public static final String JSON_PROPERTY_COUNTRY_ID = "countryId";
  private String countryId;

  public TestResultMonitor() { 
  }

  @JsonCreator
  public TestResultMonitor(
    @JsonProperty(JSON_PROPERTY_MONITOR_ID) String monitorId, 
    @JsonProperty(JSON_PROPERTY_MONITOR_NAME) String monitorName, 
    @JsonProperty(JSON_PROPERTY_COUNTRY_ID) String countryId
  ) {
  this();
    this.monitorId = monitorId;
    this.monitorName = monitorName;
    this.countryId = countryId;
  }

   /**
   * Unique monitor ID.
   * @return monitorId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMonitorId() {
    return monitorId;
  }




   /**
   * The name of the Monitor.
   * @return monitorName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMonitorName() {
    return monitorName;
  }




   /**
   * 2-digit ISO country code.
   * @return countryId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryId() {
    return countryId;
  }




  /**
   * Return true if this TestResultMonitor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultMonitor testResultMonitor = (TestResultMonitor) o;
    return Objects.equals(this.monitorId, testResultMonitor.monitorId) &&
        Objects.equals(this.monitorName, testResultMonitor.monitorName) &&
        Objects.equals(this.countryId, testResultMonitor.countryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitorId, monitorName, countryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultMonitor {\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    monitorName: ").append(toIndentedString(monitorName)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
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
