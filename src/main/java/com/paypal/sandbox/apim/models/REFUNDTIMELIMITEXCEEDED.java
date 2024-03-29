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
 * This is a model class for REFUNDTIMELIMITEXCEEDED type.
 */
public class REFUNDTIMELIMITEXCEEDED {
    private CapturesRefund422IssuesItemsAnyof9IssueEnum issue;
    private CapturesRefund422IssuesItemsAnyof9DescriptionEnum description;

    /**
     * Default constructor.
     */
    public REFUNDTIMELIMITEXCEEDED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  CapturesRefund422IssuesItemsAnyof9IssueEnum value for issue.
     * @param  description  CapturesRefund422IssuesItemsAnyof9DescriptionEnum value for description.
     */
    public REFUNDTIMELIMITEXCEEDED(
            CapturesRefund422IssuesItemsAnyof9IssueEnum issue,
            CapturesRefund422IssuesItemsAnyof9DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the CapturesRefund422IssuesItemsAnyof9IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CapturesRefund422IssuesItemsAnyof9IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for CapturesRefund422IssuesItemsAnyof9IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(CapturesRefund422IssuesItemsAnyof9IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the CapturesRefund422IssuesItemsAnyof9DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CapturesRefund422IssuesItemsAnyof9DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for CapturesRefund422IssuesItemsAnyof9DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(CapturesRefund422IssuesItemsAnyof9DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this REFUNDTIMELIMITEXCEEDED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "REFUNDTIMELIMITEXCEEDED [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link REFUNDTIMELIMITEXCEEDED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link REFUNDTIMELIMITEXCEEDED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link REFUNDTIMELIMITEXCEEDED}.
     */
    public static class Builder {
        private CapturesRefund422IssuesItemsAnyof9IssueEnum issue;
        private CapturesRefund422IssuesItemsAnyof9DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  CapturesRefund422IssuesItemsAnyof9IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(CapturesRefund422IssuesItemsAnyof9IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  CapturesRefund422IssuesItemsAnyof9DescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(
                CapturesRefund422IssuesItemsAnyof9DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link REFUNDTIMELIMITEXCEEDED} object using the set fields.
         * @return {@link REFUNDTIMELIMITEXCEEDED}
         */
        public REFUNDTIMELIMITEXCEEDED build() {
            return new REFUNDTIMELIMITEXCEEDED(issue, description);
        }
    }
}
