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
 * This is a model class for PREVIOUSLYCAPTURED type.
 */
public class PREVIOUSLYCAPTURED {
    private AuthorizationsVoid422IssuesItemsAnyof0IssueEnum issue;
    private AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum description;

    /**
     * Default constructor.
     */
    public PREVIOUSLYCAPTURED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  AuthorizationsVoid422IssuesItemsAnyof0IssueEnum value for issue.
     * @param  description  AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum value for
     *         description.
     */
    public PREVIOUSLYCAPTURED(
            AuthorizationsVoid422IssuesItemsAnyof0IssueEnum issue,
            AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the AuthorizationsVoid422IssuesItemsAnyof0IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationsVoid422IssuesItemsAnyof0IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for AuthorizationsVoid422IssuesItemsAnyof0IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(AuthorizationsVoid422IssuesItemsAnyof0IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PREVIOUSLYCAPTURED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PREVIOUSLYCAPTURED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link PREVIOUSLYCAPTURED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PREVIOUSLYCAPTURED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PREVIOUSLYCAPTURED}.
     */
    public static class Builder {
        private AuthorizationsVoid422IssuesItemsAnyof0IssueEnum issue;
        private AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  AuthorizationsVoid422IssuesItemsAnyof0IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(AuthorizationsVoid422IssuesItemsAnyof0IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(
                AuthorizationsVoid422IssuesItemsAnyof0DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PREVIOUSLYCAPTURED} object using the set fields.
         * @return {@link PREVIOUSLYCAPTURED}
         */
        public PREVIOUSLYCAPTURED build() {
            return new PREVIOUSLYCAPTURED(issue, description);
        }
    }
}
