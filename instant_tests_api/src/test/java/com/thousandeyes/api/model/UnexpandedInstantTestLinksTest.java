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


package com.thousandeyes.api.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thousandeyes.api.model.UnexpandedInstantTestLinksSelf;
import com.thousandeyes.api.model.UnexpandedInstantTestLinksTestResults;
import java.io.IOException;
import java.util.Arrays;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for UnexpandedInstantTestLinks
 */
public class UnexpandedInstantTestLinksTest {
    private final UnexpandedInstantTestLinks model = new UnexpandedInstantTestLinks();

    /**
     * Model tests for UnexpandedInstantTestLinks
     */
    @Test
    public void testUnexpandedInstantTestLinks() {
        // TODO: test UnexpandedInstantTestLinks
    }

    /**
     * Test the property 'self'
     */
    @Test
    public void selfTest() {
        // TODO: test self
    }

    /**
     * Test the property 'testResults'
     */
    @Test
    public void testResultsTest() {
        // TODO: test testResults
    }

}