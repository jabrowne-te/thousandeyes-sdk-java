/*
 * Endpoint Agent Labels API
 * Manage labels applied to endpoint agents using this API. 
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api.endpoint.labels;

import java.math.BigDecimal;
import com.thousandeyes.api.endpoint.labels.model.EndpointLabelsList200Response;
import com.thousandeyes.api.endpoint.labels.model.Error;
import com.thousandeyes.api.endpoint.labels.model.Expand;
import com.thousandeyes.api.endpoint.labels.model.Label;
import com.thousandeyes.api.endpoint.labels.model.LabelRequest;
import java.net.URI;
import com.thousandeyes.api.endpoint.labels.model.UnauthorizedError;
import com.thousandeyes.api.endpoint.labels.model.V7EndpointLabelsPost201Response;
import com.thousandeyes.api.endpoint.labels.model.ValidationError;
import static com.thousandeyes.api.serialization.JSON.getDefault;
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
 * Request and Response model deserialization tests for ManageLabelsApi
 */
public class ManageLabelsApiTest {
    // private final ManageLabelsApi api = new ManageLabelsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Delete label
     * <p>
     * Deletes the label from your account. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void endpointLabelDeleteRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieve label
     * <p>
     * Returns a single label using its ID.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void endpointLabelGetRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "color" : "#ff3333",
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
                  "name" : "Head office meeting rooms",
                  "id" : "abc-123-def",
                  "filters" : [ {
                    "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                    "key" : "vpn-client-network"
                  }, {
                    "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                    "key" : "vpn-client-network"
                  } ]
                }
                                  """;
        V7EndpointLabelsPost201Response mappedResponse = 
                mapper.readValue(responseBodyJson, V7EndpointLabelsPost201Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update label
     * <p>
     * Updates a label using its ID.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void endpointLabelUpdateRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "color" : "#ff3333",
                  "name" : "Head office meeting rooms",
                  "id" : "abc-123-def",
                  "filters" : [ {
                    "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                    "key" : "vpn-client-network"
                  }, {
                    "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                    "key" : "vpn-client-network"
                  } ]
                }
                                 """;
        Label mappedRequest = 
                mapper.readValue(requestBodyJson, Label.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "color" : "#ff3333",
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
                  "name" : "Head office meeting rooms",
                  "id" : "abc-123-def",
                  "filters" : [ {
                    "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                    "key" : "vpn-client-network"
                  }, {
                    "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                    "key" : "vpn-client-network"
                  } ]
                }
                                  """;
        V7EndpointLabelsPost201Response mappedResponse = 
                mapper.readValue(responseBodyJson, V7EndpointLabelsPost201Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List labels
     * <p>
     * Returns a list of labels.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void endpointLabelsListRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "_links" : {
                    "next" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    },
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
                    "color" : "#ff3333",
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
                    "name" : "Head office meeting rooms",
                    "id" : "abc-123-def",
                    "filters" : [ {
                      "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                      "key" : "vpn-client-network"
                    }, {
                      "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                      "key" : "vpn-client-network"
                    } ]
                  }, {
                    "color" : "#ff3333",
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
                    "name" : "Head office meeting rooms",
                    "id" : "abc-123-def",
                    "filters" : [ {
                      "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                      "key" : "vpn-client-network"
                    }, {
                      "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                      "key" : "vpn-client-network"
                    } ]
                  } ]
                }
                                  """;
        EndpointLabelsList200Response mappedResponse = 
                mapper.readValue(responseBodyJson, EndpointLabelsList200Response.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Create label
     * <p>
     * Creates a new label.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void v7EndpointLabelsPostRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "color" : "#ff3333",
                  "name" : "Head office meeting rooms",
                  "id" : "abc-123-def",
                  "filters" : [ {
                    "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                    "key" : "vpn-client-network"
                  }, {
                    "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                    "key" : "vpn-client-network"
                  } ]
                }
                                 """;
        LabelRequest mappedRequest = 
                mapper.readValue(requestBodyJson, LabelRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "color" : "#ff3333",
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
                  "name" : "Head office meeting rooms",
                  "id" : "abc-123-def",
                  "filters" : [ {
                    "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                    "key" : "vpn-client-network"
                  }, {
                    "values" : [ "10.1.1.0/24", "192.168.1.0/24" ],
                    "key" : "vpn-client-network"
                  } ]
                }
                                  """;
        V7EndpointLabelsPost201Response mappedResponse = 
                mapper.readValue(responseBodyJson, V7EndpointLabelsPost201Response.class);
        assertNotNull(mappedResponse);
    }
    
}