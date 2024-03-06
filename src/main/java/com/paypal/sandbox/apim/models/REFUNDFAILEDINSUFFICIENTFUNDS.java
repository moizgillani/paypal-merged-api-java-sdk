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
 * This is a model class for REFUNDFAILEDINSUFFICIENTFUNDS type.
 */
public class REFUNDFAILEDINSUFFICIENTFUNDS {
    private CapturesRefund422IssuesItemsAnyof12IssueEnum issue;
    private CapturesRefund422IssuesItemsAnyof12DescriptionEnum description;

    /**
     * Default constructor.
     */
    public REFUNDFAILEDINSUFFICIENTFUNDS() {
    }

    /**
     * Initialization constructor.
     * @param  issue  CapturesRefund422IssuesItemsAnyof12IssueEnum value for issue.
     * @param  description  CapturesRefund422IssuesItemsAnyof12DescriptionEnum value for
     *         description.
     */
    public REFUNDFAILEDINSUFFICIENTFUNDS(
            CapturesRefund422IssuesItemsAnyof12IssueEnum issue,
            CapturesRefund422IssuesItemsAnyof12DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the CapturesRefund422IssuesItemsAnyof12IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CapturesRefund422IssuesItemsAnyof12IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for CapturesRefund422IssuesItemsAnyof12IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(CapturesRefund422IssuesItemsAnyof12IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the CapturesRefund422IssuesItemsAnyof12DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CapturesRefund422IssuesItemsAnyof12DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for CapturesRefund422IssuesItemsAnyof12DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(CapturesRefund422IssuesItemsAnyof12DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this REFUNDFAILEDINSUFFICIENTFUNDS into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "REFUNDFAILEDINSUFFICIENTFUNDS [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link REFUNDFAILEDINSUFFICIENTFUNDS.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link REFUNDFAILEDINSUFFICIENTFUNDS.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link REFUNDFAILEDINSUFFICIENTFUNDS}.
     */
    public static class Builder {
        private CapturesRefund422IssuesItemsAnyof12IssueEnum issue;
        private CapturesRefund422IssuesItemsAnyof12DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  CapturesRefund422IssuesItemsAnyof12IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(CapturesRefund422IssuesItemsAnyof12IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  CapturesRefund422IssuesItemsAnyof12DescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(
                CapturesRefund422IssuesItemsAnyof12DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link REFUNDFAILEDINSUFFICIENTFUNDS} object using the set fields.
         * @return {@link REFUNDFAILEDINSUFFICIENTFUNDS}
         */
        public REFUNDFAILEDINSUFFICIENTFUNDS build() {
            return new REFUNDFAILEDINSUFFICIENTFUNDS(issue, description);
        }
    }
}
