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
 * This is a model class for GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR type.
 */
public class GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR {
    private GooglePayGatewayMerchantIdMismatch1IssueEnum issue;
    private InvalidGooglePayMerchantIdMismatchEnum description;

    /**
     * Default constructor.
     */
    public GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  GooglePayGatewayMerchantIdMismatch1IssueEnum value for issue.
     * @param  description  InvalidGooglePayMerchantIdMismatchEnum value for description.
     */
    public GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR(
            GooglePayGatewayMerchantIdMismatch1IssueEnum issue,
            InvalidGooglePayMerchantIdMismatchEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the GooglePayGatewayMerchantIdMismatch1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GooglePayGatewayMerchantIdMismatch1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for GooglePayGatewayMerchantIdMismatch1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(GooglePayGatewayMerchantIdMismatch1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidGooglePayMerchantIdMismatchEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidGooglePayMerchantIdMismatchEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidGooglePayMerchantIdMismatchEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidGooglePayMerchantIdMismatchEnum description) {
        this.description = description;
    }

    /**
     * Converts this GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR}.
     */
    public static class Builder {
        private GooglePayGatewayMerchantIdMismatch1IssueEnum issue;
        private InvalidGooglePayMerchantIdMismatchEnum description;



        /**
         * Setter for issue.
         * @param  issue  GooglePayGatewayMerchantIdMismatch1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(GooglePayGatewayMerchantIdMismatch1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidGooglePayMerchantIdMismatchEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidGooglePayMerchantIdMismatchEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR} object using the set fields.
         * @return {@link GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR}
         */
        public GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR build() {
            return new GOOGLEPAYGATEWAYMERCHANTIDMISMATCHERROR(issue, description);
        }
    }
}
