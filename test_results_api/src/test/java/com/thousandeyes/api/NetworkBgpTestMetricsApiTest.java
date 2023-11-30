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
import com.thousandeyes.api.model.GetTestResultsBgp200Response;
import com.thousandeyes.api.model.GetTestResultsBgpPrefix200Response;
import java.time.OffsetDateTime;
import com.thousandeyes.api.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetworkBgpTestMetricsApi
 */
@Disabled
public class NetworkBgpTestMetricsApiTest {

    private final NetworkBgpTestMetricsApi api = new NetworkBgpTestMetricsApi();

    /**
     * Get BGP test results
     *
     * Returns a list of BGP monitors actively monitoring the destination&#39;s target prefix. This list includes information about the prefix, its associated AS Number, and provides details regarding reachability, path updates, and any changes in the path for the target network. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestResultsBgpTest() throws ApiException {
        String testId = null;
        String aid = null;
        String window = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String cursor = null;
        GetTestResultsBgp200Response response = api.getTestResultsBgp(testId, aid, window, startDate, endDate, cursor);
        // TODO: test validations
    }

    /**
     * Get BGP route test results by prefix
     *
     * Returns an ordered list of networks crossed by a particular network prefix, including assigned monitors for the test and the paths taken to reach the destination. This is similar to revealing ASPath details found in a BGP Routing Information Base (rib) dump. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestResultsBgpPrefixTest() throws ApiException {
        String testId = null;
        String prefixId = null;
        String roundId = null;
        String aid = null;
        GetTestResultsBgpPrefix200Response response = api.getTestResultsBgpPrefix(testId, prefixId, roundId, aid);
        // TODO: test validations
    }

}