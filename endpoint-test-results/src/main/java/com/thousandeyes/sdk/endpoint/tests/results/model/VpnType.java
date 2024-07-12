/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.tests.results.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Name of the VPN provider.
 */
public enum VpnType {
  
  CISCO_ANYCONNECT("cisco-anyconnect"),
  
  PALO_ALTO_GLOBALPROTECT("palo-alto-globalprotect"),
  
  IVANTI_CONNECT_SECURE("ivanti-connect-secure"),
  
  ZSCALER_INTERNET_ACCESS("zscaler-internet-access"),
  
  F5_BIG_IP("f5-big-ip");

  private String value;

  VpnType(String value) {
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
  public static VpnType fromValue(String value) {
    for (VpnType b : VpnType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

