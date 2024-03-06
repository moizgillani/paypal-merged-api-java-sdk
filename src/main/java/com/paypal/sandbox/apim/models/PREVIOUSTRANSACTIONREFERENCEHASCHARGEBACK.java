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
 * This is a model class for PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK type.
 */
public class PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK {
    private PreviousTransactionReferenceChargebackIssueEnum issue;
    private PrevTransRefChargebackDescEnum description;

    /**
     * Default constructor.
     */
    public PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PreviousTransactionReferenceChargebackIssueEnum value for issue.
     * @param  description  PrevTransRefChargebackDescEnum value for description.
     */
    public PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK(
            PreviousTransactionReferenceChargebackIssueEnum issue,
            PrevTransRefChargebackDescEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PreviousTransactionReferenceChargebackIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PreviousTransactionReferenceChargebackIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PreviousTransactionReferenceChargebackIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PreviousTransactionReferenceChargebackIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PrevTransRefChargebackDescEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PrevTransRefChargebackDescEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PrevTransRefChargebackDescEnum
     */
    @JsonSetter("description")
    public void setDescription(PrevTransRefChargebackDescEnum description) {
        this.description = description;
    }

    /**
     * Converts this PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK}.
     */
    public static class Builder {
        private PreviousTransactionReferenceChargebackIssueEnum issue;
        private PrevTransRefChargebackDescEnum description;



        /**
         * Setter for issue.
         * @param  issue  PreviousTransactionReferenceChargebackIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PreviousTransactionReferenceChargebackIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PrevTransRefChargebackDescEnum value for description.
         * @return Builder
         */
        public Builder description(PrevTransRefChargebackDescEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK} object using the set
         * fields.
         * @return {@link PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK}
         */
        public PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK build() {
            return new PREVIOUSTRANSACTIONREFERENCEHASCHARGEBACK(issue, description);
        }
    }
}
