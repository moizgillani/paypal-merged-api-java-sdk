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
 * This is a model class for ONLYONEBANKSOURCEALLOWED type.
 */
public class ONLYONEBANKSOURCEALLOWED {
    private OnlyOneBankSourceAllowedIssueEnum issue;
    private OnlyOneBankSourceAllowedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public ONLYONEBANKSOURCEALLOWED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  OnlyOneBankSourceAllowedIssueEnum value for issue.
     * @param  description  OnlyOneBankSourceAllowedDescriptionEnum value for description.
     */
    public ONLYONEBANKSOURCEALLOWED(
            OnlyOneBankSourceAllowedIssueEnum issue,
            OnlyOneBankSourceAllowedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the OnlyOneBankSourceAllowedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OnlyOneBankSourceAllowedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for OnlyOneBankSourceAllowedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(OnlyOneBankSourceAllowedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the OnlyOneBankSourceAllowedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OnlyOneBankSourceAllowedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for OnlyOneBankSourceAllowedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(OnlyOneBankSourceAllowedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this ONLYONEBANKSOURCEALLOWED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ONLYONEBANKSOURCEALLOWED [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link ONLYONEBANKSOURCEALLOWED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ONLYONEBANKSOURCEALLOWED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link ONLYONEBANKSOURCEALLOWED}.
     */
    public static class Builder {
        private OnlyOneBankSourceAllowedIssueEnum issue;
        private OnlyOneBankSourceAllowedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  OnlyOneBankSourceAllowedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(OnlyOneBankSourceAllowedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  OnlyOneBankSourceAllowedDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(OnlyOneBankSourceAllowedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ONLYONEBANKSOURCEALLOWED} object using the set fields.
         * @return {@link ONLYONEBANKSOURCEALLOWED}
         */
        public ONLYONEBANKSOURCEALLOWED build() {
            return new ONLYONEBANKSOURCEALLOWED(issue, description);
        }
    }
}
