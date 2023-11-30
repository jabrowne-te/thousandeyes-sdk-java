/*
 * Usage API
 * ## Overview These usage endpoints define the following operations: * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the API definitions below for detailed usage instructions and optional parameters.
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
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for TestsInner
 */
public class TestsInnerTest {
    private final TestsInner model = new TestsInner();

    /**
     * Model tests for TestsInner
     */
    @Test
    public void testTestsInner() {
        // TODO: test TestsInner
    }

    /**
     * Test the property 'aid'
     */
    @Test
    public void aidTest() {
        // TODO: test aid
    }

    /**
     * Test the property 'accountGroupName'
     */
    @Test
    public void accountGroupNameTest() {
        // TODO: test accountGroupName
    }

    /**
     * Test the property 'testId'
     */
    @Test
    public void testIdTest() {
        // TODO: test testId
    }

    /**
     * Test the property 'testName'
     */
    @Test
    public void testNameTest() {
        // TODO: test testName
    }

    /**
     * Test the property 'testType'
     */
    @Test
    public void testTypeTest() {
        // TODO: test testType
    }

    /**
     * Test the property 'cloudUnitsUsed'
     */
    @Test
    public void cloudUnitsUsedTest() {
        // TODO: test cloudUnitsUsed
    }

    /**
     * Test the property 'cloudUnitsProjected'
     */
    @Test
    public void cloudUnitsProjectedTest() {
        // TODO: test cloudUnitsProjected
    }

}