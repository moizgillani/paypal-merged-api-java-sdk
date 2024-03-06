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
 * This is a model class for MISSINGPAYMENTPARAMETER type.
 */
public class MISSINGPAYMENTPARAMETER {
    private RequiredParamForCustInitiatedPaymentEnum issue;
    private ReqParamCustInitPayDescEnum description;

    /**
     * Default constructor.
     */
    public MISSINGPAYMENTPARAMETER() {
    }

    /**
     * Initialization constructor.
     * @param  issue  RequiredParamForCustInitiatedPaymentEnum value for issue.
     * @param  description  ReqParamCustInitPayDescEnum value for description.
     */
    public MISSINGPAYMENTPARAMETER(
            RequiredParamForCustInitiatedPaymentEnum issue,
            ReqParamCustInitPayDescEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the RequiredParamForCustInitiatedPaymentEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RequiredParamForCustInitiatedPaymentEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for RequiredParamForCustInitiatedPaymentEnum
     */
    @JsonSetter("issue")
    public void setIssue(RequiredParamForCustInitiatedPaymentEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ReqParamCustInitPayDescEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReqParamCustInitPayDescEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ReqParamCustInitPayDescEnum
     */
    @JsonSetter("description")
    public void setDescription(ReqParamCustInitPayDescEnum description) {
        this.description = description;
    }

    /**
     * Converts this MISSINGPAYMENTPARAMETER into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MISSINGPAYMENTPARAMETER [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link MISSINGPAYMENTPARAMETER.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MISSINGPAYMENTPARAMETER.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MISSINGPAYMENTPARAMETER}.
     */
    public static class Builder {
        private RequiredParamForCustInitiatedPaymentEnum issue;
        private ReqParamCustInitPayDescEnum description;



        /**
         * Setter for issue.
         * @param  issue  RequiredParamForCustInitiatedPaymentEnum value for issue.
         * @return Builder
         */
        public Builder issue(RequiredParamForCustInitiatedPaymentEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ReqParamCustInitPayDescEnum value for description.
         * @return Builder
         */
        public Builder description(ReqParamCustInitPayDescEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MISSINGPAYMENTPARAMETER} object using the set fields.
         * @return {@link MISSINGPAYMENTPARAMETER}
         */
        public MISSINGPAYMENTPARAMETER build() {
            return new MISSINGPAYMENTPARAMETER(issue, description);
        }
    }
}
