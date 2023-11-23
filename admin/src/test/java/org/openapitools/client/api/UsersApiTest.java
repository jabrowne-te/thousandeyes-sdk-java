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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.CreateUser201Response;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.GetUser200Response;
import org.openapitools.client.model.GetUsers200Response;
import java.net.URI;
import org.openapitools.client.model.UnauthorizedError;
import org.openapitools.client.model.UserRequestBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    /**
     * Create user
     *
     * Creates a new user.  The following applies when creating a user:  * If the user is already a member of another ThousandEyes customer organization, the user must set their own login account group.  * Any update that includes &#x60;accountGroupRoles&#x60; is a replace-based update and not a delta-based update.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        UserRequestBody userRequestBody = null;
        String aid = null;
        CreateUser201Response response = api.createUser(userRequestBody, aid);
        // TODO: test validations
    }

    /**
     * Delete user
     *
     * Deletes a user using the user ID. This endpoint requires the &#x60;Edit users in all account groups&#x60; or &#x60;Edit users&#x60; permission.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String id = null;
        String aid = null;
        api.deleteUser(id, aid);
        // TODO: test validations
    }

    /**
     * Retrieve user
     *
     * Retrieves detailed information about a user. This operation requires the &#x60;API Access&#x60; and &#x60;View All Users&#x60; permissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String id = null;
        String aid = null;
        GetUser200Response response = api.getUser(id, aid);
        // TODO: test validations
    }

    /**
     * List users
     *
     * Retrieves a list of users in the organization the account group ID belongs to. This operation requires the &#x60;API Access&#x60; and &#x60;View all users&#x60; permissions. See [Account Context](https://developer.thousandeyes.com/v7/#/accountcontext) for more information on changing the account group context.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        String aid = null;
        GetUsers200Response response = api.getUsers(aid);
        // TODO: test validations
    }

    /**
     * Update user
     *
     * Updates a user using the user ID. You can update the user name, email address, account group assignments, or roles. This endpoint requires the &#x60;Edit users in all account groups&#x60; or &#x60;Edit users&#x60; permission.   When updating a user, the following applies: * When updating a user&#39;s email address, the user must confirm the username change before they can subsequently log in or perform API operations. * Any update that includes &#x60;accountGroupRoles&#x60; is a replace-based update and not a delta-based update.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String id = null;
        UserRequestBody userRequestBody = null;
        String aid = null;
        GetUser200Response response = api.updateUser(id, userRequestBody, aid);
        // TODO: test validations
    }

}
