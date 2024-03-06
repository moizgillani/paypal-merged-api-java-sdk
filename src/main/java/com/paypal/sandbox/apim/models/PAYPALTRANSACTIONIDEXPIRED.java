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
 * This is a model class for PAYPALTRANSACTIONIDEXPIRED type.
 */
public class PAYPALTRANSACTIONIDEXPIRED {
    private PaypalTransactionIdExpiredIssueEnum issue;
    private PaypalTransactionIdExpiredDescriptionEnum description;

    /**
     * Default constructor.
     */
    public PAYPALTRANSACTIONIDEXPIRED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PaypalTransactionIdExpiredIssueEnum value for issue.
     * @param  description  PaypalTransactionIdExpiredDescriptionEnum value for description.
     */
    public PAYPALTRANSACTIONIDEXPIRED(
            PaypalTransactionIdExpiredIssueEnum issue,
            PaypalTransactionIdExpiredDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PaypalTransactionIdExpiredIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalTransactionIdExpiredIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PaypalTransactionIdExpiredIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PaypalTransactionIdExpiredIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PaypalTransactionIdExpiredDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalTransactionIdExpiredDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PaypalTransactionIdExpiredDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PaypalTransactionIdExpiredDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYPALTRANSACTIONIDEXPIRED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYPALTRANSACTIONIDEXPIRED [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link PAYPALTRANSACTIONIDEXPIRED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYPALTRANSACTIONIDEXPIRED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYPALTRANSACTIONIDEXPIRED}.
     */
    public static class Builder {
        private PaypalTransactionIdExpiredIssueEnum issue;
        private PaypalTransactionIdExpiredDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PaypalTransactionIdExpiredIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PaypalTransactionIdExpiredIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PaypalTransactionIdExpiredDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PaypalTransactionIdExpiredDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYPALTRANSACTIONIDEXPIRED} object using the set fields.
         * @return {@link PAYPALTRANSACTIONIDEXPIRED}
         */
        public PAYPALTRANSACTIONIDEXPIRED build() {
            return new PAYPALTRANSACTIONIDEXPIRED(issue, description);
        }
    }
}