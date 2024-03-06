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
 * This is a model class for CURRENCYNOTSUPPORTEDFORCARDTYPE type.
 */
public class CURRENCYNOTSUPPORTEDFORCARDTYPE {
    private CurrencyNotSupportedForCardTypeIssueEnum issue;
    private CurrencyNotSupportedForCardTypeDescriptionEnum description;

    /**
     * Default constructor.
     */
    public CURRENCYNOTSUPPORTEDFORCARDTYPE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  CurrencyNotSupportedForCardTypeIssueEnum value for issue.
     * @param  description  CurrencyNotSupportedForCardTypeDescriptionEnum value for description.
     */
    public CURRENCYNOTSUPPORTEDFORCARDTYPE(
            CurrencyNotSupportedForCardTypeIssueEnum issue,
            CurrencyNotSupportedForCardTypeDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the CurrencyNotSupportedForCardTypeIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CurrencyNotSupportedForCardTypeIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for CurrencyNotSupportedForCardTypeIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(CurrencyNotSupportedForCardTypeIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the CurrencyNotSupportedForCardTypeDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CurrencyNotSupportedForCardTypeDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for CurrencyNotSupportedForCardTypeDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(CurrencyNotSupportedForCardTypeDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this CURRENCYNOTSUPPORTEDFORCARDTYPE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CURRENCYNOTSUPPORTEDFORCARDTYPE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link CURRENCYNOTSUPPORTEDFORCARDTYPE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CURRENCYNOTSUPPORTEDFORCARDTYPE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link CURRENCYNOTSUPPORTEDFORCARDTYPE}.
     */
    public static class Builder {
        private CurrencyNotSupportedForCardTypeIssueEnum issue;
        private CurrencyNotSupportedForCardTypeDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  CurrencyNotSupportedForCardTypeIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(CurrencyNotSupportedForCardTypeIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  CurrencyNotSupportedForCardTypeDescriptionEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(CurrencyNotSupportedForCardTypeDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link CURRENCYNOTSUPPORTEDFORCARDTYPE} object using the set fields.
         * @return {@link CURRENCYNOTSUPPORTEDFORCARDTYPE}
         */
        public CURRENCYNOTSUPPORTEDFORCARDTYPE build() {
            return new CURRENCYNOTSUPPORTEDFORCARDTYPE(issue, description);
        }
    }
}
