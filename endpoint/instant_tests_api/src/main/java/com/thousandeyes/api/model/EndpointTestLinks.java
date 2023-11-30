/*
 * Endpoint Instant Scheduled Tests API
 *  ### Overview  You can create and execute a new endpoint instant scheduled test within ThousandEyes using this API. The test parameters are specified in the `POST` data.  The following applies to the Endpoint Instant Scheduled Tests API:  * To initiate the creation and execution of an instant scheduled test, the user must possess the `Edit endpoint tests` permission.  * Upon successful creation of an instant scheduled test, the API responds with an HTTP/201 CREATED status code and return the test definition. * It's important to note that the response does not include the results of the instant scheduled test. To retrieve test results, users can utilize the Endpoint Test Data endpoints. The URLs for these API test data endpoints are provided within the test definition output when an instant scheduled test is created. 
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
import com.thousandeyes.api.model.EndpointTestLinksSelf;
import com.thousandeyes.api.model.EndpointTestLinksTestResults;
import java.io.IOException;
import java.util.Arrays;

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
 * A list of links that can be accessed to get more information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-30T09:45:23.306263Z[Europe/London]")
public class EndpointTestLinks {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private EndpointTestLinksSelf self;

  public static final String SERIALIZED_NAME_TEST_RESULTS = "testResults";
  @SerializedName(SERIALIZED_NAME_TEST_RESULTS)
  private EndpointTestLinksTestResults testResults;

  public EndpointTestLinks() {
  }

  public EndpointTestLinks self(EndpointTestLinksSelf self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  public EndpointTestLinksSelf getSelf() {
    return self;
  }


  public void setSelf(EndpointTestLinksSelf self) {
    this.self = self;
  }


  public EndpointTestLinks testResults(EndpointTestLinksTestResults testResults) {
    
    this.testResults = testResults;
    return this;
  }

   /**
   * Get testResults
   * @return testResults
  **/
  @javax.annotation.Nullable
  public EndpointTestLinksTestResults getTestResults() {
    return testResults;
  }


  public void setTestResults(EndpointTestLinksTestResults testResults) {
    this.testResults = testResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointTestLinks endpointTestLinks = (EndpointTestLinks) o;
    return Objects.equals(this.self, endpointTestLinks.self) &&
        Objects.equals(this.testResults, endpointTestLinks.testResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, testResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointTestLinks {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("testResults");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EndpointTestLinks
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointTestLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointTestLinks is not found in the empty JSON string", EndpointTestLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointTestLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointTestLinks` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `self`
      if (jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) {
        EndpointTestLinksSelf.validateJsonElement(jsonObj.get("self"));
      }
      // validate the optional field `testResults`
      if (jsonObj.get("testResults") != null && !jsonObj.get("testResults").isJsonNull()) {
        EndpointTestLinksTestResults.validateJsonElement(jsonObj.get("testResults"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointTestLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointTestLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointTestLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointTestLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointTestLinks>() {
           @Override
           public void write(JsonWriter out, EndpointTestLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointTestLinks read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EndpointTestLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EndpointTestLinks
  * @throws IOException if the JSON string is invalid with respect to EndpointTestLinks
  */
  public static EndpointTestLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointTestLinks.class);
  }

 /**
  * Convert an instance of EndpointTestLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
