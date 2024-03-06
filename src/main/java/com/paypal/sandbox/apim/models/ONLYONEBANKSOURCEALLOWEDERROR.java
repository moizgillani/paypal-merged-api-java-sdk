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
 * This is a model class for ONLYONEBANKSOURCEALLOWEDERROR type.
 */
public class ONLYONEBANKSOURCEALLOWEDERROR {
    private OnlyOneBankSourceAllowed1IssueEnum issue;
    private OnlyOneBankSourceAllowed1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public ONLYONEBANKSOURCEALLOWEDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  OnlyOneBankSourceAllowed1IssueEnum value for issue.
     * @param  description  OnlyOneBankSourceAllowed1DescriptionEnum value for description.
     */
    public ONLYONEBANKSOURCEALLOWEDERROR(
            OnlyOneBankSourceAllowed1IssueEnum issue,
            OnlyOneBankSourceAllowed1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the OnlyOneBankSourceAllowed1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OnlyOneBankSourceAllowed1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for OnlyOneBankSourceAllowed1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(OnlyOneBankSourceAllowed1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the OnlyOneBankSourceAllowed1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OnlyOneBankSourceAllowed1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for OnlyOneBankSourceAllowed1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(OnlyOneBankSourceAllowed1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this ONLYONEBANKSOURCEALLOWEDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ONLYONEBANKSOURCEALLOWEDERROR [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link ONLYONEBANKSOURCEALLOWEDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ONLYONEBANKSOURCEALLOWEDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link ONLYONEBANKSOURCEALLOWEDERROR}.
     */
    public static class Builder {
        private OnlyOneBankSourceAllowed1IssueEnum issue;
        private OnlyOneBankSourceAllowed1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  OnlyOneBankSourceAllowed1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(OnlyOneBankSourceAllowed1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  OnlyOneBankSourceAllowed1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(OnlyOneBankSourceAllowed1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ONLYONEBANKSOURCEALLOWEDERROR} object using the set fields.
         * @return {@link ONLYONEBANKSOURCEALLOWEDERROR}
         */
        public ONLYONEBANKSOURCEALLOWEDERROR build() {
            return new ONLYONEBANKSOURCEALLOWEDERROR(issue, description);
        }
    }
}
