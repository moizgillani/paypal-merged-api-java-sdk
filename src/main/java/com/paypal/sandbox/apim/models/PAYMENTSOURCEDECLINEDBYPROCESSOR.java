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
 * This is a model class for PAYMENTSOURCEDECLINEDBYPROCESSOR type.
 */
public class PAYMENTSOURCEDECLINEDBYPROCESSOR {
    private PaymentSourceDeclinedByProcessorIssueEnum issue;
    private PaymentSourceDeclinedByProcessorDescriptionEnum description;

    /**
     * Default constructor.
     */
    public PAYMENTSOURCEDECLINEDBYPROCESSOR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PaymentSourceDeclinedByProcessorIssueEnum value for issue.
     * @param  description  PaymentSourceDeclinedByProcessorDescriptionEnum value for description.
     */
    public PAYMENTSOURCEDECLINEDBYPROCESSOR(
            PaymentSourceDeclinedByProcessorIssueEnum issue,
            PaymentSourceDeclinedByProcessorDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PaymentSourceDeclinedByProcessorIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSourceDeclinedByProcessorIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PaymentSourceDeclinedByProcessorIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PaymentSourceDeclinedByProcessorIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PaymentSourceDeclinedByProcessorDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSourceDeclinedByProcessorDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PaymentSourceDeclinedByProcessorDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PaymentSourceDeclinedByProcessorDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYMENTSOURCEDECLINEDBYPROCESSOR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYMENTSOURCEDECLINEDBYPROCESSOR [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link PAYMENTSOURCEDECLINEDBYPROCESSOR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYMENTSOURCEDECLINEDBYPROCESSOR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYMENTSOURCEDECLINEDBYPROCESSOR}.
     */
    public static class Builder {
        private PaymentSourceDeclinedByProcessorIssueEnum issue;
        private PaymentSourceDeclinedByProcessorDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PaymentSourceDeclinedByProcessorIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PaymentSourceDeclinedByProcessorIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PaymentSourceDeclinedByProcessorDescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(PaymentSourceDeclinedByProcessorDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYMENTSOURCEDECLINEDBYPROCESSOR} object using the set fields.
         * @return {@link PAYMENTSOURCEDECLINEDBYPROCESSOR}
         */
        public PAYMENTSOURCEDECLINEDBYPROCESSOR build() {
            return new PAYMENTSOURCEDECLINEDBYPROCESSOR(issue, description);
        }
    }
}