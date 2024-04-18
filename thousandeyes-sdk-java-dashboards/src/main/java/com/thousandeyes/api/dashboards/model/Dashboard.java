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
import com.thousandeyes.api.dashboards.model.ApiWidget;
import com.thousandeyes.api.dashboards.model.DashboardLinksLinks;
import com.thousandeyes.api.dashboards.model.DefaultTimespan;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Dashboard upon which this dashboard snapshot is based upon.
 */
@JsonPropertyOrder({
  Dashboard.JSON_PROPERTY_LINKS,
  Dashboard.JSON_PROPERTY_DASHBOARD_ID,
  Dashboard.JSON_PROPERTY_TITLE,
  Dashboard.JSON_PROPERTY_IS_BUILT_IN,
  Dashboard.JSON_PROPERTY_AID,
  Dashboard.JSON_PROPERTY_CREATED_BY,
  Dashboard.JSON_PROPERTY_MODIFIED_BY,
  Dashboard.JSON_PROPERTY_MODIFIED_DATE,
  Dashboard.JSON_PROPERTY_IS_PRIVATE,
  Dashboard.JSON_PROPERTY_IS_DEFAULT_FOR_USER,
  Dashboard.JSON_PROPERTY_IS_DEFAULT_FOR_ACCOUNT,
  Dashboard.JSON_PROPERTY_WIDGETS,
  Dashboard.JSON_PROPERTY_DESCRIPTION,
  Dashboard.JSON_PROPERTY_DEFAULT_TIMESPAN,
  Dashboard.JSON_PROPERTY_IS_GLOBAL_OVERRIDE,
  Dashboard.JSON_PROPERTY_IS_MIGRATED_REPORT
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-18T12:55:02.220586+01:00[Europe/Lisbon]")
public class Dashboard {
  public static final String JSON_PROPERTY_LINKS = "_links";
  private DashboardLinksLinks links;

  public static final String JSON_PROPERTY_DASHBOARD_ID = "dashboardId";
  private String dashboardId;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_IS_BUILT_IN = "isBuiltIn";
  private Boolean isBuiltIn;

  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private String modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_IS_PRIVATE = "isPrivate";
  private Boolean isPrivate;

  public static final String JSON_PROPERTY_IS_DEFAULT_FOR_USER = "isDefaultForUser";
  private Boolean isDefaultForUser;

  public static final String JSON_PROPERTY_IS_DEFAULT_FOR_ACCOUNT = "isDefaultForAccount";
  private Boolean isDefaultForAccount;

  public static final String JSON_PROPERTY_WIDGETS = "widgets";
  private List<ApiWidget> widgets;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DEFAULT_TIMESPAN = "defaultTimespan";
  private DefaultTimespan defaultTimespan;

  public static final String JSON_PROPERTY_IS_GLOBAL_OVERRIDE = "isGlobalOverride";
  private Boolean isGlobalOverride;

  public static final String JSON_PROPERTY_IS_MIGRATED_REPORT = "isMigratedReport";
  private Boolean isMigratedReport;

  public Dashboard() { 
  }

  @JsonCreator
  public Dashboard(
    @JsonProperty(JSON_PROPERTY_DASHBOARD_ID) String dashboardId, 
    @JsonProperty(JSON_PROPERTY_IS_BUILT_IN) Boolean isBuiltIn, 
    @JsonProperty(JSON_PROPERTY_AID) String aid, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) String modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_IS_DEFAULT_FOR_USER) Boolean isDefaultForUser, 
    @JsonProperty(JSON_PROPERTY_IS_DEFAULT_FOR_ACCOUNT) Boolean isDefaultForAccount, 
    @JsonProperty(JSON_PROPERTY_IS_MIGRATED_REPORT) Boolean isMigratedReport
  ) {
  this();
    this.dashboardId = dashboardId;
    this.isBuiltIn = isBuiltIn;
    this.aid = aid;
    this.createdBy = createdBy;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.isDefaultForUser = isDefaultForUser;
    this.isDefaultForAccount = isDefaultForAccount;
    this.isMigratedReport = isMigratedReport;
  }

  public Dashboard links(DashboardLinksLinks links) {
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

  public DashboardLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(DashboardLinksLinks links) {
    this.links = links;
  }


   /**
   * Identifier of a dashboard.
   * @return dashboardId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDashboardId() {
    return dashboardId;
  }




  public Dashboard title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of a dashboard.
   * @return title
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


   /**
   * Indicates if a dashboard is built-in. True for built-in dashboards, false for user-created dashboards.
   * @return isBuiltIn
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BUILT_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBuiltIn() {
    return isBuiltIn;
  }




   /**
   * Identifier for the account group associated with a dashboard.
   * @return aid
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAid() {
    return aid;
  }




   /**
   * Identifier for the user that created a dashboard.
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * Identifier for the user that last modified a dashboard.
   * @return modifiedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC date/time when a dashboard was last modified (ISO date-time format).
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




  public Dashboard isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * A dashboard can be viewed by other users in the account. If true, only the creator of the dashboard may view it. If false, all users in the same account may view it.
   * @return isPrivate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPrivate() {
    return isPrivate;
  }


  @JsonProperty(JSON_PROPERTY_IS_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }


   /**
   * Indicates whether this dashboard is the user&#39;s default. True for default, false if not.
   * @return isDefaultForUser
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT_FOR_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefaultForUser() {
    return isDefaultForUser;
  }




   /**
   * Indicates whether this dashboard is the account group&#39;s default. True for default, false if not.
   * @return isDefaultForAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT_FOR_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefaultForAccount() {
    return isDefaultForAccount;
  }




  public Dashboard widgets(List<ApiWidget> widgets) {
    this.widgets = widgets;
    return this;
  }

  public Dashboard addWidgetsItem(ApiWidget widgetsItem) {
    if (this.widgets == null) {
      this.widgets = new ArrayList<>();
    }
    this.widgets.add(widgetsItem);
    return this;
  }

   /**
   * Get widgets
   * @return widgets
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ApiWidget> getWidgets() {
    return widgets;
  }


  @JsonProperty(JSON_PROPERTY_WIDGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidgets(List<ApiWidget> widgets) {
    this.widgets = widgets;
  }


  public Dashboard description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A text description of the dashboard&#39;s purpose and functionality. This information assists users in understanding the dashboard but isn&#39;t displayed when viewing a dashboard.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Dashboard defaultTimespan(DefaultTimespan defaultTimespan) {
    this.defaultTimespan = defaultTimespan;
    return this;
  }

   /**
   * Get defaultTimespan
   * @return defaultTimespan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_TIMESPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DefaultTimespan getDefaultTimespan() {
    return defaultTimespan;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_TIMESPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultTimespan(DefaultTimespan defaultTimespan) {
    this.defaultTimespan = defaultTimespan;
  }


  public Dashboard isGlobalOverride(Boolean isGlobalOverride) {
    this.isGlobalOverride = isGlobalOverride;
    return this;
  }

   /**
   * When set to &#x60;true&#x60;, the defaultTimespan is used and overrides the widget&#39;s timespan. If set to &#x60;false&#x60;, the the widget&#39;s timespan is used.
   * @return isGlobalOverride
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_GLOBAL_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsGlobalOverride() {
    return isGlobalOverride;
  }


  @JsonProperty(JSON_PROPERTY_IS_GLOBAL_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsGlobalOverride(Boolean isGlobalOverride) {
    this.isGlobalOverride = isGlobalOverride;
  }


   /**
   * True if this dashboard was previously a report.
   * @return isMigratedReport
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MIGRATED_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMigratedReport() {
    return isMigratedReport;
  }




  /**
   * Return true if this Dashboard object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.links, dashboard.links) &&
        Objects.equals(this.dashboardId, dashboard.dashboardId) &&
        Objects.equals(this.title, dashboard.title) &&
        Objects.equals(this.isBuiltIn, dashboard.isBuiltIn) &&
        Objects.equals(this.aid, dashboard.aid) &&
        Objects.equals(this.createdBy, dashboard.createdBy) &&
        Objects.equals(this.modifiedBy, dashboard.modifiedBy) &&
        Objects.equals(this.modifiedDate, dashboard.modifiedDate) &&
        Objects.equals(this.isPrivate, dashboard.isPrivate) &&
        Objects.equals(this.isDefaultForUser, dashboard.isDefaultForUser) &&
        Objects.equals(this.isDefaultForAccount, dashboard.isDefaultForAccount) &&
        Objects.equals(this.widgets, dashboard.widgets) &&
        Objects.equals(this.description, dashboard.description) &&
        Objects.equals(this.defaultTimespan, dashboard.defaultTimespan) &&
        Objects.equals(this.isGlobalOverride, dashboard.isGlobalOverride) &&
        Objects.equals(this.isMigratedReport, dashboard.isMigratedReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, dashboardId, title, isBuiltIn, aid, createdBy, modifiedBy, modifiedDate, isPrivate, isDefaultForUser, isDefaultForAccount, widgets, description, defaultTimespan, isGlobalOverride, isMigratedReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    isDefaultForUser: ").append(toIndentedString(isDefaultForUser)).append("\n");
    sb.append("    isDefaultForAccount: ").append(toIndentedString(isDefaultForAccount)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultTimespan: ").append(toIndentedString(defaultTimespan)).append("\n");
    sb.append("    isGlobalOverride: ").append(toIndentedString(isGlobalOverride)).append("\n");
    sb.append("    isMigratedReport: ").append(toIndentedString(isMigratedReport)).append("\n");
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

