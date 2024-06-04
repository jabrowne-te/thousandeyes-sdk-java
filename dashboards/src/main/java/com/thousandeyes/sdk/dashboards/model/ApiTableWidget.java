/*
 * Dashboards API
 * Manage ThousandEyes Dashboards.
 *
 * The version of the OpenAPI document: 7.0.6
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
import com.thousandeyes.sdk.dashboards.model.ApiAggregateProperty;
import com.thousandeyes.sdk.dashboards.model.ApiDuration;
import com.thousandeyes.sdk.dashboards.model.ApiWidgetMeasure;
import com.thousandeyes.sdk.dashboards.model.DashboardMetric;
import com.thousandeyes.sdk.dashboards.model.DashboardMetricDirection;
import com.thousandeyes.sdk.dashboards.model.LegacyWidgetSortDirection;
import com.thousandeyes.sdk.dashboards.model.LegacyWidgetSortProperty;
import com.thousandeyes.sdk.dashboards.model.MetricGroup;
import com.thousandeyes.sdk.dashboards.model.SelfLinks;
import com.thousandeyes.sdk.dashboards.model.TableDatasource;
import com.thousandeyes.sdk.dashboards.model.VisualMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Organizes data in rows and columns, with options to list by test, geographic location, data source, or aggregated categories.
 */
@JsonPropertyOrder({
  ApiTableWidget.JSON_PROPERTY_ID,
  ApiTableWidget.JSON_PROPERTY_TITLE,
  ApiTableWidget.JSON_PROPERTY_VISUAL_MODE,
  ApiTableWidget.JSON_PROPERTY_EMBED_URL,
  ApiTableWidget.JSON_PROPERTY_IS_EMBEDDED,
  ApiTableWidget.JSON_PROPERTY_METRIC_GROUP,
  ApiTableWidget.JSON_PROPERTY_DIRECTION,
  ApiTableWidget.JSON_PROPERTY_METRIC,
  ApiTableWidget.JSON_PROPERTY_FILTERS,
  ApiTableWidget.JSON_PROPERTY_MEASURE,
  ApiTableWidget.JSON_PROPERTY_FIXED_TIMESPAN,
  ApiTableWidget.JSON_PROPERTY_API_LINK,
  ApiTableWidget.JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS,
  ApiTableWidget.JSON_PROPERTY_LINKS,
  ApiTableWidget.JSON_PROPERTY_TYPE,
  ApiTableWidget.JSON_PROPERTY_COMPARE_TO_PREVIOUS_VALUE,
  ApiTableWidget.JSON_PROPERTY_ROW_GROUP_BY,
  ApiTableWidget.JSON_PROPERTY_COLUMN_GROUP_BY,
  ApiTableWidget.JSON_PROPERTY_SORT_BY,
  ApiTableWidget.JSON_PROPERTY_SORT_DIRECTION,
  ApiTableWidget.JSON_PROPERTY_LIMIT,
  ApiTableWidget.JSON_PROPERTY_DATA_SOURCE
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class ApiTableWidget {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VISUAL_MODE = "visualMode";
  private VisualMode visualMode = VisualMode.FULL;

  public static final String JSON_PROPERTY_EMBED_URL = "embedUrl";
  private String embedUrl;

  public static final String JSON_PROPERTY_IS_EMBEDDED = "isEmbedded";
  private Boolean isEmbedded;

  public static final String JSON_PROPERTY_METRIC_GROUP = "metricGroup";
  private MetricGroup metricGroup;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DashboardMetricDirection direction;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private DashboardMetric metric;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private Map<String, Set<Object>> filters = new HashMap<>();

  public static final String JSON_PROPERTY_MEASURE = "measure";
  private ApiWidgetMeasure measure;

  public static final String JSON_PROPERTY_FIXED_TIMESPAN = "fixedTimespan";
  private ApiDuration fixedTimespan;

  public static final String JSON_PROPERTY_API_LINK = "apiLink";
  private String apiLink;

  public static final String JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS = "shouldExcludeAlertSuppressionWindows";
  private Boolean shouldExcludeAlertSuppressionWindows;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private SelfLinks links;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_COMPARE_TO_PREVIOUS_VALUE = "compareToPreviousValue";
  private Boolean compareToPreviousValue;

  public static final String JSON_PROPERTY_ROW_GROUP_BY = "rowGroupBy";
  private ApiAggregateProperty rowGroupBy;

  public static final String JSON_PROPERTY_COLUMN_GROUP_BY = "columnGroupBy";
  private ApiAggregateProperty columnGroupBy;

  public static final String JSON_PROPERTY_SORT_BY = "sortBy";
  private LegacyWidgetSortProperty sortBy;

  public static final String JSON_PROPERTY_SORT_DIRECTION = "sortDirection";
  private LegacyWidgetSortDirection sortDirection;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_DATA_SOURCE = "dataSource";
  private TableDatasource dataSource;

  public ApiTableWidget() { 
  }

  @JsonCreator
  public ApiTableWidget(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_EMBED_URL) String embedUrl, 
    @JsonProperty(JSON_PROPERTY_API_LINK) String apiLink
  ) {
  this();
    this.id = id;
    this.embedUrl = embedUrl;
    this.apiLink = apiLink;
  }

   /**
   * Identifier of the widget.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public ApiTableWidget title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the widget
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


  public ApiTableWidget visualMode(VisualMode visualMode) {
    this.visualMode = visualMode;
    return this;
  }

   /**
   * Get visualMode
   * @return visualMode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VISUAL_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VisualMode getVisualMode() {
    return visualMode;
  }


  @JsonProperty(JSON_PROPERTY_VISUAL_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisualMode(VisualMode visualMode) {
    this.visualMode = visualMode;
  }


   /**
   * When &#x60;isEmbedded&#x60; is set to &#x60;true&#x60;, an &#x60;embedUrl&#x60; is provided.
   * @return embedUrl
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMBED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmbedUrl() {
    return embedUrl;
  }




  public ApiTableWidget isEmbedded(Boolean isEmbedded) {
    this.isEmbedded = isEmbedded;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if widget is marked as embedded; otherwise, set to &#x60;false&#x60;.
   * @return isEmbedded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEmbedded() {
    return isEmbedded;
  }


  @JsonProperty(JSON_PROPERTY_IS_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEmbedded(Boolean isEmbedded) {
    this.isEmbedded = isEmbedded;
  }


  public ApiTableWidget metricGroup(MetricGroup metricGroup) {
    this.metricGroup = metricGroup;
    return this;
  }

   /**
   * Get metricGroup
   * @return metricGroup
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetricGroup getMetricGroup() {
    return metricGroup;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricGroup(MetricGroup metricGroup) {
    this.metricGroup = metricGroup;
  }


  public ApiTableWidget direction(DashboardMetricDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DashboardMetricDirection getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(DashboardMetricDirection direction) {
    this.direction = direction;
  }


  public ApiTableWidget metric(DashboardMetric metric) {
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DashboardMetric getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetric(DashboardMetric metric) {
    this.metric = metric;
  }


  public ApiTableWidget filters(Map<String, Set<Object>> filters) {
    this.filters = filters;
    return this;
  }

  public ApiTableWidget putFiltersItem(String key, Set<Object> filtersItem) {
    if (this.filters == null) {
      this.filters = new HashMap<>();
    }
    this.filters.put(key, filtersItem);
    return this;
  }

   /**
   * (Optional) Specifies the filters applied to the widget. When present, the &#x60;filters&#x60; property displays. Each filter object has two properties: &#x60;filterProperty&#x60; and &#x60;filterValue&#x60;. The &#x60;filterProperty&#x60; can be values like &#x60;AGENT&#x60;, &#x60;ENDPOINT_MACHINE_ID&#x60;, &#x60;TEST&#x60;, &#x60;MONITOR&#x60;, etc.  The &#x60;filterValue&#x60; represents an identifier array of the selected property.
   * @return filters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Set<Object>> getFilters() {
    return filters;
  }


  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilters(Map<String, Set<Object>> filters) {
    this.filters = filters;
  }


  public ApiTableWidget measure(ApiWidgetMeasure measure) {
    this.measure = measure;
    return this;
  }

   /**
   * Get measure
   * @return measure
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MEASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiWidgetMeasure getMeasure() {
    return measure;
  }


  @JsonProperty(JSON_PROPERTY_MEASURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeasure(ApiWidgetMeasure measure) {
    this.measure = measure;
  }


  public ApiTableWidget fixedTimespan(ApiDuration fixedTimespan) {
    this.fixedTimespan = fixedTimespan;
    return this;
  }

   /**
   * Get fixedTimespan
   * @return fixedTimespan
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_TIMESPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiDuration getFixedTimespan() {
    return fixedTimespan;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_TIMESPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedTimespan(ApiDuration fixedTimespan) {
    this.fixedTimespan = fixedTimespan;
  }


   /**
   * Get apiLink
   * @return apiLink
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiLink() {
    return apiLink;
  }




  public ApiTableWidget shouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
    this.shouldExcludeAlertSuppressionWindows = shouldExcludeAlertSuppressionWindows;
    return this;
  }

   /**
   * Excludes alert suppression window data if set to &#x60;true&#x60;.
   * @return shouldExcludeAlertSuppressionWindows
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldExcludeAlertSuppressionWindows() {
    return shouldExcludeAlertSuppressionWindows;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
    this.shouldExcludeAlertSuppressionWindows = shouldExcludeAlertSuppressionWindows;
  }


  public ApiTableWidget links(SelfLinks links) {
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

  public SelfLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(SelfLinks links) {
    this.links = links;
  }


  public ApiTableWidget type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Table widget type.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public ApiTableWidget compareToPreviousValue(Boolean compareToPreviousValue) {
    this.compareToPreviousValue = compareToPreviousValue;
    return this;
  }

   /**
   * Get compareToPreviousValue
   * @return compareToPreviousValue
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPARE_TO_PREVIOUS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCompareToPreviousValue() {
    return compareToPreviousValue;
  }


  @JsonProperty(JSON_PROPERTY_COMPARE_TO_PREVIOUS_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompareToPreviousValue(Boolean compareToPreviousValue) {
    this.compareToPreviousValue = compareToPreviousValue;
  }


  public ApiTableWidget rowGroupBy(ApiAggregateProperty rowGroupBy) {
    this.rowGroupBy = rowGroupBy;
    return this;
  }

   /**
   * Get rowGroupBy
   * @return rowGroupBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROW_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiAggregateProperty getRowGroupBy() {
    return rowGroupBy;
  }


  @JsonProperty(JSON_PROPERTY_ROW_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRowGroupBy(ApiAggregateProperty rowGroupBy) {
    this.rowGroupBy = rowGroupBy;
  }


  public ApiTableWidget columnGroupBy(ApiAggregateProperty columnGroupBy) {
    this.columnGroupBy = columnGroupBy;
    return this;
  }

   /**
   * Get columnGroupBy
   * @return columnGroupBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiAggregateProperty getColumnGroupBy() {
    return columnGroupBy;
  }


  @JsonProperty(JSON_PROPERTY_COLUMN_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColumnGroupBy(ApiAggregateProperty columnGroupBy) {
    this.columnGroupBy = columnGroupBy;
  }


  public ApiTableWidget sortBy(LegacyWidgetSortProperty sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Get sortBy
   * @return sortBy
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LegacyWidgetSortProperty getSortBy() {
    return sortBy;
  }


  @JsonProperty(JSON_PROPERTY_SORT_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortBy(LegacyWidgetSortProperty sortBy) {
    this.sortBy = sortBy;
  }


  public ApiTableWidget sortDirection(LegacyWidgetSortDirection sortDirection) {
    this.sortDirection = sortDirection;
    return this;
  }

   /**
   * Get sortDirection
   * @return sortDirection
   * @deprecated
  **/
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LegacyWidgetSortDirection getSortDirection() {
    return sortDirection;
  }


  @JsonProperty(JSON_PROPERTY_SORT_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortDirection(LegacyWidgetSortDirection sortDirection) {
    this.sortDirection = sortDirection;
  }


  public ApiTableWidget limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Limit configured in the widget.
   * @return limit
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public ApiTableWidget dataSource(TableDatasource dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TableDatasource getDataSource() {
    return dataSource;
  }


  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataSource(TableDatasource dataSource) {
    this.dataSource = dataSource;
  }


  /**
   * Return true if this ApiTableWidget object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiTableWidget apiTableWidget = (ApiTableWidget) o;
    return Objects.equals(this.id, apiTableWidget.id) &&
        Objects.equals(this.title, apiTableWidget.title) &&
        Objects.equals(this.visualMode, apiTableWidget.visualMode) &&
        Objects.equals(this.embedUrl, apiTableWidget.embedUrl) &&
        Objects.equals(this.isEmbedded, apiTableWidget.isEmbedded) &&
        Objects.equals(this.metricGroup, apiTableWidget.metricGroup) &&
        Objects.equals(this.direction, apiTableWidget.direction) &&
        Objects.equals(this.metric, apiTableWidget.metric) &&
        Objects.equals(this.filters, apiTableWidget.filters) &&
        Objects.equals(this.measure, apiTableWidget.measure) &&
        Objects.equals(this.fixedTimespan, apiTableWidget.fixedTimespan) &&
        Objects.equals(this.apiLink, apiTableWidget.apiLink) &&
        Objects.equals(this.shouldExcludeAlertSuppressionWindows, apiTableWidget.shouldExcludeAlertSuppressionWindows) &&
        Objects.equals(this.links, apiTableWidget.links) &&
        Objects.equals(this.type, apiTableWidget.type) &&
        Objects.equals(this.compareToPreviousValue, apiTableWidget.compareToPreviousValue) &&
        Objects.equals(this.rowGroupBy, apiTableWidget.rowGroupBy) &&
        Objects.equals(this.columnGroupBy, apiTableWidget.columnGroupBy) &&
        Objects.equals(this.sortBy, apiTableWidget.sortBy) &&
        Objects.equals(this.sortDirection, apiTableWidget.sortDirection) &&
        Objects.equals(this.limit, apiTableWidget.limit) &&
        Objects.equals(this.dataSource, apiTableWidget.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, visualMode, embedUrl, isEmbedded, metricGroup, direction, metric, filters, measure, fixedTimespan, apiLink, shouldExcludeAlertSuppressionWindows, links, type, compareToPreviousValue, rowGroupBy, columnGroupBy, sortBy, sortDirection, limit, dataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiTableWidget {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visualMode: ").append(toIndentedString(visualMode)).append("\n");
    sb.append("    embedUrl: ").append(toIndentedString(embedUrl)).append("\n");
    sb.append("    isEmbedded: ").append(toIndentedString(isEmbedded)).append("\n");
    sb.append("    metricGroup: ").append(toIndentedString(metricGroup)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    measure: ").append(toIndentedString(measure)).append("\n");
    sb.append("    fixedTimespan: ").append(toIndentedString(fixedTimespan)).append("\n");
    sb.append("    apiLink: ").append(toIndentedString(apiLink)).append("\n");
    sb.append("    shouldExcludeAlertSuppressionWindows: ").append(toIndentedString(shouldExcludeAlertSuppressionWindows)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    compareToPreviousValue: ").append(toIndentedString(compareToPreviousValue)).append("\n");
    sb.append("    rowGroupBy: ").append(toIndentedString(rowGroupBy)).append("\n");
    sb.append("    columnGroupBy: ").append(toIndentedString(columnGroupBy)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
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
