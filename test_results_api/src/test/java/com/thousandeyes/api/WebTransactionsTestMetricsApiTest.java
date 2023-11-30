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
import com.thousandeyes.api.model.GetTestResultWebTransactions200Response;
import com.thousandeyes.api.model.GetTestResultWebTransactionsComponentDetail200Response;
import com.thousandeyes.api.model.GetTestResultWebTransactionsComponentPageDetail200Response;
import java.time.OffsetDateTime;
import com.thousandeyes.api.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebTransactionsTestMetricsApi
 */
@Disabled
public class WebTransactionsTestMetricsApiTest {

    private final WebTransactionsTestMetricsApi api = new WebTransactionsTestMetricsApi();

    /**
     * Get web transactions test results
     *
     * Returns test results for web transactions. If you do not specify a window or a start and end date, data is displayed for the most recent testing round. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestResultWebTransactionsTest() throws ApiException {
        String testId = null;
        String aid = null;
        String window = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String cursor = null;
        GetTestResultWebTransactions200Response response = api.getTestResultWebTransactions(testId, aid, window, startDate, endDate, cursor);
        // TODO: test validations
    }

    /**
     * Get web transactions test results by agent and round
     *
     * Returns test results for web transactions for a given agent and round. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestResultWebTransactionsComponentDetailTest() throws ApiException {
        String testId = null;
        String agentId = null;
        String roundId = null;
        String aid = null;
        GetTestResultWebTransactionsComponentDetail200Response response = api.getTestResultWebTransactionsComponentDetail(testId, agentId, roundId, aid);
        // TODO: test validations
    }

    /**
     * Get detailed web transactions test result by agent, round, and page
     *
     * Returns a page of web transaction test results for an agent and round. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestResultWebTransactionsComponentPageDetailTest() throws ApiException {
        String testId = null;
        String agentId = null;
        String roundId = null;
        String pageId = null;
        String aid = null;
        GetTestResultWebTransactionsComponentPageDetail200Response response = api.getTestResultWebTransactionsComponentPageDetail(testId, agentId, roundId, pageId, aid);
        // TODO: test validations
    }

}