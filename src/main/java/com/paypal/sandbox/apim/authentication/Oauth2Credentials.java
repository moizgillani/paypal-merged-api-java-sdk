/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.authentication;

import com.paypal.sandbox.apim.exceptions.ApiException;
import com.paypal.sandbox.apim.models.OAuthScopeOauth2Enum;
import com.paypal.sandbox.apim.models.OAuthToken;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Interface for Client Credentials OAuth 2.
 */
public interface Oauth2Credentials {
    /**
     * String value for oAuthClientId.
     * @return oAuthClientId
     */
    String getOAuthClientId();

    /**
     * String value for oAuthClientSecret.
     * @return oAuthClientSecret
     */
    String getOAuthClientSecret();

    /**
     * OAuthToken value for oAuthToken.
     * @return oAuthToken
     */
    OAuthToken getOAuthToken();

    /**
     * List of OAuthScopeOauth2Enum value for oAuthScopes.
     * @return oAuthScopes
     */
    List<OAuthScopeOauth2Enum> getOAuthScopes();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param oAuthClientId String value for credentials.
     * @param oAuthClientSecret String value for credentials.
     * @param oAuthToken OAuthToken value for credentials.
     * @param oAuthScopes List of OAuthScopeOauth2Enum value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String oAuthClientId, String oAuthClientSecret, OAuthToken oAuthToken,
            List<OAuthScopeOauth2Enum> oAuthScopes);

    /**
     * Fetch the OAuth token asynchronously.
     * @param additionalParameters Additional parameters to send during authorization.
     */
    CompletableFuture<OAuthToken> fetchTokenAsync(final Map<String, Object> additionalParameters);

    /**
     * Fetch the OAuth token asynchronously.
     */
    CompletableFuture<OAuthToken> fetchTokenAsync();

    /**
     * Fetch the OAuth token.
     * @param additionalParameters Additional parameters to send during authorization.
     */
    OAuthToken fetchToken(Map<String, Object> additionalParameters) throws ApiException, IOException;

    /**
     * Fetch the OAuth token.
     */
    OAuthToken fetchToken() throws ApiException, IOException;

     /**
     * Has the OAuth token expired?.
     * @return True if expired
     */
    boolean isTokenExpired();

}
