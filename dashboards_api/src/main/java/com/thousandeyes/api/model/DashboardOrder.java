/*
 * Dashboards API
 * Manage ThousandEyes Dashboards
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
 * Gets or Sets DashboardOrder
 */
@JsonAdapter(DashboardOrder.Adapter.class)
public enum DashboardOrder {
  
  ASC("asc"),
  
  DESC("desc");

  private String value;

  DashboardOrder(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DashboardOrder fromValue(String value) {
    for (DashboardOrder b : DashboardOrder.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DashboardOrder> {
    @Override
    public void write(final JsonWriter jsonWriter, final DashboardOrder enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DashboardOrder read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DashboardOrder.fromValue(value);
    }
  }
}
