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
 * This is a model class for EMVDATAREQUIREDERROR type.
 */
public class EMVDATAREQUIREDERROR {
    private EmvDataRequired1IssueEnum issue;
    private EmvDataRequired1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public EMVDATAREQUIREDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  EmvDataRequired1IssueEnum value for issue.
     * @param  description  EmvDataRequired1DescriptionEnum value for description.
     */
    public EMVDATAREQUIREDERROR(
            EmvDataRequired1IssueEnum issue,
            EmvDataRequired1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the EmvDataRequired1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EmvDataRequired1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for EmvDataRequired1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(EmvDataRequired1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the EmvDataRequired1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EmvDataRequired1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for EmvDataRequired1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(EmvDataRequired1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this EMVDATAREQUIREDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EMVDATAREQUIREDERROR [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link EMVDATAREQUIREDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EMVDATAREQUIREDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link EMVDATAREQUIREDERROR}.
     */
    public static class Builder {
        private EmvDataRequired1IssueEnum issue;
        private EmvDataRequired1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  EmvDataRequired1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(EmvDataRequired1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  EmvDataRequired1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(EmvDataRequired1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link EMVDATAREQUIREDERROR} object using the set fields.
         * @return {@link EMVDATAREQUIREDERROR}
         */
        public EMVDATAREQUIREDERROR build() {
            return new EMVDATAREQUIREDERROR(issue, description);
        }
    }
}
