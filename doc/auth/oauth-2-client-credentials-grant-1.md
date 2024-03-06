
# OAuth 2 Client Credentials Grant



Documentation for accessing and setting credentials for Oauth2_PaymentMethodTokens.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| OAuthClientId | `String` | OAuth 2 Client ID | `oAuthClientId` | `getOAuthClientId()` |
| OAuthClientSecret | `String` | OAuth 2 Client Secret | `oAuthClientSecret` | `getOAuthClientSecret()` |
| OAuthToken | `OAuthToken` | Object for storing information about the OAuth token | `oAuthToken` | `getOAuthToken()` |
| OAuthScopes | `List<OAuthScopeOauth2PaymentMethodTokensEnum>` | List of scopes that apply to the OAuth token | `oAuthScopes` | `getOAuthScopes()` |



**Note:** Auth credentials can be set using `oauth2PaymentMethodTokensCredentials` in the client builder and accessed through `getOauth2PaymentMethodTokensCredentials` method in the client instance.

## Usage Example

### Client Initialization

You must initialize the client with *OAuth 2.0 Client Credentials Grant* credentials as shown in the following code snippet.

```java
MergedApiClient client = new MergedApiClient.Builder()
    .oauth2PaymentMethodTokensCredentials(new Oauth2PaymentMethodTokensModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oAuthScopes(Arrays.asList(
                OAuthScopeOauth2PaymentMethodTokensEnum.HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_PAYMENT_TOKENS_READWRITE,
                OAuthScopeOauth2PaymentMethodTokensEnum.HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_PAYMENT_TOKENS_READ
            ))
        .build())
    .build();
```



Your application must obtain user authorization before it can execute an endpoint call in case this SDK chooses to use *OAuth 2.0 Client Credentials Grant*. This authorization includes the following steps.

The `fetchToken()` method will exchange the OAuth client credentials for an *access token*. The access token is an object containing information for authorizing client requests and refreshing the token itself.

You must have initialized the client with scopes for which you need permission to access.

```java
try {
    OAuthToken token = client.getOauth2PaymentMethodTokensCredentials().fetchToken();
    // re-instantiate the client with oauth token
    client = client.newBuilder()
            .oauth2PaymentMethodTokensCredentials(client.getOauth2PaymentMethodTokensModel().toBuilder()
                    .oAuthToken(token)
                    .build())
            .build();
} catch (Throwable e) {
    // TODO Handle exception
}
```

The client can now make authorized endpoint calls.

### Scopes

Scopes enable your application to only request access to the resources it needs while enabling users to control the amount of access they grant to your application. Available scopes are defined in the [`OAuthScopeOauth2PaymentMethodTokensEnum`](../../doc/models/o-auth-scope-oauth-2-payment-method-tokens-enum.md) enumeration.

| Scope Name | Description |
|  --- | --- |
| `HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_PAYMENT_TOKENS_READWRITE` | Manage payment instruments |
| `HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_PAYMENT_TOKENS_READ` | Permission to only read from vault |
| `HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_CUSTOMERS_READ` | Permission to read customer information. |
| `HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_CUSTOMERS_READWRITE` | Permission to create/update customer information. |

### Storing an access token for reuse

It is recommended that you store the access token for reuse.

```java
// store token
storeAccessToken(client.getOauth2PaymentMethodTokensCredentials().getOAuthToken());
```

### Creating a client from a stored token

To authorize a client from a stored access token, just set the access token in Configuration along with the other configuration parameters before creating the client:

```java
// load token later...
OAuthToken token = loadAccessToken();

// re-instantiate the client with oauth token
client = client.newBuilder()
        .oauth2PaymentMethodTokensCredentials(client.getOauth2PaymentMethodTokensModel().toBuilder()
                .oAuthToken(token)
                .build())
        .build();
```

### Complete example



```java
package com.example;

import com.paypal.sandbox.apim.models.OAuthScopeEnum;
import java.util.Arrays;

public class Main {
    public Main() {
        MergedApiClient client = new MergedApiClient.Builder()
            .oauth2PaymentMethodTokensCredentials(new Oauth2PaymentMethodTokensModel.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .oAuthScopes(Arrays.asList(
                        OAuthScopeOauth2PaymentMethodTokensEnum.HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_PAYMENT_TOKENS_READWRITE,
                        OAuthScopeOauth2PaymentMethodTokensEnum.HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_PAYMENT_TOKENS_READ
                    ))
                .build())
            .build();


        try {
            OAuthToken token = client.getOauth2PaymentMethodTokensCredentials().fetchToken();
            // re-instantiate the client with oauth token
            client = client.newBuilder()
                    .oauth2PaymentMethodTokensCredentials(client.getOauth2PaymentMethodTokensModel().toBuilder()
                            .oAuthToken(token)
                            .build())
                    .build();
        } catch (Throwable e) {
            // TODO Handle exception
        }

        // the client is now authorized; you can use client to make endpoint calls
    }
}
```


