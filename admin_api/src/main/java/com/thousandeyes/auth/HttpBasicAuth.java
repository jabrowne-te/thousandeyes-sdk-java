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


package com.thousandeyes.auth;

import com.thousandeyes.Pair;
import com.thousandeyes.ApiException;

import okhttp3.Credentials;

import java.net.URI;
import java.util.Map;
import java.util.List;

import java.io.UnsupportedEncodingException;

public class HttpBasicAuth implements Authentication {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams,
                              String payload, String method, URI uri) throws ApiException {
        if (username == null && password == null) {
            return;
        }
        headerParams.put("Authorization", Credentials.basic(
            username == null ? "" : username,
            password == null ? "" : password));
    }
}