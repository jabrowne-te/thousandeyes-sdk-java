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
import com.thousandeyes.api.model.HttpTestResultHeaders;
import com.thousandeyes.api.model.SslCert;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * HttpTestResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:17.453500Z[Europe/London]")
public class HttpTestResult {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links = null;

  public static final String SERIALIZED_NAME_AGENT = "agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private Agent agent;

  public static final String SERIALIZED_NAME_SERVER_IP = "serverIp";
  @SerializedName(SERIALIZED_NAME_SERVER_IP)
  private String serverIp;

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "responseCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private Integer responseCode;

  public static final String SERIALIZED_NAME_NUM_REDIRECTS = "numRedirects";
  @SerializedName(SERIALIZED_NAME_NUM_REDIRECTS)
  private Integer numRedirects;

  public static final String SERIALIZED_NAME_REDIRECT_TIME = "redirectTime";
  @SerializedName(SERIALIZED_NAME_REDIRECT_TIME)
  private Integer redirectTime;

  public static final String SERIALIZED_NAME_DNS_TIME = "dnsTime";
  @SerializedName(SERIALIZED_NAME_DNS_TIME)
  private Integer dnsTime;

  public static final String SERIALIZED_NAME_SSL_TIME = "sslTime";
  @SerializedName(SERIALIZED_NAME_SSL_TIME)
  private Integer sslTime;

  public static final String SERIALIZED_NAME_CONNECT_TIME = "connectTime";
  @SerializedName(SERIALIZED_NAME_CONNECT_TIME)
  private Integer connectTime;

  public static final String SERIALIZED_NAME_WAIT_TIME = "waitTime";
  @SerializedName(SERIALIZED_NAME_WAIT_TIME)
  private Integer waitTime;

  public static final String SERIALIZED_NAME_RECEIVE_TIME = "receiveTime";
  @SerializedName(SERIALIZED_NAME_RECEIVE_TIME)
  private Integer receiveTime;

  public static final String SERIALIZED_NAME_WIRE_SIZE = "wireSize";
  @SerializedName(SERIALIZED_NAME_WIRE_SIZE)
  private Integer wireSize;

  public static final String SERIALIZED_NAME_RESPONSE_TIME = "responseTime";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TIME)
  private Integer responseTime;

  public static final String SERIALIZED_NAME_THROUGHPUT = "throughput";
  @SerializedName(SERIALIZED_NAME_THROUGHPUT)
  private Double throughput;

  public static final String SERIALIZED_NAME_TOTAL_TIME = "totalTime";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIME)
  private Integer totalTime;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private HttpTestResultHeaders headers;

  public static final String SERIALIZED_NAME_ERROR_TYPE = "errorType";
  @SerializedName(SERIALIZED_NAME_ERROR_TYPE)
  private String errorType;

  public static final String SERIALIZED_NAME_ERROR_DETAILS = "errorDetails";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private String errorDetails;

  public static final String SERIALIZED_NAME_SSL_CIPHER = "sslCipher";
  @SerializedName(SERIALIZED_NAME_SSL_CIPHER)
  private String sslCipher;

  public static final String SERIALIZED_NAME_SSL_VERSION = "sslVersion";
  @SerializedName(SERIALIZED_NAME_SSL_VERSION)
  private String sslVersion;

  public static final String SERIALIZED_NAME_SSL_CERTIFICATES = "sslCertificates";
  @SerializedName(SERIALIZED_NAME_SSL_CERTIFICATES)
  private List<SslCert> sslCertificates;

  public HttpTestResult() {
  }

  
  public HttpTestResult(
     OffsetDateTime date, 
     Integer roundId, 
     String serverIp, 
     String errorType, 
     String errorDetails
  ) {
    this();
    this.date = date;
    this.roundId = roundId;
    this.serverIp = serverIp;
    this.errorType = errorType;
    this.errorDetails = errorDetails;
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




  public HttpTestResult links(Object links) {
    
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


  public HttpTestResult agent(Agent agent) {
    
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
   * IP address of destination server
   * @return serverIp
  **/
  @javax.annotation.Nullable
  public String getServerIp() {
    return serverIp;
  }




  public HttpTestResult responseCode(Integer responseCode) {
    
    this.responseCode = responseCode;
    return this;
  }

   /**
   * HTTP response code
   * @return responseCode
  **/
  @javax.annotation.Nullable
  public Integer getResponseCode() {
    return responseCode;
  }


  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }


  public HttpTestResult numRedirects(Integer numRedirects) {
    
    this.numRedirects = numRedirects;
    return this;
  }

   /**
   * Number of redirects
   * @return numRedirects
  **/
  @javax.annotation.Nullable
  public Integer getNumRedirects() {
    return numRedirects;
  }


  public void setNumRedirects(Integer numRedirects) {
    this.numRedirects = numRedirects;
  }


  public HttpTestResult redirectTime(Integer redirectTime) {
    
    this.redirectTime = redirectTime;
    return this;
  }

   /**
   * Cumulative redirect timing in milliseconds
   * @return redirectTime
  **/
  @javax.annotation.Nullable
  public Integer getRedirectTime() {
    return redirectTime;
  }


  public void setRedirectTime(Integer redirectTime) {
    this.redirectTime = redirectTime;
  }


  public HttpTestResult dnsTime(Integer dnsTime) {
    
    this.dnsTime = dnsTime;
    return this;
  }

   /**
   * Time required to resolve DNS in milliseconds
   * @return dnsTime
  **/
  @javax.annotation.Nullable
  public Integer getDnsTime() {
    return dnsTime;
  }


  public void setDnsTime(Integer dnsTime) {
    this.dnsTime = dnsTime;
  }


  public HttpTestResult sslTime(Integer sslTime) {
    
    this.sslTime = sslTime;
    return this;
  }

   /**
   * Time to negotiate SSL/TLS in milliseconds
   * @return sslTime
  **/
  @javax.annotation.Nullable
  public Integer getSslTime() {
    return sslTime;
  }


  public void setSslTime(Integer sslTime) {
    this.sslTime = sslTime;
  }


  public HttpTestResult connectTime(Integer connectTime) {
    
    this.connectTime = connectTime;
    return this;
  }

   /**
   * Time required to establish a TCP connection to the server
   * @return connectTime
  **/
  @javax.annotation.Nullable
  public Integer getConnectTime() {
    return connectTime;
  }


  public void setConnectTime(Integer connectTime) {
    this.connectTime = connectTime;
  }


  public HttpTestResult waitTime(Integer waitTime) {
    
    this.waitTime = waitTime;
    return this;
  }

   /**
   * Time elapsed between completion of request and first byte of response in milliseconds
   * @return waitTime
  **/
  @javax.annotation.Nullable
  public Integer getWaitTime() {
    return waitTime;
  }


  public void setWaitTime(Integer waitTime) {
    this.waitTime = waitTime;
  }


  public HttpTestResult receiveTime(Integer receiveTime) {
    
    this.receiveTime = receiveTime;
    return this;
  }

   /**
   * Elapsed time between first and last byte of response in milliseconds
   * @return receiveTime
  **/
  @javax.annotation.Nullable
  public Integer getReceiveTime() {
    return receiveTime;
  }


  public void setReceiveTime(Integer receiveTime) {
    this.receiveTime = receiveTime;
  }


  public HttpTestResult wireSize(Integer wireSize) {
    
    this.wireSize = wireSize;
    return this;
  }

   /**
   * Size of content in bytes
   * @return wireSize
  **/
  @javax.annotation.Nullable
  public Integer getWireSize() {
    return wireSize;
  }


  public void setWireSize(Integer wireSize) {
    this.wireSize = wireSize;
  }


  public HttpTestResult responseTime(Integer responseTime) {
    
    this.responseTime = responseTime;
    return this;
  }

   /**
   * Time to first byte in milliseconds
   * @return responseTime
  **/
  @javax.annotation.Nullable
  public Integer getResponseTime() {
    return responseTime;
  }


  public void setResponseTime(Integer responseTime) {
    this.responseTime = responseTime;
  }


  public HttpTestResult throughput(Double throughput) {
    
    this.throughput = throughput;
    return this;
  }

   /**
   * WireSize divided by receiveTime in byter per second
   * @return throughput
  **/
  @javax.annotation.Nullable
  public Double getThroughput() {
    return throughput;
  }


  public void setThroughput(Double throughput) {
    this.throughput = throughput;
  }


  public HttpTestResult totalTime(Integer totalTime) {
    
    this.totalTime = totalTime;
    return this;
  }

   /**
   * response time + receive time
   * @return totalTime
  **/
  @javax.annotation.Nullable
  public Integer getTotalTime() {
    return totalTime;
  }


  public void setTotalTime(Integer totalTime) {
    this.totalTime = totalTime;
  }


  public HttpTestResult headers(HttpTestResultHeaders headers) {
    
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  public HttpTestResultHeaders getHeaders() {
    return headers;
  }


  public void setHeaders(HttpTestResultHeaders headers) {
    this.headers = headers;
  }


   /**
   * Type of error encountered; corresponds to phase of connection
   * @return errorType
  **/
  @javax.annotation.Nullable
  public String getErrorType() {
    return errorType;
  }




   /**
   * Error details, if an error were encountered
   * @return errorDetails
  **/
  @javax.annotation.Nullable
  public String getErrorDetails() {
    return errorDetails;
  }




  public HttpTestResult sslCipher(String sslCipher) {
    
    this.sslCipher = sslCipher;
    return this;
  }

   /**
   * Cipher suite
   * @return sslCipher
  **/
  @javax.annotation.Nullable
  public String getSslCipher() {
    return sslCipher;
  }


  public void setSslCipher(String sslCipher) {
    this.sslCipher = sslCipher;
  }


  public HttpTestResult sslVersion(String sslVersion) {
    
    this.sslVersion = sslVersion;
    return this;
  }

   /**
   * TLS version
   * @return sslVersion
  **/
  @javax.annotation.Nullable
  public String getSslVersion() {
    return sslVersion;
  }


  public void setSslVersion(String sslVersion) {
    this.sslVersion = sslVersion;
  }


  public HttpTestResult sslCertificates(List<SslCert> sslCertificates) {
    
    this.sslCertificates = sslCertificates;
    return this;
  }

  public HttpTestResult addSslCertificatesItem(SslCert sslCertificatesItem) {
    if (this.sslCertificates == null) {
      this.sslCertificates = new ArrayList<>();
    }
    this.sslCertificates.add(sslCertificatesItem);
    return this;
  }

   /**
   * Get sslCertificates
   * @return sslCertificates
  **/
  @javax.annotation.Nullable
  public List<SslCert> getSslCertificates() {
    return sslCertificates;
  }


  public void setSslCertificates(List<SslCert> sslCertificates) {
    this.sslCertificates = sslCertificates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpTestResult httpTestResult = (HttpTestResult) o;
    return Objects.equals(this.date, httpTestResult.date) &&
        Objects.equals(this.roundId, httpTestResult.roundId) &&
        Objects.equals(this.links, httpTestResult.links) &&
        Objects.equals(this.agent, httpTestResult.agent) &&
        Objects.equals(this.serverIp, httpTestResult.serverIp) &&
        Objects.equals(this.responseCode, httpTestResult.responseCode) &&
        Objects.equals(this.numRedirects, httpTestResult.numRedirects) &&
        Objects.equals(this.redirectTime, httpTestResult.redirectTime) &&
        Objects.equals(this.dnsTime, httpTestResult.dnsTime) &&
        Objects.equals(this.sslTime, httpTestResult.sslTime) &&
        Objects.equals(this.connectTime, httpTestResult.connectTime) &&
        Objects.equals(this.waitTime, httpTestResult.waitTime) &&
        Objects.equals(this.receiveTime, httpTestResult.receiveTime) &&
        Objects.equals(this.wireSize, httpTestResult.wireSize) &&
        Objects.equals(this.responseTime, httpTestResult.responseTime) &&
        Objects.equals(this.throughput, httpTestResult.throughput) &&
        Objects.equals(this.totalTime, httpTestResult.totalTime) &&
        Objects.equals(this.headers, httpTestResult.headers) &&
        Objects.equals(this.errorType, httpTestResult.errorType) &&
        Objects.equals(this.errorDetails, httpTestResult.errorDetails) &&
        Objects.equals(this.sslCipher, httpTestResult.sslCipher) &&
        Objects.equals(this.sslVersion, httpTestResult.sslVersion) &&
        Objects.equals(this.sslCertificates, httpTestResult.sslCertificates);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, roundId, links, agent, serverIp, responseCode, numRedirects, redirectTime, dnsTime, sslTime, connectTime, waitTime, receiveTime, wireSize, responseTime, throughput, totalTime, headers, errorType, errorDetails, sslCipher, sslVersion, sslCertificates);
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
    sb.append("class HttpTestResult {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    numRedirects: ").append(toIndentedString(numRedirects)).append("\n");
    sb.append("    redirectTime: ").append(toIndentedString(redirectTime)).append("\n");
    sb.append("    dnsTime: ").append(toIndentedString(dnsTime)).append("\n");
    sb.append("    sslTime: ").append(toIndentedString(sslTime)).append("\n");
    sb.append("    connectTime: ").append(toIndentedString(connectTime)).append("\n");
    sb.append("    waitTime: ").append(toIndentedString(waitTime)).append("\n");
    sb.append("    receiveTime: ").append(toIndentedString(receiveTime)).append("\n");
    sb.append("    wireSize: ").append(toIndentedString(wireSize)).append("\n");
    sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    sslCipher: ").append(toIndentedString(sslCipher)).append("\n");
    sb.append("    sslVersion: ").append(toIndentedString(sslVersion)).append("\n");
    sb.append("    sslCertificates: ").append(toIndentedString(sslCertificates)).append("\n");
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
    openapiFields.add("agent");
    openapiFields.add("serverIp");
    openapiFields.add("responseCode");
    openapiFields.add("numRedirects");
    openapiFields.add("redirectTime");
    openapiFields.add("dnsTime");
    openapiFields.add("sslTime");
    openapiFields.add("connectTime");
    openapiFields.add("waitTime");
    openapiFields.add("receiveTime");
    openapiFields.add("wireSize");
    openapiFields.add("responseTime");
    openapiFields.add("throughput");
    openapiFields.add("totalTime");
    openapiFields.add("headers");
    openapiFields.add("errorType");
    openapiFields.add("errorDetails");
    openapiFields.add("sslCipher");
    openapiFields.add("sslVersion");
    openapiFields.add("sslCertificates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HttpTestResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HttpTestResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HttpTestResult is not found in the empty JSON string", HttpTestResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HttpTestResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HttpTestResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `agent`
      if (jsonObj.get("agent") != null && !jsonObj.get("agent").isJsonNull()) {
        Agent.validateJsonElement(jsonObj.get("agent"));
      }
      if ((jsonObj.get("serverIp") != null && !jsonObj.get("serverIp").isJsonNull()) && !jsonObj.get("serverIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverIp").toString()));
      }
      // validate the optional field `headers`
      if (jsonObj.get("headers") != null && !jsonObj.get("headers").isJsonNull()) {
        HttpTestResultHeaders.validateJsonElement(jsonObj.get("headers"));
      }
      if ((jsonObj.get("errorType") != null && !jsonObj.get("errorType").isJsonNull()) && !jsonObj.get("errorType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorType").toString()));
      }
      if ((jsonObj.get("errorDetails") != null && !jsonObj.get("errorDetails").isJsonNull()) && !jsonObj.get("errorDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorDetails").toString()));
      }
      if ((jsonObj.get("sslCipher") != null && !jsonObj.get("sslCipher").isJsonNull()) && !jsonObj.get("sslCipher").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sslCipher` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sslCipher").toString()));
      }
      if ((jsonObj.get("sslVersion") != null && !jsonObj.get("sslVersion").isJsonNull()) && !jsonObj.get("sslVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sslVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sslVersion").toString()));
      }
      if (jsonObj.get("sslCertificates") != null && !jsonObj.get("sslCertificates").isJsonNull()) {
        JsonArray jsonArraysslCertificates = jsonObj.getAsJsonArray("sslCertificates");
        if (jsonArraysslCertificates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sslCertificates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sslCertificates` to be an array in the JSON string but got `%s`", jsonObj.get("sslCertificates").toString()));
          }

          // validate the optional field `sslCertificates` (array)
          for (int i = 0; i < jsonArraysslCertificates.size(); i++) {
            SslCert.validateJsonElement(jsonArraysslCertificates.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HttpTestResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HttpTestResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HttpTestResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HttpTestResult.class));

       return (TypeAdapter<T>) new TypeAdapter<HttpTestResult>() {
           @Override
           public void write(JsonWriter out, HttpTestResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HttpTestResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HttpTestResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HttpTestResult
  * @throws IOException if the JSON string is invalid with respect to HttpTestResult
  */
  public static HttpTestResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HttpTestResult.class);
  }

 /**
  * Convert an instance of HttpTestResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
