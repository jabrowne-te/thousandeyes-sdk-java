/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.results.model;

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
 * ApiRequestDetailAssertion
 */
@JsonPropertyOrder({
  ApiRequestDetailAssertion.JSON_PROPERTY_STEP,
  ApiRequestDetailAssertion.JSON_PROPERTY_HAS_FAILED
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiRequestDetailAssertion {
  public static final String JSON_PROPERTY_STEP = "step";
  private Integer step;

  public static final String JSON_PROPERTY_HAS_FAILED = "hasFailed";
  private Boolean hasFailed;

  public ApiRequestDetailAssertion() { 
  }

  public ApiRequestDetailAssertion step(Integer step) {
    this.step = step;
    return this;
  }

   /**
   * Index of the assertion, starting at 1.
   * @return step
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStep() {
    return step;
  }


  @JsonProperty(JSON_PROPERTY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStep(Integer step) {
    this.step = step;
  }


  public ApiRequestDetailAssertion hasFailed(Boolean hasFailed) {
    this.hasFailed = hasFailed;
    return this;
  }

   /**
   * Indicates if the assertion passed or failed. &#x60;true&#x60; if the assertion failed; &#x60;false&#x60; if the assertion passed.
   * @return hasFailed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasFailed() {
    return hasFailed;
  }


  @JsonProperty(JSON_PROPERTY_HAS_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasFailed(Boolean hasFailed) {
    this.hasFailed = hasFailed;
  }


  /**
   * Return true if this ApiRequestDetailAssertion object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequestDetailAssertion apiRequestDetailAssertion = (ApiRequestDetailAssertion) o;
    return Objects.equals(this.step, apiRequestDetailAssertion.step) &&
        Objects.equals(this.hasFailed, apiRequestDetailAssertion.hasFailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(step, hasFailed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestDetailAssertion {\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    hasFailed: ").append(toIndentedString(hasFailed)).append("\n");
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

