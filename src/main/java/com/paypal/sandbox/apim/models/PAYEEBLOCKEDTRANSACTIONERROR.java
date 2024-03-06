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
 * This is a model class for PAYEEBLOCKEDTRANSACTIONERROR type.
 */
public class PAYEEBLOCKEDTRANSACTIONERROR {
    private PayeeBlockedTransaction1IssueEnum issue;
    private PayeeBlockedTransaction1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public PAYEEBLOCKEDTRANSACTIONERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PayeeBlockedTransaction1IssueEnum value for issue.
     * @param  description  PayeeBlockedTransaction1DescriptionEnum value for description.
     */
    public PAYEEBLOCKEDTRANSACTIONERROR(
            PayeeBlockedTransaction1IssueEnum issue,
            PayeeBlockedTransaction1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PayeeBlockedTransaction1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayeeBlockedTransaction1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PayeeBlockedTransaction1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PayeeBlockedTransaction1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PayeeBlockedTransaction1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayeeBlockedTransaction1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PayeeBlockedTransaction1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PayeeBlockedTransaction1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYEEBLOCKEDTRANSACTIONERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYEEBLOCKEDTRANSACTIONERROR [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link PAYEEBLOCKEDTRANSACTIONERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYEEBLOCKEDTRANSACTIONERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYEEBLOCKEDTRANSACTIONERROR}.
     */
    public static class Builder {
        private PayeeBlockedTransaction1IssueEnum issue;
        private PayeeBlockedTransaction1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PayeeBlockedTransaction1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PayeeBlockedTransaction1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PayeeBlockedTransaction1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PayeeBlockedTransaction1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYEEBLOCKEDTRANSACTIONERROR} object using the set fields.
         * @return {@link PAYEEBLOCKEDTRANSACTIONERROR}
         */
        public PAYEEBLOCKEDTRANSACTIONERROR build() {
            return new PAYEEBLOCKEDTRANSACTIONERROR(issue, description);
        }
    }
}
