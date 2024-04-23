/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.endpoint.tests.results.model.EndpointScheduledTest;
import com.thousandeyes.api.endpoint.tests.results.model.NetworkTestResult;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NetworkTestResults
 */
@JsonPropertyOrder({
  NetworkTestResults.JSON_PROPERTY_RESULTS,
  NetworkTestResults.JSON_PROPERTY_TOTAL_HITS,
  NetworkTestResults.JSON_PROPERTY_TEST
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.417883+01:00[Europe/London]")
public class NetworkTestResults {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<NetworkTestResult> results;

  public static final String JSON_PROPERTY_TOTAL_HITS = "totalHits";
  private BigDecimal totalHits;

  public static final String JSON_PROPERTY_TEST = "test";
  private EndpointScheduledTest test;

  public NetworkTestResults() { 
  }

  public NetworkTestResults results(List<NetworkTestResult> results) {
    this.results = results;
    return this;
  }

  public NetworkTestResults addResultsItem(NetworkTestResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<NetworkTestResult> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<NetworkTestResult> results) {
    this.results = results;
  }


  public NetworkTestResults totalHits(BigDecimal totalHits) {
    this.totalHits = totalHits;
    return this;
  }

   /**
   * Total number of measurements that match the search criteria
   * @return totalHits
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalHits() {
    return totalHits;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_HITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalHits(BigDecimal totalHits) {
    this.totalHits = totalHits;
  }


  public NetworkTestResults test(EndpointScheduledTest test) {
    this.test = test;
    return this;
  }

   /**
   * Get test
   * @return test
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EndpointScheduledTest getTest() {
    return test;
  }


  @JsonProperty(JSON_PROPERTY_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTest(EndpointScheduledTest test) {
    this.test = test;
  }


  /**
   * Return true if this NetworkTestResults object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkTestResults networkTestResults = (NetworkTestResults) o;
    return Objects.equals(this.results, networkTestResults.results) &&
        Objects.equals(this.totalHits, networkTestResults.totalHits) &&
        Objects.equals(this.test, networkTestResults.test);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalHits, test);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkTestResults {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalHits: ").append(toIndentedString(totalHits)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
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

