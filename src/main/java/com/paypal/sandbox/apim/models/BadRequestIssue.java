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
 * This is a model class for BadRequestIssue type.
 */
public class BadRequestIssue {
    private InvalidArrayMaxItemsIssueEnum issue;
    private InvalidArrayMaxItemsDescriptionEnum description;

    /**
     * Default constructor.
     */
    public BadRequestIssue() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidArrayMaxItemsIssueEnum value for issue.
     * @param  description  InvalidArrayMaxItemsDescriptionEnum value for description.
     */
    public BadRequestIssue(
            InvalidArrayMaxItemsIssueEnum issue,
            InvalidArrayMaxItemsDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidArrayMaxItemsIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidArrayMaxItemsIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidArrayMaxItemsIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidArrayMaxItemsIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidArrayMaxItemsDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidArrayMaxItemsDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidArrayMaxItemsDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidArrayMaxItemsDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this BadRequestIssue into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BadRequestIssue [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link BadRequestIssue.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BadRequestIssue.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link BadRequestIssue}.
     */
    public static class Builder {
        private InvalidArrayMaxItemsIssueEnum issue;
        private InvalidArrayMaxItemsDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidArrayMaxItemsIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidArrayMaxItemsIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidArrayMaxItemsDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidArrayMaxItemsDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link BadRequestIssue} object using the set fields.
         * @return {@link BadRequestIssue}
         */
        public BadRequestIssue build() {
            return new BadRequestIssue(issue, description);
        }
    }
}
