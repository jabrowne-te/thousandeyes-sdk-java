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


package com.thousandeyes.api.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.AlertListDatasource;
import com.thousandeyes.api.model.ApiAlertListAlertType;
import com.thousandeyes.api.model.ApiAlertListWidgetAllOfActiveWithin;
import com.thousandeyes.api.model.ApiDuration;
import com.thousandeyes.api.model.ApiWidgetMeasure;
import com.thousandeyes.api.model.DashboardMetric;
import com.thousandeyes.api.model.DashboardMetricDirection;
import com.thousandeyes.api.model.MetricGroup;
import com.thousandeyes.api.model.SelfLinksLinks;
import com.thousandeyes.api.model.VisualMode;
import com.thousandeyes.api.model.WidgetType;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

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
 * ApiAlertListWidget
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:19.739212Z[Europe/London]")
public class ApiAlertListWidget {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private WidgetType type;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VISUAL_MODE = "visualMode";
  @SerializedName(SERIALIZED_NAME_VISUAL_MODE)
  private VisualMode visualMode = VisualMode.FULL;

  public static final String SERIALIZED_NAME_EMBED_URL = "embedUrl";
  @SerializedName(SERIALIZED_NAME_EMBED_URL)
  private String embedUrl;

  public static final String SERIALIZED_NAME_IS_EMBEDDED = "isEmbedded";
  @SerializedName(SERIALIZED_NAME_IS_EMBEDDED)
  private Boolean isEmbedded;

  public static final String SERIALIZED_NAME_METRIC_GROUP = "metricGroup";
  @SerializedName(SERIALIZED_NAME_METRIC_GROUP)
  private MetricGroup metricGroup;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private DashboardMetricDirection direction;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private DashboardMetric metric;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private Map<String, Set<Object>> filters = new HashMap<>();

  public static final String SERIALIZED_NAME_MEASURE = "measure";
  @SerializedName(SERIALIZED_NAME_MEASURE)
  private ApiWidgetMeasure measure;

  public static final String SERIALIZED_NAME_FIXED_TIMESPAN = "fixedTimespan";
  @SerializedName(SERIALIZED_NAME_FIXED_TIMESPAN)
  private ApiDuration fixedTimespan;

  public static final String SERIALIZED_NAME_API_LINK = "apiLink";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_API_LINK)
  private String apiLink;

  public static final String SERIALIZED_NAME_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS = "shouldExcludeAlertSuppressionWindows";
  @SerializedName(SERIALIZED_NAME_SHOULD_EXCLUDE_ALERT_SUPPRESSION_WINDOWS)
  private Boolean shouldExcludeAlertSuppressionWindows;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private SelfLinksLinks links;

  public static final String SERIALIZED_NAME_ALERT_TYPES = "alertTypes";
  @SerializedName(SERIALIZED_NAME_ALERT_TYPES)
  private Set<ApiAlertListAlertType> alertTypes;

  public static final String SERIALIZED_NAME_LIMIT_TO = "limitTo";
  @SerializedName(SERIALIZED_NAME_LIMIT_TO)
  private Integer limitTo;

  public static final String SERIALIZED_NAME_ACTIVE_WITHIN = "activeWithin";
  @SerializedName(SERIALIZED_NAME_ACTIVE_WITHIN)
  private ApiAlertListWidgetAllOfActiveWithin activeWithin;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private AlertListDatasource dataSource;

  public ApiAlertListWidget() {
  }

  
  public ApiAlertListWidget(
     String embedUrl, 
     String apiLink
  ) {
    this();
    this.embedUrl = embedUrl;
    this.apiLink = apiLink;
  }

  public ApiAlertListWidget id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier of the widget.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ApiAlertListWidget type(WidgetType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public WidgetType getType() {
    return type;
  }


  public void setType(WidgetType type) {
    this.type = type;
  }


  public ApiAlertListWidget title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the widget
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ApiAlertListWidget visualMode(VisualMode visualMode) {
    
    this.visualMode = visualMode;
    return this;
  }

   /**
   * Get visualMode
   * @return visualMode
  **/
  @javax.annotation.Nullable
  public VisualMode getVisualMode() {
    return visualMode;
  }


  public void setVisualMode(VisualMode visualMode) {
    this.visualMode = visualMode;
  }


   /**
   * When &#x60;isEmbedded&#x60; is set to &#x60;true&#x60;, an &#x60;embedUrl&#x60; is provided.
   * @return embedUrl
  **/
  @javax.annotation.Nullable
  public String getEmbedUrl() {
    return embedUrl;
  }




  public ApiAlertListWidget isEmbedded(Boolean isEmbedded) {
    
    this.isEmbedded = isEmbedded;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; if widget is marked as embedded; otherwise, set to &#x60;false&#x60;.
   * @return isEmbedded
  **/
  @javax.annotation.Nullable
  public Boolean getIsEmbedded() {
    return isEmbedded;
  }


  public void setIsEmbedded(Boolean isEmbedded) {
    this.isEmbedded = isEmbedded;
  }


  public ApiAlertListWidget metricGroup(MetricGroup metricGroup) {
    
    this.metricGroup = metricGroup;
    return this;
  }

   /**
   * Get metricGroup
   * @return metricGroup
  **/
  @javax.annotation.Nullable
  public MetricGroup getMetricGroup() {
    return metricGroup;
  }


  public void setMetricGroup(MetricGroup metricGroup) {
    this.metricGroup = metricGroup;
  }


  public ApiAlertListWidget direction(DashboardMetricDirection direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  public DashboardMetricDirection getDirection() {
    return direction;
  }


  public void setDirection(DashboardMetricDirection direction) {
    this.direction = direction;
  }


  public ApiAlertListWidget metric(DashboardMetric metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @javax.annotation.Nullable
  public DashboardMetric getMetric() {
    return metric;
  }


  public void setMetric(DashboardMetric metric) {
    this.metric = metric;
  }


  public ApiAlertListWidget filters(Map<String, Set<Object>> filters) {
    
    this.filters = filters;
    return this;
  }

  public ApiAlertListWidget putFiltersItem(String key, Set<Object> filtersItem) {
    if (this.filters == null) {
      this.filters = new HashMap<>();
    }
    this.filters.put(key, filtersItem);
    return this;
  }

   /**
   * (Optional) Specifies the filters applied to the widget. When present, the &#x60;filters&#x60; property displays. Each filter object has two properties: &#x60;filterProperty&#x60; and &#x60;filterValue&#x60;. The &#x60;filterProperty&#x60; can be values like Agents, Agent Groups, Tests, Monitors, etc. The &#x60;filterValue&#x60; represents theIdentifierof the selected property.
   * @return filters
  **/
  @javax.annotation.Nullable
  public Map<String, Set<Object>> getFilters() {
    return filters;
  }


  public void setFilters(Map<String, Set<Object>> filters) {
    this.filters = filters;
  }


  public ApiAlertListWidget measure(ApiWidgetMeasure measure) {
    
    this.measure = measure;
    return this;
  }

   /**
   * Get measure
   * @return measure
  **/
  @javax.annotation.Nullable
  public ApiWidgetMeasure getMeasure() {
    return measure;
  }


  public void setMeasure(ApiWidgetMeasure measure) {
    this.measure = measure;
  }


  public ApiAlertListWidget fixedTimespan(ApiDuration fixedTimespan) {
    
    this.fixedTimespan = fixedTimespan;
    return this;
  }

   /**
   * Get fixedTimespan
   * @return fixedTimespan
  **/
  @javax.annotation.Nullable
  public ApiDuration getFixedTimespan() {
    return fixedTimespan;
  }


  public void setFixedTimespan(ApiDuration fixedTimespan) {
    this.fixedTimespan = fixedTimespan;
  }


   /**
   * Get apiLink
   * @return apiLink
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  public String getApiLink() {
    return apiLink;
  }




  public ApiAlertListWidget shouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
    
    this.shouldExcludeAlertSuppressionWindows = shouldExcludeAlertSuppressionWindows;
    return this;
  }

   /**
   * Excludes alert suppression window data if set to &#x60;true&#x60;.
   * @return shouldExcludeAlertSuppressionWindows
  **/
  @javax.annotation.Nullable
  public Boolean getShouldExcludeAlertSuppressionWindows() {
    return shouldExcludeAlertSuppressionWindows;
  }


  public void setShouldExcludeAlertSuppressionWindows(Boolean shouldExcludeAlertSuppressionWindows) {
    this.shouldExcludeAlertSuppressionWindows = shouldExcludeAlertSuppressionWindows;
  }


  public ApiAlertListWidget links(SelfLinksLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public SelfLinksLinks getLinks() {
    return links;
  }


  public void setLinks(SelfLinksLinks links) {
    this.links = links;
  }


  public ApiAlertListWidget alertTypes(Set<ApiAlertListAlertType> alertTypes) {
    
    this.alertTypes = alertTypes;
    return this;
  }

  public ApiAlertListWidget addAlertTypesItem(ApiAlertListAlertType alertTypesItem) {
    if (this.alertTypes == null) {
      this.alertTypes = new LinkedHashSet<>();
    }
    this.alertTypes.add(alertTypesItem);
    return this;
  }

   /**
   * List of alert types configured in the widget, an empty list means all alert types.
   * @return alertTypes
  **/
  @javax.annotation.Nullable
  public Set<ApiAlertListAlertType> getAlertTypes() {
    return alertTypes;
  }


  public void setAlertTypes(Set<ApiAlertListAlertType> alertTypes) {
    this.alertTypes = alertTypes;
  }


  public ApiAlertListWidget limitTo(Integer limitTo) {
    
    this.limitTo = limitTo;
    return this;
  }

   /**
   * Limit the number of alerts displayed in the widget.
   * @return limitTo
  **/
  @javax.annotation.Nullable
  public Integer getLimitTo() {
    return limitTo;
  }


  public void setLimitTo(Integer limitTo) {
    this.limitTo = limitTo;
  }


  public ApiAlertListWidget activeWithin(ApiAlertListWidgetAllOfActiveWithin activeWithin) {
    
    this.activeWithin = activeWithin;
    return this;
  }

   /**
   * Get activeWithin
   * @return activeWithin
  **/
  @javax.annotation.Nullable
  public ApiAlertListWidgetAllOfActiveWithin getActiveWithin() {
    return activeWithin;
  }


  public void setActiveWithin(ApiAlertListWidgetAllOfActiveWithin activeWithin) {
    this.activeWithin = activeWithin;
  }


  public ApiAlertListWidget dataSource(AlertListDatasource dataSource) {
    
    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/
  @javax.annotation.Nullable
  public AlertListDatasource getDataSource() {
    return dataSource;
  }


  public void setDataSource(AlertListDatasource dataSource) {
    this.dataSource = dataSource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAlertListWidget apiAlertListWidget = (ApiAlertListWidget) o;
    return Objects.equals(this.id, apiAlertListWidget.id) &&
        Objects.equals(this.type, apiAlertListWidget.type) &&
        Objects.equals(this.title, apiAlertListWidget.title) &&
        Objects.equals(this.visualMode, apiAlertListWidget.visualMode) &&
        Objects.equals(this.embedUrl, apiAlertListWidget.embedUrl) &&
        Objects.equals(this.isEmbedded, apiAlertListWidget.isEmbedded) &&
        Objects.equals(this.metricGroup, apiAlertListWidget.metricGroup) &&
        Objects.equals(this.direction, apiAlertListWidget.direction) &&
        Objects.equals(this.metric, apiAlertListWidget.metric) &&
        Objects.equals(this.filters, apiAlertListWidget.filters) &&
        Objects.equals(this.measure, apiAlertListWidget.measure) &&
        Objects.equals(this.fixedTimespan, apiAlertListWidget.fixedTimespan) &&
        Objects.equals(this.apiLink, apiAlertListWidget.apiLink) &&
        Objects.equals(this.shouldExcludeAlertSuppressionWindows, apiAlertListWidget.shouldExcludeAlertSuppressionWindows) &&
        Objects.equals(this.links, apiAlertListWidget.links) &&
        Objects.equals(this.alertTypes, apiAlertListWidget.alertTypes) &&
        Objects.equals(this.limitTo, apiAlertListWidget.limitTo) &&
        Objects.equals(this.activeWithin, apiAlertListWidget.activeWithin) &&
        Objects.equals(this.dataSource, apiAlertListWidget.dataSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, title, visualMode, embedUrl, isEmbedded, metricGroup, direction, metric, filters, measure, fixedTimespan, apiLink, shouldExcludeAlertSuppressionWindows, links, alertTypes, limitTo, activeWithin, dataSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAlertListWidget {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    sb.append("    alertTypes: ").append(toIndentedString(alertTypes)).append("\n");
    sb.append("    limitTo: ").append(toIndentedString(limitTo)).append("\n");
    sb.append("    activeWithin: ").append(toIndentedString(activeWithin)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("type");
    openapiFields.add("title");
    openapiFields.add("visualMode");
    openapiFields.add("embedUrl");
    openapiFields.add("isEmbedded");
    openapiFields.add("metricGroup");
    openapiFields.add("direction");
    openapiFields.add("metric");
    openapiFields.add("filters");
    openapiFields.add("measure");
    openapiFields.add("fixedTimespan");
    openapiFields.add("apiLink");
    openapiFields.add("shouldExcludeAlertSuppressionWindows");
    openapiFields.add("_links");
    openapiFields.add("alertTypes");
    openapiFields.add("limitTo");
    openapiFields.add("activeWithin");
    openapiFields.add("dataSource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiAlertListWidget
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiAlertListWidget.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiAlertListWidget is not found in the empty JSON string", ApiAlertListWidget.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiAlertListWidget.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiAlertListWidget` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("embedUrl") != null && !jsonObj.get("embedUrl").isJsonNull()) && !jsonObj.get("embedUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `embedUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("embedUrl").toString()));
      }
      // validate the optional field `measure`
      if (jsonObj.get("measure") != null && !jsonObj.get("measure").isJsonNull()) {
        ApiWidgetMeasure.validateJsonElement(jsonObj.get("measure"));
      }
      // validate the optional field `fixedTimespan`
      if (jsonObj.get("fixedTimespan") != null && !jsonObj.get("fixedTimespan").isJsonNull()) {
        ApiDuration.validateJsonElement(jsonObj.get("fixedTimespan"));
      }
      if ((jsonObj.get("apiLink") != null && !jsonObj.get("apiLink").isJsonNull()) && !jsonObj.get("apiLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiLink").toString()));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        SelfLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("alertTypes") != null && !jsonObj.get("alertTypes").isJsonNull() && !jsonObj.get("alertTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `alertTypes` to be an array in the JSON string but got `%s`", jsonObj.get("alertTypes").toString()));
      }
      // validate the optional field `activeWithin`
      if (jsonObj.get("activeWithin") != null && !jsonObj.get("activeWithin").isJsonNull()) {
        ApiAlertListWidgetAllOfActiveWithin.validateJsonElement(jsonObj.get("activeWithin"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiAlertListWidget.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiAlertListWidget' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiAlertListWidget> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiAlertListWidget.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiAlertListWidget>() {
           @Override
           public void write(JsonWriter out, ApiAlertListWidget value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiAlertListWidget read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiAlertListWidget given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiAlertListWidget
  * @throws IOException if the JSON string is invalid with respect to ApiAlertListWidget
  */
  public static ApiAlertListWidget fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiAlertListWidget.class);
  }

 /**
  * Convert an instance of ApiAlertListWidget to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
