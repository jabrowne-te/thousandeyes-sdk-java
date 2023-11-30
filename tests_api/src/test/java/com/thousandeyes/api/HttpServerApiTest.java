/*
 * Tests API
 *  ### Overview This API supports listing, creating, editing, and deleting Cloud and Enterprise Agent (CEA) based tests.
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
import com.thousandeyes.api.model.GetHttpServerTest200Response;
import com.thousandeyes.api.model.GetHttpServerTests200Response;
import com.thousandeyes.api.model.HttpServerTest;
import java.net.URI;
import com.thousandeyes.api.model.UnauthorizedError;
import com.thousandeyes.api.model.UpdateHttpServerTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HttpServerApi
 */
@Disabled
public class HttpServerApiTest {

    private final HttpServerApi api = new HttpServerApi();

    /**
     * Create HTTP Server test
     *
     * Creates a new HTTP Server test. This method requires Account Admin permissions. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createHttpServerTestTest() throws ApiException {
        UpdateHttpServerTest updateHttpServerTest = null;
        String aid = null;
        List<Expand> expand = null;
        HttpServerTest response = api.createHttpServerTest(updateHttpServerTest, aid, expand);
        // TODO: test validations
    }

    /**
     * Delete HTTP Server test
     *
     * Deletes the specified HTTP Server test. This method requires Account Admin permissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteHttpServerTestTest() throws ApiException {
        String testId = null;
        String aid = null;
        api.deleteHttpServerTest(testId, aid);
        // TODO: test validations
    }

    /**
     * Get HTTP Server test
     *
     * Returns details for a HTTP Server test, including name, intervals, targets, alert rules and agents.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHttpServerTestTest() throws ApiException {
        String testId = null;
        String aid = null;
        List<Expand> expand = null;
        GetHttpServerTest200Response response = api.getHttpServerTest(testId, aid, expand);
        // TODO: test validations
    }

    /**
     * List HTTP Server tests
     *
     * Returns a list of all HTTP Server tests and saved events.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHttpServerTestsTest() throws ApiException {
        String aid = null;
        GetHttpServerTests200Response response = api.getHttpServerTests(aid);
        // TODO: test validations
    }

    /**
     * Update HTTP Server test
     *
     * Updates a HTTP Server test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateHttpServerTestTest() throws ApiException {
        String testId = null;
        UpdateHttpServerTest updateHttpServerTest = null;
        String aid = null;
        List<Expand> expand = null;
        GetHttpServerTest200Response response = api.updateHttpServerTest(testId, updateHttpServerTest, aid, expand);
        // TODO: test validations
    }

}