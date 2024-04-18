/*
 * Dashboards API
 * Manage ThousandEyes Dashboards
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.dashboards.model.ApiReportDataComponentLabelMap;
import com.thousandeyes.api.dashboards.model.ApiWidgetsDataV2;
import com.thousandeyes.api.dashboards.model.SelfLinksLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SnapshotDataByWidget200Response
 */
@JsonPropertyOrder({
  SnapshotDataByWidget200Response.JSON_PROPERTY_START_DATE,
  SnapshotDataByWidget200Response.JSON_PROPERTY_END_DATE,
  SnapshotDataByWidget200Response.JSON_PROPERTY_GROUP_LABELS,
  SnapshotDataByWidget200Response.JSON_PROPERTY_BIN_SIZE,
  SnapshotDataByWidget200Response.JSON_PROPERTY_DATA,
  SnapshotDataByWidget200Response.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:02.220586+01:00[Europe/Lisbon]")
public class SnapshotDataByWidget200Response {
  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_GROUP_LABELS = "groupLabels";
  private List<ApiReportDataComponentLabelMap> groupLabels;

  public static final String JSON_PROPERTY_BIN_SIZE = "binSize";
  private Long binSize;

  public static final String JSON_PROPERTY_DATA = "data";
  private ApiWidgetsDataV2 data;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinksLinks links;

  public SnapshotDataByWidget200Response() { 
  }

  @JsonCreator
  public SnapshotDataByWidget200Response(
    @JsonProperty(JSON_PROPERTY_START_DATE) OffsetDateTime startDate, 
    @JsonProperty(JSON_PROPERTY_END_DATE) OffsetDateTime endDate
  ) {
  this();
    this.startDate = startDate;
    this.endDate = endDate;
  }

   /**
   * (Optional) When passing &#x60;window&#x60; or &#x60;startDate&#x60; parameter,  the client will also receive the &#x60;startDate&#x60; field indicating the UTC start date of the data&#39;s time range being retrieved  (ISO date-time format).
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }




   /**
   * (Optional) When passing &#x60;window&#x60; or &#x60;endDate&#x60; parameter,  the client will also receive the &#x60;endDate&#x60; field indicating the UTC end date of the data&#39;s time range being retrieved  (ISO date-time format).
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }




  public SnapshotDataByWidget200Response groupLabels(List<ApiReportDataComponentLabelMap> groupLabels) {
    this.groupLabels = groupLabels;
    return this;
  }

  public SnapshotDataByWidget200Response addGroupLabelsItem(ApiReportDataComponentLabelMap groupLabelsItem) {
    if (this.groupLabels == null) {
      this.groupLabels = new ArrayList<>();
    }
    this.groupLabels.add(groupLabelsItem);
    return this;
  }

   /**
   * Get groupLabels
   * @return groupLabels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiReportDataComponentLabelMap> getGroupLabels() {
    return groupLabels;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupLabels(List<ApiReportDataComponentLabelMap> groupLabels) {
    this.groupLabels = groupLabels;
  }


  public SnapshotDataByWidget200Response binSize(Long binSize) {
    this.binSize = binSize;
    return this;
  }

   /**
   * Duration of each bin.
   * @return binSize
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIN_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBinSize() {
    return binSize;
  }


  @JsonProperty(JSON_PROPERTY_BIN_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinSize(Long binSize) {
    this.binSize = binSize;
  }


  public SnapshotDataByWidget200Response data(ApiWidgetsDataV2 data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiWidgetsDataV2 getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(ApiWidgetsDataV2 data) {
    this.data = data;
  }


  public SnapshotDataByWidget200Response links(SelfLinksLinks links) {
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

  public SelfLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  /**
   * Return true if this snapshotDataByWidget_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotDataByWidget200Response snapshotDataByWidget200Response = (SnapshotDataByWidget200Response) o;
    return Objects.equals(this.startDate, snapshotDataByWidget200Response.startDate) &&
        Objects.equals(this.endDate, snapshotDataByWidget200Response.endDate) &&
        Objects.equals(this.groupLabels, snapshotDataByWidget200Response.groupLabels) &&
        Objects.equals(this.binSize, snapshotDataByWidget200Response.binSize) &&
        Objects.equals(this.data, snapshotDataByWidget200Response.data) &&
        Objects.equals(this.links, snapshotDataByWidget200Response.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, groupLabels, binSize, data, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotDataByWidget200Response {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    groupLabels: ").append(toIndentedString(groupLabels)).append("\n");
    sb.append("    binSize: ").append(toIndentedString(binSize)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

