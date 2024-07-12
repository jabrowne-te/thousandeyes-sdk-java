/*
 * Labels API
 * ### Overview This is API for the Labels API (formerly called groups).
 *
 * The version of the OpenAPI document: 7.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.labels;

import com.thousandeyes.sdk.labels.model.Error;
import com.thousandeyes.sdk.labels.model.LabelDetail;
import com.thousandeyes.sdk.labels.model.LabelRequest;
import com.thousandeyes.sdk.labels.model.Labels;
import java.net.URI;
import com.thousandeyes.sdk.labels.model.UnauthorizedError;
import com.thousandeyes.sdk.labels.model.ValidationError;
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
 * Request and Response model deserialization tests for AgentApi
 */
public class AgentApiTest {
    // private final AgentApi api = new AgentApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create a Label of type &#x60;agent&#x60;
     * <p>
     * Creates a new label (formerly called group) in ThousandEyes, based on properties provided in the POST data.  You must have sufficient permissions to create a new label. Regular users are blocked from using any of the POST-based methods. Note: When creating or updating a label and assigning &#x60;agent&#x60; or &#x60;test&#x60;, the user needs permission to modify the objects being added.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createAgentLabelRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "name" : "My new label",
                  "ids" : [ "5048", "1234" ]
                }
                                 """;
        LabelRequest mappedRequest = 
                mapper.readValue(requestBodyJson, LabelRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "labelId" : "961123",
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
                  "name" : "Label XYZ",
                  "ids" : [ "231286", "6317a3ca0d2bfc6ab882d6ce", "6317a3ca0d2bfc6ab882d6ca" ],
                  "isBuiltIn" : true,
                  "type" : "endpoint-test"
                }
                                  """;
        LabelDetail mappedResponse = 
                mapper.readValue(responseBodyJson, LabelDetail.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete a Label object of type &#x60;agent&#x60;
     * <p>
     * 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteAgentLabelRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Get a Label object of type &#x60;agent&#x60;
     * <p>
     * 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAgentLabelRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "labelId" : "961123",
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
                  "name" : "Label XYZ",
                  "ids" : [ "231286", "6317a3ca0d2bfc6ab882d6ce", "6317a3ca0d2bfc6ab882d6ca" ],
                  "isBuiltIn" : true,
                  "type" : "endpoint-test"
                }
                                  """;
        LabelDetail mappedResponse = 
                mapper.readValue(responseBodyJson, LabelDetail.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Get list of Labels of type &#x60;agent&#x60;
     * <p>
     * Returns a list of all Agent labels (formerly called groups) configured in ThousandEyes.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAgentLabelsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
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
                  "labels" : [ {
                    "labelId" : "961123",
                    "name" : "Label XYZ",
                    "isBuiltIn" : true,
                    "type" : "endpoint-test"
                  }, {
                    "labelId" : "961123",
                    "name" : "Label XYZ",
                    "isBuiltIn" : true,
                    "type" : "endpoint-test"
                  } ]
                }
                                  """;
        Labels mappedResponse = 
                mapper.readValue(responseBodyJson, Labels.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update a Label object of type &#x60;agent&#x60;
     * <p>
     * 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateAgentLabelRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "name" : "My new label",
                  "ids" : [ "5048", "1234" ]
                }
                                 """;
        LabelRequest mappedRequest = 
                mapper.readValue(requestBodyJson, LabelRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "labelId" : "961123",
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
                  "name" : "Label XYZ",
                  "ids" : [ "231286", "6317a3ca0d2bfc6ab882d6ce", "6317a3ca0d2bfc6ab882d6ca" ],
                  "isBuiltIn" : true,
                  "type" : "endpoint-test"
                }
                                  """;
        LabelDetail mappedResponse = 
                mapper.readValue(responseBodyJson, LabelDetail.class);
        assertNotNull(mappedResponse);
    }
    
}
