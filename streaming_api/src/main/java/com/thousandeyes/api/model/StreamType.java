/*
 * ThousandEyes for OpenTelemetry
 *  Configure ThousandEyes to stream or push test data to a OpenTelemetry compliant endpoint with the ThousandEyes for OpenTelemetry API. 
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
 * The type of data stream to configure. Currently, only &#x60;opentelemetry&#x60; is supported.
 */
@JsonAdapter(StreamType.Adapter.class)
public enum StreamType {
  
  OPENTELEMETRY("opentelemetry");

  private String value;

  StreamType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StreamType fromValue(String value) {
    for (StreamType b : StreamType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StreamType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StreamType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StreamType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StreamType.fromValue(value);
    }
  }
}
