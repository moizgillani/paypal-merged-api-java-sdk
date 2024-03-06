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
 * This is a model class for AUTHORIZATIONDENIED type.
 */
public class AUTHORIZATIONDENIED {
    private AuthorizationDeniedIssueEnum issue;
    private AuthorizationDeniedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public AUTHORIZATIONDENIED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  AuthorizationDeniedIssueEnum value for issue.
     * @param  description  AuthorizationDeniedDescriptionEnum value for description.
     */
    public AUTHORIZATIONDENIED(
            AuthorizationDeniedIssueEnum issue,
            AuthorizationDeniedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the AuthorizationDeniedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationDeniedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for AuthorizationDeniedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(AuthorizationDeniedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the AuthorizationDeniedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationDeniedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for AuthorizationDeniedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(AuthorizationDeniedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this AUTHORIZATIONDENIED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AUTHORIZATIONDENIED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link AUTHORIZATIONDENIED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AUTHORIZATIONDENIED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link AUTHORIZATIONDENIED}.
     */
    public static class Builder {
        private AuthorizationDeniedIssueEnum issue;
        private AuthorizationDeniedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  AuthorizationDeniedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(AuthorizationDeniedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  AuthorizationDeniedDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(AuthorizationDeniedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link AUTHORIZATIONDENIED} object using the set fields.
         * @return {@link AUTHORIZATIONDENIED}
         */
        public AUTHORIZATIONDENIED build() {
            return new AUTHORIZATIONDENIED(issue, description);
        }
    }
}
