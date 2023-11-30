/*
 * Test Results API
 * Get test result metrics for Cloud and Enterprise Agent tests.
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
import com.thousandeyes.api.model.Error;
import com.thousandeyes.api.model.GetTestPathvisAgentRound200Response;
import com.thousandeyes.api.model.GetTestResultMetrics200Response;
import com.thousandeyes.api.model.GetTestResultNetworkPathvis200Response;
import java.time.OffsetDateTime;
import com.thousandeyes.api.model.TestDirection;
import com.thousandeyes.api.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetworkTestMetricsApi
 */
@Disabled
public class NetworkTestMetricsApiTest {

    private final NetworkTestMetricsApi api = new NetworkTestMetricsApi();

    /**
     * Get pathvis test results by agent and round
     *
     * Returns a summary of the path trace data collected during path visualization for a given agent and round. With each attempt, three tries are made to reach the destination. The entire path is displayed in order.  Bidirectional agent-to-agent tests also support the &#x60;direction&#x60; parameter. For example, if agents A, B, and C are testing agent D bidirectionally, and you want results from the route from agent A to agent D, you can use the query &#x60;pathvis?direction&#x3D;to-target&#x60;. For results from agent D to agent A, you can use &#x60;pathvis?direction&#x3D;from-target&#x60;. To get both results for both routes, query without the direction parameter. The source will always be agent A and the destination will be agent D, but the direction field will indicate which trace direction you want test results from. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestPathvisAgentRoundTest() throws ApiException {
        String testId = null;
        String agentId = null;
        String roundId = null;
        String aid = null;
        TestDirection direction = null;
        GetTestPathvisAgentRound200Response response = api.getTestPathvisAgentRound(testId, agentId, roundId, aid, direction);
        // TODO: test validations
    }

    /**
     * Get network test results
     *
     * Returns network test results for every agent and round. If you do not specify a window or a start and end date, data is displayed for the most recent testing round. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestResultMetricsTest() throws ApiException {
        String testId = null;
        String aid = null;
        String window = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String cursor = null;
        TestDirection direction = null;
        GetTestResultMetrics200Response response = api.getTestResultMetrics(testId, aid, window, startDate, endDate, cursor, direction);
        // TODO: test validations
    }

    /**
     * Get pathvis network test results
     *
     * Returns a summary of the path trace data collected during path visualization for a given time range. With each attempt, three tries are made to reach the destination. The entire path is displayed in order. If you do not specify a window or a start and end date, data is displayed for the most recent testing round.   Bidirectional agent-to-agent tests also support the &#x60;direction&#x60; parameter. For example, if agents A, B, and C are testing agent D bidirectionally, and you want results from the route from agent A to agent D, you can use the query &#x60;pathvis?direction&#x3D;to-target&#x60;. For results from agent D to agent A, you can use &#x60;pathvis?direction&#x3D;from-target&#x60;. To get both results for both routes, query without the direction parameter. The source will always be agent A and the destination will be agent D, but the direction field will indicate which trace direction you want test results from. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestResultNetworkPathvisTest() throws ApiException {
        String testId = null;
        String aid = null;
        String window = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String cursor = null;
        TestDirection direction = null;
        GetTestResultNetworkPathvis200Response response = api.getTestResultNetworkPathvis(testId, aid, window, startDate, endDate, cursor, direction);
        // TODO: test validations
    }

}