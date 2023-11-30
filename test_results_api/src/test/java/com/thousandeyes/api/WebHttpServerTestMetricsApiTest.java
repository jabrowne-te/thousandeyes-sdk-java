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
import com.thousandeyes.api.model.Expand;
import com.thousandeyes.api.model.GetTestResultHttpServer200Response;
import java.time.OffsetDateTime;
import com.thousandeyes.api.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebHttpServerTestMetricsApi
 */
@Disabled
public class WebHttpServerTestMetricsApiTest {

    private final WebHttpServerTestMetricsApi api = new WebHttpServerTestMetricsApi();

    /**
     * Get HTTP server test results
     *
     * Returns results for requests made over HTTP. Components include DNS, Connect, Wait, Receive, and Fetch. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestResultHttpServerTest() throws ApiException {
        String testId = null;
        String aid = null;
        String window = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String cursor = null;
        List<Expand> expand = null;
        GetTestResultHttpServer200Response response = api.getTestResultHttpServer(testId, aid, window, startDate, endDate, cursor, expand);
        // TODO: test validations
    }

}