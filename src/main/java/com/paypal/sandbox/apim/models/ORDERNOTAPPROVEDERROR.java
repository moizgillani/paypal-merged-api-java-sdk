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
 * This is a model class for ORDERNOTAPPROVEDERROR type.
 */
public class ORDERNOTAPPROVEDERROR {
    private OrderNotApproved1IssueEnum issue;
    private OrderNotApproved1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public ORDERNOTAPPROVEDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  OrderNotApproved1IssueEnum value for issue.
     * @param  description  OrderNotApproved1DescriptionEnum value for description.
     */
    public ORDERNOTAPPROVEDERROR(
            OrderNotApproved1IssueEnum issue,
            OrderNotApproved1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the OrderNotApproved1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderNotApproved1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for OrderNotApproved1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(OrderNotApproved1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the OrderNotApproved1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderNotApproved1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for OrderNotApproved1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(OrderNotApproved1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this ORDERNOTAPPROVEDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ORDERNOTAPPROVEDERROR [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link ORDERNOTAPPROVEDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ORDERNOTAPPROVEDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link ORDERNOTAPPROVEDERROR}.
     */
    public static class Builder {
        private OrderNotApproved1IssueEnum issue;
        private OrderNotApproved1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  OrderNotApproved1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(OrderNotApproved1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  OrderNotApproved1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(OrderNotApproved1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ORDERNOTAPPROVEDERROR} object using the set fields.
         * @return {@link ORDERNOTAPPROVEDERROR}
         */
        public ORDERNOTAPPROVEDERROR build() {
            return new ORDERNOTAPPROVEDERROR(issue, description);
        }
    }
}
