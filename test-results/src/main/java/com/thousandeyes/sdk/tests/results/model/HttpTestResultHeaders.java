/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
 *
 * The version of the OpenAPI document: 7.0.10
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
 * Expandable object containing both request and response headers
 */
@JsonPropertyOrder({
  HttpTestResultHeaders.JSON_PROPERTY_REQUEST_HEADERS,
  HttpTestResultHeaders.JSON_PROPERTY_RESPONSE_HEADERS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class HttpTestResultHeaders {
  public static final String JSON_PROPERTY_REQUEST_HEADERS = "requestHeaders";
  private String requestHeaders;

  public static final String JSON_PROPERTY_RESPONSE_HEADERS = "responseHeaders";
  private String responseHeaders;

  public HttpTestResultHeaders() { 
  }

  public HttpTestResultHeaders requestHeaders(String requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

   /**
   * Crlf-delimited list of request headers in header: value format
   * @return requestHeaders
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestHeaders() {
    return requestHeaders;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestHeaders(String requestHeaders) {
    this.requestHeaders = requestHeaders;
  }


  public HttpTestResultHeaders responseHeaders(String responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

   /**
   * crlf-delimited list of response headers in header: value format
   * @return responseHeaders
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResponseHeaders() {
    return responseHeaders;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseHeaders(String responseHeaders) {
    this.responseHeaders = responseHeaders;
  }


  /**
   * Return true if this HttpTestResultHeaders object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpTestResultHeaders httpTestResultHeaders = (HttpTestResultHeaders) o;
    return Objects.equals(this.requestHeaders, httpTestResultHeaders.requestHeaders) &&
        Objects.equals(this.responseHeaders, httpTestResultHeaders.responseHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeaders, responseHeaders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpTestResultHeaders {\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
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

