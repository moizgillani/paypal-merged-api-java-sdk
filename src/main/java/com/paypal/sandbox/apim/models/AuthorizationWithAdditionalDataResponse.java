/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AuthorizationWithAdditionalDataResponse type.
 */
public class AuthorizationWithAdditionalDataResponse {
    private ProcessorResponse processorResponse;

    /**
     * Default constructor.
     */
    public AuthorizationWithAdditionalDataResponse() {
    }

    /**
     * Initialization constructor.
     * @param  processorResponse  ProcessorResponse value for processorResponse.
     */
    public AuthorizationWithAdditionalDataResponse(
            ProcessorResponse processorResponse) {
        this.processorResponse = processorResponse;
    }

    /**
     * Getter for ProcessorResponse.
     * The processor response for card transactions.
     * @return Returns the ProcessorResponse
     */
    @JsonGetter("processor_response")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProcessorResponse getProcessorResponse() {
        return processorResponse;
    }

    /**
     * Setter for ProcessorResponse.
     * The processor response for card transactions.
     * @param processorResponse Value for ProcessorResponse
     */
    @JsonSetter("processor_response")
    public void setProcessorResponse(ProcessorResponse processorResponse) {
        this.processorResponse = processorResponse;
    }

    /**
     * Converts this AuthorizationWithAdditionalDataResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuthorizationWithAdditionalDataResponse [" + "processorResponse="
                + processorResponse + "]";
    }

    /**
     * Builds a new {@link AuthorizationWithAdditionalDataResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuthorizationWithAdditionalDataResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .processorResponse(getProcessorResponse());
        return builder;
    }

    /**
     * Class to build instances of {@link AuthorizationWithAdditionalDataResponse}.
     */
    public static class Builder {
        private ProcessorResponse processorResponse;



        /**
         * Setter for processorResponse.
         * @param  processorResponse  ProcessorResponse value for processorResponse.
         * @return Builder
         */
        public Builder processorResponse(ProcessorResponse processorResponse) {
            this.processorResponse = processorResponse;
            return this;
        }

        /**
         * Builds a new {@link AuthorizationWithAdditionalDataResponse} object using the set fields.
         * @return {@link AuthorizationWithAdditionalDataResponse}
         */
        public AuthorizationWithAdditionalDataResponse build() {
            return new AuthorizationWithAdditionalDataResponse(processorResponse);
        }
    }
}
