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
 * This is a model class for MERCHANTINITIATEDWITHSECURITYCODE type.
 */
public class MERCHANTINITIATEDWITHSECURITYCODE {
    private MerchantInitiatedWithSecurityCodeIssueEnum issue;
    private MerchantInitiatedWithSecurityCodeDescriptionEnum description;

    /**
     * Default constructor.
     */
    public MERCHANTINITIATEDWITHSECURITYCODE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MerchantInitiatedWithSecurityCodeIssueEnum value for issue.
     * @param  description  MerchantInitiatedWithSecurityCodeDescriptionEnum value for description.
     */
    public MERCHANTINITIATEDWITHSECURITYCODE(
            MerchantInitiatedWithSecurityCodeIssueEnum issue,
            MerchantInitiatedWithSecurityCodeDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MerchantInitiatedWithSecurityCodeIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantInitiatedWithSecurityCodeIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MerchantInitiatedWithSecurityCodeIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MerchantInitiatedWithSecurityCodeIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MerchantInitiatedWithSecurityCodeDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantInitiatedWithSecurityCodeDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MerchantInitiatedWithSecurityCodeDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MerchantInitiatedWithSecurityCodeDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this MERCHANTINITIATEDWITHSECURITYCODE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MERCHANTINITIATEDWITHSECURITYCODE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link MERCHANTINITIATEDWITHSECURITYCODE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MERCHANTINITIATEDWITHSECURITYCODE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MERCHANTINITIATEDWITHSECURITYCODE}.
     */
    public static class Builder {
        private MerchantInitiatedWithSecurityCodeIssueEnum issue;
        private MerchantInitiatedWithSecurityCodeDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MerchantInitiatedWithSecurityCodeIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MerchantInitiatedWithSecurityCodeIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MerchantInitiatedWithSecurityCodeDescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(MerchantInitiatedWithSecurityCodeDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MERCHANTINITIATEDWITHSECURITYCODE} object using the set fields.
         * @return {@link MERCHANTINITIATEDWITHSECURITYCODE}
         */
        public MERCHANTINITIATEDWITHSECURITYCODE build() {
            return new MERCHANTINITIATEDWITHSECURITYCODE(issue, description);
        }
    }
}
