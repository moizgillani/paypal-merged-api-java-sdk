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
 * This is a model class for PREVIOUSTRANSACTIONREFERENCEVOIDED type.
 */
public class PREVIOUSTRANSACTIONREFERENCEVOIDED {
    private PreviousTransactionReferenceVoidedIssueEnum issue;
    private PreviousTransactionReferenceVoidedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public PREVIOUSTRANSACTIONREFERENCEVOIDED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PreviousTransactionReferenceVoidedIssueEnum value for issue.
     * @param  description  PreviousTransactionReferenceVoidedDescriptionEnum value for description.
     */
    public PREVIOUSTRANSACTIONREFERENCEVOIDED(
            PreviousTransactionReferenceVoidedIssueEnum issue,
            PreviousTransactionReferenceVoidedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PreviousTransactionReferenceVoidedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PreviousTransactionReferenceVoidedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PreviousTransactionReferenceVoidedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PreviousTransactionReferenceVoidedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PreviousTransactionReferenceVoidedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PreviousTransactionReferenceVoidedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PreviousTransactionReferenceVoidedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PreviousTransactionReferenceVoidedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PREVIOUSTRANSACTIONREFERENCEVOIDED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PREVIOUSTRANSACTIONREFERENCEVOIDED [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link PREVIOUSTRANSACTIONREFERENCEVOIDED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PREVIOUSTRANSACTIONREFERENCEVOIDED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PREVIOUSTRANSACTIONREFERENCEVOIDED}.
     */
    public static class Builder {
        private PreviousTransactionReferenceVoidedIssueEnum issue;
        private PreviousTransactionReferenceVoidedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PreviousTransactionReferenceVoidedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PreviousTransactionReferenceVoidedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PreviousTransactionReferenceVoidedDescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(
                PreviousTransactionReferenceVoidedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PREVIOUSTRANSACTIONREFERENCEVOIDED} object using the set fields.
         * @return {@link PREVIOUSTRANSACTIONREFERENCEVOIDED}
         */
        public PREVIOUSTRANSACTIONREFERENCEVOIDED build() {
            return new PREVIOUSTRANSACTIONREFERENCEVOIDED(issue, description);
        }
    }
}
