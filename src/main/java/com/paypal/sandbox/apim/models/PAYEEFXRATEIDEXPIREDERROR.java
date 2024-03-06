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
 * This is a model class for PAYEEFXRATEIDEXPIREDERROR type.
 */
public class PAYEEFXRATEIDEXPIREDERROR {
    private PayeeFxRateIdExpired2IssueEnum issue;
    private PayeeFxRateIdExpired2DescriptionEnum description;

    /**
     * Default constructor.
     */
    public PAYEEFXRATEIDEXPIREDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PayeeFxRateIdExpired2IssueEnum value for issue.
     * @param  description  PayeeFxRateIdExpired2DescriptionEnum value for description.
     */
    public PAYEEFXRATEIDEXPIREDERROR(
            PayeeFxRateIdExpired2IssueEnum issue,
            PayeeFxRateIdExpired2DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PayeeFxRateIdExpired2IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayeeFxRateIdExpired2IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PayeeFxRateIdExpired2IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PayeeFxRateIdExpired2IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PayeeFxRateIdExpired2DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayeeFxRateIdExpired2DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PayeeFxRateIdExpired2DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PayeeFxRateIdExpired2DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYEEFXRATEIDEXPIREDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYEEFXRATEIDEXPIREDERROR [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link PAYEEFXRATEIDEXPIREDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYEEFXRATEIDEXPIREDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYEEFXRATEIDEXPIREDERROR}.
     */
    public static class Builder {
        private PayeeFxRateIdExpired2IssueEnum issue;
        private PayeeFxRateIdExpired2DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PayeeFxRateIdExpired2IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PayeeFxRateIdExpired2IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PayeeFxRateIdExpired2DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PayeeFxRateIdExpired2DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYEEFXRATEIDEXPIREDERROR} object using the set fields.
         * @return {@link PAYEEFXRATEIDEXPIREDERROR}
         */
        public PAYEEFXRATEIDEXPIREDERROR build() {
            return new PAYEEFXRATEIDEXPIREDERROR(issue, description);
        }
    }
}
