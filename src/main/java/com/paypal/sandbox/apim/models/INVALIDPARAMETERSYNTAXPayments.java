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
 * This is a model class for INVALIDPARAMETERSYNTAXPayments type.
 */
public class INVALIDPARAMETERSYNTAXPayments {
    private InvalidParameterSyntaxIssueEnum issue;
    private InvalidParameterSyntaxDescriptionEnum description;

    /**
     * Default constructor.
     */
    public INVALIDPARAMETERSYNTAXPayments() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidParameterSyntaxIssueEnum value for issue.
     * @param  description  InvalidParameterSyntaxDescriptionEnum value for description.
     */
    public INVALIDPARAMETERSYNTAXPayments(
            InvalidParameterSyntaxIssueEnum issue,
            InvalidParameterSyntaxDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidParameterSyntaxIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidParameterSyntaxIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidParameterSyntaxIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidParameterSyntaxIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidParameterSyntaxDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidParameterSyntaxDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidParameterSyntaxDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidParameterSyntaxDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDPARAMETERSYNTAXPayments into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDPARAMETERSYNTAXPayments [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link INVALIDPARAMETERSYNTAXPayments.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDPARAMETERSYNTAXPayments.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDPARAMETERSYNTAXPayments}.
     */
    public static class Builder {
        private InvalidParameterSyntaxIssueEnum issue;
        private InvalidParameterSyntaxDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidParameterSyntaxIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidParameterSyntaxIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidParameterSyntaxDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidParameterSyntaxDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDPARAMETERSYNTAXPayments} object using the set fields.
         * @return {@link INVALIDPARAMETERSYNTAXPayments}
         */
        public INVALIDPARAMETERSYNTAXPayments build() {
            return new INVALIDPARAMETERSYNTAXPayments(issue, description);
        }
    }
}
