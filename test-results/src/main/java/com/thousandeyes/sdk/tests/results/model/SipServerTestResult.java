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
import com.thousandeyes.sdk.tests.results.model.Agent;
import com.thousandeyes.sdk.tests.results.model.SipServerErrorType;
import com.thousandeyes.sdk.tests.results.model.TestResultAppLinks;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SipServerTestResult
 */
@JsonPropertyOrder({
  SipServerTestResult.JSON_PROPERTY_DATE,
  SipServerTestResult.JSON_PROPERTY_ROUND_ID,
  SipServerTestResult.JSON_PROPERTY_LINKS,
  SipServerTestResult.JSON_PROPERTY_START_TIME,
  SipServerTestResult.JSON_PROPERTY_END_TIME,
  SipServerTestResult.JSON_PROPERTY_SERVER_IP,
  SipServerTestResult.JSON_PROPERTY_AGENT,
  SipServerTestResult.JSON_PROPERTY_AVAILABILITY,
  SipServerTestResult.JSON_PROPERTY_CONNECT_TIME,
  SipServerTestResult.JSON_PROPERTY_DNS_TIME,
  SipServerTestResult.JSON_PROPERTY_INVITE_TIME,
  SipServerTestResult.JSON_PROPERTY_OPTIONS_TIME,
  SipServerTestResult.JSON_PROPERTY_NUM_REDIRECTS,
  SipServerTestResult.JSON_PROPERTY_OPTIONS_REQUEST,
  SipServerTestResult.JSON_PROPERTY_OPTIONS_RESPONSE,
  SipServerTestResult.JSON_PROPERTY_REGISTER_TIME,
  SipServerTestResult.JSON_PROPERTY_RESPONSE_CODE,
  SipServerTestResult.JSON_PROPERTY_RESPONSE_TIME,
  SipServerTestResult.JSON_PROPERTY_TOTAL_TIME,
  SipServerTestResult.JSON_PROPERTY_WAIT_TIME,
  SipServerTestResult.JSON_PROPERTY_ERROR_TYPE,
  SipServerTestResult.JSON_PROPERTY_PROBLEM_DETAIL
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class SipServerTestResult {
  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_ROUND_ID = "roundId";
  private Integer roundId;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private TestResultAppLinks links;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private Integer startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private Integer endTime;

  public static final String JSON_PROPERTY_SERVER_IP = "serverIp";
  private String serverIp;

  public static final String JSON_PROPERTY_AGENT = "agent";
  private Agent agent;

  public static final String JSON_PROPERTY_AVAILABILITY = "availability";
  private Float availability;

  public static final String JSON_PROPERTY_CONNECT_TIME = "connectTime";
  private Integer connectTime;

  public static final String JSON_PROPERTY_DNS_TIME = "dnsTime";
  private Integer dnsTime;

  public static final String JSON_PROPERTY_INVITE_TIME = "inviteTime";
  private Integer inviteTime;

  public static final String JSON_PROPERTY_OPTIONS_TIME = "optionsTime";
  private Integer optionsTime;

  public static final String JSON_PROPERTY_NUM_REDIRECTS = "numRedirects";
  private Integer numRedirects;

  public static final String JSON_PROPERTY_OPTIONS_REQUEST = "optionsRequest";
  private String optionsRequest;

  public static final String JSON_PROPERTY_OPTIONS_RESPONSE = "optionsResponse";
  private String optionsResponse;

  public static final String JSON_PROPERTY_REGISTER_TIME = "registerTime";
  private Integer registerTime;

  public static final String JSON_PROPERTY_RESPONSE_CODE = "responseCode";
  private Integer responseCode;

  public static final String JSON_PROPERTY_RESPONSE_TIME = "responseTime";
  private Integer responseTime;

  public static final String JSON_PROPERTY_TOTAL_TIME = "totalTime";
  private Integer totalTime;

  public static final String JSON_PROPERTY_WAIT_TIME = "waitTime";
  private Integer waitTime;

  public static final String JSON_PROPERTY_ERROR_TYPE = "errorType";
  private SipServerErrorType errorType;

  public static final String JSON_PROPERTY_PROBLEM_DETAIL = "problemDetail";
  private String problemDetail;

  public SipServerTestResult() { 
  }

  @JsonCreator
  public SipServerTestResult(
    @JsonProperty(JSON_PROPERTY_DATE) OffsetDateTime date, 
    @JsonProperty(JSON_PROPERTY_ROUND_ID) Integer roundId, 
    @JsonProperty(JSON_PROPERTY_START_TIME) Integer startTime, 
    @JsonProperty(JSON_PROPERTY_END_TIME) Integer endTime, 
    @JsonProperty(JSON_PROPERTY_SERVER_IP) String serverIp, 
    @JsonProperty(JSON_PROPERTY_AVAILABILITY) Float availability, 
    @JsonProperty(JSON_PROPERTY_CONNECT_TIME) Integer connectTime, 
    @JsonProperty(JSON_PROPERTY_DNS_TIME) Integer dnsTime, 
    @JsonProperty(JSON_PROPERTY_INVITE_TIME) Integer inviteTime, 
    @JsonProperty(JSON_PROPERTY_OPTIONS_TIME) Integer optionsTime, 
    @JsonProperty(JSON_PROPERTY_NUM_REDIRECTS) Integer numRedirects, 
    @JsonProperty(JSON_PROPERTY_OPTIONS_REQUEST) String optionsRequest, 
    @JsonProperty(JSON_PROPERTY_OPTIONS_RESPONSE) String optionsResponse, 
    @JsonProperty(JSON_PROPERTY_REGISTER_TIME) Integer registerTime, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE) Integer responseCode, 
    @JsonProperty(JSON_PROPERTY_RESPONSE_TIME) Integer responseTime, 
    @JsonProperty(JSON_PROPERTY_TOTAL_TIME) Integer totalTime, 
    @JsonProperty(JSON_PROPERTY_WAIT_TIME) Integer waitTime, 
    @JsonProperty(JSON_PROPERTY_PROBLEM_DETAIL) String problemDetail
  ) {
  this();
    this.date = date;
    this.roundId = roundId;
    this.startTime = startTime;
    this.endTime = endTime;
    this.serverIp = serverIp;
    this.availability = availability;
    this.connectTime = connectTime;
    this.dnsTime = dnsTime;
    this.inviteTime = inviteTime;
    this.optionsTime = optionsTime;
    this.numRedirects = numRedirects;
    this.optionsRequest = optionsRequest;
    this.optionsResponse = optionsResponse;
    this.registerTime = registerTime;
    this.responseCode = responseCode;
    this.responseTime = responseTime;
    this.totalTime = totalTime;
    this.waitTime = waitTime;
    this.problemDetail = problemDetail;
  }

   /**
   * Data point date UTC (ISO date-time format).
   * @return date
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return roundId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROUND_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundId() {
    return roundId;
  }




  public SipServerTestResult links(TestResultAppLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestResultAppLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(TestResultAppLinks links) {
    this.links = links;
  }


   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return startTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartTime() {
    return startTime;
  }




   /**
   * Epoch time (seconds) indicating the end time of the round
   * @return endTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndTime() {
    return endTime;
  }




   /**
   * Target agent IP address
   * @return serverIp
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVER_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServerIp() {
    return serverIp;
  }




  public SipServerTestResult agent(Agent agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Agent getAgent() {
    return agent;
  }


  @JsonProperty(JSON_PROPERTY_AGENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgent(Agent agent) {
    this.agent = agent;
  }


   /**
   * availability of the service
   * @return availability
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAvailability() {
    return availability;
  }




   /**
   * Time required to establish a TCP connection to the server in milliseconds, only available when TCP is configured as protocol
   * @return connectTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConnectTime() {
    return connectTime;
  }




   /**
   * Time required to resolve DNS in milliseconds
   * @return dnsTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDnsTime() {
    return dnsTime;
  }




   /**
   * Time to complete INVITE in milliseconds
   * @return inviteTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVITE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInviteTime() {
    return inviteTime;
  }




   /**
   * Time to complete OPTIONS in milliseconds
   * @return optionsTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOptionsTime() {
    return optionsTime;
  }




   /**
   * Number of redirects
   * @return numRedirects
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumRedirects() {
    return numRedirects;
  }




   /**
   * Entire OPTIONS request
   * @return optionsRequest
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptionsRequest() {
    return optionsRequest;
  }




   /**
   * Entire OPTIONS response
   * @return optionsResponse
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptionsResponse() {
    return optionsResponse;
  }




   /**
   * Time to complete REGISTER in milliseconds
   * @return registerTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGISTER_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRegisterTime() {
    return registerTime;
  }




   /**
   * SIP server response code
   * @return responseCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseCode() {
    return responseCode;
  }




   /**
   * Time to first byte
   * @return responseTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResponseTime() {
    return responseTime;
  }




   /**
   * Total time
   * @return totalTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalTime() {
    return totalTime;
  }




   /**
   * Time elapsed between completion of request and first byte of response
   * @return waitTime
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAIT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWaitTime() {
    return waitTime;
  }




  public SipServerTestResult errorType(SipServerErrorType errorType) {
    this.errorType = errorType;
    return this;
  }

   /**
   * Get errorType
   * @return errorType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SipServerErrorType getErrorType() {
    return errorType;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorType(SipServerErrorType errorType) {
    this.errorType = errorType;
  }


   /**
   * Error details, if an error was encountered
   * @return problemDetail
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROBLEM_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProblemDetail() {
    return problemDetail;
  }




  /**
   * Return true if this SipServerTestResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipServerTestResult sipServerTestResult = (SipServerTestResult) o;
    return Objects.equals(this.date, sipServerTestResult.date) &&
        Objects.equals(this.roundId, sipServerTestResult.roundId) &&
        Objects.equals(this.links, sipServerTestResult.links) &&
        Objects.equals(this.startTime, sipServerTestResult.startTime) &&
        Objects.equals(this.endTime, sipServerTestResult.endTime) &&
        Objects.equals(this.serverIp, sipServerTestResult.serverIp) &&
        Objects.equals(this.agent, sipServerTestResult.agent) &&
        Objects.equals(this.availability, sipServerTestResult.availability) &&
        Objects.equals(this.connectTime, sipServerTestResult.connectTime) &&
        Objects.equals(this.dnsTime, sipServerTestResult.dnsTime) &&
        Objects.equals(this.inviteTime, sipServerTestResult.inviteTime) &&
        Objects.equals(this.optionsTime, sipServerTestResult.optionsTime) &&
        Objects.equals(this.numRedirects, sipServerTestResult.numRedirects) &&
        Objects.equals(this.optionsRequest, sipServerTestResult.optionsRequest) &&
        Objects.equals(this.optionsResponse, sipServerTestResult.optionsResponse) &&
        Objects.equals(this.registerTime, sipServerTestResult.registerTime) &&
        Objects.equals(this.responseCode, sipServerTestResult.responseCode) &&
        Objects.equals(this.responseTime, sipServerTestResult.responseTime) &&
        Objects.equals(this.totalTime, sipServerTestResult.totalTime) &&
        Objects.equals(this.waitTime, sipServerTestResult.waitTime) &&
        Objects.equals(this.errorType, sipServerTestResult.errorType) &&
        Objects.equals(this.problemDetail, sipServerTestResult.problemDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, startTime, endTime, serverIp, agent, availability, connectTime, dnsTime, inviteTime, optionsTime, numRedirects, optionsRequest, optionsResponse, registerTime, responseCode, responseTime, totalTime, waitTime, errorType, problemDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipServerTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    connectTime: ").append(toIndentedString(connectTime)).append("\n");
    sb.append("    dnsTime: ").append(toIndentedString(dnsTime)).append("\n");
    sb.append("    inviteTime: ").append(toIndentedString(inviteTime)).append("\n");
    sb.append("    optionsTime: ").append(toIndentedString(optionsTime)).append("\n");
    sb.append("    numRedirects: ").append(toIndentedString(numRedirects)).append("\n");
    sb.append("    optionsRequest: ").append(toIndentedString(optionsRequest)).append("\n");
    sb.append("    optionsResponse: ").append(toIndentedString(optionsResponse)).append("\n");
    sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    problemDetail: ").append(toIndentedString(problemDetail)).append("\n");
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

