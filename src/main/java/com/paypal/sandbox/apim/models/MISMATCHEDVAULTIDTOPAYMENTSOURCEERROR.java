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
 * This is a model class for MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR type.
 */
public class MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR {
    private MismatchedVaultIdToPaymentSource1IssueEnum issue;
    private MismatchedVaultIdToPaymentSource1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MismatchedVaultIdToPaymentSource1IssueEnum value for issue.
     * @param  description  MismatchedVaultIdToPaymentSource1DescriptionEnum value for description.
     */
    public MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR(
            MismatchedVaultIdToPaymentSource1IssueEnum issue,
            MismatchedVaultIdToPaymentSource1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MismatchedVaultIdToPaymentSource1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MismatchedVaultIdToPaymentSource1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MismatchedVaultIdToPaymentSource1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MismatchedVaultIdToPaymentSource1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MismatchedVaultIdToPaymentSource1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MismatchedVaultIdToPaymentSource1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MismatchedVaultIdToPaymentSource1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MismatchedVaultIdToPaymentSource1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR}.
     */
    public static class Builder {
        private MismatchedVaultIdToPaymentSource1IssueEnum issue;
        private MismatchedVaultIdToPaymentSource1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MismatchedVaultIdToPaymentSource1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MismatchedVaultIdToPaymentSource1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MismatchedVaultIdToPaymentSource1DescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(MismatchedVaultIdToPaymentSource1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR} object using the set fields.
         * @return {@link MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR}
         */
        public MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR build() {
            return new MISMATCHEDVAULTIDTOPAYMENTSOURCEERROR(issue, description);
        }
    }
}