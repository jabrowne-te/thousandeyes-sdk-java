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
import com.thousandeyes.api.model.AgentToAgentTestProtocol;
import com.thousandeyes.api.model.InstantTestRequestAgentsInner;
import com.thousandeyes.api.model.TestDirection;
import com.thousandeyes.api.model.TestDscpId;
import com.thousandeyes.api.model.TestPathTraceMode;
import com.thousandeyes.api.model.UnexpandedInstantTestLinks;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for AgentToAgentInstantTestRequest
 */
public class AgentToAgentInstantTestRequestTest {
    private final AgentToAgentInstantTestRequest model = new AgentToAgentInstantTestRequest();

    /**
     * Model tests for AgentToAgentInstantTestRequest
     */
    @Test
    public void testAgentToAgentInstantTestRequest() {
        // TODO: test AgentToAgentInstantTestRequest
    }

    /**
     * Test the property 'createdBy'
     */
    @Test
    public void createdByTest() {
        // TODO: test createdBy
    }

    /**
     * Test the property 'createdDate'
     */
    @Test
    public void createdDateTest() {
        // TODO: test createdDate
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'liveShare'
     */
    @Test
    public void liveShareTest() {
        // TODO: test liveShare
    }

    /**
     * Test the property 'modifiedBy'
     */
    @Test
    public void modifiedByTest() {
        // TODO: test modifiedBy
    }

    /**
     * Test the property 'modifiedDate'
     */
    @Test
    public void modifiedDateTest() {
        // TODO: test modifiedDate
    }

    /**
     * Test the property 'savedEvent'
     */
    @Test
    public void savedEventTest() {
        // TODO: test savedEvent
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
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'links'
     */
    @Test
    public void linksTest() {
        // TODO: test links
    }

    /**
     * Test the property 'labels'
     */
    @Test
    public void labelsTest() {
        // TODO: test labels
    }

    /**
     * Test the property 'sharedWithAccounts'
     */
    @Test
    public void sharedWithAccountsTest() {
        // TODO: test sharedWithAccounts
    }

    /**
     * Test the property 'agents'
     */
    @Test
    public void agentsTest() {
        // TODO: test agents
    }

    /**
     * Test the property 'direction'
     */
    @Test
    public void directionTest() {
        // TODO: test direction
    }

    /**
     * Test the property 'dscp'
     */
    @Test
    public void dscpTest() {
        // TODO: test dscp
    }

    /**
     * Test the property 'dscpId'
     */
    @Test
    public void dscpIdTest() {
        // TODO: test dscpId
    }

    /**
     * Test the property 'mss'
     */
    @Test
    public void mssTest() {
        // TODO: test mss
    }

    /**
     * Test the property 'numPathTraces'
     */
    @Test
    public void numPathTracesTest() {
        // TODO: test numPathTraces
    }

    /**
     * Test the property 'pathTraceMode'
     */
    @Test
    public void pathTraceModeTest() {
        // TODO: test pathTraceMode
    }

    /**
     * Test the property 'port'
     */
    @Test
    public void portTest() {
        // TODO: test port
    }

    /**
     * Test the property 'protocol'
     */
    @Test
    public void protocolTest() {
        // TODO: test protocol
    }

    /**
     * Test the property 'targetAgentId'
     */
    @Test
    public void targetAgentIdTest() {
        // TODO: test targetAgentId
    }

    /**
     * Test the property 'throughputMeasurements'
     */
    @Test
    public void throughputMeasurementsTest() {
        // TODO: test throughputMeasurements
    }

    /**
     * Test the property 'throughputDuration'
     */
    @Test
    public void throughputDurationTest() {
        // TODO: test throughputDuration
    }

    /**
     * Test the property 'throughputRate'
     */
    @Test
    public void throughputRateTest() {
        // TODO: test throughputRate
    }

    /**
     * Test the property 'fixedPacketRate'
     */
    @Test
    public void fixedPacketRateTest() {
        // TODO: test fixedPacketRate
    }

}