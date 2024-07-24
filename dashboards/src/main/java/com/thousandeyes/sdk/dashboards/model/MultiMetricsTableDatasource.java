/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.10
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Datasource of the Multi-Metrics table widget.
 */
public enum MultiMetricsTableDatasource {
  
  ALERTS("ALERTS"),
  
  CLOUD_AND_ENTERPRISE_AGENTS("CLOUD_AND_ENTERPRISE_AGENTS"),
  
  DEVICES("DEVICES"),
  
  ENDPOINT_AGENTS("ENDPOINT_AGENTS"),
  
  ENDPOINT_AST_TEST("ENDPOINT_AST_TEST"),
  
  ENDPOINT_BROWSER_SESSION("ENDPOINT_BROWSER_SESSION"),
  
  ENDPOINT_LOCAL_NETWORK("ENDPOINT_LOCAL_NETWORK"),
  
  ENDPOINT_LOCAL_NETWORK_WIRELESS("ENDPOINT_LOCAL_NETWORK_WIRELESS"),
  
  ENDPOINT_SCHEDULED_TEST("ENDPOINT_SCHEDULED_TEST"),
  
  INTERNET_INSIGHTS("INTERNET_INSIGHTS"),
  
  ROUTING("ROUTING");

  private String value;

  MultiMetricsTableDatasource(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MultiMetricsTableDatasource fromValue(String value) {
    for (MultiMetricsTableDatasource b : MultiMetricsTableDatasource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

