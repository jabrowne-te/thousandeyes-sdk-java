/*
 * Labels API
 * ### Overview This is API for the Labels API (formerly called groups).
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
import com.thousandeyes.api.model.CreateAgentLabel201Response;
import com.thousandeyes.api.model.Error;
import com.thousandeyes.api.model.LabelRequest;
import java.net.URI;
import com.thousandeyes.api.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TestApi
 */
@Disabled
public class TestApiTest {

    private final TestApi api = new TestApi();

    /**
     * Create a Label of type &#x60;test&#x60;
     *
     * Creates a new label (formerly called group) in ThousandEyes, based on properties provided in the POST data.  In order to create a new label, the user attempting the creation must have sufficient privileges to create labels. Regular users are blocked from using any of the POST-based methods. Note: When creating or updating a label and assigning &#x60;agent&#x60; or &#x60;test&#x60;, the user needs permission to modify the objects being added.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTestLabelTest() throws ApiException {
        String aid = null;
        LabelRequest labelRequest = null;
        CreateAgentLabel201Response response = api.createTestLabel(aid, labelRequest);
        // TODO: test validations
    }

    /**
     * Delete a Label object of type &#x60;test&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTestLabelTest() throws ApiException {
        String labelId = null;
        String aid = null;
        api.deleteTestLabel(labelId, aid);
        // TODO: test validations
    }

    /**
     * Get a Label object of type &#x60;test&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestLabelTest() throws ApiException {
        String labelId = null;
        String aid = null;
        CreateAgentLabel201Response response = api.getTestLabel(labelId, aid);
        // TODO: test validations
    }

    /**
     * Update a Label object of type &#x60;test&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTestLabelTest() throws ApiException {
        String labelId = null;
        String aid = null;
        LabelRequest labelRequest = null;
        CreateAgentLabel201Response response = api.updateTestLabel(labelId, aid, labelRequest);
        // TODO: test validations
    }

}