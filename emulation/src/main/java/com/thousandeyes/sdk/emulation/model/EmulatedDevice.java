/*
 * Emulation API
 * The Emulation API facilitates the retrieval of user-agent strings for HTTP, pageload, and transaction tests. It also enables the retrieval and addition of emulated devices for pageload and transaction tests.  To access Emulation API endpoints, the following permissions are required:  * `Settings Tests Read` for read operations. * `Settings Tests Update` for write operations. 
 *
 * The version of the OpenAPI document: 7.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.emulation.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.emulation.model.EmulatedDeviceCategory;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EmulatedDevice
 */
@JsonPropertyOrder({
  EmulatedDevice.JSON_PROPERTY_CATEGORY,
  EmulatedDevice.JSON_PROPERTY_WIDTH,
  EmulatedDevice.JSON_PROPERTY_HEIGHT
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class EmulatedDevice {
  public static final String JSON_PROPERTY_CATEGORY = "category";
  private EmulatedDeviceCategory category;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public EmulatedDevice() { 
  }

  public EmulatedDevice category(EmulatedDeviceCategory category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EmulatedDeviceCategory getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategory(EmulatedDeviceCategory category) {
    this.category = category;
  }


  public EmulatedDevice width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the display of the emulated device.
   * minimum: 50
   * maximum: 9999
   * @return width
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public EmulatedDevice height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the display of the emulated device.
   * minimum: 50
   * maximum: 9999
   * @return height
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   * Return true if this EmulatedDevice object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmulatedDevice emulatedDevice = (EmulatedDevice) o;
    return Objects.equals(this.category, emulatedDevice.category) &&
        Objects.equals(this.width, emulatedDevice.width) &&
        Objects.equals(this.height, emulatedDevice.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmulatedDevice {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

