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
 * This is a model class for PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR type.
 */
public class PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR {
    private PreviousTransactionReferenceVoided1IssueEnum issue;
    private PreviousTransactionReferenceVoided1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PreviousTransactionReferenceVoided1IssueEnum value for issue.
     * @param  description  PreviousTransactionReferenceVoided1DescriptionEnum value for
     *         description.
     */
    public PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR(
            PreviousTransactionReferenceVoided1IssueEnum issue,
            PreviousTransactionReferenceVoided1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PreviousTransactionReferenceVoided1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PreviousTransactionReferenceVoided1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PreviousTransactionReferenceVoided1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PreviousTransactionReferenceVoided1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PreviousTransactionReferenceVoided1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PreviousTransactionReferenceVoided1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PreviousTransactionReferenceVoided1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PreviousTransactionReferenceVoided1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR}.
     */
    public static class Builder {
        private PreviousTransactionReferenceVoided1IssueEnum issue;
        private PreviousTransactionReferenceVoided1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PreviousTransactionReferenceVoided1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PreviousTransactionReferenceVoided1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PreviousTransactionReferenceVoided1DescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(
                PreviousTransactionReferenceVoided1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR} object using the set fields.
         * @return {@link PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR}
         */
        public PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR build() {
            return new PREVIOUSTRANSACTIONREFERENCEVOIDEDERROR(issue, description);
        }
    }
}
