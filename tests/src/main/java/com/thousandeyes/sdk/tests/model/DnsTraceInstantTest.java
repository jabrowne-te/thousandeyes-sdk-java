/*
 * Tests API
 * This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests. 
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.thousandeyes.sdk.tests.model.Agent;
import com.thousandeyes.sdk.tests.model.DnsQueryClass;
import com.thousandeyes.sdk.tests.model.SharedWithAccount;
import com.thousandeyes.sdk.tests.model.TestDnsTransportProtocol;
import com.thousandeyes.sdk.tests.model.TestLabel;
import com.thousandeyes.sdk.tests.model.TestLinks;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DnsTraceInstantTest
 */
@JsonPropertyOrder({
  DnsTraceInstantTest.JSON_PROPERTY_CREATED_BY,
  DnsTraceInstantTest.JSON_PROPERTY_CREATED_DATE,
  DnsTraceInstantTest.JSON_PROPERTY_DESCRIPTION,
  DnsTraceInstantTest.JSON_PROPERTY_LIVE_SHARE,
  DnsTraceInstantTest.JSON_PROPERTY_MODIFIED_BY,
  DnsTraceInstantTest.JSON_PROPERTY_MODIFIED_DATE,
  DnsTraceInstantTest.JSON_PROPERTY_SAVED_EVENT,
  DnsTraceInstantTest.JSON_PROPERTY_TEST_ID,
  DnsTraceInstantTest.JSON_PROPERTY_TEST_NAME,
  DnsTraceInstantTest.JSON_PROPERTY_TYPE,
  DnsTraceInstantTest.JSON_PROPERTY_LINKS,
  DnsTraceInstantTest.JSON_PROPERTY_LABELS,
  DnsTraceInstantTest.JSON_PROPERTY_SHARED_WITH_ACCOUNTS,
  DnsTraceInstantTest.JSON_PROPERTY_DNS_TRANSPORT_PROTOCOL,
  DnsTraceInstantTest.JSON_PROPERTY_DOMAIN,
  DnsTraceInstantTest.JSON_PROPERTY_DNS_QUERY_CLASS,
  DnsTraceInstantTest.JSON_PROPERTY_AGENTS
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class DnsTraceInstantTest {
  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LIVE_SHARE = "liveShare";
  private Boolean liveShare;

  public static final String JSON_PROPERTY_MODIFIED_BY = "modifiedBy";
  private String modifiedBy;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_SAVED_EVENT = "savedEvent";
  private Boolean savedEvent;

  public static final String JSON_PROPERTY_TEST_ID = "testId";
  private String testId;

  public static final String JSON_PROPERTY_TEST_NAME = "testName";
  private String testName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private TestLinks links;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<TestLabel> labels = new ArrayList<>();

  public static final String JSON_PROPERTY_SHARED_WITH_ACCOUNTS = "sharedWithAccounts";
  private List<SharedWithAccount> sharedWithAccounts = new ArrayList<>();

  public static final String JSON_PROPERTY_DNS_TRANSPORT_PROTOCOL = "dnsTransportProtocol";
  private TestDnsTransportProtocol dnsTransportProtocol = TestDnsTransportProtocol.UDP;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_DNS_QUERY_CLASS = "dnsQueryClass";
  private DnsQueryClass dnsQueryClass;

  public static final String JSON_PROPERTY_AGENTS = "agents";
  private List<Agent> agents = new ArrayList<>();

  public DnsTraceInstantTest() { 
  }

  @JsonCreator
  public DnsTraceInstantTest(
    @JsonProperty(JSON_PROPERTY_CREATED_BY) String createdBy, 
    @JsonProperty(JSON_PROPERTY_CREATED_DATE) OffsetDateTime createdDate, 
    @JsonProperty(JSON_PROPERTY_LIVE_SHARE) Boolean liveShare, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_BY) String modifiedBy, 
    @JsonProperty(JSON_PROPERTY_MODIFIED_DATE) OffsetDateTime modifiedDate, 
    @JsonProperty(JSON_PROPERTY_SAVED_EVENT) Boolean savedEvent, 
    @JsonProperty(JSON_PROPERTY_TEST_ID) String testId, 
    @JsonProperty(JSON_PROPERTY_TYPE) String type, 
    @JsonProperty(JSON_PROPERTY_LABELS) List<TestLabel> labels, 
    @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS) List<SharedWithAccount> sharedWithAccounts, 
    @JsonProperty(JSON_PROPERTY_AGENTS) List<Agent> agents
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
    this.labels = labels;
    this.sharedWithAccounts = sharedWithAccounts;
    this.agents = agents;
  }

   /**
   * User that created the test.
   * @return createdBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * UTC created date (ISO date-time format).
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }




  public DnsTraceInstantTest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the test.
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


   /**
   * Indicates if the test is shared with the account group.
   * @return liveShare
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLiveShare() {
    return liveShare;
  }




   /**
   * User that modified the test.
   * @return modifiedBy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModifiedBy() {
    return modifiedBy;
  }




   /**
   * UTC last modification date (ISO date-time format).
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }




   /**
   * Indicates if the test is a saved event.
   * @return savedEvent
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAVED_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSavedEvent() {
    return savedEvent;
  }




   /**
   * Each test is assigned an unique ID; this is used to access test information and results from other endpoints.
   * @return testId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestId() {
    return testId;
  }




  public DnsTraceInstantTest testName(String testName) {
    this.testName = testName;
    return this;
  }

   /**
   * The name of the test. Test name must be unique.
   * @return testName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTestName() {
    return testName;
  }


  @JsonProperty(JSON_PROPERTY_TEST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestName(String testName) {
    this.testName = testName;
  }


   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }




  public DnsTraceInstantTest links(TestLinks links) {
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

  public TestLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(TestLinks links) {
    this.links = links;
  }


   /**
   * Get labels
   * @return labels
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TestLabel> getLabels() {
    return labels;
  }




   /**
   * Get sharedWithAccounts
   * @return sharedWithAccounts
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHARED_WITH_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SharedWithAccount> getSharedWithAccounts() {
    return sharedWithAccounts;
  }




  public DnsTraceInstantTest dnsTransportProtocol(TestDnsTransportProtocol dnsTransportProtocol) {
    this.dnsTransportProtocol = dnsTransportProtocol;
    return this;
  }

   /**
   * Get dnsTransportProtocol
   * @return dnsTransportProtocol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_TRANSPORT_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestDnsTransportProtocol getDnsTransportProtocol() {
    return dnsTransportProtocol;
  }


  @JsonProperty(JSON_PROPERTY_DNS_TRANSPORT_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsTransportProtocol(TestDnsTransportProtocol dnsTransportProtocol) {
    this.dnsTransportProtocol = dnsTransportProtocol;
  }


  public DnsTraceInstantTest domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The target record for the test, with the record type suffixed. If no record type is specified, the test defaults to an ANY record.
   * @return domain
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public DnsTraceInstantTest dnsQueryClass(DnsQueryClass dnsQueryClass) {
    this.dnsQueryClass = dnsQueryClass;
    return this;
  }

   /**
   * Get dnsQueryClass
   * @return dnsQueryClass
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DNS_QUERY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DnsQueryClass getDnsQueryClass() {
    return dnsQueryClass;
  }


  @JsonProperty(JSON_PROPERTY_DNS_QUERY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsQueryClass(DnsQueryClass dnsQueryClass) {
    this.dnsQueryClass = dnsQueryClass;
  }


   /**
   * Contains list of agents.
   * @return agents
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Agent> getAgents() {
    return agents;
  }




  /**
   * Return true if this DnsTraceInstantTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsTraceInstantTest dnsTraceInstantTest = (DnsTraceInstantTest) o;
    return Objects.equals(this.createdBy, dnsTraceInstantTest.createdBy) &&
        Objects.equals(this.createdDate, dnsTraceInstantTest.createdDate) &&
        Objects.equals(this.description, dnsTraceInstantTest.description) &&
        Objects.equals(this.liveShare, dnsTraceInstantTest.liveShare) &&
        Objects.equals(this.modifiedBy, dnsTraceInstantTest.modifiedBy) &&
        Objects.equals(this.modifiedDate, dnsTraceInstantTest.modifiedDate) &&
        Objects.equals(this.savedEvent, dnsTraceInstantTest.savedEvent) &&
        Objects.equals(this.testId, dnsTraceInstantTest.testId) &&
        Objects.equals(this.testName, dnsTraceInstantTest.testName) &&
        Objects.equals(this.type, dnsTraceInstantTest.type) &&
        Objects.equals(this.links, dnsTraceInstantTest.links) &&
        Objects.equals(this.labels, dnsTraceInstantTest.labels) &&
        Objects.equals(this.sharedWithAccounts, dnsTraceInstantTest.sharedWithAccounts) &&
        Objects.equals(this.dnsTransportProtocol, dnsTraceInstantTest.dnsTransportProtocol) &&
        Objects.equals(this.domain, dnsTraceInstantTest.domain) &&
        Objects.equals(this.dnsQueryClass, dnsTraceInstantTest.dnsQueryClass) &&
        Objects.equals(this.agents, dnsTraceInstantTest.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdDate, description, liveShare, modifiedBy, modifiedDate, savedEvent, testId, testName, type, links, labels, sharedWithAccounts, dnsTransportProtocol, domain, dnsQueryClass, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsTraceInstantTest {\n");
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
    sb.append("    dnsTransportProtocol: ").append(toIndentedString(dnsTransportProtocol)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    dnsQueryClass: ").append(toIndentedString(dnsQueryClass)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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
