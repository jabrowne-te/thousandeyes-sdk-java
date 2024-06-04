/*
 * Usage API
 *  These usage endpoints define the following operations:  * **Usage**: Retrieve usage data for the specified time period (default is one month).          * Users must have the `View Billing` permission to access this endpoint.     * This endpoint offers visibility across all account groups within the organization.     * Users with `View Billing` permission in multiple organizations should query the endpoint with the `aid` query string parameter (see optional parameters) for each organization.  * **Quotas**: Obtain organization and account usage quotas. Additionally, users with the appropriate permissions can create, update, or delete these quotas.          * Users must have the necessary permissions to perform quota-related actions.  Refer to the Usage API endpoints for detailed usage instructions and optional parameters. 
 *
 * The version of the OpenAPI document: 7.0.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.usage;

import com.thousandeyes.sdk.usage.model.Error;
import com.thousandeyes.sdk.usage.model.OrganizationsQuotasAssign;
import com.thousandeyes.sdk.usage.model.OrganizationsQuotasUnassign;
import com.thousandeyes.sdk.usage.model.Quotas;
import com.thousandeyes.sdk.usage.model.QuotasAssignRequest;
import com.thousandeyes.sdk.usage.model.QuotasAssignResponse;
import com.thousandeyes.sdk.usage.model.QuotasUnassign;
import com.thousandeyes.sdk.usage.model.UnauthorizedError;
import com.thousandeyes.sdk.usage.model.ValidationError;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Request and Response model deserialization tests for QuotasApi
 */
public class QuotasApiTest {
    // private final QuotasApi api = new QuotasApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create or update accout group quotas
     * <p>
     * This endpoint assigns quota values to multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This endpoint follows a cumulative behavior––This means that the quotas are assigned to the designated account groups, and any previous assignments remain in place without any unassignment occurring.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void assignOrganizationsAccountGroupsQuotasRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "organizations" : [ {
                    "orgId" : "1234",
                    "accountGroups" : [ {
                      "value" : 12000,
                      "aid" : "1234"
                    }, {
                      "value" : 12000,
                      "aid" : "1234"
                    } ]
                  }, {
                    "orgId" : "1234",
                    "accountGroups" : [ {
                      "value" : 12000,
                      "aid" : "1234"
                    }, {
                      "value" : 12000,
                      "aid" : "1234"
                    } ]
                  } ]
                }
                                 """;
        OrganizationsQuotasAssign mappedRequest = 
                mapper.readValue(requestBodyJson, OrganizationsQuotasAssign.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "organizations" : [ {
                    "orgId" : "1234",
                    "accountGroups" : [ {
                      "value" : 12000,
                      "aid" : "1234"
                    }, {
                      "value" : 12000,
                      "aid" : "1234"
                    } ]
                  }, {
                    "orgId" : "1234",
                    "accountGroups" : [ {
                      "value" : 12000,
                      "aid" : "1234"
                    }, {
                      "value" : 12000,
                      "aid" : "1234"
                    } ]
                  } ]
                }
                                  """;
        OrganizationsQuotasAssign mappedResponse = 
                mapper.readValue(responseBodyJson, OrganizationsQuotasAssign.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Create or update organizations quotas
     * <p>
     * This endpoint recieves a list of organization quotas to create or update. If there&#39;s no specific &#x60;orgId&#x60; defined for a quota, it defaults to using the authenticated organization. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. This endpoint follows cumulative behavior––This means that the quotas are assigned to the specified organizations, and any previous assignments remain unchanged; no unassignments occur.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void assignOrganizationsQuotasRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "organizations" : [ {
                    "value" : 12000
                  }, {
                    "orgId" : "1234",
                    "value" : 10000
                  } ]
                }
                                 """;
        QuotasAssignRequest mappedRequest = 
                mapper.readValue(requestBodyJson, QuotasAssignRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "organizations" : [ {
                    "orgId" : "1234",
                    "value" : 12000
                  }, {
                    "orgId" : "12345",
                    "value" : 10000
                  } ]
                }
                                  """;
        QuotasAssignResponse mappedResponse = 
                mapper.readValue(responseBodyJson, QuotasAssignResponse.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Get organization and account group usage quota
     * <p>
     * This endpoint retrieves usage quotas for both organization and account groups. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission. If a user has quota update permission in multiple organizations, the API returns data from all such organizations.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getQuotasRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "quotas" : [ {
                    "accountGroupQuotas" : [ {
                      "value" : 12000,
                      "aid" : "1234"
                    }, {
                      "value" : 10000,
                      "aid" : "12345"
                    } ],
                    "organizationQuota" : {
                      "value" : 22500,
                      "orgId" : "10"
                    }
                  }, {
                    "accountGroupQuotas" : [ {
                      "value" : 12000,
                      "aid" : "1234"
                    }, {
                      "value" : 10000,
                      "aid" : "12345"
                    } ],
                    "organizationQuota" : {
                      "value" : 22500,
                      "orgId" : "10"
                    }
                  } ],
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  }
                }
                                  """;
        Quotas mappedResponse = 
                mapper.readValue(responseBodyJson, Quotas.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Remove account group quotas from organizations
     * <p>
     * This endpoint removes quotas from multiple account groups across multiple organizations. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void unassignOrganizationsAccountGroupsQuotasRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "organizations" : [ {
                    "orgId" : "1234",
                    "accountGroups" : [ "1234", "12345" ]
                  }, {
                    "orgId" : "1234",
                    "accountGroups" : [ "1234", "12345" ]
                  } ]
                }
                                 """;
        OrganizationsQuotasUnassign mappedRequest = 
                mapper.readValue(requestBodyJson, OrganizationsQuotasUnassign.class);
        assertNotNull(mappedRequest);

    }
    
    /**
     * Remove organization quotas
     * <p>
     * This endpoint recieves a list of organization IDs to remove their current quota. To use this endpoint, you need the &#x60;Edit organization and account group quotas&#x60; permission, which is a management-level permission.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void unassignOrganizationsQuotasRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "organizations" : [ "1234", "12345" ]
                }
                                 """;
        QuotasUnassign mappedRequest = 
                mapper.readValue(requestBodyJson, QuotasUnassign.class);
        assertNotNull(mappedRequest);

    }
    
}