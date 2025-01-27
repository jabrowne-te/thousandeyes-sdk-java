/*
 * Endpoint Agents API
 * Manage ThousandEyes Endpoint Agents using this API.   For more information about Endpoint Agents, see [Endpoint Agents](https://docs.thousandeyes.com/product-documentation/global-vantage-points/endpoint-agents).
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.endpoint.agents;

import com.thousandeyes.sdk.endpoint.agents.model.AgentTransferRequest;
import com.thousandeyes.sdk.endpoint.agents.model.BulkAgentTransferRequest;
import com.thousandeyes.sdk.endpoint.agents.model.BulkAgentTransferResponse;
import com.thousandeyes.sdk.endpoint.agents.model.Error;
import java.util.UUID;
import com.thousandeyes.sdk.endpoint.agents.model.UnauthorizedError;
import com.thousandeyes.sdk.endpoint.agents.model.ValidationError;
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
 * Request and Response model deserialization tests for EndpointAgentsTransferApi
 */
public class EndpointAgentsTransferApiTest {
    // private final EndpointAgentsTransferApi api = new EndpointAgentsTransferApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Transfer endpoint agent
     * <p>
     * Initiates the transfer of an agent from its current account, which must correspond to the provided aid, to the target account.  **Note:** It is essential to ensure that the &#x60;aid&#x60; parameter matches the current account of the agent for this operation to succeed. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void transferEndpointAgentRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "toAid" : "1234"
                }
                                 """;
        AgentTransferRequest mappedRequest = 
                mapper.readValue(requestBodyJson, AgentTransferRequest.class);
        assertNotNull(mappedRequest);

    }
    
    /**
     * Bulk transfer agents
     * <p>
     * Initiates the transfer of multiple agents between accounts. The following conditions apply:  * The requester must possess &#39;write&#39; permissions for both the &#39;from&#39; and &#39;to&#39; accounts involved in each transfer.  * Multiple transfers may involve a mix of different source and destination accounts. * For each transfer request, the &#39;from&#39; account must match the current account of the respective agent. * Transfers are executed asynchronously. * Progress tracking is not intended, but users can monitor the progress by periodically polling the &#39;get agent&#39; endpoint. * Each transfer request is individually validated and completed; this operation is not atomic, meaning transfers can succeed or fail individually. * The API response provides the status of each transfer request. 
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void transferEndpointAgentsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "transfers" : [ {
                    "agentId" : "5d0764ac-7e42-4ec8-a0d4-39fc53edccba",
                    "fromAid" : "1234",
                    "toAid" : "12345"
                  }, {
                    "agentId" : "5d0764ac-7e42-4ec8-a0d4-39fc53edccba",
                    "fromAid" : "1234",
                    "toAid" : "12345"
                  } ]
                }
                                 """;
        BulkAgentTransferRequest mappedRequest = 
                mapper.readValue(requestBodyJson, BulkAgentTransferRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "items" : [ {
                    "status" : 200,
                    "detail" : "Initiated",
                    "request" : {
                      "agentId" : "5d0764ac-7e42-4ec8-a0d4-39fc53edccba",
                      "fromAid" : "1234",
                      "toAid" : "12345"
                    }
                  }, {
                    "status" : 400,
                    "detail" : "Missing from-account id",
                    "request" : {
                      "agentId" : "5d0764ac-7e42-4ec8-a0d5-39fc53ed1234",
                      "fromAid" : "xxx",
                      "toAid" : "12345"
                    }
                  }, {
                    "status" : 403,
                    "detail" : "User does not have permission on 'to' aid",
                    "request" : {
                      "agentId" : "5d0764ac-7e42-4ec8-a0d5-39fc53ed7890",
                      "fromAid" : "1234",
                      "toAid" : "12345"
                    }
                  } ]
                }
                                  """;
        BulkAgentTransferResponse mappedResponse = 
                mapper.readValue(responseBodyJson, BulkAgentTransferResponse.class);
        assertNotNull(mappedResponse);
    }
    
}
