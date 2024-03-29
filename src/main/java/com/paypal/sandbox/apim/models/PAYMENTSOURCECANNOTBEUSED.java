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
 * This is a model class for PAYMENTSOURCECANNOTBEUSED type.
 */
public class PAYMENTSOURCECANNOTBEUSED {
    private PaymentSourceCannotBeUsedIssueEnum issue;
    private PaymentSourceCannotBeUsedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public PAYMENTSOURCECANNOTBEUSED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PaymentSourceCannotBeUsedIssueEnum value for issue.
     * @param  description  PaymentSourceCannotBeUsedDescriptionEnum value for description.
     */
    public PAYMENTSOURCECANNOTBEUSED(
            PaymentSourceCannotBeUsedIssueEnum issue,
            PaymentSourceCannotBeUsedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PaymentSourceCannotBeUsedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSourceCannotBeUsedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PaymentSourceCannotBeUsedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PaymentSourceCannotBeUsedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PaymentSourceCannotBeUsedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSourceCannotBeUsedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PaymentSourceCannotBeUsedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PaymentSourceCannotBeUsedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYMENTSOURCECANNOTBEUSED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYMENTSOURCECANNOTBEUSED [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link PAYMENTSOURCECANNOTBEUSED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYMENTSOURCECANNOTBEUSED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYMENTSOURCECANNOTBEUSED}.
     */
    public static class Builder {
        private PaymentSourceCannotBeUsedIssueEnum issue;
        private PaymentSourceCannotBeUsedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PaymentSourceCannotBeUsedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PaymentSourceCannotBeUsedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PaymentSourceCannotBeUsedDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PaymentSourceCannotBeUsedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYMENTSOURCECANNOTBEUSED} object using the set fields.
         * @return {@link PAYMENTSOURCECANNOTBEUSED}
         */
        public PAYMENTSOURCECANNOTBEUSED build() {
            return new PAYMENTSOURCECANNOTBEUSED(issue, description);
        }
    }
}
