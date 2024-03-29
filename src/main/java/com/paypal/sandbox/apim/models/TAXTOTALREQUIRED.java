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
 * This is a model class for TAXTOTALREQUIRED type.
 */
public class TAXTOTALREQUIRED {
    private TaxTotalRequiredIssueEnum issue;
    private TaxTotalRequiredDescriptionEnum description;

    /**
     * Default constructor.
     */
    public TAXTOTALREQUIRED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  TaxTotalRequiredIssueEnum value for issue.
     * @param  description  TaxTotalRequiredDescriptionEnum value for description.
     */
    public TAXTOTALREQUIRED(
            TaxTotalRequiredIssueEnum issue,
            TaxTotalRequiredDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the TaxTotalRequiredIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxTotalRequiredIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for TaxTotalRequiredIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(TaxTotalRequiredIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the TaxTotalRequiredDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxTotalRequiredDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for TaxTotalRequiredDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(TaxTotalRequiredDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this TAXTOTALREQUIRED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TAXTOTALREQUIRED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link TAXTOTALREQUIRED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TAXTOTALREQUIRED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link TAXTOTALREQUIRED}.
     */
    public static class Builder {
        private TaxTotalRequiredIssueEnum issue;
        private TaxTotalRequiredDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  TaxTotalRequiredIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(TaxTotalRequiredIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  TaxTotalRequiredDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(TaxTotalRequiredDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link TAXTOTALREQUIRED} object using the set fields.
         * @return {@link TAXTOTALREQUIRED}
         */
        public TAXTOTALREQUIRED build() {
            return new TAXTOTALREQUIRED(issue, description);
        }
    }
}
