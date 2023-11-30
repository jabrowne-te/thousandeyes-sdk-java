/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.
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
import com.thousandeyes.api.model.VpnType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * EndpointVpnProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:21.121994Z[Europe/London]")
public class EndpointVpnProfile {
  public static final String SERIALIZED_NAME_INTERFACE_NAME = "interfaceName";
  @SerializedName(SERIALIZED_NAME_INTERFACE_NAME)
  private String interfaceName;

  public static final String SERIALIZED_NAME_VPN_TYPE = "vpnType";
  @SerializedName(SERIALIZED_NAME_VPN_TYPE)
  private VpnType vpnType;

  public static final String SERIALIZED_NAME_VPN_GATEWAY_ADDRESS = "vpnGatewayAddress";
  @SerializedName(SERIALIZED_NAME_VPN_GATEWAY_ADDRESS)
  private String vpnGatewayAddress;

  public static final String SERIALIZED_NAME_VPN_CLIENT_ADDRESSES = "vpnClientAddresses";
  @SerializedName(SERIALIZED_NAME_VPN_CLIENT_ADDRESSES)
  private List<String> vpnClientAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_VPN_CLIENT_NETWORK_RANGE = "vpnClientNetworkRange";
  @SerializedName(SERIALIZED_NAME_VPN_CLIENT_NETWORK_RANGE)
  private List<String> vpnClientNetworkRange = new ArrayList<>();

  public EndpointVpnProfile() {
  }

  public EndpointVpnProfile interfaceName(String interfaceName) {
    
    this.interfaceName = interfaceName;
    return this;
  }

   /**
   * Interface name associated with &#x60;interfaceProfile&#x60;.
   * @return interfaceName
  **/
  @javax.annotation.Nullable
  public String getInterfaceName() {
    return interfaceName;
  }


  public void setInterfaceName(String interfaceName) {
    this.interfaceName = interfaceName;
  }


  public EndpointVpnProfile vpnType(VpnType vpnType) {
    
    this.vpnType = vpnType;
    return this;
  }

   /**
   * Get vpnType
   * @return vpnType
  **/
  @javax.annotation.Nullable
  public VpnType getVpnType() {
    return vpnType;
  }


  public void setVpnType(VpnType vpnType) {
    this.vpnType = vpnType;
  }


  public EndpointVpnProfile vpnGatewayAddress(String vpnGatewayAddress) {
    
    this.vpnGatewayAddress = vpnGatewayAddress;
    return this;
  }

   /**
   * IP address of the VPN gateway.
   * @return vpnGatewayAddress
  **/
  @javax.annotation.Nullable
  public String getVpnGatewayAddress() {
    return vpnGatewayAddress;
  }


  public void setVpnGatewayAddress(String vpnGatewayAddress) {
    this.vpnGatewayAddress = vpnGatewayAddress;
  }


  public EndpointVpnProfile vpnClientAddresses(List<String> vpnClientAddresses) {
    
    this.vpnClientAddresses = vpnClientAddresses;
    return this;
  }

  public EndpointVpnProfile addVpnClientAddressesItem(String vpnClientAddressesItem) {
    if (this.vpnClientAddresses == null) {
      this.vpnClientAddresses = new ArrayList<>();
    }
    this.vpnClientAddresses.add(vpnClientAddressesItem);
    return this;
  }

   /**
   * List of private IP addresses assigned to the device, by the VPN server.
   * @return vpnClientAddresses
  **/
  @javax.annotation.Nonnull
  public List<String> getVpnClientAddresses() {
    return vpnClientAddresses;
  }


  public void setVpnClientAddresses(List<String> vpnClientAddresses) {
    this.vpnClientAddresses = vpnClientAddresses;
  }


  public EndpointVpnProfile vpnClientNetworkRange(List<String> vpnClientNetworkRange) {
    
    this.vpnClientNetworkRange = vpnClientNetworkRange;
    return this;
  }

  public EndpointVpnProfile addVpnClientNetworkRangeItem(String vpnClientNetworkRangeItem) {
    if (this.vpnClientNetworkRange == null) {
      this.vpnClientNetworkRange = new ArrayList<>();
    }
    this.vpnClientNetworkRange.add(vpnClientNetworkRangeItem);
    return this;
  }

   /**
   * List of private networks assigned to the device, by the VPN server.
   * @return vpnClientNetworkRange
  **/
  @javax.annotation.Nonnull
  public List<String> getVpnClientNetworkRange() {
    return vpnClientNetworkRange;
  }


  public void setVpnClientNetworkRange(List<String> vpnClientNetworkRange) {
    this.vpnClientNetworkRange = vpnClientNetworkRange;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointVpnProfile endpointVpnProfile = (EndpointVpnProfile) o;
    return Objects.equals(this.interfaceName, endpointVpnProfile.interfaceName) &&
        Objects.equals(this.vpnType, endpointVpnProfile.vpnType) &&
        Objects.equals(this.vpnGatewayAddress, endpointVpnProfile.vpnGatewayAddress) &&
        Objects.equals(this.vpnClientAddresses, endpointVpnProfile.vpnClientAddresses) &&
        Objects.equals(this.vpnClientNetworkRange, endpointVpnProfile.vpnClientNetworkRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interfaceName, vpnType, vpnGatewayAddress, vpnClientAddresses, vpnClientNetworkRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointVpnProfile {\n");
    sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
    sb.append("    vpnType: ").append(toIndentedString(vpnType)).append("\n");
    sb.append("    vpnGatewayAddress: ").append(toIndentedString(vpnGatewayAddress)).append("\n");
    sb.append("    vpnClientAddresses: ").append(toIndentedString(vpnClientAddresses)).append("\n");
    sb.append("    vpnClientNetworkRange: ").append(toIndentedString(vpnClientNetworkRange)).append("\n");
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
    openapiFields.add("interfaceName");
    openapiFields.add("vpnType");
    openapiFields.add("vpnGatewayAddress");
    openapiFields.add("vpnClientAddresses");
    openapiFields.add("vpnClientNetworkRange");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vpnClientAddresses");
    openapiRequiredFields.add("vpnClientNetworkRange");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointVpnProfile
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointVpnProfile.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointVpnProfile is not found in the empty JSON string", EndpointVpnProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointVpnProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointVpnProfile` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EndpointVpnProfile.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("interfaceName") != null && !jsonObj.get("interfaceName").isJsonNull()) && !jsonObj.get("interfaceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interfaceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interfaceName").toString()));
      }
      if ((jsonObj.get("vpnGatewayAddress") != null && !jsonObj.get("vpnGatewayAddress").isJsonNull()) && !jsonObj.get("vpnGatewayAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpnGatewayAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpnGatewayAddress").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("vpnClientAddresses") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("vpnClientAddresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpnClientAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("vpnClientAddresses").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("vpnClientNetworkRange") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("vpnClientNetworkRange").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpnClientNetworkRange` to be an array in the JSON string but got `%s`", jsonObj.get("vpnClientNetworkRange").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointVpnProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointVpnProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointVpnProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointVpnProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointVpnProfile>() {
           @Override
           public void write(JsonWriter out, EndpointVpnProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointVpnProfile read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointVpnProfile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointVpnProfile
  * @throws IOException if the JSON string is invalid with respect to EndpointVpnProfile
  */
  public static EndpointVpnProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointVpnProfile.class);
  }

 /**
  * Convert an instance of EndpointVpnProfile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
