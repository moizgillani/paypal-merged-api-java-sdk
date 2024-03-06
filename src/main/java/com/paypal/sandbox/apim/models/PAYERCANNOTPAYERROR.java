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
 * This is a model class for PAYERCANNOTPAYERROR type.
 */
public class PAYERCANNOTPAYERROR {
    private PayerCannotPay1IssueEnum issue;
    private PayerCannotPay1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public PAYERCANNOTPAYERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PayerCannotPay1IssueEnum value for issue.
     * @param  description  PayerCannotPay1DescriptionEnum value for description.
     */
    public PAYERCANNOTPAYERROR(
            PayerCannotPay1IssueEnum issue,
            PayerCannotPay1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PayerCannotPay1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayerCannotPay1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PayerCannotPay1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PayerCannotPay1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PayerCannotPay1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayerCannotPay1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PayerCannotPay1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PayerCannotPay1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYERCANNOTPAYERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYERCANNOTPAYERROR [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link PAYERCANNOTPAYERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYERCANNOTPAYERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYERCANNOTPAYERROR}.
     */
    public static class Builder {
        private PayerCannotPay1IssueEnum issue;
        private PayerCannotPay1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PayerCannotPay1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PayerCannotPay1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PayerCannotPay1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PayerCannotPay1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYERCANNOTPAYERROR} object using the set fields.
         * @return {@link PAYERCANNOTPAYERROR}
         */
        public PAYERCANNOTPAYERROR build() {
            return new PAYERCANNOTPAYERROR(issue, description);
        }
    }
}
