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
 * This is a model class for MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS type.
 */
public class MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS {
    private MerchantInitiatedAuthenticationResultsEnum issue;
    private MerchInitAuthResultsDescEnum description;

    /**
     * Default constructor.
     */
    public MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MerchantInitiatedAuthenticationResultsEnum value for issue.
     * @param  description  MerchInitAuthResultsDescEnum value for description.
     */
    public MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS(
            MerchantInitiatedAuthenticationResultsEnum issue,
            MerchInitAuthResultsDescEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MerchantInitiatedAuthenticationResultsEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantInitiatedAuthenticationResultsEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MerchantInitiatedAuthenticationResultsEnum
     */
    @JsonSetter("issue")
    public void setIssue(MerchantInitiatedAuthenticationResultsEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MerchInitAuthResultsDescEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchInitAuthResultsDescEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MerchInitAuthResultsDescEnum
     */
    @JsonSetter("description")
    public void setDescription(MerchInitAuthResultsDescEnum description) {
        this.description = description;
    }

    /**
     * Converts this MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS}.
     */
    public static class Builder {
        private MerchantInitiatedAuthenticationResultsEnum issue;
        private MerchInitAuthResultsDescEnum description;



        /**
         * Setter for issue.
         * @param  issue  MerchantInitiatedAuthenticationResultsEnum value for issue.
         * @return Builder
         */
        public Builder issue(MerchantInitiatedAuthenticationResultsEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MerchInitAuthResultsDescEnum value for description.
         * @return Builder
         */
        public Builder description(MerchInitAuthResultsDescEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS} object using the set
         * fields.
         * @return {@link MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS}
         */
        public MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS build() {
            return new MERCHANTINITIATEDWITHAUTHENTICATIONRESULTS(issue, description);
        }
    }
}