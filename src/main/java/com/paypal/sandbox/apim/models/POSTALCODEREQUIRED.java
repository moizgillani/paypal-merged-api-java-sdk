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
 * This is a model class for POSTALCODEREQUIRED type.
 */
public class POSTALCODEREQUIRED {
    private PostalCodeRequiredIssueEnum issue;
    private PostalCodeRequiredDescriptionEnum description;

    /**
     * Default constructor.
     */
    public POSTALCODEREQUIRED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PostalCodeRequiredIssueEnum value for issue.
     * @param  description  PostalCodeRequiredDescriptionEnum value for description.
     */
    public POSTALCODEREQUIRED(
            PostalCodeRequiredIssueEnum issue,
            PostalCodeRequiredDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PostalCodeRequiredIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PostalCodeRequiredIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PostalCodeRequiredIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PostalCodeRequiredIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PostalCodeRequiredDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PostalCodeRequiredDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PostalCodeRequiredDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PostalCodeRequiredDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this POSTALCODEREQUIRED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "POSTALCODEREQUIRED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link POSTALCODEREQUIRED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link POSTALCODEREQUIRED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link POSTALCODEREQUIRED}.
     */
    public static class Builder {
        private PostalCodeRequiredIssueEnum issue;
        private PostalCodeRequiredDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PostalCodeRequiredIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PostalCodeRequiredIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PostalCodeRequiredDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PostalCodeRequiredDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link POSTALCODEREQUIRED} object using the set fields.
         * @return {@link POSTALCODEREQUIRED}
         */
        public POSTALCODEREQUIRED build() {
            return new POSTALCODEREQUIRED(issue, description);
        }
    }
}
