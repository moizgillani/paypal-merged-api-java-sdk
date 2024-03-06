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
 * This is a model class for NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING type.
 */
public class NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING {
    private NotEligibleForPaypalTransactionIdProcessingIssueEnum issue;
    private NotEligiblePaypalTransIdProcessingDescEnum description;

    /**
     * Default constructor.
     */
    public NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING() {
    }

    /**
     * Initialization constructor.
     * @param  issue  NotEligibleForPaypalTransactionIdProcessingIssueEnum value for issue.
     * @param  description  NotEligiblePaypalTransIdProcessingDescEnum value for description.
     */
    public NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING(
            NotEligibleForPaypalTransactionIdProcessingIssueEnum issue,
            NotEligiblePaypalTransIdProcessingDescEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the NotEligibleForPaypalTransactionIdProcessingIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEligibleForPaypalTransactionIdProcessingIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for NotEligibleForPaypalTransactionIdProcessingIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(NotEligibleForPaypalTransactionIdProcessingIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the NotEligiblePaypalTransIdProcessingDescEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEligiblePaypalTransIdProcessingDescEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for NotEligiblePaypalTransIdProcessingDescEnum
     */
    @JsonSetter("description")
    public void setDescription(NotEligiblePaypalTransIdProcessingDescEnum description) {
        this.description = description;
    }

    /**
     * Converts this NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING}.
     */
    public static class Builder {
        private NotEligibleForPaypalTransactionIdProcessingIssueEnum issue;
        private NotEligiblePaypalTransIdProcessingDescEnum description;



        /**
         * Setter for issue.
         * @param  issue  NotEligibleForPaypalTransactionIdProcessingIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(NotEligibleForPaypalTransactionIdProcessingIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  NotEligiblePaypalTransIdProcessingDescEnum value for description.
         * @return Builder
         */
        public Builder description(NotEligiblePaypalTransIdProcessingDescEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING} object using the set
         * fields.
         * @return {@link NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING}
         */
        public NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING build() {
            return new NOTELIGIBLEFORPAYPALTRANSACTIONIDPROCESSING(issue, description);
        }
    }
}
