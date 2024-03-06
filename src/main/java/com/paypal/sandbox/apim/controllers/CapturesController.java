/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.paypal.sandbox.apim.ApiHelper;
import com.paypal.sandbox.apim.Server;
import com.paypal.sandbox.apim.exceptions.ApiException;
import com.paypal.sandbox.apim.exceptions.CapturesGetResponse403JsonException;
import com.paypal.sandbox.apim.exceptions.CapturesGetResponse404JsonException;
import com.paypal.sandbox.apim.exceptions.CapturesRefundResponse400JsonException;
import com.paypal.sandbox.apim.exceptions.CapturesRefundResponse401JsonException;
import com.paypal.sandbox.apim.exceptions.CapturesRefundResponse403JsonException;
import com.paypal.sandbox.apim.exceptions.CapturesRefundResponse404JsonException;
import com.paypal.sandbox.apim.exceptions.CapturesRefundResponse409JsonException;
import com.paypal.sandbox.apim.exceptions.CapturesRefundResponse422JsonException;
import com.paypal.sandbox.apim.exceptions.M401ErrorErrorException;
import com.paypal.sandbox.apim.http.request.HttpMethod;
import com.paypal.sandbox.apim.models.AdditionalCapture;
import com.paypal.sandbox.apim.models.RefundPayments;
import com.paypal.sandbox.apim.models.RefundRequest;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class CapturesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public CapturesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Shows details for a captured payment, by ID.
     * @param  captureId  Required parameter: The PayPal-generated ID for the captured payment to
     *         refund.
     * @return    Returns the AdditionalCapture response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AdditionalCapture capturesGet(
            final String captureId) throws ApiException, IOException {
        return prepareCapturesGetRequest(captureId).execute();
    }

    /**
     * Shows details for a captured payment, by ID.
     * @param  captureId  Required parameter: The PayPal-generated ID for the captured payment to
     *         refund.
     * @return    Returns the AdditionalCapture response from the API call
     */
    public CompletableFuture<AdditionalCapture> capturesGetAsync(
            final String captureId) {
        try { 
            return prepareCapturesGetRequest(captureId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for capturesGet.
     */
    private ApiCall<AdditionalCapture, ApiException> prepareCapturesGetRequest(
            final String captureId) throws IOException {
        return new ApiCall.Builder<AdditionalCapture, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v2/payments/captures/{capture_id}")
                        .templateParam(param -> param.key("capture_id").value(captureId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AdditionalCapture.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication failed due to missing authorization header, or invalid authentication credentials.",
                                (reason, context) -> new M401ErrorErrorException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("The request failed because the caller has insufficient permissions.",
                                (reason, context) -> new CapturesGetResponse403JsonException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The request failed because the resource does not exist.",
                                (reason, context) -> new CapturesGetResponse404JsonException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("The request failed because an internal server error occurred.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("The default response.",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Refunds a captured payment, by ID. For a full refund, include an empty payload in the JSON
     * request body. For a partial refund, include an &lt;code&gt;amount&lt;/code&gt; object in the JSON request
     * body.
     * @param  captureId  Required parameter: The PayPal-generated ID for the captured payment to
     *         refund.
     * @param  payPalRequestId  Required parameter: The server stores keys for 45 days.
     * @param  prefer  Optional parameter: The preferred server response upon successful completion
     *         of the request. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return=minimal&lt;/code&gt;.
     *         The server returns a minimal response to optimize communication between the API
     *         caller and the server. A minimal response includes the &lt;code&gt;id&lt;/code&gt;,
     *         &lt;code&gt;status&lt;/code&gt; and HATEOAS
     *         links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return=representation&lt;/code&gt;. The server
     *         returns a complete resource representation, including the current state of the
     *         resource.&lt;/li&gt;&lt;/ul&gt;
     * @param  payPalAuthAssertion  Optional parameter: An API-caller-provided JSON Web Token (JWT)
     *         assertion that identifies the merchant. For details, see
     *         [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion).&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt;For
     *         three party transactions in which a partner is managing the API calls on behalf of a
     *         merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion
     *         header or an access token with target_subject.&lt;/blockquote&gt;
     * @param  body  Optional parameter: Example:
     * @return    Returns the RefundPayments response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public RefundPayments capturesRefund(
            final String captureId,
            final String payPalRequestId,
            final String prefer,
            final String payPalAuthAssertion,
            final RefundRequest body) throws ApiException, IOException {
        return prepareCapturesRefundRequest(captureId, payPalRequestId, prefer, payPalAuthAssertion,
                body).execute();
    }

    /**
     * Refunds a captured payment, by ID. For a full refund, include an empty payload in the JSON
     * request body. For a partial refund, include an &lt;code&gt;amount&lt;/code&gt; object in the JSON request
     * body.
     * @param  captureId  Required parameter: The PayPal-generated ID for the captured payment to
     *         refund.
     * @param  payPalRequestId  Required parameter: The server stores keys for 45 days.
     * @param  prefer  Optional parameter: The preferred server response upon successful completion
     *         of the request. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return=minimal&lt;/code&gt;.
     *         The server returns a minimal response to optimize communication between the API
     *         caller and the server. A minimal response includes the &lt;code&gt;id&lt;/code&gt;,
     *         &lt;code&gt;status&lt;/code&gt; and HATEOAS
     *         links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return=representation&lt;/code&gt;. The server
     *         returns a complete resource representation, including the current state of the
     *         resource.&lt;/li&gt;&lt;/ul&gt;
     * @param  payPalAuthAssertion  Optional parameter: An API-caller-provided JSON Web Token (JWT)
     *         assertion that identifies the merchant. For details, see
     *         [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion).&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt;For
     *         three party transactions in which a partner is managing the API calls on behalf of a
     *         merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion
     *         header or an access token with target_subject.&lt;/blockquote&gt;
     * @param  body  Optional parameter: Example:
     * @return    Returns the RefundPayments response from the API call
     */
    public CompletableFuture<RefundPayments> capturesRefundAsync(
            final String captureId,
            final String payPalRequestId,
            final String prefer,
            final String payPalAuthAssertion,
            final RefundRequest body) {
        try { 
            return prepareCapturesRefundRequest(captureId, payPalRequestId, prefer, payPalAuthAssertion,
            body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for capturesRefund.
     */
    private ApiCall<RefundPayments, ApiException> prepareCapturesRefundRequest(
            final String captureId,
            final String payPalRequestId,
            final String prefer,
            final String payPalAuthAssertion,
            final RefundRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<RefundPayments, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v2/payments/captures/{capture_id}/refund")
                        .bodyParam(param -> param.value(body).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("capture_id").value(captureId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("PayPal-Request-Id")
                                .value(payPalRequestId).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("Prefer")
                                .value((prefer != null) ? prefer : "return=minimal").isRequired(false))
                        .headerParam(param -> param.key("PayPal-Auth-Assertion")
                                .value(payPalAuthAssertion).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, RefundPayments.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("The request failed because it is not well-formed or is syntactically incorrect or violates schema.",
                                (reason, context) -> new CapturesRefundResponse400JsonException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication failed due to missing authorization header, or invalid authentication credentials.",
                                (reason, context) -> new CapturesRefundResponse401JsonException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("The request failed because the caller has insufficient permissions.",
                                (reason, context) -> new CapturesRefundResponse403JsonException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The request failed because the resource does not exist.",
                                (reason, context) -> new CapturesRefundResponse404JsonException(reason, context)))
                        .localErrorCase("409",
                                 ErrorCase.setReason("The request failed because a previous call for the given resource is in progress.",
                                (reason, context) -> new CapturesRefundResponse409JsonException(reason, context)))
                        .localErrorCase("422",
                                 ErrorCase.setReason("The request failed because it either is semantically incorrect or failed business validation.",
                                (reason, context) -> new CapturesRefundResponse422JsonException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("The request failed because an internal server error occurred.",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("The default response.",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}