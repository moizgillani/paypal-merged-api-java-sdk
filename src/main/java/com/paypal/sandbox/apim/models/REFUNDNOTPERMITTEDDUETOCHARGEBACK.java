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
 * This is a model class for REFUNDNOTPERMITTEDDUETOCHARGEBACK type.
 */
public class REFUNDNOTPERMITTEDDUETOCHARGEBACK {
    private CapturesRefund422IssuesItemsAnyof20IssueEnum issue;
    private CapturesRefund422IssuesItemsAnyof20DescriptionEnum description;

    /**
     * Default constructor.
     */
    public REFUNDNOTPERMITTEDDUETOCHARGEBACK() {
    }

    /**
     * Initialization constructor.
     * @param  issue  CapturesRefund422IssuesItemsAnyof20IssueEnum value for issue.
     * @param  description  CapturesRefund422IssuesItemsAnyof20DescriptionEnum value for
     *         description.
     */
    public REFUNDNOTPERMITTEDDUETOCHARGEBACK(
            CapturesRefund422IssuesItemsAnyof20IssueEnum issue,
            CapturesRefund422IssuesItemsAnyof20DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the CapturesRefund422IssuesItemsAnyof20IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CapturesRefund422IssuesItemsAnyof20IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for CapturesRefund422IssuesItemsAnyof20IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(CapturesRefund422IssuesItemsAnyof20IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the CapturesRefund422IssuesItemsAnyof20DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CapturesRefund422IssuesItemsAnyof20DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for CapturesRefund422IssuesItemsAnyof20DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(CapturesRefund422IssuesItemsAnyof20DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this REFUNDNOTPERMITTEDDUETOCHARGEBACK into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "REFUNDNOTPERMITTEDDUETOCHARGEBACK [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link REFUNDNOTPERMITTEDDUETOCHARGEBACK.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link REFUNDNOTPERMITTEDDUETOCHARGEBACK.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link REFUNDNOTPERMITTEDDUETOCHARGEBACK}.
     */
    public static class Builder {
        private CapturesRefund422IssuesItemsAnyof20IssueEnum issue;
        private CapturesRefund422IssuesItemsAnyof20DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  CapturesRefund422IssuesItemsAnyof20IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(CapturesRefund422IssuesItemsAnyof20IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  CapturesRefund422IssuesItemsAnyof20DescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(
                CapturesRefund422IssuesItemsAnyof20DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link REFUNDNOTPERMITTEDDUETOCHARGEBACK} object using the set fields.
         * @return {@link REFUNDNOTPERMITTEDDUETOCHARGEBACK}
         */
        public REFUNDNOTPERMITTEDDUETOCHARGEBACK build() {
            return new REFUNDNOTPERMITTEDDUETOCHARGEBACK(issue, description);
        }
    }
}
