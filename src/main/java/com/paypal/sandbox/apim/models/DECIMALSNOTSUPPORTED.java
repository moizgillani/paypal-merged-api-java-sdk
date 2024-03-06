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
 * This is a model class for DECIMALSNOTSUPPORTED type.
 */
public class DECIMALSNOTSUPPORTED {
    private DecimalsNotSupportedIssueEnum issue;
    private DecimalsNotSupportedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public DECIMALSNOTSUPPORTED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  DecimalsNotSupportedIssueEnum value for issue.
     * @param  description  DecimalsNotSupportedDescriptionEnum value for description.
     */
    public DECIMALSNOTSUPPORTED(
            DecimalsNotSupportedIssueEnum issue,
            DecimalsNotSupportedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the DecimalsNotSupportedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DecimalsNotSupportedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for DecimalsNotSupportedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(DecimalsNotSupportedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the DecimalsNotSupportedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DecimalsNotSupportedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for DecimalsNotSupportedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(DecimalsNotSupportedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this DECIMALSNOTSUPPORTED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DECIMALSNOTSUPPORTED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link DECIMALSNOTSUPPORTED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DECIMALSNOTSUPPORTED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link DECIMALSNOTSUPPORTED}.
     */
    public static class Builder {
        private DecimalsNotSupportedIssueEnum issue;
        private DecimalsNotSupportedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  DecimalsNotSupportedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(DecimalsNotSupportedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  DecimalsNotSupportedDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(DecimalsNotSupportedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link DECIMALSNOTSUPPORTED} object using the set fields.
         * @return {@link DECIMALSNOTSUPPORTED}
         */
        public DECIMALSNOTSUPPORTED build() {
            return new DECIMALSNOTSUPPORTED(issue, description);
        }
    }
}
