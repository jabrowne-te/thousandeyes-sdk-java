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
import com.thousandeyes.api.model.GetPageLoadTest200Response;
import com.thousandeyes.api.model.GetPageLoadTests200Response;
import com.thousandeyes.api.model.PageLoadTest;
import java.net.URI;
import com.thousandeyes.api.model.UnauthorizedError;
import com.thousandeyes.api.model.UpdatePageLoadTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PageLoadApi
 */
@Disabled
public class PageLoadApiTest {

    private final PageLoadApi api = new PageLoadApi();

    /**
     * Create Page Load test
     *
     * Creates a new Page Load test. This method requires Account Admin permissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPageLoadTestTest() throws ApiException {
        UpdatePageLoadTest updatePageLoadTest = null;
        String aid = null;
        List<Expand> expand = null;
        PageLoadTest response = api.createPageLoadTest(updatePageLoadTest, aid, expand);
        // TODO: test validations
    }

    /**
     * Delete Page Load test
     *
     * Deletes the specified Page Load test. This method requires Account Admin permissions. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePageLoadTestTest() throws ApiException {
        String testId = null;
        String aid = null;
        api.deletePageLoadTest(testId, aid);
        // TODO: test validations
    }

    /**
     * Get Page Load test
     *
     * Returns details for a Page Load test, including name, intervals, targets, alert rules and agents.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPageLoadTestTest() throws ApiException {
        String testId = null;
        String aid = null;
        List<Expand> expand = null;
        GetPageLoadTest200Response response = api.getPageLoadTest(testId, aid, expand);
        // TODO: test validations
    }

    /**
     * List Page Load tests
     *
     * Returns a list of all Page Load tests and saved events.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPageLoadTestsTest() throws ApiException {
        String aid = null;
        GetPageLoadTests200Response response = api.getPageLoadTests(aid);
        // TODO: test validations
    }

    /**
     * Update Page Load test
     *
     * Updates a Page Load test. The target test cannot be a live share or saved event. This method requires Account Admin permissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePageLoadTestTest() throws ApiException {
        String testId = null;
        UpdatePageLoadTest updatePageLoadTest = null;
        String aid = null;
        List<Expand> expand = null;
        GetPageLoadTest200Response response = api.updatePageLoadTest(testId, updatePageLoadTest, aid, expand);
        // TODO: test validations
    }

}