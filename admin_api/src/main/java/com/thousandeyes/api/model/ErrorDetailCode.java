/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API.  This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.
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
 * Code for the agent error.
 */
@JsonAdapter(ErrorDetailCode.Adapter.class)
public enum ErrorDetailCode {
  
  AGENT_VERSION_OUTDATED("agent-version-outdated"),
  
  BROWSERBOT_VERSION_OUTDATED("browserbot-version-outdated"),
  
  APPLIANCE_VERSION_OUTDATED("appliance-version-outdated"),
  
  CLOCK_OFFSET("clock-offset"),
  
  OS_END_OF_INSTALLATION_SUPPORT("os-end-of-installation-support"),
  
  OS_END_OF_SUPPORT("os-end-of-support"),
  
  OS_END_OF_LIFE("os-end-of-life"),
  
  NAT_TRAVERSAL_ERROR("nat-traversal-error");

  private String value;

  ErrorDetailCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ErrorDetailCode fromValue(String value) {
    for (ErrorDetailCode b : ErrorDetailCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ErrorDetailCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ErrorDetailCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ErrorDetailCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ErrorDetailCode.fromValue(value);
    }
  }
}
