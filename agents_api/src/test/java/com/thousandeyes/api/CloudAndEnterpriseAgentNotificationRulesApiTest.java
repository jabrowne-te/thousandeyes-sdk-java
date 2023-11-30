/*
 * Agents API
 *  ## Overview Manage all agents available to your account in ThousandEyes, including both Cloud and Enterprise Agents.
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
import com.thousandeyes.api.model.GetAgentsNotificationRule200Response;
import com.thousandeyes.api.model.GetAgentsNotificationRules200Response;
import com.thousandeyes.api.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CloudAndEnterpriseAgentNotificationRulesApi
 */
@Disabled
public class CloudAndEnterpriseAgentNotificationRulesApiTest {

    private final CloudAndEnterpriseAgentNotificationRulesApi api = new CloudAndEnterpriseAgentNotificationRulesApi();

    /**
     * Retrieve agent notification rule
     *
     * Returns details of an agent notification rule, including agents it is assigned to. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAgentsNotificationRuleTest() throws ApiException {
        String notificationRuleId = null;
        String aid = null;
        GetAgentsNotificationRule200Response response = api.getAgentsNotificationRule(notificationRuleId, aid);
        // TODO: test validations
    }

    /**
     * List agent notification rules
     *
     * Returns a list of all agent notification rules configured under the account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAgentsNotificationRulesTest() throws ApiException {
        String aid = null;
        GetAgentsNotificationRules200Response response = api.getAgentsNotificationRules(aid);
        // TODO: test validations
    }

}