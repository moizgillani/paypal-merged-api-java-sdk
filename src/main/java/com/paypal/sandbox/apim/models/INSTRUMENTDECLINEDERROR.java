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
 * This is a model class for INSTRUMENTDECLINEDERROR type.
 */
public class INSTRUMENTDECLINEDERROR {
    private InstrumentDeclined1IssueEnum issue;
    private InstrumentDeclined1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public INSTRUMENTDECLINEDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InstrumentDeclined1IssueEnum value for issue.
     * @param  description  InstrumentDeclined1DescriptionEnum value for description.
     */
    public INSTRUMENTDECLINEDERROR(
            InstrumentDeclined1IssueEnum issue,
            InstrumentDeclined1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InstrumentDeclined1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InstrumentDeclined1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InstrumentDeclined1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InstrumentDeclined1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InstrumentDeclined1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InstrumentDeclined1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InstrumentDeclined1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InstrumentDeclined1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INSTRUMENTDECLINEDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INSTRUMENTDECLINEDERROR [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link INSTRUMENTDECLINEDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INSTRUMENTDECLINEDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INSTRUMENTDECLINEDERROR}.
     */
    public static class Builder {
        private InstrumentDeclined1IssueEnum issue;
        private InstrumentDeclined1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InstrumentDeclined1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InstrumentDeclined1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InstrumentDeclined1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InstrumentDeclined1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INSTRUMENTDECLINEDERROR} object using the set fields.
         * @return {@link INSTRUMENTDECLINEDERROR}
         */
        public INSTRUMENTDECLINEDERROR build() {
            return new INSTRUMENTDECLINEDERROR(issue, description);
        }
    }
}
