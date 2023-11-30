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
import com.thousandeyes.api.model.ApiDashboardSnapshotAllOfDashboard;
import com.thousandeyes.api.model.ApiReportSnapshotTimeSpan;
import com.thousandeyes.api.model.ApiWidget;
import com.thousandeyes.api.model.DashboardSnapshotLinksLinks;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
 * ApiDashboardSnapshot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:19.739212Z[Europe/London]")
public class ApiDashboardSnapshot {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private DashboardSnapshotLinksLinks links;

  public static final String SERIALIZED_NAME_SNAPSHOT_ID = "snapshotId";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
  private UUID snapshotId;

  public static final String SERIALIZED_NAME_SNAPSHOT_NAME = "snapshotName";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_NAME)
  private String snapshotName;

  public static final String SERIALIZED_NAME_AID = "aid";
  @SerializedName(SERIALIZED_NAME_AID)
  private String aid;

  public static final String SERIALIZED_NAME_IS_SHARED = "isShared";
  @SerializedName(SERIALIZED_NAME_IS_SHARED)
  private Boolean isShared;

  public static final String SERIALIZED_NAME_SNAPSHOT_CREATED_DATE = "snapshotCreatedDate";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_CREATED_DATE)
  private OffsetDateTime snapshotCreatedDate;

  public static final String SERIALIZED_NAME_DASHBOARD = "dashboard";
  @SerializedName(SERIALIZED_NAME_DASHBOARD)
  private ApiDashboardSnapshotAllOfDashboard dashboard;

  public static final String SERIALIZED_NAME_WIDGETS = "widgets";
  @SerializedName(SERIALIZED_NAME_WIDGETS)
  private List<ApiWidget> widgets;

  public static final String SERIALIZED_NAME_IS_SCHEDULED = "isScheduled";
  @SerializedName(SERIALIZED_NAME_IS_SCHEDULED)
  private Boolean isScheduled;

  public static final String SERIALIZED_NAME_TIME_SPAN = "timeSpan";
  @SerializedName(SERIALIZED_NAME_TIME_SPAN)
  private ApiReportSnapshotTimeSpan timeSpan;

  public static final String SERIALIZED_NAME_SNAPSHOT_EXPIRATION_DATE = "snapshotExpirationDate";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_EXPIRATION_DATE)
  private OffsetDateTime snapshotExpirationDate;

  public ApiDashboardSnapshot() {
  }

  public ApiDashboardSnapshot links(DashboardSnapshotLinksLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public DashboardSnapshotLinksLinks getLinks() {
    return links;
  }


  public void setLinks(DashboardSnapshotLinksLinks links) {
    this.links = links;
  }


  public ApiDashboardSnapshot snapshotId(UUID snapshotId) {
    
    this.snapshotId = snapshotId;
    return this;
  }

   /**
   * Identifier of the dashboard snapshot.
   * @return snapshotId
  **/
  @javax.annotation.Nullable
  public UUID getSnapshotId() {
    return snapshotId;
  }


  public void setSnapshotId(UUID snapshotId) {
    this.snapshotId = snapshotId;
  }


  public ApiDashboardSnapshot snapshotName(String snapshotName) {
    
    this.snapshotName = snapshotName;
    return this;
  }

   /**
   * Name of the dashboard snapshot.
   * @return snapshotName
  **/
  @javax.annotation.Nullable
  public String getSnapshotName() {
    return snapshotName;
  }


  public void setSnapshotName(String snapshotName) {
    this.snapshotName = snapshotName;
  }


  public ApiDashboardSnapshot aid(String aid) {
    
    this.aid = aid;
    return this;
  }

   /**
   * Identifier of the account group that the snapshot belongs to.
   * @return aid
  **/
  @javax.annotation.Nullable
  public String getAid() {
    return aid;
  }


  public void setAid(String aid) {
    this.aid = aid;
  }


  public ApiDashboardSnapshot isShared(Boolean isShared) {
    
    this.isShared = isShared;
    return this;
  }

   /**
   * Set &#x60;true&#x60; if dashboard snapshot is shared, &#x60;false&#x60; otherwise.
   * @return isShared
  **/
  @javax.annotation.Nullable
  public Boolean getIsShared() {
    return isShared;
  }


  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }


  public ApiDashboardSnapshot snapshotCreatedDate(OffsetDateTime snapshotCreatedDate) {
    
    this.snapshotCreatedDate = snapshotCreatedDate;
    return this;
  }

   /**
   * UTC date when dashboard snapshot was created (ISO date-time format).
   * @return snapshotCreatedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getSnapshotCreatedDate() {
    return snapshotCreatedDate;
  }


  public void setSnapshotCreatedDate(OffsetDateTime snapshotCreatedDate) {
    this.snapshotCreatedDate = snapshotCreatedDate;
  }


  public ApiDashboardSnapshot dashboard(ApiDashboardSnapshotAllOfDashboard dashboard) {
    
    this.dashboard = dashboard;
    return this;
  }

   /**
   * Get dashboard
   * @return dashboard
  **/
  @javax.annotation.Nullable
  public ApiDashboardSnapshotAllOfDashboard getDashboard() {
    return dashboard;
  }


  public void setDashboard(ApiDashboardSnapshotAllOfDashboard dashboard) {
    this.dashboard = dashboard;
  }


  public ApiDashboardSnapshot widgets(List<ApiWidget> widgets) {
    
    this.widgets = widgets;
    return this;
  }

  public ApiDashboardSnapshot addWidgetsItem(ApiWidget widgetsItem) {
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
  @javax.annotation.Nullable
  public List<ApiWidget> getWidgets() {
    return widgets;
  }


  public void setWidgets(List<ApiWidget> widgets) {
    this.widgets = widgets;
  }


  public ApiDashboardSnapshot isScheduled(Boolean isScheduled) {
    
    this.isScheduled = isScheduled;
    return this;
  }

   /**
   * Set &#x60;true&#x60; if dashboard snapshot was generated from a schedule, &#x60;false&#x60; otherwise.
   * @return isScheduled
  **/
  @javax.annotation.Nullable
  public Boolean getIsScheduled() {
    return isScheduled;
  }


  public void setIsScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
  }


  public ApiDashboardSnapshot timeSpan(ApiReportSnapshotTimeSpan timeSpan) {
    
    this.timeSpan = timeSpan;
    return this;
  }

   /**
   * Get timeSpan
   * @return timeSpan
  **/
  @javax.annotation.Nullable
  public ApiReportSnapshotTimeSpan getTimeSpan() {
    return timeSpan;
  }


  public void setTimeSpan(ApiReportSnapshotTimeSpan timeSpan) {
    this.timeSpan = timeSpan;
  }


  public ApiDashboardSnapshot snapshotExpirationDate(OffsetDateTime snapshotExpirationDate) {
    
    this.snapshotExpirationDate = snapshotExpirationDate;
    return this;
  }

   /**
   * Expiration date of the snapshot. If unspecified, the snapshot expires 1 year from its creation date. The expiration date must be set within 5 years from the current date and adhere to the ISO date-time format.
   * @return snapshotExpirationDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getSnapshotExpirationDate() {
    return snapshotExpirationDate;
  }


  public void setSnapshotExpirationDate(OffsetDateTime snapshotExpirationDate) {
    this.snapshotExpirationDate = snapshotExpirationDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDashboardSnapshot apiDashboardSnapshot = (ApiDashboardSnapshot) o;
    return Objects.equals(this.links, apiDashboardSnapshot.links) &&
        Objects.equals(this.snapshotId, apiDashboardSnapshot.snapshotId) &&
        Objects.equals(this.snapshotName, apiDashboardSnapshot.snapshotName) &&
        Objects.equals(this.aid, apiDashboardSnapshot.aid) &&
        Objects.equals(this.isShared, apiDashboardSnapshot.isShared) &&
        Objects.equals(this.snapshotCreatedDate, apiDashboardSnapshot.snapshotCreatedDate) &&
        Objects.equals(this.dashboard, apiDashboardSnapshot.dashboard) &&
        Objects.equals(this.widgets, apiDashboardSnapshot.widgets) &&
        Objects.equals(this.isScheduled, apiDashboardSnapshot.isScheduled) &&
        Objects.equals(this.timeSpan, apiDashboardSnapshot.timeSpan) &&
        Objects.equals(this.snapshotExpirationDate, apiDashboardSnapshot.snapshotExpirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, snapshotId, snapshotName, aid, isShared, snapshotCreatedDate, dashboard, widgets, isScheduled, timeSpan, snapshotExpirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDashboardSnapshot {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
    sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
    sb.append("    aid: ").append(toIndentedString(aid)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    snapshotCreatedDate: ").append(toIndentedString(snapshotCreatedDate)).append("\n");
    sb.append("    dashboard: ").append(toIndentedString(dashboard)).append("\n");
    sb.append("    widgets: ").append(toIndentedString(widgets)).append("\n");
    sb.append("    isScheduled: ").append(toIndentedString(isScheduled)).append("\n");
    sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
    sb.append("    snapshotExpirationDate: ").append(toIndentedString(snapshotExpirationDate)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("snapshotId");
    openapiFields.add("snapshotName");
    openapiFields.add("aid");
    openapiFields.add("isShared");
    openapiFields.add("snapshotCreatedDate");
    openapiFields.add("dashboard");
    openapiFields.add("widgets");
    openapiFields.add("isScheduled");
    openapiFields.add("timeSpan");
    openapiFields.add("snapshotExpirationDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiDashboardSnapshot
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiDashboardSnapshot.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiDashboardSnapshot is not found in the empty JSON string", ApiDashboardSnapshot.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiDashboardSnapshot.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiDashboardSnapshot` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        DashboardSnapshotLinksLinks.validateJsonElement(jsonObj.get("_links"));
      }
      if ((jsonObj.get("snapshotId") != null && !jsonObj.get("snapshotId").isJsonNull()) && !jsonObj.get("snapshotId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snapshotId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snapshotId").toString()));
      }
      if ((jsonObj.get("snapshotName") != null && !jsonObj.get("snapshotName").isJsonNull()) && !jsonObj.get("snapshotName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `snapshotName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("snapshotName").toString()));
      }
      if ((jsonObj.get("aid") != null && !jsonObj.get("aid").isJsonNull()) && !jsonObj.get("aid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aid").toString()));
      }
      // validate the optional field `dashboard`
      if (jsonObj.get("dashboard") != null && !jsonObj.get("dashboard").isJsonNull()) {
        ApiDashboardSnapshotAllOfDashboard.validateJsonElement(jsonObj.get("dashboard"));
      }
      if (jsonObj.get("widgets") != null && !jsonObj.get("widgets").isJsonNull()) {
        JsonArray jsonArraywidgets = jsonObj.getAsJsonArray("widgets");
        if (jsonArraywidgets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("widgets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `widgets` to be an array in the JSON string but got `%s`", jsonObj.get("widgets").toString()));
          }

          // validate the optional field `widgets` (array)
          for (int i = 0; i < jsonArraywidgets.size(); i++) {
            ApiWidget.validateJsonElement(jsonArraywidgets.get(i));
          };
        }
      }
      // validate the optional field `timeSpan`
      if (jsonObj.get("timeSpan") != null && !jsonObj.get("timeSpan").isJsonNull()) {
        ApiReportSnapshotTimeSpan.validateJsonElement(jsonObj.get("timeSpan"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiDashboardSnapshot.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiDashboardSnapshot' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiDashboardSnapshot> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiDashboardSnapshot.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiDashboardSnapshot>() {
           @Override
           public void write(JsonWriter out, ApiDashboardSnapshot value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiDashboardSnapshot read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiDashboardSnapshot given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiDashboardSnapshot
  * @throws IOException if the JSON string is invalid with respect to ApiDashboardSnapshot
  */
  public static ApiDashboardSnapshot fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiDashboardSnapshot.class);
  }

 /**
  * Convert an instance of ApiDashboardSnapshot to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
