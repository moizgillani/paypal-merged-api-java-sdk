/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.controllers;

import com.paypal.sandbox.apim.ApiHelper;
import com.paypal.sandbox.apim.Server;
import com.paypal.sandbox.apim.exceptions.ApiException;
import com.paypal.sandbox.apim.exceptions.RefundsGetResponse401JsonException;
import com.paypal.sandbox.apim.exceptions.RefundsGetResponse403JsonException;
import com.paypal.sandbox.apim.exceptions.RefundsGetResponse404JsonException;
import com.paypal.sandbox.apim.http.request.HttpMethod;
import com.paypal.sandbox.apim.models.RefundPayments;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class RefundsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public RefundsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Shows details for a refund, by ID.
     * @param  refundId  Required parameter: The PayPal-generated ID for the refund for which to
     *         show details.
     * @return    Returns the RefundPayments response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public RefundPayments refundsGet(
            final String refundId) throws ApiException, IOException {
        return prepareRefundsGetRequest(refundId).execute();
    }

    /**
     * Shows details for a refund, by ID.
     * @param  refundId  Required parameter: The PayPal-generated ID for the refund for which to
     *         show details.
     * @return    Returns the RefundPayments response from the API call
     */
    public CompletableFuture<RefundPayments> refundsGetAsync(
            final String refundId) {
        try { 
            return prepareRefundsGetRequest(refundId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for refundsGet.
     */
    private ApiCall<RefundPayments, ApiException> prepareRefundsGetRequest(
            final String refundId) throws IOException {
        return new ApiCall.Builder<RefundPayments, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/v2/payments/refunds/{refund_id}")
                        .templateParam(param -> param.key("refund_id").value(refundId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("Oauth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, RefundPayments.class))
                        .nullify404(false)
                        .localErrorCase("401",
                                 ErrorCase.setReason("Authentication failed due to missing authorization header, or invalid authentication credentials.",
                                (reason, context) -> new RefundsGetResponse401JsonException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("The request failed because the caller has insufficient permissions.",
                                (reason, context) -> new RefundsGetResponse403JsonException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("The request failed because the resource does not exist.",
                                (reason, context) -> new RefundsGetResponse404JsonException(reason, context)))
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