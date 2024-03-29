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
 * This is a model class for INVALIDEXPIRYDATE type.
 */
public class INVALIDEXPIRYDATE {
    private InvalidExpiryDateIssueEnum issue;
    private InvalidExpiryDateDescriptionEnum description;

    /**
     * Default constructor.
     */
    public INVALIDEXPIRYDATE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidExpiryDateIssueEnum value for issue.
     * @param  description  InvalidExpiryDateDescriptionEnum value for description.
     */
    public INVALIDEXPIRYDATE(
            InvalidExpiryDateIssueEnum issue,
            InvalidExpiryDateDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidExpiryDateIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidExpiryDateIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidExpiryDateIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidExpiryDateIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidExpiryDateDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidExpiryDateDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidExpiryDateDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidExpiryDateDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDEXPIRYDATE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDEXPIRYDATE [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link INVALIDEXPIRYDATE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDEXPIRYDATE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDEXPIRYDATE}.
     */
    public static class Builder {
        private InvalidExpiryDateIssueEnum issue;
        private InvalidExpiryDateDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidExpiryDateIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidExpiryDateIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidExpiryDateDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidExpiryDateDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDEXPIRYDATE} object using the set fields.
         * @return {@link INVALIDEXPIRYDATE}
         */
        public INVALIDEXPIRYDATE build() {
            return new INVALIDEXPIRYDATE(issue, description);
        }
    }
}
