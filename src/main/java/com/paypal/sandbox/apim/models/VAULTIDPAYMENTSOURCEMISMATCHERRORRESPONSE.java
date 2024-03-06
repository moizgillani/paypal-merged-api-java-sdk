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
 * This is a model class for VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE type.
 */
public class VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE {
    private MismatchedVaultIdToPaymentSource3IssueEnum issue;
    private MismatchedVaultIdToPaymentSource3DescriptionEnum description;

    /**
     * Default constructor.
     */
    public VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MismatchedVaultIdToPaymentSource3IssueEnum value for issue.
     * @param  description  MismatchedVaultIdToPaymentSource3DescriptionEnum value for description.
     */
    public VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE(
            MismatchedVaultIdToPaymentSource3IssueEnum issue,
            MismatchedVaultIdToPaymentSource3DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MismatchedVaultIdToPaymentSource3IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MismatchedVaultIdToPaymentSource3IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MismatchedVaultIdToPaymentSource3IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MismatchedVaultIdToPaymentSource3IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MismatchedVaultIdToPaymentSource3DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MismatchedVaultIdToPaymentSource3DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MismatchedVaultIdToPaymentSource3DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MismatchedVaultIdToPaymentSource3DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE}.
     */
    public static class Builder {
        private MismatchedVaultIdToPaymentSource3IssueEnum issue;
        private MismatchedVaultIdToPaymentSource3DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MismatchedVaultIdToPaymentSource3IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MismatchedVaultIdToPaymentSource3IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MismatchedVaultIdToPaymentSource3DescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(MismatchedVaultIdToPaymentSource3DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE} object using the set
         * fields.
         * @return {@link VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE}
         */
        public VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE build() {
            return new VAULTIDPAYMENTSOURCEMISMATCHERRORRESPONSE(issue, description);
        }
    }
}
