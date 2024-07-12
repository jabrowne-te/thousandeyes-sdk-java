/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
 *
 * The version of the OpenAPI document: 7.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.agents.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NotificationRule
 */
@JsonPropertyOrder({
  NotificationRule.JSON_PROPERTY_RULE_ID,
  NotificationRule.JSON_PROPERTY_RULE_NAME,
  NotificationRule.JSON_PROPERTY_EXPRESSION,
  NotificationRule.JSON_PROPERTY_NOTIFY_ON_CLEAR,
  NotificationRule.JSON_PROPERTY_IS_DEFAULT
})
@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class NotificationRule {
  public static final String JSON_PROPERTY_RULE_ID = "ruleId";
  private String ruleId;

  public static final String JSON_PROPERTY_RULE_NAME = "ruleName";
  private String ruleName;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_NOTIFY_ON_CLEAR = "notifyOnClear";
  private Boolean notifyOnClear;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public NotificationRule() { 
  }

  @JsonCreator
  public NotificationRule(
    @JsonProperty(JSON_PROPERTY_RULE_ID) String ruleId
  ) {
  this();
    this.ruleId = ruleId;
  }

   /**
   * Agent notification rule ID
   * @return ruleId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRuleId() {
    return ruleId;
  }




  public NotificationRule ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

   /**
   * Name of the agent notification rule
   * @return ruleName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRuleName() {
    return ruleName;
  }


  @JsonProperty(JSON_PROPERTY_RULE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }


  public NotificationRule expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Expression of agent notification rule
   * @return expression
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpression() {
    return expression;
  }


  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpression(String expression) {
    this.expression = expression;
  }


  public NotificationRule notifyOnClear(Boolean notifyOnClear) {
    this.notifyOnClear = notifyOnClear;
    return this;
  }

   /**
   * Send notification when notification clears
   * @return notifyOnClear
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CLEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotifyOnClear() {
    return notifyOnClear;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_ON_CLEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyOnClear(Boolean notifyOnClear) {
    this.notifyOnClear = notifyOnClear;
  }


  public NotificationRule isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Agent notification rule will be automatically included on all new Enterprise Agents.
   * @return isDefault
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  /**
   * Return true if this NotificationRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRule notificationRule = (NotificationRule) o;
    return Objects.equals(this.ruleId, notificationRule.ruleId) &&
        Objects.equals(this.ruleName, notificationRule.ruleName) &&
        Objects.equals(this.expression, notificationRule.expression) &&
        Objects.equals(this.notifyOnClear, notificationRule.notifyOnClear) &&
        Objects.equals(this.isDefault, notificationRule.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleId, ruleName, expression, notifyOnClear, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRule {\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    notifyOnClear: ").append(toIndentedString(notifyOnClear)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

