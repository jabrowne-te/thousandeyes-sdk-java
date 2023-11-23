/*
 * Administrative API
 * ## Overview Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API.  This API provides the following endpoints that define the operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These endpoints can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AccountGroup1;
import org.openapitools.client.model.CloudEnterpriseAgentType;
import org.openapitools.client.model.ClusterMember;
import org.openapitools.client.model.EnterpriseAgentIpv6Policy;
import org.openapitools.client.model.EnterpriseAgentState;
import org.openapitools.client.model.ErrorDetail;
import org.openapitools.client.model.InterfaceIpMapping;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for EnterpriseAgent
 */
public class EnterpriseAgentTest {
    private final EnterpriseAgent model = new EnterpriseAgent();

    /**
     * Model tests for EnterpriseAgent
     */
    @Test
    public void testEnterpriseAgent() {
        // TODO: test EnterpriseAgent
    }

    /**
     * Test the property 'ipAddresses'
     */
    @Test
    public void ipAddressesTest() {
        // TODO: test ipAddresses
    }

    /**
     * Test the property 'publicIpAddresses'
     */
    @Test
    public void publicIpAddressesTest() {
        // TODO: test publicIpAddresses
    }

    /**
     * Test the property 'network'
     */
    @Test
    public void networkTest() {
        // TODO: test network
    }

    /**
     * Test the property 'agentId'
     */
    @Test
    public void agentIdTest() {
        // TODO: test agentId
    }

    /**
     * Test the property 'agentName'
     */
    @Test
    public void agentNameTest() {
        // TODO: test agentName
    }

    /**
     * Test the property 'agentType'
     */
    @Test
    public void agentTypeTest() {
        // TODO: test agentType
    }

    /**
     * Test the property 'location'
     */
    @Test
    public void locationTest() {
        // TODO: test location
    }

    /**
     * Test the property 'countryId'
     */
    @Test
    public void countryIdTest() {
        // TODO: test countryId
    }

    /**
     * Test the property 'enabled'
     */
    @Test
    public void enabledTest() {
        // TODO: test enabled
    }

    /**
     * Test the property 'verifySslCertificates'
     */
    @Test
    public void verifySslCertificatesTest() {
        // TODO: test verifySslCertificates
    }

    /**
     * Test the property 'clusterMembers'
     */
    @Test
    public void clusterMembersTest() {
        // TODO: test clusterMembers
    }

    /**
     * Test the property 'utilization'
     */
    @Test
    public void utilizationTest() {
        // TODO: test utilization
    }

    /**
     * Test the property 'accountGroups'
     */
    @Test
    public void accountGroupsTest() {
        // TODO: test accountGroups
    }

    /**
     * Test the property 'prefix'
     */
    @Test
    public void prefixTest() {
        // TODO: test prefix
    }

    /**
     * Test the property 'ipv6Policy'
     */
    @Test
    public void ipv6PolicyTest() {
        // TODO: test ipv6Policy
    }

    /**
     * Test the property 'errorDetails'
     */
    @Test
    public void errorDetailsTest() {
        // TODO: test errorDetails
    }

    /**
     * Test the property 'hostname'
     */
    @Test
    public void hostnameTest() {
        // TODO: test hostname
    }

    /**
     * Test the property 'lastSeen'
     */
    @Test
    public void lastSeenTest() {
        // TODO: test lastSeen
    }

    /**
     * Test the property 'agentState'
     */
    @Test
    public void agentStateTest() {
        // TODO: test agentState
    }

    /**
     * Test the property 'keepBrowserCache'
     */
    @Test
    public void keepBrowserCacheTest() {
        // TODO: test keepBrowserCache
    }

    /**
     * Test the property 'createdDate'
     */
    @Test
    public void createdDateTest() {
        // TODO: test createdDate
    }

    /**
     * Test the property 'targetForTests'
     */
    @Test
    public void targetForTestsTest() {
        // TODO: test targetForTests
    }

    /**
     * Test the property 'localResolutionPrefixes'
     */
    @Test
    public void localResolutionPrefixesTest() {
        // TODO: test localResolutionPrefixes
    }

    /**
     * Test the property 'interfaceIpMappings'
     */
    @Test
    public void interfaceIpMappingsTest() {
        // TODO: test interfaceIpMappings
    }

}
