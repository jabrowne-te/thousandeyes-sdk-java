/*
 * Administrative API
 * Manage users, accounts, and account groups in the ThousandEyes platform using the Administrative API. This API provides the following operations to manage your organization:     * `/account-groups`: Account groups are used to divide an organization into different sections. These operations can be used to create, retrieve, update and delete account groups.   * `/users`: Create, retrieve, update and delete users within an organization.    * `/roles`: Create, retrieve and update roles for the current user.    * `/permissions`: Retrieve all assignable permissions. Used in the context of modifying roles.    * `/audit-user-events`: Retrieve all activity log events.    For more information about the administrative models, see [Account Management](https://docs.thousandeyes.com/product-documentation/user-management).
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.thousandeyes.sdk.account.management.administrative;

import static com.thousandeyes.sdk.client.RequestUtil.parameterToPairs;
import static com.thousandeyes.sdk.client.RequestUtil.urlEncode;

import com.thousandeyes.sdk.client.ApiClient;
import com.thousandeyes.sdk.client.ApiException;
import com.thousandeyes.sdk.client.ApiResponse;
import com.thousandeyes.sdk.client.ApiRequest;
import com.thousandeyes.sdk.utils.Config;
import org.apache.commons.lang3.tuple.Pair;

import com.thousandeyes.sdk.account.management.administrative.model.AccountGroupDetail;
import com.thousandeyes.sdk.account.management.administrative.model.AccountGroupRequest;
import com.thousandeyes.sdk.account.management.administrative.model.AccountGroups;
import com.thousandeyes.sdk.account.management.administrative.model.CreatedAccountGroup;
import com.thousandeyes.sdk.account.management.administrative.model.Error;
import com.thousandeyes.sdk.account.management.administrative.model.ExpandAccountGroupOptions;
import java.net.URI;
import com.thousandeyes.sdk.account.management.administrative.model.UnauthorizedError;
import com.thousandeyes.sdk.account.management.administrative.model.ValidationError;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "com.thousandeyes.api.codegen.ThousandeyesJavaGenerator")
public class AccountGroupsApi {
  private final ApiClient apiClient;

  public AccountGroupsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create account group
   * Creates a new account group. This operation requires the &#x60;Edit all account groups&#x60; permission.  **Note:** Any user assigned to &#x60;All Account Groups&#x60; is automatically assigned to the new account group.
   * @param accountGroupRequest  (required)
   * @param expand Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. (optional
   * @return CreatedAccountGroup
   * @throws ApiException if fails to make API call
   */
  public CreatedAccountGroup createAccountGroup(AccountGroupRequest accountGroupRequest, List<ExpandAccountGroupOptions> expand) throws ApiException {
    ApiResponse<CreatedAccountGroup> response = createAccountGroupWithHttpInfo(accountGroupRequest, expand);
    return response.getData();
  }

  /**
   * Create account group
   * Creates a new account group. This operation requires the &#x60;Edit all account groups&#x60; permission.  **Note:** Any user assigned to &#x60;All Account Groups&#x60; is automatically assigned to the new account group.
   * @param accountGroupRequest  (required)
   * @param expand Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. (optional
   * @return ApiResponse&lt;CreatedAccountGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreatedAccountGroup> createAccountGroupWithHttpInfo(AccountGroupRequest accountGroupRequest, List<ExpandAccountGroupOptions> expand) throws ApiException {
    createAccountGroupValidateRequest(accountGroupRequest);

    var requestBuilder = createAccountGroupRequestBuilder(accountGroupRequest, expand);

    return apiClient.send(requestBuilder.build(), CreatedAccountGroup.class);
  }

  private void createAccountGroupValidateRequest(AccountGroupRequest accountGroupRequest) throws ApiException {
      // verify the required parameter 'accountGroupRequest' is set
      if (accountGroupRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'accountGroupRequest' when calling createAccountGroup");
      }
  }

  private ApiRequest.ApiRequestBuilder createAccountGroupRequestBuilder(AccountGroupRequest accountGroupRequest, List<ExpandAccountGroupOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("POST");

    String path = "/account-groups";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(accountGroupRequest);
    return requestBuilder;
  }
  /**
   * Delete account group
   * Deletes an account group using its ID. This operation requires the following permissions:    * Assign management permissions   * Delete account   * Edit all account groups
   * @param id Identifier for the account group. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAccountGroup(String id) throws ApiException {
    deleteAccountGroupWithHttpInfo(id);
  }

  /**
   * Delete account group
   * Deletes an account group using its ID. This operation requires the following permissions:    * Assign management permissions   * Delete account   * Edit all account groups
   * @param id Identifier for the account group. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> deleteAccountGroupWithHttpInfo(String id) throws ApiException {
    deleteAccountGroupValidateRequest(id);

    var requestBuilder = deleteAccountGroupRequestBuilder(id);

    return apiClient.send(requestBuilder.build(), Void.class);
  }

  private void deleteAccountGroupValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAccountGroup");
      }
  }

  private ApiRequest.ApiRequestBuilder deleteAccountGroupRequestBuilder(String id) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("DELETE");

    String path = "/account-groups/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);


    requestBuilder.header("Accept", List.of("application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Retrieve account group
   * Retrieves detailed information about an account group using its ID.  This operation requires the &#x60;View all account groups settings&#x60; permission.
   * @param id Identifier for the account group. (required)
   * @param expand Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. (optional
   * @return AccountGroupDetail
   * @throws ApiException if fails to make API call
   */
  public AccountGroupDetail getAccountGroup(String id, List<ExpandAccountGroupOptions> expand) throws ApiException {
    ApiResponse<AccountGroupDetail> response = getAccountGroupWithHttpInfo(id, expand);
    return response.getData();
  }

  /**
   * Retrieve account group
   * Retrieves detailed information about an account group using its ID.  This operation requires the &#x60;View all account groups settings&#x60; permission.
   * @param id Identifier for the account group. (required)
   * @param expand Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. (optional
   * @return ApiResponse&lt;AccountGroupDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountGroupDetail> getAccountGroupWithHttpInfo(String id, List<ExpandAccountGroupOptions> expand) throws ApiException {
    getAccountGroupValidateRequest(id);

    var requestBuilder = getAccountGroupRequestBuilder(id, expand);

    return apiClient.send(requestBuilder.build(), AccountGroupDetail.class);
  }

  private void getAccountGroupValidateRequest(String id) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getAccountGroup");
      }
  }

  private ApiRequest.ApiRequestBuilder getAccountGroupRequestBuilder(String id, List<ExpandAccountGroupOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/account-groups/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * List account groups
   * Retrieves a list of account groups available to the current user.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return AccountGroups
   * @throws ApiException if fails to make API call
   */
  public AccountGroups getAccountGroups(String aid) throws ApiException {
    ApiResponse<AccountGroups> response = getAccountGroupsWithHttpInfo(aid);
    return response.getData();
  }

  /**
   * List account groups
   * Retrieves a list of account groups available to the current user.
   * @param aid A unique identifier associated with your account group. You can retrieve your &#x60;AccountGroupId&#x60; from the &#x60;/account-groups&#x60; endpoint. Note that you must be assigned to the target account group. Specifying this parameter without being assigned to the target account group will result in an error response. (optional)
   * @return ApiResponse&lt;AccountGroups&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountGroups> getAccountGroupsWithHttpInfo(String aid) throws ApiException {
    getAccountGroupsValidateRequest();

    var requestBuilder = getAccountGroupsRequestBuilder(aid);

    return apiClient.send(requestBuilder.build(), AccountGroups.class);
  }

  private void getAccountGroupsValidateRequest() throws ApiException {
  }

  private ApiRequest.ApiRequestBuilder getAccountGroupsRequestBuilder(String aid) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("GET");

    String path = "/account-groups";
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("aid", aid));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    return requestBuilder;
  }
  /**
   * Update account group
   * Updates an account group using its ID. You can modify the account group’s name or the list of agents assigned to the account group.
   * @param id Identifier for the account group. (required)
   * @param accountGroupRequest  (required)
   * @param expand Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. (optional
   * @return AccountGroupDetail
   * @throws ApiException if fails to make API call
   */
  public AccountGroupDetail updateAccountGroup(String id, AccountGroupRequest accountGroupRequest, List<ExpandAccountGroupOptions> expand) throws ApiException {
    ApiResponse<AccountGroupDetail> response = updateAccountGroupWithHttpInfo(id, accountGroupRequest, expand);
    return response.getData();
  }

  /**
   * Update account group
   * Updates an account group using its ID. You can modify the account group’s name or the list of agents assigned to the account group.
   * @param id Identifier for the account group. (required)
   * @param accountGroupRequest  (required)
   * @param expand Optional parameter that specifies whether or not account group related resources should be expanded. By default, no expansion takes place if the query parameter is not passed. For example, to expand the &#x60;users&#x60; resource, pass the &#x60;?expand&#x3D;user&#x60; query. (optional
   * @return ApiResponse&lt;AccountGroupDetail&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<AccountGroupDetail> updateAccountGroupWithHttpInfo(String id, AccountGroupRequest accountGroupRequest, List<ExpandAccountGroupOptions> expand) throws ApiException {
    updateAccountGroupValidateRequest(id, accountGroupRequest);

    var requestBuilder = updateAccountGroupRequestBuilder(id, accountGroupRequest, expand);

    return apiClient.send(requestBuilder.build(), AccountGroupDetail.class);
  }

  private void updateAccountGroupValidateRequest(String id, AccountGroupRequest accountGroupRequest) throws ApiException {
      // verify the required parameter 'id' is set
      if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateAccountGroup");
      }
      // verify the required parameter 'accountGroupRequest' is set
      if (accountGroupRequest == null) {
        throw new ApiException(400, "Missing the required parameter 'accountGroupRequest' when calling updateAccountGroup");
      }
  }

  private ApiRequest.ApiRequestBuilder updateAccountGroupRequestBuilder(String id, AccountGroupRequest accountGroupRequest, List<ExpandAccountGroupOptions> expand) throws ApiException {
    ApiRequest.ApiRequestBuilder requestBuilder = ApiRequest.builder()
            .method("PUT");

    String path = "/account-groups/{id}"
        .replace("{id}", urlEncode(id.toString()));
    requestBuilder.path(path);

    List<Pair<String, String>> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(parameterToPairs("csv", "expand", expand));

    if (!localVarQueryParams.isEmpty()) {
      requestBuilder.queryParams(localVarQueryParams);
    }

    requestBuilder.header("Content-Type", List.of("application/json"));
    requestBuilder.header("Accept", List.of("application/hal+json, application/json, application/problem+json"));
    requestBuilder.header("User-Agent", List.of(Config.USER_AGENT));
    requestBuilder.requestBody(accountGroupRequest);
    return requestBuilder;
  }
}
