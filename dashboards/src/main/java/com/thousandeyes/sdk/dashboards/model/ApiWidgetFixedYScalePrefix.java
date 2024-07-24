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
 * Prefix denoting the unit of measurement for the fixed Y-axis scale.
 */
public enum ApiWidgetFixedYScalePrefix {
  
  KBPS("Kbps"),
  
  MBPS("Mbps"),
  
  GBPS("Gbps"),
  
  KPPS("Kpps"),
  
  MPPS("Mpps"),
  
  GPPS("Gpps");

  private String value;

  ApiWidgetFixedYScalePrefix(String value) {
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
  public static ApiWidgetFixedYScalePrefix fromValue(String value) {
    for (ApiWidgetFixedYScalePrefix b : ApiWidgetFixedYScalePrefix.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

