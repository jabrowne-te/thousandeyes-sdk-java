/*
 * Instant Tests API
 *  ### Overview The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test.
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
 * Probe mode used by network test, only valid when the protocol is set to TCP.
 */
@JsonAdapter(TestProbeMode.Adapter.class)
public enum TestProbeMode {
  
  AUTO("auto"),
  
  SACK("sack"),
  
  SYN("syn");

  private String value;

  TestProbeMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TestProbeMode fromValue(String value) {
    for (TestProbeMode b : TestProbeMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TestProbeMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final TestProbeMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TestProbeMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TestProbeMode.fromValue(value);
    }
  }
}
