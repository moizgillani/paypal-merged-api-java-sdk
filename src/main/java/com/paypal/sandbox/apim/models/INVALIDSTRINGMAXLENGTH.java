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
 * This is a model class for INVALIDSTRINGMAXLENGTH type.
 */
public class INVALIDSTRINGMAXLENGTH {
    private Badrequest400errorresponseIssuesItemsAnyof3IssueEnum issue;
    private InvalidStringMaxLengthDescriptionEnum description;

    /**
     * Default constructor.
     */
    public INVALIDSTRINGMAXLENGTH() {
    }

    /**
     * Initialization constructor.
     * @param  issue  Badrequest400errorresponseIssuesItemsAnyof3IssueEnum value for issue.
     * @param  description  InvalidStringMaxLengthDescriptionEnum value for description.
     */
    public INVALIDSTRINGMAXLENGTH(
            Badrequest400errorresponseIssuesItemsAnyof3IssueEnum issue,
            InvalidStringMaxLengthDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the Badrequest400errorresponseIssuesItemsAnyof3IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Badrequest400errorresponseIssuesItemsAnyof3IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for Badrequest400errorresponseIssuesItemsAnyof3IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(Badrequest400errorresponseIssuesItemsAnyof3IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidStringMaxLengthDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidStringMaxLengthDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidStringMaxLengthDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidStringMaxLengthDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDSTRINGMAXLENGTH into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDSTRINGMAXLENGTH [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link INVALIDSTRINGMAXLENGTH.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDSTRINGMAXLENGTH.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDSTRINGMAXLENGTH}.
     */
    public static class Builder {
        private Badrequest400errorresponseIssuesItemsAnyof3IssueEnum issue;
        private InvalidStringMaxLengthDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  Badrequest400errorresponseIssuesItemsAnyof3IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(Badrequest400errorresponseIssuesItemsAnyof3IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidStringMaxLengthDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidStringMaxLengthDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDSTRINGMAXLENGTH} object using the set fields.
         * @return {@link INVALIDSTRINGMAXLENGTH}
         */
        public INVALIDSTRINGMAXLENGTH build() {
            return new INVALIDSTRINGMAXLENGTH(issue, description);
        }
    }
}