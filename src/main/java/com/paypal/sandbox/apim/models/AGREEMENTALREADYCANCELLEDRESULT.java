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
 * This is a model class for AGREEMENTALREADYCANCELLEDRESULT type.
 */
public class AGREEMENTALREADYCANCELLEDRESULT {
    private AgreementAlreadyCancelled2IssueEnum issue;
    private AgreementAlreadyCancelled2DescriptionEnum description;

    /**
     * Default constructor.
     */
    public AGREEMENTALREADYCANCELLEDRESULT() {
    }

    /**
     * Initialization constructor.
     * @param  issue  AgreementAlreadyCancelled2IssueEnum value for issue.
     * @param  description  AgreementAlreadyCancelled2DescriptionEnum value for description.
     */
    public AGREEMENTALREADYCANCELLEDRESULT(
            AgreementAlreadyCancelled2IssueEnum issue,
            AgreementAlreadyCancelled2DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the AgreementAlreadyCancelled2IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AgreementAlreadyCancelled2IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for AgreementAlreadyCancelled2IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(AgreementAlreadyCancelled2IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the AgreementAlreadyCancelled2DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AgreementAlreadyCancelled2DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for AgreementAlreadyCancelled2DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(AgreementAlreadyCancelled2DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this AGREEMENTALREADYCANCELLEDRESULT into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AGREEMENTALREADYCANCELLEDRESULT [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link AGREEMENTALREADYCANCELLEDRESULT.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AGREEMENTALREADYCANCELLEDRESULT.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link AGREEMENTALREADYCANCELLEDRESULT}.
     */
    public static class Builder {
        private AgreementAlreadyCancelled2IssueEnum issue;
        private AgreementAlreadyCancelled2DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  AgreementAlreadyCancelled2IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(AgreementAlreadyCancelled2IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  AgreementAlreadyCancelled2DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(AgreementAlreadyCancelled2DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link AGREEMENTALREADYCANCELLEDRESULT} object using the set fields.
         * @return {@link AGREEMENTALREADYCANCELLEDRESULT}
         */
        public AGREEMENTALREADYCANCELLEDRESULT build() {
            return new AGREEMENTALREADYCANCELLEDRESULT(issue, description);
        }
    }
}
