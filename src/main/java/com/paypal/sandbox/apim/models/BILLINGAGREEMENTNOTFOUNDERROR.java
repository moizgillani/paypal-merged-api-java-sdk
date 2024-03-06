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
 * This is a model class for BILLINGAGREEMENTNOTFOUNDERROR type.
 */
public class BILLINGAGREEMENTNOTFOUNDERROR {
    private BillingAgreementNotFound1IssueEnum issue;
    private BillingAgreementNotFound1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public BILLINGAGREEMENTNOTFOUNDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  BillingAgreementNotFound1IssueEnum value for issue.
     * @param  description  BillingAgreementNotFound1DescriptionEnum value for description.
     */
    public BILLINGAGREEMENTNOTFOUNDERROR(
            BillingAgreementNotFound1IssueEnum issue,
            BillingAgreementNotFound1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the BillingAgreementNotFound1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingAgreementNotFound1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for BillingAgreementNotFound1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(BillingAgreementNotFound1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the BillingAgreementNotFound1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingAgreementNotFound1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for BillingAgreementNotFound1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(BillingAgreementNotFound1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this BILLINGAGREEMENTNOTFOUNDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BILLINGAGREEMENTNOTFOUNDERROR [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link BILLINGAGREEMENTNOTFOUNDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BILLINGAGREEMENTNOTFOUNDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link BILLINGAGREEMENTNOTFOUNDERROR}.
     */
    public static class Builder {
        private BillingAgreementNotFound1IssueEnum issue;
        private BillingAgreementNotFound1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  BillingAgreementNotFound1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(BillingAgreementNotFound1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  BillingAgreementNotFound1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(BillingAgreementNotFound1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link BILLINGAGREEMENTNOTFOUNDERROR} object using the set fields.
         * @return {@link BILLINGAGREEMENTNOTFOUNDERROR}
         */
        public BILLINGAGREEMENTNOTFOUNDERROR build() {
            return new BILLINGAGREEMENTNOTFOUNDERROR(issue, description);
        }
    }
}
