/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets AgentDetailsExpand
 */
@JsonAdapter(AgentDetailsExpand.Adapter.class)
public enum AgentDetailsExpand {
  
  CLUSTER_MEMBER("cluster-member"),
  
  TEST("test"),
  
  NOTIFICATION_RULE("notification-rule");

  private String value;

  AgentDetailsExpand(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AgentDetailsExpand fromValue(String value) {
    for (AgentDetailsExpand b : AgentDetailsExpand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AgentDetailsExpand> {
    @Override
    public void write(final JsonWriter jsonWriter, final AgentDetailsExpand enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AgentDetailsExpand read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AgentDetailsExpand.fromValue(value);
    }
  }
}
