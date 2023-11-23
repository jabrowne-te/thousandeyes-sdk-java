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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AccountGroupRolesRequestBodyInner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for UserRequestBody
 */
public class UserRequestBodyTest {
    private final UserRequestBody model = new UserRequestBody();

    /**
     * Model tests for UserRequestBody
     */
    @Test
    public void testUserRequestBody() {
        // TODO: test UserRequestBody
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'loginAccountGroupId'
     */
    @Test
    public void loginAccountGroupIdTest() {
        // TODO: test loginAccountGroupId
    }

    /**
     * Test the property 'accountGroupRoles'
     */
    @Test
    public void accountGroupRolesTest() {
        // TODO: test accountGroupRoles
    }

    /**
     * Test the property 'allAccountGroupRoleIds'
     */
    @Test
    public void allAccountGroupRoleIdsTest() {
        // TODO: test allAccountGroupRoleIds
    }

}
