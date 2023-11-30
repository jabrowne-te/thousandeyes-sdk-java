/*
 * Instant Tests API
 *  ### Overview The Instant Tests API endpoint lets you create and run new instant tests. You will need to be a regular user or have the following permissions:   * `API Access`   * `View tests`  The response does not include the immediate test results. Use the Test Results endpoints to get test results after creating and executing an instant test. You can find the URLs for these endpoints in the _links section of the test definition that is returned when you create the instant test.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.api;

import com.thousandeyes.ApiException;
import com.thousandeyes.api.model.AgentToServerInstantTest;
import com.thousandeyes.api.model.AgentToServerInstantTestRequest;
import com.thousandeyes.api.model.Error;
import com.thousandeyes.api.model.Expand;
import java.net.URI;
import com.thousandeyes.api.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AgentToServerApi
 */
@Disabled
public class AgentToServerApiTest {

    private final AgentToServerApi api = new AgentToServerApi();

    /**
     * Create agent-to-server instant test
     *
     * Creates and runs a new agent-to-server instant test.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postInstantAgentToServerTest() throws ApiException {
        AgentToServerInstantTestRequest agentToServerInstantTestRequest = null;
        String aid = null;
        List<Expand> expand = null;
        AgentToServerInstantTest response = api.postInstantAgentToServer(agentToServerInstantTestRequest, aid, expand);
        // TODO: test validations
    }

}