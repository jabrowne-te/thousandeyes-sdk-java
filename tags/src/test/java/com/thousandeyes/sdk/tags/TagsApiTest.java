/*
 * Tags API
 * The ThousandEyes Tags API provides a tagging system with key/value pairs. It allows you to tag assets within the ThousandEyes platform (such as agents, tests, or alert rules) with meaningful metadata. For example: `branch:sfo`, `branch:nyc`, and `team:netops`.  This feature provides:  * Support for automation. * Powerful and flexible reports/dashboards. * Support for third-party integrations.  Things to note with the ThousandEyes Tags API:  * Tags are backwards-compatible with existing labels. * Tags are separated by Tests (CEA), Agents (CEA), Endpoint Agents, Scheduled Endpoint Tests, and Reports. A single tag can only apply to one type of target object, so each tag must specify the target type of object via a `type` field. * Tags are defined in a single table so that they can be represented using a single model - `Tag`. 
 *
 * The version of the OpenAPI document: 7.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tags;

import com.thousandeyes.sdk.tags.model.ApiError;
import com.thousandeyes.sdk.tags.model.BulkTagResponse;
import com.thousandeyes.sdk.tags.model.Error;
import com.thousandeyes.sdk.tags.model.Expand;
import com.thousandeyes.sdk.tags.model.TagInfo;
import java.util.UUID;
import com.thousandeyes.sdk.tags.model.UnauthorizedError;
import com.thousandeyes.sdk.tags.model.ValidationError;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Request and Response model deserialization tests for TagsApi
 */
public class TagsApiTest {
    // private final TagsApi api = new TagsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create tag
     * <p>
     * Creates a new tag.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createTagRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "accessType" : "all",
                  "assignments" : [ {
                    "id" : "123",
                    "type" : "test"
                  }, {
                    "id" : "123",
                    "type" : "test"
                  } ],
                  "color" : "#FF0000",
                  "icon" : "icon",
                  "legacyId" : 0.8008281904610115,
                  "id" : "5aeab5d5-0d34-4d44-a7ac-fb440185295c",
                  "aid" : 1234,
                  "value" : "sfo",
                  "key" : "branch",
                  "createDate" : "2022-03-01T23:31:11Z",
                  "objectType" : "test"
                }
                                 """;
        TagInfo mappedRequest = 
                mapper.readValue(requestBodyJson, TagInfo.class);
        assertNotNull(mappedRequest);

    }
    
    /**
     * Create multiple tags
     * <p>
     * Creates multiple tags. Note the response includes a &#x60;statuses&#x60; array. This array provides status information for each tag object, indexed 1:1 with the &#x60;tags&#x60; array.  
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createTagsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "errors" : [ {
                    "tag" : {
                      "key" : {
                        "accessType" : "all",
                        "assignments" : [ {
                          "id" : "123",
                          "type" : "test"
                        }, {
                          "id" : "123",
                          "type" : "test"
                        } ],
                        "color" : "#FF0000",
                        "icon" : "icon",
                        "legacyId" : 0.8008281904610115,
                        "id" : "5aeab5d5-0d34-4d44-a7ac-fb440185295c",
                        "aid" : 1234,
                        "value" : "sfo",
                        "key" : "branch",
                        "createDate" : "2022-03-01T23:31:11Z",
                        "objectType" : "test"
                      }
                    },
                    "message" : "Object successfully created",
                    "responseCode" : 200
                  }, {
                    "tag" : {
                      "key" : {
                        "accessType" : "all",
                        "assignments" : [ {
                          "id" : "123",
                          "type" : "test"
                        }, {
                          "id" : "123",
                          "type" : "test"
                        } ],
                        "color" : "#FF0000",
                        "icon" : "icon",
                        "legacyId" : 0.8008281904610115,
                        "id" : "5aeab5d5-0d34-4d44-a7ac-fb440185295c",
                        "aid" : 1234,
                        "value" : "sfo",
                        "key" : "branch",
                        "createDate" : "2022-03-01T23:31:11Z",
                        "objectType" : "test"
                      }
                    },
                    "message" : "Object successfully created",
                    "responseCode" : 200
                  } ],
                  "tags" : [ {
                    "accessType" : "all",
                    "assignments" : [ {
                      "id" : "123",
                      "type" : "test"
                    }, {
                      "id" : "123",
                      "type" : "test"
                    } ],
                    "color" : "#FF0000",
                    "_links" : {
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "icon" : "icon",
                    "legacyId" : 0.8008281904610115,
                    "id" : "5aeab5d5-0d34-4d44-a7ac-fb440185295c",
                    "aid" : 1234,
                    "value" : "sfo",
                    "key" : "branch",
                    "createDate" : "2022-03-01T23:31:11Z",
                    "objectType" : "test"
                  }, {
                    "accessType" : "all",
                    "assignments" : [ {
                      "id" : "123",
                      "type" : "test"
                    }, {
                      "id" : "123",
                      "type" : "test"
                    } ],
                    "color" : "#FF0000",
                    "_links" : {
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "icon" : "icon",
                    "legacyId" : 0.8008281904610115,
                    "id" : "5aeab5d5-0d34-4d44-a7ac-fb440185295c",
                    "aid" : 1234,
                    "value" : "sfo",
                    "key" : "branch",
                    "createDate" : "2022-03-01T23:31:11Z",
                    "objectType" : "test"
                  } ]
                }
                                 """;
        BulkTagResponse mappedRequest = 
                mapper.readValue(requestBodyJson, BulkTagResponse.class);
        assertNotNull(mappedRequest);

    }
    
    /**
     * Delete tag
     * <p>
     * Deletes a tag.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteTagRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieve tag
     * <p>
     * Retrieves a tag using its ID.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void getTagRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * List tags
     * <p>
     * This endpoint returns a list of tags in the specified account group (&#x60;aid&#x60;).
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void getTagsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Update tag
     * <p>
     * Updates a tag.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateTagRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "accessType" : "all",
                  "assignments" : [ {
                    "id" : "123",
                    "type" : "test"
                  }, {
                    "id" : "123",
                    "type" : "test"
                  } ],
                  "color" : "#FF0000",
                  "icon" : "icon",
                  "legacyId" : 0.8008281904610115,
                  "id" : "5aeab5d5-0d34-4d44-a7ac-fb440185295c",
                  "aid" : 1234,
                  "value" : "sfo",
                  "key" : "branch",
                  "createDate" : "2022-03-01T23:31:11Z",
                  "objectType" : "test"
                }
                                 """;
        TagInfo mappedRequest = 
                mapper.readValue(requestBodyJson, TagInfo.class);
        assertNotNull(mappedRequest);

    }
    
}
