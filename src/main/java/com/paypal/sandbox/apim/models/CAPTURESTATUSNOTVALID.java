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
 * This is a model class for CAPTURESTATUSNOTVALID type.
 */
public class CAPTURESTATUSNOTVALID {
    private CaptureStatusNotValidIssueEnum issue;
    private CaptureStatusNotValidDescriptionEnum description;

    /**
     * Default constructor.
     */
    public CAPTURESTATUSNOTVALID() {
    }

    /**
     * Initialization constructor.
     * @param  issue  CaptureStatusNotValidIssueEnum value for issue.
     * @param  description  CaptureStatusNotValidDescriptionEnum value for description.
     */
    public CAPTURESTATUSNOTVALID(
            CaptureStatusNotValidIssueEnum issue,
            CaptureStatusNotValidDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the CaptureStatusNotValidIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CaptureStatusNotValidIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for CaptureStatusNotValidIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(CaptureStatusNotValidIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the CaptureStatusNotValidDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CaptureStatusNotValidDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for CaptureStatusNotValidDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(CaptureStatusNotValidDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this CAPTURESTATUSNOTVALID into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CAPTURESTATUSNOTVALID [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link CAPTURESTATUSNOTVALID.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CAPTURESTATUSNOTVALID.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link CAPTURESTATUSNOTVALID}.
     */
    public static class Builder {
        private CaptureStatusNotValidIssueEnum issue;
        private CaptureStatusNotValidDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  CaptureStatusNotValidIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(CaptureStatusNotValidIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  CaptureStatusNotValidDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(CaptureStatusNotValidDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link CAPTURESTATUSNOTVALID} object using the set fields.
         * @return {@link CAPTURESTATUSNOTVALID}
         */
        public CAPTURESTATUSNOTVALID build() {
            return new CAPTURESTATUSNOTVALID(issue, description);
        }
    }
}