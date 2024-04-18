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
import com.thousandeyes.api.dashboards.model.ApiDashboardSnapshot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Dashboard snapshots page.
 */
@JsonPropertyOrder({
  DashboardSnapshotsPage.JSON_PROPERTY_PAGES,
  DashboardSnapshotsPage.JSON_PROPERTY_DASHBOARD_SNAPSHOTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:02.220586+01:00[Europe/Lisbon]")
public class DashboardSnapshotsPage {
  public static final String JSON_PROPERTY_PAGES = "pages";
  private Map<String, Object> pages = new HashMap<>();

  public static final String JSON_PROPERTY_DASHBOARD_SNAPSHOTS = "dashboardSnapshots";
  private List<ApiDashboardSnapshot> dashboardSnapshots;

  public DashboardSnapshotsPage() { 
  }

  public DashboardSnapshotsPage pages(Map<String, Object> pages) {
    this.pages = pages;
    return this;
  }

  public DashboardSnapshotsPage putPagesItem(String key, Object pagesItem) {
    if (this.pages == null) {
      this.pages = new HashMap<>();
    }
    this.pages.put(key, pagesItem);
    return this;
  }

   /**
   * Get pages
   * @return pages
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getPages() {
    return pages;
  }


  @JsonProperty(JSON_PROPERTY_PAGES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setPages(Map<String, Object> pages) {
    this.pages = pages;
  }


  public DashboardSnapshotsPage dashboardSnapshots(List<ApiDashboardSnapshot> dashboardSnapshots) {
    this.dashboardSnapshots = dashboardSnapshots;
    return this;
  }

  public DashboardSnapshotsPage addDashboardSnapshotsItem(ApiDashboardSnapshot dashboardSnapshotsItem) {
    if (this.dashboardSnapshots == null) {
      this.dashboardSnapshots = new ArrayList<>();
    }
    this.dashboardSnapshots.add(dashboardSnapshotsItem);
    return this;
  }

   /**
   * Get dashboardSnapshots
   * @return dashboardSnapshots
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiDashboardSnapshot> getDashboardSnapshots() {
    return dashboardSnapshots;
  }


  @JsonProperty(JSON_PROPERTY_DASHBOARD_SNAPSHOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDashboardSnapshots(List<ApiDashboardSnapshot> dashboardSnapshots) {
    this.dashboardSnapshots = dashboardSnapshots;
  }


  /**
   * Return true if this DashboardSnapshotsPage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardSnapshotsPage dashboardSnapshotsPage = (DashboardSnapshotsPage) o;
    return Objects.equals(this.pages, dashboardSnapshotsPage.pages) &&
        Objects.equals(this.dashboardSnapshots, dashboardSnapshotsPage.dashboardSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pages, dashboardSnapshots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardSnapshotsPage {\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    dashboardSnapshots: ").append(toIndentedString(dashboardSnapshots)).append("\n");
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

