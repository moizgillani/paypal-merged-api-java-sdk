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
 * This is a model class for MAXVALUEEXCEEDED type.
 */
public class MAXVALUEEXCEEDED {
    private MaxValueExceededIssueEnum issue;
    private MaxValueExceededDescriptionEnum description;

    /**
     * Default constructor.
     */
    public MAXVALUEEXCEEDED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MaxValueExceededIssueEnum value for issue.
     * @param  description  MaxValueExceededDescriptionEnum value for description.
     */
    public MAXVALUEEXCEEDED(
            MaxValueExceededIssueEnum issue,
            MaxValueExceededDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MaxValueExceededIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MaxValueExceededIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MaxValueExceededIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MaxValueExceededIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MaxValueExceededDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MaxValueExceededDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MaxValueExceededDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MaxValueExceededDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this MAXVALUEEXCEEDED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MAXVALUEEXCEEDED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link MAXVALUEEXCEEDED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MAXVALUEEXCEEDED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MAXVALUEEXCEEDED}.
     */
    public static class Builder {
        private MaxValueExceededIssueEnum issue;
        private MaxValueExceededDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MaxValueExceededIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MaxValueExceededIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MaxValueExceededDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(MaxValueExceededDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MAXVALUEEXCEEDED} object using the set fields.
         * @return {@link MAXVALUEEXCEEDED}
         */
        public MAXVALUEEXCEEDED build() {
            return new MAXVALUEEXCEEDED(issue, description);
        }
    }
}
