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
 * This is a model class for AmountMismatch1 type.
 */
public class AmountMismatch1 {
    private AmountMismatch1IssueEnum issue;
    private AmountMismatch1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public AmountMismatch1() {
    }

    /**
     * Initialization constructor.
     * @param  issue  AmountMismatch1IssueEnum value for issue.
     * @param  description  AmountMismatch1DescriptionEnum value for description.
     */
    public AmountMismatch1(
            AmountMismatch1IssueEnum issue,
            AmountMismatch1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the AmountMismatch1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AmountMismatch1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for AmountMismatch1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(AmountMismatch1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the AmountMismatch1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AmountMismatch1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for AmountMismatch1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(AmountMismatch1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this AmountMismatch1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AmountMismatch1 [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link AmountMismatch1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AmountMismatch1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link AmountMismatch1}.
     */
    public static class Builder {
        private AmountMismatch1IssueEnum issue;
        private AmountMismatch1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  AmountMismatch1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(AmountMismatch1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  AmountMismatch1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(AmountMismatch1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link AmountMismatch1} object using the set fields.
         * @return {@link AmountMismatch1}
         */
        public AmountMismatch1 build() {
            return new AmountMismatch1(issue, description);
        }
    }
}
