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
 * This is a model class for REQUIREDPARAMETERFORPAYMENTSOURCE type.
 */
public class REQUIREDPARAMETERFORPAYMENTSOURCE {
    private RequiredParameterForPaymentSourceIssueEnum issue;
    private RequiredParameterForPaymentSourceDescriptionEnum description;

    /**
     * Default constructor.
     */
    public REQUIREDPARAMETERFORPAYMENTSOURCE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  RequiredParameterForPaymentSourceIssueEnum value for issue.
     * @param  description  RequiredParameterForPaymentSourceDescriptionEnum value for description.
     */
    public REQUIREDPARAMETERFORPAYMENTSOURCE(
            RequiredParameterForPaymentSourceIssueEnum issue,
            RequiredParameterForPaymentSourceDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the RequiredParameterForPaymentSourceIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RequiredParameterForPaymentSourceIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for RequiredParameterForPaymentSourceIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(RequiredParameterForPaymentSourceIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the RequiredParameterForPaymentSourceDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RequiredParameterForPaymentSourceDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for RequiredParameterForPaymentSourceDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(RequiredParameterForPaymentSourceDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this REQUIREDPARAMETERFORPAYMENTSOURCE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "REQUIREDPARAMETERFORPAYMENTSOURCE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link REQUIREDPARAMETERFORPAYMENTSOURCE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link REQUIREDPARAMETERFORPAYMENTSOURCE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link REQUIREDPARAMETERFORPAYMENTSOURCE}.
     */
    public static class Builder {
        private RequiredParameterForPaymentSourceIssueEnum issue;
        private RequiredParameterForPaymentSourceDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  RequiredParameterForPaymentSourceIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(RequiredParameterForPaymentSourceIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  RequiredParameterForPaymentSourceDescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(RequiredParameterForPaymentSourceDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link REQUIREDPARAMETERFORPAYMENTSOURCE} object using the set fields.
         * @return {@link REQUIREDPARAMETERFORPAYMENTSOURCE}
         */
        public REQUIREDPARAMETERFORPAYMENTSOURCE build() {
            return new REQUIREDPARAMETERFORPAYMENTSOURCE(issue, description);
        }
    }
}
