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
 * This is a model class for PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE type.
 */
public class PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE {
    private PayerAccountLockedOrClosed2IssueEnum issue;
    private PayerAccountLockedOrClosed2DescriptionEnum description;

    /**
     * Default constructor.
     */
    public PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PayerAccountLockedOrClosed2IssueEnum value for issue.
     * @param  description  PayerAccountLockedOrClosed2DescriptionEnum value for description.
     */
    public PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE(
            PayerAccountLockedOrClosed2IssueEnum issue,
            PayerAccountLockedOrClosed2DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PayerAccountLockedOrClosed2IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayerAccountLockedOrClosed2IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PayerAccountLockedOrClosed2IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PayerAccountLockedOrClosed2IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PayerAccountLockedOrClosed2DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayerAccountLockedOrClosed2DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PayerAccountLockedOrClosed2DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PayerAccountLockedOrClosed2DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE}.
     */
    public static class Builder {
        private PayerAccountLockedOrClosed2IssueEnum issue;
        private PayerAccountLockedOrClosed2DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PayerAccountLockedOrClosed2IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PayerAccountLockedOrClosed2IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PayerAccountLockedOrClosed2DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PayerAccountLockedOrClosed2DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE} object using the set fields.
         * @return {@link PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE}
         */
        public PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE build() {
            return new PAYERACCOUNTLOCKEDORCLOSEDERRORRESPONSE(issue, description);
        }
    }
}
