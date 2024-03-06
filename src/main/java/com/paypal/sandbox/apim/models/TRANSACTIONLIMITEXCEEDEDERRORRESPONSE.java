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
 * This is a model class for TRANSACTIONLIMITEXCEEDEDERRORRESPONSE type.
 */
public class TRANSACTIONLIMITEXCEEDEDERRORRESPONSE {
    private TransactionLimitExceeded2IssueEnum issue;
    private TransactionLimitExceeded2DescriptionEnum description;

    /**
     * Default constructor.
     */
    public TRANSACTIONLIMITEXCEEDEDERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  TransactionLimitExceeded2IssueEnum value for issue.
     * @param  description  TransactionLimitExceeded2DescriptionEnum value for description.
     */
    public TRANSACTIONLIMITEXCEEDEDERRORRESPONSE(
            TransactionLimitExceeded2IssueEnum issue,
            TransactionLimitExceeded2DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the TransactionLimitExceeded2IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionLimitExceeded2IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for TransactionLimitExceeded2IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(TransactionLimitExceeded2IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the TransactionLimitExceeded2DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionLimitExceeded2DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for TransactionLimitExceeded2DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(TransactionLimitExceeded2DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this TRANSACTIONLIMITEXCEEDEDERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TRANSACTIONLIMITEXCEEDEDERRORRESPONSE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link TRANSACTIONLIMITEXCEEDEDERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TRANSACTIONLIMITEXCEEDEDERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link TRANSACTIONLIMITEXCEEDEDERRORRESPONSE}.
     */
    public static class Builder {
        private TransactionLimitExceeded2IssueEnum issue;
        private TransactionLimitExceeded2DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  TransactionLimitExceeded2IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(TransactionLimitExceeded2IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  TransactionLimitExceeded2DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(TransactionLimitExceeded2DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link TRANSACTIONLIMITEXCEEDEDERRORRESPONSE} object using the set fields.
         * @return {@link TRANSACTIONLIMITEXCEEDEDERRORRESPONSE}
         */
        public TRANSACTIONLIMITEXCEEDEDERRORRESPONSE build() {
            return new TRANSACTIONLIMITEXCEEDEDERRORRESPONSE(issue, description);
        }
    }
}