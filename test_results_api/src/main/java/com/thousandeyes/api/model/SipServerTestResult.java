/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.Agent;
import com.thousandeyes.api.model.SipServerErrorType;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.thousandeyes.JSON;

/**
 * SipServerTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:17.453500Z[Europe/London]")
public class SipServerTestResult {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links = null;

  public static final String SERIALIZED_NAME_SERVER_IP = "serverIp";
  @SerializedName(SERIALIZED_NAME_SERVER_IP)
  private String serverIp;

  public static final String SERIALIZED_NAME_AGENT = "agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private Agent agent;

  public static final String SERIALIZED_NAME_AVAILABILITY = "availability";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY)
  private Float availability;

  public static final String SERIALIZED_NAME_CONNECT_TIME = "connectTime";
  @SerializedName(SERIALIZED_NAME_CONNECT_TIME)
  private Integer connectTime;

  public static final String SERIALIZED_NAME_DNS_TIME = "dnsTime";
  @SerializedName(SERIALIZED_NAME_DNS_TIME)
  private Integer dnsTime;

  public static final String SERIALIZED_NAME_INVITE_TIME = "inviteTime";
  @SerializedName(SERIALIZED_NAME_INVITE_TIME)
  private Integer inviteTime;

  public static final String SERIALIZED_NAME_OPTIONS_TIME = "optionsTime";
  @SerializedName(SERIALIZED_NAME_OPTIONS_TIME)
  private Integer optionsTime;

  public static final String SERIALIZED_NAME_NUM_REDIRECTS = "numRedirects";
  @SerializedName(SERIALIZED_NAME_NUM_REDIRECTS)
  private Integer numRedirects;

  public static final String SERIALIZED_NAME_OPTIONS_REQUEST = "optionsRequest";
  @SerializedName(SERIALIZED_NAME_OPTIONS_REQUEST)
  private String optionsRequest;

  public static final String SERIALIZED_NAME_OPTIONS_RESPONSE = "optionsResponse";
  @SerializedName(SERIALIZED_NAME_OPTIONS_RESPONSE)
  private String optionsResponse;

  public static final String SERIALIZED_NAME_REGISTER_TIME = "registerTime";
  @SerializedName(SERIALIZED_NAME_REGISTER_TIME)
  private Integer registerTime;

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "responseCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private Integer responseCode;

  public static final String SERIALIZED_NAME_RESPONSE_TIME = "responseTime";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TIME)
  private Integer responseTime;

  public static final String SERIALIZED_NAME_TOTAL_TIME = "totalTime";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIME)
  private Integer totalTime;

  public static final String SERIALIZED_NAME_WAIT_TIME = "waitTime";
  @SerializedName(SERIALIZED_NAME_WAIT_TIME)
  private Integer waitTime;

  public static final String SERIALIZED_NAME_ERROR_TYPE = "errorType";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private SipServerErrorType errorType;

  public static final String SERIALIZED_NAME_PROBLEM_DETAIL = "problemDetail";
  @SerializedName(SERIALIZED_NAME_PROBLEM_DETAIL)
  private String problemDetail;

  public SipServerTestResult() {
  }

  
  public SipServerTestResult(
     OffsetDateTime date, 
     Integer roundId, 
     String serverIp, 
     Float availability, 
     Integer connectTime, 
     Integer dnsTime, 
     Integer inviteTime, 
     Integer optionsTime, 
     Integer numRedirects, 
     String optionsRequest, 
     String optionsResponse, 
     Integer registerTime, 
     Integer responseCode, 
     Integer responseTime, 
     Integer totalTime, 
     Integer waitTime, 
     String problemDetail
  ) {
    this();
    this.date = date;
    this.roundId = roundId;
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
  @javax.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round
   * @return roundId
  **/
  @javax.annotation.Nullable
  public Integer getRoundId() {
    return roundId;
  }




  public SipServerTestResult links(Object links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public Object getLinks() {
    return links;
  }


  public void setLinks(Object links) {
    this.links = links;
  }


   /**
   * Target agent IP address
   * @return serverIp
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  public Agent getAgent() {
    return agent;
  }


  public void setAgent(Agent agent) {
    this.agent = agent;
  }


   /**
   * availability of the service
   * @return availability
  **/
  @javax.annotation.Nullable
  public Float getAvailability() {
    return availability;
  }




   /**
   * Time required to establish a TCP connection to the server in milliseconds, only available when TCP is configured as protocol
   * @return connectTime
  **/
  @javax.annotation.Nullable
  public Integer getConnectTime() {
    return connectTime;
  }




   /**
   * Time required to resolve DNS in milliseconds
   * @return dnsTime
  **/
  @javax.annotation.Nullable
  public Integer getDnsTime() {
    return dnsTime;
  }




   /**
   * Time to complete INVITE in milliseconds
   * @return inviteTime
  **/
  @javax.annotation.Nullable
  public Integer getInviteTime() {
    return inviteTime;
  }




   /**
   * Time to complete OPTIONS in milliseconds
   * @return optionsTime
  **/
  @javax.annotation.Nullable
  public Integer getOptionsTime() {
    return optionsTime;
  }




   /**
   * Number of redirects
   * @return numRedirects
  **/
  @javax.annotation.Nullable
  public Integer getNumRedirects() {
    return numRedirects;
  }




   /**
   * Entire OPTIONS request
   * @return optionsRequest
  **/
  @javax.annotation.Nullable
  public String getOptionsRequest() {
    return optionsRequest;
  }




   /**
   * Entire OPTIONS response
   * @return optionsResponse
  **/
  @javax.annotation.Nullable
  public String getOptionsResponse() {
    return optionsResponse;
  }




   /**
   * Time to complete REGISTER in milliseconds
   * @return registerTime
  **/
  @javax.annotation.Nullable
  public Integer getRegisterTime() {
    return registerTime;
  }




   /**
   * SIP server response code
   * @return responseCode
  **/
  @javax.annotation.Nullable
  public Integer getResponseCode() {
    return responseCode;
  }




   /**
   * Time to first byte
   * @return responseTime
  **/
  @javax.annotation.Nullable
  public Integer getResponseTime() {
    return responseTime;
  }




   /**
   * Total time
   * @return totalTime
  **/
  @javax.annotation.Nullable
  public Integer getTotalTime() {
    return totalTime;
  }




   /**
   * Time elapsed between completion of request and first byte of response
   * @return waitTime
  **/
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
  public SipServerErrorType getErrorType() {
    return errorType;
  }


  public void setErrorType(SipServerErrorType errorType) {
    this.errorType = errorType;
  }


   /**
   * Error details, if an error was encountered
   * @return problemDetail
  **/
  @javax.annotation.Nullable
  public String getProblemDetail() {
    return problemDetail;
  }





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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, serverIp, agent, availability, connectTime, dnsTime, inviteTime, optionsTime, numRedirects, optionsRequest, optionsResponse, registerTime, responseCode, responseTime, totalTime, waitTime, errorType, problemDetail);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipServerTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("date");
    openapiFields.add("roundId");
    openapiFields.add("_links");
    openapiFields.add("serverIp");
    openapiFields.add("agent");
    openapiFields.add("availability");
    openapiFields.add("connectTime");
    openapiFields.add("dnsTime");
    openapiFields.add("inviteTime");
    openapiFields.add("optionsTime");
    openapiFields.add("numRedirects");
    openapiFields.add("optionsRequest");
    openapiFields.add("optionsResponse");
    openapiFields.add("registerTime");
    openapiFields.add("responseCode");
    openapiFields.add("responseTime");
    openapiFields.add("totalTime");
    openapiFields.add("waitTime");
    openapiFields.add("errorType");
    openapiFields.add("problemDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SipServerTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SipServerTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SipServerTestResult is not found in the empty JSON string", SipServerTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SipServerTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SipServerTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("serverIp") != null && !jsonObj.get("serverIp").isJsonNull()) && !jsonObj.get("serverIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverIp").toString()));
      }
      // validate the optional field `agent`
      if (jsonObj.get("agent") != null && !jsonObj.get("agent").isJsonNull()) {
        Agent.validateJsonElement(jsonObj.get("agent"));
      }
      if ((jsonObj.get("optionsRequest") != null && !jsonObj.get("optionsRequest").isJsonNull()) && !jsonObj.get("optionsRequest").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `optionsRequest` to be a primitive type in the JSON string but got `%s`", jsonObj.get("optionsRequest").toString()));
      }
      if ((jsonObj.get("optionsResponse") != null && !jsonObj.get("optionsResponse").isJsonNull()) && !jsonObj.get("optionsResponse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `optionsResponse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("optionsResponse").toString()));
      }
      if ((jsonObj.get("problemDetail") != null && !jsonObj.get("problemDetail").isJsonNull()) && !jsonObj.get("problemDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `problemDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("problemDetail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SipServerTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SipServerTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SipServerTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SipServerTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<SipServerTestResult>() {
           @Override
           public void write(JsonWriter out, SipServerTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SipServerTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SipServerTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SipServerTestResult
  * @throws IOException if the JSON string is invalid with respect to SipServerTestResult
  */
  public static SipServerTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SipServerTestResult.class);
  }

 /**
  * Convert an instance of SipServerTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
