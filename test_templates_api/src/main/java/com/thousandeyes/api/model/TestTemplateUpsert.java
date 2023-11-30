/*
 * Test Template
 *  ## Overview  Test templates allow you create a set of tests, alert rules, dashboards, and labels from a single template configuration file.    The following applies to test templates:  * You can create tests for monitoring common services and applications such as Microsoft 365, Webex, and others using a predefined set of certified templates.  * Test templates reduce the time and complexity of creating tests for common SaaS or other services by providing a set of templates for creating tests, alert rules, and other assets within the ThousandEyes platform.  * Templates created with an account group in a particular organization are visible to all account groups in that organization, provided they have the `View Test Templates` permission.  * Credentials (usernames, passwords, tokens, etc.) can be included in a test template only as placeholders whose value is provided by user input when the template is deployed. Creating or updating a test template that contains a credentials field in plain text will result in a bad request (HTTP 400).  * The schemas to use for `labels`, `tests`, `alertRules` and `dashboards` are defined at https://developer.thousandeyes.com/v7/.  * To support referencing an asset from another asset of a different type (for example, defining the `testId` field of an `alertRule` by referencing the ID of a test defined in the template itself), the deployment of assets is done in a specific order:      1. Labels     2. Tests     3. Alert rules     4. Dashboards      For a given asset type, you can reference any asset type with a higher order. (For example, labels cannot reference other assets in the template; tests can only reference labels; alert rules can reference tests and labels, etc.)
 *
 * The version of the OpenAPI document: 7.0.1
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
import com.thousandeyes.api.model.DeploymentStrategy;
import com.thousandeyes.api.model.UserInput;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * The test template to create or update.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:29.165180Z[Europe/London]")
public class TestTemplateUpsert {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_IS_BUILT_IN = "isBuiltIn";
  @SerializedName(SERIALIZED_NAME_IS_BUILT_IN)
  private Boolean isBuiltIn;

  public static final String SERIALIZED_NAME_USER_INPUTS = "userInputs";
  @SerializedName(SERIALIZED_NAME_USER_INPUTS)
  private Map<String, UserInput> userInputs = new HashMap<>();

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Object labels;

  public static final String SERIALIZED_NAME_TESTS = "tests";
  @SerializedName(SERIALIZED_NAME_TESTS)
  private Object tests;

  public static final String SERIALIZED_NAME_ALERT_RULES = "alertRules";
  @SerializedName(SERIALIZED_NAME_ALERT_RULES)
  private Object alertRules;

  public static final String SERIALIZED_NAME_DASHBOARDS = "dashboards";
  @SerializedName(SERIALIZED_NAME_DASHBOARDS)
  private Object dashboards;

  public static final String SERIALIZED_NAME_DEPLOYMENT_STRATEGY = "deploymentStrategy";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_STRATEGY)
  private Map<String, DeploymentStrategy> deploymentStrategy = new HashMap<>();

  public TestTemplateUpsert() {
  }

  public TestTemplateUpsert name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the test template.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestTemplateUpsert description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Text that describes the test template.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TestTemplateUpsert icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * Icon for the test template; will be displayed in the UI.
   * @return icon
  **/
  @javax.annotation.Nullable
  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public TestTemplateUpsert isBuiltIn(Boolean isBuiltIn) {
    
    this.isBuiltIn = isBuiltIn;
    return this;
  }

   /**
   * Indicates whether the test template is a built-in template. Note that built-in test templates are read-only.
   * @return isBuiltIn
  **/
  @javax.annotation.Nullable
  public Boolean getIsBuiltIn() {
    return isBuiltIn;
  }


  public void setIsBuiltIn(Boolean isBuiltIn) {
    this.isBuiltIn = isBuiltIn;
  }


  public TestTemplateUpsert userInputs(Map<String, UserInput> userInputs) {
    
    this.userInputs = userInputs;
    return this;
  }

  public TestTemplateUpsert putUserInputsItem(String key, UserInput userInputsItem) {
    if (this.userInputs == null) {
      this.userInputs = new HashMap<>();
    }
    this.userInputs.put(key, userInputsItem);
    return this;
  }

   /**
   * Get userInputs
   * @return userInputs
  **/
  @javax.annotation.Nullable
  public Map<String, UserInput> getUserInputs() {
    return userInputs;
  }


  public void setUserInputs(Map<String, UserInput> userInputs) {
    this.userInputs = userInputs;
  }


  public TestTemplateUpsert labels(Object labels) {
    
    this.labels = labels;
    return this;
  }

   /**
   * A map of &lt;labelKey, labelConfiguration&gt;.
   * @return labels
  **/
  @javax.annotation.Nullable
  public Object getLabels() {
    return labels;
  }


  public void setLabels(Object labels) {
    this.labels = labels;
  }


  public TestTemplateUpsert tests(Object tests) {
    
    this.tests = tests;
    return this;
  }

   /**
   * A map of &lt;testKey, testConfiguration&gt;.
   * @return tests
  **/
  @javax.annotation.Nullable
  public Object getTests() {
    return tests;
  }


  public void setTests(Object tests) {
    this.tests = tests;
  }


  public TestTemplateUpsert alertRules(Object alertRules) {
    
    this.alertRules = alertRules;
    return this;
  }

   /**
   * A map of &lt;alertRuleKey, alertRuleConfiguration&gt;.
   * @return alertRules
  **/
  @javax.annotation.Nullable
  public Object getAlertRules() {
    return alertRules;
  }


  public void setAlertRules(Object alertRules) {
    this.alertRules = alertRules;
  }


  public TestTemplateUpsert dashboards(Object dashboards) {
    
    this.dashboards = dashboards;
    return this;
  }

   /**
   * A map of &lt;dashboardKey, dashboardConfiguration&gt;.
   * @return dashboards
  **/
  @javax.annotation.Nullable
  public Object getDashboards() {
    return dashboards;
  }


  public void setDashboards(Object dashboards) {
    this.dashboards = dashboards;
  }


  public TestTemplateUpsert deploymentStrategy(Map<String, DeploymentStrategy> deploymentStrategy) {
    
    this.deploymentStrategy = deploymentStrategy;
    return this;
  }

  public TestTemplateUpsert putDeploymentStrategyItem(String key, DeploymentStrategy deploymentStrategyItem) {
    if (this.deploymentStrategy == null) {
      this.deploymentStrategy = new HashMap<>();
    }
    this.deploymentStrategy.put(key, deploymentStrategyItem);
    return this;
  }

   /**
   * A map of &lt;assetKey, deploymentStrategy&gt;.
   * @return deploymentStrategy
  **/
  @javax.annotation.Nullable
  public Map<String, DeploymentStrategy> getDeploymentStrategy() {
    return deploymentStrategy;
  }


  public void setDeploymentStrategy(Map<String, DeploymentStrategy> deploymentStrategy) {
    this.deploymentStrategy = deploymentStrategy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestTemplateUpsert testTemplateUpsert = (TestTemplateUpsert) o;
    return Objects.equals(this.name, testTemplateUpsert.name) &&
        Objects.equals(this.description, testTemplateUpsert.description) &&
        Objects.equals(this.icon, testTemplateUpsert.icon) &&
        Objects.equals(this.isBuiltIn, testTemplateUpsert.isBuiltIn) &&
        Objects.equals(this.userInputs, testTemplateUpsert.userInputs) &&
        Objects.equals(this.labels, testTemplateUpsert.labels) &&
        Objects.equals(this.tests, testTemplateUpsert.tests) &&
        Objects.equals(this.alertRules, testTemplateUpsert.alertRules) &&
        Objects.equals(this.dashboards, testTemplateUpsert.dashboards) &&
        Objects.equals(this.deploymentStrategy, testTemplateUpsert.deploymentStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, icon, isBuiltIn, userInputs, labels, tests, alertRules, dashboards, deploymentStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestTemplateUpsert {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
    sb.append("    userInputs: ").append(toIndentedString(userInputs)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    deploymentStrategy: ").append(toIndentedString(deploymentStrategy)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("icon");
    openapiFields.add("isBuiltIn");
    openapiFields.add("userInputs");
    openapiFields.add("labels");
    openapiFields.add("tests");
    openapiFields.add("alertRules");
    openapiFields.add("dashboards");
    openapiFields.add("deploymentStrategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TestTemplateUpsert
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TestTemplateUpsert.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestTemplateUpsert is not found in the empty JSON string", TestTemplateUpsert.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TestTemplateUpsert.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestTemplateUpsert` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TestTemplateUpsert.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestTemplateUpsert.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestTemplateUpsert' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestTemplateUpsert> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestTemplateUpsert.class));

       return (TypeAdapter<T>) new TypeAdapter<TestTemplateUpsert>() {
           @Override
           public void write(JsonWriter out, TestTemplateUpsert value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestTemplateUpsert read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestTemplateUpsert given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestTemplateUpsert
  * @throws IOException if the JSON string is invalid with respect to TestTemplateUpsert
  */
  public static TestTemplateUpsert fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestTemplateUpsert.class);
  }

 /**
  * Convert an instance of TestTemplateUpsert to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
