/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
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
import com.thousandeyes.api.model.NetworkPing;
import com.thousandeyes.api.model.NetworkProfile;
import com.thousandeyes.api.model.NetworkTopologyType;
import com.thousandeyes.api.model.RealUserTestCoordinates;
import com.thousandeyes.api.model.SystemMetrics;
import com.thousandeyes.api.model.TcpConnect;
import com.thousandeyes.api.model.Traceroute;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
 * LocalNetworkTopologyResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:26.016985Z[Europe/London]")
public class LocalNetworkTopologyResult {
  public static final String SERIALIZED_NAME_AGENT_ID = "agentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private UUID agentId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_NETWORK_TOPOLOGY_ID = "networkTopologyId";
  @SerializedName(SERIALIZED_NAME_NETWORK_TOPOLOGY_ID)
  private String networkTopologyId;

  public static final String SERIALIZED_NAME_ROUND_ID = "roundId";
  @SerializedName(SERIALIZED_NAME_ROUND_ID)
  private Integer roundId;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_TARGET_PORT = "targetPort";
  @SerializedName(SERIALIZED_NAME_TARGET_PORT)
  private BigDecimal targetPort;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private NetworkTopologyType type;

  public static final String SERIALIZED_NAME_ICMP_PING = "icmpPing";
  @SerializedName(SERIALIZED_NAME_ICMP_PING)
  private NetworkPing icmpPing;

  public static final String SERIALIZED_NAME_IS_ICMP_BLOCKED = "isIcmpBlocked";
  @SerializedName(SERIALIZED_NAME_IS_ICMP_BLOCKED)
  private Boolean isIcmpBlocked;

  public static final String SERIALIZED_NAME_TCP_CONNECT = "tcpConnect";
  @SerializedName(SERIALIZED_NAME_TCP_CONNECT)
  private TcpConnect tcpConnect;

  public static final String SERIALIZED_NAME_SYSTEM_METRICS = "systemMetrics";
  @SerializedName(SERIALIZED_NAME_SYSTEM_METRICS)
  private SystemMetrics systemMetrics;

  public static final String SERIALIZED_NAME_COORDINATES = "coordinates";
  @SerializedName(SERIALIZED_NAME_COORDINATES)
  private RealUserTestCoordinates coordinates;

  public static final String SERIALIZED_NAME_NETWORK_PROFILE = "networkProfile";
  @SerializedName(SERIALIZED_NAME_NETWORK_PROFILE)
  private NetworkProfile networkProfile;

  public static final String SERIALIZED_NAME_ICMP_TRACEROUTE = "icmpTraceroute";
  @SerializedName(SERIALIZED_NAME_ICMP_TRACEROUTE)
  private Traceroute icmpTraceroute;

  public static final String SERIALIZED_NAME_ICMP_TRACEROUTES = "icmpTraceroutes";
  @SerializedName(SERIALIZED_NAME_ICMP_TRACEROUTES)
  private List<Traceroute> icmpTraceroutes;

  public LocalNetworkTopologyResult() {
  }

  
  public LocalNetworkTopologyResult(
     UUID agentId, 
     OffsetDateTime date, 
     String networkTopologyId, 
     Integer roundId, 
     String target, 
     BigDecimal targetPort, 
     NetworkTopologyType type, 
     Boolean isIcmpBlocked
  ) {
    this();
    this.agentId = agentId;
    this.date = date;
    this.networkTopologyId = networkTopologyId;
    this.roundId = roundId;
    this.target = target;
    this.targetPort = targetPort;
    this.type = type;
    this.isIcmpBlocked = isIcmpBlocked;
  }

   /**
   * Unique ID of endpoint agent, from &#x60;/endpoint/agents&#x60; endpoint.
   * @return agentId
  **/
  @javax.annotation.Nullable
  public UUID getAgentId() {
    return agentId;
  }




   /**
   * UTC date when endpoint network topology took place (ISO date-time format).
   * @return date
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }




   /**
   * Network topology ID. Each network topology occurrence has a unique ID.
   * @return networkTopologyId
  **/
  @javax.annotation.Nullable
  public String getNetworkTopologyId() {
    return networkTopologyId;
  }




   /**
   * Epoch time (seconds) indicating the start time of the round.
   * @return roundId
  **/
  @javax.annotation.Nullable
  public Integer getRoundId() {
    return roundId;
  }




   /**
   * IP of the target the network topology was performed against. This is typically a default gateway, proxy or VPN endpoint.
   * @return target
  **/
  @javax.annotation.Nullable
  public String getTarget() {
    return target;
  }




   /**
   * Port of the target the network topology was performed against.
   * @return targetPort
  **/
  @javax.annotation.Nullable
  public BigDecimal getTargetPort() {
    return targetPort;
  }




   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public NetworkTopologyType getType() {
    return type;
  }




  public LocalNetworkTopologyResult icmpPing(NetworkPing icmpPing) {
    
    this.icmpPing = icmpPing;
    return this;
  }

   /**
   * Get icmpPing
   * @return icmpPing
  **/
  @javax.annotation.Nullable
  public NetworkPing getIcmpPing() {
    return icmpPing;
  }


  public void setIcmpPing(NetworkPing icmpPing) {
    this.icmpPing = icmpPing;
  }


   /**
   * Set to &#x60;true&#x60; if network target is blocking ICMP echo (ping) queries.
   * @return isIcmpBlocked
  **/
  @javax.annotation.Nullable
  public Boolean getIsIcmpBlocked() {
    return isIcmpBlocked;
  }




  public LocalNetworkTopologyResult tcpConnect(TcpConnect tcpConnect) {
    
    this.tcpConnect = tcpConnect;
    return this;
  }

   /**
   * Get tcpConnect
   * @return tcpConnect
  **/
  @javax.annotation.Nullable
  public TcpConnect getTcpConnect() {
    return tcpConnect;
  }


  public void setTcpConnect(TcpConnect tcpConnect) {
    this.tcpConnect = tcpConnect;
  }


  public LocalNetworkTopologyResult systemMetrics(SystemMetrics systemMetrics) {
    
    this.systemMetrics = systemMetrics;
    return this;
  }

   /**
   * Get systemMetrics
   * @return systemMetrics
  **/
  @javax.annotation.Nullable
  public SystemMetrics getSystemMetrics() {
    return systemMetrics;
  }


  public void setSystemMetrics(SystemMetrics systemMetrics) {
    this.systemMetrics = systemMetrics;
  }


  public LocalNetworkTopologyResult coordinates(RealUserTestCoordinates coordinates) {
    
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @javax.annotation.Nullable
  public RealUserTestCoordinates getCoordinates() {
    return coordinates;
  }


  public void setCoordinates(RealUserTestCoordinates coordinates) {
    this.coordinates = coordinates;
  }


  public LocalNetworkTopologyResult networkProfile(NetworkProfile networkProfile) {
    
    this.networkProfile = networkProfile;
    return this;
  }

   /**
   * Get networkProfile
   * @return networkProfile
  **/
  @javax.annotation.Nullable
  public NetworkProfile getNetworkProfile() {
    return networkProfile;
  }


  public void setNetworkProfile(NetworkProfile networkProfile) {
    this.networkProfile = networkProfile;
  }


  public LocalNetworkTopologyResult icmpTraceroute(Traceroute icmpTraceroute) {
    
    this.icmpTraceroute = icmpTraceroute;
    return this;
  }

   /**
   * Get icmpTraceroute
   * @return icmpTraceroute
  **/
  @javax.annotation.Nullable
  public Traceroute getIcmpTraceroute() {
    return icmpTraceroute;
  }


  public void setIcmpTraceroute(Traceroute icmpTraceroute) {
    this.icmpTraceroute = icmpTraceroute;
  }


  public LocalNetworkTopologyResult icmpTraceroutes(List<Traceroute> icmpTraceroutes) {
    
    this.icmpTraceroutes = icmpTraceroutes;
    return this;
  }

  public LocalNetworkTopologyResult addIcmpTraceroutesItem(Traceroute icmpTraceroutesItem) {
    if (this.icmpTraceroutes == null) {
      this.icmpTraceroutes = new ArrayList<>();
    }
    this.icmpTraceroutes.add(icmpTraceroutesItem);
    return this;
  }

   /**
   * Get icmpTraceroutes
   * @return icmpTraceroutes
  **/
  @javax.annotation.Nullable
  public List<Traceroute> getIcmpTraceroutes() {
    return icmpTraceroutes;
  }


  public void setIcmpTraceroutes(List<Traceroute> icmpTraceroutes) {
    this.icmpTraceroutes = icmpTraceroutes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalNetworkTopologyResult localNetworkTopologyResult = (LocalNetworkTopologyResult) o;
    return Objects.equals(this.agentId, localNetworkTopologyResult.agentId) &&
        Objects.equals(this.date, localNetworkTopologyResult.date) &&
        Objects.equals(this.networkTopologyId, localNetworkTopologyResult.networkTopologyId) &&
        Objects.equals(this.roundId, localNetworkTopologyResult.roundId) &&
        Objects.equals(this.target, localNetworkTopologyResult.target) &&
        Objects.equals(this.targetPort, localNetworkTopologyResult.targetPort) &&
        Objects.equals(this.type, localNetworkTopologyResult.type) &&
        Objects.equals(this.icmpPing, localNetworkTopologyResult.icmpPing) &&
        Objects.equals(this.isIcmpBlocked, localNetworkTopologyResult.isIcmpBlocked) &&
        Objects.equals(this.tcpConnect, localNetworkTopologyResult.tcpConnect) &&
        Objects.equals(this.systemMetrics, localNetworkTopologyResult.systemMetrics) &&
        Objects.equals(this.coordinates, localNetworkTopologyResult.coordinates) &&
        Objects.equals(this.networkProfile, localNetworkTopologyResult.networkProfile) &&
        Objects.equals(this.icmpTraceroute, localNetworkTopologyResult.icmpTraceroute) &&
        Objects.equals(this.icmpTraceroutes, localNetworkTopologyResult.icmpTraceroutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, date, networkTopologyId, roundId, target, targetPort, type, icmpPing, isIcmpBlocked, tcpConnect, systemMetrics, coordinates, networkProfile, icmpTraceroute, icmpTraceroutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalNetworkTopologyResult {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    networkTopologyId: ").append(toIndentedString(networkTopologyId)).append("\n");
    sb.append("    roundId: ").append(toIndentedString(roundId)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    icmpPing: ").append(toIndentedString(icmpPing)).append("\n");
    sb.append("    isIcmpBlocked: ").append(toIndentedString(isIcmpBlocked)).append("\n");
    sb.append("    tcpConnect: ").append(toIndentedString(tcpConnect)).append("\n");
    sb.append("    systemMetrics: ").append(toIndentedString(systemMetrics)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    networkProfile: ").append(toIndentedString(networkProfile)).append("\n");
    sb.append("    icmpTraceroute: ").append(toIndentedString(icmpTraceroute)).append("\n");
    sb.append("    icmpTraceroutes: ").append(toIndentedString(icmpTraceroutes)).append("\n");
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
    openapiFields.add("agentId");
    openapiFields.add("date");
    openapiFields.add("networkTopologyId");
    openapiFields.add("roundId");
    openapiFields.add("target");
    openapiFields.add("targetPort");
    openapiFields.add("type");
    openapiFields.add("icmpPing");
    openapiFields.add("isIcmpBlocked");
    openapiFields.add("tcpConnect");
    openapiFields.add("systemMetrics");
    openapiFields.add("coordinates");
    openapiFields.add("networkProfile");
    openapiFields.add("icmpTraceroute");
    openapiFields.add("icmpTraceroutes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LocalNetworkTopologyResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LocalNetworkTopologyResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocalNetworkTopologyResult is not found in the empty JSON string", LocalNetworkTopologyResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LocalNetworkTopologyResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LocalNetworkTopologyResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("agentId") != null && !jsonObj.get("agentId").isJsonNull()) && !jsonObj.get("agentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agentId").toString()));
      }
      if ((jsonObj.get("networkTopologyId") != null && !jsonObj.get("networkTopologyId").isJsonNull()) && !jsonObj.get("networkTopologyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkTopologyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkTopologyId").toString()));
      }
      if ((jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) && !jsonObj.get("target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target").toString()));
      }
      // validate the optional field `icmpPing`
      if (jsonObj.get("icmpPing") != null && !jsonObj.get("icmpPing").isJsonNull()) {
        NetworkPing.validateJsonElement(jsonObj.get("icmpPing"));
      }
      // validate the optional field `tcpConnect`
      if (jsonObj.get("tcpConnect") != null && !jsonObj.get("tcpConnect").isJsonNull()) {
        TcpConnect.validateJsonElement(jsonObj.get("tcpConnect"));
      }
      // validate the optional field `systemMetrics`
      if (jsonObj.get("systemMetrics") != null && !jsonObj.get("systemMetrics").isJsonNull()) {
        SystemMetrics.validateJsonElement(jsonObj.get("systemMetrics"));
      }
      // validate the optional field `coordinates`
      if (jsonObj.get("coordinates") != null && !jsonObj.get("coordinates").isJsonNull()) {
        RealUserTestCoordinates.validateJsonElement(jsonObj.get("coordinates"));
      }
      // validate the optional field `networkProfile`
      if (jsonObj.get("networkProfile") != null && !jsonObj.get("networkProfile").isJsonNull()) {
        NetworkProfile.validateJsonElement(jsonObj.get("networkProfile"));
      }
      // validate the optional field `icmpTraceroute`
      if (jsonObj.get("icmpTraceroute") != null && !jsonObj.get("icmpTraceroute").isJsonNull()) {
        Traceroute.validateJsonElement(jsonObj.get("icmpTraceroute"));
      }
      if (jsonObj.get("icmpTraceroutes") != null && !jsonObj.get("icmpTraceroutes").isJsonNull()) {
        JsonArray jsonArrayicmpTraceroutes = jsonObj.getAsJsonArray("icmpTraceroutes");
        if (jsonArrayicmpTraceroutes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("icmpTraceroutes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `icmpTraceroutes` to be an array in the JSON string but got `%s`", jsonObj.get("icmpTraceroutes").toString()));
          }

          // validate the optional field `icmpTraceroutes` (array)
          for (int i = 0; i < jsonArrayicmpTraceroutes.size(); i++) {
            Traceroute.validateJsonElement(jsonArrayicmpTraceroutes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalNetworkTopologyResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalNetworkTopologyResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalNetworkTopologyResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalNetworkTopologyResult.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalNetworkTopologyResult>() {
           @Override
           public void write(JsonWriter out, LocalNetworkTopologyResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalNetworkTopologyResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalNetworkTopologyResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalNetworkTopologyResult
  * @throws IOException if the JSON string is invalid with respect to LocalNetworkTopologyResult
  */
  public static LocalNetworkTopologyResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalNetworkTopologyResult.class);
  }

 /**
  * Convert an instance of LocalNetworkTopologyResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
