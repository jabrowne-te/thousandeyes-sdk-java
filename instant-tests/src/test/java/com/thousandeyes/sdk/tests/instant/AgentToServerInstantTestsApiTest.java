/*
 * Instant Tests API
 * The Instant Tests API operations lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test. 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.tests.instant;

import com.thousandeyes.sdk.tests.instant.model.AgentToServerInstantTestRequest;
import com.thousandeyes.sdk.tests.instant.model.AgentToServerInstantTestResponse;
import com.thousandeyes.sdk.tests.instant.model.Error;
import com.thousandeyes.sdk.tests.instant.model.ExpandInstantTestOptions;
import java.net.URI;
import com.thousandeyes.sdk.tests.instant.model.UnauthorizedError;
import com.thousandeyes.sdk.tests.instant.model.ValidationError;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;


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
 * Request and Response model deserialization tests for AgentToServerInstantTestsApi
 */
public class AgentToServerInstantTestsApiTest {
    // private final AgentToServerInstantTestsApi api = new AgentToServerInstantTestsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create agent-to-server instant test
     * <p>
     * Creates and runs a new agent-to-server instant test.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createAgentToServerInstantTestRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "server" : "www.thousandeyes.com",
                  "mtuMeasurements" : false,
                  "ipv6Policy" : "use-agent-policy",
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                    } ],
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
                  "bandwidthMeasurements" : true,
                  "description" : "ThousandEyes Test",
                  "probeMode" : "auto",
                  "type" : "agent-to-server",
                  "dscpId" : "0",
                  "fixedPacketRate" : 25,
                  "protocol" : "tcp",
                  "dscp" : "Best Effort (DSCP 0)",
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "networkMeasurements" : false,
                  "labels" : [ "9842", "1283" ],
                  "agents" : [ {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  }, {
                    "agentId" : "125",
                    "sourceIpAddress" : "1.1.1.1"
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 49153,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ "1234", "12345" ],
                  "pingPayloadSize" : 112,
                  "continuousMode" : false
                }
                                 """;
        AgentToServerInstantTestRequest mappedRequest = 
                mapper.readValue(requestBodyJson, AgentToServerInstantTestRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "server" : "www.thousandeyes.com",
                  "mtuMeasurements" : false,
                  "ipv6Policy" : "use-agent-policy",
                  "_links" : {
                    "testResults" : [ {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                    }, {
                      "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                    } ],
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
                  "bandwidthMeasurements" : true,
                  "description" : "ThousandEyes Test",
                  "probeMode" : "auto",
                  "type" : "agent-to-server",
                  "dscpId" : "0",
                  "fixedPacketRate" : 25,
                  "protocol" : "tcp",
                  "dscp" : "Best Effort (DSCP 0)",
                  "pathTraceMode" : "classic",
                  "modifiedBy" : "user@user.com",
                  "testName" : "ThousandEyes Test",
                  "numPathTraces" : 3,
                  "liveShare" : false,
                  "savedEvent" : true,
                  "networkMeasurements" : false,
                  "labels" : [ {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  }, {
                    "labelId" : "961",
                    "name" : "Artem label",
                    "isBuiltin" : false
                  } ],
                  "agents" : [ {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  }, {
                    "agentId" : "281474976710706",
                    "agentType" : "enterprise-cluster",
                    "publicIpAddresses" : [ "192.168.1.78", "f9b2:3a21:f25c:d300:03f4:586d:f8d6:4e1c" ],
                    "prefix" : "99.128.0.0/11",
                    "agentName" : "thousandeyes-stg-va-254",
                    "ipAddresses" : [ "99.139.65.220", "9bbd:8a0a:a257:5876:288b:6cb2:3f36:64ce" ],
                    "location" : "San Francisco Bay Area",
                    "countryId" : "US",
                    "enabled" : true,
                    "network" : "AT&T Services, Inc. (AS 7018)",
                    "verifySslCertificates" : true
                  } ],
                  "createdDate" : "2022-07-17T22:00:54Z",
                  "createdBy" : "user@user.com",
                  "port" : 49153,
                  "modifiedDate" : "2022-07-17T22:00:54Z",
                  "testId" : "281474976710706",
                  "sharedWithAccounts" : [ {
                    "name" : "Account name",
                    "aid" : "1234"
                  }, {
                    "name" : "Account name",
                    "aid" : "1234"
                  } ],
                  "pingPayloadSize" : 112,
                  "continuousMode" : false
                }
                                  """;
        AgentToServerInstantTestResponse mappedResponse = 
                mapper.readValue(responseBodyJson, AgentToServerInstantTestResponse.class);
        assertNotNull(mappedResponse);
    }
    
}
