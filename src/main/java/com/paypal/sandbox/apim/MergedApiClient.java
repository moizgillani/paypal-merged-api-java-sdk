/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim;

import com.paypal.sandbox.apim.authentication.Oauth2Credentials;
import com.paypal.sandbox.apim.authentication.Oauth2Manager;
import com.paypal.sandbox.apim.authentication.Oauth2Model;
import com.paypal.sandbox.apim.authentication.Oauth2PaymentMethodTokensCredentials;
import com.paypal.sandbox.apim.authentication.Oauth2PaymentMethodTokensManager;
import com.paypal.sandbox.apim.authentication.Oauth2PaymentMethodTokensModel;
import com.paypal.sandbox.apim.controllers.AuthorizationsController;
import com.paypal.sandbox.apim.controllers.CapturesController;
import com.paypal.sandbox.apim.controllers.OAuthAuthorizationController;
import com.paypal.sandbox.apim.controllers.OrdersController;
import com.paypal.sandbox.apim.controllers.PaymentTokensController;
import com.paypal.sandbox.apim.controllers.RefundsController;
import com.paypal.sandbox.apim.controllers.SetupTokensController;
import com.paypal.sandbox.apim.http.client.HttpCallback;
import com.paypal.sandbox.apim.http.client.HttpClientConfiguration;
import com.paypal.sandbox.apim.http.client.ReadonlyHttpClientConfiguration;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class MergedApiClient implements Configuration {

    /**
     * Private store for controllers.
     */
    private OrdersController orders;
    private AuthorizationsController authorizations;
    private CapturesController captures;
    private RefundsController refunds;
    private PaymentTokensController paymentTokens;
    private SetupTokensController setupTokens;
    private OAuthAuthorizationController oAuthAuthorization;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "APIMATIC 3.0";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * Oauth2Manager.
     */
    private Oauth2Manager oauth2Manager;

    /**
     * The instance of Oauth2Model.
     */
    private Oauth2Model oauth2Model;

    /**
     * Oauth2PaymentMethodTokensManager.
     */
    private Oauth2PaymentMethodTokensManager oauth2PaymentMethodTokensManager;

    /**
     * The instance of Oauth2PaymentMethodTokensModel.
     */
    private Oauth2PaymentMethodTokensModel oauth2PaymentMethodTokensModel;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications;

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private MergedApiClient(Environment environment, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig, Oauth2Model oauth2Model,
            Oauth2PaymentMethodTokensModel oauth2PaymentMethodTokensModel,
            Map<String, Authentication> authentications, HttpCallback httpCallback) {
        this.environment = environment;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;
        this.authentications = 
                (authentications == null) ? new HashMap<>() : new HashMap<>(authentications);
        this.oauth2Model = oauth2Model;
        this.oauth2PaymentMethodTokensModel = oauth2PaymentMethodTokensModel;

        if (this.authentications.containsKey("Oauth2")) {
            this.oauth2Manager = (Oauth2Manager) this.authentications.get("Oauth2");
        }

        if (!this.authentications.containsKey("Oauth2")
                || !getOauth2Credentials().equals(oauth2Model.getOAuthClientId(),
                        oauth2Model.getOAuthClientSecret(), oauth2Model.getOAuthToken(),
                        oauth2Model.getOAuthScopes())) {
            this.oauth2Manager = new Oauth2Manager(oauth2Model);
            this.authentications.put("Oauth2", oauth2Manager);
        }

        if (this.authentications.containsKey("Oauth2_PaymentMethodTokens")) {
            this.oauth2PaymentMethodTokensManager =
                    (Oauth2PaymentMethodTokensManager) this.authentications.get("Oauth2_PaymentMethodTokens");
        }

        if (!this.authentications.containsKey("Oauth2_PaymentMethodTokens")
                || !getOauth2PaymentMethodTokensCredentials().equals(
                        oauth2PaymentMethodTokensModel.getOAuthClientId(),
                        oauth2PaymentMethodTokensModel.getOAuthClientSecret(),
                        oauth2PaymentMethodTokensModel.getOAuthToken(),
                        oauth2PaymentMethodTokensModel.getOAuthScopes())) {
            this.oauth2PaymentMethodTokensManager = new Oauth2PaymentMethodTokensManager(
                    oauth2PaymentMethodTokensModel);
            this.authentications.put("Oauth2_PaymentMethodTokens", oauth2PaymentMethodTokensManager);
        }

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .compatibilityFactory(compatibilityFactory)
                .authentication(this.authentications)
                .callback(httpCallback)
                .userAgent(userAgent)
                .build();
        this.oauth2Manager.applyGlobalConfiguration(globalConfig);
        this.oauth2PaymentMethodTokensManager.applyGlobalConfiguration(globalConfig);

        orders = new OrdersController(globalConfig);
        authorizations = new AuthorizationsController(globalConfig);
        captures = new CapturesController(globalConfig);
        refunds = new RefundsController(globalConfig);
        paymentTokens = new PaymentTokensController(globalConfig);
        setupTokens = new SetupTokensController(globalConfig);
        oAuthAuthorization = new OAuthAuthorizationController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of OrdersController.
     * @return orders
     */
    public OrdersController getOrdersController() {
        return orders;
    }

    /**
     * Get the instance of AuthorizationsController.
     * @return authorizations
     */
    public AuthorizationsController getAuthorizationsController() {
        return authorizations;
    }

    /**
     * Get the instance of CapturesController.
     * @return captures
     */
    public CapturesController getCapturesController() {
        return captures;
    }

    /**
     * Get the instance of RefundsController.
     * @return refunds
     */
    public RefundsController getRefundsController() {
        return refunds;
    }

    /**
     * Get the instance of PaymentTokensController.
     * @return paymentTokens
     */
    public PaymentTokensController getPaymentTokensController() {
        return paymentTokens;
    }

    /**
     * Get the instance of SetupTokensController.
     * @return setupTokens
     */
    public SetupTokensController getSetupTokensController() {
        return setupTokens;
    }

    /**
     * Get the instance of OAuthAuthorizationController.
     * @return oAuthAuthorization
     */
    public OAuthAuthorizationController getOAuthAuthorizationController() {
        return oAuthAuthorization;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with Oauth2.
     * @return oauth2Credentials
     */
    public Oauth2Credentials getOauth2Credentials() {
        return oauth2Manager;
    }

    /**
     * The auth credential model for Oauth2.
     * @return the instance of Oauth2Model
     */
    public Oauth2Model getOauth2Model() {
        return oauth2Model;
    }
    /**
     * The credentials to use with Oauth2PaymentMethodTokens.
     * @return oauth2PaymentMethodTokensCredentials
     */
    public Oauth2PaymentMethodTokensCredentials getOauth2PaymentMethodTokensCredentials() {
        return oauth2PaymentMethodTokensManager;
    }

    /**
     * The auth credential model for Oauth2PaymentMethodTokens.
     * @return the instance of Oauth2PaymentMethodTokensModel
     */
    public Oauth2PaymentMethodTokensModel getOauth2PaymentMethodTokensModel() {
        return oauth2PaymentMethodTokensModel;
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        Map<String, SimpleEntry<Object, Boolean>> parameters = new HashMap<>();
        StringBuilder baseUrl = new StringBuilder(environmentMapper(environment, server));
        ApiHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://api-m.sandbox.paypal.com";
            }
            if (server.equals(Server.DEFAULT_PAYMENT_METHOD_TOKENS)) {
                return "https://api.sandbox.paypal.com";
            }
        }
        if (environment.equals(Environment.ENVIRONMENT2)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://api-m.paypal.com";
            }
            if (server.equals(Server.DEFAULT_PAYMENT_METHOD_TOKENS)) {
                return "https://api.paypal.com";
            }
        }
        return "https://api-m.sandbox.paypal.com";
    }

    /**
     * Converts this MergedApiClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MergedApiClient [" + "environment=" + environment + ", httpClientConfig="
                + httpClientConfig + ", authentications=" + authentications + "]";
    }

    /**
     * Builds a new {@link MergedApiClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link MergedApiClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.httpClient = getHttpClient();
        builder.oauth2Credentials(getOauth2Model()
                .toBuilder().build());
        builder.oauth2PaymentMethodTokensCredentials(getOauth2PaymentMethodTokensModel()
                .toBuilder().build());
        builder.authentications = authentications;
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(configBldr -> configBldr =
                ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link MergedApiClient}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private HttpClient httpClient;
        private Oauth2Model oauth2Model = new Oauth2Model.Builder("", "").build();
        private Oauth2PaymentMethodTokensModel oauth2PaymentMethodTokensModel =
                new Oauth2PaymentMethodTokensModel.Builder("", "").build();
        private Map<String, Authentication> authentications = null;
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Credentials setter for Oauth2Credentials.
         * @param oauth2Model The instance of Oauth2Model.
         * @return The current instance of builder.
         */
        public Builder oauth2Credentials(Oauth2Model oauth2Model) {
            this.oauth2Model = oauth2Model;
            return this;
        }

        /**
         * Credentials setter for Oauth2PaymentMethodTokensCredentials.
         * @param oauth2PaymentMethodTokensModel The instance of Oauth2PaymentMethodTokensModel.
         * @return The current instance of builder.
         */
        public Builder oauth2PaymentMethodTokensCredentials(
                Oauth2PaymentMethodTokensModel oauth2PaymentMethodTokensModel) {
            this.oauth2PaymentMethodTokensModel = oauth2PaymentMethodTokensModel;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Builds a new MergedApiClient object using the set fields.
         * @return MergedApiClient
         */
        public MergedApiClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new MergedApiClient(environment, httpClient, httpClientConfig, oauth2Model,
                    oauth2PaymentMethodTokensModel, authentications, httpCallback);
        }
    }
}