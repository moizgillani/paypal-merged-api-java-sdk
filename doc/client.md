
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |
| `oauth2Credentials` | [`Oauth2Credentials`]($a/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |
| `oauth2PaymentMethodTokensCredentials` | [`Oauth2PaymentMethodTokensCredentials`]($a/oauth-2-client-credentials-grant-1.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
MergedApiClient client = new MergedApiClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .oauth2Credentials(new Oauth2Model.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oAuthScopes(Arrays.asList(
                OAuthScopeOauth2Enum.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT,
                OAuthScopeOauth2Enum.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT_REFERENCE_TRANSACTION
            ))
        .build())
    .oauth2PaymentMethodTokensCredentials(new Oauth2PaymentMethodTokensModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oAuthScopes(Arrays.asList(
                OAuthScopeOauth2PaymentMethodTokensEnum.HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_PAYMENT_TOKENS_READWRITE,
                OAuthScopeOauth2PaymentMethodTokensEnum.HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_PAYMENT_TOKENS_READ
            ))
        .build())
    .environment(Environment.PRODUCTION)
    .build();
```

## Merged ApiClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getOrdersController()` | Provides access to Orders controller. | `OrdersController` |
| `getAuthorizationsController()` | Provides access to Authorizations controller. | `AuthorizationsController` |
| `getCapturesController()` | Provides access to Captures controller. | `CapturesController` |
| `getRefundsController()` | Provides access to Refunds controller. | `RefundsController` |
| `getPaymentTokensController()` | Provides access to PaymentTokens controller. | `PaymentTokensController` |
| `getSetupTokensController()` | Provides access to SetupTokens controller. | `SetupTokensController` |
| `getOAuthAuthorizationController()` | Provides access to OAuthAuthorization controller. | `OAuthAuthorizationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getOauth2Credentials()` | The credentials to use with Oauth2. | [`Oauth2Credentials`]($a/oauth-2-client-credentials-grant.md) |
| `getOauth2PaymentMethodTokensCredentials()` | The credentials to use with Oauth2PaymentMethodTokens. | [`Oauth2PaymentMethodTokensCredentials`]($a/oauth-2-client-credentials-grant-1.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

