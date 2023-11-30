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
import java.io.IOException;
import java.util.Arrays;

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
 * NetworkWirelessProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:26.016985Z[Europe/London]")
public class NetworkWirelessProfile {
  public static final String SERIALIZED_NAME_SSID = "ssid";
  @SerializedName(SERIALIZED_NAME_SSID)
  private String ssid;

  public static final String SERIALIZED_NAME_BSSID = "bssid";
  @SerializedName(SERIALIZED_NAME_BSSID)
  private String bssid;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private Integer channel;

  public static final String SERIALIZED_NAME_PHY_MODE = "phyMode";
  @SerializedName(SERIALIZED_NAME_PHY_MODE)
  private String phyMode;

  public static final String SERIALIZED_NAME_RSSI = "rssi";
  @SerializedName(SERIALIZED_NAME_RSSI)
  private Integer rssi;

  public static final String SERIALIZED_NAME_NOISE = "noise";
  @SerializedName(SERIALIZED_NAME_NOISE)
  private Integer noise;

  public static final String SERIALIZED_NAME_QUALITY = "quality";
  @SerializedName(SERIALIZED_NAME_QUALITY)
  private Integer quality;

  public static final String SERIALIZED_NAME_TX_RATE = "txRate";
  @SerializedName(SERIALIZED_NAME_TX_RATE)
  private Integer txRate;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public NetworkWirelessProfile() {
  }

  
  public NetworkWirelessProfile(
     String ssid, 
     String bssid, 
     Integer channel, 
     String phyMode, 
     Integer rssi, 
     Integer noise, 
     Integer quality, 
     Integer txRate, 
     String vendor
  ) {
    this();
    this.ssid = ssid;
    this.bssid = bssid;
    this.channel = channel;
    this.phyMode = phyMode;
    this.rssi = rssi;
    this.noise = noise;
    this.quality = quality;
    this.txRate = txRate;
    this.vendor = vendor;
  }

   /**
   * Wireless network SSID.
   * @return ssid
  **/
  @javax.annotation.Nullable
  public String getSsid() {
    return ssid;
  }




   /**
   * Wireless network BSSID.
   * @return bssid
  **/
  @javax.annotation.Nullable
  public String getBssid() {
    return bssid;
  }




   /**
   * Wireless network channel.
   * @return channel
  **/
  @javax.annotation.Nullable
  public Integer getChannel() {
    return channel;
  }




   /**
   * Wireless network PHY mode.
   * @return phyMode
  **/
  @javax.annotation.Nullable
  public String getPhyMode() {
    return phyMode;
  }




   /**
   * Wireless network RSSI.
   * @return rssi
  **/
  @javax.annotation.Nullable
  public Integer getRssi() {
    return rssi;
  }




   /**
   * Wireless network noise.
   * @return noise
  **/
  @javax.annotation.Nullable
  public Integer getNoise() {
    return noise;
  }




   /**
   * Wireless network quality.
   * @return quality
  **/
  @javax.annotation.Nullable
  public Integer getQuality() {
    return quality;
  }




   /**
   * Wireless network transmitted rate.
   * @return txRate
  **/
  @javax.annotation.Nullable
  public Integer getTxRate() {
    return txRate;
  }




   /**
   * Wireless network device vendor.
   * @return vendor
  **/
  @javax.annotation.Nullable
  public String getVendor() {
    return vendor;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkWirelessProfile networkWirelessProfile = (NetworkWirelessProfile) o;
    return Objects.equals(this.ssid, networkWirelessProfile.ssid) &&
        Objects.equals(this.bssid, networkWirelessProfile.bssid) &&
        Objects.equals(this.channel, networkWirelessProfile.channel) &&
        Objects.equals(this.phyMode, networkWirelessProfile.phyMode) &&
        Objects.equals(this.rssi, networkWirelessProfile.rssi) &&
        Objects.equals(this.noise, networkWirelessProfile.noise) &&
        Objects.equals(this.quality, networkWirelessProfile.quality) &&
        Objects.equals(this.txRate, networkWirelessProfile.txRate) &&
        Objects.equals(this.vendor, networkWirelessProfile.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssid, bssid, channel, phyMode, rssi, noise, quality, txRate, vendor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkWirelessProfile {\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("    bssid: ").append(toIndentedString(bssid)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    phyMode: ").append(toIndentedString(phyMode)).append("\n");
    sb.append("    rssi: ").append(toIndentedString(rssi)).append("\n");
    sb.append("    noise: ").append(toIndentedString(noise)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    txRate: ").append(toIndentedString(txRate)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
    openapiFields.add("ssid");
    openapiFields.add("bssid");
    openapiFields.add("channel");
    openapiFields.add("phyMode");
    openapiFields.add("rssi");
    openapiFields.add("noise");
    openapiFields.add("quality");
    openapiFields.add("txRate");
    openapiFields.add("vendor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NetworkWirelessProfile
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NetworkWirelessProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NetworkWirelessProfile is not found in the empty JSON string", NetworkWirelessProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NetworkWirelessProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NetworkWirelessProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ssid") != null && !jsonObj.get("ssid").isJsonNull()) && !jsonObj.get("ssid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ssid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ssid").toString()));
      }
      if ((jsonObj.get("bssid") != null && !jsonObj.get("bssid").isJsonNull()) && !jsonObj.get("bssid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bssid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bssid").toString()));
      }
      if ((jsonObj.get("phyMode") != null && !jsonObj.get("phyMode").isJsonNull()) && !jsonObj.get("phyMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phyMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phyMode").toString()));
      }
      if ((jsonObj.get("vendor") != null && !jsonObj.get("vendor").isJsonNull()) && !jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NetworkWirelessProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NetworkWirelessProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NetworkWirelessProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NetworkWirelessProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<NetworkWirelessProfile>() {
           @Override
           public void write(JsonWriter out, NetworkWirelessProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NetworkWirelessProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NetworkWirelessProfile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NetworkWirelessProfile
  * @throws IOException if the JSON string is invalid with respect to NetworkWirelessProfile
  */
  public static NetworkWirelessProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NetworkWirelessProfile.class);
  }

 /**
  * Convert an instance of NetworkWirelessProfile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
