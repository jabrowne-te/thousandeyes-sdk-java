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
import com.thousandeyes.sdk.tests.results.model.ApiRequestDetailAssertion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ApiRequestDetail
 */
@JsonPropertyOrder({
  ApiRequestDetail.JSON_PROPERTY_API_CALL_TIME,
  ApiRequestDetail.JSON_PROPERTY_ASSERT_ERROR_COUNT,
  ApiRequestDetail.JSON_PROPERTY_BLOCKED_TIME,
  ApiRequestDetail.JSON_PROPERTY_CONNECT_TIME,
  ApiRequestDetail.JSON_PROPERTY_COMPLETION,
  ApiRequestDetail.JSON_PROPERTY_DNS_TIME,
  ApiRequestDetail.JSON_PROPERTY_NAME,
  ApiRequestDetail.JSON_PROPERTY_PROCESSING_TIME,
  ApiRequestDetail.JSON_PROPERTY_RECEIVE_TIME,
  ApiRequestDetail.JSON_PROPERTY_RESPONSE_TIME,
  ApiRequestDetail.JSON_PROPERTY_SEND_TIME,
  ApiRequestDetail.JSON_PROPERTY_STEP_NUMBER,
  ApiRequestDetail.JSON_PROPERTY_STEP_TIME,
  ApiRequestDetail.JSON_PROPERTY_URL,
  ApiRequestDetail.JSON_PROPERTY_WAIT_TIME,
  ApiRequestDetail.JSON_PROPERTY_ASSERTIONS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiRequestDetail {
  public static final String JSON_PROPERTY_API_CALL_TIME = "apiCallTime";
  private Float apiCallTime;

  public static final String JSON_PROPERTY_ASSERT_ERROR_COUNT = "assertErrorCount";
  private Integer assertErrorCount;

  public static final String JSON_PROPERTY_BLOCKED_TIME = "blockedTime";
  private Float blockedTime;

  public static final String JSON_PROPERTY_CONNECT_TIME = "connectTime";
  private Float connectTime;

  public static final String JSON_PROPERTY_COMPLETION = "completion";
  private Float completion;

  public static final String JSON_PROPERTY_DNS_TIME = "dnsTime";
  private Float dnsTime;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROCESSING_TIME = "processingTime";
  private Float processingTime;

  public static final String JSON_PROPERTY_RECEIVE_TIME = "receiveTime";
  private Float receiveTime;

  public static final String JSON_PROPERTY_RESPONSE_TIME = "responseTime";
  private Float responseTime;

  public static final String JSON_PROPERTY_SEND_TIME = "sendTime";
  private Float sendTime;

  public static final String JSON_PROPERTY_STEP_NUMBER = "stepNumber";
  private Integer stepNumber;

  public static final String JSON_PROPERTY_STEP_TIME = "stepTime";
  private Float stepTime;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_WAIT_TIME = "waitTime";
  private Float waitTime;

  public static final String JSON_PROPERTY_ASSERTIONS = "assertions";
  private List<ApiRequestDetailAssertion> assertions = new ArrayList<>();

  public ApiRequestDetail() { 
  }

  public ApiRequestDetail apiCallTime(Float apiCallTime) {
    this.apiCallTime = apiCallTime;
    return this;
  }

   /**
   * Total time specific to the API call.
   * @return apiCallTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_CALL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getApiCallTime() {
    return apiCallTime;
  }


  @JsonProperty(JSON_PROPERTY_API_CALL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiCallTime(Float apiCallTime) {
    this.apiCallTime = apiCallTime;
  }


  public ApiRequestDetail assertErrorCount(Integer assertErrorCount) {
    this.assertErrorCount = assertErrorCount;
    return this;
  }

   /**
   * Count of assertion errors.
   * @return assertErrorCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSERT_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAssertErrorCount() {
    return assertErrorCount;
  }


  @JsonProperty(JSON_PROPERTY_ASSERT_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssertErrorCount(Integer assertErrorCount) {
    this.assertErrorCount = assertErrorCount;
  }


  public ApiRequestDetail blockedTime(Float blockedTime) {
    this.blockedTime = blockedTime;
    return this;
  }

   /**
   * Time to establish a socket connection for this request.
   * @return blockedTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getBlockedTime() {
    return blockedTime;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockedTime(Float blockedTime) {
    this.blockedTime = blockedTime;
  }


  public ApiRequestDetail connectTime(Float connectTime) {
    this.connectTime = connectTime;
    return this;
  }

   /**
   * Time to establish a TCP connection.
   * @return connectTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getConnectTime() {
    return connectTime;
  }


  @JsonProperty(JSON_PROPERTY_CONNECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectTime(Float connectTime) {
    this.connectTime = connectTime;
  }


  public ApiRequestDetail completion(Float completion) {
    this.completion = completion;
    return this;
  }

   /**
   * 100 if the request responded with no assertion errors, otherwise 0.
   * @return completion
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getCompletion() {
    return completion;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletion(Float completion) {
    this.completion = completion;
  }


  public ApiRequestDetail dnsTime(Float dnsTime) {
    this.dnsTime = dnsTime;
    return this;
  }

   /**
   * Time for the agent to perform a DNS resolution of the hostname in the URL.
   * @return dnsTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getDnsTime() {
    return dnsTime;
  }


  @JsonProperty(JSON_PROPERTY_DNS_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsTime(Float dnsTime) {
    this.dnsTime = dnsTime;
  }


  public ApiRequestDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the API step.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ApiRequestDetail processingTime(Float processingTime) {
    this.processingTime = processingTime;
    return this;
  }

   /**
   * Time for the agent to process the API step, including the waitTimeMs delay specified in the post request options.
   * @return processingTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getProcessingTime() {
    return processingTime;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessingTime(Float processingTime) {
    this.processingTime = processingTime;
  }


  public ApiRequestDetail receiveTime(Float receiveTime) {
    this.receiveTime = receiveTime;
    return this;
  }

   /**
   * Time to receive the response from the server.
   * @return receiveTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getReceiveTime() {
    return receiveTime;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiveTime(Float receiveTime) {
    this.receiveTime = receiveTime;
  }


  public ApiRequestDetail responseTime(Float responseTime) {
    this.responseTime = responseTime;
    return this;
  }

   /**
   * Time for server to send the response.
   * @return responseTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getResponseTime() {
    return responseTime;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseTime(Float responseTime) {
    this.responseTime = responseTime;
  }


  public ApiRequestDetail sendTime(Float sendTime) {
    this.sendTime = sendTime;
    return this;
  }

   /**
   * Time to send the request.
   * @return sendTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEND_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getSendTime() {
    return sendTime;
  }


  @JsonProperty(JSON_PROPERTY_SEND_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSendTime(Float sendTime) {
    this.sendTime = sendTime;
  }


  public ApiRequestDetail stepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
    return this;
  }

   /**
   * Index of the API step within requests, starting at 1.
   * @return stepNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStepNumber() {
    return stepNumber;
  }


  @JsonProperty(JSON_PROPERTY_STEP_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStepNumber(Integer stepNumber) {
    this.stepNumber = stepNumber;
  }


  public ApiRequestDetail stepTime(Float stepTime) {
    this.stepTime = stepTime;
    return this;
  }

   /**
   * Total time for an API step, including API call time and processing time.
   * @return stepTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getStepTime() {
    return stepTime;
  }


  @JsonProperty(JSON_PROPERTY_STEP_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStepTime(Float stepTime) {
    this.stepTime = stepTime;
  }


  public ApiRequestDetail url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of request
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public ApiRequestDetail waitTime(Float waitTime) {
    this.waitTime = waitTime;
    return this;
  }

   /**
   * Total time between when the agent completes sending the HTTP request to the web server and when the agent receives the first byte of the response from the web server.
   * @return waitTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getWaitTime() {
    return waitTime;
  }


  @JsonProperty(JSON_PROPERTY_WAIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWaitTime(Float waitTime) {
    this.waitTime = waitTime;
  }


  public ApiRequestDetail assertions(List<ApiRequestDetailAssertion> assertions) {
    this.assertions = assertions;
    return this;
  }

  public ApiRequestDetail addAssertionsItem(ApiRequestDetailAssertion assertionsItem) {
    if (this.assertions == null) {
      this.assertions = new ArrayList<>();
    }
    this.assertions.add(assertionsItem);
    return this;
  }

   /**
   * Get assertions
   * @return assertions
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiRequestDetailAssertion> getAssertions() {
    return assertions;
  }


  @JsonProperty(JSON_PROPERTY_ASSERTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssertions(List<ApiRequestDetailAssertion> assertions) {
    this.assertions = assertions;
  }


  /**
   * Return true if this ApiRequestDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRequestDetail apiRequestDetail = (ApiRequestDetail) o;
    return Objects.equals(this.apiCallTime, apiRequestDetail.apiCallTime) &&
        Objects.equals(this.assertErrorCount, apiRequestDetail.assertErrorCount) &&
        Objects.equals(this.blockedTime, apiRequestDetail.blockedTime) &&
        Objects.equals(this.connectTime, apiRequestDetail.connectTime) &&
        Objects.equals(this.completion, apiRequestDetail.completion) &&
        Objects.equals(this.dnsTime, apiRequestDetail.dnsTime) &&
        Objects.equals(this.name, apiRequestDetail.name) &&
        Objects.equals(this.processingTime, apiRequestDetail.processingTime) &&
        Objects.equals(this.receiveTime, apiRequestDetail.receiveTime) &&
        Objects.equals(this.responseTime, apiRequestDetail.responseTime) &&
        Objects.equals(this.sendTime, apiRequestDetail.sendTime) &&
        Objects.equals(this.stepNumber, apiRequestDetail.stepNumber) &&
        Objects.equals(this.stepTime, apiRequestDetail.stepTime) &&
        Objects.equals(this.url, apiRequestDetail.url) &&
        Objects.equals(this.waitTime, apiRequestDetail.waitTime) &&
        Objects.equals(this.assertions, apiRequestDetail.assertions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiCallTime, assertErrorCount, blockedTime, connectTime, completion, dnsTime, name, processingTime, receiveTime, responseTime, sendTime, stepNumber, stepTime, url, waitTime, assertions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRequestDetail {\n");
    sb.append("    apiCallTime: ").append(toIndentedString(apiCallTime)).append("\n");
    sb.append("    assertErrorCount: ").append(toIndentedString(assertErrorCount)).append("\n");
    sb.append("    blockedTime: ").append(toIndentedString(blockedTime)).append("\n");
    sb.append("    connectTime: ").append(toIndentedString(connectTime)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    dnsTime: ").append(toIndentedString(dnsTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processingTime: ").append(toIndentedString(processingTime)).append("\n");
    sb.append("    receiveTime: ").append(toIndentedString(receiveTime)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    sendTime: ").append(toIndentedString(sendTime)).append("\n");
    sb.append("    stepNumber: ").append(toIndentedString(stepNumber)).append("\n");
    sb.append("    stepTime: ").append(toIndentedString(stepTime)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    assertions: ").append(toIndentedString(assertions)).append("\n");
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

