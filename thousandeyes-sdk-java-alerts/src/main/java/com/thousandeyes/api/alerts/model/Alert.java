/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.alerts.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.api.alerts.model.AlertLinksLinks;
import com.thousandeyes.api.alerts.model.AlertType;
import com.thousandeyes.api.alerts.model.BaseAlertAllOfMeta;
import com.thousandeyes.api.alerts.model.Severity;
import com.thousandeyes.api.alerts.model.State;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Alert
 */
@JsonPropertyOrder({
  Alert.JSON_PROPERTY_ID,
  Alert.JSON_PROPERTY_ALERT_TYPE,
  Alert.JSON_PROPERTY_START_DATE,
  Alert.JSON_PROPERTY_END_DATE,
  Alert.JSON_PROPERTY_VIOLATION_COUNT,
  Alert.JSON_PROPERTY_DURATION,
  Alert.JSON_PROPERTY_SUPPRESSED,
  Alert.JSON_PROPERTY_META,
  Alert.JSON_PROPERTY_LINKS,
  Alert.JSON_PROPERTY_ALERT_ID,
  Alert.JSON_PROPERTY_DATE_START,
  Alert.JSON_PROPERTY_DATE_END,
  Alert.JSON_PROPERTY_RULE_ID,
  Alert.JSON_PROPERTY_STATE,
  Alert.JSON_PROPERTY_SEVERITY,
  Alert.JSON_PROPERTY_PERMALINK,
  Alert.JSON_PROPERTY_API_LINKS,
  Alert.JSON_PROPERTY_ALERT_RULE_ID,
  Alert.JSON_PROPERTY_ALERT_STATE,
  Alert.JSON_PROPERTY_ALERT_SEVERITY
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator", date = "2024-04-23T10:36:00.441845+01:00[Europe/London]")
public class Alert {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ALERT_TYPE = "alertType";
  private AlertType alertType;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_VIOLATION_COUNT = "violationCount";
  private Integer violationCount;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private BigDecimal duration;

  public static final String JSON_PROPERTY_SUPPRESSED = "suppressed";
  private Boolean suppressed;

  public static final String JSON_PROPERTY_META = "meta";
  private BaseAlertAllOfMeta meta;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private AlertLinksLinks links;

  public static final String JSON_PROPERTY_ALERT_ID = "alertId";
  private UUID alertId;

  public static final String JSON_PROPERTY_DATE_START = "dateStart";
  private String dateStart;

  public static final String JSON_PROPERTY_DATE_END = "dateEnd";
  private String dateEnd;

  public static final String JSON_PROPERTY_RULE_ID = "ruleId";
  private Integer ruleId;

  /**
   * Current state of the alert. Possible values: clear or trigger.
   */
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    CLEARED("CLEARED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  private StateEnum state;

  /**
   * The severity of the alert.
   */
  public enum SeverityEnum {
    INFO("INFO"),
    
    MAJOR("MAJOR"),
    
    MINOR("MINOR"),
    
    CRITICAL("CRITICAL"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private SeverityEnum severity;

  public static final String JSON_PROPERTY_PERMALINK = "permalink";
  private String permalink;

  public static final String JSON_PROPERTY_API_LINKS = "apiLinks";
  private List<Map<String, Object>> apiLinks;

  public static final String JSON_PROPERTY_ALERT_RULE_ID = "alertRuleId";
  private String alertRuleId;

  public static final String JSON_PROPERTY_ALERT_STATE = "alertState";
  private State alertState;

  public static final String JSON_PROPERTY_ALERT_SEVERITY = "alertSeverity";
  private Severity alertSeverity;

  public Alert() { 
  }

  @JsonCreator
  public Alert(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_START_DATE) OffsetDateTime startDate, 
    @JsonProperty(JSON_PROPERTY_END_DATE) OffsetDateTime endDate, 
    @JsonProperty(JSON_PROPERTY_ALERT_ID) UUID alertId, 
    @JsonProperty(JSON_PROPERTY_DATE_START) String dateStart, 
    @JsonProperty(JSON_PROPERTY_DATE_END) String dateEnd, 
    @JsonProperty(JSON_PROPERTY_RULE_ID) Integer ruleId, 
    @JsonProperty(JSON_PROPERTY_STATE) StateEnum state, 
    @JsonProperty(JSON_PROPERTY_ALERT_RULE_ID) String alertRuleId
  ) {
  this();
    this.id = id;
    this.startDate = startDate;
    this.endDate = endDate;
    this.alertId = alertId;
    this.dateStart = dateStart;
    this.dateEnd = dateEnd;
    this.ruleId = ruleId;
    this.state = state;
    this.alertRuleId = alertRuleId;
  }

   /**
   * A unique ID for each individual alert occurrence.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public Alert alertType(AlertType alertType) {
    this.alertType = alertType;
    return this;
  }

   /**
   * Get alertType
   * @return alertType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertType getAlertType() {
    return alertType;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertType(AlertType alertType) {
    this.alertType = alertType;
  }


   /**
   * The start date and time (in UTC, ISO 8601 format) for querying alerts.
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }




   /**
   * The end date and time (in UTC, ISO 8601 format) for querying alerts.
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }




  public Alert violationCount(Integer violationCount) {
    this.violationCount = violationCount;
    return this;
  }

   /**
   * Number of sources that meet the alert criteria.
   * @return violationCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIOLATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getViolationCount() {
    return violationCount;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViolationCount(Integer violationCount) {
    this.violationCount = violationCount;
  }


  public Alert duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration in seconds the alert was active
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }


  public Alert suppressed(Boolean suppressed) {
    this.suppressed = suppressed;
    return this;
  }

   /**
   * Indicates whether the alert is currently suppressed by a real-time ASW.
   * @return suppressed
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPRESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuppressed() {
    return suppressed;
  }


  @JsonProperty(JSON_PROPERTY_SUPPRESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuppressed(Boolean suppressed) {
    this.suppressed = suppressed;
  }


  public Alert meta(BaseAlertAllOfMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BaseAlertAllOfMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(BaseAlertAllOfMeta meta) {
    this.meta = meta;
  }


  public Alert links(AlertLinksLinks links) {
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

  public AlertLinksLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(AlertLinksLinks links) {
    this.links = links;
  }


   /**
   * A unique ID for each individual alert occurrence.
   * @return alertId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAlertId() {
    return alertId;
  }




   /**
   * The start date and time for querying alerts.
   * @return dateStart
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateStart() {
    return dateStart;
  }




   /**
   * The end date and time for querying alerts.
   * @return dateEnd
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateEnd() {
    return dateEnd;
  }




   /**
   * Unique ID of the rule.
   * @return ruleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRuleId() {
    return ruleId;
  }




   /**
   * Current state of the alert. Possible values: clear or trigger.
   * @return state
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }




  public Alert severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

   /**
   * The severity of the alert.
   * @return severity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SeverityEnum getSeverity() {
    return severity;
  }


  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  public Alert permalink(String permalink) {
    this.permalink = permalink;
    return this;
  }

   /**
   * Hyperlink to alerts list, with row expanded
   * @return permalink
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERMALINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPermalink() {
    return permalink;
  }


  @JsonProperty(JSON_PROPERTY_PERMALINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermalink(String permalink) {
    this.permalink = permalink;
  }


  public Alert apiLinks(List<Map<String, Object>> apiLinks) {
    this.apiLinks = apiLinks;
    return this;
  }

  public Alert addApiLinksItem(Map<String, Object> apiLinksItem) {
    if (this.apiLinks == null) {
      this.apiLinks = new ArrayList<>();
    }
    this.apiLinks.add(apiLinksItem);
    return this;
  }

   /**
   * List of hyperlinks to other areas of the API
   * @return apiLinks
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_API_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Map<String, Object>> getApiLinks() {
    return apiLinks;
  }


  @JsonProperty(JSON_PROPERTY_API_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiLinks(List<Map<String, Object>> apiLinks) {
    this.apiLinks = apiLinks;
  }


   /**
   * Unique ID of the rule.
   * @return alertRuleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlertRuleId() {
    return alertRuleId;
  }




  public Alert alertState(State alertState) {
    this.alertState = alertState;
    return this;
  }

   /**
   * Get alertState
   * @return alertState
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public State getAlertState() {
    return alertState;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertState(State alertState) {
    this.alertState = alertState;
  }


  public Alert alertSeverity(Severity alertSeverity) {
    this.alertSeverity = alertSeverity;
    return this;
  }

   /**
   * Get alertSeverity
   * @return alertSeverity
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALERT_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Severity getAlertSeverity() {
    return alertSeverity;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertSeverity(Severity alertSeverity) {
    this.alertSeverity = alertSeverity;
  }


  /**
   * Return true if this Alert object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Alert alert = (Alert) o;
    return Objects.equals(this.id, alert.id) &&
        Objects.equals(this.alertType, alert.alertType) &&
        Objects.equals(this.startDate, alert.startDate) &&
        Objects.equals(this.endDate, alert.endDate) &&
        Objects.equals(this.violationCount, alert.violationCount) &&
        Objects.equals(this.duration, alert.duration) &&
        Objects.equals(this.suppressed, alert.suppressed) &&
        Objects.equals(this.meta, alert.meta) &&
        Objects.equals(this.links, alert.links) &&
        Objects.equals(this.alertId, alert.alertId) &&
        Objects.equals(this.dateStart, alert.dateStart) &&
        Objects.equals(this.dateEnd, alert.dateEnd) &&
        Objects.equals(this.ruleId, alert.ruleId) &&
        Objects.equals(this.state, alert.state) &&
        Objects.equals(this.severity, alert.severity) &&
        Objects.equals(this.permalink, alert.permalink) &&
        Objects.equals(this.apiLinks, alert.apiLinks) &&
        Objects.equals(this.alertRuleId, alert.alertRuleId) &&
        Objects.equals(this.alertState, alert.alertState) &&
        Objects.equals(this.alertSeverity, alert.alertSeverity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alertType, startDate, endDate, violationCount, duration, suppressed, meta, links, alertId, dateStart, dateEnd, ruleId, state, severity, permalink, apiLinks, alertRuleId, alertState, alertSeverity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Alert {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alertType: ").append(toIndentedString(alertType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    violationCount: ").append(toIndentedString(violationCount)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    permalink: ").append(toIndentedString(permalink)).append("\n");
    sb.append("    apiLinks: ").append(toIndentedString(apiLinks)).append("\n");
    sb.append("    alertRuleId: ").append(toIndentedString(alertRuleId)).append("\n");
    sb.append("    alertState: ").append(toIndentedString(alertState)).append("\n");
    sb.append("    alertSeverity: ").append(toIndentedString(alertSeverity)).append("\n");
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

