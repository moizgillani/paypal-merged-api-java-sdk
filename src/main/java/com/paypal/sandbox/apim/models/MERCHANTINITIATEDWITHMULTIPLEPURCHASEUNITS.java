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
 * This is a model class for MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS type.
 */
public class MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS {
    private MerchantInitiatedMultiplePurchaseUnitsEnum issue;
    private MerchInitMultPurchUnitsDescEnum description;

    /**
     * Default constructor.
     */
    public MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MerchantInitiatedMultiplePurchaseUnitsEnum value for issue.
     * @param  description  MerchInitMultPurchUnitsDescEnum value for description.
     */
    public MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS(
            MerchantInitiatedMultiplePurchaseUnitsEnum issue,
            MerchInitMultPurchUnitsDescEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MerchantInitiatedMultiplePurchaseUnitsEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantInitiatedMultiplePurchaseUnitsEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MerchantInitiatedMultiplePurchaseUnitsEnum
     */
    @JsonSetter("issue")
    public void setIssue(MerchantInitiatedMultiplePurchaseUnitsEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MerchInitMultPurchUnitsDescEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchInitMultPurchUnitsDescEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MerchInitMultPurchUnitsDescEnum
     */
    @JsonSetter("description")
    public void setDescription(MerchInitMultPurchUnitsDescEnum description) {
        this.description = description;
    }

    /**
     * Converts this MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS}.
     */
    public static class Builder {
        private MerchantInitiatedMultiplePurchaseUnitsEnum issue;
        private MerchInitMultPurchUnitsDescEnum description;



        /**
         * Setter for issue.
         * @param  issue  MerchantInitiatedMultiplePurchaseUnitsEnum value for issue.
         * @return Builder
         */
        public Builder issue(MerchantInitiatedMultiplePurchaseUnitsEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MerchInitMultPurchUnitsDescEnum value for description.
         * @return Builder
         */
        public Builder description(MerchInitMultPurchUnitsDescEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS} object using the set
         * fields.
         * @return {@link MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS}
         */
        public MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS build() {
            return new MERCHANTINITIATEDWITHMULTIPLEPURCHASEUNITS(issue, description);
        }
    }
}
