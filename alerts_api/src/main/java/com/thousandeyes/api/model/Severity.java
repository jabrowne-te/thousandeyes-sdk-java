/*
 * Alerts API
 *  ## Overview Manage all alerts, alert rules and alert suppression windows.
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
 * The severity of the alert.
 */
@JsonAdapter(Severity.Adapter.class)
public enum Severity {
  
  INFO("info"),
  
  MAJOR("major"),
  
  MINOR("minor"),
  
  CRITICAL("critical"),
  
  UNKNOWN("unknown");

  private String value;

  Severity(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Severity fromValue(String value) {
    for (Severity b : Severity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Severity> {
    @Override
    public void write(final JsonWriter jsonWriter, final Severity enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Severity read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Severity.fromValue(value);
    }
  }
}
