/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.dashboards.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.dashboards.model.ApiWidget;
import com.thousandeyes.sdk.dashboards.model.DashboardLinks;
import com.thousandeyes.sdk.dashboards.model.DefaultTimespan;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Dashboard upon which this dashboard snapshot is based upon.
 */
@JsonPropertyOrder({
  ApiDashboard.JSON_PROPERTY_GLOBAL_FILTER_ID,
  ApiDashboard.JSON_PROPERTY_ACCOUNT_ID,
  ApiDashboard.JSON_PROPERTY_CREATED_BY,
  ApiDashboard.JSON_PROPERTY_MODIFIED_BY,
  ApiDashboard.JSON_PROPERTY_MODIFIED_DATE,
  ApiDashboard.JSON_PROPERTY_GLOBAL_OVERRIDE,
  ApiDashboard.JSON_PROPERTY_MIGRATED_REPORT,
  ApiDashboard.JSON_PROPERTY_API_LINK,
  ApiDashboard.JSON_PROPERTY_DASHBOARD_ID,
  ApiDashboard.JSON_PROPERTY_TITLE,
  ApiDashboard.JSON_PROPERTY_IS_BUILT_IN,
  ApiDashboard.JSON_PROPERTY_AID,
  ApiDashboard.JSON_PROPERTY_DASHBOARD_CREATED_BY,
  ApiDashboard.JSON_PROPERTY_DASHBOARD_MODIFIED_BY,
  ApiDashboard.JSON_PROPERTY_DASHBOARD_MODIFIED_DATE,
  ApiDashboard.JSON_PROPERTY_IS_PRIVATE,
  ApiDashboard.JSON_PROPERTY_IS_DEFAULT_FOR_USER,
  ApiDashboard.JSON_PROPERTY_IS_DEFAULT_FOR_ACCOUNT,
  ApiDashboard.JSON_PROPERTY_WIDGETS,
  ApiDashboard.JSON_PROPERTY_DESCRIPTION,
  ApiDashboard.JSON_PROPERTY_DEFAULT_TIMESPAN,
  ApiDashboard.JSON_PROPERTY_IS_GLOBAL_OVERRIDE,
  ApiDashboard.JSON_PROPERTY_IS_MIGRATED_REPORT,
  ApiDashboard.JSON_PROPERTY_LINKS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiDashboard {
  public static final String JSON_PROPERTY_GLOBAL_FILTER_ID = "globalFilterId";
  private String globalFilterId;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private Long createdBy;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private Long modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private String modifiedDate;

  public static final String JSON_PROPERTY_GLOBAL_OVERRIDE = "globalOverride";
  private Boolean globalOverride;

  public static final String JSON_PROPERTY_MIGRATED_REPORT = "migratedReport";
  private Boolean migratedReport;

  public static final String JSON_PROPERTY_API_LINK = "apiLink";
  private List<Map<String, Object>> apiLink = new ArrayList<>();

  public static final String JSON_PROPERTY_DASHBOARD_ID = "dashboardId";
  private String dashboardId;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_IS_BUILT_IN = "isBuiltIn";
  private Boolean isBuiltIn;

  public static final String JSON_PROPERTY_AID = "aid";
  private String aid;

  public static final String JSON_PROPERTY_DASHBOARD_CREATED_BY = "dashboardCreatedBy";
  private String dashboardCreatedBy;

  public static final String JSON_PROPERTY_DASHBOARD_MODIFIED_BY = "dashboardModifiedBy";
  private String dashboardModifiedBy;

  public static final String JSON_PROPERTY_DASHBOARD_MODIFIED_DATE = "dashboardModifiedDate";
  private OffsetDateTime dashboardModifiedDate;

  public static final String JSON_PROPERTY_IS_PRIVATE = "isPrivate";
  private Boolean isPrivate;

  public static final String JSON_PROPERTY_IS_DEFAULT_FOR_USER = "isDefaultForUser";
  private Boolean isDefaultForUser;

  public static final String JSON_PROPERTY_IS_DEFAULT_FOR_ACCOUNT = "isDefaultForAccount";
  private Boolean isDefaultForAccount;

  public static final String JSON_PROPERTY_WIDGETS = "widgets";
  private List<ApiWidget> widgets = new ArrayList<>();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DEFAULT_TIMESPAN = "defaultTimespan";
  private DefaultTimespan defaultTimespan;

  public static final String JSON_PROPERTY_IS_GLOBAL_OVERRIDE = "isGlobalOverride";
  private Boolean isGlobalOverride;

  public static final String JSON_PROPERTY_IS_MIGRATED_REPORT = "isMigratedReport";
  private Boolean isMigratedReport;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private DashboardLinks links;

  public ApiDashboard() { 
  }

  @JsonCreator
  public ApiDashboard(
    @JsonProperty(JSON_PROPERTY_ACCOUNT_ID) Long accountId, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) Long modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) String modifiedDate, 
    @JsonProperty(JSON_PROPERTY_MIGRATED_REPORT) Boolean migratedReport, 
    @JsonProperty(JSON_PROPERTY_DASHBOARD_ID) String dashboardId, 
    @JsonProperty(JSON_PROPERTY_IS_BUILT_IN) Boolean isBuiltIn, 
    @JsonProperty(JSON_PROPERTY_AID) String aid, 
    @JsonProperty(JSON_PROPERTY_DASHBOARD_CREATED_BY) String dashboardCreatedBy, 
    @JsonProperty(JSON_PROPERTY_DASHBOARD_MODIFIED_BY) String dashboardModifiedBy, 
    @JsonProperty(JSON_PROPERTY_DASHBOARD_MODIFIED_DATE) OffsetDateTime dashboardModifiedDate, 
    @JsonProperty(JSON_PROPERTY_IS_DEFAULT_FOR_USER) Boolean isDefaultForUser, 
    @JsonProperty(JSON_PROPERTY_IS_DEFAULT_FOR_ACCOUNT) Boolean isDefaultForAccount, 
    @JsonProperty(JSON_PROPERTY_IS_MIGRATED_REPORT) Boolean isMigratedReport
  ) {
  this();
    this.accountId = accountId;
    this.createdBy = createdBy;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.migratedReport = migratedReport;
    this.dashboardId = dashboardId;
    this.isBuiltIn = isBuiltIn;
    this.aid = aid;
    this.dashboardCreatedBy = dashboardCreatedBy;
    this.dashboardModifiedBy = dashboardModifiedBy;
    this.dashboardModifiedDate = dashboardModifiedDate;
    this.isDefaultForUser = isDefaultForUser;
    this.isDefaultForAccount = isDefaultForAccount;
    this.isMigratedReport = isMigratedReport;
  }

  public ApiDashboard globalFilterId(String globalFilterId) {
    this.globalFilterId = globalFilterId;
    return this;
  }

   /**
   * Default global dashboard filter ID (obtained from &#x60;/dashboards/filters&#x60; endpoint).
   * @return globalFilterId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_FILTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGlobalFilterId() {
    return globalFilterId;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_FILTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalFilterId(String globalFilterId) {
    this.globalFilterId = globalFilterId;
  }


   /**
   * Identifier for the account group associated with a dashboard.
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }




   /**
   * Identifier for the user that created a dashboard.
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }




   /**
   * Identifier for the user that last modified a dashboard.
   * @return modifiedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC date/time when a dashboard was last modified.
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedDate() {
    return modifiedDate;
  }




  public ApiDashboard globalOverride(Boolean globalOverride) {
    this.globalOverride = globalOverride;
    return this;
  }

   /**
   * When set to &#x60;true&#x60;, the defaultTimespan is used and overrides the widget&#39;s timespan. If set to &#x60;false&#x60;, the the widget&#39;s timespan is used.
   * @return globalOverride
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GLOBAL_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getGlobalOverride() {
    return globalOverride;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalOverride(Boolean globalOverride) {
    this.globalOverride = globalOverride;
  }


   /**
   * True if this dashboard was previously a report.
   * @return migratedReport
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIGRATED_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMigratedReport() {
    return migratedReport;
  }




  public ApiDashboard apiLink(List<Map<String, Object>> apiLink) {
    this.apiLink = apiLink;
    return this;
  }

  public ApiDashboard addApiLinkItem(Map<String, Object> apiLinkItem) {
    if (this.apiLink == null) {
      this.apiLink = new ArrayList<>();
    }
    this.apiLink.add(apiLinkItem);
    return this;
  }

   /**
   * A links array containing the self and the snapshots links.
   * @return apiLink
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Map<String, Object>> getApiLink() {
    return apiLink;
  }


  @JsonProperty(JSON_PROPERTY_API_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiLink(List<Map<String, Object>> apiLink) {
    this.apiLink = apiLink;
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




  public ApiDashboard title(String title) {
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
   * @return dashboardCreatedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDashboardCreatedBy() {
    return dashboardCreatedBy;
  }




   /**
   * Identifier for the user that last modified a dashboard.
   * @return dashboardModifiedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDashboardModifiedBy() {
    return dashboardModifiedBy;
  }




   /**
   * UTC date/time when a dashboard was last modified (ISO date-time format).
   * @return dashboardModifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DASHBOARD_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDashboardModifiedDate() {
    return dashboardModifiedDate;
  }




  public ApiDashboard isPrivate(Boolean isPrivate) {
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




  public ApiDashboard widgets(List<ApiWidget> widgets) {
    this.widgets = widgets;
    return this;
  }

  public ApiDashboard addWidgetsItem(ApiWidget widgetsItem) {
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


  public ApiDashboard description(String description) {
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


  public ApiDashboard defaultTimespan(DefaultTimespan defaultTimespan) {
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


  public ApiDashboard isGlobalOverride(Boolean isGlobalOverride) {
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




  public ApiDashboard links(DashboardLinks links) {
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

  public DashboardLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(DashboardLinks links) {
    this.links = links;
  }


  /**
   * Return true if this ApiDashboard object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDashboard apiDashboard = (ApiDashboard) o;
    return Objects.equals(this.globalFilterId, apiDashboard.globalFilterId) &&
        Objects.equals(this.accountId, apiDashboard.accountId) &&
        Objects.equals(this.createdBy, apiDashboard.createdBy) &&
        Objects.equals(this.modifiedBy, apiDashboard.modifiedBy) &&
        Objects.equals(this.modifiedDate, apiDashboard.modifiedDate) &&
        Objects.equals(this.globalOverride, apiDashboard.globalOverride) &&
        Objects.equals(this.migratedReport, apiDashboard.migratedReport) &&
        Objects.equals(this.apiLink, apiDashboard.apiLink) &&
        Objects.equals(this.dashboardId, apiDashboard.dashboardId) &&
        Objects.equals(this.title, apiDashboard.title) &&
        Objects.equals(this.isBuiltIn, apiDashboard.isBuiltIn) &&
        Objects.equals(this.aid, apiDashboard.aid) &&
        Objects.equals(this.dashboardCreatedBy, apiDashboard.dashboardCreatedBy) &&
        Objects.equals(this.dashboardModifiedBy, apiDashboard.dashboardModifiedBy) &&
        Objects.equals(this.dashboardModifiedDate, apiDashboard.dashboardModifiedDate) &&
        Objects.equals(this.isPrivate, apiDashboard.isPrivate) &&
        Objects.equals(this.isDefaultForUser, apiDashboard.isDefaultForUser) &&
        Objects.equals(this.isDefaultForAccount, apiDashboard.isDefaultForAccount) &&
        Objects.equals(this.widgets, apiDashboard.widgets) &&
        Objects.equals(this.description, apiDashboard.description) &&
        Objects.equals(this.defaultTimespan, apiDashboard.defaultTimespan) &&
        Objects.equals(this.isGlobalOverride, apiDashboard.isGlobalOverride) &&
        Objects.equals(this.isMigratedReport, apiDashboard.isMigratedReport) &&
        Objects.equals(this.links, apiDashboard.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalFilterId, accountId, createdBy, modifiedBy, modifiedDate, globalOverride, migratedReport, apiLink, dashboardId, title, isBuiltIn, aid, dashboardCreatedBy, dashboardModifiedBy, dashboardModifiedDate, isPrivate, isDefaultForUser, isDefaultForAccount, widgets, description, defaultTimespan, isGlobalOverride, isMigratedReport, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDashboard {\n");
    sb.append("    globalFilterId: ").append(toIndentedString(globalFilterId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    globalOverride: ").append(toIndentedString(globalOverride)).append("\n");
    sb.append("    migratedReport: ").append(toIndentedString(migratedReport)).append("\n");
    sb.append("    apiLink: ").append(toIndentedString(apiLink)).append("\n");
    sb.append("    dashboardId: ").append(toIndentedString(dashboardId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    dashboardCreatedBy: ").append(toIndentedString(dashboardCreatedBy)).append("\n");
    sb.append("    dashboardModifiedBy: ").append(toIndentedString(dashboardModifiedBy)).append("\n");
    sb.append("    dashboardModifiedDate: ").append(toIndentedString(dashboardModifiedDate)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    isDefaultForUser: ").append(toIndentedString(isDefaultForUser)).append("\n");
    sb.append("    isDefaultForAccount: ").append(toIndentedString(isDefaultForAccount)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultTimespan: ").append(toIndentedString(defaultTimespan)).append("\n");
    sb.append("    isGlobalOverride: ").append(toIndentedString(isGlobalOverride)).append("\n");
    sb.append("    isMigratedReport: ").append(toIndentedString(isMigratedReport)).append("\n");
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

