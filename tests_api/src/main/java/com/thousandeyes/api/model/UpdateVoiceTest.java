/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
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
import com.thousandeyes.api.model.TestDscpId;
import com.thousandeyes.api.model.TestInterval;
import com.thousandeyes.api.model.TestRequestAllOfAgents;
import com.thousandeyes.api.model.UnexpandedInstantTestLinks;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * UpdateVoiceTest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:15.741232Z[Europe/London]")
public class UpdateVoiceTest {
  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private TestInterval interval;

  public static final String SERIALIZED_NAME_ALERTS_ENABLED = "alertsEnabled";
  @SerializedName(SERIALIZED_NAME_ALERTS_ENABLED)
  private Boolean alertsEnabled;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = true;

  public static final String SERIALIZED_NAME_ALERT_RULES = "alertRules";
  @SerializedName(SERIALIZED_NAME_ALERT_RULES)
  private List<String> alertRules;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LIVE_SHARE = "liveShare";
  @SerializedName(SERIALIZED_NAME_LIVE_SHARE)
  private Boolean liveShare;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_SAVED_EVENT = "savedEvent";
  @SerializedName(SERIALIZED_NAME_SAVED_EVENT)
  private Boolean savedEvent;

  public static final String SERIALIZED_NAME_TEST_ID = "testId";
  @SerializedName(SERIALIZED_NAME_TEST_ID)
  private String testId;

  public static final String SERIALIZED_NAME_TEST_NAME = "testName";
  @SerializedName(SERIALIZED_NAME_TEST_NAME)
  private String testName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private UnexpandedInstantTestLinks links;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels;

  public static final String SERIALIZED_NAME_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  @SerializedName(SERIALIZED_NAME_SHARED_WITH_ACCOUNTS)
  private List<String> sharedWithAccounts;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<TestRequestAllOfAgents> agents = new ArrayList<>();

  public static final String SERIALIZED_NAME_CODEC = "codec";
  @SerializedName(SERIALIZED_NAME_CODEC)
  private String codec;

  public static final String SERIALIZED_NAME_CODEC_ID = "codecId";
  @SerializedName(SERIALIZED_NAME_CODEC_ID)
  private String codecId;

  public static final String SERIALIZED_NAME_DSCP = "dscp";
  @SerializedName(SERIALIZED_NAME_DSCP)
  private String dscp;

  public static final String SERIALIZED_NAME_DSCP_ID = "dscpId";
  @SerializedName(SERIALIZED_NAME_DSCP_ID)
  private TestDscpId dscpId = TestDscpId._0;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration = 5;

  public static final String SERIALIZED_NAME_JITTER_BUFFER = "jitterBuffer";
  @SerializedName(SERIALIZED_NAME_JITTER_BUFFER)
  private Integer jitterBuffer = 40;

  public static final String SERIALIZED_NAME_NUM_PATH_TRACES = "numPathTraces";
  @SerializedName(SERIALIZED_NAME_NUM_PATH_TRACES)
  private Integer numPathTraces = 3;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_TARGET_AGENT_ID = "targetAgentId";
  @SerializedName(SERIALIZED_NAME_TARGET_AGENT_ID)
  private String targetAgentId;

  public static final String SERIALIZED_NAME_BGP_MEASUREMENTS = "bgpMeasurements";
  @SerializedName(SERIALIZED_NAME_BGP_MEASUREMENTS)
  private Boolean bgpMeasurements = true;

  public UpdateVoiceTest() {
  }

  
  public UpdateVoiceTest(
     String createdBy, 
     OffsetDateTime createdDate, 
     Boolean liveShare, 
     String modifiedBy, 
     OffsetDateTime modifiedDate, 
     Boolean savedEvent, 
     String testId, 
     String type, 
     String codec, 
     String dscp
  ) {
    this();
    this.createdBy = createdBy;
    this.createdDate = createdDate;
    this.liveShare = liveShare;
    this.modifiedBy = modifiedBy;
    this.modifiedDate = modifiedDate;
    this.savedEvent = savedEvent;
    this.testId = testId;
    this.type = type;
    this.codec = codec;
    this.dscp = dscp;
  }

  public UpdateVoiceTest interval(TestInterval interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nonnull
  public TestInterval getInterval() {
    return interval;
  }


  public void setInterval(TestInterval interval) {
    this.interval = interval;
  }


  public UpdateVoiceTest alertsEnabled(Boolean alertsEnabled) {
    
    this.alertsEnabled = alertsEnabled;
    return this;
  }

   /**
   * Indicates if alerts are enabled.
   * @return alertsEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getAlertsEnabled() {
    return alertsEnabled;
  }


  public void setAlertsEnabled(Boolean alertsEnabled) {
    this.alertsEnabled = alertsEnabled;
  }


  public UpdateVoiceTest enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Test is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public UpdateVoiceTest alertRules(List<String> alertRules) {
    
    this.alertRules = alertRules;
    return this;
  }

  public UpdateVoiceTest addAlertRulesItem(String alertRulesItem) {
    if (this.alertRules == null) {
      this.alertRules = new ArrayList<>();
    }
    this.alertRules.add(alertRulesItem);
    return this;
  }

   /**
   * List of alert rules IDs to apply to the test (get &#x60;ruleId&#x60; from &#x60;/alerts/rules&#x60; endpoint. If &#x60;alertsEnabled&#x60; is set to &#x60;true&#x60; and &#x60;alertRules&#x60; is not included on test creation or update, applicable user default alert rules will be used)
   * @return alertRules
  **/
  @javax.annotation.Nullable
  public List<String> getAlertRules() {
    return alertRules;
  }


  public void setAlertRules(List<String> alertRules) {
    this.alertRules = alertRules;
  }


   /**
   * User that created the test.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public UpdateVoiceTest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the test.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Indicates if the test is shared with the account group.
   * @return liveShare
  **/
  @javax.annotation.Nullable
  public Boolean getLiveShare() {
    return liveShare;
  }




   /**
   * User that modified the test.
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  public String getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * Indicates if the test is a saved event.
   * @return savedEvent
  **/
  @javax.annotation.Nullable
  public Boolean getSavedEvent() {
    return savedEvent;
  }




   /**
   * Each test is assigned an unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @javax.annotation.Nullable
  public String getTestId() {
    return testId;
  }




  public UpdateVoiceTest testName(String testName) {
    
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test. Test name must be unique.
   * @return testName
  **/
  @javax.annotation.Nullable
  public String getTestName() {
    return testName;
  }


  public void setTestName(String testName) {
    this.testName = testName;
  }


   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }




  public UpdateVoiceTest links(UnexpandedInstantTestLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public UnexpandedInstantTestLinks getLinks() {
    return links;
  }


  public void setLinks(UnexpandedInstantTestLinks links) {
    this.links = links;
  }


  public UpdateVoiceTest labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public UpdateVoiceTest addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Contains list of test label IDs (get &#x60;labelId&#x60; from &#x60;/labels&#x60; endpoint)
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public UpdateVoiceTest sharedWithAccounts(List<String> sharedWithAccounts) {
    
    this.sharedWithAccounts = sharedWithAccounts;
    return this;
  }

  public UpdateVoiceTest addSharedWithAccountsItem(String sharedWithAccountsItem) {
    if (this.sharedWithAccounts == null) {
      this.sharedWithAccounts = new ArrayList<>();
    }
    this.sharedWithAccounts.add(sharedWithAccountsItem);
    return this;
  }

   /**
   * Contains list of account group IDs. Test is shared with the listed account groups (get &#x60;aid&#x60; from &#x60;/account-groups&#x60; endpoint)
   * @return sharedWithAccounts
  **/
  @javax.annotation.Nullable
  public List<String> getSharedWithAccounts() {
    return sharedWithAccounts;
  }


  public void setSharedWithAccounts(List<String> sharedWithAccounts) {
    this.sharedWithAccounts = sharedWithAccounts;
  }


  public UpdateVoiceTest agents(List<TestRequestAllOfAgents> agents) {
    
    this.agents = agents;
    return this;
  }

  public UpdateVoiceTest addAgentsItem(TestRequestAllOfAgents agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Contains list of object with required &#x60;agentId&#x60; and optional &#x60;sourceIpAddress&#x60;
   * @return agents
  **/
  @javax.annotation.Nonnull
  public List<TestRequestAllOfAgents> getAgents() {
    return agents;
  }


  public void setAgents(List<TestRequestAllOfAgents> agents) {
    this.agents = agents;
  }


   /**
   * Codec label
   * @return codec
  **/
  @javax.annotation.Nullable
  public String getCodec() {
    return codec;
  }




  public UpdateVoiceTest codecId(String codecId) {
    
    this.codecId = codecId;
    return this;
  }

   /**
   * Coded ID, [see the list of acceptable values](https://docs.thousandeyes.com/product-documentation/internet-and-wan-monitoring/tests/working-with-test-settings#rtp-stream-advanced-settings-tab)
   * @return codecId
  **/
  @javax.annotation.Nullable
  public String getCodecId() {
    return codecId;
  }


  public void setCodecId(String codecId) {
    this.codecId = codecId;
  }


   /**
   * DSCP label.
   * @return dscp
  **/
  @javax.annotation.Nullable
  public String getDscp() {
    return dscp;
  }




  public UpdateVoiceTest dscpId(TestDscpId dscpId) {
    
    this.dscpId = dscpId;
    return this;
  }

   /**
   * Get dscpId
   * @return dscpId
  **/
  @javax.annotation.Nullable
  public TestDscpId getDscpId() {
    return dscpId;
  }


  public void setDscpId(TestDscpId dscpId) {
    this.dscpId = dscpId;
  }


  public UpdateVoiceTest duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Duration of the test in seconds.
   * minimum: 5
   * maximum: 30
   * @return duration
  **/
  @javax.annotation.Nullable
  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public UpdateVoiceTest jitterBuffer(Integer jitterBuffer) {
    
    this.jitterBuffer = jitterBuffer;
    return this;
  }

   /**
   * De-jitter buffer size in seconds.
   * minimum: 0
   * maximum: 150
   * @return jitterBuffer
  **/
  @javax.annotation.Nullable
  public Integer getJitterBuffer() {
    return jitterBuffer;
  }


  public void setJitterBuffer(Integer jitterBuffer) {
    this.jitterBuffer = jitterBuffer;
  }


  public UpdateVoiceTest numPathTraces(Integer numPathTraces) {
    
    this.numPathTraces = numPathTraces;
    return this;
  }

   /**
   * Number of path traces executed by the agent.
   * minimum: 3
   * maximum: 10
   * @return numPathTraces
  **/
  @javax.annotation.Nullable
  public Integer getNumPathTraces() {
    return numPathTraces;
  }


  public void setNumPathTraces(Integer numPathTraces) {
    this.numPathTraces = numPathTraces;
  }


  public UpdateVoiceTest port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port number for the chosen protocol.
   * minimum: 1024
   * maximum: 65535
   * @return port
  **/
  @javax.annotation.Nullable
  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public UpdateVoiceTest targetAgentId(String targetAgentId) {
    
    this.targetAgentId = targetAgentId;
    return this;
  }

   /**
   * Agent ID of the target agent for the test.
   * @return targetAgentId
  **/
  @javax.annotation.Nonnull
  public String getTargetAgentId() {
    return targetAgentId;
  }


  public void setTargetAgentId(String targetAgentId) {
    this.targetAgentId = targetAgentId;
  }


  public UpdateVoiceTest bgpMeasurements(Boolean bgpMeasurements) {
    
    this.bgpMeasurements = bgpMeasurements;
    return this;
  }

   /**
   * Set to &#x60;true&#x60; to enable bgp measurements.
   * @return bgpMeasurements
  **/
  @javax.annotation.Nullable
  public Boolean getBgpMeasurements() {
    return bgpMeasurements;
  }


  public void setBgpMeasurements(Boolean bgpMeasurements) {
    this.bgpMeasurements = bgpMeasurements;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVoiceTest updateVoiceTest = (UpdateVoiceTest) o;
    return Objects.equals(this.interval, updateVoiceTest.interval) &&
        Objects.equals(this.alertsEnabled, updateVoiceTest.alertsEnabled) &&
        Objects.equals(this.enabled, updateVoiceTest.enabled) &&
        Objects.equals(this.alertRules, updateVoiceTest.alertRules) &&
        Objects.equals(this.createdBy, updateVoiceTest.createdBy) &&
        Objects.equals(this.createdDate, updateVoiceTest.createdDate) &&
        Objects.equals(this.description, updateVoiceTest.description) &&
        Objects.equals(this.liveShare, updateVoiceTest.liveShare) &&
        Objects.equals(this.modifiedBy, updateVoiceTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, updateVoiceTest.modifiedDate) &&
        Objects.equals(this.savedEvent, updateVoiceTest.savedEvent) &&
        Objects.equals(this.testId, updateVoiceTest.testId) &&
        Objects.equals(this.testName, updateVoiceTest.testName) &&
        Objects.equals(this.type, updateVoiceTest.type) &&
        Objects.equals(this.links, updateVoiceTest.links) &&
        Objects.equals(this.labels, updateVoiceTest.labels) &&
        Objects.equals(this.sharedWithAccounts, updateVoiceTest.sharedWithAccounts) &&
        Objects.equals(this.agents, updateVoiceTest.agents) &&
        Objects.equals(this.codec, updateVoiceTest.codec) &&
        Objects.equals(this.codecId, updateVoiceTest.codecId) &&
        Objects.equals(this.dscp, updateVoiceTest.dscp) &&
        Objects.equals(this.dscpId, updateVoiceTest.dscpId) &&
        Objects.equals(this.duration, updateVoiceTest.duration) &&
        Objects.equals(this.jitterBuffer, updateVoiceTest.jitterBuffer) &&
        Objects.equals(this.numPathTraces, updateVoiceTest.numPathTraces) &&
        Objects.equals(this.port, updateVoiceTest.port) &&
        Objects.equals(this.targetAgentId, updateVoiceTest.targetAgentId) &&
        Objects.equals(this.bgpMeasurements, updateVoiceTest.bgpMeasurements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, alertsEnabled, enabled, alertRules, createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, agents, codec, codecId, dscp, dscpId, duration, jitterBuffer, numPathTraces, port, targetAgentId, bgpMeasurements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVoiceTest {\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    alertsEnabled: ").append(toIndentedString(alertsEnabled)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    liveShare: ").append(toIndentedString(liveShare)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    savedEvent: ").append(toIndentedString(savedEvent)).append("\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    testName: ").append(toIndentedString(testName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    sharedWithAccounts: ").append(toIndentedString(sharedWithAccounts)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    codecId: ").append(toIndentedString(codecId)).append("\n");
    sb.append("    dscp: ").append(toIndentedString(dscp)).append("\n");
    sb.append("    dscpId: ").append(toIndentedString(dscpId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    jitterBuffer: ").append(toIndentedString(jitterBuffer)).append("\n");
    sb.append("    numPathTraces: ").append(toIndentedString(numPathTraces)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    targetAgentId: ").append(toIndentedString(targetAgentId)).append("\n");
    sb.append("    bgpMeasurements: ").append(toIndentedString(bgpMeasurements)).append("\n");
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
    openapiFields.add("interval");
    openapiFields.add("alertsEnabled");
    openapiFields.add("enabled");
    openapiFields.add("alertRules");
    openapiFields.add("createdBy");
    openapiFields.add("createdDate");
    openapiFields.add("description");
    openapiFields.add("liveShare");
    openapiFields.add("modifiedBy");
    openapiFields.add("modifiedDate");
    openapiFields.add("savedEvent");
    openapiFields.add("testId");
    openapiFields.add("testName");
    openapiFields.add("type");
    openapiFields.add("_links");
    openapiFields.add("labels");
    openapiFields.add("sharedWithAccounts");
    openapiFields.add("agents");
    openapiFields.add("codec");
    openapiFields.add("codecId");
    openapiFields.add("dscp");
    openapiFields.add("dscpId");
    openapiFields.add("duration");
    openapiFields.add("jitterBuffer");
    openapiFields.add("numPathTraces");
    openapiFields.add("port");
    openapiFields.add("targetAgentId");
    openapiFields.add("bgpMeasurements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("interval");
    openapiRequiredFields.add("agents");
    openapiRequiredFields.add("targetAgentId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateVoiceTest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateVoiceTest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateVoiceTest is not found in the empty JSON string", UpdateVoiceTest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateVoiceTest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateVoiceTest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateVoiceTest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("alertRules") != null && !jsonObj.get("alertRules").isJsonNull() && !jsonObj.get("alertRules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `alertRules` to be an array in the JSON string but got `%s`", jsonObj.get("alertRules").toString()));
      }
      if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull()) && !jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("modifiedBy") != null && !jsonObj.get("modifiedBy").isJsonNull()) && !jsonObj.get("modifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedBy").toString()));
      }
      if ((jsonObj.get("testId") != null && !jsonObj.get("testId").isJsonNull()) && !jsonObj.get("testId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testId").toString()));
      }
      if ((jsonObj.get("testName") != null && !jsonObj.get("testName").isJsonNull()) && !jsonObj.get("testName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testName").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `_links`
      if (jsonObj.get("_links") != null && !jsonObj.get("_links").isJsonNull()) {
        UnexpandedInstantTestLinks.validateJsonElement(jsonObj.get("_links"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull() && !jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sharedWithAccounts") != null && !jsonObj.get("sharedWithAccounts").isJsonNull() && !jsonObj.get("sharedWithAccounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sharedWithAccounts` to be an array in the JSON string but got `%s`", jsonObj.get("sharedWithAccounts").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("agents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `agents` to be an array in the JSON string but got `%s`", jsonObj.get("agents").toString()));
      }

      JsonArray jsonArrayagents = jsonObj.getAsJsonArray("agents");
      // validate the required field `agents` (array)
      for (int i = 0; i < jsonArrayagents.size(); i++) {
        TestRequestAllOfAgents.validateJsonElement(jsonArrayagents.get(i));
      };
      if ((jsonObj.get("codec") != null && !jsonObj.get("codec").isJsonNull()) && !jsonObj.get("codec").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codec` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codec").toString()));
      }
      if ((jsonObj.get("codecId") != null && !jsonObj.get("codecId").isJsonNull()) && !jsonObj.get("codecId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codecId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codecId").toString()));
      }
      if ((jsonObj.get("dscp") != null && !jsonObj.get("dscp").isJsonNull()) && !jsonObj.get("dscp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dscp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dscp").toString()));
      }
      if (!jsonObj.get("targetAgentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetAgentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetAgentId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateVoiceTest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateVoiceTest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateVoiceTest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateVoiceTest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateVoiceTest>() {
           @Override
           public void write(JsonWriter out, UpdateVoiceTest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateVoiceTest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateVoiceTest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateVoiceTest
  * @throws IOException if the JSON string is invalid with respect to UpdateVoiceTest
  */
  public static UpdateVoiceTest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateVoiceTest.class);
  }

 /**
  * Convert an instance of UpdateVoiceTest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
