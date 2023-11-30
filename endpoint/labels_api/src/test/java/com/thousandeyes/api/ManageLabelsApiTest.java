/*
 * Endpoint Agent Labels API
 * Manage labels applied to endpoint agents using this API. 
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
import java.math.BigDecimal;
import com.thousandeyes.api.model.EndpointLabelsList200Response;
import com.thousandeyes.api.model.Error;
import com.thousandeyes.api.model.Expand;
import com.thousandeyes.api.model.Label;
import java.net.URI;
import com.thousandeyes.api.model.UnauthorizedError;
import com.thousandeyes.api.model.V7EndpointLabelsPost201Response;
import com.thousandeyes.api.model.V7EndpointLabelsPostRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManageLabelsApi
 */
@Disabled
public class ManageLabelsApiTest {

    private final ManageLabelsApi api = new ManageLabelsApi();

    /**
     * Deletes label
     *
     * Deletes the label from your account. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void endpointLabelDeleteTest() throws ApiException {
        String id = null;
        api.endpointLabelDelete(id);
        // TODO: test validations
    }

    /**
     * Retrieve label
     *
     * Returns a single label using its ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void endpointLabelGetTest() throws ApiException {
        String id = null;
        List<Expand> expand = null;
        V7EndpointLabelsPost201Response response = api.endpointLabelGet(id, expand);
        // TODO: test validations
    }

    /**
     * Update label
     *
     * Updates a label using its ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void endpointLabelUpdateTest() throws ApiException {
        String id = null;
        Label label = null;
        V7EndpointLabelsPost201Response response = api.endpointLabelUpdate(id, label);
        // TODO: test validations
    }

    /**
     * List labels
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void endpointLabelsListTest() throws ApiException {
        BigDecimal max = null;
        String cursor = null;
        List<Expand> expand = null;
        EndpointLabelsList200Response response = api.endpointLabelsList(max, cursor, expand);
        // TODO: test validations
    }

    /**
     * Create label
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void v7EndpointLabelsPostTest() throws ApiException {
        V7EndpointLabelsPostRequest v7EndpointLabelsPostRequest = null;
        V7EndpointLabelsPost201Response response = api.v7EndpointLabelsPost(v7EndpointLabelsPostRequest);
        // TODO: test validations
    }

}