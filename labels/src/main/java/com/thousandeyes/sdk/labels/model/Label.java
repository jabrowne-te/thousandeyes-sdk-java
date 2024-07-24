/*
 * Labels API
 * ### Overview This is API for the Labels API (formerly called groups).
 *
 * The version of the OpenAPI document: 7.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.labels.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.labels.model.LabelType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Label
 */
@JsonPropertyOrder({
  Label.JSON_PROPERTY_LABEL_ID,
  Label.JSON_PROPERTY_IS_BUILT_IN,
  Label.JSON_PROPERTY_NAME,
  Label.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class Label {
  public static final String JSON_PROPERTY_LABEL_ID = "labelId";
  private String labelId;

  public static final String JSON_PROPERTY_IS_BUILT_IN = "isBuiltIn";
  private Boolean isBuiltIn;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private LabelType type;

  public Label() { 
  }

  public Label labelId(String labelId) {
    this.labelId = labelId;
    return this;
  }

   /**
   * Unique ID of the label; this number is negative for built-in labels. Query &#x60;/v7/labels/{type}/{id}&#x60; endpoint to see the list of agent/test/dashboard ids with this label. 
   * @return labelId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabelId() {
    return labelId;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }


  public Label isBuiltIn(Boolean isBuiltIn) {
    this.isBuiltIn = isBuiltIn;
    return this;
  }

   /**
   * &#x60;true&#x60; for built-in labels, and &#x60;false&#x60; for user-created labels. Note that built-in labels are read-only. 
   * @return isBuiltIn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BUILT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBuiltIn() {
    return isBuiltIn;
  }


  @JsonProperty(JSON_PROPERTY_IS_BUILT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsBuiltIn(Boolean isBuiltIn) {
    this.isBuiltIn = isBuiltIn;
  }


  public Label name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the new label - this must be unique.
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


  public Label type(LabelType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LabelType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(LabelType type) {
    this.type = type;
  }


  /**
   * Return true if this Label object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(this.labelId, label.labelId) &&
        Objects.equals(this.isBuiltIn, label.isBuiltIn) &&
        Objects.equals(this.name, label.name) &&
        Objects.equals(this.type, label.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelId, isBuiltIn, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

