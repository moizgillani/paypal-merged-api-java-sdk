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
 * This is a model class for CAPTUREIDNOTFOUND type.
 */
public class CAPTUREIDNOTFOUND {
    private CaptureIdNotFoundIssueEnum issue;
    private CaptureIdNotFoundDescriptionEnum description;

    /**
     * Default constructor.
     */
    public CAPTUREIDNOTFOUND() {
    }

    /**
     * Initialization constructor.
     * @param  issue  CaptureIdNotFoundIssueEnum value for issue.
     * @param  description  CaptureIdNotFoundDescriptionEnum value for description.
     */
    public CAPTUREIDNOTFOUND(
            CaptureIdNotFoundIssueEnum issue,
            CaptureIdNotFoundDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the CaptureIdNotFoundIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CaptureIdNotFoundIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for CaptureIdNotFoundIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(CaptureIdNotFoundIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the CaptureIdNotFoundDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CaptureIdNotFoundDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for CaptureIdNotFoundDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(CaptureIdNotFoundDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this CAPTUREIDNOTFOUND into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CAPTUREIDNOTFOUND [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link CAPTUREIDNOTFOUND.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CAPTUREIDNOTFOUND.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link CAPTUREIDNOTFOUND}.
     */
    public static class Builder {
        private CaptureIdNotFoundIssueEnum issue;
        private CaptureIdNotFoundDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  CaptureIdNotFoundIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(CaptureIdNotFoundIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  CaptureIdNotFoundDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(CaptureIdNotFoundDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link CAPTUREIDNOTFOUND} object using the set fields.
         * @return {@link CAPTUREIDNOTFOUND}
         */
        public CAPTUREIDNOTFOUND build() {
            return new CAPTUREIDNOTFOUND(issue, description);
        }
    }
}
