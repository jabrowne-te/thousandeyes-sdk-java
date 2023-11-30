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


package com.thousandeyes.api;

import com.thousandeyes.ApiException;
import com.thousandeyes.api.model.Error;
import com.thousandeyes.api.model.GetUserEvents200Response;
import java.time.OffsetDateTime;
import com.thousandeyes.api.model.UnauthorizedError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserEventsApi
 */
@Disabled
public class UserEventsApiTest {

    private final UserEventsApi api = new UserEventsApi();

    /**
     * List activity log events
     *
     * Returns a list of activity log events. Users with the &#x60;View activity log for all users in account group&#x60; permission can see all activity log events in the current account group. Users with the &#x60;View own activity log&#x60; permission can see their own activity log events in the current account group.   For more information about changing the account group context, see [Account Context](https://developer.thousandeyes.com/v7/#/accountcontext).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserEventsTest() throws ApiException {
        String aid = null;
        String window = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String cursor = null;
        GetUserEvents200Response response = api.getUserEvents(aid, window, startDate, endDate, cursor);
        // TODO: test validations
    }

}