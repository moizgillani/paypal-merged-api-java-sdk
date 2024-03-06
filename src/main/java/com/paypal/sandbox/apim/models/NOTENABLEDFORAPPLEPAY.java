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
 * This is a model class for NOTENABLEDFORAPPLEPAY type.
 */
public class NOTENABLEDFORAPPLEPAY {
    private NotEnabledForApplePayIssueEnum issue;
    private NotEnabledForApplePayDescriptionEnum description;

    /**
     * Default constructor.
     */
    public NOTENABLEDFORAPPLEPAY() {
    }

    /**
     * Initialization constructor.
     * @param  issue  NotEnabledForApplePayIssueEnum value for issue.
     * @param  description  NotEnabledForApplePayDescriptionEnum value for description.
     */
    public NOTENABLEDFORAPPLEPAY(
            NotEnabledForApplePayIssueEnum issue,
            NotEnabledForApplePayDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the NotEnabledForApplePayIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEnabledForApplePayIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for NotEnabledForApplePayIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(NotEnabledForApplePayIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the NotEnabledForApplePayDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEnabledForApplePayDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for NotEnabledForApplePayDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(NotEnabledForApplePayDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this NOTENABLEDFORAPPLEPAY into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NOTENABLEDFORAPPLEPAY [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link NOTENABLEDFORAPPLEPAY.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NOTENABLEDFORAPPLEPAY.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link NOTENABLEDFORAPPLEPAY}.
     */
    public static class Builder {
        private NotEnabledForApplePayIssueEnum issue;
        private NotEnabledForApplePayDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  NotEnabledForApplePayIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(NotEnabledForApplePayIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  NotEnabledForApplePayDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(NotEnabledForApplePayDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link NOTENABLEDFORAPPLEPAY} object using the set fields.
         * @return {@link NOTENABLEDFORAPPLEPAY}
         */
        public NOTENABLEDFORAPPLEPAY build() {
            return new NOTENABLEDFORAPPLEPAY(issue, description);
        }
    }
}
