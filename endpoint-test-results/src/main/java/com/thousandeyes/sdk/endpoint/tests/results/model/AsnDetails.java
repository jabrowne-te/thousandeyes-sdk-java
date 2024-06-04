/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.6
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AsnDetails
 */
@JsonPropertyOrder({
  AsnDetails.JSON_PROPERTY_AS_NAME,
  AsnDetails.JSON_PROPERTY_AS_NUMBER
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AsnDetails {
  public static final String JSON_PROPERTY_AS_NAME = "asName";
  private String asName;

  public static final String JSON_PROPERTY_AS_NUMBER = "asNumber";
  private Integer asNumber;

  public AsnDetails() { 
  }

  @JsonCreator
  public AsnDetails(
    @JsonProperty(JSON_PROPERTY_AS_NAME) String asName, 
    @JsonProperty(JSON_PROPERTY_AS_NUMBER) Integer asNumber
  ) {
  this();
    this.asName = asName;
    this.asNumber = asNumber;
  }

   /**
   * Name of the provider.
   * @return asName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAsName() {
    return asName;
  }




   /**
   * Unique number assigned to an organization (also referred to as service provider).
   * @return asNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AS_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAsNumber() {
    return asNumber;
  }




  /**
   * Return true if this AsnDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsnDetails asnDetails = (AsnDetails) o;
    return Objects.equals(this.asName, asnDetails.asName) &&
        Objects.equals(this.asNumber, asnDetails.asNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asName, asNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsnDetails {\n");
    sb.append("    asName: ").append(toIndentedString(asName)).append("\n");
    sb.append("    asNumber: ").append(toIndentedString(asNumber)).append("\n");
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
