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
import com.thousandeyes.api.model.GetTests200Response;
import com.thousandeyes.api.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AllTestTypesApi
 */
@Disabled
public class AllTestTypesApiTest {

    private final AllTestTypesApi api = new AllTestTypesApi();

    /**
     * List configured tests
     *
     * Returns configured tests and saved events.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTestsTest() throws ApiException {
        String aid = null;
        GetTests200Response response = api.getTests(aid);
        // TODO: test validations
    }

}