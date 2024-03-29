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
 * This is a model class for BILLINGADDRESSINVALIDERROR type.
 */
public class BILLINGADDRESSINVALIDERROR {
    private BillingAddressInvalid1IssueEnum issue;
    private BillingAddressInvalid1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public BILLINGADDRESSINVALIDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  BillingAddressInvalid1IssueEnum value for issue.
     * @param  description  BillingAddressInvalid1DescriptionEnum value for description.
     */
    public BILLINGADDRESSINVALIDERROR(
            BillingAddressInvalid1IssueEnum issue,
            BillingAddressInvalid1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the BillingAddressInvalid1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingAddressInvalid1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for BillingAddressInvalid1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(BillingAddressInvalid1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the BillingAddressInvalid1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingAddressInvalid1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for BillingAddressInvalid1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(BillingAddressInvalid1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this BILLINGADDRESSINVALIDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BILLINGADDRESSINVALIDERROR [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link BILLINGADDRESSINVALIDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BILLINGADDRESSINVALIDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link BILLINGADDRESSINVALIDERROR}.
     */
    public static class Builder {
        private BillingAddressInvalid1IssueEnum issue;
        private BillingAddressInvalid1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  BillingAddressInvalid1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(BillingAddressInvalid1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  BillingAddressInvalid1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(BillingAddressInvalid1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link BILLINGADDRESSINVALIDERROR} object using the set fields.
         * @return {@link BILLINGADDRESSINVALIDERROR}
         */
        public BILLINGADDRESSINVALIDERROR build() {
            return new BILLINGADDRESSINVALIDERROR(issue, description);
        }
    }
}
