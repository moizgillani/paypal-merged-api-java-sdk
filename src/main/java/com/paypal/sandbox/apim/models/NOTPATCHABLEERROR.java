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
 * This is a model class for NOTPATCHABLEERROR type.
 */
public class NOTPATCHABLEERROR {
    private NotPatchable1IssueEnum issue;
    private NotPatchable1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public NOTPATCHABLEERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  NotPatchable1IssueEnum value for issue.
     * @param  description  NotPatchable1DescriptionEnum value for description.
     */
    public NOTPATCHABLEERROR(
            NotPatchable1IssueEnum issue,
            NotPatchable1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the NotPatchable1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotPatchable1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for NotPatchable1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(NotPatchable1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the NotPatchable1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotPatchable1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for NotPatchable1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(NotPatchable1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this NOTPATCHABLEERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NOTPATCHABLEERROR [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link NOTPATCHABLEERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NOTPATCHABLEERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link NOTPATCHABLEERROR}.
     */
    public static class Builder {
        private NotPatchable1IssueEnum issue;
        private NotPatchable1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  NotPatchable1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(NotPatchable1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  NotPatchable1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(NotPatchable1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link NOTPATCHABLEERROR} object using the set fields.
         * @return {@link NOTPATCHABLEERROR}
         */
        public NOTPATCHABLEERROR build() {
            return new NOTPATCHABLEERROR(issue, description);
        }
    }
}
